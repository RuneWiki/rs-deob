package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ag")
public final class class42 {

    @ObfuscatedName("ag.i")
    public boolean field561 = false;

    @ObfuscatedName("ag.c")
    public boolean field549 = false;

    @ObfuscatedName("ag.e")
    public class45 field550;

    @ObfuscatedName("ag.v")
    public class286 field551;

    @ObfuscatedName("ag.b")
    public HashMap field552;

    @ObfuscatedName("ag.y")
    public class35[][] field553;

    @ObfuscatedName("ag.h")
    public HashMap field554 = new HashMap();

    @ObfuscatedName("ag.x")
    public class285[] field555;

    @ObfuscatedName("ag.f")
    public final HashMap field556;

    @ObfuscatedName("ag.n")
    public int field557;

    @ObfuscatedName("ag.a")
    public int field564;

    @ObfuscatedName("ag.o")
    public int field548;

    @ObfuscatedName("ag.z")
    public int field560;

    public class42(class285[] arg0, HashMap arg1) {
        this.field555 = arg0;
        this.field556 = arg1;
    }

    @ObfuscatedName("ag.i(Liw;Ljava/lang/String;ZI)V")
    public void method478(class236 arg0, String arg1, boolean arg2) {
        if (this.field549) {
            return;
        }
        this.field561 = false;
        this.field549 = true;
        System.nanoTime();
        int var4 = arg0.method3785(class41.field541.field543);
        int var5 = arg0.method3786(var4, arg1);
        class174 var6 = new class174(arg0.method3830(class41.field541.field543, arg1));
        class174 var7 = new class174(arg0.method3830(class41.field546.field543, arg1));
        class174 var8 = new class174(arg0.method3830(arg1, class41.field545.field543));
        System.nanoTime();
        System.nanoTime();
        this.field550 = new class45();
        try {
            this.field550.method521(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field550.method248();
        this.field550.method244();
        this.field550.method250();
        this.field557 = this.field550.method269() * 64;
        this.field564 = this.field550.method246() * 64;
        this.field548 = (this.field550.method245() - this.field550.method269() + 1) * 64;
        this.field560 = (this.field550.method247() - this.field550.method246() + 1) * 64;
        int var10 = this.field550.method245() - this.field550.method269() + 1;
        int var11 = this.field550.method247() - this.field550.method246() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field553 = new class35[var10][var11];
        Iterator var12 = this.field550.field582.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field410;
            int var15 = var13.field418;
            int var16 = var14 - this.field550.method269();
            int var17 = var15 - this.field550.method246();
            this.field553[var16][var17] = new class35(var14, var15, this.field550.method263(), this.field556);
            this.field553[var16][var17].method309(var13, this.field550.field580);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field553[var18][var19] == null) {
                    this.field553[var18][var19] = new class35(this.field550.method269() + var18, this.field550.method246() + var19, this.field550.method263(), this.field556);
                    this.field553[var18][var19].method310(this.field550.field584, this.field550.field580);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3836(class41.field540.field543, arg1)) {
            byte[] var20 = arg0.method3830(class41.field540.field543, arg1);
            this.field551 = class55.method407(var20);
        }
        System.nanoTime();
        this.field561 = true;
    }

    @ObfuscatedName("ag.c(I)V")
    public final void method485() {
        this.field552 = null;
    }

    @ObfuscatedName("ag.e(IIIIIIIII)V")
    public final void method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3756;
        int var10 = Statics.field3754;
        int var11 = Statics.field3759;
        int[] var12 = new int[4];
        class282.method4595(var12);
        class30 var13 = this.method511(arg0, arg1, arg2, arg3);
        float var14 = this.method487(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field554.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method602();
            this.field554.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field424; var18 < var13.field429 + var13.field424; var18++) {
            for (int var19 = var13.field427; var19 < var13.field427 + var13.field425; var19++) {
                this.method477(var18, var19, var17);
                this.field553[var18][var19].method322(var15, (class47) this.field554.get(var15), var17, this.field555);
            }
        }
        class282.method4610(var9, var10, var11);
        class282.method4566(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field557 + arg0;
        int var22 = this.field564 + arg1;
        for (int var23 = var13.field424; var23 < var13.field429 + var13.field424; var23++) {
            for (int var24 = var13.field427; var24 < var13.field427 + var13.field425; var24++) {
                this.field553[var23][var24].method394((this.field553[var23][var24].field480 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field553[var23][var24].field482 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ag.v(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method511(arg0, arg1, arg2, arg3);
        float var15 = this.method487(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field557 + arg0;
        int var18 = this.field564 + arg1;
        for (int var19 = var14.field424; var19 < var14.field429 + var14.field424; var19++) {
            for (int var20 = var14.field427; var20 < var14.field427 + var14.field425; var20++) {
                if (arg12) {
                    this.field553[var19][var20].method336();
                }
                this.field553[var19][var20].method314((this.field553[var19][var20].field480 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field553[var19][var20].field482 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field424; var21 < var14.field429 + var14.field424; var21++) {
            for (int var22 = var14.field427; var22 < var14.field427 + var14.field425; var22++) {
                this.field553[var21][var22].method315(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ag.b(II[Lal;B)V")
    public void method477(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field553.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field553[0].length - 1;
        if (var7) {
            arg2[class229.field3156.method6()] = null;
        } else {
            arg2[class229.field3156.method6()] = this.field553[arg0][arg1 + 1];
        }
        arg2[class229.field3148.method6()] = var7 || var5 ? null : this.field553[arg0 + 1][arg1 + 1];
        arg2[class229.field3147.method6()] = var7 || var4 ? null : this.field553[arg0 - 1][arg1 + 1];
        arg2[class229.field3154.method6()] = var5 ? null : this.field553[arg0 + 1][arg1];
        arg2[class229.field3149.method6()] = var4 ? null : this.field553[arg0 - 1][arg1];
        arg2[class229.field3151.method6()] = var6 ? null : this.field553[arg0][arg1 - 1];
        arg2[class229.field3150.method6()] = var6 || var5 ? null : this.field553[arg0 + 1][arg1 - 1];
        arg2[class229.field3152.method6()] = var6 || var4 ? null : this.field553[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ag.y(IIIILjava/util/HashSet;IIB)V")
    public void method483(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field551 == null) {
            return;
        }
        this.field551.method4677(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field552 == null) {
            this.method502();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field552.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field526.field2617 - this.field557) * arg2 / this.field548;
                int var14 = arg3 - (var12.field526.field2615 - this.field564) * arg3 / this.field560;
                class282.method4559(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ag.h(IIIIIIIIIII)Ljava/util/List;")
    public List method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field561) {
            return var11;
        }
        class30 var12 = this.method511(arg0, arg1, arg2, arg3);
        float var13 = this.method487(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field557 + arg0;
        int var16 = this.field564 + arg1;
        for (int var17 = var12.field424; var17 < var12.field429 + var12.field424; var17++) {
            for (int var18 = var12.field427; var18 < var12.field427 + var12.field425; var18++) {
                List var19 = this.field553[var17][var18].method343((this.field553[var17][var18].field480 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field553[var17][var18].field482 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ag.x(IIIIB)Laf;")
    public class30 method511(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field557 + arg0;
        int var7 = this.field564 + arg1;
        int var8 = this.field557 + arg2;
        int var9 = this.field564 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field429 = var12 - var10 + 1;
        var5.field425 = var13 - var11 + 1;
        var5.field424 = var10 - this.field550.method269();
        var5.field427 = var11 - this.field550.method246();
        if (var5.field424 < 0) {
            var5.field429 += var5.field424;
            var5.field424 = 0;
        }
        if (var5.field424 > this.field553.length - var5.field429) {
            var5.field429 = this.field553.length - var5.field424;
        }
        if (var5.field427 < 0) {
            var5.field425 += var5.field427;
            var5.field427 = 0;
        }
        if (var5.field427 > this.field553[0].length - var5.field425) {
            var5.field425 = this.field553[0].length - var5.field427;
        }
        var5.field429 = Math.min(var5.field429, this.field553.length);
        var5.field425 = Math.min(var5.field425, this.field553[0].length);
        return var5;
    }

    @ObfuscatedName("ag.f(I)Z")
    public boolean method489() {
        return this.field561;
    }

    @ObfuscatedName("ag.n(S)Ljava/util/HashMap;")
    public HashMap method488() {
        this.method502();
        return this.field552;
    }

    @ObfuscatedName("ag.a(B)V")
    public void method502() {
        if (this.field552 == null) {
            this.field552 = new HashMap();
        }
        this.field552.clear();
        for (int var1 = 0; var1 < this.field553.length; var1++) {
            for (int var2 = 0; var2 < this.field553[var1].length; var2++) {
                List var3 = this.field553[var1][var2].method344();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field552.containsKey(var5.field537)) {
                        List var7 = (List) this.field552.get(var5.field537);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field552.put(var5.field537, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.o(IIB)F")
    public float method487(int arg0, int arg1) {
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
