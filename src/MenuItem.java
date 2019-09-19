
public class MenuItem {
    String name;
    String description;
    boolean glutenFree;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean glutenFree,
                    double price)
    {
        this.name = name;
        this.description = description;
        this.glutenFree = glutenFree;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }
}