package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("fx")
public class class182 {

    @ObfuscatedName("fx.m")
    public static class234 field2059 = new class234(37748736, 256);

    @ObfuscatedName("fx.k")
    public int field2060;

    @ObfuscatedName("fx.t")
    public int field2061;

    @ObfuscatedName("fx.a")
    public class176 field2063;

    @ObfuscatedName("fx.e")
    public LinkedList field2062;

    @ObfuscatedName("fx.i")
    public int field2058;

    @ObfuscatedName("fx.y")
    public int field2065;

    @ObfuscatedName("fx.w")
    public List field2066;

    @ObfuscatedName("fx.g")
    public HashMap field2055;

    @ObfuscatedName("fx.v")
    public final HashMap field2068;

    @ObfuscatedName("en.l(IIII)J")
    public static long method2625(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("x.q(B)V")
    public static void method219() {
        field2059.method4196();
    }

    public class182(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2060 = arg0;
        this.field2061 = arg1;
        this.field2062 = new LinkedList();
        this.field2066 = new LinkedList();
        this.field2055 = new HashMap();
        this.field2058 = arg2 | 0xFF000000;
        this.field2068 = arg3;
    }

    @ObfuscatedName("fx.f(IIII)V")
    public void method3312(int arg0, int arg1, int arg2) {
        int var4 = this.field2060;
        int var5 = this.field2061;
        int var6 = this.field2065;
        class414 var7 = (class414) field2059.method4201(method2625(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field2065 * 64 == arg2) {
            var7.method6657(arg0, arg1);
        } else {
            var7.method6680(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("fx.j(Lfj;Ljava/util/List;I)V")
    public void method3321(class176 arg0, List arg1) {
        this.field2055.clear();
        this.field2063 = arg0;
        this.method3318(arg1);
    }

    @ObfuscatedName("fx.m(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method3314(HashSet arg0, List arg1) {
        this.field2055.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class184 var4 = (class184) var3.next();
            if (var4.method3525() == this.field2060 && var4.method3516() == this.field2061) {
                this.field2062.add(var4);
            }
        }
        this.method3318(arg1);
    }

    @ObfuscatedName("fx.k(IIIILge;I)V")
    public void method3345(int arg0, int arg1, int arg2, int arg3, class190 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2151; var8++) {
                    class192[] var9 = arg4.field2158[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class192[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class169 var13;
                            boolean var18;
                            label58: {
                                class192 var12 = var10[var11];
                                var13 = class169.method4277(var12.field2171);
                                if (var13.field1863 != null) {
                                    int[] var14 = var13.field1863;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class169 var17 = class169.method4277(var16);
                                        if (var17.field1850 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field1850 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method3315(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fx.t(Lfo;IIILge;I)V")
    public void method3315(class169 arg0, int arg1, int arg2, int arg3, class190 arg4) {
        class258 var6 = new class258(arg1, this.field2060 * 64 + arg2, this.field2061 * 64 + arg3);
        Object var7 = null;
        class258 var8;
        if (this.field2063 == null) {
            class184 var9 = (class184) arg4;
            var8 = new class258(var9.field2146 + arg1, var9.field2157 * 64 + arg2 + var9.method3481() * 8, var9.field2149 * 64 + arg3 + var9.method3474() * 8);
        } else {
            var8 = new class258(this.field2063.field2146 + arg1, this.field2063.field2157 * 64 + arg2, this.field2063.field2149 * 64 + arg3);
        }
        class199 var10;
        if (arg0.field1863 == null) {
            class154 var11 = class154.method156(arg0.field1850);
            var10 = new class187(var8, var6, var11.field1627, this.method3341(var11));
        } else {
            var10 = new class179(var8, var6, arg0.field1833, this);
        }
        class154 var12 = class154.method156(var10.method3195());
        if (var12.field1634) {
            this.field2055.put(new class258(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("fx.a(B)V")
    public void method3317() {
        Iterator var1 = this.field2055.values().iterator();
        while (var1.hasNext()) {
            class199 var2 = (class199) var1.next();
            if (var2 instanceof class179) {
                ((class179) var2).method3193();
            }
        }
    }

    @ObfuscatedName("fx.e(Ljava/util/List;I)V")
    public void method3318(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class187 var3 = (class187) var2.next();
            if (class154.method156(var3.field2112).field1634 && var3.field2209.field3012 >> 6 == this.field2060 && var3.field2209.field3013 >> 6 == this.field2061) {
                class187 var4 = new class187(var3.field2209, var3.field2209, var3.field2112, this.method3340(var3.field2112));
                this.field2066.add(var4);
            }
        }
    }

    @ObfuscatedName("fx.i(S)V")
    public void method3319() {
        if (this.field2063 != null) {
            this.field2063.method3519();
            return;
        }
        Iterator var1 = this.field2062.iterator();
        while (var1.hasNext()) {
            class184 var2 = (class184) var1.next();
            var2.method3519();
        }
    }

    @ObfuscatedName("fx.y(Lkl;B)Z")
    public boolean method3385(class290 arg0) {
        this.field2055.clear();
        if (this.field2063 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2062.iterator();
            while (var3.hasNext()) {
                class184 var4 = (class184) var3.next();
                var4.method3518(arg0);
                var2 &= var4.method3536();
            }
            if (var2) {
                Iterator var5 = this.field2062.iterator();
                while (var5.hasNext()) {
                    class184 var6 = (class184) var5.next();
                    this.method3345(var6.method3475() * 8, var6.method3476() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2063.method3518(arg0);
            if (this.field2063.method3536()) {
                this.method3345(0, 0, 64, 64, this.field2063);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("fx.w(ILgg;[Loz;Lkl;Lkl;I)V")
    public void method3365(int arg0, class203 arg1, class413[] arg2, class290 arg3, class290 arg4) {
        this.field2065 = arg0;
        if (this.field2063 == null && this.field2062.isEmpty()) {
            return;
        }
        int var6 = this.field2060;
        int var7 = this.field2061;
        class414 var8 = (class414) field2059.method4201(method2625(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method3385(arg3);
        int var11;
        if (this.field2063 == null) {
            var11 = ((class190) this.field2062.getFirst()).field2152;
        } else {
            var11 = this.field2063.field2152;
        }
        boolean var12 = var10 & arg4.method4760(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method4762(var11);
        class193 var14 = class193.method3372(var13);
        class414 var15 = new class414(this.field2065 * 64, this.field2065 * 64);
        var15.method6650();
        if (this.field2063 == null) {
            this.method3325(arg1, arg2, var14);
        } else {
            this.method3324(arg1, arg2, var14);
        }
        int var16 = this.field2060;
        int var17 = this.field2061;
        int var18 = this.field2065;
        field2059.method4194(var15, method2625(var16, var17, var18), var15.field4385.length * 4);
        this.method3319();
    }

    @ObfuscatedName("fx.g(IIILjava/util/HashSet;I)V")
    public void method3322(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method3331(arg0, arg1, arg3, arg2);
        this.method3344(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("fx.v(Ljava/util/HashSet;III)V")
    public void method3323(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2055.values().iterator();
        while (var4.hasNext()) {
            class199 var5 = (class199) var4.next();
            if (var5.method3575()) {
                int var6 = var5.method3195();
                if (arg0.contains(var6)) {
                    class154 var7 = class154.method156(var6);
                    this.method3333(var7, var5.field2210, var5.field2208, arg1, arg2);
                }
            }
        }
        this.method3434(arg0, arg1, arg2);
    }

    @ObfuscatedName("fx.s(Lgg;[Loz;Lgw;I)V")
    public void method3324(class203 arg0, class413[] arg1, class193 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method3327(var4, var5, this.field2063, arg0, arg2);
                this.method3328(var4, var5, this.field2063, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method3326(var6, var7, this.field2063, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("fx.c(Lgg;[Loz;Lgw;B)V")
    public void method3325(class203 arg0, class413[] arg1, class193 arg2) {
        Iterator var4 = this.field2062.iterator();
        while (var4.hasNext()) {
            class184 var5 = (class184) var4.next();
            for (int var6 = var5.method3475() * 8; var6 < var5.method3475() * 8 + 8; var6++) {
                for (int var7 = var5.method3476() * 8; var7 < var5.method3476() * 8 + 8; var7++) {
                    this.method3327(var6, var7, var5, arg0, arg2);
                    this.method3328(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2062.iterator();
        while (var8.hasNext()) {
            class184 var9 = (class184) var8.next();
            for (int var10 = var9.method3475() * 8; var10 < var9.method3475() * 8 + 8; var10++) {
                for (int var11 = var9.method3476() * 8; var11 < var9.method3476() * 8 + 8; var11++) {
                    this.method3326(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("fx.b(IILge;Lgg;[Loz;B)V")
    public void method3326(int arg0, int arg1, class190 arg2, class203 arg3, class413[] arg4) {
        this.method3363(arg0, arg1, arg2);
        this.method3337(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("fx.x(IILge;Lgg;Lgw;I)V")
    public void method3327(int arg0, int arg1, class190 arg2, class203 arg3, class193 arg4) {
        int var6 = arg2.field2154[0][arg0][arg1] - 1;
        int var7 = arg2.field2155[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class410.method6595(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, this.field2065, this.field2058);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class197.method1968(var7, this.field2058);
        }
        if (var7 > -1 && arg2.field2156[0][arg0][arg1] == 0) {
            class410.method6595(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, this.field2065, var8);
            return;
        }
        int var9 = this.method3329(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class410.method6595(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, this.field2065, var9);
        } else {
            arg3.method3636(this.field2065 * arg0, this.field2065 * (63 - arg1), var9, var8, this.field2065, this.field2065, arg2.field2156[0][arg0][arg1], arg2.field2150[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("fx.p(IILge;Lgg;B)V")
    public void method3328(int arg0, int arg1, class190 arg2, class203 arg3) {
        for (int var5 = 1; var5 < arg2.field2151; var5++) {
            int var6 = arg2.field2155[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class197.method1968(var6, this.field2058);
                if (arg2.field2156[var5][arg0][arg1] == 0) {
                    class410.method6595(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, this.field2065, var7);
                } else {
                    arg3.method3636(this.field2065 * arg0, this.field2065 * (63 - arg1), 0, var7, this.field2065, this.field2065, arg2.field2156[var5][arg0][arg1], arg2.field2150[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("fx.z(IILge;Lgw;I)I")
    public int method3329(int arg0, int arg1, class190 arg2, class193 arg3) {
        return arg2.field2154[0][arg0][arg1] == 0 ? this.field2058 : arg3.method3545(arg0, arg1);
    }

    @ObfuscatedName("fx.h(IILge;[Loz;B)V")
    public void method3337(int arg0, int arg1, class190 arg2, class413[] arg3) {
        for (int var5 = 0; var5 < arg2.field2151; var5++) {
            class192[] var6 = arg2.field2158[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class192[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class192 var9 = var7[var8];
                    if (!class271.method5434(var9.field2170)) {
                        int var10 = var9.field2170;
                        boolean var11 = class271.field3230.field3249 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class169 var12 = class169.method4277(var9.field2171);
                    if (var12.field1851 != -1) {
                        if (var12.field1851 == 46 || var12.field1851 == 52) {
                            arg3[var12.field1851].method6631(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065 * 2 + 1, this.field2065 * 2 + 1);
                        } else {
                            arg3[var12.field1851].method6631(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065 * 2, this.field2065 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fx.o(IILge;I)V")
    public void method3363(int arg0, int arg1, class190 arg2) {
        for (int var4 = 0; var4 < arg2.field2151; var4++) {
            class192[] var5 = arg2.field2158[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class192[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class192 var8 = var6[var7];
                    int var9 = var8.field2170;
                    boolean var10 = var9 >= class271.field3246.field3249 && var9 <= class271.field3229.field3249 || class271.field3251.field3249 == var9;
                    if (var10) {
                        class169 var11 = class169.method4277(var8.field2171);
                        int var12 = var11.field1841 == 0 ? -3355444 : -3407872;
                        if (class271.field3246.field3249 == var8.field2170) {
                            this.method3427(arg0, arg1, var8.field2173, var12);
                        }
                        if (class271.field3228.field3249 == var8.field2170) {
                            this.method3427(arg0, arg1, var8.field2173, -3355444);
                            this.method3427(arg0, arg1, var8.field2173 + 1, var12);
                        }
                        if (class271.field3229.field3249 == var8.field2170) {
                            if (var8.field2173 == 0) {
                                class410.method6568(this.field2065 * arg0, this.field2065 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2173 == 1) {
                                class410.method6568(this.field2065 * arg0 + this.field2065 - 1, this.field2065 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2173 == 2) {
                                class410.method6568(this.field2065 * arg0 + this.field2065 - 1, this.field2065 * (63 - arg1) + this.field2065 - 1, 1, var12);
                            }
                            if (var8.field2173 == 3) {
                                class410.method6568(this.field2065 * arg0, this.field2065 * (63 - arg1) + this.field2065 - 1, 1, var12);
                            }
                        }
                        if (class271.field3251.field3249 == var8.field2170) {
                            int var13 = var8.field2173 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2065; var14++) {
                                    class410.method6568(this.field2065 * arg0 + var14, this.field2065 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2065; var15++) {
                                    class410.method6568(this.field2065 * arg0 + var15, this.field2065 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fx.r(IILjava/util/HashSet;II)V")
    public void method3331(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2055.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class258 var9 = (class258) var8.getKey();
            int var10 = (int) ((float) var9.field3012 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3013 * var5 - var6);
            class199 var12 = (class199) var8.getValue();
            if (var12 != null && var12.method3575()) {
                var12.field2210 = var10;
                var12.field2208 = var11;
                class154 var13 = class154.method156(var12.method3195());
                if (!arg2.contains(var13.method2656())) {
                    this.method3349(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("fx.n(Ljava/util/HashSet;IIB)V")
    public void method3434(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2066.iterator();
        while (var4.hasNext()) {
            class199 var5 = (class199) var4.next();
            if (var5.method3575()) {
                class154 var6 = class154.method156(var5.method3195());
                if (var6 != null && arg0.contains(var6.method2656())) {
                    this.method3333(var6, var5.field2210, var5.field2208, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("fx.u(Leo;IIIII)V")
    public void method3333(class154 arg0, int arg1, int arg2, int arg3, int arg4) {
        class414 var6 = arg0.method2654(false);
        if (var6 == null) {
            return;
        }
        var6.method6659(arg1 - var6.field4390 / 2, arg2 - var6.field4383 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class410.method6560(arg1, arg2, 15, 16776960, 128);
            class410.method6560(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("fx.d(Lgz;IIFI)V")
    public void method3349(class199 arg0, int arg1, int arg2, float arg3) {
        class154 var5 = class154.method156(arg0.method3195());
        this.method3335(var5, arg1, arg2);
        this.method3410(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("fx.ab(Leo;III)V")
    public void method3335(class154 arg0, int arg1, int arg2) {
        class414 var4 = arg0.method2654(false);
        if (var4 != null) {
            int var5 = this.method3421(var4, arg0.field1643);
            int var6 = this.method3339(var4, arg0.field1626);
            var4.method6659(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("fx.ad(Lgz;Leo;IIFB)V")
    public void method3410(class199 arg0, class154 arg1, int arg2, int arg3, float arg4) {
        class194 var6 = arg0.method3209();
        if (var6 != null && var6.field2180.method3190(arg4)) {
            class315 var7 = (class315) this.field2068.get(var6.field2180);
            var7.method5263(var6.field2182, arg2 - var6.field2178 / 2, arg3, var6.field2178, var6.field2179, 0xFF000000 | arg1.field1631, 0, 1, 0, var7.field3847 / 2);
        }
    }

    @ObfuscatedName("fx.as(IILjava/util/HashSet;IB)V")
    public void method3344(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2066.iterator();
        while (var6.hasNext()) {
            class199 var7 = (class199) var6.next();
            if (var7.method3575()) {
                int var8 = var7.field2209.field3012 % 64;
                int var9 = var7.field2209.field3013 % 64;
                var7.field2210 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2208 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method3195())) {
                    this.method3349(var7, var7.field2210, var7.field2208, var5);
                }
            }
        }
    }

    @ObfuscatedName("fx.ak(Lon;Lfp;I)I")
    public int method3421(class414 arg0, class160 arg1) {
        switch(arg1.field1706) {
            case 0:
                return 0;
            case 2:
                return -arg0.field4390 / 2;
            default:
                return -arg0.field4390;
        }
    }

    @ObfuscatedName("fx.ah(Lon;Lfz;B)I")
    public int method3339(class414 arg0, class162 arg1) {
        switch(arg1.field1751) {
            case 0:
                return 0;
            case 1:
                return -arg0.field4383 / 2;
            default:
                return -arg0.field4383;
        }
    }

    @ObfuscatedName("fx.ay(II)Lga;")
    public class194 method3340(int arg0) {
        class154 var2 = class154.method156(arg0);
        return this.method3341(var2);
    }

    @ObfuscatedName("fx.al(Leo;I)Lga;")
    public class194 method3341(class154 arg0) {
        if (arg0.field1630 == null || this.field2068 == null || this.field2068.get(class178.field2014) == null) {
            return null;
        }
        int var2 = arg0.field1632;
        class178[] var3 = new class178[] { class178.field2017, class178.field2014, class178.field2012 };
        class178[] var4 = var3;
        int var5 = 0;
        class178 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class178 var6 = var4[var5];
            if (var6.field2015 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class315 var9 = (class315) this.field2068.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5204(arg0.field1630, 1000000);
        String[] var11 = new String[var10];
        var9.method5202(arg0.field1630, (int[]) null, var11);
        int var12 = var11.length * var9.field3847 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method5201(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class194(arg0.field1630, var13, var12, var7);
    }

    @ObfuscatedName("fx.ao(IIIIII)Ljava/util/List;")
    public List method3342(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2055.values().iterator();
            while (var7.hasNext()) {
                class199 var8 = (class199) var7.next();
                if (var8.method3575() && var8.method3573(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2066.iterator();
            while (var9.hasNext()) {
                class199 var10 = (class199) var9.next();
                if (var10.method3575() && var10.method3573(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("fx.au(S)Ljava/util/List;")
    public List method3343() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2066);
        var1.addAll(this.field2055.values());
        return var1;
    }

    @ObfuscatedName("fx.aa(IIIII)V")
    public void method3427(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class410.method6601(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, arg3);
        }
        if (var5 == 1) {
            class410.method6568(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, arg3);
        }
        if (var5 == 2) {
            class410.method6601(this.field2065 * arg0 + this.field2065 - 1, this.field2065 * (63 - arg1), this.field2065, arg3);
        }
        if (var5 == 3) {
            class410.method6568(this.field2065 * arg0, this.field2065 * (63 - arg1) + this.field2065 - 1, this.field2065, arg3);
        }
    }
}
