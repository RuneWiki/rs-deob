package deob;

@ObfuscatedName("fj")
public class class176 {

    @ObfuscatedName("fj.f")
    public static int[] field2901 = new int[32];

    @ObfuscatedName("fj.s")
    public static int[] field2899;

    @ObfuscatedName("fj.q")
    public static int[] field2900;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2901[var1] = var0 - 1;
            var0 += var0;
        }
        field2899 = new int[2000];
        field2900 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.f(II)I")
    public static int method1774(int arg0) {
        class48 var1 = (class48) class48.field1072.method3497((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1069.method3038(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method962(new class119(var3));
            }
            class48.field1072.method3508(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1070;
        int var7 = var2.field1074;
        int var8 = var2.field1071;
        int var9 = field2901[var8 - var7];
        return field2900[var6] >> var7 & var9;
    }

    @ObfuscatedName("eo.s(III)V")
    public static void method2922(int arg0, int arg1) {
        class48 var2 = (class48) class48.field1072.method3497((long) arg0);
        class48 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1069.method3038(14, arg0);
            class48 var5 = new class48();
            if (var4 != null) {
                var5.method962(new class119(var4));
            }
            class48.field1072.method3508(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1070;
        int var8 = var3.field1074;
        int var9 = var3.field1071;
        int var10 = field2901[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2900[var7] = field2900[var7] & ~var11 | arg1 << var8 & var11;
    }
}
