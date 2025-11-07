package com.example.navigasi_234.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.navigasi_234.R

@Composable
fun ListPeserta(
    onBackToBerandaClick:()-> Unit,
    OnBtnToFormulirClick:()-> Unit
) {
    val daftar = listOf(
        Pair(first = stringResource(R.string.namalengkap), second = "Danuarta"),
        Pair(first = stringResource(R.string.jk), second = "Laki-laki"),
        Pair(first = stringResource(R.string.status), second = "Lajang"),
        Pair(first = stringResource(R.string.alamat), second = "Yogyakarta")
    )

}