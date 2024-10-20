package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ai")
public final class class46 {

    @ObfuscatedName("ai.h")
    public boolean field343 = false;

    @ObfuscatedName("ai.v")
    public boolean field334 = false;

    @ObfuscatedName("ai.x")
    public class48 field344;

    @ObfuscatedName("ai.w")
    public class336 field336;

    @ObfuscatedName("ai.t")
    public HashMap field337;

    @ObfuscatedName("ai.j")
    public class39[][] field338;

    @ObfuscatedName("ai.n")
    public HashMap field339 = new HashMap();

    @ObfuscatedName("ai.p")
    public class335[] field345;

    @ObfuscatedName("ai.l")
    public final class245 field341;

    @ObfuscatedName("ai.z")
    public final class245 field333;

    @ObfuscatedName("ai.u")
    public final HashMap field342;

    @ObfuscatedName("ai.e")
    public int field335;

    @ObfuscatedName("ai.m")
    public int field347;

    @ObfuscatedName("ai.c")
    public int field346;

    @ObfuscatedName("ai.i")
    public int field352;

    @ObfuscatedName("ai.f")
    public int field348 = 0;

    public class46(class335[] arg0, HashMap arg1, class245 arg2, class245 arg3) {
        this.field345 = arg0;
        this.field342 = arg1;
        this.field341 = arg2;
        this.field333 = arg3;
    }

    @ObfuscatedName("ai.h(Lib;Ljava/lang/String;ZI)V")
    public void method606(class245 arg0, String arg1, boolean arg2) {
        if (this.field334) {
            return;
        }
        this.field343 = false;
        this.field334 = true;
        System.nanoTime();
        int var4 = arg0.method3880(class45.field329.field331);
        int var5 = arg0.method3909(var4, arg1);
        class311 var6 = new class311(arg0.method3855(class45.field329.field331, arg1));
        class311 var7 = new class311(arg0.method3855(class45.field327.field331, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field344 = new class48();
        try {
            this.field344.method632(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field344.method344();
        this.field344.method345();
        this.field344.method346();
        this.field335 = this.field344.method340() * 64;
        this.field347 = this.field344.method342() * 64;
        this.field346 = (this.field344.method367() - this.field344.method340() + 1) * 64;
        this.field352 = (this.field344.method388() - this.field344.method342() + 1) * 64;
        int var9 = this.field344.method367() - this.field344.method340() + 1;
        int var10 = this.field344.method388() - this.field344.method342() + 1;
        System.nanoTime();
        System.nanoTime();
        Statics.method179();
        this.field338 = new class39[var9][var10];
        Iterator var11 = this.field344.field356.iterator();
        while (var11.hasNext()) {
            class25 var12 = (class25) var11.next();
            int var13 = var12.field181;
            int var14 = var12.field189;
            int var15 = var13 - this.field344.method340();
            int var16 = var14 - this.field344.method342();
            this.field338[var15][var16] = new class39(var13, var14, this.field344.method392(), this.field342);
            this.field338[var15][var16].method414(var12, this.field344.field355);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field338[var17][var18] == null) {
                    this.field338[var17][var18] = new class39(this.field344.method340() + var17, this.field344.method342() + var18, this.field344.method392(), this.field342);
                    this.field338[var17][var18].method448(this.field344.field354, this.field344.field355);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3854(class45.field328.field331, arg1)) {
            byte[] var19 = arg0.method3855(class45.field328.field331, arg1);
            this.field336 = class59.method263(var19);
        }
        System.nanoTime();
        arg0.method3896();
        arg0.method3891();
        this.field343 = true;
    }

    @ObfuscatedName("ai.v(B)V")
    public final void method579() {
        this.field337 = null;
    }

    @ObfuscatedName("ai.x(IIIIIIIII)V")
    public final void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3887;
        int var10 = Statics.field3890;
        int var11 = Statics.field3886;
        int[] var12 = new int[4];
        class332.method5575(var12);
        class32 var13 = this.method590(arg0, arg1, arg2, arg3);
        float var14 = this.method580(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field348 = var15;
        if (!this.field339.containsKey(var15)) {
            class50 var16 = new class50(var15);
            var16.method687();
            this.field339.put(var15, var16);
        }
        int var17 = var13.field196 + var13.field195 - 1;
        int var18 = var13.field198 + var13.field197 - 1;
        for (int var19 = var13.field196; var19 <= var17; var19++) {
            for (int var20 = var13.field197; var20 <= var18; var20++) {
                this.field338[var19][var20].method422(var15, (class50) this.field339.get(var15), this.field345, this.field341, this.field333);
            }
        }
        class332.method5576(var9, var10, var11);
        class332.method5589(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field335 + arg0;
        int var23 = this.field347 + arg1;
        for (int var24 = var13.field196; var24 < var13.field196 + var13.field195; var24++) {
            for (int var25 = var13.field197; var25 < var13.field198 + var13.field197; var25++) {
                this.field338[var24][var25].method476((this.field338[var24][var25].field266 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field338[var24][var25].field267 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ai.w(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class32 var14 = this.method590(arg0, arg1, arg2, arg3);
        float var15 = this.method580(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field335 + arg0;
        int var18 = this.field347 + arg1;
        for (int var19 = var14.field196; var19 < var14.field196 + var14.field195; var19++) {
            for (int var20 = var14.field197; var20 < var14.field198 + var14.field197; var20++) {
                if (arg12) {
                    this.field338[var19][var20].method418();
                }
                this.field338[var19][var20].method423((this.field338[var19][var20].field266 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field338[var19][var20].field267 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field196; var21 < var14.field196 + var14.field195; var21++) {
            for (int var22 = var14.field197; var22 < var14.field198 + var14.field197; var22++) {
                this.field338[var21][var22].method428(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ai.t(IIIILjava/util/HashSet;IIB)V")
    public void method582(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field336 == null) {
            return;
        }
        this.field336.method5695(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field337 == null) {
            this.method620();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field337.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class44 var12 = (class44) var11.next();
                int var13 = (var12.field322.field2547 - this.field335) * arg2 / this.field346;
                int var14 = arg3 - (var12.field322.field2548 - this.field347) * arg3 / this.field352;
                class332.method5621(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ai.j(IIIIIIIIIII)Ljava/util/List;")
    public List method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field343) {
            return var11;
        }
        class32 var12 = this.method590(arg0, arg1, arg2, arg3);
        float var13 = this.method580(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field335 + arg0;
        int var16 = this.field347 + arg1;
        for (int var17 = var12.field196; var17 < var12.field196 + var12.field195; var17++) {
            for (int var18 = var12.field197; var18 < var12.field198 + var12.field197; var18++) {
                List var19 = this.field338[var17][var18].method443((this.field338[var17][var18].field266 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field338[var17][var18].field267 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ai.n(IIIII)Las;")
    public class32 method590(int arg0, int arg1, int arg2, int arg3) {
        class32 var5 = new class32(this);
        int var6 = this.field335 + arg0;
        int var7 = this.field347 + arg1;
        int var8 = this.field335 + arg2;
        int var9 = this.field347 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field195 = var12 - var10 + 1;
        var5.field198 = var13 - var11 + 1;
        var5.field196 = var10 - this.field344.method340();
        var5.field197 = var11 - this.field344.method342();
        if (var5.field196 < 0) {
            var5.field195 += var5.field196;
            var5.field196 = 0;
        }
        if (var5.field196 > this.field338.length - var5.field195) {
            var5.field195 = this.field338.length - var5.field196;
        }
        if (var5.field197 < 0) {
            var5.field198 += var5.field197;
            var5.field197 = 0;
        }
        if (var5.field197 > this.field338[0].length - var5.field198) {
            var5.field198 = this.field338[0].length - var5.field197;
        }
        var5.field195 = Math.min(var5.field195, this.field338.length);
        var5.field198 = Math.min(var5.field198, this.field338[0].length);
        return var5;
    }

    @ObfuscatedName("ai.p(I)Z")
    public boolean method585() {
        return this.field343;
    }

    @ObfuscatedName("ai.l(I)Ljava/util/HashMap;")
    public HashMap method586() {
        this.method620();
        return this.field337;
    }

    @ObfuscatedName("ai.z(I)V")
    public void method620() {
        if (this.field337 == null) {
            this.field337 = new HashMap();
        }
        this.field337.clear();
        for (int var1 = 0; var1 < this.field338.length; var1++) {
            for (int var2 = 0; var2 < this.field338[var1].length; var2++) {
                List var3 = this.field338[var1][var2].method444();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class44 var5 = (class44) var4.next();
                    if (var5.method559()) {
                        int var6 = var5.method244();
                        if (this.field337.containsKey(var6)) {
                            List var8 = (List) this.field337.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field337.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.u(III)F")
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
