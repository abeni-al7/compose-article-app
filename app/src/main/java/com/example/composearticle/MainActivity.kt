package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(modifier = Modifier.safeDrawingPadding()) {
                        BackgroundImage(
                            painter = painterResource(R.drawable.bg_compose_background)
                        )
                        TitleText(
                            text = stringResource(R.string.title_text)
                        )
                        ParagraphText(
                            text = stringResource(R.string.paragraph_1),
                            padding = PaddingValues(
                                start = 16.dp,
                                end = 16.dp

                            )
                        )
                        ParagraphText(
                            text = stringResource(R.string.paragraph_2),
                            padding = PaddingValues(
                                start = 16.dp,
                                end = 16.dp,
                                top = 16.dp,
                                bottom = 16.dp
                            )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BackgroundImage(painter: Painter, modifier: Modifier = Modifier) {
    Image(
        painter = painter,
        contentDescription = null,
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun TitleText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 24.sp,
        modifier = modifier.padding(16.dp)
    )
}

@Composable
fun ParagraphText(text: String, padding: PaddingValues, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
            .padding(padding),
        textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {

    }
}