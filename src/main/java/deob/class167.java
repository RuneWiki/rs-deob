package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("fq")
public class class167 {

    @ObfuscatedName("fq.p")
    public static class219 field1974 = new class219(37748736, 256);

    @ObfuscatedName("fq.j")
    public int field1977;

    @ObfuscatedName("fq.r")
    public int field1979;

    @ObfuscatedName("fq.b")
    public class161 field1980;

    @ObfuscatedName("fq.d")
    public LinkedList field1981;

    @ObfuscatedName("fq.s")
    public int field1978;

    @ObfuscatedName("fq.u")
    public int field1983;

    @ObfuscatedName("fq.l")
    public List field1986;

    @ObfuscatedName("fq.o")
    public HashMap field1985;

    @ObfuscatedName("fq.c")
    public final HashMap field1976;

    @ObfuscatedName("b.v(IIII)Loh;")
    public static class396 method58(int arg0, int arg1, int arg2) {
        class219 var3 = field1974;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class396) var3.method3911(var4);
    }

    public class167(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field1977 = arg0;
        this.field1979 = arg1;
        this.field1981 = new LinkedList();
        this.field1986 = new LinkedList();
        this.field1985 = new HashMap();
        this.field1978 = arg2 | 0xFF000000;
        this.field1976 = arg3;
    }

    @ObfuscatedName("fq.n(IIII)V")
    public void method3083(int arg0, int arg1, int arg2) {
        int var4 = this.field1977;
        int var5 = this.field1979;
        int var6 = this.field1983;
        class219 var7 = field1974;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class396 var10 = (class396) var7.method3911(var8);
        if (var10 == null) {
            return;
        }
        if (this.field1983 * 64 == arg2) {
            var10.method6353(arg0, arg1);
        } else {
            var10.method6420(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("fq.f(Lft;Ljava/util/List;I)V")
    public void method3084(class161 arg0, List arg1) {
        this.field1985.clear();
        this.field1980 = arg0;
        this.method3089(arg1);
    }

    @ObfuscatedName("fq.y(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method3085(HashSet arg0, List arg1) {
        this.field1985.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class169 var4 = (class169) var3.next();
            if (var4.method3304() == this.field1977 && var4.method3305() == this.field1979) {
                this.field1981.add(var4);
            }
        }
        this.method3089(arg1);
    }

    @ObfuscatedName("fq.p(IIIILfm;I)V")
    public void method3212(int arg0, int arg1, int arg2, int arg3, class175 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2061; var8++) {
                    class177[] var9 = arg4.field2057[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class177[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class154 var13;
                            boolean var18;
                            label58: {
                                class177 var12 = var10[var11];
                                var13 = class154.method175(var12.field2079);
                                if (var13.field1794 != null) {
                                    int[] var14 = var13.field1794;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class154 var17 = class154.method175(var16);
                                        if (var17.field1767 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field1767 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method3154(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fq.j(Leg;IIILfm;I)V")
    public void method3154(class154 arg0, int arg1, int arg2, int arg3, class175 arg4) {
        class243 var6 = new class243(arg1, this.field1977 * 64 + arg2, this.field1979 * 64 + arg3);
        Object var7 = null;
        class243 var8;
        if (this.field1980 == null) {
            class169 var9 = (class169) arg4;
            var8 = new class243(var9.field2060 + arg1, var9.field2056 * 64 + arg2 + var9.method3252() * 8, var9.field2063 * 64 + arg3 + var9.method3253() * 8);
        } else {
            var8 = new class243(this.field1980.field2060 + arg1, this.field1980.field2056 * 64 + arg2, this.field1980.field2063 * 64 + arg3);
        }
        class184 var10;
        if (arg0.field1794 == null) {
            class139 var11 = class139.method52(arg0.field1767);
            var10 = new class172(var8, var6, var11.field1560, this.method3113(var11));
        } else {
            var10 = new class164(var8, var6, arg0.field1760, this);
        }
        class139 var12 = class139.method52(var10.method2989());
        if (var12.field1561) {
            this.field1985.put(new class243(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("fq.r(S)V")
    public void method3088() {
        Iterator var1 = this.field1985.values().iterator();
        while (var1.hasNext()) {
            class184 var2 = (class184) var1.next();
            if (var2 instanceof class164) {
                ((class164) var2).method2979();
            }
        }
    }

    @ObfuscatedName("fq.b(Ljava/util/List;I)V")
    public void method3089(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class172 var3 = (class172) var2.next();
            if (class139.method52(var3.field2027).field1561 && var3.field2131.field2926 >> 6 == this.field1977 && var3.field2131.field2925 >> 6 == this.field1979) {
                class172 var4 = new class172(var3.field2131, var3.field2131, var3.field2027, this.method3112(var3.field2027));
                this.field1986.add(var4);
            }
        }
    }

    @ObfuscatedName("fq.d(I)V")
    public void method3143() {
        if (this.field1980 != null) {
            this.field1980.method3296();
            return;
        }
        Iterator var1 = this.field1981.iterator();
        while (var1.hasNext()) {
            class169 var2 = (class169) var1.next();
            var2.method3296();
        }
    }

    @ObfuscatedName("fq.s(Ljv;S)Z")
    public boolean method3096(class275 arg0) {
        this.field1985.clear();
        if (this.field1980 == null) {
            boolean var2 = true;
            Iterator var3 = this.field1981.iterator();
            while (var3.hasNext()) {
                class169 var4 = (class169) var3.next();
                var4.method3298(arg0);
                var2 &= var4.method3297();
            }
            if (var2) {
                Iterator var5 = this.field1981.iterator();
                while (var5.hasNext()) {
                    class169 var6 = (class169) var5.next();
                    this.method3212(var6.method3254() * 8, var6.method3248() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field1980.method3298(arg0);
            if (this.field1980.method3297()) {
                this.method3212(0, 0, 64, 64, this.field1980);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("fq.u(ILgb;[Lop;Ljv;Ljv;I)V")
    public void method3092(int arg0, class188 arg1, class395[] arg2, class275 arg3, class275 arg4) {
        this.field1983 = arg0;
        if (this.field1980 == null && this.field1981.isEmpty() || method58(this.field1977, this.field1979, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method3096(arg3);
        int var8;
        if (this.field1980 == null) {
            var8 = ((class175) this.field1981.getFirst()).field2071;
        } else {
            var8 = this.field1980.field2071;
        }
        boolean var9 = var7 & arg4.method4493(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method4474(var8);
        class178 var11 = Statics.method1726(var10);
        class396 var12 = new class396(this.field1983 * 64, this.field1983 * 64);
        var12.method6346();
        if (this.field1980 == null) {
            this.method3210(arg1, arg2, var11);
        } else {
            this.method3095(arg1, arg2, var11);
        }
        int var13 = this.field1977;
        int var14 = this.field1979;
        int var15 = this.field1983;
        class219 var16 = field1974;
        long var18 = (long) (var15 << 16 | var13 << 8 | var14);
        var16.method3913(var12, var18, var12.field4247.length * 4);
        this.method3143();
    }

    @ObfuscatedName("fq.l(IIILjava/util/HashSet;I)V")
    public void method3108(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method3103(arg0, arg1, arg3, arg2);
        this.method3109(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("fq.o(Ljava/util/HashSet;III)V")
    public void method3094(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field1985.values().iterator();
        while (var4.hasNext()) {
            class184 var5 = (class184) var4.next();
            if (var5.method3340()) {
                int var6 = var5.method2989();
                if (arg0.contains(var6)) {
                    class139 var7 = class139.method52(var6);
                    this.method3168(var7, var5.field2130, var5.field2128, arg1, arg2);
                }
            }
        }
        this.method3104(arg0, arg1, arg2);
    }

    @ObfuscatedName("fq.c(Lgb;[Lop;Lfd;I)V")
    public void method3095(class188 arg0, class395[] arg1, class178 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method3098(var4, var5, this.field1980, arg0, arg2);
                this.method3099(var4, var5, this.field1980, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method3165(var6, var7, this.field1980, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("fq.e(Lgb;[Lop;Lfd;B)V")
    public void method3210(class188 arg0, class395[] arg1, class178 arg2) {
        Iterator var4 = this.field1981.iterator();
        while (var4.hasNext()) {
            class169 var5 = (class169) var4.next();
            for (int var6 = var5.method3254() * 8; var6 < var5.method3254() * 8 + 8; var6++) {
                for (int var7 = var5.method3248() * 8; var7 < var5.method3248() * 8 + 8; var7++) {
                    this.method3098(var6, var7, var5, arg0, arg2);
                    this.method3099(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field1981.iterator();
        while (var8.hasNext()) {
            class169 var9 = (class169) var8.next();
            for (int var10 = var9.method3254() * 8; var10 < var9.method3254() * 8 + 8; var10++) {
                for (int var11 = var9.method3248() * 8; var11 < var9.method3248() * 8 + 8; var11++) {
                    this.method3165(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("fq.g(IILfm;Lgb;[Lop;B)V")
    public void method3165(int arg0, int arg1, class175 arg2, class188 arg3, class395[] arg4) {
        this.method3102(arg0, arg1, arg2);
        this.method3101(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("fq.a(IILfm;Lgb;Lfd;I)V")
    public void method3098(int arg0, int arg1, class175 arg2, class188 arg3, class178 arg4) {
        int var6 = arg2.field2064[0][arg0][arg1] - 1;
        int var7 = arg2.field2065[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class392.method6265(this.field1983 * arg0, this.field1983 * (63 - arg1), this.field1983, this.field1983, this.field1978);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field1978;
            class156 var10 = class156.method685(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field1865 >= 0) {
                var11 = var10.field1865 | 0xFF000000;
            } else if (var10.field1863 >= 0) {
                int var12 = class182.method3292(Statics.field2282.method3757(var10.field1863), 96);
                var11 = class196.field2273[var12] | 0xFF000000;
            } else if (var10.field1866 == 16711935) {
                var11 = var9;
            } else {
                int var13 = var10.field1862;
                int var14 = var10.field1868;
                int var15 = var10.field1873;
                if (var15 > 179) {
                    var14 /= 2;
                }
                if (var15 > 192) {
                    var14 /= 2;
                }
                if (var15 > 217) {
                    var14 /= 2;
                }
                if (var15 > 243) {
                    var14 /= 2;
                }
                int var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
                int var19 = class182.method3292(var16, 96);
                var11 = class196.field2273[var19] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field2068[0][arg0][arg1] == 0) {
            class392.method6265(this.field1983 * arg0, this.field1983 * (63 - arg1), this.field1983, this.field1983, var8);
            return;
        }
        int var20 = this.method3100(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class392.method6265(this.field1983 * arg0, this.field1983 * (63 - arg1), this.field1983, this.field1983, var20);
        } else {
            arg3.method3365(this.field1983 * arg0, this.field1983 * (63 - arg1), var20, var8, this.field1983, this.field1983, arg2.field2068[0][arg0][arg1], arg2.field2066[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("fq.k(IILfm;Lgb;B)V")
    public void method3099(int arg0, int arg1, class175 arg2, class188 arg3) {
        for (int var5 = 1; var5 < arg2.field2061; var5++) {
            int var6 = arg2.field2065[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field1978;
                class156 var8 = class156.method685(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field1865 >= 0) {
                    var9 = var8.field1865 | 0xFF000000;
                } else if (var8.field1863 >= 0) {
                    int var10 = class182.method3292(Statics.field2282.method3757(var8.field1863), 96);
                    var9 = class196.field2273[var10] | 0xFF000000;
                } else if (var8.field1866 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = var8.field1862;
                    int var12 = var8.field1868;
                    int var13 = var8.field1873;
                    if (var13 > 179) {
                        var12 /= 2;
                    }
                    if (var13 > 192) {
                        var12 /= 2;
                    }
                    if (var13 > 217) {
                        var12 /= 2;
                    }
                    if (var13 > 243) {
                        var12 /= 2;
                    }
                    int var14 = var13 / 2 + (var11 / 4 << 10) + (var12 / 32 << 7);
                    int var17 = class182.method3292(var14, 96);
                    var9 = class196.field2273[var17] | 0xFF000000;
                }
                if (arg2.field2068[var5][arg0][arg1] == 0) {
                    class392.method6265(this.field1983 * arg0, this.field1983 * (63 - arg1), this.field1983, this.field1983, var9);
                } else {
                    arg3.method3365(this.field1983 * arg0, this.field1983 * (63 - arg1), 0, var9, this.field1983, this.field1983, arg2.field2068[var5][arg0][arg1], arg2.field2066[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("fq.m(IILfm;Lfd;I)I")
    public int method3100(int arg0, int arg1, class175 arg2, class178 arg3) {
        return arg2.field2064[0][arg0][arg1] == 0 ? this.field1978 : arg3.method3327(arg0, arg1);
    }

    @ObfuscatedName("fq.x(IILfm;[Lop;I)V")
    public void method3101(int arg0, int arg1, class175 arg2, class395[] arg3) {
        for (int var5 = 0; var5 < arg2.field2061; var5++) {
            class177[] var6 = arg2.field2057[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class177[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class177 var9 = var7[var8];
                    if (!class256.method3975(var9.field2080)) {
                        int var10 = var9.field2080;
                        boolean var11 = class256.field3155.field3166 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class154 var12 = class154.method175(var9.field2079);
                    if (var12.field1782 != -1) {
                        if (var12.field1782 == 46 || var12.field1782 == 52) {
                            arg3[var12.field1782].method6340(this.field1983 * arg0, this.field1983 * (63 - arg1), this.field1983 * 2 + 1, this.field1983 * 2 + 1);
                        } else {
                            arg3[var12.field1782].method6340(this.field1983 * arg0, this.field1983 * (63 - arg1), this.field1983 * 2, this.field1983 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fq.z(IILfm;I)V")
    public void method3102(int arg0, int arg1, class175 arg2) {
        for (int var4 = 0; var4 < arg2.field2061; var4++) {
            class177[] var5 = arg2.field2057[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class177[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class177 var8 = var6[var7];
                    if (class256.method4388(var8.field2080)) {
                        class154 var9 = class154.method175(var8.field2079);
                        int var10 = var9.field1772 == 0 ? -3355444 : -3407872;
                        if (class256.field3150.field3166 == var8.field2080) {
                            this.method3116(arg0, arg1, var8.field2084, var10);
                        }
                        if (class256.field3168.field3166 == var8.field2080) {
                            this.method3116(arg0, arg1, var8.field2084, -3355444);
                            this.method3116(arg0, arg1, var8.field2084 + 1, var10);
                        }
                        if (class256.field3146.field3166 == var8.field2080) {
                            if (var8.field2084 == 0) {
                                class392.method6309(this.field1983 * arg0, this.field1983 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2084 == 1) {
                                class392.method6309(this.field1983 * arg0 + this.field1983 - 1, this.field1983 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2084 == 2) {
                                class392.method6309(this.field1983 * arg0 + this.field1983 - 1, this.field1983 * (63 - arg1) + this.field1983 - 1, 1, var10);
                            }
                            if (var8.field2084 == 3) {
                                class392.method6309(this.field1983 * arg0, this.field1983 * (63 - arg1) + this.field1983 - 1, 1, var10);
                            }
                        }
                        if (class256.field3147.field3166 == var8.field2080) {
                            int var11 = var8.field2084 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field1983; var12++) {
                                    class392.method6309(this.field1983 * arg0 + var12, this.field1983 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field1983; var13++) {
                                    class392.method6309(this.field1983 * arg0 + var13, this.field1983 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fq.w(IILjava/util/HashSet;II)V")
    public void method3103(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field1985.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class243 var9 = (class243) var8.getKey();
            int var10 = (int) ((float) var9.field2926 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2925 * var5 - var6);
            class184 var12 = (class184) var8.getValue();
            if (var12 != null && var12.method3340()) {
                var12.field2130 = var10;
                var12.field2128 = var11;
                class139 var13 = class139.method52(var12.method2989());
                if (!arg2.contains(var13.method2401())) {
                    this.method3106(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("fq.t(Ljava/util/HashSet;III)V")
    public void method3104(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field1986.iterator();
        while (var4.hasNext()) {
            class184 var5 = (class184) var4.next();
            if (var5.method3340()) {
                class139 var6 = class139.method52(var5.method2989());
                if (var6 != null && arg0.contains(var6.method2401())) {
                    this.method3168(var6, var5.field2130, var5.field2128, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("fq.h(Lew;IIIII)V")
    public void method3168(class139 arg0, int arg1, int arg2, int arg3, int arg4) {
        class396 var6 = arg0.method2400(false);
        if (var6 == null) {
            return;
        }
        var6.method6355(arg1 - var6.field4253 / 2, arg2 - var6.field4245 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class392.method6261(arg1, arg2, 15, 16776960, 128);
            class392.method6261(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("fq.q(Lgq;IIFI)V")
    public void method3106(class184 arg0, int arg1, int arg2, float arg3) {
        class139 var5 = class139.method52(arg0.method2989());
        this.method3204(var5, arg1, arg2);
        this.method3097(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("fq.i(Lew;III)V")
    public void method3204(class139 arg0, int arg1, int arg2) {
        class396 var4 = arg0.method2400(false);
        if (var4 != null) {
            int var5 = this.method3146(var4, arg0.field1570);
            int var6 = this.method3111(var4, arg0.field1556);
            var4.method6355(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("fq.ae(Lgq;Lew;IIFS)V")
    public void method3097(class184 arg0, class139 arg1, int arg2, int arg3, float arg4) {
        class179 var6 = arg0.method2993();
        if (var6 != null && var6.field2096.method2970(arg4)) {
            class300 var7 = (class300) this.field1976.get(var6.field2096);
            var7.method4905(var6.field2095, arg2 - var6.field2093 / 2, arg3, var6.field2093, var6.field2094, 0xFF000000 | arg1.field1558, 0, 1, 0, var7.field3730 / 2);
        }
    }

    @ObfuscatedName("fq.ap(IILjava/util/HashSet;II)V")
    public void method3109(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field1986.iterator();
        while (var6.hasNext()) {
            class184 var7 = (class184) var6.next();
            if (var7.method3340()) {
                int var8 = var7.field2131.field2926 % 64;
                int var9 = var7.field2131.field2925 % 64;
                var7.field2130 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2128 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method2989())) {
                    this.method3106(var7, var7.field2130, var7.field2128, var5);
                }
            }
        }
    }

    @ObfuscatedName("fq.ab(Loh;Len;I)I")
    public int method3146(class396 arg0, class145 arg1) {
        switch(arg1.field1626) {
            case 0:
                return -arg0.field4253 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field4253;
        }
    }

    @ObfuscatedName("fq.al(Loh;Lem;I)I")
    public int method3111(class396 arg0, class147 arg1) {
        switch(arg1.field1674) {
            case 0:
                return 0;
            case 1:
                return -arg0.field4245 / 2;
            default:
                return -arg0.field4245;
        }
    }

    @ObfuscatedName("fq.ad(II)Lfv;")
    public class179 method3112(int arg0) {
        class139 var2 = class139.method52(arg0);
        return this.method3113(var2);
    }

    @ObfuscatedName("fq.ai(Lew;I)Lfv;")
    public class179 method3113(class139 arg0) {
        if (arg0.field1557 == null || this.field1976 == null || this.field1976.get(class163.field1928) == null) {
            return null;
        }
        class163 var2 = class163.method2963(arg0.field1552);
        if (var2 == null) {
            return null;
        }
        class300 var3 = (class300) this.field1976.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4889(arg0.field1557, 1000000);
        String[] var5 = new String[var4];
        var3.method4887(arg0.field1557, (int[]) null, var5);
        int var6 = var5.length * var3.field3730 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4906(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class179(arg0.field1557, var7, var6, var2);
    }

    @ObfuscatedName("fq.ar(IIIIII)Ljava/util/List;")
    public List method3114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field1985.values().iterator();
            while (var7.hasNext()) {
                class184 var8 = (class184) var7.next();
                if (var8.method3340() && var8.method3349(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field1986.iterator();
            while (var9.hasNext()) {
                class184 var10 = (class184) var9.next();
                if (var10.method3340() && var10.method3349(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("fq.ag(I)Ljava/util/List;")
    public List method3163() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field1986);
        var1.addAll(this.field1985.values());
        return var1;
    }

    @ObfuscatedName("fq.ax(IIIII)V")
    public void method3116(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class392.method6258(this.field1983 * arg0, this.field1983 * (63 - arg1), this.field1983, arg3);
        }
        if (var5 == 1) {
            class392.method6309(this.field1983 * arg0, this.field1983 * (63 - arg1), this.field1983, arg3);
        }
        if (var5 == 2) {
            class392.method6258(this.field1983 * arg0 + this.field1983 - 1, this.field1983 * (63 - arg1), this.field1983, arg3);
        }
        if (var5 == 3) {
            class392.method6309(this.field1983 * arg0, this.field1983 * (63 - arg1) + this.field1983 - 1, this.field1983, arg3);
        }
    }
}
