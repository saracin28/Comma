package Comma;

import java.util.ArrayList;
import java.util.List;

public class Comma {
    public static StringBuilder evenodd(List<Integer> n){
        StringBuilder a = new StringBuilder();

        for(int i=0;i<n.size();i++) {
            if (n.get(i) % 2 == 0) {
                a.append("e"+n.get(i)+" ");
            }else{
                a.append("o"+n.get(i)+" ");
            }}
        return a;
    }

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(44);
        list.add(5);
        list.add(10);
        System.out.println(evenodd(list));
    }
}
