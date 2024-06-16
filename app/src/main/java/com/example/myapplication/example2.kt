package com.example.myapplication

import android.service.autofill.OnClickAction


import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
@Composable
fun NormalButton(onClick: () -> Unit){
    Button(onClick={})
    {
        Text(text = "BUMP")

    }}
@Preview
@Composable
fun PreviewNormalButton(){
    NormalButton{}
}
