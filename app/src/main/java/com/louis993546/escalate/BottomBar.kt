package com.louis993546.escalate

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.louis993546.escalate.ui.theme.EscalateTheme

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    selected: (tab: Tab) -> Boolean,
    onClick: (tab: Tab) -> Unit,
) {
    NavigationBar(modifier = modifier) {
        Tab.entries.forEach { tab ->
            NavigationBarItem(
                selected = selected(tab),
                onClick = { onClick(tab) },
                icon = {
                    Icon(
                        imageVector = tab.icon,
                        contentDescription = tab.label,
                    )
                },
                label = { Text(text = tab.label) }
            )
        }
    }
}

enum class Tab(
    val label: String,
    val icon: ImageVector,
) {
    History("History", Icons.Default.History),
    Statistics("Statistics", Icons.Default.TrendingUp),
    Settings("Settings", Icons.Default.Settings),
}

@Preview
@Composable
fun BottomBarPreview() {
    BottomBar(
        selected = { false },
        onClick = { },
    )
}