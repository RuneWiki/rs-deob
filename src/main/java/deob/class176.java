package deob;

@ObfuscatedName("fa")
public class class176 {

    @ObfuscatedName("fa.h")
    public static int[] field2893 = new int[32];

    @ObfuscatedName("fa.m")
    public static int[] field2894;

    @ObfuscatedName("fa.i")
    public static int[] field2896;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2893[var1] = var0 - 1;
            var0 += var0;
        }
        field2894 = new int[2000];
        field2896 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.h(II)I")
    public static int method624(int arg0) {
        class48 var1 = (class48) class48.field1071.method3472((long) arg0);
        class48 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1083.method3051(14, arg0);
            class48 var4 = new class48();
            if (var3 != null) {
                var4.method935(new class119(var3));
            }
            class48.field1071.method3474(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field1073;
        int var7 = var2.field1084;
        int var8 = var2.field1080;
        int var9 = field2893[var8 - var7];
        return field2896[var6] >> var7 & var9;
    }

    @ObfuscatedName("ex.m(III)V")
    public static void method2733(int arg0, int arg1) {
        class48 var2 = (class48) class48.field1071.method3472((long) arg0);
        class48 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1083.method3051(14, arg0);
            class48 var5 = new class48();
            if (var4 != null) {
                var5.method935(new class119(var4));
            }
            class48.field1071.method3474(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field1073;
        int var8 = var3.field1084;
        int var9 = var3.field1080;
        int var10 = field2893[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2896[var7] = field2896[var7] & ~var11 | arg1 << var8 & var11;
    }
}
