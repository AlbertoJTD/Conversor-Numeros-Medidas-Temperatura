package com.example.conversiones

import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment

class Pestana1:Fragment() {

    //Regresar el layout
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.pestana1,container)
    }

    //Se programa la funcionalidad de la pestaña
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Botones para mostrar el resultado
        val btn1: Button = view.findViewById(R.id.button1)
        val btn2: Button = view.findViewById(R.id.button2)
        val btn3: Button = view.findViewById(R.id.button3)

        //Campo para obtener el valor ingresado
        val texto: EditText = view.findViewById(R.id.editText)

        //TextoView donde se mostrara el resultado
        val binario: TextView = view.findViewById(R.id.tv1)
        val octal: TextView = view.findViewById(R.id.tv2)
        val hexa: TextView = view.findViewById(R.id.tv3)

        var num=""
        var valor=0

        texto.setOnClickListener(){
            num=texto.text.toString()
            valor=num.toInt()
        }

        //Resultado en binario
        btn1.setOnClickListener(){
            var residuo=0
            var bin=""

            //Numero a convertir
            var numero=valor.toInt()

            while(numero>0){
                residuo = numero % 2
                bin = residuo.toString() + bin
                numero= numero/2
            }
            binario.text=bin
        }

        //Resultado en octal
        btn2.setOnClickListener(){
            //Guardar el residuo
            var residuo=0

            //Almacenar el resultado en octal
            var oct=""

            //Numero a convertir
            var numero=valor.toInt()

            while(numero>8){
                residuo = numero % 8
                oct = residuo.toString() + oct
                numero= numero/8
            }
            residuo = numero % 8
            oct = residuo.toString() + oct

            octal.text=oct
        }

        //Resultado en hexadecimal
        btn3.setOnClickListener(){
            //Guardar el residuo
            var residuo=0

            //Almacenar el resultado en octal
            var hex=""

            //Numero a convertir
            var numero=valor.toInt()

            while(numero>=16){
                residuo = numero % 16
                //hex = residuo.toString() + hex

                when(residuo){
                    10->hex = "A" + hex
                    11->hex = "B" + hex
                    12->hex = "C" + hex
                    13->hex = "D" + hex
                    14->hex = "E" + hex
                    15->hex = "F" + hex
                    else->{
                        hex = residuo.toString() + hex
                    }
                }
                numero= numero/16
            }

            residuo = numero % 16
            //hex = residuo.toString() + hex
            when(residuo){
                10->hex = "A" + hex
                11->hex = "B" + hex
                12->hex = "C" + hex
                13->hex = "D" + hex
                14->hex = "E" + hex
                15->hex = "F" + hex
                else->{
                    hex = residuo.toString() + hex
                    numero= numero/16
                }
            }

            hexa.text=hex

        }

    }

    //Acceder a las clases que tienen objetos privados
    companion object{
        fun crear():Pestana1{
            return Pestana1()
        }
    }
}