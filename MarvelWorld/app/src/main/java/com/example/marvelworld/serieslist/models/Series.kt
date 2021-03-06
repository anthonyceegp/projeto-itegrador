package com.example.marvelworld.serieslist.models

import com.example.marvelworld.api.models.*
import java.util.*

data class Series(
    val id: Int,
    val title: String,
    val description: String,
    val resourceURI: String,
    val urls: List<Url>,
    val startYear: Int,
    val endYear: Int,
    val rating: String,
    val modified: Date,
    val thumbnail: Image,
    val comics: ComicList,
    val stories: StoryList,
    val events: EventList,
    val characters: CharacterList,
    val creators: CreatorList,
    val next: SeriesSummary,
    val previous: SeriesSummary
)