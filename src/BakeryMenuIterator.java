import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by MuhamadSyahirAmir on 9/19/2019.
 */
public class BakeryMenuIterator implements Iterator {
    private ArrayList items;
    private int position = 0;

    BakeryMenuIterator(ArrayList items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        return !((position >= items.size()) || (items.get(position) == null));
    }
    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position = position + 1;
        return menuItem;
    }
}