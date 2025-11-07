package com.example.navigasi_234.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.navigasi_234.R

@Composable
fun Beranda(OnSubmitBtnClick:()-> Unit) {
    Scaffold { isiRuang->
        val gambar = painterResource(R.drawable.getolookup)
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFbddcf2))
            .padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(text = stringResource(R.string.welcome))
        }

    }
}
