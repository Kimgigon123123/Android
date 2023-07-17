package com.example.project02_lastproject.member;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.project02_lastproject.MainActivity;
import com.example.project02_lastproject.R;
import com.example.project02_lastproject.common.CommonConn;
import com.example.project02_lastproject.common.CommonVar;
import com.example.project02_lastproject.databinding.ActivityLoginBinding;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.gson.Gson;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.user.UserApiClient;
import com.navercorp.nid.NaverIdLoginSDK;
import com.navercorp.nid.oauth.NidOAuthLogin;
import com.navercorp.nid.oauth.OAuthLoginCallback;
import com.navercorp.nid.profile.NidProfileCallback;
import com.navercorp.nid.profile.data.NidProfileResponse;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public class LoginActivity extends AppCompatActivity {
//member/login?id=dev&password=dev

    //구글 로그인은 혼자해보기. (구글 개발자 콘솔 등록되어야 함)

    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        KakaoSdk.init(this,"1e657f7bd3a50eab7c714706e564fc90");
        NaverIdLoginSDK.INSTANCE.initialize(this, "fYp2NnDyy3nxx7DwDOw6", "NYZxLoLLT5", getString(R.string.app_name));
        naverLoigin();





//        UserApiClient.getInstance().unlink(new Function1<Throwable, Unit>() {
//            @Override
//            public Unit invoke(Throwable throwable) {
//                return null;
//            }
//        });






        binding.btnLogin.setOnClickListener(v -> {
            login();


        });
        Log.d("키해시", "login: "+getKeyHash(this));

        binding.imgvKakaologin.setOnClickListener(v->{
            kakaoLogin(this);
        });
    }



    public void login(){
        if(binding.edtId.getText().toString().length()<1||binding.edtPw.getText().toString().length()<1){
            Toast.makeText(this, "아이디 또는 비밀번호 입력하세요", Toast.LENGTH_SHORT).show();
            return;
        }
        CommonConn conn = new CommonConn(this,"member/login");
        conn.addParamMap("id",binding.edtId.getText().toString());
        conn.addParamMap("password",binding.edtPw.getText().toString());
        conn.onExcute((isResult, data) -> {
            if(isResult){
                MemberVO vo = new Gson().fromJson(data,MemberVO.class);
                if(vo==null){
                    Toast.makeText(this, "아이디 또는 비밀번호를 확인하세요", Toast.LENGTH_SHORT).show();
                }else{
                    CommonVar.logininfo=vo;
                    Toast.makeText(this, "로그인성공 !!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });



    }

    public void naverLoigin(){
        binding.buttonOAuthLoginImg.setOAuthLogin(new OAuthLoginCallback() {
            @Override
            public void onSuccess() {
                Log.d("네이버", "onSuccess:성공성공성공ㅅㄱ성공성공성공 "+NaverIdLoginSDK.INSTANCE.getAccessToken());

                new NidOAuthLogin().callProfileApi(new NidProfileCallback<NidProfileResponse>() {
                    @Override
                    public void onSuccess(NidProfileResponse res) {
                        Log.d("네이버", "onSuccess: "+res.getProfile().getEmail());
                        Log.d("네이버", "onSuccess: "+res.getProfile().getNickname());
                    }

                    @Override
                    public void onFailure(int i, @NonNull String s) {

                    }

                    @Override
                    public void onError(int i, @NonNull String s) {

                    }
                });

            }

            @Override
            public void onFailure(int i, @NonNull String s) {
                Log.d("네이버", "onSuccess:실패실패실패실패실패실패 ");
            }

            @Override
            public void onError(int i, @NonNull String s) {
                Log.d("네이버", "onSuccess:에러에러에러에러에러에렁레얼엘ㅇ ");
            }
        });
    }

    public void kakaoLogin(Context context){
//        KakaoSdk.init(this, "1e657f7bd3a50eab7c714706e564fc90");
        // 카카오톡이 설치되어 있으면 카카오톡으로 로그인, 아니면 카카오계정으로 로그인(웹뷰)
        //코틀린은 경우에 따라서 생성자 대신에 메소드로 객체를 retrun받음. UserApiClient name = new ....x -> UserApiClient.{static UserApiClient.method)


        Function2<OAuthToken,Throwable,Unit> callback =(token,error) ->{
            if(error != null){
                getKakaoProfile();
            }else{
                Log.d("카카오", "kakaoLogin 오류 발생: "+ error.getMessage());

            }
            return null;
        };

        if (UserApiClient.getInstance().isKakaoTalkLoginAvailable(context)){
            Log.d("카카오", "isKakaoTalkLoginAvailable: true" );
            UserApiClient.getInstance().loginWithKakaoTalk(context, callback);
        }else{
            Log.d("카카오", "isKakaoTalkLoginAvailable: false" );
            UserApiClient.getInstance().loginWithKakaoAccount(context,callback);
        }
        // 카카오톡이 설치되어 있으면 카카오톡으로 로그인, 아니면 카카오계정으로 로그인
//        if (UserApiClient.instance.isKakaoTalkLoginAvailable(context)) { //
//            UserApiClient.instance.loginWithKakaoTalk(context) { token, error ->
//                if (error != null) {
//                    Log.e(TAG, "카카오톡으로 로그인 실패", error)
//
//                    // 사용자가 카카오톡 설치 후 디바이스 권한 요청 화면에서 로그인을 취소한 경우,
//                    // 의도적인 로그인 취소로 보고 카카오계정으로 로그인 시도 없이 로그인 취소로 처리 (예: 뒤로 가기)
//                    if (error is ClientError && error.reason == ClientErrorCause.Cancelled) {
//                        return@loginWithKakaoTalk
//                    }
//
//                    // 카카오톡에 연결된 카카오계정이 없는 경우, 카카오계정으로 로그인 시도
//                    UserApiClient.instance.loginWithKakaoAccount(context, callback = callback)
//                } else if (token != null) {
//                    Log.i(TAG, "카카오톡으로 로그인 성공 ${token.accessToken}")
//                }
//            }
//        } else { //
//            UserApiClient.instance.loginWithKakaoAccount(context, callback = callback)
//        }
    }

    public void getKakaoProfile(){
        UserApiClient.getInstance().me((user, error) -> {
            if(error==null){
                Log.d("카카오", "getKakaoProfile: "+user.toString());
                Log.d("카카오", "getKakaoProfile: "+user.getKakaoAccount().getEmail());
                Log.d("카카오", "getKakaoProfile: "+user.getKakaoAccount().getProfile().getNickname());
                Log.d("카카오", "getKakaoProfile: "+user.getKakaoAccount().getProfile().getThumbnailImageUrl());
            }

            return null;
        });
    }



    public static String getKeyHash(final Context context) {
        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo packageInfo = pm.getPackageInfo(context.getPackageName(), PackageManager.GET_SIGNATURES);
            if (packageInfo == null)
                return null;

            for (Signature signature : packageInfo.signatures) {
                try {
                    MessageDigest md = MessageDigest.getInstance("SHA");
                    md.update(signature.toByteArray());
                    return android.util.Base64.encodeToString(md.digest(), android.util.Base64.NO_WRAP);
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}