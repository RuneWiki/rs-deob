package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("at")
public final class class31 {

    @ObfuscatedName("at.f")
    public boolean field297 = false;

    @ObfuscatedName("at.l")
    public boolean field295 = false;

    @ObfuscatedName("at.w")
    public class34 field294;

    @ObfuscatedName("at.s")
    public class324 field308;

    @ObfuscatedName("at.e")
    public HashMap field309;

    @ObfuscatedName("at.a")
    public class24[][] field299;

    @ObfuscatedName("at.c")
    public HashMap field300 = new HashMap();

    @ObfuscatedName("at.p")
    public class323[] field301;

    @ObfuscatedName("at.r")
    public final HashMap field302;

    @ObfuscatedName("at.m")
    public int field303;

    @ObfuscatedName("at.d")
    public int field304;

    @ObfuscatedName("at.z")
    public int field305;

    @ObfuscatedName("at.x")
    public int field298;

    @ObfuscatedName("at.v")
    public int field307 = 0;

    public class31(class323[] arg0, HashMap arg1) {
        this.field301 = arg0;
        this.field302 = arg1;
    }

    @ObfuscatedName("at.f(Lik;Ljava/lang/String;ZB)V")
    public void method465(class250 arg0, String arg1, boolean arg2) {
        if (this.field295) {
            return;
        }
        this.field297 = false;
        this.field295 = true;
        System.nanoTime();
        int var4 = arg0.method4312(class30.field289.field290);
        int var5 = arg0.method4291(var4, arg1);
        class185 var6 = new class185(arg0.method4309(class30.field289.field290, arg1));
        class185 var7 = new class185(arg0.method4309(class30.field285.field290, arg1));
        class185 var8 = new class185(arg0.method4309(arg1, class30.field287.field290));
        System.nanoTime();
        System.nanoTime();
        this.field294 = new class34();
        try {
            this.field294.method524(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field294.method210();
        this.field294.method211();
        this.field294.method238();
        this.field303 = this.field294.method206() * 64;
        this.field304 = this.field294.method239() * 64;
        this.field305 = (this.field294.method207() - this.field294.method206() + 1) * 64;
        this.field298 = (this.field294.method209() - this.field294.method239() + 1) * 64;
        int var10 = this.field294.method207() - this.field294.method206() + 1;
        int var11 = this.field294.method209() - this.field294.method239() + 1;
        System.nanoTime();
        System.nanoTime();
        class24.method84();
        this.field299 = new class24[var10][var11];
        Iterator var12 = this.field294.field325.iterator();
        while (var12.hasNext()) {
            class11 var13 = (class11) var12.next();
            int var14 = var13.field157;
            int var15 = var13.field151;
            int var16 = var14 - this.field294.method206();
            int var17 = var15 - this.field294.method239();
            this.field299[var16][var17] = new class24(var14, var15, this.field294.method198(), this.field302);
            this.field299[var16][var17].method286(var13, this.field294.field324);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field299[var18][var19] == null) {
                    this.field299[var18][var19] = new class24(this.field294.method206() + var18, this.field294.method239() + var19, this.field294.method198(), this.field302);
                    this.field299[var18][var19].method287(this.field294.field328, this.field294.field324);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4308(class30.field288.field290, arg1)) {
            byte[] var20 = arg0.method4309(class30.field288.field290, arg1);
            this.field308 = class44.method651(var20);
        }
        System.nanoTime();
        arg0.method4303();
        arg0.method4305();
        this.field297 = true;
    }

    @ObfuscatedName("at.l(S)V")
    public final void method475() {
        this.field309 = null;
    }

    @ObfuscatedName("at.w(IIIIIIIII)V")
    public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3850;
        int var10 = Statics.field3848;
        int var11 = Statics.field3849;
        int[] var12 = new int[4];
        class320.method5505(var12);
        class18 var13 = this.method487(arg0, arg1, arg2, arg3);
        float var14 = this.method493(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field307 = var15;
        if (!this.field300.containsKey(var15)) {
            class36 var16 = new class36(var15);
            var16.method565();
            this.field300.put(var15, var16);
        }
        class24[] var17 = new class24[8];
        for (int var18 = var13.field160; var18 < var13.field160 + var13.field159; var18++) {
            for (int var19 = var13.field161; var19 < var13.field161 + var13.field158; var19++) {
                this.method469(var18, var19, var17);
                this.field299[var18][var19].method398(var15, (class36) this.field300.get(var15), var17, this.field301);
            }
        }
        class320.method5452(var9, var10, var11);
        class320.method5457(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field303 + arg0;
        int var22 = this.field304 + arg1;
        for (int var23 = var13.field160; var23 < var13.field160 + var13.field159; var23++) {
            for (int var24 = var13.field161; var24 < var13.field161 + var13.field158; var24++) {
                this.field299[var23][var24].method285((this.field299[var23][var24].field221 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field299[var23][var24].field224 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("at.s(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class18 var14 = this.method487(arg0, arg1, arg2, arg3);
        float var15 = this.method493(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field303 + arg0;
        int var18 = this.field304 + arg1;
        for (int var19 = var14.field160; var19 < var14.field160 + var14.field159; var19++) {
            for (int var20 = var14.field161; var20 < var14.field161 + var14.field158; var20++) {
                if (arg12) {
                    this.field299[var19][var20].method284();
                }
                this.field299[var19][var20].method387((this.field299[var19][var20].field221 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field299[var19][var20].field224 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field160; var21 < var14.field160 + var14.field159; var21++) {
            for (int var22 = var14.field161; var22 < var14.field161 + var14.field158; var22++) {
                this.field299[var21][var22].method326(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("at.e(II[Lk;I)V")
    public void method469(int arg0, int arg1, class24[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field299.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field299[0].length - 1;
        if (var7) {
            arg2[class243.field3165.method148()] = null;
        } else {
            arg2[class243.field3165.method148()] = this.field299[arg0][arg1 + 1];
        }
        arg2[class243.field3163.method148()] = var7 || var5 ? null : this.field299[arg0 + 1][arg1 + 1];
        arg2[class243.field3172.method148()] = var7 || var4 ? null : this.field299[arg0 - 1][arg1 + 1];
        arg2[class243.field3170.method148()] = var5 ? null : this.field299[arg0 + 1][arg1];
        arg2[class243.field3168.method148()] = var4 ? null : this.field299[arg0 - 1][arg1];
        arg2[class243.field3166.method148()] = var6 ? null : this.field299[arg0][arg1 - 1];
        arg2[class243.field3162.method148()] = var6 || var5 ? null : this.field299[arg0 + 1][arg1 - 1];
        arg2[class243.field3167.method148()] = var6 || var4 ? null : this.field299[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("at.c(IIIILjava/util/HashSet;IIB)V")
    public void method492(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field308 == null) {
            return;
        }
        this.field308.method5646(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field309 == null) {
            this.method474();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field309.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class29 var12 = (class29) var11.next();
                int var13 = (var12.field283.field2634 - this.field303) * arg2 / this.field305;
                int var14 = arg3 - (var12.field283.field2632 - this.field304) * arg3 / this.field298;
                class320.method5460(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("at.p(IIIIIIIIIIB)Ljava/util/List;")
    public List method472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field297) {
            return var11;
        }
        class18 var12 = this.method487(arg0, arg1, arg2, arg3);
        float var13 = this.method493(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field303 + arg0;
        int var16 = this.field304 + arg1;
        for (int var17 = var12.field160; var17 < var12.field160 + var12.field159; var17++) {
            for (int var18 = var12.field161; var18 < var12.field161 + var12.field158; var18++) {
                List var19 = this.field299[var17][var18].method408((this.field299[var17][var18].field221 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field299[var17][var18].field224 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("at.r(IIIII)Lu;")
    public class18 method487(int arg0, int arg1, int arg2, int arg3) {
        class18 var5 = new class18(this);
        int var6 = this.field303 + arg0;
        int var7 = this.field304 + arg1;
        int var8 = this.field303 + arg2;
        int var9 = this.field304 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field159 = var12 - var10 + 1;
        var5.field158 = var13 - var11 + 1;
        var5.field160 = var10 - this.field294.method206();
        var5.field161 = var11 - this.field294.method239();
        if (var5.field160 < 0) {
            var5.field159 += var5.field160;
            var5.field160 = 0;
        }
        if (var5.field160 > this.field299.length - var5.field159) {
            var5.field159 = this.field299.length - var5.field160;
        }
        if (var5.field161 < 0) {
            var5.field158 += var5.field161;
            var5.field161 = 0;
        }
        if (var5.field161 > this.field299[0].length - var5.field158) {
            var5.field158 = this.field299[0].length - var5.field161;
        }
        var5.field159 = Math.min(var5.field159, this.field299.length);
        var5.field158 = Math.min(var5.field158, this.field299[0].length);
        return var5;
    }

    @ObfuscatedName("at.m(I)Z")
    public boolean method489() {
        return this.field297;
    }

    @ObfuscatedName("at.d(B)Ljava/util/HashMap;")
    public HashMap method466() {
        this.method474();
        return this.field309;
    }

    @ObfuscatedName("at.z(B)V")
    public void method474() {
        if (this.field309 == null) {
            this.field309 = new HashMap();
        }
        this.field309.clear();
        for (int var1 = 0; var1 < this.field299.length; var1++) {
            for (int var2 = 0; var2 < this.field299[var1].length; var2++) {
                List var3 = this.field299[var1][var2].method347();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class29 var5 = (class29) var4.next();
                    if (this.field309.containsKey(var5.field282)) {
                        List var7 = (List) this.field309.get(var5.field282);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field309.put(var5.field282, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.x(IIB)F")
    public float method493(int arg0, int arg1) {
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
