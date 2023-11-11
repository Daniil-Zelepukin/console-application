def main():
    name = input("Введите имя: ")
    surname = input("Введите фамилию: ")
    patronymic = input("Введите отчество: ")
    birthdate = input("Введите дату рождения (YYYY-MM-DD): ")
    phone_number = input("Введите номер телефона: ")
    email = input("Введите почту: ")

    with open("user_data.txt", "w") as file:
        file.write(f"Имя: {name}\n")
        file.write(f"Фамилия: {surname}\n")
        file.write(f"Отчество: {patronymic}\n")
        file.write(f"Дата рождения: {birthdate}\n")
        file.write(f"Номер телефона: {phone_number}\n")
        file.write(f"Почта: {email}\n")

    print("Данные сохранены в файле 'user_data.txt'.")

if __name__ == "__main__":
    main()
