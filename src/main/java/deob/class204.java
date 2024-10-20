package deob;

@ObfuscatedName("hg")
public class class204 extends class511 {

    @ObfuscatedName("hg.aw")
    public static class316 field2118 = new class316(64);

    @ObfuscatedName("hg.ak")
    public int field2120;

    @ObfuscatedName("hg.aj")
    public int field2121;

    @ObfuscatedName("hg.ai")
    public int field2124;

    @ObfuscatedName("hg.ay")
    public static final int[] field2123 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2123[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("fw.ap(Lpe;B)V")
    public static void method3289(class392 arg0) {
        Statics.field2119 = arg0;
    }

    @ObfuscatedName("hg.aw(Lvl;I)V")
    public void method3866(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3849(arg0, var2);
        }
    }

    @ObfuscatedName("hg.ak(Lvl;II)V")
    public void method3849(class558 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2120 = arg0.method9260();
            this.field2121 = arg0.method9258();
            this.field2124 = arg0.method9258();
        }
    }

    @ObfuscatedName("br.aj(I)V")
    public static void method693() {
        field2118.method5930();
    }
}
