package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("hd")
public class class227 {

    @ObfuscatedName("hd.a")
    public static class255 field2758 = new class255(37748736, 256);

    @ObfuscatedName("hd.m")
    public int field2759;

    @ObfuscatedName("hd.p")
    public int field2760;

    @ObfuscatedName("hd.s")
    public class221 field2757;

    @ObfuscatedName("hd.r")
    public LinkedList field2762;

    @ObfuscatedName("hd.v")
    public int field2761;

    @ObfuscatedName("hd.y")
    public int field2764;

    @ObfuscatedName("hd.c")
    public List field2765;

    @ObfuscatedName("hd.w")
    public HashMap field2766;

    @ObfuscatedName("hd.b")
    public final HashMap field2767;

    @ObfuscatedName("ad.o(IIIB)Lqr;")
    public static class453 method746(int arg0, int arg1, int arg2) {
        class255 var3 = field2758;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class453) var3.method4532(var4);
    }

    @ObfuscatedName("fu.q(I)V")
    public static void method3091() {
        field2758.method4542(5);
    }

    public class227(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2759 = arg0;
        this.field2760 = arg1;
        this.field2762 = new LinkedList();
        this.field2765 = new LinkedList();
        this.field2766 = new HashMap();
        this.field2761 = arg2 | 0xFF000000;
        this.field2767 = arg3;
    }

    @ObfuscatedName("hd.l(IIII)V")
    public void method4193(int arg0, int arg1, int arg2) {
        class453 var4 = method746(this.field2759, this.field2760, this.field2764);
        if (var4 == null) {
            return;
        }
        if (this.field2764 * 64 == arg2) {
            var4.method7394(arg0, arg1);
        } else {
            var4.method7341(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("hd.k(Lhz;Ljava/util/List;I)V")
    public void method4194(class221 arg0, List arg1) {
        this.field2766.clear();
        this.field2757 = arg0;
        this.method4312(arg1);
    }

    @ObfuscatedName("hd.a(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4195(HashSet arg0, List arg1) {
        this.field2766.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class229 var4 = (class229) var3.next();
            if (var4.method4404() == this.field2759 && var4.method4405() == this.field2760) {
                this.field2762.add(var4);
            }
        }
        this.method4312(arg1);
    }

    @ObfuscatedName("hd.m(IIIILib;I)V")
    public void method4242(int arg0, int arg1, int arg2, int arg3, class235 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2844; var8++) {
                    class237[] var9 = arg4.field2839[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class237[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class188 var13;
                            boolean var18;
                            label58: {
                                class237 var12 = var10[var11];
                                var13 = class188.method1989(var12.field2861);
                                if (var13.field2092 != null) {
                                    int[] var14 = var13.field2092;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class188 var17 = class188.method1989(var16);
                                        if (var17.field2108 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field2108 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method4202(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hd.p(Lgy;IIILib;I)V")
    public void method4202(class188 arg0, int arg1, int arg2, int arg3, class235 arg4) {
        class290 var6 = new class290(arg1, this.field2759 * 64 + arg2, this.field2760 * 64 + arg3);
        Object var7 = null;
        class290 var8;
        if (this.field2757 == null) {
            class229 var9 = (class229) arg4;
            var8 = new class290(var9.field2841 + arg1, var9.field2850 * 64 + arg2 + var9.method4359() * 8, var9.field2838 * 64 + arg3 + var9.method4373() * 8);
        } else {
            var8 = new class290(this.field2757.field2841 + arg1, this.field2757.field2850 * 64 + arg2, this.field2757.field2838 * 64 + arg3);
        }
        class244 var10;
        if (arg0.field2092 == null) {
            class172 var11 = class172.method2598(arg0.field2108);
            var10 = new class232(var8, var6, var11.field1868, this.method4223(var11));
        } else {
            var10 = new class224(var8, var6, arg0.field2087, this);
        }
        class172 var12 = class172.method2598(var10.method4095());
        if (var12.field1877) {
            this.field2766.put(new class290(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("hd.s(B)V")
    public void method4198() {
        Iterator var1 = this.field2766.values().iterator();
        while (var1.hasNext()) {
            class244 var2 = (class244) var1.next();
            if (var2 instanceof class224) {
                ((class224) var2).method4096();
            }
        }
    }

    @ObfuscatedName("hd.r(Ljava/util/List;B)V")
    public void method4312(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class232 var3 = (class232) var2.next();
            if (class172.method2598(var3.field2809).field1877 && var3.field2900.field3351 >> 6 == this.field2759 && var3.field2900.field3354 >> 6 == this.field2760) {
                class232 var4 = new class232(var3.field2900, var3.field2900, var3.field2809, this.method4222(var3.field2809));
                this.field2765.add(var4);
            }
        }
    }

    @ObfuscatedName("hd.v(B)V")
    public void method4200() {
        if (this.field2757 != null) {
            this.field2757.method4425();
            return;
        }
        Iterator var1 = this.field2762.iterator();
        while (var1.hasNext()) {
            class229 var2 = (class229) var1.next();
            var2.method4425();
        }
    }

    @ObfuscatedName("hd.y(Llp;S)Z")
    public boolean method4201(class316 arg0) {
        this.field2766.clear();
        if (this.field2757 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2762.iterator();
            while (var3.hasNext()) {
                class229 var4 = (class229) var3.next();
                var4.method4399(arg0);
                var2 &= var4.method4397();
            }
            if (var2) {
                Iterator var5 = this.field2762.iterator();
                while (var5.hasNext()) {
                    class229 var6 = (class229) var5.next();
                    this.method4242(var6.method4360() * 8, var6.method4362() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2757.method4399(arg0);
            if (this.field2757.method4397()) {
                this.method4242(0, 0, 64, 64, this.field2757);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("hd.c(ILii;[Lqd;Llp;Llp;S)V")
    public void method4268(int arg0, class248 arg1, class452[] arg2, class316 arg3, class316 arg4) {
        this.field2764 = arg0;
        if (this.field2757 == null && this.field2762.isEmpty() || method746(this.field2759, this.field2760, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4201(arg3);
        int var8;
        if (this.field2757 == null) {
            var8 = ((class235) this.field2762.getFirst()).field2843;
        } else {
            var8 = this.field2757.field2843;
        }
        boolean var9 = var7 & arg4.method5193(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method5195(var8);
        class238 var11;
        if (var10 == null) {
            var11 = new class238();
        } else {
            var11 = new class238(class29.method3909(var10).field4767);
        }
        class453 var13 = new class453(this.field2764 * 64, this.field2764 * 64);
        var13.method7320();
        if (this.field2757 == null) {
            this.method4297(arg1, arg2, var11);
        } else {
            this.method4205(arg1, arg2, var11);
        }
        int var14 = this.field2759;
        int var15 = this.field2760;
        int var16 = this.field2764;
        class255 var17 = field2758;
        long var19 = (long) (var16 << 16 | var14 << 8 | var15);
        var17.method4552(var13, var19, var13.field4767.length * 4);
        this.method4200();
    }

    @ObfuscatedName("hd.w(IIILjava/util/HashSet;I)V")
    public void method4203(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4213(arg0, arg1, arg3, arg2);
        this.method4206(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("hd.b(Ljava/util/HashSet;IIB)V")
    public void method4304(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2766.values().iterator();
        while (var4.hasNext()) {
            class244 var5 = (class244) var4.next();
            if (var5.method4464()) {
                int var6 = var5.method4095();
                if (arg0.contains(var6)) {
                    class172 var7 = class172.method2598(var6);
                    this.method4216(var7, var5.field2902, var5.field2903, arg1, arg2);
                }
            }
        }
        this.method4214(arg0, arg1, arg2);
    }

    @ObfuscatedName("hd.t(Lii;[Lqd;Lix;S)V")
    public void method4205(class248 arg0, class452[] arg1, class238 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4259(var4, var5, this.field2757, arg0, arg2);
                this.method4192(var4, var5, this.field2757, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4207(var6, var7, this.field2757, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("hd.g(Lii;[Lqd;Lix;I)V")
    public void method4297(class248 arg0, class452[] arg1, class238 arg2) {
        Iterator var4 = this.field2762.iterator();
        while (var4.hasNext()) {
            class229 var5 = (class229) var4.next();
            for (int var6 = var5.method4360() * 8; var6 < var5.method4360() * 8 + 8; var6++) {
                for (int var7 = var5.method4362() * 8; var7 < var5.method4362() * 8 + 8; var7++) {
                    this.method4259(var6, var7, var5, arg0, arg2);
                    this.method4192(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2762.iterator();
        while (var8.hasNext()) {
            class229 var9 = (class229) var8.next();
            for (int var10 = var9.method4360() * 8; var10 < var9.method4360() * 8 + 8; var10++) {
                for (int var11 = var9.method4362() * 8; var11 < var9.method4362() * 8 + 8; var11++) {
                    this.method4207(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("hd.x(IILib;Lii;[Lqd;I)V")
    public void method4207(int arg0, int arg1, class235 arg2, class248 arg3, class452[] arg4) {
        this.method4212(arg0, arg1, arg2);
        this.method4211(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("hd.n(IILib;Lii;Lix;I)V")
    public void method4259(int arg0, int arg1, class235 arg2, class248 arg3, class238 arg4) {
        int var6 = arg2.field2845[0][arg0][arg1] - 1;
        int var7 = arg2.field2847[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class449.method7204(this.field2764 * arg0, this.field2764 * (63 - arg1), this.field2764, this.field2764, this.field2761);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2761;
            class190 var10 = (class190) class190.field2194.method4566((long) var7);
            class190 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field2190.method5249(4, var7);
                class190 var13 = new class190();
                if (var12 != null) {
                    var13.method3399(new class440(var12), var7);
                }
                var13.method3388();
                class190.field2194.method4571(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field2195 >= 0) {
                var15 = var11.field2195 | 0xFF000000;
            } else if (var11.field2193 >= 0) {
                int var16 = class242.method236(Statics.field2382.method3919(var11.field2193), 96);
                var15 = class202.field2398[var16] | 0xFF000000;
            } else if (var11.field2192 == 16711935) {
                var15 = var9;
            } else {
                int var17 = class242.method5665(var11.field2196, var11.field2197, var11.field2198);
                int var18 = class242.method236(var17, 96);
                var15 = class202.field2398[var18] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field2846[0][arg0][arg1] == 0) {
            class449.method7204(this.field2764 * arg0, this.field2764 * (63 - arg1), this.field2764, this.field2764, var8);
            return;
        }
        int var19 = this.method4210(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class449.method7204(this.field2764 * arg0, this.field2764 * (63 - arg1), this.field2764, this.field2764, var19);
        } else {
            arg3.method4481(this.field2764 * arg0, this.field2764 * (63 - arg1), var19, var8, this.field2764, this.field2764, arg2.field2846[0][arg0][arg1], arg2.field2848[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("hd.e(IILib;Lii;B)V")
    public void method4192(int arg0, int arg1, class235 arg2, class248 arg3) {
        for (int var5 = 1; var5 < arg2.field2844; var5++) {
            int var6 = arg2.field2847[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2761;
                class190 var8 = (class190) class190.field2194.method4566((long) var6);
                class190 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field2190.method5249(4, var6);
                    class190 var11 = new class190();
                    if (var10 != null) {
                        var11.method3399(new class440(var10), var6);
                    }
                    var11.method3388();
                    class190.field2194.method4571(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field2195 >= 0) {
                    var13 = var9.field2195 | 0xFF000000;
                } else if (var9.field2193 >= 0) {
                    int var14 = class242.method236(Statics.field2382.method3919(var9.field2193), 96);
                    var13 = class202.field2398[var14] | 0xFF000000;
                } else if (var9.field2192 == 16711935) {
                    var13 = var7;
                } else {
                    int var15 = class242.method5665(var9.field2196, var9.field2197, var9.field2198);
                    int var16 = class242.method236(var15, 96);
                    var13 = class202.field2398[var16] | 0xFF000000;
                }
                if (arg2.field2846[var5][arg0][arg1] == 0) {
                    class449.method7204(this.field2764 * arg0, this.field2764 * (63 - arg1), this.field2764, this.field2764, var13);
                } else {
                    arg3.method4481(this.field2764 * arg0, this.field2764 * (63 - arg1), 0, var13, this.field2764, this.field2764, arg2.field2846[var5][arg0][arg1], arg2.field2848[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("hd.h(IILib;Lix;B)I")
    public int method4210(int arg0, int arg1, class235 arg2, class238 arg3) {
        return arg2.field2845[0][arg0][arg1] == 0 ? this.field2761 : arg3.method4437(arg0, arg1);
    }

    @ObfuscatedName("hd.f(IILib;[Lqd;B)V")
    public void method4211(int arg0, int arg1, class235 arg2, class452[] arg3) {
        for (int var5 = 0; var5 < arg2.field2844; var5++) {
            class237[] var6 = arg2.field2839[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class237[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class237 var9 = var7[var8];
                    if (class298.method1863(var9.field2862) || class298.method1773(var9.field2862)) {
                        class188 var10 = class188.method1989(var9.field2861);
                        if (var10.field2082 != -1) {
                            if (var10.field2082 == 46 || var10.field2082 == 52) {
                                arg3[var10.field2082].method7289(this.field2764 * arg0, this.field2764 * (63 - arg1), this.field2764 * 2 + 1, this.field2764 * 2 + 1);
                            } else {
                                arg3[var10.field2082].method7289(this.field2764 * arg0, this.field2764 * (63 - arg1), this.field2764 * 2, this.field2764 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hd.d(IILib;I)V")
    public void method4212(int arg0, int arg1, class235 arg2) {
        for (int var4 = 0; var4 < arg2.field2844; var4++) {
            class237[] var5 = arg2.field2839[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class237[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class237 var8 = var6[var7];
                    if (class298.method2048(var8.field2862)) {
                        class188 var9 = class188.method1989(var8.field2861);
                        int var10 = var9.field2099 == 0 ? -3355444 : -3407872;
                        if (class298.field3572.field3580 == var8.field2862) {
                            this.method4248(arg0, arg1, var8.field2860, var10);
                        }
                        if (class298.field3559.field3580 == var8.field2862) {
                            this.method4248(arg0, arg1, var8.field2860, -3355444);
                            this.method4248(arg0, arg1, var8.field2860 + 1, var10);
                        }
                        if (class298.field3560.field3580 == var8.field2862) {
                            if (var8.field2860 == 0) {
                                class449.method7210(this.field2764 * arg0, this.field2764 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2860 == 1) {
                                class449.method7210(this.field2764 * arg0 + this.field2764 - 1, this.field2764 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2860 == 2) {
                                class449.method7210(this.field2764 * arg0 + this.field2764 - 1, this.field2764 * (63 - arg1) + this.field2764 - 1, 1, var10);
                            }
                            if (var8.field2860 == 3) {
                                class449.method7210(this.field2764 * arg0, this.field2764 * (63 - arg1) + this.field2764 - 1, 1, var10);
                            }
                        }
                        if (class298.field3561.field3580 == var8.field2862) {
                            int var11 = var8.field2860 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2764; var12++) {
                                    class449.method7210(this.field2764 * arg0 + var12, this.field2764 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2764; var13++) {
                                    class449.method7210(this.field2764 * arg0 + var13, this.field2764 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hd.j(IILjava/util/HashSet;IS)V")
    public void method4213(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2766.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class290 var9 = (class290) var8.getKey();
            int var10 = (int) ((float) var9.field3351 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3354 * var5 - var6);
            class244 var12 = (class244) var8.getValue();
            if (var12 != null && var12.method4464()) {
                var12.field2902 = var10;
                var12.field2903 = var11;
                class172 var13 = class172.method2598(var12.method4095());
                if (!arg2.contains(var13.method3001())) {
                    this.method4252(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("hd.z(Ljava/util/HashSet;IIS)V")
    public void method4214(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2765.iterator();
        while (var4.hasNext()) {
            class244 var5 = (class244) var4.next();
            if (var5.method4464()) {
                class172 var6 = class172.method2598(var5.method4095());
                if (var6 != null && arg0.contains(var6.method3001())) {
                    this.method4216(var6, var5.field2902, var5.field2903, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("hd.i(Lfx;IIIII)V")
    public void method4216(class172 arg0, int arg1, int arg2, int arg3, int arg4) {
        class453 var6 = arg0.method3009(false);
        if (var6 == null) {
            return;
        }
        var6.method7322(arg1 - var6.field4768 / 2, arg2 - var6.field4770 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class449.method7202(arg1, arg2, 15, 16776960, 128);
            class449.method7202(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("hd.u(Liw;IIFI)V")
    public void method4252(class244 arg0, int arg1, int arg2, float arg3) {
        class172 var5 = class172.method2598(arg0.method4095());
        this.method4217(var5, arg1, arg2);
        this.method4218(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("hd.ag(Lfx;III)V")
    public void method4217(class172 arg0, int arg1, int arg2) {
        class453 var4 = arg0.method3009(false);
        if (var4 != null) {
            int var5 = this.method4220(var4, arg0.field1883);
            int var6 = this.method4296(var4, arg0.field1884);
            var4.method7322(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("hd.ar(Liw;Lfx;IIFI)V")
    public void method4218(class244 arg0, class172 arg1, int arg2, int arg3, float arg4) {
        class239 var6 = arg0.method4098();
        if (var6 != null && var6.field2871.method4086(arg4)) {
            class350 var7 = (class350) this.field2767.get(var6.field2871);
            var7.method5732(var6.field2867, arg2 - var6.field2868 / 2, arg3, var6.field2868, var6.field2869, 0xFF000000 | arg1.field1872, 0, 1, 0, var7.field4189 / 2);
        }
    }

    @ObfuscatedName("hd.am(IILjava/util/HashSet;II)V")
    public void method4206(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2765.iterator();
        while (var6.hasNext()) {
            class244 var7 = (class244) var6.next();
            if (var7.method4464()) {
                int var8 = var7.field2900.field3351 % 64;
                int var9 = var7.field2900.field3354 % 64;
                var7.field2902 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2903 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4095())) {
                    this.method4252(var7, var7.field2902, var7.field2903, var5);
                }
            }
        }
    }

    @ObfuscatedName("hd.ac(Lqr;Lfj;I)I")
    public int method4220(class453 arg0, class178 arg1) {
        switch(arg1.field1940) {
            case 0:
                return -arg0.field4768 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4768;
        }
    }

    @ObfuscatedName("hd.ab(Lqr;Lfk;B)I")
    public int method4296(class453 arg0, class180 arg1) {
        switch(arg1.field1996) {
            case 0:
                return 0;
            case 1:
                return -arg0.field4770 / 2;
            default:
                return -arg0.field4770;
        }
    }

    @ObfuscatedName("hd.aj(II)Lip;")
    public class239 method4222(int arg0) {
        class172 var2 = class172.method2598(arg0);
        return this.method4223(var2);
    }

    @ObfuscatedName("hd.ae(Lfx;B)Lip;")
    public class239 method4223(class172 arg0) {
        if (arg0.field1871 == null || this.field2767 == null || this.field2767.get(class223.field2714) == null) {
            return null;
        }
        int var2 = arg0.field1869;
        class223[] var3 = new class223[] { class223.field2710, class223.field2711, class223.field2714 };
        class223[] var4 = var3;
        int var5 = 0;
        class223 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class223 var6 = var4[var5];
            if (var6.field2713 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class350 var9 = (class350) this.field2767.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5813(arg0.field1871, 1000000);
        String[] var11 = new String[var10];
        var9.method5724(arg0.field1871, (int[]) null, var11);
        int var12 = var11.length * var9.field4189 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method5723(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class239(arg0.field1871, var13, var12, var7);
    }

    @ObfuscatedName("hd.az(IIIIII)Ljava/util/List;")
    public List method4224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2766.values().iterator();
            while (var7.hasNext()) {
                class244 var8 = (class244) var7.next();
                if (var8.method4464() && var8.method4458(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2765.iterator();
            while (var9.hasNext()) {
                class244 var10 = (class244) var9.next();
                if (var10.method4464() && var10.method4458(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("hd.ap(I)Ljava/util/List;")
    public List method4225() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2765);
        var1.addAll(this.field2766.values());
        return var1;
    }

    @ObfuscatedName("hd.as(IIIII)V")
    public void method4248(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class449.method7212(this.field2764 * arg0, this.field2764 * (63 - arg1), this.field2764, arg3);
        }
        if (var5 == 1) {
            class449.method7210(this.field2764 * arg0, this.field2764 * (63 - arg1), this.field2764, arg3);
        }
        if (var5 == 2) {
            class449.method7212(this.field2764 * arg0 + this.field2764 - 1, this.field2764 * (63 - arg1), this.field2764, arg3);
        }
        if (var5 == 3) {
            class449.method7210(this.field2764 * arg0, this.field2764 * (63 - arg1) + this.field2764 - 1, this.field2764, arg3);
        }
    }
}
