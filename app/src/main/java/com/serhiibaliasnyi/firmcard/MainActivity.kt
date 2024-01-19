package com.serhiibaliasnyi.firmcard

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.serhiibaliasnyi.firmcard.ui.BooksApp
import com.serhiibaliasnyi.firmcard.ui.theme.FirmCardTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FirmCardTheme {
                BooksApp()
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color=MaterialTheme.colorScheme.background
//                ) {
//                    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior();
//                    // A surface container using the 'background' color from the theme
//                    MainScreen(scrollBehavior)
//                }

            }
        }
    }
}
//@Preview(showBackground = true)
//@OptIn(ExperimentalMaterial3Api::class)
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(scrollBehavior: TopAppBarScrollBehavior) {
    Scaffold(topBar = {
        TopAppBarM3(scrollBehavior)}
        ){padding->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp)
        ){
            items(50){
                androidx.compose.material3.ListItem(
                    headlineContent = { Text(text = "Item $it") },
                    leadingContent = {
                        Icon(imageVector = Icons.Default.Face, contentDescription = null)
                    })
            }

        }


        
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarM3(scrollBehavior: TopAppBarScrollBehavior) {
    TopAppBar(
        scrollBehavior = scrollBehavior,
        title = { Text(text = "Top Stories") },
        colors = topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(3.dp)
        ),
        navigationIcon = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Open Menu")
            }
        },
        actions = {
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Open Likes")
            }
            IconButton(onClick = { /* do something*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Open Settings")
            }
        }

    )
}