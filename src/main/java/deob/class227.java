package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("hy")
public class class227 {

    @ObfuscatedName("hy.k")
    public static class255 field2753 = new class255(37748736, 256);

    @ObfuscatedName("hy.w")
    public int field2751;

    @ObfuscatedName("hy.s")
    public int field2752;

    @ObfuscatedName("hy.q")
    public class221 field2759;

    @ObfuscatedName("hy.m")
    public LinkedList field2754;

    @ObfuscatedName("hy.x")
    public int field2750;

    @ObfuscatedName("hy.j")
    public int field2746;

    @ObfuscatedName("hy.v")
    public List field2757;

    @ObfuscatedName("hy.h")
    public HashMap field2758;

    @ObfuscatedName("hy.t")
    public final HashMap field2755;

    @ObfuscatedName("ba.c(IIIS)J")
    public static long method2019(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    public class227(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2751 = arg0;
        this.field2752 = arg1;
        this.field2754 = new LinkedList();
        this.field2757 = new LinkedList();
        this.field2758 = new HashMap();
        this.field2750 = arg2 | 0xFF000000;
        this.field2755 = arg3;
    }

    @ObfuscatedName("hy.p(IIII)V")
    public void method4493(int arg0, int arg1, int arg2) {
        int var4 = this.field2751;
        int var5 = this.field2752;
        int var6 = this.field2746;
        class458 var7 = (class458) field2753.method4743(method2019(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field2746 * 64 == arg2) {
            var7.method7602(arg0, arg1);
        } else {
            var7.method7657(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("hy.f(Lhr;Ljava/util/List;B)V")
    public void method4418(class221 arg0, List arg1) {
        this.field2758.clear();
        this.field2759 = arg0;
        this.method4423(arg1);
    }

    @ObfuscatedName("hy.n(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4419(HashSet arg0, List arg1) {
        this.field2758.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class229 var4 = (class229) var3.next();
            if (var4.method4640() == this.field2751 && var4.method4642() == this.field2752) {
                this.field2754.add(var4);
            }
        }
        this.method4423(arg1);
    }

    @ObfuscatedName("hy.k(IIIILig;I)V")
    public void method4420(int arg0, int arg1, int arg2, int arg3, class235 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2834; var8++) {
                    class237[] var9 = arg4.field2836[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class237[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class188 var13;
                            boolean var18;
                            label58: {
                                class237 var12 = var10[var11];
                                var13 = Statics.method5147(var12.field2853);
                                if (var13.field2111 != null) {
                                    int[] var14 = var13.field2111;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class188 var17 = Statics.method5147(var16);
                                        if (var17.field2105 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field2105 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method4421(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hy.w(Lgz;IIILig;I)V")
    public void method4421(class188 arg0, int arg1, int arg2, int arg3, class235 arg4) {
        class291 var6 = new class291(arg1, this.field2751 * 64 + arg2, this.field2752 * 64 + arg3);
        Object var7 = null;
        class291 var8;
        if (this.field2759 == null) {
            class229 var9 = (class229) arg4;
            var8 = new class291(var9.field2833 + arg1, var9.field2841 * 64 + arg2 + var9.method4579() * 8, var9.field2839 * 64 + arg3 + var9.method4580() * 8);
        } else {
            var8 = new class291(this.field2759.field2833 + arg1, this.field2759.field2841 * 64 + arg2, this.field2759.field2839 * 64 + arg3);
        }
        class244 var10;
        if (arg0.field2111 == null) {
            class172 var11 = class172.method2879(arg0.field2105);
            var10 = new class232(var8, var6, var11.field1854, this.method4447(var11));
        } else {
            var10 = new class224(var8, var6, arg0.field2077, this);
        }
        class172 var12 = class172.method2879(var10.method4295());
        if (var12.field1856) {
            this.field2758.put(new class291(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("hy.s(I)V")
    public void method4422() {
        Iterator var1 = this.field2758.values().iterator();
        while (var1.hasNext()) {
            class244 var2 = (class244) var1.next();
            if (var2 instanceof class224) {
                ((class224) var2).method4297();
            }
        }
    }

    @ObfuscatedName("hy.q(Ljava/util/List;I)V")
    public void method4423(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class232 var3 = (class232) var2.next();
            if (class172.method2879(var3.field2804).field1856 && var3.field2888.field3349 >> 6 == this.field2751 && var3.field2888.field3350 >> 6 == this.field2752) {
                class232 var4 = new class232(var3.field2888, var3.field2888, var3.field2804, this.method4446(var3.field2804));
                this.field2757.add(var4);
            }
        }
    }

    @ObfuscatedName("hy.m(B)V")
    public void method4485() {
        if (this.field2759 != null) {
            this.field2759.method4622();
            return;
        }
        Iterator var1 = this.field2754.iterator();
        while (var1.hasNext()) {
            class229 var2 = (class229) var1.next();
            var2.method4622();
        }
    }

    @ObfuscatedName("hy.x(Llv;I)Z")
    public boolean method4425(class317 arg0) {
        this.field2758.clear();
        if (this.field2759 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2754.iterator();
            while (var3.hasNext()) {
                class229 var4 = (class229) var3.next();
                var4.method4621(arg0);
                var2 &= var4.method4648();
            }
            if (var2) {
                Iterator var5 = this.field2754.iterator();
                while (var5.hasNext()) {
                    class229 var6 = (class229) var5.next();
                    this.method4420(var6.method4594() * 8, var6.method4582() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2759.method4621(arg0);
            if (this.field2759.method4648()) {
                this.method4420(0, 0, 64, 64, this.field2759);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("hy.j(ILiw;[Lqu;Llv;Llv;B)V")
    public void method4426(int arg0, class248 arg1, class457[] arg2, class317 arg3, class317 arg4) {
        this.field2746 = arg0;
        if (this.field2759 == null && this.field2754.isEmpty()) {
            return;
        }
        int var6 = this.field2751;
        int var7 = this.field2752;
        class458 var8 = (class458) field2753.method4743(method2019(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method4425(arg3);
        int var11;
        if (this.field2759 == null) {
            var11 = ((class235) this.field2754.getFirst()).field2830;
        } else {
            var11 = this.field2759.field2830;
        }
        boolean var12 = var10 & arg4.method5418(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method5454(var11);
        class238 var14;
        if (var13 == null) {
            var14 = new class238();
        } else {
            var14 = new class238(class29.method316(var13).field4826);
        }
        class458 var16 = new class458(this.field2746 * 64, this.field2746 * 64);
        var16.method7675();
        if (this.field2759 == null) {
            this.method4430(arg1, arg2, var14);
        } else {
            this.method4429(arg1, arg2, var14);
        }
        int var17 = this.field2751;
        int var18 = this.field2752;
        int var19 = this.field2746;
        field2753.method4742(var16, method2019(var17, var18, var19), var16.field4826.length * 4);
        this.method4485();
    }

    @ObfuscatedName("hy.v(IIILjava/util/HashSet;I)V")
    public void method4427(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4437(arg0, arg1, arg3, arg2);
        this.method4488(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("hy.h(Ljava/util/HashSet;III)V")
    public void method4428(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2758.values().iterator();
        while (var4.hasNext()) {
            class244 var5 = (class244) var4.next();
            if (var5.method4673()) {
                int var6 = var5.method4295();
                if (arg0.contains(var6)) {
                    class172 var7 = class172.method2879(var6);
                    this.method4503(var7, var5.field2889, var5.field2890, arg1, arg2);
                }
            }
        }
        this.method4438(arg0, arg1, arg2);
    }

    @ObfuscatedName("hy.t(Liw;[Lqu;Lir;I)V")
    public void method4429(class248 arg0, class457[] arg1, class238 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4468(var4, var5, this.field2759, arg0, arg2);
                this.method4522(var4, var5, this.field2759, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4450(var6, var7, this.field2759, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("hy.u(Liw;[Lqu;Lir;B)V")
    public void method4430(class248 arg0, class457[] arg1, class238 arg2) {
        Iterator var4 = this.field2754.iterator();
        while (var4.hasNext()) {
            class229 var5 = (class229) var4.next();
            for (int var6 = var5.method4594() * 8; var6 < var5.method4594() * 8 + 8; var6++) {
                for (int var7 = var5.method4582() * 8; var7 < var5.method4582() * 8 + 8; var7++) {
                    this.method4468(var6, var7, var5, arg0, arg2);
                    this.method4522(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2754.iterator();
        while (var8.hasNext()) {
            class229 var9 = (class229) var8.next();
            for (int var10 = var9.method4594() * 8; var10 < var9.method4594() * 8 + 8; var10++) {
                for (int var11 = var9.method4582() * 8; var11 < var9.method4582() * 8 + 8; var11++) {
                    this.method4450(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("hy.d(IILig;Liw;[Lqu;I)V")
    public void method4450(int arg0, int arg1, class235 arg2, class248 arg3, class457[] arg4) {
        this.method4436(arg0, arg1, arg2);
        this.method4465(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("hy.b(IILig;Liw;Lir;S)V")
    public void method4468(int arg0, int arg1, class235 arg2, class248 arg3, class238 arg4) {
        int var6 = arg2.field2837[0][arg0][arg1] - 1;
        int var7 = arg2.field2838[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class454.method7518(this.field2746 * arg0, this.field2746 * (63 - arg1), this.field2746, this.field2746, this.field2750);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2750;
            class190 var10 = (class190) class190.field2187.method4789((long) var7);
            class190 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field2184.method5499(4, var7);
                class190 var13 = new class190();
                if (var12 != null) {
                    var13.method3562(new class445(var12), var7);
                }
                var13.method3549();
                class190.field2187.method4781(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field2185 >= 0) {
                var15 = var11.field2185 | 0xFF000000;
            } else if (var11.field2183 >= 0) {
                int var16 = class242.method313(Statics.field2393.method4113(var11.field2183), 96);
                var15 = class202.field2377[var16] | 0xFF000000;
            } else if (var11.field2182 == 16711935) {
                var15 = var9;
            } else {
                int var17 = var11.field2186;
                int var18 = var11.field2181;
                int var19 = var11.field2188;
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
                int var23 = class242.method313(var20, 96);
                var15 = class202.field2377[var23] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field2840[0][arg0][arg1] == 0) {
            class454.method7518(this.field2746 * arg0, this.field2746 * (63 - arg1), this.field2746, this.field2746, var8);
            return;
        }
        int var24 = this.method4434(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class454.method7518(this.field2746 * arg0, this.field2746 * (63 - arg1), this.field2746, this.field2746, var24);
        } else {
            arg3.method4717(this.field2746 * arg0, this.field2746 * (63 - arg1), var24, var8, this.field2746, this.field2746, arg2.field2840[0][arg0][arg1], arg2.field2835[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("hy.a(IILig;Liw;B)V")
    public void method4522(int arg0, int arg1, class235 arg2, class248 arg3) {
        for (int var5 = 1; var5 < arg2.field2834; var5++) {
            int var6 = arg2.field2838[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2750;
                class190 var8 = (class190) class190.field2187.method4789((long) var6);
                class190 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field2184.method5499(4, var6);
                    class190 var11 = new class190();
                    if (var10 != null) {
                        var11.method3562(new class445(var10), var6);
                    }
                    var11.method3549();
                    class190.field2187.method4781(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field2185 >= 0) {
                    var13 = var9.field2185 | 0xFF000000;
                } else if (var9.field2183 >= 0) {
                    int var14 = class242.method313(Statics.field2393.method4113(var9.field2183), 96);
                    var13 = class202.field2377[var14] | 0xFF000000;
                } else if (var9.field2182 == 16711935) {
                    var13 = var7;
                } else {
                    int var15 = var9.field2186;
                    int var16 = var9.field2181;
                    int var17 = var9.field2188;
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
                    int var21 = class242.method313(var18, 96);
                    var13 = class202.field2377[var21] | 0xFF000000;
                }
                if (arg2.field2840[var5][arg0][arg1] == 0) {
                    class454.method7518(this.field2746 * arg0, this.field2746 * (63 - arg1), this.field2746, this.field2746, var13);
                } else {
                    arg3.method4717(this.field2746 * arg0, this.field2746 * (63 - arg1), 0, var13, this.field2746, this.field2746, arg2.field2840[var5][arg0][arg1], arg2.field2835[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("hy.l(IILig;Lir;I)I")
    public int method4434(int arg0, int arg1, class235 arg2, class238 arg3) {
        return arg2.field2837[0][arg0][arg1] == 0 ? this.field2750 : arg3.method4652(arg0, arg1);
    }

    @ObfuscatedName("hy.e(IILig;[Lqu;I)V")
    public void method4465(int arg0, int arg1, class235 arg2, class457[] arg3) {
        for (int var5 = 0; var5 < arg2.field2834; var5++) {
            class237[] var6 = arg2.field2836[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class237[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class237 var9 = var7[var8];
                    if (Statics.method2667(var9.field2850) || class299.method1939(var9.field2850)) {
                        class188 var10 = Statics.method5147(var9.field2853);
                        if (var10.field2114 != -1) {
                            if (var10.field2114 == 46 || var10.field2114 == 52) {
                                arg3[var10.field2114].method7575(this.field2746 * arg0, this.field2746 * (63 - arg1), this.field2746 * 2 + 1, this.field2746 * 2 + 1);
                            } else {
                                arg3[var10.field2114].method7575(this.field2746 * arg0, this.field2746 * (63 - arg1), this.field2746 * 2, this.field2746 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hy.g(IILig;I)V")
    public void method4436(int arg0, int arg1, class235 arg2) {
        for (int var4 = 0; var4 < arg2.field2834; var4++) {
            class237[] var5 = arg2.field2836[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class237[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class237 var8 = var6[var7];
                    if (class299.method3138(var8.field2850)) {
                        class188 var9 = Statics.method5147(var8.field2853);
                        int var10 = var9.field2089 == 0 ? -3355444 : -3407872;
                        if (class299.field3573.field3583 == var8.field2850) {
                            this.method4514(arg0, arg1, var8.field2851, var10);
                        }
                        if (class299.field3562.field3583 == var8.field2850) {
                            this.method4514(arg0, arg1, var8.field2851, -3355444);
                            this.method4514(arg0, arg1, var8.field2851 + 1, var10);
                        }
                        if (class299.field3564.field3583 == var8.field2850) {
                            if (var8.field2851 == 0) {
                                class454.method7501(this.field2746 * arg0, this.field2746 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2851 == 1) {
                                class454.method7501(this.field2746 * arg0 + this.field2746 - 1, this.field2746 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2851 == 2) {
                                class454.method7501(this.field2746 * arg0 + this.field2746 - 1, this.field2746 * (63 - arg1) + this.field2746 - 1, 1, var10);
                            }
                            if (var8.field2851 == 3) {
                                class454.method7501(this.field2746 * arg0, this.field2746 * (63 - arg1) + this.field2746 - 1, 1, var10);
                            }
                        }
                        if (class299.field3584.field3583 == var8.field2850) {
                            int var11 = var8.field2851 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2746; var12++) {
                                    class454.method7501(this.field2746 * arg0 + var12, this.field2746 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2746; var13++) {
                                    class454.method7501(this.field2746 * arg0 + var13, this.field2746 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hy.y(IILjava/util/HashSet;IB)V")
    public void method4437(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2758.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class291 var9 = (class291) var8.getKey();
            int var10 = (int) ((float) var9.field3349 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3350 * var5 - var6);
            class244 var12 = (class244) var8.getValue();
            if (var12 != null && var12.method4673()) {
                var12.field2889 = var10;
                var12.field2890 = var11;
                class172 var13 = class172.method2879(var12.method4295());
                if (!arg2.contains(var13.method3179())) {
                    this.method4440(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("hy.i(Ljava/util/HashSet;IIB)V")
    public void method4438(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2757.iterator();
        while (var4.hasNext()) {
            class244 var5 = (class244) var4.next();
            if (var5.method4673()) {
                class172 var6 = class172.method2879(var5.method4295());
                if (var6 != null && arg0.contains(var6.method3179())) {
                    this.method4503(var6, var5.field2889, var5.field2890, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("hy.r(Lfh;IIIIB)V")
    public void method4503(class172 arg0, int arg1, int arg2, int arg3, int arg4) {
        class458 var6 = arg0.method3188(false);
        if (var6 == null) {
            return;
        }
        var6.method7604(arg1 - var6.field4825 / 2, arg2 - var6.field4829 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class454.method7493(arg1, arg2, 15, 16776960, 128);
            class454.method7493(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("hy.z(Lib;IIFI)V")
    public void method4440(class244 arg0, int arg1, int arg2, float arg3) {
        class172 var5 = class172.method2879(arg0.method4295());
        this.method4532(var5, arg1, arg2);
        this.method4439(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("hy.o(Lfh;III)V")
    public void method4532(class172 arg0, int arg1, int arg2) {
        class458 var4 = arg0.method3188(false);
        if (var4 != null) {
            int var5 = this.method4444(var4, arg0.field1865);
            int var6 = this.method4445(var4, arg0.field1866);
            var4.method7604(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("hy.as(Lib;Lfh;IIFB)V")
    public void method4439(class244 arg0, class172 arg1, int arg2, int arg3, float arg4) {
        class239 var6 = arg0.method4298();
        if (var6 != null && var6.field2860.method4294(arg4)) {
            class351 var7 = (class351) this.field2755.get(var6.field2860);
            var7.method5974(var6.field2861, arg2 - var6.field2862 / 2, arg3, var6.field2862, var6.field2859, 0xFF000000 | arg1.field1846, 0, 1, 0, var7.field4224 / 2);
        }
    }

    @ObfuscatedName("hy.ac(IILjava/util/HashSet;II)V")
    public void method4488(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2757.iterator();
        while (var6.hasNext()) {
            class244 var7 = (class244) var6.next();
            if (var7.method4673()) {
                int var8 = var7.field2888.field3349 % 64;
                int var9 = var7.field2888.field3350 % 64;
                var7.field2889 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2890 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4295())) {
                    this.method4440(var7, var7.field2889, var7.field2890, var5);
                }
            }
        }
    }

    @ObfuscatedName("hy.ao(Lqi;Lfy;I)I")
    public int method4444(class458 arg0, class178 arg1) {
        switch(arg1.field1925) {
            case 1:
                return 0;
            case 2:
                return -arg0.field4825 / 2;
            default:
                return -arg0.field4825;
        }
    }

    @ObfuscatedName("hy.ar(Lqi;Lfw;B)I")
    public int method4445(class458 arg0, class180 arg1) {
        switch(arg1.field1978) {
            case 0:
                return -arg0.field4829 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field4829;
        }
    }

    @ObfuscatedName("hy.aq(IB)Lik;")
    public class239 method4446(int arg0) {
        class172 var2 = class172.method2879(arg0);
        return this.method4447(var2);
    }

    @ObfuscatedName("hy.ai(Lfh;I)Lik;")
    public class239 method4447(class172 arg0) {
        if (arg0.field1861 == null || this.field2755 == null || this.field2755.get(class223.field2702) == null) {
            return null;
        }
        int var2 = arg0.field1855;
        class223[] var3 = new class223[] { class223.field2708, class223.field2702, class223.field2707 };
        class223[] var4 = var3;
        int var5 = 0;
        class223 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class223 var6 = var4[var5];
            if (var6.field2705 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class351 var9 = (class351) this.field2755.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5950(arg0.field1861, 1000000);
        String[] var11 = new String[var10];
        var9.method5948(arg0.field1861, (int[]) null, var11);
        int var12 = var11.length * var9.field4224 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method5952(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class239(arg0.field1861, var13, var12, var7);
    }

    @ObfuscatedName("hy.an(IIIIII)Ljava/util/List;")
    public List method4515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2758.values().iterator();
            while (var7.hasNext()) {
                class244 var8 = (class244) var7.next();
                if (var8.method4673() && var8.method4671(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2757.iterator();
            while (var9.hasNext()) {
                class244 var10 = (class244) var9.next();
                if (var10.method4673() && var10.method4671(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("hy.aa(B)Ljava/util/List;")
    public List method4449() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2757);
        var1.addAll(this.field2758.values());
        return var1;
    }

    @ObfuscatedName("hy.ak(IIIIS)V")
    public void method4514(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class454.method7503(this.field2746 * arg0, this.field2746 * (63 - arg1), this.field2746, arg3);
        }
        if (var5 == 1) {
            class454.method7501(this.field2746 * arg0, this.field2746 * (63 - arg1), this.field2746, arg3);
        }
        if (var5 == 2) {
            class454.method7503(this.field2746 * arg0 + this.field2746 - 1, this.field2746 * (63 - arg1), this.field2746, arg3);
        }
        if (var5 == 3) {
            class454.method7501(this.field2746 * arg0, this.field2746 * (63 - arg1) + this.field2746 - 1, this.field2746, arg3);
        }
    }
}
