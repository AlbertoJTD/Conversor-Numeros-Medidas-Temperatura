package com.example.conversiones

import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.pestana2.*

class Pestana2:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.pestana2,container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val resul: TextView = view.findViewById(R.id.textView5)
        val arreglo = resources.getStringArray(R.array.arreglo1)
        val spinner: Spinner = view.findViewById(R.id.spinner1)
        val btn1: Button = view.findViewById(R.id.button)
        val valor: EditText = view.findViewById(R.id.editText1)

        var accion=0

        //Crear un ArrayAdapter utilizando el array de cadenas y un diseño de spinner por defecto
        ArrayAdapter.createFromResource(
            requireActivity(),
            R.array.arreglo1,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            //Especifique el diseño que se utilizará cuando aparezca la lista de opciones
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            //Aplicar el adaptador al spinner
            spinner.adapter = adapter
        }

        //Funciones que pertenecen al spinner
        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            //Lo que se hara cuando se haya seleccionado un elemento de la lista
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                accion=position
                //Resultado.text = accion.toString()
            }

            //Lo que se hara cuando aun no se haya seleccionado un elemento de la lista
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        btn1.setOnClickListener(){
            when(accion){
                //----- LONGITUD
                0->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/2.54).toString()
                }
                1->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/30.48).toString()
                }
                2->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/91.44).toString()
                }
                3->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/160934).toString()
                }


                4->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*39.37).toString()
                }
                5->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*3.281).toString()
                }
                6->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*1.094).toString()
                }
                7->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/1609).toString()
                }


                8->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*39370).toString()
                }
                9->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*3281).toString()
                }
                10->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*1094).toString()
                }
                11->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/1.609).toString()
                }


                12->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*2.54).toString()
                }
                13->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/39.37).toString()
                }
                14->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/39370).toString()
                }


                15->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*30.48).toString()
                }
                16->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/3.281).toString()
                }
                17->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/3281).toString()
                }


                18->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*91.44).toString()
                }
                19->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/1.094).toString()
                }
                20->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/1094).toString()
                }


                21->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*160934).toString()
                }
                22->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*1609).toString()
                }
                23->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*1.609).toString()
                }

                //----- AREA
                24->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/2.59).toString()
                }
                25->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*1.196e+6).toString()
                }
                26->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*1.076e+7).toString()
                }
                27->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*1.55e+9).toString()
                }


                28->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/2.59e+6).toString()
                }
                29->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*1.196).toString()
                }
                30->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*10.764).toString()
                }
                31->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*1550).toString()
                }


                32->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*2.59e+6).toString()
                }
                33->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*2.59).toString()
                }


                34->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/1.196).toString()
                }
                35->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/1.196e+6).toString()
                }


                36->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/10.764).toString()
                }
                37->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/1.076e+7).toString()
                }


                38->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/1550).toString()
                }
                39->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/1.55e+9).toString()
                }

                //----- VOLUMEN
                40->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/3.785).toString()
                }
                41->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*33.814).toString()
                }


                42->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/3785).toString()
                }
                43->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/29.574).toString()
                }


                44->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*3.785).toString()
                }
                45->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*3785).toString()
                }


                46->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero/33.814).toString()
                }
                47->{
                    var numero=(valor.text.toString()).toDouble()
                    resul.text = (numero*29.574).toString()
                }

            }
        }



    }

    companion object{
        fun crear():Pestana2{
            return Pestana2()
        }
    }

}