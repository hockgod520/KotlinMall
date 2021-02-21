package com.liyp.usercenter.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.liyp.usercenter.R
import org.jetbrains.anko.toast

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_regist)

        toast("${intent.getIntExtra("id", -1)}")

    }

}