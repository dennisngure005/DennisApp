package com.example.instagram

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.instagram.ui.theme.InstagramTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}

@Suppress
@Composable
fun Text() {
     Column(modifier = Modifier
         .fillMaxSize()
         .verticalScroll(rememberScrollState())) {

            val mContext = LocalContext.current

            androidx.compose.material3.Text(text = "Welcome to Android",
                fontSize = 30.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic)
            androidx.compose.material3.Text(text = "It entails creating an application by th use of Android")


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
            androidx.compose.material3.Text(text = "3.Audi")

           Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
               Button(onClick = { mContext.startActivity(Intent(mContext,DestinationActivity::class.java)) },
                   shape = RoundedCornerShape(5.dp),
                   colors = ButtonDefaults.buttonColors(Color.Red),
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(start = 130.dp, end = 130.dp)
               ) {
                   androidx.compose.material3.Text(text = "Destination")
               }
           }

            androidx.compose.material3.Text(
                text = "Classes at eMobilis ",
                fontSize = 30.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red)
                    .height(50.dp),
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
                )
            androidx.compose.material3.Text(text = "1. Firefox")
            androidx.compose.material3.Text(text = "2. Opera")
            androidx.compose.material3.Text(text = "3. Chrome")

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.animation))
                val progress by animateLottieCompositionAsState(composition)
                LottieAnimation(
                    composition, progress,
                    modifier = Modifier.size(300.dp)
                )
            }



            Divider()
            Spacer(modifier = Modifier.height(20.dp))



          Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
               Image(painter = painterResource(id = R.drawable.home),
                   contentDescription = "",
                   modifier = Modifier
                       .size(100.dp)
                       .clip(shape = CircleShape),
                   contentScale = ContentScale.Crop)
           }




            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Button(onClick = { mContext.startActivity(Intent(mContext,LayoutActivity::class.java))},
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 130.dp, end = 130.dp)
                ) {
                    androidx.compose.material3.Text(text = "Next")
                }
            }
Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
    Button(onClick = { mContext.startActivity(Intent(mContext,FirstActivity::class.java)) }) {
        Text(text = "First")

    }

}

        }


     }

@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()

}