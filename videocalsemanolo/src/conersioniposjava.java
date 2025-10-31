public class conersioniposjava {
    public static void main(String[] args) {
        //conversion implicita
        byte a =1;
        double b = 15.15;
        double c = a + b;
        System.out.println(c);
        //conevrsion explicita
        int x = 15;
        double y = 15.13;
        int z =  x + (int) y;
        System.out.println(z);
        //conversion string a numero
        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k;
        System.out.println(l);
    }
}
