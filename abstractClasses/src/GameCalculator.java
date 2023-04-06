public abstract class GameCalculator {
    public abstract void hesapla(); //abstract yazmamızın sebebi kullanıcı bunu kendi kuralları ile kendi classına override etsin. ZORUNLU kılar.
    public final void gameOver(){
        System.out.println("Oyun Bitti.");
    } //final derse değiştirilemez.
}
