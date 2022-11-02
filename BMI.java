public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Masukkan berat : ");
      double berat = sc.nextDouble();
      System.out.print("Masukkan Tinggi: ");
      double tinggi = sc.nextDouble();
      tinggi = tinggi/100;
      double bmi = berat / (tinggi * tinggi);
      System.out.print("BMI : " + bmi + " kg/m2");
      if(bmi<18.5){
          System.out.println("Anda kurang berat badan cobalah untuk makan makanan bergizi:)");
      }
      else if(bmi>18.5 && bmi<22.9){
          System.out.println("BErat badan anda normal  ");
      }
      else if(bmi>23 && bmi<24.9){
          System.out.println("Anda kelebihan berat badan");
      }
      else if(bmi>25 && bmi<29.9){
          System.out.println("Anda obesitas tingkat 1, coabalah berolahraga:)");
      }
      else if(bmi>30){
          System.out.println("Anda obesitas tingkat 2, cobalah untuk berolahraga dan pola hidup sehat :)");}
          
   }
