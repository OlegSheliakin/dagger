package home.oleg.dagger.datastore;

import java.util.Arrays;
import java.util.List;

import home.oleg.dagger.entity.Item;

/**
 * Created by Oleg on 23.04.2017.
 */

public class CachedStore implements Store<List<Item>> {

    @Override
    public List<Item> get() {
        return Arrays.asList(new Item("3", "third item"), new Item("4", "fourth item"));
    }
}