package deob;

@ObfuscatedName("hg")
public class class212 {

    @ObfuscatedName("hg.i")
    public static int[] field2614 = new int[32];

    @ObfuscatedName("hg.w")
    public static int[] field2612;

    @ObfuscatedName("hg.a")
    public static int[] field2613;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2614[var1] = var0 - 1;
            var0 += var0;
        }
        field2612 = new int[2000];
        field2613 = new int[2000];
    }

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.i(II)I")
    public static int method227(int arg0) {
        class251 var1 = (class251) class251.field3391.method3235((long) arg0);
        class251 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3392.method3768(14, arg0);
            class251 var4 = new class251();
            if (var3 != null) {
                var4.method4067(new class174(var3));
            }
            class251.field3391.method3234(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3390;
        int var7 = var2.field3393;
        int var8 = var2.field3394;
        int var9 = field2614[var8 - var7];
        return field2613[var6] >> var7 & var9;
    }

    @ObfuscatedName("co.w(III)V")
    public static void method1717(int arg0, int arg1) {
        class251 var2 = (class251) class251.field3391.method3235((long) arg0);
        class251 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3392.method3768(14, arg0);
            class251 var5 = new class251();
            if (var4 != null) {
                var5.method4067(new class174(var4));
            }
            class251.field3391.method3234(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3390;
        int var8 = var3.field3393;
        int var9 = var3.field3394;
        int var10 = field2614[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2613[var7] = field2613[var7] & ~var11 | arg1 << var8 & var11;
    }
}
