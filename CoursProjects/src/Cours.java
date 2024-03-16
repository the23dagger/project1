
////Course Sınıfı Özellikleri :
////
////Nitelikler : name,code,prefix,note,Teacher
////Metotlar : Course() , addTeacher() , printTeacher()
public class Cours {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Cours(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note =0;
    }
    void addTeacher(Teacher teacher){
       if (teacher.branch.equals(this.prefix)){
           this.teacher=teacher;
           printTeacherInfo();
       }else {
           System.out.println("Bu öğretmen bu dersi veremez");
       }
    }
    void printTeacherInfo(){
        this.teacher.print();
    }


}



