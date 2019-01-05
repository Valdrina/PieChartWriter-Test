/**This class is used two create a pie chart made of 4 slices and it includes totally 7 methods  */
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class PieChartWriter extends JPanel{
   
   private String Label1="",Label2="",Label3="",Label4="",title="",name="";              // These are the variables we will  
   private int Amount1, Amount2, Amount3, Amount4, x=50, y=90,offset=20,s_pos=150,s_pos2=60;  //be using in our project. 
   private Color color1, color2, color3, color4;   
   private int width=300;
   private JFrame objectFrame;
   public PieChartWriter(){
      objectFrame = new JFrame();             
      objectFrame.getContentPane().add(this);
      objectFrame.setTitle(title);
      objectFrame.setVisible(true);
      objectFrame.setSize(width,width);}
   public void paintComponent(Graphics g){         
      g.setColor(Color.white);
      g.fillRect(0,0,width,width);
      g.setColor(Color.black);
      g.drawOval(x,x,y,y);
      g.setColor(color1);
      g.fillArc(x,x,y,y,0, Amount1*360/24);
      g.drawString(Label1,s_pos,s_pos2);
      g.setColor(color2);
      g.fillArc(x,x,y,y,Amount1*360/24,Amount2*360/24);
      g.drawString(Label2,s_pos,s_pos2+offset);
      g.setColor(color3);
      g.fillArc(x,x,y,y,Amount1*360/24+Amount2*360/24,Amount3*360/24);
      g.drawString(Label3,s_pos,s_pos2+2*offset);
      g.setColor(color4);
      g.fillArc(x,x,y,y,Amount1*360/24+Amount2*360/24+Amount3*360/24,Amount4*360/24);
      g.drawString(Label4,s_pos,s_pos2+3*offset);}
   public void setSlice1(String label, int amount,Color color)    // This method writes the first slice of the Pie Chart
   {
      Label1 = label; 
      Amount1 = amount;
      color1 = color;    } 
   public void setSlice2(String label, int amount,Color color){
   
      Label2 = label; 
      Amount2 = amount; 
      color2 = color;    
   } public void setSlice3(String label, int amount,Color color){
   
      Label3 = label; 
      Amount3 = amount; 
     color3 = color; 
   }
   public void setSlice4(String label, int amount,Color color){
   
      Label4 = label; 
      Amount4 = amount; 
     color4 = color;  
   }
  public void setTitle(String name){        //This method is optional so only can use it only 
  title = name;                             //if you want to name the frame in your tester class
  title = name;
  objectFrame.setTitle(name); repaint();}
   }