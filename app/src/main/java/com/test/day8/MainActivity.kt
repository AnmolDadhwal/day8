package com.test.day8

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var tvnum: TextView?=null
    var btnadd: Button?=null
    var btnmul: Button?= null
    var btndiv: Button?= null
    var btnsub: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        tvnum=findViewById(R.id.num)
        btnsub=findViewById(R.id.sub)
        btnadd=findViewById(R.id.add)
        btnmul=findViewById(R.id.mul)
        btndiv=findViewById(R.id.div)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnsub?.setOnClickListener {
            tvnum?.setText("${tvnum?.text?.toString()?.toInt()?.minus(2)}")
        }
        btnadd?.setOnClickListener {
            tvnum?.setText("${tvnum?.text?.toString()?.toInt()?.plus(2)}")
        }
        btnmul?.setOnClickListener {
            tvnum?.setText("${tvnum?.text?.toString()?.toInt()?.times(2)}")
        }
        btndiv?.setOnClickListener {
            tvnum?.setText("${tvnum?.text?.toString()?.toInt()?.div(2)}")
        }
    }
}