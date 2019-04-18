public class test3_1 {
    public static void main(String[] args) {
        int i = 2_147_483_647;
        float f = (float) i;
        System.out.println("int " + i);
        System.out.println("float " + f);
        byte x = 127;
        x = ++x;
        System.out.println(x);
        int w = 22;
        System.out.println((w % 2) == 0 ? "Чётное" : "Нечётное");


    }
}


