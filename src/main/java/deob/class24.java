package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("k")
public class class24 {

    @ObfuscatedName("k.c")
    public static class204 field219 = new class204(37748736, 256);

    @ObfuscatedName("k.p")
    public static class204 field228 = new class204(256, 256);

    @ObfuscatedName("k.r")
    public int field221;

    @ObfuscatedName("k.m")
    public int field224;

    @ObfuscatedName("k.d")
    public class11 field223;

    @ObfuscatedName("k.z")
    public LinkedList field232;

    @ObfuscatedName("k.x")
    public int field231;

    @ObfuscatedName("k.v")
    public int field226;

    @ObfuscatedName("k.g")
    public List field215;

    @ObfuscatedName("k.j")
    public HashMap field225;

    @ObfuscatedName("k.b")
    public final HashMap field229;

    @ObfuscatedName("k.u")
    public static final class229 field230 = new class229();

    @ObfuscatedName("ji.f(IIII)Llp;")
    public static class324 method4886(int arg0, int arg1, int arg2) {
        class204 var3 = field219;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class324) var3.method3755(var4);
    }

    @ObfuscatedName("gh.l(Llp;IIII)V")
    public static void method3645(class324 arg0, int arg1, int arg2, int arg3) {
        class204 var4 = field219;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3759(arg0, var6, arg0.field3873.length * 4);
    }

    @ObfuscatedName("h.w(III)Lo;")
    public static class22 method262(int arg0, int arg1) {
        class204 var2 = field228;
        long var3 = (long) (0x0 | arg0 << 8 | arg1);
        return (class22) var2.method3755(var3);
    }

    @ObfuscatedName("r.s(B)V")
    public static void method84() {
        field219.method3760();
        field228.method3760();
    }

    public class24(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field221 = arg0;
        this.field224 = arg1;
        this.field232 = new LinkedList();
        this.field215 = new LinkedList();
        this.field225 = new HashMap();
        this.field231 = arg2 | 0xFF000000;
        this.field229 = arg3;
    }

    @ObfuscatedName("k.e(IIII)V")
    public void method285(int arg0, int arg1, int arg2) {
        class324 var4 = method4886(this.field221, this.field224, this.field226);
        if (var4 == null) {
            return;
        }
        if (this.field226 * 64 == arg2) {
            var4.method5565(arg0, arg1);
        } else {
            var4.method5616(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("k.c(Ld;Ljava/util/List;I)V")
    public void method286(class11 arg0, List arg1) {
        this.field225.clear();
        this.field223 = arg0;
        this.method288(0, 0, 64, 64, this.field223);
        this.method289(arg1);
    }

    @ObfuscatedName("k.p(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method287(HashSet arg0, List arg1) {
        this.field225.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            if (var4.method160() == this.field221 && var4.method161() == this.field224) {
                this.field232.add(var4);
                this.method288(var4.method546() * 8, var4.method539() * 8, 8, 8, var4);
            }
        }
        this.method289(arg1);
    }

    @ObfuscatedName("k.r(IIIILb;I)V")
    public void method288(int arg0, int arg1, int arg2, int arg3, class17 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class229 var8 = new class229(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field146; var9++) {
                    class20[] var10 = arg4.field156[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class20[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class20 var13 = var11[var12];
                            class258 var14 = this.method317(var13.field180);
                            if (var14 != null) {
                                class229 var15 = new class229(var9, this.field221 * 64 + var6, this.field224 * 64 + var7);
                                Object var16 = null;
                                class229 var17;
                                if (this.field223 == null) {
                                    class35 var18 = (class35) arg4;
                                    var17 = new class229(var18.field153 + var9, var18.field157 * 64 + var6 + var18.method536() * 8, var18.field151 * 64 + var7 + var18.method555() * 8);
                                } else {
                                    var17 = new class229(this.field223.field153 + var9, this.field223.field157 * 64 + var6, this.field223.field151 * 64 + var7);
                                }
                                class29 var19 = new class29(var14.field3320, var17, var15, this.method319(var14));
                                this.field225.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.m(Ljava/util/List;I)V")
    public void method289(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class14 var3 = (class14) var2.next();
            if (var3.field111.field2634 >> 6 == this.field221 && var3.field111.field2632 >> 6 == this.field224) {
                class29 var4 = new class29(var3.field110, var3.field111, var3.field111, this.method318(var3.field110));
                this.field215.add(var4);
            }
        }
    }

    @ObfuscatedName("k.d(ILas;[Lk;[Lle;B)V")
    public void method398(int arg0, class36 arg1, class24[] arg2, class323[] arg3) {
        this.field226 = arg0;
        if (this.field223 == null && this.field232.isEmpty() || method4886(this.field221, this.field224, arg0) != null) {
            return;
        }
        class22 var5 = this.method298(this.field221, this.field224, arg2);
        class324 var6 = new class324(this.field226 * 64, this.field226 * 64);
        var6.method5656();
        if (this.field223 == null) {
            this.method294(arg1, arg3, var5);
        } else {
            this.method293(arg1, arg2, arg3, var5);
        }
        method3645(var6, this.field221, this.field224, this.field226);
    }

    @ObfuscatedName("k.z(IIILjava/util/HashSet;I)V")
    public void method387(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method373(arg0, arg1, arg3, arg2);
        this.method312(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("k.x(Ljava/util/HashSet;III)V")
    public void method326(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field225.values().iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            if (arg0.contains(var5.field282)) {
                class258 var6 = class258.method3139(var5.field282);
                this.method308(var6, var5.field274, var5.field277, arg1, arg2);
            }
        }
        this.method307(arg0, arg1, arg2);
    }

    @ObfuscatedName("k.v(Las;[Lk;[Lle;Lo;S)V")
    public void method293(class36 arg0, class24[] arg1, class323[] arg2, class22 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method305(var5, var6, this.field223, arg0, arg3);
                this.method297(var5, var6, this.field223, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method352(var7, var8, this.field223, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("k.g(Las;[Lle;Lo;I)V")
    public void method294(class36 arg0, class323[] arg1, class22 arg2) {
        Iterator var4 = this.field232.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            for (int var6 = var5.method546() * 8; var6 < var5.method546() * 8 + 8; var6++) {
                for (int var7 = var5.method539() * 8; var7 < var5.method539() * 8 + 8; var7++) {
                    this.method305(var6, var7, var5, arg0, arg2);
                    this.method297(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field232.iterator();
        while (var8.hasNext()) {
            class35 var9 = (class35) var8.next();
            for (int var10 = var9.method546() * 8; var10 < var9.method546() * 8 + 8; var10++) {
                for (int var11 = var9.method539() * 8; var11 < var9.method539() * 8 + 8; var11++) {
                    this.method352(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("k.u(IILb;Las;[Lle;I)V")
    public void method352(int arg0, int arg1, class17 arg2, class36 arg3, class323[] arg4) {
        this.method429(arg0, arg1, arg2);
        this.method304(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("k.o(IILb;Las;Lo;B)V")
    public void method305(int arg0, int arg1, class17 arg2, class36 arg3, class22 arg4) {
        int var6 = arg2.field147[0][arg0][arg1] - 1;
        int var7 = arg2.field148[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class320.method5483(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, this.field226, this.field231);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class27.method560(var7, this.field231);
        }
        if (var7 > -1 && arg2.field149[0][arg0][arg1] == 0) {
            class320.method5483(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, this.field226, var8);
            return;
        }
        int var9 = this.method303(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class320.method5483(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, this.field226, var9);
        } else {
            arg3.method562(this.field226 * arg0, this.field226 * (63 - arg1), var9, var8, this.field226, this.field226, arg2.field149[0][arg0][arg1], arg2.field150[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("k.i(IILb;Las;I)V")
    public void method297(int arg0, int arg1, class17 arg2, class36 arg3) {
        for (int var5 = 1; var5 < arg2.field146; var5++) {
            int var6 = arg2.field148[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class27.method560(var6, this.field231);
                if (arg2.field149[var5][arg0][arg1] == 0) {
                    class320.method5483(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, this.field226, var7);
                } else {
                    arg3.method562(this.field226 * arg0, this.field226 * (63 - arg1), 0, var7, this.field226, this.field226, arg2.field149[var5][arg0][arg1], arg2.field150[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("k.k(II[Lk;S)Lo;")
    public class22 method298(int arg0, int arg1, class24[] arg2) {
        class22 var4 = method262(arg0, arg1);
        if (var4 == null) {
            var4 = this.method296(arg2);
            class204 var5 = field228;
            long var7 = (long) (0x0 | arg0 << 8 | arg1);
            var5.method3758(var4, var7);
        }
        return var4;
    }

    @ObfuscatedName("k.q([Lk;B)Lo;")
    public class22 method296(class24[] arg0) {
        class33 var2 = new class33(64, 64);
        if (this.field223 == null) {
            Iterator var3 = this.field232.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                this.method301(var4.method546() * 8, var4.method539() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method301(0, 0, 64, 64, this.field223, var2);
        }
        this.method338(arg0, var2);
        class22 var5 = new class22();
        var5.method267(var2);
        return var5;
    }

    @ObfuscatedName("k.y([Lk;Lam;I)V")
    public void method338(class24[] arg0, class33 arg1) {
        class243[] var3 = new class243[] { class243.field3165, class243.field3168, class243.field3163, class243.field3166, class243.field3167, class243.field3172, class243.field3170, class243.field3162 };
        class243[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class243 var7 = var5[var6];
            if (arg0[var7.method148()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3169) {
                    case 0:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 6:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                }
                this.method302(var12, var13, var8, var9, var10, var11, arg0[var7.method148()], arg1);
            }
        }
    }

    @ObfuscatedName("k.av(IIIILb;Lam;I)V")
    public void method301(int arg0, int arg1, int arg2, int arg3, class17 arg4, class33 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field147[0][var7][var8] - 1;
                if (var9 != -1) {
                    class262 var10 = class262.method3020(var9);
                    arg5.method511(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("k.ag(IIIIIILk;Lam;B)V")
    public void method302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class24 arg6, class33 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method323(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class262 var12 = class262.method3020(var11);
                    arg7.method511(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("k.af(IILb;Lo;I)I")
    public int method303(int arg0, int arg1, class17 arg2, class22 arg3) {
        return arg2.field147[0][arg0][arg1] == 0 ? this.field231 : arg3.method270(arg0, arg1);
    }

    @ObfuscatedName("k.az(IILb;[Lle;B)V")
    public void method304(int arg0, int arg1, class17 arg2, class323[] arg3) {
        for (int var5 = 0; var5 < arg2.field146; var5++) {
            class20[] var6 = arg2.field156[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class20[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class20 var9 = var7[var8];
                    if (class236.method133(var9.field181) || class236.method119(var9.field181)) {
                        class271 var10 = class271.method1776(var9.field180);
                        if (var10.field3457 != -1) {
                            if (var10.field3457 == 46 || var10.field3457 == 52) {
                                arg3[var10.field3457].method5551(this.field226 * arg0, this.field226 * (63 - arg1), this.field226 * 2 + 1, this.field226 * 2 + 1);
                            } else {
                                arg3[var10.field3457].method5551(this.field226 * arg0, this.field226 * (63 - arg1), this.field226 * 2, this.field226 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.at(IILb;I)V")
    public void method429(int arg0, int arg1, class17 arg2) {
        for (int var4 = 0; var4 < arg2.field146; var4++) {
            class20[] var5 = arg2.field156[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    if (class236.method3235(var8.field181)) {
                        class271 var9 = class271.method1776(var8.field180);
                        int var10 = var9.field3466 == 0 ? -3355444 : -3407872;
                        if (class236.field2822.field2843 == var8.field181) {
                            this.method322(arg0, arg1, var8.field183, var10);
                        }
                        if (class236.field2824.field2843 == var8.field181) {
                            this.method322(arg0, arg1, var8.field183, -3355444);
                            this.method322(arg0, arg1, var8.field183 + 1, var10);
                        }
                        if (class236.field2832.field2843 == var8.field181) {
                            if (var8.field183 == 0) {
                                class320.method5529(this.field226 * arg0, this.field226 * (63 - arg1), 1, var10);
                            }
                            if (var8.field183 == 1) {
                                class320.method5529(this.field226 * arg0 + this.field226 - 1, this.field226 * (63 - arg1), 1, var10);
                            }
                            if (var8.field183 == 2) {
                                class320.method5529(this.field226 * arg0 + this.field226 - 1, this.field226 * (63 - arg1) + this.field226 - 1, 1, var10);
                            }
                            if (var8.field183 == 3) {
                                class320.method5529(this.field226 * arg0, this.field226 * (63 - arg1) + this.field226 - 1, 1, var10);
                            }
                        }
                        if (class236.field2842.field2843 == var8.field181) {
                            int var11 = var8.field183 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field226; var12++) {
                                    class320.method5529(this.field226 * arg0 + var12, this.field226 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field226; var13++) {
                                    class320.method5529(this.field226 * arg0 + var13, this.field226 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.ac(IILjava/util/HashSet;IB)V")
    public void method373(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field225.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class229 var9 = (class229) var8.getKey();
            int var10 = (int) ((float) var9.field2634 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2632 * var5 - var6);
            class29 var12 = (class29) var8.getValue();
            if (var12 != null) {
                var12.field274 = var10;
                var12.field277 = var11;
                class258 var13 = class258.method3139(var12.field282);
                if (!arg2.contains(var13.method4491())) {
                    this.method309(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("k.am(Ljava/util/HashSet;IIB)V")
    public void method307(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field215.iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            class258 var6 = class258.method3139(var5.field282);
            if (var6 != null && arg0.contains(var6.method4491())) {
                this.method308(var6, var5.field274, var5.field277, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("k.aw(Lif;IIIII)V")
    public void method308(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        class324 var6 = arg0.method4489(false);
        if (var6 == null) {
            return;
        }
        var6.method5567(arg1 - var6.field3872 / 2, arg2 - var6.field3871 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class320.method5460(arg1, arg2, 15, 16776960, 128);
            class320.method5460(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("k.aa(Laf;IIFB)V")
    public void method309(class29 arg0, int arg1, int arg2, float arg3) {
        class258 var5 = class258.method3139(arg0.field282);
        this.method348(var5, arg1, arg2);
        this.method311(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("k.as(Lif;III)V")
    public void method348(class258 arg0, int arg1, int arg2) {
        class324 var4 = arg0.method4489(false);
        if (var4 != null) {
            int var5 = this.method350(var4, arg0.field3311);
            int var6 = this.method316(var4, arg0.field3305);
            var4.method5567(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("k.al(Laf;Lif;IIFB)V")
    public void method311(class29 arg0, class258 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field275 != null && arg0.field275.field211.method110(arg4)) {
            class301 var6 = (class301) this.field229.get(arg0.field275.field211);
            var6.method5257(arg0.field275.field209, arg2 - arg0.field275.field208 / 2, arg3, arg0.field275.field208, arg0.field275.field210, 0xFF000000 | arg1.field3303, 0, 1, 0, var6.field3762 / 2);
        }
    }

    @ObfuscatedName("k.ad(IILjava/util/HashSet;IB)V")
    public void method312(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field215.iterator();
        while (var6.hasNext()) {
            class29 var7 = (class29) var6.next();
            int var8 = var7.field283.field2634 % 64;
            int var9 = var7.field283.field2632 % 64;
            var7.field274 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field277 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field282)) {
                this.method309(var7, var7.field274, var7.field277, var5);
            }
        }
    }

    @ObfuscatedName("k.ax(I)V")
    public void method284() {
        if (this.field223 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method314(var1, var2, this.field223);
                }
            }
            return;
        }
        Iterator var3 = this.field232.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            for (int var5 = var4.method546() * 8; var5 < var4.method546() * 8 + 8; var5++) {
                for (int var6 = var4.method539() * 8; var6 < var4.method539() * 8 + 8; var6++) {
                    this.method314(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("k.ao(IILb;I)V")
    public void method314(int arg0, int arg1, class17 arg2) {
        field230.method4144(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field146; var4++) {
            class20[] var5 = arg2.field156[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    class258 var9 = this.method317(var8.field180);
                    if (var9 != null) {
                        class29 var10 = (class29) this.field225.get(field230);
                        if (var10 != null) {
                            if (var9.field3320 != var10.field282) {
                                class29 var11 = new class29(var9.field3320, var10.field272, var10.field283, this.method319(var9));
                                this.field225.put(new class229(field230), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field272.field2633 - var10.field283.field2633;
                            var10.field283.field2633 = var4;
                            var10.field272.field2633 = var4 + var12;
                            return;
                        }
                        class229 var13 = new class229(var4, this.field221 * 64 + arg0, this.field224 * 64 + arg1);
                        class229 var14 = null;
                        if (this.field223 == null) {
                            Iterator var15 = this.field232.iterator();
                            while (var15.hasNext()) {
                                class35 var16 = (class35) var15.next();
                                if (var16.method535(arg0, arg1)) {
                                    var14 = new class229(var16.field153 + var4, var16.field157 * 64 + arg0 + var16.method536() * 8, var16.field151 * 64 + arg1 + var16.method555() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class229(this.field223.field153 + var4, this.field223.field157 * 64 + arg0, this.field223.field151 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class29 var17 = new class29(var9.field3320, var14, var13, this.method319(var9));
                            this.field225.put(new class229(field230), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field225.remove(field230);
    }

    @ObfuscatedName("k.ae(Llp;Ljp;I)I")
    public int method350(class324 arg0, class273 arg1) {
        switch(arg1.field3557) {
            case 0:
                return -arg0.field3872 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3872;
        }
    }

    @ObfuscatedName("k.ap(Llp;Liz;I)I")
    public int method316(class324 arg0, class255 arg1) {
        switch(arg1.field3288) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3871 / 2;
            default:
                return -arg0.field3871;
        }
    }

    @ObfuscatedName("k.ar(IS)Lif;")
    public class258 method317(int arg0) {
        class271 var2 = class271.method1776(arg0);
        if (var2.field3488 != null) {
            var2 = var2.method4721();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3447 == -1 ? null : class258.method3139(var2.field3447);
    }

    @ObfuscatedName("k.ab(IB)Li;")
    public class23 method318(int arg0) {
        class258 var2 = class258.method3139(arg0);
        return this.method319(var2);
    }

    @ObfuscatedName("k.aq(Lif;S)Li;")
    public class23 method319(class258 arg0) {
        if (arg0.field3306 == null || this.field229 == null || this.field229.get(class13.field104) == null) {
            return null;
        }
        int var2 = arg0.field3310;
        class13[] var3 = new class13[] { class13.field104, class13.field97, class13.field96 };
        class13[] var4 = var3;
        int var5 = 0;
        class13 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class13 var6 = var4[var5];
            if (var6.field99 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class301 var9 = (class301) this.field229.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5207(arg0.field3306, 1000000);
        String[] var11 = new String[var10];
        var9.method5205(arg0.field3306, (int[]) null, var11);
        int var12 = var11.length * var9.field3762 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method5278(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class23(arg0.field3306, var13, var12, var7);
    }

    @ObfuscatedName("k.au(IIIIII)Ljava/util/List;")
    public List method408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field225.values().iterator();
            while (var7.hasNext()) {
                class29 var8 = (class29) var7.next();
                if (var8.method450(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field215.iterator();
            while (var9.hasNext()) {
                class29 var10 = (class29) var9.next();
                if (var10.method450(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("k.aj(I)Ljava/util/List;")
    public List method347() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field215);
        var1.addAll(this.field225.values());
        return var1;
    }

    @ObfuscatedName("k.ah(IIIII)V")
    public void method322(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class320.method5522(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, arg3);
        }
        if (var5 == 1) {
            class320.method5529(this.field226 * arg0, this.field226 * (63 - arg1), this.field226, arg3);
        }
        if (var5 == 2) {
            class320.method5522(this.field226 * arg0 + this.field226 - 1, this.field226 * (63 - arg1), this.field226, arg3);
        }
        if (var5 == 3) {
            class320.method5529(this.field226 * arg0, this.field226 * (63 - arg1) + this.field226 - 1, this.field226, arg3);
        }
    }

    @ObfuscatedName("k.ai(III)I")
    public int method323(int arg0, int arg1) {
        if (this.field223 != null) {
            return this.field223.method159(arg0, arg1);
        }
        if (!this.field232.isEmpty()) {
            Iterator var3 = this.field232.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                if (var4.method535(arg0, arg1)) {
                    return var4.method159(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
