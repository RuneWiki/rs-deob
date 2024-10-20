package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("m")
public class class24 {

    @ObfuscatedName("m.j")
    public static class204 field213 = new class204(37748736, 256);

    @ObfuscatedName("m.p")
    public static class204 field211 = new class204(256, 256);

    @ObfuscatedName("m.e")
    public int field229;

    @ObfuscatedName("m.s")
    public int field216;

    @ObfuscatedName("m.v")
    public class11 field217;

    @ObfuscatedName("m.k")
    public LinkedList field218;

    @ObfuscatedName("m.o")
    public int field221;

    @ObfuscatedName("m.q")
    public int field219;

    @ObfuscatedName("m.l")
    public List field212;

    @ObfuscatedName("m.f")
    public HashMap field222;

    @ObfuscatedName("m.z")
    public final HashMap field223;

    @ObfuscatedName("m.a")
    public static final class229 field228 = new class229();

    @ObfuscatedName("ff.y(IIIB)J")
    public static long method3206(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("ig.c(IIII)Llu;")
    public static class324 method4404(int arg0, int arg1, int arg2) {
        return (class324) field213.method3701(method3206(arg0, arg1, arg2));
    }

    @ObfuscatedName("am.n(III)Lg;")
    public static class22 method528(int arg0, int arg1) {
        return (class22) field211.method3701(method3206(arg0, arg1, 0));
    }

    @ObfuscatedName("r.u(Lg;III)V")
    public static void method65(class22 arg0, int arg1, int arg2) {
        field211.method3704(arg0, method3206(arg1, arg2, 0));
    }

    @ObfuscatedName("bq.i(I)V")
    public static void method1699() {
        field213.method3707();
        field211.method3707();
    }

    @ObfuscatedName("ip.p(I)V")
    public static void method4444() {
        field213.method3706(5);
        field211.method3706(5);
    }

    public class24(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field229 = arg0;
        this.field216 = arg1;
        this.field218 = new LinkedList();
        this.field212 = new LinkedList();
        this.field222 = new HashMap();
        this.field221 = arg2 | 0xFF000000;
        this.field223 = arg3;
    }

    @ObfuscatedName("m.e(IIII)V")
    public void method281(int arg0, int arg1, int arg2) {
        class324 var4 = method4404(this.field229, this.field216, this.field219);
        if (var4 == null) {
            return;
        }
        if (this.field219 * 64 == arg2) {
            var4.method5482(arg0, arg1);
        } else {
            var4.method5504(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("m.s(Lv;Ljava/util/List;I)V")
    public void method282(class11 arg0, List arg1) {
        this.field222.clear();
        this.field217 = arg0;
        this.method394(0, 0, 64, 64, this.field217);
        this.method285(arg1);
    }

    @ObfuscatedName("m.v(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method283(HashSet arg0, List arg1) {
        this.field222.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            if (var4.method158() == this.field229 && var4.method159() == this.field216) {
                this.field218.add(var4);
                this.method394(var4.method546() * 8, var4.method530() * 8, 8, 8, var4);
            }
        }
        this.method285(arg1);
    }

    @ObfuscatedName("m.k(IIIILz;S)V")
    public void method394(int arg0, int arg1, int arg2, int arg3, class17 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class229 var8 = new class229(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field134; var9++) {
                    class20[] var10 = arg4.field142[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class20[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class20 var13 = var11[var12];
                            class258 var14 = this.method320(var13.field178);
                            if (var14 != null) {
                                class229 var15 = new class229(var9, this.field229 * 64 + var6, this.field216 * 64 + var7);
                                Object var16 = null;
                                class229 var17;
                                if (this.field217 == null) {
                                    class35 var18 = (class35) arg4;
                                    var17 = new class229(var18.field133 + var9, var18.field143 * 64 + var6 + var18.method532() * 8, var18.field130 * 64 + var7 + var18.method533() * 8);
                                } else {
                                    var17 = new class229(this.field217.field133 + var9, this.field217.field143 * 64 + var6, this.field217.field130 * 64 + var7);
                                }
                                class29 var19 = new class29(var14.field3289, var17, var15, this.method314(var14));
                                this.field222.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.o(Ljava/util/List;I)V")
    public void method285(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class14 var3 = (class14) var2.next();
            if (var3.field98.field2605 >> 6 == this.field229 && var3.field98.field2606 >> 6 == this.field216) {
                class29 var4 = new class29(var3.field97, var3.field98, var3.field98, this.method328(var3.field97));
                this.field212.add(var4);
            }
        }
    }

    @ObfuscatedName("m.q(ILau;[Lm;[Llb;I)V")
    public void method341(int arg0, class36 arg1, class24[] arg2, class323[] arg3) {
        this.field219 = arg0;
        if (this.field217 == null && this.field218.isEmpty() || method4404(this.field229, this.field216, arg0) != null) {
            return;
        }
        class22 var5 = this.method294(this.field229, this.field216, arg2);
        class324 var6 = new class324(this.field219 * 64, this.field219 * 64);
        var6.method5475();
        if (this.field217 == null) {
            this.method290(arg1, arg3, var5);
        } else {
            this.method421(arg1, arg2, arg3, var5);
        }
        int var7 = this.field229;
        int var8 = this.field216;
        int var9 = this.field219;
        field213.method3705(var6, method3206(var7, var8, var9), var6.field3851.length * 4);
    }

    @ObfuscatedName("m.l(IIILjava/util/HashSet;I)V")
    public void method287(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method286(arg0, arg1, arg3, arg2);
        this.method308(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("m.f(Ljava/util/HashSet;III)V")
    public void method302(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field222.values().iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            if (arg0.contains(var5.field269)) {
                class258 var6 = class258.method4467(var5.field269);
                this.method315(var6, var5.field272, var5.field273, arg1, arg2);
            }
        }
        this.method303(arg0, arg1, arg2);
    }

    @ObfuscatedName("m.z(Lau;[Lm;[Llb;Lg;B)V")
    public void method421(class36 arg0, class24[] arg1, class323[] arg2, class22 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method292(var5, var6, this.field217, arg0, arg3);
                this.method293(var5, var6, this.field217, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method347(var7, var8, this.field217, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("m.a(Lau;[Llb;Lg;I)V")
    public void method290(class36 arg0, class323[] arg1, class22 arg2) {
        Iterator var4 = this.field218.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            for (int var6 = var5.method546() * 8; var6 < var5.method546() * 8 + 8; var6++) {
                for (int var7 = var5.method530() * 8; var7 < var5.method530() * 8 + 8; var7++) {
                    this.method292(var6, var7, var5, arg0, arg2);
                    this.method293(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field218.iterator();
        while (var8.hasNext()) {
            class35 var9 = (class35) var8.next();
            for (int var10 = var9.method546() * 8; var10 < var9.method546() * 8 + 8; var10++) {
                for (int var11 = var9.method530() * 8; var11 < var9.method530() * 8 + 8; var11++) {
                    this.method347(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("m.x(IILz;Lau;[Llb;I)V")
    public void method347(int arg0, int arg1, class17 arg2, class36 arg3, class323[] arg4) {
        this.method301(arg0, arg1, arg2);
        this.method346(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("m.b(IILz;Lau;Lg;I)V")
    public void method292(int arg0, int arg1, class17 arg2, class36 arg3, class22 arg4) {
        int var6 = arg2.field135[0][arg0][arg1] - 1;
        int var7 = arg2.field141[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class320.method5372(this.field219 * arg0, this.field219 * (63 - arg1), this.field219, this.field219, this.field221);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class27.method99(var7, this.field221);
        }
        if (var7 > -1 && arg2.field137[0][arg0][arg1] == 0) {
            class320.method5372(this.field219 * arg0, this.field219 * (63 - arg1), this.field219, this.field219, var8);
            return;
        }
        int var9 = this.method299(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class320.method5372(this.field219 * arg0, this.field219 * (63 - arg1), this.field219, this.field219, var9);
        } else {
            arg3.method553(this.field219 * arg0, this.field219 * (63 - arg1), var9, var8, this.field219, this.field219, arg2.field137[0][arg0][arg1], arg2.field129[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("m.w(IILz;Lau;I)V")
    public void method293(int arg0, int arg1, class17 arg2, class36 arg3) {
        for (int var5 = 1; var5 < arg2.field134; var5++) {
            int var6 = arg2.field141[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class27.method99(var6, this.field221);
                if (arg2.field137[var5][arg0][arg1] == 0) {
                    class320.method5372(this.field219 * arg0, this.field219 * (63 - arg1), this.field219, this.field219, var7);
                } else {
                    arg3.method553(this.field219 * arg0, this.field219 * (63 - arg1), 0, var7, this.field219, this.field219, arg2.field137[var5][arg0][arg1], arg2.field129[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("m.g(II[Lm;I)Lg;")
    public class22 method294(int arg0, int arg1, class24[] arg2) {
        class22 var4 = method528(arg0, arg1);
        if (var4 == null) {
            var4 = this.method295(arg2);
            method65(var4, arg0, arg1);
        }
        return var4;
    }

    @ObfuscatedName("m.d([Lm;S)Lg;")
    public class22 method295(class24[] arg0) {
        class33 var2 = new class33(64, 64);
        if (this.field217 == null) {
            Iterator var3 = this.field218.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                this.method297(var4.method546() * 8, var4.method530() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method297(0, 0, 64, 64, this.field217, var2);
        }
        this.method296(arg0, var2);
        class22 var5 = new class22();
        var5.method272(var2);
        return var5;
    }

    @ObfuscatedName("m.m([Lm;Lav;S)V")
    public void method296(class24[] arg0, class33 arg1) {
        class243[] var3 = class243.method1705();
        class243[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class243 var6 = var4[var5];
            if (arg0[var6.method144()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3148) {
                    case 0:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 2:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 3:
                        var11 = 59;
                        var9 = 5;
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
                        break;
                    case 6:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var10 = 5;
                }
                this.method298(var11, var12, var7, var8, var9, var10, arg0[var6.method144()], arg1);
            }
        }
    }

    @ObfuscatedName("m.t(IIIILz;Lav;I)V")
    public void method297(int arg0, int arg1, int arg2, int arg3, class17 arg4, class33 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field135[0][var7][var8] - 1;
                if (var9 != -1) {
                    class262 var10 = class262.method4427(var9);
                    arg5.method510(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("m.h(IIIIIILm;Lav;B)V")
    public void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class24 arg6, class33 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method410(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class262 var12 = class262.method4427(var11);
                    arg7.method510(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("m.ah(IILz;Lg;I)I")
    public int method299(int arg0, int arg1, class17 arg2, class22 arg3) {
        return arg2.field135[0][arg0][arg1] == 0 ? this.field221 : arg3.method269(arg0, arg1);
    }

    @ObfuscatedName("m.ad(IILz;[Llb;I)V")
    public void method346(int arg0, int arg1, class17 arg2, class323[] arg3) {
        for (int var5 = 0; var5 < arg2.field134; var5++) {
            class20[] var6 = arg2.field142[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class20[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class20 var9 = var7[var8];
                    if (class236.method1837(var9.field173) || class236.method4129(var9.field173)) {
                        class271 var10 = class271.method3187(var9.field178);
                        if (var10.field3443 != -1) {
                            if (var10.field3443 == 46 || var10.field3443 == 52) {
                                arg3[var10.field3443].method5463(this.field219 * arg0, this.field219 * (63 - arg1), this.field219 * 2 + 1, this.field219 * 2 + 1);
                            } else {
                                arg3[var10.field3443].method5463(this.field219 * arg0, this.field219 * (63 - arg1), this.field219 * 2, this.field219 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.aa(IILz;B)V")
    public void method301(int arg0, int arg1, class17 arg2) {
        for (int var4 = 0; var4 < arg2.field134; var4++) {
            class20[] var5 = arg2.field142[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    int var9 = var8.field173;
                    boolean var10 = var9 >= class236.field2791.field2790 && var9 <= class236.field2793.field2790 || class236.field2797.field2790 == var9;
                    if (var10) {
                        class271 var11 = class271.method3187(var8.field178);
                        int var12 = var11.field3468 == 0 ? -3355444 : -3407872;
                        if (class236.field2791.field2790 == var8.field173) {
                            this.method317(arg0, arg1, var8.field172, var12);
                        }
                        if (class236.field2792.field2790 == var8.field173) {
                            this.method317(arg0, arg1, var8.field172, -3355444);
                            this.method317(arg0, arg1, var8.field172 + 1, var12);
                        }
                        if (class236.field2793.field2790 == var8.field173) {
                            if (var8.field172 == 0) {
                                class320.method5378(this.field219 * arg0, this.field219 * (63 - arg1), 1, var12);
                            }
                            if (var8.field172 == 1) {
                                class320.method5378(this.field219 * arg0 + this.field219 - 1, this.field219 * (63 - arg1), 1, var12);
                            }
                            if (var8.field172 == 2) {
                                class320.method5378(this.field219 * arg0 + this.field219 - 1, this.field219 * (63 - arg1) + this.field219 - 1, 1, var12);
                            }
                            if (var8.field172 == 3) {
                                class320.method5378(this.field219 * arg0, this.field219 * (63 - arg1) + this.field219 - 1, 1, var12);
                            }
                        }
                        if (class236.field2797.field2790 == var8.field173) {
                            int var13 = var8.field172 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field219; var14++) {
                                    class320.method5378(this.field219 * arg0 + var14, this.field219 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field219; var15++) {
                                    class320.method5378(this.field219 * arg0 + var15, this.field219 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.ag(IILjava/util/HashSet;II)V")
    public void method286(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field222.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class229 var9 = (class229) var8.getKey();
            int var10 = (int) ((float) var9.field2605 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2606 * var5 - var6);
            class29 var12 = (class29) var8.getValue();
            if (var12 != null) {
                var12.field272 = var10;
                var12.field273 = var11;
                class258 var13 = class258.method4467(var12.field269);
                if (!arg2.contains(var13.method4458())) {
                    this.method381(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("m.av(Ljava/util/HashSet;III)V")
    public void method303(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field212.iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            class258 var6 = class258.method4467(var5.field269);
            if (var6 != null && arg0.contains(var6.method4458())) {
                this.method315(var6, var5.field272, var5.field273, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("m.am(Lik;IIIII)V")
    public void method315(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        class324 var6 = arg0.method4464(false);
        if (var6 == null) {
            return;
        }
        var6.method5569(arg1 - var6.field3845 / 2, arg2 - var6.field3847 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class320.method5370(arg1, arg2, 15, 16776960, 128);
            class320.method5370(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("m.ap(Lah;IIFI)V")
    public void method381(class29 arg0, int arg1, int arg2, float arg3) {
        class258 var5 = class258.method4467(arg0.field269);
        this.method306(var5, arg1, arg2);
        this.method307(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("m.au(Lik;III)V")
    public void method306(class258 arg0, int arg1, int arg2) {
        class324 var4 = arg0.method4464(false);
        if (var4 != null) {
            int var5 = this.method311(var4, arg0.field3302);
            int var6 = this.method342(var4, arg0.field3306);
            var4.method5569(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("m.ae(Lah;Lik;IIFB)V")
    public void method307(class29 arg0, class258 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field271 != null && arg0.field271.field206.method113(arg4)) {
            class301 var6 = (class301) this.field223.get(arg0.field271.field206);
            var6.method5196(arg0.field271.field210, arg2 - arg0.field271.field205 / 2, arg3, arg0.field271.field205, arg0.field271.field203, 0xFF000000 | arg1.field3305, 0, 1, 0, var6.field3737 / 2);
        }
    }

    @ObfuscatedName("m.ai(IILjava/util/HashSet;IB)V")
    public void method308(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field212.iterator();
        while (var6.hasNext()) {
            class29 var7 = (class29) var6.next();
            int var8 = var7.field267.field2605 % 64;
            int var9 = var7.field267.field2606 % 64;
            var7.field272 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field273 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field269)) {
                this.method381(var7, var7.field272, var7.field273, var5);
            }
        }
    }

    @ObfuscatedName("m.ab(S)V")
    public void method300() {
        if (this.field217 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method310(var1, var2, this.field217);
                }
            }
            return;
        }
        Iterator var3 = this.field218.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            for (int var5 = var4.method546() * 8; var5 < var4.method546() * 8 + 8; var5++) {
                for (int var6 = var4.method530() * 8; var6 < var4.method530() * 8 + 8; var6++) {
                    this.method310(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("m.aw(IILz;I)V")
    public void method310(int arg0, int arg1, class17 arg2) {
        field228.method4074(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field134; var4++) {
            class20[] var5 = arg2.field142[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    class258 var9 = this.method320(var8.field178);
                    if (var9 != null) {
                        class29 var10 = (class29) this.field222.get(field228);
                        if (var10 != null) {
                            if (var9.field3289 != var10.field269) {
                                class29 var11 = new class29(var9.field3289, var10.field275, var10.field267, this.method314(var9));
                                this.field222.put(new class229(field228), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field275.field2610 - var10.field267.field2610;
                            var10.field267.field2610 = var4;
                            var10.field275.field2610 = var4 + var12;
                            return;
                        }
                        class229 var13 = new class229(var4, this.field229 * 64 + arg0, this.field216 * 64 + arg1);
                        class229 var14 = null;
                        if (this.field217 == null) {
                            Iterator var15 = this.field218.iterator();
                            while (var15.hasNext()) {
                                class35 var16 = (class35) var15.next();
                                if (var16.method547(arg0, arg1)) {
                                    var14 = new class229(var16.field133 + var4, var16.field143 * 64 + arg0 + var16.method532() * 8, var16.field130 * 64 + arg1 + var16.method533() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class229(this.field217.field133 + var4, this.field217.field143 * 64 + arg0, this.field217.field130 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class29 var17 = new class29(var9.field3289, var14, var13, this.method314(var9));
                            this.field222.put(new class229(field228), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field222.remove(field228);
    }

    @ObfuscatedName("m.ac(Llu;Ljy;I)I")
    public int method311(class324 arg0, class273 arg1) {
        switch(arg1.field3531) {
            case 1:
                return -arg0.field3845 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3845;
        }
    }

    @ObfuscatedName("m.aq(Llu;Lie;I)I")
    public int method342(class324 arg0, class255 arg1) {
        switch(arg1.field3271) {
            case 0:
                return -arg0.field3847 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3847;
        }
    }

    @ObfuscatedName("m.az(II)Lik;")
    public class258 method320(int arg0) {
        class271 var2 = class271.method3187(arg0);
        if (var2.field3439 != null) {
            var2 = var2.method4677();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3454 == -1 ? null : class258.method4467(var2.field3454);
    }

    @ObfuscatedName("m.ay(II)Ld;")
    public class23 method328(int arg0) {
        class258 var2 = class258.method4467(arg0);
        return this.method314(var2);
    }

    @ObfuscatedName("m.ao(Lik;I)Ld;")
    public class23 method314(class258 arg0) {
        if (arg0.field3303 == null || this.field223 == null || this.field223.get(class13.field92) == null) {
            return null;
        }
        int var2 = arg0.field3286;
        class13[] var3 = new class13[] { class13.field90, class13.field87, class13.field92 };
        class13[] var4 = var3;
        int var5 = 0;
        class13 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class13 var6 = var4[var5];
            if (var6.field93 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class301 var9 = (class301) this.field223.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5207(arg0.field3303, 1000000);
        String[] var11 = new String[var10];
        var9.method5140(arg0.field3303, (int[]) null, var11);
        int var12 = var11.length * var9.field3737 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method5139(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class23(arg0.field3303, var13, var12, var7);
    }

    @ObfuscatedName("m.ak(IIIIII)Ljava/util/List;")
    public List method350(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field222.values().iterator();
            while (var7.hasNext()) {
                class29 var8 = (class29) var7.next();
                if (var8.method449(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field212.iterator();
            while (var9.hasNext()) {
                class29 var10 = (class29) var9.next();
                if (var10.method449(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("m.af(I)Ljava/util/List;")
    public List method316() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field212);
        var1.addAll(this.field222.values());
        return var1;
    }

    @ObfuscatedName("m.ax(IIIII)V")
    public void method317(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class320.method5380(this.field219 * arg0, this.field219 * (63 - arg1), this.field219, arg3);
        }
        if (var5 == 1) {
            class320.method5378(this.field219 * arg0, this.field219 * (63 - arg1), this.field219, arg3);
        }
        if (var5 == 2) {
            class320.method5380(this.field219 * arg0 + this.field219 - 1, this.field219 * (63 - arg1), this.field219, arg3);
        }
        if (var5 == 3) {
            class320.method5378(this.field219 * arg0, this.field219 * (63 - arg1) + this.field219 - 1, this.field219, arg3);
        }
    }

    @ObfuscatedName("m.ar(III)I")
    public int method410(int arg0, int arg1) {
        if (this.field217 != null) {
            return this.field217.method157(arg0, arg1);
        }
        if (!this.field218.isEmpty()) {
            Iterator var3 = this.field218.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                if (var4.method547(arg0, arg1)) {
                    return var4.method157(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
