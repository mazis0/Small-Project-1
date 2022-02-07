package Inheritance;

public class Main {
    public static void main(String[] args) {
        Ikan cupang = new Ikan();
        cupang.name = "Ikan Cupang";
        cupang.breath = "Insang";
        cupang.eat = "Cacing";
        cupang.eating();
        cupang.breathing();
        cupang.swim();

        Sapi sapi = new Sapi();
        sapi.name = "Sapi Holstein";
        sapi.breath = "Paru-Paru";
        sapi.eat = "Rumput";
        sapi.eating();
        sapi.breathing();
        sapi.walk();
    }
}
