package org.kmp.sample.upwork

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.size
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kmp_sample_for_upwork_job.composeapp.generated.resources.Res
import kmp_sample_for_upwork_job.composeapp.generated.resources.compose_multiplatform
import org.kmp.sample.upwork.data.convertToDataClass
import org.kmp.sample.upwork.data.jsonData

@Composable
@Preview
fun App() {
    val data = jsonData.convertToDataClass()
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    KamelImage(
                        resource = asyncPainterResource(data = data.image_url),
                        contentDescription = "Image from ${data.image_url}",
                        modifier = Modifier.size(200.dp)
                    )
                    Text(data.text)
                }
            }
        }
    }
}