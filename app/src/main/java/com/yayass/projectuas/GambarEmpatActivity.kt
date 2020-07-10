package com.yayass.projectuas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class GambarEmpatActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gambar_empat)

        val btnSatu: Button = findViewById(R.id.btn_satu)
        val btnDua: Button = findViewById(R.id.btn_dua)
        val btnTiga: Button = findViewById(R.id.btn_tiga)
        val btnEmpat: Button = findViewById(R.id.btn_empat)
        val btnLanjut: Button = findViewById(R.id.btn_lanjut)

        btnSatu.setOnClickListener(this)
        btnDua.setOnClickListener(this)
        btnTiga.setOnClickListener(this)
        btnEmpat.setOnClickListener(this)
        btnLanjut.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_satu -> {
                Toast.makeText(this, "Jawaban Kamu Salah. Coba Lagi!", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_dua -> {
                Toast.makeText(this, "Selamat.. Jawaban Kamu Benar!", Toast.LENGTH_SHORT).show()
                val btnLanjut:Button = findViewById(R.id.btn_lanjut)
                btnLanjut.visibility = View.VISIBLE
            }
            R.id.btn_tiga -> {
                Toast.makeText(this, "Jawaban Kamu Salah. Coba Lagi!", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_empat -> {
                Toast.makeText(this, "Jawaban Kamu Salah. Coba Lagi!", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_lanjut-> {
                val move = Intent(this@GambarEmpatActivity, MainActivity::class.java)
                startActivity(move)
            }
        }
    }
}