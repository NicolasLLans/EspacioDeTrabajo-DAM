package com.example.clubdeportivo

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ingresarEmpleado2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ingresar_empleado2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       val spinnerJob: Spinner = findViewById(R.id.spinnerJob)


      val adapter = ArrayAdapter.createFromResource(
               this,
        R.array.Puesto,
        android.R.layout.simple_spinner_item
       )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerJob.adapter = adapter

        spinnerJob.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                // determina acción para el elemento seleccionado
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Acá se determina qué hacer si no se selecciona nada
                // Por ahí podemos definir una de las opciones como valor por defecto y no
                //tenemos que hacer esta parte porque siempre va a haber algo seleccionado
            }
        }
    }
}





//package com.example.clubdeportivo
//
//import android.os.Bundle
//import android.view.View
//import android.widget.AdapterView
//import android.widget.ArrayAdapter
//import android.widget.Spinner
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class ingresarEmpleado2 : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_ingresar_empleado2)
//
//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
//        val spinnerJob: Spinner = findViewById(R.id.spinnerJob)
//
//        val adapter = ArrayAdapter.createFromResource(
//            this,
//            R.array.Job,
//            android.R.layout.simple_spinner_item
//        )
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//
//        spinnerJob.adapter = adapter
//
//        spinnerJob.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
//                val selectedItem = parent.getItemAtPosition(position).toString()
//                // acá hay que hacer algo con el elemento seleccionado
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>) {
//            // acá hayq ue determinar qué hacer si no se selecciona nada
//            // (tal vez se ppdría poner una de las opciones por defecto y sacar esto porque siempre
//            // va a haber algo seleccionado
//            }
//        }
//    }
//}
