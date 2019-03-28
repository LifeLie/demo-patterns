package pers.ll.demo.test;

import java.util.Scanner;

/**
 * @author ll
 * @date 2018/10/26 4:04 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = Integer.parseInt(str);
        int count = 0;
        int result = counts(i,count);
        System.out.println(result);
    }

    private static int counts(int i, int count) {

        if(i!=1){
            int p = i%2;
            count+=1;
            if(p == 0){
                count = counts(i/2,count);
            }else{
                count = counts((3*i+1)/2,count);
            }
            return count;
        }else{
            return count;
        }
    }
}
