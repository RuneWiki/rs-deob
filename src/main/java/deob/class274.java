package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("kr")
public class class274 {

    @ObfuscatedName("kr.an")
    public static class302 field3006 = new class302(37748736, 256);

    @ObfuscatedName("kr.ao")
    public int field3003;

    @ObfuscatedName("kr.ab")
    public int field3008;

    @ObfuscatedName("kr.aw")
    public class268 field3009;

    @ObfuscatedName("kr.ad")
    public LinkedList field3007;

    @ObfuscatedName("kr.al")
    public int field3005;

    @ObfuscatedName("kr.as")
    public int field3012;

    @ObfuscatedName("kr.ag")
    public List field3013;

    @ObfuscatedName("kr.ai")
    public HashMap field3014;

    @ObfuscatedName("kr.ax")
    public final HashMap field3010;

    @ObfuscatedName("fr.az(IIII)Lvg;")
    public static class549 method2987(int arg0, int arg1, int arg2) {
        class302 var3 = field3006;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class549) var3.method5301(var4);
    }

    @ObfuscatedName("ip.ah(Lvg;IIII)V")
    public static void method3967(class549 arg0, int arg1, int arg2, int arg3) {
        class302 var4 = field3006;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method5307(arg0, var6, arg0.field5336.length * 4);
    }

    @ObfuscatedName("gw.af(I)V")
    public static void method3091() {
        field3006.method5306(5);
    }

    public class274(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field3003 = arg0;
        this.field3008 = arg1;
        this.field3007 = new LinkedList();
        this.field3013 = new LinkedList();
        this.field3014 = new HashMap();
        this.field3005 = arg2 | 0xFF000000;
        this.field3010 = arg3;
    }

    @ObfuscatedName("kr.at(IIII)V")
    public void method4964(int arg0, int arg1, int arg2) {
        class549 var4 = method2987(this.field3003, this.field3008, this.field3012);
        if (var4 == null) {
            return;
        }
        if (this.field3012 * 64 == arg2) {
            var4.method8898(arg0, arg1);
        } else {
            var4.method8921(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("kr.an(Lka;Ljava/util/List;I)V")
    public void method4965(class268 arg0, List arg1) {
        this.field3014.clear();
        this.field3009 = arg0;
        this.method5018(arg1);
    }

    @ObfuscatedName("kr.ao(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method4966(HashSet arg0, List arg1) {
        this.field3014.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class276 var4 = (class276) var3.next();
            if (var4.method5179() == this.field3003 && var4.method5180() == this.field3008) {
                this.field3007.add(var4);
            }
        }
        this.method5018(arg1);
    }

    @ObfuscatedName("kr.ab(IIIILkl;I)V")
    public void method5009(int arg0, int arg1, int arg2, int arg3, class282 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field3096; var8++) {
                    class284[] var9 = arg4.field3097[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class284[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class284 var12 = var10[var11];
                            class222 var13 = class222.method2212(var12.field3117);
                            if (method2178(var13)) {
                                this.method4968(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kr.aw(Lis;IIILkl;I)V")
    public void method4968(class222 arg0, int arg1, int arg2, int arg3, class282 arg4) {
        class339 var6 = new class339(arg1, this.field3003 * 64 + arg2, this.field3008 * 64 + arg3);
        Object var7 = null;
        class339 var8;
        if (this.field3009 == null) {
            class276 var9 = (class276) arg4;
            var8 = new class339(var9.field3095 + arg1, var9.field3103 * 64 + arg2 + var9.method5141() * 8, var9.field3104 * 64 + arg3 + var9.method5124() * 8);
        } else {
            var8 = new class339(this.field3009.field3095 + arg1, this.field3009.field3103 * 64 + arg2, this.field3009.field3104 * 64 + arg3);
        }
        class291 var10;
        if (arg0.field2290 == null) {
            class197 var11 = class197.method5698(arg0.field2283);
            var10 = new class279(var8, var6, var11.field2006, this.method4994(var11));
        } else {
            var10 = new class271(var8, var6, arg0.field2254, this);
        }
        class197 var12 = class197.method5698(var10.method4842());
        if (var12.field2005) {
            this.field3014.put(new class339(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("kr.ad(I)V")
    public void method4969() {
        Iterator var1 = this.field3014.values().iterator();
        while (var1.hasNext()) {
            class291 var2 = (class291) var1.next();
            if (var2 instanceof class271) {
                ((class271) var2).method4840();
            }
        }
    }

    @ObfuscatedName("kr.al(Ljava/util/List;I)V")
    public void method5018(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class279 var3 = (class279) var2.next();
            if (class197.method5698(var3.field3057).field2005 && var3.field3149.field3638 >> 6 == this.field3003 && var3.field3149.field3640 >> 6 == this.field3008) {
                class279 var4 = new class279(var3.field3149, var3.field3149, var3.field3057, this.method4993(var3.field3057));
                this.field3013.add(var4);
            }
        }
    }

    @ObfuscatedName("kr.as(I)V")
    public void method4971() {
        if (this.field3009 != null) {
            this.field3009.method5175();
            return;
        }
        Iterator var1 = this.field3007.iterator();
        while (var1.hasNext()) {
            class276 var2 = (class276) var1.next();
            var2.method5175();
        }
    }

    @ObfuscatedName("kr.ag(Loc;I)Z")
    public boolean method4972(class379 arg0) {
        this.field3014.clear();
        if (this.field3009 == null) {
            boolean var2 = true;
            Iterator var3 = this.field3007.iterator();
            while (var3.hasNext()) {
                class276 var4 = (class276) var3.next();
                var4.method5190(arg0);
                var2 &= var4.method5187();
            }
            if (var2) {
                Iterator var5 = this.field3007.iterator();
                while (var5.hasNext()) {
                    class276 var6 = (class276) var5.next();
                    this.method5009(var6.method5125() * 8, var6.method5140() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field3009.method5190(arg0);
            if (this.field3009.method5187()) {
                this.method5009(0, 0, 64, 64, this.field3009);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("kr.ai(ILlq;[Lvl;Loc;Loc;I)V")
    public void method4973(int arg0, class295 arg1, class548[] arg2, class379 arg3, class379 arg4) {
        this.field3012 = arg0;
        if (this.field3009 == null && this.field3007.isEmpty() || method2987(this.field3003, this.field3008, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4972(arg3);
        int var8;
        if (this.field3009 == null) {
            var8 = ((class282) this.field3007.getFirst()).field3100;
        } else {
            var8 = this.field3009.field3100;
        }
        boolean var9 = var7 & arg4.method6332(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method6335(var8);
        class285 var11;
        if (var10 == null) {
            var11 = new class285();
        } else {
            var11 = new class285(class31.method6516(var10).field5336);
        }
        class549 var13 = new class549(this.field3012 * 64, this.field3012 * 64);
        var13.method8891();
        if (this.field3009 == null) {
            this.method5001(arg1, arg2, var11);
        } else {
            this.method4976(arg1, arg2, var11);
        }
        method3967(var13, this.field3003, this.field3008, this.field3012);
        this.method4971();
    }

    @ObfuscatedName("kr.ax(IIILjava/util/HashSet;I)V")
    public void method5011(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4984(arg0, arg1, arg3, arg2);
        this.method4990(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("kr.ar(Ljava/util/HashSet;IIB)V")
    public void method5073(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3014.values().iterator();
        while (var4.hasNext()) {
            class291 var5 = (class291) var4.next();
            if (var5.method5220()) {
                int var6 = var5.method4842();
                if (arg0.contains(var6)) {
                    class197 var7 = class197.method5698(var6);
                    this.method4986(var7, var5.field3150, var5.field3151, arg1, arg2);
                }
            }
        }
        this.method4985(arg0, arg1, arg2);
    }

    @ObfuscatedName("kr.aj(Llq;[Lvl;Lkw;I)V")
    public void method4976(class295 arg0, class548[] arg1, class285 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4979(var4, var5, this.field3009, arg0, arg2);
                this.method4980(var4, var5, this.field3009, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4978(var6, var7, this.field3009, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("kr.au(Llq;[Lvl;Lkw;B)V")
    public void method5001(class295 arg0, class548[] arg1, class285 arg2) {
        Iterator var4 = this.field3007.iterator();
        while (var4.hasNext()) {
            class276 var5 = (class276) var4.next();
            for (int var6 = var5.method5125() * 8; var6 < var5.method5125() * 8 + 8; var6++) {
                for (int var7 = var5.method5140() * 8; var7 < var5.method5140() * 8 + 8; var7++) {
                    this.method4979(var6, var7, var5, arg0, arg2);
                    this.method4980(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field3007.iterator();
        while (var8.hasNext()) {
            class276 var9 = (class276) var8.next();
            for (int var10 = var9.method5125() * 8; var10 < var9.method5125() * 8 + 8; var10++) {
                for (int var11 = var9.method5140() * 8; var11 < var9.method5140() * 8 + 8; var11++) {
                    this.method4978(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("kr.ay(IILkl;Llq;[Lvl;B)V")
    public void method4978(int arg0, int arg1, class282 arg2, class295 arg3, class548[] arg4) {
        this.method5058(arg0, arg1, arg2);
        this.method5049(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("kr.ap(IILkl;Llq;Lkw;I)V")
    public void method4979(int arg0, int arg1, class282 arg2, class295 arg3, class285 arg4) {
        int var6 = arg2.field3099[0][arg0][arg1] - 1;
        int var7 = arg2.field3092[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class545.method8784(this.field3012 * arg0, this.field3012 * (63 - arg1), this.field3012, this.field3012, this.field3005);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field3005;
            class224 var10 = (class224) class224.field2362.method5336((long) var7);
            class224 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field2373.method6328(4, var7);
                class224 var13 = new class224();
                if (var12 != null) {
                    var13.method3879(new class535(var12), var7);
                }
                var13.method3891();
                class224.field2362.method5346(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field2371 >= 0) {
                int var16 = var11.field2370;
                int var17 = var11.field2361;
                int var18 = var11.field2366;
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
                int var22 = class289.method3707(var19, 96);
                var15 = class243.field2611[var22] | 0xFF000000;
            } else if (var11.field2364 >= 0) {
                int var23 = class289.method3707(class243.field2612.field2901.method4535(var11.field2364), 96);
                var15 = class243.field2611[var23] | 0xFF000000;
            } else if (var11.field2369 == 16711935) {
                var15 = var9;
            } else {
                int var24 = var11.field2367;
                int var25 = var11.field2368;
                int var26 = var11.field2365;
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
                int var30 = class289.method3707(var27, 96);
                var15 = class243.field2611[var30] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field3101[0][arg0][arg1] == 0) {
            class545.method8784(this.field3012 * arg0, this.field3012 * (63 - arg1), this.field3012, this.field3012, var8);
            return;
        }
        int var31 = this.method4981(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class545.method8784(this.field3012 * arg0, this.field3012 * (63 - arg1), this.field3012, this.field3012, var31);
        } else {
            arg3.method5244(this.field3012 * arg0, this.field3012 * (63 - arg1), var31, var8, this.field3012, this.field3012, arg2.field3101[0][arg0][arg1], arg2.field3102[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("kr.av(IILkl;Llq;B)V")
    public void method4980(int arg0, int arg1, class282 arg2, class295 arg3) {
        for (int var5 = 1; var5 < arg2.field3096; var5++) {
            int var6 = arg2.field3092[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field3005;
                class224 var8 = (class224) class224.field2362.method5336((long) var6);
                class224 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field2373.method6328(4, var6);
                    class224 var11 = new class224();
                    if (var10 != null) {
                        var11.method3879(new class535(var10), var6);
                    }
                    var11.method3891();
                    class224.field2362.method5346(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field2371 >= 0) {
                    int var14 = var9.field2370;
                    int var15 = var9.field2361;
                    int var16 = var9.field2366;
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
                    int var20 = class289.method3707(var17, 96);
                    var13 = class243.field2611[var20] | 0xFF000000;
                } else if (var9.field2364 >= 0) {
                    int var21 = class289.method3707(class243.field2612.field2901.method4535(var9.field2364), 96);
                    var13 = class243.field2611[var21] | 0xFF000000;
                } else if (var9.field2369 == 16711935) {
                    var13 = var7;
                } else {
                    int var22 = var9.field2367;
                    int var23 = var9.field2368;
                    int var24 = var9.field2365;
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
                    int var28 = class289.method3707(var25, 96);
                    var13 = class243.field2611[var28] | 0xFF000000;
                }
                if (arg2.field3101[var5][arg0][arg1] == 0) {
                    class545.method8784(this.field3012 * arg0, this.field3012 * (63 - arg1), this.field3012, this.field3012, var13);
                } else {
                    arg3.method5244(this.field3012 * arg0, this.field3012 * (63 - arg1), 0, var13, this.field3012, this.field3012, arg2.field3101[var5][arg0][arg1], arg2.field3102[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("kr.aa(IILkl;Lkw;I)I")
    public int method4981(int arg0, int arg1, class282 arg2, class285 arg3) {
        return arg2.field3099[0][arg0][arg1] == 0 ? this.field3005 : arg3.method5206(arg0, arg1);
    }

    @ObfuscatedName("kr.aq(IILkl;[Lvl;I)V")
    public void method5049(int arg0, int arg1, class282 arg2, class548[] arg3) {
        for (int var5 = 0; var5 < arg2.field3096; var5++) {
            class284[] var6 = arg2.field3097[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class284[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class284 var9 = var7[var8];
                    if (!class359.method1709(var9.field3118)) {
                        int var10 = var9.field3118;
                        boolean var11 = class359.field3924.field3947 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class222 var12 = class222.method2212(var9.field3117);
                    if (var12.field2276 != -1) {
                        if (var12.field2276 == 46 || var12.field2276 == 52) {
                            arg3[var12.field2276].method8871(this.field3012 * arg0, this.field3012 * (63 - arg1), this.field3012 * 2 + 1, this.field3012 * 2 + 1);
                        } else {
                            arg3[var12.field2276].method8871(this.field3012 * arg0, this.field3012 * (63 - arg1), this.field3012 * 2, this.field3012 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kr.am(IILkl;I)V")
    public void method5058(int arg0, int arg1, class282 arg2) {
        for (int var4 = 0; var4 < arg2.field3096; var4++) {
            class284[] var5 = arg2.field3097[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class284[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class284 var8 = var6[var7];
                    if (class359.method5381(var8.field3118)) {
                        class222 var9 = class222.method2212(var8.field3117);
                        int var10 = var9.field2266 == 0 ? -3355444 : -3407872;
                        if (class359.field3928.field3947 == var8.field3118) {
                            this.method4997(arg0, arg1, var8.field3116, var10);
                        }
                        if (class359.field3926.field3947 == var8.field3118) {
                            this.method4997(arg0, arg1, var8.field3116, -3355444);
                            this.method4997(arg0, arg1, var8.field3116 + 1, var10);
                        }
                        if (class359.field3940.field3947 == var8.field3118) {
                            if (var8.field3116 == 0) {
                                class545.method8773(this.field3012 * arg0, this.field3012 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3116 == 1) {
                                class545.method8773(this.field3012 * arg0 + this.field3012 - 1, this.field3012 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3116 == 2) {
                                class545.method8773(this.field3012 * arg0 + this.field3012 - 1, this.field3012 * (63 - arg1) + this.field3012 - 1, 1, var10);
                            }
                            if (var8.field3116 == 3) {
                                class545.method8773(this.field3012 * arg0, this.field3012 * (63 - arg1) + this.field3012 - 1, 1, var10);
                            }
                        }
                        if (class359.field3943.field3947 == var8.field3118) {
                            int var11 = var8.field3116 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field3012; var12++) {
                                    class545.method8773(this.field3012 * arg0 + var12, this.field3012 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field3012; var13++) {
                                    class545.method8773(this.field3012 * arg0 + var13, this.field3012 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kr.ac(IILjava/util/HashSet;II)V")
    public void method4984(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field3014.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class339 var9 = (class339) var8.getKey();
            int var10 = (int) ((float) var9.field3638 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3640 * var5 - var6);
            class291 var12 = (class291) var8.getValue();
            if (var12 != null && var12.method5220()) {
                var12.field3150 = var10;
                var12.field3151 = var11;
                class197 var13 = class197.method5698(var12.method4842());
                if (!arg2.contains(var13.method3424())) {
                    this.method5024(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("kr.ae(Ljava/util/HashSet;III)V")
    public void method4985(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3013.iterator();
        while (var4.hasNext()) {
            class291 var5 = (class291) var4.next();
            if (var5.method5220()) {
                class197 var6 = class197.method5698(var5.method4842());
                if (var6 != null && arg0.contains(var6.method3424())) {
                    this.method4986(var6, var5.field3150, var5.field3151, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("kr.ak(Lhw;IIIIB)V")
    public void method4986(class197 arg0, int arg1, int arg2, int arg3, int arg4) {
        class549 var6 = arg0.method3426(false);
        if (var6 == null) {
            return;
        }
        var6.method8900(arg1 - var6.field5330 / 2, arg2 - var6.field5331 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class545.method8781(arg1, arg2, 15, 16776960, 128);
            class545.method8781(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("kr.bp(Llh;IIFI)V")
    public void method5024(class291 arg0, int arg1, int arg2, float arg3) {
        class197 var5 = class197.method5698(arg0.method4842());
        this.method4988(var5, arg1, arg2);
        this.method4989(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("kr.bz(Lhw;III)V")
    public void method4988(class197 arg0, int arg1, int arg2) {
        class549 var4 = arg0.method3426(false);
        if (var4 != null) {
            int var5 = this.method5070(var4, arg0.field2021);
            int var6 = this.method4992(var4, arg0.field2022);
            var4.method8900(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("kr.bc(Llh;Lhw;IIFI)V")
    public void method4989(class291 arg0, class197 arg1, int arg2, int arg3, float arg4) {
        class286 var6 = arg0.method4839();
        if (var6 != null && var6.field3122.method4830(arg4)) {
            class414 var7 = (class414) this.field3010.get(var6.field3122);
            var7.method7021(var6.field3125, arg2 - var6.field3123 / 2, arg3, var6.field3123, var6.field3124, 0xFF000000 | arg1.field2012, 0, 1, 0, var7.field4617 / 2);
        }
    }

    @ObfuscatedName("kr.bf(IILjava/util/HashSet;IB)V")
    public void method4990(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field3013.iterator();
        while (var6.hasNext()) {
            class291 var7 = (class291) var6.next();
            if (var7.method5220()) {
                int var8 = var7.field3149.field3638 % 64;
                int var9 = var7.field3149.field3640 % 64;
                var7.field3150 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3151 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4842())) {
                    this.method5024(var7, var7.field3150, var7.field3151, var5);
                }
            }
        }
    }

    @ObfuscatedName("kr.be(Lvg;Lhn;I)I")
    public int method5070(class549 arg0, class206 arg1) {
        switch(arg1.field2089) {
            case 1:
                return 0;
            case 2:
                return -arg0.field5330 / 2;
            default:
                return -arg0.field5330;
        }
    }

    @ObfuscatedName("kr.bn(Lvg;Lif;I)I")
    public int method4992(class549 arg0, class210 arg1) {
        switch(arg1.field2154) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5331 / 2;
            default:
                return -arg0.field5331;
        }
    }

    @ObfuscatedName("da.bd(Lis;B)Z")
    public static boolean method2178(class222 arg0) {
        if (arg0.field2290 != null) {
            int[] var1 = arg0.field2290;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class222 var4 = class222.method2212(var3);
                if (var4.field2283 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2283 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("kr.bo(II)Lkz;")
    public class286 method4993(int arg0) {
        class197 var2 = class197.method5698(arg0);
        return this.method4994(var2);
    }

    @ObfuscatedName("kr.bx(Lhw;I)Lkz;")
    public class286 method4994(class197 arg0) {
        if (arg0.field2009 == null || this.field3010 == null || this.field3010.get(class270.field2965) == null) {
            return null;
        }
        int var2 = arg0.field2011;
        class270[] var3 = class270.method4834();
        int var4 = 0;
        class270 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class270 var5 = var3[var4];
            if (var5.field2962 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class414 var8 = (class414) this.field3010.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method7032(arg0.field2009, 1000000);
        String[] var10 = new String[var9];
        var8.method7012(arg0.field2009, (int[]) null, var10);
        int var11 = var10.length * var8.field4617 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method7062(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class286(arg0.field2009, var12, var11, var6);
    }

    @ObfuscatedName("kr.bl(IIIIII)Ljava/util/List;")
    public List method4995(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field3014.values().iterator();
            while (var7.hasNext()) {
                class291 var8 = (class291) var7.next();
                if (var8.method5220() && var8.method5219(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field3013.iterator();
            while (var9.hasNext()) {
                class291 var10 = (class291) var9.next();
                if (var10.method5220() && var10.method5219(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("kr.bh(I)Ljava/util/List;")
    public List method4996() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field3013);
        var1.addAll(this.field3014.values());
        return var1;
    }

    @ObfuscatedName("kr.bs(IIIII)V")
    public void method4997(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class545.method8817(this.field3012 * arg0, this.field3012 * (63 - arg1), this.field3012, arg3);
        }
        if (var5 == 1) {
            class545.method8773(this.field3012 * arg0, this.field3012 * (63 - arg1), this.field3012, arg3);
        }
        if (var5 == 2) {
            class545.method8817(this.field3012 * arg0 + this.field3012 - 1, this.field3012 * (63 - arg1), this.field3012, arg3);
        }
        if (var5 == 3) {
            class545.method8773(this.field3012 * arg0, this.field3012 * (63 - arg1) + this.field3012 - 1, this.field3012, arg3);
        }
    }
}
