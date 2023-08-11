package com.example.tutorialprofileapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun DetailScreen() {
    Box(modifier = Modifier.padding(30.dp)) {
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(2.dp)) {
            template("プログラミング", "Android開発と競技プログラミングをしています")
            template("ゲーム", "スプラトゥーン、マイクラ etc...")
            template("自作PC", "ともて楽しい")
            template(hobby = "1", hDiscription = "")
            template(hobby = "2", hDiscription = "")
            template(hobby = "3", hDiscription = "")
            template(hobby = "4", hDiscription = "")
            template(hobby = "5", hDiscription = "")
            template(hobby = "6", hDiscription = "")
            template(hobby = "7", hDiscription = "")
            template(hobby = "8", hDiscription = "")
            template(hobby = "9", hDiscription = "")
            template(hobby = "10", hDiscription = "")
        }

        Spacer(
            modifier = Modifier
                .fillMaxSize()
                //.padding(30.dp)
                .background(Color.White.copy(alpha = 0f), RoundedCornerShape(15.dp))
                .border(3.dp, Color.Green, RoundedCornerShape(15.dp))
        )
    }
}

@Composable
fun template(hobby: String, hDiscription: String) {
    Row(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 5.dp)) {
        Text(
            text = hobby,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .width(120.dp)
                .background(Color(0xFFf0f0f0))
                .border(1.dp, Color.Black, RoundedCornerShape(3.dp))
        )
        Spacer(modifier = Modifier.width(5.dp))
        
        Text(
            text = hDiscription,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
        )
    }
}