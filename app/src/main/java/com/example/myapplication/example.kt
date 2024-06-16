package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
@Composable

fun myImageView(){
    val image= painterResource(id = R.drawable.image1)
    Image(painter = image, contentDescription =null )
}
@Preview
@Composable
fun myImagePreview(){
    myImagePreview()

}