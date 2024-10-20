package deob;

@ObfuscatedName("as")
public class class37 extends class172 {

    @ObfuscatedName("as.j")
    public static class168 field940 = new class168(64);

    @ObfuscatedName("as.f")
    public int field936;

    @ObfuscatedName("as.y")
    public int field935;

    @ObfuscatedName("as.x")
    public int field938;

    @ObfuscatedName("ek.c(Lew;I)V")
    public static void method2567(class150 arg0) {
        Statics.field934 = arg0;
    }

    @ObfuscatedName("as.j(Ldl;B)V")
    public void method762(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method775(arg0, var2);
        }
    }

    @ObfuscatedName("as.f(Ldl;II)V")
    public void method775(class125 arg0, int arg1) {
        if (arg1 == 1) {
            this.field936 = arg0.method2328();
            this.field935 = arg0.method2326();
            this.field938 = arg0.method2326();
        }
    }
}
