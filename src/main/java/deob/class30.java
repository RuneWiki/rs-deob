package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("aa")
public class class30 {

    @ObfuscatedName("aa.r")
    public static class150 field244 = new class150(37748736, 256);

    @ObfuscatedName("aa.p")
    public int field239;

    @ObfuscatedName("aa.q")
    public int field241;

    @ObfuscatedName("aa.m")
    public class16 field242;

    @ObfuscatedName("aa.y")
    public LinkedList field243;

    @ObfuscatedName("aa.i")
    public int field237;

    @ObfuscatedName("aa.c")
    public int field236;

    @ObfuscatedName("aa.b")
    public List field245;

    @ObfuscatedName("aa.o")
    public HashMap field247;

    @ObfuscatedName("aa.a")
    public final HashMap field248;

    @ObfuscatedName("bj.z(IIIB)J")
    public static long method1009(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("u.n(I)V")
    public static void method29() {
        field244.method3026();
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field239 = arg0;
        this.field241 = arg1;
        this.field243 = new LinkedList();
        this.field245 = new LinkedList();
        this.field247 = new HashMap();
        this.field237 = arg2 | 0xFF000000;
        this.field248 = arg3;
    }

    @ObfuscatedName("aa.v(IIIB)V")
    public void method377(int arg0, int arg1, int arg2) {
        int var4 = this.field239;
        int var5 = this.field241;
        int var6 = this.field236;
        class325 var7 = (class325) field244.method3024(method1009(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field236 * 64 == arg2) {
            var7.method5548(arg0, arg1);
        } else {
            var7.method5574(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("aa.u(Lw;Ljava/util/List;I)V")
    public void method378(class16 arg0, List arg1) {
        this.field247.clear();
        this.field242 = arg0;
        this.method383(arg1);
    }

    @ObfuscatedName("aa.r(Ljava/util/HashSet;Ljava/util/List;S)V")
    public void method476(HashSet arg0, List arg1) {
        this.field247.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method239() == this.field239 && var4.method247() == this.field241) {
                this.field243.add(var4);
            }
        }
        this.method383(arg1);
    }

    @ObfuscatedName("aa.p(IIIILf;B)V")
    public void method380(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field158; var8++) {
                    class26[] var9 = arg4.field163[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class254 var13;
                            boolean var18;
                            label58: {
                                class26 var12 = var10[var11];
                                var13 = class254.method1148(var12.field203);
                                if (var13.field3378 != null) {
                                    int[] var14 = var13.field3378;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class254 var17 = class254.method1148(var16);
                                        if (var17.field3336 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3336 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method381(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.q(Liz;IIILf;I)V")
    public void method381(class254 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class214 var6 = new class214(arg1, this.field239 * 64 + arg2, this.field241 * 64 + arg3);
        Object var7 = null;
        class214 var8;
        if (this.field242 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class214(var9.field157 + arg1, var9.field159 * 64 + arg2 + var9.method595() * 8, var9.field154 * 64 + arg3 + var9.method607() * 8);
        } else {
            var8 = new class214(this.field242.field157 + arg1, this.field242.field159 * 64 + arg2, this.field242.field154 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3378 == null) {
            class242 var11 = class242.method2284(arg0.field3336);
            var10 = new class19(var8, var6, var11.field3207, this.method407(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3344, this);
        }
        this.field247.put(new class214(0, arg2, arg3), var10);
    }

    @ObfuscatedName("aa.m(I)V")
    public void method461() {
        Iterator var1 = this.field247.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method269();
            }
        }
    }

    @ObfuscatedName("aa.y(Ljava/util/List;I)V")
    public void method383(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field282.field2515 >> 6 == this.field239 && var3.field282.field2514 >> 6 == this.field241) {
                class19 var4 = new class19(var3.field282, var3.field282, var3.field118, this.method406(var3.field118));
                this.field245.add(var4);
            }
        }
    }

    @ObfuscatedName("aa.i(I)V")
    public void method384() {
        if (this.field242 != null) {
            this.field242.method242();
            return;
        }
        Iterator var1 = this.field243.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method242();
        }
    }

    @ObfuscatedName("aa.c(Lhp;I)Z")
    public boolean method385(class234 arg0) {
        this.field247.clear();
        if (this.field242 == null) {
            boolean var2 = true;
            Iterator var3 = this.field243.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method241(arg0);
                var2 &= var4.method240();
            }
            if (var2) {
                Iterator var5 = this.field243.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method380(var6.method596() * 8, var6.method601() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field242.method241(arg0);
            if (this.field242.method240()) {
                this.method380(0, 0, 64, 64, this.field242);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("aa.b(ILak;[Llp;Lhp;Lhp;I)V")
    public void method386(int arg0, class41 arg1, class324[] arg2, class234 arg3, class234 arg4) {
        this.field236 = arg0;
        if (this.field242 == null && this.field243.isEmpty()) {
            return;
        }
        int var6 = this.field239;
        int var7 = this.field241;
        class325 var8 = (class325) field244.method3024(method1009(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method385(arg3);
        int var11;
        if (this.field242 == null) {
            var11 = ((class22) this.field243.getFirst()).field160;
        } else {
            var11 = this.field242.field160;
        }
        boolean var12 = var10 & arg4.method3752(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method3733(var11);
        class28 var14;
        if (var13 == null) {
            var14 = new class28();
        } else {
            var14 = new class28(class50.method652(var13).field3875);
        }
        class325 var16 = new class325(this.field236 * 64, this.field236 * 64);
        var16.method5631();
        if (this.field242 == null) {
            this.method390(arg1, arg2, var14);
        } else {
            this.method479(arg1, arg2, var14);
        }
        int var17 = this.field239;
        int var18 = this.field241;
        int var19 = this.field236;
        field244.method3036(var16, method1009(var17, var18, var19), var16.field3875.length * 4);
        this.method384();
    }

    @ObfuscatedName("aa.o(IIILjava/util/HashSet;B)V")
    public void method387(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method397(arg0, arg1, arg3, arg2);
        this.method462(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("aa.a(Ljava/util/HashSet;III)V")
    public void method414(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field247.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method525()) {
                int var6 = var5.method196();
                if (arg0.contains(var6)) {
                    class242 var7 = class242.method2284(var6);
                    this.method379(var7, var5.field278, var5.field279, arg1, arg2);
                }
            }
        }
        this.method398(arg0, arg1, arg2);
    }

    @ObfuscatedName("aa.e(Lak;[Llp;Laz;I)V")
    public void method479(class41 arg0, class324[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method392(var4, var5, this.field242, arg0, arg2);
                this.method393(var4, var5, this.field242, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method391(var6, var7, this.field242, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("aa.x(Lak;[Llp;Laz;B)V")
    public void method390(class41 arg0, class324[] arg1, class28 arg2) {
        Iterator var4 = this.field243.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method596() * 8; var6 < var5.method596() * 8 + 8; var6++) {
                for (int var7 = var5.method601() * 8; var7 < var5.method601() * 8 + 8; var7++) {
                    this.method392(var6, var7, var5, arg0, arg2);
                    this.method393(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field243.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method596() * 8; var10 < var9.method596() * 8 + 8; var10++) {
                for (int var11 = var9.method601() * 8; var11 < var9.method601() * 8 + 8; var11++) {
                    this.method391(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("aa.h(IILf;Lak;[Llp;I)V")
    public void method391(int arg0, int arg1, class22 arg2, class41 arg3, class324[] arg4) {
        this.method396(arg0, arg1, arg2);
        this.method457(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("aa.s(IILf;Lak;Laz;I)V")
    public void method392(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field161[0][arg0][arg1] - 1;
        int var7 = arg2.field162[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class321.method5497(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, this.field236, this.field237);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field237;
            class258 var10 = (class258) class258.field3498.method2992((long) var7);
            class258 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field3494.method3726(4, var7);
                class258 var13 = new class258();
                if (var12 != null) {
                    var13.method4305(new class300(var12), var7);
                }
                var13.method4313();
                class258.field3498.method2994(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field3493 >= 0) {
                var15 = var11.field3493 | 0xFF000000;
            } else if (var11.field3489 >= 0) {
                int var16 = Statics.field1752.method2493(var11.field3489);
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
                var15 = class131.field1751[var18] | 0xFF000000;
            } else if (var11.field3490 == 16711935) {
                var15 = var9;
            } else {
                int var22 = Statics.method1089(var11.field3492, var11.field3495, var11.field3496);
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
                var15 = class131.field1751[var24] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field165[0][arg0][arg1] == 0) {
            class321.method5497(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, this.field236, var8);
            return;
        }
        int var28 = this.method394(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class321.method5497(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, this.field236, var28);
        } else {
            arg3.method618(this.field236 * arg0, this.field236 * (63 - arg1), var28, var8, this.field236, this.field236, arg2.field165[0][arg0][arg1], arg2.field153[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("aa.f(IILf;Lak;B)V")
    public void method393(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field158; var5++) {
            int var6 = arg2.field162[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field237;
                class258 var8 = (class258) class258.field3498.method2992((long) var6);
                class258 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field3494.method3726(4, var6);
                    class258 var11 = new class258();
                    if (var10 != null) {
                        var11.method4305(new class300(var10), var6);
                    }
                    var11.method4313();
                    class258.field3498.method2994(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field3493 >= 0) {
                    var13 = var9.field3493 | 0xFF000000;
                } else if (var9.field3489 >= 0) {
                    int var14 = Statics.field1752.method2493(var9.field3489);
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
                    var13 = class131.field1751[var16] | 0xFF000000;
                } else if (var9.field3490 == 16711935) {
                    var13 = var7;
                } else {
                    int var20 = Statics.method1089(var9.field3492, var9.field3495, var9.field3496);
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
                    var13 = class131.field1751[var22] | 0xFF000000;
                }
                if (arg2.field165[var5][arg0][arg1] == 0) {
                    class321.method5497(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, this.field236, var13);
                } else {
                    arg3.method618(this.field236 * arg0, this.field236 * (63 - arg1), 0, var13, this.field236, this.field236, arg2.field165[var5][arg0][arg1], arg2.field153[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("aa.j(IILf;Laz;B)I")
    public int method394(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field161[0][arg0][arg1] == 0 ? this.field237 : arg3.method368(arg0, arg1);
    }

    @ObfuscatedName("aa.d(IILf;[Llp;I)V")
    public void method457(int arg0, int arg1, class22 arg2, class324[] arg3) {
        for (int var5 = 0; var5 < arg2.field158; var5++) {
            class26[] var6 = arg2.field163[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    if (!class221.method3709(var9.field201)) {
                        int var10 = var9.field201;
                        boolean var11 = class221.field2722.field2723 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class254 var12 = class254.method1148(var9.field203);
                    if (var12.field3366 != -1) {
                        if (var12.field3366 == 46 || var12.field3366 == 52) {
                            arg3[var12.field3366].method5523(this.field236 * arg0, this.field236 * (63 - arg1), this.field236 * 2 + 1, this.field236 * 2 + 1);
                        } else {
                            arg3[var12.field3366].method5523(this.field236 * arg0, this.field236 * (63 - arg1), this.field236 * 2, this.field236 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.l(IILf;B)V")
    public void method396(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field158; var4++) {
            class26[] var5 = arg2.field163[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    int var9 = var8.field201;
                    boolean var10 = var9 >= class221.field2711.field2723 && var9 <= class221.field2703.field2723 || class221.field2709.field2723 == var9;
                    if (var10) {
                        class254 var11 = class254.method1148(var8.field203);
                        int var12 = var11.field3356 == 0 ? -3355444 : -3407872;
                        if (class221.field2711.field2723 == var8.field201) {
                            this.method410(arg0, arg1, var8.field202, var12);
                        }
                        if (class221.field2702.field2723 == var8.field201) {
                            this.method410(arg0, arg1, var8.field202, -3355444);
                            this.method410(arg0, arg1, var8.field202 + 1, var12);
                        }
                        if (class221.field2703.field2723 == var8.field201) {
                            if (var8.field202 == 0) {
                                class321.method5452(this.field236 * arg0, this.field236 * (63 - arg1), 1, var12);
                            }
                            if (var8.field202 == 1) {
                                class321.method5452(this.field236 * arg0 + this.field236 - 1, this.field236 * (63 - arg1), 1, var12);
                            }
                            if (var8.field202 == 2) {
                                class321.method5452(this.field236 * arg0 + this.field236 - 1, this.field236 * (63 - arg1) + this.field236 - 1, 1, var12);
                            }
                            if (var8.field202 == 3) {
                                class321.method5452(this.field236 * arg0, this.field236 * (63 - arg1) + this.field236 - 1, 1, var12);
                            }
                        }
                        if (class221.field2709.field2723 == var8.field201) {
                            int var13 = var8.field202 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field236; var14++) {
                                    class321.method5452(this.field236 * arg0 + var14, this.field236 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field236; var15++) {
                                    class321.method5452(this.field236 * arg0 + var15, this.field236 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.k(IILjava/util/HashSet;II)V")
    public void method397(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field247.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2515 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2514 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method525()) {
                var12.field278 = var10;
                var12.field279 = var11;
                class242 var13 = class242.method2284(var12.method196());
                if (!arg2.contains(var13.method3949())) {
                    this.method400(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("aa.ac(Ljava/util/HashSet;III)V")
    public void method398(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field245.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method525()) {
                class242 var6 = class242.method2284(var5.method196());
                if (var6 != null && arg0.contains(var6.method3949())) {
                    this.method379(var6, var5.field278, var5.field279, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("aa.aa(Lij;IIIII)V")
    public void method379(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        class325 var6 = arg0.method3947(false);
        if (var6 == null) {
            return;
        }
        var6.method5605(arg1 - var6.field3870 / 2, arg2 - var6.field3871 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class321.method5444(arg1, arg2, 15, 16776960, 128);
            class321.method5444(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("aa.ap(Las;IIFI)V")
    public void method400(class35 arg0, int arg1, int arg2, float arg3) {
        class242 var5 = class242.method2284(arg0.method196());
        this.method482(var5, arg1, arg2);
        this.method489(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("aa.ar(Lij;III)V")
    public void method482(class242 arg0, int arg1, int arg2) {
        class325 var4 = arg0.method3947(false);
        if (var4 != null) {
            int var5 = this.method404(var4, arg0.field3205);
            int var6 = this.method416(var4, arg0.field3206);
            var4.method5605(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("aa.ab(Las;Lij;IIFB)V")
    public void method489(class35 arg0, class242 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method190();
        if (var6 != null && var6.field230.method184(arg4)) {
            class295 var7 = (class295) this.field248.get(var6.field230);
            var7.method4856(var6.field228, arg2 - var6.field229 / 2, arg3, var6.field229, var6.field232, 0xFF000000 | arg1.field3196, 0, 1, 0, var7.field3670 / 2);
        }
    }

    @ObfuscatedName("aa.ax(IILjava/util/HashSet;II)V")
    public void method462(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field245.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method525()) {
                int var8 = var7.field282.field2515 % 64;
                int var9 = var7.field282.field2514 % 64;
                var7.field278 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field279 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method196())) {
                    this.method400(var7, var7.field278, var7.field279, var5);
                }
            }
        }
    }

    @ObfuscatedName("aa.as(Llf;Lin;I)I")
    public int method404(class325 arg0, class256 arg1) {
        switch(arg1.field3446) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3870 / 2;
            default:
                return -arg0.field3870;
        }
    }

    @ObfuscatedName("aa.ao(Llf;Lim;I)I")
    public int method416(class325 arg0, class239 arg1) {
        switch(arg1.field3174) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3871 / 2;
            default:
                return -arg0.field3871;
        }
    }

    @ObfuscatedName("aa.al(IB)Law;")
    public class29 method406(int arg0) {
        class242 var2 = class242.method2284(arg0);
        return this.method407(var2);
    }

    @ObfuscatedName("aa.ad(Lij;I)Law;")
    public class29 method407(class242 arg0) {
        if (arg0.field3188 == null || this.field248 == null || this.field248.get(class18.field111) == null) {
            return null;
        }
        int var2 = arg0.field3209;
        class18[] var3 = class18.method182();
        int var4 = 0;
        class18 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class18 var5 = var3[var4];
            if (var5.field109 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class295 var8 = (class295) this.field248.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method4850(arg0.field3188, 1000000);
        String[] var10 = new String[var9];
        var8.method4848(arg0.field3188, (int[]) null, var10);
        int var11 = var10.length * var8.field3670 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4847(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class29(arg0.field3188, var12, var11, var6);
    }

    @ObfuscatedName("aa.an(IIIIII)Ljava/util/List;")
    public List method408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field247.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method525() && var8.method523(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field245.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method525() && var10.method523(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("aa.ai(I)Ljava/util/List;")
    public List method495() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field245);
        var1.addAll(this.field247.values());
        return var1;
    }

    @ObfuscatedName("aa.ak(IIIII)V")
    public void method410(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class321.method5454(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, arg3);
        }
        if (var5 == 1) {
            class321.method5452(this.field236 * arg0, this.field236 * (63 - arg1), this.field236, arg3);
        }
        if (var5 == 2) {
            class321.method5454(this.field236 * arg0 + this.field236 - 1, this.field236 * (63 - arg1), this.field236, arg3);
        }
        if (var5 == 3) {
            class321.method5452(this.field236 * arg0, this.field236 * (63 - arg1) + this.field236 - 1, this.field236, arg3);
        }
    }
}
