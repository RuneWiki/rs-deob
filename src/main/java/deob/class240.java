package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ie")
public final class class240 {

    @ObfuscatedName("ie.h")
    public boolean field2882 = false;

    @ObfuscatedName("ie.e")
    public boolean field2890 = false;

    @ObfuscatedName("ie.v")
    public class259 field2880;

    @ObfuscatedName("ie.x")
    public class481 field2881;

    @ObfuscatedName("ie.m")
    public HashMap field2885;

    @ObfuscatedName("ie.q")
    public class239[][] field2883;

    @ObfuscatedName("ie.f")
    public HashMap field2884 = new HashMap();

    @ObfuscatedName("ie.r")
    public class480[] field2878;

    @ObfuscatedName("ie.u")
    public final class333 field2886;

    @ObfuscatedName("ie.b")
    public final class333 field2879;

    @ObfuscatedName("ie.j")
    public final HashMap field2888;

    @ObfuscatedName("ie.g")
    public int field2889;

    @ObfuscatedName("ie.i")
    public int field2887;

    @ObfuscatedName("ie.o")
    public int field2891;

    @ObfuscatedName("ie.n")
    public int field2892;

    @ObfuscatedName("ie.k")
    public int field2893 = 0;

    public class240(class480[] arg0, HashMap arg1, class333 arg2, class333 arg3) {
        this.field2878 = arg0;
        this.field2888 = arg1;
        this.field2886 = arg2;
        this.field2879 = arg3;
    }

    @ObfuscatedName("ie.h(Lly;Ljava/lang/String;ZB)V")
    public void method4722(class333 arg0, String arg1, boolean arg2) {
        if (this.field2890) {
            return;
        }
        this.field2882 = false;
        this.field2890 = true;
        System.nanoTime();
        int var4 = arg0.method5861(class257.field3011.field3009);
        int var5 = arg0.method5868(var4, arg1);
        class467 var6 = new class467(arg0.method5864(class257.field3011.field3009, arg1));
        class467 var7 = new class467(arg0.method5864(class257.field3006.field3009, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2880 = new class259();
        try {
            this.field2880.method4831(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2880.method4519();
        this.field2880.method4561();
        this.field2880.method4521();
        this.field2889 = this.field2880.method4527() * 64;
        this.field2887 = this.field2880.method4517() * 64;
        this.field2891 = (this.field2880.method4516() - this.field2880.method4527() + 1) * 64;
        this.field2892 = (this.field2880.method4518() - this.field2880.method4517() + 1) * 64;
        int var9 = this.field2880.method4516() - this.field2880.method4527() + 1;
        int var10 = this.field2880.method4518() - this.field2880.method4517() + 1;
        System.nanoTime();
        System.nanoTime();
        class239.field2870.method4880();
        this.field2883 = new class239[var9][var10];
        Iterator var11 = this.field2880.field3012.iterator();
        while (var11.hasNext()) {
            class233 var12 = (class233) var11.next();
            int var13 = var12.field2943;
            int var14 = var12.field2949;
            int var15 = var13 - this.field2880.method4527();
            int var16 = var14 - this.field2880.method4517();
            this.field2883[var15][var16] = new class239(var13, var14, this.field2880.method4520(), this.field2888);
            this.field2883[var15][var16].method4569(var12, this.field2880.field3014);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2883[var17][var18] == null) {
                    this.field2883[var17][var18] = new class239(this.field2880.method4527() + var17, this.field2880.method4517() + var18, this.field2880.method4520(), this.field2888);
                    this.field2883[var17][var18].method4660(this.field2880.field3013, this.field2880.field3014);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5894(class257.field3010.field3009, arg1)) {
            byte[] var19 = arg0.method5864(class257.field3010.field3009, arg1);
            this.field2881 = class32.method6061(var19);
        }
        System.nanoTime();
        arg0.method5855();
        arg0.method5910();
        this.field2882 = true;
    }

    @ObfuscatedName("ie.e(I)V")
    public final void method4696() {
        this.field2885 = null;
    }

    @ObfuscatedName("ie.v(IIIIIIIII)V")
    public final void method4697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4986;
        int var10 = Statics.field4985;
        int var11 = Statics.field4984;
        int[] var12 = new int[4];
        class477.method8114(var12);
        class248 var13 = this.method4701(arg0, arg1, arg2, arg3);
        float var14 = this.method4712(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2893 = var15;
        if (!this.field2884.containsKey(var15)) {
            class260 var16 = new class260(var15);
            var16.method4837();
            this.field2884.put(var15, var16);
        }
        int var17 = var13.field2960 + var13.field2958 - 1;
        int var18 = var13.field2963 + var13.field2961 - 1;
        for (int var19 = var13.field2958; var19 <= var17; var19++) {
            for (int var20 = var13.field2961; var20 <= var18; var20++) {
                this.field2883[var19][var20].method4577(var15, (class260) this.field2884.get(var15), this.field2878, this.field2886, this.field2879);
            }
        }
        class477.method8119(var9, var10, var11);
        class477.method8115(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2889 + arg0;
        int var23 = this.field2887 + arg1;
        for (int var24 = var13.field2958; var24 < var13.field2960 + var13.field2958; var24++) {
            for (int var25 = var13.field2961; var25 < var13.field2963 + var13.field2961; var25++) {
                this.field2883[var24][var25].method4568((this.field2883[var24][var25].field2868 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2883[var24][var25].field2876 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ie.x(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method4698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class248 var14 = this.method4701(arg0, arg1, arg2, arg3);
        float var15 = this.method4712(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2889 + arg0;
        int var18 = this.field2887 + arg1;
        for (int var19 = var14.field2958; var19 < var14.field2960 + var14.field2958; var19++) {
            for (int var20 = var14.field2961; var20 < var14.field2963 + var14.field2961; var20++) {
                if (arg12) {
                    this.field2883[var19][var20].method4581();
                }
                this.field2883[var19][var20].method4578((this.field2883[var19][var20].field2868 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2883[var19][var20].field2876 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2958; var21 < var14.field2960 + var14.field2958; var21++) {
            for (int var22 = var14.field2961; var22 < var14.field2963 + var14.field2961; var22++) {
                this.field2883[var21][var22].method4595(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ie.m(IIIILjava/util/HashSet;IIB)V")
    public void method4699(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2881 == null) {
            return;
        }
        this.field2881.method8238(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2885 == null) {
            this.method4704();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2885.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class256 var12 = (class256) var11.next();
                int var13 = (var12.field3003.field3451 - this.field2889) * arg2 / this.field2891;
                int var14 = arg3 - (var12.field3003.field3452 - this.field2887) * arg3 / this.field2892;
                class477.method8110(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ie.q(IIIIIIIIIIB)Ljava/util/List;")
    public List method4700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2882) {
            return var11;
        }
        class248 var12 = this.method4701(arg0, arg1, arg2, arg3);
        float var13 = this.method4712(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2889 + arg0;
        int var16 = this.field2887 + arg1;
        for (int var17 = var12.field2958; var17 < var12.field2960 + var12.field2958; var17++) {
            for (int var18 = var12.field2961; var18 < var12.field2963 + var12.field2961; var18++) {
                List var19 = this.field2883[var17][var18].method4627((this.field2883[var17][var18].field2868 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2883[var17][var18].field2876 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ie.f(IIIII)Lif;")
    public class248 method4701(int arg0, int arg1, int arg2, int arg3) {
        class248 var5 = new class248(this);
        int var6 = this.field2889 + arg0;
        int var7 = this.field2887 + arg1;
        int var8 = this.field2889 + arg2;
        int var9 = this.field2887 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2960 = var12 - var10 + 1;
        var5.field2963 = var13 - var11 + 1;
        var5.field2958 = var10 - this.field2880.method4527();
        var5.field2961 = var11 - this.field2880.method4517();
        if (var5.field2958 < 0) {
            var5.field2960 += var5.field2958;
            var5.field2958 = 0;
        }
        if (var5.field2958 > this.field2883.length - var5.field2960) {
            var5.field2960 = this.field2883.length - var5.field2958;
        }
        if (var5.field2961 < 0) {
            var5.field2963 += var5.field2961;
            var5.field2961 = 0;
        }
        if (var5.field2961 > this.field2883[0].length - var5.field2963) {
            var5.field2963 = this.field2883[0].length - var5.field2961;
        }
        var5.field2960 = Math.min(var5.field2960, this.field2883.length);
        var5.field2963 = Math.min(var5.field2963, this.field2883[0].length);
        return var5;
    }

    @ObfuscatedName("ie.r(B)Z")
    public boolean method4702() {
        return this.field2882;
    }

    @ObfuscatedName("ie.u(B)Ljava/util/HashMap;")
    public HashMap method4703() {
        this.method4704();
        return this.field2885;
    }

    @ObfuscatedName("ie.b(I)V")
    public void method4704() {
        if (this.field2885 == null) {
            this.field2885 = new HashMap();
        }
        this.field2885.clear();
        for (int var1 = 0; var1 < this.field2883.length; var1++) {
            for (int var2 = 0; var2 < this.field2883[var1].length; var2++) {
                List var3 = this.field2883[var1][var2].method4599();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class256 var5 = (class256) var4.next();
                    if (var5.method4814()) {
                        int var6 = var5.method4455();
                        if (this.field2885.containsKey(var6)) {
                            List var8 = (List) this.field2885.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2885.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ie.j(III)F")
    public float method4712(int arg0, int arg1) {
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
