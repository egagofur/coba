import java.util.Scanner;

public class ujian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String member="", namaBarang="", kodeBarang, ket;
        double harga=0, diskon, total=0, qty;

        System.out.println("Punya kartu member?");
        member = input.nextLine();
        if (member.equalsIgnoreCase("ya")){
            System.out.println("masukan nomer hp");
            String noHp = input.nextLine();
            System.out.println("No member " + noHp);
            System.out.println("Status anda member");
            System.out.println("masukan kode barang: ");
            kodeBarang = input.nextLine();
            // nested
            if(kodeBarang.equals("0011")){
                kodeBarang = "0011";
                namaBarang = "Kopi";
                harga = 30000;
            }else if(kodeBarang.equals("0012")){
                kodeBarang = "0012";
                namaBarang = "sabun";
                harga = 40000;
            }else if(kodeBarang.equals("0013")){
                kodeBarang = "0012";
                namaBarang = "ciki";
                harga = 15000;
            }else{
                System.out.println("tidak ada pilihan");
            }
            // rumus
            System.out.println("jumlah barang: ");
            qty = input.nextInt();
            total = harga * qty;
           if(total >= 50000){
                diskon=total-(total*0.1);
                ket="dapat diskon 10%";
           }else{
            diskon=total;
            ket="suwun";
           }
            //    nota
           System.out.println("nama barang: " + namaBarang + "\t\t jumlah " + qty + "\t harga: " + harga);
           System.out.println("Total harga: " + diskon);
           System.out.println(ket);
        }else if (member.equalsIgnoreCase("tidak")){
            System.out.println("Status anda bukan member");
            System.out.println("masukan kode barang: ");
            kodeBarang = input.nextLine();
            // nested
            if(kodeBarang.equals("0011")){
                kodeBarang = "0011";
                namaBarang = "Kopi";
                harga = 30000;
            }else if(kodeBarang.equals("0012")){
                kodeBarang = "0012";
                namaBarang = "sabun";
                harga = 40000;
            }else if(kodeBarang.equals("0013")){
                kodeBarang = "0012";
                namaBarang = "ciki";
                harga = 15000;
            }else{
                System.out.println("tidak ada pilihan");
            }
            // rumus
            System.out.println("jumlah barang: ");
            qty = input.nextInt();
            total = harga * qty;
           if(total >= 50000){
                diskon=total-(total*0.05);
                ket="dapat diskon 5%";
           }else{
            diskon=total;
            ket="suwun";
           }
            //    nota
           System.out.println("nama barang: " + namaBarang + "\t\t jumlah " + qty + "\t harga: " + harga);
           System.out.println("Total harga: " + diskon);
           System.out.println(ket);
    }else{
        System.out.println("ra tuku rame ae cok");
    }
}
}