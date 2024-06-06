package com.example.pet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pet.navigation.MyNavigationHost
import com.example.pet.ui.theme.PetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PetTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 24.dp)
                ) { innerPadding ->
                    MyNavigationHost(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}