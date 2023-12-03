package com.example.tugas7.ui.theme

import android.app.Application
import com.example.tugas7.repositori.ContainerApp
import com.example.tugas7.repositori.ContainerDataApp

class AplikasiSiswa : Application(){

    lateinit var container: ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}