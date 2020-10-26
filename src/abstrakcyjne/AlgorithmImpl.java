package abstrakcyjne;

public class AlgorithmImpl extends Algorithm {
    @Override
    void loadData() {
        System.out.println("Wczytuje dane");
    }

    @Override
    void saveData() {
        System.out.println("Zapisuje dane");
    }
}
