package com.example.learningapp.screens.loginscreen


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningapp.R
import com.example.learningapp.ui.theme.LightBlue
import com.example.learningapp.ui.theme.LightOceanGreen
import com.example.learningapp.ui.theme.OceanGreen
import com.example.learningapp.ui.theme.Yellow

@SuppressLint("ConfigurationScreenWidthHeight")
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {
    val config = LocalConfiguration.current
    val imageSize = config.screenWidthDp.dp * 0.45f
    val logoSize = config.screenWidthDp.dp * 0.3f
    val imagePadding = (config.screenHeightDp.dp * 0.5f)
    val screenHeight = config.screenHeightDp.dp * 0.45f

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(screenHeight)
    ) {
        Image(
            painter = painterResource(R.drawable.img_3),
            contentDescription = "shape",
            modifier = Modifier.size(500.dp),
            contentScale = ContentScale.FillBounds
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(imagePadding * 0.38f))

        Image(
            painterResource(R.drawable.img_1),
            contentDescription = "Curve",
            modifier = Modifier.size(imageSize)
        )
        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "Logo",
            modifier = Modifier.size(logoSize * 0.7f)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                "HEY!",
                fontSize = 35.sp,
                fontWeight = FontWeight.Black,
                color = OceanGreen
            )
            Text(
                "LOGIN NOW",
                fontSize = 35.sp,
                fontWeight = FontWeight.Black,
                color = OceanGreen
            )
        }

        Spacer(modifier = Modifier.height(screenHeight * 0.1f * 0.2f))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,
                unfocusedContainerColor = LightBlue,
                focusedContainerColor = LightBlue,
                unfocusedPlaceholderColor = Color.Gray,
                focusedPlaceholderColor = Color.Gray
            ),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(screenHeight * 0.1f * 0.3f))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,
                unfocusedContainerColor = LightBlue,
                focusedContainerColor = LightBlue ,
                unfocusedPlaceholderColor = Color.Gray,
                focusedPlaceholderColor = Color.Gray
            ),
            singleLine = true,
            trailingIcon = {
                Icon(
                    painter = painterResource( if (!showPassword)R.drawable.img_4 else R.drawable.img_9),
                    contentDescription = "eye",
                    tint = Color.Gray,
                    modifier = Modifier.size(if(!showPassword)imageSize * 0.11f else imageSize *  0.145f)
                        .clickable { if (showPassword) showPassword = false else showPassword= true }
                )
            },

            visualTransformation = if (!showPassword) PasswordVisualTransformation() else VisualTransformation.None
        )
        Spacer(modifier = Modifier.height(screenHeight * 0.1f * 0.4f))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .height(screenHeight * 0.14f),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Yellow
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 4.dp
            )
        ) {
            Text(
                "Login",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(screenHeight * 0.1f * 0.2f))
        Text(
            "Forget Password?",
            color = LightOceanGreen,
            textDecoration = TextDecoration.Underline,
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(screenHeight * 0.1f * 0.6f))
        Text(
            "-Or login with-",
            color = Color.Black,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(screenHeight * 0.1f * 0.2f))
        Image(
            painter = painterResource(R.drawable.img_2),
            contentDescription = "other options for login",
            modifier = Modifier.size(height = screenHeight * 0.1f, width = logoSize)
        )
        Spacer(modifier = Modifier.height(screenHeight * 0.1f * 0.2f))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Don't have an account?")
            Spacer(modifier = Modifier.width(imagePadding * 0.1f * 0.1f))
            Text(
                "Create new",
                textDecoration = TextDecoration.Underline,
                style = MaterialTheme.typography.bodyMedium,
                color = LightOceanGreen,
            )
        }
    }

}

