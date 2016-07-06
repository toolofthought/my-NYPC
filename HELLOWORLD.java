/**
 * Created by yunskim on 2016-07-07.
 */

//Java의 경우에는, main 메소드가 있는 클래스명은 항상 Main 이어야 한다. 또한, 패키지를 지정해서는 안 된다.
// package helloworld; << DON'T

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {
            //next() : by word
            //nextLine() : by line
            String name = sc.next();
            System.out.println("Hello, " + name + "!");
        }
    }
}
