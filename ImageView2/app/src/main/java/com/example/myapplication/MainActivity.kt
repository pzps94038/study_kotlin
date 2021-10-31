package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitView();
    }
    //初始化
    fun InitView(){
        //監聽隨機按鈕
        btn_random.setOnClickListener{
            changeImage()
        }
    }
    //更換圖片事件
    fun changeImage(){
        //圖片來源
        var ImageArr = listOf(R.drawable.test,R.drawable.unnamed)
        //隨機模組
        var random = Random;
        //隨機範圍
        var rand = random.nextInt(ImageArr.count());
        //設置
        image_view.setImageResource(ImageArr[rand])
    }

}