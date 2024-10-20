package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("gd")
public final class class183 {

    @ObfuscatedName("gd.l")
    public boolean field2076 = false;

    @ObfuscatedName("gd.q")
    public boolean field2071 = false;

    @ObfuscatedName("gd.f")
    public class202 field2082;

    @ObfuscatedName("gd.j")
    public class414 field2073;

    @ObfuscatedName("gd.m")
    public HashMap field2074;

    @ObfuscatedName("gd.k")
    public class182[][] field2075;

    @ObfuscatedName("gd.t")
    public HashMap field2079 = new HashMap();

    @ObfuscatedName("gd.a")
    public class413[] field2077;

    @ObfuscatedName("gd.e")
    public final class290 field2078;

    @ObfuscatedName("gd.i")
    public final class290 field2070;

    @ObfuscatedName("gd.y")
    public final HashMap field2080;

    @ObfuscatedName("gd.w")
    public int field2081;

    @ObfuscatedName("gd.g")
    public int field2083;

    @ObfuscatedName("gd.v")
    public int field2072;

    @ObfuscatedName("gd.s")
    public int field2084;

    @ObfuscatedName("gd.c")
    public int field2085 = 0;

    public class183(class413[] arg0, HashMap arg1, class290 arg2, class290 arg3) {
        this.field2077 = arg0;
        this.field2080 = arg1;
        this.field2078 = arg2;
        this.field2070 = arg3;
    }

    @ObfuscatedName("gd.l(Lkl;Ljava/lang/String;ZI)V")
    public void method3465(class290 arg0, String arg1, boolean arg2) {
        if (this.field2071) {
            return;
        }
        this.field2076 = false;
        this.field2071 = true;
        System.nanoTime();
        int var4 = arg0.method4771(class200.field2221.field2220);
        int var5 = arg0.method4848(var4, arg1);
        class401 var6 = new class401(arg0.method4807(class200.field2221.field2220, arg1));
        class401 var7 = new class401(arg0.method4807(class200.field2216.field2220, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2082 = new class202();
        try {
            this.field2082.method3592(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2082.method3268();
        this.field2082.method3252();
        this.field2082.method3242();
        this.field2081 = this.field2082.method3247() * 64;
        this.field2083 = this.field2082.method3249() * 64;
        this.field2072 = (this.field2082.method3248() - this.field2082.method3247() + 1) * 64;
        this.field2084 = (this.field2082.method3250() - this.field2082.method3249() + 1) * 64;
        int var9 = this.field2082.method3248() - this.field2082.method3247() + 1;
        int var10 = this.field2082.method3250() - this.field2082.method3249() + 1;
        System.nanoTime();
        System.nanoTime();
        class182.method219();
        this.field2075 = new class182[var9][var10];
        Iterator var11 = this.field2082.field2223.iterator();
        while (var11.hasNext()) {
            class176 var12 = (class176) var11.next();
            int var13 = var12.field2153;
            int var14 = var12.field2148;
            int var15 = var13 - this.field2082.method3247();
            int var16 = var14 - this.field2082.method3249();
            this.field2075[var15][var16] = new class182(var13, var14, this.field2082.method3245(), this.field2080);
            this.field2075[var15][var16].method3321(var12, this.field2082.field2225);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2075[var17][var18] == null) {
                    this.field2075[var17][var18] = new class182(this.field2082.method3247() + var17, this.field2082.method3249() + var18, this.field2082.method3245(), this.field2080);
                    this.field2075[var17][var18].method3314(this.field2082.field2224, this.field2082.field2225);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4773(class200.field2217.field2220, arg1)) {
            byte[] var19 = arg0.method4807(class200.field2217.field2220, arg1);
            this.field2073 = class29.method2511(var19);
        }
        System.nanoTime();
        arg0.method4823();
        arg0.method4841();
        this.field2076 = true;
    }

    @ObfuscatedName("gd.q(I)V")
    public final void method3449() {
        this.field2074 = null;
    }

    @ObfuscatedName("gd.f(IIIIIIIII)V")
    public final void method3438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4357;
        int var10 = Statics.field4358;
        int var11 = Statics.field4359;
        int[] var12 = new int[4];
        class410.method6556(var12);
        class191 var13 = this.method3442(arg0, arg1, arg2, arg3);
        float var14 = this.method3445(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2085 = var15;
        if (!this.field2079.containsKey(var15)) {
            class203 var16 = new class203(var15);
            var16.method3604();
            this.field2079.put(var15, var16);
        }
        int var17 = var13.field2165 + var13.field2164 - 1;
        int var18 = var13.field2167 + var13.field2163 - 1;
        for (int var19 = var13.field2164; var19 <= var17; var19++) {
            for (int var20 = var13.field2167; var20 <= var18; var20++) {
                this.field2075[var19][var20].method3365(var15, (class203) this.field2079.get(var15), this.field2077, this.field2078, this.field2070);
            }
        }
        class410.method6551(var9, var10, var11);
        class410.method6557(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2081 + arg0;
        int var23 = this.field2083 + arg1;
        for (int var24 = var13.field2164; var24 < var13.field2165 + var13.field2164; var24++) {
            for (int var25 = var13.field2167; var25 < var13.field2167 + var13.field2163; var25++) {
                this.field2075[var24][var25].method3312((this.field2075[var24][var25].field2060 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2075[var24][var25].field2061 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("gd.j(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method3463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class191 var14 = this.method3442(arg0, arg1, arg2, arg3);
        float var15 = this.method3445(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2081 + arg0;
        int var18 = this.field2083 + arg1;
        for (int var19 = var14.field2164; var19 < var14.field2165 + var14.field2164; var19++) {
            for (int var20 = var14.field2167; var20 < var14.field2167 + var14.field2163; var20++) {
                if (arg12) {
                    this.field2075[var19][var20].method3317();
                }
                this.field2075[var19][var20].method3322((this.field2075[var19][var20].field2060 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2075[var19][var20].field2061 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2164; var21 < var14.field2165 + var14.field2164; var21++) {
            for (int var22 = var14.field2167; var22 < var14.field2167 + var14.field2163; var22++) {
                this.field2075[var21][var22].method3323(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("gd.m(IIIILjava/util/HashSet;IIB)V")
    public void method3440(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2073 == null) {
            return;
        }
        this.field2073.method6661(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2074 == null) {
            this.method3448();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2074.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class199 var12 = (class199) var11.next();
                int var13 = (var12.field2209.field3012 - this.field2081) * arg2 / this.field2072;
                int var14 = arg3 - (var12.field2209.field3013 - this.field2083) * arg3 / this.field2084;
                class410.method6560(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("gd.k(IIIIIIIIIII)Ljava/util/List;")
    public List method3441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2076) {
            return var11;
        }
        class191 var12 = this.method3442(arg0, arg1, arg2, arg3);
        float var13 = this.method3445(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2081 + arg0;
        int var16 = this.field2083 + arg1;
        for (int var17 = var12.field2164; var17 < var12.field2165 + var12.field2164; var17++) {
            for (int var18 = var12.field2167; var18 < var12.field2167 + var12.field2163; var18++) {
                List var19 = this.field2075[var17][var18].method3342((this.field2075[var17][var18].field2060 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2075[var17][var18].field2061 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("gd.t(IIIIB)Lgo;")
    public class191 method3442(int arg0, int arg1, int arg2, int arg3) {
        class191 var5 = new class191(this);
        int var6 = this.field2081 + arg0;
        int var7 = this.field2083 + arg1;
        int var8 = this.field2081 + arg2;
        int var9 = this.field2083 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2165 = var12 - var10 + 1;
        var5.field2163 = var13 - var11 + 1;
        var5.field2164 = var10 - this.field2082.method3247();
        var5.field2167 = var11 - this.field2082.method3249();
        if (var5.field2164 < 0) {
            var5.field2165 += var5.field2164;
            var5.field2164 = 0;
        }
        if (var5.field2164 > this.field2075.length - var5.field2165) {
            var5.field2165 = this.field2075.length - var5.field2164;
        }
        if (var5.field2167 < 0) {
            var5.field2163 += var5.field2167;
            var5.field2167 = 0;
        }
        if (var5.field2167 > this.field2075[0].length - var5.field2163) {
            var5.field2163 = this.field2075[0].length - var5.field2167;
        }
        var5.field2165 = Math.min(var5.field2165, this.field2075.length);
        var5.field2163 = Math.min(var5.field2163, this.field2075[0].length);
        return var5;
    }

    @ObfuscatedName("gd.a(I)Z")
    public boolean method3444() {
        return this.field2076;
    }

    @ObfuscatedName("gd.e(I)Ljava/util/HashMap;")
    public HashMap method3443() {
        this.method3448();
        return this.field2074;
    }

    @ObfuscatedName("gd.i(I)V")
    public void method3448() {
        if (this.field2074 == null) {
            this.field2074 = new HashMap();
        }
        this.field2074.clear();
        for (int var1 = 0; var1 < this.field2075.length; var1++) {
            for (int var2 = 0; var2 < this.field2075[var1].length; var2++) {
                List var3 = this.field2075[var1][var2].method3343();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class199 var5 = (class199) var4.next();
                    if (var5.method3575()) {
                        int var6 = var5.method3195();
                        if (this.field2074.containsKey(var6)) {
                            List var8 = (List) this.field2074.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2074.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gd.y(III)F")
    public float method3445(int arg0, int arg1) {
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
