package deob;

@ObfuscatedName("ay")
public class class44 extends class195 {

    @ObfuscatedName("ay.k")
    public static class184 field1012 = new class184(64);

    @ObfuscatedName("ay.e")
    public int field1011;

    @ObfuscatedName("ay.f")
    public int field1016;

    @ObfuscatedName("ay.w")
    public int field1014;

    @ObfuscatedName("al.p(Lff;I)V")
    public static void method635(class158 arg0) {
        Statics.field1015 = arg0;
    }

    @ObfuscatedName("ay.k(Lde;B)V")
    public void method846(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method847(arg0, var2);
        }
    }

    @ObfuscatedName("ay.e(Lde;II)V")
    public void method847(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1011 = arg0.method2177();
            this.field1016 = arg0.method2314();
            this.field1014 = arg0.method2314();
        }
    }

    @ObfuscatedName("p.f(B)V")
    public static void method4() {
        field1012.method3374();
    }
}
