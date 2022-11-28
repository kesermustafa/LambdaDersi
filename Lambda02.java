import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {


    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,8,15));

        ciftBul(sayi);
        System.out.println("\n-------------");
        toplama(sayi);
        System.out.println("\n-------------");
        System.out.println(carpim(sayi));
        System.out.println(carpim(sayi) + 25800);
        sortedDouble(sayi);


    }

    // Task-1 : Functional Programming ile listin cift elemanlarinin  karelerini
    // ayni satirda aralarina bosluk bırakarak print ediniz

    public static void yazdir(int w){
        System.out.print(w + ", ");
    }

    public static void yazdir(double w){
        System.out.print(w + ", ");
    }

    public static boolean ciftSayi(int w){
        return w%2==0;
    }

    public static void ciftBul(List<Integer> sayi ){
        sayi.
                stream().
                filter(w-> w%2==0).
                map(w-> w*w).
                forEach(Lambda02::yazdir);

        System.out.println("\n-------------");

        sayi.
                stream().
                filter(Lambda02::ciftSayi).
                map(w-> w*w).
                map(Math::sqrt).
                forEach(Lambda02::yazdir);
    }

    // Task-: List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...

    public static void toplama (List<Integer> sayi){
       int toplam =
               sayi.
                       stream().
                       reduce(0, Integer::sum);
        System.out.print("Toplam : " + toplam);
    }

    // Task-7 : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static double carpim (List<Integer> sayi){

       double resault = sayi.
                stream().
                filter(Lambda02::ciftSayi).reduce(1, Math::multiplyExact);
        return resault;

    }

    // Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void sortedDouble(List<Integer> sayi){
        sayi.
                stream().
                filter(Lambda02::ciftSayi).
                map(w-> w*w).
                sorted().
                forEach(Lambda02::yazdir);
    }





}
