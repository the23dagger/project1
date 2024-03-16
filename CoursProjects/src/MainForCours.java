
//Öğrenci Not Sistemi
//Course Sınıfı Özellikleri :
//
//Nitelikler : name,code,prefix,note,Teacher
//Metotlar : Course() , addTeacher() , printTeacher()


//Student Sınıfı Özellikleri :
//
//Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
//Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
//Ödev
//Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
//
//Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
//
//Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
//
//Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
public class MainForCours {
    public static void main(String[] args) {


        Teacher t1=new Teacher("Mahmut hoca","MAT",1907);
        Teacher t2= new Teacher("gülyabani","cin",1907);
        Teacher t3=new Teacher("kedi","fiz",1907);


        Cours mat=new Cours("Matematik","MAT101","MAT");
        mat.addTeacher(t1);
        Cours cin=new Cours("KışKış cinler","CİN101","cin");
        cin.addTeacher(t2);
        Cours fiz=new Cours("dasdasd","fiz101","fiz");
        fiz.addTeacher(t3);


        Students s1= new Students("inek şaban","1907,","4",mat,cin,fiz);
        s1.addPreExamNote(50,50,50,50,50,50);



    }
}