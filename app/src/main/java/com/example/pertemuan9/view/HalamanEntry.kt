package com.example.pertemuan9.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.aplikasisiswa.R
import com.example.aplikasisiswa.ui.navigasi.DestinasiNavigasi
import com.example.aplikasisiswa.ui.navigasi.SiswaTopAppBar
import com.example.aplikasisiswa.ui.viewmodel.DetailSiswa
import com.example.aplikasisiswa.ui.viewmodel.EntryViewModel
import com.example.aplikasisiswa.ui.viewmodel.PenyediaViewModel
import com.example.aplikasisiswa.ui.viewmodel.UIStateSiswa
import kotlinx.coroutines.launch

object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}