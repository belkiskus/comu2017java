package Package020;

/**
 * created by cicek on 27.11.2017 14:57
 */

/*

Zaman girilsin(hour,min,sec).
Girilen zamanı 24 lük ve 12 lik formatta ekrana yazdır.

 */

public class TestMain {
    public static void main(String[] args) throws Exception {

       Time1 i1 = new Time1(); // Time1 de boş constructor gömülüdür,Nesne oluşturulabilir.

//        i1.setTime(50,50,50); // hata verir ve durur
//        i1.toString();


       System.out.println("\n" + i1.toUniversalString()); // 0,0,0

       System.out.println("\n" + i1.toString()); // 12,0,0 am
       System.out.println(i1); // 12,0,0 am  // toString() e gitti (bir üstteki ile aynı)



//        try {
//
//            i1.setTime(119 , 54 , 48);
//        }
//
//
//        catch (IllegalAccessException e){
//
//            System.out.println("\n" + e);
//
//        }

        i1.setTime(13 , 27 , 6);
        i1.toString(); // 1,27,6 p.m.

        i1.setTime(1 ,17 ,6);
        i1.toString(); // 1,27,6 a.m.

//        Time1 i1 = new Time1(11,11,11);
//        i1.toString();



    }
}
