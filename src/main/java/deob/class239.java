package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("jf")
public final class class239 {

    @ObfuscatedName("jf.at")
    public boolean field2499 = false;

    @ObfuscatedName("jf.ah")
    public boolean field2491 = false;

    @ObfuscatedName("jf.ar")
    public class258 field2492;

    @ObfuscatedName("jf.ao")
    public class541 field2493;

    @ObfuscatedName("jf.ab")
    public HashMap field2494;

    @ObfuscatedName("jf.au")
    public class238[][] field2495;

    @ObfuscatedName("jf.aa")
    public HashMap field2496 = new HashMap();

    @ObfuscatedName("jf.ac")
    public class540[] field2497;

    @ObfuscatedName("jf.al")
    public final class371 field2498;

    @ObfuscatedName("jf.az")
    public final class371 field2502;

    @ObfuscatedName("jf.ap")
    public final HashMap field2490;

    @ObfuscatedName("jf.av")
    public int field2501;

    @ObfuscatedName("jf.ax")
    public int field2500;

    @ObfuscatedName("jf.as")
    public int field2504;

    @ObfuscatedName("jf.ay")
    public int field2505;

    @ObfuscatedName("jf.ak")
    public int field2503 = 0;

    public class239(class540[] arg0, HashMap arg1, class371 arg2, class371 arg3) {
        this.field2497 = arg0;
        this.field2490 = arg1;
        this.field2498 = arg2;
        this.field2502 = arg3;
    }

    @ObfuscatedName("jf.at(Lol;Ljava/lang/String;ZZB)V")
    public void method4356(class371 arg0, String arg1, boolean arg2, boolean arg3) {
        if (this.field2491) {
            return;
        }
        this.field2499 = false;
        this.field2491 = true;
        System.nanoTime();
        int var5 = arg0.method6300(class256.field2634.field2628);
        int var6 = arg0.method6301(var5, arg1);
        class527 var7 = new class527(arg0.method6303(class256.field2634.field2628, arg1));
        class527 var8 = new class527(arg0.method6303(class256.field2627.field2628, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2492 = new class258();
        try {
            this.field2492.method4507(var7, var8, var6, arg2, arg3);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field2492.method4187();
        this.field2492.method4188();
        this.field2492.method4189();
        this.field2501 = this.field2492.method4246() * 64;
        this.field2500 = this.field2492.method4185() * 64;
        this.field2504 = (this.field2492.method4184() - this.field2492.method4246() + 1) * 64;
        this.field2505 = (this.field2492.method4186() - this.field2492.method4185() + 1) * 64;
        int var10 = this.field2492.method4184() - this.field2492.method4246() + 1;
        int var11 = this.field2492.method4186() - this.field2492.method4185() + 1;
        System.nanoTime();
        System.nanoTime();
        class238.field2476.method5260();
        this.field2495 = new class238[var10][var11];
        Iterator var12 = this.field2492.field2636.iterator();
        while (var12.hasNext()) {
            class232 var13 = (class232) var12.next();
            int var14 = var13.field2563;
            int var15 = var13.field2564;
            int var16 = var14 - this.field2492.method4246();
            int var17 = var15 - this.field2492.method4185();
            this.field2495[var16][var17] = new class238(var14, var15, this.field2492.method4196(), this.field2490);
            this.field2495[var16][var17].method4294(var13, this.field2492.field2640);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field2495[var18][var19] == null) {
                    this.field2495[var18][var19] = new class238(this.field2492.method4246() + var18, this.field2492.method4185() + var19, this.field2492.method4196(), this.field2490);
                    this.field2495[var18][var19].method4288(this.field2492.field2637, this.field2492.field2640);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6302(class256.field2629.field2628, arg1)) {
            byte[] var20 = arg0.method6303(class256.field2629.field2628, arg1);
            this.field2493 = class31.method7894(var20);
        }
        System.nanoTime();
        arg0.method6306();
        arg0.method6349();
        this.field2499 = true;
    }

    @ObfuscatedName("jf.ah(I)V")
    public final void method4357() {
        this.field2494 = null;
    }

    @ObfuscatedName("jf.ar(IIIIIIIII)V")
    public final void method4358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5215;
        int var10 = Statics.field5208;
        int var11 = Statics.field5207;
        float[] var12 = Statics.field5210;
        int[] var13 = new int[4];
        class537.method8757(var13);
        class247 var14 = this.method4362(arg0, arg1, arg2, arg3);
        float var15 = this.method4367(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field2503 = var16;
        if (!this.field2496.containsKey(var16)) {
            class259 var17 = new class259(var16);
            var17.method4555();
            this.field2496.put(var16, var17);
        }
        int var18 = var14.field2579 + var14.field2578 - 1;
        int var19 = var14.field2585 + var14.field2582 - 1;
        for (int var20 = var14.field2579; var20 <= var18; var20++) {
            for (int var21 = var14.field2582; var21 <= var19; var21++) {
                this.field2495[var20][var21].method4256(var16, (class259) this.field2496.get(var16), this.field2497, this.field2498, this.field2502);
            }
        }
        class267.method4734(var9, var10, var11, var12);
        class537.method8775(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field2501 + arg0;
        int var24 = this.field2500 + arg1;
        for (int var25 = var14.field2579; var25 < var14.field2579 + var14.field2578; var25++) {
            for (int var26 = var14.field2582; var26 < var14.field2585 + var14.field2582; var26++) {
                this.field2495[var25][var26].method4248((this.field2495[var25][var26].field2479 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field2495[var25][var26].field2478 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("jf.ao(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class247 var14 = this.method4362(arg0, arg1, arg2, arg3);
        float var15 = this.method4367(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2501 + arg0;
        int var18 = this.field2500 + arg1;
        for (int var19 = var14.field2579; var19 < var14.field2579 + var14.field2578; var19++) {
            for (int var20 = var14.field2582; var20 < var14.field2585 + var14.field2582; var20++) {
                if (arg12) {
                    this.field2495[var19][var20].method4252();
                }
                this.field2495[var19][var20].method4257((this.field2495[var19][var20].field2479 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2495[var19][var20].field2478 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2579; var21 < var14.field2579 + var14.field2578; var21++) {
            for (int var22 = var14.field2582; var22 < var14.field2585 + var14.field2582; var22++) {
                this.field2495[var21][var22].method4258(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("jf.ab(IIIILjava/util/HashSet;III)V")
    public void method4379(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2493 == null) {
            return;
        }
        this.field2493.method8887(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2494 == null) {
            this.method4391();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2494.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class255 var12 = (class255) var11.next();
                int var13 = (var12.field2623.field3561 - this.field2501) * arg2 / this.field2504;
                int var14 = arg3 - (var12.field2623.field3563 - this.field2500) * arg3 / this.field2505;
                class537.method8761(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("jf.au(IIIIIIIIIII)Ljava/util/List;")
    public List method4387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2499) {
            return var11;
        }
        class247 var12 = this.method4362(arg0, arg1, arg2, arg3);
        float var13 = this.method4367(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2501 + arg0;
        int var16 = this.field2500 + arg1;
        for (int var17 = var12.field2579; var17 < var12.field2579 + var12.field2578; var17++) {
            for (int var18 = var12.field2582; var18 < var12.field2585 + var12.field2582; var18++) {
                List var19 = this.field2495[var17][var18].method4322((this.field2495[var17][var18].field2479 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2495[var17][var18].field2478 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("jf.aa(IIIII)Ljy;")
    public class247 method4362(int arg0, int arg1, int arg2, int arg3) {
        class247 var5 = new class247(this);
        int var6 = this.field2501 + arg0;
        int var7 = this.field2500 + arg1;
        int var8 = this.field2501 + arg2;
        int var9 = this.field2500 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2578 = var12 - var10 + 1;
        var5.field2585 = var13 - var11 + 1;
        var5.field2579 = var10 - this.field2492.method4246();
        var5.field2582 = var11 - this.field2492.method4185();
        if (var5.field2579 < 0) {
            var5.field2578 += var5.field2579;
            var5.field2579 = 0;
        }
        if (var5.field2579 > this.field2495.length - var5.field2578) {
            var5.field2578 = this.field2495.length - var5.field2579;
        }
        if (var5.field2582 < 0) {
            var5.field2585 += var5.field2582;
            var5.field2582 = 0;
        }
        if (var5.field2582 > this.field2495[0].length - var5.field2585) {
            var5.field2585 = this.field2495[0].length - var5.field2582;
        }
        var5.field2578 = Math.min(var5.field2578, this.field2495.length);
        var5.field2585 = Math.min(var5.field2585, this.field2495[0].length);
        return var5;
    }

    @ObfuscatedName("jf.ac(I)Z")
    public boolean method4355() {
        return this.field2499;
    }

    @ObfuscatedName("jf.al(I)I")
    public int method4364() {
        return this.field2492.method4243();
    }

    @ObfuscatedName("jf.az(B)Ljava/util/HashMap;")
    public HashMap method4365() {
        this.method4391();
        return this.field2494;
    }

    @ObfuscatedName("jf.ap(S)V")
    public void method4391() {
        if (this.field2494 == null) {
            this.field2494 = new HashMap();
        }
        this.field2494.clear();
        for (int var1 = 0; var1 < this.field2495.length; var1++) {
            for (int var2 = 0; var2 < this.field2495[var1].length; var2++) {
                List var3 = this.field2495[var1][var2].method4302();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class255 var5 = (class255) var4.next();
                    if (var5.method4489()) {
                        int var6 = var5.method4123();
                        if (this.field2494.containsKey(var6)) {
                            List var8 = (List) this.field2494.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2494.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jf.av(III)F")
    public float method4367(int arg0, int arg1) {
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
