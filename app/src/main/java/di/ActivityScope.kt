package di


import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * Created by kamedon on 4/15/16.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityScope
