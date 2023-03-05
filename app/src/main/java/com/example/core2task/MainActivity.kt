package com.example.core2task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickListener();

    }
    private fun clickListener(){

        Theater.setOnClickListener{
            startActivity(Intent(this@MainActivity,TheaterTheater::class.java))
        }
        School.setOnClickListener {
            startActivity(Intent(this@MainActivity,SchoolSchool::class.java))
        }
        Mall.setOnClickListener {
            startActivity(Intent(this@MainActivity,MallMall::class.java))
        }
        Park.setOnClickListener {
            startActivity(Intent(this@MainActivity,ParkPark::class.java))
        }

    }
}