package studio.ultoolapp.playdore.repository

import android.content.Context

class WelcomeRepositoryImpl(
    private val context: Context
) : WelcomeRepository {
    override fun getWelcomeMessage(): String {
        val appId = context.packageName
        return "Hello Repository Pattern!\nApp ID is $appId"
    }
}