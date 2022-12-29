import java.util.ArrayList;
import java.util.Scanner;

public class categoryManager {
    private ArrayList<category> categories;


    public categoryManager() {
        this.categories= new ArrayList<>();
    }

    public category CreatCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập id ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập category ");
        String name = scanner.nextLine();
        return new category(id, name);
    }

    public void displayCategory() {
        if (!categories.isEmpty()) {
            for (int i = 0; i < categories.size(); i++) {
                System.out.println(categories.get(i));
            }
        } else {
            System.out.println(" không có category");
        }
    }
    public void addCategory() {
        categories.add(CreatCategory());
        displayCategory();
    }
    public void deleCategory() {
        Scanner scanner = new Scanner(System.in);
        int indexDelete = Integer.parseInt(scanner.nextLine());
        if (indexDelete != -1) {
           categories.remove(indexDelete);
            displayCategory();
        }
    }
    public void findcategory() {
        Scanner scanner = new Scanner(System.in);
        int categoryNumb =Integer.parseInt( scanner.nextLine());
        for (int i = 0; i <categories.size() ; i++) {
            if (categoryNumb==categories.get(i).getId()) {

            }
        }
    }
    public category getCategoryById(int id) {
        return categories.get(id);
    }
}
