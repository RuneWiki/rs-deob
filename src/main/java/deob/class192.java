package deob;

@ObfuscatedName("gu")
public class class192 extends class428 {

    @ObfuscatedName("gu.e")
    public static class269 field2108 = new class269(64);

    @ObfuscatedName("gu.v")
    public int field2109;

    @ObfuscatedName("gu.x")
    public int field2110;

    @ObfuscatedName("gu.m")
    public int field2111;

    @ObfuscatedName("gu.q")
    public static final int[] field2113 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2113[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("gf.h(Lly;I)V")
    public static void method3286(class333 arg0) {
        Statics.field2107 = arg0;
    }

    @ObfuscatedName("gu.e(Lqy;I)V")
    public void method3424(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3425(arg0, var2);
        }
    }

    @ObfuscatedName("gu.v(Lqy;II)V")
    public void method3425(class467 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2109 = arg0.method7794();
            this.field2110 = arg0.method7792();
            this.field2111 = arg0.method7792();
        }
    }
}
