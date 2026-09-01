package practice_15.Z9;

public class Main {
    static void main(String[] args) {

        Document pdf = new Pdf();
        pdf.open();

        Document doc = new Doc();
        doc.open();


        Document pdf2 = new Pdf();
        Document adapter = new Adapter((Pdf) pdf2); // Изначально у меня было в параметрах просто (pdf2), но он был подчеркнут красным(( Идея исправила
        adapter.open();
    }
}
