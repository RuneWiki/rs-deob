package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("iy")
public class class239 {

    @ObfuscatedName("iy.m")
    public static class267 field2870 = new class267(37748736, 256);

    @ObfuscatedName("iy.q")
    public int field2868;

    @ObfuscatedName("iy.f")
    public int field2876;

    @ObfuscatedName("iy.r")
    public class233 field2871;

    @ObfuscatedName("iy.u")
    public LinkedList field2872;

    @ObfuscatedName("iy.b")
    public int field2873;

    @ObfuscatedName("iy.j")
    public int field2866;

    @ObfuscatedName("iy.g")
    public List field2875;

    @ObfuscatedName("iy.i")
    public HashMap field2869;

    @ObfuscatedName("iy.o")
    public final HashMap field2877;

    @ObfuscatedName("gy.h(IIIB)Lrx;")
    public static class481 method3810(int arg0, int arg1, int arg2) {
        class267 var3 = field2870;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class481) var3.method4881(var4);
    }

    @ObfuscatedName("gl.e(Lrx;IIII)V")
    public static void method3381(class481 arg0, int arg1, int arg2, int arg3) {
        class267 var4 = field2870;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method4885(arg0, var6, arg0.field5021.length * 4);
    }

    public class239(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2868 = arg0;
        this.field2876 = arg1;
        this.field2872 = new LinkedList();
        this.field2875 = new LinkedList();
        this.field2869 = new HashMap();
        this.field2873 = arg2 | 0xFF000000;
        this.field2877 = arg3;
    }

    @ObfuscatedName("iy.v(IIIB)V")
    public void method4568(int arg0, int arg1, int arg2) {
        class481 var4 = method3810(this.field2868, this.field2876, this.field2866);
        if (var4 == null) {
            return;
        }
        if (this.field2866 * 64 == arg2) {
            var4.method8235(arg0, arg1);
        } else {
            var4.method8256(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("iy.x(Lhd;Ljava/util/List;I)V")
    public void method4569(class233 arg0, List arg1) {
        this.field2869.clear();
        this.field2871 = arg0;
        this.method4574(arg1);
    }

    @ObfuscatedName("iy.m(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method4660(HashSet arg0, List arg1) {
        this.field2869.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class241 var4 = (class241) var3.next();
            if (var4.method4773() == this.field2868 && var4.method4778() == this.field2876) {
                this.field2872.add(var4);
            }
        }
        this.method4574(arg1);
    }

    @ObfuscatedName("iy.q(IIIILin;I)V")
    public void method4571(int arg0, int arg1, int arg2, int arg3, class247 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2946; var8++) {
                    class249[] var9 = arg4.field2947[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class249[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class249 var12 = var10[var11];
                            class196 var13 = class196.method3208(var12.field2966);
                            if (method2470(var13)) {
                                this.method4572(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("iy.f(Lgn;IIILin;I)V")
    public void method4572(class196 arg0, int arg1, int arg2, int arg3, class247 arg4) {
        class297 var6 = new class297(arg1, this.field2868 * 64 + arg2, this.field2876 * 64 + arg3);
        Object var7 = null;
        class297 var8;
        if (this.field2871 == null) {
            class241 var9 = (class241) arg4;
            var8 = new class297(var9.field2953 + arg1, var9.field2945 * 64 + arg2 + var9.method4727() * 8, var9.field2942 * 64 + arg3 + var9.method4728() * 8);
        } else {
            var8 = new class297(this.field2871.field2953 + arg1, this.field2871.field2945 * 64 + arg2, this.field2871.field2942 * 64 + arg3);
        }
        class256 var10;
        if (arg0.field2194 == null) {
            class179 var11 = class179.method3153(arg0.field2181);
            var10 = new class244(var8, var6, var11.field1930, this.method4685(var11));
        } else {
            var10 = new class236(var8, var6, arg0.field2160, this);
        }
        class179 var12 = class179.method3153(var10.method4455());
        if (var12.field1937) {
            this.field2869.put(new class297(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("iy.r(I)V")
    public void method4581() {
        Iterator var1 = this.field2869.values().iterator();
        while (var1.hasNext()) {
            class256 var2 = (class256) var1.next();
            if (var2 instanceof class236) {
                ((class236) var2).method4454();
            }
        }
    }

    @ObfuscatedName("iy.u(Ljava/util/List;B)V")
    public void method4574(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class244 var3 = (class244) var2.next();
            if (class179.method3153(var3.field2918).field1937 && var3.field3003.field3451 >> 6 == this.field2868 && var3.field3003.field3452 >> 6 == this.field2876) {
                class244 var4 = new class244(var3.field3003, var3.field3003, var3.field2918, this.method4596(var3.field2918));
                this.field2875.add(var4);
            }
        }
    }

    @ObfuscatedName("iy.b(I)V")
    public void method4669() {
        if (this.field2871 != null) {
            this.field2871.method4774();
            return;
        }
        Iterator var1 = this.field2872.iterator();
        while (var1.hasNext()) {
            class241 var2 = (class241) var1.next();
            var2.method4774();
        }
    }

    @ObfuscatedName("iy.j(Lly;B)Z")
    public boolean method4576(class333 arg0) {
        this.field2869.clear();
        if (this.field2871 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2872.iterator();
            while (var3.hasNext()) {
                class241 var4 = (class241) var3.next();
                var4.method4768(arg0);
                var2 &= var4.method4766();
            }
            if (var2) {
                Iterator var5 = this.field2872.iterator();
                while (var5.hasNext()) {
                    class241 var6 = (class241) var5.next();
                    this.method4571(var6.method4729() * 8, var6.method4726() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2871.method4768(arg0);
            if (this.field2871.method4766()) {
                this.method4571(0, 0, 64, 64, this.field2871);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("iy.g(ILih;[Lra;Lly;Lly;B)V")
    public void method4577(int arg0, class260 arg1, class480[] arg2, class333 arg3, class333 arg4) {
        this.field2866 = arg0;
        if (this.field2871 == null && this.field2872.isEmpty() || method3810(this.field2868, this.field2876, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4576(arg3);
        int var8;
        if (this.field2871 == null) {
            var8 = ((class247) this.field2872.getFirst()).field2941;
        } else {
            var8 = this.field2871.field2941;
        }
        boolean var9 = var7 & arg4.method5849(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method5851(var8);
        class250 var11;
        if (var10 == null) {
            var11 = new class250();
        } else {
            var11 = new class250(class32.method6061(var10).field5021);
        }
        class481 var13 = new class481(this.field2866 * 64, this.field2866 * 64);
        var13.method8242();
        if (this.field2871 == null) {
            this.method4603(arg1, arg2, var11);
        } else {
            this.method4580(arg1, arg2, var11);
        }
        method3381(var13, this.field2868, this.field2876, this.field2866);
        this.method4669();
    }

    @ObfuscatedName("iy.i(IIILjava/util/HashSet;S)V")
    public void method4578(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4587(arg0, arg1, arg3, arg2);
        this.method4593(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("iy.o(Ljava/util/HashSet;III)V")
    public void method4595(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2869.values().iterator();
        while (var4.hasNext()) {
            class256 var5 = (class256) var4.next();
            if (var5.method4814()) {
                int var6 = var5.method4455();
                if (arg0.contains(var6)) {
                    class179 var7 = class179.method3153(var6);
                    this.method4589(var7, var5.field3002, var5.field3001, arg1, arg2);
                }
            }
        }
        this.method4604(arg0, arg1, arg2);
    }

    @ObfuscatedName("iy.n(Lih;[Lra;Lir;B)V")
    public void method4580(class260 arg0, class480[] arg1, class250 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4583(var4, var5, this.field2871, arg0, arg2);
                this.method4584(var4, var5, this.field2871, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4582(var6, var7, this.field2871, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("iy.k(Lih;[Lra;Lir;B)V")
    public void method4603(class260 arg0, class480[] arg1, class250 arg2) {
        Iterator var4 = this.field2872.iterator();
        while (var4.hasNext()) {
            class241 var5 = (class241) var4.next();
            for (int var6 = var5.method4729() * 8; var6 < var5.method4729() * 8 + 8; var6++) {
                for (int var7 = var5.method4726() * 8; var7 < var5.method4726() * 8 + 8; var7++) {
                    this.method4583(var6, var7, var5, arg0, arg2);
                    this.method4584(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2872.iterator();
        while (var8.hasNext()) {
            class241 var9 = (class241) var8.next();
            for (int var10 = var9.method4729() * 8; var10 < var9.method4729() * 8 + 8; var10++) {
                for (int var11 = var9.method4726() * 8; var11 < var9.method4726() * 8 + 8; var11++) {
                    this.method4582(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("iy.a(IILin;Lih;[Lra;I)V")
    public void method4582(int arg0, int arg1, class247 arg2, class260 arg3, class480[] arg4) {
        this.method4586(arg0, arg1, arg2);
        this.method4598(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("iy.s(IILin;Lih;Lir;I)V")
    public void method4583(int arg0, int arg1, class247 arg2, class260 arg3, class250 arg4) {
        int var6 = arg2.field2950[0][arg0][arg1] - 1;
        int var7 = arg2.field2944[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class477.method8120(this.field2866 * arg0, this.field2866 * (63 - arg1), this.field2866, this.field2866, this.field2873);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class254.method1880(var7, this.field2873);
        }
        if (var7 > -1 && arg2.field2951[0][arg0][arg1] == 0) {
            class477.method8120(this.field2866 * arg0, this.field2866 * (63 - arg1), this.field2866, this.field2866, var8);
            return;
        }
        int var9 = this.method4585(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class477.method8120(this.field2866 * arg0, this.field2866 * (63 - arg1), this.field2866, this.field2866, var9);
        } else {
            arg3.method4834(this.field2866 * arg0, this.field2866 * (63 - arg1), var9, var8, this.field2866, this.field2866, arg2.field2951[0][arg0][arg1], arg2.field2952[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("iy.l(IILin;Lih;I)V")
    public void method4584(int arg0, int arg1, class247 arg2, class260 arg3) {
        for (int var5 = 1; var5 < arg2.field2946; var5++) {
            int var6 = arg2.field2944[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class254.method1880(var6, this.field2873);
                if (arg2.field2951[var5][arg0][arg1] == 0) {
                    class477.method8120(this.field2866 * arg0, this.field2866 * (63 - arg1), this.field2866, this.field2866, var7);
                } else {
                    arg3.method4834(this.field2866 * arg0, this.field2866 * (63 - arg1), 0, var7, this.field2866, this.field2866, arg2.field2951[var5][arg0][arg1], arg2.field2952[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("iy.t(IILin;Lir;I)I")
    public int method4585(int arg0, int arg1, class247 arg2, class250 arg3) {
        return arg2.field2950[0][arg0][arg1] == 0 ? this.field2873 : arg3.method4790(arg0, arg1);
    }

    @ObfuscatedName("iy.c(IILin;[Lra;B)V")
    public void method4598(int arg0, int arg1, class247 arg2, class480[] arg3) {
        for (int var5 = 0; var5 < arg2.field2946; var5++) {
            class249[] var6 = arg2.field2947[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class249[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class249 var9 = var7[var8];
                    int var10 = var9.field2965;
                    boolean var11 = var10 >= class315.field3748.field3751 && var10 <= class315.field3749.field3751;
                    if (var11 || class315.method3005(var9.field2965)) {
                        class196 var12 = class196.method3208(var9.field2966);
                        if (var12.field2173 != -1) {
                            if (var12.field2173 == 46 || var12.field2173 == 52) {
                                arg3[var12.field2173].method8217(this.field2866 * arg0, this.field2866 * (63 - arg1), this.field2866 * 2 + 1, this.field2866 * 2 + 1);
                            } else {
                                arg3[var12.field2173].method8217(this.field2866 * arg0, this.field2866 * (63 - arg1), this.field2866 * 2, this.field2866 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("iy.p(IILin;I)V")
    public void method4586(int arg0, int arg1, class247 arg2) {
        for (int var4 = 0; var4 < arg2.field2946; var4++) {
            class249[] var5 = arg2.field2947[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class249[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class249 var8 = var6[var7];
                    int var9 = var8.field2965;
                    boolean var10 = var9 >= class315.field3728.field3751 && var9 <= class315.field3737.field3751 || class315.field3743.field3751 == var9;
                    if (var10) {
                        class196 var11 = class196.method3208(var8.field2966);
                        int var12 = var11.field2172 == 0 ? -3355444 : -3407872;
                        if (class315.field3728.field3751 == var8.field2965) {
                            this.method4600(arg0, arg1, var8.field2964, var12);
                        }
                        if (class315.field3730.field3751 == var8.field2965) {
                            this.method4600(arg0, arg1, var8.field2964, -3355444);
                            this.method4600(arg0, arg1, var8.field2964 + 1, var12);
                        }
                        if (class315.field3737.field3751 == var8.field2965) {
                            if (var8.field2964 == 0) {
                                class477.method8126(this.field2866 * arg0, this.field2866 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2964 == 1) {
                                class477.method8126(this.field2866 * arg0 + this.field2866 - 1, this.field2866 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2964 == 2) {
                                class477.method8126(this.field2866 * arg0 + this.field2866 - 1, this.field2866 * (63 - arg1) + this.field2866 - 1, 1, var12);
                            }
                            if (var8.field2964 == 3) {
                                class477.method8126(this.field2866 * arg0, this.field2866 * (63 - arg1) + this.field2866 - 1, 1, var12);
                            }
                        }
                        if (class315.field3743.field3751 == var8.field2965) {
                            int var13 = var8.field2964 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2866; var14++) {
                                    class477.method8126(this.field2866 * arg0 + var14, this.field2866 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2866; var15++) {
                                    class477.method8126(this.field2866 * arg0 + var15, this.field2866 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("iy.d(IILjava/util/HashSet;II)V")
    public void method4587(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2869.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class297 var9 = (class297) var8.getKey();
            int var10 = (int) ((float) var9.field3451 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3452 * var5 - var6);
            class256 var12 = (class256) var8.getValue();
            if (var12 != null && var12.method4814()) {
                var12.field3002 = var10;
                var12.field3001 = var11;
                class179 var13 = class179.method3153(var12.method4455());
                if (!arg2.contains(var13.method3216())) {
                    this.method4628(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("iy.y(Ljava/util/HashSet;III)V")
    public void method4604(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2875.iterator();
        while (var4.hasNext()) {
            class256 var5 = (class256) var4.next();
            if (var5.method4814()) {
                class179 var6 = class179.method3153(var5.method4455());
                if (var6 != null && arg0.contains(var6.method3216())) {
                    this.method4589(var6, var5.field3002, var5.field3001, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("iy.z(Lfm;IIIIB)V")
    public void method4589(class179 arg0, int arg1, int arg2, int arg3, int arg4) {
        class481 var6 = arg0.method3214(false);
        if (var6 == null) {
            return;
        }
        var6.method8252(arg1 - var6.field5011 / 2, arg2 - var6.field5010 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class477.method8110(arg1, arg2, 15, 16776960, 128);
            class477.method8110(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("iy.w(Lix;IIFI)V")
    public void method4628(class256 arg0, int arg1, int arg2, float arg3) {
        class179 var5 = class179.method3153(arg0.method4455());
        this.method4664(var5, arg1, arg2);
        this.method4591(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("iy.as(Lfm;III)V")
    public void method4664(class179 arg0, int arg1, int arg2) {
        class481 var4 = arg0.method3214(false);
        if (var4 != null) {
            int var5 = this.method4663(var4, arg0.field1932);
            int var6 = this.method4588(var4, arg0.field1947);
            var4.method8252(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("iy.ad(Lix;Lfm;IIFI)V")
    public void method4591(class256 arg0, class179 arg1, int arg2, int arg3, float arg4) {
        class251 var6 = arg0.method4456();
        if (var6 != null && var6.field2975.method4451(arg4)) {
            class368 var7 = (class368) this.field2877.get(var6.field2975);
            var7.method6529(var6.field2974, arg2 - var6.field2973 / 2, arg3, var6.field2973, var6.field2972, 0xFF000000 | arg1.field1948, 0, 1, 0, var7.field4408 / 2);
        }
    }

    @ObfuscatedName("iy.ao(IILjava/util/HashSet;IB)V")
    public void method4593(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2875.iterator();
        while (var6.hasNext()) {
            class256 var7 = (class256) var6.next();
            if (var7.method4814()) {
                int var8 = var7.field3003.field3451 % 64;
                int var9 = var7.field3003.field3452 % 64;
                var7.field3002 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3001 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4455())) {
                    this.method4628(var7, var7.field3002, var7.field3001, var5);
                }
            }
        }
    }

    @ObfuscatedName("iy.am(Lrx;Lgj;I)I")
    public int method4663(class481 arg0, class185 arg1) {
        switch(arg1.field2010) {
            case 1:
                return -arg0.field5011 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field5011;
        }
    }

    @ObfuscatedName("iy.av(Lrx;Lgl;B)I")
    public int method4588(class481 arg0, class188 arg1) {
        switch(arg1.field2072) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5010 / 2;
            default:
                return -arg0.field5010;
        }
    }

    @ObfuscatedName("cv.au(Lgn;I)Z")
    public static boolean method2470(class196 arg0) {
        if (arg0.field2194 != null) {
            int[] var1 = arg0.field2194;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class196 var4 = class196.method3208(var3);
                if (var4.field2181 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2181 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("iy.ar(II)Lii;")
    public class251 method4596(int arg0) {
        class179 var2 = class179.method3153(arg0);
        return this.method4685(var2);
    }

    @ObfuscatedName("iy.at(Lfm;I)Lii;")
    public class251 method4685(class179 arg0) {
        if (arg0.field1933 == null || this.field2877 == null || this.field2877.get(class235.field2827) == null) {
            return null;
        }
        int var2 = arg0.field1936;
        class235[] var3 = class235.method4443();
        int var4 = 0;
        class235 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class235 var5 = var3[var4];
            if (var5.field2829 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class368 var8 = (class368) this.field2877.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method6523(arg0.field1933, 1000000);
        String[] var10 = new String[var9];
        var8.method6521(arg0.field1933, (int[]) null, var10);
        int var11 = var10.length * var8.field4408 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method6568(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class251(arg0.field1933, var12, var11, var6);
    }

    @ObfuscatedName("iy.ay(IIIIIS)Ljava/util/List;")
    public List method4627(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2869.values().iterator();
            while (var7.hasNext()) {
                class256 var8 = (class256) var7.next();
                if (var8.method4814() && var8.method4809(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2875.iterator();
            while (var9.hasNext()) {
                class256 var10 = (class256) var9.next();
                if (var10.method4814() && var10.method4809(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("iy.an(B)Ljava/util/List;")
    public List method4599() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2875);
        var1.addAll(this.field2869.values());
        return var1;
    }

    @ObfuscatedName("iy.ab(IIIII)V")
    public void method4600(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class477.method8128(this.field2866 * arg0, this.field2866 * (63 - arg1), this.field2866, arg3);
        }
        if (var5 == 1) {
            class477.method8126(this.field2866 * arg0, this.field2866 * (63 - arg1), this.field2866, arg3);
        }
        if (var5 == 2) {
            class477.method8128(this.field2866 * arg0 + this.field2866 - 1, this.field2866 * (63 - arg1), this.field2866, arg3);
        }
        if (var5 == 3) {
            class477.method8126(this.field2866 * arg0, this.field2866 * (63 - arg1) + this.field2866 - 1, this.field2866, arg3);
        }
    }
}
