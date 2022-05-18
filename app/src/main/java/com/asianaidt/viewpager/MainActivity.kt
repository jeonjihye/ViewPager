package com.asianaidt.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.viewpager.Adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ViewPager : (가로)스크롤뷰 + 스크롤 위치를 강제시키는 기능이 추가되어있는 클래스

        setupEvent()
        setValues()
    }

    fun setupEvent(){

    }

    fun setValues(){
        // 어댑터 클래스 객체화 -> 뷰페이지와 연결
        // 객체화 시 파라미터에 supportFragmentManger 넣기
        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter
        // 3장 이상의 프래그먼트 활용시 : 재사용성 억제하는게 사용자 입장에서 부드럽게 움직임
        mainViewPager.offscreenPageLimit = 3
//        TabLayout : 기본 내장기능X, 라이브러리 포함되어있는지 확인
//        TabLayout / ViewPager 연결
        mainTabLayout.setupWithViewPager(mainViewPager)

    }
}