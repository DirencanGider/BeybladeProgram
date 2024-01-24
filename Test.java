import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Polymorphism kullanarak Beyblade programı yapacağız.

        System.out.println("Beyblade Programına Hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basınız...");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz ? (Dragon, Draciel ,Drayga, Dranza)");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {

                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (beyblade == null) {

                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz...");
                }
                else {
                    beyblade.bilgileriGoster(); //Subclasslarda override edilmiş metod.
                    beyblade.saldir(); // Super class olan Beyblade class'ındaki method. Diğer classlarda override edilmedi.
                    beyblade.kutsalCanavarOrtayaCikar(); //Subclasslarda override edilmiş metod.
                }
            }


        }


    }
}
