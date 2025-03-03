import java.util.Arrays;
import java.util.Scanner;

public class productsBuy {
    public static void prodBuy(String[] products,int costs[]) {
        int counts[] = new int[products.length];
        boolean bol = true;
        while (bol) {
            System.out.println("Выберите номер товара и количество или введите end:");
            for (int i = 0; i < products.length; i++) {
                System.out.printf("%d.%s - %d руб/шт\n", i + 1, products[i], costs[i]);
            }
            Scanner sc = new Scanner(System.in);
            String[] res = sc.nextLine().split(" ");
            int sum = 0;
            if (res[0].equals("end")){
                for (int i = 0; i < products.length; i++) {
                    if (counts[i] != 0) {
                        int cost = costs[i] * counts[i];
                        sum += cost;
                        System.out.printf("%s %d шт %d руб/шт. В сумме %d руб\n", products[i], counts[i],costs[i],cost);
                    }
                }
                System.out.printf("Итого: %d рублей", sum);
                bol = false;
            } else {
                counts[Integer.parseInt(res[0])-1] = Integer.parseInt(res[1]);
            }

        }

    }
}
