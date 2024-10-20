package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("hp")
public final class class228 {

    @ObfuscatedName("hp.o")
    public boolean field2787 = false;

    @ObfuscatedName("hp.q")
    public boolean field2772 = false;

    @ObfuscatedName("hp.l")
    public class247 field2777;

    @ObfuscatedName("hp.k")
    public class453 field2774;

    @ObfuscatedName("hp.a")
    public HashMap field2775;

    @ObfuscatedName("hp.m")
    public class227[][] field2776;

    @ObfuscatedName("hp.p")
    public HashMap field2778 = new HashMap();

    @ObfuscatedName("hp.s")
    public class452[] field2771;

    @ObfuscatedName("hp.r")
    public final class316 field2779;

    @ObfuscatedName("hp.v")
    public final class316 field2780;

    @ObfuscatedName("hp.y")
    public final HashMap field2781;

    @ObfuscatedName("hp.c")
    public int field2782;

    @ObfuscatedName("hp.w")
    public int field2783;

    @ObfuscatedName("hp.b")
    public int field2784;

    @ObfuscatedName("hp.t")
    public int field2785;

    @ObfuscatedName("hp.g")
    public int field2773 = 0;

    public class228(class452[] arg0, HashMap arg1, class316 arg2, class316 arg3) {
        this.field2771 = arg0;
        this.field2781 = arg1;
        this.field2779 = arg2;
        this.field2780 = arg3;
    }

    @ObfuscatedName("hp.o(Llp;Ljava/lang/String;ZI)V")
    public void method4317(class316 arg0, String arg1, boolean arg2) {
        if (this.field2772) {
            return;
        }
        this.field2787 = false;
        this.field2772 = true;
        System.nanoTime();
        int var4 = arg0.method5206(class245.field2911.field2916);
        int var5 = arg0.method5207(var4, arg1);
        class440 var6 = new class440(arg0.method5208(class245.field2911.field2916, arg1));
        class440 var7 = new class440(arg0.method5208(class245.field2908.field2916, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2777 = new class247();
        try {
            this.field2777.method4478(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2777.method4144();
        this.field2777.method4156();
        this.field2777.method4146();
        this.field2782 = this.field2777.method4169() * 64;
        this.field2783 = this.field2777.method4142() * 64;
        this.field2784 = (this.field2777.method4178() - this.field2777.method4169() + 1) * 64;
        this.field2785 = (this.field2777.method4143() - this.field2777.method4142() + 1) * 64;
        int var9 = this.field2777.method4178() - this.field2777.method4169() + 1;
        int var10 = this.field2777.method4143() - this.field2777.method4142() + 1;
        System.nanoTime();
        System.nanoTime();
        class227.field2758.method4537();
        this.field2776 = new class227[var9][var10];
        Iterator var11 = this.field2777.field2917.iterator();
        while (var11.hasNext()) {
            class221 var12 = (class221) var11.next();
            int var13 = var12.field2842;
            int var14 = var12.field2840;
            int var15 = var13 - this.field2777.method4169();
            int var16 = var14 - this.field2777.method4142();
            this.field2776[var15][var16] = new class227(var13, var14, this.field2777.method4138(), this.field2781);
            this.field2776[var15][var16].method4194(var12, this.field2777.field2919);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2776[var17][var18] == null) {
                    this.field2776[var17][var18] = new class227(this.field2777.method4169() + var17, this.field2777.method4142() + var18, this.field2777.method4138(), this.field2781);
                    this.field2776[var17][var18].method4195(this.field2777.field2918, this.field2777.field2919);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5211(class245.field2909.field2916, arg1)) {
            byte[] var19 = arg0.method5208(class245.field2909.field2916, arg1);
            this.field2774 = class29.method3909(var19);
        }
        System.nanoTime();
        arg0.method5212();
        arg0.method5204();
        this.field2787 = true;
    }

    @ObfuscatedName("hp.q(B)V")
    public final void method4316() {
        this.field2775 = null;
    }

    @ObfuscatedName("hp.l(IIIIIIIII)V")
    public final void method4335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4744;
        int var10 = Statics.field4745;
        int var11 = Statics.field4746;
        int[] var12 = new int[4];
        class449.method7198(var12);
        class236 var13 = this.method4323(arg0, arg1, arg2, arg3);
        float var14 = this.method4327(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2773 = var15;
        if (!this.field2778.containsKey(var15)) {
            class248 var16 = new class248(var15);
            var16.method4484();
            this.field2778.put(var15, var16);
        }
        int var17 = var13.field2859 + var13.field2858 - 1;
        int var18 = var13.field2855 + var13.field2854 - 1;
        for (int var19 = var13.field2858; var19 <= var17; var19++) {
            for (int var20 = var13.field2855; var20 <= var18; var20++) {
                this.field2776[var19][var20].method4268(var15, (class248) this.field2778.get(var15), this.field2771, this.field2779, this.field2780);
            }
        }
        class449.method7227(var9, var10, var11);
        class449.method7253(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2782 + arg0;
        int var23 = this.field2783 + arg1;
        for (int var24 = var13.field2858; var24 < var13.field2859 + var13.field2858; var24++) {
            for (int var25 = var13.field2855; var25 < var13.field2855 + var13.field2854; var25++) {
                this.field2776[var24][var25].method4193((this.field2776[var24][var25].field2759 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2776[var24][var25].field2760 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("hp.k(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class236 var14 = this.method4323(arg0, arg1, arg2, arg3);
        float var15 = this.method4327(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2782 + arg0;
        int var18 = this.field2783 + arg1;
        for (int var19 = var14.field2858; var19 < var14.field2859 + var14.field2858; var19++) {
            for (int var20 = var14.field2855; var20 < var14.field2855 + var14.field2854; var20++) {
                if (arg12) {
                    this.field2776[var19][var20].method4198();
                }
                this.field2776[var19][var20].method4203((this.field2776[var19][var20].field2759 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2776[var19][var20].field2760 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2858; var21 < var14.field2859 + var14.field2858; var21++) {
            for (int var22 = var14.field2855; var22 < var14.field2855 + var14.field2854; var22++) {
                this.field2776[var21][var22].method4304(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("hp.a(IIIILjava/util/HashSet;IIB)V")
    public void method4343(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2774 == null) {
            return;
        }
        this.field2774.method7413(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2775 == null) {
            this.method4318();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2775.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class244 var12 = (class244) var11.next();
                int var13 = (var12.field2900.field3351 - this.field2782) * arg2 / this.field2784;
                int var14 = arg3 - (var12.field2900.field3354 - this.field2783) * arg3 / this.field2785;
                class449.method7202(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("hp.m(IIIIIIIIIII)Ljava/util/List;")
    public List method4322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2787) {
            return var11;
        }
        class236 var12 = this.method4323(arg0, arg1, arg2, arg3);
        float var13 = this.method4327(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2782 + arg0;
        int var16 = this.field2783 + arg1;
        for (int var17 = var12.field2858; var17 < var12.field2859 + var12.field2858; var17++) {
            for (int var18 = var12.field2855; var18 < var12.field2855 + var12.field2854; var18++) {
                List var19 = this.field2776[var17][var18].method4224((this.field2776[var17][var18].field2759 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2776[var17][var18].field2760 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("hp.p(IIIIB)Lig;")
    public class236 method4323(int arg0, int arg1, int arg2, int arg3) {
        class236 var5 = new class236(this);
        int var6 = this.field2782 + arg0;
        int var7 = this.field2783 + arg1;
        int var8 = this.field2782 + arg2;
        int var9 = this.field2783 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2859 = var12 - var10 + 1;
        var5.field2854 = var13 - var11 + 1;
        var5.field2858 = var10 - this.field2777.method4169();
        var5.field2855 = var11 - this.field2777.method4142();
        if (var5.field2858 < 0) {
            var5.field2859 += var5.field2858;
            var5.field2858 = 0;
        }
        if (var5.field2858 > this.field2776.length - var5.field2859) {
            var5.field2859 = this.field2776.length - var5.field2858;
        }
        if (var5.field2855 < 0) {
            var5.field2854 += var5.field2855;
            var5.field2855 = 0;
        }
        if (var5.field2855 > this.field2776[0].length - var5.field2854) {
            var5.field2854 = this.field2776[0].length - var5.field2855;
        }
        var5.field2859 = Math.min(var5.field2859, this.field2776.length);
        var5.field2854 = Math.min(var5.field2854, this.field2776[0].length);
        return var5;
    }

    @ObfuscatedName("hp.s(I)Z")
    public boolean method4324() {
        return this.field2787;
    }

    @ObfuscatedName("hp.r(B)Ljava/util/HashMap;")
    public HashMap method4325() {
        this.method4318();
        return this.field2775;
    }

    @ObfuscatedName("hp.v(I)V")
    public void method4318() {
        if (this.field2775 == null) {
            this.field2775 = new HashMap();
        }
        this.field2775.clear();
        for (int var1 = 0; var1 < this.field2776.length; var1++) {
            for (int var2 = 0; var2 < this.field2776[var1].length; var2++) {
                List var3 = this.field2776[var1][var2].method4225();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class244 var5 = (class244) var4.next();
                    if (var5.method4464()) {
                        int var6 = var5.method4095();
                        if (this.field2775.containsKey(var6)) {
                            List var8 = (List) this.field2775.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2775.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hp.y(III)F")
    public float method4327(int arg0, int arg1) {
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
