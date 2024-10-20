package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("hr")
public final class class220 {

    @ObfuscatedName("hr.c")
    public boolean field2667 = false;

    @ObfuscatedName("hr.l")
    public boolean field2658 = false;

    @ObfuscatedName("hr.s")
    public class239 field2659;

    @ObfuscatedName("hr.e")
    public class434 field2657;

    @ObfuscatedName("hr.r")
    public HashMap field2661;

    @ObfuscatedName("hr.o")
    public class219[][] field2662;

    @ObfuscatedName("hr.i")
    public HashMap field2663 = new HashMap();

    @ObfuscatedName("hr.w")
    public class433[] field2664;

    @ObfuscatedName("hr.v")
    public final class307 field2665;

    @ObfuscatedName("hr.a")
    public final class307 field2668;

    @ObfuscatedName("hr.y")
    public final HashMap field2660;

    @ObfuscatedName("hr.u")
    public int field2672;

    @ObfuscatedName("hr.h")
    public int field2669;

    @ObfuscatedName("hr.q")
    public int field2666;

    @ObfuscatedName("hr.x")
    public int field2671;

    @ObfuscatedName("hr.p")
    public int field2670 = 0;

    public class220(class433[] arg0, HashMap arg1, class307 arg2, class307 arg3) {
        this.field2664 = arg0;
        this.field2660 = arg1;
        this.field2665 = arg2;
        this.field2668 = arg3;
    }

    @ObfuscatedName("hr.c(Lkq;Ljava/lang/String;ZB)V")
    public void method4233(class307 arg0, String arg1, boolean arg2) {
        if (this.field2658) {
            return;
        }
        this.field2667 = false;
        this.field2658 = true;
        System.nanoTime();
        int var4 = arg0.method5046(class237.field2794.field2795);
        int var5 = arg0.method5047(var4, arg1);
        class421 var6 = new class421(arg0.method5049(class237.field2794.field2795, arg1));
        class421 var7 = new class421(arg0.method5049(class237.field2791.field2795, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2659 = new class239();
        try {
            this.field2659.method4379(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2659.method4044();
        this.field2659.method4045();
        this.field2659.method4046();
        this.field2672 = this.field2659.method4040() * 64;
        this.field2669 = this.field2659.method4071() * 64;
        this.field2666 = (this.field2659.method4041() - this.field2659.method4040() + 1) * 64;
        this.field2671 = (this.field2659.method4035() - this.field2659.method4071() + 1) * 64;
        int var9 = this.field2659.method4041() - this.field2659.method4040() + 1;
        int var10 = this.field2659.method4035() - this.field2659.method4071() + 1;
        System.nanoTime();
        System.nanoTime();
        class219.method2127();
        this.field2662 = new class219[var9][var10];
        Iterator var11 = this.field2659.field2798.iterator();
        while (var11.hasNext()) {
            class213 var12 = (class213) var11.next();
            int var13 = var12.field2738;
            int var14 = var12.field2730;
            int var15 = var13 - this.field2659.method4040();
            int var16 = var14 - this.field2659.method4071();
            this.field2662[var15][var16] = new class219(var13, var14, this.field2659.method4038(), this.field2660);
            this.field2662[var15][var16].method4137(var12, this.field2659.field2799);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2662[var17][var18] == null) {
                    this.field2662[var17][var18] = new class219(this.field2659.method4040() + var17, this.field2659.method4071() + var18, this.field2659.method4038(), this.field2660);
                    this.field2662[var17][var18].method4102(this.field2659.field2800, this.field2659.field2799);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5044(class237.field2792.field2795, arg1)) {
            byte[] var19 = arg0.method5049(class237.field2792.field2795, arg1);
            this.field2657 = class29.method2590(var19);
        }
        System.nanoTime();
        arg0.method5042();
        arg0.method5053();
        this.field2667 = true;
    }

    @ObfuscatedName("hr.l(I)V")
    public final void method4234() {
        this.field2661 = null;
    }

    @ObfuscatedName("hr.s(IIIIIIIII)V")
    public final void method4240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4578;
        int var10 = Statics.field4579;
        int var11 = Statics.field4580;
        int[] var12 = new int[4];
        class430.method6990(var12);
        class228 var13 = this.method4239(arg0, arg1, arg2, arg3);
        float var14 = this.method4249(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2670 = var15;
        if (!this.field2663.containsKey(var15)) {
            class240 var16 = new class240(var15);
            var16.method4389();
            this.field2663.put(var15, var16);
        }
        int var17 = var13.field2746 + var13.field2745 - 1;
        int var18 = var13.field2744 + var13.field2743 - 1;
        for (int var19 = var13.field2745; var19 <= var17; var19++) {
            for (int var20 = var13.field2743; var20 <= var18; var20++) {
                this.field2662[var19][var20].method4175(var15, (class240) this.field2663.get(var15), this.field2664, this.field2665, this.field2668);
            }
        }
        class430.method6948(var9, var10, var11);
        class430.method6957(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2672 + arg0;
        int var23 = this.field2669 + arg1;
        for (int var24 = var13.field2745; var24 < var13.field2746 + var13.field2745; var24++) {
            for (int var25 = var13.field2743; var25 < var13.field2744 + var13.field2743; var25++) {
                this.field2662[var24][var25].method4181((this.field2662[var24][var25].field2647 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2662[var24][var25].field2652 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("hr.e(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class228 var14 = this.method4239(arg0, arg1, arg2, arg3);
        float var15 = this.method4249(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2672 + arg0;
        int var18 = this.field2669 + arg1;
        for (int var19 = var14.field2745; var19 < var14.field2746 + var14.field2745; var19++) {
            for (int var20 = var14.field2743; var20 < var14.field2744 + var14.field2743; var20++) {
                if (arg12) {
                    this.field2662[var19][var20].method4141();
                }
                this.field2662[var19][var20].method4110((this.field2662[var19][var20].field2647 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2662[var19][var20].field2652 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2745; var21 < var14.field2746 + var14.field2745; var21++) {
            for (int var22 = var14.field2743; var22 < var14.field2744 + var14.field2743; var22++) {
                this.field2662[var21][var22].method4111(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("hr.r(IIIILjava/util/HashSet;IIB)V")
    public void method4237(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2657 == null) {
            return;
        }
        this.field2657.method7074(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2661 == null) {
            this.method4242();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2661.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class236 var12 = (class236) var11.next();
                int var13 = (var12.field2788.field3228 - this.field2672) * arg2 / this.field2666;
                int var14 = arg3 - (var12.field2788.field3229 - this.field2669) * arg3 / this.field2671;
                class430.method6956(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("hr.o(IIIIIIIIIII)Ljava/util/List;")
    public List method4238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2667) {
            return var11;
        }
        class228 var12 = this.method4239(arg0, arg1, arg2, arg3);
        float var13 = this.method4249(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2672 + arg0;
        int var16 = this.field2669 + arg1;
        for (int var17 = var12.field2745; var17 < var12.field2746 + var12.field2745; var17++) {
            for (int var18 = var12.field2743; var18 < var12.field2744 + var12.field2743; var18++) {
                List var19 = this.field2662[var17][var18].method4101((this.field2662[var17][var18].field2647 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2662[var17][var18].field2652 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("hr.i(IIIII)Lhd;")
    public class228 method4239(int arg0, int arg1, int arg2, int arg3) {
        class228 var5 = new class228(this);
        int var6 = this.field2672 + arg0;
        int var7 = this.field2669 + arg1;
        int var8 = this.field2672 + arg2;
        int var9 = this.field2669 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2746 = var12 - var10 + 1;
        var5.field2744 = var13 - var11 + 1;
        var5.field2745 = var10 - this.field2659.method4040();
        var5.field2743 = var11 - this.field2659.method4071();
        if (var5.field2745 < 0) {
            var5.field2746 += var5.field2745;
            var5.field2745 = 0;
        }
        if (var5.field2745 > this.field2662.length - var5.field2746) {
            var5.field2746 = this.field2662.length - var5.field2745;
        }
        if (var5.field2743 < 0) {
            var5.field2744 += var5.field2743;
            var5.field2743 = 0;
        }
        if (var5.field2743 > this.field2662[0].length - var5.field2744) {
            var5.field2744 = this.field2662[0].length - var5.field2743;
        }
        var5.field2746 = Math.min(var5.field2746, this.field2662.length);
        var5.field2744 = Math.min(var5.field2744, this.field2662[0].length);
        return var5;
    }

    @ObfuscatedName("hr.w(B)Z")
    public boolean method4244() {
        return this.field2667;
    }

    @ObfuscatedName("hr.v(S)Ljava/util/HashMap;")
    public HashMap method4241() {
        this.method4242();
        return this.field2661;
    }

    @ObfuscatedName("hr.a(B)V")
    public void method4242() {
        if (this.field2661 == null) {
            this.field2661 = new HashMap();
        }
        this.field2661.clear();
        for (int var1 = 0; var1 < this.field2662.length; var1++) {
            for (int var2 = 0; var2 < this.field2662[var1].length; var2++) {
                List var3 = this.field2662[var1][var2].method4132();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class236 var5 = (class236) var4.next();
                    if (var5.method4375()) {
                        int var6 = var5.method3980();
                        if (this.field2661.containsKey(var6)) {
                            List var8 = (List) this.field2661.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2661.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hr.y(III)F")
    public float method4249(int arg0, int arg1) {
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
