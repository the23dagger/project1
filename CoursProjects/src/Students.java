import java.sql.SQLOutput;

////Student Sınıfı Özellikleri :
////
////Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
////Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
////Ödev
////Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
////
////Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
////
////Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
////
////Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
public class Students {
    Cours fc1,fc2,fc3;
    Cours c1;
    Cours c2;
    Cours c3;
    String name,stuNo,classes;
    double avarage,avarage2,avarage3;
    boolean isPass;
    Students(String name,String stuNo,String classes,Cours c1,Cours c2,Cours c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.avarage2=0.0;
        this.avarage3=0.0;
        this.isPass=false;
    }
    void addPreExamNote(int note1,int note2,int note3,int fnote1,int fnote2,int fnote3){
        if (note1 >=0 && note1 <=100) {
            this.c1.note = note1;
        }
        if (note2 >=0 && note2 <=100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3<=100){
            this.c3.note = note3;
        }
        //finla notları
        if (fnote1 >=0 && fnote1<=100){
            this.fc1.note=fnote1;
        }
        if (fnote2 >= 0 && fnote2 <=100){
            this.fc2.note=fnote2;
        }
        if (fnote3 >= 0 && fnote3 <=100){
            this.fc3.note=fnote3;
        }
        isPassForBulkExam();
        calcAvarageForBulkExam();
        studentsNoteInfo();

    }






     void isPassForBulkExam(){
        if (this.avarage>50.0) {
            System.out.println("GEÇTİNİZ TEBRİKLER !!!!!");
            System.out.println("Ortalama : "+this.avarage);
        }else {
            System.out.print("KALDINIZ !!!");
            System.out.println("\tOrtalama : "+this.avarage);
        }
         if (this.avarage2>50.0) {
             System.out.println("GEÇTİNİZ TEBRİKLER !!!!!");
             System.out.println("Ortalama : "+this.avarage2);
         }else {
             System.out.print("KALDINIZ !!!");
             System.out.println("\tOrtalama : "+this.avarage2);
         }
         if (this.avarage3>50.0) {
             System.out.println("GEÇTİNİZ TEBRİKLER !!!!!");
             System.out.println("Ortalama : "+this.avarage3);
         }else {
             System.out.print("KALDINIZ !!!");
             System.out.println("\tOrtalama : "+this.avarage3);
         }

    }
    void calcAvarageForBulkExam(){
        this.avarage=(this.c1.note*0.4)+(this.fc1.note*0.6);
        this.avarage2=(this.c2.note*0.4)+(this.fc2.note*0.6);
        this.avarage3=(this.c3.note*0.4)+(this.fc3.note*0.6);
        studentsNoteInfo();

    }
    void studentsNoteInfo(){
        System.out.println("======================");
        System.out.println("AD : "+this.name);
        System.out.println("OKUL NO :"+this.stuNo);
        System.out.println("MATEMATİK NOTU :"+this.c1.note);
        System.out.println("KışKış cinler NOTU : "+this.c2.note);
        System.out.println("FİZİK NOTU : "+this.c3.note);


    }

}