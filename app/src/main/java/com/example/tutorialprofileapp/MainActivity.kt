package com.example.tutorialprofileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorialprofileapp.ui.theme.TutorialProfileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialProfileAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Jetpack Compose")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //要素を縦に並べる
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState()) //縦方向のスクロールを有効化
    ) {
        Text(
            text = "$name!",
            modifier = modifier,
            fontSize = 40.sp
        )
        Divider()

        SectionTitle(titele = "Column() {} で要素を縦に並べる")

        TextComponent(text = "上", fS = 20)

        TextComponent(text = "中", fS = 20)

        TextComponent(text = "下", fS = 20)
        Divider()

        SectionTitle(titele = "Row() {} で要素を横に並べる")

        Row() {
            TextComponent(text = "左", fS = 20)

            TextComponent(text = "中", fS = 20)

            TextComponent(text = "右", fS = 20)
        }
        Divider()

        SectionTitle(titele = "Box() {} で要素を重ねる")

        Box() {
            Spacer(
                modifier = Modifier
                    .size(100.dp, 100.dp)
                    .background(Color.LightGray)
            )

            Spacer(
                modifier = Modifier
                    .padding(10.dp)
                    .size(80.dp, 80.dp)
                    .background(Color.Gray)
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Divider()

        SectionTitle(titele = "文字の修飾")
        Text(
            text = "fontSize を ○.sp で指定",
            fontSize = 20.sp,
        )
        
        Row {
            Text(text = "20.sp", fontSize = 20.sp)
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "30.sp", fontSize = 30.sp)
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "40.sp", fontSize = 40.sp)
        }
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "fontWeight を変更",
            fontSize = 20.sp,
        )

        Text(
            text = "FontWeight.Thin",
            fontSize = 20.sp,
            fontWeight = FontWeight.Thin
        )
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "FontWeight.Light",
            fontSize = 20.sp,
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "FontWeight.Bold.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Divider()
    }
}

@Composable
fun SectionTitle(titele: String) {
    Text(
        text = titele,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(20.dp),
    )
}

@Composable
fun TextComponent(text: String, fS: Int) {
    Text(
        text = text,
        fontSize = fS.sp,
        modifier = Modifier
            .padding(10.dp),
    )
}