class Student1{
    public static void main(String args[]){
        School s1 = new School("John", 15, 85);
        s1.display();
    }
}

        class School{
            String Name;
            int Age;
            int Marks;
            School(String Name, int Age, int Marks){
                this.Name=Name;
                this.Age=Age;
                this.Marks=Marks;
            }
            void display(){
                System.out.println("Name: "+Name);
                System.out.println("Age: "+Age);
                System.out.println("Marks: "+Marks);

            if (Marks>80){
                System.out.println("Passed");
            }
            else{
                System.out.println("Failed");
            }
            }

        }