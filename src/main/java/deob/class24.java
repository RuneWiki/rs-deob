package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("y")
public class class24 {

    @ObfuscatedName("y.h")
    public static class204 field213 = new class204(37748736, 256);

    @ObfuscatedName("y.l")
    public static class204 field219 = new class204(256, 256);

    @ObfuscatedName("y.d")
    public int field222;

    @ObfuscatedName("y.o")
    public int field212;

    @ObfuscatedName("y.s")
    public class11 field217;

    @ObfuscatedName("y.k")
    public LinkedList field220;

    @ObfuscatedName("y.v")
    public int field216;

    @ObfuscatedName("y.p")
    public int field226;

    @ObfuscatedName("y.n")
    public List field223;

    @ObfuscatedName("y.t")
    public HashMap field224;

    @ObfuscatedName("y.r")
    public final HashMap field225;

    @ObfuscatedName("y.x")
    public static final class229 field218 = new class229();

    @ObfuscatedName("ez.c(IIIB)J")
    public static long method2883(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("be.q(IIIB)Llt;")
    public static class324 method1583(int arg0, int arg1, int arg2) {
        return (class324) field213.method3667(method2883(arg0, arg1, arg2));
    }

    @ObfuscatedName("am.m(La;III)V")
    public static void method874(class22 arg0, int arg1, int arg2) {
        field219.method3665(arg0, method2883(arg1, arg2, 0));
    }

    public class24(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field222 = arg0;
        this.field212 = arg1;
        this.field220 = new LinkedList();
        this.field223 = new LinkedList();
        this.field224 = new HashMap();
        this.field216 = arg2 | 0xFF000000;
        this.field225 = arg3;
    }

    @ObfuscatedName("y.j(IIIB)V")
    public void method324(int arg0, int arg1, int arg2) {
        class324 var4 = method1583(this.field222, this.field212, this.field226);
        if (var4 == null) {
            return;
        }
        if (this.field226 * 64 == arg2) {
            var4.method5489(arg0, arg1);
        } else {
            var4.method5512(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("y.g(Ls;Ljava/util/List;I)V")
    public void method302(class11 arg0, List arg1) {
        this.field224.clear();
        this.field217 = arg0;
        this.method422(0, 0, 64, 64, this.field217);
        this.method304(arg1);
    }

    @ObfuscatedName("y.i(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method440(HashSet arg0, List arg1) {
        this.field224.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            if (var4.method171() == this.field222 && var4.method172() == this.field212) {
                this.field220.add(var4);
                this.method422(var4.method572() * 8, var4.method559() * 8, 8, 8, var4);
            }
        }
        this.method304(arg1);
    }

    @ObfuscatedName("y.h(IIIILr;I)V")
    public void method422(int arg0, int arg1, int arg2, int arg3, class17 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class229 var8 = new class229(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field147; var9++) {
                    class20[] var10 = arg4.field146[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class20[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class20 var13 = var11[var12];
                            class258 var14 = this.method374(var13.field180);
                            if (var14 != null) {
                                class229 var15 = new class229(var9, this.field222 * 64 + var6, this.field212 * 64 + var7);
                                Object var16 = null;
                                class229 var17;
                                if (this.field217 == null) {
                                    class35 var18 = (class35) arg4;
                                    var17 = new class229(var18.field150 + var9, var18.field144 * 64 + var6 + var18.method562() * 8, var18.field143 * 64 + var7 + var18.method557() * 8);
                                } else {
                                    var17 = new class229(this.field217.field150 + var9, this.field217.field144 * 64 + var6, this.field217.field143 * 64 + var7);
                                }
                                class29 var19 = new class29(var14.field3273, var17, var15, this.method307(var14));
                                this.field224.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.l(Ljava/util/List;I)V")
    public void method304(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class14 var3 = (class14) var2.next();
            if (var3.field108.field2600 >> 6 == this.field222 && var3.field108.field2602 >> 6 == this.field212) {
                class29 var4 = new class29(var3.field109, var3.field108, var3.field108, this.method333(var3.field109));
                this.field223.add(var4);
            }
        }
    }

    @ObfuscatedName("y.o(ILac;[Ly;[Llp;I)V")
    public void method305(int arg0, class36 arg1, class24[] arg2, class323[] arg3) {
        this.field226 = arg0;
        if (this.field217 == null && this.field220.isEmpty() || method1583(this.field222, this.field212, arg0) != null) {
            return;
        }
        class22 var5 = this.method367(this.field222, this.field212, arg2);
        class324 var6 = new class324(this.field226 * 64, this.field226 * 64);
        var6.method5482();
        if (this.field217 == null) {
            this.method309(arg1, arg3, var5);
        } else {
            this.method447(arg1, arg2, arg3, var5);
        }
        int var7 = this.field222;
        int var8 = this.field212;
        int var9 = this.field226;
        field213.method3666(var6, method2883(var7, var8, var9), var6.field3853.length * 4);
    }

    @ObfuscatedName("y.k(IIILjava/util/HashSet;I)V")
    public void method306(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method321(arg0, arg1, arg3, arg2);
        this.method327(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("y.v(Ljava/util/HashSet;IIB)V")
    public void method424(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field224.values().iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            if (arg0.contains(var5.field263)) {
                class258 var6 = class258.method2830(var5.field263);
                this.method322(var6, var5.field265, var5.field267, arg1, arg2);
            }
        }
        this.method308(arg0, arg1, arg2);
    }

    @ObfuscatedName("y.p(Lac;[Ly;[Llp;La;I)V")
    public void method447(class36 arg0, class24[] arg1, class323[] arg2, class22 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method409(var5, var6, this.field217, arg0, arg3);
                this.method312(var5, var6, this.field217, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method310(var7, var8, this.field217, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("y.n(Lac;[Llp;La;B)V")
    public void method309(class36 arg0, class323[] arg1, class22 arg2) {
        Iterator var4 = this.field220.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            for (int var6 = var5.method572() * 8; var6 < var5.method572() * 8 + 8; var6++) {
                for (int var7 = var5.method559() * 8; var7 < var5.method559() * 8 + 8; var7++) {
                    this.method409(var6, var7, var5, arg0, arg2);
                    this.method312(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field220.iterator();
        while (var8.hasNext()) {
            class35 var9 = (class35) var8.next();
            for (int var10 = var9.method572() * 8; var10 < var9.method572() * 8 + 8; var10++) {
                for (int var11 = var9.method559() * 8; var11 < var9.method559() * 8 + 8; var11++) {
                    this.method310(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("y.t(IILr;Lac;[Llp;B)V")
    public void method310(int arg0, int arg1, class17 arg2, class36 arg3, class323[] arg4) {
        this.method399(arg0, arg1, arg2);
        this.method388(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("y.r(IILr;Lac;La;I)V")
    public void method409(int arg0, int arg1, class17 arg2, class36 arg3, class22 arg4) {
        int var6 = arg2.field142[0][arg0][arg1] - 1;
        int var7 = arg2.field149[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class320.method5379(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, this.field226, this.field216);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class27.method2549(var7, this.field216);
        }
        if (var7 > -1 && arg2.field148[0][arg0][arg1] == 0) {
            class320.method5379(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, this.field226, var8);
            return;
        }
        int var9 = this.method319(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class320.method5379(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, this.field226, var9);
        } else {
            arg3.method576(this.field226 * arg0, this.field226 * (63 - arg1), var9, var8, this.field226, this.field226, arg2.field148[0][arg0][arg1], arg2.field151[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("y.x(IILr;Lac;S)V")
    public void method312(int arg0, int arg1, class17 arg2, class36 arg3) {
        for (int var5 = 1; var5 < arg2.field147; var5++) {
            int var6 = arg2.field149[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class27.method2549(var6, this.field216);
                if (arg2.field148[var5][arg0][arg1] == 0) {
                    class320.method5379(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, this.field226, var7);
                } else {
                    arg3.method576(this.field226 * arg0, this.field226 * (63 - arg1), 0, var7, this.field226, this.field226, arg2.field148[var5][arg0][arg1], arg2.field151[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("y.b(II[Ly;I)La;")
    public class22 method367(int arg0, int arg1, class24[] arg2) {
        class22 var4 = (class22) field219.method3667(method2883(arg0, arg1, 0));
        class22 var5 = var4;
        if (var4 == null) {
            var5 = this.method314(arg2);
            method874(var5, arg0, arg1);
        }
        return var5;
    }

    @ObfuscatedName("y.w([Ly;I)La;")
    public class22 method314(class24[] arg0) {
        class33 var2 = new class33(64, 64);
        if (this.field217 == null) {
            Iterator var3 = this.field220.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                this.method316(var4.method572() * 8, var4.method559() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method316(0, 0, 64, 64, this.field217, var2);
        }
        this.method315(arg0, var2);
        class22 var5 = new class22();
        var5.method292(var2);
        return var5;
    }

    @ObfuscatedName("y.a([Ly;Lah;I)V")
    public void method315(class24[] arg0, class33 arg1) {
        class243[] var3 = class243.method4167();
        class243[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class243 var6 = var4[var5];
            if (arg0[var6.method165()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3134) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 2:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 3:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 5:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var10 = 5;
                }
                this.method396(var11, var12, var7, var8, var9, var10, arg0[var6.method165()], arg1);
            }
        }
    }

    @ObfuscatedName("y.z(IIIILr;Lah;I)V")
    public void method316(int arg0, int arg1, int arg2, int arg3, class17 arg4, class33 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field142[0][var7][var8] - 1;
                if (var9 != -1) {
                    class262 var10 = class262.method296(var9);
                    arg5.method528(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("y.y(IIIIIILy;Lah;B)V")
    public void method396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class24 arg6, class33 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method317(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class262 var12 = class262.method296(var11);
                    arg7.method528(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("y.u(IILr;La;I)I")
    public int method319(int arg0, int arg1, class17 arg2, class22 arg3) {
        return arg2.field142[0][arg0][arg1] == 0 ? this.field216 : arg3.method289(arg0, arg1);
    }

    @ObfuscatedName("y.f(IILr;[Llp;I)V")
    public void method388(int arg0, int arg1, class17 arg2, class323[] arg3) {
        for (int var5 = 0; var5 < arg2.field147; var5++) {
            class20[] var6 = arg2.field146[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class20[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class20 var9 = var7[var8];
                    int var10 = var9.field178;
                    boolean var11 = var10 >= class236.field2798.field2778 && var10 <= class236.field2799.field2778;
                    if (var11 || class236.method530(var9.field178)) {
                        class271 var12 = class271.method2839(var9.field180);
                        if (var12.field3445 != -1) {
                            if (var12.field3445 == 46 || var12.field3445 == 52) {
                                arg3[var12.field3445].method5460(this.field226 * arg0, this.field226 * (63 - arg1), this.field226 * 2 + 1, this.field226 * 2 + 1);
                            } else {
                                arg3[var12.field3445].method5460(this.field226 * arg0, this.field226 * (63 - arg1), this.field226 * 2, this.field226 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.at(IILr;I)V")
    public void method399(int arg0, int arg1, class17 arg2) {
        for (int var4 = 0; var4 < arg2.field147; var4++) {
            class20[] var5 = arg2.field146[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    int var9 = var8.field178;
                    boolean var10 = var9 >= class236.field2786.field2778 && var9 <= class236.field2781.field2778 || class236.field2791.field2778 == var9;
                    if (var10) {
                        class271 var11 = class271.method2839(var8.field180);
                        int var12 = var11.field3435 == 0 ? -3355444 : -3407872;
                        if (class236.field2786.field2778 == var8.field178) {
                            this.method337(arg0, arg1, var8.field177, var12);
                        }
                        if (class236.field2800.field2778 == var8.field178) {
                            this.method337(arg0, arg1, var8.field177, -3355444);
                            this.method337(arg0, arg1, var8.field177 + 1, var12);
                        }
                        if (class236.field2781.field2778 == var8.field178) {
                            if (var8.field177 == 0) {
                                class320.method5385(this.field226 * arg0, this.field226 * (63 - arg1), 1, var12);
                            }
                            if (var8.field177 == 1) {
                                class320.method5385(this.field226 * arg0 + this.field226 - 1, this.field226 * (63 - arg1), 1, var12);
                            }
                            if (var8.field177 == 2) {
                                class320.method5385(this.field226 * arg0 + this.field226 - 1, this.field226 * (63 - arg1) + this.field226 - 1, 1, var12);
                            }
                            if (var8.field177 == 3) {
                                class320.method5385(this.field226 * arg0, this.field226 * (63 - arg1) + this.field226 - 1, 1, var12);
                            }
                        }
                        if (class236.field2791.field2778 == var8.field178) {
                            int var13 = var8.field177 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field226; var14++) {
                                    class320.method5385(this.field226 * arg0 + var14, this.field226 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field226; var15++) {
                                    class320.method5385(this.field226 * arg0 + var15, this.field226 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.ay(IILjava/util/HashSet;II)V")
    public void method321(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field224.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class229 var9 = (class229) var8.getKey();
            int var10 = (int) ((float) var9.field2600 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2602 * var5 - var6);
            class29 var12 = (class29) var8.getValue();
            if (var12 != null) {
                var12.field265 = var10;
                var12.field267 = var11;
                class258 var13 = class258.method2830(var12.field263);
                if (!arg2.contains(var13.method4437())) {
                    this.method364(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("y.ak(Ljava/util/HashSet;III)V")
    public void method308(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field223.iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            class258 var6 = class258.method2830(var5.field263);
            if (var6 != null && arg0.contains(var6.method4437())) {
                this.method322(var6, var5.field265, var5.field267, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("y.az(Lig;IIIII)V")
    public void method322(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        class324 var6 = arg0.method4432(false);
        if (var6 == null) {
            return;
        }
        var6.method5491(arg1 - var6.field3852 / 2, arg2 - var6.field3862 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class320.method5377(arg1, arg2, 15, 16776960, 128);
            class320.method5377(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("y.aj(Lak;IIFI)V")
    public void method364(class29 arg0, int arg1, int arg2, float arg3) {
        class258 var5 = class258.method2830(arg0.field263);
        this.method430(var5, arg1, arg2);
        this.method326(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("y.af(Lig;III)V")
    public void method430(class258 arg0, int arg1, int arg2) {
        class324 var4 = arg0.method4432(false);
        if (var4 != null) {
            int var5 = this.method378(var4, arg0.field3270);
            int var6 = this.method331(var4, arg0.field3287);
            var4.method5491(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("y.ah(Lak;Lig;IIFI)V")
    public void method326(class29 arg0, class258 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field264 != null && arg0.field264.field207.method126(arg4)) {
            class301 var6 = (class301) this.field225.get(arg0.field264.field207);
            var6.method5152(arg0.field264.field208, arg2 - arg0.field264.field203 / 2, arg3, arg0.field264.field203, arg0.field264.field204, 0xFF000000 | arg1.field3279, 0, 1, 0, var6.field3737 / 2);
        }
    }

    @ObfuscatedName("y.ab(IILjava/util/HashSet;II)V")
    public void method327(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field223.iterator();
        while (var6.hasNext()) {
            class29 var7 = (class29) var6.next();
            int var8 = var7.field260.field2600 % 64;
            int var9 = var7.field260.field2602 % 64;
            var7.field265 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field267 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field263)) {
                this.method364(var7, var7.field265, var7.field267, var5);
            }
        }
    }

    @ObfuscatedName("y.aa(I)V")
    public void method313() {
        if (this.field217 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method329(var1, var2, this.field217);
                }
            }
            return;
        }
        Iterator var3 = this.field220.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            for (int var5 = var4.method572() * 8; var5 < var4.method572() * 8 + 8; var5++) {
                for (int var6 = var4.method559() * 8; var6 < var4.method559() * 8 + 8; var6++) {
                    this.method329(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("y.ac(IILr;I)V")
    public void method329(int arg0, int arg1, class17 arg2) {
        field218.method4045(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field147; var4++) {
            class20[] var5 = arg2.field146[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    class258 var9 = this.method374(var8.field180);
                    if (var9 != null) {
                        class29 var10 = (class29) this.field224.get(field218);
                        if (var10 != null) {
                            if (var9.field3273 != var10.field263) {
                                class29 var11 = new class29(var9.field3273, var10.field261, var10.field260, this.method307(var9));
                                this.field224.put(new class229(field218), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field261.field2601 - var10.field260.field2601;
                            var10.field260.field2601 = var4;
                            var10.field261.field2601 = var4 + var12;
                            return;
                        }
                        class229 var13 = new class229(var4, this.field222 * 64 + arg0, this.field212 * 64 + arg1);
                        class229 var14 = null;
                        if (this.field217 == null) {
                            Iterator var15 = this.field220.iterator();
                            while (var15.hasNext()) {
                                class35 var16 = (class35) var15.next();
                                if (var16.method555(arg0, arg1)) {
                                    var14 = new class229(var16.field150 + var4, var16.field144 * 64 + arg0 + var16.method562() * 8, var16.field143 * 64 + arg1 + var16.method557() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class229(this.field217.field150 + var4, this.field217.field144 * 64 + arg0, this.field217.field143 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class29 var17 = new class29(var9.field3273, var14, var13, this.method307(var9));
                            this.field224.put(new class229(field218), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field224.remove(field218);
    }

    @ObfuscatedName("y.ad(Llt;Ljt;I)I")
    public int method378(class324 arg0, class273 arg1) {
        switch(arg1.field3529) {
            case 0:
                return -arg0.field3852 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3852;
        }
    }

    @ObfuscatedName("y.aq(Llt;Lil;I)I")
    public int method331(class324 arg0, class255 arg1) {
        switch(arg1.field3259) {
            case 0:
                return -arg0.field3862 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3862;
        }
    }

    @ObfuscatedName("y.ax(II)Lig;")
    public class258 method374(int arg0) {
        class271 var2 = class271.method2839(arg0);
        if (var2.field3457 != null) {
            var2 = var2.method4668();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3459 == -1 ? null : class258.method2830(var2.field3459);
    }

    @ObfuscatedName("y.an(II)Lz;")
    public class23 method333(int arg0) {
        class258 var2 = class258.method2830(arg0);
        return this.method307(var2);
    }

    @ObfuscatedName("y.ag(Lig;B)Lz;")
    public class23 method307(class258 arg0) {
        if (arg0.field3276 == null || this.field225 == null || this.field225.get(class13.field103) == null) {
            return null;
        }
        class13 var2 = class13.method125(arg0.field3278);
        if (var2 == null) {
            return null;
        }
        class301 var3 = (class301) this.field225.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5146(arg0.field3276, 1000000);
        String[] var5 = new String[var4];
        var3.method5224(arg0.field3276, (int[]) null, var5);
        int var6 = var5.length * var3.field3737 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5177(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class23(arg0.field3276, var7, var6, var2);
    }

    @ObfuscatedName("y.ap(IIIIIB)Ljava/util/List;")
    public List method335(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field224.values().iterator();
            while (var7.hasNext()) {
                class29 var8 = (class29) var7.next();
                if (var8.method471(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field223.iterator();
            while (var9.hasNext()) {
                class29 var10 = (class29) var9.next();
                if (var10.method471(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("y.aw(I)Ljava/util/List;")
    public List method336() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field223);
        var1.addAll(this.field224.values());
        return var1;
    }

    @ObfuscatedName("y.al(IIIII)V")
    public void method337(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class320.method5414(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, arg3);
        }
        if (var5 == 1) {
            class320.method5385(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, arg3);
        }
        if (var5 == 2) {
            class320.method5414(this.field226 * arg0 + this.field226 - 1, this.field226 * (63 - arg1), this.field226, arg3);
        }
        if (var5 == 3) {
            class320.method5385(this.field226 * arg0, this.field226 * (63 - arg1) + this.field226 - 1, this.field226, arg3);
        }
    }

    @ObfuscatedName("y.ar(III)I")
    public int method317(int arg0, int arg1) {
        if (this.field217 != null) {
            return this.field217.method174(arg0, arg1);
        }
        if (!this.field220.isEmpty()) {
            Iterator var3 = this.field220.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                if (var4.method555(arg0, arg1)) {
                    return var4.method174(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
