package FirstLessons.HOMEWORK.OOPLESSON1.MAINFILES;

import java.util.List;

public interface VendingMachine {
	void initProducts(List<Product> products);

	Product getProduct(String name);
}
