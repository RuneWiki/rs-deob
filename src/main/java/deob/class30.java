package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("aq")
public class class30 {

    @ObfuscatedName("aq.v")
    public static class150 field243 = new class150(37748736, 256);

    @ObfuscatedName("aq.l")
    public int field239;

    @ObfuscatedName("aq.c")
    public int field240;

    @ObfuscatedName("aq.o")
    public class16 field242;

    @ObfuscatedName("aq.i")
    public LinkedList field237;

    @ObfuscatedName("aq.d")
    public int field244;

    @ObfuscatedName("aq.m")
    public int field245;

    @ObfuscatedName("aq.p")
    public List field246;

    @ObfuscatedName("aq.h")
    public HashMap field247;

    @ObfuscatedName("aq.k")
    public final HashMap field248;

    @ObfuscatedName("hy.a(Llx;IIII)V")
    public static void method3860(class325 arg0, int arg1, int arg2, int arg3) {
        class150 var4 = field243;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3149(arg0, var6, arg0.field3866.length * 4);
    }

    @ObfuscatedName("dc.t(I)V")
    public static void method2822() {
        field243.method3151();
    }

    public class30(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field239 = arg0;
        this.field240 = arg1;
        this.field237 = new LinkedList();
        this.field246 = new LinkedList();
        this.field247 = new HashMap();
        this.field244 = arg2 | 0xFF000000;
        this.field248 = arg3;
    }

    @ObfuscatedName("aq.n(IIIB)V")
    public void method402(int arg0, int arg1, int arg2) {
        int var4 = this.field239;
        int var5 = this.field240;
        int var6 = this.field245;
        class150 var7 = field243;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class325 var10 = (class325) var7.method3152(var8);
        if (var10 == null) {
            return;
        }
        if (this.field245 * 64 == arg2) {
            var10.method5693(arg0, arg1);
        } else {
            var10.method5687(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("aq.q(Lj;Ljava/util/List;I)V")
    public void method403(class16 arg0, List arg1) {
        this.field247.clear();
        this.field242 = arg0;
        this.method408(arg1);
    }

    @ObfuscatedName("aq.v(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method404(HashSet arg0, List arg1) {
        this.field247.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class40 var4 = (class40) var3.next();
            if (var4.method268() == this.field239 && var4.method267() == this.field240) {
                this.field237.add(var4);
            }
        }
        this.method408(arg1);
    }

    @ObfuscatedName("aq.l(IIIILf;I)V")
    public void method480(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field157; var8++) {
                    class26[] var9 = arg4.field164[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class26[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class254 var13;
                            boolean var18;
                            label58: {
                                class26 var12 = var10[var11];
                                var13 = class254.method3848(var12.field193);
                                if (var13.field3354 != null) {
                                    int[] var14 = var13.field3354;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class254 var17 = class254.method3848(var16);
                                        if (var17.field3366 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3366 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method521(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.c(Lix;IIILf;I)V")
    public void method521(class254 arg0, int arg1, int arg2, int arg3, class22 arg4) {
        class214 var6 = new class214(arg1, this.field239 * 64 + arg2, this.field240 * 64 + arg3);
        Object var7 = null;
        class214 var8;
        if (this.field242 == null) {
            class40 var9 = (class40) arg4;
            var8 = new class214(var9.field151 + arg1, var9.field159 * 64 + arg2 + var9.method623() * 8, var9.field148 * 64 + arg3 + var9.method624() * 8);
        } else {
            var8 = new class214(this.field242.field151 + arg1, this.field242.field159 * 64 + arg2, this.field242.field148 * 64 + arg3);
        }
        class35 var10;
        if (arg0.field3354 == null) {
            class242 var11 = class242.method1149(arg0.field3366);
            var10 = new class19(var8, var6, var11.field3206, this.method432(var11));
        } else {
            var10 = new class24(var8, var6, arg0.field3379, this);
        }
        this.field247.put(new class214(0, arg2, arg3), var10);
    }

    @ObfuscatedName("aq.o(S)V")
    public void method407() {
        Iterator var1 = this.field247.values().iterator();
        while (var1.hasNext()) {
            class35 var2 = (class35) var1.next();
            if (var2 instanceof class24) {
                ((class24) var2).method293();
            }
        }
    }

    @ObfuscatedName("aq.i(Ljava/util/List;B)V")
    public void method408(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class19 var3 = (class19) var2.next();
            if (var3.field283.field2512 >> 6 == this.field239 && var3.field283.field2510 >> 6 == this.field240) {
                class19 var4 = new class19(var3.field283, var3.field283, var3.field116, this.method431(var3.field116));
                this.field246.add(var4);
            }
        }
    }

    @ObfuscatedName("aq.d(I)V")
    public void method409() {
        if (this.field242 != null) {
            this.field242.method279();
            return;
        }
        Iterator var1 = this.field237.iterator();
        while (var1.hasNext()) {
            class40 var2 = (class40) var1.next();
            var2.method279();
        }
    }

    @ObfuscatedName("aq.m(Lhq;I)Z")
    public boolean method469(class234 arg0) {
        this.field247.clear();
        if (this.field242 == null) {
            boolean var2 = true;
            Iterator var3 = this.field237.iterator();
            while (var3.hasNext()) {
                class40 var4 = (class40) var3.next();
                var4.method262(arg0);
                var2 &= var4.method288();
            }
            if (var2) {
                Iterator var5 = this.field237.iterator();
                while (var5.hasNext()) {
                    class40 var6 = (class40) var5.next();
                    this.method480(var6.method645() * 8, var6.method625() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field242.method262(arg0);
            if (this.field242.method288()) {
                this.method480(0, 0, 64, 64, this.field242);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("aq.p(ILae;[Llw;Lhq;Lhq;I)V")
    public void method485(int arg0, class41 arg1, class324[] arg2, class234 arg3, class234 arg4) {
        this.field245 = arg0;
        if (this.field242 == null && this.field237.isEmpty()) {
            return;
        }
        int var6 = this.field239;
        int var7 = this.field240;
        class150 var8 = field243;
        long var9 = (long) (arg0 << 16 | var6 << 8 | var7);
        class325 var11 = (class325) var8.method3152(var9);
        if (var11 != null) {
            return;
        }
        boolean var12 = true;
        boolean var13 = var12 & this.method469(arg3);
        int var14;
        if (this.field242 == null) {
            var14 = ((class22) this.field237.getFirst()).field153;
        } else {
            var14 = this.field242.field153;
        }
        boolean var15 = var13 & arg4.method3877(var14);
        if (!var15) {
            return;
        }
        byte[] var16 = arg4.method3880(var14);
        class28 var17;
        if (var16 == null) {
            var17 = new class28();
        } else {
            var17 = new class28(class50.method545(var16).field3866);
        }
        class325 var19 = new class325(this.field245 * 64, this.field245 * 64);
        var19.method5697();
        if (this.field242 == null) {
            this.method415(arg1, arg2, var17);
        } else {
            this.method467(arg1, arg2, var17);
        }
        method3860(var19, this.field239, this.field240, this.field245);
        this.method409();
    }

    @ObfuscatedName("aq.h(IIILjava/util/HashSet;I)V")
    public void method412(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method471(arg0, arg1, arg3, arg2);
        this.method427(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("aq.k(Ljava/util/HashSet;IIB)V")
    public void method413(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field247.values().iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method550()) {
                int var6 = var5.method210();
                if (arg0.contains(var6)) {
                    class242 var7 = class242.method1149(var6);
                    this.method428(var7, var5.field284, var5.field285, arg1, arg2);
                }
            }
        }
        this.method423(arg0, arg1, arg2);
    }

    @ObfuscatedName("aq.x(Lae;[Llw;Law;I)V")
    public void method467(class41 arg0, class324[] arg1, class28 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method503(var4, var5, this.field242, arg0, arg2);
                this.method418(var4, var5, this.field242, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method457(var6, var7, this.field242, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("aq.j(Lae;[Llw;Law;I)V")
    public void method415(class41 arg0, class324[] arg1, class28 arg2) {
        Iterator var4 = this.field237.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            for (int var6 = var5.method645() * 8; var6 < var5.method645() * 8 + 8; var6++) {
                for (int var7 = var5.method625() * 8; var7 < var5.method625() * 8 + 8; var7++) {
                    this.method503(var6, var7, var5, arg0, arg2);
                    this.method418(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field237.iterator();
        while (var8.hasNext()) {
            class40 var9 = (class40) var8.next();
            for (int var10 = var9.method645() * 8; var10 < var9.method645() * 8 + 8; var10++) {
                for (int var11 = var9.method625() * 8; var11 < var9.method625() * 8 + 8; var11++) {
                    this.method457(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("aq.r(IILf;Lae;[Llw;I)V")
    public void method457(int arg0, int arg1, class22 arg2, class41 arg3, class324[] arg4) {
        this.method421(arg0, arg1, arg2);
        this.method420(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("aq.e(IILf;Lae;Law;B)V")
    public void method503(int arg0, int arg1, class22 arg2, class41 arg3, class28 arg4) {
        int var6 = arg2.field147[0][arg0][arg1] - 1;
        int var7 = arg2.field161[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class321.method5585(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, this.field245, this.field244);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field244;
            class258 var10 = class258.method308(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field3497 >= 0) {
                var11 = var10.field3497 | 0xFF000000;
            } else if (var10.field3498 >= 0) {
                int var12 = class33.method1063(Statics.field1749.method2637(var10.field3498), 96);
                var11 = class131.field1758[var12] | 0xFF000000;
            } else if (var10.field3494 == 16711935) {
                var11 = var9;
            } else {
                int var13 = Statics.method1056(var10.field3495, var10.field3492, var10.field3500);
                byte var14 = 96;
                int var15;
                if (var13 == -2) {
                    var15 = 12345678;
                } else if (var13 == -1) {
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > 127) {
                        var14 = 127;
                    }
                    int var16 = 127 - var14;
                    var15 = var16;
                } else {
                    int var17 = (var13 & 0x7F) * var14 / 128;
                    if (var17 < 2) {
                        var17 = 2;
                    } else if (var17 > 126) {
                        var17 = 126;
                    }
                    var15 = (var13 & 0xFF80) + var17;
                }
                var11 = class131.field1758[var15] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field162[0][arg0][arg1] == 0) {
            class321.method5585(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, this.field245, var8);
            return;
        }
        int var19 = this.method419(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class321.method5585(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, this.field245, var19);
        } else {
            arg3.method650(this.field245 * arg0, this.field245 * (63 - arg1), var19, var8, this.field245, this.field245, arg2.field162[0][arg0][arg1], arg2.field158[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("aq.s(IILf;Lae;I)V")
    public void method418(int arg0, int arg1, class22 arg2, class41 arg3) {
        for (int var5 = 1; var5 < arg2.field157; var5++) {
            int var6 = arg2.field161[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field244;
                class258 var8 = class258.method308(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3497 >= 0) {
                    var9 = var8.field3497 | 0xFF000000;
                } else if (var8.field3498 >= 0) {
                    int var10 = class33.method1063(Statics.field1749.method2637(var8.field3498), 96);
                    var9 = class131.field1758[var10] | 0xFF000000;
                } else if (var8.field3494 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = Statics.method1056(var8.field3495, var8.field3492, var8.field3500);
                    byte var12 = 96;
                    int var13;
                    if (var11 == -2) {
                        var13 = 12345678;
                    } else if (var11 == -1) {
                        if (var12 < 0) {
                            var12 = 0;
                        } else if (var12 > 127) {
                            var12 = 127;
                        }
                        int var14 = 127 - var12;
                        var13 = var14;
                    } else {
                        int var15 = (var11 & 0x7F) * var12 / 128;
                        if (var15 < 2) {
                            var15 = 2;
                        } else if (var15 > 126) {
                            var15 = 126;
                        }
                        var13 = (var11 & 0xFF80) + var15;
                    }
                    var9 = class131.field1758[var13] | 0xFF000000;
                }
                if (arg2.field162[var5][arg0][arg1] == 0) {
                    class321.method5585(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, this.field245, var9);
                } else {
                    arg3.method650(this.field245 * arg0, this.field245 * (63 - arg1), 0, var9, this.field245, this.field245, arg2.field162[var5][arg0][arg1], arg2.field158[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("aq.b(IILf;Law;I)I")
    public int method419(int arg0, int arg1, class22 arg2, class28 arg3) {
        return arg2.field147[0][arg0][arg1] == 0 ? this.field244 : arg3.method391(arg0, arg1);
    }

    @ObfuscatedName("aq.w(IILf;[Llw;S)V")
    public void method420(int arg0, int arg1, class22 arg2, class324[] arg3) {
        for (int var5 = 0; var5 < arg2.field157; var5++) {
            class26[] var6 = arg2.field164[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class26[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class26 var9 = var7[var8];
                    int var10 = var9.field200;
                    boolean var11 = var10 >= class221.field2722.field2725 && var10 <= class221.field2723.field2725;
                    if (var11 || class221.method1065(var9.field200)) {
                        class254 var12 = class254.method3848(var9.field193);
                        if (var12.field3367 != -1) {
                            if (var12.field3367 == 46 || var12.field3367 == 52) {
                                arg3[var12.field3367].method5660(this.field245 * arg0, this.field245 * (63 - arg1), this.field245 * 2 + 1, this.field245 * 2 + 1);
                            } else {
                                arg3[var12.field3367].method5660(this.field245 * arg0, this.field245 * (63 - arg1), this.field245 * 2, this.field245 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.u(IILf;I)V")
    public void method421(int arg0, int arg1, class22 arg2) {
        for (int var4 = 0; var4 < arg2.field157; var4++) {
            class26[] var5 = arg2.field164[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class26[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class26 var8 = var6[var7];
                    int var9 = var8.field200;
                    boolean var10 = var9 >= class221.field2704.field2725 && var9 <= class221.field2705.field2725 || class221.field2706.field2725 == var9;
                    if (var10) {
                        class254 var11 = class254.method3848(var8.field193);
                        int var12 = var11.field3357 == 0 ? -3355444 : -3407872;
                        if (class221.field2704.field2725 == var8.field200) {
                            this.method435(arg0, arg1, var8.field194, var12);
                        }
                        if (class221.field2718.field2725 == var8.field200) {
                            this.method435(arg0, arg1, var8.field194, -3355444);
                            this.method435(arg0, arg1, var8.field194 + 1, var12);
                        }
                        if (class221.field2705.field2725 == var8.field200) {
                            if (var8.field194 == 0) {
                                class321.method5581(this.field245 * arg0, this.field245 * (63 - arg1), 1, var12);
                            }
                            if (var8.field194 == 1) {
                                class321.method5581(this.field245 * arg0 + this.field245 - 1, this.field245 * (63 - arg1), 1, var12);
                            }
                            if (var8.field194 == 2) {
                                class321.method5581(this.field245 * arg0 + this.field245 - 1, this.field245 * (63 - arg1) + this.field245 - 1, 1, var12);
                            }
                            if (var8.field194 == 3) {
                                class321.method5581(this.field245 * arg0, this.field245 * (63 - arg1) + this.field245 - 1, 1, var12);
                            }
                        }
                        if (class221.field2706.field2725 == var8.field200) {
                            int var13 = var8.field194 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field245; var14++) {
                                    class321.method5581(this.field245 * arg0 + var14, this.field245 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field245; var15++) {
                                    class321.method5581(this.field245 * arg0 + var15, this.field245 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.ad(IILjava/util/HashSet;II)V")
    public void method471(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field247.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2512 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2510 * var5 - var6);
            class35 var12 = (class35) var8.getValue();
            if (var12 != null && var12.method550()) {
                var12.field284 = var10;
                var12.field285 = var11;
                class242 var13 = class242.method1149(var12.method210());
                if (!arg2.contains(var13.method4098())) {
                    this.method452(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("aq.ag(Ljava/util/HashSet;III)V")
    public void method423(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field246.iterator();
        while (var4.hasNext()) {
            class35 var5 = (class35) var4.next();
            if (var5.method550()) {
                class242 var6 = class242.method1149(var5.method210());
                if (var6 != null && arg0.contains(var6.method4098())) {
                    this.method428(var6, var5.field284, var5.field285, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("aq.ak(Lie;IIIII)V")
    public void method428(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        class325 var6 = arg0.method4099(false);
        if (var6 == null) {
            return;
        }
        var6.method5686(arg1 - var6.field3863 / 2, arg2 - var6.field3870 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class321.method5583(arg1, arg2, 15, 16776960, 128);
            class321.method5583(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("aq.av(Lam;IIFI)V")
    public void method452(class35 arg0, int arg1, int arg2, float arg3) {
        class242 var5 = class242.method1149(arg0.method210());
        this.method426(var5, arg1, arg2);
        this.method439(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("aq.am(Lie;III)V")
    public void method426(class242 arg0, int arg1, int arg2) {
        class325 var4 = arg0.method4099(false);
        if (var4 != null) {
            int var5 = this.method429(var4, arg0.field3198);
            int var6 = this.method430(var4, arg0.field3213);
            var4.method5686(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("aq.ab(Lam;Lie;IIFI)V")
    public void method439(class35 arg0, class242 arg1, int arg2, int arg3, float arg4) {
        class29 var6 = arg0.method207();
        if (var6 != null && var6.field231.method202(arg4)) {
            class295 var7 = (class295) this.field248.get(var6.field231);
            var7.method4992(var6.field229, arg2 - var6.field227 / 2, arg3, var6.field227, var6.field228, 0xFF000000 | arg1.field3203, 0, 1, 0, var7.field3661 / 2);
        }
    }

    @ObfuscatedName("aq.ax(IILjava/util/HashSet;II)V")
    public void method427(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field246.iterator();
        while (var6.hasNext()) {
            class35 var7 = (class35) var6.next();
            if (var7.method550()) {
                int var8 = var7.field283.field2512 % 64;
                int var9 = var7.field283.field2510 % 64;
                var7.field284 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field285 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method210())) {
                    this.method452(var7, var7.field284, var7.field285, var5);
                }
            }
        }
    }

    @ObfuscatedName("aq.al(Llx;Lin;I)I")
    public int method429(class325 arg0, class256 arg1) {
        switch(arg1.field3449) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3863 / 2;
            default:
                return -arg0.field3863;
        }
    }

    @ObfuscatedName("aq.ap(Llx;Lik;S)I")
    public int method430(class325 arg0, class239 arg1) {
        switch(arg1.field3186) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3870 / 2;
            default:
                return -arg0.field3870;
        }
    }

    @ObfuscatedName("aq.aj(IB)Lar;")
    public class29 method431(int arg0) {
        class242 var2 = class242.method1149(arg0);
        return this.method432(var2);
    }

    @ObfuscatedName("aq.ae(Lie;I)Lar;")
    public class29 method432(class242 arg0) {
        if (arg0.field3202 == null || this.field248 == null || this.field248.get(class18.field110) == null) {
            return null;
        }
        class18 var2 = class18.method196(arg0.field3199);
        if (var2 == null) {
            return null;
        }
        class295 var3 = (class295) this.field248.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4985(arg0.field3202, 1000000);
        String[] var5 = new String[var4];
        var3.method4983(arg0.field3202, (int[]) null, var5);
        int var6 = var5.length * var3.field3661 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4982(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class29(arg0.field3202, var7, var6, var2);
    }

    @ObfuscatedName("aq.au(IIIIII)Ljava/util/List;")
    public List method433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field247.values().iterator();
            while (var7.hasNext()) {
                class35 var8 = (class35) var7.next();
                if (var8.method550() && var8.method548(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field246.iterator();
            while (var9.hasNext()) {
                class35 var10 = (class35) var9.next();
                if (var10.method550() && var10.method548(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("aq.ah(I)Ljava/util/List;")
    public List method504() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field246);
        var1.addAll(this.field247.values());
        return var1;
    }

    @ObfuscatedName("aq.an(IIIII)V")
    public void method435(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class321.method5593(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, arg3);
        }
        if (var5 == 1) {
            class321.method5581(this.field245 * arg0, this.field245 * (63 - arg1), this.field245, arg3);
        }
        if (var5 == 2) {
            class321.method5593(this.field245 * arg0 + this.field245 - 1, this.field245 * (63 - arg1), this.field245, arg3);
        }
        if (var5 == 3) {
            class321.method5581(this.field245 * arg0, this.field245 * (63 - arg1) + this.field245 - 1, this.field245, arg3);
        }
    }
}
