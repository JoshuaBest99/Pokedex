package uk.co.joshuabest.joshedex.di

import dagger.Component
import uk.co.joshuabest.joshedex.model.PokeService

@Component(modules = [PokeApiModule::class])
interface PokeApiComponent {

    fun inject(pokeService: PokeService)

}