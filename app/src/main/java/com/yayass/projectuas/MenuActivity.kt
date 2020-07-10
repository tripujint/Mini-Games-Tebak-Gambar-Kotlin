package com.yayass.projectuas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MenuActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSatu:Button = findViewById(R.id.btn_menu_satu)
        val btnDua:Button = findViewById(R.id.btn_menu_dua)
        val btnTiga:Button = findViewById(R.id.btn_menu_tiga)
        val btnEmpat:Button = findViewById(R.id.btn_menu_empat)

        btnSatu.setOnClickListener(this)
        btnDua.setOnClickListener(this)
        btnTiga.setOnClickListener(this)
        btnEmpat.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_menu_satu -> {
                val move = Intent(this@MenuActivity, GambarSatuActivity::class.java)
                startActivity(move)
            }
            R.id.btn_menu_dua -> {
                val move = Intent(this@MenuActivity, GambarDuaActivity::class.java)
                startActivity(move)
            }
            R.id.btn_menu_tiga -> {
                val move = Intent(this@MenuActivity, GambarTigaActivity::class.java)
                startActivity(move)
            }
            R.id.btn_menu_empat -> {
                val move = Intent(this@MenuActivity, GambarEmpatActivity::class.java)
                startActivity(move)
            }
        }
    }
}