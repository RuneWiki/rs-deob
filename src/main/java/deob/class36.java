package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("az")
public class class36 {

    @ObfuscatedName("az.k")
    public static class214 field486 = new class214(37748736, 256);

    @ObfuscatedName("az.s")
    public static class214 field485 = new class214(256, 256);

    @ObfuscatedName("az.p")
    public int field495;

    @ObfuscatedName("az.x")
    public int field489;

    @ObfuscatedName("az.m")
    public class23 field499;

    @ObfuscatedName("az.h")
    public LinkedList field491;

    @ObfuscatedName("az.t")
    public int field492;

    @ObfuscatedName("az.i")
    public int field487;

    @ObfuscatedName("az.u")
    public List field494;

    @ObfuscatedName("az.q")
    public HashMap field490;

    @ObfuscatedName("az.v")
    public final HashMap field493;

    @ObfuscatedName("az.f")
    public static final class239 field497 = new class239();

    @ObfuscatedName("bu.d(IIII)Lly;")
    public static class332 method723(int arg0, int arg1, int arg2) {
        class214 var3 = field486;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class332) var3.method3710(var4);
    }

    @ObfuscatedName("bb.z(III)Laf;")
    public static class34 method997(int arg0, int arg1) {
        class214 var2 = field485;
        long var3 = (long) (0x0 | arg0 << 8 | arg1);
        return (class34) var2.method3710(var3);
    }

    @ObfuscatedName("is.n(I)V")
    public static void method4232() {
        field486.method3709(5);
        field485.method3709(5);
    }

    public class36(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field495 = arg0;
        this.field489 = arg1;
        this.field491 = new LinkedList();
        this.field494 = new LinkedList();
        this.field490 = new HashMap();
        this.field492 = arg2 | 0xFF000000;
        this.field493 = arg3;
    }

    @ObfuscatedName("az.r(IIIB)V")
    public void method337(int arg0, int arg1, int arg2) {
        class332 var4 = method723(this.field495, this.field489, this.field487);
        if (var4 == null) {
            return;
        }
        if (this.field487 * 64 == arg2) {
            var4.method5538(arg0, arg1);
        } else {
            var4.method5477(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("az.e(Lg;Ljava/util/List;I)V")
    public void method338(class23 arg0, List arg1) {
        this.field490.clear();
        this.field499 = arg0;
        this.method340(0, 0, 64, 64, this.field499);
        this.method419(arg1);
    }

    @ObfuscatedName("az.y(Ljava/util/HashSet;Ljava/util/List;S)V")
    public void method339(HashSet arg0, List arg1) {
        this.field490.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            if (var4.method219() == this.field495 && var4.method220() == this.field489) {
                this.field491.add(var4);
                this.method340(var4.method570() * 8, var4.method567() * 8, 8, 8, var4);
            }
        }
        this.method419(arg1);
    }

    @ObfuscatedName("az.k(IIIILac;I)V")
    public void method340(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class239 var8 = new class239(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field411; var9++) {
                    class32[] var10 = arg4.field418[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class270 var14 = this.method430(var13.field451);
                            if (var14 != null) {
                                class239 var15 = new class239(var9, this.field495 * 64 + var6, this.field489 * 64 + var7);
                                Object var16 = null;
                                class239 var17;
                                if (this.field499 == null) {
                                    class47 var18 = (class47) arg4;
                                    var17 = new class239(var18.field415 + var9, var18.field412 * 64 + var6 + var18.method564() * 8, var18.field421 * 64 + var7 + var18.method565() * 8);
                                } else {
                                    var17 = new class239(this.field499.field415 + var9, this.field499.field412 * 64 + var6, this.field499.field421 * 64 + var7);
                                }
                                class41 var19 = new class41(var14.field3456, var17, var15, this.method385(var14));
                                this.field490.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.s(Ljava/util/List;I)V")
    public void method419(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field375.field2791 >> 6 == this.field495 && var3.field375.field2789 >> 6 == this.field489) {
                class41 var4 = new class41(var3.field379, var3.field375, var3.field375, this.method396(var3.field379));
                this.field494.add(var4);
            }
        }
    }

    @ObfuscatedName("az.x(ILam;[Laz;[Llv;I)V")
    public void method429(int arg0, class48 arg1, class36[] arg2, class331[] arg3) {
        this.field487 = arg0;
        if (this.field499 == null && this.field491.isEmpty() || method723(this.field495, this.field489, arg0) != null) {
            return;
        }
        class34 var5 = this.method412(this.field495, this.field489, arg2);
        class332 var6 = new class332(this.field487 * 64, this.field487 * 64);
        var6.method5447();
        if (this.field499 == null) {
            this.method346(arg1, arg3, var5);
        } else {
            this.method427(arg1, arg2, arg3, var5);
        }
        int var7 = this.field495;
        int var8 = this.field489;
        int var9 = this.field487;
        class214 var10 = field486;
        long var12 = (long) (var9 << 16 | var7 << 8 | var8);
        var10.method3713(var6, var12, var6.field3983.length * 4);
    }

    @ObfuscatedName("az.h(IIILjava/util/HashSet;I)V")
    public void method343(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method358(arg0, arg1, arg3, arg2);
        this.method364(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("az.t(Ljava/util/HashSet;IIB)V")
    public void method344(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field490.values().iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            if (arg0.contains(var5.field536)) {
                class270 var6 = Statics.field3450[var5.field536];
                this.method360(var6, var5.field539, var5.field538, arg1, arg2);
            }
        }
        this.method359(arg0, arg1, arg2);
    }

    @ObfuscatedName("az.i(Lam;[Laz;[Llv;Laf;I)V")
    public void method427(class48 arg0, class36[] arg1, class331[] arg2, class34 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method368(var5, var6, this.field499, arg0, arg3);
                this.method349(var5, var6, this.field499, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method347(var7, var8, this.field499, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("az.u(Lam;[Llv;Laf;I)V")
    public void method346(class48 arg0, class331[] arg1, class34 arg2) {
        Iterator var4 = this.field491.iterator();
        while (var4.hasNext()) {
            class47 var5 = (class47) var4.next();
            for (int var6 = var5.method570() * 8; var6 < var5.method570() * 8 + 8; var6++) {
                for (int var7 = var5.method567() * 8; var7 < var5.method567() * 8 + 8; var7++) {
                    this.method368(var6, var7, var5, arg0, arg2);
                    this.method349(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field491.iterator();
        while (var8.hasNext()) {
            class47 var9 = (class47) var8.next();
            for (int var10 = var9.method570() * 8; var10 < var9.method570() * 8 + 8; var10++) {
                for (int var11 = var9.method567() * 8; var11 < var9.method567() * 8 + 8; var11++) {
                    this.method347(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("az.q(IILac;Lam;[Llv;B)V")
    public void method347(int arg0, int arg1, class29 arg2, class48 arg3, class331[] arg4) {
        this.method357(arg0, arg1, arg2);
        this.method356(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("az.v(IILac;Lam;Laf;B)V")
    public void method368(int arg0, int arg1, class29 arg2, class48 arg3, class34 arg4) {
        int var6 = arg2.field424[0][arg0][arg1] - 1;
        int var7 = arg2.field417[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class328.method5381(this.field487 * arg0, this.field487 * (63 - arg1), this.field487, this.field487, this.field492);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class39.method2908(var7, this.field492);
        }
        if (var7 > -1 && arg2.field419[0][arg0][arg1] == 0) {
            class328.method5381(this.field487 * arg0, this.field487 * (63 - arg1), this.field487, this.field487, var8);
            return;
        }
        int var9 = this.method370(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class328.method5381(this.field487 * arg0, this.field487 * (63 - arg1), this.field487, this.field487, var9);
        } else {
            arg3.method587(this.field487 * arg0, this.field487 * (63 - arg1), var9, var8, this.field487, this.field487, arg2.field419[0][arg0][arg1], arg2.field420[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("az.f(IILac;Lam;I)V")
    public void method349(int arg0, int arg1, class29 arg2, class48 arg3) {
        for (int var5 = 1; var5 < arg2.field411; var5++) {
            int var6 = arg2.field417[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class39.method2908(var6, this.field492);
                if (arg2.field419[var5][arg0][arg1] == 0) {
                    class328.method5381(this.field487 * arg0, this.field487 * (63 - arg1), this.field487, this.field487, var7);
                } else {
                    arg3.method587(this.field487 * arg0, this.field487 * (63 - arg1), 0, var7, this.field487, this.field487, arg2.field419[var5][arg0][arg1], arg2.field420[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("az.b(II[Laz;B)Laf;")
    public class34 method412(int arg0, int arg1, class36[] arg2) {
        class34 var4 = method997(arg0, arg1);
        if (var4 == null) {
            var4 = this.method446(arg2);
            class214 var5 = field485;
            long var7 = (long) (0x0 | arg0 << 8 | arg1);
            var5.method3712(var4, var7);
        }
        return var4;
    }

    @ObfuscatedName("az.c([Laz;I)Laf;")
    public class34 method446(class36[] arg0) {
        class45 var2 = new class45(64, 64);
        if (this.field499 == null) {
            Iterator var3 = this.field491.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                this.method353(var4.method570() * 8, var4.method567() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method353(0, 0, 64, 64, this.field499, var2);
        }
        this.method336(arg0, var2);
        class34 var5 = new class34();
        var5.method323(var2);
        return var5;
    }

    @ObfuscatedName("az.w([Laz;Lax;I)V")
    public void method336(class36[] arg0, class45 arg1) {
        class255[] var3 = class255.method2948();
        class255[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class255 var6 = var4[var5];
            if (arg0[var6.method12()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3323) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 2:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 4:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var8 = 59;
                        var10 = 5;
                }
                this.method354(var11, var12, var7, var8, var9, var10, arg0[var6.method12()], arg1);
            }
        }
    }

    @ObfuscatedName("az.o(IIIILac;Lax;I)V")
    public void method353(int arg0, int arg1, int arg2, int arg3, class29 arg4, class45 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field424[0][var7][var8] - 1;
                if (var9 != -1) {
                    class274 var10 = class274.method4455(var9);
                    arg5.method546(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("az.a(IIIIIILaz;Lax;I)V")
    public void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class36 arg6, class45 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method375(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class274 var12 = class274.method4455(var11);
                    arg7.method546(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("az.ak(IILac;Laf;I)I")
    public int method370(int arg0, int arg1, class29 arg2, class34 arg3) {
        return arg2.field424[0][arg0][arg1] == 0 ? this.field492 : arg3.method326(arg0, arg1);
    }

    @ObfuscatedName("az.ap(IILac;[Llv;I)V")
    public void method356(int arg0, int arg1, class29 arg2, class331[] arg3) {
        for (int var5 = 0; var5 < arg2.field411; var5++) {
            class32[] var6 = arg2.field418[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field447;
                    boolean var11 = var10 >= class248.field3005.field3006 && var10 <= class248.field3004.field3006;
                    if (var11 || Statics.method152(var9.field447)) {
                        class283 var12 = class283.method3065(var9.field451);
                        if (var12.field3609 != -1) {
                            if (var12.field3609 == 46 || var12.field3609 == 52) {
                                arg3[var12.field3609].method5429(this.field487 * arg0, this.field487 * (63 - arg1), this.field487 * 2 + 1, this.field487 * 2 + 1);
                            } else {
                                arg3[var12.field3609].method5429(this.field487 * arg0, this.field487 * (63 - arg1), this.field487 * 2, this.field487 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.ac(IILac;I)V")
    public void method357(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field411; var4++) {
            class32[] var5 = arg2.field418[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field447;
                    boolean var10 = var9 >= class248.field2987.field3006 && var9 <= class248.field2983.field3006 || class248.field3007.field3006 == var9;
                    if (var10) {
                        class283 var11 = class283.method3065(var8.field451);
                        int var12 = var11.field3608 == 0 ? -3355444 : -3407872;
                        if (class248.field2987.field3006 == var8.field447) {
                            this.method374(arg0, arg1, var8.field453, var12);
                        }
                        if (class248.field2986.field3006 == var8.field447) {
                            this.method374(arg0, arg1, var8.field453, -3355444);
                            this.method374(arg0, arg1, var8.field453 + 1, var12);
                        }
                        if (class248.field2983.field3006 == var8.field447) {
                            if (var8.field453 == 0) {
                                class328.method5357(this.field487 * arg0, this.field487 * (63 - arg1), 1, var12);
                            }
                            if (var8.field453 == 1) {
                                class328.method5357(this.field487 * arg0 + this.field487 - 1, this.field487 * (63 - arg1), 1, var12);
                            }
                            if (var8.field453 == 2) {
                                class328.method5357(this.field487 * arg0 + this.field487 - 1, this.field487 * (63 - arg1) + this.field487 - 1, 1, var12);
                            }
                            if (var8.field453 == 3) {
                                class328.method5357(this.field487 * arg0, this.field487 * (63 - arg1) + this.field487 - 1, 1, var12);
                            }
                        }
                        if (class248.field3007.field3006 == var8.field447) {
                            int var13 = var8.field453 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field487; var14++) {
                                    class328.method5357(this.field487 * arg0 + var14, this.field487 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field487; var15++) {
                                    class328.method5357(this.field487 * arg0 + var15, this.field487 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.aw(IILjava/util/HashSet;II)V")
    public void method358(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field490.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class239 var9 = (class239) var8.getKey();
            int var10 = (int) ((float) var9.field2791 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2789 * var5 - var6);
            class41 var12 = (class41) var8.getValue();
            if (var12 != null) {
                var12.field539 = var10;
                var12.field538 = var11;
                class270 var13 = Statics.field3450[var12.field536];
                if (!arg2.contains(var13.method4475())) {
                    this.method361(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("az.as(Ljava/util/HashSet;III)V")
    public void method359(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field494.iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            class270 var6 = Statics.field3450[var5.field536];
            if (var6 != null && arg0.contains(var6.method4475())) {
                this.method360(var6, var5.field539, var5.field538, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("az.au(Ljw;IIIII)V")
    public void method360(class270 arg0, int arg1, int arg2, int arg3, int arg4) {
        class332 var6 = arg0.method4492(false);
        if (var6 == null) {
            return;
        }
        var6.method5459(arg1 - var6.field3981 / 2, arg2 - var6.field3988 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class328.method5346(arg1, arg2, 15, 16776960, 128);
            class328.method5346(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("az.al(Lao;IIFB)V")
    public void method361(class41 arg0, int arg1, int arg2, float arg3) {
        class270 var5 = Statics.field3450[arg0.field536];
        this.method355(var5, arg1, arg2);
        this.method363(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("az.af(Ljw;III)V")
    public void method355(class270 arg0, int arg1, int arg2) {
        class332 var4 = arg0.method4492(false);
        if (var4 != null) {
            int var5 = this.method367(var4, arg0.field3465);
            int var6 = this.method437(var4, arg0.field3464);
            var4.method5459(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("az.ai(Lao;Ljw;IIFI)V")
    public void method363(class41 arg0, class270 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field537 != null && arg0.field537.field472.method167(arg4)) {
            class312 var6 = (class312) this.field493.get(arg0.field537.field472);
            var6.method5174(arg0.field537.field475, arg2 - arg0.field537.field473 / 2, arg3, arg0.field537.field473, arg0.field537.field474, 0xFF000000 | arg1.field3449, 0, 1, 0, var6.field3885 / 2);
        }
    }

    @ObfuscatedName("az.az(IILjava/util/HashSet;IB)V")
    public void method364(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field494.iterator();
        while (var6.hasNext()) {
            class41 var7 = (class41) var6.next();
            int var8 = var7.field532.field2791 % 64;
            int var9 = var7.field532.field2789 % 64;
            var7.field539 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field538 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field536)) {
                this.method361(var7, var7.field539, var7.field538, var5);
            }
        }
    }

    @ObfuscatedName("az.aq(B)V")
    public void method365() {
        if (this.field499 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method366(var1, var2, this.field499);
                }
            }
            return;
        }
        Iterator var3 = this.field491.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            for (int var5 = var4.method570() * 8; var5 < var4.method570() * 8 + 8; var5++) {
                for (int var6 = var4.method567() * 8; var6 < var4.method567() * 8 + 8; var6++) {
                    this.method366(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("az.ae(IILac;I)V")
    public void method366(int arg0, int arg1, class29 arg2) {
        field497.method4101(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field411; var4++) {
            class32[] var5 = arg2.field418[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class270 var9 = this.method430(var8.field451);
                    if (var9 != null) {
                        class41 var10 = (class41) this.field490.get(field497);
                        if (var10 != null) {
                            if (var9.field3456 != var10.field536) {
                                class41 var11 = new class41(var9.field3456, var10.field533, var10.field532, this.method385(var9));
                                this.field490.put(new class239(field497), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field533.field2790 - var10.field532.field2790;
                            var10.field532.field2790 = var4;
                            var10.field533.field2790 = var4 + var12;
                            return;
                        }
                        class239 var13 = new class239(var4, this.field495 * 64 + arg0, this.field489 * 64 + arg1);
                        class239 var14 = null;
                        if (this.field499 == null) {
                            Iterator var15 = this.field491.iterator();
                            while (var15.hasNext()) {
                                class47 var16 = (class47) var15.next();
                                if (var16.method562(arg0, arg1)) {
                                    var14 = new class239(var16.field415 + var4, var16.field412 * 64 + arg0 + var16.method564() * 8, var16.field421 * 64 + arg1 + var16.method565() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class239(this.field499.field415 + var4, this.field499.field412 * 64 + arg0, this.field499.field421 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class41 var17 = new class41(var9.field3456, var14, var13, this.method385(var9));
                            this.field490.put(new class239(field497), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field490.remove(field497);
    }

    @ObfuscatedName("az.ad(Lly;Ljz;B)I")
    public int method367(class332 arg0, class285 arg1) {
        switch(arg1.field3699) {
            case 1:
                return -arg0.field3981 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3981;
        }
    }

    @ObfuscatedName("az.ar(Lly;Ljh;B)I")
    public int method437(class332 arg0, class267 arg1) {
        switch(arg1.field3437) {
            case 1:
                return -arg0.field3988 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3988;
        }
    }

    @ObfuscatedName("az.ao(II)Ljw;")
    public class270 method430(int arg0) {
        class283 var2 = class283.method3065(arg0);
        if (var2.field3630 != null) {
            var2 = var2.method4723();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3617 == -1 ? null : Statics.field3450[var2.field3617];
    }

    @ObfuscatedName("az.at(II)Lai;")
    public class35 method396(int arg0) {
        class270 var2 = Statics.field3450[arg0];
        return this.method385(var2);
    }

    @ObfuscatedName("az.ag(Ljw;I)Lai;")
    public class35 method385(class270 arg0) {
        if (arg0.field3459 == null || this.field493 == null || this.field493.get(class25.field363) == null) {
            return null;
        }
        class25 var2 = class25.method168(arg0.field3457);
        if (var2 == null) {
            return null;
        }
        class312 var3 = (class312) this.field493.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5160(arg0.field3459, 1000000);
        String[] var5 = new String[var4];
        var3.method5184(arg0.field3459, (int[]) null, var5);
        int var6 = var5.length * var3.field3885 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5224(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class35(arg0.field3459, var7, var6, var2);
    }

    @ObfuscatedName("az.an(IIIIII)Ljava/util/List;")
    public List method379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field490.values().iterator();
            while (var7.hasNext()) {
                class41 var8 = (class41) var7.next();
                if (var8.method491(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field494.iterator();
            while (var9.hasNext()) {
                class41 var10 = (class41) var9.next();
                if (var10.method491(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("az.ax(B)Ljava/util/List;")
    public List method373() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field494);
        var1.addAll(this.field490.values());
        return var1;
    }

    @ObfuscatedName("az.ah(IIIII)V")
    public void method374(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class328.method5359(this.field487 * arg0, this.field487 * (63 - arg1), this.field487, arg3);
        }
        if (var5 == 1) {
            class328.method5357(this.field487 * arg0, this.field487 * (63 - arg1), this.field487, arg3);
        }
        if (var5 == 2) {
            class328.method5359(this.field487 * arg0 + this.field487 - 1, this.field487 * (63 - arg1), this.field487, arg3);
        }
        if (var5 == 3) {
            class328.method5357(this.field487 * arg0, this.field487 * (63 - arg1) + this.field487 - 1, this.field487, arg3);
        }
    }

    @ObfuscatedName("az.ab(III)I")
    public int method375(int arg0, int arg1) {
        if (this.field499 != null) {
            return this.field499.method218(arg0, arg1);
        }
        if (!this.field491.isEmpty()) {
            Iterator var3 = this.field491.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                if (var4.method562(arg0, arg1)) {
                    return var4.method218(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
