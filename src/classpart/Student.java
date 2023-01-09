package classpart;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
       this.name = name;
       this.money = money;
    }

    public void takeBus(Bus bus) {
       this.money -= 1000;
       bus.take(1);
    }

    public void takeSubway(Subway subway) {
       this.money -= 1500;
       subway.take(1);
    }

   public String getName() {
      return name;
   }

   public int getMoney() {
      return money;
   }

   public void showInfo() {
      System.out.println(this.getName()+" has "+this.getMoney());
   }
}