package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   private lateinit var cl : ConstraintLayout
   private lateinit var btn : Button
   private lateinit var ent : EditText
   private lateinit var masg : ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cl = findViewById(R.id.cl)
        masg = ArrayList()

        rvMain.adapter= RecyclerViewAdapter(this, masg)
        rvMain.layoutManager = LinearLayoutManager(this)

        ent = findViewById(R.id.etAddFild)
        btn = findViewById(R.id.btnAdd)

        btn.setOnClickListener { addMasg() }

    }
    private fun addMasg(){
        val msg = etAddFild.text.toString()
        if (msg.isNotEmpty()){
            masg.add(msg)
            etAddFild.text.clear()
            etAddFild.clearFocus()
        }else{
            Snackbar.make(cl,"Pleas Enter some text", Snackbar.LENGTH_LONG).show()
        }

    }
}