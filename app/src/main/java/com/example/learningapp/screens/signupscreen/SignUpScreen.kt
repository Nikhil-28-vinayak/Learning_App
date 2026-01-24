package com.example.learningapp.screens.signupscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
fun SignUpScreen() {
    // for responsiveness
    val config = LocalConfiguration.current
    val maxHeight = config.screenHeightDp.dp
    val maxWidth = config.screenWidthDp.dp

    // for state handling
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var showPassword1 by remember { mutableStateOf(false) }
    var showPassword2 by remember { mutableStateOf(false) }
    var showError by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = maxHeight * 0.13f * 0.1f)
            .padding(horizontal = maxWidth * 0.06f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = "signup",
                modifier = Modifier.size(width = maxWidth * 0.25f, height = maxHeight * 0.13f)
            )
        }
        Image(
            painter = painterResource(R.drawable.img_5),
            contentDescription = "signup",
            modifier = Modifier.size(width = maxWidth * 0.6f, height = maxHeight * 0.25f)
        )

        Text(
            "CREATE ACCOUNT",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Black,
            color = OceanGreen
        )
        Spacer(modifier = Modifier.height(maxHeight * 0.1f * 0.25f))
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            placeholder = { Text("Name") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,
                unfocusedContainerColor = LightBlue,
                focusedContainerColor = LightBlue,
                unfocusedPlaceholderColor = Color.Gray,
                focusedPlaceholderColor = Color.Gray,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(maxHeight * 0.1f * 0.1f))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,
                unfocusedContainerColor = LightBlue,
                focusedContainerColor = LightBlue,
                unfocusedPlaceholderColor = Color.Gray,
                focusedPlaceholderColor = Color.Gray,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(maxHeight * 0.1f * 0.1f))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("Password") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,
                unfocusedContainerColor = LightBlue,
                focusedContainerColor = LightBlue,
                unfocusedPlaceholderColor = Color.Gray,
                focusedPlaceholderColor = Color.Gray,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black
            ),
            trailingIcon = {
                Icon(
                    painter = painterResource(if (!showPassword1) R.drawable.img_4 else R.drawable.img_9),
                    contentDescription = "eye",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(if (!showPassword1) maxWidth * 0.45f * 0.11f else maxWidth * 0.45f * 0.145f)
                        .clickable {
                            if (showPassword1) showPassword1 = false else showPassword1 = true
                        }
                )
            },

            visualTransformation = if (!showPassword1) PasswordVisualTransformation() else VisualTransformation.None

        )
        Spacer(modifier = Modifier.height(maxHeight * 0.1f * 0.1f ))
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            placeholder = { Text(" Confirm password") },
            singleLine = true,
            isError = showError,
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,
                unfocusedContainerColor = LightBlue,
                focusedContainerColor = LightBlue,
                unfocusedPlaceholderColor = Color.Gray,
                focusedPlaceholderColor = Color.Gray,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                errorTextColor = Color.Black,
                errorContainerColor = LightBlue,
                errorBorderColor = Color.Red
            ),
            trailingIcon = {
                Icon(
                    painter = painterResource(if (!showPassword2) R.drawable.img_4 else R.drawable.img_9),
                    contentDescription = "eye",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(if (!showPassword2) maxWidth * 0.45f * 0.11f else maxWidth * 0.45f * 0.145f)
                        .clickable {
                            if (showPassword2) showPassword2 = false else showPassword2 = true
                        }
                )
            },

            visualTransformation = if (!showPassword2) PasswordVisualTransformation() else VisualTransformation.None
        )
        if (showError){
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start){
                Text(
                    "Password do not match",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Red
                )
            }
        }
        Spacer(modifier = Modifier.height(maxHeight * 0.45f * 0.1f * 0.4f))
        Button(
            onClick = {
                showError = if (password != confirmPassword) true else false
            },
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .height(maxHeight * 0.45f * 0.14f),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Yellow
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 4.dp
            )
        ) {
            Text(
                "Signup",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(maxHeight * 0.45f * 0.25f * 0.25f))
        Text(
            "-Or signup with-",
            color = Color.Black,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(maxHeight * 0.45f * 0.1f * 0.2f))
        Image(
            painter = painterResource(R.drawable.img_2),
            contentDescription = "other options for login",
            modifier = Modifier.size(height = maxHeight * 0.45f * 0.1f, width = maxWidth * 0.3f)
        )
        Spacer(modifier = Modifier.height(maxHeight * 0.45f * 0.1f * 0.2f))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Already have an account?",
                color = Color.Black)
            Spacer(modifier = Modifier.width(maxWidth * 0.1f * 0.1f))
            Text(
                "Login",
                textDecoration = TextDecoration.Underline,
                style = MaterialTheme.typography.bodyMedium,
                color = LightOceanGreen,
            )
        }
    }

}