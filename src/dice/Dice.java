
package dice;

import java.io.*;


public class Dice {

    public static void main(String[] args) 
        throws IOException{
        String s,begin,middle,end=new String();
        int beginnum,middlenum,endnum;
        float average;
        //char begin[] = new char[1];
        
        
        int d, plus;
        
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        do{
        System.out.println("Введите в виде AdB+C, q - для завершения");
        s=br.readLine();
        beginnum=0;
        middlenum=0;
        endnum=0;
        if (s.equalsIgnoreCase("q")){
            System.out.println("Завершено");
            break;
        }
        if (s.length()>=15){
            System.out.println("Не больше 15 символов");
        }
        else{
            d=s.indexOf('d');
            plus=s.indexOf('+');
            
            if (d==-1){
                System.out.println("Неверный формат");
            }
            else{
                begin=s.substring(0,d);
                if (plus!=-1){
                    middle=s.substring(d+1,plus);
                    end=s.substring(plus+1,s.length());
                }
                else {
                    middle=s.substring(d+1,s.length());
                    end="0";
                   
                }
                try{
                beginnum=Integer.parseInt(begin);
                middlenum=Integer.parseInt(middle);
                endnum=Integer.parseInt(end);
                }catch(Exception e){
                    System.out.println("Неверный формат");
                    
                }
                if (beginnum>0 && middlenum>0){
                    average=(1.0f+middlenum)*beginnum/2+endnum;
                    System.out.println("Среднее: "+average);
                    }
                else {
                    System.out.println("Неправильный ввод");
                }
                //System.out.println("begin="+begin+"beginnum="+"middle="+middle+" end="+end); 
                
            }
                   
        }

        } while(true);
    }
    
}
