package deob;

@ObfuscatedName("hc")
public class class198 extends class488 {

    @ObfuscatedName("hc.aw")
    public static class304 field2067 = new class304(64);

    @ObfuscatedName("hc.al")
    public int field2060;

    @ObfuscatedName("hc.ai")
    public int field2061;

    @ObfuscatedName("hc.ar")
    public int field2064;

    @ObfuscatedName("hc.as")
    public static final int[] field2065 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2065[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("jv.aq(Lof;B)V")
    public static void method4256(class378 arg0) {
        Statics.field2063 = arg0;
    }

    @ObfuscatedName("hc.aw(Luq;B)V")
    public void method3485(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3486(arg0, var2);
        }
    }

    @ObfuscatedName("hc.al(Luq;IB)V")
    public void method3486(class534 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2060 = arg0.method8593();
            this.field2061 = arg0.method8591();
            this.field2064 = arg0.method8591();
        }
    }
}
