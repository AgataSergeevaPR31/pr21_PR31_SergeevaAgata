package com.bignerdranch.android.criminalintent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bignerdranch.android.criminalintent.ui.theme.CriminalIntentTheme
import com.google.android.material.snackbar.Snackbar
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (currentFragment == null)
        {
            val fragment = CrimeFragment()
            supportFragmentManager.
                    beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
       /* setContent {
            CriminalIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }*/
    }

    fun police(view: View) {
        Snackbar.make(view,R.string.snackbarh, Snackbar.LENGTH_LONG).show()
    }

    fun kuku(view: View) {
        var bb: Button
        val currentDate = Date()

        val dateFormat: DateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())
        val dateText: String = dateFormat.format(currentDate)

        /*  val timeFormat: DateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
          val timeText: String = timeFormat.format(currentDate)*/
        bb=findViewById(R.id.crime_date)
        bb.setText(dateText);
    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CriminalIntentTheme {
        Greeting("Android")
    }
*/
