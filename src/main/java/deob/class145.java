package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ew")
public class class145 {

    @ObfuscatedName("ew.b")
    public static class197 field1619 = new class197(37748736, 256);

    @ObfuscatedName("ew.e")
    public int field1614;

    @ObfuscatedName("ew.k")
    public int field1615;

    @ObfuscatedName("ew.g")
    public class139 field1616;

    @ObfuscatedName("ew.h")
    public LinkedList field1622;

    @ObfuscatedName("ew.n")
    public int field1618;

    @ObfuscatedName("ew.l")
    public int field1609;

    @ObfuscatedName("ew.m")
    public List field1620;

    @ObfuscatedName("ew.d")
    public HashMap field1621;

    @ObfuscatedName("ew.c")
    public final HashMap field1617;

    public class145(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field1614 = arg0;
        this.field1615 = arg1;
        this.field1622 = new LinkedList();
        this.field1620 = new LinkedList();
        this.field1621 = new HashMap();
        this.field1618 = arg2 | 0xFF000000;
        this.field1617 = arg3;
    }

    @ObfuscatedName("ew.f(IIII)V")
    public void method2491(int arg0, int arg1, int arg2) {
        int var4 = this.field1614;
        int var5 = this.field1615;
        int var6 = this.field1609;
        class197 var7 = field1619;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class395 var10 = (class395) var7.method3353(var8);
        if (var10 == null) {
            return;
        }
        if (this.field1609 * 64 == arg2) {
            var10.method6237(arg0, arg1);
        } else {
            var10.method6281(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ew.o(Lem;Ljava/util/List;I)V")
    public void method2492(class139 arg0, List arg1) {
        this.field1621.clear();
        this.field1616 = arg0;
        this.method2542(arg1);
    }

    @ObfuscatedName("ew.u(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method2493(HashSet arg0, List arg1) {
        this.field1621.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class147 var4 = (class147) var3.next();
            if (var4.method2711() == this.field1614 && var4.method2698() == this.field1615) {
                this.field1622.add(var4);
            }
        }
        this.method2542(arg1);
    }

    @ObfuscatedName("ew.p(IIIILee;I)V")
    public void method2494(int arg0, int arg1, int arg2, int arg3, class153 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field1695; var8++) {
                    class155[] var9 = arg4.field1702[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class155[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class295 var13;
                            boolean var18;
                            label58: {
                                class155 var12 = var10[var11];
                                var13 = class295.method182(var12.field1719);
                                if (var13.field3630 != null) {
                                    int[] var14 = var13.field3630;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class295 var17 = class295.method182(var16);
                                        if (var17.field3617 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3617 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method2517(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.b(Lkj;IIILee;I)V")
    public void method2517(class295 arg0, int arg1, int arg2, int arg3, class153 arg4) {
        class221 var6 = new class221(arg1, this.field1614 * 64 + arg2, this.field1615 * 64 + arg3);
        Object var7 = null;
        class221 var8;
        if (this.field1616 == null) {
            class147 var9 = (class147) arg4;
            var8 = new class221(var9.field1694 + arg1, var9.field1700 * 64 + arg2 + var9.method2658() * 8, var9.field1705 * 64 + arg3 + var9.method2659() * 8);
        } else {
            var8 = new class221(this.field1616.field1694 + arg1, this.field1616.field1700 * 64 + arg2, this.field1616.field1705 * 64 + arg3);
        }
        class162 var10;
        if (arg0.field3630 == null) {
            class280 var11 = class280.method4995(arg0.field3617);
            var10 = new class150(var8, var6, var11.field3405, this.method2521(var11));
        } else {
            var10 = new class142(var8, var6, arg0.field3596, this);
        }
        class280 var12 = class280.method4995(var10.method2372());
        if (var12.field3412) {
            this.field1621.put(new class221(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("ew.e(I)V")
    public void method2562() {
        Iterator var1 = this.field1621.values().iterator();
        while (var1.hasNext()) {
            class162 var2 = (class162) var1.next();
            if (var2 instanceof class142) {
                ((class142) var2).method2367();
            }
        }
    }

    @ObfuscatedName("ew.k(Ljava/util/List;B)V")
    public void method2542(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class150 var3 = (class150) var2.next();
            if (class280.method4995(var3.field1664).field3412 && var3.field1759.field2586 >> 6 == this.field1614 && var3.field1759.field2588 >> 6 == this.field1615) {
                class150 var4 = new class150(var3.field1759, var3.field1759, var3.field1664, this.method2520(var3.field1664));
                this.field1620.add(var4);
            }
        }
    }

    @ObfuscatedName("ew.g(I)V")
    public void method2498() {
        if (this.field1616 != null) {
            this.field1616.method2692();
            return;
        }
        Iterator var1 = this.field1622.iterator();
        while (var1.hasNext()) {
            class147 var2 = (class147) var1.next();
            var2.method2692();
        }
    }

    @ObfuscatedName("ew.h(Lir;B)Z")
    public boolean method2575(class253 arg0) {
        this.field1621.clear();
        if (this.field1616 == null) {
            boolean var2 = true;
            Iterator var3 = this.field1622.iterator();
            while (var3.hasNext()) {
                class147 var4 = (class147) var3.next();
                var4.method2691(arg0);
                var2 &= var4.method2697();
            }
            if (var2) {
                Iterator var5 = this.field1622.iterator();
                while (var5.hasNext()) {
                    class147 var6 = (class147) var5.next();
                    this.method2494(var6.method2672() * 8, var6.method2661() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field1616.method2691(arg0);
            if (this.field1616.method2697()) {
                this.method2494(0, 0, 64, 64, this.field1616);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ew.n(ILfw;[Low;Lir;Lir;I)V")
    public void method2500(int arg0, class166 arg1, class394[] arg2, class253 arg3, class253 arg4) {
        this.field1609 = arg0;
        if (this.field1616 == null && this.field1622.isEmpty()) {
            return;
        }
        int var6 = this.field1614;
        int var7 = this.field1615;
        class197 var8 = field1619;
        long var9 = (long) (arg0 << 16 | var6 << 8 | var7);
        class395 var11 = (class395) var8.method3353(var9);
        if (var11 != null) {
            return;
        }
        boolean var12 = true;
        boolean var13 = var12 & this.method2575(arg3);
        int var14;
        if (this.field1616 == null) {
            var14 = ((class153) this.field1622.getFirst()).field1696;
        } else {
            var14 = this.field1616.field1696;
        }
        boolean var15 = var13 & arg4.method3948(var14);
        if (!var15) {
            return;
        }
        byte[] var16 = arg4.method3939(var14);
        class156 var17;
        if (var16 == null) {
            var17 = new class156();
        } else {
            var17 = new class156(class44.method3839(var16).field4247);
        }
        class395 var19 = new class395(this.field1609 * 64, this.field1609 * 64);
        var19.method6230();
        if (this.field1616 == null) {
            this.method2544(arg1, arg2, var17);
        } else {
            this.method2503(arg1, arg2, var17);
        }
        int var20 = this.field1614;
        int var21 = this.field1615;
        int var22 = this.field1609;
        class197 var23 = field1619;
        long var25 = (long) (var22 << 16 | var20 << 8 | var21);
        var23.method3357(var19, var25, var19.field4247.length * 4);
        this.method2498();
    }

    @ObfuscatedName("ew.l(IIILjava/util/HashSet;I)V")
    public void method2501(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method2511(arg0, arg1, arg3, arg2);
        this.method2499(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ew.m(Ljava/util/HashSet;IIB)V")
    public void method2504(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field1621.values().iterator();
        while (var4.hasNext()) {
            class162 var5 = (class162) var4.next();
            if (var5.method2761()) {
                int var6 = var5.method2372();
                if (arg0.contains(var6)) {
                    class280 var7 = class280.method4995(var6);
                    this.method2515(var7, var5.field1760, var5.field1761, arg1, arg2);
                }
            }
        }
        this.method2541(arg0, arg1, arg2);
    }

    @ObfuscatedName("ew.d(Lfw;[Low;Lea;B)V")
    public void method2503(class166 arg0, class394[] arg1, class156 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method2574(var4, var5, this.field1616, arg0, arg2);
                this.method2513(var4, var5, this.field1616, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method2505(var6, var7, this.field1616, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ew.c(Lfw;[Low;Lea;I)V")
    public void method2544(class166 arg0, class394[] arg1, class156 arg2) {
        Iterator var4 = this.field1622.iterator();
        while (var4.hasNext()) {
            class147 var5 = (class147) var4.next();
            for (int var6 = var5.method2672() * 8; var6 < var5.method2672() * 8 + 8; var6++) {
                for (int var7 = var5.method2661() * 8; var7 < var5.method2661() * 8 + 8; var7++) {
                    this.method2574(var6, var7, var5, arg0, arg2);
                    this.method2513(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field1622.iterator();
        while (var8.hasNext()) {
            class147 var9 = (class147) var8.next();
            for (int var10 = var9.method2672() * 8; var10 < var9.method2672() * 8 + 8; var10++) {
                for (int var11 = var9.method2661() * 8; var11 < var9.method2661() * 8 + 8; var11++) {
                    this.method2505(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ew.j(IILee;Lfw;[Low;B)V")
    public void method2505(int arg0, int arg1, class153 arg2, class166 arg3, class394[] arg4) {
        this.method2510(arg0, arg1, arg2);
        this.method2509(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ew.r(IILee;Lfw;Lea;B)V")
    public void method2574(int arg0, int arg1, class153 arg2, class166 arg3, class156 arg4) {
        int var6 = arg2.field1698[0][arg0][arg1] - 1;
        int var7 = arg2.field1699[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class391.method6191(this.field1609 * arg0, this.field1609 * (63 - arg1), this.field1609, this.field1609, this.field1618);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class160.method83(var7, this.field1618);
        }
        if (var7 > -1 && arg2.field1691[0][arg0][arg1] == 0) {
            class391.method6191(this.field1609 * arg0, this.field1609 * (63 - arg1), this.field1609, this.field1609, var8);
            return;
        }
        int var9 = this.method2508(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class391.method6191(this.field1609 * arg0, this.field1609 * (63 - arg1), this.field1609, this.field1609, var9);
        } else {
            arg3.method2787(this.field1609 * arg0, this.field1609 * (63 - arg1), var9, var8, this.field1609, this.field1609, arg2.field1691[0][arg0][arg1], arg2.field1701[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ew.q(IILee;Lfw;I)V")
    public void method2513(int arg0, int arg1, class153 arg2, class166 arg3) {
        for (int var5 = 1; var5 < arg2.field1695; var5++) {
            int var6 = arg2.field1699[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class160.method83(var6, this.field1618);
                if (arg2.field1691[var5][arg0][arg1] == 0) {
                    class391.method6191(this.field1609 * arg0, this.field1609 * (63 - arg1), this.field1609, this.field1609, var7);
                } else {
                    arg3.method2787(this.field1609 * arg0, this.field1609 * (63 - arg1), 0, var7, this.field1609, this.field1609, arg2.field1691[var5][arg0][arg1], arg2.field1701[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ew.t(IILee;Lea;I)I")
    public int method2508(int arg0, int arg1, class153 arg2, class156 arg3) {
        return arg2.field1698[0][arg0][arg1] == 0 ? this.field1618 : arg3.method2727(arg0, arg1);
    }

    @ObfuscatedName("ew.v(IILee;[Low;I)V")
    public void method2509(int arg0, int arg1, class153 arg2, class394[] arg3) {
        for (int var5 = 0; var5 < arg2.field1695; var5++) {
            class155[] var6 = arg2.field1702[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class155[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class155 var9 = var7[var8];
                    if (class234.method2689(var9.field1713) || class234.method3868(var9.field1713)) {
                        class295 var10 = class295.method182(var9.field1719);
                        if (var10.field3618 != -1) {
                            if (var10.field3618 == 46 || var10.field3618 == 52) {
                                arg3[var10.field3618].method6209(this.field1609 * arg0, this.field1609 * (63 - arg1), this.field1609 * 2 + 1, this.field1609 * 2 + 1);
                            } else {
                                arg3[var10.field3618].method6209(this.field1609 * arg0, this.field1609 * (63 - arg1), this.field1609 * 2, this.field1609 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.x(IILee;I)V")
    public void method2510(int arg0, int arg1, class153 arg2) {
        for (int var4 = 0; var4 < arg2.field1695; var4++) {
            class155[] var5 = arg2.field1702[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class155[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class155 var8 = var6[var7];
                    int var9 = var8.field1713;
                    boolean var10 = var9 >= class234.field2821.field2823 && var9 <= class234.field2818.field2823 || class234.field2819.field2823 == var9;
                    if (var10) {
                        class295 var11 = class295.method182(var8.field1719);
                        int var12 = var11.field3602 == 0 ? -3355444 : -3407872;
                        if (class234.field2821.field2823 == var8.field1713) {
                            this.method2524(arg0, arg1, var8.field1714, var12);
                        }
                        if (class234.field2817.field2823 == var8.field1713) {
                            this.method2524(arg0, arg1, var8.field1714, -3355444);
                            this.method2524(arg0, arg1, var8.field1714 + 1, var12);
                        }
                        if (class234.field2818.field2823 == var8.field1713) {
                            if (var8.field1714 == 0) {
                                class391.method6133(this.field1609 * arg0, this.field1609 * (63 - arg1), 1, var12);
                            }
                            if (var8.field1714 == 1) {
                                class391.method6133(this.field1609 * arg0 + this.field1609 - 1, this.field1609 * (63 - arg1), 1, var12);
                            }
                            if (var8.field1714 == 2) {
                                class391.method6133(this.field1609 * arg0 + this.field1609 - 1, this.field1609 * (63 - arg1) + this.field1609 - 1, 1, var12);
                            }
                            if (var8.field1714 == 3) {
                                class391.method6133(this.field1609 * arg0, this.field1609 * (63 - arg1) + this.field1609 - 1, 1, var12);
                            }
                        }
                        if (class234.field2819.field2823 == var8.field1713) {
                            int var13 = var8.field1714 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field1609; var14++) {
                                    class391.method6133(this.field1609 * arg0 + var14, this.field1609 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field1609; var15++) {
                                    class391.method6133(this.field1609 * arg0 + var15, this.field1609 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.z(IILjava/util/HashSet;IB)V")
    public void method2511(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field1621.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class221 var9 = (class221) var8.getKey();
            int var10 = (int) ((float) var9.field2586 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2588 * var5 - var6);
            class162 var12 = (class162) var8.getValue();
            if (var12 != null && var12.method2761()) {
                var12.field1760 = var10;
                var12.field1761 = var11;
                class280 var13 = class280.method4995(var12.method2372());
                if (!arg2.contains(var13.method4346())) {
                    this.method2514(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ew.i(Ljava/util/HashSet;III)V")
    public void method2541(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field1620.iterator();
        while (var4.hasNext()) {
            class162 var5 = (class162) var4.next();
            if (var5.method2761()) {
                class280 var6 = class280.method4995(var5.method2372());
                if (var6 != null && arg0.contains(var6.method4346())) {
                    this.method2515(var6, var5.field1760, var5.field1761, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ew.a(Ljy;IIIII)V")
    public void method2515(class280 arg0, int arg1, int arg2, int arg3, int arg4) {
        class395 var6 = arg0.method4344(false);
        if (var6 == null) {
            return;
        }
        var6.method6284(arg1 - var6.field4245 / 2, arg2 - var6.field4244 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class391.method6125(arg1, arg2, 15, 16776960, 128);
            class391.method6125(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ew.w(Lfg;IIFI)V")
    public void method2514(class162 arg0, int arg1, int arg2, float arg3) {
        class280 var5 = class280.method4995(arg0.method2372());
        this.method2573(var5, arg1, arg2);
        this.method2516(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ew.s(Ljy;III)V")
    public void method2573(class280 arg0, int arg1, int arg2) {
        class395 var4 = arg0.method4344(false);
        if (var4 != null) {
            int var5 = this.method2518(var4, arg0.field3410);
            int var6 = this.method2519(var4, arg0.field3422);
            var4.method6284(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ew.y(Lfg;Ljy;IIFI)V")
    public void method2516(class162 arg0, class280 arg1, int arg2, int arg3, float arg4) {
        class157 var6 = arg0.method2366();
        if (var6 != null && var6.field1730.method2357(arg4)) {
            class299 var7 = (class299) this.field1617.get(var6.field1730);
            var7.method4789(var6.field1727, arg2 - var6.field1728 / 2, arg3, var6.field1728, var6.field1729, 0xFF000000 | arg1.field3418, 0, 1, 0, var7.field3732 / 2);
        }
    }

    @ObfuscatedName("ew.ac(IILjava/util/HashSet;II)V")
    public void method2499(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field1620.iterator();
        while (var6.hasNext()) {
            class162 var7 = (class162) var6.next();
            if (var7.method2761()) {
                int var8 = var7.field1759.field2586 % 64;
                int var9 = var7.field1759.field2588 % 64;
                var7.field1760 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field1761 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method2372())) {
                    this.method2514(var7, var7.field1760, var7.field1761, var5);
                }
            }
        }
    }

    @ObfuscatedName("ew.ay(Loh;Ljd;I)I")
    public int method2518(class395 arg0, class286 arg1) {
        switch(arg1.field3471) {
            case 0:
                return 0;
            case 1:
                return -arg0.field4245 / 2;
            default:
                return -arg0.field4245;
        }
    }

    @ObfuscatedName("ew.am(Loh;Lkf;B)I")
    public int method2519(class395 arg0, class288 arg1) {
        switch(arg1.field3516) {
            case 0:
                return -arg0.field4244 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field4244;
        }
    }

    @ObfuscatedName("ew.ag(IB)Lfi;")
    public class157 method2520(int arg0) {
        class280 var2 = class280.method4995(arg0);
        return this.method2521(var2);
    }

    @ObfuscatedName("ew.aq(Ljy;B)Lfi;")
    public class157 method2521(class280 arg0) {
        if (arg0.field3408 == null || this.field1617 == null || this.field1617.get(class141.field1567) == null) {
            return null;
        }
        class141 var2 = class141.method2356(arg0.field3403);
        if (var2 == null) {
            return null;
        }
        class299 var3 = (class299) this.field1617.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4813(arg0.field3408, 1000000);
        String[] var5 = new String[var4];
        var3.method4811(arg0.field3408, (int[]) null, var5);
        int var6 = var5.length * var3.field3732 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4781(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class157(arg0.field3408, var7, var6, var2);
    }

    @ObfuscatedName("ew.at(IIIIIB)Ljava/util/List;")
    public List method2581(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field1621.values().iterator();
            while (var7.hasNext()) {
                class162 var8 = (class162) var7.next();
                if (var8.method2761() && var8.method2756(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field1620.iterator();
            while (var9.hasNext()) {
                class162 var10 = (class162) var9.next();
                if (var10.method2761() && var10.method2756(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ew.aj(I)Ljava/util/List;")
    public List method2558() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field1620);
        var1.addAll(this.field1621.values());
        return var1;
    }

    @ObfuscatedName("ew.aw(IIIII)V")
    public void method2524(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class391.method6144(this.field1609 * arg0, this.field1609 * (63 - arg1), this.field1609, arg3);
        }
        if (var5 == 1) {
            class391.method6133(this.field1609 * arg0, this.field1609 * (63 - arg1), this.field1609, arg3);
        }
        if (var5 == 2) {
            class391.method6144(this.field1609 * arg0 + this.field1609 - 1, this.field1609 * (63 - arg1), this.field1609, arg3);
        }
        if (var5 == 3) {
            class391.method6133(this.field1609 * arg0, this.field1609 * (63 - arg1) + this.field1609 - 1, this.field1609, arg3);
        }
    }
}
