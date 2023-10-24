/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class MyString implements IString{
    public static String reverse(String s){
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();
    }
    

    @Override
    public int f1(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            char digitChar=str.charAt(i);
            if(digitChar=='3'||digitChar=='2'||digitChar=='5'||digitChar=='7') count++;
        }
        return count;
    }

    @Override
    public String f2(String str) {
       StringBuilder s = new StringBuilder(str);
       StringBuilder struct = new StringBuilder();
       String l = s.reverse().toString();
       String[] token = l.split("\\s+");
        for (String string : token) {
            struct.append(reverse(string));
            struct.append(" ");
        }
        return struct.toString().trim();
    }
}
