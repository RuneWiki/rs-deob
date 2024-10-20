package deob;

@ObfuscatedName("jt")
public class class270 extends class214 {

    @ObfuscatedName("jt.s")
    public static class208 field3404 = new class208(64);

    @ObfuscatedName("jt.g")
    public int field3407;

    @ObfuscatedName("jt.x")
    public int field3406;

    @ObfuscatedName("jt.h")
    public int field3403;

    @ObfuscatedName("n.a(Liz;B)V")
    public static void method124(class255 arg0) {
        Statics.field3405 = arg0;
    }

    @ObfuscatedName("jt.g(Lgx;I)V")
    public void method4740(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4732(arg0, var2);
        }
    }

    @ObfuscatedName("jt.x(Lgx;II)V")
    public void method4732(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3407 = arg0.method3610();
            this.field3406 = arg0.method3443();
            this.field3403 = arg0.method3443();
        }
    }
}
