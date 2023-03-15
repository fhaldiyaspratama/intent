package com.fhaldi.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnintent : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnintent = findViewById(R.id.btn_intent)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btbIntentObjek =  findViewById<Button>(R.id.btn_pindah_objek)


        btnintent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btbIntentObjek.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent ->{
                val intentBiasa = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(intentBiasa)
            }
            R.id.btn_pindah_data -> run {
                val intentData = Intent(this@MainActivity, PindahDataActivity::class.java)
                intentData.putExtra(PindahDataActivity.EXTRA_TEXT, "Halo, ayo belajar Kotlin")
                startActivity(intentData)
            }
            R.id.btn_pindah_objek -> run {
                val cars = Cars(
                    "Mazda RX-8",
                    2020,
                    "BM 1907 FYP"
                )

                val intentObjek = Intent(this@MainActivity, PindahObjekActivity::class.java)
                intentObjek.putExtra(PindahObjekActivity.EXTRA_CARS, cars)
                startActivity(intentObjek)
            }
        }
    }
}

