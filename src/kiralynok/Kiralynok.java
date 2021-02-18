package kiralynok;

import java.io.IOException;

public class Kiralynok {
    private Tabla t;
    
    public Kiralynok(){
       t=new Tabla('#');
    }
    public static void main(String[] args) throws IOException {
     Kiralynok k=new Kiralynok();
     k.megoldasok();
       
    }
    public void megoldasok(){
    feladat4();
    feladat6();
    feladat9();
    }

    private void feladat4() {
           //4.feladat
        System.out.println("4. feladat: üres tábla megjelenítése");
        
        t.megjelenit();
    }

    private void feladat6() {
         //6.feladat
        System.out.println("6. feladat: feltöltött tábla:");
        t.elhelyez(8);
        t.megjelenit();
    }
  private void feladat9(){
   //9.feladat
        System.out.println("9. feladat:");
        System.out.println("üres oszlopok száma: " + t.uresOszlopokSzama());
        System.out.println("üres sorok száma: " + t.uresSorokSzama());
  }
    
    
}
