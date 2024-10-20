package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("r")
public class class24 {

    @ObfuscatedName("r.t")
    public static class204 field206 = new class204(37748736, 256);

    @ObfuscatedName("r.p")
    public static class204 field210 = new class204(256, 256);

    @ObfuscatedName("r.l")
    public int field209;

    @ObfuscatedName("r.b")
    public int field212;

    @ObfuscatedName("r.c")
    public class11 field213;

    @ObfuscatedName("r.d")
    public LinkedList field214;

    @ObfuscatedName("r.w")
    public int field208;

    @ObfuscatedName("r.a")
    public int field216;

    @ObfuscatedName("r.z")
    public List field215;

    @ObfuscatedName("r.e")
    public HashMap field218;

    @ObfuscatedName("r.q")
    public final HashMap field219;

    @ObfuscatedName("r.j")
    public static final class229 field217 = new class229();

    @ObfuscatedName("dv.v(IIII)J")
    public static long method2352(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("f.s(IIIB)Llh;")
    public static class322 method305(int arg0, int arg1, int arg2) {
        return (class322) field206.method3706(method2352(arg0, arg1, arg2));
    }

    @ObfuscatedName("ci.o(Llh;IIIS)V")
    public static void method1762(class322 arg0, int arg1, int arg2, int arg3) {
        field206.method3709(arg0, method2352(arg1, arg2, arg3), arg0.field3826.length * 4);
    }

    @ObfuscatedName("ke.k(III)Lx;")
    public static class22 method5138(int arg0, int arg1) {
        return (class22) field210.method3706(method2352(arg0, arg1, 0));
    }

    @ObfuscatedName("r.u(I)V")
    public static void method459() {
        field206.method3729();
        field210.method3729();
    }

    @ObfuscatedName("client.i(B)V")
    public static void method1450() {
        field206.method3710(5);
        field210.method3710(5);
    }

    public class24(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field209 = arg0;
        this.field212 = arg1;
        this.field214 = new LinkedList();
        this.field215 = new LinkedList();
        this.field218 = new HashMap();
        this.field208 = arg2 | 0xFF000000;
        this.field219 = arg3;
    }

    @ObfuscatedName("r.t(IIII)V")
    public void method385(int arg0, int arg1, int arg2) {
        int var4 = this.field209;
        int var5 = this.field212;
        int var6 = this.field216;
        class322 var7 = (class322) field206.method3706(method2352(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field216 * 64 == arg2) {
            var7.method5496(arg0, arg1);
        } else {
            var7.method5523(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("r.c(Lc;Ljava/util/List;I)V")
    public void method310(class11 arg0, List arg1) {
        this.field218.clear();
        this.field213 = arg0;
        this.method353(0, 0, 64, 64, this.field213);
        this.method313(arg1);
    }

    @ObfuscatedName("r.w(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method311(HashSet arg0, List arg1) {
        this.field218.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            if (var4.method190() == this.field209 && var4.method185() == this.field212) {
                this.field214.add(var4);
                this.method353(var4.method548() * 8, var4.method551() * 8, 8, 8, var4);
            }
        }
        this.method313(arg1);
    }

    @ObfuscatedName("r.a(IIIILq;B)V")
    public void method353(int arg0, int arg1, int arg2, int arg3, class17 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class229 var8 = new class229(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field134; var9++) {
                    class20[] var10 = arg4.field139[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class20[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class20 var13 = var11[var12];
                            class258 var14 = this.method340(var13.field170);
                            if (var14 != null) {
                                class229 var15 = new class229(var9, this.field209 * 64 + var6, this.field212 * 64 + var7);
                                Object var16 = null;
                                class229 var17;
                                if (this.field213 == null) {
                                    class35 var18 = (class35) arg4;
                                    var17 = new class229(var18.field137 + var9, var18.field133 * 64 + var6 + var18.method569() * 8, var18.field142 * 64 + var7 + var18.method545() * 8);
                                } else {
                                    var17 = new class229(this.field213.field137 + var9, this.field213.field133 * 64 + var6, this.field213.field142 * 64 + var7);
                                }
                                class29 var19 = new class29(var14.field3266, var17, var15, this.method342(var14));
                                this.field218.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.z(Ljava/util/List;I)V")
    public void method313(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class14 var3 = (class14) var2.next();
            if (var3.field95.field2603 >> 6 == this.field209 && var3.field95.field2605 >> 6 == this.field212) {
                class29 var4 = new class29(var3.field100, var3.field95, var3.field95, this.method319(var3.field100));
                this.field215.add(var4);
            }
        }
    }

    @ObfuscatedName("r.e(ILaj;[Lr;[Lld;B)V")
    public void method314(int arg0, class36 arg1, class24[] arg2, class321[] arg3) {
        this.field216 = arg0;
        if (this.field213 == null && this.field214.isEmpty() || method305(this.field209, this.field212, arg0) != null) {
            return;
        }
        class22 var5 = this.method346(this.field209, this.field212, arg2);
        class322 var6 = new class322(this.field216 * 64, this.field216 * 64);
        var6.method5493();
        if (this.field213 == null) {
            this.method318(arg1, arg3, var5);
        } else {
            this.method317(arg1, arg2, arg3, var5);
        }
        method1762(var6, this.field209, this.field212, this.field216);
    }

    @ObfuscatedName("r.q(IIILjava/util/HashSet;B)V")
    public void method341(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method330(arg0, arg1, arg3, arg2);
        this.method323(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("r.j(Ljava/util/HashSet;IIS)V")
    public void method316(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field218.values().iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            if (arg0.contains(var5.field251)) {
                class258 var6 = Statics.field2412[var5.field251];
                this.method332(var6, var5.field252, var5.field253, arg1, arg2);
            }
        }
        this.method374(arg0, arg1, arg2);
    }

    @ObfuscatedName("r.y(Laj;[Lr;[Lld;Lx;I)V")
    public void method317(class36 arg0, class24[] arg1, class321[] arg2, class22 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method312(var5, var6, this.field213, arg0, arg3);
                this.method321(var5, var6, this.field213, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method388(var7, var8, this.field213, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("r.m(Laj;[Lld;Lx;I)V")
    public void method318(class36 arg0, class321[] arg1, class22 arg2) {
        Iterator var4 = this.field214.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            for (int var6 = var5.method548() * 8; var6 < var5.method548() * 8 + 8; var6++) {
                for (int var7 = var5.method551() * 8; var7 < var5.method551() * 8 + 8; var7++) {
                    this.method312(var6, var7, var5, arg0, arg2);
                    this.method321(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field214.iterator();
        while (var8.hasNext()) {
            class35 var9 = (class35) var8.next();
            for (int var10 = var9.method548() * 8; var10 < var9.method548() * 8 + 8; var10++) {
                for (int var11 = var9.method551() * 8; var11 < var9.method551() * 8 + 8; var11++) {
                    this.method388(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("r.h(IILq;Laj;[Lld;I)V")
    public void method388(int arg0, int arg1, class17 arg2, class36 arg3, class321[] arg4) {
        this.method408(arg0, arg1, arg2);
        this.method328(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("r.x(IILq;Laj;Lx;I)V")
    public void method312(int arg0, int arg1, class17 arg2, class36 arg3, class22 arg4) {
        int var6 = arg2.field135[0][arg0][arg1] - 1;
        int var7 = arg2.field136[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class318.method5408(this.field216 * arg0, this.field216 * (63 - arg1), this.field216, this.field216, this.field208);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class27.method2848(var7, this.field208);
        }
        if (var7 > -1 && arg2.field130[0][arg0][arg1] == 0) {
            class318.method5408(this.field216 * arg0, this.field216 * (63 - arg1), this.field216, this.field216, var8);
            return;
        }
        int var9 = this.method327(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class318.method5408(this.field216 * arg0, this.field216 * (63 - arg1), this.field216, this.field216, var9);
        } else {
            arg3.method608(this.field216 * arg0, this.field216 * (63 - arg1), var9, var8, this.field216, this.field216, arg2.field130[0][arg0][arg1], arg2.field138[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("r.f(IILq;Laj;I)V")
    public void method321(int arg0, int arg1, class17 arg2, class36 arg3) {
        for (int var5 = 1; var5 < arg2.field134; var5++) {
            int var6 = arg2.field136[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class27.method2848(var6, this.field208);
                if (arg2.field130[var5][arg0][arg1] == 0) {
                    class318.method5408(this.field216 * arg0, this.field216 * (63 - arg1), this.field216, this.field216, var7);
                } else {
                    arg3.method608(this.field216 * arg0, this.field216 * (63 - arg1), 0, var7, this.field216, this.field216, arg2.field130[var5][arg0][arg1], arg2.field138[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("r.r(II[Lr;I)Lx;")
    public class22 method346(int arg0, int arg1, class24[] arg2) {
        class22 var4 = method5138(arg0, arg1);
        if (var4 == null) {
            var4 = this.method322(arg2);
            field210.method3732(var4, method2352(arg0, arg1, 0));
        }
        return var4;
    }

    @ObfuscatedName("r.n([Lr;I)Lx;")
    public class22 method322(class24[] arg0) {
        class33 var2 = new class33(64, 64);
        if (this.field213 == null) {
            Iterator var3 = this.field214.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                this.method325(var4.method548() * 8, var4.method551() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method325(0, 0, 64, 64, this.field213, var2);
        }
        this.method324(arg0, var2);
        class22 var5 = new class22();
        var5.method296(var2);
        return var5;
    }

    @ObfuscatedName("r.g([Lr;Laf;I)V")
    public void method324(class24[] arg0, class33 arg1) {
        class243[] var3 = new class243[] { class243.field3129, class243.field3140, class243.field3141, class243.field3132, class243.field3134, class243.field3133, class243.field3130, class243.field3131 };
        class243[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class243 var7 = var5[var6];
            if (arg0[var7.method174()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3137) {
                    case 0:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 1:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 2:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                }
                this.method326(var12, var13, var8, var9, var10, var11, arg0[var7.method174()], arg1);
            }
        }
    }

    @ObfuscatedName("r.ab(IIIILq;Laf;I)V")
    public void method325(int arg0, int arg1, int arg2, int arg3, class17 arg4, class33 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field135[0][var7][var8] - 1;
                if (var9 != -1) {
                    class262 var10 = class262.method4013(var9);
                    arg5.method530(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("r.ao(IIIIIILr;Laf;B)V")
    public void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class24 arg6, class33 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method451(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class262 var12 = class262.method4013(var11);
                    arg7.method530(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("r.an(IILq;Lx;I)I")
    public int method327(int arg0, int arg1, class17 arg2, class22 arg3) {
        return arg2.field135[0][arg0][arg1] == 0 ? this.field208 : arg3.method301(arg0, arg1);
    }

    @ObfuscatedName("r.ay(IILq;[Lld;I)V")
    public void method328(int arg0, int arg1, class17 arg2, class321[] arg3) {
        for (int var5 = 0; var5 < arg2.field134; var5++) {
            class20[] var6 = arg2.field139[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class20[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class20 var9 = var7[var8];
                    if (!class236.method3090(var9.field164)) {
                        int var10 = var9.field164;
                        boolean var11 = class236.field2806.field2807 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class271 var12 = class271.method4255(var9.field170);
                    if (var12.field3431 != -1) {
                        if (var12.field3431 == 46 || var12.field3431 == 52) {
                            arg3[var12.field3431].method5474(this.field216 * arg0, this.field216 * (63 - arg1), this.field216 * 2 + 1, this.field216 * 2 + 1);
                        } else {
                            arg3[var12.field3431].method5474(this.field216 * arg0, this.field216 * (63 - arg1), this.field216 * 2, this.field216 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.av(IILq;S)V")
    public void method408(int arg0, int arg1, class17 arg2) {
        for (int var4 = 0; var4 < arg2.field134; var4++) {
            class20[] var5 = arg2.field139[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    if (class236.method1788(var8.field164)) {
                        class271 var9 = class271.method4255(var8.field170);
                        int var10 = var9.field3421 == 0 ? -3355444 : -3407872;
                        if (class236.field2794.field2807 == var8.field164) {
                            this.method355(arg0, arg1, var8.field167, var10);
                        }
                        if (class236.field2786.field2807 == var8.field164) {
                            this.method355(arg0, arg1, var8.field167, -3355444);
                            this.method355(arg0, arg1, var8.field167 + 1, var10);
                        }
                        if (class236.field2787.field2807 == var8.field164) {
                            if (var8.field167 == 0) {
                                class318.method5404(this.field216 * arg0, this.field216 * (63 - arg1), 1, var10);
                            }
                            if (var8.field167 == 1) {
                                class318.method5404(this.field216 * arg0 + this.field216 - 1, this.field216 * (63 - arg1), 1, var10);
                            }
                            if (var8.field167 == 2) {
                                class318.method5404(this.field216 * arg0 + this.field216 - 1, this.field216 * (63 - arg1) + this.field216 - 1, 1, var10);
                            }
                            if (var8.field167 == 3) {
                                class318.method5404(this.field216 * arg0, this.field216 * (63 - arg1) + this.field216 - 1, 1, var10);
                            }
                        }
                        if (class236.field2804.field2807 == var8.field164) {
                            int var11 = var8.field167 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field216; var12++) {
                                    class318.method5404(this.field216 * arg0 + var12, this.field216 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field216; var13++) {
                                    class318.method5404(this.field216 * arg0 + var13, this.field216 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.af(IILjava/util/HashSet;II)V")
    public void method330(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field218.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class229 var9 = (class229) var8.getKey();
            int var10 = (int) ((float) var9.field2603 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2605 * var5 - var6);
            class29 var12 = (class29) var8.getValue();
            if (var12 != null) {
                var12.field252 = var10;
                var12.field253 = var11;
                class258 var13 = Statics.field2412[var12.field251];
                if (!arg2.contains(var13.method4482())) {
                    this.method333(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("r.ar(Ljava/util/HashSet;III)V")
    public void method374(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field215.iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            class258 var6 = Statics.field2412[var5.field251];
            if (var6 != null && arg0.contains(var6.method4482())) {
                this.method332(var6, var5.field252, var5.field253, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("r.am(Liu;IIIII)V")
    public void method332(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        class322 var6 = arg0.method4480(false);
        if (var6 == null) {
            return;
        }
        var6.method5502(arg1 - var6.field3823 / 2, arg2 - var6.field3825 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class318.method5405(arg1, arg2, 15, 16776960, 128);
            class318.method5405(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("r.aj(Lao;IIFI)V")
    public void method333(class29 arg0, int arg1, int arg2, float arg3) {
        class258 var5 = Statics.field2412[arg0.field251];
        this.method329(var5, arg1, arg2);
        this.method335(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("r.aq(Liu;IIS)V")
    public void method329(class258 arg0, int arg1, int arg2) {
        class322 var4 = arg0.method4480(false);
        if (var4 != null) {
            int var5 = this.method338(var4, arg0.field3279);
            int var6 = this.method339(var4, arg0.field3280);
            var4.method5502(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("r.ak(Lao;Liu;IIFI)V")
    public void method335(class29 arg0, class258 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field249 != null && arg0.field249.field201.method133(arg4)) {
            class301 var6 = (class301) this.field219.get(arg0.field249.field201);
            var6.method5209(arg0.field249.field203, arg2 - arg0.field249.field199 / 2, arg3, arg0.field249.field199, arg0.field249.field198, 0xFF000000 | arg1.field3270, 0, 1, 0, var6.field3728 / 2);
        }
    }

    @ObfuscatedName("r.ax(IILjava/util/HashSet;IB)V")
    public void method323(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field215.iterator();
        while (var6.hasNext()) {
            class29 var7 = (class29) var6.next();
            int var8 = var7.field247.field2603 % 64;
            int var9 = var7.field247.field2605 % 64;
            var7.field252 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field253 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field251)) {
                this.method333(var7, var7.field252, var7.field253, var5);
            }
        }
    }

    @ObfuscatedName("r.aw(I)V")
    public void method336() {
        if (this.field213 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method337(var1, var2, this.field213);
                }
            }
            return;
        }
        Iterator var3 = this.field214.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            for (int var5 = var4.method548() * 8; var5 < var4.method548() * 8 + 8; var5++) {
                for (int var6 = var4.method551() * 8; var6 < var4.method551() * 8 + 8; var6++) {
                    this.method337(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("r.au(IILq;I)V")
    public void method337(int arg0, int arg1, class17 arg2) {
        field217.method4108(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field134; var4++) {
            class20[] var5 = arg2.field139[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    class258 var9 = this.method340(var8.field170);
                    if (var9 != null) {
                        class29 var10 = (class29) this.field218.get(field217);
                        if (var10 != null) {
                            if (var9.field3266 != var10.field251) {
                                class29 var11 = new class29(var9.field3266, var10.field246, var10.field247, this.method342(var9));
                                this.field218.put(new class229(field217), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field246.field2606 - var10.field247.field2606;
                            var10.field247.field2606 = var4;
                            var10.field246.field2606 = var4 + var12;
                            return;
                        }
                        class229 var13 = new class229(var4, this.field209 * 64 + arg0, this.field212 * 64 + arg1);
                        class229 var14 = null;
                        if (this.field213 == null) {
                            Iterator var15 = this.field214.iterator();
                            while (var15.hasNext()) {
                                class35 var16 = (class35) var15.next();
                                if (var16.method550(arg0, arg1)) {
                                    var14 = new class229(var16.field137 + var4, var16.field133 * 64 + arg0 + var16.method569() * 8, var16.field142 * 64 + arg1 + var16.method545() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class229(this.field213.field137 + var4, this.field213.field133 * 64 + arg0, this.field213.field142 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class29 var17 = new class29(var9.field3266, var14, var13, this.method342(var9));
                            this.field218.put(new class229(field217), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field218.remove(field217);
    }

    @ObfuscatedName("r.ad(Llh;Ljw;B)I")
    public int method338(class322 arg0, class273 arg1) {
        switch(arg1.field3510) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3823 / 2;
            default:
                return -arg0.field3823;
        }
    }

    @ObfuscatedName("r.ah(Llh;Liw;B)I")
    public int method339(class322 arg0, class255 arg1) {
        switch(arg1.field3250) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3825 / 2;
            default:
                return -arg0.field3825;
        }
    }

    @ObfuscatedName("r.as(II)Liu;")
    public class258 method340(int arg0) {
        class271 var2 = class271.method4255(arg0);
        if (var2.field3412 != null) {
            var2 = var2.method4707();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3430 == -1 ? null : Statics.field2412[var2.field3430];
    }

    @ObfuscatedName("r.ag(II)Lf;")
    public class23 method319(int arg0) {
        class258 var2 = Statics.field2412[arg0];
        return this.method342(var2);
    }

    @ObfuscatedName("r.at(Liu;B)Lf;")
    public class23 method342(class258 arg0) {
        if (arg0.field3267 == null || this.field219 == null || this.field219.get(class13.field88) == null) {
            return null;
        }
        class13 var2 = class13.method135(arg0.field3271);
        if (var2 == null) {
            return null;
        }
        class301 var3 = (class301) this.field219.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5157(arg0.field3267, 1000000);
        String[] var5 = new String[var4];
        var3.method5155(arg0.field3267, (int[]) null, var5);
        int var6 = var5.length * var3.field3728 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5154(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class23(arg0.field3267, var7, var6, var2);
    }

    @ObfuscatedName("r.ae(IIIIII)Ljava/util/List;")
    public List method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field218.values().iterator();
            while (var7.hasNext()) {
                class29 var8 = (class29) var7.next();
                if (var8.method482(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field215.iterator();
            while (var9.hasNext()) {
                class29 var10 = (class29) var9.next();
                if (var10.method482(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("r.ap(I)Ljava/util/List;")
    public List method344() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field215);
        var1.addAll(this.field218.values());
        return var1;
    }

    @ObfuscatedName("r.ai(IIIIB)V")
    public void method355(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class318.method5387(this.field216 * arg0, this.field216 * (63 - arg1), this.field216, arg3);
        }
        if (var5 == 1) {
            class318.method5404(this.field216 * arg0, this.field216 * (63 - arg1), this.field216, arg3);
        }
        if (var5 == 2) {
            class318.method5387(this.field216 * arg0 + this.field216 - 1, this.field216 * (63 - arg1), this.field216, arg3);
        }
        if (var5 == 3) {
            class318.method5404(this.field216 * arg0, this.field216 * (63 - arg1) + this.field216 - 1, this.field216, arg3);
        }
    }

    @ObfuscatedName("r.aa(IIB)I")
    public int method451(int arg0, int arg1) {
        if (this.field213 != null) {
            return this.field213.method189(arg0, arg1);
        }
        if (!this.field214.isEmpty()) {
            Iterator var3 = this.field214.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                if (var4.method550(arg0, arg1)) {
                    return var4.method189(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
