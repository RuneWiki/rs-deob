package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("jl")
public class class238 {

    @ObfuscatedName("jl.ab")
    public static class297 field2476 = new class297(37748736, 256);

    @ObfuscatedName("jl.au")
    public int field2479;

    @ObfuscatedName("jl.aa")
    public int field2478;

    @ObfuscatedName("jl.ac")
    public class232 field2481;

    @ObfuscatedName("jl.al")
    public LinkedList field2482;

    @ObfuscatedName("jl.az")
    public int field2483;

    @ObfuscatedName("jl.ap")
    public int field2484;

    @ObfuscatedName("jl.av")
    public List field2480;

    @ObfuscatedName("jl.ax")
    public HashMap field2486;

    @ObfuscatedName("jl.as")
    public final HashMap field2485;

    @ObfuscatedName("fd.at(IIII)Luz;")
    public static class541 method2941(int arg0, int arg1, int arg2) {
        class297 var3 = field2476;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class541) var3.method5254(var4);
    }

    public class238(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2479 = arg0;
        this.field2478 = arg1;
        this.field2482 = new LinkedList();
        this.field2480 = new LinkedList();
        this.field2486 = new HashMap();
        this.field2483 = arg2 | 0xFF000000;
        this.field2485 = arg3;
    }

    @ObfuscatedName("jl.ah(IIII)V")
    public void method4248(int arg0, int arg1, int arg2) {
        class541 var4 = method2941(this.field2479, this.field2478, this.field2484);
        if (var4 == null) {
            return;
        }
        if (this.field2484 * 64 == arg2) {
            var4.method8883(arg0, arg1);
        } else {
            var4.method8906(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("jl.ar(Lii;Ljava/util/List;I)V")
    public void method4294(class232 arg0, List arg1) {
        this.field2486.clear();
        this.field2481 = arg0;
        this.method4253(arg1);
    }

    @ObfuscatedName("jl.ao(Ljava/util/HashSet;Ljava/util/List;S)V")
    public void method4288(HashSet arg0, List arg1) {
        this.field2486.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class240 var4 = (class240) var3.next();
            if (var4.method4445() == this.field2479 && var4.method4446() == this.field2478) {
                this.field2482.add(var4);
            }
        }
        this.method4253(arg1);
    }

    @ObfuscatedName("jl.ab(IIIILjm;I)V")
    public void method4250(int arg0, int arg1, int arg2, int arg3, class246 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2573; var8++) {
                    class248[] var9 = arg4.field2571[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class248[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class248 var12 = var10[var11];
                            class202 var13 = Statics.method4138(var12.field2589);
                            if (method6195(var13)) {
                                this.method4251(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jl.au(Lhs;IIILjm;B)V")
    public void method4251(class202 arg0, int arg1, int arg2, int arg3, class246 arg4) {
        class334 var6 = new class334(arg1, this.field2479 * 64 + arg2, this.field2478 * 64 + arg3);
        Object var7 = null;
        class334 var8;
        if (this.field2481 == null) {
            class240 var9 = (class240) arg4;
            var8 = new class334(var9.field2565 + arg1, var9.field2575 * 64 + arg2 + var9.method4395() * 8, var9.field2562 * 64 + arg3 + var9.method4396() * 8);
        } else {
            var8 = new class334(this.field2481.field2565 + arg1, this.field2481.field2575 * 64 + arg2, this.field2481.field2562 * 64 + arg3);
        }
        class255 var10;
        if (arg0.field2114 == null) {
            class178 var11 = class178.method3048(arg0.field2104);
            var10 = new class243(var8, var6, var11.field1827, this.method4261(var11));
        } else {
            var10 = new class235(var8, var6, arg0.field2088, this);
        }
        class178 var12 = class178.method3048(var10.method4123());
        if (var12.field1826) {
            this.field2486.put(new class334(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("jl.aa(I)V")
    public void method4252() {
        Iterator var1 = this.field2486.values().iterator();
        while (var1.hasNext()) {
            class255 var2 = (class255) var1.next();
            if (var2 instanceof class235) {
                ((class235) var2).method4117();
            }
        }
    }

    @ObfuscatedName("jl.ac(Ljava/util/List;I)V")
    public void method4253(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class243 var3 = (class243) var2.next();
            if (class178.method3048(var3.field2529).field1826 && var3.field2623.field3561 >> 6 == this.field2479 && var3.field2623.field3563 >> 6 == this.field2478) {
                class243 var4 = new class243(var3.field2623, var3.field2623, var3.field2529, this.method4276(var3.field2529));
                this.field2480.add(var4);
            }
        }
    }

    @ObfuscatedName("jl.al(B)V")
    public void method4247() {
        if (this.field2481 != null) {
            this.field2481.method4441();
            return;
        }
        Iterator var1 = this.field2482.iterator();
        while (var1.hasNext()) {
            class240 var2 = (class240) var1.next();
            var2.method4441();
        }
    }

    @ObfuscatedName("jl.az(Lol;I)Z")
    public boolean method4353(class371 arg0) {
        this.field2486.clear();
        if (this.field2481 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2482.iterator();
            while (var3.hasNext()) {
                class240 var4 = (class240) var3.next();
                var4.method4440(arg0);
                var2 &= var4.method4438();
            }
            if (var2) {
                Iterator var5 = this.field2482.iterator();
                while (var5.hasNext()) {
                    class240 var6 = (class240) var5.next();
                    this.method4250(var6.method4412() * 8, var6.method4409() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2481.method4440(arg0);
            if (this.field2481.method4438()) {
                this.method4250(0, 0, 64, 64, this.field2481);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("jl.ap(ILja;[Lup;Lol;Lol;I)V")
    public void method4256(int arg0, class259 arg1, class540[] arg2, class371 arg3, class371 arg4) {
        this.field2484 = arg0;
        if (this.field2481 == null && this.field2482.isEmpty() || method2941(this.field2479, this.field2478, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4353(arg3);
        int var8;
        if (this.field2481 == null) {
            var8 = ((class246) this.field2482.getFirst()).field2567;
        } else {
            var8 = this.field2481.field2567;
        }
        boolean var9 = var7 & arg4.method6288(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method6298(var8);
        class249 var11;
        if (var10 == null) {
            var11 = new class249();
        } else {
            var11 = new class249(class31.method7894(var10).field5244);
        }
        class541 var13 = new class541(this.field2484 * 64, this.field2484 * 64);
        var13.method8896();
        if (this.field2481 == null) {
            this.method4354(arg1, arg2, var11);
        } else {
            this.method4259(arg1, arg2, var11);
        }
        int var14 = this.field2479;
        int var15 = this.field2478;
        int var16 = this.field2484;
        class297 var17 = field2476;
        long var19 = (long) (var16 << 16 | var14 << 8 | var15);
        var17.method5255(var13, var19, var13.field5244.length * 4);
        this.method4247();
    }

    @ObfuscatedName("jl.av(IIILjava/util/HashSet;B)V")
    public void method4257(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4346(arg0, arg1, arg3, arg2);
        this.method4273(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("jl.ax(Ljava/util/HashSet;III)V")
    public void method4258(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2486.values().iterator();
        while (var4.hasNext()) {
            class255 var5 = (class255) var4.next();
            if (var5.method4489()) {
                int var6 = var5.method4123();
                if (arg0.contains(var6)) {
                    class178 var7 = class178.method3048(var6);
                    this.method4269(var7, var5.field2625, var5.field2626, arg1, arg2);
                }
            }
        }
        this.method4268(arg0, arg1, arg2);
    }

    @ObfuscatedName("jl.as(Lja;[Lup;Lju;B)V")
    public void method4259(class259 arg0, class540[] arg1, class249 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4311(var4, var5, this.field2481, arg0, arg2);
                this.method4263(var4, var5, this.field2481, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4291(var6, var7, this.field2481, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("jl.ay(Lja;[Lup;Lju;B)V")
    public void method4354(class259 arg0, class540[] arg1, class249 arg2) {
        Iterator var4 = this.field2482.iterator();
        while (var4.hasNext()) {
            class240 var5 = (class240) var4.next();
            for (int var6 = var5.method4412() * 8; var6 < var5.method4412() * 8 + 8; var6++) {
                for (int var7 = var5.method4409() * 8; var7 < var5.method4409() * 8 + 8; var7++) {
                    this.method4311(var6, var7, var5, arg0, arg2);
                    this.method4263(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2482.iterator();
        while (var8.hasNext()) {
            class240 var9 = (class240) var8.next();
            for (int var10 = var9.method4412() * 8; var10 < var9.method4412() * 8 + 8; var10++) {
                for (int var11 = var9.method4409() * 8; var11 < var9.method4409() * 8 + 8; var11++) {
                    this.method4291(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("jl.ak(IILjm;Lja;[Lup;I)V")
    public void method4291(int arg0, int arg1, class246 arg2, class259 arg3, class540[] arg4) {
        this.method4334(arg0, arg1, arg2);
        this.method4265(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("jl.aj(IILjm;Lja;Lju;I)V")
    public void method4311(int arg0, int arg1, class246 arg2, class259 arg3, class249 arg4) {
        int var6 = arg2.field2569[0][arg0][arg1] - 1;
        int var7 = arg2.field2570[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class537.method8837(this.field2484 * arg0, this.field2484 * (63 - arg1), this.field2484, this.field2484, this.field2483);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class253.method7526(var7, this.field2483);
        }
        if (var7 > -1 && arg2.field2561[0][arg0][arg1] == 0) {
            class537.method8837(this.field2484 * arg0, this.field2484 * (63 - arg1), this.field2484, this.field2484, var8);
            return;
        }
        int var9 = this.method4264(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class537.method8837(this.field2484 * arg0, this.field2484 * (63 - arg1), this.field2484, this.field2484, var9);
        } else {
            arg3.method4519(this.field2484 * arg0, this.field2484 * (63 - arg1), var9, var8, this.field2484, this.field2484, arg2.field2561[0][arg0][arg1], arg2.field2572[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("jl.am(IILjm;Lja;I)V")
    public void method4263(int arg0, int arg1, class246 arg2, class259 arg3) {
        for (int var5 = 1; var5 < arg2.field2573; var5++) {
            int var6 = arg2.field2570[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class253.method7526(var6, this.field2483);
                if (arg2.field2561[var5][arg0][arg1] == 0) {
                    class537.method8837(this.field2484 * arg0, this.field2484 * (63 - arg1), this.field2484, this.field2484, var7);
                } else {
                    arg3.method4519(this.field2484 * arg0, this.field2484 * (63 - arg1), 0, var7, this.field2484, this.field2484, arg2.field2561[var5][arg0][arg1], arg2.field2572[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("jl.aq(IILjm;Lju;B)I")
    public int method4264(int arg0, int arg1, class246 arg2, class249 arg3) {
        return arg2.field2569[0][arg0][arg1] == 0 ? this.field2483 : arg3.method4472(arg0, arg1);
    }

    @ObfuscatedName("jl.ai(IILjm;[Lup;S)V")
    public void method4265(int arg0, int arg1, class246 arg2, class540[] arg3) {
        for (int var5 = 0; var5 < arg2.field2573; var5++) {
            class248[] var6 = arg2.field2571[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class248[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class248 var9 = var7[var8];
                    int var10 = var9.field2587;
                    boolean var11 = var10 >= class353.field3864.field3867 && var10 <= class353.field3857.field3867;
                    if (!var11) {
                        int var12 = var9.field2587;
                        boolean var13 = class353.field3845.field3867 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class202 var14 = Statics.method4138(var9.field2589);
                    if (var14.field2105 != -1) {
                        if (var14.field2105 == 46 || var14.field2105 == 52) {
                            arg3[var14.field2105].method8855(this.field2484 * arg0, this.field2484 * (63 - arg1), this.field2484 * 2 + 1, this.field2484 * 2 + 1);
                        } else {
                            arg3[var14.field2105].method8855(this.field2484 * arg0, this.field2484 * (63 - arg1), this.field2484 * 2, this.field2484 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jl.aw(IILjm;I)V")
    public void method4334(int arg0, int arg1, class246 arg2) {
        for (int var4 = 0; var4 < arg2.field2573; var4++) {
            class248[] var5 = arg2.field2571[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class248[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class248 var8 = var6[var7];
                    int var9 = var8.field2587;
                    boolean var10 = var9 >= class353.field3865.field3867 && var9 <= class353.field3847.field3867 || class353.field3848.field3867 == var9;
                    if (var10) {
                        class202 var11 = Statics.method4138(var8.field2589);
                        int var12 = var11.field2095 == 0 ? -3355444 : -3407872;
                        if (class353.field3865.field3867 == var8.field2587) {
                            this.method4280(arg0, arg1, var8.field2588, var12);
                        }
                        if (class353.field3852.field3867 == var8.field2587) {
                            this.method4280(arg0, arg1, var8.field2588, -3355444);
                            this.method4280(arg0, arg1, var8.field2588 + 1, var12);
                        }
                        if (class353.field3847.field3867 == var8.field2587) {
                            if (var8.field2588 == 0) {
                                class537.method8769(this.field2484 * arg0, this.field2484 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2588 == 1) {
                                class537.method8769(this.field2484 * arg0 + this.field2484 - 1, this.field2484 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2588 == 2) {
                                class537.method8769(this.field2484 * arg0 + this.field2484 - 1, this.field2484 * (63 - arg1) + this.field2484 - 1, 1, var12);
                            }
                            if (var8.field2588 == 3) {
                                class537.method8769(this.field2484 * arg0, this.field2484 * (63 - arg1) + this.field2484 - 1, 1, var12);
                            }
                        }
                        if (class353.field3848.field3867 == var8.field2587) {
                            int var13 = var8.field2588 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2484; var14++) {
                                    class537.method8769(this.field2484 * arg0 + var14, this.field2484 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2484; var15++) {
                                    class537.method8769(this.field2484 * arg0 + var15, this.field2484 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jl.ae(IILjava/util/HashSet;IS)V")
    public void method4346(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2486.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class334 var9 = (class334) var8.getKey();
            int var10 = (int) ((float) var9.field3561 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3563 * var5 - var6);
            class255 var12 = (class255) var8.getValue();
            if (var12 != null && var12.method4489()) {
                var12.field2625 = var10;
                var12.field2626 = var11;
                class178 var13 = class178.method3048(var12.method4123());
                if (!arg2.contains(var13.method3258())) {
                    this.method4270(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("jl.an(Ljava/util/HashSet;IIB)V")
    public void method4268(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2480.iterator();
        while (var4.hasNext()) {
            class255 var5 = (class255) var4.next();
            if (var5.method4489()) {
                class178 var6 = class178.method3048(var5.method4123());
                if (var6 != null && arg0.contains(var6.method3258())) {
                    this.method4269(var6, var5.field2625, var5.field2626, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("jl.ag(Lgr;IIIII)V")
    public void method4269(class178 arg0, int arg1, int arg2, int arg3, int arg4) {
        class541 var6 = arg0.method3253(false);
        if (var6 == null) {
            return;
        }
        var6.method8885(arg1 - var6.field5236 / 2, arg2 - var6.field5239 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class537.method8761(arg1, arg2, 15, 16776960, 128);
            class537.method8761(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("jl.ad(Ljc;IIFI)V")
    public void method4270(class255 arg0, int arg1, int arg2, float arg3) {
        class178 var5 = class178.method3048(arg0.method4123());
        this.method4271(var5, arg1, arg2);
        this.method4272(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("jl.af(Lgr;III)V")
    public void method4271(class178 arg0, int arg1, int arg2) {
        class541 var4 = arg0.method3253(false);
        if (var4 != null) {
            int var5 = this.method4274(var4, arg0.field1839);
            int var6 = this.method4275(var4, arg0.field1844);
            var4.method8885(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("jl.be(Ljc;Lgr;IIFI)V")
    public void method4272(class255 arg0, class178 arg1, int arg2, int arg3, float arg4) {
        class250 var6 = arg0.method4120();
        if (var6 != null && var6.field2597.method4109(arg4)) {
            class406 var7 = (class406) this.field2485.get(var6.field2597);
            var7.method7060(var6.field2601, arg2 - var6.field2600 / 2, arg3, var6.field2600, var6.field2599, 0xFF000000 | arg1.field1831, 0, 1, 0, var7.field4520 / 2);
        }
    }

    @ObfuscatedName("jl.bd(IILjava/util/HashSet;IB)V")
    public void method4273(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2480.iterator();
        while (var6.hasNext()) {
            class255 var7 = (class255) var6.next();
            if (var7.method4489()) {
                int var8 = var7.field2623.field3561 % 64;
                int var9 = var7.field2623.field3563 % 64;
                var7.field2625 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2626 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4123())) {
                    this.method4270(var7, var7.field2625, var7.field2626, var5);
                }
            }
        }
    }

    @ObfuscatedName("jl.bl(Luz;Lhq;I)I")
    public int method4274(class541 arg0, class187 arg1) {
        switch(arg1.field1907) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5236 / 2;
            default:
                return -arg0.field5236;
        }
    }

    @ObfuscatedName("jl.bi(Luz;Lhg;I)I")
    public int method4275(class541 arg0, class191 arg1) {
        switch(arg1.field1974) {
            case 0:
                return -arg0.field5239 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field5239;
        }
    }

    @ObfuscatedName("nu.bv(Lhs;B)Z")
    public static boolean method6195(class202 arg0) {
        if (arg0.field2114 != null) {
            int[] var1 = arg0.field2114;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class202 var4 = Statics.method4138(var3);
                if (var4.field2104 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2104 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("jl.bf(IB)Ljk;")
    public class250 method4276(int arg0) {
        class178 var2 = class178.method3048(arg0);
        return this.method4261(var2);
    }

    @ObfuscatedName("jl.bg(Lgr;I)Ljk;")
    public class250 method4261(class178 arg0) {
        if (arg0.field1830 == null || this.field2485 == null || this.field2485.get(class234.field2440) == null) {
            return null;
        }
        class234 var2 = class234.method4110(arg0.field1834);
        if (var2 == null) {
            return null;
        }
        class406 var3 = (class406) this.field2485.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method6982(arg0.field1830, 1000000);
        String[] var5 = new String[var4];
        var3.method6980(arg0.field1830, (int[]) null, var5);
        int var6 = var5.length * var3.field4520 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method7018(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class250(arg0.field1830, var7, var6, var2);
    }

    @ObfuscatedName("jl.ba(IIIIIB)Ljava/util/List;")
    public List method4322(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2486.values().iterator();
            while (var7.hasNext()) {
                class255 var8 = (class255) var7.next();
                if (var8.method4489() && var8.method4488(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2480.iterator();
            while (var9.hasNext()) {
                class255 var10 = (class255) var9.next();
                if (var10.method4489() && var10.method4488(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("jl.bm(I)Ljava/util/List;")
    public List method4302() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2480);
        var1.addAll(this.field2486.values());
        return var1;
    }

    @ObfuscatedName("jl.bp(IIIII)V")
    public void method4280(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class537.method8839(this.field2484 * arg0, this.field2484 * (63 - arg1), this.field2484, arg3);
        }
        if (var5 == 1) {
            class537.method8769(this.field2484 * arg0, this.field2484 * (63 - arg1), this.field2484, arg3);
        }
        if (var5 == 2) {
            class537.method8839(this.field2484 * arg0 + this.field2484 - 1, this.field2484 * (63 - arg1), this.field2484, arg3);
        }
        if (var5 == 3) {
            class537.method8769(this.field2484 * arg0, this.field2484 * (63 - arg1) + this.field2484 - 1, this.field2484, arg3);
        }
    }
}
