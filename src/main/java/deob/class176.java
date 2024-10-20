package deob;

@ObfuscatedName("fv")
public class class176 extends class387 {

    @ObfuscatedName("fv.l")
    public static class249 field1926 = new class249(64);

    @ObfuscatedName("fv.s")
    public int field1928;

    @ObfuscatedName("fv.e")
    public int field1925;

    @ObfuscatedName("fv.r")
    public int field1929;

    @ObfuscatedName("fv.o")
    public static final int[] field1930 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1930[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("jx.c(Lkq;I)V")
    public static void method4785(class307 arg0) {
        Statics.field1927 = arg0;
    }

    @ObfuscatedName("fv.l(Lpi;I)V")
    public void method3041(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method3042(arg0, var2);
        }
    }

    @ObfuscatedName("fv.s(Lpi;II)V")
    public void method3042(class421 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1928 = arg0.method6666();
            this.field1925 = arg0.method6686();
            this.field1929 = arg0.method6686();
        }
    }
}
