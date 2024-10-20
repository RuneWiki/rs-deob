package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("at")
public final class class42 {

    @ObfuscatedName("at.w")
    public boolean field567 = false;

    @ObfuscatedName("at.o")
    public boolean field565 = false;

    @ObfuscatedName("at.x")
    public class45 field575;

    @ObfuscatedName("at.k")
    public class289 field570;

    @ObfuscatedName("at.f")
    public HashMap field568;

    @ObfuscatedName("at.i")
    public class35[][] field569;

    @ObfuscatedName("at.j")
    public HashMap field566 = new HashMap();

    @ObfuscatedName("at.m")
    public class288[] field576;

    @ObfuscatedName("at.u")
    public final HashMap field572;

    @ObfuscatedName("at.r")
    public int field573;

    @ObfuscatedName("at.v")
    public int field574;

    @ObfuscatedName("at.h")
    public int field571;

    @ObfuscatedName("at.a")
    public int field564;

    public class42(class288[] arg0, HashMap arg1) {
        this.field576 = arg0;
        this.field572 = arg1;
    }

    @ObfuscatedName("at.w(Liq;Ljava/lang/String;ZB)V")
    public void method495(class239 arg0, String arg1, boolean arg2) {
        if (this.field565) {
            return;
        }
        this.field567 = false;
        this.field565 = true;
        System.nanoTime();
        int var4 = arg0.method3742(class41.field556.field555);
        int var5 = arg0.method3743(var4, arg1);
        class177 var6 = new class177(arg0.method3745(class41.field556.field555, arg1));
        class177 var7 = new class177(arg0.method3745(class41.field554.field555, arg1));
        class177 var8 = new class177(arg0.method3745(arg1, class41.field552.field555));
        System.nanoTime();
        System.nanoTime();
        this.field575 = new class45();
        try {
            this.field575.method554(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field575.method266();
        this.field575.method267();
        this.field575.method249();
        this.field573 = this.field575.method294() * 64;
        this.field574 = this.field575.method264() * 64;
        this.field571 = (this.field575.method261() - this.field575.method294() + 1) * 64;
        this.field564 = (this.field575.method308() - this.field575.method264() + 1) * 64;
        int var10 = this.field575.method261() - this.field575.method294() + 1;
        int var11 = this.field575.method308() - this.field575.method264() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field569 = new class35[var10][var11];
        Iterator var12 = this.field575.field598.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field427;
            int var15 = var13.field416;
            int var16 = var14 - this.field575.method294();
            int var17 = var15 - this.field575.method264();
            this.field569[var16][var17] = new class35(var14, var15, this.field575.method268(), this.field572);
            this.field569[var16][var17].method327(var13, this.field575.field594);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field569[var18][var19] == null) {
                    this.field569[var18][var19] = new class35(this.field575.method294() + var18, this.field575.method264() + var19, this.field575.method268(), this.field572);
                    this.field569[var18][var19].method328(this.field575.field595, this.field575.field594);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3744(class41.field553.field555, arg1)) {
            byte[] var20 = arg0.method3745(class41.field553.field555, arg1);
            this.field570 = class55.method1567(var20);
        }
        System.nanoTime();
        this.field567 = true;
    }

    @ObfuscatedName("at.o(B)V")
    public final void method496() {
        this.field568 = null;
    }

    @ObfuscatedName("at.x(IIIIIIIII)V")
    public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3760;
        int var10 = Statics.field3764;
        int var11 = Statics.field3761;
        int[] var12 = new int[4];
        class285.method4593(var12);
        class30 var13 = this.method502(arg0, arg1, arg2, arg3);
        float var14 = this.method506(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field566.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method587();
            this.field566.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field432; var18 < var13.field432 + var13.field430; var18++) {
            for (int var19 = var13.field433; var19 < var13.field433 + var13.field431; var19++) {
                this.method499(var18, var19, var17);
                this.field569[var18][var19].method458(var15, (class47) this.field566.get(var15), var17, this.field576);
            }
        }
        class285.method4620(var9, var10, var11);
        class285.method4577(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field573 + arg0;
        int var22 = this.field574 + arg1;
        for (int var23 = var13.field432; var23 < var13.field432 + var13.field430; var23++) {
            for (int var24 = var13.field433; var24 < var13.field433 + var13.field431; var24++) {
                this.field569[var23][var24].method415((this.field569[var23][var24].field496 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field569[var23][var24].field491 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("at.k(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method502(arg0, arg1, arg2, arg3);
        float var15 = this.method506(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field573 + arg0;
        int var18 = this.field574 + arg1;
        for (int var19 = var14.field432; var19 < var14.field432 + var14.field430; var19++) {
            for (int var20 = var14.field433; var20 < var14.field433 + var14.field431; var20++) {
                if (arg12) {
                    this.field569[var19][var20].method355();
                }
                this.field569[var19][var20].method332((this.field569[var19][var20].field496 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field569[var19][var20].field491 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field432; var21 < var14.field432 + var14.field430; var21++) {
            for (int var22 = var14.field433; var22 < var14.field433 + var14.field431; var22++) {
                this.field569[var21][var22].method333(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("at.f(II[Lak;I)V")
    public void method499(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field569.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field569[0].length - 1;
        if (var7) {
            arg2[class232.field3156.method12()] = null;
        } else {
            arg2[class232.field3156.method12()] = this.field569[arg0][arg1 + 1];
        }
        arg2[class232.field3150.method12()] = var7 || var5 ? null : this.field569[arg0 + 1][arg1 + 1];
        arg2[class232.field3155.method12()] = var7 || var4 ? null : this.field569[arg0 - 1][arg1 + 1];
        arg2[class232.field3151.method12()] = var5 ? null : this.field569[arg0 + 1][arg1];
        arg2[class232.field3149.method12()] = var4 ? null : this.field569[arg0 - 1][arg1];
        arg2[class232.field3153.method12()] = var6 ? null : this.field569[arg0][arg1 - 1];
        arg2[class232.field3152.method12()] = var6 || var5 ? null : this.field569[arg0 + 1][arg1 - 1];
        arg2[class232.field3154.method12()] = var6 || var4 ? null : this.field569[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("at.i(IIIILjava/util/HashSet;III)V")
    public void method500(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field570 == null) {
            return;
        }
        this.field570.method4701(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field568 == null) {
            this.method505();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field568.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field541.field2622 - this.field573) * arg2 / this.field571;
                int var14 = arg3 - (var12.field541.field2620 - this.field574) * arg3 / this.field564;
                class285.method4601(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("at.j(IIIIIIIIIII)Ljava/util/List;")
    public List method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field567) {
            return var11;
        }
        class30 var12 = this.method502(arg0, arg1, arg2, arg3);
        float var13 = this.method506(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field573 + arg0;
        int var16 = this.field574 + arg1;
        for (int var17 = var12.field432; var17 < var12.field432 + var12.field430; var17++) {
            for (int var18 = var12.field433; var18 < var12.field433 + var12.field431; var18++) {
                List var19 = this.field569[var17][var18].method362((this.field569[var17][var18].field496 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field569[var17][var18].field491 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("at.m(IIIII)Lai;")
    public class30 method502(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field573 + arg0;
        int var7 = this.field574 + arg1;
        int var8 = this.field573 + arg2;
        int var9 = this.field574 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field430 = var12 - var10 + 1;
        var5.field431 = var13 - var11 + 1;
        var5.field432 = var10 - this.field575.method294();
        var5.field433 = var11 - this.field575.method264();
        if (var5.field432 < 0) {
            var5.field430 += var5.field432;
            var5.field432 = 0;
        }
        if (var5.field432 > this.field569.length - var5.field430) {
            var5.field430 = this.field569.length - var5.field432;
        }
        if (var5.field433 < 0) {
            var5.field431 += var5.field433;
            var5.field433 = 0;
        }
        if (var5.field433 > this.field569[0].length - var5.field431) {
            var5.field431 = this.field569[0].length - var5.field433;
        }
        var5.field430 = Math.min(var5.field430, this.field569.length);
        var5.field431 = Math.min(var5.field431, this.field569[0].length);
        return var5;
    }

    @ObfuscatedName("at.u(B)Z")
    public boolean method523() {
        return this.field567;
    }

    @ObfuscatedName("at.h(I)Ljava/util/HashMap;")
    public HashMap method525() {
        this.method505();
        return this.field568;
    }

    @ObfuscatedName("at.a(I)V")
    public void method505() {
        if (this.field568 == null) {
            this.field568 = new HashMap();
        }
        this.field568.clear();
        for (int var1 = 0; var1 < this.field569.length; var1++) {
            for (int var2 = 0; var2 < this.field569[var1].length; var2++) {
                List var3 = this.field569[var1][var2].method341();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field568.containsKey(var5.field549)) {
                        List var7 = (List) this.field568.get(var5.field549);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field568.put(var5.field549, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.p(III)F")
    public float method506(int arg0, int arg1) {
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
