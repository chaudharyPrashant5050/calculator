package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var canAddOperation = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberAction(view: View){

        if(view is Button){
            val workingTV = null
           // workingTV.append(view.text)
        }


    }

    fun operationAction(view: View){}



    fun backSpaceAction(view: View){}

    fun equalsAction(view: View){}

    fun allClearAction(view:View){}
}