
public class Main {

	public static void main(String[] args) {
		BakeryMenu bakeryMenu = new BakeryMenu();
		Waitress waitress = new Waitress(bakeryMenu);
		waitress.printMenu();
	}

}
