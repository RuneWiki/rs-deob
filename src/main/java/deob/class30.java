package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("aw")
public class class30 {

    @ObfuscatedName("aw.k")
    public static class150 field245 = new class150(37748736, 256);

    @ObfuscatedName("aw.l")
    public int field246;

    @ObfuscatedName("aw.b")
    public int field247;

    @ObfuscatedName("aw.i")
    public class16 field248;

    @ObfuscatedName("aw.c")
    public LinkedList field243;

    @ObfuscatedName("aw.f")
    public int field250;

    @ObfuscatedName("aw.m")
    public int field251;

    @ObfuscatedName("aw.u")
    public List field252;

    @ObfuscatedName("aw.x")
    public HashMap field253;

    @ObfuscatedName("aw.r")
    public final HashMap field258;

    @ObfuscatedName("hj.q(IIII)J")
    public static long method3726(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("hn.w(IIIS)Lly;")
    public static class326 method3763(int arg0, int arg1, int arg2) {
        return (class326) field245.method3063(method3726(arg0, arg1, arg2));
    }

    @ObfuscatedName("co.e(I)V")
    public static void method1878() {
        field245.method3072();
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field246 = arg0;
        this.field247 = arg1;
        this.field243 = new LinkedList();
        this.field252 = new LinkedList();
        this.field253 = new HashMap();
        this.field250 = arg2 | 0xFF000000;
        this.field258 = arg3;
    }

    @ObfuscatedName("aw.p(IIII)V")
    public void method450(int arg0, int arg1, int arg2) {
        class326 var4 = method3763(this.field246, this.field247, this.field251);
        if (var4 == null) {
            return;
        }
        if (this.field251 * 64 == arg2) {
            var4.method5641(arg0, arg1);
        } else {
            var4.method5664(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("aw.k(Ly;Ljava/util/List;I)V")
    public void method367(class16 arg0, List arg1) {
        this.field253.clear();
        this.field248 = arg0;
        this.method372(arg1);
    }

    @ObfuscatedName("aw.l(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method368(HashSet arg0, List arg1) {
        this.field253.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method234() == this.field246 && var4.method235() == this.field247) {
                this.field243.add(var4);
            }
        }
        this.method372(arg1);
    }

    @ObfuscatedName("aw.b(IIIILo;I)V")
    public void method369(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field161; var8++) {
                    class26[] var9 = arg4.field165[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class254 var13;
                            boolean var18;
                            label58: {
                                class26 var12 = var10[var11];
                                var13 = class254.method2713(var12.field209);
                                if (var13.field3392 != null) {
                                    int[] var14 = var13.field3392;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class254 var17 = class254.method2713(var16);
                                        if (var17.field3379 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3379 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method388(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.i(Liy;IIILo;I)V")
    public void method388(class254 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class214 var6 = new class214(arg1, this.field246 * 64 + arg2, this.field247 * 64 + arg3);
        Object var7 = null;
        class214 var8;
        if (this.field248 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class214(var9.field160 + arg1, var9.field168 * 64 + arg2 + var9.method563() * 8, var9.field157 * 64 + arg3 + var9.method564() * 8);
        } else {
            var8 = new class214(this.field248.field160 + arg1, this.field248.field168 * 64 + arg2, this.field248.field157 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3392 == null) {
            class242 var11 = class242.method3753(arg0.field3379);
            var10 = new class19(var8, var6, var11.field3214, this.method395(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3358, this);
        }
        this.field253.put(new class214(0, arg2, arg3), var10);
    }

    @ObfuscatedName("aw.c(B)V")
    public void method436() {
        Iterator var1 = this.field253.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method258();
            }
        }
    }

    @ObfuscatedName("aw.u(Ljava/util/List;I)V")
    public void method372(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field298.field2531 >> 6 == this.field246 && var3.field298.field2529 >> 6 == this.field247) {
                class19 var4 = new class19(var3.field298, var3.field298, var3.field126, this.method446(var3.field126));
                this.field252.add(var4);
            }
        }
    }

    @ObfuscatedName("aw.x(S)V")
    public void method373() {
        if (this.field248 != null) {
            this.field248.method230();
            return;
        }
        Iterator var1 = this.field243.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method230();
        }
    }

    @ObfuscatedName("aw.r(Lhp;B)Z")
    public boolean method374(class234 arg0) {
        this.field253.clear();
        if (this.field248 == null) {
            boolean var2 = true;
            Iterator var3 = this.field243.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method229(arg0);
                var2 &= var4.method228();
            }
            if (var2) {
                Iterator var5 = this.field243.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method369(var6.method569() * 8, var6.method565() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field248.method229(arg0);
            if (this.field248.method228()) {
                this.method369(0, 0, 64, 64, this.field248);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("aw.v(ILap;[Llx;Lhp;Lhp;I)V")
    public void method417(int arg0, class41 arg1, class325[] arg2, class234 arg3, class234 arg4) {
        this.field251 = arg0;
        if (this.field248 == null && this.field243.isEmpty() || method3763(this.field246, this.field247, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method374(arg3);
        int var8;
        if (this.field248 == null) {
            var8 = ((class22) this.field243.getFirst()).field162;
        } else {
            var8 = this.field248.field162;
        }
        boolean var9 = var7 & arg4.method3830(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method3839(var8);
        class28 var11;
        if (var10 == null) {
            var11 = new class28();
        } else {
            var11 = new class28(class50.method3146(var10).field3909);
        }
        class326 var13 = new class326(this.field251 * 64, this.field251 * 64);
        var13.method5634();
        if (this.field248 == null) {
            this.method379(arg1, arg2, var11);
        } else {
            this.method378(arg1, arg2, var11);
        }
        int var14 = this.field246;
        int var15 = this.field247;
        int var16 = this.field251;
        field245.method3066(var13, method3726(var14, var15, var16), var13.field3909.length * 4);
        this.method373();
    }

    @ObfuscatedName("aw.y(IIILjava/util/HashSet;B)V")
    public void method376(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method386(arg0, arg1, arg3, arg2);
        this.method392(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("aw.g(Ljava/util/HashSet;IIB)V")
    public void method377(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field253.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method497()) {
                int var6 = var5.method176();
                if (arg0.contains(var6)) {
                    class242 var7 = class242.method3753(var6);
                    this.method437(var7, var5.field297, var5.field296, arg1, arg2);
                }
            }
        }
        this.method387(arg0, arg1, arg2);
    }

    @ObfuscatedName("aw.a(Lap;[Llx;Lav;I)V")
    public void method378(class41 arg0, class325[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method370(var4, var5, this.field248, arg0, arg2);
                this.method464(var4, var5, this.field248, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method380(var6, var7, this.field248, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("aw.j(Lap;[Llx;Lav;I)V")
    public void method379(class41 arg0, class325[] arg1, class28 arg2) {
        Iterator var4 = this.field243.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method569() * 8; var6 < var5.method569() * 8 + 8; var6++) {
                for (int var7 = var5.method565() * 8; var7 < var5.method565() * 8 + 8; var7++) {
                    this.method370(var6, var7, var5, arg0, arg2);
                    this.method464(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field243.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method569() * 8; var10 < var9.method569() * 8 + 8; var10++) {
                for (int var11 = var9.method565() * 8; var11 < var9.method565() * 8 + 8; var11++) {
                    this.method380(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("aw.o(IILo;Lap;[Llx;I)V")
    public void method380(int arg0, int arg1, class22 arg2, class41 arg3, class325[] arg4) {
        this.method416(arg0, arg1, arg2);
        this.method407(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("aw.d(IILo;Lap;Lav;I)V")
    public void method370(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field164[0][arg0][arg1] - 1;
        int var7 = arg2.field171[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class322.method5539(this.field251 * arg0, this.field251 * (63 - arg1), this.field251, this.field251, this.field250);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field250;
            class258 var10 = (class258) class258.field3504.method3039((long) var7);
            class258 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field3506.method3775(4, var7);
                class258 var13 = new class258();
                if (var12 != null) {
                    var13.method4359(new class301(var12), var7);
                }
                var13.method4358();
                class258.field3504.method3041(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field3508 >= 0) {
                var15 = var11.field3508 | 0xFF000000;
            } else if (var11.field3509 >= 0) {
                int var16 = Statics.field1782.method2491(var11.field3509);
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
                var15 = class131.field1784[var18] | 0xFF000000;
            } else if (var11.field3513 == 16711935) {
                var15 = var9;
            } else {
                int var22 = Statics.method3354(var11.field3514, var11.field3510, var11.field3511);
                byte var23 = 96;
                int var24;
                if (var22 == -2) {
                    var24 = 12345678;
                } else if (var22 == -1) {
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > 127) {
                        var23 = 127;
                    }
                    int var25 = 127 - var23;
                    var24 = var25;
                } else {
                    int var26 = (var22 & 0x7F) * var23 / 128;
                    if (var26 < 2) {
                        var26 = 2;
                    } else if (var26 > 126) {
                        var26 = 126;
                    }
                    var24 = (var22 & 0xFF80) + var26;
                }
                var15 = class131.field1784[var24] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field166[0][arg0][arg1] == 0) {
            class322.method5539(this.field251 * arg0, this.field251 * (63 - arg1), this.field251, this.field251, var8);
            return;
        }
        int var28 = this.method383(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class322.method5539(this.field251 * arg0, this.field251 * (63 - arg1), this.field251, this.field251, var28);
        } else {
            arg3.method581(this.field251 * arg0, this.field251 * (63 - arg1), var28, var8, this.field251, this.field251, arg2.field166[0][arg0][arg1], arg2.field167[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("aw.s(IILo;Lap;I)V")
    public void method464(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field161; var5++) {
            int var6 = arg2.field171[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field250;
                class258 var8 = (class258) class258.field3504.method3039((long) var6);
                class258 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field3506.method3775(4, var6);
                    class258 var11 = new class258();
                    if (var10 != null) {
                        var11.method4359(new class301(var10), var6);
                    }
                    var11.method4358();
                    class258.field3504.method3041(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field3508 >= 0) {
                    var13 = var9.field3508 | 0xFF000000;
                } else if (var9.field3509 >= 0) {
                    int var14 = Statics.field1782.method2491(var9.field3509);
                    byte var15 = 96;
                    int var16;
                    if (var14 == -2) {
                        var16 = 12345678;
                    } else if (var14 == -1) {
                        if (var15 < 0) {
                            var15 = 0;
                        } else if (var15 > 127) {
                            var15 = 127;
                        }
                        int var17 = 127 - var15;
                        var16 = var17;
                    } else {
                        int var18 = (var14 & 0x7F) * var15 / 128;
                        if (var18 < 2) {
                            var18 = 2;
                        } else if (var18 > 126) {
                            var18 = 126;
                        }
                        var16 = (var14 & 0xFF80) + var18;
                    }
                    var13 = class131.field1784[var16] | 0xFF000000;
                } else if (var9.field3513 == 16711935) {
                    var13 = var7;
                } else {
                    int var20 = Statics.method3354(var9.field3514, var9.field3510, var9.field3511);
                    byte var21 = 96;
                    int var22;
                    if (var20 == -2) {
                        var22 = 12345678;
                    } else if (var20 == -1) {
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 > 127) {
                            var21 = 127;
                        }
                        int var23 = 127 - var21;
                        var22 = var23;
                    } else {
                        int var24 = (var20 & 0x7F) * var21 / 128;
                        if (var24 < 2) {
                            var24 = 2;
                        } else if (var24 > 126) {
                            var24 = 126;
                        }
                        var22 = (var20 & 0xFF80) + var24;
                    }
                    var13 = class131.field1784[var22] | 0xFF000000;
                }
                if (arg2.field166[var5][arg0][arg1] == 0) {
                    class322.method5539(this.field251 * arg0, this.field251 * (63 - arg1), this.field251, this.field251, var13);
                } else {
                    arg3.method581(this.field251 * arg0, this.field251 * (63 - arg1), 0, var13, this.field251, this.field251, arg2.field166[var5][arg0][arg1], arg2.field167[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("aw.z(IILo;Lav;I)I")
    public int method383(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field164[0][arg0][arg1] == 0 ? this.field250 : arg3.method352(arg0, arg1);
    }

    @ObfuscatedName("aw.al(IILo;[Llx;I)V")
    public void method407(int arg0, int arg1, class22 arg2, class325[] arg3) {
        for (int var5 = 0; var5 < arg2.field161; var5++) {
            class26[] var6 = arg2.field165[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    int var10 = var9.field210;
                    boolean var11 = var10 >= class221.field2734.field2724 && var10 <= class221.field2723.field2724;
                    if (!var11) {
                        int var12 = var9.field210;
                        boolean var13 = class221.field2742.field2724 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class254 var14 = class254.method2713(var9.field209);
                    if (var14.field3380 != -1) {
                        if (var14.field3380 == 46 || var14.field3380 == 52) {
                            arg3[var14.field3380].method5613(this.field251 * arg0, this.field251 * (63 - arg1), this.field251 * 2 + 1, this.field251 * 2 + 1);
                        } else {
                            arg3[var14.field3380].method5613(this.field251 * arg0, this.field251 * (63 - arg1), this.field251 * 2, this.field251 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.av(IILo;S)V")
    public void method416(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field161; var4++) {
            class26[] var5 = arg2.field165[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    int var9 = var8.field210;
                    boolean var10 = var9 >= class221.field2726.field2724 && var9 <= class221.field2722.field2724 || class221.field2740.field2724 == var9;
                    if (var10) {
                        class254 var11 = class254.method2713(var8.field209);
                        int var12 = var11.field3370 == 0 ? -3355444 : -3407872;
                        if (class221.field2726.field2724 == var8.field210) {
                            this.method398(arg0, arg1, var8.field211, var12);
                        }
                        if (class221.field2721.field2724 == var8.field210) {
                            this.method398(arg0, arg1, var8.field211, -3355444);
                            this.method398(arg0, arg1, var8.field211 + 1, var12);
                        }
                        if (class221.field2722.field2724 == var8.field210) {
                            if (var8.field211 == 0) {
                                class322.method5537(this.field251 * arg0, this.field251 * (63 - arg1), 1, var12);
                            }
                            if (var8.field211 == 1) {
                                class322.method5537(this.field251 * arg0 + this.field251 - 1, this.field251 * (63 - arg1), 1, var12);
                            }
                            if (var8.field211 == 2) {
                                class322.method5537(this.field251 * arg0 + this.field251 - 1, this.field251 * (63 - arg1) + this.field251 - 1, 1, var12);
                            }
                            if (var8.field211 == 3) {
                                class322.method5537(this.field251 * arg0, this.field251 * (63 - arg1) + this.field251 - 1, 1, var12);
                            }
                        }
                        if (class221.field2740.field2724 == var8.field210) {
                            int var13 = var8.field211 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field251; var14++) {
                                    class322.method5537(this.field251 * arg0 + var14, this.field251 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field251; var15++) {
                                    class322.method5537(this.field251 * arg0 + var15, this.field251 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.as(IILjava/util/HashSet;II)V")
    public void method386(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field253.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2531 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2529 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method497()) {
                var12.field297 = var10;
                var12.field296 = var11;
                class242 var13 = class242.method3753(var12.method176());
                if (!arg2.contains(var13.method3990())) {
                    this.method389(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("aw.aw(Ljava/util/HashSet;IIB)V")
    public void method387(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field252.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method497()) {
                class242 var6 = class242.method3753(var5.method176());
                if (var6 != null && arg0.contains(var6.method3990())) {
                    this.method437(var6, var5.field297, var5.field296, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("aw.ad(Liw;IIIIB)V")
    public void method437(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        class326 var6 = arg0.method3996(false);
        if (var6 == null) {
            return;
        }
        var6.method5646(arg1 - var6.field3900 / 2, arg2 - var6.field3901 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class322.method5552(arg1, arg2, 15, 16776960, 128);
            class322.method5552(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("aw.ag(Laz;IIFB)V")
    public void method389(class35 arg0, int arg1, int arg2, float arg3) {
        class242 var5 = class242.method3753(arg0.method176());
        this.method390(var5, arg1, arg2);
        this.method391(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("aw.ar(Liw;III)V")
    public void method390(class242 arg0, int arg1, int arg2) {
        class326 var4 = arg0.method3996(false);
        if (var4 != null) {
            int var5 = this.method399(var4, arg0.field3227);
            int var6 = this.method394(var4, arg0.field3228);
            var4.method5646(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("aw.ax(Laz;Liw;IIFI)V")
    public void method391(class35 arg0, class242 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method177();
        if (var6 != null && var6.field240.method170(arg4)) {
            class296 var7 = (class296) this.field258.get(var6.field240);
            var7.method4931(var6.field238, arg2 - var6.field237 / 2, arg3, var6.field237, var6.field239, 0xFF000000 | arg1.field3218, 0, 1, 0, var7.field3710 / 2);
        }
    }

    @ObfuscatedName("aw.az(IILjava/util/HashSet;II)V")
    public void method392(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field252.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method497()) {
                int var8 = var7.field298.field2531 % 64;
                int var9 = var7.field298.field2529 % 64;
                var7.field297 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field296 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method176())) {
                    this.method389(var7, var7.field297, var7.field296, var5);
                }
            }
        }
    }

    @ObfuscatedName("aw.ae(Lly;Liz;I)I")
    public int method399(class326 arg0, class256 arg1) {
        switch(arg1.field3460) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3900 / 2;
            default:
                return -arg0.field3900;
        }
    }

    @ObfuscatedName("aw.ao(Lly;Lif;B)I")
    public int method394(class326 arg0, class239 arg1) {
        switch(arg1.field3199) {
            case 0:
                return -arg0.field3901 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3901;
        }
    }

    @ObfuscatedName("aw.aj(II)Las;")
    public class29 method446(int arg0) {
        class242 var2 = class242.method3753(arg0);
        return this.method395(var2);
    }

    @ObfuscatedName("aw.at(Liw;I)Las;")
    public class29 method395(class242 arg0) {
        if (arg0.field3217 == null || this.field258 == null || this.field258.get(class18.field114) == null) {
            return null;
        }
        class18 var2 = class18.method163(arg0.field3219);
        if (var2 == null) {
            return null;
        }
        class296 var3 = (class296) this.field258.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4964(arg0.field3217, 1000000);
        String[] var5 = new String[var4];
        var3.method4923(arg0.field3217, (int[]) null, var5);
        int var6 = var5.length * var3.field3710 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4990(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class29(arg0.field3217, var7, var6, var2);
    }

    @ObfuscatedName("aw.ac(IIIIII)Ljava/util/List;")
    public List method384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field253.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method497() && var8.method496(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field252.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method497() && var10.method496(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("aw.ap(B)Ljava/util/List;")
    public List method397() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field252);
        var1.addAll(this.field253.values());
        return var1;
    }

    @ObfuscatedName("aw.aq(IIIII)V")
    public void method398(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class322.method5527(this.field251 * arg0, this.field251 * (63 - arg1), this.field251, arg3);
        }
        if (var5 == 1) {
            class322.method5537(this.field251 * arg0, this.field251 * (63 - arg1), this.field251, arg3);
        }
        if (var5 == 2) {
            class322.method5527(this.field251 * arg0 + this.field251 - 1, this.field251 * (63 - arg1), this.field251, arg3);
        }
        if (var5 == 3) {
            class322.method5537(this.field251 * arg0, this.field251 * (63 - arg1) + this.field251 - 1, this.field251, arg3);
        }
    }
}
