package calculatorTest;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        
        ArrayList<String> str = new ArrayList<String>();
        int bufferAnswer=0;
        String answer="";

        int zero = 0;
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int seven = 7;
        int eigth = 8;
        int nine = 9;
        String addition = "+";
        String product = "*";
        String div = "/";
        String sub = "-";
        
        str.add(concat(nine, two)+"");
        str.add(addition);
        str.add(five+"");
        str.add(product);
        str.add(six+"");
        str.add(div);
        str.add(three+"");
        str.add(sub);
        str.add(concat(two, five)+"");

        System.out.println(str);


        for(int i= 0 ; i< str.size() ; i++){
            if(str.get(i)=="/"){
                int s = Integer.parseInt(str.get(i-1));
                int d = Integer.parseInt(str.get(i+1));
                bufferAnswer = s/d;
                answer = Integer.toString(bufferAnswer);
                str.add(i+2,answer);
                str.remove(i-1);
                str.remove(i-1);
                str.remove(i-1);                
                System.out.println(str);
                for(String list : str){
                    System.out.print(" "+list);
                }
            }
        }
        
        for(int i= 0 ; i< str.size() ; i++){
            if(str.get(i)=="*"){
                int s = Integer.parseInt(str.get(i-1));
                int d = Integer.parseInt(str.get(i+1));
                bufferAnswer = s*d;
                answer = Integer.toString(bufferAnswer);
                str.add(i+2,answer);
                str.remove(i-1);
                str.remove(i-1);
                str.remove(i-1);                
                System.out.println(str);
                for(String list : str){
                    System.out.print(" "+list);
                }
            }
        }

        for(int i= 0; i < str.size();i++){
            if(str.get(i)=="+"){
                int s = Integer.parseInt(str.get(i-1));
                int d = Integer.parseInt(str.get(i+1));
                bufferAnswer = s+d;
                answer = Integer.toString(bufferAnswer);
                str.add(i+2,answer);
                str.remove(i-1);
                str.remove(i-1);
                str.remove(i-1);                
                System.out.println(str);
                for(String list : str){
                    System.out.print(" "+list);
                }
            }            
        }    
        for(int j= 0 ; j< str.size() ; j++){
            if(str.get(j)=="-"){
                int s = Integer.parseInt(str.get(j-1));
                int d = Integer.parseInt(str.get(j+1));
                bufferAnswer = s-d;
                answer = Integer.toString(bufferAnswer);
                str.add(j+2,answer);
                str.remove(j-1);
                str.remove(j-1);
                str.remove(j-1);                
                System.out.println(str);
                for(String list : str){
                    System.out.print(" "+list);
                }
            }
        }    

        
    }

    static int concat(int a, int b){
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s3 = s1+s2;
        int c = Integer.parseInt(s3);        
        return c;
    }
}