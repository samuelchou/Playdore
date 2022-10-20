package studio.ultoolapp.playdore.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import studio.ultoolapp.playdore.repository.WelcomeRepository
import studio.ultoolapp.playdore.repository.WelcomeRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    fun provideWelcomeRepository(
        @ApplicationContext context: Context,
    ): WelcomeRepository {
        return WelcomeRepositoryImpl(context)
    }
}