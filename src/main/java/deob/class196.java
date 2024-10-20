package deob;

@ObfuscatedName("gh")
public class class196 extends class435 {

    @ObfuscatedName("gh.w")
    public static class273 field2111 = new class273(64);

    @ObfuscatedName("gh.v")
    public int field2112;

    @ObfuscatedName("gh.s")
    public int field2113;

    @ObfuscatedName("gh.z")
    public int field2114;

    @ObfuscatedName("gh.j")
    public static final int[] field2115 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2115[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("fp.w(IB)Lgh;")
    public static class196 method3300(int arg0) {
        class196 var1 = (class196) field2111.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field130.method5990(14, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3512(new class474(var2));
        }
        field2111.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.v(Lrd;I)V")
    public void method3512(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3517(arg0, var2);
        }
    }

    @ObfuscatedName("gh.s(Lrd;IB)V")
    public void method3517(class474 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2112 = arg0.method8032();
            this.field2113 = arg0.method7964();
            this.field2114 = arg0.method7964();
        }
    }

    @ObfuscatedName("lf.z(I)V")
    public static void method5884() {
        field2111.method5033();
    }
}
