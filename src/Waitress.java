import java.util.Iterator;

/**
 * Created by MuhamadSyahirAmir on 9/19/2019.
 */
public class Waitress {

    BakeryMenu bakeryMenu;

    public Waitress(BakeryMenu bakeryMenu) {
        this.bakeryMenu = bakeryMenu;
    }

    public void printMenu() {
        Iterator bakeryIterator = bakeryMenu.createIterator();
        printMenu(bakeryIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "\n" +
                    "$" + menuItem.getPrice() + "\n" +
                    menuItem.getDescription() + "\n" +
                    "Gluten Free:" + (menuItem.isGlutenFree() ? " Yes" : " No") + "\n");
        }
    }
}
