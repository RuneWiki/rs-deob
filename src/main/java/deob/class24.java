package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("h")
public class class24 {

    @ObfuscatedName("h.k")
    public static class202 field189 = new class202(37748736, 256);

    @ObfuscatedName("h.i")
    public static class202 field190 = new class202(256, 256);

    @ObfuscatedName("h.x")
    public int field192;

    @ObfuscatedName("h.e")
    public int field193;

    @ObfuscatedName("h.p")
    public class11 field198;

    @ObfuscatedName("h.b")
    public LinkedList field196;

    @ObfuscatedName("h.n")
    public int field195;

    @ObfuscatedName("h.f")
    public int field188;

    @ObfuscatedName("h.g")
    public List field197;

    @ObfuscatedName("h.m")
    public HashMap field200;

    @ObfuscatedName("h.r")
    public final HashMap field199;

    @ObfuscatedName("h.t")
    public static final class227 field194 = new class227();

    @ObfuscatedName("ae.z(IIII)J")
    public static long method637(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("fn.w(Lll;IIII)V")
    public static void method3161(class319 arg0, int arg1, int arg2, int arg3) {
        field189.method3690(arg0, method637(arg1, arg2, arg3), arg0.field3792.length * 4);
    }

    @ObfuscatedName("n.s(Lj;III)V")
    public static void method105(class22 arg0, int arg1, int arg2) {
        field190.method3699(arg0, method637(arg1, arg2, 0));
    }

    @ObfuscatedName("z.l(I)V")
    public static void method8() {
        field189.method3691(5);
        field190.method3691(5);
    }

    public class24(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field192 = arg0;
        this.field193 = arg1;
        this.field196 = new LinkedList();
        this.field197 = new LinkedList();
        this.field200 = new HashMap();
        this.field195 = arg2 | 0xFF000000;
        this.field199 = arg3;
    }

    @ObfuscatedName("h.u(IIIS)V")
    public void method295(int arg0, int arg1, int arg2) {
        int var4 = this.field192;
        int var5 = this.field193;
        int var6 = this.field188;
        class319 var7 = (class319) field189.method3689(method637(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field188 * 64 == arg2) {
            var7.method5409(arg0, arg1);
        } else {
            var7.method5432(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("h.q(Lp;Ljava/util/List;I)V")
    public void method381(class11 arg0, List arg1) {
        this.field200.clear();
        this.field198 = arg0;
        this.method275(0, 0, 64, 64, this.field198);
        this.method270(arg1);
    }

    @ObfuscatedName("h.i(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method268(HashSet arg0, List arg1) {
        this.field200.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            if (var4.method150() == this.field192 && var4.method169() == this.field193) {
                this.field196.add(var4);
                this.method275(var4.method506() * 8, var4.method504() * 8, 8, 8, var4);
            }
        }
        this.method270(arg1);
    }

    @ObfuscatedName("h.x(IIIILr;I)V")
    public void method275(int arg0, int arg1, int arg2, int arg3, class17 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class227 var8 = new class227(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field122; var9++) {
                    class20[] var10 = arg4.field127[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class20[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class20 var13 = var11[var12];
                            class256 var14 = this.method329(var13.field159);
                            if (var14 != null) {
                                class227 var15 = new class227(var9, this.field192 * 64 + var6, this.field193 * 64 + var7);
                                Object var16 = null;
                                class227 var17;
                                if (this.field198 == null) {
                                    class35 var18 = (class35) arg4;
                                    var17 = new class227(var18.field121 + var9, var18.field128 * 64 + var6 + var18.method525() * 8, var18.field118 * 64 + var7 + var18.method505() * 8);
                                } else {
                                    var17 = new class227(this.field198.field121 + var9, this.field198.field128 * 64 + var6, this.field198.field118 * 64 + var7);
                                }
                                class29 var19 = new class29(var14.field3239, var17, var15, this.method299(var14));
                                this.field200.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.e(Ljava/util/List;B)V")
    public void method270(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class14 var3 = (class14) var2.next();
            if (var3.field89.field2565 >> 6 == this.field192 && var3.field89.field2566 >> 6 == this.field193) {
                class29 var4 = new class29(var3.field84, var3.field89, var3.field89, this.method287(var3.field84));
                this.field197.add(var4);
            }
        }
    }

    @ObfuscatedName("h.p(ILai;[Lh;[Lly;I)V")
    public void method271(int arg0, class36 arg1, class24[] arg2, class318[] arg3) {
        this.field188 = arg0;
        if (this.field198 == null && this.field196.isEmpty()) {
            return;
        }
        int var5 = this.field192;
        int var6 = this.field193;
        class319 var7 = (class319) field189.method3689(method637(var5, var6, arg0));
        if (var7 != null) {
            return;
        }
        class22 var8 = this.method278(this.field192, this.field193, arg2);
        class319 var9 = new class319(this.field188 * 64, this.field188 * 64);
        var9.method5410();
        if (this.field198 == null) {
            this.method354(arg1, arg3, var8);
        } else {
            this.method274(arg1, arg2, arg3, var8);
        }
        method3161(var9, this.field192, this.field193, this.field188);
    }

    @ObfuscatedName("h.b(IIILjava/util/HashSet;I)V")
    public void method363(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method361(arg0, arg1, arg3, arg2);
        this.method318(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("h.n(Ljava/util/HashSet;III)V")
    public void method292(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field200.values().iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            if (arg0.contains(var5.field241)) {
                class256 var6 = Statics.field3247[var5.field241];
                this.method288(var6, var5.field236, var5.field246, arg1, arg2);
            }
        }
        this.method290(arg0, arg1, arg2);
    }

    @ObfuscatedName("h.f(Lai;[Lh;[Lly;Lj;I)V")
    public void method274(class36 arg0, class24[] arg1, class318[] arg2, class22 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method301(var5, var6, this.field198, arg0, arg3);
                this.method277(var5, var6, this.field198, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method276(var7, var8, this.field198, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("h.g(Lai;[Lly;Lj;B)V")
    public void method354(class36 arg0, class318[] arg1, class22 arg2) {
        Iterator var4 = this.field196.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            for (int var6 = var5.method506() * 8; var6 < var5.method506() * 8 + 8; var6++) {
                for (int var7 = var5.method504() * 8; var7 < var5.method504() * 8 + 8; var7++) {
                    this.method301(var6, var7, var5, arg0, arg2);
                    this.method277(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field196.iterator();
        while (var8.hasNext()) {
            class35 var9 = (class35) var8.next();
            for (int var10 = var9.method506() * 8; var10 < var9.method506() * 8 + 8; var10++) {
                for (int var11 = var9.method504() * 8; var11 < var9.method504() * 8 + 8; var11++) {
                    this.method276(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("h.m(IILr;Lai;[Lly;I)V")
    public void method276(int arg0, int arg1, class17 arg2, class36 arg3, class318[] arg4) {
        this.method285(arg0, arg1, arg2);
        this.method387(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("h.r(IILr;Lai;Lj;I)V")
    public void method301(int arg0, int arg1, class17 arg2, class36 arg3, class22 arg4) {
        int var6 = arg2.field126[0][arg0][arg1] - 1;
        int var7 = arg2.field124[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class315.method5331(this.field188 * arg0, this.field188 * (63 - arg1), this.field188, this.field188, this.field195);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class27.method70(var7, this.field195);
        }
        if (var7 > -1 && arg2.field125[0][arg0][arg1] == 0) {
            class315.method5331(this.field188 * arg0, this.field188 * (63 - arg1), this.field188, this.field188, var8);
            return;
        }
        int var9 = this.method283(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class315.method5331(this.field188 * arg0, this.field188 * (63 - arg1), this.field188, this.field188, var9);
        } else {
            arg3.method547(this.field188 * arg0, this.field188 * (63 - arg1), var9, var8, this.field188, this.field188, arg2.field125[0][arg0][arg1], arg2.field117[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("h.t(IILr;Lai;I)V")
    public void method277(int arg0, int arg1, class17 arg2, class36 arg3) {
        for (int var5 = 1; var5 < arg2.field122; var5++) {
            int var6 = arg2.field124[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class27.method70(var6, this.field195);
                if (arg2.field125[var5][arg0][arg1] == 0) {
                    class315.method5331(this.field188 * arg0, this.field188 * (63 - arg1), this.field188, this.field188, var7);
                } else {
                    arg3.method547(this.field188 * arg0, this.field188 * (63 - arg1), 0, var7, this.field188, this.field188, arg2.field125[var5][arg0][arg1], arg2.field117[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("h.o(II[Lh;I)Lj;")
    public class22 method278(int arg0, int arg1, class24[] arg2) {
        class22 var4 = (class22) field190.method3689(method637(arg0, arg1, 0));
        class22 var5 = var4;
        if (var4 == null) {
            var5 = this.method279(arg2);
            method105(var5, arg0, arg1);
        }
        return var5;
    }

    @ObfuscatedName("h.y([Lh;B)Lj;")
    public class22 method279(class24[] arg0) {
        class33 var2 = new class33(64, 64);
        if (this.field198 == null) {
            Iterator var3 = this.field196.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                this.method281(var4.method506() * 8, var4.method504() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method281(0, 0, 64, 64, this.field198, var2);
        }
        this.method280(arg0, var2);
        class22 var5 = new class22();
        var5.method246(var2);
        return var5;
    }

    @ObfuscatedName("h.a([Lh;Lan;I)V")
    public void method280(class24[] arg0, class33 arg1) {
        class241[] var3 = class241.method86();
        class241[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class241 var6 = var4[var5];
            if (arg0[var6.method142()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3105) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 2:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 3:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 5:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var7 = 59;
                        var9 = 5;
                }
                this.method282(var11, var12, var7, var8, var9, var10, arg0[var6.method142()], arg1);
            }
        }
    }

    @ObfuscatedName("h.c(IIIILr;Lan;I)V")
    public void method281(int arg0, int arg1, int arg2, int arg3, class17 arg4, class33 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field126[0][var7][var8] - 1;
                if (var9 != -1) {
                    class260 var10 = class260.method874(var9);
                    arg5.method482(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("h.v(IIIIIILh;Lan;I)V")
    public void method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class24 arg6, class33 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method303(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class260 var12 = class260.method874(var11);
                    arg7.method482(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("h.af(IILr;Lj;I)I")
    public int method283(int arg0, int arg1, class17 arg2, class22 arg3) {
        return arg2.field126[0][arg0][arg1] == 0 ? this.field195 : arg3.method253(arg0, arg1);
    }

    @ObfuscatedName("h.ah(IILr;[Lly;I)V")
    public void method387(int arg0, int arg1, class17 arg2, class318[] arg3) {
        for (int var5 = 0; var5 < arg2.field122; var5++) {
            class20[] var6 = arg2.field127[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class20[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class20 var9 = var7[var8];
                    if (!class234.method3006(var9.field156)) {
                        int var10 = var9.field156;
                        boolean var11 = class234.field2777.field2778 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class269 var12 = class269.method2323(var9.field159);
                    if (var12.field3416 != -1) {
                        if (var12.field3416 == 46 || var12.field3416 == 52) {
                            arg3[var12.field3416].method5385(this.field188 * arg0, this.field188 * (63 - arg1), this.field188 * 2 + 1, this.field188 * 2 + 1);
                        } else {
                            arg3[var12.field3416].method5385(this.field188 * arg0, this.field188 * (63 - arg1), this.field188 * 2, this.field188 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.ab(IILr;B)V")
    public void method285(int arg0, int arg1, class17 arg2) {
        for (int var4 = 0; var4 < arg2.field122; var4++) {
            class20[] var5 = arg2.field127[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    if (class234.method2860(var8.field156)) {
                        class269 var9 = class269.method2323(var8.field159);
                        int var10 = var9.field3389 == 0 ? -3355444 : -3407872;
                        if (class234.field2774.field2778 == var8.field156) {
                            this.method302(arg0, arg1, var8.field158, var10);
                        }
                        if (class234.field2756.field2778 == var8.field156) {
                            this.method302(arg0, arg1, var8.field158, -3355444);
                            this.method302(arg0, arg1, var8.field158 + 1, var10);
                        }
                        if (class234.field2758.field2778 == var8.field156) {
                            if (var8.field158 == 0) {
                                class315.method5304(this.field188 * arg0, this.field188 * (63 - arg1), 1, var10);
                            }
                            if (var8.field158 == 1) {
                                class315.method5304(this.field188 * arg0 + this.field188 - 1, this.field188 * (63 - arg1), 1, var10);
                            }
                            if (var8.field158 == 2) {
                                class315.method5304(this.field188 * arg0 + this.field188 - 1, this.field188 * (63 - arg1) + this.field188 - 1, 1, var10);
                            }
                            if (var8.field158 == 3) {
                                class315.method5304(this.field188 * arg0, this.field188 * (63 - arg1) + this.field188 - 1, 1, var10);
                            }
                        }
                        if (class234.field2759.field2778 == var8.field156) {
                            int var11 = var8.field158 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field188; var12++) {
                                    class315.method5304(this.field188 * arg0 + var12, this.field188 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field188; var13++) {
                                    class315.method5304(this.field188 * arg0 + var13, this.field188 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.aw(IILjava/util/HashSet;IB)V")
    public void method361(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field200.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class227 var9 = (class227) var8.getKey();
            int var10 = (int) ((float) var9.field2565 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2566 * var5 - var6);
            class29 var12 = (class29) var8.getValue();
            if (var12 != null) {
                var12.field236 = var10;
                var12.field246 = var11;
                class256 var13 = Statics.field3247[var12.field241];
                if (!arg2.contains(var13.method4430())) {
                    this.method289(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("h.ak(Ljava/util/HashSet;III)V")
    public void method290(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field197.iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            class256 var6 = Statics.field3247[var5.field241];
            if (var6 != null && arg0.contains(var6.method4430())) {
                this.method288(var6, var5.field236, var5.field246, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("h.as(Lie;IIIII)V")
    public void method288(class256 arg0, int arg1, int arg2, int arg3, int arg4) {
        class319 var6 = arg0.method4424(false);
        if (var6 == null) {
            return;
        }
        var6.method5411(arg1 - var6.field3788 / 2, arg2 - var6.field3789 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class315.method5352(arg1, arg2, 15, 16776960, 128);
            class315.method5352(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("h.an(Lab;IIFI)V")
    public void method289(class29 arg0, int arg1, int arg2, float arg3) {
        class256 var5 = Statics.field3247[arg0.field241];
        this.method298(var5, arg1, arg2);
        this.method343(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("h.ao(Lie;III)V")
    public void method298(class256 arg0, int arg1, int arg2) {
        class319 var4 = arg0.method4424(false);
        if (var4 != null) {
            int var5 = this.method269(var4, arg0.field3253);
            int var6 = this.method265(var4, arg0.field3254);
            var4.method5411(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("h.at(Lab;Lie;IIFB)V")
    public void method343(class29 arg0, class256 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field247 != null && arg0.field247.field182.method104(arg4)) {
            class299 var6 = (class299) this.field199.get(arg0.field247.field182);
            var6.method5101(arg0.field247.field187, arg2 - arg0.field247.field185 / 2, arg3, arg0.field247.field185, arg0.field247.field183, 0xFF000000 | arg1.field3243, 0, 1, 0, var6.field3696 / 2);
        }
    }

    @ObfuscatedName("h.ai(IILjava/util/HashSet;IB)V")
    public void method318(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field197.iterator();
        while (var6.hasNext()) {
            class29 var7 = (class29) var6.next();
            int var8 = var7.field237.field2565 % 64;
            int var9 = var7.field237.field2566 % 64;
            var7.field236 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field246 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field241)) {
                this.method289(var7, var7.field236, var7.field246, var5);
            }
        }
    }

    @ObfuscatedName("h.ac(B)V")
    public void method321() {
        if (this.field198 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method294(var1, var2, this.field198);
                }
            }
            return;
        }
        Iterator var3 = this.field196.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            for (int var5 = var4.method506() * 8; var5 < var4.method506() * 8 + 8; var5++) {
                for (int var6 = var4.method504() * 8; var6 < var4.method504() * 8 + 8; var6++) {
                    this.method294(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("h.ap(IILr;I)V")
    public void method294(int arg0, int arg1, class17 arg2) {
        field194.method4070(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field122; var4++) {
            class20[] var5 = arg2.field127[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    class256 var9 = this.method329(var8.field159);
                    if (var9 != null) {
                        class29 var10 = (class29) this.field200.get(field194);
                        if (var10 != null) {
                            if (var9.field3239 != var10.field241) {
                                class29 var11 = new class29(var9.field3239, var10.field244, var10.field237, this.method299(var9));
                                this.field200.put(new class227(field194), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field244.field2568 - var10.field237.field2568;
                            var10.field237.field2568 = var4;
                            var10.field244.field2568 = var4 + var12;
                            return;
                        }
                        class227 var13 = new class227(var4, this.field192 * 64 + arg0, this.field193 * 64 + arg1);
                        class227 var14 = null;
                        if (this.field198 == null) {
                            Iterator var15 = this.field196.iterator();
                            while (var15.hasNext()) {
                                class35 var16 = (class35) var15.next();
                                if (var16.method503(arg0, arg1)) {
                                    var14 = new class227(var16.field121 + var4, var16.field128 * 64 + arg0 + var16.method525() * 8, var16.field118 * 64 + arg1 + var16.method505() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class227(this.field198.field121 + var4, this.field198.field128 * 64 + arg0, this.field198.field118 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class29 var17 = new class29(var9.field3239, var14, var13, this.method299(var9));
                            this.field200.put(new class227(field194), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field200.remove(field194);
    }

    @ObfuscatedName("h.aa(Lll;Ljd;I)I")
    public int method269(class319 arg0, class271 arg1) {
        switch(arg1.field3483) {
            case 0:
                return -arg0.field3788 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3788;
        }
    }

    @ObfuscatedName("h.ar(Lll;Lis;I)I")
    public int method265(class319 arg0, class253 arg1) {
        switch(arg1.field3224) {
            case 1:
                return -arg0.field3789 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3789;
        }
    }

    @ObfuscatedName("h.au(II)Lie;")
    public class256 method329(int arg0) {
        class269 var2 = class269.method2323(arg0);
        if (var2.field3411 != null) {
            var2 = var2.method4665();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3398 == -1 ? null : Statics.field3247[var2.field3398];
    }

    @ObfuscatedName("h.av(II)Ld;")
    public class23 method287(int arg0) {
        class256 var2 = Statics.field3247[arg0];
        return this.method299(var2);
    }

    @ObfuscatedName("h.al(Lie;I)Ld;")
    public class23 method299(class256 arg0) {
        if (arg0.field3242 == null || this.field199 == null || this.field199.get(class13.field71) == null) {
            return null;
        }
        class13 var2 = class13.method102(arg0.field3244);
        if (var2 == null) {
            return null;
        }
        class299 var3 = (class299) this.field199.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5095(arg0.field3242, 1000000);
        String[] var5 = new String[var4];
        var3.method5093(arg0.field3242, (int[]) null, var5);
        int var6 = var5.length * var3.field3696 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5092(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class23(arg0.field3242, var7, var6, var2);
    }

    @ObfuscatedName("h.ae(IIIIII)Ljava/util/List;")
    public List method300(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field200.values().iterator();
            while (var7.hasNext()) {
                class29 var8 = (class29) var7.next();
                if (var8.method425(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field197.iterator();
            while (var9.hasNext()) {
                class29 var10 = (class29) var9.next();
                if (var10.method425(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("h.az(B)Ljava/util/List;")
    public List method337() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field197);
        var1.addAll(this.field200.values());
        return var1;
    }

    @ObfuscatedName("h.aq(IIIIB)V")
    public void method302(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class315.method5306(this.field188 * arg0, this.field188 * (63 - arg1), this.field188, arg3);
        }
        if (var5 == 1) {
            class315.method5304(this.field188 * arg0, this.field188 * (63 - arg1), this.field188, arg3);
        }
        if (var5 == 2) {
            class315.method5306(this.field188 * arg0 + this.field188 - 1, this.field188 * (63 - arg1), this.field188, arg3);
        }
        if (var5 == 3) {
            class315.method5304(this.field188 * arg0, this.field188 * (63 - arg1) + this.field188 - 1, this.field188, arg3);
        }
    }

    @ObfuscatedName("h.ad(III)I")
    public int method303(int arg0, int arg1) {
        if (this.field198 != null) {
            return this.field198.method154(arg0, arg1);
        }
        if (!this.field196.isEmpty()) {
            Iterator var3 = this.field196.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                if (var4.method503(arg0, arg1)) {
                    return var4.method154(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
