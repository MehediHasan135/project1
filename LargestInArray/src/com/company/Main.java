package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int length = in.nextInt();
	int[] values = new int[length];
	for(int i=0;i<length;i++){
	    values[i] = in.nextInt();
	}
	int largest=values[0]; int Smallest=values[0];
	for(int i=1;i<length;i++){
	    if(largest<values[i]){
	        largest=values[i];
            }
	    if(Smallest>values[i]){
	        Smallest=values[i];
            }
        }
	for(int value : values){
            System.out.print(value+" ");
            if(largest==value){
                System.out.print("<== Largest Number.");
            }
            if(Smallest==value) {
                System.out.print("<== Smallest Number.");
            }
            System.out.println();
        }
    }
}
