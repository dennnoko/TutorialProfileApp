package com.example.tutorialprofileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorialprofileapp.ui.theme.TutorialProfileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //onCreate() メソッドは最初に実行されるメソッド
        super.onCreate(savedInstanceState)
        setContent {
            TutorialProfileAppTheme(darkTheme = false) { //見た目を揃えるためにダークテーマをoffにする
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen() //MainScreen() を実行
                }
            }
        }
    }
}

@Preview
@Composable // Composable function（コンポーザブル関数）とは、Jetpack Composeフレームワーク内で使用されるUIの構築要素で、再利用可能でデザラブルなUIコンポーネントを定義するための関数  @Composable fun ○○ と書いて定義
fun MainScreen() { //MainScreen() を定義
    Column( //要素を縦に並べる
        horizontalAlignment = Alignment.CenterHorizontally, //画面の中央に要素を並べていく
        modifier = Modifier //修飾する
            .fillMaxWidth() //画面の横幅目いっぱいにColumnを広げる
    ) {
        Text(
            text = "Profile App", //表示する文をString型で与える
            fontSize = 20.sp, //font のサイズにはspを指定する  Androidの文字サイズの設定などを反映できるようにするため
            fontWeight = FontWeight.Bold, //fontWeight で文字の太さを変更できる
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .padding(20.dp, 10.dp) //余白の設定
        )
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.test_icon),
            contentDescription = "画像の説明",
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(10.dp))
        ) //ファイル名に日本語や大文字を含めるとエラーになる
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "でんのこ",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Text(
            text = "所属",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(10.dp)
                .background(Color.Green, RoundedCornerShape(8.dp))
                .padding(15.dp)
        )

        Text(
            text = "・名古屋工業大学\n・C0de\n・niC",
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp)
        )

        var detailScreen by remember { mutableStateOf(false) }

        Button(
            onClick = { detailScreen = !detailScreen },
            colors = ButtonDefaults.buttonColors(Color.Green),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
        ) {
            Text(
                text = "詳細",
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
            )
        }

        if(detailScreen == true) {
            DetailScreen()
        }
    }
}

