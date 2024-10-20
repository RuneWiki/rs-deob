package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("hq")
public class class226 {

    @ObfuscatedName("hq.c")
    public static class254 field2727 = new class254(37748736, 256);

    @ObfuscatedName("hq.q")
    public int field2729;

    @ObfuscatedName("hq.i")
    public int field2735;

    @ObfuscatedName("hq.k")
    public class220 field2730;

    @ObfuscatedName("hq.o")
    public LinkedList field2728;

    @ObfuscatedName("hq.n")
    public int field2732;

    @ObfuscatedName("hq.d")
    public int field2736;

    @ObfuscatedName("hq.a")
    public List field2734;

    @ObfuscatedName("hq.m")
    public HashMap field2723;

    @ObfuscatedName("hq.u")
    public final HashMap field2737;

    @ObfuscatedName("hy.s(IIII)J")
    public static long method4432(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("eb.h(B)V")
    public static void method2665() {
        field2727.method4573(5);
    }

    public class226(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2729 = arg0;
        this.field2735 = arg1;
        this.field2728 = new LinkedList();
        this.field2734 = new LinkedList();
        this.field2723 = new HashMap();
        this.field2732 = arg2 | 0xFF000000;
        this.field2737 = arg3;
    }

    @ObfuscatedName("hq.w(IIIB)V")
    public void method4224(int arg0, int arg1, int arg2) {
        int var4 = this.field2729;
        int var5 = this.field2735;
        int var6 = this.field2736;
        class457 var7 = (class457) field2727.method4578(method4432(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field2736 * 64 == arg2) {
            var7.method7406(arg0, arg1);
        } else {
            var7.method7373(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("hq.v(Lhu;Ljava/util/List;I)V")
    public void method4225(class220 arg0, List arg1) {
        this.field2723.clear();
        this.field2730 = arg0;
        this.method4230(arg1);
    }

    @ObfuscatedName("hq.c(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4339(HashSet arg0, List arg1) {
        this.field2723.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class228 var4 = (class228) var3.next();
            if (var4.method4452() == this.field2729 && var4.method4453() == this.field2735) {
                this.field2728.add(var4);
            }
        }
        this.method4230(arg1);
    }

    @ObfuscatedName("hq.q(IIIILhc;I)V")
    public void method4227(int arg0, int arg1, int arg2, int arg3, class234 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2805; var8++) {
                    class236[] var9 = arg4.field2817[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class236[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class187 var13;
                            boolean var18;
                            label58: {
                                class236 var12 = var10[var11];
                                var13 = class187.method2907(var12.field2829);
                                if (var13.field2077 != null) {
                                    int[] var14 = var13.field2077;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class187 var17 = class187.method2907(var16);
                                        if (var17.field2064 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field2064 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method4228(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hq.i(Lgc;IIILhc;I)V")
    public void method4228(class187 arg0, int arg1, int arg2, int arg3, class234 arg4) {
        class290 var6 = new class290(arg1, this.field2729 * 64 + arg2, this.field2735 * 64 + arg3);
        Object var7 = null;
        class290 var8;
        if (this.field2730 == null) {
            class228 var9 = (class228) arg4;
            var8 = new class290(var9.field2813 + arg1, var9.field2812 * 64 + arg2 + var9.method4397() * 8, var9.field2816 * 64 + arg3 + var9.method4414() * 8);
        } else {
            var8 = new class290(this.field2730.field2813 + arg1, this.field2730.field2812 * 64 + arg2, this.field2730.field2816 * 64 + arg3);
        }
        class243 var10;
        if (arg0.field2077 == null) {
            class171 var11 = class171.method3061(arg0.field2064);
            var10 = new class231(var8, var6, var11.field1814, this.method4254(var11));
        } else {
            var10 = new class223(var8, var6, arg0.field2043, this);
        }
        class171 var12 = class171.method3061(var10.method4097());
        if (var12.field1821) {
            this.field2723.put(new class290(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("hq.k(I)V")
    public void method4229() {
        Iterator var1 = this.field2723.values().iterator();
        while (var1.hasNext()) {
            class243 var2 = (class243) var1.next();
            if (var2 instanceof class223) {
                ((class223) var2).method4098();
            }
        }
    }

    @ObfuscatedName("hq.o(Ljava/util/List;B)V")
    public void method4230(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class231 var3 = (class231) var2.next();
            if (class171.method3061(var3.field2780).field1821 && var3.field2864.field3320 >> 6 == this.field2729 && var3.field2864.field3317 >> 6 == this.field2735) {
                class231 var4 = new class231(var3.field2864, var3.field2864, var3.field2780, this.method4239(var3.field2780));
                this.field2734.add(var4);
            }
        }
    }

    @ObfuscatedName("hq.n(B)V")
    public void method4340() {
        if (this.field2730 != null) {
            this.field2730.method4448();
            return;
        }
        Iterator var1 = this.field2728.iterator();
        while (var1.hasNext()) {
            class228 var2 = (class228) var1.next();
            var2.method4448();
        }
    }

    @ObfuscatedName("hq.d(Lls;I)Z")
    public boolean method4232(class316 arg0) {
        this.field2723.clear();
        if (this.field2730 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2728.iterator();
            while (var3.hasNext()) {
                class228 var4 = (class228) var3.next();
                var4.method4471(arg0);
                var2 &= var4.method4446();
            }
            if (var2) {
                Iterator var5 = this.field2728.iterator();
                while (var5.hasNext()) {
                    class228 var6 = (class228) var5.next();
                    this.method4227(var6.method4399() * 8, var6.method4400() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2730.method4471(arg0);
            if (this.field2730.method4446()) {
                this.method4227(0, 0, 64, 64, this.field2730);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("hq.a(ILih;[Lqe;Lls;Lls;B)V")
    public void method4233(int arg0, class247 arg1, class456[] arg2, class316 arg3, class316 arg4) {
        this.field2736 = arg0;
        if (this.field2730 == null && this.field2728.isEmpty()) {
            return;
        }
        int var6 = this.field2729;
        int var7 = this.field2735;
        class457 var8 = (class457) field2727.method4578(method4432(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method4232(arg3);
        int var11;
        if (this.field2730 == null) {
            var11 = ((class234) this.field2728.getFirst()).field2811;
        } else {
            var11 = this.field2730.field2811;
        }
        boolean var12 = var10 & arg4.method5183(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method5186(var11);
        class237 var14 = class237.method1957(var13);
        class457 var15 = new class457(this.field2736 * 64, this.field2736 * 64);
        var15.method7343();
        if (this.field2730 == null) {
            this.method4248(arg1, arg2, var14);
        } else {
            this.method4223(arg1, arg2, var14);
        }
        int var16 = this.field2729;
        int var17 = this.field2735;
        int var18 = this.field2736;
        field2727.method4572(var15, method4432(var16, var17, var18), var15.field4803.length * 4);
        this.method4340();
    }

    @ObfuscatedName("hq.m(IIILjava/util/HashSet;I)V")
    public void method4234(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4245(arg0, arg1, arg3, arg2);
        this.method4250(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("hq.u(Ljava/util/HashSet;IIB)V")
    public void method4299(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2723.values().iterator();
        while (var4.hasNext()) {
            class243 var5 = (class243) var4.next();
            if (var5.method4493()) {
                int var6 = var5.method4097();
                if (arg0.contains(var6)) {
                    class171 var7 = class171.method3061(var6);
                    this.method4246(var7, var5.field2865, var5.field2866, arg1, arg2);
                }
            }
        }
        this.method4341(arg0, arg1, arg2);
    }

    @ObfuscatedName("hq.l(Lih;[Lqe;Lii;I)V")
    public void method4223(class247 arg0, class456[] arg1, class237 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4269(var4, var5, this.field2730, arg0, arg2);
                this.method4240(var4, var5, this.field2730, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4301(var6, var7, this.field2730, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("hq.z(Lih;[Lqe;Lii;I)V")
    public void method4248(class247 arg0, class456[] arg1, class237 arg2) {
        Iterator var4 = this.field2728.iterator();
        while (var4.hasNext()) {
            class228 var5 = (class228) var4.next();
            for (int var6 = var5.method4399() * 8; var6 < var5.method4399() * 8 + 8; var6++) {
                for (int var7 = var5.method4400() * 8; var7 < var5.method4400() * 8 + 8; var7++) {
                    this.method4269(var6, var7, var5, arg0, arg2);
                    this.method4240(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2728.iterator();
        while (var8.hasNext()) {
            class228 var9 = (class228) var8.next();
            for (int var10 = var9.method4399() * 8; var10 < var9.method4399() * 8 + 8; var10++) {
                for (int var11 = var9.method4400() * 8; var11 < var9.method4400() * 8 + 8; var11++) {
                    this.method4301(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("hq.r(IILhc;Lih;[Lqe;I)V")
    public void method4301(int arg0, int arg1, class234 arg2, class247 arg3, class456[] arg4) {
        this.method4326(arg0, arg1, arg2);
        this.method4242(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("hq.y(IILhc;Lih;Lii;I)V")
    public void method4269(int arg0, int arg1, class234 arg2, class247 arg3, class237 arg4) {
        int var6 = arg2.field2810[0][arg0][arg1] - 1;
        int var7 = arg2.field2814[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class453.method7245(this.field2736 * arg0, this.field2736 * (63 - arg1), this.field2736, this.field2736, this.field2732);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class241.method423(var7, this.field2732);
        }
        if (var7 > -1 && arg2.field2815[0][arg0][arg1] == 0) {
            class453.method7245(this.field2736 * arg0, this.field2736 * (63 - arg1), this.field2736, this.field2736, var8);
            return;
        }
        int var9 = this.method4241(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class453.method7245(this.field2736 * arg0, this.field2736 * (63 - arg1), this.field2736, this.field2736, var9);
        } else {
            arg3.method4535(this.field2736 * arg0, this.field2736 * (63 - arg1), var9, var8, this.field2736, this.field2736, arg2.field2815[0][arg0][arg1], arg2.field2809[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("hq.p(IILhc;Lih;I)V")
    public void method4240(int arg0, int arg1, class234 arg2, class247 arg3) {
        for (int var5 = 1; var5 < arg2.field2805; var5++) {
            int var6 = arg2.field2814[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class241.method423(var6, this.field2732);
                if (arg2.field2815[var5][arg0][arg1] == 0) {
                    class453.method7245(this.field2736 * arg0, this.field2736 * (63 - arg1), this.field2736, this.field2736, var7);
                } else {
                    arg3.method4535(this.field2736 * arg0, this.field2736 * (63 - arg1), 0, var7, this.field2736, this.field2736, arg2.field2815[var5][arg0][arg1], arg2.field2809[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("hq.e(IILhc;Lii;I)I")
    public int method4241(int arg0, int arg1, class234 arg2, class237 arg3) {
        return arg2.field2810[0][arg0][arg1] == 0 ? this.field2732 : arg3.method4476(arg0, arg1);
    }

    @ObfuscatedName("hq.b(IILhc;[Lqe;I)V")
    public void method4242(int arg0, int arg1, class234 arg2, class456[] arg3) {
        for (int var5 = 0; var5 < arg2.field2805; var5++) {
            class236[] var6 = arg2.field2817[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class236[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class236 var9 = var7[var8];
                    int var10 = var9.field2827;
                    boolean var11 = var10 >= class298.field3539.field3542 && var10 <= class298.field3540.field3542;
                    if (!var11) {
                        int var12 = var9.field2827;
                        boolean var13 = class298.field3527.field3542 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class187 var14 = class187.method2907(var9.field2829);
                    if (var14.field2065 != -1) {
                        if (var14.field2065 == 46 || var14.field2065 == 52) {
                            arg3[var14.field2065].method7325(this.field2736 * arg0, this.field2736 * (63 - arg1), this.field2736 * 2 + 1, this.field2736 * 2 + 1);
                        } else {
                            arg3[var14.field2065].method7325(this.field2736 * arg0, this.field2736 * (63 - arg1), this.field2736 * 2, this.field2736 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hq.x(IILhc;B)V")
    public void method4326(int arg0, int arg1, class234 arg2) {
        for (int var4 = 0; var4 < arg2.field2805; var4++) {
            class236[] var5 = arg2.field2817[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class236[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class236 var8 = var6[var7];
                    int var9 = var8.field2827;
                    boolean var10 = var9 >= class298.field3533.field3542 && var9 <= class298.field3532.field3542 || class298.field3521.field3542 == var9;
                    if (var10) {
                        class187 var11 = class187.method2907(var8.field2829);
                        int var12 = var11.field2075 == 0 ? -3355444 : -3407872;
                        if (class298.field3533.field3542 == var8.field2827) {
                            this.method4331(arg0, arg1, var8.field2828, var12);
                        }
                        if (class298.field3524.field3542 == var8.field2827) {
                            this.method4331(arg0, arg1, var8.field2828, -3355444);
                            this.method4331(arg0, arg1, var8.field2828 + 1, var12);
                        }
                        if (class298.field3532.field3542 == var8.field2827) {
                            if (var8.field2828 == 0) {
                                class453.method7254(this.field2736 * arg0, this.field2736 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2828 == 1) {
                                class453.method7254(this.field2736 * arg0 + this.field2736 - 1, this.field2736 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2828 == 2) {
                                class453.method7254(this.field2736 * arg0 + this.field2736 - 1, this.field2736 * (63 - arg1) + this.field2736 - 1, 1, var12);
                            }
                            if (var8.field2828 == 3) {
                                class453.method7254(this.field2736 * arg0, this.field2736 * (63 - arg1) + this.field2736 - 1, 1, var12);
                            }
                        }
                        if (class298.field3521.field3542 == var8.field2827) {
                            int var13 = var8.field2828 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2736; var14++) {
                                    class453.method7254(this.field2736 * arg0 + var14, this.field2736 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2736; var15++) {
                                    class453.method7254(this.field2736 * arg0 + var15, this.field2736 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hq.f(IILjava/util/HashSet;II)V")
    public void method4245(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2723.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class290 var9 = (class290) var8.getKey();
            int var10 = (int) ((float) var9.field3320 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3317 * var5 - var6);
            class243 var12 = (class243) var8.getValue();
            if (var12 != null && var12.method4493()) {
                var12.field2865 = var10;
                var12.field2866 = var11;
                class171 var13 = class171.method3061(var12.method4097());
                if (!arg2.contains(var13.method2963())) {
                    this.method4325(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("hq.t(Ljava/util/HashSet;IIB)V")
    public void method4341(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2734.iterator();
        while (var4.hasNext()) {
            class243 var5 = (class243) var4.next();
            if (var5.method4493()) {
                class171 var6 = class171.method3061(var5.method4097());
                if (var6 != null && arg0.contains(var6.method2963())) {
                    this.method4246(var6, var5.field2865, var5.field2866, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("hq.j(Lfy;IIIIB)V")
    public void method4246(class171 arg0, int arg1, int arg2, int arg3, int arg4) {
        class457 var6 = arg0.method2961(false);
        if (var6 == null) {
            return;
        }
        var6.method7352(arg1 - var6.field4799 / 2, arg2 - var6.field4797 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class453.method7263(arg1, arg2, 15, 16776960, 128);
            class453.method7263(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("hq.g(Lil;IIFI)V")
    public void method4325(class243 arg0, int arg1, int arg2, float arg3) {
        class171 var5 = class171.method3061(arg0.method4097());
        this.method4274(var5, arg1, arg2);
        this.method4249(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("hq.ar(Lfy;III)V")
    public void method4274(class171 arg0, int arg1, int arg2) {
        class457 var4 = arg0.method2961(false);
        if (var4 != null) {
            int var5 = this.method4264(var4, arg0.field1815);
            int var6 = this.method4252(var4, arg0.field1831);
            var4.method7352(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("hq.aq(Lil;Lfy;IIFB)V")
    public void method4249(class243 arg0, class171 arg1, int arg2, int arg3, float arg4) {
        class238 var6 = arg0.method4100();
        if (var6 != null && var6.field2835.method4087(arg4)) {
            class350 var7 = (class350) this.field2737.get(var6.field2835);
            var7.method5774(var6.field2836, arg2 - var6.field2834 / 2, arg3, var6.field2834, var6.field2837, 0xFF000000 | arg1.field1818, 0, 1, 0, var7.field4184 / 2);
        }
    }

    @ObfuscatedName("hq.av(IILjava/util/HashSet;IB)V")
    public void method4250(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2734.iterator();
        while (var6.hasNext()) {
            class243 var7 = (class243) var6.next();
            if (var7.method4493()) {
                int var8 = var7.field2864.field3320 % 64;
                int var9 = var7.field2864.field3317 % 64;
                var7.field2865 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2866 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4097())) {
                    this.method4325(var7, var7.field2865, var7.field2866, var5);
                }
            }
        }
    }

    @ObfuscatedName("hq.aj(Lqn;Lfo;I)I")
    public int method4264(class457 arg0, class177 arg1) {
        switch(arg1.field1897) {
            case 0:
                return -arg0.field4799 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field4799;
        }
    }

    @ObfuscatedName("hq.ax(Lqn;Lfl;I)I")
    public int method4252(class457 arg0, class179 arg1) {
        switch(arg1.field1952) {
            case 0:
                return -arg0.field4797 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4797;
        }
    }

    @ObfuscatedName("hq.ab(IS)Liw;")
    public class238 method4239(int arg0) {
        class171 var2 = class171.method3061(arg0);
        return this.method4254(var2);
    }

    @ObfuscatedName("hq.ak(Lfy;I)Liw;")
    public class238 method4254(class171 arg0) {
        if (arg0.field1817 == null || this.field2737 == null || this.field2737.get(class222.field2684) == null) {
            return null;
        }
        int var2 = arg0.field1826;
        class222[] var3 = class222.method4092();
        int var4 = 0;
        class222 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class222 var5 = var3[var4];
            if (var5.field2681 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class350 var8 = (class350) this.field2737.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method5735(arg0.field1817, 1000000);
        String[] var10 = new String[var9];
        var8.method5734(arg0.field1817, (int[]) null, var10);
        int var11 = var10.length * var8.field4184 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method5716(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class238(arg0.field1817, var12, var11, var6);
    }

    @ObfuscatedName("hq.au(IIIIII)Ljava/util/List;")
    public List method4255(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2723.values().iterator();
            while (var7.hasNext()) {
                class243 var8 = (class243) var7.next();
                if (var8.method4493() && var8.method4492(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2734.iterator();
            while (var9.hasNext()) {
                class243 var10 = (class243) var9.next();
                if (var10.method4493() && var10.method4492(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("hq.ae(I)Ljava/util/List;")
    public List method4256() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2734);
        var1.addAll(this.field2723.values());
        return var1;
    }

    @ObfuscatedName("hq.as(IIIII)V")
    public void method4331(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class453.method7262(this.field2736 * arg0, this.field2736 * (63 - arg1), this.field2736, arg3);
        }
        if (var5 == 1) {
            class453.method7254(this.field2736 * arg0, this.field2736 * (63 - arg1), this.field2736, arg3);
        }
        if (var5 == 2) {
            class453.method7262(this.field2736 * arg0 + this.field2736 - 1, this.field2736 * (63 - arg1), this.field2736, arg3);
        }
        if (var5 == 3) {
            class453.method7254(this.field2736 * arg0, this.field2736 * (63 - arg1) + this.field2736 - 1, this.field2736, arg3);
        }
    }
}
