

public class Methods {
    static int sum(int x, int y){
        return x+y;
    }
    static float Percentage(float k, float z){
        return (float)((k/ z) * 100);
        
    }
    public static void main(String[] args) {
        int a = 78;
        int b = 43;
        int c;
        float t = 240;
        float h = 300;
        float n;
        c = sum(a, b);
         n = Percentage(t, h);
        System.out.println(c);
        System.out.println(n);
    }
}
