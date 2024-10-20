package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("il")
public final class class237 {

    @ObfuscatedName("il.a")
    public boolean field2817 = false;

    @ObfuscatedName("il.f")
    public boolean field2808 = false;

    @ObfuscatedName("il.c")
    public class256 field2809;

    @ObfuscatedName("il.x")
    public class477 field2813;

    @ObfuscatedName("il.h")
    public HashMap field2822;

    @ObfuscatedName("il.j")
    public class236[][] field2812;

    @ObfuscatedName("il.y")
    public HashMap field2814 = new HashMap();

    @ObfuscatedName("il.d")
    public class476[] field2810;

    @ObfuscatedName("il.n")
    public final class330 field2811;

    @ObfuscatedName("il.r")
    public final class330 field2816;

    @ObfuscatedName("il.l")
    public final HashMap field2815;

    @ObfuscatedName("il.s")
    public int field2807;

    @ObfuscatedName("il.p")
    public int field2819;

    @ObfuscatedName("il.b")
    public int field2820;

    @ObfuscatedName("il.o")
    public int field2821;

    @ObfuscatedName("il.u")
    public int field2818 = 0;

    public class237(class476[] arg0, HashMap arg1, class330 arg2, class330 arg3) {
        this.field2810 = arg0;
        this.field2815 = arg1;
        this.field2811 = arg2;
        this.field2816 = arg3;
    }

    @ObfuscatedName("il.a(Llg;Ljava/lang/String;ZI)V")
    public void method4597(class330 arg0, String arg1, boolean arg2) {
        if (this.field2808) {
            return;
        }
        this.field2817 = false;
        this.field2808 = true;
        System.nanoTime();
        int var4 = arg0.method5813(class254.field2955.field2954);
        int var5 = arg0.method5854(var4, arg1);
        class464 var6 = new class464(arg0.method5835(class254.field2955.field2954, arg1));
        class464 var7 = new class464(arg0.method5835(class254.field2950.field2954, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2809 = new class256();
        try {
            this.field2809.method4747(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2809.method4403();
        this.field2809.method4437();
        this.field2809.method4442();
        this.field2807 = this.field2809.method4458() * 64;
        this.field2819 = this.field2809.method4413() * 64;
        this.field2820 = (this.field2809.method4393() - this.field2809.method4458() + 1) * 64;
        this.field2821 = (this.field2809.method4395() - this.field2809.method4413() + 1) * 64;
        int var9 = this.field2809.method4393() - this.field2809.method4458() + 1;
        int var10 = this.field2809.method4395() - this.field2809.method4413() + 1;
        System.nanoTime();
        System.nanoTime();
        class236.method3325();
        this.field2812 = new class236[var9][var10];
        Iterator var11 = this.field2809.field2957.iterator();
        while (var11.hasNext()) {
            class230 var12 = (class230) var11.next();
            int var13 = var12.field2879;
            int var14 = var12.field2880;
            int var15 = var13 - this.field2809.method4458();
            int var16 = var14 - this.field2809.method4413();
            this.field2812[var15][var16] = new class236(var13, var14, this.field2809.method4390(), this.field2815);
            this.field2812[var15][var16].method4461(var12, this.field2809.field2958);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2812[var17][var18] == null) {
                    this.field2812[var17][var18] = new class236(this.field2809.method4458() + var17, this.field2809.method4413() + var18, this.field2809.method4390(), this.field2815);
                    this.field2812[var17][var18].method4462(this.field2809.field2959, this.field2809.field2958);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5842(class254.field2949.field2954, arg1)) {
            byte[] var19 = arg0.method5835(class254.field2949.field2954, arg1);
            this.field2813 = class32.method389(var19);
        }
        System.nanoTime();
        arg0.method5795();
        arg0.method5807();
        this.field2817 = true;
    }

    @ObfuscatedName("il.f(S)V")
    public final void method4634() {
        this.field2822 = null;
    }

    @ObfuscatedName("il.c(IIIIIIIIB)V")
    public final void method4599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4934;
        int var10 = Statics.field4935;
        int var11 = Statics.field4936;
        int[] var12 = new int[4];
        class473.method8080(var12);
        class245 var13 = this.method4603(arg0, arg1, arg2, arg3);
        float var14 = this.method4607(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2818 = var15;
        if (!this.field2814.containsKey(var15)) {
            class257 var16 = new class257(var15);
            var16.method4762();
            this.field2814.put(var15, var16);
        }
        int var17 = var13.field2899 + var13.field2895 - 1;
        int var18 = var13.field2896 + var13.field2894 - 1;
        for (int var19 = var13.field2895; var19 <= var17; var19++) {
            for (int var20 = var13.field2896; var20 <= var18; var20++) {
                this.field2812[var19][var20].method4469(var15, (class257) this.field2814.get(var15), this.field2810, this.field2811, this.field2816);
            }
        }
        class473.method8013(var9, var10, var11);
        class473.method8017(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2807 + arg0;
        int var23 = this.field2819 + arg1;
        for (int var24 = var13.field2895; var24 < var13.field2899 + var13.field2895; var24++) {
            for (int var25 = var13.field2896; var25 < var13.field2896 + var13.field2894; var25++) {
                this.field2812[var24][var25].method4460((this.field2812[var24][var25].field2797 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2812[var24][var25].field2798 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("il.x(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class245 var14 = this.method4603(arg0, arg1, arg2, arg3);
        float var15 = this.method4607(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2807 + arg0;
        int var18 = this.field2819 + arg1;
        for (int var19 = var14.field2895; var19 < var14.field2899 + var14.field2895; var19++) {
            for (int var20 = var14.field2896; var20 < var14.field2896 + var14.field2894; var20++) {
                if (arg12) {
                    this.field2812[var19][var20].method4465();
                }
                this.field2812[var19][var20].method4545((this.field2812[var19][var20].field2797 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2812[var19][var20].field2798 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2895; var21 < var14.field2899 + var14.field2895; var21++) {
            for (int var22 = var14.field2896; var22 < var14.field2896 + var14.field2894; var22++) {
                this.field2812[var21][var22].method4504(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("il.h(IIIILjava/util/HashSet;IIB)V")
    public void method4601(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2813 == null) {
            return;
        }
        this.field2813.method8135(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2822 == null) {
            this.method4606();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2822.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class253 var12 = (class253) var11.next();
                int var13 = (var12.field2948.field3397 - this.field2807) * arg2 / this.field2820;
                int var14 = arg3 - (var12.field2948.field3396 - this.field2819) * arg3 / this.field2821;
                class473.method8020(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("il.j(IIIIIIIIIII)Ljava/util/List;")
    public List method4627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2817) {
            return var11;
        }
        class245 var12 = this.method4603(arg0, arg1, arg2, arg3);
        float var13 = this.method4607(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2807 + arg0;
        int var16 = this.field2819 + arg1;
        for (int var17 = var12.field2895; var17 < var12.field2899 + var12.field2895; var17++) {
            for (int var18 = var12.field2896; var18 < var12.field2896 + var12.field2894; var18++) {
                List var19 = this.field2812[var17][var18].method4490((this.field2812[var17][var18].field2797 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2812[var17][var18].field2798 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("il.y(IIIIB)Lia;")
    public class245 method4603(int arg0, int arg1, int arg2, int arg3) {
        class245 var5 = new class245(this);
        int var6 = this.field2807 + arg0;
        int var7 = this.field2819 + arg1;
        int var8 = this.field2807 + arg2;
        int var9 = this.field2819 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2899 = var12 - var10 + 1;
        var5.field2894 = var13 - var11 + 1;
        var5.field2895 = var10 - this.field2809.method4458();
        var5.field2896 = var11 - this.field2809.method4413();
        if (var5.field2895 < 0) {
            var5.field2899 += var5.field2895;
            var5.field2895 = 0;
        }
        if (var5.field2895 > this.field2812.length - var5.field2899) {
            var5.field2899 = this.field2812.length - var5.field2895;
        }
        if (var5.field2896 < 0) {
            var5.field2894 += var5.field2896;
            var5.field2896 = 0;
        }
        if (var5.field2896 > this.field2812[0].length - var5.field2894) {
            var5.field2894 = this.field2812[0].length - var5.field2896;
        }
        var5.field2899 = Math.min(var5.field2899, this.field2812.length);
        var5.field2894 = Math.min(var5.field2894, this.field2812[0].length);
        return var5;
    }

    @ObfuscatedName("il.d(I)Z")
    public boolean method4605() {
        return this.field2817;
    }

    @ObfuscatedName("il.n(I)Ljava/util/HashMap;")
    public HashMap method4625() {
        this.method4606();
        return this.field2822;
    }

    @ObfuscatedName("il.r(I)V")
    public void method4606() {
        if (this.field2822 == null) {
            this.field2822 = new HashMap();
        }
        this.field2822.clear();
        for (int var1 = 0; var1 < this.field2812.length; var1++) {
            for (int var2 = 0; var2 < this.field2812[var1].length; var2++) {
                List var3 = this.field2812[var1][var2].method4491();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class253 var5 = (class253) var4.next();
                    if (var5.method4731()) {
                        int var6 = var5.method4330();
                        if (this.field2822.containsKey(var6)) {
                            List var8 = (List) this.field2822.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2822.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("il.l(III)F")
    public float method4607(int arg0, int arg1) {
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
