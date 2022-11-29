import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {

        List<String> menu = new ArrayList<>(Arrays.asList( "trilece", "havucDilim", "guvec", "kokorec","küşleme","arabAşi","waffle","künefe", "guvec" ));


        xIcerenVarMi(menu);

        krkSayisiEnBykEleman(menu);

    }

    // *********************** anyMatch() *** allMatch() **** noneMatch() ************************

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void xIcerenVarMi(List<String> menu){
        System.out.println(menu.
                stream().
                anyMatch(t-> t.contains("x")) ? "x iceriyor" :
                "x iceren yok");
    }


    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void krkSayisiEnBykEleman(List<String> menu){
        Stream<String> str = menu.
                stream().
                sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                limit(1);  // limit methodu kullanilarak ilk eleman cagrildi...
        System.out.println(Arrays.toString(str.toArray()));

        //2.yol
        menu.
                stream().
                sorted(Comparator.comparing(t-> t.toString().length()).reversed()).
                limit(1).forEach(System.out::print);
    }





}
