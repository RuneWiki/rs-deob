package deob;

@ObfuscatedName("hn")
public class class202 extends class470 {

    @ObfuscatedName("hn.ay")
    public static class289 field2091 = new class289(64);

    @ObfuscatedName("hn.ar")
    public int field2090;

    @ObfuscatedName("hn.am")
    public int field2088;

    @ObfuscatedName("hn.as")
    public int field2089;

    @ObfuscatedName("hn.aj")
    public static final int[] field2093 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2093[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("bw.aw(Lnd;B)V")
    public static void method690(class360 arg0) {
        Statics.field2092 = arg0;
    }

    @ObfuscatedName("hn.ay(Lty;I)V")
    public void method3480(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3481(arg0, var2);
        }
    }

    @ObfuscatedName("hn.ar(Lty;IB)V")
    public void method3481(class514 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2090 = arg0.method8246();
            this.field2088 = arg0.method8244();
            this.field2089 = arg0.method8244();
        }
    }
}
