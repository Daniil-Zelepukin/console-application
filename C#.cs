using System;
using System.IO;

class Program
{
    static void Main()
    {
        Console.Write("Введите имя: ");
        string name = Console.ReadLine();
        Console.Write("Введите фамилию: ");
        string surname = Console.ReadLine();
        Console.Write("Введите отчество: ");
        string patronymic = Console.ReadLine();
        Console.Write("Введите дату рождения (YYYY-MM-DD): ");
        string birthdate = Console.ReadLine();
        Console.Write("Введите номер телефона: ");
        string phone_number = Console.ReadLine();
        Console.Write("Введите почту: ");
        string email = Console.ReadLine();

        try
        {
            using (StreamWriter file = new StreamWriter("user_data.txt", false))
            {
                file.WriteLine("Имя: " + name);
                file.WriteLine("Фамилия: " + surname);
                file.WriteLine("Отчество: " + patronymic);
                file.WriteLine("Дата рождения: " + birthdate);
                file.WriteLine("Номер телефона: " + phone_number);
                file.WriteLine("Почта: " + email);
            }
            Console.WriteLine("Данные сохранены в файле 'user_data.txt'.");
        }
        catch (IOException e)
        {
            Console.WriteLine("Ошибка записи в файл: " + e.Message);
        }
    }
}
