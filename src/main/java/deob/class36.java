package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ao")
public class class36 {

    @ObfuscatedName("ao.z")
    public static class214 field471 = new class214(37748736, 256);

    @ObfuscatedName("ao.p")
    public static class214 field459 = new class214(256, 256);

    @ObfuscatedName("ao.w")
    public int field460;

    @ObfuscatedName("ao.r")
    public int field457;

    @ObfuscatedName("ao.d")
    public class23 field458;

    @ObfuscatedName("ao.a")
    public LinkedList field463;

    @ObfuscatedName("ao.e")
    public int field464;

    @ObfuscatedName("ao.f")
    public int field465;

    @ObfuscatedName("ao.l")
    public List field472;

    @ObfuscatedName("ao.m")
    public HashMap field467;

    @ObfuscatedName("ao.b")
    public final HashMap field468;

    @ObfuscatedName("ao.h")
    public static final class239 field469 = new class239();

    @ObfuscatedName("y.c(IIII)Lla;")
    public static class332 method184(int arg0, int arg1, int arg2) {
        class214 var3 = field471;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class332) var3.method3641(var4);
    }

    @ObfuscatedName("gh.i(Lla;IIII)V")
    public static void method3472(class332 arg0, int arg1, int arg2, int arg3) {
        class214 var4 = field471;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3639(arg0, var6, arg0.field3987.length * 4);
    }

    @ObfuscatedName("r.o(B)V")
    public static void method51() {
        field471.method3650();
        field459.method3650();
    }

    public class36(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field460 = arg0;
        this.field457 = arg1;
        this.field463 = new LinkedList();
        this.field472 = new LinkedList();
        this.field467 = new HashMap();
        this.field464 = arg2 | 0xFF000000;
        this.field468 = arg3;
    }

    @ObfuscatedName("ao.j(IIII)V")
    public void method354(int arg0, int arg1, int arg2) {
        class332 var4 = method184(this.field460, this.field457, this.field465);
        if (var4 == null) {
            return;
        }
        if (this.field465 * 64 == arg2) {
            var4.method5441(arg0, arg1);
        } else {
            var4.method5463(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ao.k(Lq;Ljava/util/List;I)V")
    public void method472(class23 arg0, List arg1) {
        this.field467.clear();
        this.field458 = arg0;
        this.method357(0, 0, 64, 64, this.field458);
        this.method358(arg1);
    }

    @ObfuscatedName("ao.x(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method356(HashSet arg0, List arg1) {
        this.field467.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            if (var4.method247() == this.field460 && var4.method234() == this.field457) {
                this.field463.add(var4);
                this.method357(var4.method605() * 8, var4.method597() * 8, 8, 8, var4);
            }
        }
        this.method358(arg1);
    }

    @ObfuscatedName("ao.z(IIIILal;I)V")
    public void method357(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class239 var8 = new class239(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field392; var9++) {
                    class32[] var10 = arg4.field397[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class270 var14 = this.method388(var13.field421);
                            if (var14 != null) {
                                class239 var15 = new class239(var9, this.field460 * 64 + var6, this.field457 * 64 + var7);
                                Object var16 = null;
                                class239 var17;
                                if (this.field458 == null) {
                                    class47 var18 = (class47) arg4;
                                    var17 = new class239(var18.field393 + var9, var18.field391 * 64 + var6 + var18.method594() * 8, var18.field388 * 64 + var7 + var18.method595() * 8);
                                } else {
                                    var17 = new class239(this.field458.field393 + var9, this.field458.field391 * 64 + var6, this.field458.field388 * 64 + var7);
                                }
                                class41 var19 = new class41(var14.field3453, var17, var15, this.method473(var14));
                                this.field467.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.p(Ljava/util/List;S)V")
    public void method358(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field355.field2775 >> 6 == this.field460 && var3.field355.field2777 >> 6 == this.field457) {
                class41 var4 = new class41(var3.field356, var3.field355, var3.field355, this.method415(var3.field356));
                this.field472.add(var4);
            }
        }
    }

    @ObfuscatedName("ao.w(ILaz;[Lao;[Llq;B)V")
    public void method359(int arg0, class48 arg1, class36[] arg2, class331[] arg3) {
        this.field465 = arg0;
        if (this.field458 == null && this.field463.isEmpty() || method184(this.field460, this.field457, arg0) != null) {
            return;
        }
        class34 var5 = this.method382(this.field460, this.field457, arg2);
        class332 var6 = new class332(this.field465 * 64, this.field465 * 64);
        var6.method5476();
        if (this.field458 == null) {
            this.method363(arg1, arg3, var5);
        } else {
            this.method362(arg1, arg2, arg3, var5);
        }
        method3472(var6, this.field460, this.field457, this.field465);
    }

    @ObfuscatedName("ao.r(IIILjava/util/HashSet;I)V")
    public void method378(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method375(arg0, arg1, arg3, arg2);
        this.method381(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ao.d(Ljava/util/HashSet;III)V")
    public void method361(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field467.values().iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            if (arg0.contains(var5.field511)) {
                class270 var6 = Statics.field3472[var5.field511];
                this.method377(var6, var5.field506, var5.field512, arg1, arg2);
            }
        }
        this.method376(arg0, arg1, arg2);
    }

    @ObfuscatedName("ao.a(Laz;[Lao;[Llq;Laa;B)V")
    public void method362(class48 arg0, class36[] arg1, class331[] arg2, class34 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method425(var5, var6, this.field458, arg0, arg3);
                this.method384(var5, var6, this.field458, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method466(var7, var8, this.field458, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ao.b(Laz;[Llq;Laa;B)V")
    public void method363(class48 arg0, class331[] arg1, class34 arg2) {
        Iterator var4 = this.field463.iterator();
        while (var4.hasNext()) {
            class47 var5 = (class47) var4.next();
            for (int var6 = var5.method605() * 8; var6 < var5.method605() * 8 + 8; var6++) {
                for (int var7 = var5.method597() * 8; var7 < var5.method597() * 8 + 8; var7++) {
                    this.method425(var6, var7, var5, arg0, arg2);
                    this.method384(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field463.iterator();
        while (var8.hasNext()) {
            class47 var9 = (class47) var8.next();
            for (int var10 = var9.method605() * 8; var10 < var9.method605() * 8 + 8; var10++) {
                for (int var11 = var9.method597() * 8; var11 < var9.method597() * 8 + 8; var11++) {
                    this.method466(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ao.h(IILal;Laz;[Llq;I)V")
    public void method466(int arg0, int arg1, class29 arg2, class48 arg3, class331[] arg4) {
        this.method374(arg0, arg1, arg2);
        this.method373(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ao.n(IILal;Laz;Laa;I)V")
    public void method425(int arg0, int arg1, class29 arg2, class48 arg3, class34 arg4) {
        int var6 = arg2.field389[0][arg0][arg1] - 1;
        int var7 = arg2.field394[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class328.method5392(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, this.field465, this.field464);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field464;
            class287 var10 = class287.method4369(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field3739 >= 0) {
                var11 = var10.field3739 | 0xFF000000;
            } else if (var10.field3737 >= 0) {
                int var12 = Statics.field1945.method2346(var10.field3737);
                byte var13 = 96;
                int var14;
                if (var12 == -2) {
                    var14 = 12345678;
                } else if (var12 == -1) {
                    if (var13 < 0) {
                        var13 = 0;
                    } else if (var13 > 127) {
                        var13 = 127;
                    }
                    int var15 = 127 - var13;
                    var14 = var15;
                } else {
                    int var16 = (var12 & 0x7F) * var13 / 128;
                    if (var16 < 2) {
                        var16 = 2;
                    } else if (var16 > 126) {
                        var16 = 126;
                    }
                    var14 = (var12 & 0xFF80) + var16;
                }
                var11 = class135.field1938[var14] | 0xFF000000;
            } else if (var10.field3736 == 16711935) {
                var11 = var9;
            } else {
                int var18 = class39.method2119(var10.field3744, var10.field3741, var10.field3746);
                byte var19 = 96;
                int var20;
                if (var18 == -2) {
                    var20 = 12345678;
                } else if (var18 == -1) {
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > 127) {
                        var19 = 127;
                    }
                    int var21 = 127 - var19;
                    var20 = var21;
                } else {
                    int var22 = (var18 & 0x7F) * var19 / 128;
                    if (var22 < 2) {
                        var22 = 2;
                    } else if (var22 > 126) {
                        var22 = 126;
                    }
                    var20 = (var18 & 0xFF80) + var22;
                }
                var11 = class135.field1938[var20] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field395[0][arg0][arg1] == 0) {
            class328.method5392(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, this.field465, var8);
            return;
        }
        int var24 = this.method372(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class328.method5392(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, this.field465, var24);
        } else {
            arg3.method617(this.field465 * arg0, this.field465 * (63 - arg1), var24, var8, this.field465, this.field465, arg2.field395[0][arg0][arg1], arg2.field396[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ao.u(IILal;Laz;I)V")
    public void method384(int arg0, int arg1, class29 arg2, class48 arg3) {
        for (int var5 = 1; var5 < arg2.field392; var5++) {
            int var6 = arg2.field394[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field464;
                class287 var8 = class287.method4369(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3739 >= 0) {
                    var9 = var8.field3739 | 0xFF000000;
                } else if (var8.field3737 >= 0) {
                    int var10 = Statics.field1945.method2346(var8.field3737);
                    byte var11 = 96;
                    int var12;
                    if (var10 == -2) {
                        var12 = 12345678;
                    } else if (var10 == -1) {
                        if (var11 < 0) {
                            var11 = 0;
                        } else if (var11 > 127) {
                            var11 = 127;
                        }
                        int var13 = 127 - var11;
                        var12 = var13;
                    } else {
                        int var14 = (var10 & 0x7F) * var11 / 128;
                        if (var14 < 2) {
                            var14 = 2;
                        } else if (var14 > 126) {
                            var14 = 126;
                        }
                        var12 = (var10 & 0xFF80) + var14;
                    }
                    var9 = class135.field1938[var12] | 0xFF000000;
                } else if (var8.field3736 == 16711935) {
                    var9 = var7;
                } else {
                    int var16 = class39.method2119(var8.field3744, var8.field3741, var8.field3746);
                    byte var17 = 96;
                    int var18;
                    if (var16 == -2) {
                        var18 = 12345678;
                    } else if (var16 == -1) {
                        if (var17 < 0) {
                            var17 = 0;
                        } else if (var17 > 127) {
                            var17 = 127;
                        }
                        int var19 = 127 - var17;
                        var18 = var19;
                    } else {
                        int var20 = (var16 & 0x7F) * var17 / 128;
                        if (var20 < 2) {
                            var20 = 2;
                        } else if (var20 > 126) {
                            var20 = 126;
                        }
                        var18 = (var16 & 0xFF80) + var20;
                    }
                    var9 = class135.field1938[var18] | 0xFF000000;
                }
                if (arg2.field395[var5][arg0][arg1] == 0) {
                    class328.method5392(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, this.field465, var9);
                } else {
                    arg3.method617(this.field465 * arg0, this.field465 * (63 - arg1), 0, var9, this.field465, this.field465, arg2.field395[var5][arg0][arg1], arg2.field396[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ao.q(II[Lao;I)Laa;")
    public class34 method382(int arg0, int arg1, class36[] arg2) {
        class214 var4 = field459;
        long var5 = (long) (0x0 | arg0 << 8 | arg1);
        class34 var7 = (class34) var4.method3641(var5);
        class34 var8 = var7;
        if (var7 == null) {
            var8 = this.method368(arg2);
            class214 var9 = field459;
            long var11 = (long) (0x0 | arg0 << 8 | arg1);
            var9.method3649(var8, var11);
        }
        return var8;
    }

    @ObfuscatedName("ao.g([Lao;I)Laa;")
    public class34 method368(class36[] arg0) {
        class45 var2 = new class45(64, 64);
        if (this.field458 == null) {
            Iterator var3 = this.field463.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                this.method370(var4.method605() * 8, var4.method597() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method370(0, 0, 64, 64, this.field458, var2);
        }
        this.method369(arg0, var2);
        class34 var5 = new class34();
        var5.method341(var2);
        return var5;
    }

    @ObfuscatedName("ao.y([Lao;Lad;B)V")
    public void method369(class36[] arg0, class45 arg1) {
        class255[] var3 = new class255[] { class255.field3313, class255.field3315, class255.field3314, class255.field3317, class255.field3321, class255.field3312, class255.field3319, class255.field3316 };
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
                switch(var7.field3320) {
                    case 0:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 1:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var13 = 59;
                        var11 = 5;
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
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var10 = 5;
                }
                this.method371(var12, var13, var8, var9, var10, var11, arg0[var7.method8()], arg1);
            }
        }
    }

    @ObfuscatedName("ao.s(IIIILal;Lad;I)V")
    public void method370(int arg0, int arg1, int arg2, int arg3, class29 arg4, class45 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field389[0][var7][var8] - 1;
                if (var9 != -1) {
                    class274 var10 = class274.method992(var9);
                    arg5.method568(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ao.ac(IIIIIILao;Lad;B)V")
    public void method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class36 arg6, class45 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method392(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class274 var12 = class274.method992(var11);
                    arg7.method568(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ao.ap(IILal;Laa;B)I")
    public int method372(int arg0, int arg1, class29 arg2, class34 arg3) {
        return arg2.field389[0][arg0][arg1] == 0 ? this.field464 : arg3.method340(arg0, arg1);
    }

    @ObfuscatedName("ao.al(IILal;[Llq;B)V")
    public void method373(int arg0, int arg1, class29 arg2, class331[] arg3) {
        for (int var5 = 0; var5 < arg2.field392; var5++) {
            class32[] var6 = arg2.field397[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class248.method76(var9.field419)) {
                        int var10 = var9.field419;
                        boolean var11 = class248.field2994.field2997 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class283 var12 = class283.method4185(var9.field421);
                    if (var12.field3616 != -1) {
                        if (var12.field3616 == 46 || var12.field3616 == 52) {
                            arg3[var12.field3616].method5417(this.field465 * arg0, this.field465 * (63 - arg1), this.field465 * 2 + 1, this.field465 * 2 + 1);
                        } else {
                            arg3[var12.field3616].method5417(this.field465 * arg0, this.field465 * (63 - arg1), this.field465 * 2, this.field465 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.ai(IILal;I)V")
    public void method374(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field392; var4++) {
            class32[] var5 = arg2.field397[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class248.method2086(var8.field419)) {
                        class283 var9 = class283.method4185(var8.field421);
                        int var10 = var9.field3613 == 0 ? -3355444 : -3407872;
                        if (class248.field2983.field2997 == var8.field419) {
                            this.method391(arg0, arg1, var8.field420, var10);
                        }
                        if (class248.field2976.field2997 == var8.field419) {
                            this.method391(arg0, arg1, var8.field420, -3355444);
                            this.method391(arg0, arg1, var8.field420 + 1, var10);
                        }
                        if (class248.field2977.field2997 == var8.field419) {
                            if (var8.field420 == 0) {
                                class328.method5338(this.field465 * arg0, this.field465 * (63 - arg1), 1, var10);
                            }
                            if (var8.field420 == 1) {
                                class328.method5338(this.field465 * arg0 + this.field465 - 1, this.field465 * (63 - arg1), 1, var10);
                            }
                            if (var8.field420 == 2) {
                                class328.method5338(this.field465 * arg0 + this.field465 - 1, this.field465 * (63 - arg1) + this.field465 - 1, 1, var10);
                            }
                            if (var8.field420 == 3) {
                                class328.method5338(this.field465 * arg0, this.field465 * (63 - arg1) + this.field465 - 1, 1, var10);
                            }
                        }
                        if (class248.field2978.field2997 == var8.field419) {
                            int var11 = var8.field420 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field465; var12++) {
                                    class328.method5338(this.field465 * arg0 + var12, this.field465 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field465; var13++) {
                                    class328.method5338(this.field465 * arg0 + var13, this.field465 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.ab(IILjava/util/HashSet;IS)V")
    public void method375(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field467.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class239 var9 = (class239) var8.getKey();
            int var10 = (int) ((float) var9.field2775 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2777 * var5 - var6);
            class41 var12 = (class41) var8.getValue();
            if (var12 != null) {
                var12.field506 = var10;
                var12.field512 = var11;
                class270 var13 = Statics.field3472[var12.field511];
                if (!arg2.contains(var13.method4382())) {
                    this.method482(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ao.ak(Ljava/util/HashSet;III)V")
    public void method376(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field472.iterator();
        while (var4.hasNext()) {
            class41 var5 = (class41) var4.next();
            class270 var6 = Statics.field3472[var5.field511];
            if (var6 != null && arg0.contains(var6.method4382())) {
                this.method377(var6, var5.field506, var5.field512, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ao.as(Lja;IIIIB)V")
    public void method377(class270 arg0, int arg1, int arg2, int arg3, int arg4) {
        class332 var6 = arg0.method4380(false);
        if (var6 == null) {
            return;
        }
        var6.method5438(arg1 - var6.field3979 / 2, arg2 - var6.field3980 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class328.method5321(arg1, arg2, 15, 16776960, 128);
            class328.method5321(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ao.aa(Law;IIFB)V")
    public void method482(class41 arg0, int arg1, int arg2, float arg3) {
        class270 var5 = Statics.field3472[arg0.field511];
        this.method383(var5, arg1, arg2);
        this.method401(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ao.ah(Lja;IIB)V")
    public void method383(class270 arg0, int arg1, int arg2) {
        class332 var4 = arg0.method4380(false);
        if (var4 != null) {
            int var5 = this.method478(var4, arg0.field3467);
            int var6 = this.method385(var4, arg0.field3468);
            var4.method5438(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ao.ao(Law;Lja;IIFB)V")
    public void method401(class41 arg0, class270 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field510 != null && arg0.field510.field449.method182(arg4)) {
            class312 var6 = (class312) this.field468.get(arg0.field510.field449);
            var6.method5114(arg0.field510.field450, arg2 - arg0.field510.field447 / 2, arg3, arg0.field510.field447, arg0.field510.field453, 0xFF000000 | arg1.field3460, 0, 1, 0, var6.field3892 / 2);
        }
    }

    @ObfuscatedName("ao.am(IILjava/util/HashSet;II)V")
    public void method381(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field472.iterator();
        while (var6.hasNext()) {
            class41 var7 = (class41) var6.next();
            int var8 = var7.field513.field2775 % 64;
            int var9 = var7.field513.field2777 % 64;
            var7.field506 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field512 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field511)) {
                this.method482(var7, var7.field506, var7.field512, var5);
            }
        }
    }

    @ObfuscatedName("ao.aq(I)V")
    public void method406() {
        if (this.field458 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method439(var1, var2, this.field458);
                }
            }
            return;
        }
        Iterator var3 = this.field463.iterator();
        while (var3.hasNext()) {
            class47 var4 = (class47) var3.next();
            for (int var5 = var4.method605() * 8; var5 < var4.method605() * 8 + 8; var5++) {
                for (int var6 = var4.method597() * 8; var6 < var4.method597() * 8 + 8; var6++) {
                    this.method439(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ao.ae(IILal;I)V")
    public void method439(int arg0, int arg1, class29 arg2) {
        field469.method4035(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field392; var4++) {
            class32[] var5 = arg2.field397[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class270 var9 = this.method388(var8.field421);
                    if (var9 != null) {
                        class41 var10 = (class41) this.field467.get(field469);
                        if (var10 != null) {
                            if (var9.field3453 != var10.field511) {
                                class41 var11 = new class41(var9.field3453, var10.field507, var10.field513, this.method473(var9));
                                this.field467.put(new class239(field469), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field507.field2780 - var10.field513.field2780;
                            var10.field513.field2780 = var4;
                            var10.field507.field2780 = var4 + var12;
                            return;
                        }
                        class239 var13 = new class239(var4, this.field460 * 64 + arg0, this.field457 * 64 + arg1);
                        class239 var14 = null;
                        if (this.field458 == null) {
                            Iterator var15 = this.field463.iterator();
                            while (var15.hasNext()) {
                                class47 var16 = (class47) var15.next();
                                if (var16.method592(arg0, arg1)) {
                                    var14 = new class239(var16.field393 + var4, var16.field391 * 64 + arg0 + var16.method594() * 8, var16.field388 * 64 + arg1 + var16.method595() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class239(this.field458.field393 + var4, this.field458.field391 * 64 + arg0, this.field458.field388 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class41 var17 = new class41(var9.field3453, var14, var13, this.method473(var9));
                            this.field467.put(new class239(field469), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field467.remove(field469);
    }

    @ObfuscatedName("ao.af(Lla;Ljl;I)I")
    public int method478(class332 arg0, class285 arg1) {
        switch(arg1.field3690) {
            case 1:
                return -arg0.field3979 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3979;
        }
    }

    @ObfuscatedName("ao.aw(Lla;Ljd;I)I")
    public int method385(class332 arg0, class267 arg1) {
        switch(arg1.field3434) {
            case 0:
                return -arg0.field3980 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3980;
        }
    }

    @ObfuscatedName("ao.ax(II)Lja;")
    public class270 method388(int arg0) {
        class283 var2 = class283.method4185(arg0);
        if (var2.field3628 != null) {
            var2 = var2.method4635();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3615 == -1 ? null : Statics.field3472[var2.field3615];
    }

    @ObfuscatedName("ao.ag(II)Lah;")
    public class35 method415(int arg0) {
        class270 var2 = Statics.field3472[arg0];
        return this.method473(var2);
    }

    @ObfuscatedName("ao.ay(Lja;I)Lah;")
    public class35 method473(class270 arg0) {
        if (arg0.field3456 == null || this.field468 == null || this.field468.get(class25.field348) == null) {
            return null;
        }
        class25 var2 = class25.method189(arg0.field3450);
        if (var2 == null) {
            return null;
        }
        class312 var3 = (class312) this.field468.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5109(arg0.field3456, 1000000);
        String[] var5 = new String[var4];
        var3.method5107(arg0.field3456, (int[]) null, var5);
        int var6 = var5.length * var3.field3892 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5173(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class35(arg0.field3456, var7, var6, var2);
    }

    @ObfuscatedName("ao.ad(IIIIII)Ljava/util/List;")
    public List method389(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field467.values().iterator();
            while (var7.hasNext()) {
                class41 var8 = (class41) var7.next();
                if (var8.method504(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field472.iterator();
            while (var9.hasNext()) {
                class41 var10 = (class41) var9.next();
                if (var10.method504(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ao.at(I)Ljava/util/List;")
    public List method390() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field472);
        var1.addAll(this.field467.values());
        return var1;
    }

    @ObfuscatedName("ao.av(IIIII)V")
    public void method391(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class328.method5334(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, arg3);
        }
        if (var5 == 1) {
            class328.method5338(this.field465 * arg0, this.field465 * (63 - arg1), this.field465, arg3);
        }
        if (var5 == 2) {
            class328.method5334(this.field465 * arg0 + this.field465 - 1, this.field465 * (63 - arg1), this.field465, arg3);
        }
        if (var5 == 3) {
            class328.method5338(this.field465 * arg0, this.field465 * (63 - arg1) + this.field465 - 1, this.field465, arg3);
        }
    }

    @ObfuscatedName("ao.az(III)I")
    public int method392(int arg0, int arg1) {
        if (this.field458 != null) {
            return this.field458.method251(arg0, arg1);
        }
        if (!this.field463.isEmpty()) {
            Iterator var3 = this.field463.iterator();
            while (var3.hasNext()) {
                class47 var4 = (class47) var3.next();
                if (var4.method592(arg0, arg1)) {
                    return var4.method251(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
