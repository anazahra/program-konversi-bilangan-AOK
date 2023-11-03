import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);

        String biner;
        String hexa;
        int desimal;
        int pilihan;
        do{
            System.out.println("=====================================");
            System.out.println("Konversikan bilangan di bawah ini!");
            System.out.println("1. Biner ke desimal");
            System.out.println("2. Desimal ke biner");
            System.out.println("3. Biner ke hexa");
            System.out.println("4. Hexa ke biner");
            System.out.println("5. Desimal ke hexa");
            System.out.println("6. Hexa ke desimal");
            System.out.print("Pilihan Anda? ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    biner = input.next();
                    desimal = Integer.parseInt(biner, 2);
                    System.out.println("Bilangan desimal: "+desimal);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimal = input.nextInt();
                    biner = Integer.toBinaryString(desimal);
                    System.out.println("Bilangan biner: "+biner);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    biner = input.next();
                    int ubah = Integer.parseInt(biner, 2);
                    hexa = Integer.toHexString(ubah).toUpperCase();
                    System.out.println("Bilangan hexa: "+hexa);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan hexa: ");
                    hexa = input.next();
                    int ubah1 = Integer.parseInt(hexa, 16);
                    biner = Integer.toBinaryString(ubah1);
                    System.out.println("Bilangan biner: "+biner);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimal = input.nextInt();
                    hexa = Integer.toHexString(desimal).toUpperCase();
                    System.out.println("Bilangan hexa: "+hexa);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan hexa: ");
                    hexa = input.next();
                    desimal = Integer.parseInt(hexa, 16);
                    System.out.println("Bilangan desimal: "+desimal);
                    break;
                default:
                    System.out.println("Tidak ada di pilihan");
                    break;
            }
        }while (pilihan!=0);
    }
}
