package deob;

@ObfuscatedName("hl")
public class class204 extends class504 {

    @ObfuscatedName("hl.ae")
    public static class317 field2113 = new class317(64);

    @ObfuscatedName("hl.ag")
    public int field2120;

    @ObfuscatedName("hl.am")
    public int field2115;

    @ObfuscatedName("hl.ax")
    public int field2114;

    @ObfuscatedName("hl.aq")
    public static final int[] field2117 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2117[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("he.ac(Lpo;I)V")
    public static void method3499(class391 arg0) {
        Statics.field2116 = arg0;
    }

    @ObfuscatedName("hl.ae(Lvf;I)V")
    public void method3703(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3699(arg0, var2);
        }
    }

    @ObfuscatedName("hl.ag(Lvf;II)V")
    public void method3699(class551 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2120 = arg0.method9119();
            this.field2115 = arg0.method8955();
            this.field2114 = arg0.method8955();
        }
    }

    @ObfuscatedName("gh.am(I)V")
    public static void method3432() {
        field2113.method5736();
    }
}
