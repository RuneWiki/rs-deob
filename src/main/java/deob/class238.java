package deob;

@ObfuscatedName("if")
public class class238 {

    @ObfuscatedName("if.o")
    public static int[] field2777 = new int[32];

    @ObfuscatedName("if.k")
    public static int[] field2778;

    @ObfuscatedName("if.t")
    public static int[] field2779;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2777[var1] = var0 - 1;
            var0 += var0;
        }
        field2778 = new int[2000];
        field2779 = new int[2000];
    }

    public class238() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.o(II)I")
    public static int method1854(int arg0) {
        class278 var1 = (class278) class278.field3540.method3601((long) arg0);
        class278 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3542.method4241(14, arg0);
            class278 var4 = new class278();
            if (var3 != null) {
                var4.method4507(new class195(var3));
            }
            class278.field3540.method3603(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3541;
        int var7 = var2.field3544;
        int var8 = var2.field3543;
        int var9 = field2777[var8 - var7];
        return field2779[var6] >> var7 & var9;
    }

    @ObfuscatedName("lr.k(IIB)V")
    public static void method5187(int arg0, int arg1) {
        class278 var2 = (class278) class278.field3540.method3601((long) arg0);
        class278 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3542.method4241(14, arg0);
            class278 var5 = new class278();
            if (var4 != null) {
                var5.method4507(new class195(var4));
            }
            class278.field3540.method3603(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3541;
        int var8 = var3.field3544;
        int var9 = var3.field3543;
        int var10 = field2777[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2779[var7] = field2779[var7] & ~var11 | arg1 << var8 & var11;
    }
}
