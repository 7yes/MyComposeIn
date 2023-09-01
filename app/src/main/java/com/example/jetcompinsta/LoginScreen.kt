package com.example.jetcompinsta

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable()
fun LoginScreen(){
    Box(Modifier.fillMaxSize().padding(8.dp), contentAlignment = Alignment.TopEnd) {
    Header(Modifier.align(Alignment.TopEnd))

    }
}

@Composable
fun Header(modifier: Modifier){
    val activity = LocalContext.current as Activity
    Icon(imageVector = Icons.Default.Close , contentDescription ="Close app", modifier = modifier.clickable { activity.finish() } )
}