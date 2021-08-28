package com.example.conversiones

import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment

class Pestana3:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.pestana3,container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val resul: TextView = view.findViewById(R.id.textView4)
        val arreglo = resources.getStringArray(R.array.arreglo2)
        val spinner: Spinner = view.findViewById(R.id.spinner)

        val btn1: Button = view.findViewById(R.id.button4)
        val valor: EditText = view.findViewById(R.id.editTextNumber)

        var accion=0

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            requireActivity(),
            R.array.arreglo2,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //resul.text = position.toString()
                accion=position
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        btn1.setOnClickListener(){
            when(accion){
                // CELSIUS
                0->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero + 273.15).toString()
                }
                1->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = ((numero * 9/5) + 32).toString()
                }

                // KELVIN
                2->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero - 273.15).toString()
                }
                3->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = ((numero - 273.15) * 9/5 + 32).toString()
                }

                // FAHRENHEIT
                4->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = ((numero - 32) * 5/9).toString()
                }
                5->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = ((numero - 32) * 5/9 + 273.15).toString()
                }
            }
        }


    }

    companion object{
        fun crear():Pestana3{
            return Pestana3()
        }
    }

}