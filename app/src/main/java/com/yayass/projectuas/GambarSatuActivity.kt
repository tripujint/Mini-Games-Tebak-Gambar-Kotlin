package com.yayass.projectuas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_gambar_satu.*

class GambarSatuActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gambar_satu)

        val btnTrue:Button = findViewById(R.id.btn_true)
        val btnFalse1:Button = findViewById(R.id.btn_false1)
        val btnFalse2:Button = findViewById(R.id.btn_false2)
        val btnFalse3:Button = findViewById(R.id.btn_false3)
        val btnLanjut:Button = findViewById(R.id.btn_lanjut)

        btnTrue.setOnClickListener(this)
        btnFalse1.setOnClickListener(this)
        btnFalse2.setOnClickListener(this)
        btnFalse3.setOnClickListener(this)
        btnLanjut.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_true -> {
                Toast.makeText(this, "Selamat.. Jawaban Kamu Benar!", Toast.LENGTH_SHORT).show()
                val btnLanjut:Button = findViewById(R.id.btn_lanjut)
                btnLanjut.visibility = View.VISIBLE
            }
            R.id.btn_false1 -> {
                Toast.makeText(this, "Jawaban Kamu Salah. Coba Lagi!", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_false2 -> {
                Toast.makeText(this, "Jawaban Kamu Salah. Coba Lagi!", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_false3 -> {
                Toast.makeText(this, "Jawaban Kamu Salah. Coba Lagi!", Toast.LENGTH_SHORT).show()
            }
            R.id.btn_lanjut -> {
                val move = Intent(this@GambarSatuActivity, GambarDuaActivity::class.java)
                startActivity(move)
            }
        }
    }
}