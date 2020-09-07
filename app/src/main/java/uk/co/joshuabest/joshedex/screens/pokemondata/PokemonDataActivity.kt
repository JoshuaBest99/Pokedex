package uk.co.joshuabest.joshedex.screens.pokemondata

import androidx.lifecycle.ViewModelProviders
import uk.co.joshuabest.joshedex.R
import uk.co.joshuabest.joshedex.util.JoshedexActivity

class PokemonDataActivity : JoshedexActivity(){

    lateinit var viewModel: PokemonDataViewModel

    override fun provideLayoutId(): Int = R.layout.activity_pokemon_data

    override fun observeViewModel() {
        viewModel = ViewModelProviders.of(this).get(PokemonDataViewModel::class.java)
    }


}