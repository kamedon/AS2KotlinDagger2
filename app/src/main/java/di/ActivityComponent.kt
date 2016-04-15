package di

import com.example.kamedon.sample20.MainActivity
import com.example.kamedon.sample20.SecondActivity
import dagger.Subcomponent

/**
 * Created by kamedon on 4/14/16.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: SecondActivity)
}
