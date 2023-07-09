import java.security.cert.X509CRL;
import java.util.*;

import javax.net.ssl.X509ExtendedTrustManager;
import javax.swing.GroupLayout.Alignment;
class Detail{
  private String arr[]=new String[11];
  private String name;
  private int mobile;
  private  int i=0;
  private  int j=0;
  private int x=0;
  private int qunt[]=new int[10];
 private int mon[]=new int[11];
  private int money,money1,money2,money3,money4,money5,money6,money7,money8,money9,money10;
  Scanner sc= new Scanner(System.in);
  private void Frensch(){
      System.out.println("Enter the No. plate");
      int a=sc.nextInt();
      money1=a*40;
  }
  private void pasta(){
    System.out.println("Enter the number of plate");
    int b=sc.nextInt();
    money2=b*50;
  }
  private void salad(){
    System.out.println("Enter the number of plate");
    int c=sc.nextInt();
    money3=c*30;
  }
  private void Matar(){
    System.out.println("Enter the number of plate");
    int d=sc.nextInt();
    money4=d*120;
  }
  private void Matan(){
    System.out.println("Enter the number of plate");
    int e=sc.nextInt();
    money5=e*200;
  }
  private void chicken(){
    System.out.println("Etner the Number of Plate");
    int f=sc.nextInt();
    money6=f*100;
  }
  private void water(){
    System.out.println("Enter the Numebr of Botal");
    int g=sc.nextInt();
    money7=g*20;
  }
  private void soda(){
    System.out.println("Enter the Number of Glass");
    int h=sc.nextInt();
    money8=h*40;
  }
  private void juice(){
    System.out.println("Enter the Number of Glass");
    int i=sc.nextInt();
    money9=i*50;
  }
  private void coffee(){
     System.out.println("Enter the cup of Coffee");
     int j=sc.nextInt();
     money10=j*60;
  }
   
  
  public void Bill(){
    money=money1+money2+money3+money4+money5+ money6+money7+money8+money9+money10;
    System.out.println();
    System.out.println();
    System.out.println("|_______________________________________________________________|");
    System.out.println("|                     YOUR BILL                                 |");
    System.out.println("|---------------------------------------------------------------|");

    System.out.println("| NAME:.................QUANTITY......................PRICE.....|");
    System.out.println("|                                                               |");
    for(int k=1;k<i;k++){
      
    System.out.println("| "+arr[k]+   "                 "+qunt[k]+"                            "+ mon[k]+"        |");
      
    }

      System.out.println("| Total BILL                                         "+ money+"        |" );
      System.out.println("|                                                               |");
 
 System.out.println("|_______________________________________________________________|");

  }
  void clear(){
    
    for(int j=0;j<i;j++){
      arr[j]="";
      mon[j]=0;
      qunt[j]=0;
    }
    money=0;
    money1=0;
    money2=0;
    money3=0;
    money4=0;
    money5=0;
    money6=0;
    money7=0;
    money8=0;
    money9=0;
    money10=0;


  }
  public void Exit(){
    time=false;
  }
          
  boolean time=true;
  public void getname(){
    System.out.println("Enter the name ");
    
    name =sc.nextLine();
    System.out.println("Enter your Mobile Number");
    mobile=sc.nextInt();
      
    }
    
     
       
         public void Menu(){
          boolean boll=true;
          while(boll){
        System.out.println("|-------------------|-------------------------|------------------------------|"); 
        System.out.println("|                   |                         |                              |");  
        System.out.println("|     ---Press 1.   |      chieps       ------|      ₹ 40.                   |");
        System.out.println("|---------------------------------------------|------------------------------|");
        System.out.println("|     ---Press 2.   |      Pasta        ------|      ₹ 50.                   |");
        System.out.println("|---------------------------------------------|------------------------------|");;

        System.out.println("|     ---Press 3.   |      Salad        ------|      ₹ 30.                   |");
        System.out.println("|_____________________________________________|______________________________|");

        System.out.println("|     ---Press 4.   |      Matar Panner ------|      ₹ 120.                  |");
        System.out.println("|_____________________________________________|______________________________|");
        System.out.println("|     ---Press 5.   |      Matan        ------|      ₹ 200.                  |");
        System.out.println("|_____________________________________________|______________________________|");
        System.out.println("|     ---Press 6.   |      Chicken Biryani ---|      ₹ 100.                  |");
        System.out.println("|_____________________________________________|______________________________|");
        System.out.println("|     ---Press 7.   |      Water        ------|      ₹ 20.                   |");
        System.out.println("|_____________________________________________|______________________________|");
        System.out.println("|     ---Press 8.   |      lassi        ------|      ₹ 40.                   |");
        System.out.println("|_____________________________________________|______________________________|");
        System.out.println("|     ---Press 9.   |      Fresth Juice ------|      ₹ 50.                   |");
        System.out.println("|_____________________________________________|______________________________|");
        System.out.println("|     --Press 10.   |      Coffee       ------|      ₹ 60.                   |");
        System.out.println("|_____________________________________________|______________________________|");
        System.out.println("|     --press 11.          exit from menu-----                               |");
        System.out.println("|                                                                            |");  
        System.out.println("|----------------------------------------------------------------------------|");   

        System.out.println("Please Order:-");
        int choice=sc.nextInt();
      
        i++;
        j++;
      x++;
        switch(choice){
           case 1:
               Frensch();
               mon[x]=money1;
               arr[i]="chips";
               qunt[x]=money1/40;
               break;
          case 2:
               pasta();
               arr[i]="Pasta";
               mon[x]=money2;
               qunt[x]=money2/50;
              break;
          case 3:
              salad();
              arr[i]="Salad";
              mon[x]=money3;
              qunt[x]=money3/30;
              break;
          case 4:
               Matar();
               arr[i]="Matar";
               mon[x]=money4;
               qunt[x]=money4/120;
               break;
          case 5:
              Matan();
              arr[i]="Matan";
              mon[x]=money5;
              qunt[x]=money5/200;
              break;
          case 6:
               chicken();
               arr[i]="Chicken";
               mon[x]=money6;
               qunt[x]=money6/120;
               break;
          case 7:
               water();
               arr[j]="Water";
               mon[x]=money7;
               qunt[x]=money7/20;
               break;
          case 8:
             soda();
             arr[i]="lassi";
             mon[x]=money8;
             qunt[x]=money8/40;
             break;
          case 9:
             juice();
             arr[i]="Juice";
             mon[x]=money9;
             qunt[x]=money9/50;
             break;
          case 10:
             coffee();
             arr[i]="Coffe";
             mon[x]=money10;
             qunt[x]=money10/60;
             break;
          case 11:
              boll=false;
          default:
            System.out.println("choose the correct number ");
             
        }
      }
      }}
 

class Resturant{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
    Detail ob=new Detail();
    Detail ob1=new Detail();
    boolean time=true;
    while(time){
   System.out.println("|-----------------------------------------|");
   System.out.println("|                                         |");
    System.out.println("|   ---Press 1. for Menu                  |");
    System.out.println("|   ---Press 2. for BILL                  |");
    System.out.println("|   ---Press 5. for clear                 |");
    System.out.println("|   ---Press 3. for Exit                  |");
    System.out.println("|                                         |");
    System.out.println("|-----------------------------------------|");
   System.out.print("---");
   int input=sc.nextInt();
  
    switch(input){
        case 1:
       ob.Menu();
          break;
        case 2:
           ob.Bill();
           break;
        case 5:
           ob.clear();
           break;
        case 3:
          System.out.println("YOU EXIT");
           time=false;
           break;

        default:
           System.out.println("please Enter correct Number");
     }
 
    }
     
    }
}
