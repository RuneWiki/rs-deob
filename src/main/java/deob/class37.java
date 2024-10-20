package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("al")
public final class class37 {

    @ObfuscatedName("al.m")
    public boolean field309 = false;

    @ObfuscatedName("al.f")
    public boolean field298 = false;

    @ObfuscatedName("al.q")
    public class39 field306;

    @ObfuscatedName("al.w")
    public class328 field297;

    @ObfuscatedName("al.o")
    public HashMap field313;

    @ObfuscatedName("al.u")
    public class30[][] field302;

    @ObfuscatedName("al.g")
    public HashMap field303 = new HashMap();

    @ObfuscatedName("al.l")
    public class327[] field304;

    @ObfuscatedName("al.e")
    public final class245 field305;

    @ObfuscatedName("al.x")
    public final class245 field301;

    @ObfuscatedName("al.d")
    public final HashMap field307;

    @ObfuscatedName("al.k")
    public int field308;

    @ObfuscatedName("al.n")
    public int field312;

    @ObfuscatedName("al.i")
    public int field310;

    @ObfuscatedName("al.a")
    public int field300;

    @ObfuscatedName("al.z")
    public int field311 = 0;

    public class37(class327[] arg0, HashMap arg1, class245 arg2, class245 arg3) {
        this.field304 = arg0;
        this.field307 = arg1;
        this.field305 = arg2;
        this.field301 = arg3;
    }

    @ObfuscatedName("al.m(Lir;Ljava/lang/String;ZB)V")
    public void method563(class245 arg0, String arg1, boolean arg2) {
        if (this.field298) {
            return;
        }
        this.field309 = false;
        this.field298 = true;
        System.nanoTime();
        int var4 = arg0.method4174(class36.field290.field293);
        int var5 = arg0.method4175(var4, arg1);
        class202 var6 = new class202(arg0.method4163(class36.field290.field293, arg1));
        class202 var7 = new class202(arg0.method4163(class36.field289.field293, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field306 = new class39();
        try {
            this.field306.method584(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field306.method309();
        this.field306.method313();
        this.field306.method314();
        this.field308 = this.field306.method308() * 64;
        this.field312 = this.field306.method310() * 64;
        this.field310 = (this.field306.method295() - this.field306.method308() + 1) * 64;
        this.field300 = (this.field306.method311() - this.field306.method310() + 1) * 64;
        int var9 = this.field306.method295() - this.field306.method308() + 1;
        int var10 = this.field306.method311() - this.field306.method310() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.method2243();
        this.field302 = new class30[var9][var10];
        Iterator var11 = this.field306.field314.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field150;
            int var14 = var12.field147;
            int var15 = var13 - this.field306.method308();
            int var16 = var14 - this.field306.method310();
            this.field302[var15][var16] = new class30(var13, var14, this.field306.method296(), this.field307);
            this.field302[var15][var16].method390(var12, this.field306.field316);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field302[var17][var18] == null) {
                    this.field302[var17][var18] = new class30(this.field306.method308() + var17, this.field306.method310() + var18, this.field306.method296(), this.field307);
                    this.field302[var17][var18].method391(this.field306.field317, this.field306.field316);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4207(class36.field291.field293, arg1)) {
            byte[] var19 = arg0.method4163(class36.field291.field293, arg1);
            this.field297 = class49.method381(var19);
        }
        System.nanoTime();
        arg0.method4170();
        arg0.method4172();
        this.field309 = true;
    }

    @ObfuscatedName("al.f(B)V")
    public final void method576() {
        this.field313 = null;
    }

    @ObfuscatedName("al.q(IIIIIIIII)V")
    public final void method548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3871;
        int var10 = Statics.field3873;
        int var11 = Statics.field3874;
        int[] var12 = new int[4];
        class324.method5476(var12);
        class23 var13 = this.method552(arg0, arg1, arg2, arg3);
        float var14 = this.method580(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field311 = var15;
        if (!this.field303.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method647();
            this.field303.put(var15, var16);
        }
        int var17 = var13.field170 + var13.field167 - 1;
        int var18 = var13.field168 + var13.field165 - 1;
        for (int var19 = var13.field167; var19 <= var17; var19++) {
            for (int var20 = var13.field168; var20 <= var18; var20++) {
                this.field302[var19][var20].method398(var15, (class41) this.field303.get(var15), this.field304, this.field305, this.field301);
            }
        }
        class324.method5473(var9, var10, var11);
        class324.method5463(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field308 + arg0;
        int var23 = this.field312 + arg1;
        for (int var24 = var13.field167; var24 < var13.field170 + var13.field167; var24++) {
            for (int var25 = var13.field168; var25 < var13.field168 + var13.field165; var25++) {
                this.field302[var24][var25].method459((this.field302[var24][var25].field238 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field302[var24][var25].field239 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("al.w(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method552(arg0, arg1, arg2, arg3);
        float var15 = this.method580(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field308 + arg0;
        int var18 = this.field312 + arg1;
        for (int var19 = var14.field167; var19 < var14.field170 + var14.field167; var19++) {
            for (int var20 = var14.field168; var20 < var14.field168 + var14.field165; var20++) {
                if (arg12) {
                    this.field302[var19][var20].method394();
                }
                this.field302[var19][var20].method399((this.field302[var19][var20].field238 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field302[var19][var20].field239 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field167; var21 < var14.field170 + var14.field167; var21++) {
            for (int var22 = var14.field168; var22 < var14.field168 + var14.field165; var22++) {
                this.field302[var21][var22].method458(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("al.o(IIIILjava/util/HashSet;III)V")
    public void method546(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field297 == null) {
            return;
        }
        this.field297.method5656(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field313 == null) {
            this.method555();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field313.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field287.field2605 - this.field308) * arg2 / this.field310;
                int var14 = arg3 - (var12.field287.field2606 - this.field312) * arg3 / this.field300;
                class324.method5460(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("al.u(IIIIIIIIIII)Ljava/util/List;")
    public List method551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field309) {
            return var11;
        }
        class23 var12 = this.method552(arg0, arg1, arg2, arg3);
        float var13 = this.method580(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field308 + arg0;
        int var16 = this.field312 + arg1;
        for (int var17 = var12.field167; var17 < var12.field170 + var12.field167; var17++) {
            for (int var18 = var12.field168; var18 < var12.field168 + var12.field165; var18++) {
                List var19 = this.field302[var17][var18].method420((this.field302[var17][var18].field238 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field302[var17][var18].field239 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("al.g(IIIII)Lc;")
    public class23 method552(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field308 + arg0;
        int var7 = this.field312 + arg1;
        int var8 = this.field308 + arg2;
        int var9 = this.field312 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field170 = var12 - var10 + 1;
        var5.field165 = var13 - var11 + 1;
        var5.field167 = var10 - this.field306.method308();
        var5.field168 = var11 - this.field306.method310();
        if (var5.field167 < 0) {
            var5.field170 += var5.field167;
            var5.field167 = 0;
        }
        if (var5.field167 > this.field302.length - var5.field170) {
            var5.field170 = this.field302.length - var5.field167;
        }
        if (var5.field168 < 0) {
            var5.field165 += var5.field168;
            var5.field168 = 0;
        }
        if (var5.field168 > this.field302[0].length - var5.field165) {
            var5.field165 = this.field302[0].length - var5.field168;
        }
        var5.field170 = Math.min(var5.field170, this.field302.length);
        var5.field165 = Math.min(var5.field165, this.field302[0].length);
        return var5;
    }

    @ObfuscatedName("al.l(I)Z")
    public boolean method553() {
        return this.field309;
    }

    @ObfuscatedName("al.e(I)Ljava/util/HashMap;")
    public HashMap method556() {
        this.method555();
        return this.field313;
    }

    @ObfuscatedName("al.x(B)V")
    public void method555() {
        if (this.field313 == null) {
            this.field313 = new HashMap();
        }
        this.field313.clear();
        for (int var1 = 0; var1 < this.field302.length; var1++) {
            for (int var2 = 0; var2 < this.field302[var1].length; var2++) {
                List var3 = this.field302[var1][var2].method421();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method531()) {
                        int var6 = var5.method192();
                        if (this.field313.containsKey(var6)) {
                            List var8 = (List) this.field313.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field313.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.d(III)F")
    public float method580(int arg0, int arg1) {
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
