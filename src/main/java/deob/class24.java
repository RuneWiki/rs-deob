package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("y")
public class class24 {

    @ObfuscatedName("y.b")
    public static class204 field236 = new class204(37748736, 256);

    @ObfuscatedName("y.w")
    public static class204 field233 = new class204(256, 256);

    @ObfuscatedName("y.n")
    public int field234;

    @ObfuscatedName("y.i")
    public int field235;

    @ObfuscatedName("y.p")
    public class11 field237;

    @ObfuscatedName("y.m")
    public LinkedList field231;

    @ObfuscatedName("y.d")
    public int field238;

    @ObfuscatedName("y.j")
    public int field239;

    @ObfuscatedName("y.x")
    public List field240;

    @ObfuscatedName("y.v")
    public HashMap field242;

    @ObfuscatedName("y.h")
    public final HashMap field232;

    @ObfuscatedName("y.f")
    public static final class229 field241 = new class229();

    @ObfuscatedName("p.g(Lls;IIII)V")
    public static void method115(class324 arg0, int arg1, int arg2, int arg3) {
        class204 var4 = field236;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3894(arg0, var6, arg0.field3890.length * 4);
    }

    @ObfuscatedName("bh.r(I)V")
    public static void method1719() {
        field236.method3900();
        field233.method3900();
    }

    @ObfuscatedName("fj.e(I)V")
    public static void method3430() {
        field236.method3897(5);
        field233.method3897(5);
    }

    public class24(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field234 = arg0;
        this.field235 = arg1;
        this.field231 = new LinkedList();
        this.field240 = new LinkedList();
        this.field242 = new HashMap();
        this.field238 = arg2 | 0xFF000000;
        this.field232 = arg3;
    }

    @ObfuscatedName("y.q(IIII)V")
    public void method317(int arg0, int arg1, int arg2) {
        int var4 = this.field234;
        int var5 = this.field235;
        int var6 = this.field239;
        class204 var7 = field236;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class324 var10 = (class324) var7.method3895(var8);
        if (var10 == null) {
            return;
        }
        if (this.field239 * 64 == arg2) {
            var10.method5709(arg0, arg1);
        } else {
            var10.method5699(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("y.c(Lp;Ljava/util/List;B)V")
    public void method318(class11 arg0, List arg1) {
        this.field242.clear();
        this.field237 = arg0;
        this.method320(0, 0, 64, 64, this.field237);
        this.method321(arg1);
    }

    @ObfuscatedName("y.i(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method427(HashSet arg0, List arg1) {
        this.field242.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            if (var4.method205() == this.field234 && var4.method181() == this.field235) {
                this.field231.add(var4);
                this.method320(var4.method562() * 8, var4.method563() * 8, 8, 8, var4);
            }
        }
        this.method321(arg1);
    }

    @ObfuscatedName("y.p(IIIILh;I)V")
    public void method320(int arg0, int arg1, int arg2, int arg3, class17 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class229 var8 = new class229(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field149; var9++) {
                    class20[] var10 = arg4.field157[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class20[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class20 var13 = var11[var12];
                            class258 var14 = this.method415(var13.field185);
                            if (var14 != null) {
                                class229 var15 = new class229(var9, this.field234 * 64 + var6, this.field235 * 64 + var7);
                                Object var16 = null;
                                class229 var17;
                                if (this.field237 == null) {
                                    class35 var18 = (class35) arg4;
                                    var17 = new class229(var18.field151 + var9, var18.field147 * 64 + var6 + var18.method568() * 8, var18.field152 * 64 + var7 + var18.method561() * 8);
                                } else {
                                    var17 = new class229(this.field237.field151 + var9, this.field237.field147 * 64 + var6, this.field237.field152 * 64 + var7);
                                }
                                class29 var19 = new class29(var14.field3314, var17, var15, this.method365(var14));
                                this.field242.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.m(Ljava/util/List;I)V")
    public void method321(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class14 var3 = (class14) var2.next();
            if (var3.field110.field2633 >> 6 == this.field234 && var3.field110.field2634 >> 6 == this.field235) {
                class29 var4 = new class29(var3.field109, var3.field110, var3.field110, this.method350(var3.field109));
                this.field240.add(var4);
            }
        }
    }

    @ObfuscatedName("y.d(ILab;[Ly;[Lli;I)V")
    public void method322(int arg0, class36 arg1, class24[] arg2, class323[] arg3) {
        this.field239 = arg0;
        if (this.field237 == null && this.field231.isEmpty()) {
            return;
        }
        int var5 = this.field234;
        int var6 = this.field235;
        class204 var7 = field236;
        long var8 = (long) (arg0 << 16 | var5 << 8 | var6);
        class324 var10 = (class324) var7.method3895(var8);
        if (var10 != null) {
            return;
        }
        class22 var11 = this.method330(this.field234, this.field235, arg2);
        class324 var12 = new class324(this.field239 * 64, this.field239 * 64);
        var12.method5680();
        if (this.field237 == null) {
            this.method341(arg1, arg3, var11);
        } else {
            this.method376(arg1, arg2, arg3, var11);
        }
        method115(var12, this.field234, this.field235, this.field239);
    }

    @ObfuscatedName("y.j(IIILjava/util/HashSet;I)V")
    public void method397(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method338(arg0, arg1, arg3, arg2);
        this.method344(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("y.x(Ljava/util/HashSet;IIB)V")
    public void method324(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field242.values().iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            if (arg0.contains(var5.field286)) {
                class258 var6 = class258.method3265(var5.field286);
                this.method340(var6, var5.field277, var5.field284, arg1, arg2);
            }
        }
        this.method339(arg0, arg1, arg2);
    }

    @ObfuscatedName("y.v(Lab;[Ly;[Lli;Lz;B)V")
    public void method376(class36 arg0, class24[] arg1, class323[] arg2, class22 arg3) {
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method448(var5, var6, this.field237, arg0, arg3);
                this.method325(var5, var6, this.field237, arg0);
            }
        }
        for (int var7 = 0; var7 < 64; var7++) {
            for (int var8 = 0; var8 < 64; var8++) {
                this.method327(var7, var8, this.field237, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("y.h(Lab;[Lli;Lz;I)V")
    public void method341(class36 arg0, class323[] arg1, class22 arg2) {
        Iterator var4 = this.field231.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            for (int var6 = var5.method562() * 8; var6 < var5.method562() * 8 + 8; var6++) {
                for (int var7 = var5.method563() * 8; var7 < var5.method563() * 8 + 8; var7++) {
                    this.method448(var6, var7, var5, arg0, arg2);
                    this.method325(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field231.iterator();
        while (var8.hasNext()) {
            class35 var9 = (class35) var8.next();
            for (int var10 = var9.method562() * 8; var10 < var9.method562() * 8 + 8; var10++) {
                for (int var11 = var9.method563() * 8; var11 < var9.method563() * 8 + 8; var11++) {
                    this.method327(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("y.f(IILh;Lab;[Lli;I)V")
    public void method327(int arg0, int arg1, class17 arg2, class36 arg3, class323[] arg4) {
        this.method337(arg0, arg1, arg2);
        this.method336(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("y.a(IILh;Lab;Lz;I)V")
    public void method448(int arg0, int arg1, class17 arg2, class36 arg3, class22 arg4) {
        int var6 = arg2.field153[0][arg0][arg1] - 1;
        int var7 = arg2.field154[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class320.method5583(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, this.field239, this.field238);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field238;
            class275 var10 = class275.method4040(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field3607 >= 0) {
                var11 = var10.field3607 | 0xFF000000;
            } else if (var10.field3605 >= 0) {
                int var12 = class27.method2772(Statics.field1753.method2548(var10.field3605), 96);
                var11 = class125.field1750[var12] | 0xFF000000;
            } else if (var10.field3604 == 16711935) {
                var11 = var9;
            } else {
                int var13 = var10.field3608;
                int var14 = var10.field3609;
                int var15 = var10.field3611;
                if (var15 > 179) {
                    var14 /= 2;
                }
                if (var15 > 192) {
                    var14 /= 2;
                }
                if (var15 > 217) {
                    var14 /= 2;
                }
                if (var15 > 243) {
                    var14 /= 2;
                }
                int var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
                int var19 = class27.method2772(var16, 96);
                var11 = class125.field1750[var19] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field155[0][arg0][arg1] == 0) {
            class320.method5583(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, this.field239, var8);
            return;
        }
        int var20 = this.method335(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class320.method5583(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, this.field239, var20);
        } else {
            arg3.method631(this.field239 * arg0, this.field239 * (63 - arg1), var20, var8, this.field239, this.field239, arg2.field155[0][arg0][arg1], arg2.field156[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("y.t(IILh;Lab;I)V")
    public void method325(int arg0, int arg1, class17 arg2, class36 arg3) {
        for (int var5 = 1; var5 < arg2.field149; var5++) {
            int var6 = arg2.field154[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class27.method1576(var6, this.field238);
                if (arg2.field155[var5][arg0][arg1] == 0) {
                    class320.method5583(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, this.field239, var7);
                } else {
                    arg3.method631(this.field239 * arg0, this.field239 * (63 - arg1), 0, var7, this.field239, this.field239, arg2.field155[var5][arg0][arg1], arg2.field156[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("y.k(II[Ly;I)Lz;")
    public class22 method330(int arg0, int arg1, class24[] arg2) {
        class204 var4 = field233;
        long var5 = (long) (0x0 | arg0 << 8 | arg1);
        class22 var7 = (class22) var4.method3895(var5);
        class22 var8 = var7;
        if (var7 == null) {
            var8 = this.method450(arg2);
            class204 var9 = field233;
            long var11 = (long) (0x0 | arg0 << 8 | arg1);
            var9.method3893(var8, var11);
        }
        return var8;
    }

    @ObfuscatedName("y.s([Ly;I)Lz;")
    public class22 method450(class24[] arg0) {
        class33 var2 = new class33(64, 64);
        if (this.field237 == null) {
            Iterator var3 = this.field231.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                this.method333(var4.method562() * 8, var4.method563() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method333(0, 0, 64, 64, this.field237, var2);
        }
        this.method332(arg0, var2);
        class22 var5 = new class22();
        var5.method301(var2);
        return var5;
    }

    @ObfuscatedName("y.y([Ly;Laz;B)V")
    public void method332(class24[] arg0, class33 arg1) {
        class243[] var3 = new class243[] { class243.field3167, class243.field3173, class243.field3163, class243.field3169, class243.field3170, class243.field3165, class243.field3164, class243.field3168 };
        class243[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class243 var7 = var5[var6];
            if (arg0[var7.method172()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3171) {
                    case 0:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 4:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 5:
                        var9 = 59;
                        var11 = 5;
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
                this.method334(var12, var13, var8, var9, var10, var11, arg0[var7.method172()], arg1);
            }
        }
    }

    @ObfuscatedName("y.u(IIIILh;Laz;I)V")
    public void method333(int arg0, int arg1, int arg2, int arg3, class17 arg4, class33 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field153[0][var7][var8] - 1;
                if (var9 != -1) {
                    class262 var10 = class262.method455(var9);
                    arg5.method543(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("y.o(IIIIIILy;Laz;I)V")
    public void method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class24 arg6, class33 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method355(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class262 var12 = class262.method455(var11);
                    arg7.method543(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("y.af(IILh;Lz;I)I")
    public int method335(int arg0, int arg1, class17 arg2, class22 arg3) {
        return arg2.field153[0][arg0][arg1] == 0 ? this.field238 : arg3.method302(arg0, arg1);
    }

    @ObfuscatedName("y.an(IILh;[Lli;B)V")
    public void method336(int arg0, int arg1, class17 arg2, class323[] arg3) {
        for (int var5 = 0; var5 < arg2.field149; var5++) {
            class20[] var6 = arg2.field157[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class20[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class20 var9 = var7[var8];
                    if (class236.method3713(var9.field180) || class236.method3143(var9.field180)) {
                        class271 var10 = class271.method4591(var9.field185);
                        if (var10.field3467 != -1) {
                            if (var10.field3467 == 46 || var10.field3467 == 52) {
                                arg3[var10.field3467].method5663(this.field239 * arg0, this.field239 * (63 - arg1), this.field239 * 2 + 1, this.field239 * 2 + 1);
                            } else {
                                arg3[var10.field3467].method5663(this.field239 * arg0, this.field239 * (63 - arg1), this.field239 * 2, this.field239 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.ax(IILh;I)V")
    public void method337(int arg0, int arg1, class17 arg2) {
        for (int var4 = 0; var4 < arg2.field149; var4++) {
            class20[] var5 = arg2.field157[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    int var9 = var8.field180;
                    boolean var10 = var9 >= class236.field2834.field2840 && var9 <= class236.field2842.field2840 || class236.field2819.field2840 == var9;
                    if (var10) {
                        class271 var11 = class271.method4591(var8.field185);
                        int var12 = var11.field3471 == 0 ? -3355444 : -3407872;
                        if (class236.field2834.field2840 == var8.field180) {
                            this.method410(arg0, arg1, var8.field181, var12);
                        }
                        if (class236.field2831.field2840 == var8.field180) {
                            this.method410(arg0, arg1, var8.field181, -3355444);
                            this.method410(arg0, arg1, var8.field181 + 1, var12);
                        }
                        if (class236.field2842.field2840 == var8.field180) {
                            if (var8.field181 == 0) {
                                class320.method5634(this.field239 * arg0, this.field239 * (63 - arg1), 1, var12);
                            }
                            if (var8.field181 == 1) {
                                class320.method5634(this.field239 * arg0 + this.field239 - 1, this.field239 * (63 - arg1), 1, var12);
                            }
                            if (var8.field181 == 2) {
                                class320.method5634(this.field239 * arg0 + this.field239 - 1, this.field239 * (63 - arg1) + this.field239 - 1, 1, var12);
                            }
                            if (var8.field181 == 3) {
                                class320.method5634(this.field239 * arg0, this.field239 * (63 - arg1) + this.field239 - 1, 1, var12);
                            }
                        }
                        if (class236.field2819.field2840 == var8.field180) {
                            int var13 = var8.field181 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field239; var14++) {
                                    class320.method5634(this.field239 * arg0 + var14, this.field239 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field239; var15++) {
                                    class320.method5634(this.field239 * arg0 + var15, this.field239 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.aw(IILjava/util/HashSet;II)V")
    public void method338(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field242.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class229 var9 = (class229) var8.getKey();
            int var10 = (int) ((float) var9.field2633 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2634 * var5 - var6);
            class29 var12 = (class29) var8.getValue();
            if (var12 != null) {
                var12.field277 = var10;
                var12.field284 = var11;
                class258 var13 = class258.method3265(var12.field286);
                if (!arg2.contains(var13.method4638())) {
                    this.method452(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("y.ae(Ljava/util/HashSet;III)V")
    public void method339(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field240.iterator();
        while (var4.hasNext()) {
            class29 var5 = (class29) var4.next();
            class258 var6 = class258.method3265(var5.field286);
            if (var6 != null && arg0.contains(var6.method4638())) {
                this.method340(var6, var5.field277, var5.field284, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("y.ac(Lii;IIIII)V")
    public void method340(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        class324 var6 = arg0.method4656(false);
        if (var6 == null) {
            return;
        }
        var6.method5689(arg1 - var6.field3880 / 2, arg2 - var6.field3888 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class320.method5631(arg1, arg2, 15, 16776960, 128);
            class320.method5631(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("y.az(Lax;IIFS)V")
    public void method452(class29 arg0, int arg1, int arg2, float arg3) {
        class258 var5 = class258.method3265(arg0.field286);
        this.method363(var5, arg1, arg2);
        this.method351(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("y.aj(Lii;III)V")
    public void method363(class258 arg0, int arg1, int arg2) {
        class324 var4 = arg0.method4656(false);
        if (var4 != null) {
            int var5 = this.method347(var4, arg0.field3325);
            int var6 = this.method348(var4, arg0.field3329);
            var4.method5689(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("y.ag(Lax;Lii;IIFB)V")
    public void method351(class29 arg0, class258 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field279 != null && arg0.field279.field217.method130(arg4)) {
            class301 var6 = (class301) this.field232.get(arg0.field279.field217);
            var6.method5342(arg0.field279.field224, arg2 - arg0.field279.field215 / 2, arg3, arg0.field279.field215, arg0.field279.field216, 0xFF000000 | arg1.field3328, 0, 1, 0, var6.field3766 / 2);
        }
    }

    @ObfuscatedName("y.ab(IILjava/util/HashSet;IB)V")
    public void method344(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field240.iterator();
        while (var6.hasNext()) {
            class29 var7 = (class29) var6.next();
            int var8 = var7.field278.field2633 % 64;
            int var9 = var7.field278.field2634 % 64;
            var7.field277 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field284 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field286)) {
                this.method452(var7, var7.field277, var7.field284, var5);
            }
        }
    }

    @ObfuscatedName("y.ar(B)V")
    public void method417() {
        if (this.field237 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method328(var1, var2, this.field237);
                }
            }
            return;
        }
        Iterator var3 = this.field231.iterator();
        while (var3.hasNext()) {
            class35 var4 = (class35) var3.next();
            for (int var5 = var4.method562() * 8; var5 < var4.method562() * 8 + 8; var5++) {
                for (int var6 = var4.method563() * 8; var6 < var4.method563() * 8 + 8; var6++) {
                    this.method328(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("y.at(IILh;I)V")
    public void method328(int arg0, int arg1, class17 arg2) {
        field241.method4275(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field149; var4++) {
            class20[] var5 = arg2.field157[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class20[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class20 var8 = var6[var7];
                    class258 var9 = this.method415(var8.field185);
                    if (var9 != null) {
                        class29 var10 = (class29) this.field242.get(field241);
                        if (var10 != null) {
                            if (var9.field3314 != var10.field286) {
                                class29 var11 = new class29(var9.field3314, var10.field280, var10.field278, this.method365(var9));
                                this.field242.put(new class229(field241), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field280.field2635 - var10.field278.field2635;
                            var10.field278.field2635 = var4;
                            var10.field280.field2635 = var4 + var12;
                            return;
                        }
                        class229 var13 = new class229(var4, this.field234 * 64 + arg0, this.field235 * 64 + arg1);
                        class229 var14 = null;
                        if (this.field237 == null) {
                            Iterator var15 = this.field231.iterator();
                            while (var15.hasNext()) {
                                class35 var16 = (class35) var15.next();
                                if (var16.method559(arg0, arg1)) {
                                    var14 = new class229(var16.field151 + var4, var16.field147 * 64 + arg0 + var16.method568() * 8, var16.field152 * 64 + arg1 + var16.method561() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class229(this.field237.field151 + var4, this.field237.field147 * 64 + arg0, this.field237.field152 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class29 var17 = new class29(var9.field3314, var14, var13, this.method365(var9));
                            this.field242.put(new class229(field241), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field242.remove(field241);
    }

    @ObfuscatedName("y.as(Lls;Ljq;I)I")
    public int method347(class324 arg0, class273 arg1) {
        switch(arg1.field3563) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3880 / 2;
            default:
                return -arg0.field3880;
        }
    }

    @ObfuscatedName("y.aa(Lls;Lix;B)I")
    public int method348(class324 arg0, class255 arg1) {
        switch(arg1.field3293) {
            case 1:
                return -arg0.field3888 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3888;
        }
    }

    @ObfuscatedName("y.ai(II)Lii;")
    public class258 method415(int arg0) {
        class271 var2 = class271.method4591(arg0);
        if (var2.field3481 != null) {
            var2 = var2.method4871();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3480 == -1 ? null : class258.method3265(var2.field3480);
    }

    @ObfuscatedName("y.ad(II)Ls;")
    public class23 method350(int arg0) {
        class258 var2 = class258.method3265(arg0);
        return this.method365(var2);
    }

    @ObfuscatedName("y.al(Lii;I)Ls;")
    public class23 method365(class258 arg0) {
        if (arg0.field3317 == null || this.field232 == null || this.field232.get(class13.field93) == null) {
            return null;
        }
        class13 var2 = class13.method125(arg0.field3319);
        if (var2 == null) {
            return null;
        }
        class301 var3 = (class301) this.field232.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5346(arg0.field3317, 1000000);
        String[] var5 = new String[var4];
        var3.method5344(arg0.field3317, (int[]) null, var5);
        int var6 = var5.length * var3.field3766 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5343(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class23(arg0.field3317, var7, var6, var2);
    }

    @ObfuscatedName("y.ak(IIIIII)Ljava/util/List;")
    public List method352(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field242.values().iterator();
            while (var7.hasNext()) {
                class29 var8 = (class29) var7.next();
                if (var8.method484(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field240.iterator();
            while (var9.hasNext()) {
                class29 var10 = (class29) var9.next();
                if (var10.method484(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("y.ao(I)Ljava/util/List;")
    public List method387() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field240);
        var1.addAll(this.field242.values());
        return var1;
    }

    @ObfuscatedName("y.am(IIIIB)V")
    public void method410(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class320.method5590(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, arg3);
        }
        if (var5 == 1) {
            class320.method5634(this.field239 * arg0, this.field239 * (63 - arg1), this.field239, arg3);
        }
        if (var5 == 2) {
            class320.method5590(this.field239 * arg0 + this.field239 - 1, this.field239 * (63 - arg1), this.field239, arg3);
        }
        if (var5 == 3) {
            class320.method5634(this.field239 * arg0, this.field239 * (63 - arg1) + this.field239 - 1, this.field239, arg3);
        }
    }

    @ObfuscatedName("y.ay(III)I")
    public int method355(int arg0, int arg1) {
        if (this.field237 != null) {
            return this.field237.method185(arg0, arg1);
        }
        if (!this.field231.isEmpty()) {
            Iterator var3 = this.field231.iterator();
            while (var3.hasNext()) {
                class35 var4 = (class35) var3.next();
                if (var4.method559(arg0, arg1)) {
                    return var4.method185(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
