
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s16it06
 */
public class PlayFair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String ss="";
        String pp="";
        String p=sc.nextLine();
        StringBuffer s=new StringBuffer(st);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(st.charAt(i)==st.charAt(j)){
                    s.setCharAt(j,' ');
                }
            }
            if(s.charAt(i)!=' '){
                ss+=s.charAt(i);
            }
        }
        System.out.println(ss);
        int m=0,flag=0,c=0;
        char b[]=new char[26-ss.length()];
        char a[][]=new char[5][5];
        char ch='a';
        for(char i='a';i<='z';i++){
            if(i=='j'){
                continue;
            }
            for(int j=0;j<ss.length();j++){
                if(i==ss.charAt(j)){
                    flag=1;
                    j=ss.length();
                }
            }
            if(flag==0){
              b[c]=i;
//              System.out.println(b[c]);
              c++;
            }
            flag=0;
        }
        c=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(m<ss.length()){
                    a[i][j]=ss.charAt(m);
                    m++;}
                else{
                    a[i][j]=b[c];
                    c++;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        
        for(int i=0;i<p.length();i=i+2){
            if(i!=p.length()-1){
            if(p.charAt(i)==p.charAt(i+1)){
                pp+=p.charAt(i);
                pp+="x";
                i-=1;
            }
            else{
                pp+=p.charAt(i);
                pp+=p.charAt(i+1);
            }
            }
            else{
                pp+=p.charAt(i);
                pp+="x";
            }
//            System.out.println(pp);
        }
        System.out.println(pp);
        char f;
        char se;
        String ll="";
        int posfj=0,posfk=0,possej=0,possek=0;
        for(int i=0;i<pp.length();i=i+2){
            f=pp.charAt(i);
            se=pp.charAt(i+1);
            for(int j=0;j<5;j++){
                for(int k=0;k<5;k++){
                    if(a[j][k]==f){
                        posfj=j;
                        posfk=k;
                    }
                    if(a[j][k]==se){
                        possej=j;
                        possek=k;
                    }
                }
            }
            if(posfj!=possej&&posfk!=possek){
                ll+=a[posfj][possek];
                ll+=a[possej][posfk];
                System.out.println(ll);
            }
            else if(posfj==possej){
                ll+=a[posfj][(posfk+1)%5];
                ll+=a[possej][(possek+1)%5];
                System.out.println(ll);
            }
            else{
                ll+=a[(posfj+1)%5][posfk];
                ll+=a[(possej+1)%5][possek];
                System.out.println(ll);
            }
        }
    }
}
