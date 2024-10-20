package deob;

@ObfuscatedName("jx")
public class class264 extends class207 {

    @ObfuscatedName("jx.m")
    public static class201 field3339 = new class201(64);

    @ObfuscatedName("jx.q")
    public int field3343;

    @ObfuscatedName("jx.b")
    public int field3340;

    @ObfuscatedName("jx.f")
    public int field3342;

    @ObfuscatedName("cs.w(Liv;I)V")
    public static void method1861(class248 arg0) {
        Statics.field3338 = arg0;
    }

    @ObfuscatedName("jx.m(Lgy;I)V")
    public void method4558(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4565(arg0, var2);
        }
    }

    @ObfuscatedName("jx.q(Lgy;IB)V")
    public void method4565(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3343 = arg0.method3268();
            this.field3340 = arg0.method3436();
            this.field3342 = arg0.method3436();
        }
    }
}
