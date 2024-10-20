package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ak")
public final class class37 {

    @ObfuscatedName("ak.c")
    public boolean field335 = false;

    @ObfuscatedName("ak.t")
    public boolean field320 = false;

    @ObfuscatedName("ak.o")
    public class39 field321;

    @ObfuscatedName("ak.e")
    public class326 field322;

    @ObfuscatedName("ak.i")
    public HashMap field323;

    @ObfuscatedName("ak.g")
    public class30[][] field324;

    @ObfuscatedName("ak.d")
    public HashMap field325 = new HashMap();

    @ObfuscatedName("ak.l")
    public class325[] field326;

    @ObfuscatedName("ak.j")
    public final class235 field336;

    @ObfuscatedName("ak.m")
    public final class235 field332;

    @ObfuscatedName("ak.p")
    public final HashMap field329;

    @ObfuscatedName("ak.h")
    public int field333;

    @ObfuscatedName("ak.v")
    public int field331;

    @ObfuscatedName("ak.n")
    public int field327;

    @ObfuscatedName("ak.x")
    public int field328;

    @ObfuscatedName("ak.w")
    public int field334 = 0;

    public class37(class325[] arg0, HashMap arg1, class235 arg2, class235 arg3) {
        this.field326 = arg0;
        this.field329 = arg1;
        this.field336 = arg2;
        this.field332 = arg3;
    }

    @ObfuscatedName("ak.c(Lii;Ljava/lang/String;ZI)V")
    public void method562(class235 arg0, String arg1, boolean arg2) {
        if (this.field320) {
            return;
        }
        this.field335 = false;
        this.field320 = true;
        System.nanoTime();
        int var4 = arg0.method3854(class36.field314.field309);
        int var5 = arg0.method3855(var4, arg1);
        class301 var6 = new class301(arg0.method3914(class36.field314.field309, arg1));
        class301 var7 = new class301(arg0.method3914(class36.field310.field309, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field321 = new class39();
        try {
            this.field321.method577(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field321.method305();
        this.field321.method323();
        this.field321.method334();
        this.field333 = this.field321.method301() * 64;
        this.field331 = this.field321.method303() * 64;
        this.field327 = (this.field321.method302() - this.field321.method301() + 1) * 64;
        this.field328 = (this.field321.method304() - this.field321.method303() + 1) * 64;
        int var9 = this.field321.method302() - this.field321.method301() + 1;
        int var10 = this.field321.method304() - this.field321.method303() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.field261.method3130();
        this.field324 = new class30[var9][var10];
        Iterator var11 = this.field321.field340.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field177;
            int var14 = var12.field178;
            int var15 = var13 - this.field321.method301();
            int var16 = var14 - this.field321.method303();
            this.field324[var15][var16] = new class30(var13, var14, this.field321.method299(), this.field329);
            this.field324[var15][var16].method384(var12, this.field321.field339);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field324[var17][var18] == null) {
                    this.field324[var17][var18] = new class30(this.field321.method301() + var17, this.field321.method303() + var18, this.field321.method299(), this.field329);
                    this.field324[var17][var18].method382(this.field321.field338, this.field321.field339);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3928(class36.field311.field309, arg1)) {
            byte[] var19 = arg0.method3914(class36.field311.field309, arg1);
            this.field322 = class50.method151(var19);
        }
        System.nanoTime();
        arg0.method3850();
        arg0.method3852();
        this.field335 = true;
    }

    @ObfuscatedName("ak.t(I)V")
    public final void method541() {
        this.field323 = null;
    }

    @ObfuscatedName("ak.o(IIIIIIIIB)V")
    public final void method542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3848;
        int var10 = Statics.field3845;
        int var11 = Statics.field3846;
        int[] var12 = new int[4];
        class322.method5646(var12);
        class23 var13 = this.method551(arg0, arg1, arg2, arg3);
        float var14 = this.method550(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field334 = var15;
        if (!this.field325.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method614();
            this.field325.put(var15, var16);
        }
        int var17 = var13.field197 + var13.field192 - 1;
        int var18 = var13.field199 + var13.field193 - 1;
        for (int var19 = var13.field192; var19 <= var17; var19++) {
            for (int var20 = var13.field199; var20 <= var18; var20++) {
                this.field324[var19][var20].method389(var15, (class41) this.field325.get(var15), this.field326, this.field336, this.field332);
            }
        }
        class322.method5580(var9, var10, var11);
        class322.method5585(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field333 + arg0;
        int var23 = this.field331 + arg1;
        for (int var24 = var13.field192; var24 < var13.field197 + var13.field192; var24++) {
            for (int var25 = var13.field199; var25 < var13.field199 + var13.field193; var25++) {
                this.field324[var24][var25].method380((this.field324[var24][var25].field256 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field324[var24][var25].field257 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ak.e(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method551(arg0, arg1, arg2, arg3);
        float var15 = this.method550(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field333 + arg0;
        int var18 = this.field331 + arg1;
        for (int var19 = var14.field192; var19 < var14.field197 + var14.field192; var19++) {
            for (int var20 = var14.field199; var20 < var14.field199 + var14.field193; var20++) {
                if (arg12) {
                    this.field324[var19][var20].method385();
                }
                this.field324[var19][var20].method390((this.field324[var19][var20].field256 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field324[var19][var20].field257 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field192; var21 < var14.field197 + var14.field192; var21++) {
            for (int var22 = var14.field199; var22 < var14.field199 + var14.field193; var22++) {
                this.field324[var21][var22].method391(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ak.i(IIIILjava/util/HashSet;IIB)V")
    public void method544(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field322 == null) {
            return;
        }
        this.field322.method5738(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field323 == null) {
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
                var10 = (List) this.field323.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field306.field2539 - this.field333) * arg2 / this.field327;
                int var14 = arg3 - (var12.field306.field2537 - this.field331) * arg3 / this.field328;
                class322.method5584(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ak.g(IIIIIIIIIIB)Ljava/util/List;")
    public List method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field335) {
            return var11;
        }
        class23 var12 = this.method551(arg0, arg1, arg2, arg3);
        float var13 = this.method550(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field333 + arg0;
        int var16 = this.field331 + arg1;
        for (int var17 = var12.field192; var17 < var12.field197 + var12.field192; var17++) {
            for (int var18 = var12.field199; var18 < var12.field199 + var12.field193; var18++) {
                List var19 = this.field324[var17][var18].method410((this.field324[var17][var18].field256 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field324[var17][var18].field257 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ak.d(IIIII)Lr;")
    public class23 method551(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field333 + arg0;
        int var7 = this.field331 + arg1;
        int var8 = this.field333 + arg2;
        int var9 = this.field331 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field197 = var12 - var10 + 1;
        var5.field193 = var13 - var11 + 1;
        var5.field192 = var10 - this.field321.method301();
        var5.field199 = var11 - this.field321.method303();
        if (var5.field192 < 0) {
            var5.field197 += var5.field192;
            var5.field192 = 0;
        }
        if (var5.field192 > this.field324.length - var5.field197) {
            var5.field197 = this.field324.length - var5.field192;
        }
        if (var5.field199 < 0) {
            var5.field193 += var5.field199;
            var5.field199 = 0;
        }
        if (var5.field199 > this.field324[0].length - var5.field193) {
            var5.field193 = this.field324[0].length - var5.field199;
        }
        var5.field197 = Math.min(var5.field197, this.field324.length);
        var5.field193 = Math.min(var5.field193, this.field324[0].length);
        return var5;
    }

    @ObfuscatedName("ak.l(B)Z")
    public boolean method547() {
        return this.field335;
    }

    @ObfuscatedName("ak.j(B)Ljava/util/HashMap;")
    public HashMap method548() {
        this.method540();
        return this.field323;
    }

    @ObfuscatedName("ak.m(I)V")
    public void method540() {
        if (this.field323 == null) {
            this.field323 = new HashMap();
        }
        this.field323.clear();
        for (int var1 = 0; var1 < this.field324.length; var1++) {
            for (int var2 = 0; var2 < this.field324[var1].length; var2++) {
                List var3 = this.field324[var1][var2].method411();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method521()) {
                        int var6 = var5.method180();
                        if (this.field323.containsKey(var6)) {
                            List var8 = (List) this.field323.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field323.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.p(IIB)F")
    public float method550(int arg0, int arg1) {
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
