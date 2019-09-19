import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by MuhamadSyahirAmir on 9/19/2019.
 */

// Array list menu, easy to expand
public class BakeryMenu {
    ArrayList menuItems;

    public BakeryMenu() {
        menuItems = new ArrayList();

        addItem("Apple Pie",
                "Pie with apple filling",
                true,
                4.99);
        addItem("Chocolate Chip Cookie",
                "Warm cookies with chocolate chips",
                false,
                1.99);
        addItem("Cheese Cake",
                "Smooth and creamy cheese cake",
                false,
                3.99);
        addItem("Sugar Cookie",
                "Sugary Egg-free Cookies",
                true,
                1.99);
    }

    public void addItem(String name, String description,
                        boolean glutenFree, double price) {
        MenuItem menuItem = new MenuItem(name, description, glutenFree, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new BakeryMenuIterator(menuItems);
    }
}
