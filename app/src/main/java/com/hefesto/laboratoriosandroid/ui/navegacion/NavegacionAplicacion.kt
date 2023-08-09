package com.hefesto.laboratoriosandroid.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hefesto.laboratoriosandroid.ui.screens.Pantalla1View
import com.hefesto.laboratoriosandroid.ui.screens.Pantalla2View
import com.hefesto.laboratoriosandroid.ui.screens.Pantalla3View
import com.hefesto.laboratoriosandroid.ui.screens.Pantalla4View

@Composable
fun NavegacionAplicacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PantallasDisponiblesEnum.PANTALLA_1.traerNombrePantalla()) {
        composable(route = PantallasDisponiblesEnum.PANTALLA_1.traerNombrePantalla()) {
            Pantalla1View (navigateToExample = {
                navController.navigate(PantallasDisponiblesEnum.PANTALLA_2.traerNombrePantalla()){
                    popUpTo(route = PantallasDisponiblesEnum.PANTALLA_1.traerNombrePantalla())
                }
            })
        }
        composable(route = PantallasDisponiblesEnum.PANTALLA_2.traerNombrePantalla()) {
            Pantalla2View (navigateToExample = {
                navController.navigate(PantallasDisponiblesEnum.PANTALLA_3.traerNombrePantalla()){
                    popUpTo(route = PantallasDisponiblesEnum.PANTALLA_1.traerNombrePantalla())
                }
            })
        }
        composable(route = PantallasDisponiblesEnum.PANTALLA_3.traerNombrePantalla()) {
            Pantalla3View (navigateToExample = {
                navController.navigate(PantallasDisponiblesEnum.PANTALLA_4.traerNombrePantalla()){
                    popUpTo(route = PantallasDisponiblesEnum.PANTALLA_1.traerNombrePantalla())
                }
            })
        }
        composable(route = PantallasDisponiblesEnum.PANTALLA_4.traerNombrePantalla()) {
            Pantalla4View (navigateToExample = {
                navController.navigate(PantallasDisponiblesEnum.PANTALLA_3.traerNombrePantalla()){
                    popUpTo(route = PantallasDisponiblesEnum.PANTALLA_1.traerNombrePantalla())
                }
            })
        }
    }
}