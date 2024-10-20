package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("hn")
public class class226 {

    @ObfuscatedName("hn.j")
    public static class254 field2716 = new class254(37748736, 256);

    @ObfuscatedName("hn.e")
    public int field2717;

    @ObfuscatedName("hn.g")
    public int field2726;

    @ObfuscatedName("hn.w")
    public class220 field2719;

    @ObfuscatedName("hn.y")
    public LinkedList field2720;

    @ObfuscatedName("hn.i")
    public int field2712;

    @ObfuscatedName("hn.s")
    public int field2721;

    @ObfuscatedName("hn.t")
    public List field2725;

    @ObfuscatedName("hn.z")
    public HashMap field2724;

    @ObfuscatedName("hn.r")
    public final HashMap field2722;

    @ObfuscatedName("pv.c(IIII)Lqe;")
    public static class456 method6900(int arg0, int arg1, int arg2) {
        class254 var3 = field2716;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class456) var3.method4664(var4);
    }

    @ObfuscatedName("dn.v(Lqe;IIII)V")
    public static void method2571(class456 arg0, int arg1, int arg2, int arg3) {
        class254 var4 = field2716;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method4662(arg0, var6, arg0.field4804.length * 4);
    }

    public class226(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2717 = arg0;
        this.field2726 = arg1;
        this.field2720 = new LinkedList();
        this.field2725 = new LinkedList();
        this.field2724 = new HashMap();
        this.field2712 = arg2 | 0xFF000000;
        this.field2722 = arg3;
    }

    @ObfuscatedName("hn.q(IIII)V")
    public void method4344(int arg0, int arg1, int arg2) {
        class456 var4 = method6900(this.field2717, this.field2726, this.field2721);
        if (var4 == null) {
            return;
        }
        if (this.field2721 * 64 == arg2) {
            var4.method7458(arg0, arg1);
        } else {
            var4.method7480(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("hn.f(Lhh;Ljava/util/List;S)V")
    public void method4390(class220 arg0, List arg1) {
        this.field2724.clear();
        this.field2719 = arg0;
        this.method4396(arg1);
    }

    @ObfuscatedName("hn.j(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4346(HashSet arg0, List arg1) {
        this.field2724.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class228 var4 = (class228) var3.next();
            if (var4.method4560() == this.field2717 && var4.method4551() == this.field2726) {
                this.field2720.add(var4);
            }
        }
        this.method4396(arg1);
    }

    @ObfuscatedName("hn.e(IIIILhd;I)V")
    public void method4347(int arg0, int arg1, int arg2, int arg3, class234 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2801; var8++) {
                    class236[] var9 = arg4.field2808[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class236[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class187 var13;
                            boolean var18;
                            label58: {
                                class236 var12 = var10[var11];
                                var13 = class187.method3000(var12.field2823);
                                if (var13.field2082 != null) {
                                    int[] var14 = var13.field2082;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class187 var17 = class187.method3000(var16);
                                        if (var17.field2089 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field2089 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method4348(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hn.g(Lgk;IIILhd;B)V")
    public void method4348(class187 arg0, int arg1, int arg2, int arg3, class234 arg4) {
        class289 var6 = new class289(arg1, this.field2717 * 64 + arg2, this.field2726 * 64 + arg3);
        Object var7 = null;
        class289 var8;
        if (this.field2719 == null) {
            class228 var9 = (class228) arg4;
            var8 = new class289(var9.field2803 + arg1, var9.field2800 * 64 + arg2 + var9.method4503() * 8, var9.field2810 * 64 + arg3 + var9.method4504() * 8);
        } else {
            var8 = new class289(this.field2719.field2803 + arg1, this.field2719.field2800 * 64 + arg2, this.field2719.field2810 * 64 + arg3);
        }
        class243 var10;
        if (arg0.field2082 == null) {
            class171 var11 = class171.method6889(arg0.field2089);
            var10 = new class231(var8, var6, var11.field1849, this.method4374(var11));
        } else {
            var10 = new class223(var8, var6, arg0.field2048, this);
        }
        class171 var12 = class171.method6889(var10.method4228());
        if (var12.field1831) {
            this.field2724.put(new class289(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("hn.w(B)V")
    public void method4349() {
        Iterator var1 = this.field2724.values().iterator();
        while (var1.hasNext()) {
            class243 var2 = (class243) var1.next();
            if (var2 instanceof class223) {
                ((class223) var2).method4229();
            }
        }
    }

    @ObfuscatedName("hn.y(Ljava/util/List;B)V")
    public void method4396(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class231 var3 = (class231) var2.next();
            if (class171.method6889(var3.field2766).field1831 && var3.field2861.field3328 >> 6 == this.field2717 && var3.field2861.field3330 >> 6 == this.field2726) {
                class231 var4 = new class231(var3.field2861, var3.field2861, var3.field2766, this.method4458(var3.field2766));
                this.field2725.add(var4);
            }
        }
    }

    @ObfuscatedName("hn.i(I)V")
    public void method4351() {
        if (this.field2719 != null) {
            this.field2719.method4546();
            return;
        }
        Iterator var1 = this.field2720.iterator();
        while (var1.hasNext()) {
            class228 var2 = (class228) var1.next();
            var2.method4546();
        }
    }

    @ObfuscatedName("hn.s(Llh;I)Z")
    public boolean method4444(class315 arg0) {
        this.field2724.clear();
        if (this.field2719 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2720.iterator();
            while (var3.hasNext()) {
                class228 var4 = (class228) var3.next();
                var4.method4569(arg0);
                var2 &= var4.method4545();
            }
            if (var2) {
                Iterator var5 = this.field2720.iterator();
                while (var5.hasNext()) {
                    class228 var6 = (class228) var5.next();
                    this.method4347(var6.method4505() * 8, var6.method4520() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2719.method4569(arg0);
            if (this.field2719.method4545()) {
                this.method4347(0, 0, 64, 64, this.field2719);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("hn.t(ILif;[Lqu;Llh;Llh;B)V")
    public void method4353(int arg0, class247 arg1, class455[] arg2, class315 arg3, class315 arg4) {
        this.field2721 = arg0;
        if (this.field2719 == null && this.field2720.isEmpty() || method6900(this.field2717, this.field2726, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4444(arg3);
        int var8;
        if (this.field2719 == null) {
            var8 = ((class234) this.field2720.getFirst()).field2807;
        } else {
            var8 = this.field2719.field2807;
        }
        boolean var9 = var7 & arg4.method5304(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method5306(var8);
        class237 var11;
        if (var10 == null) {
            var11 = new class237();
        } else {
            var11 = new class237(class29.method3589(var10).field4804);
        }
        class456 var13 = new class456(this.field2721 * 64, this.field2721 * 64);
        var13.method7451();
        if (this.field2719 == null) {
            this.method4438(arg1, arg2, var11);
        } else {
            this.method4434(arg1, arg2, var11);
        }
        method2571(var13, this.field2717, this.field2726, this.field2721);
        this.method4351();
    }

    @ObfuscatedName("hn.z(IIILjava/util/HashSet;I)V")
    public void method4388(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4364(arg0, arg1, arg3, arg2);
        this.method4437(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("hn.r(Ljava/util/HashSet;III)V")
    public void method4355(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2724.values().iterator();
        while (var4.hasNext()) {
            class243 var5 = (class243) var4.next();
            if (var5.method4602()) {
                int var6 = var5.method4228();
                if (arg0.contains(var6)) {
                    class171 var7 = class171.method6889(var6);
                    this.method4366(var7, var5.field2863, var5.field2862, arg1, arg2);
                }
            }
        }
        this.method4365(arg0, arg1, arg2);
    }

    @ObfuscatedName("hn.u(Lif;[Lqu;Lis;B)V")
    public void method4434(class247 arg0, class455[] arg1, class237 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4367(var4, var5, this.field2719, arg0, arg2);
                this.method4432(var4, var5, this.field2719, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4358(var6, var7, this.field2719, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("hn.k(Lif;[Lqu;Lis;I)V")
    public void method4438(class247 arg0, class455[] arg1, class237 arg2) {
        Iterator var4 = this.field2720.iterator();
        while (var4.hasNext()) {
            class228 var5 = (class228) var4.next();
            for (int var6 = var5.method4505() * 8; var6 < var5.method4505() * 8 + 8; var6++) {
                for (int var7 = var5.method4520() * 8; var7 < var5.method4520() * 8 + 8; var7++) {
                    this.method4367(var6, var7, var5, arg0, arg2);
                    this.method4432(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2720.iterator();
        while (var8.hasNext()) {
            class228 var9 = (class228) var8.next();
            for (int var10 = var9.method4505() * 8; var10 < var9.method4505() * 8 + 8; var10++) {
                for (int var11 = var9.method4520() * 8; var11 < var9.method4520() * 8 + 8; var11++) {
                    this.method4358(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("hn.h(IILhd;Lif;[Lqu;B)V")
    public void method4358(int arg0, int arg1, class234 arg2, class247 arg3, class455[] arg4) {
        this.method4363(arg0, arg1, arg2);
        this.method4356(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("hn.x(IILhd;Lif;Lis;I)V")
    public void method4367(int arg0, int arg1, class234 arg2, class247 arg3, class237 arg4) {
        int var6 = arg2.field2804[0][arg0][arg1] - 1;
        int var7 = arg2.field2805[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class452.method7400(this.field2721 * arg0, this.field2721 * (63 - arg1), this.field2721, this.field2721, this.field2712);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2712;
            class189 var10 = class189.method2677(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field2155 >= 0) {
                var11 = var10.field2155 | 0xFF000000;
            } else if (var10.field2153 >= 0) {
                int var12 = class241.method2885(Statics.field2364.method4038(var10.field2153), 96);
                var11 = class201.field2354[var12] | 0xFF000000;
            } else if (var10.field2152 == 16711935) {
                var11 = var9;
            } else {
                int var13 = var10.field2154;
                int var14 = var10.field2157;
                int var15 = var10.field2160;
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
                int var19 = class241.method2885(var16, 96);
                var11 = class201.field2354[var19] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field2797[0][arg0][arg1] == 0) {
            class452.method7400(this.field2721 * arg0, this.field2721 * (63 - arg1), this.field2721, this.field2721, var8);
            return;
        }
        int var20 = this.method4361(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class452.method7400(this.field2721 * arg0, this.field2721 * (63 - arg1), this.field2721, this.field2721, var20);
        } else {
            arg3.method4641(this.field2721 * arg0, this.field2721 * (63 - arg1), var20, var8, this.field2721, this.field2721, arg2.field2797[0][arg0][arg1], arg2.field2796[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("hn.l(IILhd;Lif;I)V")
    public void method4432(int arg0, int arg1, class234 arg2, class247 arg3) {
        for (int var5 = 1; var5 < arg2.field2801; var5++) {
            int var6 = arg2.field2805[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2712;
                class189 var8 = class189.method2677(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field2155 >= 0) {
                    var9 = var8.field2155 | 0xFF000000;
                } else if (var8.field2153 >= 0) {
                    int var10 = class241.method2885(Statics.field2364.method4038(var8.field2153), 96);
                    var9 = class201.field2354[var10] | 0xFF000000;
                } else if (var8.field2152 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = var8.field2154;
                    int var12 = var8.field2157;
                    int var13 = var8.field2160;
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
                    int var17 = class241.method2885(var14, 96);
                    var9 = class201.field2354[var17] | 0xFF000000;
                }
                if (arg2.field2797[var5][arg0][arg1] == 0) {
                    class452.method7400(this.field2721 * arg0, this.field2721 * (63 - arg1), this.field2721, this.field2721, var9);
                } else {
                    arg3.method4641(this.field2721 * arg0, this.field2721 * (63 - arg1), 0, var9, this.field2721, this.field2721, arg2.field2797[var5][arg0][arg1], arg2.field2796[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("hn.a(IILhd;Lis;I)I")
    public int method4361(int arg0, int arg1, class234 arg2, class237 arg3) {
        return arg2.field2804[0][arg0][arg1] == 0 ? this.field2712 : arg3.method4581(arg0, arg1);
    }

    @ObfuscatedName("hn.p(IILhd;[Lqu;I)V")
    public void method4356(int arg0, int arg1, class234 arg2, class455[] arg3) {
        for (int var5 = 0; var5 < arg2.field2801; var5++) {
            class236[] var6 = arg2.field2808[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class236[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class236 var9 = var7[var8];
                    if (class297.method3018(var9.field2822) || class297.method4225(var9.field2822)) {
                        class187 var10 = class187.method3000(var9.field2823);
                        if (var10.field2090 != -1) {
                            if (var10.field2090 == 46 || var10.field2090 == 52) {
                                arg3[var10.field2090].method7433(this.field2721 * arg0, this.field2721 * (63 - arg1), this.field2721 * 2 + 1, this.field2721 * 2 + 1);
                            } else {
                                arg3[var10.field2090].method7433(this.field2721 * arg0, this.field2721 * (63 - arg1), this.field2721 * 2, this.field2721 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hn.b(IILhd;B)V")
    public void method4363(int arg0, int arg1, class234 arg2) {
        for (int var4 = 0; var4 < arg2.field2801; var4++) {
            class236[] var5 = arg2.field2808[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class236[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class236 var8 = var6[var7];
                    int var9 = var8.field2822;
                    boolean var10 = var9 >= class297.field3550.field3555 && var9 <= class297.field3535.field3555 || class297.field3536.field3555 == var9;
                    if (var10) {
                        class187 var11 = class187.method3000(var8.field2823);
                        int var12 = var11.field2060 == 0 ? -3355444 : -3407872;
                        if (class297.field3550.field3555 == var8.field2822) {
                            this.method4373(arg0, arg1, var8.field2824, var12);
                        }
                        if (class297.field3534.field3555 == var8.field2822) {
                            this.method4373(arg0, arg1, var8.field2824, -3355444);
                            this.method4373(arg0, arg1, var8.field2824 + 1, var12);
                        }
                        if (class297.field3535.field3555 == var8.field2822) {
                            if (var8.field2824 == 0) {
                                class452.method7357(this.field2721 * arg0, this.field2721 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2824 == 1) {
                                class452.method7357(this.field2721 * arg0 + this.field2721 - 1, this.field2721 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2824 == 2) {
                                class452.method7357(this.field2721 * arg0 + this.field2721 - 1, this.field2721 * (63 - arg1) + this.field2721 - 1, 1, var12);
                            }
                            if (var8.field2824 == 3) {
                                class452.method7357(this.field2721 * arg0, this.field2721 * (63 - arg1) + this.field2721 - 1, 1, var12);
                            }
                        }
                        if (class297.field3536.field3555 == var8.field2822) {
                            int var13 = var8.field2824 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2721; var14++) {
                                    class452.method7357(this.field2721 * arg0 + var14, this.field2721 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2721; var15++) {
                                    class452.method7357(this.field2721 * arg0 + var15, this.field2721 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hn.n(IILjava/util/HashSet;IB)V")
    public void method4364(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2724.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class289 var9 = (class289) var8.getKey();
            int var10 = (int) ((float) var9.field3328 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3330 * var5 - var6);
            class243 var12 = (class243) var8.getValue();
            if (var12 != null && var12.method4602()) {
                var12.field2863 = var10;
                var12.field2862 = var11;
                class171 var13 = class171.method6889(var12.method4228());
                if (!arg2.contains(var13.method3062())) {
                    this.method4421(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("hn.o(Ljava/util/HashSet;III)V")
    public void method4365(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2725.iterator();
        while (var4.hasNext()) {
            class243 var5 = (class243) var4.next();
            if (var5.method4602()) {
                class171 var6 = class171.method6889(var5.method4228());
                if (var6 != null && arg0.contains(var6.method3062())) {
                    this.method4366(var6, var5.field2863, var5.field2862, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("hn.m(Lfa;IIIII)V")
    public void method4366(class171 arg0, int arg1, int arg2, int arg3, int arg4) {
        class456 var6 = arg0.method3060(false);
        if (var6 == null) {
            return;
        }
        var6.method7460(arg1 - var6.field4796 / 2, arg2 - var6.field4795 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class452.method7349(arg1, arg2, 15, 16776960, 128);
            class452.method7349(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("hn.d(Lim;IIFB)V")
    public void method4421(class243 arg0, int arg1, int arg2, float arg3) {
        class171 var5 = class171.method6889(arg0.method4228());
        this.method4368(var5, arg1, arg2);
        this.method4369(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("hn.ad(Lfa;III)V")
    public void method4368(class171 arg0, int arg1, int arg2) {
        class456 var4 = arg0.method3060(false);
        if (var4 != null) {
            int var5 = this.method4371(var4, arg0.field1846);
            int var6 = this.method4372(var4, arg0.field1847);
            var4.method7460(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("hn.ak(Lim;Lfa;IIFI)V")
    public void method4369(class243 arg0, class171 arg1, int arg2, int arg3, float arg4) {
        class238 var6 = arg0.method4237();
        if (var6 != null && var6.field2833.method4217(arg4)) {
            class349 var7 = (class349) this.field2722.get(var6.field2833);
            var7.method5810(var6.field2831, arg2 - var6.field2830 / 2, arg3, var6.field2830, var6.field2832, 0xFF000000 | arg1.field1835, 0, 1, 0, var7.field4182 / 2);
        }
    }

    @ObfuscatedName("hn.al(IILjava/util/HashSet;II)V")
    public void method4437(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2725.iterator();
        while (var6.hasNext()) {
            class243 var7 = (class243) var6.next();
            if (var7.method4602()) {
                int var8 = var7.field2861.field3328 % 64;
                int var9 = var7.field2861.field3330 % 64;
                var7.field2863 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2862 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4228())) {
                    this.method4421(var7, var7.field2863, var7.field2862, var5);
                }
            }
        }
    }

    @ObfuscatedName("hn.ao(Lqe;Lfk;I)I")
    public int method4371(class456 arg0, class177 arg1) {
        switch(arg1.field1912) {
            case 1:
                return 0;
            case 2:
                return -arg0.field4796 / 2;
            default:
                return -arg0.field4796;
        }
    }

    @ObfuscatedName("hn.ab(Lqe;Lft;I)I")
    public int method4372(class456 arg0, class179 arg1) {
        switch(arg1.field1961) {
            case 0:
                return 0;
            case 2:
                return -arg0.field4795 / 2;
            default:
                return -arg0.field4795;
        }
    }

    @ObfuscatedName("hn.ap(IB)Liz;")
    public class238 method4458(int arg0) {
        class171 var2 = class171.method6889(arg0);
        return this.method4374(var2);
    }

    @ObfuscatedName("hn.ac(Lfa;I)Liz;")
    public class238 method4374(class171 arg0) {
        if (arg0.field1830 == null || this.field2722 == null || this.field2722.get(class222.field2675) == null) {
            return null;
        }
        int var2 = arg0.field1848;
        class222[] var3 = class222.method4218();
        int var4 = 0;
        class222 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class222 var5 = var3[var4];
            if (var5.field2673 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class349 var8 = (class349) this.field2722.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method5832(arg0.field1830, 1000000);
        String[] var10 = new String[var9];
        var8.method5801(arg0.field1830, (int[]) null, var10);
        int var11 = var10.length * var8.field4182 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method5800(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class238(arg0.field1830, var12, var11, var6);
    }

    @ObfuscatedName("hn.ae(IIIIIB)Ljava/util/List;")
    public List method4452(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2724.values().iterator();
            while (var7.hasNext()) {
                class243 var8 = (class243) var7.next();
                if (var8.method4602() && var8.method4600(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2725.iterator();
            while (var9.hasNext()) {
                class243 var10 = (class243) var9.next();
                if (var10.method4602() && var10.method4600(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("hn.aj(I)Ljava/util/List;")
    public List method4435() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2725);
        var1.addAll(this.field2724.values());
        return var1;
    }

    @ObfuscatedName("hn.am(IIIII)V")
    public void method4373(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class452.method7359(this.field2721 * arg0, this.field2721 * (63 - arg1), this.field2721, arg3);
        }
        if (var5 == 1) {
            class452.method7357(this.field2721 * arg0, this.field2721 * (63 - arg1), this.field2721, arg3);
        }
        if (var5 == 2) {
            class452.method7359(this.field2721 * arg0 + this.field2721 - 1, this.field2721 * (63 - arg1), this.field2721, arg3);
        }
        if (var5 == 3) {
            class452.method7357(this.field2721 * arg0, this.field2721 * (63 - arg1) + this.field2721 - 1, this.field2721, arg3);
        }
    }
}
