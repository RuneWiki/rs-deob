package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("gd")
public final class class183 {

    @ObfuscatedName("gd.n")
    public boolean field2077 = false;

    @ObfuscatedName("gd.c")
    public boolean field2065 = false;

    @ObfuscatedName("gd.m")
    public class202 field2078;

    @ObfuscatedName("gd.k")
    public class413 field2067;

    @ObfuscatedName("gd.o")
    public HashMap field2068;

    @ObfuscatedName("gd.g")
    public class182[][] field2064;

    @ObfuscatedName("gd.z")
    public HashMap field2070 = new HashMap();

    @ObfuscatedName("gd.a")
    public class412[] field2071;

    @ObfuscatedName("gd.u")
    public final class290 field2072;

    @ObfuscatedName("gd.e")
    public final class290 field2073;

    @ObfuscatedName("gd.l")
    public final HashMap field2074;

    @ObfuscatedName("gd.y")
    public int field2076;

    @ObfuscatedName("gd.v")
    public int field2066;

    @ObfuscatedName("gd.f")
    public int field2075;

    @ObfuscatedName("gd.s")
    public int field2069;

    @ObfuscatedName("gd.h")
    public int field2079 = 0;

    public class183(class412[] arg0, HashMap arg1, class290 arg2, class290 arg3) {
        this.field2071 = arg0;
        this.field2074 = arg1;
        this.field2072 = arg2;
        this.field2073 = arg3;
    }

    @ObfuscatedName("gd.n(Lkk;Ljava/lang/String;ZI)V")
    public void method3395(class290 arg0, String arg1, boolean arg2) {
        if (this.field2065) {
            return;
        }
        this.field2077 = false;
        this.field2065 = true;
        System.nanoTime();
        int var4 = arg0.method4725(class200.field2200.field2205);
        int var5 = arg0.method4775(var4, arg1);
        class400 var6 = new class400(arg0.method4728(class200.field2200.field2205, arg1));
        class400 var7 = new class400(arg0.method4728(class200.field2204.field2205, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2078 = new class202();
        try {
            this.field2078.method3547(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2078.method3200();
        this.field2078.method3218();
        this.field2078.method3202();
        this.field2076 = this.field2078.method3196() * 64;
        this.field2066 = this.field2078.method3198() * 64;
        this.field2075 = (this.field2078.method3197() - this.field2078.method3196() + 1) * 64;
        this.field2069 = (this.field2078.method3244() - this.field2078.method3198() + 1) * 64;
        int var9 = this.field2078.method3197() - this.field2078.method3196() + 1;
        int var10 = this.field2078.method3244() - this.field2078.method3198() + 1;
        System.nanoTime();
        System.nanoTime();
        class182.method2062();
        this.field2064 = new class182[var9][var10];
        Iterator var11 = this.field2078.field2208.iterator();
        while (var11.hasNext()) {
            class176 var12 = (class176) var11.next();
            int var13 = var12.field2136;
            int var14 = var12.field2137;
            int var15 = var13 - this.field2078.method3196();
            int var16 = var14 - this.field2078.method3198();
            this.field2064[var15][var16] = new class182(var13, var14, this.field2078.method3190(), this.field2074);
            this.field2064[var15][var16].method3271(var12, this.field2078.field2207);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2064[var17][var18] == null) {
                    this.field2064[var17][var18] = new class182(this.field2078.method3196() + var17, this.field2078.method3198() + var18, this.field2078.method3190(), this.field2074);
                    this.field2064[var17][var18].method3272(this.field2078.field2209, this.field2078.field2207);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4727(class200.field2202.field2205, arg1)) {
            byte[] var19 = arg0.method4728(class200.field2202.field2205, arg1);
            this.field2067 = class29.method259(var19);
        }
        System.nanoTime();
        arg0.method4722();
        arg0.method4723();
        this.field2077 = true;
    }

    @ObfuscatedName("gd.c(B)V")
    public final void method3413() {
        this.field2068 = null;
    }

    @ObfuscatedName("gd.m(IIIIIIIIB)V")
    public final void method3397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4346;
        int var10 = Statics.field4343;
        int var11 = Statics.field4345;
        int[] var12 = new int[4];
        class409.method6521(var12);
        class191 var13 = this.method3401(arg0, arg1, arg2, arg3);
        float var14 = this.method3405(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2079 = var15;
        if (!this.field2070.containsKey(var15)) {
            class203 var16 = new class203(var15);
            var16.method3564();
            this.field2070.put(var15, var16);
        }
        int var17 = var13.field2155 + var13.field2152 - 1;
        int var18 = var13.field2151 + var13.field2150 - 1;
        for (int var19 = var13.field2152; var19 <= var17; var19++) {
            for (int var20 = var13.field2151; var20 <= var18; var20++) {
                this.field2064[var19][var20].method3315(var15, (class203) this.field2070.get(var15), this.field2071, this.field2072, this.field2073);
            }
        }
        class409.method6517(var9, var10, var11);
        class409.method6522(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2076 + arg0;
        int var23 = this.field2066 + arg1;
        for (int var24 = var13.field2152; var24 < var13.field2155 + var13.field2152; var24++) {
            for (int var25 = var13.field2151; var25 < var13.field2151 + var13.field2150; var25++) {
                this.field2064[var24][var25].method3279((this.field2064[var24][var25].field2053 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2064[var24][var25].field2061 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("gd.k(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method3410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class191 var14 = this.method3401(arg0, arg1, arg2, arg3);
        float var15 = this.method3405(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2076 + arg0;
        int var18 = this.field2066 + arg1;
        for (int var19 = var14.field2152; var19 < var14.field2155 + var14.field2152; var19++) {
            for (int var20 = var14.field2151; var20 < var14.field2151 + var14.field2150; var20++) {
                if (arg12) {
                    this.field2064[var19][var20].method3275();
                }
                this.field2064[var19][var20].method3280((this.field2064[var19][var20].field2053 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2064[var19][var20].field2061 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2152; var21 < var14.field2155 + var14.field2152; var21++) {
            for (int var22 = var14.field2151; var22 < var14.field2151 + var14.field2150; var22++) {
                this.field2064[var21][var22].method3281(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("gd.o(IIIILjava/util/HashSet;III)V")
    public void method3414(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2067 == null) {
            return;
        }
        this.field2067.method6697(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2068 == null) {
            this.method3394();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2068.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class199 var12 = (class199) var11.next();
                int var13 = (var12.field2194.field3007 - this.field2076) * arg2 / this.field2075;
                int var14 = arg3 - (var12.field2194.field3008 - this.field2066) * arg3 / this.field2069;
                class409.method6525(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("gd.g(IIIIIIIIIII)Ljava/util/List;")
    public List method3399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2077) {
            return var11;
        }
        class191 var12 = this.method3401(arg0, arg1, arg2, arg3);
        float var13 = this.method3405(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2076 + arg0;
        int var16 = this.field2066 + arg1;
        for (int var17 = var12.field2152; var17 < var12.field2155 + var12.field2152; var17++) {
            for (int var18 = var12.field2151; var18 < var12.field2151 + var12.field2150; var18++) {
                List var19 = this.field2064[var17][var18].method3301((this.field2064[var17][var18].field2053 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2064[var17][var18].field2061 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("gd.z(IIIIB)Lgf;")
    public class191 method3401(int arg0, int arg1, int arg2, int arg3) {
        class191 var5 = new class191(this);
        int var6 = this.field2076 + arg0;
        int var7 = this.field2066 + arg1;
        int var8 = this.field2076 + arg2;
        int var9 = this.field2066 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2155 = var12 - var10 + 1;
        var5.field2150 = var13 - var11 + 1;
        var5.field2152 = var10 - this.field2078.method3196();
        var5.field2151 = var11 - this.field2078.method3198();
        if (var5.field2152 < 0) {
            var5.field2155 += var5.field2152;
            var5.field2152 = 0;
        }
        if (var5.field2152 > this.field2064.length - var5.field2155) {
            var5.field2155 = this.field2064.length - var5.field2152;
        }
        if (var5.field2151 < 0) {
            var5.field2150 += var5.field2151;
            var5.field2151 = 0;
        }
        if (var5.field2151 > this.field2064[0].length - var5.field2150) {
            var5.field2150 = this.field2064[0].length - var5.field2151;
        }
        var5.field2155 = Math.min(var5.field2155, this.field2064.length);
        var5.field2150 = Math.min(var5.field2150, this.field2064[0].length);
        return var5;
    }

    @ObfuscatedName("gd.a(I)Z")
    public boolean method3431() {
        return this.field2077;
    }

    @ObfuscatedName("gd.u(B)Ljava/util/HashMap;")
    public HashMap method3403() {
        this.method3394();
        return this.field2068;
    }

    @ObfuscatedName("gd.e(B)V")
    public void method3394() {
        if (this.field2068 == null) {
            this.field2068 = new HashMap();
        }
        this.field2068.clear();
        for (int var1 = 0; var1 < this.field2064.length; var1++) {
            for (int var2 = 0; var2 < this.field2064[var1].length; var2++) {
                List var3 = this.field2064[var1][var2].method3302();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class199 var5 = (class199) var4.next();
                    if (var5.method3528()) {
                        int var6 = var5.method3144();
                        if (this.field2068.containsKey(var6)) {
                            List var8 = (List) this.field2068.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2068.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gd.l(III)F")
    public float method3405(int arg0, int arg1) {
        float var3 = (float) arg0 / (float) arg1;
        if (var3 > 8.0F) {
            return 8.0F;
        } else if (var3 < 1.0F) {
            return 1.0F;
        } else {
            int var4 = Math.round(var3);
            return Math.abs((float) var4 - var3) < 0.05F ? (float) var4 : var3;
        }
    }
}
