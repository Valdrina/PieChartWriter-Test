/**This is the tester class of PieChartWriter and it calls all of the 5 methods of it with parameters included*/
import java.awt.*;
import javax.swing.*;
public class TestPieChart
{
   public static void main(String[] args){
      PieChartWriter p =  new PieChartWriter();
      p.setTitle("How I spend my day");
      p.setSlice1("Sleep: 7 hours ",7,Color.black); 
      p.setSlice4("Recreation: 9 hours", 9,Color.blue);
      p.setSlice2("In class: 3 hours",3,Color.gray);
      p.setSlice3("Homework: 5 hours",5,Color.red);
      
   }}