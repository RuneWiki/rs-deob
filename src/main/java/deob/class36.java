package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ak")
public class class36 {

    @ObfuscatedName("ak.s")
    public static class214 field473 = new class214(37748736, 256);

    @ObfuscatedName("ak.y")
    public static class214 field474 = new class214(256, 256);

    @ObfuscatedName("ak.c")
    public int field482;

    @ObfuscatedName("ak.h")
    public int field489;

    @ObfuscatedName("ak.i")
    public class23 field477;

    @ObfuscatedName("ak.o")
    public LinkedList field478;

    @ObfuscatedName("ak.d")
    public int field479;

    @ObfuscatedName("ak.r")
    public int field476;

    @ObfuscatedName("ak.p")
    public List field480;

    @ObfuscatedName("ak.q")
    public HashMap field475;

    @ObfuscatedName("ak.f")
    public final HashMap field483;

    @ObfuscatedName("ak.j")
    public static final class239 field484 = new class239();

    @ObfuscatedName("fu.g(IIII)J")
    public static long method3098(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("de.e(IIIB)Llv;")
    public static class332 method2228(int arg0, int arg1, int arg2) {
        return (class332) field473.method3717(method3098(arg0, arg1, arg2));
    }

    @ObfuscatedName("gk.b(Llv;IIII)V")
    public static void method3216(class332 arg0, int arg1, int arg2, int arg3) {
        field473.method3716(arg0, method3098(arg1, arg2, arg3), arg0.field3986.length * 4);
    }

    @ObfuscatedName("fg.z(III)Lav;")
    public static class34 method3028(int arg0, int arg1) {
        return (class34) field474.method3717(method3098(arg0, arg1, 0));
    }

    @ObfuscatedName("kt.n(Lav;IIB)V")
    public static void method4876(class34 arg0, int arg1, int arg2) {
        field474.method3723(arg0, method3098(arg1, arg2, 0));
    }

    @ObfuscatedName("cc.l(I)V")
    public static void method1865() {
        field473.method3721(5);
        field474.method3721(5);
    }

    public class36(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field482 = arg0;
        this.field489 = arg1;
        this.field478 = new LinkedList();
        this.field480 = new LinkedList();
        this.field475 = new HashMap();
        this.field479 = arg2 | 0xFF000000;
        this.field483 = arg3;
    }

    @ObfuscatedName("ak.s(IIIS)V")
    public void method342(int arg0, int arg1, int arg2) {
        class332 var4 = method2228(this.field482, this.field489, this.field476);
        if (var4 == null) {
            return;
        }
        if (this.field476 * 64 == arg2) {
            var4.method5460(arg0, arg1);
        } else {
            var4.method5481(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ak.y(Lm;Ljava/util/List;I)V")
    public void method423(class23 arg0, List arg1) {
        this.field475.clear();
        this.field477 = arg0;
        this.method402(0, 0, 64, 64, this.field477);
        this.method385(arg1);
    }

    @ObfuscatedName("ak.c(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method344(HashSet arg0, List arg1) {
        this.field475.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            if (var4.method212() == this.field482 && var4.method213() == this.field489) {
                this.field478.add(var4);
                this.method402(var4.method629() * 8, var4.method614() * 8, 8, 8, var4);
            }
        }
        this.method385(arg1);
    }

    @ObfuscatedName("ak.o(IIIILaj;I)V")
    public void method402(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class239 var8 = new class239(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field404; var9++) {
                    class32[] var10 = arg4.field409[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class270 var14 = this.method477(var13.field436);
                            if (var14 != null) {
                                class239 var15 = new class239(var9, this.field482 * 64 + var6, this.field489 * 64 + var7);
                                Object var16 = null;
                                class239 var17;
                                if (this.field477 == null) {
                                    class47 var18 = (class47) arg4;
                                    var17 = new class239(var18.field403 + var9, var18.field406 * 64 + var6 + var18.method611() * 8, var18.field400 * 64 + var7 + var18.method612() * 8);
                                } else {
                                    var17 = new class239(this.field477.field403 + var9, this.field477.field406 * 64 + var6, this.field477.field400 * 64 + var7);
                                }
                                class41 var19 = new class41(var14.field3453, var17, var15, this.method376(var14));
                                this.field475.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.d(Ljava/util/List;I)V")
    public void method385(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field372.field2791 >> 6 == this.field482 && var3.field372.field2790 >> 6 == this.field489) {
                class41 var4 = new class41(var3.field374, var3.field372, var3.field372, this.method375(var3.field374));
                this.field480.add(var4);
            }
        }
    }

    @ObfuscatedName("ak.r(ILan;[Lak;[Llh;I)V")
    public void method347(int arg0, class48 arg1, class36[] arg2, class331[] arg3) {
        this.field476 = arg0;
        if (this.field477 == null && this.field478.isEmpty() || method2228(this.field482, this.field489, arg0) != null) {
            return;
        }
        class34 var5 = this.method355(this.field482, this.field489, arg2);
        class332 var6 = new class332(this.field476 * 64, this.field476 * 64);
        var6.method5453();
        if (this.field477 == null) {
            this.method351(arg1, arg3, var5);
        } else {
            this.method350(arg1, arg2, arg3, var5);
        }
        method3216(var6, this.field482, this.field489, this.field476);
    }

    @ObfuscatedName("ak.p(IIILjava/util/HashSet;I)V")
    public void method464(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method363(arg0, arg1, arg3, arg2);
        this.method369(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ak.q(Ljava/util/HashSet;III)V")
    public void method349(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field475.values().iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            if (arg0.contains(var5.field530)) {
                class270 var6 = Statics.field2517[var5.field530];
                this.method365(var6, var5.field528, var5.field524, arg1, arg2);
            }
        }
        this.method364(arg0, arg1, arg2);
    }

    @ObfuscatedName("ak.f(Lan;[Lak;[Llh;Lav;I)V")
    public void method350(class48 arg0, class36[] arg1, class331[] arg2, class34 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method411(var5, var6, this.field477, arg0, arg3);
                this.method354(var5, var6, this.field477, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method352(var7, var8, this.field477, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ak.j(Lan;[Llh;Lav;I)V")
    public void method351(class48 arg0, class331[] arg1, class34 arg2) {
        Iterator var4 = this.field478.iterator();
        while (var4.hasNext()) {
            class47 var5 = (class47) var4.next();
            for (int var6 = var5.method629() * 8; var6 < var5.method629() * 8 + 8; var6++) {
                for (int var7 = var5.method614() * 8; var7 < var5.method614() * 8 + 8; var7++) {
                    this.method411(var6, var7, var5, arg0, arg2);
                    this.method354(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field478.iterator();
        while (var8.hasNext()) {
            class47 var9 = (class47) var8.next();
            for (int var10 = var9.method629() * 8; var10 < var9.method629() * 8 + 8; var10++) {
                for (int var11 = var9.method614() * 8; var11 < var9.method614() * 8 + 8; var11++) {
                    this.method352(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ak.v(IILaj;Lan;[Llh;I)V")
    public void method352(int arg0, int arg1, class29 arg2, class48 arg3, class331[] arg4) {
        this.method348(arg0, arg1, arg2);
        this.method361(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ak.u(IILaj;Lan;Lav;I)V")
    public void method411(int arg0, int arg1, class29 arg2, class48 arg3, class34 arg4) {
        int var6 = arg2.field405[0][arg0][arg1] - 1;
        int var7 = arg2.field401[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class328.method5362(this.field476 * arg0, this.field476 * (63 - arg1), this.field476, this.field476, this.field479);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class39.method3027(var7, this.field479);
        }
        if (var7 > -1 && arg2.field407[0][arg0][arg1] == 0) {
            class328.method5362(this.field476 * arg0, this.field476 * (63 - arg1), this.field476, this.field476, var8);
            return;
        }
        int var9 = this.method360(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class328.method5362(this.field476 * arg0, this.field476 * (63 - arg1), this.field476, this.field476, var9);
        } else {
            arg3.method654(this.field476 * arg0, this.field476 * (63 - arg1), var9, var8, this.field476, this.field476, arg2.field407[0][arg0][arg1], arg2.field408[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ak.k(IILaj;Lan;I)V")
    public void method354(int arg0, int arg1, class29 arg2, class48 arg3) {
        for (int var5 = 1; var5 < arg2.field404; var5++) {
            int var6 = arg2.field401[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class39.method3027(var6, this.field479);
                if (arg2.field407[var5][arg0][arg1] == 0) {
                    class328.method5362(this.field476 * arg0, this.field476 * (63 - arg1), this.field476, this.field476, var7);
                } else {
                    arg3.method654(this.field476 * arg0, this.field476 * (63 - arg1), 0, var7, this.field476, this.field476, arg2.field407[var5][arg0][arg1], arg2.field408[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ak.w(II[Lak;I)Lav;")
    public class34 method355(int arg0, int arg1, class36[] arg2) {
        class34 var4 = method3028(arg0, arg1);
        if (var4 == null) {
            var4 = this.method467(arg2);
            method4876(var4, arg0, arg1);
        }
        return var4;
    }

    @ObfuscatedName("ak.x([Lak;I)Lav;")
    public class34 method467(class36[] arg0) {
        class45 var2 = new class45(64, 64);
        if (this.field477 == null) {
            Iterator var3 = this.field478.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                this.method473(var4.method629() * 8, var4.method614() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method473(0, 0, 64, 64, this.field477, var2);
        }
        this.method357(arg0, var2);
        class34 var5 = new class34();
        var5.method336(var2);
        return var5;
    }

    @ObfuscatedName("ak.t([Lak;Lap;B)V")
    public void method357(class36[] arg0, class45 arg1) {
        class255[] var3 = new class255[] { class255.field3321, class255.field3323, class255.field3319, class255.field3322, class255.field3317, class255.field3316, class255.field3318, class255.field3320 };
        class255[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class255 var7 = var5[var6];
            if (arg0[var7.method15()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3315) {
                    case 0:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 2:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                }
                this.method359(var12, var13, var8, var9, var10, var11, arg0[var7.method15()], arg1);
            }
        }
    }

    @ObfuscatedName("ak.ax(IIIILaj;Lap;I)V")
    public void method473(int arg0, int arg1, int arg2, int arg3, class29 arg4, class45 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field405[0][var7][var8] - 1;
                if (var9 != -1) {
                    class274 var10 = class274.method2932(var9);
                    arg5.method596(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ak.ai(IIIIIILak;Lap;I)V")
    public void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class36 arg6, class45 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method379(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class274 var12 = class274.method2932(var11);
                    arg7.method596(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ak.aj(IILaj;Lav;I)I")
    public int method360(int arg0, int arg1, class29 arg2, class34 arg3) {
        return arg2.field405[0][arg0][arg1] == 0 ? this.field479 : arg3.method332(arg0, arg1);
    }

    @ObfuscatedName("ak.ac(IILaj;[Llh;I)V")
    public void method361(int arg0, int arg1, class29 arg2, class331[] arg3) {
        for (int var5 = 0; var5 < arg2.field404; var5++) {
            class32[] var6 = arg2.field409[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field434;
                    boolean var11 = var10 >= class248.field2978.field2987 && var10 <= class248.field2998.field2987;
                    if (var11 || class248.method93(var9.field434)) {
                        class283 var12 = class283.method1732(var9.field436);
                        if (var12.field3621 != -1) {
                            if (var12.field3621 == 46 || var12.field3621 == 52) {
                                arg3[var12.field3621].method5436(this.field476 * arg0, this.field476 * (63 - arg1), this.field476 * 2 + 1, this.field476 * 2 + 1);
                            } else {
                                arg3[var12.field3621].method5436(this.field476 * arg0, this.field476 * (63 - arg1), this.field476 * 2, this.field476 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ag(IILaj;I)V")
    public void method348(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field404; var4++) {
            class32[] var5 = arg2.field409[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class248.method1054(var8.field434)) {
                        class283 var9 = class283.method1732(var8.field436);
                        int var10 = var9.field3627 == 0 ? -3355444 : -3407872;
                        if (class248.field2988.field2987 == var8.field434) {
                            this.method425(arg0, arg1, var8.field435, var10);
                        }
                        if (class248.field2979.field2987 == var8.field434) {
                            this.method425(arg0, arg1, var8.field435, -3355444);
                            this.method425(arg0, arg1, var8.field435 + 1, var10);
                        }
                        if (class248.field2977.field2987 == var8.field434) {
                            if (var8.field435 == 0) {
                                class328.method5370(this.field476 * arg0, this.field476 * (63 - arg1), 1, var10);
                            }
                            if (var8.field435 == 1) {
                                class328.method5370(this.field476 * arg0 + this.field476 - 1, this.field476 * (63 - arg1), 1, var10);
                            }
                            if (var8.field435 == 2) {
                                class328.method5370(this.field476 * arg0 + this.field476 - 1, this.field476 * (63 - arg1) + this.field476 - 1, 1, var10);
                            }
                            if (var8.field435 == 3) {
                                class328.method5370(this.field476 * arg0, this.field476 * (63 - arg1) + this.field476 - 1, 1, var10);
                            }
                        }
                        if (class248.field2981.field2987 == var8.field434) {
                            int var11 = var8.field435 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field476; var12++) {
                                    class328.method5370(this.field476 * arg0 + var12, this.field476 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field476; var13++) {
                                    class328.method5370(this.field476 * arg0 + var13, this.field476 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ay(IILjava/util/HashSet;IB)V")
    public void method363(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field475.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class239 var9 = (class239) var8.getKey();
            int var10 = (int) ((float) var9.field2791 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2790 * var5 - var6);
            class41 var12 = (class41) var8.getValue();
            if (var12 != null) {
                var12.field528 = var10;
                var12.field524 = var11;
                class270 var13 = Statics.field2517[var12.field530];
                if (!arg2.contains(var13.method4475())) {
                    this.method346(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ak.as(Ljava/util/HashSet;IIB)V")
    public void method364(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field480.iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            class270 var6 = Statics.field2517[var5.field530];
            if (var6 != null && arg0.contains(var6.method4475())) {
                this.method365(var6, var5.field528, var5.field524, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ak.av(Ljx;IIIIB)V")
    public void method365(class270 arg0, int arg1, int arg2, int arg3, int arg4) {
        class332 var6 = arg0.method4468(false);
        if (var6 == null) {
            return;
        }
        var6.method5524(arg1 - var6.field3991 / 2, arg2 - var6.field3988 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class328.method5360(arg1, arg2, 15, 16776960, 128);
            class328.method5360(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ak.ao(Lal;IIFI)V")
    public void method346(class41 arg0, int arg1, int arg2, float arg3) {
        class270 var5 = Statics.field2517[arg0.field530];
        this.method374(var5, arg1, arg2);
        this.method462(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ak.ak(Ljx;III)V")
    public void method374(class270 arg0, int arg1, int arg2) {
        class332 var4 = arg0.method4468(false);
        if (var4 != null) {
            int var5 = this.method372(var4, arg0.field3461);
            int var6 = this.method373(var4, arg0.field3468);
            var4.method5524(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ak.ad(Lal;Ljx;IIFB)V")
    public void method462(class41 arg0, class270 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field527 != null && arg0.field527.field464.method173(arg4)) {
            class312 var6 = (class312) this.field483.get(arg0.field527.field464);
            var6.method5138(arg0.field527.field468, arg2 - arg0.field527.field461 / 2, arg3, arg0.field527.field461, arg0.field527.field463, 0xFF000000 | arg1.field3457, 0, 1, 0, var6.field3910 / 2);
        }
    }

    @ObfuscatedName("ak.az(IILjava/util/HashSet;IB)V")
    public void method369(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field480.iterator();
        while (var6.hasNext()) {
            class41 var7 = (class41) var6.next();
            int var8 = var7.field523.field2791 % 64;
            int var9 = var7.field523.field2790 % 64;
            var7.field528 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field524 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field530)) {
                this.method346(var7, var7.field528, var7.field524, var5);
            }
        }
    }

    @ObfuscatedName("ak.aa(B)V")
    public void method370() {
        if (this.field477 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method366(var1, var2, this.field477);
                }
            }
            return;
        }
        Iterator var3 = this.field478.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            for (int var5 = var4.method629() * 8; var5 < var4.method629() * 8 + 8; var5++) {
                for (int var6 = var4.method614() * 8; var6 < var4.method614() * 8 + 8; var6++) {
                    this.method366(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ak.ab(IILaj;I)V")
    public void method366(int arg0, int arg1, class29 arg2) {
        field484.method4113(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field404; var4++) {
            class32[] var5 = arg2.field409[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class270 var9 = this.method477(var8.field436);
                    if (var9 != null) {
                        class41 var10 = (class41) this.field475.get(field484);
                        if (var10 != null) {
                            if (var9.field3453 != var10.field530) {
                                class41 var11 = new class41(var9.field3453, var10.field529, var10.field523, this.method376(var9));
                                this.field475.put(new class239(field484), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field529.field2793 - var10.field523.field2793;
                            var10.field523.field2793 = var4;
                            var10.field529.field2793 = var4 + var12;
                            return;
                        }
                        class239 var13 = new class239(var4, this.field482 * 64 + arg0, this.field489 * 64 + arg1);
                        class239 var14 = null;
                        if (this.field477 == null) {
                            Iterator var15 = this.field478.iterator();
                            while (var15.hasNext()) {
                                class47 var16 = (class47) var15.next();
                                if (var16.method634(arg0, arg1)) {
                                    var14 = new class239(var16.field403 + var4, var16.field406 * 64 + arg0 + var16.method611() * 8, var16.field400 * 64 + arg1 + var16.method612() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class239(this.field477.field403 + var4, this.field477.field406 * 64 + arg0, this.field477.field400 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class41 var17 = new class41(var9.field3453, var14, var13, this.method376(var9));
                            this.field475.put(new class239(field484), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field475.remove(field484);
    }

    @ObfuscatedName("ak.al(Llv;Ljt;I)I")
    public int method372(class332 arg0, class285 arg1) {
        switch(arg1.field3704) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3991 / 2;
            default:
                return -arg0.field3991;
        }
    }

    @ObfuscatedName("ak.af(Llv;Lja;I)I")
    public int method373(class332 arg0, class267 arg1) {
        switch(arg1.field3436) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3988 / 2;
            default:
                return -arg0.field3988;
        }
    }

    @ObfuscatedName("ak.ah(II)Ljx;")
    public class270 method477(int arg0) {
        class283 var2 = class283.method1732(arg0);
        if (var2.field3633 != null) {
            var2 = var2.method4699();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3620 == -1 ? null : Statics.field2517[var2.field3620];
    }

    @ObfuscatedName("ak.au(IB)Lao;")
    public class35 method375(int arg0) {
        class270 var2 = Statics.field2517[arg0];
        return this.method376(var2);
    }

    @ObfuscatedName("ak.ap(Ljx;I)Lao;")
    public class35 method376(class270 arg0) {
        if (arg0.field3456 == null || this.field483 == null || this.field483.get(class25.field366) == null) {
            return null;
        }
        int var2 = arg0.field3458;
        class25[] var3 = new class25[] { class25.field360, class25.field366, class25.field361 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field364 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class312 var9 = (class312) this.field483.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5128(arg0.field3456, 1000000);
        String[] var11 = new String[var10];
        var9.method5130(arg0.field3456, (int[]) null, var11);
        int var12 = var11.length * var9.field3910 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method5129(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class35(arg0.field3456, var13, var12, var7);
    }

    @ObfuscatedName("ak.at(IIIIIB)Ljava/util/List;")
    public List method414(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field475.values().iterator();
            while (var7.hasNext()) {
                class41 var8 = (class41) var7.next();
                if (var8.method528(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field480.iterator();
            while (var9.hasNext()) {
                class41 var10 = (class41) var9.next();
                if (var10.method528(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ak.am(I)Ljava/util/List;")
    public List method428() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field480);
        var1.addAll(this.field475.values());
        return var1;
    }

    @ObfuscatedName("ak.an(IIIII)V")
    public void method425(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class328.method5372(this.field476 * arg0, this.field476 * (63 - arg1), this.field476, arg3);
        }
        if (var5 == 1) {
            class328.method5370(this.field476 * arg0, this.field476 * (63 - arg1), this.field476, arg3);
        }
        if (var5 == 2) {
            class328.method5372(this.field476 * arg0 + this.field476 - 1, this.field476 * (63 - arg1), this.field476, arg3);
        }
        if (var5 == 3) {
            class328.method5370(this.field476 * arg0, this.field476 * (63 - arg1) + this.field476 - 1, this.field476, arg3);
        }
    }

    @ObfuscatedName("ak.ae(III)I")
    public int method379(int arg0, int arg1) {
        if (this.field477 != null) {
            return this.field477.method211(arg0, arg1);
        }
        if (!this.field478.isEmpty()) {
            Iterator var3 = this.field478.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                if (var4.method634(arg0, arg1)) {
                    return var4.method211(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
