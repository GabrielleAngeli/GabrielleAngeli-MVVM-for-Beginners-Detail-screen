package com.example.detailscreen

import android.os.Bundle
import android.widget.GridLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState())
                    .background(color = Color(0xfff2f2f2))
            ) {
                Image(painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "Happy Meal",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(modifier = Modifier
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "Happy Meal", style = TextStyle(
                            fontSize = 26.sp
                        ))

                        Text(text = "$5.99", style = TextStyle(
                            color = Color(0xff85bb65),
                            fontSize = 17.sp
                        ), modifier = Modifier.align(Alignment.CenterVertically))
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "800 Calories", style = TextStyle(
                        fontSize = 17.sp
                    ))
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Text(text = "ORDER NOW")
                    }
                }
            }
        }
    }
}
