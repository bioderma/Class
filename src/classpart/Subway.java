
package classpart;

public class Subway {
   int subwayNum;
   int intake = 0;
   int passenger;

   public Subway(int num) {
      this.subwayNum = num;
   }

   public void take(int passenger) {
      this.passenger++;
      this.intake+=1500;
   }

   public int getsubwayNum() {
      return subwayNum;
   }

   public int getIntake() {
      return intake;
   }

   public int getPassenger() {
      return passenger;
   }

   public void showInfo() {
      System.out.println("Subway "+this.getsubwayNum()+" got "+this.getPassenger()+" passengers and earned "+this.getIntake()+" won");
   }
}