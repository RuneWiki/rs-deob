package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("an")
public final class class42 {

    @ObfuscatedName("an.d")
    public boolean field532 = false;

    @ObfuscatedName("an.x")
    public boolean field524 = false;

    @ObfuscatedName("an.k")
    public class45 field538;

    @ObfuscatedName("an.z")
    public class295 field527;

    @ObfuscatedName("an.v")
    public HashMap field526;

    @ObfuscatedName("an.m")
    public class35[][] field528;

    @ObfuscatedName("an.b")
    public HashMap field529 = new HashMap();

    @ObfuscatedName("an.t")
    public class294[] field530;

    @ObfuscatedName("an.p")
    public final HashMap field531;

    @ObfuscatedName("an.r")
    public int field525;

    @ObfuscatedName("an.l")
    public int field533;

    @ObfuscatedName("an.u")
    public int field534;

    @ObfuscatedName("an.n")
    public int field523;

    public class42(class294[] arg0, HashMap arg1) {
        this.field530 = arg0;
        this.field531 = arg1;
    }

    @ObfuscatedName("an.d(Lid;Ljava/lang/String;ZI)V")
    public void method505(class243 arg0, String arg1, boolean arg2) {
        if (this.field524) {
            return;
        }
        this.field532 = false;
        this.field524 = true;
        System.nanoTime();
        int var4 = arg0.method3951(class41.field515.field518);
        int var5 = arg0.method3952(var4, arg1);
        class181 var6 = new class181(arg0.method3954(class41.field515.field518, arg1));
        class181 var7 = new class181(arg0.method3954(class41.field516.field518, arg1));
        class181 var8 = new class181(arg0.method3954(arg1, class41.field520.field518));
        System.nanoTime();
        System.nanoTime();
        this.field538 = new class45();
        try {
            this.field538.method562(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field538.method295();
        this.field538.method259();
        this.field538.method260();
        this.field525 = this.field538.method254() * 64;
        this.field533 = this.field538.method256() * 64;
        this.field534 = (this.field538.method255() - this.field538.method254() + 1) * 64;
        this.field523 = (this.field538.method257() - this.field538.method256() + 1) * 64;
        int var10 = this.field538.method255() - this.field538.method254() + 1;
        int var11 = this.field538.method257() - this.field538.method256() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field528 = new class35[var10][var11];
        Iterator var12 = this.field538.field552.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field392;
            int var15 = var13.field380;
            int var16 = var14 - this.field538.method254();
            int var17 = var15 - this.field538.method256();
            this.field528[var16][var17] = new class35(var14, var15, this.field538.method252(), this.field531);
            this.field528[var16][var17].method330(var13, this.field538.field553);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field528[var18][var19] == null) {
                    this.field528[var18][var19] = new class35(this.field538.method254() + var18, this.field538.method256() + var19, this.field538.method252(), this.field531);
                    this.field528[var18][var19].method404(this.field538.field557, this.field538.field553);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3953(class41.field517.field518, arg1)) {
            byte[] var20 = arg0.method3954(class41.field517.field518, arg1);
            this.field527 = class55.method2263(var20);
        }
        System.nanoTime();
        this.field532 = true;
    }

    @ObfuscatedName("an.x(I)V")
    public final void method518() {
        this.field526 = null;
    }

    @ObfuscatedName("an.k(IIIIIIIII)V")
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3809;
        int var10 = Statics.field3808;
        int var11 = Statics.field3810;
        int[] var12 = new int[4];
        class291.method4809(var12);
        class30 var13 = this.method512(arg0, arg1, arg2, arg3);
        float var14 = this.method516(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field529.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method634();
            this.field529.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field402; var18 < var13.field402 + var13.field396; var18++) {
            for (int var19 = var13.field399; var19 < var13.field400 + var13.field399; var19++) {
                this.method509(var18, var19, var17);
                this.field528[var18][var19].method334(var15, (class47) this.field529.get(var15), var17, this.field530);
            }
        }
        class291.method4781(var9, var10, var11);
        class291.method4786(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field525 + arg0;
        int var22 = this.field533 + arg1;
        for (int var23 = var13.field402; var23 < var13.field402 + var13.field396; var23++) {
            for (int var24 = var13.field399; var24 < var13.field400 + var13.field399; var24++) {
                this.field528[var23][var24].method335((this.field528[var23][var24].field472 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field528[var23][var24].field453 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("an.z(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method512(arg0, arg1, arg2, arg3);
        float var15 = this.method516(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field525 + arg0;
        int var18 = this.field533 + arg1;
        for (int var19 = var14.field402; var19 < var14.field402 + var14.field396; var19++) {
            for (int var20 = var14.field399; var20 < var14.field400 + var14.field399; var20++) {
                if (arg12) {
                    this.field528[var19][var20].method357();
                }
                this.field528[var19][var20].method439((this.field528[var19][var20].field472 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field528[var19][var20].field453 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field402; var21 < var14.field402 + var14.field396; var21++) {
            for (int var22 = var14.field399; var22 < var14.field400 + var14.field399; var22++) {
                this.field528[var21][var22].method336(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("an.v(II[Laj;I)V")
    public void method509(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field528.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field528[0].length - 1;
        if (var7) {
            arg2[class236.field3234.method18()] = null;
        } else {
            arg2[class236.field3234.method18()] = this.field528[arg0][arg1 + 1];
        }
        arg2[class236.field3231.method18()] = var7 || var5 ? null : this.field528[arg0 + 1][arg1 + 1];
        arg2[class236.field3237.method18()] = var7 || var4 ? null : this.field528[arg0 - 1][arg1 + 1];
        arg2[class236.field3235.method18()] = var5 ? null : this.field528[arg0 + 1][arg1];
        arg2[class236.field3236.method18()] = var4 ? null : this.field528[arg0 - 1][arg1];
        arg2[class236.field3232.method18()] = var6 ? null : this.field528[arg0][arg1 - 1];
        arg2[class236.field3233.method18()] = var6 || var5 ? null : this.field528[arg0 + 1][arg1 - 1];
        arg2[class236.field3230.method18()] = var6 || var4 ? null : this.field528[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("an.m(IIIILjava/util/HashSet;III)V")
    public void method510(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field527 == null) {
            return;
        }
        this.field527.method4905(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field526 == null) {
            this.method544();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field526.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field507.field2691 - this.field525) * arg2 / this.field534;
                int var14 = arg3 - (var12.field507.field2692 - this.field533) * arg3 / this.field523;
                class291.method4782(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("an.b(IIIIIIIIIII)Ljava/util/List;")
    public List method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field532) {
            return var11;
        }
        class30 var12 = this.method512(arg0, arg1, arg2, arg3);
        float var13 = this.method516(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field525 + arg0;
        int var16 = this.field533 + arg1;
        for (int var17 = var12.field402; var17 < var12.field402 + var12.field396; var17++) {
            for (int var18 = var12.field399; var18 < var12.field400 + var12.field399; var18++) {
                List var19 = this.field528[var17][var18].method364((this.field528[var17][var18].field472 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field528[var17][var18].field453 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("an.t(IIIII)Lax;")
    public class30 method512(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field525 + arg0;
        int var7 = this.field533 + arg1;
        int var8 = this.field525 + arg2;
        int var9 = this.field533 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field396 = var12 - var10 + 1;
        var5.field400 = var13 - var11 + 1;
        var5.field402 = var10 - this.field538.method254();
        var5.field399 = var11 - this.field538.method256();
        if (var5.field402 < 0) {
            var5.field396 += var5.field402;
            var5.field402 = 0;
        }
        if (var5.field402 > this.field528.length - var5.field396) {
            var5.field396 = this.field528.length - var5.field402;
        }
        if (var5.field399 < 0) {
            var5.field400 += var5.field399;
            var5.field399 = 0;
        }
        if (var5.field399 > this.field528[0].length - var5.field400) {
            var5.field400 = this.field528[0].length - var5.field399;
        }
        var5.field396 = Math.min(var5.field396, this.field528.length);
        var5.field400 = Math.min(var5.field400, this.field528[0].length);
        return var5;
    }

    @ObfuscatedName("an.p(B)Z")
    public boolean method529() {
        return this.field532;
    }

    @ObfuscatedName("an.r(I)Ljava/util/HashMap;")
    public HashMap method547() {
        this.method544();
        return this.field526;
    }

    @ObfuscatedName("an.l(S)V")
    public void method544() {
        if (this.field526 == null) {
            this.field526 = new HashMap();
        }
        this.field526.clear();
        for (int var1 = 0; var1 < this.field528.length; var1++) {
            for (int var2 = 0; var2 < this.field528[var1].length; var2++) {
                List var3 = this.field528[var1][var2].method365();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field526.containsKey(var5.field514)) {
                        List var7 = (List) this.field526.get(var5.field514);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field526.put(var5.field514, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.u(IIB)F")
    public float method516(int arg0, int arg1) {
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
