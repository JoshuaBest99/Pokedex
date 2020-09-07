package uk.co.joshuabest.joshedex.model

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import uk.co.joshuabest.joshedex.model.data.Pokemon

interface PokeApi {

    @GET("pokemon/{id}")
    fun getPokemonById(@Path("id") id: String): Single<Pokemon>

}