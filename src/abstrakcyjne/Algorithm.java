package abstrakcyjne;

public abstract class Algorithm {

    public void run() {
        loadData();
        step1();
        step2();
        step3();
        saveData();
    }

    abstract void loadData();

    private void step1() {
        System.out.println("Pierwszy krok");
    }

    private void step2() {
        System.out.println("Drugi krok");
    }

    private void step3() {
        System.out.println("Trzeci krok");
    }

    abstract void saveData();
}
