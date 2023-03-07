package com.example.atvaula

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.atvaula.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ATVAULATheme {
                PrimeiraTela()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PrimeiraTela(){
    Scaffold (
        topBar =  {
            TopAppBar(
                modifier = Modifier
                    .background(
                        Brush.horizontalGradient(
                            colors = listOf(
                                Purple200,
                                Purple500,
                                Purple700,
                                Teal200
                            )
                        )
                    )
                ,backgroundColor = Color.Transparent
            ) {
                Text(
                    text = "          Cores Disponíveis  ",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray,
                )
                Text(
                    textAlign = TextAlign.Right,
                    text = "(LightGray)",
                    color = Color.LightGray
                )
        }
    }
            ) {
                Column(
                    modifier = Modifier
                        .background(Color.LightGray)
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Yeloow",
                        fontSize = 30.sp,
                        color = Color.Yellow,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "Magenta",
                        fontSize = 30.sp,
                        color = Color.Magenta,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "DarkGray",
                        fontSize = 30.sp,
                        color = Color.DarkGray,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "Verde",
                        fontSize = 30.sp,
                        color = Color.Green,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "White",
                        fontSize = 30.sp,
                        color = Color.White,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "Red",
                        fontSize = 30.sp,
                        color = Color.Red,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "Blue",
                        fontSize = 30.sp,
                        color = Color.Blue,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "Black",
                        fontSize = 30.sp,
                        color = Color.Black,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "Cyan",
                        fontSize = 30.sp,
                        color = Color.Cyan,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "Gray",
                        fontSize = 30.sp,
                        color = Color.Gray,
                        fontFamily = FontFamily.Cursive
                    )
                    Text(
                        text = "Unspecified",
                        fontSize = 30.sp,
                        color = Color.Unspecified,
                        fontFamily = FontFamily.Cursive
                    )
                }
    }

}

@Preview
@Composable
fun PrimeiraTelaPreview() {
    PrimeiraTela()

}