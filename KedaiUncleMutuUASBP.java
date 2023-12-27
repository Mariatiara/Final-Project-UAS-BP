/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kedai.uncle.mutu.uas.bp;
/**
 *
 * @author TIARA
 */
import java.util.*;
import java.text.*;
public class KedaiUncleMutuUASBP {
        public static void main(String[] args) {

        Scanner read = new Scanner (System.in);
        double x=0, afterdisc = 0, disc = 0, sumdisc;
        DecimalFormat rupiah = new DecimalFormat("Rp###,###,###");

        String[] batas = {"---------------------------------------------","=================================="};


        System.out.print("Masukkan Nama Staff : ");
        String nama = read.nextLine();
        System.out.print("Masukan Jumlah barang :");
        int jumlah = Integer.parseInt(read.nextLine());
        System.out.println(batas[0]);


        String queue[] = new String[5];
        double price[] = new double[5];
        double sum[] = new double[5];
        double total[] = new double[5];

        String totals[] = new String[5];
        String priceS[] = new String[5];
        String sumS[] = new String[5];



        for (int i = 0; i < jumlah ; i++) 
        {

            System.out.print("Masukkan Nama Barang     : ");
                queue[i] = read.nextLine();
            System.out.print("Masukkan Harga Barang    : ");
                price[i] = read.nextDouble();
            System.out.print("Masukkan Jumlah Barang   : ");
                sum[i] = read.nextDouble();
                read.nextLine();
            System.out.println(batas[0]);

            double a = price[i] * sum[i];
                x += a;
                total[i] = price[i] * sum[i];
        }

            if (x > 500000)
            {
                afterdisc = (double) x / 100*80;
                double disc20 =20;
                disc = disc20;
            }
            else if (x > 100000)
            {
                afterdisc = (double) x / 100*90;
                double disc10 =10;
                disc = disc10;
            }
            else if (x > 50000)
            {
                afterdisc = (double) x / 100*95;
                double disc5 = 5;
                disc = disc5;
            }
            else if (x <= 50000)
            {
                afterdisc = x;
                double disc0 = 0;
                disc = disc0;
            }
            sumdisc =  x / 100 * disc;
            String finalprice = rupiah.format(afterdisc);
            String sumdiscstr = rupiah.format(sumdisc);
            String finalpaid = rupiah.format(x);


                System.out.println("Jumlah Tagihan Customer Anda");
                System.out.println("= " + finalprice);
                System.out.println("Dibayar dengan Berapa Rupiah?");
                System.out.print("= Rp ");
                double bayar = read.nextFloat();
                System.out.println("\n");
                double change = bayar - afterdisc;
                String sumpaid = rupiah.format(bayar);
                String sumchange = rupiah.format(change);

                System.out.println("\tKEDAI UNCLE MUTU");
                System.out.println("\tJL KENANGAN SURABAYA");
                System.out.println("\tTELP. 1555 4566");
                System.out.println(batas[1]);
                System.out.println("Order ID       :FM001");
                System.out.print("Collected by   :");
                System.out.println(nama);
                System.out.println(batas[1]);

                    for (int k = 0; k < jumlah ; k++) 
                    {
                        System.out.println(queue[k]);
                        System.out.println(sum[k]+ " * " + price[k] + " = " + total[k]);
                    }

                        System.out.println(batas[1]);
                        System.out.print("Subtotal");
                        System.out.println(finalpaid);
                        System.out.println("Diskon");
                        System.out.println((int) disc + "%") ;
                        System.out.println(sumdiscstr);
                        System.out.println(batas[1]);
                        System.out.print("Total");
                        System.out.println(finalprice);
                        System.out.print("Bayar");
                        System.out.println( sumpaid);
                        System.out.println(batas[1]);
                        System.out.print("Kembali");
                        System.out.println('='+sumchange);
                        System.out.println(batas[1]);
                        System.out.println(" Terima Kasih Telah Berbelanja di ");
                        System.out.println("\tKEDAI UNCLE MUTU");

    }

}
   

