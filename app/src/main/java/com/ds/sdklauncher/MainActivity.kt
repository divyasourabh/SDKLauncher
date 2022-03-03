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

//        val frame = findViewById<FrameLayout>(R.id.fragment_container)

        // Begin the transaction
        // Begin the transaction
        val ft: FragmentTransaction = getSupportFragmentManager().beginTransaction()

// Replace the contents of the container with the new fragment
// Replace the contents of the container with the new fragment
        val fragment: Fragment = SDKWebViewFragment().newInstance();

        ft.add(R.id.fragment_container, fragment)
// or ft.add(R.id.your_placeholder, new FooFragment());
// Complete the changes added above
// or ft.add(R.id.your_placeholder, new FooFragment());
// Complete the changes added above
        ft.commit()

//        val view: TextView = findViewById(R.id.textview);
//
////        val view = findViewById(R.id.textview);
//        val message =  Message()
//        view.let { textView -> textView.setText(message.showMessage())}




    }
}