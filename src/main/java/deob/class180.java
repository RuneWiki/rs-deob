package deob;

@ObfuscatedName("fu")
public class class180 {

    @ObfuscatedName("fu.l")
    public static int[] field2960 = new int[32];

    @ObfuscatedName("fu.g")
    public static int[] field2958;

    @ObfuscatedName("fu.r")
    public static int[] field2959;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2960[var1] = var0 - 1;
            var0 += var0;
        }
        field2958 = new int[2000];
        field2959 = new int[2000];
    }

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.l(II)I")
    public static int method1139(int arg0) {
        class51 var1 = class51.method595(arg0);
        int var2 = var1.field1120;
        int var3 = var1.field1121;
        int var4 = var1.field1125;
        int var5 = field2960[var4 - var3];
        return field2959[var2] >> var3 & var5;
    }

    @ObfuscatedName("df.g(III)V")
    public static void method2749(int arg0, int arg1) {
        class51 var2 = (class51) class51.field1118.method3653((long) arg0);
        class51 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1126.method3210(14, arg0);
            class51 var5 = new class51();
            if (var4 != null) {
                var5.method1050(new class123(var4));
            }
            class51.field1118.method3655(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1120;
        int var8 = var3.field1121;
        int var9 = var3.field1125;
        int var10 = field2960[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2959[var7] = field2959[var7] & ~var11 | arg1 << var8 & var11;
    }
}
