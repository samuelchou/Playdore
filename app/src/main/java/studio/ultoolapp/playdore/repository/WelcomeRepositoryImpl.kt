package studio.ultoolapp.playdore.repository

class WelcomeRepositoryImpl : WelcomeRepository {
    override fun getWelcomeMessage(): String {
        return "Hello User!"
    }
}