package oop.lesson_4_5_equals_hash_code;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Москва", "Зеленая", 150);
        Address address2 = new Address("Москва", "Зеленая", 150);;

//        address1.setNumberOfHouse(100);
//        System.out.println(address2.getNumberOfHouse());

        if (address1.equals(address2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }

        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }
}
