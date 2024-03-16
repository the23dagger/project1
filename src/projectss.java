

/*import java.util.Scanner;

public class projectss {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayı Giriniz : ");
        int sayi1=inp.nextInt();
        for(int i=0;i<=sayi1;i++){
            if (i%2 ==0){
                System.out.println(i);

            }
        }

    }
}*/
//3 e ve 4 e bölünenlerin ortu
/*import java.util.Scanner;
public class projectss {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi=inp.nextInt();
        int toplam=0,s2=0,ort;
        for (int i =1;i<=sayi;i++){
            if((i%3==0)&&(i%4==0)){
                System.out.println(i);
                s2++;
                toplam+=i;

            }
        }
        ort=toplam/s2;
        System.out.println(toplam);
        System.out.println(ort);
    }
}*/
//Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
/*import java.util.Scanner;
public class projectss {
    public static void main(String[] args) {
        Scanner inp=new Scanner (System.in);
        boolean kosul1=false;
        int toplam=0;
        while(kosul1 != true){
            System.out.println("bir sayı giriniz : ");
            int sayi=inp.nextInt();
            if (sayi%2==1){
                toplam+=sayi;
            } else if (sayi<0) {
                kosul1=true;

            }
        }
        System.out.println(toplam);
    }
}*/
//Java döngüler ile tek bir sayı girilene
// kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün
// katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
/*import java.util.Scanner;
public class projectss {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        boolean kosul1=false;
        int toplam=0;
        while(kosul1 != true){
            System.out.print("Bir sayı giriniz :  ");
            int sayi= inp.nextInt();
            if((sayi%2==0)&&(sayi%4==0)){
                System.out.println(sayi);
                toplam +=sayi;
            } else if (sayi%2==1) {
                kosul1 =true;

            }
        }
        System.out.println(toplam);
    }
}*/
//Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
/*import java.util.Scanner;
public class projectss {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayı Giriniz : ");
        int sayi =inp.nextInt();
        for (int i=1;i<=sayi;i*=2){
            System.out.println(i);
        }
    }
}*/
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
/*import java.util.Scanner;
public class projectss {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int sayi =inp.nextInt();
        for (int i=1;i<=sayi;i*=4){
            System.out.println("dördün katları : "+i);
        }
        for (int i2=1;i2<=sayi;i2*=5){
            System.out.println("beşin katları : "+i2);
        }
    }

}*/
//Java ile faktöriyel hesaplayan program yazıyoruz.
/*import java.util.Scanner;
public class projectss {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int sayi=inp.nextInt();
        int fak=1;
        for (int i=1;i<=sayi;i++){
            fak*=i;
        }
        System.out.println(fak);
    }
}*/
//N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
// N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
//Java ile kombinasyon hesaplayan program yazınız.
/*import java.util.Scanner;
public class projectss {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir n sayısı giriniz : ");
        int n= inp.nextInt();
        System.out.println("bir r kombinasyon sayısı gririniz : ");
        int r= inp.nextInt();
        int fak1=1,fak2=1,fak3=1;
        double kombinasyon;
        if (n>r){
            for (int i=1;i<=n;i++){
                fak1*=i;
            }
            for (int i2=1;i2<=r;i2++){
                fak2*=i2;
            }
            for (int i3=1;i3<=(n-r);i3++){
                fak3*=i3;
            }
            kombinasyon=fak1/(fak2*fak3);
            System.out.println(kombinasyon);
        }else {
            System.out.println("n sayısı r den büyük olmalıdır");
        }
    }
}*/
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz. for ile!!!!
/*import java.util.Scanner;
public class projectss {
    public static void main(String[] args) {
        Scanner inp= new Scanner (System.in);
        int alt,us,total=1;
        System.out.println("bir alt sayı giriniz : ");
        alt=inp.nextInt();
        System.out.println("bir üs sayı giriniz : ");
        us=inp.nextInt();
        for(int i=1;i<=us;i++){
            total*=alt;
        }
        System.out.println(total);
    }
}*/
// METOTLARRRRRRR
/*import java.util.Scanner;
public class projectss {
    static int power(int base,int exp){
        int result=1;
        for (int i=1;i<=exp;i++){
            result*=base;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        for (int s1=1;s1<=4;s1++){
            System.out.println("üssü alıınacak sayı griniz : ");
            int alt = inp.nextInt();
            System.out.println("Bir üs giriniz : ");
            int us= inp.nextInt();
            System.out.println(power(alt,us));
        }


    }
}*/
//void kullanımı
/*public class projectss {
    static void sum(int a,int b){
        int result =a+b;
        System.out.println(result);
    }
    public static void main(String[] args) {
        sum(5,2);
        sum(6,4);
    }
}*/
// metotlarda aşırı yüklenme OverLoading
/*public class projectss {
    static void print(){
        System.out.println("parametresiz methot !!");
    }
    static void print(int a){
        System.out.println("parametreler : "+a);
    }
    static void print(int a,int b){
        int toplam =a+b;
        System.out.println("parametreler : "+toplam);
    }
    public static void main(String[] args) {
        print();
        print(1);
        print(1,1);

    }
}*/
//f(n )= f(n-1) +n fonksiyonunun 10. değeri
/*public class projectss {
    public static void main(String[] args) {
        int sonuc = toplam(10);
        System.out.println(sonuc );
    }
    public static int toplam(int k) {
        if (k > 0) {
            return k + toplam(k - 1);
        } else {
            return 0;
        }
    }
}*/
// palindroom sayılarrrr metotlarddaaaaaq
/*import java.util.Scanner;
public class projectss {
    static boolean isPalindrom(int sayi){
        int sayi2=sayi,reverseNumber=0,kalan;
        while (sayi2 !=0){
            kalan=sayi2%10;
            reverseNumber =(reverseNumber*10)+kalan;
            sayi2/=10;
        }
        if (sayi ==reverseNumber){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        for (int i=1;i<=10;i++) {
            System.out.println("bir sayı Giriniz : ");
            int n = inp.nextInt();
            System.out.println(isPalindrom(n));
        }
    }
}*/
 //recursive metotlar ile fibonacci serisi bulan program yapıyoruz. f(n)= f(n-1)+f(n-2)
/*public class projectss {
    static int fib(int f){
        if (f ==1 || f==2){
            return 1;
        }
        else {
            return fib(f-1)+fib(f-2);
        }
    }
    public static void main(String[] args) {

        System.out.println(fib(5));
    }
}*/
/*import java.util.Scanner;

public class projectss {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}*/
//Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.
//
//Hesap makinesinin fonksiyonları :
//
//1- Toplama İşlemi
//2- Çıkarma İşlemi
//3- Çarpma İşlemi
//4- Bölme işlemi
//5- Üslü Sayı Hesaplama
//6- Faktoriyel Hesaplama
//7- Mod Alma
//8- Dikdörtgen Alan ve Çevre Hesabı
//0- çıkış yap
/*import java.util.Scanner;
public class projectss {
    static int plus(int a,int b){
        int result =a+b;
        System.out.println("Toplam : "+result);
        return result;
    }
    static int minus(int a,int b){
        int result =a-b;
        System.out.println("Çıkarma "+result);
        return result;
    }
    static int division(int a,int b){
        int result= a/b;
        System.out.println("Bölüm : "+result);
        return result;
    }
    static int exponential(int a,int b){
        int result=1;
        for (int i=1;i<b;i++){
            result*=a;
        }
        System.out.println("Üs alma Sonucu : "+result);
        return result;
    }
    static int fact(int a){
        int result=1;
        for (int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println("Sonuç : "+result);
        return result;
    }
    static int multiplication(int a,int b){
        int result =a*b;
        System.out.println("Çarpım : "+result);
        return result;
    }
    static int mod(int a, int b){
        int result= a%b;
        System.out.println("Mod alma Sonucu : "+result);
        return result;
    }
    static void alanCevre(int a,int b){
        Scanner inp=new Scanner(System.in);

        int select,result,resul2;
        System.out.println("1- alan hesaplama\n"+"2- çevre hesaplma\n"+"3- çıkış yap");
        System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
        select = inp.nextInt();
        switch (select){
            case 1:
                result =a*b;
                System.out.println("Sonuç "+result);
                break;
            case 2:
                resul2 =a*2 +b*2;
                System.out.println("Sonuç "+resul2);
                break;
            case 3:
                break;


        }

    }


    public static void main(String[] args) {
        int a,b,select;
        Scanner inp=new Scanner(System.in);
        while (true) {

            System.out.println("1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3-  bölme İşlemi\n" +
                    "4- üslü sayı hesaplama işlemi\n" +
                    "5- faktöriyel Hesaplama\n" +
                    "6- çarpma Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                    "0- çıkış yap");
            System.out.print("Yapmak istedeğiniz işlemi seçin : ");
            select= inp.nextInt();
            if (select ==0){
                break;
            }



            switch (select){
                case 1:
                    System.out.print("ilk sayıyı Giriniz : ");
                    a = inp.nextInt();
                    System.out.print("ikinci Sayıyı Giriniz : ");
                    b= inp.nextInt();
                    plus(a,b);
                    break;
                case 2:
                    System.out.print("ilk sayıyı Giriniz : ");
                    a = inp.nextInt();
                    System.out.print("ikinci Sayıyı Giriniz : ");
                    b= inp.nextInt();
                    minus(a,b);
                    break;
                case 3:
                    System.out.print("ilk sayıyı Giriniz : ");
                    a = inp.nextInt();
                    System.out.print("ikinci Sayıyı Giriniz : ");
                    b= inp.nextInt();
                    division(a,b);
                    break;
                case 4:
                    System.out.print("alt sayıyı Giriniz : ");
                    a = inp.nextInt();
                    System.out.print("üst Sayıyı Giriniz : ");
                    b= inp.nextInt();
                        exponential(a,b);
                     break;
                case 5:
                    System.out.print("faktöriyeli alınacak  sayıyı Giriniz : ");
                    a = inp.nextInt();
                    fact(a);
                    break;
                case 6 :
                    System.out.print("ilk sayıyı Giriniz : ");
                    a = inp.nextInt();
                    System.out.print("ikinci Sayıyı Giriniz : ");
                    b= inp.nextInt();
                    multiplication(a,b);
                    break;
                case 7:
                    System.out.print("ilk sayıyı Giriniz : ");
                    a = inp.nextInt();
                    System.out.print("ikinci Sayıyı Giriniz : ");
                    b= inp.nextInt();
                    mod(a,b);
                    break;
                case 8:
                    System.out.print("dikey  kenar uzunluğunu Giriniz : ");
                    a = inp.nextInt();
                    System.out.print("yatay kenear uzunluğunu  Giriniz : ");
                    b= inp.nextInt();
                    alanCevre(a,b);
                    break;



            }
        }
    }
}*/
//Recursive Metotlar ile Üslü Sayı Hesaplama
//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
/*import java.util.Scanner;
public class projectss {
    static int exp(int a,int b){
        int result =1;

        if (a ==0 && b==0){
            System.out.println("Tanımsız");
        }
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Sonuç : "+result);
        return result;
    }
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int a,b,c;
        System.out.println("Yapmak istediğiniz işlem sayısını Giriniz : ");
        c =inp.nextInt();
        for (int i=0;i<c;i++){
            System.out.println("Taban Değerini Giriniz : ");
            a = inp.nextInt();
            System.out.print("Üs Değerini Giriniz : ");
            b = inp.nextInt();
            exp(a,b);
            if (c ==0){
                break;
            }

        }

    }
}*/
//Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
/*import java.util.Scanner;


public class projectss {
    static void prime(int sayi){
        for (int i =2;i<sayi;i++){
            if (sayi%i ==0){
                System.out.println(sayi+"  sayısı ASAL Değildir !!!");
                break;
            }else {
                System.out.println(sayi+"  sayısı ASALDIR");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayi;
        while(true){
            System.out.print("Bir sayı Giriniz : ");
            sayi= inp.nextInt();
            prime(sayi);
            if (sayi ==0){
                break;
            }

        }
    }
}*/
//Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
//
//Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında
// ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
/*import java.util.Scanner;
public class projectss {
    static void wiew(int number){
        int reserveNumber=number;
        System.out.print(number+ ",");
        if (!(number<0)){
            boolean kosul1=true;
            while (kosul1 !=false){
                reserveNumber-=5;
                System.out.print(reserveNumber + ",");


                if (reserveNumber<0 || reserveNumber==0){
                    boolean kosul2=true;
                    while(kosul2 !=false) {
                        reserveNumber += 5;
                        System.out.print(reserveNumber + ",");
                        if (reserveNumber==number){
                            kosul2=false;
                        }if (kosul2==false){
                            kosul1=false;
                        }
                    }

                }
            }
        }
    }
    public static void main(String[] args) {
         Scanner inp =new Scanner(System.in);
         int number= inp.nextInt();
         wiew(number);


    }
}*/
// BuyukKucukDegistir adında bir Java sınıfı oluşturuluyor.
 /*public class projectss {

    // degistir adında bir static metod tanımlanıyor. Bu metod, parametre olarak gelen string içindeki büyük ve küçük harfleri değiştirir.
    public static String degistir(String str) {
        // Gelen string'i bir karakter dizisine dönüştürülüyor.
        char[] charArray = str.toCharArray();

        // Karakter dizisinin her bir elemanı üzerinde dönülüyor.
        for (int i = 0; i < charArray.length; i++) {
            // İlgili karakter char değişkenine atanıyor.
            char ch = charArray[i];

            // Eğer karakter büyük harfse, onu küçük harfe çeviriyor.
            if (Character.isUpperCase(ch)) {
                charArray[i] = Character.toLowerCase(ch);
            }
            // Eğer karakter küçük harfse, onu büyük harfe çeviriyor.
            else if (Character.isLowerCase(ch)) {
                charArray[i] = Character.toUpperCase(ch);
            }
            // Eğer karakter ne büyük harf ne de küçük harfse (örneğin, sayı veya özel karakter), değişiklik yapmadan bırakılıyor.
        }

        // Değiştirilmiş karakter dizisi, yeni bir String nesnesine dönüştürülüp geri döndürülüyor.
        return new String(charArray);
    }

    // main metodu, programın başlangıç noktasıdır.
    public static void main(String[] args) {
        // Örnek bir string oluşturuluyor.
        String girilenString = "Merhaba Dünya!";

        // degistir metodu çağrılarak string içindeki büyük ve küçük harfler değiştiriliyor.
        String sonuc = degistir(girilenString);

        // Sonuç ekrana yazdırılıyor.
        System.out.println(sonuc);
    }
}
*/
// math sınıfı
/*public class projectss {
      static int asalSayi(int num){
        for(int i=2;i<num;i++){
             if(num%i==0 ){
                System.out.println(num+" : Sayısı asal değildir");
                break;
             }else{
                System.out.println(num+ " : Sayısı asaldır");
                break;
             }
            }
            return num;
      }
    

    public static void main(String[] args) {
        asalSayi(11);
    }
     
}
*/

/*
public class projectss {
    public static void main(String[] args) {
        String word = "radar"; // Test edilecek kelime
        if (isPalindrome(word))
            System.out.println(word + " bir palindromdur.");
        else
            System.out.println(word + " bir palindrom değildir.");
    }

    // Rekürsif metot
    public static boolean isPalindrome(String word) {
        // Temizlenmiş kelimeyi al
        String cleanWord = word.replaceAll("\\s+", "").toLowerCase();
        // Temizlenmiş kelimenin uzunluğunu al
        int length = cleanWord.length();
        
        // Temizlenmiş kelimenin uzunluğu 0 veya 1 ise, palindromdur.
        if (length <= 1) {
            return true;
        } else {
            // İlk ve son karakterleri kontrol et
            if (cleanWord.charAt(0) != cleanWord.charAt(length - 1)) {
                return false;
            } else {
                // İlk ve son karakterler aynıysa, kalan kısmı kontrol etmek için rekürsif çağrı yap
                return isPalindrome(cleanWord.substring(1, length - 1));
            }
        }
    }
} */
/*public class projectss {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(calcPlusArr(arr, 0, 0));
    }
    static int calcPlusArr(int arr[],int result,int i){
        if(arr.length <=i){
            System.exit(1);
        }else {
            calcPlusArr(arr, result+= arr[i], ++i);
        }
        
        return result;
    }
}
*/
/* public class projectss {

    static int fibonacci(int n)  {
        if(n == 0)       return 0;
        else if(n == 1)      return 1;
        else        return fibonacci(n - 1) + fibonacci(n - 2);    }

    public static void main(String[] args) {
        for(int i=1;i<10;i++) System.out.print(fibonacci(i)+" - ");    }
}

*/
public class projectss {

    public static String kucuk(String arr[],int S,String enKucuk){
        if(S>=arr.length||arr==null||arr.length==0){
            System.out.println(enKucuk);
            return null;
            
        }
        
        if(enKucuk.length() >= arr[S].length()){
            enKucuk=arr[S];                 
        }
        return kucuk(arr, ++S, enKucuk); 
        

    }
    public static void main(String[] args) {
        String [] kelimeler = {"www","dot","emre","celen","[d]","com","[d]","tr"};
        String enKucuk=kelimeler[0];
        int S=0;
        kucuk(kelimeler,S, enKucuk);
        
    }
}











