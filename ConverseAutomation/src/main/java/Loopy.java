public class Loopy {
public static void main (String[] args) {
int x = 1;
System.out.println("before");
while (x < 4) {
System.out.println("loop");
System.out.println("value of x is" +" "+ x);
x = x + 1;
}
System.out.println("after");
}
}