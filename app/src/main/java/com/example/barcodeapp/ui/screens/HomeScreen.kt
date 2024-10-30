package com.example.barcodeapp.ui.screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.barcodeapp.ui.theme.BarcodeAppTheme
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(innerPadding : PaddingValues) {
    val context = LocalContext.current
    val scanLauncher = rememberLauncherForActivityResult(contract = ) {
        
    }
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = " La tienda de Juan")
        Button(onClick = {
            // lansar activity de la camara.(Esperar un resultado)
        }) {
            Text(text = "Escanear")
        }
    }
}


@Preview(
    showSystemUi = true,
    showBackground = true
)

@Composable
fun HomeScreenPreview(){
    BarcodeAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}