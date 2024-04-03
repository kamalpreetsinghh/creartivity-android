package com.cleverlycode.creartivity.ui.screens.auth.signup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.cleverlycode.creartivity.ui.composables.InputText

@Composable
fun SignUpScreen(navController: NavController) {
    Column(modifier = Modifier.padding(4.dp)) {
        InputText(value = "", placeholder = "First Name", onChange = {})
        InputText(value = "", placeholder = "Last Name", onChange = {})
        InputText(value = "", placeholder = "Email", onChange = {})
        InputText(value = "", placeholder = "Password", onChange = {})
    }
}