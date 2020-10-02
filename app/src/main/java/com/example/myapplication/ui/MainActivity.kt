package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.domain.FrutasUseCase
import com.example.myapplication.ui.modelo.Frutas
import com.example.myapplication.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel:MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        val frutasObserver = Observer<List<Frutas>> {
            for(frutas in it){
                Log.d("Frutas",frutas.nombreFruta)
            }

            for((index,value) in it.withIndex()){
                Log.d("Frutas $index:", value.nombreFruta)
            }
        }

        viewModel.getListaFrutasLiveData().observe(this,frutasObserver)

       */
        setupViewModel()
        btnCrearLista.setOnClickListener {
            viewModel.getListaFrustas()
        }

    }

    fun setupViewModel(){
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        val frutasObserver = Observer<List<Frutas>> {
            for(frutas in it){
                Log.d("Frutas",frutas.nombreFruta)
            }

            for((index,value) in it.withIndex()){
                Log.d("Frutas $index:", value.nombreFruta)
            }
        }

        viewModel.getListaFrutasLiveData().observe(this,frutasObserver)

    }



}