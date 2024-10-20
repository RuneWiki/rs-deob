package deob;

@ObfuscatedName("id")
public class class238 {

    @ObfuscatedName("id.d")
    public static int[] field2785 = new int[32];

    @ObfuscatedName("id.z")
    public static int[] field2784;

    @ObfuscatedName("id.n")
    public static int[] field2783;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2785[var1] = var0 - 1;
            var0 += var0;
        }
        field2784 = new int[2000];
        field2783 = new int[2000];
    }

    public class238() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.d(IB)I")
    public static int method728(int arg0) {
        class278 var1 = (class278) class278.field3536.method3707((long) arg0);
        class278 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3535.method4273(14, arg0);
            class278 var4 = new class278();
            if (var3 != null) {
                var4.method4611(new class195(var3));
            }
            class278.field3536.method3697(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3537;
        int var7 = var2.field3538;
        int var8 = var2.field3539;
        int var9 = field2785[var8 - var7];
        return field2783[var6] >> var7 & var9;
    }

    @ObfuscatedName("be.z(III)V")
    public static void method959(int arg0, int arg1) {
        class278 var2 = (class278) class278.field3536.method3707((long) arg0);
        class278 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3535.method4273(14, arg0);
            class278 var5 = new class278();
            if (var4 != null) {
                var5.method4611(new class195(var4));
            }
            class278.field3536.method3697(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3537;
        int var8 = var3.field3538;
        int var9 = var3.field3539;
        int var10 = field2785[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2783[var7] = field2783[var7] & ~var11 | arg1 << var8 & var11;
    }
}
