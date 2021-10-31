package com.example.button

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var isOffline: Boolean = true;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 設置元件監聽事件
        btn_change.setOnClickListener{
            if(isOffline){
                isOffline = !isOffline;
                tv_state.setText(R.string.online)
                //文字設為紅色
                tv_state.setTextColor(Color.RED)
            }
            else{
                isOffline = !isOffline;
                tv_state.setText(R.string.offline)
                //文字設為黑色
                tv_state.setTextColor(Color.BLACK)
            }

        }
    }
}