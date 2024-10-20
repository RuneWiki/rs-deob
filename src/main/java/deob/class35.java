package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ak")
public class class35 {

    @ObfuscatedName("ak.p")
    public int field448;

    @ObfuscatedName("ak.a")
    public int field438;

    @ObfuscatedName("ak.h")
    public class23 field453;

    @ObfuscatedName("ak.l")
    public LinkedList field444;

    @ObfuscatedName("ak.y")
    public int field445;

    @ObfuscatedName("ak.g")
    public int field446;

    @ObfuscatedName("ak.c")
    public int[][] field447;

    @ObfuscatedName("ak.u")
    public class323 field449;

    @ObfuscatedName("ak.r")
    public List field441;

    @ObfuscatedName("ak.d")
    public HashMap field450;

    @ObfuscatedName("ak.v")
    public final HashMap field451;

    @ObfuscatedName("ak.s")
    public static final class233 field452 = new class233();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field448 = arg0;
        this.field438 = arg1;
        this.field444 = new LinkedList();
        this.field441 = new LinkedList();
        this.field450 = new HashMap();
        this.field445 = arg2 | 0xFF000000;
        this.field451 = arg3;
    }

    @ObfuscatedName("ak.b(IIII)V")
    public void method341(int arg0, int arg1, int arg2) {
        if (this.field449 == null) {
            return;
        }
        if (this.field446 * 64 == arg2) {
            this.field449.method5342(arg0, arg1);
        } else {
            this.field449.method5393(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ak.q(Le;Ljava/util/List;B)V")
    public void method342(class23 arg0, List arg1) {
        this.field450.clear();
        this.field453 = arg0;
        this.method406(0, 0, 64, 64, this.field453);
        this.method345(arg1);
    }

    @ObfuscatedName("ak.o(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method457(HashSet arg0, List arg1) {
        this.field450.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method228() == this.field448 && var4.method238() == this.field438) {
                this.field444.add(var4);
                this.method406(var4.method594() * 8, var4.method587() * 8, 8, 8, var4);
            }
        }
        this.method345(arg1);
    }

    @ObfuscatedName("ak.p(IIIILam;I)V")
    public void method406(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class233 var8 = new class233(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field378; var9++) {
                    class32[] var10 = arg4.field383[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class263 var14 = this.method398(var13.field413);
                            if (var14 != null) {
                                class233 var15 = new class233(var9, this.field448 * 64 + var6, this.field438 * 64 + var7);
                                Object var16 = null;
                                class233 var17;
                                if (this.field453 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class233(var18.field385 + var9, var18.field384 * 64 + var6 + var18.method584() * 8, var18.field374 * 64 + var7 + var18.method585() * 8);
                                } else {
                                    var17 = new class233(this.field453.field385 + var9, this.field453.field384 * 64 + var6, this.field453.field374 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3407, var17, var15, this.method411(var14));
                                this.field450.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.a(Ljava/util/List;I)V")
    public void method345(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field343.field2742 >> 6 == this.field448 && var3.field343.field2743 >> 6 == this.field438) {
                class40 var4 = new class40(var3.field348, var3.field343, var3.field343, this.method375(var3.field348));
                this.field441.add(var4);
            }
        }
    }

    @ObfuscatedName("ak.h(ILaa;[Lak;[Llv;S)Z")
    public boolean method346(int arg0, class47 arg1, class35[] arg2, class322[] arg3) {
        if (!this.method349(arg0)) {
            return false;
        } else if (this.field453 == null && this.field444.isEmpty()) {
            return false;
        } else {
            this.method355(arg2);
            this.field449.method5335();
            if (this.field453 == null) {
                this.method351(arg1, arg3);
            } else {
                this.method383(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ak.l(IIILjava/util/HashSet;I)V")
    public void method347(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method365(arg0, arg1, arg3, arg2);
        this.method369(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ak.y(Ljava/util/HashSet;III)V")
    public void method348(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field450.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field489)) {
                class263 var6 = Statics.field4025[var5.field489];
                this.method388(var6, var5.field495, var5.field496, arg1, arg2);
            }
        }
        this.method364(arg0, arg1, arg2);
    }

    @ObfuscatedName("ak.g(II)Z")
    public boolean method349(int arg0) {
        if (this.field449 != null && this.field446 == arg0) {
            return false;
        } else {
            this.field446 = arg0;
            this.field449 = new class323(this.field446 * 64, this.field446 * 64);
            return true;
        }
    }

    @ObfuscatedName("ak.c(Laa;[Lak;[Llv;B)V")
    public void method383(class47 arg0, class35[] arg1, class322[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method353(var4, var5, this.field453, arg0);
                this.method354(var4, var5, this.field453, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method352(var6, var7, this.field453, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ak.u(Laa;[Llv;B)V")
    public void method351(class47 arg0, class322[] arg1) {
        Iterator var3 = this.field444.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method594() * 8; var5 < var4.method594() * 8 + 8; var5++) {
                for (int var6 = var4.method587() * 8; var6 < var4.method587() * 8 + 8; var6++) {
                    this.method353(var5, var6, var4, arg0);
                    this.method354(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field444.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method594() * 8; var9 < var8.method594() * 8 + 8; var9++) {
                for (int var10 = var8.method587() * 8; var10 < var8.method587() * 8 + 8; var10++) {
                    this.method352(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ak.t(IILam;Laa;[Llv;B)V")
    public void method352(int arg0, int arg1, class29 arg2, class47 arg3, class322[] arg4) {
        this.method362(arg0, arg1, arg2);
        this.method446(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ak.f(IILam;Laa;B)V")
    public void method353(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field379[0][arg0][arg1] - 1;
        int var6 = arg2.field380[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class319.method5232(this.field446 * arg0, this.field446 * (63 - arg1), this.field446, this.field446, this.field445);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            int var8 = this.field445;
            class280 var9 = class280.method163(var6);
            int var10;
            if (var9 == null) {
                var10 = var8;
            } else if (var9.field3670 >= 0) {
                var10 = var9.field3670 | 0xFF000000;
            } else if (var9.field3668 >= 0) {
                int var11 = class38.method177(Statics.field1913.method2365(var9.field3668), 96);
                var10 = class134.field1908[var11] | 0xFF000000;
            } else if (var9.field3667 == 16711935) {
                var10 = var8;
            } else {
                int var12 = class38.method43(var9.field3665, var9.field3672, var9.field3677);
                int var13 = class38.method177(var12, 96);
                var10 = class134.field1908[var13] | 0xFF000000;
            }
            var7 = var10;
        }
        if (var6 > -1 && arg2.field387[0][arg0][arg1] == 0) {
            class319.method5232(this.field446 * arg0, this.field446 * (63 - arg1), this.field446, this.field446, var7);
            return;
        }
        int var14 = this.method360(arg0, arg1, arg2);
        if (var6 == -1) {
            class319.method5232(this.field446 * arg0, this.field446 * (63 - arg1), this.field446, this.field446, var14);
        } else {
            arg3.method607(this.field446 * arg0, this.field446 * (63 - arg1), var14, var7, this.field446, this.field446, arg2.field387[0][arg0][arg1], arg2.field381[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ak.m(IILam;Laa;I)V")
    public void method354(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field378; var5++) {
            int var6 = arg2.field380[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field445;
                class280 var8 = class280.method163(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3670 >= 0) {
                    var9 = var8.field3670 | 0xFF000000;
                } else if (var8.field3668 >= 0) {
                    int var10 = class38.method177(Statics.field1913.method2365(var8.field3668), 96);
                    var9 = class134.field1908[var10] | 0xFF000000;
                } else if (var8.field3667 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = class38.method43(var8.field3665, var8.field3672, var8.field3677);
                    int var12 = class38.method177(var11, 96);
                    var9 = class134.field1908[var12] | 0xFF000000;
                }
                if (arg2.field387[var5][arg0][arg1] == 0) {
                    class319.method5232(this.field446 * arg0, this.field446 * (63 - arg1), this.field446, this.field446, var9);
                } else {
                    arg3.method607(this.field446 * arg0, this.field446 * (63 - arg1), 0, var9, this.field446, this.field446, arg2.field387[var5][arg0][arg1], arg2.field381[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ak.x([Lak;I)Z")
    public boolean method355(class35[] arg0) {
        if (this.field447 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field453 == null) {
            Iterator var3 = this.field444.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method376(var4.method594() * 8, var4.method587() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method376(0, 0, 64, 64, this.field453, var2);
        }
        this.method391(arg0, var2);
        this.method381(var2);
        return true;
    }

    @ObfuscatedName("ak.w(Lac;B)V")
    public void method381(class44 arg0) {
        this.field447 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field447[var2][var3] = arg0.method558(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ak.j([Lak;Lac;I)V")
    public void method391(class35[] arg0, class44 arg1) {
        class249[] var3 = new class249[] { class249.field3272, class249.field3270, class249.field3274, class249.field3276, class249.field3273, class249.field3271, class249.field3267, class249.field3269 };
        class249[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class249 var7 = var5[var6];
            if (arg0[var7.method12()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3275) {
                    case 0:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 1:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var9 = 59;
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
                        var12 = 59;
                        var10 = 5;
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
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                }
                this.method359(var12, var13, var8, var9, var10, var11, arg0[var7.method12()], arg1);
            }
        }
    }

    @ObfuscatedName("ak.z(IIIILam;Lac;I)V")
    public void method376(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field379[0][var7][var8] - 1;
                if (var9 != -1) {
                    class267 var10 = class267.method1776(var9);
                    arg5.method559(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ak.e(IIIIIILak;Lac;I)V")
    public void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method380(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class267 var12 = class267.method1776(var11);
                    arg7.method559(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ak.k(IILam;I)I")
    public int method360(int arg0, int arg1, class29 arg2) {
        return arg2.field379[0][arg0][arg1] == 0 ? this.field445 : this.field447[arg0][arg1];
    }

    @ObfuscatedName("ak.ao(IILam;[Llv;I)V")
    public void method446(int arg0, int arg1, class29 arg2, class322[] arg3) {
        for (int var5 = 0; var5 < arg2.field378; var5++) {
            class32[] var6 = arg2.field383[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (class242.method3579(var9.field410) || class242.method4125(var9.field410)) {
                        class276 var10 = class276.method1566(var9.field413);
                        if (var10.field3539 != -1) {
                            if (var10.field3539 == 46 || var10.field3539 == 52) {
                                arg3[var10.field3539].method5314(this.field446 * arg0, this.field446 * (63 - arg1), this.field446 * 2 + 1, this.field446 * 2 + 1);
                            } else {
                                arg3[var10.field3539].method5314(this.field446 * arg0, this.field446 * (63 - arg1), this.field446 * 2, this.field446 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.am(IILam;B)V")
    public void method362(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field378; var4++) {
            class32[] var5 = arg2.field383[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field410;
                    boolean var10 = var9 >= class242.field2938.field2959 && var9 <= class242.field2937.field2959 || class242.field2934.field2959 == var9;
                    if (var10) {
                        class276 var11 = class276.method1566(var8.field413);
                        int var12 = var11.field3537 == 0 ? -3355444 : -3407872;
                        if (class242.field2938.field2959 == var8.field410) {
                            this.method379(arg0, arg1, var8.field409, var12);
                        }
                        if (class242.field2936.field2959 == var8.field410) {
                            this.method379(arg0, arg1, var8.field409, -3355444);
                            this.method379(arg0, arg1, var8.field409 + 1, var12);
                        }
                        if (class242.field2937.field2959 == var8.field410) {
                            if (var8.field409 == 0) {
                                class319.method5229(this.field446 * arg0, this.field446 * (63 - arg1), 1, var12);
                            }
                            if (var8.field409 == 1) {
                                class319.method5229(this.field446 * arg0 + this.field446 - 1, this.field446 * (63 - arg1), 1, var12);
                            }
                            if (var8.field409 == 2) {
                                class319.method5229(this.field446 * arg0 + this.field446 - 1, this.field446 * (63 - arg1) + this.field446 - 1, 1, var12);
                            }
                            if (var8.field409 == 3) {
                                class319.method5229(this.field446 * arg0, this.field446 * (63 - arg1) + this.field446 - 1, 1, var12);
                            }
                        }
                        if (class242.field2934.field2959 == var8.field410) {
                            int var13 = var8.field409 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field446; var14++) {
                                    class319.method5229(this.field446 * arg0 + var14, this.field446 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field446; var15++) {
                                    class319.method5229(this.field446 * arg0 + var15, this.field446 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.aj(IILjava/util/HashSet;II)V")
    public void method365(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field450.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class233 var9 = (class233) var8.getKey();
            int var10 = (int) ((float) var9.field2742 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2743 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field495 = var10;
                var12.field496 = var11;
                class263 var13 = Statics.field4025[var12.field489];
                if (!arg2.contains(var13.method4344())) {
                    this.method366(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ak.ah(Ljava/util/HashSet;III)V")
    public void method364(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field441.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class263 var6 = Statics.field4025[var5.field489];
            if (var6 != null && arg0.contains(var6.method4344())) {
                this.method388(var6, var5.field495, var5.field496, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ak.af(Ljz;IIIII)V")
    public void method388(class263 arg0, int arg1, int arg2, int arg3, int arg4) {
        class323 var6 = arg0.method4342(false);
        if (var6 == null) {
            return;
        }
        var6.method5344(arg1 - var6.field3901 / 2, arg2 - var6.field3911 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class319.method5218(arg1, arg2, 15, 16776960, 128);
            class319.method5218(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ak.ai(Lad;IIFI)V")
    public void method366(class40 arg0, int arg1, int arg2, float arg3) {
        class263 var5 = Statics.field4025[arg0.field489];
        this.method367(var5, arg1, arg2);
        this.method368(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ak.aq(Ljz;III)V")
    public void method367(class263 arg0, int arg1, int arg2) {
        class323 var4 = arg0.method4342(false);
        if (var4 != null) {
            int var5 = this.method386(var4, arg0.field3391);
            int var6 = this.method373(var4, arg0.field3408);
            var4.method5344(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ak.ak(Lad;Ljz;IIFI)V")
    public void method368(class40 arg0, class263 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field494 != null && arg0.field494.field434.method181(arg4)) {
            class298 var6 = (class298) this.field451.get(arg0.field494.field434);
            var6.method5007(arg0.field494.field432, arg2 - arg0.field494.field437 / 2, arg3, arg0.field494.field437, arg0.field494.field433, 0xFF000000 | arg1.field3397, 0, 1, 0, var6.field3771 / 2);
        }
    }

    @ObfuscatedName("ak.al(IILjava/util/HashSet;II)V")
    public void method369(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field441.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field491.field2742 % 64;
            int var9 = var7.field491.field2743 % 64;
            var7.field495 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field496 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field489)) {
                this.method366(var7, var7.field495, var7.field496, var5);
            }
        }
    }

    @ObfuscatedName("ak.as(I)V")
    public void method370() {
        if (this.field453 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method371(var1, var2, this.field453);
                }
            }
            return;
        }
        Iterator var3 = this.field444.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method594() * 8; var5 < var4.method594() * 8 + 8; var5++) {
                for (int var6 = var4.method587() * 8; var6 < var4.method587() * 8 + 8; var6++) {
                    this.method371(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ak.az(IILam;I)V")
    public void method371(int arg0, int arg1, class29 arg2) {
        field452.method4025(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field378; var4++) {
            class32[] var5 = arg2.field383[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class263 var9 = this.method398(var8.field413);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field450.get(field452);
                        if (var10 != null) {
                            if (var9.field3407 != var10.field489) {
                                class40 var11 = new class40(var9.field3407, var10.field492, var10.field491, this.method411(var9));
                                this.field450.put(new class233(field452), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field492.field2741 - var10.field491.field2741;
                            var10.field491.field2741 = var4;
                            var10.field492.field2741 = var4 + var12;
                            return;
                        }
                        class233 var13 = new class233(var4, this.field448 * 64 + arg0, this.field438 * 64 + arg1);
                        class233 var14 = null;
                        if (this.field453 == null) {
                            Iterator var15 = this.field444.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method595(arg0, arg1)) {
                                    var14 = new class233(var16.field385 + var4, var16.field384 * 64 + arg0 + var16.method584() * 8, var16.field374 * 64 + arg1 + var16.method585() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class233(this.field453.field385 + var4, this.field453.field384 * 64 + arg0, this.field453.field374 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3407, var14, var13, this.method411(var9));
                            this.field450.put(new class233(field452), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field450.remove(field452);
    }

    @ObfuscatedName("ak.ax(Llm;Ljj;I)I")
    public int method386(class323 arg0, class278 arg1) {
        switch(arg1.field3624) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3901 / 2;
            default:
                return -arg0.field3901;
        }
    }

    @ObfuscatedName("ak.ad(Llm;Lif;B)I")
    public int method373(class323 arg0, class260 arg1) {
        switch(arg1.field3379) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3911 / 2;
            default:
                return -arg0.field3911;
        }
    }

    @ObfuscatedName("ak.ar(II)Ljz;")
    public class263 method398(int arg0) {
        class276 var2 = class276.method1566(arg0);
        if (var2.field3541 != null) {
            var2 = var2.method4563();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3546 == -1 ? null : Statics.field4025[var2.field3546];
    }

    @ObfuscatedName("ak.ag(II)Laq;")
    public class34 method375(int arg0) {
        class263 var2 = Statics.field4025[arg0];
        return this.method411(var2);
    }

    @ObfuscatedName("ak.au(Ljz;B)Laq;")
    public class34 method411(class263 arg0) {
        if (arg0.field3396 == null || this.field451 == null || this.field451.get(class25.field337) == null) {
            return null;
        }
        class25 var2 = class25.method182(arg0.field3400);
        if (var2 == null) {
            return null;
        }
        class298 var3 = (class298) this.field451.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5001(arg0.field3396, 1000000);
        String[] var5 = new String[var4];
        var3.method4999(arg0.field3396, (int[]) null, var5);
        int var6 = var5.length * var3.field3771 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5018(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class34(arg0.field3396, var7, var6, var2);
    }

    @ObfuscatedName("ak.ac(IIIIII)Ljava/util/List;")
    public List method377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field450.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method501(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field441.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method501(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ak.ay(B)Ljava/util/List;")
    public List method378() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field441);
        var1.addAll(this.field450.values());
        return var1;
    }

    @ObfuscatedName("ak.at(IIIII)V")
    public void method379(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class319.method5231(this.field446 * arg0, this.field446 * (63 - arg1), this.field446, arg3);
        }
        if (var5 == 1) {
            class319.method5229(this.field446 * arg0, this.field446 * (63 - arg1), this.field446, arg3);
        }
        if (var5 == 2) {
            class319.method5231(this.field446 * arg0 + this.field446 - 1, this.field446 * (63 - arg1), this.field446, arg3);
        }
        if (var5 == 3) {
            class319.method5229(this.field446 * arg0, this.field446 * (63 - arg1) + this.field446 - 1, this.field446, arg3);
        }
    }

    @ObfuscatedName("ak.aa(III)I")
    public int method380(int arg0, int arg1) {
        if (this.field453 != null) {
            return this.field453.method234(arg0, arg1);
        }
        if (!this.field444.isEmpty()) {
            Iterator var3 = this.field444.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method595(arg0, arg1)) {
                    return var4.method234(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
