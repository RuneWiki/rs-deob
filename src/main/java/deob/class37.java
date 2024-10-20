package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ar")
public final class class37 {

    @ObfuscatedName("ar.f")
    public boolean field309 = false;

    @ObfuscatedName("ar.i")
    public boolean field319 = false;

    @ObfuscatedName("ar.y")
    public class39 field299;

    @ObfuscatedName("ar.w")
    public class325 field300;

    @ObfuscatedName("ar.p")
    public HashMap field301;

    @ObfuscatedName("ar.b")
    public class30[][] field307;

    @ObfuscatedName("ar.e")
    public HashMap field298 = new HashMap();

    @ObfuscatedName("ar.x")
    public class324[] field304;

    @ObfuscatedName("ar.a")
    public final class234 field297;

    @ObfuscatedName("ar.d")
    public final class234 field302;

    @ObfuscatedName("ar.c")
    public final HashMap field316;

    @ObfuscatedName("ar.o")
    public int field308;

    @ObfuscatedName("ar.v")
    public int field305;

    @ObfuscatedName("ar.k")
    public int field310;

    @ObfuscatedName("ar.s")
    public int field311;

    @ObfuscatedName("ar.l")
    public int field312 = 0;

    public class37(class324[] arg0, HashMap arg1, class234 arg2, class234 arg3) {
        this.field304 = arg0;
        this.field316 = arg1;
        this.field297 = arg2;
        this.field302 = arg3;
    }

    @ObfuscatedName("ar.f(Lhz;Ljava/lang/String;ZI)V")
    public void method524(class234 arg0, String arg1, boolean arg2) {
        if (this.field319) {
            return;
        }
        this.field309 = false;
        this.field319 = true;
        System.nanoTime();
        int var4 = arg0.method3847(class36.field292.field286);
        int var5 = arg0.method3846(var4, arg1);
        class300 var6 = new class300(arg0.method3773(class36.field292.field286, arg1));
        class300 var7 = new class300(arg0.method3773(class36.field287.field286, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field299 = new class39();
        try {
            this.field299.method569(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field299.method283();
        this.field299.method284();
        this.field299.method285();
        this.field308 = this.field299.method339() * 64;
        this.field305 = this.field299.method281() * 64;
        this.field310 = (this.field299.method280() - this.field299.method339() + 1) * 64;
        this.field311 = (this.field299.method282() - this.field299.method281() + 1) * 64;
        int var9 = this.field299.method280() - this.field299.method339() + 1;
        int var10 = this.field299.method282() - this.field299.method281() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.field234.method3123();
        this.field307 = new class30[var9][var10];
        Iterator var11 = this.field299.field322.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field156;
            int var14 = var12.field144;
            int var15 = var13 - this.field299.method339();
            int var16 = var14 - this.field299.method281();
            this.field307[var15][var16] = new class30(var13, var14, this.field299.method277(), this.field316);
            this.field307[var15][var16].method355(var12, this.field299.field324);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field307[var17][var18] == null) {
                    this.field307[var17][var18] = new class30(this.field299.method339() + var17, this.field299.method281() + var18, this.field299.method277(), this.field316);
                    this.field307[var17][var18].method356(this.field299.field325, this.field299.field324);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3772(class36.field288.field286, arg1)) {
            byte[] var19 = arg0.method3773(class36.field288.field286, arg1);
            this.field300 = class49.method74(var19);
        }
        System.nanoTime();
        arg0.method3766();
        arg0.method3823();
        this.field309 = true;
    }

    @ObfuscatedName("ar.i(B)V")
    public final void method560() {
        this.field301 = null;
    }

    @ObfuscatedName("ar.y(IIIIIIIIB)V")
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3843;
        int var10 = Statics.field3841;
        int var11 = Statics.field3842;
        int[] var12 = new int[4];
        class321.method5593(var12);
        class23 var13 = this.method530(arg0, arg1, arg2, arg3);
        float var14 = this.method546(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field312 = var15;
        if (!this.field298.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method608();
            this.field298.put(var15, var16);
        }
        int var17 = var13.field167 + var13.field160 - 1;
        int var18 = var13.field163 + var13.field162 - 1;
        for (int var19 = var13.field167; var19 <= var17; var19++) {
            for (int var20 = var13.field163; var20 <= var18; var20++) {
                this.field307[var19][var20].method458(var15, (class41) this.field298.get(var15), this.field304, this.field297, this.field302);
            }
        }
        class321.method5539(var9, var10, var11);
        class321.method5544(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field308 + arg0;
        int var23 = this.field305 + arg1;
        for (int var24 = var13.field167; var24 < var13.field167 + var13.field160; var24++) {
            for (int var25 = var13.field163; var25 < var13.field163 + var13.field162; var25++) {
                this.field307[var24][var25].method354((this.field307[var24][var25].field235 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field307[var24][var25].field236 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ar.w(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method530(arg0, arg1, arg2, arg3);
        float var15 = this.method546(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field308 + arg0;
        int var18 = this.field305 + arg1;
        for (int var19 = var14.field167; var19 < var14.field167 + var14.field160; var19++) {
            for (int var20 = var14.field163; var20 < var14.field163 + var14.field162; var20++) {
                if (arg12) {
                    this.field307[var19][var20].method359();
                }
                this.field307[var19][var20].method364((this.field307[var19][var20].field235 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field307[var19][var20].field236 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field167; var21 < var14.field167 + var14.field160; var21++) {
            for (int var22 = var14.field163; var22 < var14.field163 + var14.field162; var22++) {
                this.field307[var21][var22].method419(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ar.p(IIIILjava/util/HashSet;IIS)V")
    public void method528(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field300 == null) {
            return;
        }
        this.field300.method5653(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field301 == null) {
            this.method533();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field301.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field277.field2516 - this.field308) * arg2 / this.field310;
                int var14 = arg3 - (var12.field277.field2518 - this.field305) * arg3 / this.field311;
                class321.method5550(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ar.b(IIIIIIIIIIB)Ljava/util/List;")
    public List method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field309) {
            return var11;
        }
        class23 var12 = this.method530(arg0, arg1, arg2, arg3);
        float var13 = this.method546(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field308 + arg0;
        int var16 = this.field305 + arg1;
        for (int var17 = var12.field167; var17 < var12.field167 + var12.field160; var17++) {
            for (int var18 = var12.field163; var18 < var12.field163 + var12.field162; var18++) {
                List var19 = this.field307[var17][var18].method435((this.field307[var17][var18].field235 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field307[var17][var18].field236 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ar.e(IIIII)Lm;")
    public class23 method530(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field308 + arg0;
        int var7 = this.field305 + arg1;
        int var8 = this.field308 + arg2;
        int var9 = this.field305 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field160 = var12 - var10 + 1;
        var5.field162 = var13 - var11 + 1;
        var5.field167 = var10 - this.field299.method339();
        var5.field163 = var11 - this.field299.method281();
        if (var5.field167 < 0) {
            var5.field160 += var5.field167;
            var5.field167 = 0;
        }
        if (var5.field167 > this.field307.length - var5.field160) {
            var5.field160 = this.field307.length - var5.field167;
        }
        if (var5.field163 < 0) {
            var5.field162 += var5.field163;
            var5.field163 = 0;
        }
        if (var5.field163 > this.field307[0].length - var5.field162) {
            var5.field162 = this.field307[0].length - var5.field163;
        }
        var5.field160 = Math.min(var5.field160, this.field307.length);
        var5.field162 = Math.min(var5.field162, this.field307[0].length);
        return var5;
    }

    @ObfuscatedName("ar.x(B)Z")
    public boolean method531() {
        return this.field309;
    }

    @ObfuscatedName("ar.a(I)Ljava/util/HashMap;")
    public HashMap method538() {
        this.method533();
        return this.field301;
    }

    @ObfuscatedName("ar.d(I)V")
    public void method533() {
        if (this.field301 == null) {
            this.field301 = new HashMap();
        }
        this.field301.clear();
        for (int var1 = 0; var1 < this.field307.length; var1++) {
            for (int var2 = 0; var2 < this.field307[var1].length; var2++) {
                List var3 = this.field307[var1][var2].method452();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method503()) {
                        int var6 = var5.method183();
                        if (this.field301.containsKey(var6)) {
                            List var8 = (List) this.field301.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field301.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.c(III)F")
    public float method546(int arg0, int arg1) {
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
