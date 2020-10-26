public class Square {
    private int bok;
    private int pole;
    private int obwod;
    private double przekatna;

    Square(int bok) {
        this.bok = bok;
        this.pole = bok*bok;
        this.obwod = bok*4;
        this.przekatna = Math.sqrt(2)*bok;
    }


    public int getBok() {
        return bok;
    }

    public void setBok(int bok) {
        this.bok = bok;
    }

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    public double getPrzekatna() {
        return przekatna;
    }

    public void setPrzekatna(double przekatna) {
        this.przekatna = przekatna;
    }
}
