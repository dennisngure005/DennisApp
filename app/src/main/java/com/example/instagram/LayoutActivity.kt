package com.example.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagram.ui.theme.InstagramTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout() {


    Column(modifier = Modifier.fillMaxSize()) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Share",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Settings",
                        tint = Color.White
                    )
                }
            }
        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "BREEDS OF DOGS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Row {
            Image(
                painter = painterResource(id = R.drawable.bulldog),
                contentDescription = "bulldog",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "Bulldog", fontWeight = FontWeight.Bold)
                Text(
                    text = "The Bulldog is a medium-sized working sled dog .The breed belongs to the Spirit genetic family",
                    fontWeight = FontWeight.Bold
                )
            }
        }
            //End of row 1
            Row {
                Image(
                    painter = painterResource(id = R.drawable.german),
                    contentDescription = "german",
                    modifier = Modifier.size(width = 200.dp, height = 200.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(text = "German", fontWeight = FontWeight.Bold)
                    Text(
                        text = "The german is a medium-sized working sled dog .The breed belongs to the Spirit genetic family",
                        fontWeight = FontWeight.Bold
                    )
                }

            }
            //End of row 2
            Row {
                Image(
                    painter = painterResource(id = R.drawable.siberianhusky),
                    contentDescription = "siberian",
                    modifier = Modifier.size(width = 200.dp, height = 200.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(text = "Siberianhusky", fontWeight = FontWeight.Bold)
                    Text(
                        text = "The siberianhusky is a medium-sized working sled dog .The breed belongs to the Spirit genetic family",
                        fontWeight = FontWeight.Bold
                    )
                }
                //End of row 3

        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.poodle),
                contentDescription = "poodlew",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(text = "poodle", fontWeight = FontWeight.Bold)
                Text(
                    text = "The poodle is a medium-sized working sled dog .The breed belongs to the Spirit genetic family",
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }


}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}