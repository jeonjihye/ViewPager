package com.asianaidt.viewpager.Fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.asianaidt.viewpager.R


class NameFragment : Fragment() {

//    어떤 xml을 끌어다 사용할 지 결정하는 함수
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflater : XML을 끌어올때 사용하는 함수 > 나머지는 그대로
        return inflater.inflate( R.layout.fragment_name, container,false)
    }

//    프래그먼트 동작관련 코드
    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)
    }

}