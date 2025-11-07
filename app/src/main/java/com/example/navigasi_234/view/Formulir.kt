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

@Composable
fun FormDataDiri(modifier: Modifier) {
    var txtNama by remember { mutableStateOf("") }
    var txtAlamat by remember {mutableStateOf("")}
    var txtJK by remember {mutableStateOf("")}
    var txtStatusPernikahan by remember {mutableStateOf("")}

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jk by remember {mutableStateOf("")}
    var statusP by remember {mutableStateOf("")}

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
                text = "Formulir Pendaftaran",
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
                        text = "NAMA LENGKAP",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    OutlinedTextField(
                        value = txtNama,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(all = 10.dp)
                            .fillMaxWidth(),
                        label = { Text(text = "Isian nama lengkap") },
                        onValueChange = {
                            txtNama = it
                        }
                    )
                    Text( modifier = Modifier.padding(
                        top = 10.dp,
                        start = 5.dp),
                        text = "JENIS KELAMIN",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    Column(modifier = Modifier) {
                        gender.forEach { item ->
                            Row(
                                modifier = Modifier.selectable(
                                    selected = txtJK == item,
                                    onClick = { txtJK = item }
                                ), verticalAlignment = Alignment.CenterVertically) {
                                RadioButton(
                                    selected = txtJK == item,
                                    onClick = {
                                        txtJK = item
                                    }
                                )
                                Text(text = item)
                            }
                        }
                    }
                    Text( modifier = Modifier.padding(
                        top = 10.dp,
                        start = 5.dp),
                        text = "STATUS PERKAWINAN",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    Column(modifier = Modifier) {
                        status.forEach { item ->
                            Row(
                                modifier = Modifier.selectable(
                                    selected = txtStatusPernikahan == item,
                                    onClick = { txtStatusPernikahan = item }
                                ), verticalAlignment = Alignment.CenterVertically) {
                                RadioButton(
                                    selected = txtStatusPernikahan == item,
                                    onClick = {
                                        txtStatusPernikahan = item
                                    }
                                )
                                Text(text = item)
                            }
                        }
                    }
                    Text( modifier = Modifier.padding(top = 10.dp,
                        start = 5.dp),
                        text = "ALAMAT",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    OutlinedTextField(
                        value = txtAlamat,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(all = 10.dp)
                            .fillMaxWidth(),
                        label = { Text(text = "Alamat") },
                        onValueChange = {
                            txtAlamat = it
                        }
                    )
                    Button(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .fillMaxWidth(1f)
                            .background(color = colorResource(R.color.purple_500)),
                        //the button is enabled when the user make a selection
                        enabled = txtAlamat.isNotEmpty(),
                        onClick = {
                            nama=txtNama
                            jk=txtJK
                            alamat=txtAlamat
                            statusP=txtStatusPernikahan
                        }
                    ) {
                        Text(stringResource((R.string.submit)), color = Color.White)
                    }
                }
            }
        }
    }
}