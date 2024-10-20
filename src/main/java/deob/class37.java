package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ao")
public final class class37 {

    @ObfuscatedName("ao.q")
    public boolean field322 = false;

    @ObfuscatedName("ao.w")
    public boolean field312 = false;

    @ObfuscatedName("ao.e")
    public class39 field313;

    @ObfuscatedName("ao.p")
    public class326 field314;

    @ObfuscatedName("ao.k")
    public HashMap field317;

    @ObfuscatedName("ao.l")
    public class30[][] field316;

    @ObfuscatedName("ao.b")
    public HashMap field318 = new HashMap();

    @ObfuscatedName("ao.i")
    public class325[] field321;

    @ObfuscatedName("ao.c")
    public final class234 field319;

    @ObfuscatedName("ao.f")
    public final class234 field324;

    @ObfuscatedName("ao.m")
    public final HashMap field323;

    @ObfuscatedName("ao.u")
    public int field320;

    @ObfuscatedName("ao.x")
    public int field326;

    @ObfuscatedName("ao.r")
    public int field315;

    @ObfuscatedName("ao.v")
    public int field325;

    @ObfuscatedName("ao.y")
    public int field311 = 0;

    public class37(class325[] arg0, HashMap arg1, class234 arg2, class234 arg3) {
        this.field321 = arg0;
        this.field323 = arg1;
        this.field319 = arg2;
        this.field324 = arg3;
    }

    @ObfuscatedName("ao.q(Lhp;Ljava/lang/String;ZB)V")
    public void method510(class234 arg0, String arg1, boolean arg2) {
        if (this.field312) {
            return;
        }
        this.field322 = false;
        this.field312 = true;
        System.nanoTime();
        int var4 = arg0.method3791(class36.field309.field307);
        int var5 = arg0.method3792(var4, arg1);
        class301 var6 = new class301(arg0.method3794(class36.field309.field307, arg1));
        class301 var7 = new class301(arg0.method3794(class36.field303.field307, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field313 = new class39();
        try {
            this.field313.method553(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field313.method286();
        this.field313.method287();
        this.field313.method349();
        this.field320 = this.field313.method282() * 64;
        this.field326 = this.field313.method284() * 64;
        this.field315 = (this.field313.method283() - this.field313.method282() + 1) * 64;
        this.field325 = (this.field313.method285() - this.field313.method284() + 1) * 64;
        int var9 = this.field313.method283() - this.field313.method282() + 1;
        int var10 = this.field313.method285() - this.field313.method284() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.method1878();
        this.field316 = new class30[var9][var10];
        Iterator var11 = this.field313.field334.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field158;
            int var14 = var12.field159;
            int var15 = var13 - this.field313.method282();
            int var16 = var14 - this.field313.method284();
            this.field316[var15][var16] = new class30(var13, var14, this.field313.method269(), this.field323);
            this.field316[var15][var16].method367(var12, this.field313.field332);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field316[var17][var18] == null) {
                    this.field316[var17][var18] = new class30(this.field313.method282() + var17, this.field313.method284() + var18, this.field313.method269(), this.field323);
                    this.field316[var17][var18].method368(this.field313.field331, this.field313.field332);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3793(class36.field304.field307, arg1)) {
            byte[] var19 = arg0.method3794(class36.field304.field307, arg1);
            this.field314 = class50.method3146(var19);
        }
        System.nanoTime();
        arg0.method3787();
        arg0.method3789();
        this.field322 = true;
    }

    @ObfuscatedName("ao.w(I)V")
    public final void method547() {
        this.field317 = null;
    }

    @ObfuscatedName("ao.e(IIIIIIIIB)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3870;
        int var10 = Statics.field3876;
        int var11 = Statics.field3872;
        int[] var12 = new int[4];
        class322.method5526(var12);
        class23 var13 = this.method549(arg0, arg1, arg2, arg3);
        float var14 = this.method520(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field311 = var15;
        if (!this.field318.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method602();
            this.field318.put(var15, var16);
        }
        int var17 = var13.field181 + var13.field176 - 1;
        int var18 = var13.field178 + var13.field177 - 1;
        for (int var19 = var13.field176; var19 <= var17; var19++) {
            for (int var20 = var13.field178; var20 <= var18; var20++) {
                this.field316[var19][var20].method417(var15, (class41) this.field318.get(var15), this.field321, this.field319, this.field324);
            }
        }
        class322.method5560(var9, var10, var11);
        class322.method5540(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field320 + arg0;
        int var23 = this.field326 + arg1;
        for (int var24 = var13.field176; var24 < var13.field181 + var13.field176; var24++) {
            for (int var25 = var13.field178; var25 < var13.field178 + var13.field177; var25++) {
                this.field316[var24][var25].method450((this.field316[var24][var25].field246 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field316[var24][var25].field247 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ao.p(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method549(arg0, arg1, arg2, arg3);
        float var15 = this.method520(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field320 + arg0;
        int var18 = this.field326 + arg1;
        for (int var19 = var14.field176; var19 < var14.field181 + var14.field176; var19++) {
            for (int var20 = var14.field178; var20 < var14.field178 + var14.field177; var20++) {
                if (arg12) {
                    this.field316[var19][var20].method436();
                }
                this.field316[var19][var20].method376((this.field316[var19][var20].field246 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field316[var19][var20].field247 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field176; var21 < var14.field181 + var14.field176; var21++) {
            for (int var22 = var14.field178; var22 < var14.field178 + var14.field177; var22++) {
                this.field316[var21][var22].method377(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ao.k(IIIILjava/util/HashSet;III)V")
    public void method514(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field314 == null) {
            return;
        }
        this.field314.method5645(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field317 == null) {
            this.method540();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field317.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field298.field2531 - this.field320) * arg2 / this.field315;
                int var14 = arg3 - (var12.field298.field2529 - this.field326) * arg3 / this.field325;
                class322.method5552(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ao.l(IIIIIIIIIII)Ljava/util/List;")
    public List method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field322) {
            return var11;
        }
        class23 var12 = this.method549(arg0, arg1, arg2, arg3);
        float var13 = this.method520(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field320 + arg0;
        int var16 = this.field326 + arg1;
        for (int var17 = var12.field176; var17 < var12.field181 + var12.field176; var17++) {
            for (int var18 = var12.field178; var18 < var12.field178 + var12.field177; var18++) {
                List var19 = this.field316[var17][var18].method384((this.field316[var17][var18].field246 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field316[var17][var18].field247 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ao.b(IIIII)Ln;")
    public class23 method549(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field320 + arg0;
        int var7 = this.field326 + arg1;
        int var8 = this.field320 + arg2;
        int var9 = this.field326 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field181 = var12 - var10 + 1;
        var5.field177 = var13 - var11 + 1;
        var5.field176 = var10 - this.field313.method282();
        var5.field178 = var11 - this.field313.method284();
        if (var5.field176 < 0) {
            var5.field181 += var5.field176;
            var5.field176 = 0;
        }
        if (var5.field176 > this.field316.length - var5.field181) {
            var5.field181 = this.field316.length - var5.field176;
        }
        if (var5.field178 < 0) {
            var5.field177 += var5.field178;
            var5.field178 = 0;
        }
        if (var5.field178 > this.field316[0].length - var5.field177) {
            var5.field177 = this.field316[0].length - var5.field178;
        }
        var5.field181 = Math.min(var5.field181, this.field316.length);
        var5.field177 = Math.min(var5.field177, this.field316[0].length);
        return var5;
    }

    @ObfuscatedName("ao.i(I)Z")
    public boolean method517() {
        return this.field322;
    }

    @ObfuscatedName("ao.c(I)Ljava/util/HashMap;")
    public HashMap method518() {
        this.method540();
        return this.field317;
    }

    @ObfuscatedName("ao.u(I)V")
    public void method540() {
        if (this.field317 == null) {
            this.field317 = new HashMap();
        }
        this.field317.clear();
        for (int var1 = 0; var1 < this.field316.length; var1++) {
            for (int var2 = 0; var2 < this.field316[var1].length; var2++) {
                List var3 = this.field316[var1][var2].method397();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method497()) {
                        int var6 = var5.method176();
                        if (this.field317.containsKey(var6)) {
                            List var8 = (List) this.field317.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field317.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.x(III)F")
    public float method520(int arg0, int arg1) {
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
