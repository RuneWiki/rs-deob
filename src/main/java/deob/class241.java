package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("jt")
public class class241 {

    @ObfuscatedName("jt.aq")
    public static class300 field2535 = new class300(37748736, 256);

    @ObfuscatedName("jt.ar")
    public int field2526;

    @ObfuscatedName("jt.ag")
    public int field2525;

    @ObfuscatedName("jt.ao")
    public class235 field2528;

    @ObfuscatedName("jt.ae")
    public LinkedList field2529;

    @ObfuscatedName("jt.aa")
    public int field2522;

    @ObfuscatedName("jt.au")
    public int field2531;

    @ObfuscatedName("jt.an")
    public List field2527;

    @ObfuscatedName("jt.ad")
    public HashMap field2530;

    @ObfuscatedName("jt.ax")
    public final HashMap field2534;

    @ObfuscatedName("bw.am(IIII)J")
    public static long method844(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("qf.ap(Luc;IIIB)V")
    public static void method7369(class545 arg0, int arg1, int arg2, int arg3) {
        field2535.method5360(arg0, method844(arg1, arg2, arg3), arg0.field5281.length * 4);
    }

    @ObfuscatedName("ie.af(I)V")
    public static void method3939() {
        field2535.method5367();
    }

    public class241(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2526 = arg0;
        this.field2525 = arg1;
        this.field2529 = new LinkedList();
        this.field2527 = new LinkedList();
        this.field2530 = new HashMap();
        this.field2522 = arg2 | 0xFF000000;
        this.field2534 = arg3;
    }

    @ObfuscatedName("jt.aj(IIIS)V")
    public void method4343(int arg0, int arg1, int arg2) {
        int var4 = this.field2526;
        int var5 = this.field2525;
        int var6 = this.field2531;
        class545 var7 = (class545) field2535.method5361(method844(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field2531 * 64 == arg2) {
            var7.method9080(arg0, arg1);
        } else {
            var7.method9016(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("jt.aq(Ljh;Ljava/util/List;I)V")
    public void method4378(class235 arg0, List arg1) {
        this.field2530.clear();
        this.field2528 = arg0;
        this.method4349(arg1);
    }

    @ObfuscatedName("jt.ar(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4345(HashSet arg0, List arg1) {
        this.field2530.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class243 var4 = (class243) var3.next();
            if (var4.method4567() == this.field2526 && var4.method4547() == this.field2525) {
                this.field2529.add(var4);
            }
        }
        this.method4349(arg1);
    }

    @ObfuscatedName("jt.ag(IIIILjw;B)V")
    public void method4376(int arg0, int arg1, int arg2, int arg3, class249 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2611; var8++) {
                    class251[] var9 = arg4.field2620[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class251[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class251 var12 = var10[var11];
                            class202 var13 = class202.method3023(var12.field2631);
                            if (method3109(var13)) {
                                this.method4347(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jt.ao(Lhg;IIILjw;I)V")
    public void method4347(class202 arg0, int arg1, int arg2, int arg3, class249 arg4) {
        class337 var6 = new class337(arg1, this.field2526 * 64 + arg2, this.field2525 * 64 + arg3);
        Object var7 = null;
        class337 var8;
        if (this.field2528 == null) {
            class243 var9 = (class243) arg4;
            var8 = new class337(var9.field2610 + arg1, var9.field2617 * 64 + arg2 + var9.method4509() * 8, var9.field2614 * 64 + arg3 + var9.method4510() * 8);
        } else {
            var8 = new class337(this.field2528.field2610 + arg1, this.field2528.field2617 * 64 + arg2, this.field2528.field2614 * 64 + arg3);
        }
        class258 var10;
        if (arg0.field2097 == null) {
            class178 var11 = class178.method7281(arg0.field2123);
            var10 = new class246(var8, var6, var11.field1842, this.method4350(var11));
        } else {
            var10 = new class238(var8, var6, arg0.field2108, this);
        }
        class178 var12 = class178.method7281(var10.method4226());
        if (var12.field1849) {
            this.field2530.put(new class337(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("jt.ae(I)V")
    public void method4348() {
        Iterator var1 = this.field2530.values().iterator();
        while (var1.hasNext()) {
            class258 var2 = (class258) var1.next();
            if (var2 instanceof class238) {
                ((class238) var2).method4225();
            }
        }
    }

    @ObfuscatedName("jt.aa(Ljava/util/List;B)V")
    public void method4349(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class246 var3 = (class246) var2.next();
            if (class178.method7281(var3.field2576).field1849 && var3.field2664.field3604 >> 6 == this.field2526 && var3.field2664.field3603 >> 6 == this.field2525) {
                class246 var4 = new class246(var3.field2664, var3.field2664, var3.field2576, this.method4371(var3.field2576));
                this.field2527.add(var4);
            }
        }
    }

    @ObfuscatedName("jt.au(I)V")
    public void method4361() {
        if (this.field2528 != null) {
            this.field2528.method4544();
            return;
        }
        Iterator var1 = this.field2529.iterator();
        while (var1.hasNext()) {
            class243 var2 = (class243) var1.next();
            var2.method4544();
        }
    }

    @ObfuscatedName("jt.an(Low;I)Z")
    public boolean method4351(class375 arg0) {
        this.field2530.clear();
        if (this.field2528 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2529.iterator();
            while (var3.hasNext()) {
                class243 var4 = (class243) var3.next();
                var4.method4551(arg0);
                var2 &= var4.method4541();
            }
            if (var2) {
                Iterator var5 = this.field2529.iterator();
                while (var5.hasNext()) {
                    class243 var6 = (class243) var5.next();
                    this.method4376(var6.method4508() * 8, var6.method4512() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2528.method4551(arg0);
            if (this.field2528.method4541()) {
                this.method4376(0, 0, 64, 64, this.field2528);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("jt.ad(ILki;[Lut;Low;Low;I)V")
    public void method4389(int arg0, class262 arg1, class544[] arg2, class375 arg3, class375 arg4) {
        this.field2531 = arg0;
        if (this.field2528 == null && this.field2529.isEmpty()) {
            return;
        }
        int var6 = this.field2526;
        int var7 = this.field2525;
        class545 var8 = (class545) field2535.method5361(method844(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method4351(arg3);
        int var11;
        if (this.field2528 == null) {
            var11 = ((class249) this.field2529.getFirst()).field2612;
        } else {
            var11 = this.field2528.field2612;
        }
        boolean var12 = var10 & arg4.method6400(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method6402(var11);
        class252 var14 = class252.method177(var13);
        class545 var15 = new class545(this.field2531 * 64, this.field2531 * 64);
        var15.method8987();
        if (this.field2528 == null) {
            this.method4435(arg1, arg2, var14);
        } else {
            this.method4399(arg1, arg2, var14);
        }
        method7369(var15, this.field2526, this.field2525, this.field2531);
        this.method4361();
    }

    @ObfuscatedName("jt.ax(IIILjava/util/HashSet;I)V")
    public void method4423(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4363(arg0, arg1, arg3, arg2);
        this.method4368(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("jt.aw(Ljava/util/HashSet;III)V")
    public void method4354(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2530.values().iterator();
        while (var4.hasNext()) {
            class258 var5 = (class258) var4.next();
            if (var5.method4592()) {
                int var6 = var5.method4226();
                if (arg0.contains(var6)) {
                    class178 var7 = class178.method7281(var6);
                    this.method4365(var7, var5.field2663, var5.field2665, arg1, arg2);
                }
            }
        }
        this.method4364(arg0, arg1, arg2);
    }

    @ObfuscatedName("jt.az(Lki;[Lut;Ljo;I)V")
    public void method4399(class262 arg0, class544[] arg1, class252 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4358(var4, var5, this.field2528, arg0, arg2);
                this.method4359(var4, var5, this.field2528, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4357(var6, var7, this.field2528, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("jt.av(Lki;[Lut;Ljo;I)V")
    public void method4435(class262 arg0, class544[] arg1, class252 arg2) {
        Iterator var4 = this.field2529.iterator();
        while (var4.hasNext()) {
            class243 var5 = (class243) var4.next();
            for (int var6 = var5.method4508() * 8; var6 < var5.method4508() * 8 + 8; var6++) {
                for (int var7 = var5.method4512() * 8; var7 < var5.method4512() * 8 + 8; var7++) {
                    this.method4358(var6, var7, var5, arg0, arg2);
                    this.method4359(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2529.iterator();
        while (var8.hasNext()) {
            class243 var9 = (class243) var8.next();
            for (int var10 = var9.method4508() * 8; var10 < var9.method4508() * 8 + 8; var10++) {
                for (int var11 = var9.method4512() * 8; var11 < var9.method4512() * 8 + 8; var11++) {
                    this.method4357(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("jt.ak(IILjw;Lki;[Lut;I)V")
    public void method4357(int arg0, int arg1, class249 arg2, class262 arg3, class544[] arg4) {
        this.method4362(arg0, arg1, arg2);
        this.method4457(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("jt.ay(IILjw;Lki;Ljo;B)V")
    public void method4358(int arg0, int arg1, class249 arg2, class262 arg3, class252 arg4) {
        int var6 = arg2.field2615[0][arg0][arg1] - 1;
        int var7 = arg2.field2606[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class541.method8884(this.field2531 * arg0, this.field2531 * (63 - arg1), this.field2531, this.field2531, this.field2522);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field2522;
            class204 var10 = (class204) class204.field2206.method5400((long) var7);
            class204 var11;
            if (var10 == null) {
                byte[] var12 = Statics.field4586.method6396(4, var7);
                class204 var13 = new class204();
                if (var12 != null) {
                    var13.method3735(new class531(var12), var7);
                }
                var13.method3745();
                class204.field2206.method5402(var13, (long) var7);
                var11 = var13;
            } else {
                var11 = var10;
            }
            int var15;
            if (var11 == null) {
                var15 = var9;
            } else if (var11.field2210 >= 0) {
                int var16 = class256.method3462(var11.field2216, var11.field2215, var11.field2218);
                int var17 = class256.method4240(var16, 96);
                var15 = class270.field2807[var17] | 0xFF000000;
            } else if (var11.field2208 >= 0) {
                int var18 = class256.method4240(class270.field2810.field3095.method5089(var11.field2208), 96);
                var15 = class270.field2807[var18] | 0xFF000000;
            } else if (var11.field2214 == 16711935) {
                var15 = var9;
            } else {
                int var19 = class256.method3462(var11.field2211, var11.field2212, var11.field2213);
                int var20 = class256.method4240(var19, 96);
                var15 = class270.field2807[var20] | 0xFF000000;
            }
            var8 = var15;
        }
        if (var7 > -1 && arg2.field2616[0][arg0][arg1] == 0) {
            class541.method8884(this.field2531 * arg0, this.field2531 * (63 - arg1), this.field2531, this.field2531, var8);
            return;
        }
        int var21 = this.method4352(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class541.method8884(this.field2531 * arg0, this.field2531 * (63 - arg1), this.field2531, this.field2531, var21);
        } else {
            arg3.method4611(this.field2531 * arg0, this.field2531 * (63 - arg1), var21, var8, this.field2531, this.field2531, arg2.field2616[0][arg0][arg1], arg2.field2618[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("jt.as(IILjw;Lki;B)V")
    public void method4359(int arg0, int arg1, class249 arg2, class262 arg3) {
        for (int var5 = 1; var5 < arg2.field2611; var5++) {
            int var6 = arg2.field2606[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field2522;
                class204 var8 = (class204) class204.field2206.method5400((long) var6);
                class204 var9;
                if (var8 == null) {
                    byte[] var10 = Statics.field4586.method6396(4, var6);
                    class204 var11 = new class204();
                    if (var10 != null) {
                        var11.method3735(new class531(var10), var6);
                    }
                    var11.method3745();
                    class204.field2206.method5402(var11, (long) var6);
                    var9 = var11;
                } else {
                    var9 = var8;
                }
                int var13;
                if (var9 == null) {
                    var13 = var7;
                } else if (var9.field2210 >= 0) {
                    int var14 = class256.method3462(var9.field2216, var9.field2215, var9.field2218);
                    int var15 = class256.method4240(var14, 96);
                    var13 = class270.field2807[var15] | 0xFF000000;
                } else if (var9.field2208 >= 0) {
                    int var16 = class256.method4240(class270.field2810.field3095.method5089(var9.field2208), 96);
                    var13 = class270.field2807[var16] | 0xFF000000;
                } else if (var9.field2214 == 16711935) {
                    var13 = var7;
                } else {
                    int var17 = class256.method3462(var9.field2211, var9.field2212, var9.field2213);
                    int var18 = class256.method4240(var17, 96);
                    var13 = class270.field2807[var18] | 0xFF000000;
                }
                if (arg2.field2616[var5][arg0][arg1] == 0) {
                    class541.method8884(this.field2531 * arg0, this.field2531 * (63 - arg1), this.field2531, this.field2531, var13);
                } else {
                    arg3.method4611(this.field2531 * arg0, this.field2531 * (63 - arg1), 0, var13, this.field2531, this.field2531, arg2.field2616[var5][arg0][arg1], arg2.field2618[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("jt.ab(IILjw;Ljo;I)I")
    public int method4352(int arg0, int arg1, class249 arg2, class252 arg3) {
        return arg2.field2615[0][arg0][arg1] == 0 ? this.field2522 : arg3.method4571(arg0, arg1);
    }

    @ObfuscatedName("jt.ah(IILjw;[Lut;S)V")
    public void method4457(int arg0, int arg1, class249 arg2, class544[] arg3) {
        for (int var5 = 0; var5 < arg2.field2611; var5++) {
            class251[] var6 = arg2.field2620[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class251[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class251 var9 = var7[var8];
                    int var10 = var9.field2629;
                    boolean var11 = var10 >= class356.field3905.field3889 && var10 <= class356.field3906.field3889;
                    if (var11 || class356.method3032(var9.field2629)) {
                        class202 var12 = class202.method3023(var9.field2631);
                        if (var12.field2127 != -1) {
                            if (var12.field2127 == 46 || var12.field2127 == 52) {
                                arg3[var12.field2127].method8968(this.field2531 * arg0, this.field2531 * (63 - arg1), this.field2531 * 2 + 1, this.field2531 * 2 + 1);
                            } else {
                                arg3[var12.field2127].method8968(this.field2531 * arg0, this.field2531 * (63 - arg1), this.field2531 * 2, this.field2531 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jt.ai(IILjw;I)V")
    public void method4362(int arg0, int arg1, class249 arg2) {
        for (int var4 = 0; var4 < arg2.field2611; var4++) {
            class251[] var5 = arg2.field2620[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class251[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class251 var8 = var6[var7];
                    if (class356.method3197(var8.field2629)) {
                        class202 var9 = class202.method3023(var8.field2631);
                        int var10 = var9.field2114 == 0 ? -3355444 : -3407872;
                        if (class356.field3895.field3889 == var8.field2629) {
                            this.method4375(arg0, arg1, var8.field2630, var10);
                        }
                        if (class356.field3887.field3889 == var8.field2629) {
                            this.method4375(arg0, arg1, var8.field2630, -3355444);
                            this.method4375(arg0, arg1, var8.field2630 + 1, var10);
                        }
                        if (class356.field3888.field3889 == var8.field2629) {
                            if (var8.field2630 == 0) {
                                class541.method8916(this.field2531 * arg0, this.field2531 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2630 == 1) {
                                class541.method8916(this.field2531 * arg0 + this.field2531 - 1, this.field2531 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2630 == 2) {
                                class541.method8916(this.field2531 * arg0 + this.field2531 - 1, this.field2531 * (63 - arg1) + this.field2531 - 1, 1, var10);
                            }
                            if (var8.field2630 == 3) {
                                class541.method8916(this.field2531 * arg0, this.field2531 * (63 - arg1) + this.field2531 - 1, 1, var10);
                            }
                        }
                        if (class356.field3885.field3889 == var8.field2629) {
                            int var11 = var8.field2630 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2531; var12++) {
                                    class541.method8916(this.field2531 * arg0 + var12, this.field2531 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2531; var13++) {
                                    class541.method8916(this.field2531 * arg0 + var13, this.field2531 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jt.ac(IILjava/util/HashSet;IB)V")
    public void method4363(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2530.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class337 var9 = (class337) var8.getKey();
            int var10 = (int) ((float) var9.field3604 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3603 * var5 - var6);
            class258 var12 = (class258) var8.getValue();
            if (var12 != null && var12.method4592()) {
                var12.field2663 = var10;
                var12.field2665 = var11;
                class178 var13 = class178.method7281(var12.method4226());
                if (!arg2.contains(var13.method3277())) {
                    this.method4413(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("jt.al(Ljava/util/HashSet;IIB)V")
    public void method4364(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2527.iterator();
        while (var4.hasNext()) {
            class258 var5 = (class258) var4.next();
            if (var5.method4592()) {
                class178 var6 = class178.method7281(var5.method4226());
                if (var6 != null && arg0.contains(var6.method3277())) {
                    this.method4365(var6, var5.field2663, var5.field2665, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("jt.at(Lgw;IIIIB)V")
    public void method4365(class178 arg0, int arg1, int arg2, int arg3, int arg4) {
        class545 var6 = arg0.method3275(false);
        if (var6 == null) {
            return;
        }
        var6.method8995(arg1 - var6.field5276 / 2, arg2 - var6.field5277 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class541.method8882(arg1, arg2, 15, 16776960, 128);
            class541.method8882(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("jt.bj(Ljq;IIFB)V")
    public void method4413(class258 arg0, int arg1, int arg2, float arg3) {
        class178 var5 = class178.method7281(arg0.method4226());
        this.method4414(var5, arg1, arg2);
        this.method4439(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("jt.bd(Lgw;III)V")
    public void method4414(class178 arg0, int arg1, int arg2) {
        class545 var4 = arg0.method3275(false);
        if (var4 != null) {
            int var5 = this.method4369(var4, arg0.field1858);
            int var6 = this.method4408(var4, arg0.field1859);
            var4.method8995(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("jt.bg(Ljq;Lgw;IIFB)V")
    public void method4439(class258 arg0, class178 arg1, int arg2, int arg3, float arg4) {
        class253 var6 = arg0.method4227();
        if (var6 != null && var6.field2642.method4219(arg4)) {
            class410 var7 = (class410) this.field2534.get(var6.field2642);
            var7.method7113(var6.field2641, arg2 - var6.field2640 / 2, arg3, var6.field2640, var6.field2639, 0xFF000000 | arg1.field1846, 0, 1, 0, var7.field4556 / 2);
        }
    }

    @ObfuscatedName("jt.bt(IILjava/util/HashSet;II)V")
    public void method4368(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2527.iterator();
        while (var6.hasNext()) {
            class258 var7 = (class258) var6.next();
            if (var7.method4592()) {
                int var8 = var7.field2664.field3604 % 64;
                int var9 = var7.field2664.field3603 % 64;
                var7.field2663 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2665 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4226())) {
                    this.method4413(var7, var7.field2663, var7.field2665, var5);
                }
            }
        }
    }

    @ObfuscatedName("jt.br(Luc;Lhn;I)I")
    public int method4369(class545 arg0, class187 arg1) {
        switch(arg1.field1934) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5276 / 2;
            default:
                return -arg0.field5276;
        }
    }

    @ObfuscatedName("jt.ba(Luc;Lhe;I)I")
    public int method4408(class545 arg0, class191 arg1) {
        switch(arg1.field2004) {
            case 0:
                return 0;
            case 1:
                return -arg0.field5277 / 2;
            default:
                return -arg0.field5277;
        }
    }

    @ObfuscatedName("fa.bk(Lhg;I)Z")
    public static boolean method3109(class202 arg0) {
        if (arg0.field2097 != null) {
            int[] var1 = arg0.field2097;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class202 var4 = class202.method3023(var3);
                if (var4.field2123 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2123 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("jt.bn(II)Ljz;")
    public class253 method4371(int arg0) {
        class178 var2 = class178.method7281(arg0);
        return this.method4350(var2);
    }

    @ObfuscatedName("jt.by(Lgw;I)Ljz;")
    public class253 method4350(class178 arg0) {
        if (arg0.field1845 == null || this.field2534 == null || this.field2534.get(class237.field2484) == null) {
            return null;
        }
        class237 var2 = class237.method4220(arg0.field1844);
        if (var2 == null) {
            return null;
        }
        class410 var3 = (class410) this.field2534.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method7106(arg0.field1845, 1000000);
        String[] var5 = new String[var4];
        var3.method7203(arg0.field1845, (int[]) null, var5);
        int var6 = var5.length * var3.field4556 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method7103(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class253(arg0.field1845, var7, var6, var2);
    }

    @ObfuscatedName("jt.bc(IIIIII)Ljava/util/List;")
    public List method4373(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2530.values().iterator();
            while (var7.hasNext()) {
                class258 var8 = (class258) var7.next();
                if (var8.method4592() && var8.method4591(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2527.iterator();
            while (var9.hasNext()) {
                class258 var10 = (class258) var9.next();
                if (var10.method4592() && var10.method4591(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("jt.bx(I)Ljava/util/List;")
    public List method4374() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2527);
        var1.addAll(this.field2530.values());
        return var1;
    }

    @ObfuscatedName("jt.bf(IIIIB)V")
    public void method4375(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class541.method8903(this.field2531 * arg0, this.field2531 * (63 - arg1), this.field2531, arg3);
        }
        if (var5 == 1) {
            class541.method8916(this.field2531 * arg0, this.field2531 * (63 - arg1), this.field2531, arg3);
        }
        if (var5 == 2) {
            class541.method8903(this.field2531 * arg0 + this.field2531 - 1, this.field2531 * (63 - arg1), this.field2531, arg3);
        }
        if (var5 == 3) {
            class541.method8916(this.field2531 * arg0, this.field2531 * (63 - arg1) + this.field2531 - 1, this.field2531, arg3);
        }
    }
}
