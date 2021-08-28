package com.example.conversiones

interface CambioPestana {
    companion object{
        //ablist va a tener el identificador para saber en que pestaña se encuentra
        val tablist = listOf(R.string.tab1,R.string.tab2,R.string.tab3)
        val paperfragment = listOf(Pestana1.crear(),Pestana2.crear(),Pestana3.crear())
    }
}