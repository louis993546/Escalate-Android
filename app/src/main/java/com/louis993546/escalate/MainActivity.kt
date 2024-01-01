package com.louis993546.escalate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.louis993546.escalate.ui.theme.EscalateTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EscalateTheme {
                var selectedTab by remember { mutableStateOf(Tab.History) }

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { TopBar() },
                    floatingActionButton = {
                        if (selectedTab == Tab.History) FloatingActionButton(
                            onClick = { /*TODO*/ },
                        ) {
                            Icon(
                                Icons.Default.Add,
                                contentDescription = "Add"
                            )
                        }
                    },
                    bottomBar = {
                        BottomBar(
                            selected = { selectedTab == it },
                            onClick = { selectedTab = it },
                        )
                    },
                ) {
                    Text(
                        text = "Hello World!",
                        modifier = Modifier.padding(it)
                    )
                }
            }
        }
    }
}
