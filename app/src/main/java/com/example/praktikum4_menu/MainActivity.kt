package com.example.praktikum4_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tx_makanan = findViewById<TextView>(R.id.tx_makanan)
        val rgMakanan = findViewById<RadioGroup>(R.id.rgMakanan)
        val tx_minuman = findViewById<TextView>(R.id.tx_minuman)

        val cbTehManis = findViewById<CheckBox>(R.id.cbTehManis)
        val cbKopiSusu = findViewById<CheckBox>(R.id.cbKopiSusu)
        val cbSopBuah = findViewById<CheckBox>(R.id.cbSopBuah)

        val btnOrder = findViewById<Button>(R.id.btOrder)
        val tx_HasilPesanan = findViewById<TextView>(R.id.tx_HasilPesanan)


        btnOrder.setOnClickListener{

            val cekMakananRadioButtonId = rgMakanan.checkedRadioButtonId
            val makanan = findViewById<RadioButton>(cekMakananRadioButtonId)

            val tehmanis = cbTehManis.isChecked
            val kopisusu = cbKopiSusu.isChecked
            val sopbuah = cbSopBuah.isChecked

            val HasilPesananString = "Anda Memesan : \n " +
                    "${makanan.text}" +
                    (if(tehmanis) "\n Teh Manis" else "") +
                    (if(kopisusu) "\n Kopi Susu" else "") +
                    (if(sopbuah) "\n Sop Buah" else "")

            tx_HasilPesanan.text = HasilPesananString
        }
    }
}