package deob;

@ObfuscatedName("ec")
public class class152 extends class349 {

    @ObfuscatedName("ec.t")
    public static class223 field1689 = new class223(64);

    @ObfuscatedName("ec.v")
    public int field1690;

    @ObfuscatedName("ec.j")
    public int field1695;

    @ObfuscatedName("ec.l")
    public int field1688;

    @ObfuscatedName("ec.n")
    public static final int[] field1691 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1691[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("ai.s(Ljy;B)V")
    public static void method1363(class277 arg0) {
        Statics.field1692 = arg0;
    }

    @ObfuscatedName("ec.t(Lnv;I)V")
    public void method2577(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2578(arg0, var2);
        }
    }

    @ObfuscatedName("ec.v(Lnv;II)V")
    public void method2578(class385 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1690 = arg0.method6053();
            this.field1695 = arg0.method5958();
            this.field1688 = arg0.method5958();
        }
    }
}
