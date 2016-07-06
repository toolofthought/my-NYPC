/**
 * Created by yunskim on 2016-07-07.
 */
class Number {
    public int a;
    public int b;
}

public class CallByReference {
    public static void swap(Number z) {
        int temp = z.a;
        z.a = z.b;
        z.b = temp;
    }

    public static void main(String[] args) {
        Number n = new Number();
        n.a = 10;
        n.b = 20;
        System.out.println("swap() 메소드 호출 <전>: a="+n.a+", b="+n.b);
        swap(n);
        System.out.println("swap() 메소드 호출 <후>: a="+n.a+", b="+n.b);
    }
}
