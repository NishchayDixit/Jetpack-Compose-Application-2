package com.example.rock_paper_scissors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rock_paper_scissors.ui.theme.Rock_Paper_ScissorsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rock_Paper_ScissorsTheme {
                RockPaperScissorsApp()
            }
        }
    }
}

@Composable
fun AppWithAllComponents(modifier: Modifier = Modifier) {

    Box(Modifier.background(Color.White)) {

        Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {

            Image(painter = painterResource(R.drawable.app_banner), contentDescription = "")
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "Score", fontSize = 30.sp)
            Text(text = "0 / 4", fontSize = 50.sp, fontWeight = FontWeight.Medium)

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 140.dp, bottom = 140.dp)
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Text(text = "Your Chose", fontSize = 16.sp)
                    Text(text = "Rock", fontSize = 32.sp, fontWeight = FontWeight.Bold)

                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Text(text = "Android Chose", fontSize = 16.sp)
                    Text(text = "Paper", fontSize = 32.sp, fontWeight = FontWeight.Bold)

                }

            }

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Button(
                    onClick = {},
                    modifier = Modifier.size(100.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                    shape = RoundedCornerShape(15.dp)
                ) {

                    Text(text = "Rock", color = MaterialTheme.colors.onPrimary)

                }

                Button(
                    onClick = {},
                    modifier = Modifier.size(100.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                    shape = RoundedCornerShape(15.dp)
                ) {

                    Text(text = "Paper", color = MaterialTheme.colors.onPrimary)

                }

                Button(
                    onClick = {},
                    modifier = Modifier.size(100.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                    shape = RoundedCornerShape(15.dp)
                ) {

                    Text(text = "Scissors", color = MaterialTheme.colors.onPrimary)

                }

            }

            Text(
                text = "#JetpackCompose",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                textAlign = TextAlign.Center
            )

        }

    }

}

@Preview
@Composable
fun RockPaperScissorsApp() {
    AppWithAllComponents(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .background(Color.White)
    )
}