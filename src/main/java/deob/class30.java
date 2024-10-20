package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("at")
public class class30 {

    @ObfuscatedName("at.b")
    public static class209 field232 = new class209(37748736, 256);

    @ObfuscatedName("at.a")
    public int field239;

    @ObfuscatedName("at.c")
    public int field236;

    @ObfuscatedName("at.z")
    public class16 field242;

    @ObfuscatedName("at.j")
    public LinkedList field238;

    @ObfuscatedName("at.d")
    public int field237;

    @ObfuscatedName("at.t")
    public int field240;

    @ObfuscatedName("at.f")
    public List field241;

    @ObfuscatedName("at.i")
    public HashMap field234;

    @ObfuscatedName("at.m")
    public final HashMap field243;

    @ObfuscatedName("cg.n(Llu;IIII)V")
    public static void method2269(class327 arg0, int arg1, int arg2, int arg3) {
        class209 var4 = field232;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3928(arg0, var6, arg0.field3883.length * 4);
    }

    @ObfuscatedName("bo.h(B)V")
    public static void method1056() {
        field232.method3916();
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field239 = arg0;
        this.field236 = arg1;
        this.field238 = new LinkedList();
        this.field241 = new LinkedList();
        this.field234 = new HashMap();
        this.field237 = arg2 | 0xFF000000;
        this.field243 = arg3;
    }

    @ObfuscatedName("at.l(IIII)V")
    public void method456(int arg0, int arg1, int arg2) {
        int var4 = this.field239;
        int var5 = this.field236;
        int var6 = this.field240;
        class209 var7 = field232;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class327 var10 = (class327) var7.method3911(var8);
        if (var10 == null) {
            return;
        }
        if (this.field240 * 64 == arg2) {
            var10.method5705(arg0, arg1);
        } else {
            var10.method5718(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("at.g(Lr;Ljava/util/List;B)V")
    public void method367(class16 arg0, List arg1) {
        this.field234.clear();
        this.field242 = arg0;
        this.method371(arg1);
    }

    @ObfuscatedName("at.b(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method425(HashSet arg0, List arg1) {
        this.field234.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method237() == this.field239 && var4.method262() == this.field236) {
                this.field238.add(var4);
            }
        }
        this.method371(arg1);
    }

    @ObfuscatedName("at.a(IIIILs;I)V")
    public void method369(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        this.field234.clear();
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field161; var8++) {
                    class26[] var9 = arg4.field153[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class274 var13;
                            boolean var18;
                            label58: {
                                class26 var12 = var10[var11];
                                var13 = class274.method4676(var12.field202);
                                if (var13.field3481 != null) {
                                    int[] var14 = var13.field3481;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class274 var17 = class274.method4676(var16);
                                        if (var17.field3440 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3440 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method445(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.c(Ljs;IIILs;I)V")
    public void method445(class274 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class234 var6 = new class234(arg1, this.field239 * 64 + arg2, this.field236 * 64 + arg3);
        Object var7 = null;
        class234 var8;
        if (this.field242 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class234(var9.field160 + arg1, var9.field164 * 64 + arg2 + var9.method579() * 8, var9.field149 * 64 + arg3 + var9.method570() * 8);
        } else {
            var8 = new class234(this.field242.field160 + arg1, this.field242.field164 * 64 + arg2, this.field242.field149 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3481 == null) {
            class262 var11 = class262.method106(arg0.field3440);
            var10 = new class19(var8, var6, var11.field3312, this.method433(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3447, this);
        }
        this.field234.put(new class234(0, arg2, arg3), var10);
    }

    @ObfuscatedName("at.z(B)V")
    public void method465() {
        Iterator var1 = this.field234.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method270();
            }
        }
    }

    @ObfuscatedName("at.j(Ljava/util/List;I)V")
    public void method371(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field289.field2637 >> 6 == this.field239 && var3.field289.field2638 >> 6 == this.field236) {
                class19 var4 = new class19(var3.field289, var3.field289, var3.field121, this.method394(var3.field121));
                this.field241.add(var4);
            }
        }
    }

    @ObfuscatedName("at.d(I)V")
    public void method372() {
        if (this.field242 != null) {
            this.field242.method234();
            return;
        }
        Iterator var1 = this.field238.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method234();
        }
    }

    @ObfuscatedName("at.i(Lij;I)Z")
    public boolean method373(class254 arg0) {
        if (this.field242 == null) {
            boolean var2 = true;
            Iterator var3 = this.field238.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method233(arg0);
                var2 &= var4.method258();
            }
            if (var2) {
                Iterator var5 = this.field238.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method369(var6.method571() * 8, var6.method572() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field242.method233(arg0);
            if (this.field242.method258()) {
                this.method369(0, 0, 64, 64, this.field242);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("at.m(ILaw;[Lll;Lij;Lij;B)V")
    public void method384(int arg0, class41 arg1, class326[] arg2, class254 arg3, class254 arg4) {
        this.field240 = arg0;
        if (this.field242 == null && this.field238.isEmpty()) {
            return;
        }
        int var6 = this.field239;
        int var7 = this.field236;
        class209 var8 = field232;
        long var9 = (long) (arg0 << 16 | var6 << 8 | var7);
        class327 var11 = (class327) var8.method3911(var9);
        if (var11 != null) {
            return;
        }
        boolean var12 = true;
        boolean var13 = var12 & this.method373(arg3);
        int var14;
        if (this.field242 == null) {
            var14 = ((class22) this.field238.getFirst()).field154;
        } else {
            var14 = this.field242.field154;
        }
        boolean var15 = var13 & arg4.method4458(var14);
        if (!var15) {
            return;
        }
        byte[] var16 = arg4.method4470(var14);
        class28 var17 = class28.method3399(var16);
        class327 var18 = new class327(this.field240 * 64, this.field240 * 64);
        var18.method5689();
        if (this.field242 == null) {
            this.method378(arg1, arg2, var17);
        } else {
            this.method377(arg1, arg2, var17);
        }
        method2269(var18, this.field239, this.field236, this.field240);
        this.method372();
    }

    @ObfuscatedName("at.v(IIILjava/util/HashSet;I)V")
    public void method375(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method385(arg0, arg1, arg3, arg2);
        this.method391(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("at.r(Ljava/util/HashSet;IIB)V")
    public void method426(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field234.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method508()) {
                int var6 = var5.method185();
                if (arg0.contains(var6)) {
                    class262 var7 = class262.method106(var6);
                    this.method387(var7, var5.field290, var5.field291, arg1, arg2);
                }
            }
        }
        this.method386(arg0, arg1, arg2);
    }

    @ObfuscatedName("at.x(Law;[Lll;Lai;I)V")
    public void method377(class41 arg0, class326[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method380(var4, var5, this.field242, arg0, arg2);
                this.method409(var4, var5, this.field242, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method379(var6, var7, this.field242, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("at.y(Law;[Lll;Lai;B)V")
    public void method378(class41 arg0, class326[] arg1, class28 arg2) {
        Iterator var4 = this.field238.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method571() * 8; var6 < var5.method571() * 8 + 8; var6++) {
                for (int var7 = var5.method572() * 8; var7 < var5.method572() * 8 + 8; var7++) {
                    this.method380(var6, var7, var5, arg0, arg2);
                    this.method409(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field238.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method571() * 8; var10 < var9.method571() * 8 + 8; var10++) {
                for (int var11 = var9.method572() * 8; var11 < var9.method572() * 8 + 8; var11++) {
                    this.method379(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("at.p(IILs;Law;[Lll;I)V")
    public void method379(int arg0, int arg1, class22 arg2, class41 arg3, class326[] arg4) {
        this.method368(arg0, arg1, arg2);
        this.method383(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("at.k(IILs;Law;Lai;B)V")
    public void method380(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field148[0][arg0][arg1] - 1;
        int var7 = arg2.field157[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class323.method5630(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, this.field240, this.field237);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field237;
            class278 var10 = class278.method3135(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field3593 >= 0) {
                var11 = var10.field3593 | 0xFF000000;
            } else if (var10.field3589 >= 0) {
                int var12 = class33.method2865(Statics.field1765.method2546(var10.field3589), 96);
                var11 = class130.field1761[var12] | 0xFF000000;
            } else if (var10.field3588 == 16711935) {
                var11 = var9;
            } else {
                int var13 = var10.field3592;
                int var14 = var10.field3590;
                int var15 = var10.field3594;
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
                int var19 = class33.method2865(var16, 96);
                var11 = class130.field1761[var19] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field158[0][arg0][arg1] == 0) {
            class323.method5630(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, this.field240, var8);
            return;
        }
        int var20 = this.method382(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class323.method5630(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, this.field240, var20);
        } else {
            arg3.method616(this.field240 * arg0, this.field240 * (63 - arg1), var20, var8, this.field240, this.field240, arg2.field158[0][arg0][arg1], arg2.field159[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("at.o(IILs;Law;I)V")
    public void method409(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field161; var5++) {
            int var6 = arg2.field157[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field237;
                class278 var8 = class278.method3135(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3593 >= 0) {
                    var9 = var8.field3593 | 0xFF000000;
                } else if (var8.field3589 >= 0) {
                    int var10 = class33.method2865(Statics.field1765.method2546(var8.field3589), 96);
                    var9 = class130.field1761[var10] | 0xFF000000;
                } else if (var8.field3588 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = var8.field3592;
                    int var12 = var8.field3590;
                    int var13 = var8.field3594;
                    if (var13 > 179) {
                        var12 /= 2;
                    }
                    if (var13 > 192) {
                        var12 /= 2;
                    }
                    if (var13 > 217) {
                        var12 /= 2;
                    }
                    if (var13 > 243) {
                        var12 /= 2;
                    }
                    int var14 = var13 / 2 + (var11 / 4 << 10) + (var12 / 32 << 7);
                    int var17 = class33.method2865(var14, 96);
                    var9 = class130.field1761[var17] | 0xFF000000;
                }
                if (arg2.field158[var5][arg0][arg1] == 0) {
                    class323.method5630(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, this.field240, var9);
                } else {
                    arg3.method616(this.field240 * arg0, this.field240 * (63 - arg1), 0, var9, this.field240, this.field240, arg2.field158[var5][arg0][arg1], arg2.field159[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("at.s(IILs;Lai;I)I")
    public int method382(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field148[0][arg0][arg1] == 0 ? this.field237 : arg3.method357(arg0, arg1);
    }

    @ObfuscatedName("at.u(IILs;[Lll;I)V")
    public void method383(int arg0, int arg1, class22 arg2, class326[] arg3) {
        for (int var5 = 0; var5 < arg2.field161; var5++) {
            class26[] var6 = arg2.field153[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    int var10 = var9.field201;
                    boolean var11 = var10 >= class241.field2850.field2853 && var10 <= class241.field2851.field2853;
                    if (var11 || class241.method3072(var9.field201)) {
                        class274 var12 = class274.method4676(var9.field202);
                        if (var12.field3460 != -1) {
                            if (var12.field3460 == 46 || var12.field3460 == 52) {
                                arg3[var12.field3460].method5670(this.field240 * arg0, this.field240 * (63 - arg1), this.field240 * 2 + 1, this.field240 * 2 + 1);
                            } else {
                                arg3[var12.field3460].method5670(this.field240 * arg0, this.field240 * (63 - arg1), this.field240 * 2, this.field240 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.aa(IILs;B)V")
    public void method368(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field161; var4++) {
            class26[] var5 = arg2.field153[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    int var9 = var8.field201;
                    boolean var10 = var9 >= class241.field2846.field2853 && var9 <= class241.field2833.field2853 || class241.field2830.field2853 == var9;
                    if (var10) {
                        class274 var11 = class274.method4676(var8.field202);
                        int var12 = var11.field3471 == 0 ? -3355444 : -3407872;
                        if (class241.field2846.field2853 == var8.field201) {
                            this.method398(arg0, arg1, var8.field200, var12);
                        }
                        if (class241.field2840.field2853 == var8.field201) {
                            this.method398(arg0, arg1, var8.field200, -3355444);
                            this.method398(arg0, arg1, var8.field200 + 1, var12);
                        }
                        if (class241.field2833.field2853 == var8.field201) {
                            if (var8.field200 == 0) {
                                class323.method5652(this.field240 * arg0, this.field240 * (63 - arg1), 1, var12);
                            }
                            if (var8.field200 == 1) {
                                class323.method5652(this.field240 * arg0 + this.field240 - 1, this.field240 * (63 - arg1), 1, var12);
                            }
                            if (var8.field200 == 2) {
                                class323.method5652(this.field240 * arg0 + this.field240 - 1, this.field240 * (63 - arg1) + this.field240 - 1, 1, var12);
                            }
                            if (var8.field200 == 3) {
                                class323.method5652(this.field240 * arg0, this.field240 * (63 - arg1) + this.field240 - 1, 1, var12);
                            }
                        }
                        if (class241.field2830.field2853 == var8.field201) {
                            int var13 = var8.field200 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field240; var14++) {
                                    class323.method5652(this.field240 * arg0 + var14, this.field240 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field240; var15++) {
                                    class323.method5652(this.field240 * arg0 + var15, this.field240 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.ai(IILjava/util/HashSet;II)V")
    public void method385(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field234.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class234 var9 = (class234) var8.getKey();
            int var10 = (int) ((float) var9.field2637 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2638 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method508()) {
                var12.field290 = var10;
                var12.field291 = var11;
                class262 var13 = class262.method106(var12.method185());
                if (!arg2.contains(var13.method4657())) {
                    this.method370(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("at.ag(Ljava/util/HashSet;IIB)V")
    public void method386(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field241.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method508()) {
                class262 var6 = class262.method106(var5.method185());
                if (var6 != null && arg0.contains(var6.method4657())) {
                    this.method387(var6, var5.field290, var5.field291, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("at.at(Ljy;IIIIB)V")
    public void method387(class262 arg0, int arg1, int arg2, int arg3, int arg4) {
        class327 var6 = arg0.method4655(false);
        if (var6 == null) {
            return;
        }
        var6.method5742(arg1 - var6.field3878 / 2, arg2 - var6.field3880 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class323.method5598(arg1, arg2, 15, 16776960, 128);
            class323.method5598(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("at.ad(Lak;IIFI)V")
    public void method370(class35 arg0, int arg1, int arg2, float arg3) {
        class262 var5 = class262.method106(arg0.method185());
        this.method400(var5, arg1, arg2);
        this.method415(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("at.as(Ljy;III)V")
    public void method400(class262 arg0, int arg1, int arg2) {
        class327 var4 = arg0.method4655(false);
        if (var4 != null) {
            int var5 = this.method392(var4, arg0.field3325);
            int var6 = this.method393(var4, arg0.field3323);
            var4.method5742(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("at.ac(Lak;Ljy;IIFI)V")
    public void method415(class35 arg0, class262 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method200();
        if (var6 != null && var6.field227.method178(arg4)) {
            class304 var7 = (class304) this.field243.get(var6.field227);
            var7.method5341(var6.field231, arg2 - var6.field224 / 2, arg3, var6.field224, var6.field225, 0xFF000000 | arg1.field3320, 0, 1, 0, var7.field3758 / 2);
        }
    }

    @ObfuscatedName("at.an(IILjava/util/HashSet;IB)V")
    public void method391(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field241.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method508()) {
                int var8 = var7.field289.field2637 % 64;
                int var9 = var7.field289.field2638 % 64;
                var7.field290 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field291 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method185())) {
                    this.method370(var7, var7.field290, var7.field291, var5);
                }
            }
        }
    }

    @ObfuscatedName("at.ak(Llu;Ljl;B)I")
    public int method392(class327 arg0, class276 arg1) {
        switch(arg1.field3547) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3878 / 2;
            default:
                return -arg0.field3878;
        }
    }

    @ObfuscatedName("at.ah(Llu;Lig;I)I")
    public int method393(class327 arg0, class259 arg1) {
        switch(arg1.field3293) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3880 / 2;
            default:
                return -arg0.field3880;
        }
    }

    @ObfuscatedName("at.al(II)Lag;")
    public class29 method394(int arg0) {
        class262 var2 = class262.method106(arg0);
        return this.method433(var2);
    }

    @ObfuscatedName("at.am(Ljy;I)Lag;")
    public class29 method433(class262 arg0) {
        if (arg0.field3315 == null || this.field243 == null || this.field243.get(class18.field117) == null) {
            return null;
        }
        class18 var2 = class18.method179(arg0.field3317);
        if (var2 == null) {
            return null;
        }
        class304 var3 = (class304) this.field243.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5335(arg0.field3315, 1000000);
        String[] var5 = new String[var4];
        var3.method5415(arg0.field3315, (int[]) null, var5);
        int var6 = var5.length * var3.field3758 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5345(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class29(arg0.field3315, var7, var6, var2);
    }

    @ObfuscatedName("at.ao(IIIIIS)Ljava/util/List;")
    public List method396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field234.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method508() && var8.method502(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field241.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method508() && var10.method502(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("at.aq(I)Ljava/util/List;")
    public List method397() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field241);
        var1.addAll(this.field234.values());
        return var1;
    }

    @ObfuscatedName("at.aw(IIIIB)V")
    public void method398(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class323.method5599(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, arg3);
        }
        if (var5 == 1) {
            class323.method5652(this.field240 * arg0, this.field240 * (63 - arg1), this.field240, arg3);
        }
        if (var5 == 2) {
            class323.method5599(this.field240 * arg0 + this.field240 - 1, this.field240 * (63 - arg1), this.field240, arg3);
        }
        if (var5 == 3) {
            class323.method5652(this.field240 * arg0, this.field240 * (63 - arg1) + this.field240 - 1, this.field240, arg3);
        }
    }
}
