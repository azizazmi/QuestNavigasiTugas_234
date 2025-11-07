package com.example.navigasi_234.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigasi_234.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormDataDiri(onBackToBtnClick:()-> Unit) {
    val gender:List<String> = listOf("Laki-laki", "Perempuan")
    val status:List<String> = listOf("Janda", "Lajang", "Duda")

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(color = colorResource(R.color.purple_200)),
            Alignment.BottomStart
        ){
            Text(
                text = stringResource(R.string.formulir),
                color = Color.White,
                fontSize = 35.sp
            )
        }
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)) {
            ElevatedCard(modifier = Modifier
                .fillMaxWidth()
                .padding(all = 20.dp)
                .background(color = Color.White))
            {
                Column(modifier = Modifier) {
                    Text( modifier = Modifier.padding(
                        top = 10.dp,
                        start = 5.dp),
                        text = stringResource(R.string.namalengkap),
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    OutlinedTextField(
                        value = "",
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(all = 10.dp)
                            .fillMaxWidth(),
                        label = { Text(text = "Isian nama lengkap") },
                        onValueChange = { }
                    )
                    Text( modifier = Modifier.padding(
                        top = 10.dp,
                        start = 5.dp),
                        text = stringResource(R.string.jk),
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    Column(modifier = Modifier) {
                        gender.forEach { item ->
                            Row(
                                modifier = Modifier.selectable(
                                    selected = false,
                                    onClick = {}
                                ), verticalAlignment = Alignment.CenterVertically) {
                                RadioButton(
                                    selected = false,
                                    onClick = {}
                                )
                                Text(text = item)
                            }
                        }
                    }
                    Text( modifier = Modifier.padding(
                        top = 10.dp,
                        start = 5.dp),
                        text = stringResource(R.string.status),
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    Column(modifier = Modifier) {
                        status.forEach { item ->
                            Row(
                                modifier = Modifier.selectable(
                                    selected = false,
                                    onClick = {}
                                ), verticalAlignment = Alignment.CenterVertically) {
                                RadioButton(
                                    selected = false,
                                    onClick = {}
                                )
                                Text(text = item)
                            }
                        }
                    }
                    Text( modifier = Modifier.padding(top = 10.dp,
                        start = 5.dp),
                        text = stringResource(R.string.alamat),
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    OutlinedTextField(
                        value = "",
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(all = 10.dp)
                            .fillMaxWidth(),
                        label = { Text(text = "Alamat") },
                        onValueChange = {}
                    )
                    Button(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .fillMaxWidth(1f)
                            .background(color = colorResource(R.color.purple_500)),
                        onClick = onBackToBtnClick
                    ) {
                        Text(stringResource((R.string.submit)), color = Color.White)
                    }
                }
            }
        }
    }
}