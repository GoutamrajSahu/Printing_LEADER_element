package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i<5 ; i++){
            numbers.add(Sc.nextInt());
        }

        //Printing LEADER logic part.
        for(int i = 0; i<numbers.size(); i++){
            boolean isLeader = true;
            for(int j = i+1; j<numbers.size(); j++){
                if(numbers.get(i) <= numbers.get(j)){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader == true){
                System.out.println(numbers.get(i));
            }
        }
    }
}
