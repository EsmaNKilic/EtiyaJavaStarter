public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Esma";
        String ogrenci2 = "Onur";
        String ogrenci3 = "Nisa";
        String ogrenci4 = "Merve";

        System.out.println("-----------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Esma";
        ogrenciler[1] = "Onur";
        ogrenciler[2] = "Nisa";
        ogrenciler[3] = "Merve";

        for(int i=0; i<ogrenciler.length; i++){
           System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------------------------");

        for(String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }
    }
}