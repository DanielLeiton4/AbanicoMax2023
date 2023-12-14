package com.aristidevs.abanicomax.firstapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.aristidevs.abanicomax.R

class LicuadorasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_licuadoras)

        val btnAgregarAlCarrito = findViewById<Button>(R.id.btnAgregarAlCarrito)
        btnAgregarAlCarrito.setOnClickListener {
            openMethodPaymentActivity()
        }

        val btnAgregarAlCarrito2 = findViewById<Button>(R.id.btnAgregarAlCarrito2)
        btnAgregarAlCarrito2.setOnClickListener {
            openMethodPaymentActivity()
        }

        val btnAgregarAlCarrito3 = findViewById<Button>(R.id.btnAgregarAlCarrito3)
        btnAgregarAlCarrito3.setOnClickListener {
            openMethodPaymentActivity()
        }

        val btnAgregarAlCarrito4 = findViewById<Button>(R.id.btnAgregarAlCarrito4)
        btnAgregarAlCarrito4.setOnClickListener {
            openMethodPaymentActivity()
        }
    }

    private fun openMethodPaymentActivity() {
        val intent = Intent(this, MethodPaymentActivity::class.java)
        startActivity(intent)
    }
}
