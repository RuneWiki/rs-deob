package deob;

@ObfuscatedName("af")
public class class44 extends class195 {

    @ObfuscatedName("af.g")
    public static class184 field1035 = new class184(64);

    @ObfuscatedName("af.a")
    public int field1037;

    @ObfuscatedName("af.m")
    public int field1038;

    @ObfuscatedName("af.s")
    public int field1041;

    @ObfuscatedName("fi.n(Lfi;I)V")
    public static void method2965(class158 arg0) {
        Statics.field1039 = arg0;
    }

    @ObfuscatedName("af.g(Ldp;I)V")
    public void method854(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method855(arg0, var2);
        }
    }

    @ObfuscatedName("af.a(Ldp;II)V")
    public void method855(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1037 = arg0.method2395();
            this.field1038 = arg0.method2211();
            this.field1041 = arg0.method2211();
        }
    }
}
