package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image

@Composable
fun MyImageView(){
    val image= painterResource(id = R.drawable.image1)
    Image(painter =image , contentDescription = null)

}
@Preview
@Composable
fun MyImageViewPreview(){
    MyImageView()
}