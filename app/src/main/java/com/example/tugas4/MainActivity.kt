package com.example.tugas4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CounterScreen()
                }
            }
        }
    }
}

@Composable
fun CounterScreen(counterViewModel: CounterViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Ganti dengan NIM dan Nama kamu
        Text(text = "NIM: 245150401111036", fontSize = 18.sp)
        Text(text = "Nama: Wafi Javier Zuhdi", fontSize = 18.sp)

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "${counterViewModel.count}", fontSize = 64.sp)

        Spacer(modifier = Modifier.height(32.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Button(onClick = { counterViewModel.up() }) { Text("Up") }
            Button(onClick = { counterViewModel.down() }) { Text("Down") }
            Button(onClick = { counterViewModel.reset() }) { Text("Reset") }
        }
    }
}