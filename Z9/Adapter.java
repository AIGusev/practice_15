package practice_15.Z9;

public class Adapter implements Document{
    @Override
    public void open() {
        adapterPdf();
    }

    private Pdf pdf;

    public Adapter(Pdf pdf) {
        this.pdf = pdf;

    }

    void adapterPdf () {
        System.out.println("Конвектор");
    }
}
