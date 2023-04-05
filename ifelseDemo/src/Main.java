//sayılar arasındaki en büyük değeri bulma
public class Main {
    public static void main(String[] args) {
        int sayi1 = 18;
        int sayi2 = 23;
        int sayi3 = 3;
        int buyukSayi = sayi3;

        if(buyukSayi < sayi1 ){
            buyukSayi = sayi1;
        }

        if(buyukSayi < sayi2){
            buyukSayi = sayi2;
        }

        System.out.println("En büyük sayı = " + buyukSayi);
    }
}






