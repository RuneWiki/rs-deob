package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ai")
public final class class46 {

    @ObfuscatedName("ai.z")
    public boolean field336 = false;

    @ObfuscatedName("ai.k")
    public boolean field331 = false;

    @ObfuscatedName("ai.s")
    public class48 field339;

    @ObfuscatedName("ai.t")
    public class335 field333;

    @ObfuscatedName("ai.i")
    public HashMap field334;

    @ObfuscatedName("ai.o")
    public class39[][] field335;

    @ObfuscatedName("ai.x")
    public HashMap field344 = new HashMap();

    @ObfuscatedName("ai.w")
    public class334[] field337;

    @ObfuscatedName("ai.g")
    public final class244 field349;

    @ObfuscatedName("ai.m")
    public final class244 field332;

    @ObfuscatedName("ai.n")
    public final HashMap field340;

    @ObfuscatedName("ai.d")
    public int field341;

    @ObfuscatedName("ai.h")
    public int field342;

    @ObfuscatedName("ai.a")
    public int field343;

    @ObfuscatedName("ai.q")
    public int field338;

    @ObfuscatedName("ai.c")
    public int field345 = 0;

    public class46(class334[] arg0, HashMap arg1, class244 arg2, class244 arg3) {
        this.field337 = arg0;
        this.field340 = arg1;
        this.field349 = arg2;
        this.field332 = arg3;
    }

    @ObfuscatedName("ai.z(Lic;Ljava/lang/String;ZI)V")
    public void method579(class244 arg0, String arg1, boolean arg2) {
        if (this.field331) {
            return;
        }
        this.field336 = false;
        this.field331 = true;
        System.nanoTime();
        int var4 = arg0.method3909(class45.field323.field325);
        int var5 = arg0.method3927(var4, arg1);
        class310 var6 = new class310(arg0.method3893(class45.field323.field325, arg1));
        class310 var7 = new class310(arg0.method3893(class45.field319.field325, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field339 = new class48();
        try {
            this.field339.method623(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field339.method406();
        this.field339.method352();
        this.field339.method410();
        this.field341 = this.field339.method380() * 64;
        this.field342 = this.field339.method349() * 64;
        this.field343 = (this.field339.method340() - this.field339.method380() + 1) * 64;
        this.field338 = (this.field339.method350() - this.field339.method349() + 1) * 64;
        int var9 = this.field339.method340() - this.field339.method380() + 1;
        int var10 = this.field339.method350() - this.field339.method349() + 1;
        System.nanoTime();
        System.nanoTime();
        class39.method322();
        this.field335 = new class39[var9][var10];
        Iterator var11 = this.field339.field357.iterator();
        while (var11.hasNext()) {
            class25 var12 = (class25) var11.next();
            int var13 = var12.field198;
            int var14 = var12.field181;
            int var15 = var13 - this.field339.method380();
            int var16 = var14 - this.field339.method349();
            this.field335[var15][var16] = new class39(var13, var14, this.field339.method351(), this.field340);
            this.field335[var15][var16].method427(var12, this.field339.field352);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field335[var17][var18] == null) {
                    this.field335[var17][var18] = new class39(this.field339.method380() + var17, this.field339.method349() + var18, this.field339.method351(), this.field340);
                    this.field335[var17][var18].method478(this.field339.field351, this.field339.field352);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3892(class45.field328.field325, arg1)) {
            byte[] var19 = arg0.method3893(class45.field328.field325, arg1);
            this.field333 = class59.method982(var19);
        }
        System.nanoTime();
        arg0.method3943();
        arg0.method3888();
        this.field336 = true;
    }

    @ObfuscatedName("ai.k(I)V")
    public final void method580() {
        this.field334 = null;
    }

    @ObfuscatedName("ai.s(IIIIIIIIB)V")
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3882;
        int var10 = Statics.field3879;
        int var11 = Statics.field3880;
        int[] var12 = new int[4];
        class331.method5685(var12);
        class32 var13 = this.method585(arg0, arg1, arg2, arg3);
        float var14 = this.method609(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field345 = var15;
        if (!this.field344.containsKey(var15)) {
            class50 var16 = new class50(var15);
            var16.method663();
            this.field344.put(var15, var16);
        }
        int var17 = var13.field206 + var13.field205 - 1;
        int var18 = var13.field203 + var13.field201 - 1;
        for (int var19 = var13.field205; var19 <= var17; var19++) {
            for (int var20 = var13.field203; var20 <= var18; var20++) {
                this.field335[var19][var20].method435(var15, (class50) this.field344.get(var15), this.field337, this.field349, this.field332);
            }
        }
        class331.method5651(var9, var10, var11);
        class331.method5656(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field341 + arg0;
        int var23 = this.field342 + arg1;
        for (int var24 = var13.field205; var24 < var13.field206 + var13.field205; var24++) {
            for (int var25 = var13.field203; var25 < var13.field203 + var13.field201; var25++) {
                this.field335[var24][var25].method431((this.field335[var24][var25].field269 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field335[var24][var25].field270 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ai.t(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class32 var14 = this.method585(arg0, arg1, arg2, arg3);
        float var15 = this.method609(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field341 + arg0;
        int var18 = this.field342 + arg1;
        for (int var19 = var14.field205; var19 < var14.field206 + var14.field205; var19++) {
            for (int var20 = var14.field203; var20 < var14.field203 + var14.field201; var20++) {
                if (arg12) {
                    this.field335[var19][var20].method489();
                }
                this.field335[var19][var20].method495((this.field335[var19][var20].field269 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field335[var19][var20].field270 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field205; var21 < var14.field206 + var14.field205; var21++) {
            for (int var22 = var14.field203; var22 < var14.field203 + var14.field201; var22++) {
                this.field335[var21][var22].method494(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ai.i(IIIILjava/util/HashSet;III)V")
    public void method583(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field333 == null) {
            return;
        }
        this.field333.method5767(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field334 == null) {
            this.method588();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field334.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class44 var12 = (class44) var11.next();
                int var13 = (var12.field314.field2563 - this.field341) * arg2 / this.field343;
                int var14 = arg3 - (var12.field314.field2565 - this.field342) * arg3 / this.field338;
                class331.method5659(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ai.o(IIIIIIIIIIB)Ljava/util/List;")
    public List method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field336) {
            return var11;
        }
        class32 var12 = this.method585(arg0, arg1, arg2, arg3);
        float var13 = this.method609(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field341 + arg0;
        int var16 = this.field342 + arg1;
        for (int var17 = var12.field205; var17 < var12.field206 + var12.field205; var17++) {
            for (int var18 = var12.field203; var18 < var12.field203 + var12.field201; var18++) {
                List var19 = this.field335[var17][var18].method457((this.field335[var17][var18].field269 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field335[var17][var18].field270 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ai.x(IIIII)Lam;")
    public class32 method585(int arg0, int arg1, int arg2, int arg3) {
        class32 var5 = new class32(this);
        int var6 = this.field341 + arg0;
        int var7 = this.field342 + arg1;
        int var8 = this.field341 + arg2;
        int var9 = this.field342 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field206 = var12 - var10 + 1;
        var5.field201 = var13 - var11 + 1;
        var5.field205 = var10 - this.field339.method380();
        var5.field203 = var11 - this.field339.method349();
        if (var5.field205 < 0) {
            var5.field206 += var5.field205;
            var5.field205 = 0;
        }
        if (var5.field205 > this.field335.length - var5.field206) {
            var5.field206 = this.field335.length - var5.field205;
        }
        if (var5.field203 < 0) {
            var5.field201 += var5.field203;
            var5.field203 = 0;
        }
        if (var5.field203 > this.field335[0].length - var5.field201) {
            var5.field201 = this.field335[0].length - var5.field203;
        }
        var5.field206 = Math.min(var5.field206, this.field335.length);
        var5.field201 = Math.min(var5.field201, this.field335[0].length);
        return var5;
    }

    @ObfuscatedName("ai.w(B)Z")
    public boolean method613() {
        return this.field336;
    }

    @ObfuscatedName("ai.g(I)Ljava/util/HashMap;")
    public HashMap method587() {
        this.method588();
        return this.field334;
    }

    @ObfuscatedName("ai.m(I)V")
    public void method588() {
        if (this.field334 == null) {
            this.field334 = new HashMap();
        }
        this.field334.clear();
        for (int var1 = 0; var1 < this.field335.length; var1++) {
            for (int var2 = 0; var2 < this.field335[var1].length; var2++) {
                List var3 = this.field335[var1][var2].method458();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class44 var5 = (class44) var4.next();
                    if (var5.method561()) {
                        int var6 = var5.method250();
                        if (this.field334.containsKey(var6)) {
                            List var8 = (List) this.field334.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field334.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.n(III)F")
    public float method609(int arg0, int arg1) {
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
