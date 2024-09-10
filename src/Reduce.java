public class Reduce {
    public static void main(String[] args) {
        int x = 100;
        int s = 0;
        while (x != 0){
            s++;
            if (x % 2 == 0){
                x /= 2;
            } else {
                x -= 1;
            }
        }
        System.out.println(s);
    }
}
