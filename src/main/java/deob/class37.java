package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ax")
public final class class37 {

    @ObfuscatedName("ax.a")
    public boolean field312 = false;

    @ObfuscatedName("ax.t")
    public boolean field307 = false;

    @ObfuscatedName("ax.n")
    public class39 field304;

    @ObfuscatedName("ax.q")
    public class325 field305;

    @ObfuscatedName("ax.v")
    public HashMap field313;

    @ObfuscatedName("ax.l")
    public class30[][] field302;

    @ObfuscatedName("ax.c")
    public HashMap field306 = new HashMap();

    @ObfuscatedName("ax.o")
    public class324[] field309;

    @ObfuscatedName("ax.i")
    public final class234 field319;

    @ObfuscatedName("ax.d")
    public final class234 field311;

    @ObfuscatedName("ax.m")
    public final HashMap field317;

    @ObfuscatedName("ax.p")
    public int field321;

    @ObfuscatedName("ax.h")
    public int field314;

    @ObfuscatedName("ax.k")
    public int field310;

    @ObfuscatedName("ax.x")
    public int field316;

    @ObfuscatedName("ax.j")
    public int field308 = 0;

    public class37(class324[] arg0, HashMap arg1, class234 arg2, class234 arg3) {
        this.field309 = arg0;
        this.field317 = arg1;
        this.field319 = arg2;
        this.field311 = arg3;
    }

    @ObfuscatedName("ax.a(Lhq;Ljava/lang/String;ZI)V")
    public void method608(class234 arg0, String arg1, boolean arg2) {
        if (this.field307) {
            return;
        }
        this.field312 = false;
        this.field307 = true;
        System.nanoTime();
        int var4 = arg0.method3891(class36.field289.field294);
        int var5 = arg0.method3870(var4, arg1);
        class300 var6 = new class300(arg0.method3878(class36.field289.field294, arg1));
        class300 var7 = new class300(arg0.method3878(class36.field290.field294, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field304 = new class39();
        try {
            this.field304.method610(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field304.method329();
        this.field304.method330();
        this.field304.method359();
        this.field321 = this.field304.method325() * 64;
        this.field314 = this.field304.method327() * 64;
        this.field310 = (this.field304.method311() - this.field304.method325() + 1) * 64;
        this.field316 = (this.field304.method370() - this.field304.method327() + 1) * 64;
        int var9 = this.field304.method311() - this.field304.method325() + 1;
        int var10 = this.field304.method370() - this.field304.method327() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.method2822();
        this.field302 = new class30[var9][var10];
        Iterator var11 = this.field304.field329.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field149;
            int var14 = var12.field150;
            int var15 = var13 - this.field304.method325();
            int var16 = var14 - this.field304.method327();
            this.field302[var15][var16] = new class30(var13, var14, this.field304.method323(), this.field317);
            this.field302[var15][var16].method403(var12, this.field304.field326);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field302[var17][var18] == null) {
                    this.field302[var17][var18] = new class30(this.field304.method325() + var17, this.field304.method327() + var18, this.field304.method323(), this.field317);
                    this.field302[var17][var18].method404(this.field304.field325, this.field304.field326);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3893(class36.field291.field294, arg1)) {
            byte[] var19 = arg0.method3878(class36.field291.field294, arg1);
            this.field305 = class50.method545(var19);
        }
        System.nanoTime();
        arg0.method3960();
        arg0.method3889();
        this.field312 = true;
    }

    @ObfuscatedName("ax.t(I)V")
    public final void method572() {
        this.field313 = null;
    }

    @ObfuscatedName("ax.n(IIIIIIIII)V")
    public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3834;
        int var10 = Statics.field3835;
        int var11 = Statics.field3837;
        int[] var12 = new int[4];
        class321.method5618(var12);
        class23 var13 = this.method577(arg0, arg1, arg2, arg3);
        float var14 = this.method570(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field308 = var15;
        if (!this.field306.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method683();
            this.field306.put(var15, var16);
        }
        int var17 = var13.field173 + var13.field170 - 1;
        int var18 = var13.field168 + var13.field167 - 1;
        for (int var19 = var13.field170; var19 <= var17; var19++) {
            for (int var20 = var13.field167; var20 <= var18; var20++) {
                this.field302[var19][var20].method485(var15, (class41) this.field306.get(var15), this.field309, this.field319, this.field311);
            }
        }
        class321.method5576(var9, var10, var11);
        class321.method5594(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field321 + arg0;
        int var23 = this.field314 + arg1;
        for (int var24 = var13.field170; var24 < var13.field173 + var13.field170; var24++) {
            for (int var25 = var13.field167; var25 < var13.field168 + var13.field167; var25++) {
                this.field302[var24][var25].method402((this.field302[var24][var25].field239 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field302[var24][var25].field240 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ax.q(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method577(arg0, arg1, arg2, arg3);
        float var15 = this.method570(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field321 + arg0;
        int var18 = this.field314 + arg1;
        for (int var19 = var14.field170; var19 < var14.field173 + var14.field170; var19++) {
            for (int var20 = var14.field167; var20 < var14.field168 + var14.field167; var20++) {
                if (arg12) {
                    this.field302[var19][var20].method407();
                }
                this.field302[var19][var20].method412((this.field302[var19][var20].field239 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field302[var19][var20].field240 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field170; var21 < var14.field173 + var14.field170; var21++) {
            for (int var22 = var14.field167; var22 < var14.field168 + var14.field167; var22++) {
                this.field302[var21][var22].method413(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ax.v(IIIILjava/util/HashSet;III)V")
    public void method575(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field305 == null) {
            return;
        }
        this.field305.method5685(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field313 == null) {
            this.method580();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field313.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field283.field2512 - this.field321) * arg2 / this.field310;
                int var14 = arg3 - (var12.field283.field2510 - this.field314) * arg3 / this.field316;
                class321.method5583(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ax.l(IIIIIIIIIIB)Ljava/util/List;")
    public List method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field312) {
            return var11;
        }
        class23 var12 = this.method577(arg0, arg1, arg2, arg3);
        float var13 = this.method570(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field321 + arg0;
        int var16 = this.field314 + arg1;
        for (int var17 = var12.field170; var17 < var12.field173 + var12.field170; var17++) {
            for (int var18 = var12.field167; var18 < var12.field168 + var12.field167; var18++) {
                List var19 = this.field302[var17][var18].method433((this.field302[var17][var18].field239 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field302[var17][var18].field240 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ax.c(IIIII)Lg;")
    public class23 method577(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field321 + arg0;
        int var7 = this.field314 + arg1;
        int var8 = this.field321 + arg2;
        int var9 = this.field314 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field173 = var12 - var10 + 1;
        var5.field168 = var13 - var11 + 1;
        var5.field170 = var10 - this.field304.method325();
        var5.field167 = var11 - this.field304.method327();
        if (var5.field170 < 0) {
            var5.field173 += var5.field170;
            var5.field170 = 0;
        }
        if (var5.field170 > this.field302.length - var5.field173) {
            var5.field173 = this.field302.length - var5.field170;
        }
        if (var5.field167 < 0) {
            var5.field168 += var5.field167;
            var5.field167 = 0;
        }
        if (var5.field167 > this.field302[0].length - var5.field168) {
            var5.field168 = this.field302[0].length - var5.field167;
        }
        var5.field173 = Math.min(var5.field173, this.field302.length);
        var5.field168 = Math.min(var5.field168, this.field302[0].length);
        return var5;
    }

    @ObfuscatedName("ax.o(I)Z")
    public boolean method578() {
        return this.field312;
    }

    @ObfuscatedName("ax.i(I)Ljava/util/HashMap;")
    public HashMap method573() {
        this.method580();
        return this.field313;
    }

    @ObfuscatedName("ax.d(I)V")
    public void method580() {
        if (this.field313 == null) {
            this.field313 = new HashMap();
        }
        this.field313.clear();
        for (int var1 = 0; var1 < this.field302.length; var1++) {
            for (int var2 = 0; var2 < this.field302[var1].length; var2++) {
                List var3 = this.field302[var1][var2].method504();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method550()) {
                        int var6 = var5.method210();
                        if (this.field313.containsKey(var6)) {
                            List var8 = (List) this.field313.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field313.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.m(IIS)F")
    public float method570(int arg0, int arg1) {
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
