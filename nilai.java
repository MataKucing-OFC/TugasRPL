public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tt,an0,a1,a2,a3,a4;
        System.out.println("Masukkan 5 angka ");
        an0 = in.nextInt();
        a1 = in.nextInt();
        a2 = in.nextInt();
        a3 = in.nextInt();
        a4 = in.nextInt();
        double hasil0;

        tt = an0+a1+a2+a3+a4;
        hasil0 = tt/5;
        if(hasil0<=60){
            System.out.println("rata rata anda = "+hasil0+" = nilai anda cukup");
        }
        else if(hasil0>60 && hasil0<70){
            System.out.println(hasil0+" = nilai anda cukup");
        }
        else if(hasil0>70 && hasil0<80){
            System.out.println(tt+" = nilai anda baik");
        }
        else if(hasil0>80){
            System.out.println(hasil0+" = 6nilai anda sangat luar biasa:)");
        }

    }

}
