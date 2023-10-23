package com.example.testapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage


import com.example.testapplication.ui.theme.TESTApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                val navController = rememberNavController()

        TESTApplicationTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {

                NavHost(
                    navController = navController,
                    startDestination = "Q1",
                ) {
                    composable("Q1") {
                        Ecran1(navController)
                    }
                    composable("Q2") {
                       Ecran(navController)
                    }

                    composable("Q3") {
                        Image1()
                    }
                }
            }}
        }

    }
@Composable
fun Ecran1(navController : NavController) {Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceEvenly
) {
    val click = remember {
        mutableStateOf(false)}

    if (!click.value) {
        Text("Texte initial")
    } else {
        Text("J'ai été clic")

    }
    Button(onClick = { click.value = !click.value }) {

        Text("Cliquez-moi !")
    }
    Button(onClick = { navController.navigate("Q2") }) {
        Text("Prochaine question")
    }

}}
        @Composable
        fun Greeting(name: String, modifier: Modifier = Modifier) {
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
        }

    @Composable
    fun Image1() {
        Column(){
            AsyncImage(model = "https://www.simplilearn.com/ice9/free_resources_article_thumb/what_is_image_Processing.jpg", contentDescription = "Imge")}
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TESTApplicationTheme {
        Greeting("Android")
    }
}}
