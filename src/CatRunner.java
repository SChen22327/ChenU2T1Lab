public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cercil", 3, 9);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Alwin",7,12);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
