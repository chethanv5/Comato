package com.yugix.comato

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.yugix.comato.presentation.navigation.App
import com.yugix.comato.ui.theme.ComatoTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.distinctUntilChanged

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {

            var isVisible by remember { mutableStateOf(true) }
            var lastScrollOffset by remember { mutableIntStateOf(0) }
            var lastIndex by remember { mutableIntStateOf(0) }
            val listState = rememberLazyListState()

            LaunchedEffect(listState) {
                snapshotFlow { listState.firstVisibleItemIndex to listState.firstVisibleItemScrollOffset }
                    .distinctUntilChanged()
                    .collect { (index , scrollOffset) ->
                        if (index > lastIndex || (index == lastIndex && scrollOffset > lastScrollOffset + 50)) {
                            isVisible = false
                        } else if (index < lastIndex || ( scrollOffset < lastScrollOffset - 50)) {
                            isVisible = true
                        }
                        lastIndex = index
                        lastScrollOffset = scrollOffset
                    }
            }

            ComatoTheme {
                App(
                    isVisible = isVisible,
                    listState = listState
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComatoTheme {

    }
}