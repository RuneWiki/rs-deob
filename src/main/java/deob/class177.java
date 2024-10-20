package deob;

@ObfuscatedName("fc")
public class class177 {

    @ObfuscatedName("fc.j")
    public static int[] field2903 = new int[32];

    @ObfuscatedName("fc.h")
    public static int[] field2902;

    @ObfuscatedName("fc.m")
    public static int[] field2901;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2903[var1] = var0 - 1;
            var0 += var0;
        }
        field2902 = new int[2000];
        field2901 = new int[2000];
    }

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.j(II)I")
    public static int method1227(int arg0) {
        class48 var1 = (class48) class48.field1048.method3460((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1057.method3011(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method968(new class120(var3));
            }
            class48.field1048.method3462(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1052;
        int var7 = var2.field1050;
        int var8 = var2.field1051;
        int var9 = field2903[var8 - var7];
        return field2901[var6] >> var7 & var9;
    }

    @ObfuscatedName("y.h(III)V")
    public static void method194(int arg0, int arg1) {
        class48 var2 = class48.method738(arg0);
        int var3 = var2.field1052;
        int var4 = var2.field1050;
        int var5 = var2.field1051;
        int var6 = field2903[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        field2901[var3] = field2901[var3] & ~var7 | arg1 << var4 & var7;
    }
}
