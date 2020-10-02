package com.example.myapplication.domain

import com.example.myapplication.data.FrutasDataSet
import com.example.myapplication.ui.modelo.Frutas

class FrutasUseCase{

    val frutasDataSet = FrutasDataSet()

    fun obtenerListaDeFrutas():List<Frutas>{
        return frutasDataSet.createListaDeFrutas()
    }
}