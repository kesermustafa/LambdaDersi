public class Util {

    public static void yazInt(int a){
        System.out.println(a + " ");
    }

    public static void yazString(String str){
        System.out.println(str + " ");
    }

    public static void yazDouble(double d){
        System.out.println(d + " ");
    }

    public static boolean ciftBul(int i){
        return i%2==0;
    }

    public static boolean tekBul(int i){
        return i%2!=0;
    }

    public static int kucukSayiReturn(int a, int b){
        return a<b ? a : b;
    }

    public static int buyukSayiReturn(int a, int b){
        return a>b ? a : b;
    }

    public static void yazdir100eKadar(int a){
        if(a<101){
            System.out.print(a + " ");
            yazdir100eKadar(a+1);
        }
    }







}
