package com.example.navigasi_234

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasi_234.view.Beranda
import com.example.navigasi_234.view.FormDataDiri
import com.example.navigasi_234.view.ListPeserta

enum class Navigasi {
    Beranda,
    Formulir,
    List
}

@Composable
fun HomeApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold {isiRuang->
        NavHost(
            navController=navController,
            startDestination = Navigasi.Beranda.name,

            modifier=Modifier
                .padding(paddingValues = isiRuang)

        ){
            composable (route= Navigasi.Beranda.name)
            {
                Beranda(
                    OnSubmitBtnClick={
                        navController.navigate(route=Navigasi.List.name)
                    }
                )
            }
            composable (route=Navigasi.List.name)
            {
                ListPeserta(
                    onBackToBerandaClick={cancelAndBackToBeranda(navController)},
                    OnBtnToFormulirClick = {
                        navController.navigate(route= Navigasi.Formulir.name)
                    }
                )
            }
            composable (route= Navigasi.Formulir.name)
            {
                FormDataDiri(
                    onBackToBtnClick={cancelAndBackToList(navController)}
                )
            }

        }
    }
}

private fun cancelAndBackToBeranda(
    navController: NavController
){
    navController.popBackStack(route= Navigasi.Beranda.name, inclusive = false)
}
private fun cancelAndBackToList(
    navController: NavController
){
    navController.popBackStack(route = Navigasi.List.name, inclusive = false)
}