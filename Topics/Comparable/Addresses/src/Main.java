// You can experiment here, it won’t be checked

import java.util.*;

class Address implements Comparable<Address> {
  private final String city;
  private final String street;
  private final String house;

  public Address(String city, String street, String house) {
    this.city = city;
    this.street = street;
    this.house = house;
  }

  @Override
  public String toString() {
    return "%s, %s, %s".formatted(house, street, city);
  }

  @Override
  public int compareTo(Address otherAddress) {
//    int houseAddress = this.house.compareTo(otherAddress.house);
//    int streetAddress = this.street.compareTo(otherAddress.street);
//    int cityAddress = this.city.compareTo(otherAddress.city);
//
//    if (houseAddress == 0) {
//      if (streetAddress == 0) {
//        return cityAddress;
//      } else {
//        return streetAddress;
//      }
//    } else {
//      return houseAddress;
//    }
    return this.toString().compareTo(otherAddress.toString());
  }
}

// do not change the code below
class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Address> list = new ArrayList<>();

    while (sc.hasNextLine()) {
      String[] arguments = sc.nextLine().split(",");
      list.add(new Address(arguments[0], arguments[1], arguments[2]));
    }
    Collections.sort(list);
    Checker.check(list);
  }
}
