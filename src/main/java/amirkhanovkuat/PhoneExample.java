package amirkhanovkuat;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PhoneExample {

    public static void main(String[] args) {
        Phone samsung = new Phone(900, "Samsung", true);
        samsung.setSupportedOsVersions(List.of("12", "13"));

        Phone iPhone = new Phone(1500, "IPhone", false);
        iPhone.setSupportedOsVersions(List.of("14", "15","16"));

        iPhone.setAddressBook(Map.of(
                "Дима", new Contact("8-705-555-55-55"),
                "Вася", new Contact("8-701-111-11-11")
        ));

        Set<String> keySet = iPhone.addressBook.keySet();
        Collection<Contact> values = iPhone.addressBook.values();
        Set<Map.Entry<String, Contact>> entries = iPhone.addressBook.entrySet();

        for (Map.Entry<String, Contact> entry : entries) {
            if (entry.getKey().equals("Дима")) {

                System.out.println("Димин контакт " + entry.getValue().toString());
            }

        }

        Phone sony = new Phone();
        sony.setPrice(1000);
        sony.setPhoneName("Sony Xperia");
        sony.setAndroidPhone(true);

        System.out.println("Os versions: " + iPhone.supportedOsVersions.size());

        // Цикл с индексом
        System.out.println("Цикл с индексом");

        for (int i = 0; i < iPhone.supportedOsVersions.size(); i++) {
            System.out.println("Version: " + iPhone.supportedOsVersions.get(i));
        }

        // Цикл for each без индекса
        System.out.println("Цикл for each без индекса");

        for (String osVersion : samsung.supportedOsVersions) {
            System.out.println("Version: " + osVersion);
        }

        // Цикл while
        System.out.println("Цикл while");

        int arrIndex = 0;

        while (arrIndex < iPhone.supportedOsVersions.size()) {
            System.out.println("Version " + iPhone.supportedOsVersions.get(arrIndex));

            arrIndex++;
        }

        // Цикл do while необхоимо когда нужно сделать хотябы одну операцию
        System.out.println("Цикл do while");

        do {
            System.out.println("qqq");
        } while (false);
    }
}
