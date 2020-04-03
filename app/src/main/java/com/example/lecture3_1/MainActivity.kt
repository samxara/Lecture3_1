package com.example.lecture3_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    private var fname = ""
    private var lname = ""
    private var email = ""
    private var date = ""
    private var gender = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        fun1()
    }

    private fun init() {
        profileChangeButton.setOnClickListener {
            openSecondActivity()
        }
    }

    private fun openSecondActivity(){
       val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }



    private fun fun1(){

        val intent = intent
        fname=intent.extras!!.getString("fname","")
        lname=intent.extras!!.getString("lname","")
        email=intent.extras!!.getString("email","")
        date=intent.extras!!.getString("date","")
        gender=intent.extras!!.getString("gender","")


        selectName.text = fname
        selectLastName.text = lname
        selectEmail.text = email
        selectDateOfBirth.text = date
        selectGender.text = gender


    }


}
