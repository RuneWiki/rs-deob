package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aa")
public final class class31 {

    @ObfuscatedName("aa.y")
    public boolean field289 = false;

    @ObfuscatedName("aa.c")
    public boolean field286 = false;

    @ObfuscatedName("aa.n")
    public class34 field288;

    @ObfuscatedName("aa.u")
    public class324 field300;

    @ObfuscatedName("aa.i")
    public HashMap field290;

    @ObfuscatedName("aa.r")
    public class24[][] field299;

    @ObfuscatedName("aa.j")
    public HashMap field292 = new HashMap();

    @ObfuscatedName("aa.p")
    public class323[] field293;

    @ObfuscatedName("aa.e")
    public final HashMap field294;

    @ObfuscatedName("aa.s")
    public int field295;

    @ObfuscatedName("aa.v")
    public int field296;

    @ObfuscatedName("aa.k")
    public int field301;

    @ObfuscatedName("aa.o")
    public int field298;

    @ObfuscatedName("aa.q")
    public int field297 = 0;

    public class31(class323[] arg0, HashMap arg1) {
        this.field293 = arg0;
        this.field294 = arg1;
    }

    @ObfuscatedName("aa.y(Liu;Ljava/lang/String;ZI)V")
    public void method462(class250 arg0, String arg1, boolean arg2) {
        if (this.field286) {
            return;
        }
        this.field289 = false;
        this.field286 = true;
        System.nanoTime();
        int var4 = arg0.method4274(class30.field285.field277);
        int var5 = arg0.method4275(var4, arg1);
        class185 var6 = new class185(arg0.method4314(class30.field285.field277, arg1));
        class185 var7 = new class185(arg0.method4314(class30.field281.field277, arg1));
        class185 var8 = new class185(arg0.method4314(arg1, class30.field279.field277));
        System.nanoTime();
        System.nanoTime();
        this.field288 = new class34();
        try {
            this.field288.method525(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field288.method208();
        this.field288.method248();
        this.field288.method210();
        this.field295 = this.field288.method204() * 64;
        this.field296 = this.field288.method206() * 64;
        this.field301 = (this.field288.method205() - this.field288.method204() + 1) * 64;
        this.field298 = (this.field288.method207() - this.field288.method206() + 1) * 64;
        int var10 = this.field288.method205() - this.field288.method204() + 1;
        int var11 = this.field288.method207() - this.field288.method206() + 1;
        System.nanoTime();
        System.nanoTime();
        class24.method1699();
        this.field299 = new class24[var10][var11];
        Iterator var12 = this.field288.field317.iterator();
        while (var12.hasNext()) {
            class11 var13 = (class11) var12.next();
            int var14 = var13.field143;
            int var15 = var13.field130;
            int var16 = var14 - this.field288.method204();
            int var17 = var15 - this.field288.method206();
            this.field299[var16][var17] = new class24(var14, var15, this.field288.method202(), this.field294);
            this.field299[var16][var17].method282(var13, this.field288.field313);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field299[var18][var19] == null) {
                    this.field299[var18][var19] = new class24(this.field288.method204() + var18, this.field288.method206() + var19, this.field288.method202(), this.field294);
                    this.field299[var18][var19].method283(this.field288.field312, this.field288.field313);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4276(class30.field278.field277, arg1)) {
            byte[] var20 = arg0.method4314(class30.field278.field277, arg1);
            this.field300 = class44.method4061(var20);
        }
        System.nanoTime();
        arg0.method4270();
        arg0.method4329();
        this.field289 = true;
    }

    @ObfuscatedName("aa.c(I)V")
    public final void method463() {
        this.field290 = null;
    }

    @ObfuscatedName("aa.n(IIIIIIIII)V")
    public final void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3826;
        int var10 = Statics.field3821;
        int var11 = Statics.field3820;
        int[] var12 = new int[4];
        class320.method5366(var12);
        class18 var13 = this.method487(arg0, arg1, arg2, arg3);
        float var14 = this.method501(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field297 = var15;
        if (!this.field292.containsKey(var15)) {
            class36 var16 = new class36(var15);
            var16.method556();
            this.field292.put(var15, var16);
        }
        class24[] var17 = new class24[8];
        for (int var18 = var13.field147; var18 < var13.field153 + var13.field147; var18++) {
            for (int var19 = var13.field148; var19 < var13.field148 + var13.field146; var19++) {
                this.method466(var18, var19, var17);
                this.field299[var18][var19].method341(var15, (class36) this.field292.get(var15), var17, this.field293);
            }
        }
        class320.method5362(var9, var10, var11);
        class320.method5367(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field295 + arg0;
        int var22 = this.field296 + arg1;
        for (int var23 = var13.field147; var23 < var13.field153 + var13.field147; var23++) {
            for (int var24 = var13.field148; var24 < var13.field148 + var13.field146; var24++) {
                this.field299[var23][var24].method281((this.field299[var23][var24].field229 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field299[var23][var24].field216 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("aa.u(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class18 var14 = this.method487(arg0, arg1, arg2, arg3);
        float var15 = this.method501(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field295 + arg0;
        int var18 = this.field296 + arg1;
        for (int var19 = var14.field147; var19 < var14.field153 + var14.field147; var19++) {
            for (int var20 = var14.field148; var20 < var14.field148 + var14.field146; var20++) {
                if (arg12) {
                    this.field299[var19][var20].method300();
                }
                this.field299[var19][var20].method287((this.field299[var19][var20].field229 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field299[var19][var20].field216 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field147; var21 < var14.field153 + var14.field147; var21++) {
            for (int var22 = var14.field148; var22 < var14.field148 + var14.field146; var22++) {
                this.field299[var21][var22].method302(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("aa.i(II[Lm;I)V")
    public void method466(int arg0, int arg1, class24[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field299.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field299[0].length - 1;
        if (var7) {
            arg2[class243.field3149.method144()] = null;
        } else {
            arg2[class243.field3149.method144()] = this.field299[arg0][arg1 + 1];
        }
        arg2[class243.field3143.method144()] = var7 || var5 ? null : this.field299[arg0 + 1][arg1 + 1];
        arg2[class243.field3144.method144()] = var7 || var4 ? null : this.field299[arg0 - 1][arg1 + 1];
        arg2[class243.field3150.method144()] = var5 ? null : this.field299[arg0 + 1][arg1];
        arg2[class243.field3152.method144()] = var4 ? null : this.field299[arg0 - 1][arg1];
        arg2[class243.field3146.method144()] = var6 ? null : this.field299[arg0][arg1 - 1];
        arg2[class243.field3145.method144()] = var6 || var5 ? null : this.field299[arg0 + 1][arg1 - 1];
        arg2[class243.field3147.method144()] = var6 || var4 ? null : this.field299[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("aa.p(IIIILjava/util/HashSet;III)V")
    public void method467(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field300 == null) {
            return;
        }
        this.field300.method5486(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field290 == null) {
            this.method472();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field290.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class29 var12 = (class29) var11.next();
                int var13 = (var12.field267.field2605 - this.field295) * arg2 / this.field301;
                int var14 = arg3 - (var12.field267.field2606 - this.field296) * arg3 / this.field298;
                class320.method5370(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("aa.e(IIIIIIIIIIB)Ljava/util/List;")
    public List method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field289) {
            return var11;
        }
        class18 var12 = this.method487(arg0, arg1, arg2, arg3);
        float var13 = this.method501(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field295 + arg0;
        int var16 = this.field296 + arg1;
        for (int var17 = var12.field147; var17 < var12.field153 + var12.field147; var17++) {
            for (int var18 = var12.field148; var18 < var12.field148 + var12.field146; var18++) {
                List var19 = this.field299[var17][var18].method350((this.field299[var17][var18].field229 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field299[var17][var18].field216 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("aa.s(IIIII)La;")
    public class18 method487(int arg0, int arg1, int arg2, int arg3) {
        class18 var5 = new class18(this);
        int var6 = this.field295 + arg0;
        int var7 = this.field296 + arg1;
        int var8 = this.field295 + arg2;
        int var9 = this.field296 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field153 = var12 - var10 + 1;
        var5.field146 = var13 - var11 + 1;
        var5.field147 = var10 - this.field288.method204();
        var5.field148 = var11 - this.field288.method206();
        if (var5.field147 < 0) {
            var5.field153 += var5.field147;
            var5.field147 = 0;
        }
        if (var5.field147 > this.field299.length - var5.field153) {
            var5.field153 = this.field299.length - var5.field147;
        }
        if (var5.field148 < 0) {
            var5.field146 += var5.field148;
            var5.field148 = 0;
        }
        if (var5.field148 > this.field299[0].length - var5.field146) {
            var5.field146 = this.field299[0].length - var5.field148;
        }
        var5.field153 = Math.min(var5.field153, this.field299.length);
        var5.field146 = Math.min(var5.field146, this.field299[0].length);
        return var5;
    }

    @ObfuscatedName("aa.v(I)Z")
    public boolean method470() {
        return this.field289;
    }

    @ObfuscatedName("aa.k(B)Ljava/util/HashMap;")
    public HashMap method471() {
        this.method472();
        return this.field290;
    }

    @ObfuscatedName("aa.o(I)V")
    public void method472() {
        if (this.field290 == null) {
            this.field290 = new HashMap();
        }
        this.field290.clear();
        for (int var1 = 0; var1 < this.field299.length; var1++) {
            for (int var2 = 0; var2 < this.field299[var1].length; var2++) {
                List var3 = this.field299[var1][var2].method316();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class29 var5 = (class29) var4.next();
                    if (this.field290.containsKey(var5.field269)) {
                        List var7 = (List) this.field290.get(var5.field269);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field290.put(var5.field269, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.q(IIS)F")
    public float method501(int arg0, int arg1) {
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
