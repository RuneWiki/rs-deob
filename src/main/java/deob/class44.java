package deob;

@ObfuscatedName("au")
public class class44 extends class183 {

    @ObfuscatedName("au.g")
    public static class172 field996 = new class172(64);

    @ObfuscatedName("au.x")
    public int field998 = 0;

    @ObfuscatedName("ao.p(Ler;I)V")
    public static void method627(class147 arg0) {
        Statics.field1000 = arg0;
    }

    @ObfuscatedName("au.g(Ldp;I)V")
    public void method869(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method868(arg0, var2);
        }
    }

    @ObfuscatedName("au.x(Ldp;II)V")
    public void method868(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field998 = arg0.method2175();
        }
    }
}
