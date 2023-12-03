package com.example.tugas7.repositori

import com.example.tugas7.data.Siswa
import com.example.tugas7.data.SiswaDao
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriSiswa(private val siswaDao: SiswaDao):RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> {
        return siswaDao.getAllSiswa()
    }

    override fun getSiswaStream(id: Int): Flow<Siswa?> {
        return siswaDao.getSiswa(id)

    }

    override suspend fun insertSiswa(siswa: Siswa) {
            return siswaDao.insert(siswa)
    }

    override suspend fun deleeteSiswa(siswa: Siswa) {
         return siswaDao.delete(siswa)
    }

    override suspend fun updateSiswa(siswa: Siswa) {
        return siswaDao.update(siswa)
    }

}