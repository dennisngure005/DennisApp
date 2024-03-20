package com.example.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram.ui.theme.InstagramTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}

@Composable
fun Text(){
    Column(modifier = Modifier.fillMaxSize()) {
        androidx.compose.material3.Text(text = "Welcome to Android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic)
        androidx.compose.material3.Text(text = "It entails all the things that are about to be in a mobile phone in cases of Android")
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 130.dp, end = 130.dp)
            ) {
                Text(text = "See More")
            }
        }

        androidx.compose.material3.Text(
            text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(40.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(20.dp))

       



        androidx.compose.material3.Text(text = "1.Ferrari")
        androidx.compose.material3.Text(text = "2.Lamborghini")
        androidx.compose.material3.Text(text = "3.VoxWagen")
        androidx.compose.material3.Text(
            text = "Courses at eMobilis ",
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(50.dp),
            color = Color.Blue,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        androidx.compose.material3.Text(text = "1. MIT")
        androidx.compose.material3.Text(text = "2. CYBER SECURITY")
        androidx.compose.material3.Text(text = "3. SOFTWARE DEVELOPMENT")

        Divider()
        androidx.compose.material3.Text(text ="eMobilis Mobile Training Institute",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 20.sp)

        Image(painter = painterResource(id =R.drawable.puppy),
            contentDescription = "puppy",
            modifier = Modifier.size(200.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            androidx.compose.material3.Text(text = "Continue")
        }



    }

}

@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()

}