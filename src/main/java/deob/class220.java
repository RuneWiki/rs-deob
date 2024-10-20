package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("he")
public final class class220 {

    @ObfuscatedName("he.c")
    public boolean field2646 = false;

    @ObfuscatedName("he.b")
    public boolean field2633 = false;

    @ObfuscatedName("he.p")
    public class239 field2634;

    @ObfuscatedName("he.m")
    public class432 field2635;

    @ObfuscatedName("he.t")
    public HashMap field2640;

    @ObfuscatedName("he.s")
    public class219[][] field2642;

    @ObfuscatedName("he.j")
    public HashMap field2638 = new HashMap();

    @ObfuscatedName("he.w")
    public class431[] field2637;

    @ObfuscatedName("he.n")
    public final class302 field2647;

    @ObfuscatedName("he.r")
    public final class302 field2641;

    @ObfuscatedName("he.o")
    public final HashMap field2648;

    @ObfuscatedName("he.v")
    public int field2643;

    @ObfuscatedName("he.d")
    public int field2644;

    @ObfuscatedName("he.h")
    public int field2639;

    @ObfuscatedName("he.g")
    public int field2632;

    @ObfuscatedName("he.e")
    public int field2645 = 0;

    public class220(class431[] arg0, HashMap arg1, class302 arg2, class302 arg3) {
        this.field2637 = arg0;
        this.field2648 = arg1;
        this.field2647 = arg2;
        this.field2641 = arg3;
    }

    @ObfuscatedName("he.c(Lku;Ljava/lang/String;ZI)V")
    public void method4270(class302 arg0, String arg1, boolean arg2) {
        if (this.field2633) {
            return;
        }
        this.field2646 = false;
        this.field2633 = true;
        System.nanoTime();
        int var4 = arg0.method5118(class237.field2769.field2770);
        int var5 = arg0.method5070(var4, arg1);
        class419 var6 = new class419(arg0.method5069(class237.field2769.field2770, arg1));
        class419 var7 = new class419(arg0.method5069(class237.field2764.field2770, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2634 = new class239();
        try {
            this.field2634.method4427(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2634.method4095();
        this.field2634.method4096();
        this.field2634.method4105();
        this.field2643 = this.field2634.method4091() * 64;
        this.field2644 = this.field2634.method4138() * 64;
        this.field2639 = (this.field2634.method4092() - this.field2634.method4091() + 1) * 64;
        this.field2632 = (this.field2634.method4094() - this.field2634.method4138() + 1) * 64;
        int var9 = this.field2634.method4092() - this.field2634.method4091() + 1;
        int var10 = this.field2634.method4094() - this.field2634.method4138() + 1;
        System.nanoTime();
        System.nanoTime();
        class219.method2603();
        this.field2642 = new class219[var9][var10];
        Iterator var11 = this.field2634.field2774.iterator();
        while (var11.hasNext()) {
            class213 var12 = (class213) var11.next();
            int var13 = var12.field2698;
            int var14 = var12.field2701;
            int var15 = var13 - this.field2634.method4091();
            int var16 = var14 - this.field2634.method4138();
            this.field2642[var15][var16] = new class219(var13, var14, this.field2634.method4089(), this.field2648);
            this.field2642[var15][var16].method4151(var12, this.field2634.field2772);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2642[var17][var18] == null) {
                    this.field2642[var17][var18] = new class219(this.field2634.method4091() + var17, this.field2634.method4138() + var18, this.field2634.method4089(), this.field2648);
                    this.field2642[var17][var18].method4216(this.field2634.field2771, this.field2634.field2772);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5071(class237.field2765.field2770, arg1)) {
            byte[] var19 = arg0.method5069(class237.field2765.field2770, arg1);
            this.field2635 = class29.method2064(var19);
        }
        System.nanoTime();
        arg0.method5065();
        arg0.method5067();
        this.field2646 = true;
    }

    @ObfuscatedName("he.b(I)V")
    public final void method4300() {
        this.field2640 = null;
    }

    @ObfuscatedName("he.p(IIIIIIIII)V")
    public final void method4276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4546;
        int var10 = Statics.field4542;
        int var11 = Statics.field4543;
        int[] var12 = new int[4];
        class428.method6937(var12);
        class228 var13 = this.method4273(arg0, arg1, arg2, arg3);
        float var14 = this.method4305(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2645 = var15;
        if (!this.field2638.containsKey(var15)) {
            class240 var16 = new class240(var15);
            var16.method4437();
            this.field2638.put(var15, var16);
        }
        int var17 = var13.field2716 + var13.field2714 - 1;
        int var18 = var13.field2717 + var13.field2715 - 1;
        for (int var19 = var13.field2714; var19 <= var17; var19++) {
            for (int var20 = var13.field2717; var20 <= var18; var20++) {
                this.field2642[var19][var20].method4239(var15, (class240) this.field2638.get(var15), this.field2637, this.field2647, this.field2641);
            }
        }
        class428.method6933(var9, var10, var11);
        class428.method6938(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2643 + arg0;
        int var23 = this.field2644 + arg1;
        for (int var24 = var13.field2714; var24 < var13.field2716 + var13.field2714; var24++) {
            for (int var25 = var13.field2717; var25 < var13.field2717 + var13.field2715; var25++) {
                this.field2642[var24][var25].method4150((this.field2642[var24][var25].field2624 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2642[var24][var25].field2623 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("he.m(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class228 var14 = this.method4273(arg0, arg1, arg2, arg3);
        float var15 = this.method4305(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2643 + arg0;
        int var18 = this.field2644 + arg1;
        for (int var19 = var14.field2714; var19 < var14.field2716 + var14.field2714; var19++) {
            for (int var20 = var14.field2717; var20 < var14.field2717 + var14.field2715; var20++) {
                if (arg12) {
                    this.field2642[var19][var20].method4185();
                }
                this.field2642[var19][var20].method4246((this.field2642[var19][var20].field2624 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2642[var19][var20].field2623 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2714; var21 < var14.field2716 + var14.field2714; var21++) {
            for (int var22 = var14.field2717; var22 < var14.field2717 + var14.field2715; var22++) {
                this.field2642[var21][var22].method4195(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("he.t(IIIILjava/util/HashSet;IIB)V")
    public void method4274(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2635 == null) {
            return;
        }
        this.field2635.method7128(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2640 == null) {
            this.method4279();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2640.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class236 var12 = (class236) var11.next();
                int var13 = (var12.field2760.field3188 - this.field2643) * arg2 / this.field2639;
                int var14 = arg3 - (var12.field2760.field3189 - this.field2644) * arg3 / this.field2632;
                class428.method6941(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("he.s(IIIIIIIIIII)Ljava/util/List;")
    public List method4275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2646) {
            return var11;
        }
        class228 var12 = this.method4273(arg0, arg1, arg2, arg3);
        float var13 = this.method4305(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2643 + arg0;
        int var16 = this.field2644 + arg1;
        for (int var17 = var12.field2714; var17 < var12.field2716 + var12.field2714; var17++) {
            for (int var18 = var12.field2717; var18 < var12.field2717 + var12.field2715; var18++) {
                List var19 = this.field2642[var17][var18].method4180((this.field2642[var17][var18].field2624 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2642[var17][var18].field2623 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("he.j(IIIII)Lhs;")
    public class228 method4273(int arg0, int arg1, int arg2, int arg3) {
        class228 var5 = new class228(this);
        int var6 = this.field2643 + arg0;
        int var7 = this.field2644 + arg1;
        int var8 = this.field2643 + arg2;
        int var9 = this.field2644 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2716 = var12 - var10 + 1;
        var5.field2715 = var13 - var11 + 1;
        var5.field2714 = var10 - this.field2634.method4091();
        var5.field2717 = var11 - this.field2634.method4138();
        if (var5.field2714 < 0) {
            var5.field2716 += var5.field2714;
            var5.field2714 = 0;
        }
        if (var5.field2714 > this.field2642.length - var5.field2716) {
            var5.field2716 = this.field2642.length - var5.field2714;
        }
        if (var5.field2717 < 0) {
            var5.field2715 += var5.field2717;
            var5.field2717 = 0;
        }
        if (var5.field2717 > this.field2642[0].length - var5.field2715) {
            var5.field2715 = this.field2642[0].length - var5.field2717;
        }
        var5.field2716 = Math.min(var5.field2716, this.field2642.length);
        var5.field2715 = Math.min(var5.field2715, this.field2642[0].length);
        return var5;
    }

    @ObfuscatedName("he.w(B)Z")
    public boolean method4298() {
        return this.field2646;
    }

    @ObfuscatedName("he.n(I)Ljava/util/HashMap;")
    public HashMap method4278() {
        this.method4279();
        return this.field2640;
    }

    @ObfuscatedName("he.r(I)V")
    public void method4279() {
        if (this.field2640 == null) {
            this.field2640 = new HashMap();
        }
        this.field2640.clear();
        for (int var1 = 0; var1 < this.field2642.length; var1++) {
            for (int var2 = 0; var2 < this.field2642[var1].length; var2++) {
                List var3 = this.field2642[var1][var2].method4181();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class236 var5 = (class236) var4.next();
                    if (var5.method4410()) {
                        int var6 = var5.method4040();
                        if (this.field2640.containsKey(var6)) {
                            List var8 = (List) this.field2640.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2640.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("he.o(IIB)F")
    public float method4305(int arg0, int arg1) {
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
