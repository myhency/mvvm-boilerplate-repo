package io.play.mvvmstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import io.play.mvvmstudy.core.presentation.Navigation
import io.play.mvvmstudy.ui.theme.MVVMStudyTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMStudyTheme {
                Navigation()
            }
        }
    }
}
