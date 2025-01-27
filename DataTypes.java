public class DataTypes {
    public static void main(String[] args) {

        //Primitive Data Types

        //Integer Types - For whole numbers
        byte age = 25;          // Integer (1 byte)
        System.out.println("Age: " + age);

        short year = 2024;      // Integer (2 bytes)
        System.out.println("Year: " + year);

        int salary = 50000;     // Integer (4 bytes)
        System.out.println("Salary: $" + salary);

        long population = 7800000000L; // Integer (8 bytes)
        System.out.println("Population: " + population);


        //Floating-Point Types - For numbers with decimals
        float price = 19.99F;   // Decimal (4 bytes)
        System.out.println("Price: $" + price);

        double pi = 3.14159265359; // Decimal (8 bytes)
        System.out.println("Pi Value: " + pi);


        //Character Type - For single characters
        char grade = 'A';       // Character
        System.out.println("Grade: " + grade);


        //Boolean Type - For true/false values
        boolean isJavaFun = true; // Boolean
        System.out.println("Is Java Fun? " + isJavaFun);


        //Non-primitive Data Types

        //Strings -  A sequence of characters
        String name = "Sevenrishi Academy";
        System.out.println("Welcome to " + name);

        //Arrays - A collection of multiple values of the same type
        int[] numbers = {10, 20, 30, 40};
        System.out.println("First number: " + numbers[0]);

        //Oblects - Custom data types created using classes
        class Student {
            String name;
            int age;
        }
        
        Student student = new Student();
        student.name = "Saptarshi";
        student.age = 20;
        System.out.println(student.name + " is " + student.age + " years old.");        

       
    }
}
