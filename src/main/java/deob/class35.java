package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ak")
public class class35 {

    @ObfuscatedName("ak.k")
    public int field496;

    @ObfuscatedName("ak.f")
    public int field491;

    @ObfuscatedName("ak.i")
    public class23 field489;

    @ObfuscatedName("ak.j")
    public LinkedList field493;

    @ObfuscatedName("ak.m")
    public int field494;

    @ObfuscatedName("ak.u")
    public int field495;

    @ObfuscatedName("ak.r")
    public int[][] field492;

    @ObfuscatedName("ak.v")
    public class289 field504;

    @ObfuscatedName("ak.h")
    public List field498;

    @ObfuscatedName("ak.a")
    public HashMap field499;

    @ObfuscatedName("ak.p")
    public final HashMap field500;

    @ObfuscatedName("ak.q")
    public static final class216 field497 = new class216();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field496 = arg0;
        this.field491 = arg1;
        this.field493 = new LinkedList();
        this.field498 = new LinkedList();
        this.field499 = new HashMap();
        this.field494 = arg2 | 0xFF000000;
        this.field500 = arg3;
    }

    @ObfuscatedName("ak.w(IIII)V")
    public void method415(int arg0, int arg1, int arg2) {
        if (this.field504 == null) {
            return;
        }
        if (this.field495 * 64 == arg2) {
            this.field504.method4697(arg0, arg1);
        } else {
            this.field504.method4756(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ak.o(Ly;Ljava/util/List;I)V")
    public void method327(class23 arg0, List arg1) {
        this.field499.clear();
        this.field489 = arg0;
        this.method366(0, 0, 64, 64, this.field489);
        this.method457(arg1);
    }

    @ObfuscatedName("ak.x(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method328(HashSet arg0, List arg1) {
        this.field499.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method214() == this.field496 && var4.method215() == this.field491) {
                this.field493.add(var4);
                this.method366(var4.method572() * 8, var4.method565() * 8, 8, 8, var4);
            }
        }
        this.method457(arg1);
    }

    @ObfuscatedName("ak.k(IIIILaf;I)V")
    public void method366(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class216 var8 = new class216(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field421; var9++) {
                    class32[] var10 = arg4.field425[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class246 var14 = this.method359(var13.field453);
                            if (var14 != null) {
                                class216 var15 = new class216(var9, this.field496 * 64 + var6, this.field491 * 64 + var7);
                                Object var16 = null;
                                class216 var17;
                                if (this.field489 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class216(var18.field415 + var9, var18.field427 * 64 + var6 + var18.method558() * 8, var18.field416 * 64 + var7 + var18.method573() * 8);
                                } else {
                                    var17 = new class216(this.field489.field415 + var9, this.field489.field427 * 64 + var6, this.field489.field416 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3296, var17, var15, this.method361(var14));
                                this.field499.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.f(Ljava/util/List;B)V")
    public void method457(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field380.field2622 >> 6 == this.field496 && var3.field380.field2620 >> 6 == this.field491) {
                class40 var4 = new class40(var3.field384, var3.field380, var3.field380, this.method360(var3.field384));
                this.field498.add(var4);
            }
        }
    }

    @ObfuscatedName("ak.i(ILav;[Lak;[Lki;I)Z")
    public boolean method458(int arg0, class47 arg1, class35[] arg2, class288[] arg3) {
        if (!this.method367(arg0)) {
            return false;
        } else if (this.field489 == null && this.field493.isEmpty()) {
            return false;
        } else {
            this.method340(arg2);
            this.field504.method4745();
            if (this.field489 == null) {
                this.method336(arg1, arg3);
            } else {
                this.method334(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ak.j(IIILjava/util/HashSet;I)V")
    public void method332(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method443(arg0, arg1, arg3, arg2);
        this.method354(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ak.m(Ljava/util/HashSet;IIB)V")
    public void method333(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field499.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field549)) {
                class246 var6 = Statics.field3301[var5.field549];
                this.method350(var6, var5.field547, var5.field548, arg1, arg2);
            }
        }
        this.method373(arg0, arg1, arg2);
    }

    @ObfuscatedName("ak.u(II)Z")
    public boolean method367(int arg0) {
        if (this.field504 != null && this.field495 == arg0) {
            return false;
        } else {
            this.field495 = arg0;
            this.field504 = new class289(this.field495 * 64, this.field495 * 64);
            return true;
        }
    }

    @ObfuscatedName("ak.h(Lav;[Lak;[Lki;B)V")
    public void method334(class47 arg0, class35[] arg1, class288[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method421(var4, var5, this.field489, arg0);
                this.method339(var4, var5, this.field489, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method337(var6, var7, this.field489, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ak.a(Lav;[Lki;I)V")
    public void method336(class47 arg0, class288[] arg1) {
        Iterator var3 = this.field493.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method572() * 8; var5 < var4.method572() * 8 + 8; var5++) {
                for (int var6 = var4.method565() * 8; var6 < var4.method565() * 8 + 8; var6++) {
                    this.method421(var5, var6, var4, arg0);
                    this.method339(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field493.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method572() * 8; var9 < var8.method572() * 8 + 8; var9++) {
                for (int var10 = var8.method565() * 8; var10 < var8.method565() * 8 + 8; var10++) {
                    this.method337(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ak.p(IILaf;Lav;[Lki;I)V")
    public void method337(int arg0, int arg1, class29 arg2, class47 arg3, class288[] arg4) {
        this.method347(arg0, arg1, arg2);
        this.method440(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ak.q(IILaf;Lav;B)V")
    public void method421(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field418[0][arg0][arg1] - 1;
        int var6 = arg2.field419[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class285.method4623(this.field495 * arg0, this.field495 * (63 - arg1), this.field495, this.field495, this.field494);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method3688(var6, this.field494);
        }
        if (var6 > -1 && arg2.field423[0][arg0][arg1] == 0) {
            class285.method4623(this.field495 * arg0, this.field495 * (63 - arg1), this.field495, this.field495, var7);
            return;
        }
        int var8 = this.method338(arg0, arg1, arg2);
        if (var6 == -1) {
            class285.method4623(this.field495 * arg0, this.field495 * (63 - arg1), this.field495, this.field495, var8);
        } else {
            arg3.method595(this.field495 * arg0, this.field495 * (63 - arg1), var8, var7, this.field495, this.field495, arg2.field423[0][arg0][arg1], arg2.field424[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ak.l(IILaf;Lav;B)V")
    public void method339(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field421; var5++) {
            int var6 = arg2.field419[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method3688(var6, this.field494);
                if (arg2.field423[var5][arg0][arg1] == 0) {
                    class285.method4623(this.field495 * arg0, this.field495 * (63 - arg1), this.field495, this.field495, var7);
                } else {
                    arg3.method595(this.field495 * arg0, this.field495 * (63 - arg1), 0, var7, this.field495, this.field495, arg2.field423[var5][arg0][arg1], arg2.field424[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ak.c([Lak;I)Z")
    public boolean method340(class35[] arg0) {
        if (this.field492 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field489 == null) {
            Iterator var3 = this.field493.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method343(var4.method572() * 8, var4.method565() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method343(0, 0, 64, 64, this.field489, var2);
        }
        this.method330(arg0, var2);
        this.method452(var2);
        return true;
    }

    @ObfuscatedName("ak.n(Lax;B)V")
    public void method452(class44 arg0) {
        this.field492 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field492[var2][var3] = arg0.method547(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ak.z([Lak;Lax;I)V")
    public void method330(class35[] arg0, class44 arg1) {
        class232[] var3 = class232.method3710();
        class232[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class232 var6 = var4[var5];
            if (arg0[var6.method12()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3157) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
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
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 3:
                        var12 = 59;
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
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 7:
                        var8 = 59;
                        var10 = 5;
                }
                this.method446(var11, var12, var7, var8, var9, var10, arg0[var6.method12()], arg1);
            }
        }
    }

    @ObfuscatedName("ak.e(IIIILaf;Lax;I)V")
    public void method343(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field418[0][var7][var8] - 1;
                if (var9 != -1) {
                    class250 var10 = class250.method1621(var9);
                    arg5.method542(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ak.t(IIIIIILak;Lax;I)V")
    public void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method370(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class250 var12 = class250.method1621(var11);
                    arg7.method542(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ak.b(IILaf;B)I")
    public int method338(int arg0, int arg1, class29 arg2) {
        return arg2.field418[0][arg0][arg1] == 0 ? this.field494 : this.field492[arg0][arg1];
    }

    @ObfuscatedName("ak.s(IILaf;[Lki;I)V")
    public void method440(int arg0, int arg1, class29 arg2, class288[] arg3) {
        for (int var5 = 0; var5 < arg2.field421; var5++) {
            class32[] var6 = arg2.field425[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field456;
                    boolean var11 = var10 >= class225.field2835.field2838 && var10 <= class225.field2832.field2838;
                    if (!var11) {
                        int var12 = var9.field456;
                        boolean var13 = class225.field2837.field2838 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class259 var14 = class259.method997(var9.field453);
                    if (var14.field3477 != -1) {
                        if (var14.field3477 == 46 || var14.field3477 == 52) {
                            arg3[var14.field3477].method4674(this.field495 * arg0, this.field495 * (63 - arg1), this.field495 * 2 + 1, this.field495 * 2 + 1);
                        } else {
                            arg3[var14.field3477].method4674(this.field495 * arg0, this.field495 * (63 - arg1), this.field495 * 2, this.field495 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ap(IILaf;I)V")
    public void method347(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field421; var4++) {
            class32[] var5 = arg2.field425[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field456;
                    boolean var10 = var9 >= class225.field2834.field2838 && var9 <= class225.field2818.field2838 || class225.field2819.field2838 == var9;
                    if (var10) {
                        class259 var11 = class259.method997(var8.field453);
                        int var12 = var11.field3467 == 0 ? -3355444 : -3407872;
                        if (class225.field2834.field2838 == var8.field456) {
                            this.method381(arg0, arg1, var8.field455, var12);
                        }
                        if (class225.field2815.field2838 == var8.field456) {
                            this.method381(arg0, arg1, var8.field455, -3355444);
                            this.method381(arg0, arg1, var8.field455 + 1, var12);
                        }
                        if (class225.field2818.field2838 == var8.field456) {
                            if (var8.field455 == 0) {
                                class285.method4591(this.field495 * arg0, this.field495 * (63 - arg1), 1, var12);
                            }
                            if (var8.field455 == 1) {
                                class285.method4591(this.field495 * arg0 + this.field495 - 1, this.field495 * (63 - arg1), 1, var12);
                            }
                            if (var8.field455 == 2) {
                                class285.method4591(this.field495 * arg0 + this.field495 - 1, this.field495 * (63 - arg1) + this.field495 - 1, 1, var12);
                            }
                            if (var8.field455 == 3) {
                                class285.method4591(this.field495 * arg0, this.field495 * (63 - arg1) + this.field495 - 1, 1, var12);
                            }
                        }
                        if (class225.field2819.field2838 == var8.field456) {
                            int var13 = var8.field455 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field495; var14++) {
                                    class285.method4591(this.field495 * arg0 + var14, this.field495 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field495; var15++) {
                                    class285.method4591(this.field495 * arg0 + var15, this.field495 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ac(IILjava/util/HashSet;II)V")
    public void method443(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field499.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class216 var9 = (class216) var8.getKey();
            int var10 = (int) ((float) var9.field2622 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2620 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field547 = var10;
                var12.field548 = var11;
                class246 var13 = Statics.field3301[var12.field549];
                if (!arg2.contains(var13.method3898())) {
                    this.method351(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ak.af(Ljava/util/HashSet;III)V")
    public void method373(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field498.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class246 var6 = Statics.field3301[var5.field549];
            if (var6 != null && arg0.contains(var6.method3898())) {
                this.method350(var6, var5.field547, var5.field548, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ak.ai(Lit;IIIII)V")
    public void method350(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        class289 var6 = arg0.method3896(false);
        if (var6 == null) {
            return;
        }
        var6.method4699(arg1 - var6.field3797 / 2, arg2 - var6.field3790 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class285.method4601(arg1, arg2, 15, 16776960, 128);
            class285.method4601(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ak.ad(Las;IIFI)V")
    public void method351(class40 arg0, int arg1, int arg2, float arg3) {
        class246 var5 = Statics.field3301[arg0.field549];
        this.method325(var5, arg1, arg2);
        this.method353(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ak.ar(Lit;IIB)V")
    public void method325(class246 arg0, int arg1, int arg2) {
        class289 var4 = arg0.method3896(false);
        if (var4 != null) {
            int var5 = this.method445(var4, arg0.field3300);
            int var6 = this.method358(var4, arg0.field3310);
            var4.method4699(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ak.aq(Las;Lit;IIFB)V")
    public void method353(class40 arg0, class246 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field546 != null && arg0.field546.field480.method166(arg4)) {
            class267 var6 = (class267) this.field500.get(arg0.field546.field480);
            var6.method4413(arg0.field546.field485, arg2 - arg0.field546.field486 / 2, arg3, arg0.field546.field486, arg0.field546.field479, 0xFF000000 | arg1.field3293, 0, 1, 0, var6.field3657 / 2);
        }
    }

    @ObfuscatedName("ak.ag(IILjava/util/HashSet;II)V")
    public void method354(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field498.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field541.field2622 % 64;
            int var9 = var7.field541.field2620 % 64;
            var7.field547 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field548 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field549)) {
                this.method351(var7, var7.field547, var7.field548, var5);
            }
        }
    }

    @ObfuscatedName("ak.ak(B)V")
    public void method355() {
        if (this.field489 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method436(var1, var2, this.field489);
                }
            }
            return;
        }
        Iterator var3 = this.field493.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method572() * 8; var5 < var4.method572() * 8 + 8; var5++) {
                for (int var6 = var4.method565() * 8; var6 < var4.method565() * 8 + 8; var6++) {
                    this.method436(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ak.ae(IILaf;I)V")
    public void method436(int arg0, int arg1, class29 arg2) {
        field497.method3602(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field421; var4++) {
            class32[] var5 = arg2.field425[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class246 var9 = this.method359(var8.field453);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field499.get(field497);
                        if (var10 != null) {
                            if (var9.field3296 != var10.field549) {
                                class40 var11 = new class40(var9.field3296, var10.field542, var10.field541, this.method361(var9));
                                this.field499.put(new class216(field497), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field542.field2621 - var10.field541.field2621;
                            var10.field541.field2621 = var4;
                            var10.field542.field2621 = var4 + var12;
                            return;
                        }
                        class216 var13 = new class216(var4, this.field496 * 64 + arg0, this.field491 * 64 + arg1);
                        class216 var14 = null;
                        if (this.field489 == null) {
                            Iterator var15 = this.field493.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method559(arg0, arg1)) {
                                    var14 = new class216(var16.field415 + var4, var16.field427 * 64 + arg0 + var16.method558() * 8, var16.field416 * 64 + arg1 + var16.method573() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class216(this.field489.field415 + var4, this.field489.field427 * 64 + arg0, this.field489.field416 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3296, var14, var13, this.method361(var9));
                            this.field499.put(new class216(field497), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field499.remove(field497);
    }

    @ObfuscatedName("ak.am(Lkh;Ljx;I)I")
    public int method445(class289 arg0, class261 arg1) {
        switch(arg1.field3559) {
            case 0:
                return -arg0.field3797 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3797;
        }
    }

    @ObfuscatedName("ak.az(Lkh;Lil;I)I")
    public int method358(class289 arg0, class243 arg1) {
        switch(arg1.field3271) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3790 / 2;
            default:
                return -arg0.field3790;
        }
    }

    @ObfuscatedName("ak.ay(II)Lit;")
    public class246 method359(int arg0) {
        class259 var2 = class259.method997(arg0);
        if (var2.field3489 != null) {
            var2 = var2.method4176();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3464 == -1 ? null : Statics.field3301[var2.field3464];
    }

    @ObfuscatedName("ak.as(II)Lag;")
    public class34 method360(int arg0) {
        class246 var2 = Statics.field3301[arg0];
        return this.method361(var2);
    }

    @ObfuscatedName("ak.aw(Lit;I)Lag;")
    public class34 method361(class246 arg0) {
        if (arg0.field3299 == null || this.field500 == null || this.field500.get(class25.field378) == null) {
            return null;
        }
        int var2 = arg0.field3308;
        class25[] var3 = new class25[] { class25.field369, class25.field368, class25.field378 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field375 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class267 var9 = (class267) this.field500.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4405(arg0.field3299, 1000000);
        String[] var11 = new String[var10];
        var9.method4484(arg0.field3299, (int[]) null, var11);
        int var12 = var11.length * var9.field3657 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4402(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class34(arg0.field3299, var13, var12, var7);
    }

    @ObfuscatedName("ak.at(IIIIII)Ljava/util/List;")
    public List method362(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field499.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method484(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field498.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method484(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ak.aj(B)Ljava/util/List;")
    public List method341() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field498);
        var1.addAll(this.field499.values());
        return var1;
    }

    @ObfuscatedName("ak.ax(IIIIB)V")
    public void method381(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class285.method4644(this.field495 * arg0, this.field495 * (63 - arg1), this.field495, arg3);
        }
        if (var5 == 1) {
            class285.method4591(this.field495 * arg0, this.field495 * (63 - arg1), this.field495, arg3);
        }
        if (var5 == 2) {
            class285.method4644(this.field495 * arg0 + this.field495 - 1, this.field495 * (63 - arg1), this.field495, arg3);
        }
        if (var5 == 3) {
            class285.method4591(this.field495 * arg0, this.field495 * (63 - arg1) + this.field495 - 1, this.field495, arg3);
        }
    }

    @ObfuscatedName("ak.an(III)I")
    public int method370(int arg0, int arg1) {
        if (this.field489 != null) {
            return this.field489.method222(arg0, arg1);
        }
        if (!this.field493.isEmpty()) {
            Iterator var3 = this.field493.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method559(arg0, arg1)) {
                    return var4.method222(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
