package com.example.myapplication

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity(){
    //open
    fun myToast(text: String, duration: Int = Toast.LENGTH_LONG){
        Toast.makeText(this,text,duration).show();
    }
}