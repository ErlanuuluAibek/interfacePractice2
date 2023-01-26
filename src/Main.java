public class Main {
    public static void main(String[] args) {

        Book book=new Book("Literatura",300);
        Book book2=new Book("Literatura3",250);
        Book.printBooks(new Printable[]{book,book2});
        Magazine magazine1=new Magazine("klass",20);
        Magazine magazine2=new Magazine("lebed",25);
        Magazine.magazineName(new Printable[]{magazine1,magazine2});
        Printable[]printables={book,book2,magazine1,magazine2};
        for (Printable print:printables) {
            print.print();
        }
    }
}