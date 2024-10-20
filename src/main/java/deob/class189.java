package deob;

@ObfuscatedName("gx")
public class class189 extends class130 {

    @ObfuscatedName("gx.n")
    public static class125 field2784 = new class125(64);

    @ObfuscatedName("gx.g")
    public boolean field2785 = false;

    @ObfuscatedName("db.x(Lgo;I)V")
    public static void method2194(class183 arg0) {
        Statics.field2787 = arg0;
    }

    @ObfuscatedName("gx.n(Leq;I)V")
    public void method3301(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3302(arg0, var2);
        }
    }

    @ObfuscatedName("gx.g(Leq;II)V")
    public void method3302(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2785 = true;
        }
    }
}
