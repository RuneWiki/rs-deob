package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ez")
public final class class146 {

    @ObfuscatedName("ez.f")
    public boolean field1626 = false;

    @ObfuscatedName("ez.o")
    public boolean field1629 = false;

    @ObfuscatedName("ez.u")
    public class165 field1628;

    @ObfuscatedName("ez.p")
    public class395 field1624;

    @ObfuscatedName("ez.b")
    public HashMap field1627;

    @ObfuscatedName("ez.e")
    public class145[][] field1623;

    @ObfuscatedName("ez.k")
    public HashMap field1625 = new HashMap();

    @ObfuscatedName("ez.g")
    public class394[] field1630;

    @ObfuscatedName("ez.h")
    public final class253 field1631;

    @ObfuscatedName("ez.n")
    public final class253 field1632;

    @ObfuscatedName("ez.l")
    public final HashMap field1633;

    @ObfuscatedName("ez.m")
    public int field1634;

    @ObfuscatedName("ez.d")
    public int field1635;

    @ObfuscatedName("ez.c")
    public int field1636;

    @ObfuscatedName("ez.j")
    public int field1637;

    @ObfuscatedName("ez.r")
    public int field1638 = 0;

    public class146(class394[] arg0, HashMap arg1, class253 arg2, class253 arg3) {
        this.field1630 = arg0;
        this.field1633 = arg1;
        this.field1631 = arg2;
        this.field1632 = arg3;
    }

    @ObfuscatedName("ez.f(Lir;Ljava/lang/String;ZI)V")
    public void method2617(class253 arg0, String arg1, boolean arg2) {
        if (this.field1629) {
            return;
        }
        this.field1626 = false;
        this.field1629 = true;
        System.nanoTime();
        int var4 = arg0.method3950(class163.field1769.field1767);
        int var5 = arg0.method3951(var4, arg1);
        class382 var6 = new class382(arg0.method3953(class163.field1769.field1767, arg1));
        class382 var7 = new class382(arg0.method3953(class163.field1762.field1767, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field1628 = new class165();
        try {
            this.field1628.method2775(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field1628.method2431();
        this.field1628.method2432();
        this.field1628.method2439();
        this.field1634 = this.field1628.method2464() * 64;
        this.field1635 = this.field1628.method2429() * 64;
        this.field1636 = (this.field1628.method2428() - this.field1628.method2464() + 1) * 64;
        this.field1637 = (this.field1628.method2468() - this.field1628.method2429() + 1) * 64;
        int var9 = this.field1628.method2428() - this.field1628.method2464() + 1;
        int var10 = this.field1628.method2468() - this.field1628.method2429() + 1;
        System.nanoTime();
        System.nanoTime();
        class145.field1619.method3373();
        this.field1623 = new class145[var9][var10];
        Iterator var11 = this.field1628.field1770.iterator();
        while (var11.hasNext()) {
            class139 var12 = (class139) var11.next();
            int var13 = var12.field1692;
            int var14 = var12.field1693;
            int var15 = var13 - this.field1628.method2464();
            int var16 = var14 - this.field1628.method2429();
            this.field1623[var15][var16] = new class145(var13, var14, this.field1628.method2433(), this.field1633);
            this.field1623[var15][var16].method2492(var12, this.field1628.field1772);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field1623[var17][var18] == null) {
                    this.field1623[var17][var18] = new class145(this.field1628.method2464() + var17, this.field1628.method2429() + var18, this.field1628.method2433(), this.field1633);
                    this.field1623[var17][var18].method2493(this.field1628.field1771, this.field1628.field1772);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3942(class163.field1764.field1767, arg1)) {
            byte[] var19 = arg0.method3953(class163.field1764.field1767, arg1);
            this.field1624 = class44.method3839(var19);
        }
        System.nanoTime();
        arg0.method3946();
        arg0.method3958();
        this.field1626 = true;
    }

    @ObfuscatedName("ez.o(B)V")
    public final void method2618() {
        this.field1627 = null;
    }

    @ObfuscatedName("ez.u(IIIIIIIII)V")
    public final void method2636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4223;
        int var10 = Statics.field4219;
        int var11 = Statics.field4218;
        int[] var12 = new int[4];
        class391.method6136(var12);
        class154 var13 = this.method2623(arg0, arg1, arg2, arg3);
        float var14 = this.method2624(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field1638 = var15;
        if (!this.field1625.containsKey(var15)) {
            class166 var16 = new class166(var15);
            var16.method2790();
            this.field1625.put(var15, var16);
        }
        int var17 = var13.field1710 + var13.field1708 - 1;
        int var18 = var13.field1709 + var13.field1706 - 1;
        for (int var19 = var13.field1710; var19 <= var17; var19++) {
            for (int var20 = var13.field1709; var20 <= var18; var20++) {
                this.field1623[var19][var20].method2500(var15, (class166) this.field1625.get(var15), this.field1630, this.field1631, this.field1632);
            }
        }
        class391.method6127(var9, var10, var11);
        class391.method6122(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field1634 + arg0;
        int var23 = this.field1635 + arg1;
        for (int var24 = var13.field1710; var24 < var13.field1710 + var13.field1708; var24++) {
            for (int var25 = var13.field1709; var25 < var13.field1709 + var13.field1706; var25++) {
                this.field1623[var24][var25].method2491((this.field1623[var24][var25].field1614 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field1623[var24][var25].field1615 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ez.p(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method2648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class154 var14 = this.method2623(arg0, arg1, arg2, arg3);
        float var15 = this.method2624(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field1634 + arg0;
        int var18 = this.field1635 + arg1;
        for (int var19 = var14.field1710; var19 < var14.field1710 + var14.field1708; var19++) {
            for (int var20 = var14.field1709; var20 < var14.field1709 + var14.field1706; var20++) {
                if (arg12) {
                    this.field1623[var19][var20].method2562();
                }
                this.field1623[var19][var20].method2501((this.field1623[var19][var20].field1614 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field1623[var19][var20].field1615 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field1710; var21 < var14.field1710 + var14.field1708; var21++) {
            for (int var22 = var14.field1709; var22 < var14.field1709 + var14.field1706; var22++) {
                this.field1623[var21][var22].method2504(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ez.b(IIIILjava/util/HashSet;IIB)V")
    public void method2621(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field1624 == null) {
            return;
        }
        this.field1624.method6241(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field1627 == null) {
            this.method2626();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field1627.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class162 var12 = (class162) var11.next();
                int var13 = (var12.field1759.field2586 - this.field1634) * arg2 / this.field1636;
                int var14 = arg3 - (var12.field1759.field2588 - this.field1635) * arg3 / this.field1637;
                class391.method6125(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ez.e(IIIIIIIIIII)Ljava/util/List;")
    public List method2622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field1626) {
            return var11;
        }
        class154 var12 = this.method2623(arg0, arg1, arg2, arg3);
        float var13 = this.method2624(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field1634 + arg0;
        int var16 = this.field1635 + arg1;
        for (int var17 = var12.field1710; var17 < var12.field1710 + var12.field1708; var17++) {
            for (int var18 = var12.field1709; var18 < var12.field1709 + var12.field1706; var18++) {
                List var19 = this.field1623[var17][var18].method2581((this.field1623[var17][var18].field1614 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field1623[var17][var18].field1615 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ez.k(IIIIB)Leo;")
    public class154 method2623(int arg0, int arg1, int arg2, int arg3) {
        class154 var5 = new class154(this);
        int var6 = this.field1634 + arg0;
        int var7 = this.field1635 + arg1;
        int var8 = this.field1634 + arg2;
        int var9 = this.field1635 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field1708 = var12 - var10 + 1;
        var5.field1706 = var13 - var11 + 1;
        var5.field1710 = var10 - this.field1628.method2464();
        var5.field1709 = var11 - this.field1628.method2429();
        if (var5.field1710 < 0) {
            var5.field1708 += var5.field1710;
            var5.field1710 = 0;
        }
        if (var5.field1710 > this.field1623.length - var5.field1708) {
            var5.field1708 = this.field1623.length - var5.field1710;
        }
        if (var5.field1709 < 0) {
            var5.field1706 += var5.field1709;
            var5.field1709 = 0;
        }
        if (var5.field1709 > this.field1623[0].length - var5.field1706) {
            var5.field1706 = this.field1623[0].length - var5.field1709;
        }
        var5.field1708 = Math.min(var5.field1708, this.field1623.length);
        var5.field1706 = Math.min(var5.field1706, this.field1623[0].length);
        return var5;
    }

    @ObfuscatedName("ez.g(I)Z")
    public boolean method2651() {
        return this.field1626;
    }

    @ObfuscatedName("ez.h(B)Ljava/util/HashMap;")
    public HashMap method2625() {
        this.method2626();
        return this.field1627;
    }

    @ObfuscatedName("ez.n(I)V")
    public void method2626() {
        if (this.field1627 == null) {
            this.field1627 = new HashMap();
        }
        this.field1627.clear();
        for (int var1 = 0; var1 < this.field1623.length; var1++) {
            for (int var2 = 0; var2 < this.field1623[var1].length; var2++) {
                List var3 = this.field1623[var1][var2].method2558();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class162 var5 = (class162) var4.next();
                    if (var5.method2761()) {
                        int var6 = var5.method2372();
                        if (this.field1627.containsKey(var6)) {
                            List var8 = (List) this.field1627.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field1627.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ez.l(III)F")
    public float method2624(int arg0, int arg1) {
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
