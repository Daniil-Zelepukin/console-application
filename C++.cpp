#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    std::string name, surname, patronymic, birthdate, phone_number, email;

    cout << "Введите имя: ";
    cin >> name;
    cout << "Введите фамилию: ";
    cin >> surname;
    cout << "Введите отчество: ";
    cin >> patronymic;
    cout << "Введите дату рождения (YYYY-MM-DD): ";
    cin >> birthdate;
    cout << "Введите номер телефона: ";
    cin >> phone_number;
    cout << "Введите почту: ";
    cin >> email;

    ofstream file("user_data.txt");
    if (file.is_open()) {
        file << "Имя: " << name << "\n";
        file << "Фамилия: " << surname << "\n";
        file << "Отчество: " << patronymic << "\n";
        file << "Дата рождения: " << birthdate << "\n";
        file << "Номер телефона: " << phone_number << "\n";
        file << "Почта: " << email << "\n";
        file.close();

        cout << "Данные сохранены в файле 'user_data.txt'.\n";
    }
    else {
        cerr << "Ошибка открытия файла для записи.\n";
    }

    return 0;
}
