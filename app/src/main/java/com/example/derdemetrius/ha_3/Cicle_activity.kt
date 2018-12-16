package com.example.derdemetrius.ha_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cicle_activity.*
import kotlinx.android.synthetic.main.activity_triangle_activity.*

class Cicle_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cicle_activity)





        Back1.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {

            var rad = editB.text.toString()
            var x = Cicle(rad.toDouble())
            pl.text = x.squareCi().toString()
            per.text =  x.circumference().toString()



        }




    }

}
