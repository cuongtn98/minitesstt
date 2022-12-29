import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        categoryManager categoryManager = new categoryManager();
        Productmanager productManager = new Productmanager(categoryManager);
        menuProductManager(categoryManager, productManager, scanner);
    }
    public static void  menuProductManager(categoryManager categoryManager , Productmanager productmanager, Scanner scanner){
        do {
            System.out.println("1 tạo mới product ");
            System.out.println("2 tạo mơí category ");
            System.out.println("3 tìm sp theo id category ");
            System.out.println("4 xoá các sp cùng category ");
            System.out.println("5 hiện theo category");
            System.out.println("6. hiển thị theo product ");
            System.out.println("7. hiển thị danh sách có giá cao nhất ");
            System.out.println("8. hiển thị sản phẩm có số lượng nhiều nhất ");
            System.out.println("9. sủa thông tin sản pẩm theo id ");
            System.out.println("10. tìm kiếm sản phẩm theo khoảng giá ");
            System.out.println("11. tìm kiếm theo tên gần đúng ");
            System.out.println("12. đọc ghi sản phẩm theo khoảng giá  ");
            System.out.println("13. hiển thị drink là chai đựng ");
            System.out.println("14. hiển thị sản phẩm là candy có kg nặng lớn nhất ");
            System.out.println("15. hiển thị danh sách sản phẩm theo loại ");
            Scanner scanner1 = new Scanner(System.in);
            int choice = Integer.parseInt(scanner1.nextLine());
            switch (choice){
                case 0 :
                    System.exit(0);
                case 1:
                    productmanager.creatProduct();
                    break;
                case 2:
                    categoryManager.CreatCategory();
                    break;
                case 3:
                    categoryManager.findcategory();
                    break;
                case 4:
                    categoryManager.deleCategory();
                    break;
                case 5:
                    categoryManager.displayCategory();
                    break;
                case 6:
                    productmanager.displayProduct();
                    break;
                case 7:
                    productmanager.maxpriceProduct(scanner);
                    break;
                case 8:
                    productmanager.maxProductquantity(scanner);
                    break;
                case 9:

                    break;
                case 10:
                    productmanager.findPriceProduct( scanner);
                    break;
                case 11:
                    productmanager.searchProduct(scanner);
                    break;
                case 12:

                    break;

            }
        }while (true);
    }
}

