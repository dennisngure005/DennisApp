package com.example.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram.ui.theme.InstagramTheme

class DogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyDog()

        }
    }
}

@Composable
fun MyDog(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(id = R.drawable.paw), contentDescription ="paw", modifier = Modifier.padding(end = 170.dp) )
            Text(
                text = "Woof",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 50.sp
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        //Card 1
        Card  (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.dog1),
                        contentDescription = "dog",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = "Koda",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 60.dp))
                        Text(
                            text = " 2 years old",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 56.dp))
                    }
                }
            }
        }
        //End of Card 1
        Spacer(modifier = Modifier.height(10.dp))
        //Card 2
        Card  (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.dog2),
                        contentDescription = "dog",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = "Lola",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 60.dp))
                        Text(
                            text = "16 years old",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 56.dp))
                    }
                }
            }
        }
        //End of card 2
        Spacer(modifier = Modifier.height(10.dp))
        // Card 3
        Card  (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.dog3),
                        contentDescription = "dog",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = "Frankie",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 60.dp))
                        Text(
                            text = " 2 years old",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 56.dp))
                    }
                }
            }
        }
        //End of card 3
        Spacer(modifier = Modifier.height(10.dp))
        // Card 4
        Card  (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.dog1),
                        contentDescription = "dog",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = "Nox",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 60.dp))
                        Text(
                            text = " 8 years old",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 56.dp))
                    }
                }
            }
        }
        //End of card 4
        Spacer(modifier = Modifier.height(10.dp))
        // Card 5
        Card  (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.dog2),
                        contentDescription = "dog",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = "Faye",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 60.dp))
                        Text(
                            text = " 8 years old",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 56.dp))
                    }
                }
            }
        }
        //End of card 5
        Spacer(modifier = Modifier.height(10.dp))
        // Card 6
        Card  (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.dog3),
                        contentDescription = "dog",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = "Bella",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 60.dp))
                        Text(
                            text = " 14 years old",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 56.dp))
                    }
                }
            }
        }
        //End of card 6
        Spacer(modifier = Modifier.height(10.dp))
        // Card 7
        Card  (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Box {

                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = "Moana",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 60.dp))
                        Text(
                            text = " 2 years old",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 56.dp))
                    }
                }
            }
        }
        //End of card 7
        Spacer(modifier = Modifier.height(10.dp))
        // Card 8
        Card  (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.dog2),
                        contentDescription = "dog",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = "Tzeitel",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 60.dp))
                        Text(
                            text = " 7 years old",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 56.dp))
                    }
                }
            }
        }
        //End of card 8
        Spacer(modifier = Modifier.height(10.dp))
        // Card 9
        Card  (
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.dog3),
                        contentDescription = "dog",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Text(
                            text = "Kojo",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 60.dp))
                        Text(
                            text = " 5 years old",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 56.dp))
                    }
                }
            }
        }
        //End of card 9
    }


}

@Preview(showBackground = true)
@Composable
fun MyDogPreview() {
    MyDog()

}
