package deob;

import java.util.Arrays;

@ObfuscatedName("no")
public class class351 {

    @ObfuscatedName("no.ac")
    public static int[] field3751 = new int[32];

    @ObfuscatedName("no.ag")
    public static int[] field3750;

    @ObfuscatedName("no.am")
    public static int[] field3752;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3751[var1] = var0 - 1;
            var0 += var0;
        }
        field3750 = new int[5000];
        field3752 = new int[5000];
    }

    public class351() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fi.ac(IB)I")
    public static int method3259(int arg0) {
        class204 var1 = (class204) class204.field2113.method5733((long) arg0);
        class204 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2116.method6782(14, arg0);
            class204 var4 = new class204();
            if (var3 != null) {
                var4.method3703(new class551(var3));
            }
            class204.field2113.method5735(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2120;
        int var7 = var2.field2115;
        int var8 = var2.field2114;
        int var9 = field3751[var8 - var7];
        return field3752[var6] >> var7 & var9;
    }

    @ObfuscatedName("ga.ae(IIB)V")
    public static void method3292(int arg0, int arg1) {
        class204 var2 = (class204) class204.field2113.method5733((long) arg0);
        class204 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2116.method6782(14, arg0);
            class204 var5 = new class204();
            if (var4 != null) {
                var5.method3703(new class551(var4));
            }
            class204.field2113.method5735(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2120;
        int var8 = var3.field2115;
        int var9 = var3.field2114;
        int var10 = field3751[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field3752[var7] = field3752[var7] & ~var11 | arg1 << var8 & var11;
    }

    @ObfuscatedName("me.ag(I)V")
    public static void method5760() {
        Arrays.fill(field3750, 0);
        Arrays.fill(field3752, 0);
    }
}
