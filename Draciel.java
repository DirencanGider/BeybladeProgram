public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkartıyor...");
        System.out.println(getBeybladeci() + " ın Savunması : Kale Savunması");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar); //Bunu ek olarak yazdık.

    }
}
