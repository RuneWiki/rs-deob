package deob;

@ObfuscatedName("gh")
public class class188 extends class130 {

    @ObfuscatedName("gh.x")
    public static class125 field2773 = new class125(64);

    @ObfuscatedName("gh.q")
    public int field2772 = 0;

    @ObfuscatedName("gh.p(Lev;B)V")
    public void method3174(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3175(arg0, var2);
        }
    }

    @ObfuscatedName("gh.g(Lev;II)V")
    public void method3175(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2772 = arg0.method2595();
        }
    }

    @ObfuscatedName("ek.x(I)V")
    public static void method2526() {
        field2773.method2170();
    }
}
