package com.example.praktikum4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserCardWidget(nameResId: Int, phoneResId: Int?, addressResId: Int, bgColorResId: Int) {
    Card(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp), shape = RoundedCornerShape(12.dp), colors = CardDefaults.cardColors(containerColor = colorResource(id = bgColorResId))) {
        Row(modifier = Modifier.padding(16.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
            Image(painter = painterResource(id = R.drawable.logo_umy), contentDescription = "Logo Kiri", modifier = Modifier.size(50.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
                Text(text = stringResource(id = nameResId), color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                if (phoneResId != null) {
                    Text(text = stringResource(id = phoneResId), color = Color.Cyan, fontSize = 14.sp)
                }
                Text(text = stringResource(id = addressResId), color = Color.White, fontSize = 14.sp)
            }
            Image(painter = painterResource(id = R.drawable.logo_umy), contentDescription = "Logo Kanan", modifier = Modifier.size(50.dp))
        }
    }
}