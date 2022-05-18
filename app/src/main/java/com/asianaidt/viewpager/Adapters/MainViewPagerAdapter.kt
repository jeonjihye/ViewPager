package com.asianaidt.viewpager.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.asianaidt.viewpager.Fragments.HelloFragment
import com.asianaidt.viewpager.Fragments.NameFragment
import com.asianaidt.viewpager.Fragments.PhoneNumFragment

// 어댑터 클래스 생성 > FragmentPagerAdapter 상송
// 기본생성자 지원 X > 클래스 생성자 수정 > 부모에게 전달(fm : FragmentManager)
class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    // 몇 장짜리 뷰 페이저인지 장수를 리턴
    // 한줄짜리 리턴의 경우
    override fun getCount() = 3

    // 각 위치에 맞는 Fragment 객체들을 리턴
    // 보통 return when 문법사용
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> NameFragment()
            1 -> PhoneNumFragment()
            else -> HelloFragment()
        }
    }

//    각 페이지 별 제목부여 함수
    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            0 -> "이름"
            1 -> "연락처"
            else -> "인삿말"
        }
    }


}