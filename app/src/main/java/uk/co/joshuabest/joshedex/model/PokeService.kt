package uk.co.joshuabest.joshedex.model

import io.reactivex.Single
import uk.co.joshuabest.joshedex.di.DaggerPokeApiComponent
import uk.co.joshuabest.joshedex.model.data.Pokemon
import javax.inject.Inject

class PokeService {

    @Inject
    lateinit var pokeApi: PokeApi

    init {
        DaggerPokeApiComponent.create().inject(this)
    }

    fun getPokemonById(id: String): Single<Pokemon> {
        return pokeApi.getPokemonById(id)
    }

}