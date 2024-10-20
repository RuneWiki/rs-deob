package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ay")
public final class class31 {

    @ObfuscatedName("ay.v")
    public boolean field274 = false;

    @ObfuscatedName("ay.s")
    public boolean field279 = false;

    @ObfuscatedName("ay.o")
    public class34 field275;

    @ObfuscatedName("ay.k")
    public class322 field283;

    @ObfuscatedName("ay.u")
    public HashMap field277;

    @ObfuscatedName("ay.i")
    public class24[][] field278;

    @ObfuscatedName("ay.t")
    public HashMap field273 = new HashMap();

    @ObfuscatedName("ay.p")
    public class321[] field280;

    @ObfuscatedName("ay.l")
    public final HashMap field281;

    @ObfuscatedName("ay.b")
    public int field282;

    @ObfuscatedName("ay.c")
    public int field286;

    @ObfuscatedName("ay.d")
    public int field276;

    @ObfuscatedName("ay.w")
    public int field285;

    @ObfuscatedName("ay.a")
    public int field284 = 0;

    public class31(class321[] arg0, HashMap arg1) {
        this.field280 = arg0;
        this.field281 = arg1;
    }

    @ObfuscatedName("ay.v(Lis;Ljava/lang/String;ZI)V")
    public void method489(class250 arg0, String arg1, boolean arg2) {
        if (this.field279) {
            return;
        }
        this.field274 = false;
        this.field279 = true;
        System.nanoTime();
        int var4 = arg0.method4288(class30.field272.field265);
        int var5 = arg0.method4289(var4, arg1);
        class185 var6 = new class185(arg0.method4291(class30.field272.field265, arg1));
        class185 var7 = new class185(arg0.method4291(class30.field261.field265, arg1));
        class185 var8 = new class185(arg0.method4291(arg1, class30.field271.field265));
        System.nanoTime();
        System.nanoTime();
        this.field275 = new class34();
        try {
            this.field275.method537(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field275.method240();
        this.field275.method223();
        this.field275.method242();
        this.field282 = this.field275.method236() * 64;
        this.field286 = this.field275.method238() * 64;
        this.field276 = (this.field275.method279() - this.field275.method236() + 1) * 64;
        this.field285 = (this.field275.method239() - this.field275.method238() + 1) * 64;
        int var10 = this.field275.method279() - this.field275.method236() + 1;
        int var11 = this.field275.method239() - this.field275.method238() + 1;
        System.nanoTime();
        System.nanoTime();
        class24.method459();
        this.field278 = new class24[var10][var11];
        Iterator var12 = this.field275.field307.iterator();
        while (var12.hasNext()) {
            class11 var13 = (class11) var12.next();
            int var14 = var13.field133;
            int var15 = var13.field142;
            int var16 = var14 - this.field275.method236();
            int var17 = var15 - this.field275.method238();
            this.field278[var16][var17] = new class24(var14, var15, this.field275.method234(), this.field281);
            this.field278[var16][var17].method310(var13, this.field275.field304);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field278[var18][var19] == null) {
                    this.field278[var18][var19] = new class24(this.field275.method236() + var18, this.field275.method238() + var19, this.field275.method234(), this.field281);
                    this.field278[var18][var19].method311(this.field275.field303, this.field275.field304);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4290(class30.field268.field265, arg1)) {
            byte[] var20 = arg0.method4291(class30.field268.field265, arg1);
            this.field283 = class44.method2465(var20);
        }
        System.nanoTime();
        arg0.method4284();
        arg0.method4286();
        this.field274 = true;
    }

    @ObfuscatedName("ay.s(I)V")
    public final void method490() {
        this.field277 = null;
    }

    @ObfuscatedName("ay.o(IIIIIIIIB)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3802;
        int var10 = Statics.field3799;
        int var11 = Statics.field3798;
        int[] var12 = new int[4];
        class318.method5370(var12);
        class18 var13 = this.method488(arg0, arg1, arg2, arg3);
        float var14 = this.method509(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field284 = var15;
        if (!this.field273.containsKey(var15)) {
            class36 var16 = new class36(var15);
            var16.method580();
            this.field273.put(var15, var16);
        }
        class24[] var17 = new class24[8];
        for (int var18 = var13.field146; var18 < var13.field146 + var13.field144; var18++) {
            for (int var19 = var13.field147; var19 < var13.field149 + var13.field147; var19++) {
                this.method514(var18, var19, var17);
                this.field278[var18][var19].method314(var15, (class36) this.field273.get(var15), var17, this.field280);
            }
        }
        class318.method5366(var9, var10, var11);
        class318.method5371(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field282 + arg0;
        int var22 = this.field286 + arg1;
        for (int var23 = var13.field146; var23 < var13.field146 + var13.field144; var23++) {
            for (int var24 = var13.field147; var24 < var13.field149 + var13.field147; var24++) {
                this.field278[var23][var24].method385((this.field278[var23][var24].field209 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field278[var23][var24].field212 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ay.k(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class18 var14 = this.method488(arg0, arg1, arg2, arg3);
        float var15 = this.method509(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field282 + arg0;
        int var18 = this.field286 + arg1;
        for (int var19 = var14.field146; var19 < var14.field146 + var14.field144; var19++) {
            for (int var20 = var14.field147; var20 < var14.field149 + var14.field147; var20++) {
                if (arg12) {
                    this.field278[var19][var20].method336();
                }
                this.field278[var19][var20].method341((this.field278[var19][var20].field209 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field278[var19][var20].field212 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field146; var21 < var14.field146 + var14.field144; var21++) {
            for (int var22 = var14.field147; var22 < var14.field149 + var14.field147; var22++) {
                this.field278[var21][var22].method316(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ay.u(II[Lr;I)V")
    public void method514(int arg0, int arg1, class24[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field278.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field278[0].length - 1;
        if (var7) {
            arg2[class243.field3134.method174()] = null;
        } else {
            arg2[class243.field3134.method174()] = this.field278[arg0][arg1 + 1];
        }
        arg2[class243.field3130.method174()] = var7 || var5 ? null : this.field278[arg0 + 1][arg1 + 1];
        arg2[class243.field3132.method174()] = var7 || var4 ? null : this.field278[arg0 - 1][arg1 + 1];
        arg2[class243.field3131.method174()] = var5 ? null : this.field278[arg0 + 1][arg1];
        arg2[class243.field3140.method174()] = var4 ? null : this.field278[arg0 - 1][arg1];
        arg2[class243.field3133.method174()] = var6 ? null : this.field278[arg0][arg1 - 1];
        arg2[class243.field3129.method174()] = var6 || var5 ? null : this.field278[arg0 + 1][arg1 - 1];
        arg2[class243.field3141.method174()] = var6 || var4 ? null : this.field278[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ay.i(IIIILjava/util/HashSet;IIB)V")
    public void method511(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field283 == null) {
            return;
        }
        this.field283.method5504(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field277 == null) {
            this.method499();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field277.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class29 var12 = (class29) var11.next();
                int var13 = (var12.field247.field2603 - this.field282) * arg2 / this.field276;
                int var14 = arg3 - (var12.field247.field2605 - this.field286) * arg3 / this.field285;
                class318.method5405(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ay.t(IIIIIIIIIII)Ljava/util/List;")
    public List method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field274) {
            return var11;
        }
        class18 var12 = this.method488(arg0, arg1, arg2, arg3);
        float var13 = this.method509(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field282 + arg0;
        int var16 = this.field286 + arg1;
        for (int var17 = var12.field146; var17 < var12.field146 + var12.field144; var17++) {
            for (int var18 = var12.field147; var18 < var12.field149 + var12.field147; var18++) {
                List var19 = this.field278[var17][var18].method407((this.field278[var17][var18].field209 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field278[var17][var18].field212 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ay.c(IIIIB)Lj;")
    public class18 method488(int arg0, int arg1, int arg2, int arg3) {
        class18 var5 = new class18(this);
        int var6 = this.field282 + arg0;
        int var7 = this.field286 + arg1;
        int var8 = this.field282 + arg2;
        int var9 = this.field286 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field144 = var12 - var10 + 1;
        var5.field149 = var13 - var11 + 1;
        var5.field146 = var10 - this.field275.method236();
        var5.field147 = var11 - this.field275.method238();
        if (var5.field146 < 0) {
            var5.field144 += var5.field146;
            var5.field146 = 0;
        }
        if (var5.field146 > this.field278.length - var5.field144) {
            var5.field144 = this.field278.length - var5.field146;
        }
        if (var5.field147 < 0) {
            var5.field149 += var5.field147;
            var5.field147 = 0;
        }
        if (var5.field147 > this.field278[0].length - var5.field149) {
            var5.field149 = this.field278[0].length - var5.field147;
        }
        var5.field144 = Math.min(var5.field144, this.field278.length);
        var5.field149 = Math.min(var5.field149, this.field278[0].length);
        return var5;
    }

    @ObfuscatedName("ay.w(I)Z")
    public boolean method497() {
        return this.field274;
    }

    @ObfuscatedName("ay.a(I)Ljava/util/HashMap;")
    public HashMap method498() {
        this.method499();
        return this.field277;
    }

    @ObfuscatedName("ay.z(I)V")
    public void method499() {
        if (this.field277 == null) {
            this.field277 = new HashMap();
        }
        this.field277.clear();
        for (int var1 = 0; var1 < this.field278.length; var1++) {
            for (int var2 = 0; var2 < this.field278[var1].length; var2++) {
                List var3 = this.field278[var1][var2].method344();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class29 var5 = (class29) var4.next();
                    if (this.field277.containsKey(var5.field251)) {
                        List var7 = (List) this.field277.get(var5.field251);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field277.put(var5.field251, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.e(IIB)F")
    public float method509(int arg0, int arg1) {
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
