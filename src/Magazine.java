import java.util.Arrays;

public class Magazine implements Printable{
    private  String magazinesName;
    private int page;

    public Magazine(String magazinesName,int page) {
        this.magazinesName = magazinesName;
        this.page=page;
    }
    public static void magazineName(Printable[] printables) {
        for (Printable print:printables) {
            if(print instanceof Magazine)
                System.out.println(print);
        }

    }

    public String getMagazinesName() {
        return magazinesName;
    }


    public void setMagazinesName(String magazinesName) {
        this.magazinesName = magazinesName;
    }

    @Override
    public void print() {
        System.out.println("print  magazines");
    }

    @Override
    public String toString() {
        return magazinesName;
    }
}
