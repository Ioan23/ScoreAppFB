package com.xaivison.scoreappfb

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.firestore.FirebaseFirestore
import com.xaivison.scoreappfb.ui.theme.ScoreAppFBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScoreAppFBTheme {

                val db = FirebaseFirestore.getInstance()
                val user:MutableMap<String,Any> = HashMap()
                user["firstname"]= "Joe"
                user["lastname"]= "James"



                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    db.collection("users")
                        .add(user)
                        .addOnSuccessListener { Log.d("FB","onCreate: ${it.id}") }
                        .addOnFailureListener{(Log.d("FB","onCreate: $it"))}
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ScoreAppFBTheme {
        Greeting("Android")
    }
}