package home.oleg.dagger.di;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import home.oleg.dagger.entity.Item;
import home.oleg.dagger.mapping.ItemMapper;
import home.oleg.dagger.mapping.Mapper;
import home.oleg.dagger.repo.ItemRepository;
import home.oleg.dagger.repo.Repository;
import home.oleg.dagger.view_model.ItemViewModel;

/**
 * Created by Oleg on 22.04.2017.
 */

@Module
public class ApplictaionModule {

    private final Context context;

    public ApplictaionModule(Context context) {
        this.context = context;
    }

    @NonNull
    @Provides
    @Singleton
    public Context provideContext() {
        return context;
    }

}
