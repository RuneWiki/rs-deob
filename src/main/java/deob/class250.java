package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("jr")
public class class250 {

    @ObfuscatedName("jr.au")
    public static class278 field2906 = new class278(37748736, 256);

    @ObfuscatedName("jr.ab")
    public int field2907;

    @ObfuscatedName("jr.aq")
    public int field2908;

    @ObfuscatedName("jr.al")
    public class244 field2909;

    @ObfuscatedName("jr.at")
    public LinkedList field2910;

    @ObfuscatedName("jr.aa")
    public int field2911;

    @ObfuscatedName("jr.ay")
    public int field2902;

    @ObfuscatedName("jr.ao")
    public List field2915;

    @ObfuscatedName("jr.ax")
    public HashMap field2914;

    @ObfuscatedName("jr.ai")
    public final HashMap field2905;

    @ObfuscatedName("er.af(IIII)J")
    public static long method2811(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("gz.an(IIII)Ltq;")
    public static class503 method3344(int arg0, int arg1, int arg2) {
        return (class503) field2906.method5084(method2811(arg0, arg1, arg2));
    }

    @ObfuscatedName("pr.aw(I)V")
    public static void method7140() {
        field2906.method5095();
    }

    public class250(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2907 = arg0;
        this.field2908 = arg1;
        this.field2910 = new LinkedList();
        this.field2915 = new LinkedList();
        this.field2914 = new HashMap();
        this.field2911 = arg2 | 0xFF000000;
        this.field2905 = arg3;
    }

    @ObfuscatedName("jr.ac(IIIB)V")
    public void method4759(int arg0, int arg1, int arg2) {
        class503 var4 = method3344(this.field2907, this.field2908, this.field2902);
        if (var4 == null) {
            return;
        }
        if (this.field2902 * 64 == arg2) {
            var4.method8688(arg0, arg1);
        } else {
            var4.method8709(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("jr.au(Ljm;Ljava/util/List;I)V")
    public void method4760(class244 arg0, List arg1) {
        this.field2914.clear();
        this.field2909 = arg0;
        this.method4765(arg1);
    }

    @ObfuscatedName("jr.ab(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4761(HashSet arg0, List arg1) {
        this.field2914.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class252 var4 = (class252) var3.next();
            if (var4.method4961() == this.field2907 && var4.method4962() == this.field2908) {
                this.field2910.add(var4);
            }
        }
        this.method4765(arg1);
    }

    @ObfuscatedName("jr.aq(IIIILjz;I)V")
    public void method4845(int arg0, int arg1, int arg2, int arg3, class258 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2995; var8++) {
                    class260[] var9 = arg4.field2998[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class260[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class201 var13;
                            boolean var18;
                            label58: {
                                class260 var12 = var10[var11];
                                var13 = Statics.method3057(var12.field3010);
                                if (var13.field2198 != null) {
                                    int[] var14 = var13.field2198;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class201 var17 = Statics.method3057(var16);
                                        if (var17.field2182 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field2182 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method4763(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jr.al(Lhq;IIILjz;I)V")
    public void method4763(class201 arg0, int arg1, int arg2, int arg3, class258 arg4) {
        class308 var6 = new class308(arg1, this.field2907 * 64 + arg2, this.field2908 * 64 + arg3);
        Object var7 = null;
        class308 var8;
        if (this.field2909 == null) {
            class252 var9 = (class252) arg4;
            var8 = new class308(var9.field2990 + arg1, var9.field2996 * 64 + arg2 + var9.method4910() * 8, var9.field3001 * 64 + arg3 + var9.method4911() * 8);
        } else {
            var8 = new class308(this.field2909.field2990 + arg1, this.field2909.field2996 * 64 + arg2, this.field2909.field3001 * 64 + arg3);
        }
        class267 var10;
        if (arg0.field2198 == null) {
            class183 var11 = class183.method6285(arg0.field2182);
            var10 = new class255(var8, var6, var11.field1917, this.method4788(var11));
        } else {
            var10 = new class247(var8, var6, arg0.field2186, this);
        }
        class183 var12 = class183.method6285(var10.method4662());
        if (var12.field1924) {
            this.field2914.put(new class308(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("jr.at(I)V")
    public void method4764() {
        Iterator var1 = this.field2914.values().iterator();
        while (var1.hasNext()) {
            class267 var2 = (class267) var1.next();
            if (var2 instanceof class247) {
                ((class247) var2).method4649();
            }
        }
    }

    @ObfuscatedName("jr.aa(Ljava/util/List;S)V")
    public void method4765(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class255 var3 = (class255) var2.next();
            if (class183.method6285(var3.field2956).field1924 && var3.field3050.field3486 >> 6 == this.field2907 && var3.field3050.field3488 >> 6 == this.field2908) {
                class255 var4 = new class255(var3.field3050, var3.field3050, var3.field2956, this.method4787(var3.field2956));
                this.field2915.add(var4);
            }
        }
    }

    @ObfuscatedName("jr.ay(I)V")
    public void method4766() {
        if (this.field2909 != null) {
            this.field2909.method4964();
            return;
        }
        Iterator var1 = this.field2910.iterator();
        while (var1.hasNext()) {
            class252 var2 = (class252) var1.next();
            var2.method4964();
        }
    }

    @ObfuscatedName("jr.ao(Lnm;S)Z")
    public boolean method4767(class344 arg0) {
        this.field2914.clear();
        if (this.field2909 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2910.iterator();
            while (var3.hasNext()) {
                class252 var4 = (class252) var3.next();
                var4.method4956(arg0);
                var2 &= var4.method4955();
            }
            if (var2) {
                Iterator var5 = this.field2910.iterator();
                while (var5.hasNext()) {
                    class252 var6 = (class252) var5.next();
                    this.method4845(var6.method4912() * 8, var6.method4914() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2909.method4956(arg0);
            if (this.field2909.method4955()) {
                this.method4845(0, 0, 64, 64, this.field2909);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("jr.ax(ILkj;[Ltc;Lnm;Lnm;I)V")
    public void method4798(int arg0, class271 arg1, class502[] arg2, class344 arg3, class344 arg4) {
        this.field2902 = arg0;
        if (this.field2909 == null && this.field2910.isEmpty() || method3344(this.field2907, this.field2908, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4767(arg3);
        int var8;
        if (this.field2909 == null) {
            var8 = ((class258) this.field2910.getFirst()).field2992;
        } else {
            var8 = this.field2909.field2992;
        }
        boolean var9 = var7 & arg4.method6125(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method6117(var8);
        class261 var11;
        if (var10 == null) {
            var11 = new class261();
        } else {
            var11 = new class261(class31.method5990(var10).field5089);
        }
        class503 var13 = new class503(this.field2902 * 64, this.field2902 * 64);
        var13.method8681();
        if (this.field2909 == null) {
            this.method4796(arg1, arg2, var11);
        } else {
            this.method4771(arg1, arg2, var11);
        }
        int var14 = this.field2907;
        int var15 = this.field2908;
        int var16 = this.field2902;
        field2906.method5087(var13, method2811(var14, var15, var16), var13.field5089.length * 4);
        this.method4766();
    }

    @ObfuscatedName("jr.ai(IIILjava/util/HashSet;B)V")
    public void method4769(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4779(arg0, arg1, arg3, arg2);
        this.method4832(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("jr.ag(Ljava/util/HashSet;III)V")
    public void method4770(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2914.values().iterator();
        while (var4.hasNext()) {
            class267 var5 = (class267) var4.next();
            if (var5.method5010()) {
                int var6 = var5.method4662();
                if (arg0.contains(var6)) {
                    class183 var7 = class183.method6285(var6);
                    this.method4780(var7, var5.field3051, var5.field3052, arg1, arg2);
                }
            }
        }
        this.method4758(arg0, arg1, arg2);
    }

    @ObfuscatedName("jr.ah(Lkj;[Ltc;Lkc;B)V")
    public void method4771(class271 arg0, class502[] arg1, class261 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4774(var4, var5, this.field2909, arg0, arg2);
                this.method4856(var4, var5, this.field2909, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4773(var6, var7, this.field2909, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("jr.av(Lkj;[Ltc;Lkc;I)V")
    public void method4796(class271 arg0, class502[] arg1, class261 arg2) {
        Iterator var4 = this.field2910.iterator();
        while (var4.hasNext()) {
            class252 var5 = (class252) var4.next();
            for (int var6 = var5.method4912() * 8; var6 < var5.method4912() * 8 + 8; var6++) {
                for (int var7 = var5.method4914() * 8; var7 < var5.method4914() * 8 + 8; var7++) {
                    this.method4774(var6, var7, var5, arg0, arg2);
                    this.method4856(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2910.iterator();
        while (var8.hasNext()) {
            class252 var9 = (class252) var8.next();
            for (int var10 = var9.method4912() * 8; var10 < var9.method4912() * 8 + 8; var10++) {
                for (int var11 = var9.method4914() * 8; var11 < var9.method4914() * 8 + 8; var11++) {
                    this.method4773(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("jr.ar(IILjz;Lkj;[Ltc;I)V")
    public void method4773(int arg0, int arg1, class258 arg2, class271 arg3, class502[] arg4) {
        this.method4778(arg0, arg1, arg2);
        this.method4827(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("jr.am(IILjz;Lkj;Lkc;I)V")
    public void method4774(int arg0, int arg1, class258 arg2, class271 arg3, class261 arg4) {
        int var6 = arg2.field2994[0][arg0][arg1] - 1;
        int var7 = arg2.field2987[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class499.method8603(this.field2902 * arg0, this.field2902 * (63 - arg1), this.field2902, this.field2902, this.field2911);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2911;
            class203 var10 = (class203) class203.field2271.method5119((long) var7);
            class203 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field2273.method6090(4, var7);
                class203 var13 = new class203();
                if (var12 != null) {
                    var13.method3788(new class489(var12), var7);
                }
                var13.method3787();
                class203.field2271.method5121(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field2272 >= 0) {
                int var16 = var11.field2274;
                int var17 = var11.field2285;
                int var18 = var11.field2282;
                if (var18 > 179) {
                    var17 /= 2;
                }
                if (var18 > 192) {
                    var17 /= 2;
                }
                if (var18 > 217) {
                    var17 /= 2;
                }
                if (var18 > 243) {
                    var17 /= 2;
                }
                int var19 = var18 / 2 + (var16 / 4 << 10) + (var17 / 32 << 7);
                int var22 = class265.method2522(var19, 96);
                var15 = class219.field2517[var22] | 0xFF000000;
            } else if (var11.field2281 >= 0) {
                int var23 = class265.method2522(class219.field2515.field2795.method4359(var11.field2281), 96);
                var15 = class219.field2517[var23] | 0xFF000000;
            } else if (var11.field2283 == 16711935) {
                var15 = var9;
            } else {
                int var24 = var11.field2277;
                int var25 = var11.field2278;
                int var26 = var11.field2279;
                if (var26 > 179) {
                    var25 /= 2;
                }
                if (var26 > 192) {
                    var25 /= 2;
                }
                if (var26 > 217) {
                    var25 /= 2;
                }
                if (var26 > 243) {
                    var25 /= 2;
                }
                int var27 = var26 / 2 + (var24 / 4 << 10) + (var25 / 32 << 7);
                int var30 = class265.method2522(var27, 96);
                var15 = class219.field2517[var30] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field2991[0][arg0][arg1] == 0) {
            class499.method8603(this.field2902 * arg0, this.field2902 * (63 - arg1), this.field2902, this.field2902, var8);
            return;
        }
        int var31 = this.method4776(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class499.method8603(this.field2902 * arg0, this.field2902 * (63 - arg1), this.field2902, this.field2902, var31);
        } else {
            arg3.method5030(this.field2902 * arg0, this.field2902 * (63 - arg1), var31, var8, this.field2902, this.field2902, arg2.field2991[0][arg0][arg1], arg2.field2997[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("jr.as(IILjz;Lkj;I)V")
    public void method4856(int arg0, int arg1, class258 arg2, class271 arg3) {
        for (int var5 = 1; var5 < arg2.field2995; var5++) {
            int var6 = arg2.field2987[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2911;
                class203 var8 = (class203) class203.field2271.method5119((long) var6);
                class203 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field2273.method6090(4, var6);
                    class203 var11 = new class203();
                    if (var10 != null) {
                        var11.method3788(new class489(var10), var6);
                    }
                    var11.method3787();
                    class203.field2271.method5121(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field2272 >= 0) {
                    int var14 = var9.field2274;
                    int var15 = var9.field2285;
                    int var16 = var9.field2282;
                    if (var16 > 179) {
                        var15 /= 2;
                    }
                    if (var16 > 192) {
                        var15 /= 2;
                    }
                    if (var16 > 217) {
                        var15 /= 2;
                    }
                    if (var16 > 243) {
                        var15 /= 2;
                    }
                    int var17 = var16 / 2 + (var14 / 4 << 10) + (var15 / 32 << 7);
                    int var20 = class265.method2522(var17, 96);
                    var13 = class219.field2517[var20] | 0xFF000000;
                } else if (var9.field2281 >= 0) {
                    int var21 = class265.method2522(class219.field2515.field2795.method4359(var9.field2281), 96);
                    var13 = class219.field2517[var21] | 0xFF000000;
                } else if (var9.field2283 == 16711935) {
                    var13 = var7;
                } else {
                    int var22 = var9.field2277;
                    int var23 = var9.field2278;
                    int var24 = var9.field2279;
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
                    int var28 = class265.method2522(var25, 96);
                    var13 = class219.field2517[var28] | 0xFF000000;
                }
                if (arg2.field2991[var5][arg0][arg1] == 0) {
                    class499.method8603(this.field2902 * arg0, this.field2902 * (63 - arg1), this.field2902, this.field2902, var13);
                } else {
                    arg3.method5030(this.field2902 * arg0, this.field2902 * (63 - arg1), 0, var13, this.field2902, this.field2902, arg2.field2991[var5][arg0][arg1], arg2.field2997[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("jr.aj(IILjz;Lkc;I)I")
    public int method4776(int arg0, int arg1, class258 arg2, class261 arg3) {
        return arg2.field2994[0][arg0][arg1] == 0 ? this.field2911 : arg3.method4992(arg0, arg1);
    }

    @ObfuscatedName("jr.ak(IILjz;[Ltc;I)V")
    public void method4827(int arg0, int arg1, class258 arg2, class502[] arg3) {
        for (int var5 = 0; var5 < arg2.field2995; var5++) {
            class260[] var6 = arg2.field2998[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class260[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class260 var9 = var7[var8];
                    if (!class326.method3955(var9.field3009)) {
                        int var10 = var9.field3009;
                        boolean var11 = class326.field3771.field3772 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class201 var12 = Statics.method3057(var9.field3010);
                    if (var12.field2197 != -1) {
                        if (var12.field2197 == 46 || var12.field2197 == 52) {
                            arg3[var12.field2197].method8667(this.field2902 * arg0, this.field2902 * (63 - arg1), this.field2902 * 2 + 1, this.field2902 * 2 + 1);
                        } else {
                            arg3[var12.field2197].method8667(this.field2902 * arg0, this.field2902 * (63 - arg1), this.field2902 * 2, this.field2902 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jr.az(IILjz;I)V")
    public void method4778(int arg0, int arg1, class258 arg2) {
        for (int var4 = 0; var4 < arg2.field2995; var4++) {
            class260[] var5 = arg2.field2998[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class260[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class260 var8 = var6[var7];
                    int var9 = var8.field3009;
                    boolean var10 = var9 >= class326.field3752.field3772 && var9 <= class326.field3755.field3772 || class326.field3753.field3772 == var9;
                    if (var10) {
                        class201 var11 = Statics.method3057(var8.field3010);
                        int var12 = var11.field2176 == 0 ? -3355444 : -3407872;
                        if (class326.field3752.field3772 == var8.field3009) {
                            this.method4782(arg0, arg1, var8.field3008, var12);
                        }
                        if (class326.field3751.field3772 == var8.field3009) {
                            this.method4782(arg0, arg1, var8.field3008, -3355444);
                            this.method4782(arg0, arg1, var8.field3008 + 1, var12);
                        }
                        if (class326.field3755.field3772 == var8.field3009) {
                            if (var8.field3008 == 0) {
                                class499.method8586(this.field2902 * arg0, this.field2902 * (63 - arg1), 1, var12);
                            }
                            if (var8.field3008 == 1) {
                                class499.method8586(this.field2902 * arg0 + this.field2902 - 1, this.field2902 * (63 - arg1), 1, var12);
                            }
                            if (var8.field3008 == 2) {
                                class499.method8586(this.field2902 * arg0 + this.field2902 - 1, this.field2902 * (63 - arg1) + this.field2902 - 1, 1, var12);
                            }
                            if (var8.field3008 == 3) {
                                class499.method8586(this.field2902 * arg0, this.field2902 * (63 - arg1) + this.field2902 - 1, 1, var12);
                            }
                        }
                        if (class326.field3753.field3772 == var8.field3009) {
                            int var13 = var8.field3008 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2902; var14++) {
                                    class499.method8586(this.field2902 * arg0 + var14, this.field2902 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2902; var15++) {
                                    class499.method8586(this.field2902 * arg0 + var15, this.field2902 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jr.ad(IILjava/util/HashSet;II)V")
    public void method4779(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2914.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class308 var9 = (class308) var8.getKey();
            int var10 = (int) ((float) var9.field3486 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3488 * var5 - var6);
            class267 var12 = (class267) var8.getValue();
            if (var12 != null && var12.method5010()) {
                var12.field3051 = var10;
                var12.field3052 = var11;
                class183 var13 = class183.method6285(var12.method4662());
                if (!arg2.contains(var13.method3351())) {
                    this.method4781(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("jr.ae(Ljava/util/HashSet;IIS)V")
    public void method4758(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2915.iterator();
        while (var4.hasNext()) {
            class267 var5 = (class267) var4.next();
            if (var5.method5010()) {
                class183 var6 = class183.method6285(var5.method4662());
                if (var6 != null && arg0.contains(var6.method3351())) {
                    this.method4780(var6, var5.field3051, var5.field3052, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("jr.ap(Lhw;IIIII)V")
    public void method4780(class183 arg0, int arg1, int arg2, int arg3, int arg4) {
        class503 var6 = arg0.method3350(false);
        if (var6 == null) {
            return;
        }
        var6.method8690(arg1 - var6.field5088 / 2, arg2 - var6.field5093 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class499.method8578(arg1, arg2, 15, 16776960, 128);
            class499.method8578(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("jr.by(Lkg;IIFB)V")
    public void method4781(class267 arg0, int arg1, int arg2, float arg3) {
        class183 var5 = class183.method6285(arg0.method4662());
        this.method4815(var5, arg1, arg2);
        this.method4786(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("jr.bb(Lhw;IIB)V")
    public void method4815(class183 arg0, int arg1, int arg2) {
        class503 var4 = arg0.method3350(false);
        if (var4 != null) {
            int var5 = this.method4799(var4, arg0.field1933);
            int var6 = this.method4775(var4, arg0.field1927);
            var4.method8690(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("jr.bi(Lkg;Lhw;IIFB)V")
    public void method4786(class267 arg0, class183 arg1, int arg2, int arg3, float arg4) {
        class262 var6 = arg0.method4651();
        if (var6 != null && var6.field3022.method4640(arg4)) {
            class379 var7 = (class379) this.field2905.get(var6.field3022);
            var7.method6771(var6.field3021, arg2 - var6.field3024 / 2, arg3, var6.field3024, var6.field3023, 0xFF000000 | arg1.field1918, 0, 1, 0, var7.field4439 / 2);
        }
    }

    @ObfuscatedName("jr.be(IILjava/util/HashSet;II)V")
    public void method4832(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2915.iterator();
        while (var6.hasNext()) {
            class267 var7 = (class267) var6.next();
            if (var7.method5010()) {
                int var8 = var7.field3050.field3486 % 64;
                int var9 = var7.field3050.field3488 % 64;
                var7.field3051 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3052 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4662())) {
                    this.method4781(var7, var7.field3051, var7.field3052, var5);
                }
            }
        }
    }

    @ObfuscatedName("jr.bk(Ltq;Lhd;B)I")
    public int method4799(class503 arg0, class189 arg1) {
        switch(arg1.field1994) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5088 / 2;
            default:
                return -arg0.field5088;
        }
    }

    @ObfuscatedName("jr.bx(Ltq;Lhn;I)I")
    public int method4775(class503 arg0, class192 arg1) {
        switch(arg1.field2056) {
            case 1:
                return -arg0.field5093 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field5093;
        }
    }

    @ObfuscatedName("jr.bo(II)Lku;")
    public class262 method4787(int arg0) {
        class183 var2 = class183.method6285(arg0);
        return this.method4788(var2);
    }

    @ObfuscatedName("jr.bz(Lhw;I)Lku;")
    public class262 method4788(class183 arg0) {
        if (arg0.field1920 == null || this.field2905 == null || this.field2905.get(class246.field2860) == null) {
            return null;
        }
        class246 var2 = class246.method4641(arg0.field1922);
        if (var2 == null) {
            return null;
        }
        class379 var3 = (class379) this.field2905.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method6808(arg0.field1920, 1000000);
        String[] var5 = new String[var4];
        var3.method6801(arg0.field1920, (int[]) null, var5);
        int var6 = var5.length * var3.field4439 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method6761(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class262(arg0.field1920, var7, var6, var2);
    }

    @ObfuscatedName("jr.bm(IIIIIB)Ljava/util/List;")
    public List method4858(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2914.values().iterator();
            while (var7.hasNext()) {
                class267 var8 = (class267) var7.next();
                if (var8.method5010() && var8.method5009(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2915.iterator();
            while (var9.hasNext()) {
                class267 var10 = (class267) var9.next();
                if (var10.method5010() && var10.method5009(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("jr.bd(B)Ljava/util/List;")
    public List method4790() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2915);
        var1.addAll(this.field2914.values());
        return var1;
    }

    @ObfuscatedName("jr.bt(IIIIB)V")
    public void method4782(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class499.method8625(this.field2902 * arg0, this.field2902 * (63 - arg1), this.field2902, arg3);
        }
        if (var5 == 1) {
            class499.method8586(this.field2902 * arg0, this.field2902 * (63 - arg1), this.field2902, arg3);
        }
        if (var5 == 2) {
            class499.method8625(this.field2902 * arg0 + this.field2902 - 1, this.field2902 * (63 - arg1), this.field2902, arg3);
        }
        if (var5 == 3) {
            class499.method8586(this.field2902 * arg0, this.field2902 * (63 - arg1) + this.field2902 - 1, this.field2902, arg3);
        }
    }
}
