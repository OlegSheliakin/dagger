package home.oleg.dagger.di;

/**
 * Created by Oleg on 23.04.2017.
 */

public interface Action<T> {
    void perform(T t);
}
