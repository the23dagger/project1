public class HelperArryass {
    static void print(int [] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i] +",");
        }
    }
    static int changeArrays(int []arr,int number){
        for (int i=0;i<arr.length;i++){
            arr[i]=number;
            print(arr);
        }
        return number;
    }
    static int indexFromToChangeArrays(int []arr,int from,int to,int number){
        for (int i=0;i<arr.length;i++){
            for (int j =from;j<to;j++){
                arr[j]=number;
            }

        }
        print(arr);
        return number;

    }
    static void bianarySearchs(int[] arr,int number){
        for (int i=0;i<arr.length;i++){

            if (arr[i] == number){
                System.out.print(i);
                break;
            }

        }
    }
    static void copyOfNewArr(int []arr,int index){
        int []copyArr =new int[arr.length-index];
        for (int j=0;index<arr.length;index++, j++){
            copyArr[j]=arr[index];
        }
        print(copyArr);
    }
    static boolean equalsArr(int []arr1,int[]arr2){
        for (int i=0;i<arr1.length;i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }

            return true;
    }
    static void calcAvarage(double []arr){
        int numberss=0;
        double avarage,result=0;
        for (int i=0;i<arr.length;i++){
            result +=arr[i];
            numberss++;
        }
        avarage= result/numberss ;
        System.out.println("Ortalamanız : "+avarage);
    }
    static void calcHarmonik(double []arr) {
        double result = 0.0;
        for (int i = 0; i < arr.length; i++) {
            result += 1 / arr[i];
        }
        System.out.println(result);
    }
    static void calcMaxMin(int []arr){
        int max=0,min=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max=arr[i];
            }
            if (arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);

    }
    static void maxMinLong(int [] arr,int number){
        int max = 0,min=0;
        for (int i=0; i<arr.length;i++){
            if (number>arr[i]){
                max=arr[i];
                if (max <arr[i]){
                    break;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            if (number<arr[i]){
                min=arr[i];
                if (min>arr[i]){
                    break;
                }
            }
        }
        System.out.println(number+"sayıdan  küçük en yakın sayı :  "+min);
        System.out.println(number+"sayıdan büyük en yakın sayı : "+max);
        print(arr);
    }




}
