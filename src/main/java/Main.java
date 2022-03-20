public class Main {

    public static void main(String[] args) {
        Contact user1 = new Contact("Михаил", "+79603545444");
        Contact user2 = new Contact("Дмитрий", "880055353513");
        Contact user3 = new Contact("Мария", "8659546123478");
        Contact user4 = new Contact("Елена", "+79658421233485");
        Contact user5 = new Contact("Артем", "895471235478621");
        Contact user6 = new Contact("Екатерина", "896412375663015");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addGroup("Друзья");
        phoneBook.addGroup("Семья");
        phoneBook.addGroup("Работа");
        phoneBook.addGroup("Лучший друг");
        phoneBook.addGroup("Черный список");

        phoneBook.addContactInGroup("Друзья", user1);
        phoneBook.addContactInGroup("Семья", user1);
        phoneBook.addContactInGroup("Работа", user2);
        phoneBook.addContactInGroup("Семья", user2);
        phoneBook.addContactInGroup("Друзья", user3);
        phoneBook.addContactInGroup("Лучший друг", user3);
        phoneBook.addContactInGroup("Работа", user4);
        phoneBook.addContactInGroup("Работа", user5);
        phoneBook.addContactInGroup("Друзья", user5);
        phoneBook.addContactInGroup("Лучший друг", user5);
        phoneBook.addContactInGroup("Лучший друг", user6);

        System.out.println("Как выглядит справочник\n");
        phoneBook.printAll();
        System.out.println("----------------------------");
        phoneBook.getContacts("Друзья");
        System.out.println("----------------------------");
        System.out.println("Результат поиска " + phoneBook.getContactOnNumber("+79658421233485"));
        System.out.println("----------------------------");
        System.out.println("Результат поиска " + phoneBook.getContactOnNumber("769824"));
    }
}
