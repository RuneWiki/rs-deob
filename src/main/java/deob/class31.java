package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ae")
public final class class31 {

    @ObfuscatedName("ae.g")
    public boolean field302 = false;

    @ObfuscatedName("ae.r")
    public boolean field301 = false;

    @ObfuscatedName("ae.e")
    public class34 field303;

    @ObfuscatedName("ae.q")
    public class324 field309;

    @ObfuscatedName("ae.c")
    public HashMap field304;

    @ObfuscatedName("ae.l")
    public class24[][] field305;

    @ObfuscatedName("ae.b")
    public HashMap field306 = new HashMap();

    @ObfuscatedName("ae.w")
    public class323[] field307;

    @ObfuscatedName("ae.n")
    public final HashMap field308;

    @ObfuscatedName("ae.i")
    public int field311;

    @ObfuscatedName("ae.p")
    public int field310;

    @ObfuscatedName("ae.m")
    public int field300;

    @ObfuscatedName("ae.d")
    public int field312;

    @ObfuscatedName("ae.j")
    public int field313 = 0;

    public class31(class323[] arg0, HashMap arg1) {
        this.field307 = arg0;
        this.field308 = arg1;
    }

    @ObfuscatedName("ae.g(Liu;Ljava/lang/String;ZI)V")
    public void method496(class250 arg0, String arg1, boolean arg2) {
        if (this.field301) {
            return;
        }
        this.field302 = false;
        this.field301 = true;
        System.nanoTime();
        int var4 = arg0.method4432(class30.field292.field299);
        int var5 = arg0.method4454(var4, arg1);
        class185 var6 = new class185(arg0.method4456(class30.field292.field299, arg1));
        class185 var7 = new class185(arg0.method4456(class30.field289.field299, arg1));
        class185 var8 = new class185(arg0.method4456(arg1, class30.field291.field299));
        System.nanoTime();
        System.nanoTime();
        this.field303 = new class34();
        try {
            this.field303.method549(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field303.method284();
        this.field303.method237();
        this.field303.method246();
        this.field311 = this.field303.method261() * 64;
        this.field310 = this.field303.method232() * 64;
        this.field300 = (this.field303.method241() - this.field303.method261() + 1) * 64;
        this.field312 = (this.field303.method252() - this.field303.method232() + 1) * 64;
        int var10 = this.field303.method241() - this.field303.method261() + 1;
        int var11 = this.field303.method252() - this.field303.method232() + 1;
        System.nanoTime();
        System.nanoTime();
        class24.method1719();
        this.field305 = new class24[var10][var11];
        Iterator var12 = this.field303.field328.iterator();
        while (var12.hasNext()) {
            class11 var13 = (class11) var12.next();
            int var14 = var13.field147;
            int var15 = var13.field152;
            int var16 = var14 - this.field303.method261();
            int var17 = var15 - this.field303.method232();
            this.field305[var16][var17] = new class24(var14, var15, this.field303.method238(), this.field308);
            this.field305[var16][var17].method318(var13, this.field303.field327);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field305[var18][var19] == null) {
                    this.field305[var18][var19] = new class24(this.field303.method261() + var18, this.field303.method232() + var19, this.field303.method238(), this.field308);
                    this.field305[var18][var19].method427(this.field303.field325, this.field303.field327);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4455(class30.field290.field299, arg1)) {
            byte[] var20 = arg0.method4456(class30.field290.field299, arg1);
            this.field309 = class44.method1839(var20);
        }
        System.nanoTime();
        arg0.method4449();
        arg0.method4451();
        this.field302 = true;
    }

    @ObfuscatedName("ae.r(I)V")
    public final void method508() {
        this.field304 = null;
    }

    @ObfuscatedName("ae.e(IIIIIIIII)V")
    public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3857;
        int var10 = Statics.field3855;
        int var11 = Statics.field3856;
        int[] var12 = new int[4];
        class320.method5646(var12);
        class18 var13 = this.method503(arg0, arg1, arg2, arg3);
        float var14 = this.method523(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field313 = var15;
        if (!this.field306.containsKey(var15)) {
            class36 var16 = new class36(var15);
            var16.method593();
            this.field306.put(var15, var16);
        }
        class24[] var17 = new class24[8];
        for (int var18 = var13.field160; var18 < var13.field164 + var13.field160; var18++) {
            for (int var19 = var13.field161; var19 < var13.field161 + var13.field158; var19++) {
                this.method495(var18, var19, var17);
                this.field305[var18][var19].method322(var15, (class36) this.field306.get(var15), var17, this.field307);
            }
        }
        class320.method5574(var9, var10, var11);
        class320.method5586(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field311 + arg0;
        int var22 = this.field310 + arg1;
        for (int var23 = var13.field160; var23 < var13.field164 + var13.field160; var23++) {
            for (int var24 = var13.field161; var24 < var13.field161 + var13.field158; var24++) {
                this.field305[var23][var24].method317((this.field305[var23][var24].field234 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field305[var23][var24].field235 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ae.q(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class18 var14 = this.method503(arg0, arg1, arg2, arg3);
        float var15 = this.method523(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field311 + arg0;
        int var18 = this.field310 + arg1;
        for (int var19 = var14.field160; var19 < var14.field164 + var14.field160; var19++) {
            for (int var20 = var14.field161; var20 < var14.field161 + var14.field158; var20++) {
                if (arg12) {
                    this.field305[var19][var20].method417();
                }
                this.field305[var19][var20].method397((this.field305[var19][var20].field234 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field305[var19][var20].field235 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field160; var21 < var14.field164 + var14.field160; var21++) {
            for (int var22 = var14.field161; var22 < var14.field161 + var14.field158; var22++) {
                this.field305[var21][var22].method324(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ae.c(II[Ly;B)V")
    public void method495(int arg0, int arg1, class24[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field305.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field305[0].length - 1;
        if (var7) {
            arg2[class243.field3173.method172()] = null;
        } else {
            arg2[class243.field3173.method172()] = this.field305[arg0][arg1 + 1];
        }
        arg2[class243.field3164.method172()] = var7 || var5 ? null : this.field305[arg0 + 1][arg1 + 1];
        arg2[class243.field3168.method172()] = var7 || var4 ? null : this.field305[arg0 - 1][arg1 + 1];
        arg2[class243.field3165.method172()] = var5 ? null : this.field305[arg0 + 1][arg1];
        arg2[class243.field3169.method172()] = var4 ? null : this.field305[arg0 - 1][arg1];
        arg2[class243.field3167.method172()] = var6 ? null : this.field305[arg0][arg1 - 1];
        arg2[class243.field3163.method172()] = var6 || var5 ? null : this.field305[arg0 + 1][arg1 - 1];
        arg2[class243.field3170.method172()] = var6 || var4 ? null : this.field305[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ae.i(IIIILjava/util/HashSet;III)V")
    public void method501(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field309 == null) {
            return;
        }
        this.field309.method5691(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field304 == null) {
            this.method530();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field304.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class29 var12 = (class29) var11.next();
                int var13 = (var12.field278.field2633 - this.field311) * arg2 / this.field300;
                int var14 = arg3 - (var12.field278.field2634 - this.field310) * arg3 / this.field312;
                class320.method5631(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ae.p(IIIIIIIIIII)Ljava/util/List;")
    public List method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field302) {
            return var11;
        }
        class18 var12 = this.method503(arg0, arg1, arg2, arg3);
        float var13 = this.method523(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field311 + arg0;
        int var16 = this.field310 + arg1;
        for (int var17 = var12.field160; var17 < var12.field164 + var12.field160; var17++) {
            for (int var18 = var12.field161; var18 < var12.field161 + var12.field158; var18++) {
                List var19 = this.field305[var17][var18].method352((this.field305[var17][var18].field234 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field305[var17][var18].field235 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ae.m(IIIII)Lf;")
    public class18 method503(int arg0, int arg1, int arg2, int arg3) {
        class18 var5 = new class18(this);
        int var6 = this.field311 + arg0;
        int var7 = this.field310 + arg1;
        int var8 = this.field311 + arg2;
        int var9 = this.field310 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field164 = var12 - var10 + 1;
        var5.field158 = var13 - var11 + 1;
        var5.field160 = var10 - this.field303.method261();
        var5.field161 = var11 - this.field303.method232();
        if (var5.field160 < 0) {
            var5.field164 += var5.field160;
            var5.field160 = 0;
        }
        if (var5.field160 > this.field305.length - var5.field164) {
            var5.field164 = this.field305.length - var5.field160;
        }
        if (var5.field161 < 0) {
            var5.field158 += var5.field161;
            var5.field161 = 0;
        }
        if (var5.field161 > this.field305[0].length - var5.field158) {
            var5.field158 = this.field305[0].length - var5.field161;
        }
        var5.field164 = Math.min(var5.field164, this.field305.length);
        var5.field158 = Math.min(var5.field158, this.field305[0].length);
        return var5;
    }

    @ObfuscatedName("ae.d(I)Z")
    public boolean method504() {
        return this.field302;
    }

    @ObfuscatedName("ae.j(I)Ljava/util/HashMap;")
    public HashMap method505() {
        this.method530();
        return this.field304;
    }

    @ObfuscatedName("ae.x(I)V")
    public void method530() {
        if (this.field304 == null) {
            this.field304 = new HashMap();
        }
        this.field304.clear();
        for (int var1 = 0; var1 < this.field305.length; var1++) {
            for (int var2 = 0; var2 < this.field305[var1].length; var2++) {
                List var3 = this.field305[var1][var2].method387();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class29 var5 = (class29) var4.next();
                    if (this.field304.containsKey(var5.field286)) {
                        List var7 = (List) this.field304.get(var5.field286);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field304.put(var5.field286, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.v(III)F")
    public float method523(int arg0, int arg1) {
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
