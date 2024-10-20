package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ic")
public final class class244 {

    @ObfuscatedName("ic.f")
    public boolean field2892 = false;

    @ObfuscatedName("ic.w")
    public boolean field2885 = false;

    @ObfuscatedName("ic.v")
    public class263 field2878;

    @ObfuscatedName("ic.s")
    public class488 field2879;

    @ObfuscatedName("ic.z")
    public HashMap field2880;

    @ObfuscatedName("ic.j")
    public class243[][] field2881;

    @ObfuscatedName("ic.i")
    public HashMap field2882 = new HashMap();

    @ObfuscatedName("ic.n")
    public class487[] field2889;

    @ObfuscatedName("ic.l")
    public final class337 field2884;

    @ObfuscatedName("ic.k")
    public final class337 field2877;

    @ObfuscatedName("ic.c")
    public final HashMap field2886;

    @ObfuscatedName("ic.r")
    public int field2883;

    @ObfuscatedName("ic.b")
    public int field2888;

    @ObfuscatedName("ic.m")
    public int field2887;

    @ObfuscatedName("ic.t")
    public int field2890;

    @ObfuscatedName("ic.h")
    public int field2891 = 0;

    public class244(class487[] arg0, HashMap arg1, class337 arg2, class337 arg3) {
        this.field2889 = arg0;
        this.field2886 = arg1;
        this.field2884 = arg2;
        this.field2877 = arg3;
    }

    @ObfuscatedName("ic.f(Lln;Ljava/lang/String;ZB)V")
    public void method4782(class337 arg0, String arg1, boolean arg2) {
        if (this.field2885) {
            return;
        }
        this.field2892 = false;
        this.field2885 = true;
        System.nanoTime();
        int var4 = arg0.method5988(class261.field3014.field3016);
        int var5 = arg0.method6057(var4, arg1);
        class474 var6 = new class474(arg0.method5971(class261.field3014.field3016, arg1));
        class474 var7 = new class474(arg0.method5971(class261.field3017.field3016, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2878 = new class263();
        try {
            this.field2878.method4943(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2878.method4579();
        this.field2878.method4580();
        this.field2878.method4639();
        this.field2883 = this.field2878.method4575() * 64;
        this.field2888 = this.field2878.method4577() * 64;
        this.field2887 = (this.field2878.method4576() - this.field2878.method4575() + 1) * 64;
        this.field2890 = (this.field2878.method4587() - this.field2878.method4577() + 1) * 64;
        int var9 = this.field2878.method4576() - this.field2878.method4575() + 1;
        int var10 = this.field2878.method4587() - this.field2878.method4577() + 1;
        System.nanoTime();
        System.nanoTime();
        class243.method4492();
        this.field2881 = new class243[var9][var10];
        Iterator var11 = this.field2878.field3025.iterator();
        while (var11.hasNext()) {
            class237 var12 = (class237) var11.next();
            int var13 = var12.field2946;
            int var14 = var12.field2947;
            int var15 = var13 - this.field2878.method4575();
            int var16 = var14 - this.field2878.method4577();
            this.field2881[var15][var16] = new class243(var13, var14, this.field2878.method4573(), this.field2886);
            this.field2881[var15][var16].method4648(var12, this.field2878.field3021);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2881[var17][var18] == null) {
                    this.field2881[var17][var18] = new class243(this.field2878.method4575() + var17, this.field2878.method4577() + var18, this.field2878.method4573(), this.field2886);
                    this.field2881[var17][var18].method4649(this.field2878.field3023, this.field2878.field3021);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5989(class261.field3012.field3016, arg1)) {
            byte[] var19 = arg0.method5971(class261.field3012.field3016, arg1);
            this.field2879 = class31.method4990(var19);
        }
        System.nanoTime();
        arg0.method5984();
        arg0.method5986();
        this.field2892 = true;
    }

    @ObfuscatedName("ic.w(I)V")
    public final void method4827() {
        this.field2880 = null;
    }

    @ObfuscatedName("ic.v(IIIIIIIII)V")
    public final void method4792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5012;
        int var10 = Statics.field5011;
        int var11 = Statics.field5008;
        int[] var12 = new int[4];
        class484.method8290(var12);
        class252 var13 = this.method4818(arg0, arg1, arg2, arg3);
        float var14 = this.method4825(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2891 = var15;
        if (!this.field2882.containsKey(var15)) {
            class264 var16 = new class264(var15);
            var16.method4951();
            this.field2882.put(var15, var16);
        }
        int var17 = var13.field2967 + var13.field2965 - 1;
        int var18 = var13.field2966 + var13.field2963 - 1;
        for (int var19 = var13.field2965; var19 <= var17; var19++) {
            for (int var20 = var13.field2963; var20 <= var18; var20++) {
                this.field2881[var19][var20].method4756(var15, (class264) this.field2882.get(var15), this.field2889, this.field2884, this.field2877);
            }
        }
        class484.method8286(var9, var10, var11);
        class484.method8291(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2883 + arg0;
        int var23 = this.field2888 + arg1;
        for (int var24 = var13.field2965; var24 < var13.field2967 + var13.field2965; var24++) {
            for (int var25 = var13.field2963; var25 < var13.field2966 + var13.field2963; var25++) {
                this.field2881[var24][var25].method4776((this.field2881[var24][var25].field2861 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2881[var24][var25].field2867 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ic.s(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class252 var14 = this.method4818(arg0, arg1, arg2, arg3);
        float var15 = this.method4825(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2883 + arg0;
        int var18 = this.field2888 + arg1;
        for (int var19 = var14.field2965; var19 < var14.field2967 + var14.field2965; var19++) {
            for (int var20 = var14.field2963; var20 < var14.field2966 + var14.field2963; var20++) {
                if (arg12) {
                    this.field2881[var19][var20].method4652();
                }
                this.field2881[var19][var20].method4657((this.field2881[var19][var20].field2861 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2881[var19][var20].field2867 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2965; var21 < var14.field2967 + var14.field2965; var21++) {
            for (int var22 = var14.field2963; var22 < var14.field2966 + var14.field2963; var22++) {
                this.field2881[var21][var22].method4659(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ic.z(IIIILjava/util/HashSet;III)V")
    public void method4786(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2879 == null) {
            return;
        }
        this.field2879.method8456(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2880 == null) {
            this.method4815();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2880.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class260 var12 = (class260) var11.next();
                int var13 = (var12.field3009.field3463 - this.field2883) * arg2 / this.field2887;
                int var14 = arg3 - (var12.field3009.field3462 - this.field2888) * arg3 / this.field2890;
                class484.method8358(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ic.j(IIIIIIIIIIB)Ljava/util/List;")
    public List method4787(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2892) {
            return var11;
        }
        class252 var12 = this.method4818(arg0, arg1, arg2, arg3);
        float var13 = this.method4825(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2883 + arg0;
        int var16 = this.field2888 + arg1;
        for (int var17 = var12.field2965; var17 < var12.field2967 + var12.field2965; var17++) {
            for (int var18 = var12.field2963; var18 < var12.field2966 + var12.field2963; var18++) {
                List var19 = this.field2881[var17][var18].method4678((this.field2881[var17][var18].field2861 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2881[var17][var18].field2867 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ic.i(IIIII)Lis;")
    public class252 method4818(int arg0, int arg1, int arg2, int arg3) {
        class252 var5 = new class252(this);
        int var6 = this.field2883 + arg0;
        int var7 = this.field2888 + arg1;
        int var8 = this.field2883 + arg2;
        int var9 = this.field2888 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2967 = var12 - var10 + 1;
        var5.field2966 = var13 - var11 + 1;
        var5.field2965 = var10 - this.field2878.method4575();
        var5.field2963 = var11 - this.field2878.method4577();
        if (var5.field2965 < 0) {
            var5.field2967 += var5.field2965;
            var5.field2965 = 0;
        }
        if (var5.field2965 > this.field2881.length - var5.field2967) {
            var5.field2967 = this.field2881.length - var5.field2965;
        }
        if (var5.field2963 < 0) {
            var5.field2966 += var5.field2963;
            var5.field2963 = 0;
        }
        if (var5.field2963 > this.field2881[0].length - var5.field2966) {
            var5.field2966 = this.field2881[0].length - var5.field2963;
        }
        var5.field2967 = Math.min(var5.field2967, this.field2881.length);
        var5.field2966 = Math.min(var5.field2966, this.field2881[0].length);
        return var5;
    }

    @ObfuscatedName("ic.n(I)Z")
    public boolean method4789() {
        return this.field2892;
    }

    @ObfuscatedName("ic.l(B)Ljava/util/HashMap;")
    public HashMap method4790() {
        this.method4815();
        return this.field2880;
    }

    @ObfuscatedName("ic.k(B)V")
    public void method4815() {
        if (this.field2880 == null) {
            this.field2880 = new HashMap();
        }
        this.field2880.clear();
        for (int var1 = 0; var1 < this.field2881.length; var1++) {
            for (int var2 = 0; var2 < this.field2881[var1].length; var2++) {
                List var3 = this.field2881[var1][var2].method4679();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class260 var5 = (class260) var4.next();
                    if (var5.method4926()) {
                        int var6 = var5.method4535();
                        if (this.field2880.containsKey(var6)) {
                            List var8 = (List) this.field2880.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2880.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ic.c(III)F")
    public float method4825(int arg0, int arg1) {
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
