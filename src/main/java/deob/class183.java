package deob;

@ObfuscatedName("gz")
public class class183 extends class406 {

    @ObfuscatedName("gz.h")
    public static class256 field1986 = new class256(64);

    @ObfuscatedName("gz.w")
    public int field1988;

    @ObfuscatedName("gz.v")
    public int field1991;

    @ObfuscatedName("gz.c")
    public int field1987;

    @ObfuscatedName("gz.q")
    public static final int[] field1990 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1990[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("bq.s(Lls;I)V")
    public static void method918(class316 arg0) {
        Statics.field1994 = arg0;
    }

    @ObfuscatedName("dn.h(II)Lgz;")
    public static class183 method2581(int arg0) {
        class183 var1 = (class183) field1986.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1994.method5179(14, arg0);
        class183 var3 = new class183();
        if (var2 != null) {
            var3.method3151(new class444(var2));
        }
        field1986.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.w(Lqr;I)V")
    public void method3151(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3152(arg0, var2);
        }
    }

    @ObfuscatedName("gz.v(Lqr;II)V")
    public void method3152(class444 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1988 = arg0.method7120();
            this.field1991 = arg0.method6929();
            this.field1987 = arg0.method6929();
        }
    }

    @ObfuscatedName("ca.c(I)V")
    public static void method2371() {
        field1986.method4603();
    }
}
