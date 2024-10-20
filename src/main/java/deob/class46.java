package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("at")
public final class class46 {

    @ObfuscatedName("at.f")
    public boolean field344 = false;

    @ObfuscatedName("at.b")
    public boolean field331 = false;

    @ObfuscatedName("at.l")
    public class48 field332;

    @ObfuscatedName("at.m")
    public class336 field340;

    @ObfuscatedName("at.z")
    public HashMap field346;

    @ObfuscatedName("at.q")
    public class39[][] field335;

    @ObfuscatedName("at.k")
    public HashMap field348 = new HashMap();

    @ObfuscatedName("at.c")
    public class335[] field333;

    @ObfuscatedName("at.u")
    public final class245 field338;

    @ObfuscatedName("at.t")
    public final class245 field339;

    @ObfuscatedName("at.e")
    public final HashMap field334;

    @ObfuscatedName("at.o")
    public int field341;

    @ObfuscatedName("at.n")
    public int field342;

    @ObfuscatedName("at.x")
    public int field343;

    @ObfuscatedName("at.p")
    public int field345;

    @ObfuscatedName("at.r")
    public int field337 = 0;

    public class46(class335[] arg0, HashMap arg1, class245 arg2, class245 arg3) {
        this.field333 = arg0;
        this.field334 = arg1;
        this.field338 = arg2;
        this.field339 = arg3;
    }

    @ObfuscatedName("at.f(Liw;Ljava/lang/String;ZI)V")
    public void method634(class245 arg0, String arg1, boolean arg2) {
        if (this.field331) {
            return;
        }
        this.field344 = false;
        this.field331 = true;
        System.nanoTime();
        int var4 = arg0.method3923(class45.field321.field325);
        int var5 = arg0.method3924(var4, arg1);
        class311 var6 = new class311(arg0.method3938(class45.field321.field325, arg1));
        class311 var7 = new class311(arg0.method3938(class45.field320.field325, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field332 = new class48();
        try {
            this.field332.method656(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field332.method372();
        this.field332.method373();
        this.field332.method404();
        this.field341 = this.field332.method368() * 64;
        this.field342 = this.field332.method370() * 64;
        this.field343 = (this.field332.method416() - this.field332.method368() + 1) * 64;
        this.field345 = (this.field332.method371() - this.field332.method370() + 1) * 64;
        int var9 = this.field332.method416() - this.field332.method368() + 1;
        int var10 = this.field332.method371() - this.field332.method370() + 1;
        System.nanoTime();
        System.nanoTime();
        class39.method195();
        this.field335 = new class39[var9][var10];
        Iterator var11 = this.field332.field351.iterator();
        while (var11.hasNext()) {
            class25 var12 = (class25) var11.next();
            int var13 = var12.field194;
            int var14 = var12.field190;
            int var15 = var13 - this.field332.method368();
            int var16 = var14 - this.field332.method370();
            this.field335[var15][var16] = new class39(var13, var14, this.field332.method391(), this.field334);
            this.field335[var15][var16].method446(var12, this.field332.field350);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field335[var17][var18] == null) {
                    this.field335[var17][var18] = new class39(this.field332.method368() + var17, this.field332.method370() + var18, this.field332.method391(), this.field334);
                    this.field335[var17][var18].method447(this.field332.field352, this.field332.field350);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3929(class45.field322.field325, arg1)) {
            byte[] var19 = arg0.method3938(class45.field322.field325, arg1);
            this.field340 = class59.method586(var19);
        }
        System.nanoTime();
        arg0.method3919();
        arg0.method3935();
        this.field344 = true;
    }

    @ObfuscatedName("at.b(I)V")
    public final void method622() {
        this.field346 = null;
    }

    @ObfuscatedName("at.l(IIIIIIIII)V")
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3889;
        int var10 = Statics.field3884;
        int var11 = Statics.field3886;
        int[] var12 = new int[4];
        class332.method5646(var12);
        class32 var13 = this.method616(arg0, arg1, arg2, arg3);
        float var14 = this.method627(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field337 = var15;
        if (!this.field348.containsKey(var15)) {
            class50 var16 = new class50(var15);
            var16.method692();
            this.field348.put(var15, var16);
        }
        int var17 = var13.field207 + var13.field204 - 1;
        int var18 = var13.field206 + var13.field205 - 1;
        for (int var19 = var13.field204; var19 <= var17; var19++) {
            for (int var20 = var13.field206; var20 <= var18; var20++) {
                this.field335[var19][var20].method454(var15, (class50) this.field348.get(var15), this.field333, this.field338, this.field339);
            }
        }
        class332.method5649(var9, var10, var11);
        class332.method5647(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field341 + arg0;
        int var23 = this.field342 + arg1;
        for (int var24 = var13.field204; var24 < var13.field207 + var13.field204; var24++) {
            for (int var25 = var13.field206; var25 < var13.field206 + var13.field205; var25++) {
                this.field335[var24][var25].method445((this.field335[var24][var25].field272 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field335[var24][var25].field273 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("at.m(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class32 var14 = this.method616(arg0, arg1, arg2, arg3);
        float var15 = this.method627(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field341 + arg0;
        int var18 = this.field342 + arg1;
        for (int var19 = var14.field204; var19 < var14.field207 + var14.field204; var19++) {
            for (int var20 = var14.field206; var20 < var14.field206 + var14.field205; var20++) {
                if (arg12) {
                    this.field335[var19][var20].method450();
                }
                this.field335[var19][var20].method509((this.field335[var19][var20].field272 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field335[var19][var20].field273 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field204; var21 < var14.field207 + var14.field204; var21++) {
            for (int var22 = var14.field206; var22 < var14.field206 + var14.field205; var22++) {
                this.field335[var21][var22].method456(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("at.z(IIIILjava/util/HashSet;III)V")
    public void method621(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field340 == null) {
            return;
        }
        this.field340.method5760(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field346 == null) {
            this.method626();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field346.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class44 var12 = (class44) var11.next();
                int var13 = (var12.field317.field2557 - this.field341) * arg2 / this.field343;
                int var14 = arg3 - (var12.field317.field2554 - this.field342) * arg3 / this.field345;
                class332.method5714(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("at.q(IIIIIIIIIIB)Ljava/util/List;")
    public List method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field344) {
            return var11;
        }
        class32 var12 = this.method616(arg0, arg1, arg2, arg3);
        float var13 = this.method627(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field341 + arg0;
        int var16 = this.field342 + arg1;
        for (int var17 = var12.field204; var17 < var12.field207 + var12.field204; var17++) {
            for (int var18 = var12.field206; var18 < var12.field206 + var12.field205; var18++) {
                List var19 = this.field335[var17][var18].method533((this.field335[var17][var18].field272 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field335[var17][var18].field273 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("at.k(IIIII)Lar;")
    public class32 method616(int arg0, int arg1, int arg2, int arg3) {
        class32 var5 = new class32(this);
        int var6 = this.field341 + arg0;
        int var7 = this.field342 + arg1;
        int var8 = this.field341 + arg2;
        int var9 = this.field342 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field207 = var12 - var10 + 1;
        var5.field205 = var13 - var11 + 1;
        var5.field204 = var10 - this.field332.method368();
        var5.field206 = var11 - this.field332.method370();
        if (var5.field204 < 0) {
            var5.field207 += var5.field204;
            var5.field204 = 0;
        }
        if (var5.field204 > this.field335.length - var5.field207) {
            var5.field207 = this.field335.length - var5.field204;
        }
        if (var5.field206 < 0) {
            var5.field205 += var5.field206;
            var5.field206 = 0;
        }
        if (var5.field206 > this.field335[0].length - var5.field205) {
            var5.field205 = this.field335[0].length - var5.field206;
        }
        var5.field207 = Math.min(var5.field207, this.field335.length);
        var5.field205 = Math.min(var5.field205, this.field335[0].length);
        return var5;
    }

    @ObfuscatedName("at.c(I)Z")
    public boolean method624() {
        return this.field344;
    }

    @ObfuscatedName("at.u(I)Ljava/util/HashMap;")
    public HashMap method639() {
        this.method626();
        return this.field346;
    }

    @ObfuscatedName("at.t(I)V")
    public void method626() {
        if (this.field346 == null) {
            this.field346 = new HashMap();
        }
        this.field346.clear();
        for (int var1 = 0; var1 < this.field335.length; var1++) {
            for (int var2 = 0; var2 < this.field335[var1].length; var2++) {
                List var3 = this.field335[var1][var2].method460();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class44 var5 = (class44) var4.next();
                    if (var5.method603()) {
                        int var6 = var5.method251();
                        if (this.field346.containsKey(var6)) {
                            List var8 = (List) this.field346.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field346.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.e(III)F")
    public float method627(int arg0, int arg1) {
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
