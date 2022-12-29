import java.util.ArrayList;
import java.util.Scanner;

public class Productmanager {

    private ArrayList<Product> productsArr;
    private categoryManager categoryManager;

    public Productmanager(categoryManager categoryManager) {
       this.productsArr = new ArrayList<>();
        this.categoryManager = categoryManager;
    }

    public  Product creatProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập id ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" tên sản phẩm ");
        String name = scanner.nextLine();
        System.out.println("nhập giá sp");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập quantily");
        String quantity = scanner.nextLine();
        System.out.println("chọn category");
        category category =choiceCategory(scanner);
        return new Product(id, name , price , quantity, category);

    }
    public category choiceCategory(Scanner scanner) {
        category category;
        System.out.println("chọn id category: ");

        Scanner scanner1 = new Scanner(System.in);
        int indexOfCategory = Integer.parseInt(scanner1.nextLine());
        if (indexOfCategory != -1) {
         category =this.categoryManager.getCategoryById(indexOfCategory);
        } else {
            category =this.categoryManager.CreatCategory();
            categoryManager.addCategory();
        }
        if (category != null) {
            return category;
        } else {
            return choiceCategory(scanner);
        }
    }
    public void displayProduct() {
        for (int i = 0; i < productsArr.size(); i++) {
            System.out.println(productsArr.get(i));
        }
    }
    public void  maxpriceProduct(Scanner scanner) {
        System.out.println(" nhập khoảng giá product");
        int maxprice =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsArr.size(); i++) {
            if(maxprice < productsArr.get(i).getPrice()) {
                System.out.println(productsArr.get(i).getPrice());
            }
        }
    }
    public void maxProductquantity(Scanner scanner) {
        System.out.println(" nhập khoảng giá product");
        String maxquantity =scanner.nextLine();
        for (int i = 0; i < productsArr.size(); i++) {
            if(maxquantity.equals(productsArr.get(i).getQuantity()) ) {
                System.out.println(productsArr.get(i).getQuantity());
            }
        }
    }
    public void  findPriceProduct(Scanner scanner) {
        System.out.println(" nhập giá dưới   giá product");
        int priceLow = Integer.parseInt(scanner.nextLine());
        int priceUp = Integer.parseInt(scanner.nextLine());
        int maxprice =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsArr.size(); i++) {
            if(priceLow <= productsArr.get(i).getPrice() && priceUp >= productsArr.get(i).getPrice() ) {
                System.out.println(productsArr.get(i).getPrice());
            }
        }
    }
    public void searchProduct(Scanner scanner) {
        System.out.println(" nhập tên gàn đúng product");
        String nameProduct = scanner.nextLine();
        for (int i = 0; i < productsArr.size(); i++) {
            if(productsArr.get(i).getName().contains(nameProduct)) {
                System.out.println(productsArr.get(i));
            }
        }
    }
}
