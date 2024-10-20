package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("al")
public final class class37 {

    @ObfuscatedName("al.z")
    public boolean field292 = false;

    @ObfuscatedName("al.n")
    public boolean field291 = false;

    @ObfuscatedName("al.v")
    public class39 field293;

    @ObfuscatedName("al.u")
    public class325 field296;

    @ObfuscatedName("al.r")
    public HashMap field295;

    @ObfuscatedName("al.p")
    public class30[][] field303;

    @ObfuscatedName("al.q")
    public HashMap field302 = new HashMap();

    @ObfuscatedName("al.m")
    public class324[] field298;

    @ObfuscatedName("al.y")
    public final class234 field299;

    @ObfuscatedName("al.i")
    public final class234 field300;

    @ObfuscatedName("al.c")
    public final HashMap field301;

    @ObfuscatedName("al.b")
    public int field297;

    @ObfuscatedName("al.o")
    public int field304;

    @ObfuscatedName("al.a")
    public int field305;

    @ObfuscatedName("al.e")
    public int field294;

    @ObfuscatedName("al.w")
    public int field306 = 0;

    public class37(class324[] arg0, HashMap arg1, class234 arg2, class234 arg3) {
        this.field298 = arg0;
        this.field301 = arg1;
        this.field299 = arg2;
        this.field300 = arg3;
    }

    @ObfuscatedName("al.z(Lhp;Ljava/lang/String;ZS)V")
    public void method541(class234 arg0, String arg1, boolean arg2) {
        if (this.field291) {
            return;
        }
        this.field292 = false;
        this.field291 = true;
        System.nanoTime();
        int var4 = arg0.method3765(class36.field285.field289);
        int var5 = arg0.method3745(var4, arg1);
        class300 var6 = new class300(arg0.method3789(class36.field285.field289, arg1));
        class300 var7 = new class300(arg0.method3789(class36.field290.field289, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field293 = new class39();
        try {
            this.field293.method585(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field293.method333();
        this.field293.method294();
        this.field293.method355();
        this.field297 = this.field293.method301() * 64;
        this.field304 = this.field293.method303() * 64;
        this.field305 = (this.field293.method351() - this.field293.method301() + 1) * 64;
        this.field294 = (this.field293.method304() - this.field293.method303() + 1) * 64;
        int var9 = this.field293.method351() - this.field293.method301() + 1;
        int var10 = this.field293.method304() - this.field293.method303() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.method29();
        this.field303 = new class30[var9][var10];
        Iterator var11 = this.field293.field313.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field155;
            int var14 = var12.field156;
            int var15 = var13 - this.field293.method301();
            int var16 = var14 - this.field293.method303();
            this.field303[var15][var16] = new class30(var13, var14, this.field293.method299(), this.field301);
            this.field303[var15][var16].method378(var12, this.field293.field310);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field303[var17][var18] == null) {
                    this.field303[var17][var18] = new class30(this.field293.method301() + var17, this.field293.method303() + var18, this.field293.method299(), this.field301);
                    this.field303[var17][var18].method476(this.field293.field311, this.field293.field310);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3814(class36.field284.field289, arg1)) {
            byte[] var19 = arg0.method3789(class36.field284.field289, arg1);
            this.field296 = class50.method652(var19);
        }
        System.nanoTime();
        arg0.method3740();
        arg0.method3742();
        this.field292 = true;
    }

    @ObfuscatedName("al.n(I)V")
    public final void method542() {
        this.field295 = null;
    }

    @ObfuscatedName("al.v(IIIIIIIII)V")
    public final void method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3850;
        int var10 = Statics.field3846;
        int var11 = Statics.field3845;
        int[] var12 = new int[4];
        class321.method5440(var12);
        class23 var13 = this.method553(arg0, arg1, arg2, arg3);
        float var14 = this.method551(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field306 = var15;
        if (!this.field302.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method631();
            this.field302.put(var15, var16);
        }
        int var17 = var13.field172 + var13.field169 - 1;
        int var18 = var13.field173 + var13.field171 - 1;
        for (int var19 = var13.field169; var19 <= var17; var19++) {
            for (int var20 = var13.field171; var20 <= var18; var20++) {
                this.field303[var19][var20].method386(var15, (class41) this.field302.get(var15), this.field298, this.field299, this.field300);
            }
        }
        class321.method5437(var9, var10, var11);
        class321.method5457(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field297 + arg0;
        int var23 = this.field304 + arg1;
        for (int var24 = var13.field169; var24 < var13.field172 + var13.field169; var24++) {
            for (int var25 = var13.field171; var25 < var13.field173 + var13.field171; var25++) {
                this.field303[var24][var25].method377((this.field303[var24][var25].field239 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field303[var24][var25].field241 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("al.u(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method553(arg0, arg1, arg2, arg3);
        float var15 = this.method551(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field297 + arg0;
        int var18 = this.field304 + arg1;
        for (int var19 = var14.field169; var19 < var14.field172 + var14.field169; var19++) {
            for (int var20 = var14.field171; var20 < var14.field173 + var14.field171; var20++) {
                if (arg12) {
                    this.field303[var19][var20].method461();
                }
                this.field303[var19][var20].method387((this.field303[var19][var20].field239 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field303[var19][var20].field241 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field169; var21 < var14.field172 + var14.field169; var21++) {
            for (int var22 = var14.field171; var22 < var14.field173 + var14.field171; var22++) {
                this.field303[var21][var22].method414(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("al.r(IIIILjava/util/HashSet;IIB)V")
    public void method545(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field296 == null) {
            return;
        }
        this.field296.method5556(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field295 == null) {
            this.method570();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field295.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field282.field2515 - this.field297) * arg2 / this.field305;
                int var14 = arg3 - (var12.field282.field2514 - this.field304) * arg3 / this.field294;
                class321.method5444(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("al.p(IIIIIIIIIII)Ljava/util/List;")
    public List method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field292) {
            return var11;
        }
        class23 var12 = this.method553(arg0, arg1, arg2, arg3);
        float var13 = this.method551(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field297 + arg0;
        int var16 = this.field304 + arg1;
        for (int var17 = var12.field169; var17 < var12.field172 + var12.field169; var17++) {
            for (int var18 = var12.field171; var18 < var12.field173 + var12.field171; var18++) {
                List var19 = this.field303[var17][var18].method408((this.field303[var17][var18].field239 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field303[var17][var18].field241 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("al.q(IIIII)Lj;")
    public class23 method553(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field297 + arg0;
        int var7 = this.field304 + arg1;
        int var8 = this.field297 + arg2;
        int var9 = this.field304 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field172 = var12 - var10 + 1;
        var5.field173 = var13 - var11 + 1;
        var5.field169 = var10 - this.field293.method301();
        var5.field171 = var11 - this.field293.method303();
        if (var5.field169 < 0) {
            var5.field172 += var5.field169;
            var5.field169 = 0;
        }
        if (var5.field169 > this.field303.length - var5.field172) {
            var5.field172 = this.field303.length - var5.field169;
        }
        if (var5.field171 < 0) {
            var5.field173 += var5.field171;
            var5.field171 = 0;
        }
        if (var5.field171 > this.field303[0].length - var5.field173) {
            var5.field173 = this.field303[0].length - var5.field171;
        }
        var5.field172 = Math.min(var5.field172, this.field303.length);
        var5.field173 = Math.min(var5.field173, this.field303[0].length);
        return var5;
    }

    @ObfuscatedName("al.m(I)Z")
    public boolean method548() {
        return this.field292;
    }

    @ObfuscatedName("al.y(I)Ljava/util/HashMap;")
    public HashMap method549() {
        this.method570();
        return this.field295;
    }

    @ObfuscatedName("al.i(I)V")
    public void method570() {
        if (this.field295 == null) {
            this.field295 = new HashMap();
        }
        this.field295.clear();
        for (int var1 = 0; var1 < this.field303.length; var1++) {
            for (int var2 = 0; var2 < this.field303[var1].length; var2++) {
                List var3 = this.field303[var1][var2].method495();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method525()) {
                        int var6 = var5.method196();
                        if (this.field295.containsKey(var6)) {
                            List var8 = (List) this.field295.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field295.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.c(III)F")
    public float method551(int arg0, int arg1) {
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
