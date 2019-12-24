/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuleur;

/**
 *
 * @author tapishjain
 */
public class problem17 {
    public static void main(String[]args){
      
      int finalans=0;
     
      
      for(int i=1;i<=1000;i++){
          finalans+=converter(i);
      }
      System.out.println(finalans);
     
    }
    
    public static int converter(double num){
        int total=0;
       
         if((num>=1 && num<=20) || num==1000 ){
        total=word(num).length();      
         }
         else if(num>=21 && num<=99){
            total= word(num%10).length()+word(((Math.floor(num/10)%10))*10).length();
         }else if(num>=100 && num<=999){
             double first=(Math.floor(num/100)%10)*100;
             double second=num-first;
             double third=num-first-(Math.floor(second/10)%10)*10;
             if(second>=11 && second<=19){
                 total=3+word(first).length()+word(second).length();
             }else if(second==0){
                 total=word(first).length();
             }
             else {
            total=3+word(first).length()+word((Math.floor(second/10)%10)*10).length()+word(third).length();
         }
         }
        
         
         return total;
         
    
    }
    
    public static String word(double n){
        String str="";
        if (n==0){
            str="";
        }
            if(n==1){
                str="one";
            }
            if(n==2){
                str="two";
            }
            if(n==3){
                str="three";
            }
            if(n==4){
                str="four";
            }
            if(n==5){
                str="five";
            }
            if(n==6){
                str="six";
            }
            if(n==7){
                str="seven";
            }
            if(n==8){
                str="eight";
            }
            if(n==9){
                str="nine";
            }if(n==10){
                str="ten";
            }
            if(n==11){
                str="eleven";
            }
            if(n==12){
                str="twelve";
            }
            if(n==13){
                str="thirteen";
            }
            if(n==14){
                str="fourteen";
            }if(n==15){
                str="fifteen";
            }
            if(n==16){
                str="sixteen";
            }
            if(n==17){
                str="seventeen";
            }if(n==18){
                str="eighteen";
            }
            if(n==19){
                str="nineteen";
            }
            if(n>=20 && n<=29){
                str="twenty";
            }if(n>=30 && n<=39){
                str="thirty";
            }
            if(n>=40 && n<=49){
                str="forty";
            }
            if(n>=50 && n<=59){
                str="fifty";
            }
            if(n>=60 && n<=69){
                str="sixty";
            }
            if(n>=70 && n<=79){
                str="seventy";
            }
            if(n>=80 && n<=89){
                str="eighty";
            }
            if(n>=90 && n<=99){
                str="ninety";
            }
            if(n>=100 && n<=199){
                str="onehundred";
            }
            if(n>=200 && n<=299){
                str="twohundred";
            }
            if(n>=300 && n<=399){
                str="threehundred";
            }
            if(n>=400 && n<=499){
                str="fourhundred";
            }
            if(n>=500 && n<=599){
                str="fivehundred";
            }
            if(n>=600 && n<=699){
                str="sixhundred";
            }
            if(n>=700 && n<=799){
                str="sevenhundred";
            }
            if(n>=800 && n<=899){
                str="eighthundred";
            }
            if(n>=900 && n<=999){
                str="ninehundred";
            }
            if(n==1000){
                str="onethousand";
            }
            
        
        return str;
    }
    
}
