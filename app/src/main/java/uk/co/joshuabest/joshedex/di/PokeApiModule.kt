package uk.co.joshuabest.joshedex.di

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import uk.co.joshuabest.joshedex.model.PokeApi
import uk.co.joshuabest.joshedex.model.PokeService
import uk.co.joshuabest.joshedex.util.Constants

@Module
class PokeApiModule {

    @Provides
    fun providePokeApi(): PokeApi {
        val httpClient = OkHttpClient.Builder()
        val client = httpClient.build()
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(PokeApi::class.java)
    }

    @Provides
    fun providesPokeApiService(): PokeService {
        return PokeService()
    }

}