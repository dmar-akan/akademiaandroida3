package dmar.akan.akademiaandroida.features.characters.presentation.model

import dmar.akan.akademiaandroida.features.characters.domain.model.Character

data class CharacterDisplayable(
    val id: Int,
    val name: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: List<String>,
    val location: List<String>,
    val image: String,
    val episode: List<String>,
    val url: String
) {
    // przyjmuje model z warstwy domeny jako argument
    constructor(character: Character) : this(
        id = character.id,
        name = character.name,
        species = character.species,
        type = character.type,
        gender = character.gender,
        origin = character.origin,
        location = character.location,
        image = character.image,
        episode = character.episode,
        url = character.url
    )
}
