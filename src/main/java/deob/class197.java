package deob;

@ObfuscatedName("hg")
public class class197 extends class444 {

    @ObfuscatedName("hg.an")
    public static class280 field2105 = new class280(64);

    @ObfuscatedName("hg.aw")
    public int field2107;

    @ObfuscatedName("hg.ac")
    public int field2106;

    @ObfuscatedName("hg.au")
    public int field2103;

    @ObfuscatedName("hg.ab")
    public static final int[] field2108 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2108[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("cb.af(Lnm;I)V")
    public static void method1947(class344 arg0) {
        Statics.field2104 = arg0;
    }

    @ObfuscatedName("gs.an(II)Lhg;")
    public static class197 method3150(int arg0) {
        class197 var1 = (class197) field2105.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2104.method6090(14, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3558(new class489(var2));
        }
        field2105.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hg.aw(Lsg;I)V")
    public void method3558(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3565(arg0, var2);
        }
    }

    @ObfuscatedName("hg.ac(Lsg;II)V")
    public void method3565(class489 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2107 = arg0.method8250();
            this.field2106 = arg0.method8248();
            this.field2103 = arg0.method8248();
        }
    }
}
