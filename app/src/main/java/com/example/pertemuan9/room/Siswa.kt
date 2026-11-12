package com.example.pertemuan9.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblSiswa")
data class Siswa(

)
data class Siswa(
    @Entity(tableName = "tblSiswa")
    data class Siswa(
@PrimaryKey(autoGenerate = true)
val id: Int = 0,
val nama: String,
val alamat: String,
val telpon: String
)
)