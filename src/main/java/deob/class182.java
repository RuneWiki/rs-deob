package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("fk")
public class class182 {

    @ObfuscatedName("fk.o")
    public static class234 field2066 = new class234(37748736, 256);

    @ObfuscatedName("fk.g")
    public int field2060;

    @ObfuscatedName("fk.e")
    public int field2063;

    @ObfuscatedName("fk.p")
    public class176 field2062;

    @ObfuscatedName("fk.j")
    public LinkedList field2068;

    @ObfuscatedName("fk.b")
    public int field2064;

    @ObfuscatedName("fk.x")
    public int field2065;

    @ObfuscatedName("fk.y")
    public List field2061;

    @ObfuscatedName("fk.k")
    public HashMap field2067;

    @ObfuscatedName("fk.t")
    public final HashMap field2059;

    @ObfuscatedName("eb.i(IIII)J")
    public static long method2625(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("ez.w(IIII)Low;")
    public static class414 method2611(int arg0, int arg1, int arg2) {
        return (class414) field2066.method4179(method2625(arg0, arg1, arg2));
    }

    @ObfuscatedName("fs.s(Low;IIII)V")
    public static void method3192(class414 arg0, int arg1, int arg2, int arg3) {
        field2066.method4192(arg0, method2625(arg1, arg2, arg3), arg0.field4396.length * 4);
    }

    @ObfuscatedName("ei.a(I)V")
    public static void method2673() {
        field2066.method4177();
    }

    @ObfuscatedName("je.o(B)V")
    public static void method4645() {
        field2066.method4183(5);
    }

    public class182(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2060 = arg0;
        this.field2063 = arg1;
        this.field2068 = new LinkedList();
        this.field2061 = new LinkedList();
        this.field2067 = new HashMap();
        this.field2064 = arg2 | 0xFF000000;
        this.field2059 = arg3;
    }

    @ObfuscatedName("fk.g(IIII)V")
    public void method3365(int arg0, int arg1, int arg2) {
        class414 var4 = method2611(this.field2060, this.field2063, this.field2065);
        if (var4 == null) {
            return;
        }
        if (this.field2065 * 64 == arg2) {
            var4.method6643(arg0, arg1);
        } else {
            var4.method6666(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("fk.e(Lfv;Ljava/util/List;S)V")
    public void method3384(class176 arg0, List arg1) {
        this.field2067.clear();
        this.field2062 = arg0;
        this.method3437(arg1);
    }

    @ObfuscatedName("fk.p(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method3338(HashSet arg0, List arg1) {
        this.field2067.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class184 var4 = (class184) var3.next();
            if (var4.method3543() == this.field2060 && var4.method3544() == this.field2063) {
                this.field2068.add(var4);
            }
        }
        this.method3437(arg1);
    }

    @ObfuscatedName("fk.j(IIIILgl;I)V")
    public void method3339(int arg0, int arg1, int arg2, int arg3, class190 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2149; var8++) {
                    class192[] var9 = arg4.field2157[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class192[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class169 var13;
                            boolean var18;
                            label58: {
                                class192 var12 = var10[var11];
                                var13 = Statics.method2740(var12.field2166);
                                if (var13.field1824 != null) {
                                    int[] var14 = var13.field1824;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class169 var17 = Statics.method2740(var16);
                                        if (var17.field1829 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field1829 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method3340(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fk.b(Lfe;IIILgl;I)V")
    public void method3340(class169 arg0, int arg1, int arg2, int arg3, class190 arg4) {
        class258 var6 = new class258(arg1, this.field2060 * 64 + arg2, this.field2063 * 64 + arg3);
        Object var7 = null;
        class258 var8;
        if (this.field2062 == null) {
            class184 var9 = (class184) arg4;
            var8 = new class258(var9.field2156 + arg1, var9.field2152 * 64 + arg2 + var9.method3515() * 8, var9.field2145 * 64 + arg3 + var9.method3497() * 8);
        } else {
            var8 = new class258(this.field2062.field2156 + arg1, this.field2062.field2152 * 64 + arg2, this.field2062.field2145 * 64 + arg3);
        }
        class199 var10;
        if (arg0.field1824 == null) {
            class154 var11 = class154.method3068(arg0.field1829);
            var10 = new class187(var8, var6, var11.field1623, this.method3366(var11));
        } else {
            var10 = new class179(var8, var6, arg0.field1825, this);
        }
        class154 var12 = class154.method3068(var10.method3225());
        if (var12.field1642) {
            this.field2067.put(new class258(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("fk.x(I)V")
    public void method3341() {
        Iterator var1 = this.field2067.values().iterator();
        while (var1.hasNext()) {
            class199 var2 = (class199) var1.next();
            if (var2 instanceof class179) {
                ((class179) var2).method3224();
            }
        }
    }

    @ObfuscatedName("fk.y(Ljava/util/List;I)V")
    public void method3437(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class187 var3 = (class187) var2.next();
            if (class154.method3068(var3.field2112).field1642 && var3.field2205.field3017 >> 6 == this.field2060 && var3.field2205.field3016 >> 6 == this.field2063) {
                class187 var4 = new class187(var3.field2205, var3.field2205, var3.field2112, this.method3436(var3.field2112));
                this.field2061.add(var4);
            }
        }
    }

    @ObfuscatedName("fk.k(I)V")
    public void method3343() {
        if (this.field2062 != null) {
            this.field2062.method3542();
            return;
        }
        Iterator var1 = this.field2068.iterator();
        while (var1.hasNext()) {
            class184 var2 = (class184) var1.next();
            var2.method3542();
        }
    }

    @ObfuscatedName("fk.t(Lko;I)Z")
    public boolean method3344(class290 arg0) {
        this.field2067.clear();
        if (this.field2062 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2068.iterator();
            while (var3.hasNext()) {
                class184 var4 = (class184) var3.next();
                var4.method3538(arg0);
                var2 &= var4.method3545();
            }
            if (var2) {
                Iterator var5 = this.field2068.iterator();
                while (var5.hasNext()) {
                    class184 var6 = (class184) var5.next();
                    this.method3339(var6.method3502() * 8, var6.method3498() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2062.method3538(arg0);
            if (this.field2062.method3545()) {
                this.method3339(0, 0, 64, 64, this.field2062);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("fk.l(ILge;[Loe;Lko;Lko;I)V")
    public void method3345(int arg0, class203 arg1, class413[] arg2, class290 arg3, class290 arg4) {
        this.field2065 = arg0;
        if (this.field2062 == null && this.field2068.isEmpty() || method2611(this.field2060, this.field2063, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method3344(arg3);
        int var8;
        if (this.field2062 == null) {
            var8 = ((class190) this.field2068.getFirst()).field2151;
        } else {
            var8 = this.field2062.field2151;
        }
        boolean var9 = var7 & arg4.method4747(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method4749(var8);
        class193 var11 = class193.method2399(var10);
        class414 var12 = new class414(this.field2065 * 64, this.field2065 * 64);
        var12.method6636();
        if (this.field2062 == null) {
            this.method3432(arg1, arg2, var11);
        } else {
            this.method3348(arg1, arg2, var11);
        }
        method3192(var12, this.field2060, this.field2063, this.field2065);
        this.method3343();
    }

    @ObfuscatedName("fk.u(IIILjava/util/HashSet;I)V")
    public void method3361(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method3458(arg0, arg1, arg3, arg2);
        this.method3362(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("fk.n(Ljava/util/HashSet;III)V")
    public void method3347(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2067.values().iterator();
        while (var4.hasNext()) {
            class199 var5 = (class199) var4.next();
            if (var5.method3587()) {
                int var6 = var5.method3225();
                if (arg0.contains(var6)) {
                    class154 var7 = class154.method3068(var6);
                    this.method3415(var7, var5.field2207, var5.field2208, arg1, arg2);
                }
            }
        }
        this.method3399(arg0, arg1, arg2);
    }

    @ObfuscatedName("fk.z(Lge;[Loe;Lgg;S)V")
    public void method3348(class203 arg0, class413[] arg1, class193 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method3442(var4, var5, this.field2062, arg0, arg2);
                this.method3352(var4, var5, this.field2062, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method3358(var6, var7, this.field2062, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("fk.q(Lge;[Loe;Lgg;I)V")
    public void method3432(class203 arg0, class413[] arg1, class193 arg2) {
        Iterator var4 = this.field2068.iterator();
        while (var4.hasNext()) {
            class184 var5 = (class184) var4.next();
            for (int var6 = var5.method3502() * 8; var6 < var5.method3502() * 8 + 8; var6++) {
                for (int var7 = var5.method3498() * 8; var7 < var5.method3498() * 8 + 8; var7++) {
                    this.method3442(var6, var7, var5, arg0, arg2);
                    this.method3352(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2068.iterator();
        while (var8.hasNext()) {
            class184 var9 = (class184) var8.next();
            for (int var10 = var9.method3502() * 8; var10 < var9.method3502() * 8 + 8; var10++) {
                for (int var11 = var9.method3498() * 8; var11 < var9.method3498() * 8 + 8; var11++) {
                    this.method3358(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("fk.d(IILgl;Lge;[Loe;I)V")
    public void method3358(int arg0, int arg1, class190 arg2, class203 arg3, class413[] arg4) {
        this.method3355(arg0, arg1, arg2);
        this.method3354(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("fk.r(IILgl;Lge;Lgg;B)V")
    public void method3442(int arg0, int arg1, class190 arg2, class203 arg3, class193 arg4) {
        int var6 = arg2.field2153[0][arg0][arg1] - 1;
        int var7 = arg2.field2154[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class410.method6580(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, this.field2065, this.field2064);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2064;
            class171 var10 = class171.method2677(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field1939 >= 0) {
                var11 = var10.field1939 | 0xFF000000;
            } else if (var10.field1947 >= 0) {
                int var12 = Statics.field2369.method4033(var10.field1947);
                byte var13 = 96;
                int var14;
                if (var12 == -2) {
                    var14 = 12345678;
                } else if (var12 == -1) {
                    if (var13 < 0) {
                        var13 = 0;
                    } else if (var13 > 127) {
                        var13 = 127;
                    }
                    int var15 = 127 - var13;
                    var14 = var15;
                } else {
                    int var16 = (var12 & 0x7F) * var13 / 128;
                    if (var16 < 2) {
                        var16 = 2;
                    } else if (var16 > 126) {
                        var16 = 126;
                    }
                    var14 = (var12 & 0xFF80) + var16;
                }
                var11 = class211.field2365[var14] | 0xFF000000;
            } else if (var10.field1936 == 16711935) {
                var11 = var9;
            } else {
                int var18 = Statics.method2102(var10.field1940, var10.field1941, var10.field1937);
                byte var19 = 96;
                int var20;
                if (var18 == -2) {
                    var20 = 12345678;
                } else if (var18 == -1) {
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > 127) {
                        var19 = 127;
                    }
                    int var21 = 127 - var19;
                    var20 = var21;
                } else {
                    int var22 = (var18 & 0x7F) * var19 / 128;
                    if (var22 < 2) {
                        var22 = 2;
                    } else if (var22 > 126) {
                        var22 = 126;
                    }
                    var20 = (var18 & 0xFF80) + var22;
                }
                var11 = class211.field2365[var20] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field2155[0][arg0][arg1] == 0) {
            class410.method6580(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, this.field2065, var8);
            return;
        }
        int var24 = this.method3353(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class410.method6580(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, this.field2065, var24);
        } else {
            arg3.method3634(this.field2065 * arg0, this.field2065 * (63 - arg1), var24, var8, this.field2065, this.field2065, arg2.field2155[0][arg0][arg1], arg2.field2146[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("fk.m(IILgl;Lge;B)V")
    public void method3352(int arg0, int arg1, class190 arg2, class203 arg3) {
        for (int var5 = 1; var5 < arg2.field2149; var5++) {
            int var6 = arg2.field2154[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2064;
                class171 var8 = class171.method2677(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field1939 >= 0) {
                    var9 = var8.field1939 | 0xFF000000;
                } else if (var8.field1947 >= 0) {
                    int var10 = Statics.field2369.method4033(var8.field1947);
                    byte var11 = 96;
                    int var12;
                    if (var10 == -2) {
                        var12 = 12345678;
                    } else if (var10 == -1) {
                        if (var11 < 0) {
                            var11 = 0;
                        } else if (var11 > 127) {
                            var11 = 127;
                        }
                        int var13 = 127 - var11;
                        var12 = var13;
                    } else {
                        int var14 = (var10 & 0x7F) * var11 / 128;
                        if (var14 < 2) {
                            var14 = 2;
                        } else if (var14 > 126) {
                            var14 = 126;
                        }
                        var12 = (var10 & 0xFF80) + var14;
                    }
                    var9 = class211.field2365[var12] | 0xFF000000;
                } else if (var8.field1936 == 16711935) {
                    var9 = var7;
                } else {
                    int var16 = Statics.method2102(var8.field1940, var8.field1941, var8.field1937);
                    byte var17 = 96;
                    int var18;
                    if (var16 == -2) {
                        var18 = 12345678;
                    } else if (var16 == -1) {
                        if (var17 < 0) {
                            var17 = 0;
                        } else if (var17 > 127) {
                            var17 = 127;
                        }
                        int var19 = 127 - var17;
                        var18 = var19;
                    } else {
                        int var20 = (var16 & 0x7F) * var17 / 128;
                        if (var20 < 2) {
                            var20 = 2;
                        } else if (var20 > 126) {
                            var20 = 126;
                        }
                        var18 = (var16 & 0xFF80) + var20;
                    }
                    var9 = class211.field2365[var18] | 0xFF000000;
                }
                if (arg2.field2155[var5][arg0][arg1] == 0) {
                    class410.method6580(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, this.field2065, var9);
                } else {
                    arg3.method3634(this.field2065 * arg0, this.field2065 * (63 - arg1), 0, var9, this.field2065, this.field2065, arg2.field2155[var5][arg0][arg1], arg2.field2146[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("fk.c(IILgl;Lgg;B)I")
    public int method3353(int arg0, int arg1, class190 arg2, class193 arg3) {
        return arg2.field2153[0][arg0][arg1] == 0 ? this.field2064 : arg3.method3576(arg0, arg1);
    }

    @ObfuscatedName("fk.f(IILgl;[Loe;B)V")
    public void method3354(int arg0, int arg1, class190 arg2, class413[] arg3) {
        for (int var5 = 0; var5 < arg2.field2149; var5++) {
            class192[] var6 = arg2.field2157[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class192[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class192 var9 = var7[var8];
                    int var10 = var9.field2167;
                    boolean var11 = var10 >= class271.field3243.field3246 && var10 <= class271.field3244.field3246;
                    if (var11 || Statics.method2422(var9.field2167)) {
                        class169 var12 = Statics.method2740(var9.field2166);
                        if (var12.field1871 != -1) {
                            if (var12.field1871 == 46 || var12.field1871 == 52) {
                                arg3[var12.field1871].method6613(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065 * 2 + 1, this.field2065 * 2 + 1);
                            } else {
                                arg3[var12.field1871].method6613(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065 * 2, this.field2065 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fk.h(IILgl;B)V")
    public void method3355(int arg0, int arg1, class190 arg2) {
        for (int var4 = 0; var4 < arg2.field2149; var4++) {
            class192[] var5 = arg2.field2157[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class192[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class192 var8 = var6[var7];
                    int var9 = var8.field2167;
                    boolean var10 = var9 >= class271.field3239.field3246 && var9 <= class271.field3231.field3246 || class271.field3232.field3246 == var9;
                    if (var10) {
                        class169 var11 = Statics.method2740(var8.field2166);
                        int var12 = var11.field1869 == 0 ? -3355444 : -3407872;
                        if (class271.field3239.field3246 == var8.field2167) {
                            this.method3369(arg0, arg1, var8.field2168, var12);
                        }
                        if (class271.field3225.field3246 == var8.field2167) {
                            this.method3369(arg0, arg1, var8.field2168, -3355444);
                            this.method3369(arg0, arg1, var8.field2168 + 1, var12);
                        }
                        if (class271.field3231.field3246 == var8.field2167) {
                            if (var8.field2168 == 0) {
                                class410.method6532(this.field2065 * arg0, this.field2065 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2168 == 1) {
                                class410.method6532(this.field2065 * arg0 + this.field2065 - 1, this.field2065 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2168 == 2) {
                                class410.method6532(this.field2065 * arg0 + this.field2065 - 1, this.field2065 * (63 - arg1) + this.field2065 - 1, 1, var12);
                            }
                            if (var8.field2168 == 3) {
                                class410.method6532(this.field2065 * arg0, this.field2065 * (63 - arg1) + this.field2065 - 1, 1, var12);
                            }
                        }
                        if (class271.field3232.field3246 == var8.field2167) {
                            int var13 = var8.field2168 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2065; var14++) {
                                    class410.method6532(this.field2065 * arg0 + var14, this.field2065 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2065; var15++) {
                                    class410.method6532(this.field2065 * arg0 + var15, this.field2065 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fk.v(IILjava/util/HashSet;IB)V")
    public void method3458(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2067.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class258 var9 = (class258) var8.getKey();
            int var10 = (int) ((float) var9.field3017 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3016 * var5 - var6);
            class199 var12 = (class199) var8.getValue();
            if (var12 != null && var12.method3587()) {
                var12.field2207 = var10;
                var12.field2208 = var11;
                class154 var13 = class154.method3068(var12.method3225());
                if (!arg2.contains(var13.method2701())) {
                    this.method3346(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("fk.ag(Ljava/util/HashSet;III)V")
    public void method3399(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2061.iterator();
        while (var4.hasNext()) {
            class199 var5 = (class199) var4.next();
            if (var5.method3587()) {
                class154 var6 = class154.method3068(var5.method3225());
                if (var6 != null && arg0.contains(var6.method2701())) {
                    this.method3415(var6, var5.field2207, var5.field2208, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("fk.ae(Len;IIIII)V")
    public void method3415(class154 arg0, int arg1, int arg2, int arg3, int arg4) {
        class414 var6 = arg0.method2700(false);
        if (var6 == null) {
            return;
        }
        var6.method6645(arg1 - var6.field4394 / 2, arg2 - var6.field4395 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class410.method6516(arg1, arg2, 15, 16776960, 128);
            class410.method6516(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("fk.aq(Lgm;IIFB)V")
    public void method3346(class199 arg0, int arg1, int arg2, float arg3) {
        class154 var5 = class154.method3068(arg0.method3225());
        this.method3360(var5, arg1, arg2);
        this.method3356(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("fk.al(Len;III)V")
    public void method3360(class154 arg0, int arg1, int arg2) {
        class414 var4 = arg0.method2700(false);
        if (var4 != null) {
            int var5 = this.method3363(var4, arg0.field1624);
            int var6 = this.method3385(var4, arg0.field1629);
            var4.method6645(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("fk.am(Lgm;Len;IIFI)V")
    public void method3356(class199 arg0, class154 arg1, int arg2, int arg3, float arg4) {
        class194 var6 = arg0.method3226();
        if (var6 != null && var6.field2173.method3213(arg4)) {
            class315 var7 = (class315) this.field2059.get(var6.field2173);
            var7.method5169(var6.field2176, arg2 - var6.field2174 / 2, arg3, var6.field2174, var6.field2175, 0xFF000000 | arg1.field1627, 0, 1, 0, var7.field3826 / 2);
        }
    }

    @ObfuscatedName("fk.ai(IILjava/util/HashSet;II)V")
    public void method3362(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2061.iterator();
        while (var6.hasNext()) {
            class199 var7 = (class199) var6.next();
            if (var7.method3587()) {
                int var8 = var7.field2205.field3017 % 64;
                int var9 = var7.field2205.field3016 % 64;
                var7.field2207 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2208 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method3225())) {
                    this.method3346(var7, var7.field2207, var7.field2208, var5);
                }
            }
        }
    }

    @ObfuscatedName("fk.ah(Low;Lfj;B)I")
    public int method3363(class414 arg0, class160 arg1) {
        switch(arg1.field1696) {
            case 0:
                return 0;
            case 1:
                return -arg0.field4394 / 2;
            default:
                return -arg0.field4394;
        }
    }

    @ObfuscatedName("fk.as(Low;Lfg;S)I")
    public int method3385(class414 arg0, class162 arg1) {
        switch(arg1.field1742) {
            case 0:
                return -arg0.field4395 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4395;
        }
    }

    @ObfuscatedName("fk.at(II)Lga;")
    public class194 method3436(int arg0) {
        class154 var2 = class154.method3068(arg0);
        return this.method3366(var2);
    }

    @ObfuscatedName("fk.az(Len;B)Lga;")
    public class194 method3366(class154 arg0) {
        if (arg0.field1626 == null || this.field2059 == null || this.field2059.get(class178.field2014) == null) {
            return null;
        }
        class178 var2 = Statics.method3218(arg0.field1628);
        if (var2 == null) {
            return null;
        }
        class315 var3 = (class315) this.field2059.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5216(arg0.field1626, 1000000);
        String[] var5 = new String[var4];
        var3.method5160(arg0.field1626, (int[]) null, var5);
        int var6 = var5.length * var3.field3826 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5159(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class194(arg0.field1626, var7, var6, var2);
    }

    @ObfuscatedName("fk.ac(IIIIIB)Ljava/util/List;")
    public List method3367(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2067.values().iterator();
            while (var7.hasNext()) {
                class199 var8 = (class199) var7.next();
                if (var8.method3587() && var8.method3585(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2061.iterator();
            while (var9.hasNext()) {
                class199 var10 = (class199) var9.next();
                if (var10.method3587() && var10.method3585(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("fk.ak(S)Ljava/util/List;")
    public List method3368() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2061);
        var1.addAll(this.field2067.values());
        return var1;
    }

    @ObfuscatedName("fk.ab(IIIIB)V")
    public void method3369(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class410.method6534(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, arg3);
        }
        if (var5 == 1) {
            class410.method6532(this.field2065 * arg0, this.field2065 * (63 - arg1), this.field2065, arg3);
        }
        if (var5 == 2) {
            class410.method6534(this.field2065 * arg0 + this.field2065 - 1, this.field2065 * (63 - arg1), this.field2065, arg3);
        }
        if (var5 == 3) {
            class410.method6532(this.field2065 * arg0, this.field2065 * (63 - arg1) + this.field2065 - 1, this.field2065, arg3);
        }
    }
}
