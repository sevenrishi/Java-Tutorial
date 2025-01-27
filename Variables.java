public class Variables{

   String name; //Class Scope
   int price;  //Default=0
   boolean isReady; //Default=false
   static String surname="Mondal"; //Class scope
   public static void main(String[] args){
      //dataType variableName = value;
      int age=25;
   }

   public void displayAge(){
      int age=20; //Local Scope
      System.out.println(age);
      byte b=10;
      short s=100;
      long population =80000000;
      float pi=3.14f;
      double gpa=9.5;
      char grade='A' ;
      boolean isJavaFun =true;

      int price=100;
      int $price=100;
      int _price=100;
      int Price$Of_Car=100000;
      String firstName="Saptarshi";
      int x=13;
      int numberOfStudent=13;

      if(true){
         int number=10; //Block Scope
      }
   }
}