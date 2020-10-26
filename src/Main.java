public class Main {
    public static void main(String[] args) {
        /*int a;
        int zmienna;

        a = 5;

        int b = 10;

        String zmiennaString = "String";

        Integer zmienna2 = 5;

        Object object = new Object();

        System.out.println(a);
        System.out.println(object);

        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = "ABC";

        String s4 = new String("ABC");

        System.out.println(s1.equals(s4));

        //https://web.microsoftstream.com/video/8a1c908d-1afa-4e9d-91fe-ce7059631973

       //
        int z1 = 4;
        int z2 = 4;
        System.out.println(z1 == z2);

        z1++;
        ++z1;

        int[][] tab = new int[10][10];

        String[] names = new String[100];
        String[] surnames = new String[100];
        int[] age = new int[100];

        Client[] clients = new Client[100];

        int zmiennaPrzechowujacaJakiasLiczbe = 5;

        Client c = new Client("Mateusz", "Bereda", 30);

        System.out.println(c.age);
        System.out.println(c.name);
        System.out.println(c.surname);

        Square square = new Square(5);
        Square square2 = new Square(6);

        square.setBok(10);
        System.out.println(square.getBok());
        System.out.println(square.getPole());
        //System.out.println(square.obwod);
        //System.out.println(square.przekatna);

        Pies pies = new Pies();
        pies.idz();
        pies.szczekaj();

        Kot kot = new Kot();
        kot.idz();
        kot.miaucz();*/


        Pet p = new Kot();

        p.idz();

        Kot k = (Kot) p;

        k.miaucz();

        k.name = "Janusz";

        System.out.println(p.name);

        changeCat(k);

        System.out.println(k.name);
    }

    public static void changeCat(Kot kot) {
        kot.name = "Slawek";
    }
}
