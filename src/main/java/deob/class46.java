package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ai")
public final class class46 {

    @ObfuscatedName("ai.n")
    public boolean field345 = false;

    @ObfuscatedName("ai.v")
    public boolean field338 = false;

    @ObfuscatedName("ai.d")
    public class48 field337;

    @ObfuscatedName("ai.c")
    public class336 field340;

    @ObfuscatedName("ai.y")
    public HashMap field341;

    @ObfuscatedName("ai.h")
    public class39[][] field342;

    @ObfuscatedName("ai.z")
    public HashMap field343 = new HashMap();

    @ObfuscatedName("ai.e")
    public class335[] field352;

    @ObfuscatedName("ai.q")
    public final class245 field350;

    @ObfuscatedName("ai.l")
    public final class245 field347;

    @ObfuscatedName("ai.s")
    public final HashMap field344;

    @ObfuscatedName("ai.b")
    public int field348;

    @ObfuscatedName("ai.a")
    public int field356;

    @ObfuscatedName("ai.w")
    public int field349;

    @ObfuscatedName("ai.k")
    public int field351;

    @ObfuscatedName("ai.i")
    public int field357 = 0;

    public class46(class335[] arg0, HashMap arg1, class245 arg2, class245 arg3) {
        this.field352 = arg0;
        this.field344 = arg1;
        this.field350 = arg2;
        this.field347 = arg3;
    }

    @ObfuscatedName("ai.n(Lig;Ljava/lang/String;ZI)V")
    public void method622(class245 arg0, String arg1, boolean arg2) {
        if (this.field338) {
            return;
        }
        this.field345 = false;
        this.field338 = true;
        System.nanoTime();
        int var4 = arg0.method4001(class45.field334.field335);
        int var5 = arg0.method4002(var4, arg1);
        class311 var6 = new class311(arg0.method3980(class45.field334.field335, arg1));
        class311 var7 = new class311(arg0.method3980(class45.field324.field335, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field337 = new class48();
        try {
            this.field337.method662(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field337.method363();
        this.field337.method370();
        this.field337.method365();
        this.field348 = this.field337.method359() * 64;
        this.field356 = this.field337.method409() * 64;
        this.field349 = (this.field337.method360() - this.field337.method359() + 1) * 64;
        this.field351 = (this.field337.method362() - this.field337.method409() + 1) * 64;
        int var9 = this.field337.method360() - this.field337.method359() + 1;
        int var10 = this.field337.method362() - this.field337.method409() + 1;
        System.nanoTime();
        System.nanoTime();
        class39.method2194();
        this.field342 = new class39[var9][var10];
        Iterator var11 = this.field337.field362.iterator();
        while (var11.hasNext()) {
            class25 var12 = (class25) var11.next();
            int var13 = var12.field196;
            int var14 = var12.field207;
            int var15 = var13 - this.field337.method359();
            int var16 = var14 - this.field337.method409();
            this.field342[var15][var16] = new class39(var13, var14, this.field337.method351(), this.field344);
            this.field342[var15][var16].method444(var12, this.field337.field364);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field342[var17][var18] == null) {
                    this.field342[var17][var18] = new class39(this.field337.method359() + var17, this.field337.method409() + var18, this.field337.method351(), this.field344);
                    this.field342[var17][var18].method459(this.field337.field361, this.field337.field364);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4003(class45.field325.field335, arg1)) {
            byte[] var19 = arg0.method3980(class45.field325.field335, arg1);
            this.field340 = class59.method326(var19);
        }
        System.nanoTime();
        arg0.method4064();
        arg0.method4070();
        this.field345 = true;
    }

    @ObfuscatedName("ai.v(I)V")
    public final void method623() {
        this.field341 = null;
    }

    @ObfuscatedName("ai.d(IIIIIIIII)V")
    public final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3885;
        int var10 = Statics.field3886;
        int var11 = Statics.field3887;
        int[] var12 = new int[4];
        class332.method5762(var12);
        class32 var13 = this.method628(arg0, arg1, arg2, arg3);
        float var14 = this.method632(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field357 = var15;
        if (!this.field343.containsKey(var15)) {
            class50 var16 = new class50(var15);
            var16.method710();
            this.field343.put(var15, var16);
        }
        int var17 = var13.field212 + var13.field211 - 1;
        int var18 = var13.field214 + var13.field210 - 1;
        for (int var19 = var13.field211; var19 <= var17; var19++) {
            for (int var20 = var13.field214; var20 <= var18; var20++) {
                this.field342[var19][var20].method452(var15, (class50) this.field343.get(var15), this.field352, this.field350, this.field347);
            }
        }
        class332.method5727(var9, var10, var11);
        class332.method5732(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field348 + arg0;
        int var23 = this.field356 + arg1;
        for (int var24 = var13.field211; var24 < var13.field212 + var13.field211; var24++) {
            for (int var25 = var13.field214; var25 < var13.field214 + var13.field210; var25++) {
                this.field342[var24][var25].method443((this.field342[var24][var25].field274 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field342[var24][var25].field275 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ai.c(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class32 var14 = this.method628(arg0, arg1, arg2, arg3);
        float var15 = this.method632(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field348 + arg0;
        int var18 = this.field356 + arg1;
        for (int var19 = var14.field211; var19 < var14.field212 + var14.field211; var19++) {
            for (int var20 = var14.field214; var20 < var14.field214 + var14.field210; var20++) {
                if (arg12) {
                    this.field342[var19][var20].method448();
                }
                this.field342[var19][var20].method453((this.field342[var19][var20].field274 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field342[var19][var20].field275 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field211; var21 < var14.field212 + var14.field211; var21++) {
            for (int var22 = var14.field214; var22 < var14.field214 + var14.field210; var22++) {
                this.field342[var21][var22].method454(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ai.y(IIIILjava/util/HashSet;III)V")
    public void method639(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field340 == null) {
            return;
        }
        this.field340.method5848(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field341 == null) {
            this.method631();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field341.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class44 var12 = (class44) var11.next();
                int var13 = (var12.field319.field2560 - this.field348) * arg2 / this.field349;
                int var14 = arg3 - (var12.field319.field2558 - this.field356) * arg3 / this.field351;
                class332.method5776(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ai.h(IIIIIIIIIII)Ljava/util/List;")
    public List method627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field345) {
            return var11;
        }
        class32 var12 = this.method628(arg0, arg1, arg2, arg3);
        float var13 = this.method632(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field348 + arg0;
        int var16 = this.field356 + arg1;
        for (int var17 = var12.field211; var17 < var12.field212 + var12.field211; var17++) {
            for (int var18 = var12.field214; var18 < var12.field214 + var12.field210; var18++) {
                List var19 = this.field342[var17][var18].method474((this.field342[var17][var18].field274 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field342[var17][var18].field275 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ai.z(IIIII)Laq;")
    public class32 method628(int arg0, int arg1, int arg2, int arg3) {
        class32 var5 = new class32(this);
        int var6 = this.field348 + arg0;
        int var7 = this.field356 + arg1;
        int var8 = this.field348 + arg2;
        int var9 = this.field356 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field212 = var12 - var10 + 1;
        var5.field210 = var13 - var11 + 1;
        var5.field211 = var10 - this.field337.method359();
        var5.field214 = var11 - this.field337.method409();
        if (var5.field211 < 0) {
            var5.field212 += var5.field211;
            var5.field211 = 0;
        }
        if (var5.field211 > this.field342.length - var5.field212) {
            var5.field212 = this.field342.length - var5.field211;
        }
        if (var5.field214 < 0) {
            var5.field210 += var5.field214;
            var5.field214 = 0;
        }
        if (var5.field214 > this.field342[0].length - var5.field210) {
            var5.field210 = this.field342[0].length - var5.field214;
        }
        var5.field212 = Math.min(var5.field212, this.field342.length);
        var5.field210 = Math.min(var5.field210, this.field342[0].length);
        return var5;
    }

    @ObfuscatedName("ai.e(B)Z")
    public boolean method621() {
        return this.field345;
    }

    @ObfuscatedName("ai.q(B)Ljava/util/HashMap;")
    public HashMap method630() {
        this.method631();
        return this.field341;
    }

    @ObfuscatedName("ai.l(B)V")
    public void method631() {
        if (this.field341 == null) {
            this.field341 = new HashMap();
        }
        this.field341.clear();
        for (int var1 = 0; var1 < this.field342.length; var1++) {
            for (int var2 = 0; var2 < this.field342[var1].length; var2++) {
                List var3 = this.field342[var1][var2].method496();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class44 var5 = (class44) var4.next();
                    if (var5.method611()) {
                        int var6 = var5.method250();
                        if (this.field341.containsKey(var6)) {
                            List var8 = (List) this.field341.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field341.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.s(IIB)F")
    public float method632(int arg0, int arg1) {
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
