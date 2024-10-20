package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("fn")
public class class168 {

    @ObfuscatedName("fn.j")
    public static class220 field1982 = new class220(37748736, 256);

    @ObfuscatedName("fn.o")
    public int field1983;

    @ObfuscatedName("fn.m")
    public int field1990;

    @ObfuscatedName("fn.r")
    public class162 field1985;

    @ObfuscatedName("fn.h")
    public LinkedList field1986;

    @ObfuscatedName("fn.d")
    public int field1987;

    @ObfuscatedName("fn.z")
    public int field1984;

    @ObfuscatedName("fn.b")
    public List field1989;

    @ObfuscatedName("fn.i")
    public HashMap field1981;

    @ObfuscatedName("fn.k")
    public final HashMap field1991;

    @ObfuscatedName("aa.f(IIII)J")
    public static long method553(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("ay.e(B)V")
    public static void method369() {
        field1982.method3965();
    }

    public class168(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field1983 = arg0;
        this.field1990 = arg1;
        this.field1986 = new LinkedList();
        this.field1989 = new LinkedList();
        this.field1981 = new HashMap();
        this.field1987 = arg2 | 0xFF000000;
        this.field1991 = arg3;
    }

    @ObfuscatedName("fn.v(IIII)V")
    public void method3090(int arg0, int arg1, int arg2) {
        int var4 = this.field1983;
        int var5 = this.field1990;
        int var6 = this.field1984;
        class397 var7 = (class397) field1982.method3970(method553(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field1984 * 64 == arg2) {
            var7.method6284(arg0, arg1);
        } else {
            var7.method6307(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("fn.y(Lfo;Ljava/util/List;I)V")
    public void method3167(class162 arg0, List arg1) {
        this.field1981.clear();
        this.field1985 = arg0;
        this.method3096(arg1);
    }

    @ObfuscatedName("fn.j(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method3089(HashSet arg0, List arg1) {
        this.field1981.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class170 var4 = (class170) var3.next();
            if (var4.method3309() == this.field1983 && var4.method3294() == this.field1990) {
                this.field1986.add(var4);
            }
        }
        this.method3096(arg1);
    }

    @ObfuscatedName("fn.o(IIIILfy;I)V")
    public void method3110(int arg0, int arg1, int arg2, int arg3, class176 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2065; var8++) {
                    class178[] var9 = arg4.field2073[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class178[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class155 var13;
                            boolean var18;
                            label58: {
                                class178 var12 = var10[var11];
                                var13 = class155.method1864(var12.field2084);
                                if (var13.field1798 != null) {
                                    int[] var14 = var13.field1798;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class155 var17 = class155.method1864(var16);
                                        if (var17.field1788 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field1788 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method3094(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fn.m(Lez;IIILfy;B)V")
    public void method3094(class155 arg0, int arg1, int arg2, int arg3, class176 arg4) {
        class244 var6 = new class244(arg1, this.field1983 * 64 + arg2, this.field1990 * 64 + arg3);
        Object var7 = null;
        class244 var8;
        if (this.field1985 == null) {
            class170 var9 = (class170) arg4;
            var8 = new class244(var9.field2064 + arg1, var9.field2070 * 64 + arg2 + var9.method3244() * 8, var9.field2060 * 64 + arg3 + var9.method3260() * 8);
        } else {
            var8 = new class244(this.field1985.field2064 + arg1, this.field1985.field2070 * 64 + arg2, this.field1985.field2060 * 64 + arg3);
        }
        class185 var10;
        if (arg0.field1798 == null) {
            class140 var11 = class140.method4496(arg0.field1788);
            var10 = new class173(var8, var6, var11.field1575, this.method3128(var11));
        } else {
            var10 = new class165(var8, var6, arg0.field1779, this);
        }
        class140 var12 = class140.method4496(var10.method2967());
        if (var12.field1570) {
            this.field1981.put(new class244(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("fn.r(I)V")
    public void method3095() {
        Iterator var1 = this.field1981.values().iterator();
        while (var1.hasNext()) {
            class185 var2 = (class185) var1.next();
            if (var2 instanceof class165) {
                ((class165) var2).method2966();
            }
        }
    }

    @ObfuscatedName("fn.h(Ljava/util/List;I)V")
    public void method3096(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class173 var3 = (class173) var2.next();
            if (class140.method4496(var3.field2031).field1570 && var3.field2122.field2927 >> 6 == this.field1983 && var3.field2122.field2928 >> 6 == this.field1990) {
                class173 var4 = new class173(var3.field2122, var3.field2122, var3.field2031, this.method3118(var3.field2031));
                this.field1989.add(var4);
            }
        }
    }

    @ObfuscatedName("fn.d(I)V")
    public void method3097() {
        if (this.field1985 != null) {
            this.field1985.method3291();
            return;
        }
        Iterator var1 = this.field1986.iterator();
        while (var1.hasNext()) {
            class170 var2 = (class170) var1.next();
            var2.method3291();
        }
    }

    @ObfuscatedName("fn.z(Ljp;B)Z")
    public boolean method3098(class276 arg0) {
        this.field1981.clear();
        if (this.field1985 == null) {
            boolean var2 = true;
            Iterator var3 = this.field1986.iterator();
            while (var3.hasNext()) {
                class170 var4 = (class170) var3.next();
                var4.method3290(arg0);
                var2 &= var4.method3314();
            }
            if (var2) {
                Iterator var5 = this.field1986.iterator();
                while (var5.hasNext()) {
                    class170 var6 = (class170) var5.next();
                    this.method3110(var6.method3251() * 8, var6.method3247() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field1985.method3290(arg0);
            if (this.field1985.method3314()) {
                this.method3110(0, 0, 64, 64, this.field1985);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("fn.b(ILgs;[Lof;Ljp;Ljp;B)V")
    public void method3099(int arg0, class189 arg1, class396[] arg2, class276 arg3, class276 arg4) {
        this.field1984 = arg0;
        if (this.field1985 == null && this.field1986.isEmpty()) {
            return;
        }
        int var6 = this.field1983;
        int var7 = this.field1990;
        class397 var8 = (class397) field1982.method3970(method553(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method3098(arg3);
        int var11;
        if (this.field1985 == null) {
            var11 = ((class176) this.field1986.getFirst()).field2066;
        } else {
            var11 = this.field1985.field2066;
        }
        boolean var12 = var10 & arg4.method4569(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method4511(var11);
        class179 var14;
        if (var13 == null) {
            var14 = new class179();
        } else {
            var14 = new class179(Statics.method2311(var13).field4263);
        }
        class397 var16 = new class397(this.field1984 * 64, this.field1984 * 64);
        var16.method6277();
        if (this.field1985 == null) {
            this.method3103(arg1, arg2, var14);
        } else {
            this.method3102(arg1, arg2, var14);
        }
        int var17 = this.field1983;
        int var18 = this.field1990;
        int var19 = this.field1984;
        field1982.method3963(var16, method553(var17, var18, var19), var16.field4263.length * 4);
        this.method3097();
    }

    @ObfuscatedName("fn.i(IIILjava/util/HashSet;B)V")
    public void method3100(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method3159(arg0, arg1, arg3, arg2);
        this.method3115(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("fn.k(Ljava/util/HashSet;III)V")
    public void method3101(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field1981.values().iterator();
        while (var4.hasNext()) {
            class185 var5 = (class185) var4.next();
            if (var5.method3335()) {
                int var6 = var5.method2967();
                if (arg0.contains(var6)) {
                    class140 var7 = class140.method4496(var6);
                    this.method3111(var7, var5.field2123, var5.field2124, arg1, arg2);
                }
            }
        }
        this.method3171(arg0, arg1, arg2);
    }

    @ObfuscatedName("fn.g(Lgs;[Lof;Lfk;B)V")
    public void method3102(class189 arg0, class396[] arg1, class179 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method3105(var4, var5, this.field1985, arg0, arg2);
                this.method3106(var4, var5, this.field1985, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method3104(var6, var7, this.field1985, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("fn.t(Lgs;[Lof;Lfk;B)V")
    public void method3103(class189 arg0, class396[] arg1, class179 arg2) {
        Iterator var4 = this.field1986.iterator();
        while (var4.hasNext()) {
            class170 var5 = (class170) var4.next();
            for (int var6 = var5.method3251() * 8; var6 < var5.method3251() * 8 + 8; var6++) {
                for (int var7 = var5.method3247() * 8; var7 < var5.method3247() * 8 + 8; var7++) {
                    this.method3105(var6, var7, var5, arg0, arg2);
                    this.method3106(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field1986.iterator();
        while (var8.hasNext()) {
            class170 var9 = (class170) var8.next();
            for (int var10 = var9.method3251() * 8; var10 < var9.method3251() * 8 + 8; var10++) {
                for (int var11 = var9.method3247() * 8; var11 < var9.method3247() * 8 + 8; var11++) {
                    this.method3104(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("fn.x(IILfy;Lgs;[Lof;B)V")
    public void method3104(int arg0, int arg1, class176 arg2, class189 arg3, class396[] arg4) {
        this.method3109(arg0, arg1, arg2);
        this.method3108(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("fn.u(IILfy;Lgs;Lfk;I)V")
    public void method3105(int arg0, int arg1, class176 arg2, class189 arg3, class179 arg4) {
        int var6 = arg2.field2068[0][arg0][arg1] - 1;
        int var7 = arg2.field2071[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class393.method6184(this.field1984 * arg0, this.field1984 * (63 - arg1), this.field1984, this.field1984, this.field1987);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field1987;
            class157 var10 = class157.method3287(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field1870 >= 0) {
                var11 = var10.field1870 | 0xFF000000;
            } else if (var10.field1872 >= 0) {
                int var12 = class183.method3325(Statics.field2284.method3804(var10.field1872), 96);
                var11 = class197.field2277[var12] | 0xFF000000;
            } else if (var10.field1874 == 16711935) {
                var11 = var9;
            } else {
                int var13 = class183.method2064(var10.field1871, var10.field1867, var10.field1873);
                int var14 = class183.method3325(var13, 96);
                var11 = class197.field2277[var14] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field2069[0][arg0][arg1] == 0) {
            class393.method6184(this.field1984 * arg0, this.field1984 * (63 - arg1), this.field1984, this.field1984, var8);
            return;
        }
        int var15 = this.method3107(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class393.method6184(this.field1984 * arg0, this.field1984 * (63 - arg1), this.field1984, this.field1984, var15);
        } else {
            arg3.method3361(this.field1984 * arg0, this.field1984 * (63 - arg1), var15, var8, this.field1984, this.field1984, arg2.field2069[0][arg0][arg1], arg2.field2075[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("fn.q(IILfy;Lgs;B)V")
    public void method3106(int arg0, int arg1, class176 arg2, class189 arg3) {
        for (int var5 = 1; var5 < arg2.field2065; var5++) {
            int var6 = arg2.field2071[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field1987;
                class157 var8 = class157.method3287(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field1870 >= 0) {
                    var9 = var8.field1870 | 0xFF000000;
                } else if (var8.field1872 >= 0) {
                    int var10 = class183.method3325(Statics.field2284.method3804(var8.field1872), 96);
                    var9 = class197.field2277[var10] | 0xFF000000;
                } else if (var8.field1874 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = class183.method2064(var8.field1871, var8.field1867, var8.field1873);
                    int var12 = class183.method3325(var11, 96);
                    var9 = class197.field2277[var12] | 0xFF000000;
                }
                if (arg2.field2069[var5][arg0][arg1] == 0) {
                    class393.method6184(this.field1984 * arg0, this.field1984 * (63 - arg1), this.field1984, this.field1984, var9);
                } else {
                    arg3.method3361(this.field1984 * arg0, this.field1984 * (63 - arg1), 0, var9, this.field1984, this.field1984, arg2.field2069[var5][arg0][arg1], arg2.field2075[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("fn.s(IILfy;Lfk;B)I")
    public int method3107(int arg0, int arg1, class176 arg2, class179 arg3) {
        return arg2.field2068[0][arg0][arg1] == 0 ? this.field1987 : arg3.method3319(arg0, arg1);
    }

    @ObfuscatedName("fn.p(IILfy;[Lof;I)V")
    public void method3108(int arg0, int arg1, class176 arg2, class396[] arg3) {
        for (int var5 = 0; var5 < arg2.field2065; var5++) {
            class178[] var6 = arg2.field2073[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class178[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class178 var9 = var7[var8];
                    int var10 = var9.field2083;
                    boolean var11 = var10 >= class257.field3155.field3154 && var10 <= class257.field3168.field3154;
                    if (var11 || class257.method221(var9.field2083)) {
                        class155 var12 = class155.method1864(var9.field2084);
                        if (var12.field1757 != -1) {
                            if (var12.field1757 == 46 || var12.field1757 == 52) {
                                arg3[var12.field1757].method6258(this.field1984 * arg0, this.field1984 * (63 - arg1), this.field1984 * 2 + 1, this.field1984 * 2 + 1);
                            } else {
                                arg3[var12.field1757].method6258(this.field1984 * arg0, this.field1984 * (63 - arg1), this.field1984 * 2, this.field1984 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fn.c(IILfy;B)V")
    public void method3109(int arg0, int arg1, class176 arg2) {
        for (int var4 = 0; var4 < arg2.field2065; var4++) {
            class178[] var5 = arg2.field2073[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class178[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class178 var8 = var6[var7];
                    if (class257.method1801(var8.field2083)) {
                        class155 var9 = class155.method1864(var8.field2084);
                        int var10 = var9.field1776 == 0 ? -3355444 : -3407872;
                        if (class257.field3161.field3154 == var8.field2083) {
                            this.method3122(arg0, arg1, var8.field2082, var10);
                        }
                        if (class257.field3149.field3154 == var8.field2083) {
                            this.method3122(arg0, arg1, var8.field2082, -3355444);
                            this.method3122(arg0, arg1, var8.field2082 + 1, var10);
                        }
                        if (class257.field3171.field3154 == var8.field2083) {
                            if (var8.field2082 == 0) {
                                class393.method6232(this.field1984 * arg0, this.field1984 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2082 == 1) {
                                class393.method6232(this.field1984 * arg0 + this.field1984 - 1, this.field1984 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2082 == 2) {
                                class393.method6232(this.field1984 * arg0 + this.field1984 - 1, this.field1984 * (63 - arg1) + this.field1984 - 1, 1, var10);
                            }
                            if (var8.field2082 == 3) {
                                class393.method6232(this.field1984 * arg0, this.field1984 * (63 - arg1) + this.field1984 - 1, 1, var10);
                            }
                        }
                        if (class257.field3151.field3154 == var8.field2083) {
                            int var11 = var8.field2082 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field1984; var12++) {
                                    class393.method6232(this.field1984 * arg0 + var12, this.field1984 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field1984; var13++) {
                                    class393.method6232(this.field1984 * arg0 + var13, this.field1984 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fn.n(IILjava/util/HashSet;IB)V")
    public void method3159(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field1981.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class244 var9 = (class244) var8.getKey();
            int var10 = (int) ((float) var9.field2927 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2928 * var5 - var6);
            class185 var12 = (class185) var8.getValue();
            if (var12 != null && var12.method3335()) {
                var12.field2123 = var10;
                var12.field2124 = var11;
                class140 var13 = class140.method4496(var12.method2967());
                if (!arg2.contains(var13.method2437())) {
                    this.method3112(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("fn.l(Ljava/util/HashSet;III)V")
    public void method3171(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field1989.iterator();
        while (var4.hasNext()) {
            class185 var5 = (class185) var4.next();
            if (var5.method3335()) {
                class140 var6 = class140.method4496(var5.method2967());
                if (var6 != null && arg0.contains(var6.method2437())) {
                    this.method3111(var6, var5.field2123, var5.field2124, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("fn.w(Lek;IIIII)V")
    public void method3111(class140 arg0, int arg1, int arg2, int arg3, int arg4) {
        class397 var6 = arg0.method2433(false);
        if (var6 == null) {
            return;
        }
        var6.method6352(arg1 - var6.field4262 / 2, arg2 - var6.field4254 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class393.method6182(arg1, arg2, 15, 16776960, 128);
            class393.method6182(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("fn.a(Lgh;IIFB)V")
    public void method3112(class185 arg0, int arg1, int arg2, float arg3) {
        class140 var5 = class140.method4496(arg0.method2967());
        this.method3160(var5, arg1, arg2);
        this.method3114(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("fn.aw(Lek;III)V")
    public void method3160(class140 arg0, int arg1, int arg2) {
        class397 var4 = arg0.method2433(false);
        if (var4 != null) {
            int var5 = this.method3116(var4, arg0.field1576);
            int var6 = this.method3092(var4, arg0.field1577);
            var4.method6352(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("fn.ak(Lgh;Lek;IIFI)V")
    public void method3114(class185 arg0, class140 arg1, int arg2, int arg3, float arg4) {
        class180 var6 = arg0.method2978();
        if (var6 != null && var6.field2099.method2961(arg4)) {
            class301 var7 = (class301) this.field1991.get(var6.field2099);
            var7.method4897(var6.field2100, arg2 - var6.field2097 / 2, arg3, var6.field2097, var6.field2098, 0xFF000000 | arg1.field1564, 0, 1, 0, var7.field3728 / 2);
        }
    }

    @ObfuscatedName("fn.ad(IILjava/util/HashSet;II)V")
    public void method3115(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field1989.iterator();
        while (var6.hasNext()) {
            class185 var7 = (class185) var6.next();
            if (var7.method3335()) {
                int var8 = var7.field2122.field2927 % 64;
                int var9 = var7.field2122.field2928 % 64;
                var7.field2123 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2124 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method2967())) {
                    this.method3112(var7, var7.field2123, var7.field2124, var5);
                }
            }
        }
    }

    @ObfuscatedName("fn.at(Loa;Leq;I)I")
    public int method3116(class397 arg0, class146 arg1) {
        switch(arg1.field1635) {
            case 1:
                return 0;
            case 2:
                return -arg0.field4262 / 2;
            default:
                return -arg0.field4262;
        }
    }

    @ObfuscatedName("fn.ah(Loa;Lee;I)I")
    public int method3092(class397 arg0, class148 arg1) {
        switch(arg1.field1678) {
            case 0:
                return -arg0.field4254 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4254;
        }
    }

    @ObfuscatedName("fn.az(IB)Lfd;")
    public class180 method3118(int arg0) {
        class140 var2 = class140.method4496(arg0);
        return this.method3128(var2);
    }

    @ObfuscatedName("fn.ap(Lek;I)Lfd;")
    public class180 method3128(class140 arg0) {
        if (arg0.field1563 == null || this.field1991 == null || this.field1991.get(class164.field1942) == null) {
            return null;
        }
        class164 var2 = class164.method2964(arg0.field1565);
        if (var2 == null) {
            return null;
        }
        class301 var3 = (class301) this.field1991.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4892(arg0.field1563, 1000000);
        String[] var5 = new String[var4];
        var3.method4890(arg0.field1563, (int[]) null, var5);
        int var6 = var5.length * var3.field3728 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4889(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class180(arg0.field1563, var7, var6, var2);
    }

    @ObfuscatedName("fn.ag(IIIIIB)Ljava/util/List;")
    public List method3120(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field1981.values().iterator();
            while (var7.hasNext()) {
                class185 var8 = (class185) var7.next();
                if (var8.method3335() && var8.method3347(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field1989.iterator();
            while (var9.hasNext()) {
                class185 var10 = (class185) var9.next();
                if (var10.method3335() && var10.method3347(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("fn.ab(I)Ljava/util/List;")
    public List method3121() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field1989);
        var1.addAll(this.field1981.values());
        return var1;
    }

    @ObfuscatedName("fn.aq(IIIII)V")
    public void method3122(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class393.method6190(this.field1984 * arg0, this.field1984 * (63 - arg1), this.field1984, arg3);
        }
        if (var5 == 1) {
            class393.method6232(this.field1984 * arg0, this.field1984 * (63 - arg1), this.field1984, arg3);
        }
        if (var5 == 2) {
            class393.method6190(this.field1984 * arg0 + this.field1984 - 1, this.field1984 * (63 - arg1), this.field1984, arg3);
        }
        if (var5 == 3) {
            class393.method6232(this.field1984 * arg0, this.field1984 * (63 - arg1) + this.field1984 - 1, this.field1984, arg3);
        }
    }
}
