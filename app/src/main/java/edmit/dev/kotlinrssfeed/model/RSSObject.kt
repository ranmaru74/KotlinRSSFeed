package edmit.dev.kotlinrssfeed.model

/**
 * Created by sungwoopark on 9/12/17.
 */

data class RSSObject(val status: String, val feed: Feed, val items: List<Item>)