package com.example.myapplication.data

import com.example.myapplication.ui.modelo.Frutas

class FrutasDataSet {
    fun createListaDeFrutas(): List<Frutas> {
        return listOf(
            Frutas("Manzana", "Rojo", 1f, 250.3f),
            Frutas("Banana", "Amarillo", 0.50F, 1.5F),
            Frutas("Uvas", "Morada", 3.0F, 4F)
        )
    }
}