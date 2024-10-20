package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ii")
public class class236 {

    @ObfuscatedName("ii.h")
    public static class264 field2801 = new class264(37748736, 256);

    @ObfuscatedName("ii.j")
    public int field2797;

    @ObfuscatedName("ii.y")
    public int field2798;

    @ObfuscatedName("ii.d")
    public class230 field2793;

    @ObfuscatedName("ii.n")
    public LinkedList field2800;

    @ObfuscatedName("ii.r")
    public int field2806;

    @ObfuscatedName("ii.l")
    public int field2802;

    @ObfuscatedName("ii.s")
    public List field2803;

    @ObfuscatedName("ii.p")
    public HashMap field2804;

    @ObfuscatedName("ii.b")
    public final HashMap field2805;

    @ObfuscatedName("gy.a(IIII)J")
    public static long method3281(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("fb.f(IIII)Lri;")
    public static class477 method3188(int arg0, int arg1, int arg2) {
        return (class477) field2801.method4812(method3281(arg0, arg1, arg2));
    }

    @ObfuscatedName("gb.c(I)V")
    public static void method3325() {
        field2801.method4820();
    }

    public class236(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2797 = arg0;
        this.field2798 = arg1;
        this.field2800 = new LinkedList();
        this.field2803 = new LinkedList();
        this.field2804 = new HashMap();
        this.field2806 = arg2 | 0xFF000000;
        this.field2805 = arg3;
    }

    @ObfuscatedName("ii.x(IIIS)V")
    public void method4460(int arg0, int arg1, int arg2) {
        class477 var4 = method3188(this.field2797, this.field2798, this.field2802);
        if (var4 == null) {
            return;
        }
        if (this.field2802 * 64 == arg2) {
            var4.method8131(arg0, arg1);
        } else {
            var4.method8132(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ii.h(Lht;Ljava/util/List;I)V")
    public void method4461(class230 arg0, List arg1) {
        this.field2804.clear();
        this.field2793 = arg0;
        this.method4474(arg1);
    }

    @ObfuscatedName("ii.j(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4462(HashSet arg0, List arg1) {
        this.field2804.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class238 var4 = (class238) var3.next();
            if (var4.method4687() == this.field2797 && var4.method4681() == this.field2798) {
                this.field2800.add(var4);
            }
        }
        this.method4474(arg1);
    }

    @ObfuscatedName("ii.y(IIIILie;I)V")
    public void method4463(int arg0, int arg1, int arg2, int arg3, class244 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2882; var8++) {
                    class246[] var9 = arg4.field2881[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class246[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class246 var12 = var10[var11];
                            class194 var13 = class194.method2141(var12.field2902);
                            if (Statics.method2948(var13)) {
                                this.method4464(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ii.d(Lgm;IIILie;I)V")
    public void method4464(class194 arg0, int arg1, int arg2, int arg3, class244 arg4) {
        class294 var6 = new class294(arg1, this.field2797 * 64 + arg2, this.field2798 * 64 + arg3);
        Object var7 = null;
        class294 var8;
        if (this.field2793 == null) {
            class238 var9 = (class238) arg4;
            var8 = new class294(var9.field2884 + arg1, var9.field2890 * 64 + arg2 + var9.method4639() * 8, var9.field2878 * 64 + arg3 + var9.method4649() * 8);
        } else {
            var8 = new class294(this.field2793.field2884 + arg1, this.field2793.field2890 * 64 + arg2, this.field2793.field2878 * 64 + arg3);
        }
        class253 var10;
        if (arg0.field2123 == null) {
            class178 var11 = class178.method2234(arg0.field2110);
            var10 = new class241(var8, var6, var11.field1890, this.method4486(var11));
        } else {
            var10 = new class233(var8, var6, arg0.field2081, this);
        }
        class178 var12 = class178.method2234(var10.method4330());
        if (var12.field1880) {
            this.field2804.put(new class294(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("ii.n(I)V")
    public void method4465() {
        Iterator var1 = this.field2804.values().iterator();
        while (var1.hasNext()) {
            class253 var2 = (class253) var1.next();
            if (var2 instanceof class233) {
                ((class233) var2).method4334();
            }
        }
    }

    @ObfuscatedName("ii.r(Ljava/util/List;B)V")
    public void method4474(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class241 var3 = (class241) var2.next();
            if (class178.method2234(var3.field2853).field1880 && var3.field2948.field3397 >> 6 == this.field2797 && var3.field2948.field3396 >> 6 == this.field2798) {
                class241 var4 = new class241(var3.field2948, var3.field2948, var3.field2853, this.method4547(var3.field2853));
                this.field2803.add(var4);
            }
        }
    }

    @ObfuscatedName("ii.l(B)V")
    public void method4467() {
        if (this.field2793 != null) {
            this.field2793.method4676();
            return;
        }
        Iterator var1 = this.field2800.iterator();
        while (var1.hasNext()) {
            class238 var2 = (class238) var1.next();
            var2.method4676();
        }
    }

    @ObfuscatedName("ii.s(Llg;B)Z")
    public boolean method4468(class330 arg0) {
        this.field2804.clear();
        if (this.field2793 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2800.iterator();
            while (var3.hasNext()) {
                class238 var4 = (class238) var3.next();
                var4.method4675(arg0);
                var2 &= var4.method4674();
            }
            if (var2) {
                Iterator var5 = this.field2800.iterator();
                while (var5.hasNext()) {
                    class238 var6 = (class238) var5.next();
                    this.method4463(var6.method4641() * 8, var6.method4642() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2793.method4675(arg0);
            if (this.field2793.method4674()) {
                this.method4463(0, 0, 64, 64, this.field2793);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ii.p(ILif;[Lry;Llg;Llg;I)V")
    public void method4469(int arg0, class257 arg1, class476[] arg2, class330 arg3, class330 arg4) {
        this.field2802 = arg0;
        if (this.field2793 == null && this.field2800.isEmpty() || method3188(this.field2797, this.field2798, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4468(arg3);
        int var8;
        if (this.field2793 == null) {
            var8 = ((class244) this.field2800.getFirst()).field2883;
        } else {
            var8 = this.field2793.field2883;
        }
        boolean var9 = var7 & arg4.method5786(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method5797(var8);
        class247 var11;
        if (var10 == null) {
            var11 = new class247();
        } else {
            var11 = new class247(class32.method389(var10).field4959);
        }
        class477 var13 = new class477(this.field2802 * 64, this.field2802 * 64);
        var13.method8124();
        if (this.field2793 == null) {
            this.method4472(arg1, arg2, var11);
        } else {
            this.method4569(arg1, arg2, var11);
        }
        int var14 = this.field2797;
        int var15 = this.field2798;
        int var16 = this.field2802;
        field2801.method4805(var13, method3281(var14, var15, var16), var13.field4959.length * 4);
        this.method4467();
    }

    @ObfuscatedName("ii.b(IIILjava/util/HashSet;B)V")
    public void method4545(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4481(arg0, arg1, arg3, arg2);
        this.method4485(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ii.o(Ljava/util/HashSet;III)V")
    public void method4504(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2804.values().iterator();
        while (var4.hasNext()) {
            class253 var5 = (class253) var4.next();
            if (var5.method4731()) {
                int var6 = var5.method4330();
                if (arg0.contains(var6)) {
                    class178 var7 = class178.method2234(var6);
                    this.method4528(var7, var5.field2943, var5.field2947, arg1, arg2);
                }
            }
        }
        this.method4480(arg0, arg1, arg2);
    }

    @ObfuscatedName("ii.u(Lif;[Lry;Lig;B)V")
    public void method4569(class257 arg0, class476[] arg1, class247 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4511(var4, var5, this.field2793, arg0, arg2);
                this.method4553(var4, var5, this.field2793, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4473(var6, var7, this.field2793, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ii.z(Lif;[Lry;Lig;I)V")
    public void method4472(class257 arg0, class476[] arg1, class247 arg2) {
        Iterator var4 = this.field2800.iterator();
        while (var4.hasNext()) {
            class238 var5 = (class238) var4.next();
            for (int var6 = var5.method4641() * 8; var6 < var5.method4641() * 8 + 8; var6++) {
                for (int var7 = var5.method4642() * 8; var7 < var5.method4642() * 8 + 8; var7++) {
                    this.method4511(var6, var7, var5, arg0, arg2);
                    this.method4553(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2800.iterator();
        while (var8.hasNext()) {
            class238 var9 = (class238) var8.next();
            for (int var10 = var9.method4641() * 8; var10 < var9.method4641() * 8 + 8; var10++) {
                for (int var11 = var9.method4642() * 8; var11 < var9.method4642() * 8 + 8; var11++) {
                    this.method4473(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ii.t(IILie;Lif;[Lry;I)V")
    public void method4473(int arg0, int arg1, class244 arg2, class257 arg3, class476[] arg4) {
        this.method4478(arg0, arg1, arg2);
        this.method4470(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ii.w(IILie;Lif;Lig;I)V")
    public void method4511(int arg0, int arg1, class244 arg2, class257 arg3, class247 arg4) {
        int var6 = arg2.field2885[0][arg0][arg1] - 1;
        int var7 = arg2.field2877[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class473.method8022(this.field2802 * arg0, this.field2802 * (63 - arg1), this.field2802, this.field2802, this.field2806);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2806;
            class196 var10 = (class196) class196.field2196.method4839((long) var7);
            class196 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field2201.method5859(4, var7);
                class196 var13 = new class196();
                if (var12 != null) {
                    var13.method3539(new class464(var12), var7);
                }
                var13.method3538();
                class196.field2196.method4834(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field2200 >= 0) {
                var15 = var11.field2200 | 0xFF000000;
            } else if (var11.field2198 >= 0) {
                int var16 = Statics.field2422.method4125(var11.field2198);
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
                var15 = class211.field2433[var18] | 0xFF000000;
            } else if (var11.field2197 == 16711935) {
                var15 = var9;
            } else {
                int var22 = var11.field2207;
                int var23 = var11.field2195;
                int var24 = var11.field2203;
                if (var24 > 179) {
                    var23 /= 2;
                }
                if (var24 > 192) {
                    var23 /= 2;
                }
                if (var24 > 217) {
                    var23 /= 2;
                }
                if (var24 > 243) {
                    var23 /= 2;
                }
                int var25 = var24 / 2 + (var22 / 4 << 10) + (var23 / 32 << 7);
                byte var28 = 96;
                int var29;
                if (var25 == -2) {
                    var29 = 12345678;
                } else if (var25 == -1) {
                    if (var28 < 0) {
                        var28 = 0;
                    } else if (var28 > 127) {
                        var28 = 127;
                    }
                    int var30 = 127 - var28;
                    var29 = var30;
                } else {
                    int var31 = (var25 & 0x7F) * var28 / 128;
                    if (var31 < 2) {
                        var31 = 2;
                    } else if (var31 > 126) {
                        var31 = 126;
                    }
                    var29 = (var25 & 0xFF80) + var31;
                }
                var15 = class211.field2433[var29] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field2887[0][arg0][arg1] == 0) {
            class473.method8022(this.field2802 * arg0, this.field2802 * (63 - arg1), this.field2802, this.field2802, var8);
            return;
        }
        int var33 = this.method4476(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class473.method8022(this.field2802 * arg0, this.field2802 * (63 - arg1), this.field2802, this.field2802, var33);
        } else {
            arg3.method4777(this.field2802 * arg0, this.field2802 * (63 - arg1), var33, var8, this.field2802, this.field2802, arg2.field2887[0][arg0][arg1], arg2.field2888[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ii.m(IILie;Lif;I)V")
    public void method4553(int arg0, int arg1, class244 arg2, class257 arg3) {
        for (int var5 = 1; var5 < arg2.field2882; var5++) {
            int var6 = arg2.field2877[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2806;
                class196 var8 = (class196) class196.field2196.method4839((long) var6);
                class196 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field2201.method5859(4, var6);
                    class196 var11 = new class196();
                    if (var10 != null) {
                        var11.method3539(new class464(var10), var6);
                    }
                    var11.method3538();
                    class196.field2196.method4834(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field2200 >= 0) {
                    var13 = var9.field2200 | 0xFF000000;
                } else if (var9.field2198 >= 0) {
                    int var14 = Statics.field2422.method4125(var9.field2198);
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
                    var13 = class211.field2433[var16] | 0xFF000000;
                } else if (var9.field2197 == 16711935) {
                    var13 = var7;
                } else {
                    int var20 = var9.field2207;
                    int var21 = var9.field2195;
                    int var22 = var9.field2203;
                    if (var22 > 179) {
                        var21 /= 2;
                    }
                    if (var22 > 192) {
                        var21 /= 2;
                    }
                    if (var22 > 217) {
                        var21 /= 2;
                    }
                    if (var22 > 243) {
                        var21 /= 2;
                    }
                    int var23 = var22 / 2 + (var20 / 4 << 10) + (var21 / 32 << 7);
                    byte var26 = 96;
                    int var27;
                    if (var23 == -2) {
                        var27 = 12345678;
                    } else if (var23 == -1) {
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 127) {
                            var26 = 127;
                        }
                        int var28 = 127 - var26;
                        var27 = var28;
                    } else {
                        int var29 = (var23 & 0x7F) * var26 / 128;
                        if (var29 < 2) {
                            var29 = 2;
                        } else if (var29 > 126) {
                            var29 = 126;
                        }
                        var27 = (var23 & 0xFF80) + var29;
                    }
                    var13 = class211.field2433[var27] | 0xFF000000;
                }
                if (arg2.field2887[var5][arg0][arg1] == 0) {
                    class473.method8022(this.field2802 * arg0, this.field2802 * (63 - arg1), this.field2802, this.field2802, var13);
                } else {
                    arg3.method4777(this.field2802 * arg0, this.field2802 * (63 - arg1), 0, var13, this.field2802, this.field2802, arg2.field2887[var5][arg0][arg1], arg2.field2888[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ii.q(IILie;Lig;S)I")
    public int method4476(int arg0, int arg1, class244 arg2, class247 arg3) {
        return arg2.field2885[0][arg0][arg1] == 0 ? this.field2806 : arg3.method4711(arg0, arg1);
    }

    @ObfuscatedName("ii.i(IILie;[Lry;B)V")
    public void method4470(int arg0, int arg1, class244 arg2, class476[] arg3) {
        for (int var5 = 0; var5 < arg2.field2882; var5++) {
            class246[] var6 = arg2.field2881[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class246[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class246 var9 = var7[var8];
                    int var10 = var9.field2904;
                    boolean var11 = var10 >= class312.field3693.field3696 && var10 <= class312.field3683.field3696;
                    if (var11 || class312.method2132(var9.field2904)) {
                        class194 var12 = class194.method2141(var9.field2902);
                        if (var12.field2104 != -1) {
                            if (var12.field2104 == 46 || var12.field2104 == 52) {
                                arg3[var12.field2104].method8104(this.field2802 * arg0, this.field2802 * (63 - arg1), this.field2802 * 2 + 1, this.field2802 * 2 + 1);
                            } else {
                                arg3[var12.field2104].method8104(this.field2802 * arg0, this.field2802 * (63 - arg1), this.field2802 * 2, this.field2802 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ii.e(IILie;I)V")
    public void method4478(int arg0, int arg1, class244 arg2) {
        for (int var4 = 0; var4 < arg2.field2882; var4++) {
            class246[] var5 = arg2.field2881[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class246[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class246 var8 = var6[var7];
                    if (class312.method4702(var8.field2904)) {
                        class194 var9 = class194.method2141(var8.field2902);
                        int var10 = var9.field2101 == 0 ? -3355444 : -3407872;
                        if (class312.field3686.field3696 == var8.field2904) {
                            this.method4492(arg0, arg1, var8.field2901, var10);
                        }
                        if (class312.field3685.field3696 == var8.field2904) {
                            this.method4492(arg0, arg1, var8.field2901, -3355444);
                            this.method4492(arg0, arg1, var8.field2901 + 1, var10);
                        }
                        if (class312.field3689.field3696 == var8.field2904) {
                            if (var8.field2901 == 0) {
                                class473.method8028(this.field2802 * arg0, this.field2802 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2901 == 1) {
                                class473.method8028(this.field2802 * arg0 + this.field2802 - 1, this.field2802 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2901 == 2) {
                                class473.method8028(this.field2802 * arg0 + this.field2802 - 1, this.field2802 * (63 - arg1) + this.field2802 - 1, 1, var10);
                            }
                            if (var8.field2901 == 3) {
                                class473.method8028(this.field2802 * arg0, this.field2802 * (63 - arg1) + this.field2802 - 1, 1, var10);
                            }
                        }
                        if (class312.field3677.field3696 == var8.field2904) {
                            int var11 = var8.field2901 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2802; var12++) {
                                    class473.method8028(this.field2802 * arg0 + var12, this.field2802 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2802; var13++) {
                                    class473.method8028(this.field2802 * arg0 + var13, this.field2802 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ii.g(IILjava/util/HashSet;II)V")
    public void method4481(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2804.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class294 var9 = (class294) var8.getKey();
            int var10 = (int) ((float) var9.field3397 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3396 * var5 - var6);
            class253 var12 = (class253) var8.getValue();
            if (var12 != null && var12.method4731()) {
                var12.field2943 = var10;
                var12.field2947 = var11;
                class178 var13 = class178.method2234(var12.method4330());
                if (!arg2.contains(var13.method3129())) {
                    this.method4482(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ii.k(Ljava/util/HashSet;III)V")
    public void method4480(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2803.iterator();
        while (var4.hasNext()) {
            class253 var5 = (class253) var4.next();
            if (var5.method4731()) {
                class178 var6 = class178.method2234(var5.method4330());
                if (var6 != null && arg0.contains(var6.method3129())) {
                    this.method4528(var6, var5.field2943, var5.field2947, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ii.v(Lfd;IIIIB)V")
    public void method4528(class178 arg0, int arg1, int arg2, int arg3, int arg4) {
        class477 var6 = arg0.method3127(false);
        if (var6 == null) {
            return;
        }
        var6.method8174(arg1 - var6.field4966 / 2, arg2 - var6.field4958 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class473.method8020(arg1, arg2, 15, 16776960, 128);
            class473.method8020(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ii.aj(Liq;IIFI)V")
    public void method4482(class253 arg0, int arg1, int arg2, float arg3) {
        class178 var5 = class178.method2234(arg0.method4330());
        this.method4483(var5, arg1, arg2);
        this.method4488(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ii.an(Lfd;III)V")
    public void method4483(class178 arg0, int arg1, int arg2) {
        class477 var4 = arg0.method3127(false);
        if (var4 != null) {
            int var5 = this.method4521(var4, arg0.field1892);
            int var6 = this.method4487(var4, arg0.field1893);
            var4.method8174(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ii.ah(Liq;Lfd;IIFI)V")
    public void method4488(class253 arg0, class178 arg1, int arg2, int arg3, float arg4) {
        class248 var6 = arg0.method4332();
        if (var6 != null && var6.field2909.method4316(arg4)) {
            class365 var7 = (class365) this.field2805.get(var6.field2909);
            var7.method6424(var6.field2913, arg2 - var6.field2910 / 2, arg3, var6.field2910, var6.field2911, 0xFF000000 | arg1.field1884, 0, 1, 0, var7.field4355 / 2);
        }
    }

    @ObfuscatedName("ii.ao(IILjava/util/HashSet;IB)V")
    public void method4485(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2803.iterator();
        while (var6.hasNext()) {
            class253 var7 = (class253) var6.next();
            if (var7.method4731()) {
                int var8 = var7.field2948.field3397 % 64;
                int var9 = var7.field2948.field3396 % 64;
                var7.field2943 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2947 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4330())) {
                    this.method4482(var7, var7.field2943, var7.field2947, var5);
                }
            }
        }
    }

    @ObfuscatedName("ii.ac(Lri;Lgl;B)I")
    public int method4521(class477 arg0, class184 arg1) {
        switch(arg1.field1949) {
            case 0:
                return -arg0.field4966 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field4966;
        }
    }

    @ObfuscatedName("ii.af(Lri;Lga;B)I")
    public int method4487(class477 arg0, class186 arg1) {
        switch(arg1.field2004) {
            case 0:
                return 0;
            case 1:
                return -arg0.field4958 / 2;
            default:
                return -arg0.field4958;
        }
    }

    @ObfuscatedName("ii.av(II)Liz;")
    public class248 method4547(int arg0) {
        class178 var2 = class178.method2234(arg0);
        return this.method4486(var2);
    }

    @ObfuscatedName("ii.ak(Lfd;B)Liz;")
    public class248 method4486(class178 arg0) {
        if (arg0.field1879 == null || this.field2805 == null || this.field2805.get(class232.field2752) == null) {
            return null;
        }
        class232 var2 = class232.method4317(arg0.field1881);
        if (var2 == null) {
            return null;
        }
        class365 var3 = (class365) this.field2805.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method6423(arg0.field1879, 1000000);
        String[] var5 = new String[var4];
        var3.method6462(arg0.field1879, (int[]) null, var5);
        int var6 = var5.length * var3.field4355 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method6447(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class248(arg0.field1879, var7, var6, var2);
    }

    @ObfuscatedName("ii.ae(IIIIII)Ljava/util/List;")
    public List method4490(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2804.values().iterator();
            while (var7.hasNext()) {
                class253 var8 = (class253) var7.next();
                if (var8.method4731() && var8.method4736(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2803.iterator();
            while (var9.hasNext()) {
                class253 var10 = (class253) var9.next();
                if (var10.method4731() && var10.method4736(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ii.ap(B)Ljava/util/List;")
    public List method4491() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2803);
        var1.addAll(this.field2804.values());
        return var1;
    }

    @ObfuscatedName("ii.as(IIIIB)V")
    public void method4492(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class473.method8029(this.field2802 * arg0, this.field2802 * (63 - arg1), this.field2802, arg3);
        }
        if (var5 == 1) {
            class473.method8028(this.field2802 * arg0, this.field2802 * (63 - arg1), this.field2802, arg3);
        }
        if (var5 == 2) {
            class473.method8029(this.field2802 * arg0 + this.field2802 - 1, this.field2802 * (63 - arg1), this.field2802, arg3);
        }
        if (var5 == 3) {
            class473.method8028(this.field2802 * arg0, this.field2802 * (63 - arg1) + this.field2802 - 1, this.field2802, arg3);
        }
    }
}
