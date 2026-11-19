package com.example.pertemuan9.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pertemuan9.route.DestinasiDetailSiswa
import com.example.pertemuan9.viewmodel.DetailViewModel
import com.example.pertemuan9.viewmodel.PenyediaViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailSiswaScreen(
    navigateToEditItem: (Int) -> Unit,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: DetailViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {
    Scaffold(
        topBar = {
            SiswaTopAppBar(
                title = stringResource(DestinasiDetailSiswa.titleRes),
                canNavigateBack = true,
                navigateUp = navigateBack
            )
        },
        floatingActionButton = {
            val uiState = viewModel.uiDetailState.collectAsState()
            FloatingActionButton(
                onClick = {
                    navigateToEditItem(uiState.value.detailSiswa.id)
                },
                // lanjutannya ada di bagian bawah slide
            ) {

            }
        }
    ) { innerPadding ->
        // isi body halaman detail
    }
}