package deob;

@ObfuscatedName("hb")
public class class202 extends class469 {

    @ObfuscatedName("hb.ae")
    public static class288 field2125 = new class288(64);

    @ObfuscatedName("hb.ao")
    public int field2126;

    @ObfuscatedName("hb.at")
    public int field2127;

    @ObfuscatedName("hb.ac")
    public int field2131;

    @ObfuscatedName("hb.ai")
    public static final int[] field2124 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2124[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("lg.au(Lnu;I)V")
    public static void method5202(class359 arg0) {
        Statics.field2129 = arg0;
    }

    @ObfuscatedName("oq.ae(II)Lhb;")
    public static class202 method6559(int arg0) {
        class202 var1 = (class202) field2125.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2129.method6128(14, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3500(new class515(var2));
        }
        field2125.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hb.ao(Ltm;I)V")
    public void method3500(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3501(arg0, var2);
        }
    }

    @ObfuscatedName("hb.at(Ltm;II)V")
    public void method3501(class515 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2126 = arg0.method8448();
            this.field2127 = arg0.method8300();
            this.field2131 = arg0.method8300();
        }
    }
}
