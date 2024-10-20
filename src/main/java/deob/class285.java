package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("kv")
public class class285 {

    @ObfuscatedName("kv.ax")
    public static class313 field3073 = new class313(37748736, 256);

    @ObfuscatedName("kv.ao")
    public int field3081;

    @ObfuscatedName("kv.am")
    public int field3075;

    @ObfuscatedName("kv.ac")
    public class279 field3070;

    @ObfuscatedName("kv.ae")
    public LinkedList field3078;

    @ObfuscatedName("kv.ad")
    public int field3072;

    @ObfuscatedName("kv.aq")
    public int field3079;

    @ObfuscatedName("kv.al")
    public List field3080;

    @ObfuscatedName("kv.aj")
    public HashMap field3082;

    @ObfuscatedName("kv.as")
    public final HashMap field3074;

    @ObfuscatedName("cv.ab(IIII)J")
    public static long method2102(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("fh.ay(IIII)Lvc;")
    public static class563 method3199(int arg0, int arg1, int arg2) {
        return (class563) field3073.method5562(method2102(arg0, arg1, arg2));
    }

    @ObfuscatedName("to.an(Lvc;IIIB)V")
    public static void method8495(class563 arg0, int arg1, int arg2, int arg3) {
        field3073.method5566(arg0, method2102(arg1, arg2, arg3), arg0.field5481.length * 4);
    }

    @ObfuscatedName("jv.au(B)V")
    public static void method4613() {
        field3073.method5560();
    }

    public class285(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field3081 = arg0;
        this.field3075 = arg1;
        this.field3078 = new LinkedList();
        this.field3080 = new LinkedList();
        this.field3082 = new HashMap();
        this.field3072 = arg2 | 0xFF000000;
        this.field3074 = arg3;
    }

    @ObfuscatedName("kv.ax(IIII)V")
    public void method5208(int arg0, int arg1, int arg2) {
        class563 var4 = method3199(this.field3081, this.field3075, this.field3079);
        if (var4 == null) {
            return;
        }
        if (this.field3079 * 64 == arg2) {
            var4.method9360(arg0, arg1);
        } else {
            var4.method9321(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("kv.ao(Lks;Ljava/util/List;B)V")
    public void method5207(class279 arg0, List arg1) {
        this.field3082.clear();
        this.field3070 = arg0;
        this.method5213(arg1);
    }

    @ObfuscatedName("kv.am(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method5210(HashSet arg0, List arg1) {
        this.field3082.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class287 var4 = (class287) var3.next();
            if (var4.method5443() == this.field3081 && var4.method5435() == this.field3075) {
                this.field3078.add(var4);
            }
        }
        this.method5213(arg1);
    }

    @ObfuscatedName("kv.ac(IIIILli;I)V")
    public void method5211(int arg0, int arg1, int arg2, int arg3, class293 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field3154; var8++) {
                    class295[] var9 = arg4.field3161[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class295[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class295 var12 = var10[var11];
                            class261 var13 = class261.method4328(var12.field3176);
                            if (method8496(var13)) {
                                this.method5212(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kv.ae(Lkt;IIILli;I)V")
    public void method5212(class261 arg0, int arg1, int arg2, int arg3, class293 arg4) {
        class350 var6 = new class350(arg1, this.field3081 * 64 + arg2, this.field3075 * 64 + arg3);
        Object var7 = null;
        class350 var8;
        if (this.field3070 == null) {
            class287 var9 = (class287) arg4;
            var8 = new class350(var9.field3162 + arg1, var9.field3157 * 64 + arg2 + var9.method5390() * 8, var9.field3150 * 64 + arg3 + var9.method5384() * 8);
        } else {
            var8 = new class350(this.field3070.field3162 + arg1, this.field3070.field3157 * 64 + arg2, this.field3070.field3150 * 64 + arg3);
        }
        class302 var10;
        if (arg0.field2783 == null) {
            class235 var11 = class235.method2700(arg0.field2730);
            var10 = new class290(var8, var6, var11.field2468, this.method5314(var11));
        } else {
            var10 = new class282(var8, var6, arg0.field2753, this);
        }
        class235 var12 = class235.method2700(var10.method5108());
        if (var12.field2470) {
            this.field3082.put(new class350(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("kv.ad(I)V")
    public void method5307() {
        Iterator var1 = this.field3082.values().iterator();
        while (var1.hasNext()) {
            class302 var2 = (class302) var1.next();
            if (var2 instanceof class282) {
                ((class282) var2).method5114();
            }
        }
    }

    @ObfuscatedName("kv.aq(Ljava/util/List;B)V")
    public void method5213(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class290 var3 = (class290) var2.next();
            if (class235.method2700(var3.field3121).field2470 && var3.field3211.field3705 >> 6 == this.field3081 && var3.field3211.field3704 >> 6 == this.field3075) {
                class290 var4 = new class290(var3.field3211, var3.field3211, var3.field3121, this.method5236(var3.field3121));
                this.field3080.add(var4);
            }
        }
    }

    @ObfuscatedName("kv.al(I)V")
    public void method5318() {
        if (this.field3070 != null) {
            this.field3070.method5433();
            return;
        }
        Iterator var1 = this.field3078.iterator();
        while (var1.hasNext()) {
            class287 var2 = (class287) var1.next();
            var2.method5433();
        }
    }

    @ObfuscatedName("kv.aj(Lob;I)Z")
    public boolean method5239(class389 arg0) {
        this.field3082.clear();
        if (this.field3070 == null) {
            boolean var2 = true;
            Iterator var3 = this.field3078.iterator();
            while (var3.hasNext()) {
                class287 var4 = (class287) var3.next();
                var4.method5429(arg0);
                var2 &= var4.method5428();
            }
            if (var2) {
                Iterator var5 = this.field3078.iterator();
                while (var5.hasNext()) {
                    class287 var6 = (class287) var5.next();
                    this.method5211(var6.method5388() * 8, var6.method5404() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field3070.method5429(arg0);
            if (this.field3070.method5428()) {
                this.method5211(0, 0, 64, 64, this.field3070);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("kv.as(ILlm;[Lvb;Lob;Lob;I)V")
    public void method5216(int arg0, class306 arg1, class562[] arg2, class389 arg3, class389 arg4) {
        this.field3079 = arg0;
        if (this.field3070 == null && this.field3078.isEmpty() || method3199(this.field3081, this.field3075, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method5239(arg3);
        int var8;
        if (this.field3070 == null) {
            var8 = ((class293) this.field3078.getFirst()).field3155;
        } else {
            var8 = this.field3070.field3155;
        }
        boolean var9 = var7 & arg4.method6642(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method6644(var8);
        class296 var11 = class296.method7931(var10);
        class563 var12 = new class563(this.field3079 * 64, this.field3079 * 64);
        var12.method9246();
        if (this.field3070 == null) {
            this.method5267(arg1, arg2, var11);
        } else {
            this.method5219(arg1, arg2, var11);
        }
        method8495(var12, this.field3081, this.field3075, this.field3079);
        this.method5318();
    }

    @ObfuscatedName("kv.aw(IIILjava/util/HashSet;I)V")
    public void method5217(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method5296(arg0, arg1, arg3, arg2);
        this.method5252(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("kv.af(Ljava/util/HashSet;III)V")
    public void method5218(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3082.values().iterator();
        while (var4.hasNext()) {
            class302 var5 = (class302) var4.next();
            if (var5.method5484()) {
                int var6 = var5.method5108();
                if (arg0.contains(var6)) {
                    class235 var7 = class235.method2700(var6);
                    this.method5229(var7, var5.field3207, var5.field3210, arg1, arg2);
                }
            }
        }
        this.method5228(arg0, arg1, arg2);
    }

    @ObfuscatedName("kv.aa(Llm;[Lvb;Lly;I)V")
    public void method5219(class306 arg0, class562[] arg1, class296 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method5222(var4, var5, this.field3070, arg0, arg2);
                this.method5264(var4, var5, this.field3070, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method5221(var6, var7, this.field3070, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("kv.ah(Llm;[Lvb;Lly;B)V")
    public void method5267(class306 arg0, class562[] arg1, class296 arg2) {
        Iterator var4 = this.field3078.iterator();
        while (var4.hasNext()) {
            class287 var5 = (class287) var4.next();
            for (int var6 = var5.method5388() * 8; var6 < var5.method5388() * 8 + 8; var6++) {
                for (int var7 = var5.method5404() * 8; var7 < var5.method5404() * 8 + 8; var7++) {
                    this.method5222(var6, var7, var5, arg0, arg2);
                    this.method5264(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field3078.iterator();
        while (var8.hasNext()) {
            class287 var9 = (class287) var8.next();
            for (int var10 = var9.method5388() * 8; var10 < var9.method5388() * 8 + 8; var10++) {
                for (int var11 = var9.method5404() * 8; var11 < var9.method5404() * 8 + 8; var11++) {
                    this.method5221(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("kv.ag(IILli;Llm;[Lvb;B)V")
    public void method5221(int arg0, int arg1, class293 arg2, class306 arg3, class562[] arg4) {
        this.method5226(arg0, arg1, arg2);
        this.method5225(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("kv.av(IILli;Llm;Lly;B)V")
    public void method5222(int arg0, int arg1, class293 arg2, class306 arg3, class296 arg4) {
        int var6 = arg2.field3152[0][arg0][arg1] - 1;
        int var7 = arg2.field3158[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class559.method9145(this.field3079 * arg0, this.field3079 * (63 - arg1), this.field3079, this.field3079, this.field3072);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class300.method5919(var7, this.field3072);
        }
        if (var7 > -1 && arg2.field3159[0][arg0][arg1] == 0) {
            class559.method9145(this.field3079 * arg0, this.field3079 * (63 - arg1), this.field3079, this.field3079, var8);
            return;
        }
        int var9 = this.method5224(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class559.method9145(this.field3079 * arg0, this.field3079 * (63 - arg1), this.field3079, this.field3079, var9);
        } else {
            arg3.method5518(this.field3079 * arg0, this.field3079 * (63 - arg1), var9, var8, this.field3079, this.field3079, arg2.field3159[0][arg0][arg1], arg2.field3160[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("kv.ar(IILli;Llm;I)V")
    public void method5264(int arg0, int arg1, class293 arg2, class306 arg3) {
        for (int var5 = 1; var5 < arg2.field3154; var5++) {
            int var6 = arg2.field3158[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class300.method5919(var6, this.field3072);
                if (arg2.field3159[var5][arg0][arg1] == 0) {
                    class559.method9145(this.field3079 * arg0, this.field3079 * (63 - arg1), this.field3079, this.field3079, var7);
                } else {
                    arg3.method5518(this.field3079 * arg0, this.field3079 * (63 - arg1), 0, var7, this.field3079, this.field3079, arg2.field3159[var5][arg0][arg1], arg2.field3160[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("kv.ap(IILli;Lly;I)I")
    public int method5224(int arg0, int arg1, class293 arg2, class296 arg3) {
        return arg2.field3152[0][arg0][arg1] == 0 ? this.field3072 : arg3.method5459(arg0, arg1);
    }

    @ObfuscatedName("kv.ak(IILli;[Lvb;B)V")
    public void method5225(int arg0, int arg1, class293 arg2, class562[] arg3) {
        for (int var5 = 0; var5 < arg2.field3154; var5++) {
            class295[] var6 = arg2.field3161[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class295[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class295 var9 = var7[var8];
                    int var10 = var9.field3174;
                    boolean var11 = var10 >= class370.field4012.field3999 && var10 <= class370.field4013.field3999;
                    if (!var11) {
                        int var12 = var9.field3174;
                        boolean var13 = class370.field4014.field3999 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class261 var14 = class261.method4328(var9.field3176);
                    if (var14.field2784 != -1) {
                        if (var14.field2784 == 46 || var14.field2784 == 52) {
                            arg3[var14.field2784].method9220(this.field3079 * arg0, this.field3079 * (63 - arg1), this.field3079 * 2 + 1, this.field3079 * 2 + 1);
                        } else {
                            arg3[var14.field2784].method9220(this.field3079 * arg0, this.field3079 * (63 - arg1), this.field3079 * 2, this.field3079 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kv.ai(IILli;I)V")
    public void method5226(int arg0, int arg1, class293 arg2) {
        for (int var4 = 0; var4 < arg2.field3154; var4++) {
            class295[] var5 = arg2.field3161[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class295[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class295 var8 = var6[var7];
                    if (class370.method5690(var8.field3174)) {
                        class261 var9 = class261.method4328(var8.field3176);
                        int var10 = var9.field2750 == 0 ? -3355444 : -3407872;
                        if (class370.field4000.field3999 == var8.field3174) {
                            this.method5332(arg0, arg1, var8.field3175, var10);
                        }
                        if (class370.field4001.field3999 == var8.field3174) {
                            this.method5332(arg0, arg1, var8.field3175, -3355444);
                            this.method5332(arg0, arg1, var8.field3175 + 1, var10);
                        }
                        if (class370.field4008.field3999 == var8.field3174) {
                            if (var8.field3175 == 0) {
                                class559.method9129(this.field3079 * arg0, this.field3079 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3175 == 1) {
                                class559.method9129(this.field3079 * arg0 + this.field3079 - 1, this.field3079 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3175 == 2) {
                                class559.method9129(this.field3079 * arg0 + this.field3079 - 1, this.field3079 * (63 - arg1) + this.field3079 - 1, 1, var10);
                            }
                            if (var8.field3175 == 3) {
                                class559.method9129(this.field3079 * arg0, this.field3079 * (63 - arg1) + this.field3079 - 1, 1, var10);
                            }
                        }
                        if (class370.field3996.field3999 == var8.field3174) {
                            int var11 = var8.field3175 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field3079; var12++) {
                                    class559.method9129(this.field3079 * arg0 + var12, this.field3079 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field3079; var13++) {
                                    class559.method9129(this.field3079 * arg0 + var13, this.field3079 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kv.at(IILjava/util/HashSet;II)V")
    public void method5296(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field3082.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class350 var9 = (class350) var8.getKey();
            int var10 = (int) ((float) var9.field3705 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3704 * var5 - var6);
            class302 var12 = (class302) var8.getValue();
            if (var12 != null && var12.method5484()) {
                var12.field3207 = var10;
                var12.field3210 = var11;
                class235 var13 = class235.method2700(var12.method5108());
                if (!arg2.contains(var13.method4400())) {
                    this.method5320(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("kv.az(Ljava/util/HashSet;III)V")
    public void method5228(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3080.iterator();
        while (var4.hasNext()) {
            class302 var5 = (class302) var4.next();
            if (var5.method5484()) {
                class235 var6 = class235.method2700(var5.method5108());
                if (var6 != null && arg0.contains(var6.method4400())) {
                    this.method5229(var6, var5.field3207, var5.field3210, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("kv.bg(Lja;IIIIB)V")
    public void method5229(class235 arg0, int arg1, int arg2, int arg3, int arg4) {
        class563 var6 = arg0.method4398(false);
        if (var6 == null) {
            return;
        }
        var6.method9284(arg1 - var6.field5478 / 2, arg2 - var6.field5479 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class559.method9146(arg1, arg2, 15, 16776960, 128);
            class559.method9146(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("kv.bz(Lla;IIFB)V")
    public void method5320(class302 arg0, int arg1, int arg2, float arg3) {
        class235 var5 = class235.method2700(arg0.method5108());
        this.method5231(var5, arg1, arg2);
        this.method5232(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("kv.bj(Lja;III)V")
    public void method5231(class235 arg0, int arg1, int arg2) {
        class563 var4 = arg0.method4398(false);
        if (var4 != null) {
            int var5 = this.method5258(var4, arg0.field2483);
            int var6 = this.method5235(var4, arg0.field2484);
            var4.method9284(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("kv.bc(Lla;Lja;IIFB)V")
    public void method5232(class302 arg0, class235 arg1, int arg2, int arg3, float arg4) {
        class297 var6 = arg0.method5101();
        if (var6 != null && var6.field3185.method5092(arg4)) {
            class433 var7 = (class433) this.field3074.get(var6.field3185);
            var7.method7538(var6.field3186, arg2 - var6.field3183 / 2, arg3, var6.field3183, var6.field3184, 0xFF000000 | arg1.field2474, 0, 1, 0, var7.field4756 / 2);
        }
    }

    @ObfuscatedName("kv.bo(IILjava/util/HashSet;II)V")
    public void method5252(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field3080.iterator();
        while (var6.hasNext()) {
            class302 var7 = (class302) var6.next();
            if (var7.method5484()) {
                int var8 = var7.field3211.field3705 % 64;
                int var9 = var7.field3211.field3704 % 64;
                var7.field3207 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3210 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method5108())) {
                    this.method5320(var7, var7.field3207, var7.field3210, var5);
                }
            }
        }
    }

    @ObfuscatedName("kv.bm(Lvc;Lji;B)I")
    public int method5258(class563 arg0, class244 arg1) {
        switch(arg1.field2553) {
            case 0:
                return -arg0.field5478 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field5478;
        }
    }

    @ObfuscatedName("kv.bd(Lvc;Ljg;B)I")
    public int method5235(class563 arg0, class248 arg1) {
        switch(arg1.field2622) {
            case 1:
                return 0;
            case 2:
                return -arg0.field5479 / 2;
            default:
                return -arg0.field5479;
        }
    }

    @ObfuscatedName("to.bh(Lkt;I)Z")
    public static boolean method8496(class261 arg0) {
        if (arg0.field2783 != null) {
            int[] var1 = arg0.field2783;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class261 var4 = class261.method4328(var3);
                if (var4.field2730 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2730 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("kv.bx(II)Llk;")
    public class297 method5236(int arg0) {
        class235 var2 = class235.method2700(arg0);
        return this.method5314(var2);
    }

    @ObfuscatedName("kv.bv(Lja;I)Llk;")
    public class297 method5314(class235 arg0) {
        if (arg0.field2465 == null || this.field3074 == null || this.field3074.get(class281.field3029) == null) {
            return null;
        }
        int var2 = arg0.field2476;
        class281[] var3 = new class281[] { class281.field3028, class281.field3030, class281.field3029 };
        class281[] var4 = var3;
        int var5 = 0;
        class281 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class281 var6 = var4[var5];
            if (var6.field3031 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class433 var9 = (class433) this.field3074.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method7536(arg0.field2465, 1000000);
        String[] var11 = new String[var10];
        var9.method7529(arg0.field2465, (int[]) null, var11);
        int var12 = var11.length * var9.field4756 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method7586(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class297(arg0.field2465, var13, var12, var7);
    }

    @ObfuscatedName("kv.bu(IIIIIB)Ljava/util/List;")
    public List method5238(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field3082.values().iterator();
            while (var7.hasNext()) {
                class302 var8 = (class302) var7.next();
                if (var8.method5484() && var8.method5482(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field3080.iterator();
            while (var9.hasNext()) {
                class302 var10 = (class302) var9.next();
                if (var10.method5484() && var10.method5482(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("kv.bp(I)Ljava/util/List;")
    public List method5301() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field3080);
        var1.addAll(this.field3082.values());
        return var1;
    }

    @ObfuscatedName("kv.br(IIIII)V")
    public void method5332(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class559.method9131(this.field3079 * arg0, this.field3079 * (63 - arg1), this.field3079, arg3);
        }
        if (var5 == 1) {
            class559.method9129(this.field3079 * arg0, this.field3079 * (63 - arg1), this.field3079, arg3);
        }
        if (var5 == 2) {
            class559.method9131(this.field3079 * arg0 + this.field3079 - 1, this.field3079 * (63 - arg1), this.field3079, arg3);
        }
        if (var5 == 3) {
            class559.method9129(this.field3079 * arg0, this.field3079 * (63 - arg1) + this.field3079 - 1, this.field3079, arg3);
        }
    }
}
