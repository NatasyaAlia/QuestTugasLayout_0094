package com.example.praktikum4

// Biarkan baris 'package com.contoh.namaaplikasi' milik Anda di atas ini

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContent adalah pintu masuk tampilan aplikasi
        setContent {
            // Kita memanggil fungsi MainScreenLayout agar ditampilkan di layar
            MainScreenLayout()
        }
    }
}

// INI ADALAH KODE DARI LANGKAH 15
// Kita membuat kerangka halaman utamanya di sini (di luar class MainActivity)
@Composable
fun MainScreenLayout() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(id = R.string.header_title), fontWeight = FontWeight.Bold, fontSize = 24.sp, color = Color.Black)
        Text(text = stringResource(id = R.string.header_subtitle), fontSize = 14.sp, color = Color.Black, modifier = Modifier.padding(bottom = 24.dp))
    }
}