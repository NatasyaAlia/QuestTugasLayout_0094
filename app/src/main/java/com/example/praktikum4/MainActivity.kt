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
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Nanti teks header dan kartu-kartu akan dimasukkan ke dalam sini
        // (yang akan kita lakukan di Langkah 16 sampai 20)
    }
}