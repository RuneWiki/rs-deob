package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ae")
public final class class42 {

    @ObfuscatedName("ae.s")
    public boolean field554 = false;

    @ObfuscatedName("ae.c")
    public boolean field547 = false;

    @ObfuscatedName("ae.f")
    public class45 field548;

    @ObfuscatedName("ae.m")
    public class289 field549;

    @ObfuscatedName("ae.h")
    public HashMap field550;

    @ObfuscatedName("ae.t")
    public class35[][] field551;

    @ObfuscatedName("ae.p")
    public HashMap field552 = new HashMap();

    @ObfuscatedName("ae.d")
    public class288[] field555;

    @ObfuscatedName("ae.n")
    public final HashMap field557;

    @ObfuscatedName("ae.z")
    public int field546;

    @ObfuscatedName("ae.o")
    public int field556;

    @ObfuscatedName("ae.q")
    public int field553;

    @ObfuscatedName("ae.u")
    public int field558;

    public class42(class288[] arg0, HashMap arg1) {
        this.field555 = arg0;
        this.field557 = arg1;
    }

    @ObfuscatedName("ae.s(Liw;Ljava/lang/String;ZI)V")
    public void method499(class239 arg0, String arg1, boolean arg2) {
        if (this.field547) {
            return;
        }
        this.field554 = false;
        this.field547 = true;
        System.nanoTime();
        int var4 = arg0.method3855(class41.field537.field542);
        int var5 = arg0.method3856(var4, arg1);
        class177 var6 = new class177(arg0.method3899(class41.field537.field542, arg1));
        class177 var7 = new class177(arg0.method3899(class41.field538.field542, arg1));
        class177 var8 = new class177(arg0.method3899(arg1, class41.field545.field542));
        System.nanoTime();
        System.nanoTime();
        this.field548 = new class45();
        try {
            this.field548.method543(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field548.method298();
        this.field548.method262();
        this.field548.method270();
        this.field546 = this.field548.method307() * 64;
        this.field556 = this.field548.method263() * 64;
        this.field553 = (this.field548.method265() - this.field548.method307() + 1) * 64;
        this.field558 = (this.field548.method267() - this.field548.method263() + 1) * 64;
        int var10 = this.field548.method265() - this.field548.method307() + 1;
        int var11 = this.field548.method267() - this.field548.method263() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field551 = new class35[var10][var11];
        Iterator var12 = this.field548.field573.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field409;
            int var15 = var13.field410;
            int var16 = var14 - this.field548.method307();
            int var17 = var15 - this.field548.method263();
            this.field551[var16][var17] = new class35(var14, var15, this.field548.method269(), this.field557);
            this.field551[var16][var17].method328(var13, this.field548.field575);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field551[var18][var19] == null) {
                    this.field551[var18][var19] = new class35(this.field548.method307() + var18, this.field548.method263() + var19, this.field548.method269(), this.field557);
                    this.field551[var18][var19].method358(this.field548.field576, this.field548.field575);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3916(class41.field539.field542, arg1)) {
            byte[] var20 = arg0.method3899(class41.field539.field542, arg1);
            this.field549 = class55.method4291(var20);
        }
        System.nanoTime();
        this.field554 = true;
    }

    @ObfuscatedName("ae.c(B)V")
    public final void method500() {
        this.field550 = null;
    }

    @ObfuscatedName("ae.f(IIIIIIIII)V")
    public final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3766;
        int var10 = Statics.field3767;
        int var11 = Statics.field3771;
        int[] var12 = new int[4];
        class285.method4657(var12);
        class30 var13 = this.method506(arg0, arg1, arg2, arg3);
        float var14 = this.method510(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field552.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method591();
            this.field552.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field431; var18 < var13.field431 + var13.field427; var18++) {
            for (int var19 = var13.field425; var19 < var13.field425 + var13.field423; var19++) {
                this.method503(var18, var19, var17);
                this.field551[var18][var19].method332(var15, (class47) this.field552.get(var15), var17, this.field555);
            }
        }
        class285.method4721(var9, var10, var11);
        class285.method4661(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field546 + arg0;
        int var22 = this.field556 + arg1;
        for (int var23 = var13.field431; var23 < var13.field431 + var13.field427; var23++) {
            for (int var24 = var13.field425; var24 < var13.field425 + var13.field423; var24++) {
                this.field551[var23][var24].method364((this.field551[var23][var24].field489 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field551[var23][var24].field478 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ae.m(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method506(arg0, arg1, arg2, arg3);
        float var15 = this.method510(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field546 + arg0;
        int var18 = this.field556 + arg1;
        for (int var19 = var14.field431; var19 < var14.field431 + var14.field427; var19++) {
            for (int var20 = var14.field425; var20 < var14.field425 + var14.field423; var20++) {
                if (arg12) {
                    this.field551[var19][var20].method356();
                }
                this.field551[var19][var20].method427((this.field551[var19][var20].field489 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field551[var19][var20].field478 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field431; var21 < var14.field431 + var14.field427; var21++) {
            for (int var22 = var14.field425; var22 < var14.field425 + var14.field423; var22++) {
                this.field551[var21][var22].method334(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ae.h(II[Las;I)V")
    public void method503(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field551.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field551[0].length - 1;
        if (var7) {
            arg2[class232.field3175.method16()] = null;
        } else {
            arg2[class232.field3175.method16()] = this.field551[arg0][arg1 + 1];
        }
        arg2[class232.field3173.method16()] = var7 || var5 ? null : this.field551[arg0 + 1][arg1 + 1];
        arg2[class232.field3178.method16()] = var7 || var4 ? null : this.field551[arg0 - 1][arg1 + 1];
        arg2[class232.field3172.method16()] = var5 ? null : this.field551[arg0 + 1][arg1];
        arg2[class232.field3180.method16()] = var4 ? null : this.field551[arg0 - 1][arg1];
        arg2[class232.field3176.method16()] = var6 ? null : this.field551[arg0][arg1 - 1];
        arg2[class232.field3179.method16()] = var6 || var5 ? null : this.field551[arg0 + 1][arg1 - 1];
        arg2[class232.field3174.method16()] = var6 || var4 ? null : this.field551[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ae.t(IIIILjava/util/HashSet;III)V")
    public void method504(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field549 == null) {
            return;
        }
        this.field549.method4777(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field550 == null) {
            this.method509();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field550.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field524.field2626 - this.field546) * arg2 / this.field553;
                int var14 = arg3 - (var12.field524.field2632 - this.field556) * arg3 / this.field558;
                class285.method4680(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ae.p(IIIIIIIIIII)Ljava/util/List;")
    public List method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field554) {
            return var11;
        }
        class30 var12 = this.method506(arg0, arg1, arg2, arg3);
        float var13 = this.method510(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field546 + arg0;
        int var16 = this.field556 + arg1;
        for (int var17 = var12.field431; var17 < var12.field431 + var12.field427; var17++) {
            for (int var18 = var12.field425; var18 < var12.field425 + var12.field423; var18++) {
                List var19 = this.field551[var17][var18].method363((this.field551[var17][var18].field489 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field551[var17][var18].field478 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ae.d(IIIII)Lab;")
    public class30 method506(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field546 + arg0;
        int var7 = this.field556 + arg1;
        int var8 = this.field546 + arg2;
        int var9 = this.field556 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field427 = var12 - var10 + 1;
        var5.field423 = var13 - var11 + 1;
        var5.field431 = var10 - this.field548.method307();
        var5.field425 = var11 - this.field548.method263();
        if (var5.field431 < 0) {
            var5.field427 += var5.field431;
            var5.field431 = 0;
        }
        if (var5.field431 > this.field551.length - var5.field427) {
            var5.field427 = this.field551.length - var5.field431;
        }
        if (var5.field425 < 0) {
            var5.field423 += var5.field425;
            var5.field425 = 0;
        }
        if (var5.field425 > this.field551[0].length - var5.field423) {
            var5.field423 = this.field551[0].length - var5.field425;
        }
        var5.field427 = Math.min(var5.field427, this.field551.length);
        var5.field423 = Math.min(var5.field423, this.field551[0].length);
        return var5;
    }

    @ObfuscatedName("ae.n(I)Z")
    public boolean method507() {
        return this.field554;
    }

    @ObfuscatedName("ae.z(I)Ljava/util/HashMap;")
    public HashMap method508() {
        this.method509();
        return this.field550;
    }

    @ObfuscatedName("ae.o(I)V")
    public void method509() {
        if (this.field550 == null) {
            this.field550 = new HashMap();
        }
        this.field550.clear();
        for (int var1 = 0; var1 < this.field551.length; var1++) {
            for (int var2 = 0; var2 < this.field551[var1].length; var2++) {
                List var3 = this.field551[var1][var2].method327();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field550.containsKey(var5.field534)) {
                        List var7 = (List) this.field550.get(var5.field534);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field550.put(var5.field534, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.u(III)F")
    public float method510(int arg0, int arg1) {
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
