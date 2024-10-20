package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aa")
public final class class46 {

    @ObfuscatedName("aa.m")
    public boolean field333 = false;

    @ObfuscatedName("aa.o")
    public boolean field340 = false;

    @ObfuscatedName("aa.q")
    public class48 field342;

    @ObfuscatedName("aa.j")
    public class335 field335;

    @ObfuscatedName("aa.p")
    public HashMap field336;

    @ObfuscatedName("aa.g")
    public class39[][] field337;

    @ObfuscatedName("aa.n")
    public HashMap field334 = new HashMap();

    @ObfuscatedName("aa.u")
    public class334[] field345;

    @ObfuscatedName("aa.a")
    public final class244 field332;

    @ObfuscatedName("aa.z")
    public final class244 field341;

    @ObfuscatedName("aa.w")
    public final HashMap field344;

    @ObfuscatedName("aa.y")
    public int field343;

    @ObfuscatedName("aa.c")
    public int field339;

    @ObfuscatedName("aa.h")
    public int field338;

    @ObfuscatedName("aa.k")
    public int field346;

    @ObfuscatedName("aa.r")
    public int field347 = 0;

    public class46(class334[] arg0, HashMap arg1, class244 arg2, class244 arg3) {
        this.field345 = arg0;
        this.field344 = arg1;
        this.field332 = arg2;
        this.field341 = arg3;
    }

    @ObfuscatedName("aa.m(Lic;Ljava/lang/String;ZI)V")
    public void method609(class244 arg0, String arg1, boolean arg2) {
        if (this.field340) {
            return;
        }
        this.field333 = false;
        this.field340 = true;
        System.nanoTime();
        int var4 = arg0.method3909(class45.field323.field328);
        int var5 = arg0.method3910(var4, arg1);
        class310 var6 = new class310(arg0.method3951(class45.field323.field328, arg1));
        class310 var7 = new class310(arg0.method3951(class45.field326.field328, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field342 = new class48();
        try {
            this.field342.method612(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field342.method344();
        this.field342.method345();
        this.field342.method346();
        this.field343 = this.field342.method340() * 64;
        this.field339 = this.field342.method357() * 64;
        this.field338 = (this.field342.method376() - this.field342.method340() + 1) * 64;
        this.field346 = (this.field342.method343() - this.field342.method357() + 1) * 64;
        int var9 = this.field342.method376() - this.field342.method340() + 1;
        int var10 = this.field342.method343() - this.field342.method357() + 1;
        System.nanoTime();
        System.nanoTime();
        class39.field289.method3157();
        this.field337 = new class39[var9][var10];
        Iterator var11 = this.field342.field354.iterator();
        while (var11.hasNext()) {
            class25 var12 = (class25) var11.next();
            int var13 = var12.field178;
            int var14 = var12.field182;
            int var15 = var13 - this.field342.method340();
            int var16 = var14 - this.field342.method357();
            this.field337[var15][var16] = new class39(var13, var14, this.field342.method338(), this.field344);
            this.field337[var15][var16].method414(var12, this.field342.field353);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field337[var17][var18] == null) {
                    this.field337[var17][var18] = new class39(this.field342.method340() + var17, this.field342.method357() + var18, this.field342.method338(), this.field344);
                    this.field337[var17][var18].method415(this.field342.field351, this.field342.field353);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3981(class45.field325.field328, arg1)) {
            byte[] var19 = arg0.method3951(class45.field325.field328, arg1);
            this.field335 = class59.method4183(var19);
        }
        System.nanoTime();
        arg0.method3905();
        arg0.method3907();
        this.field333 = true;
    }

    @ObfuscatedName("aa.o(I)V")
    public final void method575() {
        this.field336 = null;
    }

    @ObfuscatedName("aa.q(IIIIIIIII)V")
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3870;
        int var10 = Statics.field3871;
        int var11 = Statics.field3872;
        int[] var12 = new int[4];
        class331.method5680(var12);
        class32 var13 = this.method594(arg0, arg1, arg2, arg3);
        float var14 = this.method583(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field347 = var15;
        if (!this.field334.containsKey(var15)) {
            class50 var16 = new class50(var15);
            var16.method652();
            this.field334.put(var15, var16);
        }
        int var17 = var13.field202 + var13.field195 - 1;
        int var18 = var13.field196 + var13.field194 - 1;
        for (int var19 = var13.field195; var19 <= var17; var19++) {
            for (int var20 = var13.field196; var20 <= var18; var20++) {
                this.field337[var19][var20].method422(var15, (class50) this.field334.get(var15), this.field345, this.field332, this.field341);
            }
        }
        class331.method5678(var9, var10, var11);
        class331.method5681(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field343 + arg0;
        int var23 = this.field339 + arg1;
        for (int var24 = var13.field195; var24 < var13.field202 + var13.field195; var24++) {
            for (int var25 = var13.field196; var25 < var13.field196 + var13.field194; var25++) {
                this.field337[var24][var25].method413((this.field337[var24][var25].field283 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field337[var24][var25].field278 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("aa.j(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class32 var14 = this.method594(arg0, arg1, arg2, arg3);
        float var15 = this.method583(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field343 + arg0;
        int var18 = this.field339 + arg1;
        for (int var19 = var14.field195; var19 < var14.field202 + var14.field195; var19++) {
            for (int var20 = var14.field196; var20 < var14.field196 + var14.field194; var20++) {
                if (arg12) {
                    this.field337[var19][var20].method418();
                }
                this.field337[var19][var20].method437((this.field337[var19][var20].field283 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field337[var19][var20].field278 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field195; var21 < var14.field202 + var14.field195; var21++) {
            for (int var22 = var14.field196; var22 < var14.field196 + var14.field194; var22++) {
                this.field337[var21][var22].method518(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("aa.p(IIIILjava/util/HashSet;IIB)V")
    public void method577(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field335 == null) {
            return;
        }
        this.field335.method5803(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field336 == null) {
            this.method573();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field336.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class44 var12 = (class44) var11.next();
                int var13 = (var12.field321.field2566 - this.field343) * arg2 / this.field338;
                int var14 = arg3 - (var12.field321.field2565 - this.field339) * arg3 / this.field346;
                class331.method5684(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("aa.g(IIIIIIIIIIB)Ljava/util/List;")
    public List method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field333) {
            return var11;
        }
        class32 var12 = this.method594(arg0, arg1, arg2, arg3);
        float var13 = this.method583(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field343 + arg0;
        int var16 = this.field339 + arg1;
        for (int var17 = var12.field195; var17 < var12.field202 + var12.field195; var17++) {
            for (int var18 = var12.field196; var18 < var12.field196 + var12.field194; var18++) {
                List var19 = this.field337[var17][var18].method467((this.field337[var17][var18].field283 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field337[var17][var18].field278 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("aa.n(IIIII)Lag;")
    public class32 method594(int arg0, int arg1, int arg2, int arg3) {
        class32 var5 = new class32(this);
        int var6 = this.field343 + arg0;
        int var7 = this.field339 + arg1;
        int var8 = this.field343 + arg2;
        int var9 = this.field339 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field202 = var12 - var10 + 1;
        var5.field194 = var13 - var11 + 1;
        var5.field195 = var10 - this.field342.method340();
        var5.field196 = var11 - this.field342.method357();
        if (var5.field195 < 0) {
            var5.field202 += var5.field195;
            var5.field195 = 0;
        }
        if (var5.field195 > this.field337.length - var5.field202) {
            var5.field202 = this.field337.length - var5.field195;
        }
        if (var5.field196 < 0) {
            var5.field194 += var5.field196;
            var5.field196 = 0;
        }
        if (var5.field196 > this.field337[0].length - var5.field194) {
            var5.field194 = this.field337[0].length - var5.field196;
        }
        var5.field202 = Math.min(var5.field202, this.field337.length);
        var5.field194 = Math.min(var5.field194, this.field337[0].length);
        return var5;
    }

    @ObfuscatedName("aa.u(B)Z")
    public boolean method580() {
        return this.field333;
    }

    @ObfuscatedName("aa.a(I)Ljava/util/HashMap;")
    public HashMap method581() {
        this.method573();
        return this.field336;
    }

    @ObfuscatedName("aa.z(B)V")
    public void method573() {
        if (this.field336 == null) {
            this.field336 = new HashMap();
        }
        this.field336.clear();
        for (int var1 = 0; var1 < this.field337.length; var1++) {
            for (int var2 = 0; var2 < this.field337[var1].length; var2++) {
                List var3 = this.field337[var1][var2].method444();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class44 var5 = (class44) var4.next();
                    if (var5.method559()) {
                        int var6 = var5.method224();
                        if (this.field336.containsKey(var6)) {
                            List var8 = (List) this.field336.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field336.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.w(IIB)F")
    public float method583(int arg0, int arg1) {
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
