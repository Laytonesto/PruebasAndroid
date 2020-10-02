package com.example.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.domain.FrutasUseCase
import com.example.myapplication.ui.modelo.Frutas

class MyViewModel: ViewModel() {

    val frutasUseCase = FrutasUseCase()
    private val listData = MutableLiveData<List<Frutas>>()

  /*  init {
        getListaFrustas()
    }*/

    fun setListData(listafrutas:List<Frutas>){
        listData.value = listafrutas
    }

    fun getListaFrustas(){
        setListData(frutasUseCase.obtenerListaDeFrutas())
    }

    fun getListaFrutasLiveData():LiveData<List<Frutas>>{
        return listData
    }
}