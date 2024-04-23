package com.example.loginpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyApp() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(painter = painterResource(id = R.drawable.loginpermission),
            contentDescription = null,
//            modifier = Modifier.height(100.dp),
            modifier = Modifier.size(100.dp)
        )

        OutlinedTextField(value = "", onValueChange = {},
            placeholder = {
                Text(text = "Enter Your Email")
            })
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = "", onValueChange = {},
            placeholder = {
                Text(text = "Enter Password")
            })
        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Forget Password")
    }


}