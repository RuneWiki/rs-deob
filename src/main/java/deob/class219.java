package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("hw")
public class class219 {

    @ObfuscatedName("hw.r")
    public static class247 field2655 = new class247(37748736, 256);

    @ObfuscatedName("hw.o")
    public int field2647;

    @ObfuscatedName("hw.i")
    public int field2652;

    @ObfuscatedName("hw.w")
    public class213 field2648;

    @ObfuscatedName("hw.v")
    public LinkedList field2649;

    @ObfuscatedName("hw.a")
    public int field2654;

    @ObfuscatedName("hw.y")
    public int field2651;

    @ObfuscatedName("hw.u")
    public List field2641;

    @ObfuscatedName("hw.h")
    public HashMap field2653;

    @ObfuscatedName("hw.q")
    public final HashMap field2650;

    @ObfuscatedName("cl.c(B)V")
    public static void method2127() {
        field2655.method4447();
    }

    @ObfuscatedName("gh.l(I)V")
    public static void method3941() {
        field2655.method4446(5);
    }

    public class219(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2647 = arg0;
        this.field2652 = arg1;
        this.field2649 = new LinkedList();
        this.field2641 = new LinkedList();
        this.field2653 = new HashMap();
        this.field2654 = arg2 | 0xFF000000;
        this.field2650 = arg3;
    }

    @ObfuscatedName("hw.s(IIIB)V")
    public void method4181(int arg0, int arg1, int arg2) {
        int var4 = this.field2647;
        int var5 = this.field2652;
        int var6 = this.field2651;
        class247 var7 = field2655;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class434 var10 = (class434) var7.method4441(var8);
        if (var10 == null) {
            return;
        }
        if (this.field2651 * 64 == arg2) {
            var10.method7064(arg0, arg1);
        } else {
            var10.method7131(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("hw.e(Lhu;Ljava/util/List;I)V")
    public void method4137(class213 arg0, List arg1) {
        this.field2653.clear();
        this.field2648 = arg0;
        this.method4106(arg1);
    }

    @ObfuscatedName("hw.r(Ljava/util/HashSet;Ljava/util/List;S)V")
    public void method4102(HashSet arg0, List arg1) {
        this.field2653.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class221 var4 = (class221) var3.next();
            if (var4.method4321() == this.field2647 && var4.method4322() == this.field2652) {
                this.field2649.add(var4);
            }
        }
        this.method4106(arg1);
    }

    @ObfuscatedName("hw.o(IIIILhx;B)V")
    public void method4103(int arg0, int arg1, int arg2, int arg3, class227 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2735; var8++) {
                    class229[] var9 = arg4.field2739[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class229[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class229 var12 = var10[var11];
                            class180 var13 = class180.method3056(var12.field2752);
                            if (method5689(var13)) {
                                this.method4104(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hw.i(Lfg;IIILhx;B)V")
    public void method4104(class180 arg0, int arg1, int arg2, int arg3, class227 arg4) {
        class282 var6 = new class282(arg1, this.field2647 * 64 + arg2, this.field2652 * 64 + arg3);
        Object var7 = null;
        class282 var8;
        if (this.field2648 == null) {
            class221 var9 = (class221) arg4;
            var8 = new class282(var9.field2731 + arg1, var9.field2734 * 64 + arg2 + var9.method4273() * 8, var9.field2728 * 64 + arg3 + var9.method4274() * 8);
        } else {
            var8 = new class282(this.field2648.field2731 + arg1, this.field2648.field2734 * 64 + arg2, this.field2648.field2728 * 64 + arg3);
        }
        class236 var10;
        if (arg0.field2010 == null) {
            class164 var11 = class164.method2597(arg0.field1997);
            var10 = new class224(var8, var6, var11.field1764, this.method4214(var11));
        } else {
            var10 = new class216(var8, var6, arg0.field1976, this);
        }
        class164 var12 = class164.method2597(var10.method3980());
        if (var12.field1770) {
            this.field2653.put(new class282(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("hw.w(I)V")
    public void method4141() {
        Iterator var1 = this.field2653.values().iterator();
        while (var1.hasNext()) {
            class236 var2 = (class236) var1.next();
            if (var2 instanceof class216) {
                ((class216) var2).method3979();
            }
        }
    }

    @ObfuscatedName("hw.v(Ljava/util/List;I)V")
    public void method4106(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class224 var3 = (class224) var2.next();
            if (class164.method2597(var3.field2698).field1770 && var3.field2788.field3228 >> 6 == this.field2647 && var3.field2788.field3229 >> 6 == this.field2652) {
                class224 var4 = new class224(var3.field2788, var3.field2788, var3.field2698, this.method4129(var3.field2698));
                this.field2641.add(var4);
            }
        }
    }

    @ObfuscatedName("hw.a(I)V")
    public void method4107() {
        if (this.field2648 != null) {
            this.field2648.method4333();
            return;
        }
        Iterator var1 = this.field2649.iterator();
        while (var1.hasNext()) {
            class221 var2 = (class221) var1.next();
            var2.method4333();
        }
    }

    @ObfuscatedName("hw.y(Lkq;S)Z")
    public boolean method4108(class307 arg0) {
        this.field2653.clear();
        if (this.field2648 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2649.iterator();
            while (var3.hasNext()) {
                class221 var4 = (class221) var3.next();
                var4.method4317(arg0);
                var2 &= var4.method4316();
            }
            if (var2) {
                Iterator var5 = this.field2649.iterator();
                while (var5.hasNext()) {
                    class221 var6 = (class221) var5.next();
                    this.method4103(var6.method4275() * 8, var6.method4276() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2648.method4317(arg0);
            if (this.field2648.method4316()) {
                this.method4103(0, 0, 64, 64, this.field2648);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("hw.u(ILif;[Lpg;Lkq;Lkq;I)V")
    public void method4175(int arg0, class240 arg1, class433[] arg2, class307 arg3, class307 arg4) {
        this.field2651 = arg0;
        if (this.field2648 == null && this.field2649.isEmpty()) {
            return;
        }
        int var6 = this.field2647;
        int var7 = this.field2652;
        class247 var8 = field2655;
        long var9 = (long) (arg0 << 16 | var6 << 8 | var7);
        class434 var11 = (class434) var8.method4441(var9);
        if (var11 != null) {
            return;
        }
        boolean var12 = true;
        boolean var13 = var12 & this.method4108(arg3);
        int var14;
        if (this.field2648 == null) {
            var14 = ((class227) this.field2649.getFirst()).field2733;
        } else {
            var14 = this.field2648.field2733;
        }
        boolean var15 = var13 & arg4.method5036(var14);
        if (!var15) {
            return;
        }
        byte[] var16 = arg4.method5056(var14);
        class230 var17;
        if (var16 == null) {
            var17 = new class230();
        } else {
            var17 = new class230(class29.method2590(var16).field4606);
        }
        class434 var19 = new class434(this.field2651 * 64, this.field2651 * 64);
        var19.method7082();
        if (this.field2648 == null) {
            this.method4113(arg1, arg2, var17);
        } else {
            this.method4203(arg1, arg2, var17);
        }
        int var20 = this.field2647;
        int var21 = this.field2652;
        int var22 = this.field2651;
        class247 var23 = field2655;
        long var25 = (long) (var22 << 16 | var20 << 8 | var21);
        var23.method4440(var19, var25, var19.field4606.length * 4);
        this.method4107();
    }

    @ObfuscatedName("hw.h(IIILjava/util/HashSet;I)V")
    public void method4110(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4120(arg0, arg1, arg3, arg2);
        this.method4126(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("hw.q(Ljava/util/HashSet;III)V")
    public void method4111(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2653.values().iterator();
        while (var4.hasNext()) {
            class236 var5 = (class236) var4.next();
            if (var5.method4375()) {
                int var6 = var5.method3980();
                if (arg0.contains(var6)) {
                    class164 var7 = class164.method2597(var6);
                    this.method4122(var7, var5.field2785, var5.field2787, arg1, arg2);
                }
            }
        }
        this.method4116(arg0, arg1, arg2);
    }

    @ObfuscatedName("hw.x(Lif;[Lpg;Lhl;I)V")
    public void method4203(class240 arg0, class433[] arg1, class230 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4115(var4, var5, this.field2648, arg0, arg2);
                this.method4156(var4, var5, this.field2648, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4114(var6, var7, this.field2648, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("hw.p(Lif;[Lpg;Lhl;I)V")
    public void method4113(class240 arg0, class433[] arg1, class230 arg2) {
        Iterator var4 = this.field2649.iterator();
        while (var4.hasNext()) {
            class221 var5 = (class221) var4.next();
            for (int var6 = var5.method4275() * 8; var6 < var5.method4275() * 8 + 8; var6++) {
                for (int var7 = var5.method4276() * 8; var7 < var5.method4276() * 8 + 8; var7++) {
                    this.method4115(var6, var7, var5, arg0, arg2);
                    this.method4156(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2649.iterator();
        while (var8.hasNext()) {
            class221 var9 = (class221) var8.next();
            for (int var10 = var9.method4275() * 8; var10 < var9.method4275() * 8 + 8; var10++) {
                for (int var11 = var9.method4276() * 8; var11 < var9.method4276() * 8 + 8; var11++) {
                    this.method4114(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("hw.n(IILhx;Lif;[Lpg;I)V")
    public void method4114(int arg0, int arg1, class227 arg2, class240 arg3, class433[] arg4) {
        this.method4123(arg0, arg1, arg2);
        this.method4118(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("hw.m(IILhx;Lif;Lhl;I)V")
    public void method4115(int arg0, int arg1, class227 arg2, class240 arg3, class230 arg4) {
        int var6 = arg2.field2740[0][arg0][arg1] - 1;
        int var7 = arg2.field2736[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class430.method6958(this.field2651 * arg0, this.field2651 * (63 - arg1), this.field2651, this.field2651, this.field2654);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2654;
            class182 var10 = (class182) class182.field2074.method4472((long) var7);
            class182 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field2073.method5066(4, var7);
                class182 var13 = new class182();
                if (var12 != null) {
                    var13.method3259(new class421(var12), var7);
                }
                var13.method3258();
                class182.field2074.method4482(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field2086 >= 0) {
                var15 = var11.field2086 | 0xFF000000;
            } else if (var11.field2076 >= 0) {
                int var16 = class234.method367(Statics.field2281.method3787(var11.field2076), 96);
                var15 = class194.field2260[var16] | 0xFF000000;
            } else if (var11.field2075 == 16711935) {
                var15 = var9;
            } else {
                int var17 = var11.field2078;
                int var18 = var11.field2080;
                int var19 = var11.field2081;
                if (var19 > 179) {
                    var18 /= 2;
                }
                if (var19 > 192) {
                    var18 /= 2;
                }
                if (var19 > 217) {
                    var18 /= 2;
                }
                if (var19 > 243) {
                    var18 /= 2;
                }
                int var20 = var19 / 2 + (var17 / 4 << 10) + (var18 / 32 << 7);
                int var23 = class234.method367(var20, 96);
                var15 = class194.field2260[var23] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field2737[0][arg0][arg1] == 0) {
            class430.method6958(this.field2651 * arg0, this.field2651 * (63 - arg1), this.field2651, this.field2651, var8);
            return;
        }
        int var24 = this.method4117(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class430.method6958(this.field2651 * arg0, this.field2651 * (63 - arg1), this.field2651, this.field2651, var24);
        } else {
            arg3.method4417(this.field2651 * arg0, this.field2651 * (63 - arg1), var24, var8, this.field2651, this.field2651, arg2.field2737[0][arg0][arg1], arg2.field2732[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("hw.d(IILhx;Lif;I)V")
    public void method4156(int arg0, int arg1, class227 arg2, class240 arg3) {
        for (int var5 = 1; var5 < arg2.field2735; var5++) {
            int var6 = arg2.field2736[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2654;
                class182 var8 = (class182) class182.field2074.method4472((long) var6);
                class182 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field2073.method5066(4, var6);
                    class182 var11 = new class182();
                    if (var10 != null) {
                        var11.method3259(new class421(var10), var6);
                    }
                    var11.method3258();
                    class182.field2074.method4482(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field2086 >= 0) {
                    var13 = var9.field2086 | 0xFF000000;
                } else if (var9.field2076 >= 0) {
                    int var14 = class234.method367(Statics.field2281.method3787(var9.field2076), 96);
                    var13 = class194.field2260[var14] | 0xFF000000;
                } else if (var9.field2075 == 16711935) {
                    var13 = var7;
                } else {
                    int var15 = var9.field2078;
                    int var16 = var9.field2080;
                    int var17 = var9.field2081;
                    if (var17 > 179) {
                        var16 /= 2;
                    }
                    if (var17 > 192) {
                        var16 /= 2;
                    }
                    if (var17 > 217) {
                        var16 /= 2;
                    }
                    if (var17 > 243) {
                        var16 /= 2;
                    }
                    int var18 = var17 / 2 + (var15 / 4 << 10) + (var16 / 32 << 7);
                    int var21 = class234.method367(var18, 96);
                    var13 = class194.field2260[var21] | 0xFF000000;
                }
                if (arg2.field2737[var5][arg0][arg1] == 0) {
                    class430.method6958(this.field2651 * arg0, this.field2651 * (63 - arg1), this.field2651, this.field2651, var13);
                } else {
                    arg3.method4417(this.field2651 * arg0, this.field2651 * (63 - arg1), 0, var13, this.field2651, this.field2651, arg2.field2737[var5][arg0][arg1], arg2.field2732[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("hw.j(IILhx;Lhl;S)I")
    public int method4117(int arg0, int arg1, class227 arg2, class230 arg3) {
        return arg2.field2740[0][arg0][arg1] == 0 ? this.field2654 : arg3.method4344(arg0, arg1);
    }

    @ObfuscatedName("hw.f(IILhx;[Lpg;B)V")
    public void method4118(int arg0, int arg1, class227 arg2, class433[] arg3) {
        for (int var5 = 0; var5 < arg2.field2735; var5++) {
            class229[] var6 = arg2.field2739[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class229[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class229 var9 = var7[var8];
                    int var10 = var9.field2750;
                    boolean var11 = var10 >= class289.field3439.field3444 && var10 <= class289.field3445.field3444;
                    if (!var11) {
                        int var12 = var9.field2750;
                        boolean var13 = class289.field3438.field3444 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class180 var14 = class180.method3056(var9.field2752);
                    if (var14.field1998 != -1) {
                        if (var14.field1998 == 46 || var14.field1998 == 52) {
                            arg3[var14.field1998].method7036(this.field2651 * arg0, this.field2651 * (63 - arg1), this.field2651 * 2 + 1, this.field2651 * 2 + 1);
                        } else {
                            arg3[var14.field1998].method7036(this.field2651 * arg0, this.field2651 * (63 - arg1), this.field2651 * 2, this.field2651 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hw.g(IILhx;B)V")
    public void method4123(int arg0, int arg1, class227 arg2) {
        for (int var4 = 0; var4 < arg2.field2735; var4++) {
            class229[] var5 = arg2.field2739[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class229[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class229 var8 = var6[var7];
                    if (class289.method4931(var8.field2750)) {
                        class180 var9 = class180.method3056(var8.field2752);
                        int var10 = var9.field1984 == 0 ? -3355444 : -3407872;
                        if (class289.field3425.field3444 == var8.field2750) {
                            this.method4119(arg0, arg1, var8.field2751, var10);
                        }
                        if (class289.field3426.field3444 == var8.field2750) {
                            this.method4119(arg0, arg1, var8.field2751, -3355444);
                            this.method4119(arg0, arg1, var8.field2751 + 1, var10);
                        }
                        if (class289.field3427.field3444 == var8.field2750) {
                            if (var8.field2751 == 0) {
                                class430.method6963(this.field2651 * arg0, this.field2651 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2751 == 1) {
                                class430.method6963(this.field2651 * arg0 + this.field2651 - 1, this.field2651 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2751 == 2) {
                                class430.method6963(this.field2651 * arg0 + this.field2651 - 1, this.field2651 * (63 - arg1) + this.field2651 - 1, 1, var10);
                            }
                            if (var8.field2751 == 3) {
                                class430.method6963(this.field2651 * arg0, this.field2651 * (63 - arg1) + this.field2651 - 1, 1, var10);
                            }
                        }
                        if (class289.field3430.field3444 == var8.field2750) {
                            int var11 = var8.field2751 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2651; var12++) {
                                    class430.method6963(this.field2651 * arg0 + var12, this.field2651 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2651; var13++) {
                                    class430.method6963(this.field2651 * arg0 + var13, this.field2651 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hw.t(IILjava/util/HashSet;II)V")
    public void method4120(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2653.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class282 var9 = (class282) var8.getKey();
            int var10 = (int) ((float) var9.field3228 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3229 * var5 - var6);
            class236 var12 = (class236) var8.getValue();
            if (var12 != null && var12.method4375()) {
                var12.field2785 = var10;
                var12.field2787 = var11;
                class164 var13 = class164.method2597(var12.method3980());
                if (!arg2.contains(var13.method2873())) {
                    this.method4128(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("hw.k(Ljava/util/HashSet;IIB)V")
    public void method4116(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2641.iterator();
        while (var4.hasNext()) {
            class236 var5 = (class236) var4.next();
            if (var5.method4375()) {
                class164 var6 = class164.method2597(var5.method3980());
                if (var6 != null && arg0.contains(var6.method2873())) {
                    this.method4122(var6, var5.field2785, var5.field2787, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("hw.b(Lfr;IIIII)V")
    public void method4122(class164 arg0, int arg1, int arg2, int arg3, int arg4) {
        class434 var6 = arg0.method2855(false);
        if (var6 == null) {
            return;
        }
        var6.method7066(arg1 - var6.field4602 / 2, arg2 - var6.field4603 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class430.method6956(arg1, arg2, 15, 16776960, 128);
            class430.method6956(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("hw.z(Lix;IIFI)V")
    public void method4128(class236 arg0, int arg1, int arg2, float arg3) {
        class164 var5 = class164.method2597(arg0.method3980());
        this.method4155(var5, arg1, arg2);
        this.method4174(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("hw.ap(Lfr;III)V")
    public void method4155(class164 arg0, int arg1, int arg2) {
        class434 var4 = arg0.method2855(false);
        if (var4 != null) {
            int var5 = this.method4127(var4, arg0.field1767);
            int var6 = this.method4207(var4, arg0.field1780);
            var4.method7066(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("hw.af(Lix;Lfr;IIFI)V")
    public void method4174(class236 arg0, class164 arg1, int arg2, int arg3, float arg4) {
        class231 var6 = arg0.method3992();
        if (var6 != null && var6.field2761.method3963(arg4)) {
            class332 var7 = (class332) this.field2650.get(var6.field2761);
            var7.method5519(var6.field2758, arg2 - var6.field2763 / 2, arg3, var6.field2763, var6.field2760, 0xFF000000 | arg1.field1768, 0, 1, 0, var7.field4045 / 2);
        }
    }

    @ObfuscatedName("hw.ak(IILjava/util/HashSet;II)V")
    public void method4126(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2641.iterator();
        while (var6.hasNext()) {
            class236 var7 = (class236) var6.next();
            if (var7.method4375()) {
                int var8 = var7.field2788.field3228 % 64;
                int var9 = var7.field2788.field3229 % 64;
                var7.field2785 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2787 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method3980())) {
                    this.method4128(var7, var7.field2785, var7.field2787, var5);
                }
            }
        }
    }

    @ObfuscatedName("hw.av(Lpt;Lfh;I)I")
    public int method4127(class434 arg0, class170 arg1) {
        switch(arg1.field1841) {
            case 0:
                return 0;
            case 1:
                return -arg0.field4602 / 2;
            default:
                return -arg0.field4602;
        }
    }

    @ObfuscatedName("hw.ar(Lpt;Lfo;B)I")
    public int method4207(class434 arg0, class172 arg1) {
        switch(arg1.field1893) {
            case 0:
                return -arg0.field4603 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4603;
        }
    }

    @ObfuscatedName("mn.al(Lfg;I)Z")
    public static boolean method5689(class180 arg0) {
        if (arg0.field2010 != null) {
            int[] var1 = arg0.field2010;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class180 var4 = class180.method3056(var3);
                if (var4.field1997 != -1) {
                    return true;
                }
            }
        } else if (arg0.field1997 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("hw.aa(II)Lhp;")
    public class231 method4129(int arg0) {
        class164 var2 = class164.method2597(arg0);
        return this.method4214(var2);
    }

    @ObfuscatedName("hw.ao(Lfr;I)Lhp;")
    public class231 method4214(class164 arg0) {
        if (arg0.field1782 == null || this.field2650 == null || this.field2650.get(class215.field2601) == null) {
            return null;
        }
        class215 var2 = class215.method3972(arg0.field1779);
        if (var2 == null) {
            return null;
        }
        class332 var3 = (class332) this.field2650.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5443(arg0.field1782, 1000000);
        String[] var5 = new String[var4];
        var3.method5442(arg0.field1782, (int[]) null, var5);
        int var6 = var5.length * var3.field4045 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5441(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class231(arg0.field1782, var7, var6, var2);
    }

    @ObfuscatedName("hw.aq(IIIIII)Ljava/util/List;")
    public List method4101(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2653.values().iterator();
            while (var7.hasNext()) {
                class236 var8 = (class236) var7.next();
                if (var8.method4375() && var8.method4369(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2641.iterator();
            while (var9.hasNext()) {
                class236 var10 = (class236) var9.next();
                if (var10.method4375() && var10.method4369(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("hw.ay(I)Ljava/util/List;")
    public List method4132() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2641);
        var1.addAll(this.field2653.values());
        return var1;
    }

    @ObfuscatedName("hw.ac(IIIIB)V")
    public void method4119(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class430.method6947(this.field2651 * arg0, this.field2651 * (63 - arg1), this.field2651, arg3);
        }
        if (var5 == 1) {
            class430.method6963(this.field2651 * arg0, this.field2651 * (63 - arg1), this.field2651, arg3);
        }
        if (var5 == 2) {
            class430.method6947(this.field2651 * arg0 + this.field2651 - 1, this.field2651 * (63 - arg1), this.field2651, arg3);
        }
        if (var5 == 3) {
            class430.method6963(this.field2651 * arg0, this.field2651 * (63 - arg1) + this.field2651 - 1, this.field2651, arg3);
        }
    }
}
