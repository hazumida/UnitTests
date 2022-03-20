import java.util.*;

public class PhoneBook {
    private Map<String, List<Contact>> phoneBook = new HashMap<>();

    public void addContactInGroup(String group, Contact contact) {
        if (phoneBook.containsKey(group)) {
            phoneBook.get(group).add(contact);
        } else {
            System.out.println("Такой группы нет, создайте ее");
        }
    }

    public void addGroup(String group) {
        phoneBook.put(group, new ArrayList<>());
    }

    public void getContacts(String group) {
        System.out.println("Производится поиск контактов по группе:");
        if (phoneBook.containsKey(group)) {
            System.out.println("В группе " + group + " следующие контакты ");
            System.out.println(phoneBook.get(group));
        } else {
            System.out.println("Контакты не найдены, такой группы не существует");
        }
    }

    public String getContactOnNumber(String number) {
        for (Map.Entry<String, List<Contact>> entry: phoneBook.entrySet()) {
            ArrayList<Contact> contacts = (ArrayList) entry.getValue();
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = (Contact ) contacts.get(i);
                if (contact.getNumber().equals(number)) {
                    return contact.getName();
                }
            }
        }
        return "Номер телефона не найден";
    }

    public void printAll() {
        for (Map.Entry<String, List<Contact>> entry: phoneBook.entrySet()) {
            System.out.println(entry);
        }
    }
}
