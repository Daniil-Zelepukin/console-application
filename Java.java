import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            System.out.print("Введите фамилию: ");
            String surname = scanner.nextLine();
            System.out.print("Введите отчество: ");
            String patronymic = scanner.nextLine();
            System.out.print("Введите дату рождения (YYYY-MM-DD): ");
            String birthdate = scanner.nextLine();
            System.out.print("Введите номер телефона: ");
            String phone_number = scanner.nextLine();
            System.out.print("Введите почту: ");
            String email = scanner.nextLine();

            try {
                FileWriter fileWriter = new FileWriter("user_data.txt", false);
                PrintWriter printWriter = new PrintWriter(fileWriter);

                printWriter.println("Имя: " + name);
                printWriter.println("Фамилия: " + surname);
                printWriter.println("Отчество: " + patronymic);
                printWriter.println("Дата рождения: " + birthdate);
                printWriter.println("Номер телефона: " + phone_number);
                printWriter.println("Почта: " + email);
                
                printWriter.close();
                System.out.println("Данные сохранены в файле 'user_data.txt'.");
            } catch (IOException e) {
                System.err.println("Ошибка записи в файл: " + e.getMessage());
            }
        }
    }
}

