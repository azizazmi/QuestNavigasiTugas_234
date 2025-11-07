package com.example.navigasi_234.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            Text(text = stringResource(R.string.welcome),
                modifier = Modifier,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                fontSize = 40.sp,
                color = Color(0xFF58b4f5))
            Spacer(modifier = Modifier.height(height = 30.dp))
            Image(painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(height = 30.dp))
            Text(text = stringResource(R.string.Nama),
                modifier = Modifier,
                fontSize = 22.sp,
                fontFamily = FontFamily.Monospace,
                color = Color(0xFF58b4f5)
            )
            Text(text = stringResource(id = R.string.NIM),
                modifier = Modifier,
                fontSize = 18.sp,
                fontFamily = FontFamily.Serif,
                color = Color(0xFF58b4f5)
            )
        }

    }
}
