package com.example.learningapp.screens.signupscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningapp.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreen() {
    val config = LocalConfiguration.current
    val maxHeight = config.screenHeightDp.dp
    val maxWidth = config.screenWidthDp.dp
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = Modifier.width(maxWidth * 0.5f * 0.15f))
            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = "signup",
                modifier = Modifier.size(width = maxWidth * 0.3f, height = maxHeight * 0.15f)
            )
        }
        Image(
            painter = painterResource(R.drawable.img_5),
            contentDescription = "signup",
            modifier = Modifier.size(width = maxWidth * 0.6f, height = maxHeight * 0.3f)
        )
    }

}