package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("i")
public class class24 {

    @ObfuscatedName("i.d")
    public static class204 field196 = new class204(37748736, 256);

    @ObfuscatedName("i.n")
    public static class204 field197 = new class204(256, 256);

    @ObfuscatedName("i.s")
    public int field194;

    @ObfuscatedName("i.g")
    public int field199;

    @ObfuscatedName("i.a")
    public class11 field205;

    @ObfuscatedName("i.r")
    public LinkedList field201;

    @ObfuscatedName("i.k")
    public int field192;

    @ObfuscatedName("i.m")
    public int field203;

    @ObfuscatedName("i.q")
    public List field204;

    @ObfuscatedName("i.x")
    public HashMap field200;

    @ObfuscatedName("i.u")
    public final HashMap field202;

    @ObfuscatedName("i.o")
    public static final class229 field207 = new class229();

    @ObfuscatedName("hb.f(IIIB)Lly;")
    public static class324 method3931(int arg0, int arg1, int arg2) {
        class204 var3 = field196;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class324) var3.method3739(var4);
    }

    @ObfuscatedName("a.h(Lly;IIIB)V")
    public static void method117(class324 arg0, int arg1, int arg2, int arg3) {
        class204 var4 = field196;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3743(arg0, var6, arg0.field3873.length * 4);
    }

    @ObfuscatedName("bq.e(Lz;III)V")
    public static void method943(class22 arg0, int arg1, int arg2) {
        class204 var3 = field197;
        long var5 = (long) (0x0 | arg1 << 8 | arg2);
        var3.method3742(arg0, var5);
    }

    public class24(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field194 = arg0;
        this.field199 = arg1;
        this.field201 = new LinkedList();
        this.field204 = new LinkedList();
        this.field200 = new HashMap();
        this.field192 = arg2 | 0xFF000000;
        this.field202 = arg3;
    }

    @ObfuscatedName("i.b(IIIS)V")
    public void method425(int arg0, int arg1, int arg2) {
        class324 var4 = method3931(this.field194, this.field199, this.field203);
        if (var4 == null) {
            return;
        }
        if (this.field203 * 64 == arg2) {
            var4.method5458(arg0, arg1);
        } else {
            var4.method5481(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("i.l(La;Ljava/util/List;I)V")
    public void method305(class11 arg0, List arg1) {
        this.field200.clear();
        this.field205 = arg0;
        this.method307(0, 0, 64, 64, this.field205);
        this.method306(arg1);
    }

    @ObfuscatedName("i.w(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method409(HashSet arg0, List arg1) {
        this.field200.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            if (var4.method189() == this.field194 && var4.method190() == this.field199) {
                this.field201.add(var4);
                this.method307(var4.method537() * 8, var4.method541() * 8, 8, 8, var4);
            }
        }
        this.method306(arg1);
    }

    @ObfuscatedName("i.d(IIIILu;B)V")
    public void method307(int arg0, int arg1, int arg2, int arg3, class17 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class229 var8 = new class229(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field138; var9++) {
                    class20[] var10 = arg4.field125[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class20[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class20 var13 = var11[var12];
                            class258 var14 = this.method336(var13.field158);
                            if (var14 != null) {
                                class229 var15 = new class229(var9, this.field194 * 64 + var6, this.field199 * 64 + var7);
                                Object var16 = null;
                                class229 var17;
                                if (this.field205 == null) {
                                    class35 var18 = (class35) arg4;
                                    var17 = new class229(var18.field128 + var9, var18.field134 * 64 + var6 + var18.method540() * 8, var18.field136 * 64 + var7 + var18.method547() * 8);
                                } else {
                                    var17 = new class229(this.field205.field128 + var9, this.field205.field134 * 64 + var6, this.field205.field136 * 64 + var7);
                                }
                                class29 var19 = new class29(var14.field3311, var17, var15, this.method338(var14));
                                this.field200.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.n(Ljava/util/List;I)V")
    public void method306(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class14 var3 = (class14) var2.next();
            if (var3.field91.field2620 >> 6 == this.field194 && var3.field91.field2621 >> 6 == this.field199) {
                class29 var4 = new class29(var3.field90, var3.field91, var3.field91, this.method340(var3.field90));
                this.field204.add(var4);
            }
        }
    }

    @ObfuscatedName("i.s(ILap;[Li;[Llk;I)V")
    public void method392(int arg0, class36 arg1, class24[] arg2, class323[] arg3) {
        this.field203 = arg0;
        if (this.field205 == null && this.field201.isEmpty() || method3931(this.field194, this.field199, arg0) != null) {
            return;
        }
        class22 var5 = this.method379(this.field194, this.field199, arg2);
        class324 var6 = new class324(this.field203 * 64, this.field203 * 64);
        var6.method5451();
        if (this.field205 == null) {
            this.method407(arg1, arg3, var5);
        } else {
            this.method312(arg1, arg2, arg3, var5);
        }
        method117(var6, this.field194, this.field199, this.field203);
    }

    @ObfuscatedName("i.g(IIILjava/util/HashSet;I)V")
    public void method310(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method325(arg0, arg1, arg3, arg2);
        this.method331(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("i.k(Ljava/util/HashSet;IIS)V")
    public void method311(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field200.values().iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            if (arg0.contains(var5.field241)) {
                class258 var6 = class258.method3226(var5.field241);
                this.method327(var6, var5.field246, var5.field247, arg1, arg2);
            }
        }
        this.method326(arg0, arg1, arg2);
    }

    @ObfuscatedName("i.m(Lap;[Li;[Llk;Lz;I)V")
    public void method312(class36 arg0, class24[] arg1, class323[] arg2, class22 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method372(var5, var6, this.field205, arg0, arg3);
                this.method316(var5, var6, this.field205, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method314(var7, var8, this.field205, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("i.q(Lap;[Llk;Lz;I)V")
    public void method407(class36 arg0, class323[] arg1, class22 arg2) {
        Iterator var4 = this.field201.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            for (int var6 = var5.method537() * 8; var6 < var5.method537() * 8 + 8; var6++) {
                for (int var7 = var5.method541() * 8; var7 < var5.method541() * 8 + 8; var7++) {
                    this.method372(var6, var7, var5, arg0, arg2);
                    this.method316(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field201.iterator();
        while (var8.hasNext()) {
            class35 var9 = (class35) var8.next();
            for (int var10 = var9.method537() * 8; var10 < var9.method537() * 8 + 8; var10++) {
                for (int var11 = var9.method541() * 8; var11 < var9.method541() * 8 + 8; var11++) {
                    this.method314(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("i.x(IILu;Lap;[Llk;B)V")
    public void method314(int arg0, int arg1, class17 arg2, class36 arg3, class323[] arg4) {
        this.method386(arg0, arg1, arg2);
        this.method323(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("i.u(IILu;Lap;Lz;I)V")
    public void method372(int arg0, int arg1, class17 arg2, class36 arg3, class22 arg4) {
        int var6 = arg2.field124[0][arg0][arg1] - 1;
        int var7 = arg2.field131[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class320.method5348(this.field203 * arg0, this.field203 * (63 - arg1), this.field203, this.field203, this.field192);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class27.method2866(var7, this.field192);
        }
        if (var7 > -1 && arg2.field130[0][arg0][arg1] == 0) {
            class320.method5348(this.field203 * arg0, this.field203 * (63 - arg1), this.field203, this.field203, var8);
            return;
        }
        int var9 = this.method322(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class320.method5348(this.field203 * arg0, this.field203 * (63 - arg1), this.field203, this.field203, var9);
        } else {
            arg3.method565(this.field203 * arg0, this.field203 * (63 - arg1), var9, var8, this.field203, this.field203, arg2.field130[0][arg0][arg1], arg2.field133[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("i.o(IILu;Lap;I)V")
    public void method316(int arg0, int arg1, class17 arg2, class36 arg3) {
        for (int var5 = 1; var5 < arg2.field138; var5++) {
            int var6 = arg2.field131[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class27.method2866(var6, this.field192);
                if (arg2.field130[var5][arg0][arg1] == 0) {
                    class320.method5348(this.field203 * arg0, this.field203 * (63 - arg1), this.field203, this.field203, var7);
                } else {
                    arg3.method565(this.field203 * arg0, this.field203 * (63 - arg1), 0, var7, this.field203, this.field203, arg2.field130[var5][arg0][arg1], arg2.field133[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("i.t(II[Li;I)Lz;")
    public class22 method379(int arg0, int arg1, class24[] arg2) {
        class204 var4 = field197;
        long var5 = (long) (0x0 | arg0 << 8 | arg1);
        class22 var7 = (class22) var4.method3739(var5);
        class22 var8 = var7;
        if (var7 == null) {
            var8 = this.method411(arg2);
            method943(var8, arg0, arg1);
        }
        return var8;
    }

    @ObfuscatedName("i.v([Li;I)Lz;")
    public class22 method411(class24[] arg0) {
        class33 var2 = new class33(64, 64);
        if (this.field205 == null) {
            Iterator var3 = this.field201.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                this.method317(var4.method537() * 8, var4.method541() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method317(0, 0, 64, 64, this.field205, var2);
        }
        this.method303(arg0, var2);
        class22 var5 = new class22();
        var5.method292(var2);
        return var5;
    }

    @ObfuscatedName("i.p([Li;Lag;I)V")
    public void method303(class24[] arg0, class33 arg1) {
        class243[] var3 = new class243[] { class243.field3157, class243.field3155, class243.field3156, class243.field3161, class243.field3159, class243.field3154, class243.field3153, class243.field3158 };
        class243[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class243 var7 = var5[var6];
            if (arg0[var7.method179()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3160) {
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
                        break;
                    case 3:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 4:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var8 = 59;
                        var10 = 5;
                }
                this.method321(var12, var13, var8, var9, var10, var11, arg0[var7.method179()], arg1);
            }
        }
    }

    @ObfuscatedName("i.z(IIIILu;Lag;I)V")
    public void method317(int arg0, int arg1, int arg2, int arg3, class17 arg4, class33 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field124[0][var7][var8] - 1;
                if (var9 != -1) {
                    class262 var10 = class262.method4474(var9);
                    arg5.method525(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("i.j(IIIIIILi;Lag;I)V")
    public void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class24 arg6, class33 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method342(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class262 var12 = class262.method4474(var11);
                    arg7.method525(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("i.c(IILu;Lz;I)I")
    public int method322(int arg0, int arg1, class17 arg2, class22 arg3) {
        return arg2.field124[0][arg0][arg1] == 0 ? this.field192 : arg3.method295(arg0, arg1);
    }

    @ObfuscatedName("i.av(IILu;[Llk;B)V")
    public void method323(int arg0, int arg1, class17 arg2, class323[] arg3) {
        for (int var5 = 0; var5 < arg2.field138; var5++) {
            class20[] var6 = arg2.field125[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class20[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class20 var9 = var7[var8];
                    int var10 = var9.field159;
                    boolean var11 = var10 >= class236.field2827.field2815 && var10 <= class236.field2828.field2815;
                    if (var11 || class236.method5240(var9.field159)) {
                        class271 var12 = class271.method1706(var9.field158);
                        if (var12.field3460 != -1) {
                            if (var12.field3460 == 46 || var12.field3460 == 52) {
                                arg3[var12.field3460].method5440(this.field203 * arg0, this.field203 * (63 - arg1), this.field203 * 2 + 1, this.field203 * 2 + 1);
                            } else {
                                arg3[var12.field3460].method5440(this.field203 * arg0, this.field203 * (63 - arg1), this.field203 * 2, this.field203 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.as(IILu;I)V")
    public void method386(int arg0, int arg1, class17 arg2) {
        for (int var4 = 0; var4 < arg2.field138; var4++) {
            class20[] var5 = arg2.field125[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    if (class236.method1616(var8.field159)) {
                        class271 var9 = class271.method1706(var8.field158);
                        int var10 = var9.field3456 == 0 ? -3355444 : -3407872;
                        if (class236.field2829.field2815 == var8.field159) {
                            this.method315(arg0, arg1, var8.field160, var10);
                        }
                        if (class236.field2809.field2815 == var8.field159) {
                            this.method315(arg0, arg1, var8.field160, -3355444);
                            this.method315(arg0, arg1, var8.field160 + 1, var10);
                        }
                        if (class236.field2810.field2815 == var8.field159) {
                            if (var8.field160 == 0) {
                                class320.method5364(this.field203 * arg0, this.field203 * (63 - arg1), 1, var10);
                            }
                            if (var8.field160 == 1) {
                                class320.method5364(this.field203 * arg0 + this.field203 - 1, this.field203 * (63 - arg1), 1, var10);
                            }
                            if (var8.field160 == 2) {
                                class320.method5364(this.field203 * arg0 + this.field203 - 1, this.field203 * (63 - arg1) + this.field203 - 1, 1, var10);
                            }
                            if (var8.field160 == 3) {
                                class320.method5364(this.field203 * arg0, this.field203 * (63 - arg1) + this.field203 - 1, 1, var10);
                            }
                        }
                        if (class236.field2826.field2815 == var8.field159) {
                            int var11 = var8.field160 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field203; var12++) {
                                    class320.method5364(this.field203 * arg0 + var12, this.field203 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field203; var13++) {
                                    class320.method5364(this.field203 * arg0 + var13, this.field203 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.al(IILjava/util/HashSet;IB)V")
    public void method325(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field200.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class229 var9 = (class229) var8.getKey();
            int var10 = (int) ((float) var9.field2620 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2621 * var5 - var6);
            class29 var12 = (class29) var8.getValue();
            if (var12 != null) {
                var12.field246 = var10;
                var12.field247 = var11;
                class258 var13 = class258.method3226(var12.field241);
                if (!arg2.contains(var13.method4454())) {
                    this.method328(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("i.ax(Ljava/util/HashSet;IIB)V")
    public void method326(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field204.iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            class258 var6 = class258.method3226(var5.field241);
            if (var6 != null && arg0.contains(var6.method4454())) {
                this.method327(var6, var5.field246, var5.field247, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("i.ay(Lic;IIIII)V")
    public void method327(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        class324 var6 = arg0.method4452(false);
        if (var6 == null) {
            return;
        }
        var6.method5460(arg1 - var6.field3870 / 2, arg2 - var6.field3878 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class320.method5346(arg1, arg2, 15, 16776960, 128);
            class320.method5346(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("i.aa(Lal;IIFB)V")
    public void method328(class29 arg0, int arg1, int arg2, float arg3) {
        class258 var5 = class258.method3226(arg0.field241);
        this.method428(var5, arg1, arg2);
        this.method330(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("i.ag(Lic;III)V")
    public void method428(class258 arg0, int arg1, int arg2) {
        class324 var4 = arg0.method4452(false);
        if (var4 != null) {
            int var5 = this.method334(var4, arg0.field3290);
            int var6 = this.method335(var4, arg0.field3298);
            var4.method5460(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("i.aj(Lal;Lic;IIFI)V")
    public void method330(class29 arg0, class258 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field249 != null && arg0.field249.field189.method135(arg4)) {
            class301 var6 = (class301) this.field202.get(arg0.field249.field189);
            var6.method5127(arg0.field249.field188, arg2 - arg0.field249.field187 / 2, arg3, arg0.field249.field187, arg0.field249.field190, 0xFF000000 | arg1.field3297, 0, 1, 0, var6.field3756 / 2);
        }
    }

    @ObfuscatedName("i.an(IILjava/util/HashSet;IB)V")
    public void method331(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field204.iterator();
        while (var6.hasNext()) {
            class29 var7 = (class29) var6.next();
            int var8 = var7.field250.field2620 % 64;
            int var9 = var7.field250.field2621 % 64;
            var7.field246 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field247 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field241)) {
                this.method328(var7, var7.field246, var7.field247, var5);
            }
        }
    }

    @ObfuscatedName("i.ap(I)V")
    public void method332() {
        if (this.field205 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method313(var1, var2, this.field205);
                }
            }
            return;
        }
        Iterator var3 = this.field201.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            for (int var5 = var4.method537() * 8; var5 < var4.method537() * 8 + 8; var5++) {
                for (int var6 = var4.method541() * 8; var6 < var4.method541() * 8 + 8; var6++) {
                    this.method313(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("i.am(IILu;I)V")
    public void method313(int arg0, int arg1, class17 arg2) {
        field207.method4128(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field138; var4++) {
            class20[] var5 = arg2.field125[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    class258 var9 = this.method336(var8.field158);
                    if (var9 != null) {
                        class29 var10 = (class29) this.field200.get(field207);
                        if (var10 != null) {
                            if (var9.field3311 != var10.field241) {
                                class29 var11 = new class29(var9.field3311, var10.field242, var10.field250, this.method338(var9));
                                this.field200.put(new class229(field207), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field242.field2623 - var10.field250.field2623;
                            var10.field250.field2623 = var4;
                            var10.field242.field2623 = var4 + var12;
                            return;
                        }
                        class229 var13 = new class229(var4, this.field194 * 64 + arg0, this.field199 * 64 + arg1);
                        class229 var14 = null;
                        if (this.field205 == null) {
                            Iterator var15 = this.field201.iterator();
                            while (var15.hasNext()) {
                                class35 var16 = (class35) var15.next();
                                if (var16.method538(arg0, arg1)) {
                                    var14 = new class229(var16.field128 + var4, var16.field134 * 64 + arg0 + var16.method540() * 8, var16.field136 * 64 + arg1 + var16.method547() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class229(this.field205.field128 + var4, this.field205.field134 * 64 + arg0, this.field205.field136 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class29 var17 = new class29(var9.field3311, var14, var13, this.method338(var9));
                            this.field200.put(new class229(field207), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field200.remove(field207);
    }

    @ObfuscatedName("i.ae(Lly;Ljd;I)I")
    public int method334(class324 arg0, class273 arg1) {
        switch(arg1.field3539) {
            case 1:
                return -arg0.field3870 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3870;
        }
    }

    @ObfuscatedName("i.ac(Lly;Lit;I)I")
    public int method335(class324 arg0, class255 arg1) {
        switch(arg1.field3272) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3878 / 2;
            default:
                return -arg0.field3878;
        }
    }

    @ObfuscatedName("i.ah(II)Lic;")
    public class258 method336(int arg0) {
        class271 var2 = class271.method1706(arg0);
        if (var2.field3472 != null) {
            var2 = var2.method4682();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3459 == -1 ? null : class258.method3226(var2.field3459);
    }

    @ObfuscatedName("i.aq(II)Lj;")
    public class23 method340(int arg0) {
        class258 var2 = class258.method3226(arg0);
        return this.method338(var2);
    }

    @ObfuscatedName("i.af(Lic;I)Lj;")
    public class23 method338(class258 arg0) {
        if (arg0.field3296 == null || this.field202 == null || this.field202.get(class13.field80) == null) {
            return null;
        }
        class13 var2 = class13.method136(arg0.field3307);
        if (var2 == null) {
            return null;
        }
        class301 var3 = (class301) this.field202.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5125(arg0.field3296, 1000000);
        String[] var5 = new String[var4];
        var3.method5199(arg0.field3296, (int[]) null, var5);
        int var6 = var5.length * var3.field3756 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5122(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class23(arg0.field3296, var7, var6, var2);
    }

    @ObfuscatedName("i.ab(IIIIII)Ljava/util/List;")
    public List method339(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field200.values().iterator();
            while (var7.hasNext()) {
                class29 var8 = (class29) var7.next();
                if (var8.method461(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field204.iterator();
            while (var9.hasNext()) {
                class29 var10 = (class29) var9.next();
                if (var10.method461(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("i.ar(B)Ljava/util/List;")
    public List method320() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field204);
        var1.addAll(this.field200.values());
        return var1;
    }

    @ObfuscatedName("i.ao(IIIII)V")
    public void method315(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class320.method5356(this.field203 * arg0, this.field203 * (63 - arg1), this.field203, arg3);
        }
        if (var5 == 1) {
            class320.method5364(this.field203 * arg0, this.field203 * (63 - arg1), this.field203, arg3);
        }
        if (var5 == 2) {
            class320.method5356(this.field203 * arg0 + this.field203 - 1, this.field203 * (63 - arg1), this.field203, arg3);
        }
        if (var5 == 3) {
            class320.method5364(this.field203 * arg0, this.field203 * (63 - arg1) + this.field203 - 1, this.field203, arg3);
        }
    }

    @ObfuscatedName("i.at(III)I")
    public int method342(int arg0, int arg1) {
        if (this.field205 != null) {
            return this.field205.method188(arg0, arg1);
        }
        if (!this.field201.isEmpty()) {
            Iterator var3 = this.field201.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                if (var4.method538(arg0, arg1)) {
                    return var4.method188(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
