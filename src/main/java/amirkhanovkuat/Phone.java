package amirkhanovkuat;

import java.util.List;
import java.util.Map;

public class Phone {

    int price;
    String phoneName;
    boolean isAndroidPhone;
    List<String> supportedOsVersions;
    Map<String, Contact> addressBook;

    public Phone(int price, String phoneName, boolean isAndroid) {
        this.price = price;
        this.phoneName = phoneName;
        this.isAndroidPhone = isAndroid;
    }

    public Phone() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setAndroidPhone(boolean androidPhone) {
        isAndroidPhone = androidPhone;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setSupportedOsVersions(List<String> supportedOsVersions) {
        this.supportedOsVersions = supportedOsVersions;
    }

    public void setAddressBook(Map<String, Contact> addressBook) {
        this.addressBook = addressBook;
    }
}
