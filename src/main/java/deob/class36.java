package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ai")
public class class36 {

    @ObfuscatedName("ai.z")
    public static class214 field480 = new class214(37748736, 256);

    @ObfuscatedName("ai.i")
    public static class214 field481 = new class214(256, 256);

    @ObfuscatedName("ai.u")
    public int field485;

    @ObfuscatedName("ai.x")
    public int field483;

    @ObfuscatedName("ai.y")
    public class23 field484;

    @ObfuscatedName("ai.a")
    public LinkedList field476;

    @ObfuscatedName("ai.w")
    public int field486;

    @ObfuscatedName("ai.n")
    public int field475;

    @ObfuscatedName("ai.l")
    public List field488;

    @ObfuscatedName("ai.s")
    public HashMap field477;

    @ObfuscatedName("ai.v")
    public final HashMap field479;

    @ObfuscatedName("ai.q")
    public static final class239 field491 = new class239();

    @ObfuscatedName("a.o(Laf;III)V")
    public static void method44(class34 arg0, int arg1, int arg2) {
        class214 var3 = field481;
        long var5 = (long) (0x0 | arg1 << 8 | arg2);
        var3.method3616(arg0, var5);
    }

    public class36(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field485 = arg0;
        this.field483 = arg1;
        this.field476 = new LinkedList();
        this.field488 = new LinkedList();
        this.field477 = new HashMap();
        this.field486 = arg2 | 0xFF000000;
        this.field479 = arg3;
    }

    @ObfuscatedName("ai.k(IIII)V")
    public void method375(int arg0, int arg1, int arg2) {
        int var4 = this.field485;
        int var5 = this.field483;
        int var6 = this.field475;
        class214 var7 = field480;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class332 var10 = (class332) var7.method3613(var8);
        if (var10 == null) {
            return;
        }
        if (this.field475 * 64 == arg2) {
            var10.method5417(arg0, arg1);
        } else {
            var10.method5440(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ai.t(Lf;Ljava/util/List;I)V")
    public void method376(class23 arg0, List arg1) {
        this.field477.clear();
        this.field484 = arg0;
        this.method378(0, 0, 64, 64, this.field484);
        this.method379(arg1);
    }

    @ObfuscatedName("ai.d(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method377(HashSet arg0, List arg1) {
        this.field477.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            if (var4.method242() == this.field485 && var4.method243() == this.field483) {
                this.field476.add(var4);
                this.method378(var4.method593() * 8, var4.method594() * 8, 8, 8, var4);
            }
        }
        this.method379(arg1);
    }

    @ObfuscatedName("ai.h(IIIILag;I)V")
    public void method378(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class239 var8 = new class239(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field412; var9++) {
                    class32[] var10 = arg4.field413[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class270 var14 = this.method407(var13.field442);
                            if (var14 != null) {
                                class239 var15 = new class239(var9, this.field485 * 64 + var6, this.field483 * 64 + var7);
                                Object var16 = null;
                                class239 var17;
                                if (this.field484 == null) {
                                    class47 var18 = (class47) arg4;
                                    var17 = new class239(var18.field411 + var9, var18.field407 * 64 + var6 + var18.method591() * 8, var18.field408 * 64 + var7 + var18.method592() * 8);
                                } else {
                                    var17 = new class239(this.field484.field411 + var9, this.field484.field407 * 64 + var6, this.field484.field408 * 64 + var7);
                                }
                                class41 var19 = new class41(var14.field3464, var17, var15, this.method409(var14));
                                this.field477.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.m(Ljava/util/List;I)V")
    public void method379(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field375.field2787 >> 6 == this.field485 && var3.field375.field2785 >> 6 == this.field483) {
                class41 var4 = new class41(var3.field376, var3.field375, var3.field375, this.method408(var3.field376));
                this.field488.add(var4);
            }
        }
    }

    @ObfuscatedName("ai.z(ILaw;[Lai;[Lll;B)V")
    public void method406(int arg0, class48 arg1, class36[] arg2, class331[] arg3) {
        this.field475 = arg0;
        if (this.field484 == null && this.field476.isEmpty()) {
            return;
        }
        int var5 = this.field485;
        int var6 = this.field483;
        class214 var7 = field480;
        long var8 = (long) (arg0 << 16 | var5 << 8 | var6);
        class332 var10 = (class332) var7.method3613(var8);
        if (var10 != null) {
            return;
        }
        class34 var11 = this.method388(this.field485, this.field483, arg2);
        class332 var12 = new class332(this.field475 * 64, this.field475 * 64);
        var12.method5410();
        if (this.field484 == null) {
            this.method461(arg1, arg3, var11);
        } else {
            this.method383(arg1, arg2, arg3, var11);
        }
        int var13 = this.field485;
        int var14 = this.field483;
        int var15 = this.field475;
        class214 var16 = field480;
        long var18 = (long) (var15 << 16 | var13 << 8 | var14);
        var16.method3617(var12, var18, var12.field3984.length * 4);
    }

    @ObfuscatedName("ai.i(IIILjava/util/HashSet;B)V")
    public void method381(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method396(arg0, arg1, arg3, arg2);
        this.method402(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ai.u(Ljava/util/HashSet;III)V")
    public void method382(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field477.values().iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            if (arg0.contains(var5.field524)) {
                class270 var6 = Statics.field3455[var5.field524];
                this.method398(var6, var5.field530, var5.field523, arg1, arg2);
            }
        }
        this.method392(arg0, arg1, arg2);
    }

    @ObfuscatedName("ai.x(Law;[Lai;[Lll;Laf;I)V")
    public void method383(class48 arg0, class36[] arg1, class331[] arg2, class34 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method386(var5, var6, this.field484, arg0, arg3);
                this.method387(var5, var6, this.field484, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method374(var7, var8, this.field484, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ai.y(Law;[Lll;Laf;I)V")
    public void method461(class48 arg0, class331[] arg1, class34 arg2) {
        Iterator var4 = this.field476.iterator();
        while (var4.hasNext()) {
            class47 var5 = (class47) var4.next();
            for (int var6 = var5.method593() * 8; var6 < var5.method593() * 8 + 8; var6++) {
                for (int var7 = var5.method594() * 8; var7 < var5.method594() * 8 + 8; var7++) {
                    this.method386(var6, var7, var5, arg0, arg2);
                    this.method387(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field476.iterator();
        while (var8.hasNext()) {
            class47 var9 = (class47) var8.next();
            for (int var10 = var9.method593() * 8; var10 < var9.method593() * 8 + 8; var10++) {
                for (int var11 = var9.method594() * 8; var11 < var9.method594() * 8 + 8; var11++) {
                    this.method374(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ai.a(IILag;Law;[Lll;I)V")
    public void method374(int arg0, int arg1, class29 arg2, class48 arg3, class331[] arg4) {
        this.method395(arg0, arg1, arg2);
        this.method394(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ai.v(IILag;Law;Laf;I)V")
    public void method386(int arg0, int arg1, class29 arg2, class48 arg3, class34 arg4) {
        int var6 = arg2.field415[0][arg0][arg1] - 1;
        int var7 = arg2.field414[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class328.method5295(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, this.field475, this.field486);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class39.method3032(var7, this.field486);
        }
        if (var7 > -1 && arg2.field409[0][arg0][arg1] == 0) {
            class328.method5295(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, this.field475, var8);
            return;
        }
        int var9 = this.method393(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class328.method5295(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, this.field475, var9);
        } else {
            arg3.method619(this.field475 * arg0, this.field475 * (63 - arg1), var9, var8, this.field475, this.field475, arg2.field409[0][arg0][arg1], arg2.field416[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ai.q(IILag;Law;I)V")
    public void method387(int arg0, int arg1, class29 arg2, class48 arg3) {
        for (int var5 = 1; var5 < arg2.field412; var5++) {
            int var6 = arg2.field414[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class39.method3032(var6, this.field486);
                if (arg2.field409[var5][arg0][arg1] == 0) {
                    class328.method5295(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, this.field475, var7);
                } else {
                    arg3.method619(this.field475 * arg0, this.field475 * (63 - arg1), 0, var7, this.field475, this.field475, arg2.field409[var5][arg0][arg1], arg2.field416[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ai.r(II[Lai;I)Laf;")
    public class34 method388(int arg0, int arg1, class36[] arg2) {
        class214 var4 = field481;
        long var5 = (long) (0x0 | arg0 << 8 | arg1);
        class34 var7 = (class34) var4.method3613(var5);
        class34 var8 = var7;
        if (var7 == null) {
            var8 = this.method496(arg2);
            method44(var8, arg0, arg1);
        }
        return var8;
    }

    @ObfuscatedName("ai.j([Lai;B)Laf;")
    public class34 method496(class36[] arg0) {
        class45 var2 = new class45(64, 64);
        if (this.field484 == null) {
            Iterator var3 = this.field476.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                this.method453(var4.method593() * 8, var4.method594() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method453(0, 0, 64, 64, this.field484, var2);
        }
        this.method462(arg0, var2);
        class34 var5 = new class34();
        var5.method369(var2);
        return var5;
    }

    @ObfuscatedName("ai.b([Lai;Lar;I)V")
    public void method462(class36[] arg0, class45 arg1) {
        class255[] var3 = new class255[] { class255.field3322, class255.field3323, class255.field3327, class255.field3329, class255.field3328, class255.field3325, class255.field3326, class255.field3324 };
        class255[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class255 var7 = var5[var6];
            if (arg0[var7.method8()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3330) {
                    case 0:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 2:
                        var8 = 59;
                        var10 = 5;
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
                        break;
                    case 7:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                }
                this.method488(var12, var13, var8, var9, var10, var11, arg0[var7.method8()], arg1);
            }
        }
    }

    @ObfuscatedName("ai.g(IIIILag;Lar;I)V")
    public void method453(int arg0, int arg1, int arg2, int arg3, class29 arg4, class45 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field415[0][var7][var8] - 1;
                if (var9 != -1) {
                    class274 var10 = class274.method2456(var9);
                    arg5.method568(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ai.f(IIIIIILai;Lar;I)V")
    public void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class36 arg6, class45 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method413(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class274 var12 = class274.method2456(var11);
                    arg7.method568(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ai.p(IILag;Laf;B)I")
    public int method393(int arg0, int arg1, class29 arg2, class34 arg3) {
        return arg2.field415[0][arg0][arg1] == 0 ? this.field486 : arg3.method364(arg0, arg1);
    }

    @ObfuscatedName("ai.e(IILag;[Lll;B)V")
    public void method394(int arg0, int arg1, class29 arg2, class331[] arg3) {
        for (int var5 = 0; var5 < arg2.field412; var5++) {
            class32[] var6 = arg2.field413[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class248.method999(var9.field443)) {
                        int var10 = var9.field443;
                        boolean var11 = class248.field3009.field2999 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class283 var12 = class283.method713(var9.field442);
                    if (var12.field3593 != -1) {
                        if (var12.field3593 == 46 || var12.field3593 == 52) {
                            arg3[var12.field3593].method5388(this.field475 * arg0, this.field475 * (63 - arg1), this.field475 * 2 + 1, this.field475 * 2 + 1);
                        } else {
                            arg3[var12.field3593].method5388(this.field475 * arg0, this.field475 * (63 - arg1), this.field475 * 2, this.field475 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.c(IILag;S)V")
    public void method395(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field412; var4++) {
            class32[] var5 = arg2.field413[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field443;
                    boolean var10 = var9 >= class248.field2993.field2999 && var9 <= class248.field2990.field2999 || class248.field2991.field2999 == var9;
                    if (var10) {
                        class283 var11 = class283.method713(var8.field442);
                        int var12 = var11.field3598 == 0 ? -3355444 : -3407872;
                        if (class248.field2993.field2999 == var8.field443) {
                            this.method428(arg0, arg1, var8.field444, var12);
                        }
                        if (class248.field2987.field2999 == var8.field443) {
                            this.method428(arg0, arg1, var8.field444, -3355444);
                            this.method428(arg0, arg1, var8.field444 + 1, var12);
                        }
                        if (class248.field2990.field2999 == var8.field443) {
                            if (var8.field444 == 0) {
                                class328.method5304(this.field475 * arg0, this.field475 * (63 - arg1), 1, var12);
                            }
                            if (var8.field444 == 1) {
                                class328.method5304(this.field475 * arg0 + this.field475 - 1, this.field475 * (63 - arg1), 1, var12);
                            }
                            if (var8.field444 == 2) {
                                class328.method5304(this.field475 * arg0 + this.field475 - 1, this.field475 * (63 - arg1) + this.field475 - 1, 1, var12);
                            }
                            if (var8.field444 == 3) {
                                class328.method5304(this.field475 * arg0, this.field475 * (63 - arg1) + this.field475 - 1, 1, var12);
                            }
                        }
                        if (class248.field2991.field2999 == var8.field443) {
                            int var13 = var8.field444 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field475; var14++) {
                                    class328.method5304(this.field475 * arg0 + var14, this.field475 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field475; var15++) {
                                    class328.method5304(this.field475 * arg0 + var15, this.field475 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.ag(IILjava/util/HashSet;IB)V")
    public void method396(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field477.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class239 var9 = (class239) var8.getKey();
            int var10 = (int) ((float) var9.field2787 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2785 * var5 - var6);
            class41 var12 = (class41) var8.getValue();
            if (var12 != null) {
                var12.field530 = var10;
                var12.field523 = var11;
                class270 var13 = Statics.field3455[var12.field524];
                if (!arg2.contains(var13.method4360())) {
                    this.method430(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ai.at(Ljava/util/HashSet;III)V")
    public void method392(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field488.iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            class270 var6 = Statics.field3455[var5.field524];
            if (var6 != null && arg0.contains(var6.method4360())) {
                this.method398(var6, var5.field530, var5.field523, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ai.ac(Ljw;IIIII)V")
    public void method398(class270 arg0, int arg1, int arg2, int arg3, int arg4) {
        class332 var6 = arg0.method4385(false);
        if (var6 == null) {
            return;
        }
        var6.method5514(arg1 - var6.field3983 / 2, arg2 - var6.field3988 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class328.method5293(arg1, arg2, 15, 16776960, 128);
            class328.method5293(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ai.al(Lao;IIFB)V")
    public void method430(class41 arg0, int arg1, int arg2, float arg3) {
        class270 var5 = Statics.field3455[arg0.field524];
        this.method411(var5, arg1, arg2);
        this.method401(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ai.ah(Ljw;III)V")
    public void method411(class270 arg0, int arg1, int arg2) {
        class332 var4 = arg0.method4385(false);
        if (var4 != null) {
            int var5 = this.method399(var4, arg0.field3470);
            int var6 = this.method433(var4, arg0.field3454);
            var4.method5514(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ai.af(Lao;Ljw;IIFB)V")
    public void method401(class41 arg0, class270 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field528 != null && arg0.field528.field469.method181(arg4)) {
            class312 var6 = (class312) this.field479.get(arg0.field528.field469);
            var6.method5092(arg0.field528.field468, arg2 - arg0.field528.field471 / 2, arg3, arg0.field528.field471, arg0.field528.field470, 0xFF000000 | arg1.field3461, 0, 1, 0, var6.field3896 / 2);
        }
    }

    @ObfuscatedName("ai.aq(IILjava/util/HashSet;II)V")
    public void method402(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field488.iterator();
        while (var6.hasNext()) {
            class41 var7 = (class41) var6.next();
            int var8 = var7.field533.field2787 % 64;
            int var9 = var7.field533.field2785 % 64;
            var7.field530 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field523 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field524)) {
                this.method430(var7, var7.field530, var7.field523, var5);
            }
        }
    }

    @ObfuscatedName("ai.ai(S)V")
    public void method403() {
        if (this.field484 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method404(var1, var2, this.field484);
                }
            }
            return;
        }
        Iterator var3 = this.field476.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            for (int var5 = var4.method593() * 8; var5 < var4.method593() * 8 + 8; var5++) {
                for (int var6 = var4.method594() * 8; var6 < var4.method594() * 8 + 8; var6++) {
                    this.method404(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ai.az(IILag;I)V")
    public void method404(int arg0, int arg1, class29 arg2) {
        field491.method4006(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field412; var4++) {
            class32[] var5 = arg2.field413[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class270 var9 = this.method407(var8.field442);
                    if (var9 != null) {
                        class41 var10 = (class41) this.field477.get(field491);
                        if (var10 != null) {
                            if (var9.field3464 != var10.field524) {
                                class41 var11 = new class41(var9.field3464, var10.field525, var10.field533, this.method409(var9));
                                this.field477.put(new class239(field491), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field525.field2784 - var10.field533.field2784;
                            var10.field533.field2784 = var4;
                            var10.field525.field2784 = var4 + var12;
                            return;
                        }
                        class239 var13 = new class239(var4, this.field485 * 64 + arg0, this.field483 * 64 + arg1);
                        class239 var14 = null;
                        if (this.field484 == null) {
                            Iterator var15 = this.field476.iterator();
                            while (var15.hasNext()) {
                                class47 var16 = (class47) var15.next();
                                if (var16.method590(arg0, arg1)) {
                                    var14 = new class239(var16.field411 + var4, var16.field407 * 64 + arg0 + var16.method591() * 8, var16.field408 * 64 + arg1 + var16.method592() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class239(this.field484.field411 + var4, this.field484.field407 * 64 + arg0, this.field484.field408 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class41 var17 = new class41(var9.field3464, var14, var13, this.method409(var9));
                            this.field477.put(new class239(field491), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field477.remove(field491);
    }

    @ObfuscatedName("ai.aa(Lld;Lji;B)I")
    public int method399(class332 arg0, class285 arg1) {
        switch(arg1.field3701) {
            case 0:
                return -arg0.field3983 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3983;
        }
    }

    @ObfuscatedName("ai.av(Lld;Ljx;I)I")
    public int method433(class332 arg0, class267 arg1) {
        switch(arg1.field3442) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3988 / 2;
            default:
                return -arg0.field3988;
        }
    }

    @ObfuscatedName("ai.am(II)Ljw;")
    public class270 method407(int arg0) {
        class283 var2 = class283.method713(arg0);
        if (var2.field3632 != null) {
            var2 = var2.method4616();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3619 == -1 ? null : Statics.field3455[var2.field3619];
    }

    @ObfuscatedName("ai.ao(II)Laq;")
    public class35 method408(int arg0) {
        class270 var2 = Statics.field3455[arg0];
        return this.method409(var2);
    }

    @ObfuscatedName("ai.ax(Ljw;I)Laq;")
    public class35 method409(class270 arg0) {
        if (arg0.field3458 == null || this.field479 == null || this.field479.get(class25.field372) == null) {
            return null;
        }
        class25 var2 = class25.method184(arg0.field3459);
        if (var2 == null) {
            return null;
        }
        class312 var3 = (class312) this.field479.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5086(arg0.field3458, 1000000);
        String[] var5 = new String[var4];
        var3.method5153(arg0.field3458, (int[]) null, var5);
        int var6 = var5.length * var3.field3896 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5144(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class35(arg0.field3458, var7, var6, var2);
    }

    @ObfuscatedName("ai.ad(IIIIIB)Ljava/util/List;")
    public List method431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field477.values().iterator();
            while (var7.hasNext()) {
                class41 var8 = (class41) var7.next();
                if (var8.method520(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field488.iterator();
            while (var9.hasNext()) {
                class41 var10 = (class41) var9.next();
                if (var10.method520(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ai.au(I)Ljava/util/List;")
    public List method473() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field488);
        var1.addAll(this.field477.values());
        return var1;
    }

    @ObfuscatedName("ai.ar(IIIII)V")
    public void method428(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class328.method5370(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, arg3);
        }
        if (var5 == 1) {
            class328.method5304(this.field475 * arg0, this.field475 * (63 - arg1), this.field475, arg3);
        }
        if (var5 == 2) {
            class328.method5370(this.field475 * arg0 + this.field475 - 1, this.field475 * (63 - arg1), this.field475, arg3);
        }
        if (var5 == 3) {
            class328.method5304(this.field475 * arg0, this.field475 * (63 - arg1) + this.field475 - 1, this.field475, arg3);
        }
    }

    @ObfuscatedName("ai.an(III)I")
    public int method413(int arg0, int arg1) {
        if (this.field484 != null) {
            return this.field484.method256(arg0, arg1);
        }
        if (!this.field476.isEmpty()) {
            Iterator var3 = this.field476.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                if (var4.method590(arg0, arg1)) {
                    return var4.method256(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
