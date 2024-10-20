package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("r")
public class class24 {

    @ObfuscatedName("r.h")
    public static class202 field204 = new class202(37748736, 256);

    @ObfuscatedName("r.x")
    public static class202 field205 = new class202(256, 256);

    @ObfuscatedName("r.j")
    public int field206;

    @ObfuscatedName("r.a")
    public int field207;

    @ObfuscatedName("r.l")
    public class11 field216;

    @ObfuscatedName("r.d")
    public LinkedList field209;

    @ObfuscatedName("r.s")
    public int field210;

    @ObfuscatedName("r.p")
    public int field211;

    @ObfuscatedName("r.g")
    public List field212;

    @ObfuscatedName("r.y")
    public HashMap field208;

    @ObfuscatedName("r.c")
    public final HashMap field214;

    @ObfuscatedName("r.e")
    public static final class227 field201 = new class227();

    @ObfuscatedName("dn.w(IIII)J")
    public static long method2599(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("ah.m(IIII)Llc;")
    public static class319 method616(int arg0, int arg1, int arg2) {
        return (class319) field204.method3717(method2599(arg0, arg1, arg2));
    }

    @ObfuscatedName("ah.q(Lz;III)V")
    public static void method597(class22 arg0, int arg1, int arg2) {
        field205.method3720(arg0, method2599(arg1, arg2, 0));
    }

    @ObfuscatedName("bw.x(I)V")
    public static void method1626() {
        field204.method3732(5);
        field205.method3732(5);
    }

    public class24(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field206 = arg0;
        this.field207 = arg1;
        this.field209 = new LinkedList();
        this.field212 = new LinkedList();
        this.field208 = new HashMap();
        this.field210 = arg2 | 0xFF000000;
        this.field214 = arg3;
    }

    @ObfuscatedName("r.j(IIII)V")
    public void method396(int arg0, int arg1, int arg2) {
        class319 var4 = method616(this.field206, this.field207, this.field211);
        if (var4 == null) {
            return;
        }
        if (this.field211 * 64 == arg2) {
            var4.method5450(arg0, arg1);
        } else {
            var4.method5441(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("r.a(Ll;Ljava/util/List;B)V")
    public void method288(class11 arg0, List arg1) {
        this.field208.clear();
        this.field216 = arg0;
        this.method290(0, 0, 64, 64, this.field216);
        this.method291(arg1);
    }

    @ObfuscatedName("r.l(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method356(HashSet arg0, List arg1) {
        this.field208.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            if (var4.method183() == this.field206 && var4.method171() == this.field207) {
                this.field209.add(var4);
                this.method290(var4.method546() * 8, var4.method547() * 8, 8, 8, var4);
            }
        }
        this.method291(arg1);
    }

    @ObfuscatedName("r.d(IIIILc;I)V")
    public void method290(int arg0, int arg1, int arg2, int arg3, class17 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class227 var8 = new class227(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field135; var9++) {
                    class20[] var10 = arg4.field140[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class20[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class20 var13 = var11[var12];
                            class256 var14 = this.method329(var13.field164);
                            if (var14 != null) {
                                class227 var15 = new class227(var9, this.field206 * 64 + var6, this.field207 * 64 + var7);
                                Object var16 = null;
                                class227 var17;
                                if (this.field216 == null) {
                                    class35 var18 = (class35) arg4;
                                    var17 = new class227(var18.field134 + var9, var18.field132 * 64 + var6 + var18.method541() * 8, var18.field136 * 64 + var7 + var18.method549() * 8);
                                } else {
                                    var17 = new class227(this.field216.field134 + var9, this.field216.field132 * 64 + var6, this.field216.field136 * 64 + var7);
                                }
                                class29 var19 = new class29(var14.field3262, var17, var15, this.method321(var14));
                                this.field208.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.s(Ljava/util/List;I)V")
    public void method291(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class14 var3 = (class14) var2.next();
            if (var3.field101.field2582 >> 6 == this.field206 && var3.field101.field2584 >> 6 == this.field207) {
                class29 var4 = new class29(var3.field104, var3.field101, var3.field101, this.method431(var3.field104));
                this.field212.add(var4);
            }
        }
    }

    @ObfuscatedName("r.p(ILah;[Lr;[Llh;B)V")
    public void method292(int arg0, class36 arg1, class24[] arg2, class318[] arg3) {
        this.field211 = arg0;
        if (this.field216 == null && this.field209.isEmpty()) {
            return;
        }
        int var5 = this.field206;
        int var6 = this.field207;
        class319 var7 = (class319) field204.method3717(method2599(var5, var6, arg0));
        if (var7 != null) {
            return;
        }
        class22 var8 = this.method302(this.field206, this.field207, arg2);
        class319 var9 = new class319(this.field211 * 64, this.field211 * 64);
        var9.method5443();
        if (this.field216 == null) {
            this.method425(arg1, arg3, var8);
        } else {
            this.method286(arg1, arg2, arg3, var8);
        }
        int var10 = this.field206;
        int var11 = this.field207;
        int var12 = this.field211;
        field204.method3718(var9, method2599(var10, var11, var12), var9.field3799.length * 4);
    }

    @ObfuscatedName("r.g(IIILjava/util/HashSet;B)V")
    public void method293(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method308(arg0, arg1, arg3, arg2);
        this.method314(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("r.y(Ljava/util/HashSet;III)V")
    public void method294(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field208.values().iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            if (arg0.contains(var5.field252)) {
                class256 var6 = Statics.field3275[var5.field252];
                this.method310(var6, var5.field253, var5.field249, arg1, arg2);
            }
        }
        this.method309(arg0, arg1, arg2);
    }

    @ObfuscatedName("r.c(Lah;[Lr;[Llh;Lz;I)V")
    public void method286(class36 arg0, class24[] arg1, class318[] arg2, class22 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method298(var5, var6, this.field216, arg0, arg3);
                this.method299(var5, var6, this.field216, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method289(var7, var8, this.field216, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("r.e(Lah;[Llh;Lz;I)V")
    public void method425(class36 arg0, class318[] arg1, class22 arg2) {
        Iterator var4 = this.field209.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            for (int var6 = var5.method546() * 8; var6 < var5.method546() * 8 + 8; var6++) {
                for (int var7 = var5.method547() * 8; var7 < var5.method547() * 8 + 8; var7++) {
                    this.method298(var6, var7, var5, arg0, arg2);
                    this.method299(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field209.iterator();
        while (var8.hasNext()) {
            class35 var9 = (class35) var8.next();
            for (int var10 = var9.method546() * 8; var10 < var9.method546() * 8 + 8; var10++) {
                for (int var11 = var9.method547() * 8; var11 < var9.method547() * 8 + 8; var11++) {
                    this.method289(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("r.t(IILc;Lah;[Llh;I)V")
    public void method289(int arg0, int arg1, class17 arg2, class36 arg3, class318[] arg4) {
        this.method307(arg0, arg1, arg2);
        this.method306(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("r.u(IILc;Lah;Lz;I)V")
    public void method298(int arg0, int arg1, class17 arg2, class36 arg3, class22 arg4) {
        int var6 = arg2.field130[0][arg0][arg1] - 1;
        int var7 = arg2.field131[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class315.method5400(this.field211 * arg0, this.field211 * (63 - arg1), this.field211, this.field211, this.field210);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class27.method123(var7, this.field210);
        }
        if (var7 > -1 && arg2.field138[0][arg0][arg1] == 0) {
            class315.method5400(this.field211 * arg0, this.field211 * (63 - arg1), this.field211, this.field211, var8);
            return;
        }
        int var9 = this.method305(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class315.method5400(this.field211 * arg0, this.field211 * (63 - arg1), this.field211, this.field211, var9);
        } else {
            arg3.method569(this.field211 * arg0, this.field211 * (63 - arg1), var9, var8, this.field211, this.field211, arg2.field138[0][arg0][arg1], arg2.field139[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("r.i(IILc;Lah;S)V")
    public void method299(int arg0, int arg1, class17 arg2, class36 arg3) {
        for (int var5 = 1; var5 < arg2.field135; var5++) {
            int var6 = arg2.field131[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class27.method123(var6, this.field210);
                if (arg2.field138[var5][arg0][arg1] == 0) {
                    class315.method5400(this.field211 * arg0, this.field211 * (63 - arg1), this.field211, this.field211, var7);
                } else {
                    arg3.method569(this.field211 * arg0, this.field211 * (63 - arg1), 0, var7, this.field211, this.field211, arg2.field138[var5][arg0][arg1], arg2.field139[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("r.r(II[Lr;I)Lz;")
    public class22 method302(int arg0, int arg1, class24[] arg2) {
        class22 var4 = (class22) field205.method3717(method2599(arg0, arg1, 0));
        class22 var5 = var4;
        if (var4 == null) {
            var5 = this.method432(arg2);
            method597(var5, arg0, arg1);
        }
        return var5;
    }

    @ObfuscatedName("r.v([Lr;I)Lz;")
    public class22 method432(class24[] arg0) {
        class33 var2 = new class33(64, 64);
        if (this.field216 == null) {
            Iterator var3 = this.field209.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                this.method413(var4.method546() * 8, var4.method547() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method413(0, 0, 64, 64, this.field216, var2);
        }
        this.method300(arg0, var2);
        class22 var5 = new class22();
        var5.method274(var2);
        return var5;
    }

    @ObfuscatedName("r.o([Lr;Las;I)V")
    public void method300(class24[] arg0, class33 arg1) {
        class241[] var3 = new class241[] { class241.field3124, class241.field3128, class241.field3129, class241.field3122, class241.field3123, class241.field3121, class241.field3126, class241.field3125 };
        class241[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class241 var7 = var5[var6];
            if (arg0[var7.method159()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3127) {
                    case 0:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var9 = 59;
                        var11 = 5;
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
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 6:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var10 = 5;
                }
                this.method304(var12, var13, var8, var9, var10, var11, arg0[var7.method159()], arg1);
            }
        }
    }

    @ObfuscatedName("r.ai(IIIILc;Las;S)V")
    public void method413(int arg0, int arg1, int arg2, int arg3, class17 arg4, class33 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field130[0][var7][var8] - 1;
                if (var9 != -1) {
                    class260 var10 = class260.method2894(var9);
                    arg5.method519(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("r.at(IIIIIILr;Las;B)V")
    public void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class24 arg6, class33 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method311(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class260 var12 = class260.method2894(var11);
                    arg7.method519(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("r.ad(IILc;Lz;B)I")
    public int method305(int arg0, int arg1, class17 arg2, class22 arg3) {
        return arg2.field130[0][arg0][arg1] == 0 ? this.field210 : arg3.method283(arg0, arg1);
    }

    @ObfuscatedName("r.ac(IILc;[Llh;I)V")
    public void method306(int arg0, int arg1, class17 arg2, class318[] arg3) {
        for (int var5 = 0; var5 < arg2.field135; var5++) {
            class20[] var6 = arg2.field140[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class20[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class20 var9 = var7[var8];
                    if (class234.method4077(var9.field161) || class234.method2934(var9.field161)) {
                        class269 var10 = class269.method675(var9.field164);
                        if (var10.field3419 != -1) {
                            if (var10.field3419 == 46 || var10.field3419 == 52) {
                                arg3[var10.field3419].method5424(this.field211 * arg0, this.field211 * (63 - arg1), this.field211 * 2 + 1, this.field211 * 2 + 1);
                            } else {
                                arg3[var10.field3419].method5424(this.field211 * arg0, this.field211 * (63 - arg1), this.field211 * 2, this.field211 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.ay(IILc;I)V")
    public void method307(int arg0, int arg1, class17 arg2) {
        for (int var4 = 0; var4 < arg2.field135; var4++) {
            class20[] var5 = arg2.field140[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    int var9 = var8.field161;
                    boolean var10 = var9 >= class234.field2792.field2780 && var9 <= class234.field2776.field2780 || class234.field2777.field2780 == var9;
                    if (var10) {
                        class269 var11 = class269.method675(var8.field164);
                        int var12 = var11.field3409 == 0 ? -3355444 : -3407872;
                        if (class234.field2792.field2780 == var8.field161) {
                            this.method324(arg0, arg1, var8.field166, var12);
                        }
                        if (class234.field2775.field2780 == var8.field161) {
                            this.method324(arg0, arg1, var8.field166, -3355444);
                            this.method324(arg0, arg1, var8.field166 + 1, var12);
                        }
                        if (class234.field2776.field2780 == var8.field161) {
                            if (var8.field166 == 0) {
                                class315.method5345(this.field211 * arg0, this.field211 * (63 - arg1), 1, var12);
                            }
                            if (var8.field166 == 1) {
                                class315.method5345(this.field211 * arg0 + this.field211 - 1, this.field211 * (63 - arg1), 1, var12);
                            }
                            if (var8.field166 == 2) {
                                class315.method5345(this.field211 * arg0 + this.field211 - 1, this.field211 * (63 - arg1) + this.field211 - 1, 1, var12);
                            }
                            if (var8.field166 == 3) {
                                class315.method5345(this.field211 * arg0, this.field211 * (63 - arg1) + this.field211 - 1, 1, var12);
                            }
                        }
                        if (class234.field2777.field2780 == var8.field161) {
                            int var13 = var8.field166 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field211; var14++) {
                                    class315.method5345(this.field211 * arg0 + var14, this.field211 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field211; var15++) {
                                    class315.method5345(this.field211 * arg0 + var15, this.field211 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.an(IILjava/util/HashSet;IB)V")
    public void method308(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field208.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class227 var9 = (class227) var8.getKey();
            int var10 = (int) ((float) var9.field2582 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2584 * var5 - var6);
            class29 var12 = (class29) var8.getValue();
            if (var12 != null) {
                var12.field253 = var10;
                var12.field249 = var11;
                class256 var13 = Statics.field3275[var12.field252];
                if (!arg2.contains(var13.method4444())) {
                    this.method339(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("r.as(Ljava/util/HashSet;III)V")
    public void method309(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field212.iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            class256 var6 = Statics.field3275[var5.field252];
            if (var6 != null && arg0.contains(var6.method4444())) {
                this.method310(var6, var5.field253, var5.field249, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("r.aw(Lin;IIIII)V")
    public void method310(class256 arg0, int arg1, int arg2, int arg3, int arg4) {
        class319 var6 = arg0.method4442(false);
        if (var6 == null) {
            return;
        }
        var6.method5448(arg1 - var6.field3795 / 2, arg2 - var6.field3802 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class315.method5383(arg1, arg2, 15, 16776960, 128);
            class315.method5383(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("r.ag(Lad;IIFI)V")
    public void method339(class29 arg0, int arg1, int arg2, float arg3) {
        class256 var5 = Statics.field3275[arg0.field252];
        this.method312(var5, arg1, arg2);
        this.method313(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("r.ah(Lin;IIB)V")
    public void method312(class256 arg0, int arg1, int arg2) {
        class319 var4 = arg0.method4442(false);
        if (var4 != null) {
            int var5 = this.method348(var4, arg0.field3274);
            int var6 = this.method383(var4, arg0.field3268);
            var4.method5448(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("r.az(Lad;Lin;IIFI)V")
    public void method313(class29 arg0, class256 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field256 != null && arg0.field256.field198.method122(arg4)) {
            class299 var6 = (class299) this.field214.get(arg0.field256.field198);
            var6.method5162(arg0.field256.field196, arg2 - arg0.field256.field193 / 2, arg3, arg0.field256.field193, arg0.field256.field194, 0xFF000000 | arg1.field3264, 0, 1, 0, var6.field3714 / 2);
        }
    }

    @ObfuscatedName("r.ao(IILjava/util/HashSet;IB)V")
    public void method314(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field212.iterator();
        while (var6.hasNext()) {
            class29 var7 = (class29) var6.next();
            int var8 = var7.field248.field2582 % 64;
            int var9 = var7.field248.field2584 % 64;
            var7.field253 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field249 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field252)) {
                this.method339(var7, var7.field253, var7.field249, var5);
            }
        }
    }

    @ObfuscatedName("r.ap(I)V")
    public void method315() {
        if (this.field216 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method316(var1, var2, this.field216);
                }
            }
            return;
        }
        Iterator var3 = this.field209.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            for (int var5 = var4.method546() * 8; var5 < var4.method546() * 8 + 8; var5++) {
                for (int var6 = var4.method547() * 8; var6 < var4.method547() * 8 + 8; var6++) {
                    this.method316(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("r.af(IILc;I)V")
    public void method316(int arg0, int arg1, class17 arg2) {
        field201.method4098(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field135; var4++) {
            class20[] var5 = arg2.field140[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    class256 var9 = this.method329(var8.field164);
                    if (var9 != null) {
                        class29 var10 = (class29) this.field208.get(field201);
                        if (var10 != null) {
                            if (var9.field3262 != var10.field252) {
                                class29 var11 = new class29(var9.field3262, var10.field254, var10.field248, this.method321(var9));
                                this.field208.put(new class227(field201), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field254.field2588 - var10.field248.field2588;
                            var10.field248.field2588 = var4;
                            var10.field254.field2588 = var4 + var12;
                            return;
                        }
                        class227 var13 = new class227(var4, this.field206 * 64 + arg0, this.field207 * 64 + arg1);
                        class227 var14 = null;
                        if (this.field216 == null) {
                            Iterator var15 = this.field209.iterator();
                            while (var15.hasNext()) {
                                class35 var16 = (class35) var15.next();
                                if (var16.method542(arg0, arg1)) {
                                    var14 = new class227(var16.field134 + var4, var16.field132 * 64 + arg0 + var16.method541() * 8, var16.field136 * 64 + arg1 + var16.method549() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class227(this.field216.field134 + var4, this.field216.field132 * 64 + arg0, this.field216.field136 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class29 var17 = new class29(var9.field3262, var14, var13, this.method321(var9));
                            this.field208.put(new class227(field201), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field208.remove(field201);
    }

    @ObfuscatedName("r.am(Llc;Lja;I)I")
    public int method348(class319 arg0, class271 arg1) {
        switch(arg1.field3495) {
            case 0:
                return -arg0.field3795 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3795;
        }
    }

    @ObfuscatedName("r.aq(Llc;Lis;I)I")
    public int method383(class319 arg0, class253 arg1) {
        switch(arg1.field3245) {
            case 1:
                return -arg0.field3802 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3802;
        }
    }

    @ObfuscatedName("r.aj(IS)Lin;")
    public class256 method329(int arg0) {
        class269 var2 = class269.method675(arg0);
        if (var2.field3431 != null) {
            var2 = var2.method4689();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3418 == -1 ? null : Statics.field3275[var2.field3418];
    }

    @ObfuscatedName("r.ae(IB)Lk;")
    public class23 method431(int arg0) {
        class256 var2 = Statics.field3275[arg0];
        return this.method321(var2);
    }

    @ObfuscatedName("r.au(Lin;I)Lk;")
    public class23 method321(class256 arg0) {
        if (arg0.field3263 == null || this.field214 == null || this.field214.get(class13.field94) == null) {
            return null;
        }
        class13 var2 = class13.method118(arg0.field3277);
        if (var2 == null) {
            return null;
        }
        class299 var3 = (class299) this.field214.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5112(arg0.field3263, 1000000);
        String[] var5 = new String[var4];
        var3.method5110(arg0.field3263, (int[]) null, var5);
        int var6 = var5.length * var3.field3714 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5109(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class23(arg0.field3263, var7, var6, var2);
    }

    @ObfuscatedName("r.av(IIIIII)Ljava/util/List;")
    public List method322(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field208.values().iterator();
            while (var7.hasNext()) {
                class29 var8 = (class29) var7.next();
                if (var8.method459(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field212.iterator();
            while (var9.hasNext()) {
                class29 var10 = (class29) var9.next();
                if (var10.method459(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("r.ab(B)Ljava/util/List;")
    public List method427() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field212);
        var1.addAll(this.field208.values());
        return var1;
    }

    @ObfuscatedName("r.aa(IIIII)V")
    public void method324(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class315.method5407(this.field211 * arg0, this.field211 * (63 - arg1), this.field211, arg3);
        }
        if (var5 == 1) {
            class315.method5345(this.field211 * arg0, this.field211 * (63 - arg1), this.field211, arg3);
        }
        if (var5 == 2) {
            class315.method5407(this.field211 * arg0 + this.field211 - 1, this.field211 * (63 - arg1), this.field211, arg3);
        }
        if (var5 == 3) {
            class315.method5345(this.field211 * arg0, this.field211 * (63 - arg1) + this.field211 - 1, this.field211, arg3);
        }
    }

    @ObfuscatedName("r.ar(III)I")
    public int method311(int arg0, int arg1) {
        if (this.field216 != null) {
            return this.field216.method169(arg0, arg1);
        }
        if (!this.field209.isEmpty()) {
            Iterator var3 = this.field209.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                if (var4.method542(arg0, arg1)) {
                    return var4.method169(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
