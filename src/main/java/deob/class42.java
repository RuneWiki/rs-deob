package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ag")
public final class class42 {

    @ObfuscatedName("ag.p")
    public boolean field567 = false;

    @ObfuscatedName("ag.m")
    public boolean field559 = false;

    @ObfuscatedName("ag.e")
    public class45 field561;

    @ObfuscatedName("ag.t")
    public class286 field562;

    @ObfuscatedName("ag.w")
    public HashMap field564;

    @ObfuscatedName("ag.z")
    public class35[][] field570;

    @ObfuscatedName("ag.j")
    public HashMap field565 = new HashMap();

    @ObfuscatedName("ag.i")
    public class285[] field569;

    @ObfuscatedName("ag.f")
    public final HashMap field576;

    @ObfuscatedName("ag.c")
    public int field568;

    @ObfuscatedName("ag.o")
    public int field566;

    @ObfuscatedName("ag.q")
    public int field560;

    @ObfuscatedName("ag.n")
    public int field571;

    public class42(class285[] arg0, HashMap arg1) {
        this.field569 = arg0;
        this.field576 = arg1;
    }

    @ObfuscatedName("ag.p(Lil;Ljava/lang/String;ZI)V")
    public void method485(class236 arg0, String arg1, boolean arg2) {
        if (this.field559) {
            return;
        }
        this.field567 = false;
        this.field559 = true;
        System.nanoTime();
        int var4 = arg0.method3764(class41.field557.field549);
        int var5 = arg0.method3729(var4, arg1);
        class174 var6 = new class174(arg0.method3723(class41.field557.field549, arg1));
        class174 var7 = new class174(arg0.method3723(class41.field548.field549, arg1));
        class174 var8 = new class174(arg0.method3723(arg1, class41.field552.field549));
        System.nanoTime();
        System.nanoTime();
        this.field561 = new class45();
        try {
            this.field561.method549(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field561.method270();
        this.field561.method271();
        this.field561.method259();
        this.field568 = this.field561.method266() * 64;
        this.field566 = this.field561.method278() * 64;
        this.field560 = (this.field561.method267() - this.field561.method266() + 1) * 64;
        this.field571 = (this.field561.method269() - this.field561.method278() + 1) * 64;
        int var10 = this.field561.method267() - this.field561.method266() + 1;
        int var11 = this.field561.method269() - this.field561.method278() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field570 = new class35[var10][var11];
        Iterator var12 = this.field561.field586.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field425;
            int var15 = var13.field421;
            int var16 = var14 - this.field561.method266();
            int var17 = var15 - this.field561.method278();
            this.field570[var16][var17] = new class35(var14, var15, this.field561.method264(), this.field576);
            this.field570[var16][var17].method409(var13, this.field561.field588);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field570[var18][var19] == null) {
                    this.field570[var18][var19] = new class35(this.field561.method266() + var18, this.field561.method278() + var19, this.field561.method264(), this.field576);
                    this.field570[var18][var19].method350(this.field561.field587, this.field561.field588);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3722(class41.field558.field549, arg1)) {
            byte[] var20 = arg0.method3723(class41.field558.field549, arg1);
            this.field562 = class55.method671(var20);
        }
        System.nanoTime();
        this.field567 = true;
    }

    @ObfuscatedName("ag.m(I)V")
    public final void method486() {
        this.field564 = null;
    }

    @ObfuscatedName("ag.e(IIIIIIIII)V")
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3758;
        int var10 = Statics.field3754;
        int var11 = Statics.field3755;
        int[] var12 = new int[4];
        class282.method4568(var12);
        class30 var13 = this.method495(arg0, arg1, arg2, arg3);
        float var14 = this.method496(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field565.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method582();
            this.field565.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field435; var18 < var13.field436 + var13.field435; var18++) {
            for (int var19 = var13.field433; var19 < var13.field434 + var13.field433; var19++) {
                this.method489(var18, var19, var17);
                this.field570[var18][var19].method332(var15, (class47) this.field565.get(var15), var17, this.field569);
            }
        }
        class282.method4500(var9, var10, var11);
        class282.method4505(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field568 + arg0;
        int var22 = this.field566 + arg1;
        for (int var23 = var13.field435; var23 < var13.field436 + var13.field435; var23++) {
            for (int var24 = var13.field433; var24 < var13.field434 + var13.field433; var24++) {
                this.field570[var23][var24].method327((this.field570[var23][var24].field484 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field570[var23][var24].field488 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ag.t(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method495(arg0, arg1, arg2, arg3);
        float var15 = this.method496(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field568 + arg0;
        int var18 = this.field566 + arg1;
        for (int var19 = var14.field435; var19 < var14.field436 + var14.field435; var19++) {
            for (int var20 = var14.field433; var20 < var14.field434 + var14.field433; var20++) {
                if (arg12) {
                    this.field570[var19][var20].method433();
                }
                this.field570[var19][var20].method333((this.field570[var19][var20].field484 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field570[var19][var20].field488 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field435; var21 < var14.field436 + var14.field435; var21++) {
            for (int var22 = var14.field433; var22 < var14.field434 + var14.field433; var22++) {
                this.field570[var21][var22].method334(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ag.w(II[Lam;B)V")
    public void method489(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field570.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field570[0].length - 1;
        if (var7) {
            arg2[class229.field3161.method12()] = null;
        } else {
            arg2[class229.field3161.method12()] = this.field570[arg0][arg1 + 1];
        }
        arg2[class229.field3157.method12()] = var7 || var5 ? null : this.field570[arg0 + 1][arg1 + 1];
        arg2[class229.field3163.method12()] = var7 || var4 ? null : this.field570[arg0 - 1][arg1 + 1];
        arg2[class229.field3158.method12()] = var5 ? null : this.field570[arg0 + 1][arg1];
        arg2[class229.field3162.method12()] = var4 ? null : this.field570[arg0 - 1][arg1];
        arg2[class229.field3166.method12()] = var6 ? null : this.field570[arg0][arg1 - 1];
        arg2[class229.field3156.method12()] = var6 || var5 ? null : this.field570[arg0 + 1][arg1 - 1];
        arg2[class229.field3160.method12()] = var6 || var4 ? null : this.field570[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ag.z(IIIILjava/util/HashSet;III)V")
    public void method490(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field562 == null) {
            return;
        }
        this.field562.method4634(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field564 == null) {
            this.method492();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field564.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field539.field2619 - this.field568) * arg2 / this.field560;
                int var14 = arg3 - (var12.field539.field2622 - this.field566) * arg3 / this.field571;
                class282.method4508(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ag.j(IIIIIIIIIIB)Ljava/util/List;")
    public List method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field567) {
            return var11;
        }
        class30 var12 = this.method495(arg0, arg1, arg2, arg3);
        float var13 = this.method496(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field568 + arg0;
        int var16 = this.field566 + arg1;
        for (int var17 = var12.field435; var17 < var12.field436 + var12.field435; var17++) {
            for (int var18 = var12.field433; var18 < var12.field434 + var12.field433; var18++) {
                List var19 = this.field570[var17][var18].method364((this.field570[var17][var18].field484 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field570[var17][var18].field488 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ag.c(IIIII)Lae;")
    public class30 method495(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field568 + arg0;
        int var7 = this.field566 + arg1;
        int var8 = this.field568 + arg2;
        int var9 = this.field566 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field436 = var12 - var10 + 1;
        var5.field434 = var13 - var11 + 1;
        var5.field435 = var10 - this.field561.method266();
        var5.field433 = var11 - this.field561.method278();
        if (var5.field435 < 0) {
            var5.field436 += var5.field435;
            var5.field435 = 0;
        }
        if (var5.field435 > this.field570.length - var5.field436) {
            var5.field436 = this.field570.length - var5.field435;
        }
        if (var5.field433 < 0) {
            var5.field434 += var5.field433;
            var5.field433 = 0;
        }
        if (var5.field433 > this.field570[0].length - var5.field434) {
            var5.field434 = this.field570[0].length - var5.field433;
        }
        var5.field436 = Math.min(var5.field436, this.field570.length);
        var5.field434 = Math.min(var5.field434, this.field570[0].length);
        return var5;
    }

    @ObfuscatedName("ag.o(I)Z")
    public boolean method511() {
        return this.field567;
    }

    @ObfuscatedName("ag.q(I)Ljava/util/HashMap;")
    public HashMap method494() {
        this.method492();
        return this.field564;
    }

    @ObfuscatedName("ag.n(B)V")
    public void method492() {
        if (this.field564 == null) {
            this.field564 = new HashMap();
        }
        this.field564.clear();
        for (int var1 = 0; var1 < this.field570.length; var1++) {
            for (int var2 = 0; var2 < this.field570[var1].length; var2++) {
                List var3 = this.field570[var1][var2].method363();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field564.containsKey(var5.field542)) {
                        List var7 = (List) this.field564.get(var5.field542);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field564.put(var5.field542, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.a(III)F")
    public float method496(int arg0, int arg1) {
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
