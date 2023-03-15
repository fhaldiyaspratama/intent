package com.fhaldi.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.time.measureTimedValue

class PindahDataActivity : AppCompatActivity() {
    companion object{
        const val  EXTRA_TEXT = "extra_text"
    }

    private  lateinit var tvPenerima : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)

        tvPenerima = findViewById(R.id.tv_terima_data)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text yang di kirim : $tvReceived"

       tvPenerima.text = text
    }
}