package pack;

public class Test {
    Test(){
        System.out.println("Test");
    }
    private B b = new B();
    public  static C c= new C() ;

    /*private final String string;
    private final Date date;

    Test(String s, Date date){
        string =s;
        this.date = date;
    }

    public  void  setDate(Date date){
        this.date = date;
    }
    public void setString(String string){
        this.string=string;
    }*/
    public static void main(String[] args) {
        /*String string = new String("dd");
        Date date1 = new Date();
        Test test = new Test("ss",date1);
        test.date.setTime(15/11/2015);*/
        Test test = new Test();
    }

}
class B{
    B(){
        System.out.println("B");
    }

}
class C {
    C(){
        System.out.println("C");
    }
}