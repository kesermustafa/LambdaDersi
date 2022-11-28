import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        hepsiniYaz(list);
        System.out.println("\n----------------");
        negatifYaz(list);
        System.out.println("\n----------------");
        pozitifYaz(list);
        System.out.println("\n----------------");
        pozVeCift(list);
        System.out.println("\n----------------");
        kareYazdir(list);
        System.out.println("\n----------------");
        ciftKupYazdir(list);
        System.out.println("\n----------------");
        kareTekrarsiz(list);
        System.out.println("\n----------------");
        sirala(list);
        System.out.println("\n----------------");
        sirala1(list);
        System.out.println("\n----------------");
        System.out.println(pozKup5List(list));
        System.out.println("\n----------------");
        pozKup5List1(list);
        pozKup5List2(list);
        System.out.println(topla(list));

        System.out.println("elToplamReference(list) = " + elToplamReference(list));
        System.out.println("elToplamReferenceInt(list) = " + elToplamReferenceInt(list));

        pozitifTopla(list);
                
    }


    // S1:listi aralarinda bosluk birakarak yazdiriniz

    public static void hepsiniYaz(List<Integer> list){
        list.stream().forEach(l-> System.out.print(l+" "));
    }

    public static void yazdir(int a){
        System.out.print(a + " ");
    }

        //Sadece negatiff yazdir.
    public static void negatifYaz(List<Integer> list){
        list.stream().filter(l -> l<0).forEach(l-> System.out.print(l+" "));
    }

    //S3: pozitif olanlardan yeni bir liste olustur
    public static void pozitifYaz(List<Integer> list){
        list.stream().filter(l -> l>0).forEach(l-> System.out.print(l+" "));
    }

    //S4:pozitif ve çift olanları yazdırın
    public static void pozVeCift(List<Integer>l){
        l.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t+" "));
    }

    // List in elemanlarinin karelerini ayni satirda bir bosluk birakarak yazdir..
    public static void kareYazdir(List<Integer>l){
        l.stream().map(t-> t*t).forEach(t -> System.out.print(t+" "));
    }

    public static void ciftKupYazdir(List<Integer>list){
        list.stream().filter(t-> t%2==0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
    }

    // distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
    // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
    // Sıralı akışlar için, farklı elemanın seçimi sabittir
    // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
    // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    //S8 : list in elemanlarin karelerinden tekrarsiz yazdıralım
    public static void kareTekrarsiz(List<Integer>list){
        list.stream().map(t-> t*t).distinct().forEach(t -> System.out.print(t+" "));
    }

    //S9: listin elemanlarini kucukten buyuge siralayalim
    public static void sirala(List<Integer>list){
        list.stream().sorted().forEach(t -> System.out.print(t+" "));
    }

    //S10: listin elemanlarini buyukten kucuge siralayalim
    public static void sirala1(List<Integer>list){
        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t+" "));
    }

    // S11: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    public static List<Integer> pozKup5List(List<Integer>list){
        return list.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
    }

    public static void pozKup5List1(List<Integer>list){
       List<Integer> l = list.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).collect(Collectors.toList());
        System.out.println(l);
    }

    //S12: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim

    public static void pozKup5List2(List<Integer>list){
        List<Integer> l = list.stream().filter(t -> t > 0).map(t -> t * t).filter(t -> t % 10 != 5).collect(Collectors.toList());
        System.out.println(l);
    }

    //// S13 :list elemanlarini toplamini bulalim

    public static int topla(List<Integer>list){
        int topla = list.stream().reduce(0, (x,y)->x+y);
            return topla;
    }

    public static int elToplamReference(List<Integer>l){
        int i=l.stream().reduce(0,Math::addExact);
        return i;
    }

    public static int elToplamReferenceInt(List<Integer>l){
        int i=l.stream().reduce(0,Integer::sum);
        return i;
    }

        //S14 : Listin pozitif elemanları toplamını bulalım

        public static void pozitifTopla(List<Integer> list){
            System.out.println("Pozitif topla " + list.stream().filter(l -> l > 0).reduce(0, Integer::sum));
        }



}
