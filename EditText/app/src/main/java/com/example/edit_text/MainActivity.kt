package com.example.edit_text

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitView();
    }
    fun InitView(){
        btn.setOnClickListener{
            var input1 = TextInput1.text.toString();
            var input2 = TextInput2.text.toString();
            var result = calculate(input1,input2);
            Result.setText(result);
        }
    }
    fun calculate(x: String, y: String): String{
        var result: String;
        if(x.isNullOrEmpty() || y.isNullOrEmpty()){
            result = "輸入的資料有誤"
        }
        else{
            result = (x.toInt() + y.toInt()).toString();
        }
        return result

    }
}