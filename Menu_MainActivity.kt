package com.aristidevs.abanicomax.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.aristidevs.abanicomax.R
import android.widget.Toast

class Menu_MainActivity : AppCompatActivity() {

    private lateinit var searchEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_main)

        val buttonVentiladores = findViewById<Button>(R.id.button_ventiladores)
        buttonVentiladores.setOnClickListener {
            val intent = Intent(this, VentiladoresActivity::class.java)
            startActivity(intent)
        }

        val buttonTostadora = findViewById<Button>(R.id.button_tostadora)
        buttonTostadora.setOnClickListener {
            val intent = Intent(this, TostadorasActivity::class.java)
            startActivity(intent)
        }

        val buttonMicroondas = findViewById<Button>(R.id.button_microondas)
        buttonMicroondas.setOnClickListener {
            val intent = Intent(this, MicroondasActivity::class.java)
            startActivity(intent)
        }

        val buttonLicuadoras = findViewById<Button>(R.id.button_licuadoras)
        buttonLicuadoras.setOnClickListener {
            val intent = Intent(this, LicuadorasActivity::class.java)
            startActivity(intent)
        }

        val buttonPlanchas = findViewById<Button>(R.id.button_planchas)
        buttonPlanchas.setOnClickListener {
            val intent = Intent(this, PLanchasparaRopaActivity::class.java)
            startActivity(intent)
        }

        // Agregamos la lógica de búsqueda
        searchEditText = findViewById(R.id.searchEditText)
        val searchEditTex = findViewById<Button>(R.id.loginButton)
        searchEditTex.setOnClickListener {
            val searchText = searchEditText.text.toString().toLowerCase()

            when {
                searchText.contains("ventiladores") -> startActivity(Intent(this, VentiladoresActivity::class.java))
                searchText.contains("tostadoras") -> startActivity(Intent(this, TostadorasActivity::class.java))
                searchText.contains("microondas") -> startActivity(Intent(this, MicroondasActivity::class.java))
                searchText.contains("licuadoras") -> startActivity(Intent(this, LicuadorasActivity::class.java))
                searchText.contains("planchas") -> startActivity(Intent(this, PLanchasparaRopaActivity::class.java))
                else -> // Manejar otros casos o mostrar un mensaje de que no se encontraron resultados
                    // Por ejemplo:
                    showToast("No se encontraron resultados")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
