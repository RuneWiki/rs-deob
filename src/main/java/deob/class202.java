package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("gd")
public class class202 {

    @ObfuscatedName("gd.b")
    public static class255 field2265 = new class255(37748736, 256);

    @ObfuscatedName("gd.n")
    public int field2255;

    @ObfuscatedName("gd.s")
    public int field2252;

    @ObfuscatedName("gd.l")
    public class196 field2254;

    @ObfuscatedName("gd.q")
    public LinkedList field2256;

    @ObfuscatedName("gd.o")
    public int field2259;

    @ObfuscatedName("gd.r")
    public int field2260;

    @ObfuscatedName("gd.p")
    public List field2261;

    @ObfuscatedName("gd.w")
    public HashMap field2262;

    @ObfuscatedName("gd.k")
    public final HashMap field2263;

    @ObfuscatedName("dd.v(IIIB)Lqi;")
    public static class451 method2477(int arg0, int arg1, int arg2) {
        class255 var3 = field2265;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class451) var3.method4615(var4);
    }

    @ObfuscatedName("hq.c(I)V")
    public static void method3974() {
        field2265.method4620();
    }

    public class202(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2255 = arg0;
        this.field2252 = arg1;
        this.field2256 = new LinkedList();
        this.field2261 = new LinkedList();
        this.field2262 = new HashMap();
        this.field2259 = arg2 | 0xFF000000;
        this.field2263 = arg3;
    }

    @ObfuscatedName("gd.i(IIIB)V")
    public void method3694(int arg0, int arg1, int arg2) {
        class451 var4 = method2477(this.field2255, this.field2252, this.field2260);
        if (var4 == null) {
            return;
        }
        if (this.field2260 * 64 == arg2) {
            var4.method7361(arg0, arg1);
        } else {
            var4.method7390(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("gd.f(Lge;Ljava/util/List;B)V")
    public void method3695(class196 arg0, List arg1) {
        this.field2262.clear();
        this.field2254 = arg0;
        this.method3700(arg1);
    }

    @ObfuscatedName("gd.b(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method3696(HashSet arg0, List arg1) {
        this.field2262.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class204 var4 = (class204) var3.next();
            if (var4.method3924() == this.field2255 && var4.method3909() == this.field2252) {
                this.field2256.add(var4);
            }
        }
        this.method3700(arg1);
    }

    @ObfuscatedName("gd.n(IIIILhz;S)V")
    public void method3697(int arg0, int arg1, int arg2, int arg3, class210 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2334; var8++) {
                    class212[] var9 = arg4.field2346[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class212[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class212 var12 = var10[var11];
                            class188 var13 = class188.method2828(var12.field2365);
                            if (Statics.method3202(var13)) {
                                this.method3698(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gd.s(Lgj;IIILhz;I)V")
    public void method3698(class188 arg0, int arg1, int arg2, int arg3, class210 arg4) {
        class290 var6 = new class290(arg1, this.field2255 * 64 + arg2, this.field2252 * 64 + arg3);
        Object var7 = null;
        class290 var8;
        if (this.field2254 == null) {
            class204 var9 = (class204) arg4;
            var8 = new class290(var9.field2345 + arg1, var9.field2344 * 64 + arg2 + var9.method3858() * 8, var9.field2339 * 64 + arg3 + var9.method3859() * 8);
        } else {
            var8 = new class290(this.field2254.field2345 + arg1, this.field2254.field2344 * 64 + arg2, this.field2254.field2339 * 64 + arg3);
        }
        class219 var10;
        if (arg0.field2062 == null) {
            class172 var11 = class172.method2469(arg0.field2043);
            var10 = new class207(var8, var6, var11.field1831, this.method3723(var11));
        } else {
            var10 = new class199(var8, var6, arg0.field2022, this);
        }
        class172 var12 = class172.method2469(var10.method3567());
        if (var12.field1823) {
            this.field2262.put(new class290(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("gd.l(B)V")
    public void method3699() {
        Iterator var1 = this.field2262.values().iterator();
        while (var1.hasNext()) {
            class219 var2 = (class219) var1.next();
            if (var2 instanceof class199) {
                ((class199) var2).method3583();
            }
        }
    }

    @ObfuscatedName("gd.q(Ljava/util/List;I)V")
    public void method3700(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class207 var3 = (class207) var2.next();
            if (class172.method2469(var3.field2302).field1823 && var3.field2413.field3287 >> 6 == this.field2255 && var3.field2413.field3286 >> 6 == this.field2252) {
                class207 var4 = new class207(var3.field2413, var3.field2413, var3.field2302, this.method3737(var3.field2302));
                this.field2261.add(var4);
            }
        }
    }

    @ObfuscatedName("gd.o(B)V")
    public void method3701() {
        if (this.field2254 != null) {
            this.field2254.method3904();
            return;
        }
        Iterator var1 = this.field2256.iterator();
        while (var1.hasNext()) {
            class204 var2 = (class204) var1.next();
            var2.method3904();
        }
    }

    @ObfuscatedName("gd.r(Lln;I)Z")
    public boolean method3702(class316 arg0) {
        this.field2262.clear();
        if (this.field2254 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2256.iterator();
            while (var3.hasNext()) {
                class204 var4 = (class204) var3.next();
                var4.method3912(arg0);
                var2 &= var4.method3902();
            }
            if (var2) {
                Iterator var5 = this.field2256.iterator();
                while (var5.hasNext()) {
                    class204 var6 = (class204) var5.next();
                    this.method3697(var6.method3860() * 8, var6.method3867() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2254.method3912(arg0);
            if (this.field2254.method3902()) {
                this.method3697(0, 0, 64, 64, this.field2254);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("gd.p(ILhx;[Lqq;Lln;Lln;I)V")
    public void method3738(int arg0, class223 arg1, class450[] arg2, class316 arg3, class316 arg4) {
        this.field2260 = arg0;
        if (this.field2254 == null && this.field2256.isEmpty()) {
            return;
        }
        int var6 = this.field2255;
        int var7 = this.field2252;
        class255 var8 = field2265;
        long var9 = (long) (arg0 << 16 | var6 << 8 | var7);
        class451 var11 = (class451) var8.method4615(var9);
        if (var11 != null) {
            return;
        }
        boolean var12 = true;
        boolean var13 = var12 & this.method3702(arg3);
        int var14;
        if (this.field2254 == null) {
            var14 = ((class210) this.field2256.getFirst()).field2340;
        } else {
            var14 = this.field2254.field2340;
        }
        boolean var15 = var13 & arg4.method5344(var14);
        if (!var15) {
            return;
        }
        byte[] var16 = arg4.method5301(var14);
        class213 var17 = class213.method1714(var16);
        class451 var18 = new class451(this.field2260 * 64, this.field2260 * 64);
        var18.method7360();
        if (this.field2254 == null) {
            this.method3799(arg1, arg2, var17);
        } else {
            this.method3779(arg1, arg2, var17);
        }
        int var19 = this.field2255;
        int var20 = this.field2252;
        int var21 = this.field2260;
        class255 var22 = field2265;
        long var24 = (long) (var21 << 16 | var19 << 8 | var20);
        var22.method4618(var18, var24, var18.field4717.length * 4);
        this.method3701();
    }

    @ObfuscatedName("gd.w(IIILjava/util/HashSet;B)V")
    public void method3752(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method3713(arg0, arg1, arg3, arg2);
        this.method3720(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("gd.k(Ljava/util/HashSet;III)V")
    public void method3800(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2262.values().iterator();
        while (var4.hasNext()) {
            class219 var5 = (class219) var4.next();
            if (var5.method3960()) {
                int var6 = var5.method3567();
                if (arg0.contains(var6)) {
                    class172 var7 = class172.method2469(var6);
                    this.method3810(var7, var5.field2408, var5.field2411, arg1, arg2);
                }
            }
        }
        this.method3714(arg0, arg1, arg2);
    }

    @ObfuscatedName("gd.d(Lhx;[Lqq;Lhn;S)V")
    public void method3779(class223 arg0, class450[] arg1, class213 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method3709(var4, var5, this.field2254, arg0, arg2);
                this.method3710(var4, var5, this.field2254, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method3708(var6, var7, this.field2254, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("gd.m(Lhx;[Lqq;Lhn;I)V")
    public void method3799(class223 arg0, class450[] arg1, class213 arg2) {
        Iterator var4 = this.field2256.iterator();
        while (var4.hasNext()) {
            class204 var5 = (class204) var4.next();
            for (int var6 = var5.method3860() * 8; var6 < var5.method3860() * 8 + 8; var6++) {
                for (int var7 = var5.method3867() * 8; var7 < var5.method3867() * 8 + 8; var7++) {
                    this.method3709(var6, var7, var5, arg0, arg2);
                    this.method3710(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2256.iterator();
        while (var8.hasNext()) {
            class204 var9 = (class204) var8.next();
            for (int var10 = var9.method3860() * 8; var10 < var9.method3860() * 8 + 8; var10++) {
                for (int var11 = var9.method3867() * 8; var11 < var9.method3867() * 8 + 8; var11++) {
                    this.method3708(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("gd.u(IILhz;Lhx;[Lqq;B)V")
    public void method3708(int arg0, int arg1, class210 arg2, class223 arg3, class450[] arg4) {
        this.method3753(arg0, arg1, arg2);
        this.method3712(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("gd.t(IILhz;Lhx;Lhn;I)V")
    public void method3709(int arg0, int arg1, class210 arg2, class223 arg3, class213 arg4) {
        int var6 = arg2.field2342[0][arg0][arg1] - 1;
        int var7 = arg2.field2338[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class447.method7249(this.field2260 * arg0, this.field2260 * (63 - arg1), this.field2260, this.field2260, this.field2259);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class217.method51(var7, this.field2259);
        }
        if (var7 > -1 && arg2.field2335[0][arg0][arg1] == 0) {
            class447.method7249(this.field2260 * arg0, this.field2260 * (63 - arg1), this.field2260, this.field2260, var8);
            return;
        }
        int var9 = this.method3711(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class447.method7249(this.field2260 * arg0, this.field2260 * (63 - arg1), this.field2260, this.field2260, var9);
        } else {
            arg3.method3983(this.field2260 * arg0, this.field2260 * (63 - arg1), var9, var8, this.field2260, this.field2260, arg2.field2335[0][arg0][arg1], arg2.field2343[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("gd.g(IILhz;Lhx;B)V")
    public void method3710(int arg0, int arg1, class210 arg2, class223 arg3) {
        for (int var5 = 1; var5 < arg2.field2334; var5++) {
            int var6 = arg2.field2338[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class217.method51(var6, this.field2259);
                if (arg2.field2335[var5][arg0][arg1] == 0) {
                    class447.method7249(this.field2260 * arg0, this.field2260 * (63 - arg1), this.field2260, this.field2260, var7);
                } else {
                    arg3.method3983(this.field2260 * arg0, this.field2260 * (63 - arg1), 0, var7, this.field2260, this.field2260, arg2.field2335[var5][arg0][arg1], arg2.field2343[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("gd.x(IILhz;Lhn;I)I")
    public int method3711(int arg0, int arg1, class210 arg2, class213 arg3) {
        return arg2.field2342[0][arg0][arg1] == 0 ? this.field2259 : arg3.method3931(arg0, arg1);
    }

    @ObfuscatedName("gd.a(IILhz;[Lqq;I)V")
    public void method3712(int arg0, int arg1, class210 arg2, class450[] arg3) {
        for (int var5 = 0; var5 < arg2.field2334; var5++) {
            class212[] var6 = arg2.field2346[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class212[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class212 var9 = var7[var8];
                    if (class298.method2725(var9.field2364) || class298.method4027(var9.field2364)) {
                        class188 var10 = class188.method2828(var9.field2365);
                        if (var10.field2044 != -1) {
                            if (var10.field2044 == 46 || var10.field2044 == 52) {
                                arg3[var10.field2044].method7336(this.field2260 * arg0, this.field2260 * (63 - arg1), this.field2260 * 2 + 1, this.field2260 * 2 + 1);
                            } else {
                                arg3[var10.field2044].method7336(this.field2260 * arg0, this.field2260 * (63 - arg1), this.field2260 * 2, this.field2260 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gd.y(IILhz;B)V")
    public void method3753(int arg0, int arg1, class210 arg2) {
        for (int var4 = 0; var4 < arg2.field2334; var4++) {
            class212[] var5 = arg2.field2346[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class212[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class212 var8 = var6[var7];
                    int var9 = var8.field2364;
                    boolean var10 = var9 >= class298.field3518.field3521 && var9 <= class298.field3501.field3521 || class298.field3502.field3521 == var9;
                    if (var10) {
                        class188 var11 = class188.method2828(var8.field2365);
                        int var12 = var11.field2034 == 0 ? -3355444 : -3407872;
                        if (class298.field3518.field3521 == var8.field2364) {
                            this.method3726(arg0, arg1, var8.field2363, var12);
                        }
                        if (class298.field3510.field3521 == var8.field2364) {
                            this.method3726(arg0, arg1, var8.field2363, -3355444);
                            this.method3726(arg0, arg1, var8.field2363 + 1, var12);
                        }
                        if (class298.field3501.field3521 == var8.field2364) {
                            if (var8.field2363 == 0) {
                                class447.method7264(this.field2260 * arg0, this.field2260 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2363 == 1) {
                                class447.method7264(this.field2260 * arg0 + this.field2260 - 1, this.field2260 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2363 == 2) {
                                class447.method7264(this.field2260 * arg0 + this.field2260 - 1, this.field2260 * (63 - arg1) + this.field2260 - 1, 1, var12);
                            }
                            if (var8.field2363 == 3) {
                                class447.method7264(this.field2260 * arg0, this.field2260 * (63 - arg1) + this.field2260 - 1, 1, var12);
                            }
                        }
                        if (class298.field3502.field3521 == var8.field2364) {
                            int var13 = var8.field2363 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2260; var14++) {
                                    class447.method7264(this.field2260 * arg0 + var14, this.field2260 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2260; var15++) {
                                    class447.method7264(this.field2260 * arg0 + var15, this.field2260 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gd.j(IILjava/util/HashSet;II)V")
    public void method3713(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2262.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class290 var9 = (class290) var8.getKey();
            int var10 = (int) ((float) var9.field3287 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3286 * var5 - var6);
            class219 var12 = (class219) var8.getValue();
            if (var12 != null && var12.method3960()) {
                var12.field2408 = var10;
                var12.field2411 = var11;
                class172 var13 = class172.method2469(var12.method3567());
                if (!arg2.contains(var13.method3053())) {
                    this.method3719(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("gd.e(Ljava/util/HashSet;IIB)V")
    public void method3714(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2261.iterator();
        while (var4.hasNext()) {
            class219 var5 = (class219) var4.next();
            if (var5.method3960()) {
                class172 var6 = class172.method2469(var5.method3567());
                if (var6 != null && arg0.contains(var6.method3053())) {
                    this.method3810(var6, var5.field2408, var5.field2411, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("gd.z(Lfe;IIIIB)V")
    public void method3810(class172 arg0, int arg1, int arg2, int arg3, int arg4) {
        class451 var6 = arg0.method3051(false);
        if (var6 == null) {
            return;
        }
        var6.method7474(arg1 - var6.field4719 / 2, arg2 - var6.field4710 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class447.method7256(arg1, arg2, 15, 16776960, 128);
            class447.method7256(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("gd.h(Lhq;IIFI)V")
    public void method3719(class219 arg0, int arg1, int arg2, float arg3) {
        class172 var5 = class172.method2469(arg0.method3567());
        this.method3717(var5, arg1, arg2);
        this.method3718(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("gd.ae(Lfe;III)V")
    public void method3717(class172 arg0, int arg1, int arg2) {
        class451 var4 = arg0.method3051(false);
        if (var4 != null) {
            int var5 = this.method3816(var4, arg0.field1832);
            int var6 = this.method3778(var4, arg0.field1833);
            var4.method7474(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("gd.aq(Lhq;Lfe;IIFI)V")
    public void method3718(class219 arg0, class172 arg1, int arg2, int arg3, float arg4) {
        class214 var6 = arg0.method3585();
        if (var6 != null && var6.field2376.method3557(arg4)) {
            class344 var7 = (class344) this.field2263.get(var6.field2376);
            var7.method5751(var6.field2375, arg2 - var6.field2373 / 2, arg3, var6.field2373, var6.field2374, 0xFF000000 | arg1.field1820, 0, 1, 0, var7.field4117 / 2);
        }
    }

    @ObfuscatedName("gd.aw(IILjava/util/HashSet;II)V")
    public void method3720(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2261.iterator();
        while (var6.hasNext()) {
            class219 var7 = (class219) var6.next();
            if (var7.method3960()) {
                int var8 = var7.field2413.field3287 % 64;
                int var9 = var7.field2413.field3286 % 64;
                var7.field2408 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2411 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method3567())) {
                    this.method3719(var7, var7.field2408, var7.field2411, var5);
                }
            }
        }
    }

    @ObfuscatedName("gd.am(Lqi;Lfw;I)I")
    public int method3816(class451 arg0, class178 arg1) {
        switch(arg1.field1889) {
            case 1:
                return -arg0.field4719 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4719;
        }
    }

    @ObfuscatedName("gd.ak(Lqi;Lfg;I)I")
    public int method3778(class451 arg0, class180 arg1) {
        switch(arg1.field1934) {
            case 1:
                return -arg0.field4710 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4710;
        }
    }

    @ObfuscatedName("gd.aj(IB)Lho;")
    public class214 method3737(int arg0) {
        class172 var2 = class172.method2469(arg0);
        return this.method3723(var2);
    }

    @ObfuscatedName("gd.al(Lfe;I)Lho;")
    public class214 method3723(class172 arg0) {
        if (arg0.field1826 == null || this.field2263 == null || this.field2263.get(class198.field2210) == null) {
            return null;
        }
        int var2 = arg0.field1829;
        class198[] var3 = class198.method3556();
        int var4 = 0;
        class198 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class198 var5 = var3[var4];
            if (var5.field2216 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class344 var8 = (class344) this.field2263.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method5744(arg0.field1826, 1000000);
        String[] var10 = new String[var9];
        var8.method5737(arg0.field1826, (int[]) null, var10);
        int var11 = var10.length * var8.field4117 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method5741(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class214(arg0.field1826, var12, var11, var6);
    }

    @ObfuscatedName("gd.av(IIIIII)Ljava/util/List;")
    public List method3724(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2262.values().iterator();
            while (var7.hasNext()) {
                class219 var8 = (class219) var7.next();
                if (var8.method3960() && var8.method3958(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2261.iterator();
            while (var9.hasNext()) {
                class219 var10 = (class219) var9.next();
                if (var10.method3960() && var10.method3958(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("gd.at(I)Ljava/util/List;")
    public List method3725() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2261);
        var1.addAll(this.field2262.values());
        return var1;
    }

    @ObfuscatedName("gd.an(IIIII)V")
    public void method3726(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class447.method7274(this.field2260 * arg0, this.field2260 * (63 - arg1), this.field2260, arg3);
        }
        if (var5 == 1) {
            class447.method7264(this.field2260 * arg0, this.field2260 * (63 - arg1), this.field2260, arg3);
        }
        if (var5 == 2) {
            class447.method7274(this.field2260 * arg0 + this.field2260 - 1, this.field2260 * (63 - arg1), this.field2260, arg3);
        }
        if (var5 == 3) {
            class447.method7264(this.field2260 * arg0, this.field2260 * (63 - arg1) + this.field2260 - 1, this.field2260, arg3);
        }
    }
}
