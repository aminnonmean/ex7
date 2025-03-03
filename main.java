

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        String[] products;
        int[] costs;
        System.out.println("Выберите номер функции:\n 1.Создать новый магазин\n 2.Завершить программу");
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("Введите количество продуктов");
                int a = scanner.nextInt();
                scanner.nextLine();
                products = new String[a];
                costs = new int[a];
                for (int i = 0; i < a; i++){
                    System.out.println(i);
                    System.out.print("Введите через пробел товар и цену на него:");
                    String input = scanner.nextLine();
                    String[] prod = input.split(" ");
                    products[i] = prod[0];
                    costs[i] = Integer.parseInt(prod[1]);
                }
                productsBuy.prodBuy(products, costs);


                break;
            case 2:
                System.out.println("Программа завершена");
                break;
            default:
                break;
        }
    }
}
