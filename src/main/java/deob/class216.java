package deob;

@ObfuscatedName("ij")
public class class216 extends class489 {

    @ObfuscatedName("ij.ah")
    public static class304 field2206 = new class304(64);

    @ObfuscatedName("ij.af")
    public int field2203;

    @ObfuscatedName("ij.at")
    public int field2204;

    @ObfuscatedName("ij.an")
    public int field2201;

    @ObfuscatedName("ij.ao")
    public static final int[] field2205 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2205[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("oz.az(Loc;I)V")
    public static void method6523(class379 arg0) {
        Statics.field2202 = arg0;
    }

    @ObfuscatedName("ij.ah(Lur;B)V")
    public void method3663(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3666(arg0, var2);
        }
    }

    @ObfuscatedName("ij.af(Lur;II)V")
    public void method3666(class535 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2203 = arg0.method8670();
            this.field2204 = arg0.method8462();
            this.field2201 = arg0.method8462();
        }
    }

    @ObfuscatedName("am.at(I)V")
    public static void method286() {
        field2206.method5339();
    }
}
