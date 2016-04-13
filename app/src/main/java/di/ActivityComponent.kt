package di

import com.example.kamedon.sample20.MainActivity
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * Created by kamedon on 4/14/16.
 */
@Singleton
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(activity: MainActivity)
}
