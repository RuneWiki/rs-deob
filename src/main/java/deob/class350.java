package deob;

@ObfuscatedName("nb")
public class class350 {

    @ObfuscatedName("nb.ap")
    public static int[] field3776 = new int[32];

    @ObfuscatedName("nb.ak")
    public static int[] field3775;

    @ObfuscatedName("nb.aj")
    public static int[] field3773;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3776[var1] = var0 - 1;
            var0 += var0;
        }
        field3775 = new int[5000];
        field3773 = new int[5000];
    }

    public class350() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.ap(IB)I")
    public static int method2339(int arg0) {
        class204 var1 = (class204) class204.field2118.method5928((long) arg0);
        class204 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2119.method7009(14, arg0);
            class204 var4 = new class204();
            if (var3 != null) {
                var4.method3866(new class558(var3));
            }
            class204.field2118.method5931(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2120;
        int var7 = var2.field2121;
        int var8 = var2.field2124;
        int var9 = field3776[var8 - var7];
        return field3773[var6] >> var7 & var9;
    }

    @ObfuscatedName("lk.aw(IIB)V")
    public static void method5796(int arg0, int arg1) {
        class204 var2 = (class204) class204.field2118.method5928((long) arg0);
        class204 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2119.method7009(14, arg0);
            class204 var5 = new class204();
            if (var4 != null) {
                var5.method3866(new class558(var4));
            }
            class204.field2118.method5931(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2120;
        int var8 = var3.field2121;
        int var9 = var3.field2124;
        int var10 = field3776[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field3773[var7] = field3773[var7] & ~var11 | arg1 << var8 & var11;
    }
}
