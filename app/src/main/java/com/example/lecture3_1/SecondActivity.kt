package com.example.lecture3_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        init()

    }

    private fun init() {
        saveInfoButton.setOnClickListener {
        openMainActivity()
        }
    }

    private fun openMainActivity(){
        val intent = Intent(this,MainActivity::class.java)
        intent.putExtra("fname",enterFirstName.text.toString())
        intent.putExtra("lname",enterLastName.text.toString())
        intent.putExtra("email",enterEMailAddress.text.toString())
        intent.putExtra("date",enterDateOfBirth.text.toString())
        intent.putExtra("gender",enterGender.text.toString())
        startActivity(intent)
    }


}
