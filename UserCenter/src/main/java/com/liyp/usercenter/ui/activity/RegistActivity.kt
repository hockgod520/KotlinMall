package com.liyp.usercenter.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.liyp.usercenter.R
import kotlinx.android.synthetic.main.activity_regist.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class RegistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)




        user_btn_regist.setOnClickListener {
            startActivity(intentFor<TestActivity>("id" to 5))
        }


    }
}