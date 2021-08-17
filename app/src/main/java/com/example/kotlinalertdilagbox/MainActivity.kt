package com.example.kotlinalertdilagbox

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.button)
        btn.setOnClickListener { getDialogBox(it) }

    }
    fun getDialogBox(view: View){
        val li=LayoutInflater.from(this)
        val view=li.inflate(R.layout.dialogbox,null)
        val tbtn:Button =view.findViewById(R.id.coffie)
        val cbtn:Button=view.findViewById(R.id.tea)
        tbtn.setOnClickListener { Toast.makeText(this,"Tea is coming...",Toast.LENGTH_SHORT).show() }
        cbtn.setOnClickListener { Toast.makeText(this,"coffie is coming...",Toast.LENGTH_SHORT).show() }
        AlertDialog.Builder(this).setView(view).create().show()



    }
}