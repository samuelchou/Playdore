package studio.ultoolapp.playdore.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import studio.ultoolapp.playdore.repository.WelcomeRepository
import studio.ultoolapp.playdore.repository.WelcomeRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {

    @Provides
    fun provideWelcomeRepository(): WelcomeRepository {
        return WelcomeRepositoryImpl()
    }
}