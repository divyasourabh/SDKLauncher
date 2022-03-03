package com.ds.sdklauncher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.ds.showmessage.SDKWebViewFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ft: FragmentTransaction = getSupportFragmentManager().beginTransaction()
        val fragment: Fragment = SDKWebViewFragment().newInstance();
        ft.add(R.id.fragment_container, fragment)
        ft.commit()
 }
}