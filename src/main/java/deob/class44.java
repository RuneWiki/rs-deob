package deob;

@ObfuscatedName("ay")
public class class44 extends class182 {

    @ObfuscatedName("ay.c")
    public static class171 field1004 = new class171(64);

    @ObfuscatedName("ay.h")
    public int field1010 = 0;

    @ObfuscatedName("i.i(Ler;I)V")
    public static void method4(class146 arg0) {
        Statics.field1009 = arg0;
    }

    @ObfuscatedName("ay.c(Ldm;I)V")
    public void method841(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method842(arg0, var2);
        }
    }

    @ObfuscatedName("ay.h(Ldm;II)V")
    public void method842(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1010 = arg0.method2313();
        }
    }
}
