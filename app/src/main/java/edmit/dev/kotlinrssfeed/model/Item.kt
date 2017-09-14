package edmit.dev.kotlinrssfeed.model

/**
 * Created by sungwoopark on 9/12/17.
 */

data class Item(val title: String, val pubDate: String, val link: String, val guid: String, val author: String,
                val thumbnail: String, val description: String, val content: String, val enclosure: Object,
                val category: List<String>)