package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("hx")
public final class class228 {

    @ObfuscatedName("hx.c")
    public boolean field2764 = false;

    @ObfuscatedName("hx.p")
    public boolean field2763 = false;

    @ObfuscatedName("hx.f")
    public class247 field2779;

    @ObfuscatedName("hx.n")
    public class458 field2765;

    @ObfuscatedName("hx.k")
    public HashMap field2766;

    @ObfuscatedName("hx.w")
    public class227[][] field2767;

    @ObfuscatedName("hx.s")
    public HashMap field2762 = new HashMap();

    @ObfuscatedName("hx.q")
    public class457[] field2769;

    @ObfuscatedName("hx.m")
    public final class317 field2768;

    @ObfuscatedName("hx.x")
    public final class317 field2771;

    @ObfuscatedName("hx.j")
    public final HashMap field2772;

    @ObfuscatedName("hx.v")
    public int field2773;

    @ObfuscatedName("hx.h")
    public int field2778;

    @ObfuscatedName("hx.t")
    public int field2775;

    @ObfuscatedName("hx.u")
    public int field2770;

    @ObfuscatedName("hx.d")
    public int field2777 = 0;

    public class228(class457[] arg0, HashMap arg1, class317 arg2, class317 arg3) {
        this.field2769 = arg0;
        this.field2772 = arg1;
        this.field2768 = arg2;
        this.field2771 = arg3;
    }

    @ObfuscatedName("hx.c(Llv;Ljava/lang/String;ZI)V")
    public void method4540(class317 arg0, String arg1, boolean arg2) {
        if (this.field2763) {
            return;
        }
        this.field2764 = false;
        this.field2763 = true;
        System.nanoTime();
        int var4 = arg0.method5482(class245.field2897.field2898);
        int var5 = arg0.method5432(var4, arg1);
        class445 var6 = new class445(arg0.method5501(class245.field2897.field2898, arg1));
        class445 var7 = new class445(arg0.method5501(class245.field2895.field2898, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2779 = new class247();
        try {
            this.field2779.method4689(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2779.method4355();
        this.field2779.method4362();
        this.field2779.method4376();
        this.field2773 = this.field2779.method4351() * 64;
        this.field2778 = this.field2779.method4353() * 64;
        this.field2775 = (this.field2779.method4352() - this.field2779.method4351() + 1) * 64;
        this.field2770 = (this.field2779.method4412() - this.field2779.method4353() + 1) * 64;
        int var9 = this.field2779.method4352() - this.field2779.method4351() + 1;
        int var10 = this.field2779.method4412() - this.field2779.method4353() + 1;
        System.nanoTime();
        System.nanoTime();
        class227.field2753.method4749();
        this.field2767 = new class227[var9][var10];
        Iterator var11 = this.field2779.field2906.iterator();
        while (var11.hasNext()) {
            class221 var12 = (class221) var11.next();
            int var13 = var12.field2831;
            int var14 = var12.field2829;
            int var15 = var13 - this.field2779.method4351();
            int var16 = var14 - this.field2779.method4353();
            this.field2767[var15][var16] = new class227(var13, var14, this.field2779.method4361(), this.field2772);
            this.field2767[var15][var16].method4418(var12, this.field2779.field2905);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2767[var17][var18] == null) {
                    this.field2767[var17][var18] = new class227(this.field2779.method4351() + var17, this.field2779.method4353() + var18, this.field2779.method4361(), this.field2772);
                    this.field2767[var17][var18].method4419(this.field2779.field2903, this.field2779.field2905);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5433(class245.field2896.field2898, arg1)) {
            byte[] var19 = arg0.method5501(class245.field2896.field2898, arg1);
            this.field2765 = class29.method316(var19);
        }
        System.nanoTime();
        arg0.method5427();
        arg0.method5429();
        this.field2764 = true;
    }

    @ObfuscatedName("hx.p(B)V")
    public final void method4542() {
        this.field2766 = null;
    }

    @ObfuscatedName("hx.f(IIIIIIIIB)V")
    public final void method4556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4804;
        int var10 = Statics.field4800;
        int var11 = Statics.field4801;
        int[] var12 = new int[4];
        class454.method7485(var12);
        class236 var13 = this.method4552(arg0, arg1, arg2, arg3);
        float var14 = this.method4551(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2777 = var15;
        if (!this.field2762.containsKey(var15)) {
            class248 var16 = new class248(var15);
            var16.method4702();
            this.field2762.put(var15, var16);
        }
        int var17 = var13.field2845 + var13.field2844 - 1;
        int var18 = var13.field2847 + var13.field2846 - 1;
        for (int var19 = var13.field2844; var19 <= var17; var19++) {
            for (int var20 = var13.field2847; var20 <= var18; var20++) {
                this.field2767[var19][var20].method4426(var15, (class248) this.field2762.get(var15), this.field2769, this.field2768, this.field2771);
            }
        }
        class454.method7486(var9, var10, var11);
        class454.method7529(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2773 + arg0;
        int var23 = this.field2778 + arg1;
        for (int var24 = var13.field2844; var24 < var13.field2845 + var13.field2844; var24++) {
            for (int var25 = var13.field2847; var25 < var13.field2847 + var13.field2846; var25++) {
                this.field2767[var24][var25].method4493((this.field2767[var24][var25].field2751 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2767[var24][var25].field2752 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("hx.n(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class236 var14 = this.method4552(arg0, arg1, arg2, arg3);
        float var15 = this.method4551(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2773 + arg0;
        int var18 = this.field2778 + arg1;
        for (int var19 = var14.field2844; var19 < var14.field2845 + var14.field2844; var19++) {
            for (int var20 = var14.field2847; var20 < var14.field2847 + var14.field2846; var20++) {
                if (arg12) {
                    this.field2767[var19][var20].method4422();
                }
                this.field2767[var19][var20].method4427((this.field2767[var19][var20].field2751 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2767[var19][var20].field2752 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2844; var21 < var14.field2845 + var14.field2844; var21++) {
            for (int var22 = var14.field2847; var22 < var14.field2847 + var14.field2846; var22++) {
                this.field2767[var21][var22].method4428(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("hx.k(IIIILjava/util/HashSet;IIB)V")
    public void method4568(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2765 == null) {
            return;
        }
        this.field2765.method7606(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2766 == null) {
            this.method4550();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2766.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class244 var12 = (class244) var11.next();
                int var13 = (var12.field2888.field3349 - this.field2773) * arg2 / this.field2775;
                int var14 = arg3 - (var12.field2888.field3350 - this.field2778) * arg3 / this.field2770;
                class454.method7493(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("hx.w(IIIIIIIIIII)Ljava/util/List;")
    public List method4546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2764) {
            return var11;
        }
        class236 var12 = this.method4552(arg0, arg1, arg2, arg3);
        float var13 = this.method4551(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2773 + arg0;
        int var16 = this.field2778 + arg1;
        for (int var17 = var12.field2844; var17 < var12.field2845 + var12.field2844; var17++) {
            for (int var18 = var12.field2847; var18 < var12.field2847 + var12.field2846; var18++) {
                List var19 = this.field2767[var17][var18].method4515((this.field2767[var17][var18].field2751 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2767[var17][var18].field2752 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("hx.s(IIIIB)Lil;")
    public class236 method4552(int arg0, int arg1, int arg2, int arg3) {
        class236 var5 = new class236(this);
        int var6 = this.field2773 + arg0;
        int var7 = this.field2778 + arg1;
        int var8 = this.field2773 + arg2;
        int var9 = this.field2778 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2845 = var12 - var10 + 1;
        var5.field2846 = var13 - var11 + 1;
        var5.field2844 = var10 - this.field2779.method4351();
        var5.field2847 = var11 - this.field2779.method4353();
        if (var5.field2844 < 0) {
            var5.field2845 += var5.field2844;
            var5.field2844 = 0;
        }
        if (var5.field2844 > this.field2767.length - var5.field2845) {
            var5.field2845 = this.field2767.length - var5.field2844;
        }
        if (var5.field2847 < 0) {
            var5.field2846 += var5.field2847;
            var5.field2847 = 0;
        }
        if (var5.field2847 > this.field2767[0].length - var5.field2846) {
            var5.field2846 = this.field2767[0].length - var5.field2847;
        }
        var5.field2845 = Math.min(var5.field2845, this.field2767.length);
        var5.field2846 = Math.min(var5.field2846, this.field2767[0].length);
        return var5;
    }

    @ObfuscatedName("hx.q(B)Z")
    public boolean method4548() {
        return this.field2764;
    }

    @ObfuscatedName("hx.m(B)Ljava/util/HashMap;")
    public HashMap method4549() {
        this.method4550();
        return this.field2766;
    }

    @ObfuscatedName("hx.x(I)V")
    public void method4550() {
        if (this.field2766 == null) {
            this.field2766 = new HashMap();
        }
        this.field2766.clear();
        for (int var1 = 0; var1 < this.field2767.length; var1++) {
            for (int var2 = 0; var2 < this.field2767[var1].length; var2++) {
                List var3 = this.field2767[var1][var2].method4449();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class244 var5 = (class244) var4.next();
                    if (var5.method4673()) {
                        int var6 = var5.method4295();
                        if (this.field2766.containsKey(var6)) {
                            List var8 = (List) this.field2766.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2766.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hx.j(III)F")
    public float method4551(int arg0, int arg1) {
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
