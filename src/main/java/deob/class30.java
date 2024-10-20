package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("av")
public class class30 {

    @ObfuscatedName("av.o")
    public static class149 field243 = new class149(37748736, 256);

    @ObfuscatedName("av.u")
    public int field238;

    @ObfuscatedName("av.g")
    public int field239;

    @ObfuscatedName("av.l")
    public class16 field240;

    @ObfuscatedName("av.e")
    public LinkedList field241;

    @ObfuscatedName("av.x")
    public int field236;

    @ObfuscatedName("av.d")
    public int field245;

    @ObfuscatedName("av.k")
    public List field244;

    @ObfuscatedName("av.n")
    public HashMap field246;

    @ObfuscatedName("av.i")
    public final HashMap field234;

    @ObfuscatedName("bb.m(IIII)J")
    public static long method945(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("i.f(IIII)Lln;")
    public static class328 method147(int arg0, int arg1, int arg2) {
        return (class328) field243.method3032(method945(arg0, arg1, arg2));
    }

    @ObfuscatedName("dx.q(B)V")
    public static void method2243() {
        field243.method3030();
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field238 = arg0;
        this.field239 = arg1;
        this.field241 = new LinkedList();
        this.field244 = new LinkedList();
        this.field246 = new HashMap();
        this.field236 = arg2 | 0xFF000000;
        this.field234 = arg3;
    }

    @ObfuscatedName("av.w(IIIB)V")
    public void method459(int arg0, int arg1, int arg2) {
        class328 var4 = method147(this.field238, this.field239, this.field245);
        if (var4 == null) {
            return;
        }
        if (this.field245 * 64 == arg2) {
            var4.method5581(arg0, arg1);
        } else {
            var4.method5604(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("av.o(Lz;Ljava/util/List;I)V")
    public void method390(class16 arg0, List arg1) {
        this.field246.clear();
        this.field240 = arg0;
        this.method395(arg1);
    }

    @ObfuscatedName("av.u(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method391(HashSet arg0, List arg1) {
        this.field246.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method236() == this.field238 && var4.method243() == this.field239) {
                this.field241.add(var4);
            }
        }
        this.method395(arg1);
    }

    @ObfuscatedName("av.g(IIIILb;B)V")
    public void method392(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        this.field246.clear();
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field157; var8++) {
                    class26[] var9 = arg4.field145[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class265 var13;
                            boolean var18;
                            label58: {
                                class26 var12 = var10[var11];
                                var13 = class265.method763(var12.field200);
                                if (var13.field3463 != null) {
                                    int[] var14 = var13.field3463;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class265 var17 = class265.method763(var16);
                                        if (var17.field3450 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3450 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method422(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.l(Ljr;IIILb;I)V")
    public void method422(class265 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class225 var6 = new class225(arg1, this.field238 * 64 + arg2, this.field239 * 64 + arg3);
        Object var7 = null;
        class225 var8;
        if (this.field240 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class225(var9.field149 + arg1, var9.field150 * 64 + arg2 + var9.method603() * 8, var9.field147 * 64 + arg3 + var9.method604() * 8);
        } else {
            var8 = new class225(this.field240.field149 + arg1, this.field240.field150 * 64 + arg2, this.field240.field147 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3463 == null) {
            class253 var11 = class253.method2731(arg0.field3450);
            var10 = new class19(var8, var6, var11.field3297, this.method419(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3423, this);
        }
        this.field246.put(new class225(0, arg2, arg3), var10);
    }

    @ObfuscatedName("av.e(B)V")
    public void method394() {
        Iterator var1 = this.field246.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method277();
            }
        }
    }

    @ObfuscatedName("av.x(Ljava/util/List;I)V")
    public void method395(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field287.field2605 >> 6 == this.field238 && var3.field287.field2606 >> 6 == this.field239) {
                class19 var4 = new class19(var3.field287, var3.field287, var3.field110, this.method414(var3.field110));
                this.field244.add(var4);
            }
        }
    }

    @ObfuscatedName("av.d(I)V")
    public void method396() {
        if (this.field240 != null) {
            this.field240.method259();
            return;
        }
        Iterator var1 = this.field241.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method259();
        }
    }

    @ObfuscatedName("av.a(Lir;B)Z")
    public boolean method397(class245 arg0) {
        if (this.field240 == null) {
            boolean var2 = true;
            Iterator var3 = this.field241.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method242(arg0);
                var2 &= var4.method249();
            }
            if (var2) {
                Iterator var5 = this.field241.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method392(var6.method605() * 8, var6.method606() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field240.method242(arg0);
            if (this.field240.method249()) {
                this.method392(0, 0, 64, 64, this.field240);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("av.z(ILad;[Llq;Lir;Lir;I)V")
    public void method398(int arg0, class41 arg1, class327[] arg2, class245 arg3, class245 arg4) {
        this.field245 = arg0;
        if (this.field240 == null && this.field241.isEmpty() || method147(this.field238, this.field239, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method397(arg3);
        int var8;
        if (this.field240 == null) {
            var8 = ((class22) this.field241.getFirst()).field151;
        } else {
            var8 = this.field240.field151;
        }
        boolean var9 = var7 & arg4.method4225(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method4195(var8);
        class28 var11 = class28.method1007(var10);
        class328 var12 = new class328(this.field245 * 64, this.field245 * 64);
        var12.method5574();
        if (this.field240 == null) {
            this.method402(arg1, arg2, var11);
        } else {
            this.method489(arg1, arg2, var11);
        }
        int var13 = this.field238;
        int var14 = this.field239;
        int var15 = this.field245;
        field243.method3028(var12, method945(var13, var14, var15), var12.field3900.length * 4);
        this.method396();
    }

    @ObfuscatedName("av.j(IIILjava/util/HashSet;I)V")
    public void method399(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method409(arg0, arg1, arg3, arg2);
        this.method415(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("av.s(Ljava/util/HashSet;IIB)V")
    public void method458(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field246.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method531()) {
                int var6 = var5.method192();
                if (arg0.contains(var6)) {
                    class253 var7 = class253.method2731(var6);
                    this.method434(var7, var5.field284, var5.field285, arg1, arg2);
                }
            }
        }
        this.method410(arg0, arg1, arg2);
    }

    @ObfuscatedName("av.t(Lad;[Llq;Laq;B)V")
    public void method489(class41 arg0, class327[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method404(var4, var5, this.field240, arg0, arg2);
                this.method405(var4, var5, this.field240, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method403(var6, var7, this.field240, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("av.y(Lad;[Llq;Laq;I)V")
    public void method402(class41 arg0, class327[] arg1, class28 arg2) {
        Iterator var4 = this.field241.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method605() * 8; var6 < var5.method605() * 8 + 8; var6++) {
                for (int var7 = var5.method606() * 8; var7 < var5.method606() * 8 + 8; var7++) {
                    this.method404(var6, var7, var5, arg0, arg2);
                    this.method405(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field241.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method605() * 8; var10 < var9.method605() * 8 + 8; var10++) {
                for (int var11 = var9.method606() * 8; var11 < var9.method606() * 8 + 8; var11++) {
                    this.method403(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("av.h(IILb;Lad;[Llq;I)V")
    public void method403(int arg0, int arg1, class22 arg2, class41 arg3, class327[] arg4) {
        this.method408(arg0, arg1, arg2);
        this.method407(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("av.b(IILb;Lad;Laq;I)V")
    public void method404(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field152[0][arg0][arg1] - 1;
        int var7 = arg2.field146[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class324.method5468(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, this.field245, this.field236);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field236;
            class269 var10 = (class269) class269.field3572.method3011((long) var7);
            class269 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field3578.method4156(4, var7);
                class269 var13 = new class269();
                if (var12 != null) {
                    var13.method4750(new class202(var12), var7);
                }
                var13.method4754();
                class269.field3572.method3009(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field3575 >= 0) {
                var15 = var11.field3575 | 0xFF000000;
            } else if (var11.field3570 >= 0) {
                int var16 = class33.method370(Statics.field1759.method2500(var11.field3570), 96);
                var15 = class131.field1755[var16] | 0xFF000000;
            } else if (var11.field3576 == 16711935) {
                var15 = var9;
            } else {
                int var17 = var11.field3577;
                int var18 = var11.field3571;
                int var19 = var11.field3573;
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
                byte var23 = 96;
                int var24;
                if (var20 == -2) {
                    var24 = 12345678;
                } else if (var20 == -1) {
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > 127) {
                        var23 = 127;
                    }
                    int var25 = 127 - var23;
                    var24 = var25;
                } else {
                    int var26 = (var20 & 0x7F) * var23 / 128;
                    if (var26 < 2) {
                        var26 = 2;
                    } else if (var26 > 126) {
                        var26 = 126;
                    }
                    var24 = (var20 & 0xFF80) + var26;
                }
                var15 = class131.field1755[var24] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field155[0][arg0][arg1] == 0) {
            class324.method5468(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, this.field245, var8);
            return;
        }
        int var28 = this.method484(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class324.method5468(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, this.field245, var28);
        } else {
            arg3.method627(this.field245 * arg0, this.field245 * (63 - arg1), var28, var8, this.field245, this.field245, arg2.field155[0][arg0][arg1], arg2.field156[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("av.c(IILb;Lad;B)V")
    public void method405(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field157; var5++) {
            int var6 = arg2.field146[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field236;
                class269 var8 = (class269) class269.field3572.method3011((long) var6);
                class269 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field3578.method4156(4, var6);
                    class269 var11 = new class269();
                    if (var10 != null) {
                        var11.method4750(new class202(var10), var6);
                    }
                    var11.method4754();
                    class269.field3572.method3009(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field3575 >= 0) {
                    var13 = var9.field3575 | 0xFF000000;
                } else if (var9.field3570 >= 0) {
                    int var14 = class33.method370(Statics.field1759.method2500(var9.field3570), 96);
                    var13 = class131.field1755[var14] | 0xFF000000;
                } else if (var9.field3576 == 16711935) {
                    var13 = var7;
                } else {
                    int var15 = var9.field3577;
                    int var16 = var9.field3571;
                    int var17 = var9.field3573;
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
                    byte var21 = 96;
                    int var22;
                    if (var18 == -2) {
                        var22 = 12345678;
                    } else if (var18 == -1) {
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 > 127) {
                            var21 = 127;
                        }
                        int var23 = 127 - var21;
                        var22 = var23;
                    } else {
                        int var24 = (var18 & 0x7F) * var21 / 128;
                        if (var24 < 2) {
                            var24 = 2;
                        } else if (var24 > 126) {
                            var24 = 126;
                        }
                        var22 = (var18 & 0xFF80) + var24;
                    }
                    var13 = class131.field1755[var22] | 0xFF000000;
                }
                if (arg2.field155[var5][arg0][arg1] == 0) {
                    class324.method5468(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, this.field245, var13);
                } else {
                    arg3.method627(this.field245 * arg0, this.field245 * (63 - arg1), 0, var13, this.field245, this.field245, arg2.field155[var5][arg0][arg1], arg2.field156[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("av.p(IILb;Laq;I)I")
    public int method484(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field152[0][arg0][arg1] == 0 ? this.field236 : arg3.method373(arg0, arg1);
    }

    @ObfuscatedName("av.v(IILb;[Llq;S)V")
    public void method407(int arg0, int arg1, class22 arg2, class327[] arg3) {
        for (int var5 = 0; var5 < arg2.field157; var5++) {
            class26[] var6 = arg2.field145[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    if (class232.method598(var9.field199) || class232.method14(var9.field199)) {
                        class265 var10 = class265.method763(var9.field200);
                        if (var10.field3451 != -1) {
                            if (var10.field3451 == 46 || var10.field3451 == 52) {
                                arg3[var10.field3451].method5554(this.field245 * arg0, this.field245 * (63 - arg1), this.field245 * 2 + 1, this.field245 * 2 + 1);
                            } else {
                                arg3[var10.field3451].method5554(this.field245 * arg0, this.field245 * (63 - arg1), this.field245 * 2, this.field245 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.ag(IILb;B)V")
    public void method408(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field157; var4++) {
            class26[] var5 = arg2.field145[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    int var9 = var8.field199;
                    boolean var10 = var9 >= class232.field2806.field2821 && var9 <= class232.field2805.field2821 || class232.field2807.field2821 == var9;
                    if (var10) {
                        class265 var11 = class265.method763(var8.field200);
                        int var12 = var11.field3456 == 0 ? -3355444 : -3407872;
                        if (class232.field2806.field2821 == var8.field199) {
                            this.method485(arg0, arg1, var8.field203, var12);
                        }
                        if (class232.field2814.field2821 == var8.field199) {
                            this.method485(arg0, arg1, var8.field203, -3355444);
                            this.method485(arg0, arg1, var8.field203 + 1, var12);
                        }
                        if (class232.field2805.field2821 == var8.field199) {
                            if (var8.field203 == 0) {
                                class324.method5517(this.field245 * arg0, this.field245 * (63 - arg1), 1, var12);
                            }
                            if (var8.field203 == 1) {
                                class324.method5517(this.field245 * arg0 + this.field245 - 1, this.field245 * (63 - arg1), 1, var12);
                            }
                            if (var8.field203 == 2) {
                                class324.method5517(this.field245 * arg0 + this.field245 - 1, this.field245 * (63 - arg1) + this.field245 - 1, 1, var12);
                            }
                            if (var8.field203 == 3) {
                                class324.method5517(this.field245 * arg0, this.field245 * (63 - arg1) + this.field245 - 1, 1, var12);
                            }
                        }
                        if (class232.field2807.field2821 == var8.field199) {
                            int var13 = var8.field203 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field245; var14++) {
                                    class324.method5517(this.field245 * arg0 + var14, this.field245 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field245; var15++) {
                                    class324.method5517(this.field245 * arg0 + var15, this.field245 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.aq(IILjava/util/HashSet;IB)V")
    public void method409(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field246.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class225 var9 = (class225) var8.getKey();
            int var10 = (int) ((float) var9.field2605 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2606 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method531()) {
                var12.field284 = var10;
                var12.field285 = var11;
                class253 var13 = class253.method2731(var12.method192());
                if (!arg2.contains(var13.method4365())) {
                    this.method412(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("av.aj(Ljava/util/HashSet;III)V")
    public void method410(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field244.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method531()) {
                class253 var6 = class253.method2731(var5.method192());
                if (var6 != null && arg0.contains(var6.method4365())) {
                    this.method434(var6, var5.field284, var5.field285, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("av.av(Lic;IIIIB)V")
    public void method434(class253 arg0, int arg1, int arg2, int arg3, int arg4) {
        class328 var6 = arg0.method4376(false);
        if (var6 == null) {
            return;
        }
        var6.method5584(arg1 - var6.field3897 / 2, arg2 - var6.field3904 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class324.method5460(arg1, arg2, 15, 16776960, 128);
            class324.method5460(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("av.ar(Lak;IIFI)V")
    public void method412(class35 arg0, int arg1, int arg2, float arg3) {
        class253 var5 = class253.method2731(arg0.method192());
        this.method388(var5, arg1, arg2);
        this.method466(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("av.ac(Lic;III)V")
    public void method388(class253 arg0, int arg1, int arg2) {
        class328 var4 = arg0.method4376(false);
        if (var4 != null) {
            int var5 = this.method416(var4, arg0.field3288);
            int var6 = this.method417(var4, arg0.field3302);
            var4.method5584(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("av.ay(Lak;Lic;IIFI)V")
    public void method466(class35 arg0, class253 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method191();
        if (var6 != null && var6.field230.method177(arg4)) {
            class302 var7 = (class302) this.field234.get(var6.field230);
            var7.method5211(var6.field231, arg2 - var6.field229 / 2, arg3, var6.field229, var6.field228, 0xFF000000 | arg1.field3292, 0, 1, 0, var7.field3762 / 2);
        }
    }

    @ObfuscatedName("av.ah(IILjava/util/HashSet;IB)V")
    public void method415(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field244.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method531()) {
                int var8 = var7.field287.field2605 % 64;
                int var9 = var7.field287.field2606 % 64;
                var7.field284 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field285 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method192())) {
                    this.method412(var7, var7.field284, var7.field285, var5);
                }
            }
        }
    }

    @ObfuscatedName("av.ak(Lln;Lju;I)I")
    public int method416(class328 arg0, class267 arg1) {
        switch(arg1.field3529) {
            case 0:
                return -arg0.field3897 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3897;
        }
    }

    @ObfuscatedName("av.aw(Lln;Lip;I)I")
    public int method417(class328 arg0, class250 arg1) {
        switch(arg1.field3276) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3904 / 2;
            default:
                return -arg0.field3904;
        }
    }

    @ObfuscatedName("av.al(II)Laj;")
    public class29 method414(int arg0) {
        class253 var2 = class253.method2731(arg0);
        return this.method419(var2);
    }

    @ObfuscatedName("av.ab(Lic;B)Laj;")
    public class29 method419(class253 arg0) {
        if (arg0.field3291 == null || this.field234 == null || this.field234.get(class18.field100) == null) {
            return null;
        }
        class18 var2 = class18.method178(arg0.field3290);
        if (var2 == null) {
            return null;
        }
        class302 var3 = (class302) this.field234.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5205(arg0.field3291, 1000000);
        String[] var5 = new String[var4];
        var3.method5272(arg0.field3291, (int[]) null, var5);
        int var6 = var5.length * var3.field3762 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5202(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class29(arg0.field3291, var7, var6, var2);
    }

    @ObfuscatedName("av.ae(IIIIII)Ljava/util/List;")
    public List method420(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field246.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method531() && var8.method530(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field244.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method531() && var10.method530(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("av.at(I)Ljava/util/List;")
    public List method421() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field244);
        var1.addAll(this.field246.values());
        return var1;
    }

    @ObfuscatedName("av.ad(IIIII)V")
    public void method485(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class324.method5537(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, arg3);
        }
        if (var5 == 1) {
            class324.method5517(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, arg3);
        }
        if (var5 == 2) {
            class324.method5537(this.field245 * arg0 + this.field245 - 1, this.field245 * (63 - arg1), this.field245, arg3);
        }
        if (var5 == 3) {
            class324.method5517(this.field245 * arg0, this.field245 * (63 - arg1) + this.field245 - 1, this.field245, arg3);
        }
    }
}
