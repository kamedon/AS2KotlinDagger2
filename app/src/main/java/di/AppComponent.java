package di;

import com.example.kamedon.sample20.MainActivity;
import com.kamedon.kotlindagger2sample.di.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kamedon on 4/12/16.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
