package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("fm")
public class class182 {

    @ObfuscatedName("fm.o")
    public static class234 field2051 = new class234(37748736, 256);

    @ObfuscatedName("fm.g")
    public int field2053;

    @ObfuscatedName("fm.z")
    public int field2061;

    @ObfuscatedName("fm.a")
    public class176 field2058;

    @ObfuscatedName("fm.u")
    public LinkedList field2055;

    @ObfuscatedName("fm.e")
    public int field2056;

    @ObfuscatedName("fm.l")
    public int field2057;

    @ObfuscatedName("fm.y")
    public List field2054;

    @ObfuscatedName("fm.v")
    public HashMap field2059;

    @ObfuscatedName("fm.f")
    public final HashMap field2060;

    @ObfuscatedName("cn.n(I)V")
    public static void method2062() {
        field2051.method4142();
    }

    @ObfuscatedName("hd.c(I)V")
    public static void method3985() {
        field2051.method4140(5);
    }

    public class182(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2053 = arg0;
        this.field2061 = arg1;
        this.field2055 = new LinkedList();
        this.field2054 = new LinkedList();
        this.field2059 = new HashMap();
        this.field2056 = arg2 | 0xFF000000;
        this.field2060 = arg3;
    }

    @ObfuscatedName("fm.m(IIII)V")
    public void method3279(int arg0, int arg1, int arg2) {
        int var4 = this.field2053;
        int var5 = this.field2061;
        int var6 = this.field2057;
        class234 var7 = field2051;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class413 var10 = (class413) var7.method4136(var8);
        if (var10 == null) {
            return;
        }
        if (this.field2057 * 64 == arg2) {
            var10.method6707(arg0, arg1);
        } else {
            var10.method6648(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("fm.k(Lfd;Ljava/util/List;B)V")
    public void method3271(class176 arg0, List arg1) {
        this.field2059.clear();
        this.field2058 = arg0;
        this.method3276(arg1);
    }

    @ObfuscatedName("fm.o(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method3272(HashSet arg0, List arg1) {
        this.field2059.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class184 var4 = (class184) var3.next();
            if (var4.method3480() == this.field2053 && var4.method3494() == this.field2061) {
                this.field2055.add(var4);
            }
        }
        this.method3276(arg1);
    }

    @ObfuscatedName("fm.g(IIIILgy;I)V")
    public void method3273(int arg0, int arg1, int arg2, int arg3, class190 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2146; var8++) {
                    class192[] var9 = arg4.field2140[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class192[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class169 var13;
                            boolean var18;
                            label58: {
                                class192 var12 = var10[var11];
                                var13 = class169.method2878(var12.field2157);
                                if (var13.field1861 != null) {
                                    int[] var14 = var13.field1861;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class169 var17 = class169.method2878(var16);
                                        if (var17.field1852 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field1852 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method3274(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.z(Lff;IIILgy;I)V")
    public void method3274(class169 arg0, int arg1, int arg2, int arg3, class190 arg4) {
        class258 var6 = new class258(arg1, this.field2053 * 64 + arg2, this.field2061 * 64 + arg3);
        Object var7 = null;
        class258 var8;
        if (this.field2058 == null) {
            class184 var9 = (class184) arg4;
            var8 = new class258(var9.field2138 + arg1, var9.field2139 * 64 + arg2 + var9.method3441() * 8, var9.field2135 * 64 + arg3 + var9.method3437() * 8);
        } else {
            var8 = new class258(this.field2058.field2138 + arg1, this.field2058.field2139 * 64 + arg2, this.field2058.field2135 * 64 + arg3);
        }
        class199 var10;
        if (arg0.field1861 == null) {
            class154 var11 = class154.method1007(arg0.field1852);
            var10 = new class187(var8, var6, var11.field1623, this.method3300(var11));
        } else {
            var10 = new class179(var8, var6, arg0.field1827, this);
        }
        class154 var12 = class154.method1007(var10.method3144());
        if (var12.field1629) {
            this.field2059.put(new class258(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("fm.a(I)V")
    public void method3275() {
        Iterator var1 = this.field2059.values().iterator();
        while (var1.hasNext()) {
            class199 var2 = (class199) var1.next();
            if (var2 instanceof class179) {
                ((class179) var2).method3154();
            }
        }
    }

    @ObfuscatedName("fm.u(Ljava/util/List;I)V")
    public void method3276(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class187 var3 = (class187) var2.next();
            if (class154.method1007(var3.field2100).field1629 && var3.field2194.field3007 >> 6 == this.field2053 && var3.field2194.field3008 >> 6 == this.field2061) {
                class187 var4 = new class187(var3.field2194, var3.field2194, var3.field2100, this.method3342(var3.field2100));
                this.field2054.add(var4);
            }
        }
    }

    @ObfuscatedName("fm.e(I)V")
    public void method3277() {
        if (this.field2058 != null) {
            this.field2058.method3493();
            return;
        }
        Iterator var1 = this.field2055.iterator();
        while (var1.hasNext()) {
            class184 var2 = (class184) var1.next();
            var2.method3493();
        }
    }

    @ObfuscatedName("fm.l(Lkk;B)Z")
    public boolean method3285(class290 arg0) {
        this.field2059.clear();
        if (this.field2058 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2055.iterator();
            while (var3.hasNext()) {
                class184 var4 = (class184) var3.next();
                var4.method3476(arg0);
                var2 &= var4.method3475();
            }
            if (var2) {
                Iterator var5 = this.field2055.iterator();
                while (var5.hasNext()) {
                    class184 var6 = (class184) var5.next();
                    this.method3273(var6.method3438() * 8, var6.method3439() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2058.method3476(arg0);
            if (this.field2058.method3475()) {
                this.method3273(0, 0, 64, 64, this.field2058);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("fm.y(ILgb;[Loi;Lkk;Lkk;B)V")
    public void method3315(int arg0, class203 arg1, class412[] arg2, class290 arg3, class290 arg4) {
        this.field2057 = arg0;
        if (this.field2058 == null && this.field2055.isEmpty()) {
            return;
        }
        int var6 = this.field2053;
        int var7 = this.field2061;
        class234 var8 = field2051;
        long var9 = (long) (arg0 << 16 | var6 << 8 | var7);
        class413 var11 = (class413) var8.method4136(var9);
        if (var11 != null) {
            return;
        }
        boolean var12 = true;
        boolean var13 = var12 & this.method3285(arg3);
        int var14;
        if (this.field2058 == null) {
            var14 = ((class190) this.field2055.getFirst()).field2141;
        } else {
            var14 = this.field2058.field2141;
        }
        boolean var15 = var13 & arg4.method4714(var14);
        if (!var15) {
            return;
        }
        byte[] var16 = arg4.method4771(var14);
        class193 var17 = class193.method4195(var16);
        class413 var18 = new class413(this.field2057 * 64, this.field2057 * 64);
        var18.method6634();
        if (this.field2058 == null) {
            this.method3283(arg1, arg2, var17);
        } else {
            this.method3282(arg1, arg2, var17);
        }
        int var19 = this.field2053;
        int var20 = this.field2061;
        int var21 = this.field2057;
        class234 var22 = field2051;
        long var24 = (long) (var21 << 16 | var19 << 8 | var20);
        var22.method4158(var18, var24, var18.field4369.length * 4);
        this.method3277();
    }

    @ObfuscatedName("fm.v(IIILjava/util/HashSet;I)V")
    public void method3280(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method3323(arg0, arg1, arg3, arg2);
        this.method3296(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("fm.f(Ljava/util/HashSet;III)V")
    public void method3281(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2059.values().iterator();
        while (var4.hasNext()) {
            class199 var5 = (class199) var4.next();
            if (var5.method3528()) {
                int var6 = var5.method3144();
                if (arg0.contains(var6)) {
                    class154 var7 = class154.method1007(var6);
                    this.method3292(var7, var5.field2199, var5.field2197, arg1, arg2);
                }
            }
        }
        this.method3291(arg0, arg1, arg2);
    }

    @ObfuscatedName("fm.s(Lgb;[Loi;Lga;B)V")
    public void method3282(class203 arg0, class412[] arg1, class193 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method3329(var4, var5, this.field2058, arg0, arg2);
                this.method3286(var4, var5, this.field2058, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method3284(var6, var7, this.field2058, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("fm.h(Lgb;[Loi;Lga;I)V")
    public void method3283(class203 arg0, class412[] arg1, class193 arg2) {
        Iterator var4 = this.field2055.iterator();
        while (var4.hasNext()) {
            class184 var5 = (class184) var4.next();
            for (int var6 = var5.method3438() * 8; var6 < var5.method3438() * 8 + 8; var6++) {
                for (int var7 = var5.method3439() * 8; var7 < var5.method3439() * 8 + 8; var7++) {
                    this.method3329(var6, var7, var5, arg0, arg2);
                    this.method3286(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2055.iterator();
        while (var8.hasNext()) {
            class184 var9 = (class184) var8.next();
            for (int var10 = var9.method3438() * 8; var10 < var9.method3438() * 8 + 8; var10++) {
                for (int var11 = var9.method3439() * 8; var11 < var9.method3439() * 8 + 8; var11++) {
                    this.method3284(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("fm.d(IILgy;Lgb;[Loi;I)V")
    public void method3284(int arg0, int arg1, class190 arg2, class203 arg3, class412[] arg4) {
        this.method3289(arg0, arg1, arg2);
        this.method3287(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("fm.q(IILgy;Lgb;Lga;I)V")
    public void method3329(int arg0, int arg1, class190 arg2, class203 arg3, class193 arg4) {
        int var6 = arg2.field2142[0][arg0][arg1] - 1;
        int var7 = arg2.field2134[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class409.method6556(this.field2057 * arg0, this.field2057 * (63 - arg1), this.field2057, this.field2057, this.field2056);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class197.method1954(var7, this.field2056);
        }
        if (var7 > -1 && arg2.field2144[0][arg0][arg1] == 0) {
            class409.method6556(this.field2057 * arg0, this.field2057 * (63 - arg1), this.field2057, this.field2057, var8);
            return;
        }
        int var9 = this.method3369(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class409.method6556(this.field2057 * arg0, this.field2057 * (63 - arg1), this.field2057, this.field2057, var9);
        } else {
            arg3.method3566(this.field2057 * arg0, this.field2057 * (63 - arg1), var9, var8, this.field2057, this.field2057, arg2.field2144[0][arg0][arg1], arg2.field2145[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("fm.j(IILgy;Lgb;B)V")
    public void method3286(int arg0, int arg1, class190 arg2, class203 arg3) {
        for (int var5 = 1; var5 < arg2.field2146; var5++) {
            int var6 = arg2.field2134[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class197.method1954(var6, this.field2056);
                if (arg2.field2144[var5][arg0][arg1] == 0) {
                    class409.method6556(this.field2057 * arg0, this.field2057 * (63 - arg1), this.field2057, this.field2057, var7);
                } else {
                    arg3.method3566(this.field2057 * arg0, this.field2057 * (63 - arg1), 0, var7, this.field2057, this.field2057, arg2.field2144[var5][arg0][arg1], arg2.field2145[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("fm.x(IILgy;Lga;I)I")
    public int method3369(int arg0, int arg1, class190 arg2, class193 arg3) {
        return arg2.field2142[0][arg0][arg1] == 0 ? this.field2056 : arg3.method3504(arg0, arg1);
    }

    @ObfuscatedName("fm.b(IILgy;[Loi;I)V")
    public void method3287(int arg0, int arg1, class190 arg2, class412[] arg3) {
        for (int var5 = 0; var5 < arg2.field2146; var5++) {
            class192[] var6 = arg2.field2140[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class192[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class192 var9 = var7[var8];
                    if (!class271.method86(var9.field2159)) {
                        int var10 = var9.field2159;
                        boolean var11 = class271.field3252.field3253 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class169 var12 = class169.method2878(var9.field2157);
                    if (var12.field1869 != -1) {
                        if (var12.field1869 == 46 || var12.field1869 == 52) {
                            arg3[var12.field1869].method6590(this.field2057 * arg0, this.field2057 * (63 - arg1), this.field2057 * 2 + 1, this.field2057 * 2 + 1);
                        } else {
                            arg3[var12.field1869].method6590(this.field2057 * arg0, this.field2057 * (63 - arg1), this.field2057 * 2, this.field2057 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.t(IILgy;I)V")
    public void method3289(int arg0, int arg1, class190 arg2) {
        for (int var4 = 0; var4 < arg2.field2146; var4++) {
            class192[] var5 = arg2.field2140[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class192[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class192 var8 = var6[var7];
                    int var9 = var8.field2159;
                    boolean var10 = var9 >= class271.field3247.field3253 && var9 <= class271.field3233.field3253 || class271.field3234.field3253 == var9;
                    if (var10) {
                        class169 var11 = class169.method2878(var8.field2157);
                        int var12 = var11.field1839 == 0 ? -3355444 : -3407872;
                        if (class271.field3247.field3253 == var8.field2159) {
                            this.method3303(arg0, arg1, var8.field2158, var12);
                        }
                        if (class271.field3232.field3253 == var8.field2159) {
                            this.method3303(arg0, arg1, var8.field2158, -3355444);
                            this.method3303(arg0, arg1, var8.field2158 + 1, var12);
                        }
                        if (class271.field3233.field3253 == var8.field2159) {
                            if (var8.field2158 == 0) {
                                class409.method6578(this.field2057 * arg0, this.field2057 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2158 == 1) {
                                class409.method6578(this.field2057 * arg0 + this.field2057 - 1, this.field2057 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2158 == 2) {
                                class409.method6578(this.field2057 * arg0 + this.field2057 - 1, this.field2057 * (63 - arg1) + this.field2057 - 1, 1, var12);
                            }
                            if (var8.field2158 == 3) {
                                class409.method6578(this.field2057 * arg0, this.field2057 * (63 - arg1) + this.field2057 - 1, 1, var12);
                            }
                        }
                        if (class271.field3234.field3253 == var8.field2159) {
                            int var13 = var8.field2158 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2057; var14++) {
                                    class409.method6578(this.field2057 * arg0 + var14, this.field2057 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2057; var15++) {
                                    class409.method6578(this.field2057 * arg0 + var15, this.field2057 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.r(IILjava/util/HashSet;II)V")
    public void method3323(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2059.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class258 var9 = (class258) var8.getKey();
            int var10 = (int) ((float) var9.field3007 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3008 * var5 - var6);
            class199 var12 = (class199) var8.getValue();
            if (var12 != null && var12.method3528()) {
                var12.field2199 = var10;
                var12.field2197 = var11;
                class154 var13 = class154.method1007(var12.method3144());
                if (!arg2.contains(var13.method2598())) {
                    this.method3362(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("fm.p(Ljava/util/HashSet;IIS)V")
    public void method3291(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2054.iterator();
        while (var4.hasNext()) {
            class199 var5 = (class199) var4.next();
            if (var5.method3528()) {
                class154 var6 = class154.method1007(var5.method3144());
                if (var6 != null && arg0.contains(var6.method2598())) {
                    this.method3292(var6, var5.field2199, var5.field2197, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("fm.w(Ler;IIIII)V")
    public void method3292(class154 arg0, int arg1, int arg2, int arg3, int arg4) {
        class413 var6 = arg0.method2602(false);
        if (var6 == null) {
            return;
        }
        var6.method6615(arg1 - var6.field4375 / 2, arg2 - var6.field4378 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class409.method6525(arg1, arg2, 15, 16776960, 128);
            class409.method6525(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("fm.i(Lgm;IIFI)V")
    public void method3362(class199 arg0, int arg1, int arg2, float arg3) {
        class154 var5 = class154.method1007(arg0.method3144());
        this.method3371(var5, arg1, arg2);
        this.method3335(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("fm.aq(Ler;III)V")
    public void method3371(class154 arg0, int arg1, int arg2) {
        class413 var4 = arg0.method2602(false);
        if (var4 != null) {
            int var5 = this.method3312(var4, arg0.field1635);
            int var6 = this.method3298(var4, arg0.field1627);
            var4.method6615(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("fm.ad(Lgm;Ler;IIFI)V")
    public void method3335(class199 arg0, class154 arg1, int arg2, int arg3, float arg4) {
        class194 var6 = arg0.method3145();
        if (var6 != null && var6.field2167.method3133(arg4)) {
            class315 var7 = (class315) this.field2060.get(var6.field2167);
            var7.method5138(var6.field2168, arg2 - var6.field2165 / 2, arg3, var6.field2165, var6.field2166, 0xFF000000 | arg1.field1626, 0, 1, 0, var7.field3837 / 2);
        }
    }

    @ObfuscatedName("fm.al(IILjava/util/HashSet;II)V")
    public void method3296(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2054.iterator();
        while (var6.hasNext()) {
            class199 var7 = (class199) var6.next();
            if (var7.method3528()) {
                int var8 = var7.field2194.field3007 % 64;
                int var9 = var7.field2194.field3008 % 64;
                var7.field2199 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2197 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method3144())) {
                    this.method3362(var7, var7.field2199, var7.field2197, var5);
                }
            }
        }
    }

    @ObfuscatedName("fm.aa(Loc;Lfs;I)I")
    public int method3312(class413 arg0, class160 arg1) {
        switch(arg1.field1701) {
            case 0:
                return 0;
            case 1:
                return -arg0.field4375 / 2;
            default:
                return -arg0.field4375;
        }
    }

    @ObfuscatedName("fm.aw(Loc;Lfc;I)I")
    public int method3298(class413 arg0, class162 arg1) {
        switch(arg1.field1746) {
            case 0:
                return -arg0.field4378 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4378;
        }
    }

    @ObfuscatedName("fm.at(IB)Lgz;")
    public class194 method3342(int arg0) {
        class154 var2 = class154.method1007(arg0);
        return this.method3300(var2);
    }

    @ObfuscatedName("fm.as(Ler;B)Lgz;")
    public class194 method3300(class154 arg0) {
        if (arg0.field1640 == null || this.field2060 == null || this.field2060.get(class178.field2004) == null) {
            return null;
        }
        class178 var2 = class178.method3134(arg0.field1628);
        if (var2 == null) {
            return null;
        }
        class315 var3 = (class315) this.field2060.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5131(arg0.field1640, 1000000);
        String[] var5 = new String[var4];
        var3.method5129(arg0.field1640, (int[]) null, var5);
        int var6 = var5.length * var3.field3837 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5128(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class194(arg0.field1640, var7, var6, var2);
    }

    @ObfuscatedName("fm.ae(IIIIII)Ljava/util/List;")
    public List method3301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2059.values().iterator();
            while (var7.hasNext()) {
                class199 var8 = (class199) var7.next();
                if (var8.method3528() && var8.method3527(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2054.iterator();
            while (var9.hasNext()) {
                class199 var10 = (class199) var9.next();
                if (var10.method3528() && var10.method3527(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("fm.av(I)Ljava/util/List;")
    public List method3302() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2054);
        var1.addAll(this.field2059.values());
        return var1;
    }

    @ObfuscatedName("fm.ak(IIIII)V")
    public void method3303(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class409.method6535(this.field2057 * arg0, this.field2057 * (63 - arg1), this.field2057, arg3);
        }
        if (var5 == 1) {
            class409.method6578(this.field2057 * arg0, this.field2057 * (63 - arg1), this.field2057, arg3);
        }
        if (var5 == 2) {
            class409.method6535(this.field2057 * arg0 + this.field2057 - 1, this.field2057 * (63 - arg1), this.field2057, arg3);
        }
        if (var5 == 3) {
            class409.method6578(this.field2057 * arg0, this.field2057 * (63 - arg1) + this.field2057 - 1, this.field2057, arg3);
        }
    }
}
