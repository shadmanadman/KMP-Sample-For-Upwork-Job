package org.kmp.sample.upwork.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json


val jsonData :String= """
{
  "image_url": "https://images.pexels.com/photos/2100063/pexels-photo-2100063.jpeg",
  "text": "This is simple kmp task for an upwork job."
}
"""

@Serializable
data class ImageText(
    val image_url: String,
    val text: String
)


fun String.convertToDataClass():ImageText{
    return Json.decodeFromString<ImageText>(jsonData)
}