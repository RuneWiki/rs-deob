package deob;

@ObfuscatedName("gb")
public class class190 extends class425 {

    @ObfuscatedName("gb.f")
    public static class266 field2039 = new class266(64);

    @ObfuscatedName("gb.c")
    public int field2037;

    @ObfuscatedName("gb.x")
    public int field2038;

    @ObfuscatedName("gb.h")
    public int field2040;

    @ObfuscatedName("gb.j")
    public static final int[] field2041 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2041[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("cx.a(Llg;B)V")
    public static void method2473(class330 arg0) {
        Statics.field4195 = arg0;
    }

    @ObfuscatedName("gb.c(Lqr;I)V")
    public void method3319(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3317(arg0, var2);
        }
    }

    @ObfuscatedName("gb.x(Lqr;II)V")
    public void method3317(class464 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2037 = arg0.method7716();
            this.field2038 = arg0.method7735();
            this.field2040 = arg0.method7735();
        }
    }
}
