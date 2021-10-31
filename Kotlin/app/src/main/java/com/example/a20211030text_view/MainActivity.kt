package com.example.a20211030text_view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HelloWorld.setText("123");
        HelloWorld.setTextColor(Color.parseColor("#0000ff"))
        HelloWorld.setTextSize(TypedValue.COMPLEX_UNIT_PX, dpToPx(40f))
    }

    private fun dpToPx(dp: Float): Float {
    return dp * this.getResources().getDisplayMetrics().density
    }
}