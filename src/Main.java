import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите количество граммов риса:");
            int rice = scanner.nextInt();
            System.out.println("Введите количество граммов моркови:");
            int carrot = scanner.nextInt();
            System.out.println("Введите количество граммов мяса:");
            int meat = scanner.nextInt();
            System.out.println("Введите количество граммов лука:");
            int onion = scanner.nextInt();

            System.out.println("Введите полный способ приготовления:");
            String recipe = scanner.next();

            // Создание и запись в файл
            BufferedWriter writer = new BufferedWriter(new FileWriter("plov_recipe.txt"));
            writer.write("Ингредиенты для плова:\n");
            writer.write("Рис: " + rice + " грамм\n");
            writer.write("Морковь: " + carrot + " грамм\n");
            writer.write("Мясо: " + meat + " грамм\n");
            writer.write("Лук: " + onion + " грамм\n");
            writer.write("\nСпособ приготовления:\n");
            writer.write(recipe);
            writer.close();

            System.out.println("Рецепт сохранен в файле plov_recipe.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}