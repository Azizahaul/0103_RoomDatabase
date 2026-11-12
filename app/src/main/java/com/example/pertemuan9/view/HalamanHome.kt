package com.example.pertemuan9.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.aplikasisiswa.R
import com.example.aplikasisiswa.data.Siswa
import com.example.aplikasisiswa.ui.navigasi.DestinasiNavigasi
import com.example.aplikasisiswa.ui.navigasi.SiswaTopAppBar
import com.example.aplikasisiswa.ui.viewmodel.HomeViewModel
import com.example.aplikasisiswa.ui.viewmodel.PenyediaViewModel

object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.app_name
}