/*public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}

 */
//Teacher Sınıfı Özellikleri :
//
//Nitelikler : name,mpno,branch
//Metotlar : Teacher()

public class Teacher {


    String name;
    String branch;
    int mpno;
    Teacher(String name,String branch,int mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }
    void print(){
        System.out.println("========================");
        System.out.println("HOCALAR");
        System.out.println("Ad : "+this.name);
        System.out.println("Branşş :"+this.branch);
        System.out.println("Telefon no : "+mpno);
    }
}


