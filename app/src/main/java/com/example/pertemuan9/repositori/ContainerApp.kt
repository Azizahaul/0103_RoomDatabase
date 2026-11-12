package com.example.pertemuan9.repositori

import android.content.Context

interface ContainerApp {
    val repositoriSiswa: RepositoriSiswa
}
class ContainerDataApp(private val context: Context): ContainerApp {
    // Implementasi variabel menyusul di commit berikutnya
}