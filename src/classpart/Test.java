package classpart;

public class Test {
    public static void main(String[] args) {

       Student stu1 = new Student("John", 10000);
       Student stu2 = new Student("Kelly", 20000);
       Student stu3 = new Student("Harry", 14000);

       Bus bus100 = new Bus(100);
       Subway subway2 = new Subway(2);
       Subway subway7 = new Subway(7);

       stu1.takeBus(bus100);
       stu2.takeSubway(subway2);
       stu1.takeSubway(subway7);
       stu3.takeSubway(subway7);

       stu1.showInfo();
       stu2.showInfo();
       stu3.showInfo();
       bus100.showInfo();
       subway2.showInfo();
       subway7.showInfo();    
    }
}