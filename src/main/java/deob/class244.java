package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("jn")
public final class class244 {

    @ObfuscatedName("jn.aq")
    public boolean field2557 = false;

    @ObfuscatedName("jn.aw")
    public boolean field2545 = false;

    @ObfuscatedName("jn.al")
    public class263 field2546;

    @ObfuscatedName("jn.ai")
    public class548 field2553;

    @ObfuscatedName("jn.ar")
    public HashMap field2548;

    @ObfuscatedName("jn.as")
    public class243[][] field2549;

    @ObfuscatedName("jn.aa")
    public HashMap field2544 = new HashMap();

    @ObfuscatedName("jn.az")
    public class547[] field2550;

    @ObfuscatedName("jn.ao")
    public final class378 field2552;

    @ObfuscatedName("jn.au")
    public final class378 field2551;

    @ObfuscatedName("jn.ak")
    public final HashMap field2554;

    @ObfuscatedName("jn.ah")
    public int field2555;

    @ObfuscatedName("jn.aj")
    public int field2556;

    @ObfuscatedName("jn.af")
    public int field2547;

    @ObfuscatedName("jn.ax")
    public int field2558;

    @ObfuscatedName("jn.an")
    public int field2559 = 0;

    public class244(class547[] arg0, HashMap arg1, class378 arg2, class378 arg3) {
        this.field2550 = arg0;
        this.field2554 = arg1;
        this.field2552 = arg2;
        this.field2551 = arg3;
    }

    @ObfuscatedName("jn.aq(Lof;Ljava/lang/String;ZI)V")
    public void method4486(class378 arg0, String arg1, boolean arg2) {
        if (this.field2545) {
            return;
        }
        this.field2557 = false;
        this.field2545 = true;
        System.nanoTime();
        int var4 = arg0.method6435(class261.field2681.field2680);
        int var5 = arg0.method6436(var4, arg1);
        class534 var6 = new class534(arg0.method6438(class261.field2681.field2680, arg1));
        class534 var7 = new class534(arg0.method6438(class261.field2679.field2680, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2546 = new class263();
        try {
            this.field2546.method4603(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2546.method4276();
        this.field2546.method4277();
        this.field2546.method4272();
        this.field2555 = this.field2546.method4288() * 64;
        this.field2556 = this.field2546.method4283() * 64;
        this.field2547 = (this.field2546.method4280() - this.field2546.method4288() + 1) * 64;
        this.field2558 = (this.field2546.method4275() - this.field2546.method4283() + 1) * 64;
        int var9 = this.field2546.method4280() - this.field2546.method4288() + 1;
        int var10 = this.field2546.method4275() - this.field2546.method4283() + 1;
        System.nanoTime();
        System.nanoTime();
        Statics.method4109();
        this.field2549 = new class243[var9][var10];
        Iterator var11 = this.field2546.field2692.iterator();
        while (var11.hasNext()) {
            class237 var12 = (class237) var11.next();
            int var13 = var12.field2616;
            int var14 = var12.field2632;
            int var15 = var13 - this.field2546.method4288();
            int var16 = var14 - this.field2546.method4283();
            this.field2549[var15][var16] = new class243(var13, var14, this.field2546.method4269(), this.field2554);
            this.field2549[var15][var16].method4331(var12, this.field2546.field2691);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2549[var17][var18] == null) {
                    this.field2549[var17][var18] = new class243(this.field2546.method4288() + var17, this.field2546.method4283() + var18, this.field2546.method4269(), this.field2554);
                    this.field2549[var17][var18].method4345(this.field2546.field2690, this.field2546.field2691);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6496(class261.field2682.field2680, arg1)) {
            byte[] var19 = arg0.method6438(class261.field2682.field2680, arg1);
            this.field2553 = class31.method3587(var19);
        }
        System.nanoTime();
        arg0.method6431();
        arg0.method6433();
        this.field2557 = true;
    }

    @ObfuscatedName("jn.aw(I)V")
    public final void method4464() {
        this.field2548 = null;
    }

    @ObfuscatedName("jn.al(IIIIIIIII)V")
    public final void method4446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5276;
        int var10 = Statics.field5271;
        int var11 = Statics.field5272;
        float[] var12 = Statics.field5270;
        int[] var13 = new int[4];
        class544.method8890(var13);
        class252 var14 = this.method4450(arg0, arg1, arg2, arg3);
        float var15 = this.method4455(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field2559 = var16;
        if (!this.field2544.containsKey(var16)) {
            class264 var17 = new class264(var16);
            var17.method4614();
            this.field2544.put(var16, var17);
        }
        int var18 = var14.field2635 + var14.field2634 - 1;
        int var19 = var14.field2638 + var14.field2636 - 1;
        for (int var20 = var14.field2635; var20 <= var18; var20++) {
            for (int var21 = var14.field2636; var21 <= var19; var21++) {
                this.field2549[var20][var21].method4408(var16, (class264) this.field2544.get(var16), this.field2550, this.field2552, this.field2551);
            }
        }
        class272.method4760(var9, var10, var11, var12);
        class544.method8895(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field2555 + arg0;
        int var24 = this.field2556 + arg1;
        for (int var25 = var14.field2635; var25 < var14.field2635 + var14.field2634; var25++) {
            for (int var26 = var14.field2636; var26 < var14.field2638 + var14.field2636; var26++) {
                this.field2549[var25][var26].method4330((this.field2549[var25][var26].field2539 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field2549[var25][var26].field2532 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("jn.ai(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class252 var14 = this.method4450(arg0, arg1, arg2, arg3);
        float var15 = this.method4455(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2555 + arg0;
        int var18 = this.field2556 + arg1;
        for (int var19 = var14.field2635; var19 < var14.field2635 + var14.field2634; var19++) {
            for (int var20 = var14.field2636; var20 < var14.field2638 + var14.field2636; var20++) {
                if (arg12) {
                    this.field2549[var19][var20].method4392();
                }
                this.field2549[var19][var20].method4442((this.field2549[var19][var20].field2539 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2549[var19][var20].field2532 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2635; var21 < var14.field2635 + var14.field2634; var21++) {
            for (int var22 = var14.field2636; var22 < var14.field2638 + var14.field2636; var22++) {
                this.field2549[var21][var22].method4440(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("jn.ar(IIIILjava/util/HashSet;IIB)V")
    public void method4448(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2553 == null) {
            return;
        }
        this.field2553.method9014(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2548 == null) {
            this.method4454();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2548.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class260 var12 = (class260) var11.next();
                int var13 = (var12.field2677.field3622 - this.field2555) * arg2 / this.field2547;
                int var14 = arg3 - (var12.field2677.field3624 - this.field2556) * arg3 / this.field2558;
                class544.method8898(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("jn.as(IIIIIIIIIII)Ljava/util/List;")
    public List method4449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2557) {
            return var11;
        }
        class252 var12 = this.method4450(arg0, arg1, arg2, arg3);
        float var13 = this.method4455(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2555 + arg0;
        int var16 = this.field2556 + arg1;
        for (int var17 = var12.field2635; var17 < var12.field2635 + var12.field2634; var17++) {
            for (int var18 = var12.field2636; var18 < var12.field2638 + var12.field2636; var18++) {
                List var19 = this.field2549[var17][var18].method4359((this.field2549[var17][var18].field2539 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2549[var17][var18].field2532 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("jn.aa(IIIII)Ljb;")
    public class252 method4450(int arg0, int arg1, int arg2, int arg3) {
        class252 var5 = new class252(this);
        int var6 = this.field2555 + arg0;
        int var7 = this.field2556 + arg1;
        int var8 = this.field2555 + arg2;
        int var9 = this.field2556 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2634 = var12 - var10 + 1;
        var5.field2638 = var13 - var11 + 1;
        var5.field2635 = var10 - this.field2546.method4288();
        var5.field2636 = var11 - this.field2546.method4283();
        if (var5.field2635 < 0) {
            var5.field2634 += var5.field2635;
            var5.field2635 = 0;
        }
        if (var5.field2635 > this.field2549.length - var5.field2634) {
            var5.field2634 = this.field2549.length - var5.field2635;
        }
        if (var5.field2636 < 0) {
            var5.field2638 += var5.field2636;
            var5.field2636 = 0;
        }
        if (var5.field2636 > this.field2549[0].length - var5.field2638) {
            var5.field2638 = this.field2549[0].length - var5.field2636;
        }
        var5.field2634 = Math.min(var5.field2634, this.field2549.length);
        var5.field2638 = Math.min(var5.field2638, this.field2549[0].length);
        return var5;
    }

    @ObfuscatedName("jn.az(I)Z")
    public boolean method4443() {
        return this.field2557;
    }

    @ObfuscatedName("jn.ao(I)I")
    public int method4452() {
        return this.field2546.method4296();
    }

    @ObfuscatedName("jn.au(I)Ljava/util/HashMap;")
    public HashMap method4453() {
        this.method4454();
        return this.field2548;
    }

    @ObfuscatedName("jn.ak(I)V")
    public void method4454() {
        if (this.field2548 == null) {
            this.field2548 = new HashMap();
        }
        this.field2548.clear();
        for (int var1 = 0; var1 < this.field2549.length; var1++) {
            for (int var2 = 0; var2 < this.field2549[var1].length; var2++) {
                List var3 = this.field2549[var1][var2].method4360();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class260 var5 = (class260) var4.next();
                    if (var5.method4591()) {
                        int var6 = var5.method4218();
                        if (this.field2548.containsKey(var6)) {
                            List var8 = (List) this.field2548.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2548.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jn.ah(III)F")
    public float method4455(int arg0, int arg1) {
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
