package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ao")
public final class class37 {

    @ObfuscatedName("ao.s")
    public boolean field302 = false;

    @ObfuscatedName("ao.j")
    public boolean field298 = false;

    @ObfuscatedName("ao.i")
    public class39 field299;

    @ObfuscatedName("ao.k")
    public class325 field308;

    @ObfuscatedName("ao.u")
    public HashMap field314;

    @ObfuscatedName("ao.n")
    public class30[][] field305;

    @ObfuscatedName("ao.t")
    public HashMap field303 = new HashMap();

    @ObfuscatedName("ao.q")
    public class324[] field304;

    @ObfuscatedName("ao.x")
    public final class234 field312;

    @ObfuscatedName("ao.d")
    public final class234 field306;

    @ObfuscatedName("ao.f")
    public final HashMap field301;

    @ObfuscatedName("ao.c")
    public int field300;

    @ObfuscatedName("ao.r")
    public int field309;

    @ObfuscatedName("ao.y")
    public int field310;

    @ObfuscatedName("ao.p")
    public int field311;

    @ObfuscatedName("ao.b")
    public int field313 = 0;

    public class37(class324[] arg0, HashMap arg1, class234 arg2, class234 arg3) {
        this.field304 = arg0;
        this.field301 = arg1;
        this.field312 = arg2;
        this.field306 = arg3;
    }

    @ObfuscatedName("ao.s(Lhz;Ljava/lang/String;ZI)V")
    public void method535(class234 arg0, String arg1, boolean arg2) {
        if (this.field298) {
            return;
        }
        this.field302 = false;
        this.field298 = true;
        System.nanoTime();
        int var4 = arg0.method3775(class36.field296.field295);
        int var5 = arg0.method3786(var4, arg1);
        class300 var6 = new class300(arg0.method3785(class36.field296.field295, arg1));
        class300 var7 = new class300(arg0.method3785(class36.field291.field295, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field299 = new class39();
        try {
            this.field299.method553(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field299.method287();
        this.field299.method288();
        this.field299.method289();
        this.field300 = this.field299.method283() * 64;
        this.field309 = this.field299.method290() * 64;
        this.field310 = (this.field299.method284() - this.field299.method283() + 1) * 64;
        this.field311 = (this.field299.method286() - this.field299.method290() + 1) * 64;
        int var9 = this.field299.method284() - this.field299.method283() + 1;
        int var10 = this.field299.method286() - this.field299.method290() + 1;
        System.nanoTime();
        System.nanoTime();
        class30.method4079();
        this.field305 = new class30[var9][var10];
        Iterator var11 = this.field299.field319.iterator();
        while (var11.hasNext()) {
            class16 var12 = (class16) var11.next();
            int var13 = var12.field148;
            int var14 = var12.field156;
            int var15 = var13 - this.field299.method283();
            int var16 = var14 - this.field299.method290();
            this.field305[var15][var16] = new class30(var13, var14, this.field299.method281(), this.field301);
            this.field305[var15][var16].method352(var12, this.field299.field318);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field305[var17][var18] == null) {
                    this.field305[var17][var18] = new class30(this.field299.method283() + var17, this.field299.method290() + var18, this.field299.method281(), this.field301);
                    this.field305[var17][var18].method465(this.field299.field317, this.field299.field318);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3784(class36.field292.field295, arg1)) {
            byte[] var19 = arg0.method3785(class36.field292.field295, arg1);
            this.field308 = class50.method179(var19);
        }
        System.nanoTime();
        arg0.method3778();
        arg0.method3780();
        this.field302 = true;
    }

    @ObfuscatedName("ao.j(I)V")
    public final void method510() {
        this.field314 = null;
    }

    @ObfuscatedName("ao.i(IIIIIIIII)V")
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3854;
        int var10 = Statics.field3849;
        int var11 = Statics.field3848;
        int[] var12 = new int[4];
        class321.method5481(var12);
        class23 var13 = this.method515(arg0, arg1, arg2, arg3);
        float var14 = this.method541(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field313 = var15;
        if (!this.field303.containsKey(var15)) {
            class41 var16 = new class41(var15);
            var16.method582();
            this.field303.put(var15, var16);
        }
        int var17 = var13.field163 + var13.field162 - 1;
        int var18 = var13.field166 + var13.field164 - 1;
        for (int var19 = var13.field162; var19 <= var17; var19++) {
            for (int var20 = var13.field164; var20 <= var18; var20++) {
                this.field305[var19][var20].method359(var15, (class41) this.field303.get(var15), this.field304, this.field312, this.field306);
            }
        }
        class321.method5477(var9, var10, var11);
        class321.method5511(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field300 + arg0;
        int var23 = this.field309 + arg1;
        for (int var24 = var13.field162; var24 < var13.field163 + var13.field162; var24++) {
            for (int var25 = var13.field164; var25 < var13.field166 + var13.field164; var25++) {
                this.field305[var24][var25].method418((this.field305[var24][var25].field239 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field305[var24][var25].field240 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ao.k(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class23 var14 = this.method515(arg0, arg1, arg2, arg3);
        float var15 = this.method541(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field300 + arg0;
        int var18 = this.field309 + arg1;
        for (int var19 = var14.field162; var19 < var14.field163 + var14.field162; var19++) {
            for (int var20 = var14.field164; var20 < var14.field166 + var14.field164; var20++) {
                if (arg12) {
                    this.field305[var19][var20].method463();
                }
                this.field305[var19][var20].method350((this.field305[var19][var20].field239 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field305[var19][var20].field240 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field162; var21 < var14.field163 + var14.field162; var21++) {
            for (int var22 = var14.field164; var22 < var14.field166 + var14.field164; var22++) {
                this.field305[var21][var22].method351(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ao.u(IIIILjava/util/HashSet;III)V")
    public void method513(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field308 == null) {
            return;
        }
        this.field308.method5659(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field314 == null) {
            this.method518();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field314.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class35 var12 = (class35) var11.next();
                int var13 = (var12.field289.field2513 - this.field300) * arg2 / this.field310;
                int var14 = arg3 - (var12.field289.field2511 - this.field309) * arg3 / this.field311;
                class321.method5484(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ao.n(IIIIIIIIIII)Ljava/util/List;")
    public List method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field302) {
            return var11;
        }
        class23 var12 = this.method515(arg0, arg1, arg2, arg3);
        float var13 = this.method541(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field300 + arg0;
        int var16 = this.field309 + arg1;
        for (int var17 = var12.field162; var17 < var12.field163 + var12.field162; var17++) {
            for (int var18 = var12.field164; var18 < var12.field166 + var12.field164; var18++) {
                List var19 = this.field305[var17][var18].method381((this.field305[var17][var18].field239 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field305[var17][var18].field240 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ao.t(IIIII)Lh;")
    public class23 method515(int arg0, int arg1, int arg2, int arg3) {
        class23 var5 = new class23(this);
        int var6 = this.field300 + arg0;
        int var7 = this.field309 + arg1;
        int var8 = this.field300 + arg2;
        int var9 = this.field309 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field163 = var12 - var10 + 1;
        var5.field166 = var13 - var11 + 1;
        var5.field162 = var10 - this.field299.method283();
        var5.field164 = var11 - this.field299.method290();
        if (var5.field162 < 0) {
            var5.field163 += var5.field162;
            var5.field162 = 0;
        }
        if (var5.field162 > this.field305.length - var5.field163) {
            var5.field163 = this.field305.length - var5.field162;
        }
        if (var5.field164 < 0) {
            var5.field166 += var5.field164;
            var5.field164 = 0;
        }
        if (var5.field164 > this.field305[0].length - var5.field166) {
            var5.field166 = this.field305[0].length - var5.field164;
        }
        var5.field163 = Math.min(var5.field163, this.field305.length);
        var5.field166 = Math.min(var5.field166, this.field305[0].length);
        return var5;
    }

    @ObfuscatedName("ao.q(I)Z")
    public boolean method516() {
        return this.field302;
    }

    @ObfuscatedName("ao.x(I)Ljava/util/HashMap;")
    public HashMap method517() {
        this.method518();
        return this.field314;
    }

    @ObfuscatedName("ao.d(I)V")
    public void method518() {
        if (this.field314 == null) {
            this.field314 = new HashMap();
        }
        this.field314.clear();
        for (int var1 = 0; var1 < this.field305.length; var1++) {
            for (int var2 = 0; var2 < this.field305[var1].length; var2++) {
                List var3 = this.field305[var1][var2].method409();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class35 var5 = (class35) var4.next();
                    if (var5.method492()) {
                        int var6 = var5.method169();
                        if (this.field314.containsKey(var6)) {
                            List var8 = (List) this.field314.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field314.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.f(III)F")
    public float method541(int arg0, int arg1) {
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
