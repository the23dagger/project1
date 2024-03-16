//javada dizizlerin genel mantığı listedir yani aynı işi yapmak için tutulan değişkenler
// market listesi gibi
/*
public class Arrayss {
    static int[] reverse(int [] list){
        int [] reserve=new int[list.length];
        for (int i=0,j= list.length-1;i< list.length;i++,j--){
            reserve[i]=list[j];
        }
        return reserve;
    }

    static void printArray(int [] list){
        for (int i=0;i< list.length;i++){

            System.out.println(list[i]);
        }
    }
    static void printArray(double [] arr){
        for (int i=0;i< arr.length;i++){

            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
       // int[] list= new int[dizinin boyutu(array size)];
       // int list2[]= new int[20];

        int [] list={10,20,30,40,50,60,70,80,90,100};
        int [] newListe = reverse(list);
        printArray(newListe);
        System.out.println("=========================");
        double[]listD={10,20,30,40,50,60,70,80,90,100};
        printArray(listD);
        System.out.println("========================");


        //dizi içeriğini verilerini belirleme:
        //list[0]=10;
        //list[1]=20;
        //list[2]=30;
        //int [] list= new int[10];


        for (int i =0;i<list.length;i++){
            list[i]=(i*10)+10;
        System.out.println(list[i]);
      }
    }
}

 */
/*
public class Arrayss {
    static void printMatrix(int[][] matriks){
        for (int i=0;i<matriks.length;i++){
            for (int j=0;j<matriks[0].length;j++){
                System.out.print(matriks[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] matriks = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        printMatrix(matriks);
        System.out.println("=======================");
        for (int[] row: matriks){
            for (int col :row){
                System.out.print(col +   "  ");
            }
            System.out.println();
        }
    }
}

 */
import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        int[] deneme ={1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        int[] deneme2 = {1,2,3};
        int[] deneme3 = {1,2,3};
        double[] deneme4 = {1,2,3,4,5};
       /* System.out.println(Arrays.toString(deneme));
        System.out.println("====================");
        //Arrays.fill(deneme,10);// istennilen değerin atanmasını sağlar dizideki tüm terimlere  !!!!
        //System.out.println(Arrays.toString(deneme));
        //System.out.println("======================");
        Arrays.fill(deneme,0,2,23);//indexler arasındaki değerleri değiştirir  !!!!
        System.out.println(Arrays.toString(deneme));
        System.out.println("=======================");
        Arrays.sort(deneme);
        // System.out.println(Arrays.toString(deneme));
        System.out.println("======================");
        System.out.println(Arrays.binarySearch(deneme,-10);// dizideki istenilen eleman varsa indisini gösterir!!!
        System.out.println("=======================");
        int [] copyList =Arrays.copyOf(deneme,4);//dizinin 4. terimine kadar olan kısmı kopyaladı ve yeni dizi değerlerini aldı !!!!
        System.out.println(Arrays.toString(copyList));
        System.out.println("===============================");
        int [] copyList2 =Arrays.copyOfRange(deneme,2,5);// dizi içerisindeki belirli aralıktaki verileri kopyalar !!!!
        System.out.println(Arrays.toString(copyList2));
        System.out.println("========================");
        System.out.println(Arrays.equals(deneme2,deneme3));//dizilerin eşitliklerini kontrol eder !!!
        */
        HelperArryass.print(deneme);
        System.out.println("\n=================");
        HelperArryass.changeArrays(deneme2,10);
        System.out.println("\n=================");
        HelperArryass.indexFromToChangeArrays(deneme,0,2,23);
        System.out.println("\n================");
        HelperArryass.bianarySearchs(deneme3,3);
        System.out.println("\n================");
        HelperArryass.copyOfNewArr(deneme,10);
        System.out.println("\n================");
        HelperArryass.equalsArr(deneme2,deneme3);
        System.out.println("\n================");
        HelperArryass.calcAvarage(deneme4);
        System.out.println("\n================");
        HelperArryass.calcHarmonik(deneme4);
        System.out.println("\n==============");
        int[]arr={1,2,3,4,5,7,-1,-2,3,-10};
        HelperArryass.calcMaxMin(arr);
        System.out.println("\n===============");
        HelperArryass.maxMinLong(arr,5);

    }


}




