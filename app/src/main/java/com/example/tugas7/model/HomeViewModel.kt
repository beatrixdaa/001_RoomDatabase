package com.example.tugas7.model

import com.example.tugas7.repositori.RepositoriSiswa
import androidx.lifecycle.ViewModel

class HomeViewModel(private val repositoriSiswa:RepositoriSiswa):ViewModel(){
    companion object {
        private const val  TIMEOUT_MILLIS = 5_000L
    }

}