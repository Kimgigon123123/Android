package com.example.dangguen.around;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundBinding;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

public class AroundFragment extends Fragment {

    FragmentAroundBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        binding=FragmentAroundBinding.inflate(inflater,container,false);

        binding.aroundMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "미구현 기능입니다", Toast.LENGTH_SHORT).show();
            }
        });
        binding.aroundRecv1.setAdapter(new AroundAdpater1(getList(),getContext()));
        binding.aroundRecv1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.aroundRecv2.setAdapter(new AroundAdpater2(getList2(),getContext()));
        binding.aroundRecv2.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.tvCarCnt.setText("오늘 "+getList3().size()+"명이 거래했어요");
        binding.aroundRecv3.setAdapter(new AroundAdapter3(getList3(),getContext()));
        binding.aroundRecv3.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));


        FragmentAdapter adapter = new FragmentAdapter(this,getFragmentList());
        binding.aroundRecv4.setAdapter(adapter);

        binding.aroundRecv5.setAdapter(new AroundAdapter5(getList5(),getContext()));
        binding.aroundRecv5.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        FragmentAdapter adapter2 = new FragmentAdapter(this,getFragmentList2());
        binding.aroundRecv6.setAdapter(adapter2);


        FragmentAdapter adapter3 = new FragmentAdapter(this,getFragmentList3());
        binding.aroundRecv7.setAdapter(adapter3);

        binding.aroundRecv8.setAdapter(new AroundAdapter8(getList8(),getContext()));
        binding.aroundRecv8.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));


        binding.recv4ChipGrp.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                Log.d("들오온정보", "onCheckedChanged: ");
                if(checkedId==R.id.recv4_chip_1){
                    binding.aroundRecv4.setCurrentItem(0,true);
                }else if(checkedId==R.id.recv4_chip_2){
                    binding.aroundRecv4.setCurrentItem(1,true);
                }else if(checkedId==R.id.recv4_chip_3){
                    binding.aroundRecv4.setCurrentItem(2,true);
                }else if(checkedId==R.id.recv4_chip_4){
                    binding.aroundRecv4.setCurrentItem(3,true);
                }

            }
        });
        binding.aroundRecv4.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {//0~3
                if(position==0){
                    binding.recv4ChipGrp.check(R.id.recv4_chip_1);
                }else if(position==1){
                    binding.recv4ChipGrp.check(R.id.recv4_chip_2);
                }else if(position==2){
                    binding.recv4ChipGrp.check(R.id.recv4_chip_3);
                }else if(position==3){
                    binding.recv4ChipGrp.check(R.id.recv4_chip_4);
                }
            }
        });



        binding.recv6ChipGrp.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                Log.d("들오온정보", "onCheckedChanged: ");
                if(checkedId==R.id.recv6_chip1){
                    binding.aroundRecv6.setCurrentItem(0,true);
                }else if(checkedId==R.id.recv6_chip2){
                    binding.aroundRecv6.setCurrentItem(1,true);
                }else if(checkedId==R.id.recv6_chip3){
                    binding.aroundRecv6.setCurrentItem(2,true);
                }else if(checkedId==R.id.recv6_chip4){
                    binding.aroundRecv6.setCurrentItem(3,true);
                }else if(checkedId==R.id.recv6_chip5){
                    binding.aroundRecv6.setCurrentItem(4,true);
                }else if(checkedId==R.id.recv6_chip6){
                    binding.aroundRecv6.setCurrentItem(5,true);
                }

            }
        });
        binding.aroundRecv6.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {//0~3
                if(position==0){
                    binding.recv6ChipGrp.check(R.id.recv6_chip1);
                }else if(position==1){
                    binding.recv6ChipGrp.check(R.id.recv6_chip2);
                }else if(position==2){
                    binding.recv6ChipGrp.check(R.id.recv6_chip3);
                }else if(position==3){
                    binding.recv6ChipGrp.check(R.id.recv6_chip4);
                }else if(position==4){
                    binding.recv6ChipGrp.check(R.id.recv6_chip5);
                }else if(position==5){
                    binding.recv6ChipGrp.check(R.id.recv6_chip6);
                }
            }
        });

        binding.recv7ChipGrp.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                Log.d("들오온정보", "onCheckedChanged: ");
                if(checkedId==R.id.recv7_chip_1){
                    binding.aroundRecv7.setCurrentItem(0,true);
                }else if(checkedId==R.id.recv7_chip_2){
                    binding.aroundRecv4.setCurrentItem(1,true);
                }else if(checkedId==R.id.recv7_chip_3){
                    binding.aroundRecv4.setCurrentItem(2,true);
                }else if(checkedId==R.id.recv7_chip_4){
                    binding.aroundRecv7.setCurrentItem(3,true);
                }

            }
        });
        binding.aroundRecv7.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {//0~3
                if(position==0){
                    binding.recv7ChipGrp.check(R.id.recv7_chip_1);
                }else if(position==1){
                    binding.recv7ChipGrp.check(R.id.recv7_chip_2);
                }else if(position==2){
                    binding.recv7ChipGrp.check(R.id.recv7_chip_3);
                }else if(position==3){
                    binding.recv7ChipGrp.check(R.id.recv7_chip_4);
                }
            }
        });


        return binding.getRoot();
    }



    public ArrayList<AroundDTO1> getList(){
        ArrayList<AroundDTO1> list = new ArrayList<>();
        list.add(new AroundDTO1(1,10000,"네일자격증 모델구해요~","운암동"));
        list.add(new AroundDTO1(2,9620,"대리운전콜센터상담원모집","중흥동"));
        list.add(new AroundDTO1(3,10000,"토욜 침대 옴겨주실 분 용달차 필요","봉선동"));
        return list;
    }

    public ArrayList<AroundDTO2> getList2(){
        ArrayList<AroundDTO2> list = new ArrayList<>();
        list.add(new AroundDTO2(R.drawable.around_img2_1,R.drawable.chat_img1,"100세 건강연구","스포츠마을","무료 독서능력평가 쿠폰","2023.08.31까지"));
        list.add(new AroundDTO2(R.drawable.around_img2_2,R.drawable.chat_img1,"e헤어플러스","미용실","당근 후기 10% 할인","2024.01.03까지"));
        list.add(new AroundDTO2(R.drawable.around_img2_3,R.drawable.chat_img1,"신선축산 정육점","정육점","당근단골 파절이+소스증정","2023.08.31까지"));

        return list;
    }

    public ArrayList<AroundDTO3> getList3(){
        ArrayList<AroundDTO3> list = new ArrayList<>();
        list.add(new AroundDTO3(R.drawable.around_img3_1,450,223,"현대","제네시스 쿠페 BK 200 터보 P"));
        list.add(new AroundDTO3(R.drawable.around_img3_2,550,77,"현대","현대 i40 살룬 VF 17. VGT FWD D 스펙"));
        list.add(new AroundDTO3(R.drawable.around_img3_3,1300,114,"미니","미니 쿠퍼 D III F56/F55 5DR 1.5 d (116마력)"));

        return list;
    }

    public ArrayList<AroundDTO5> getList5(){
        ArrayList<AroundDTO5> list = new ArrayList<>();
        list.add(new AroundDTO5(R.drawable.around_img5_1,400,45,"오피스텔","풍암호수공원부근","풍암동"));
        list.add(new AroundDTO5(R.drawable.around_img5_2,300,38,"오피스텔","미니스톱 앞 건물","쌍촌동"));
        list.add(new AroundDTO5(R.drawable.around_img5_3,200,21,"분리형 원룸","버스도보 2분 거리","화정동"));

        return list;
    }

    public ArrayList<AroundDTO8> getList8(){
        ArrayList<AroundDTO8> list = new ArrayList<>();
        list.add(new AroundDTO8(R.drawable.around_img8_1,1699,70,"현대","현대 그랜저 IG 2.4 GDi FWD 프리미엄 스페셜"));
        list.add(new AroundDTO8(R.drawable.around_img8_2,4400,130,"BMW","BMW X3 G01 20d xDrive xLine"));
        list.add(new AroundDTO8(R.drawable.around_img8_3,1050,56,"미니","쿠퍼 D III F56/F55 5DR 1.5d (116마력)"));


        return list;
    }


    ArrayList<Fragment> getFragmentList(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new AroundRecv4Sub1Fragment());
        list.add(new AroundRecv4Sub2Fragment());
        list.add(new AroundRecv4Sub3Fragment());
        list.add(new AroundRecv4Sub4Fragment());
        return list;

    }

    ArrayList<Fragment> getFragmentList2(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new AroundRecv6Sub1Fragment());
        list.add(new AroundRecv6Sub2Fragment());
        list.add(new AroundRecv6Sub3Fragment());
        list.add(new AroundRecv6Sub4Fragment());
        list.add(new AroundRecv6Sub5Fragment());
        list.add(new AroundRecv6Sub6Fragment());
        return list;

    }

    ArrayList<Fragment> getFragmentList3(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new AroundRecv7Sub1Fragment());
        list.add(new AroundRecv7Sub2Fragment());
        list.add(new AroundRecv7Sub3Fragment());
        list.add(new AroundRecv7Sub4Fragment());
        return list;

    }


}