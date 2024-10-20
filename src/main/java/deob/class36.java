package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("au")
public class class36 {

    @ObfuscatedName("au.e")
    public static class214 field458 = new class214(37748736, 256);

    @ObfuscatedName("au.x")
    public static class214 field463 = new class214(256, 256);

    @ObfuscatedName("au.p")
    public int field460;

    @ObfuscatedName("au.g")
    public int field461;

    @ObfuscatedName("au.n")
    public class23 field462;

    @ObfuscatedName("au.o")
    public LinkedList field454;

    @ObfuscatedName("au.c")
    public int field464;

    @ObfuscatedName("au.v")
    public int field465;

    @ObfuscatedName("au.u")
    public List field466;

    @ObfuscatedName("au.j")
    public HashMap field467;

    @ObfuscatedName("au.k")
    public final HashMap field468;

    @ObfuscatedName("au.z")
    public static final class239 field469 = new class239();

    @ObfuscatedName("h.t(IIIB)Lla;")
    public static class332 method178(int arg0, int arg1, int arg2) {
        class214 var3 = field458;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class332) var3.method3640(var4);
    }

    @ObfuscatedName("an.q(Lla;IIII)V")
    public static void method511(class332 arg0, int arg1, int arg2, int arg3) {
        class214 var4 = field458;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3643(arg0, var6, arg0.field3986.length * 4);
    }

    @ObfuscatedName("ee.i(III)Lap;")
    public static class34 method2556(int arg0, int arg1) {
        class214 var2 = field463;
        long var3 = (long) (0x0 | arg0 << 8 | arg1);
        return (class34) var2.method3640(var3);
    }

    @ObfuscatedName("ea.a(I)V")
    public static void method2880() {
        field458.method3639(5);
        field463.method3639(5);
    }

    public class36(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field460 = arg0;
        this.field461 = arg1;
        this.field454 = new LinkedList();
        this.field466 = new LinkedList();
        this.field467 = new HashMap();
        this.field464 = arg2 | 0xFF000000;
        this.field468 = arg3;
    }

    @ObfuscatedName("au.l(IIII)V")
    public void method404(int arg0, int arg1, int arg2) {
        class332 var4 = method178(this.field460, this.field461, this.field465);
        if (var4 == null) {
            return;
        }
        if (this.field465 * 64 == arg2) {
            var4.method5386(arg0, arg1);
        } else {
            var4.method5409(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("au.b(Lr;Ljava/util/List;I)V")
    public void method424(class23 arg0, List arg1) {
        this.field467.clear();
        this.field462 = arg0;
        this.method351(0, 0, 64, 64, this.field462);
        this.method352(arg1);
    }

    @ObfuscatedName("au.e(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method412(HashSet arg0, List arg1) {
        this.field467.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            if (var4.method223() == this.field460 && var4.method224() == this.field461) {
                this.field454.add(var4);
                this.method351(var4.method610() * 8, var4.method611() * 8, 8, 8, var4);
            }
        }
        this.method352(arg1);
    }

    @ObfuscatedName("au.x(IIIILav;B)V")
    public void method351(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class239 var8 = new class239(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field383; var9++) {
                    class32[] var10 = arg4.field388[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class270 var14 = this.method380(var13.field421);
                            if (var14 != null) {
                                class239 var15 = new class239(var9, this.field460 * 64 + var6, this.field461 * 64 + var7);
                                Object var16 = null;
                                class239 var17;
                                if (this.field462 == null) {
                                    class47 var18 = (class47) arg4;
                                    var17 = new class239(var18.field382 + var9, var18.field380 * 64 + var6 + var18.method618() * 8, var18.field379 * 64 + var7 + var18.method609() * 8);
                                } else {
                                    var17 = new class239(this.field462.field382 + var9, this.field462.field380 * 64 + var6, this.field462.field379 * 64 + var7);
                                }
                                class41 var19 = new class41(var14.field3458, var17, var15, this.method382(var14));
                                this.field467.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.p(Ljava/util/List;B)V")
    public void method352(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field346.field2777 >> 6 == this.field460 && var3.field346.field2776 >> 6 == this.field461) {
                class41 var4 = new class41(var3.field348, var3.field346, var3.field346, this.method381(var3.field348));
                this.field466.add(var4);
            }
        }
    }

    @ObfuscatedName("au.o(ILaf;[Lau;[Llk;I)V")
    public void method349(int arg0, class48 arg1, class36[] arg2, class331[] arg3) {
        this.field465 = arg0;
        if (this.field462 == null && this.field454.isEmpty() || method178(this.field460, this.field461, arg0) != null) {
            return;
        }
        class34 var5 = this.method361(this.field460, this.field461, arg2);
        class332 var6 = new class332(this.field465 * 64, this.field465 * 64);
        var6.method5389();
        if (this.field462 == null) {
            this.method461(arg1, arg3, var5);
        } else {
            this.method356(arg1, arg2, arg3, var5);
        }
        method511(var6, this.field460, this.field461, this.field465);
    }

    @ObfuscatedName("au.c(IIILjava/util/HashSet;B)V")
    public void method354(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method369(arg0, arg1, arg3, arg2);
        this.method368(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("au.u(Ljava/util/HashSet;IIB)V")
    public void method355(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field467.values().iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            if (arg0.contains(var5.field515)) {
                class270 var6 = Statics.field3455[var5.field515];
                this.method387(var6, var5.field516, var5.field520, arg1, arg2);
            }
        }
        this.method370(arg0, arg1, arg2);
    }

    @ObfuscatedName("au.k(Laf;[Lau;[Llk;Lap;I)V")
    public void method356(class48 arg0, class36[] arg1, class331[] arg2, class34 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method359(var5, var6, this.field462, arg0, arg3);
                this.method363(var5, var6, this.field462, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method390(var7, var8, this.field462, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("au.z(Laf;[Llk;Lap;I)V")
    public void method461(class48 arg0, class331[] arg1, class34 arg2) {
        Iterator var4 = this.field454.iterator();
        while (var4.hasNext()) {
            class47 var5 = (class47) var4.next();
            for (int var6 = var5.method610() * 8; var6 < var5.method610() * 8 + 8; var6++) {
                for (int var7 = var5.method611() * 8; var7 < var5.method611() * 8 + 8; var7++) {
                    this.method359(var6, var7, var5, arg0, arg2);
                    this.method363(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field454.iterator();
        while (var8.hasNext()) {
            class47 var9 = (class47) var8.next();
            for (int var10 = var9.method610() * 8; var10 < var9.method610() * 8 + 8; var10++) {
                for (int var11 = var9.method611() * 8; var11 < var9.method611() * 8 + 8; var11++) {
                    this.method390(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("au.w(IILav;Laf;[Llk;I)V")
    public void method390(int arg0, int arg1, class29 arg2, class48 arg3, class331[] arg4) {
        this.method350(arg0, arg1, arg2);
        this.method367(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("au.s(IILav;Laf;Lap;I)V")
    public void method359(int arg0, int arg1, class29 arg2, class48 arg3, class34 arg4) {
        int var6 = arg2.field384[0][arg0][arg1] - 1;
        int var7 = arg2.field385[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class328.method5275(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, this.field465, this.field464);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field464;
            class287 var10 = class287.method3134(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field3748 >= 0) {
                var11 = var10.field3748 | 0xFF000000;
            } else if (var10.field3746 >= 0) {
                int var12 = class39.method671(Statics.field1932.method2349(var10.field3746), 96);
                var11 = class135.field1931[var12] | 0xFF000000;
            } else if (var10.field3745 == 16711935) {
                var11 = var9;
            } else {
                int var13 = class39.method156(var10.field3749, var10.field3750, var10.field3751);
                int var14 = class39.method671(var13, 96);
                var11 = class135.field1931[var14] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field390[0][arg0][arg1] == 0) {
            class328.method5275(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, this.field465, var8);
            return;
        }
        int var15 = this.method366(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class328.method5275(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, this.field465, var15);
        } else {
            arg3.method663(this.field465 * arg0, this.field465 * (63 - arg1), var15, var8, this.field465, this.field465, arg2.field390[0][arg0][arg1], arg2.field387[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("au.d(IILav;Laf;I)V")
    public void method363(int arg0, int arg1, class29 arg2, class48 arg3) {
        for (int var5 = 1; var5 < arg2.field383; var5++) {
            int var6 = arg2.field385[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field464;
                class287 var8 = class287.method3134(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3748 >= 0) {
                    var9 = var8.field3748 | 0xFF000000;
                } else if (var8.field3746 >= 0) {
                    int var10 = class39.method671(Statics.field1932.method2349(var8.field3746), 96);
                    var9 = class135.field1931[var10] | 0xFF000000;
                } else if (var8.field3745 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = class39.method156(var8.field3749, var8.field3750, var8.field3751);
                    int var12 = class39.method671(var11, 96);
                    var9 = class135.field1931[var12] | 0xFF000000;
                }
                if (arg2.field390[var5][arg0][arg1] == 0) {
                    class328.method5275(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, this.field465, var9);
                } else {
                    arg3.method663(this.field465 * arg0, this.field465 * (63 - arg1), 0, var9, this.field465, this.field465, arg2.field390[var5][arg0][arg1], arg2.field387[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("au.f(II[Lau;B)Lap;")
    public class34 method361(int arg0, int arg1, class36[] arg2) {
        class34 var4 = method2556(arg0, arg1);
        if (var4 == null) {
            var4 = this.method362(arg2);
            class214 var5 = field463;
            long var7 = (long) (0x0 | arg0 << 8 | arg1);
            var5.method3656(var4, var7);
        }
        return var4;
    }

    @ObfuscatedName("au.r([Lau;I)Lap;")
    public class34 method362(class36[] arg0) {
        class45 var2 = new class45(64, 64);
        if (this.field462 == null) {
            Iterator var3 = this.field454.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                this.method364(var4.method610() * 8, var4.method611() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method364(0, 0, 64, 64, this.field462, var2);
        }
        this.method371(arg0, var2);
        class34 var5 = new class34();
        var5.method330(var2);
        return var5;
    }

    @ObfuscatedName("au.y([Lau;Law;I)V")
    public void method371(class36[] arg0, class45 arg1) {
        class255[] var3 = new class255[] { class255.field3323, class255.field3324, class255.field3326, class255.field3327, class255.field3321, class255.field3320, class255.field3328, class255.field3322 };
        class255[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class255 var7 = var5[var6];
            if (arg0[var7.method12()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3329) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 3:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 4:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var9 = 59;
                        var11 = 5;
                }
                this.method358(var12, var13, var8, var9, var10, var11, arg0[var7.method12()], arg1);
            }
        }
    }

    @ObfuscatedName("au.h(IIIILav;Law;I)V")
    public void method364(int arg0, int arg1, int arg2, int arg3, class29 arg4, class45 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field384[0][var7][var8] - 1;
                if (var9 != -1) {
                    class274 var10 = class274.method4181(var9);
                    arg5.method585(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("au.av(IIIIIILau;Law;B)V")
    public void method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class36 arg6, class45 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method473(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class274 var12 = class274.method4181(var11);
                    arg7.method585(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("au.aj(IILav;Lap;I)I")
    public int method366(int arg0, int arg1, class29 arg2, class34 arg3) {
        return arg2.field384[0][arg0][arg1] == 0 ? this.field464 : arg3.method329(arg0, arg1);
    }

    @ObfuscatedName("au.ae(IILav;[Llk;B)V")
    public void method367(int arg0, int arg1, class29 arg2, class331[] arg3) {
        for (int var5 = 0; var5 < arg2.field383; var5++) {
            class32[] var6 = arg2.field388[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class248.method1816(var9.field417)) {
                        int var10 = var9.field417;
                        boolean var11 = class248.field3003.field3004 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class283 var12 = class283.method4427(var9.field421);
                    if (var12.field3624 != -1) {
                        if (var12.field3624 == 46 || var12.field3624 == 52) {
                            arg3[var12.field3624].method5379(this.field465 * arg0, this.field465 * (63 - arg1), this.field465 * 2 + 1, this.field465 * 2 + 1);
                        } else {
                            arg3[var12.field3624].method5379(this.field465 * arg0, this.field465 * (63 - arg1), this.field465 * 2, this.field465 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.am(IILav;B)V")
    public void method350(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field383; var4++) {
            class32[] var5 = arg2.field388[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field417;
                    boolean var10 = var9 >= class248.field2981.field3004 && var9 <= class248.field2984.field3004 || class248.field2985.field3004 == var9;
                    if (var10) {
                        class283 var11 = class283.method4427(var8.field421);
                        int var12 = var11.field3614 == 0 ? -3355444 : -3407872;
                        if (class248.field2981.field3004 == var8.field417) {
                            this.method385(arg0, arg1, var8.field418, var12);
                        }
                        if (class248.field2983.field3004 == var8.field417) {
                            this.method385(arg0, arg1, var8.field418, -3355444);
                            this.method385(arg0, arg1, var8.field418 + 1, var12);
                        }
                        if (class248.field2984.field3004 == var8.field417) {
                            if (var8.field418 == 0) {
                                class328.method5284(this.field465 * arg0, this.field465 * (63 - arg1), 1, var12);
                            }
                            if (var8.field418 == 1) {
                                class328.method5284(this.field465 * arg0 + this.field465 - 1, this.field465 * (63 - arg1), 1, var12);
                            }
                            if (var8.field418 == 2) {
                                class328.method5284(this.field465 * arg0 + this.field465 - 1, this.field465 * (63 - arg1) + this.field465 - 1, 1, var12);
                            }
                            if (var8.field418 == 3) {
                                class328.method5284(this.field465 * arg0, this.field465 * (63 - arg1) + this.field465 - 1, 1, var12);
                            }
                        }
                        if (class248.field2985.field3004 == var8.field417) {
                            int var13 = var8.field418 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field465; var14++) {
                                    class328.method5284(this.field465 * arg0 + var14, this.field465 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field465; var15++) {
                                    class328.method5284(this.field465 * arg0 + var15, this.field465 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.az(IILjava/util/HashSet;IB)V")
    public void method369(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field467.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class239 var9 = (class239) var8.getKey();
            int var10 = (int) ((float) var9.field2777 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2776 * var5 - var6);
            class41 var12 = (class41) var8.getValue();
            if (var12 != null) {
                var12.field516 = var10;
                var12.field520 = var11;
                class270 var13 = Statics.field3455[var12.field515];
                if (!arg2.contains(var13.method4386())) {
                    this.method372(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("au.ap(Ljava/util/HashSet;III)V")
    public void method370(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field466.iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            class270 var6 = Statics.field3455[var5.field515];
            if (var6 != null && arg0.contains(var6.method4386())) {
                this.method387(var6, var5.field516, var5.field520, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("au.ah(Ljj;IIIIB)V")
    public void method387(class270 arg0, int arg1, int arg2, int arg3, int arg4) {
        class332 var6 = arg0.method4384(false);
        if (var6 == null) {
            return;
        }
        var6.method5445(arg1 - var6.field3984 / 2, arg2 - var6.field3985 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class328.method5286(arg1, arg2, 15, 16776960, 128);
            class328.method5286(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("au.au(Lal;IIFI)V")
    public void method372(class41 arg0, int arg1, int arg2, float arg3) {
        class270 var5 = Statics.field3455[arg0.field515];
        this.method486(var5, arg1, arg2);
        this.method374(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("au.ax(Ljj;III)V")
    public void method486(class270 arg0, int arg1, int arg2) {
        class332 var4 = arg0.method4384(false);
        if (var4 != null) {
            int var5 = this.method378(var4, arg0.field3464);
            int var6 = this.method379(var4, arg0.field3465);
            var4.method5445(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("au.ar(Lal;Ljj;IIFI)V")
    public void method374(class41 arg0, class270 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field517 != null && arg0.field517.field444.method177(arg4)) {
            class312 var6 = (class312) this.field468.get(arg0.field517.field444);
            var6.method5077(arg0.field517.field445, arg2 - arg0.field517.field442 / 2, arg3, arg0.field517.field442, arg0.field517.field443, 0xFF000000 | arg1.field3474, 0, 1, 0, var6.field3893 / 2);
        }
    }

    @ObfuscatedName("au.an(IILjava/util/HashSet;II)V")
    public void method368(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field466.iterator();
        while (var6.hasNext()) {
            class41 var7 = (class41) var6.next();
            int var8 = var7.field511.field2777 % 64;
            int var9 = var7.field511.field2776 % 64;
            var7.field516 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field520 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field515)) {
                this.method372(var7, var7.field516, var7.field520, var5);
            }
        }
    }

    @ObfuscatedName("au.ai(I)V")
    public void method400() {
        if (this.field462 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method377(var1, var2, this.field462);
                }
            }
            return;
        }
        Iterator var3 = this.field454.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            for (int var5 = var4.method610() * 8; var5 < var4.method610() * 8 + 8; var5++) {
                for (int var6 = var4.method611() * 8; var6 < var4.method611() * 8 + 8; var6++) {
                    this.method377(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("au.al(IILav;I)V")
    public void method377(int arg0, int arg1, class29 arg2) {
        field469.method4047(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field383; var4++) {
            class32[] var5 = arg2.field388[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class270 var9 = this.method380(var8.field421);
                    if (var9 != null) {
                        class41 var10 = (class41) this.field467.get(field469);
                        if (var10 != null) {
                            if (var9.field3458 != var10.field515) {
                                class41 var11 = new class41(var9.field3458, var10.field512, var10.field511, this.method382(var9));
                                this.field467.put(new class239(field469), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field512.field2778 - var10.field511.field2778;
                            var10.field511.field2778 = var4;
                            var10.field512.field2778 = var4 + var12;
                            return;
                        }
                        class239 var13 = new class239(var4, this.field460 * 64 + arg0, this.field461 * 64 + arg1);
                        class239 var14 = null;
                        if (this.field462 == null) {
                            Iterator var15 = this.field454.iterator();
                            while (var15.hasNext()) {
                                class47 var16 = (class47) var15.next();
                                if (var16.method616(arg0, arg1)) {
                                    var14 = new class239(var16.field382 + var4, var16.field380 * 64 + arg0 + var16.method618() * 8, var16.field379 * 64 + arg1 + var16.method609() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class239(this.field462.field382 + var4, this.field462.field380 * 64 + arg0, this.field462.field379 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class41 var17 = new class41(var9.field3458, var14, var13, this.method382(var9));
                            this.field467.put(new class239(field469), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field467.remove(field469);
    }

    @ObfuscatedName("au.at(Lla;Ljm;B)I")
    public int method378(class332 arg0, class285 arg1) {
        switch(arg1.field3704) {
            case 0:
                return -arg0.field3984 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3984;
        }
    }

    @ObfuscatedName("au.ag(Lla;Lji;I)I")
    public int method379(class332 arg0, class267 arg1) {
        switch(arg1.field3441) {
            case 0:
                return -arg0.field3985 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3985;
        }
    }

    @ObfuscatedName("au.as(II)Ljj;")
    public class270 method380(int arg0) {
        class283 var2 = class283.method4427(arg0);
        if (var2.field3606 != null) {
            var2 = var2.method4615();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3611 == -1 ? null : Statics.field3455[var2.field3611];
    }

    @ObfuscatedName("au.aw(II)Lah;")
    public class35 method381(int arg0) {
        class270 var2 = Statics.field3455[arg0];
        return this.method382(var2);
    }

    @ObfuscatedName("au.aq(Ljj;I)Lah;")
    public class35 method382(class270 arg0) {
        if (arg0.field3461 == null || this.field468 == null || this.field468.get(class25.field344) == null) {
            return null;
        }
        int var2 = arg0.field3463;
        class25[] var3 = new class25[] { class25.field336, class25.field344, class25.field335 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field340 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class312 var9 = (class312) this.field468.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5071(arg0.field3461, 1000000);
        String[] var11 = new String[var10];
        var9.method5069(arg0.field3461, (int[]) null, var11);
        int var12 = var11.length * var9.field3893 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method5068(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class35(arg0.field3461, var13, var12, var7);
    }

    @ObfuscatedName("au.aa(IIIIIB)Ljava/util/List;")
    public List method383(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field467.values().iterator();
            while (var7.hasNext()) {
                class41 var8 = (class41) var7.next();
                if (var8.method522(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field466.iterator();
            while (var9.hasNext()) {
                class41 var10 = (class41) var9.next();
                if (var10.method522(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("au.af(B)Ljava/util/List;")
    public List method388() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field466);
        var1.addAll(this.field467.values());
        return var1;
    }

    @ObfuscatedName("au.ak(IIIIB)V")
    public void method385(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class328.method5273(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, arg3);
        }
        if (var5 == 1) {
            class328.method5284(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, arg3);
        }
        if (var5 == 2) {
            class328.method5273(this.field465 * arg0 + this.field465 - 1, this.field465 * (63 - arg1), this.field465, arg3);
        }
        if (var5 == 3) {
            class328.method5284(this.field465 * arg0, this.field465 * (63 - arg1) + this.field465 - 1, this.field465, arg3);
        }
    }

    @ObfuscatedName("au.ab(III)I")
    public int method473(int arg0, int arg1) {
        if (this.field462 != null) {
            return this.field462.method222(arg0, arg1);
        }
        if (!this.field454.isEmpty()) {
            Iterator var3 = this.field454.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                if (var4.method616(arg0, arg1)) {
                    return var4.method222(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
