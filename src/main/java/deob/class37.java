package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("al")
public final class class37 {

    @ObfuscatedName("al.n")
    public boolean field310 = false;

    @ObfuscatedName("al.h")
    public boolean field302 = false;

    @ObfuscatedName("al.l")
    public class39 field303;

    @ObfuscatedName("al.g")
    public class327 field304;

    @ObfuscatedName("al.b")
    public HashMap field305;

    @ObfuscatedName("al.a")
    public class30[][] field313;

    @ObfuscatedName("al.c")
    public HashMap field306 = new HashMap();

    @ObfuscatedName("al.z")
    public class326[] field307;

    @ObfuscatedName("al.j")
    public final class254 field309;

    @ObfuscatedName("al.d")
    public final class254 field314;

    @ObfuscatedName("al.t")
    public final HashMap field311;

    @ObfuscatedName("al.f")
    public int field312;

    @ObfuscatedName("al.i")
    public int field301;

    @ObfuscatedName("al.m")
    public int field321;

    @ObfuscatedName("al.v")
    public int field315;

    @ObfuscatedName("al.r")
    public int field316 = 0;

    public class37(class326[] arg0, HashMap arg1, class254 arg2, class254 arg3) {
        this.field307 = arg0;
        this.field311 = arg1;
        this.field309 = arg2;
        this.field314 = arg3;
    }

    @ObfuscatedName("al.n(Lij;Ljava/lang/String;ZB)V")
    public void method520(class254 arg0, String arg1, boolean arg2) {
        if (this.field302) {
            return;
        }
        this.field310 = false;
        this.field302 = true;
        System.nanoTime();
        int var4 = arg0.method4472(class36.field294.field297);
        int var5 = arg0.method4473(var4, arg1);
        class190 var6 = new class190(arg0.method4475(class36.field294.field297, arg1));
        class190 var7 = new class190(arg0.method4475(class36.field300.field297, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field303 = new class39();
        try {
            this.field303.method555(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field303.method303();
        this.field303.method333();
        this.field303.method305();
        this.field312 = this.field303.method334() * 64;
        this.field301 = this.field303.method321() * 64;
        this.field321 = (this.field303.method300() - this.field303.method334() + 1) * 64;
        this.field315 = (this.field303.method302() - this.field303.method321() + 1) * 64;
        int var9 = this.field303.method300() - this.field303.method334() + 1;
        int var10 = this.field303.method302() - this.field303.method321() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.method1056();
        this.field313 = new class30[var9][var10];
        Iterator var11 = this.field303.field324.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field164;
            int var14 = var12.field149;
            int var15 = var13 - this.field303.method334();
            int var16 = var14 - this.field303.method321();
            this.field313[var15][var16] = new class30(var13, var14, this.field303.method297(), this.field311);
            this.field313[var15][var16].method367(var12, this.field303.field323);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field313[var17][var18] == null) {
                    this.field313[var17][var18] = new class30(this.field303.method334() + var17, this.field303.method321() + var18, this.field303.method297(), this.field311);
                    this.field313[var17][var18].method425(this.field303.field322, this.field303.field323);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4517(class36.field295.field297, arg1)) {
            byte[] var19 = arg0.method4475(class36.field295.field297, arg1);
            this.field304 = class49.method1931(var19);
        }
        System.nanoTime();
        arg0.method4453();
        arg0.method4460();
        this.field310 = true;
    }

    @ObfuscatedName("al.h(I)V")
    public final void method544() {
        this.field305 = null;
    }

    @ObfuscatedName("al.l(IIIIIIIII)V")
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3855;
        int var10 = Statics.field3858;
        int var11 = Statics.field3854;
        int[] var12 = new int[4];
        class323.method5594(var12);
        class23 var13 = this.method519(arg0, arg1, arg2, arg3);
        float var14 = this.method529(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field316 = var15;
        if (!this.field306.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method595();
            this.field306.put(var15, var16);
        }
        int var17 = var13.field169 + var13.field168 - 1;
        int var18 = var13.field170 + var13.field166 - 1;
        for (int var19 = var13.field168; var19 <= var17; var19++) {
            for (int var20 = var13.field170; var20 <= var18; var20++) {
                this.field313[var19][var20].method384(var15, (class41) this.field306.get(var15), this.field307, this.field309, this.field314);
            }
        }
        class323.method5613(var9, var10, var11);
        class323.method5595(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field312 + arg0;
        int var23 = this.field301 + arg1;
        for (int var24 = var13.field168; var24 < var13.field169 + var13.field168; var24++) {
            for (int var25 = var13.field170; var25 < var13.field170 + var13.field166; var25++) {
                this.field313[var24][var25].method456((this.field313[var24][var25].field239 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field313[var24][var25].field236 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("al.g(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method519(arg0, arg1, arg2, arg3);
        float var15 = this.method529(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field312 + arg0;
        int var18 = this.field301 + arg1;
        for (int var19 = var14.field168; var19 < var14.field169 + var14.field168; var19++) {
            for (int var20 = var14.field170; var20 < var14.field170 + var14.field166; var20++) {
                if (arg12) {
                    this.field313[var19][var20].method465();
                }
                this.field313[var19][var20].method375((this.field313[var19][var20].field239 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field313[var19][var20].field236 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field168; var21 < var14.field169 + var14.field168; var21++) {
            for (int var22 = var14.field170; var22 < var14.field170 + var14.field166; var22++) {
                this.field313[var21][var22].method426(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("al.b(IIIILjava/util/HashSet;III)V")
    public void method524(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field304 == null) {
            return;
        }
        this.field304.method5700(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field305 == null) {
            this.method528();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field305.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field289.field2637 - this.field312) * arg2 / this.field321;
                int var14 = arg3 - (var12.field289.field2638 - this.field301) * arg3 / this.field315;
                class323.method5598(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("al.a(IIIIIIIIIII)Ljava/util/List;")
    public List method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field310) {
            return var11;
        }
        class23 var12 = this.method519(arg0, arg1, arg2, arg3);
        float var13 = this.method529(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field312 + arg0;
        int var16 = this.field301 + arg1;
        for (int var17 = var12.field168; var17 < var12.field169 + var12.field168; var17++) {
            for (int var18 = var12.field170; var18 < var12.field170 + var12.field166; var18++) {
                List var19 = this.field313[var17][var18].method396((this.field313[var17][var18].field239 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field313[var17][var18].field236 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("al.c(IIIIB)Lu;")
    public class23 method519(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field312 + arg0;
        int var7 = this.field301 + arg1;
        int var8 = this.field312 + arg2;
        int var9 = this.field301 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field169 = var12 - var10 + 1;
        var5.field166 = var13 - var11 + 1;
        var5.field168 = var10 - this.field303.method334();
        var5.field170 = var11 - this.field303.method321();
        if (var5.field168 < 0) {
            var5.field169 += var5.field168;
            var5.field168 = 0;
        }
        if (var5.field168 > this.field313.length - var5.field169) {
            var5.field169 = this.field313.length - var5.field168;
        }
        if (var5.field170 < 0) {
            var5.field166 += var5.field170;
            var5.field170 = 0;
        }
        if (var5.field170 > this.field313[0].length - var5.field166) {
            var5.field166 = this.field313[0].length - var5.field170;
        }
        var5.field169 = Math.min(var5.field169, this.field313.length);
        var5.field166 = Math.min(var5.field166, this.field313[0].length);
        return var5;
    }

    @ObfuscatedName("al.z(I)Z")
    public boolean method526() {
        return this.field310;
    }

    @ObfuscatedName("al.j(S)Ljava/util/HashMap;")
    public HashMap method539() {
        this.method528();
        return this.field305;
    }

    @ObfuscatedName("al.d(I)V")
    public void method528() {
        if (this.field305 == null) {
            this.field305 = new HashMap();
        }
        this.field305.clear();
        for (int var1 = 0; var1 < this.field313.length; var1++) {
            for (int var2 = 0; var2 < this.field313[var1].length; var2++) {
                List var3 = this.field313[var1][var2].method397();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method508()) {
                        int var6 = var5.method185();
                        if (this.field305.containsKey(var6)) {
                            List var8 = (List) this.field305.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field305.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.i(III)F")
    public float method529(int arg0, int arg1) {
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
