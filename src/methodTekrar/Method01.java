package methodTekrar;

public class Method01 {



    public static void main(String[] args) {

        topMeth(30,59);
        System.out.println(topMeth(14,53));
        System.out.println(ilkMethodum());
        int harfalim=topMeth(32,45);
        System.out.println(harfalim);



    }

    public static int topMeth(int sayi1, int sayi2) {
        System.out.println("method calisti");
        return sayi1 + sayi2;

    }
        //istersem public i private veya protected de yapabilirim.

        //return type int girmişim. istersem void girerim ama bu sefer return girmeme gerek kalmaz.
        public static int ilkMethodum(){

            System.out.println("o neydi gız");
            return 303030;
        }

        public void ikinciMethodum(){}
        //void yazdığım için hata vermedi

}
