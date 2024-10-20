package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("jc")
public class class249 {

    @ObfuscatedName("jc.ap")
    public static class311 field2593 = new class311(37748736, 256);

    @ObfuscatedName("jc.an")
    public int field2599;

    @ObfuscatedName("jc.aj")
    public int field2588;

    @ObfuscatedName("jc.av")
    public class243 field2594;

    @ObfuscatedName("jc.ab")
    public LinkedList field2595;

    @ObfuscatedName("jc.ai")
    public int field2596;

    @ObfuscatedName("jc.ae")
    public int field2597;

    @ObfuscatedName("jc.au")
    public List field2598;

    @ObfuscatedName("jc.ah")
    public HashMap field2600;

    @ObfuscatedName("jc.az")
    public final HashMap field2592;

    public class249(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2599 = arg0;
        this.field2588 = arg1;
        this.field2595 = new LinkedList();
        this.field2598 = new LinkedList();
        this.field2600 = new HashMap();
        this.field2596 = arg2 | 0xFF000000;
        this.field2592 = arg3;
    }

    @ObfuscatedName("jc.aq(IIII)V")
    public void method4342(int arg0, int arg1, int arg2) {
        int var4 = this.field2599;
        int var5 = this.field2588;
        int var6 = this.field2597;
        class311 var7 = field2593;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class561 var10 = (class561) var7.method5473(var8);
        if (var10 == null) {
            return;
        }
        if (this.field2597 * 64 == arg2) {
            var10.method9197(arg0, arg1);
        } else {
            var10.method9188(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("jc.ad(Ljn;Ljava/util/List;S)V")
    public void method4343(class243 arg0, List arg1) {
        this.field2600.clear();
        this.field2594 = arg0;
        this.method4389(arg1);
    }

    @ObfuscatedName("jc.ag(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method4380(HashSet arg0, List arg1) {
        this.field2600.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class251 var4 = (class251) var3.next();
            if (var4.method4563() == this.field2599 && var4.method4545() == this.field2588) {
                this.field2595.add(var4);
            }
        }
        this.method4389(arg1);
    }

    @ObfuscatedName("jc.ak(IIIILjk;I)V")
    public void method4345(int arg0, int arg1, int arg2, int arg3, class257 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2680; var8++) {
                    class259[] var9 = arg4.field2668[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class259[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class207 var13;
                            boolean var18;
                            label58: {
                                class259 var12 = var10[var11];
                                var13 = class207.method95(var12.field2693);
                                if (var13.field2194 != null) {
                                    int[] var14 = var13.field2194;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class207 var17 = class207.method95(var16);
                                        if (var17.field2181 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field2181 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method4346(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jc.ap(Lho;IIILjk;I)V")
    public void method4346(class207 arg0, int arg1, int arg2, int arg3, class257 arg4) {
        class348 var6 = new class348(arg1, this.field2599 * 64 + arg2, this.field2588 * 64 + arg3);
        Object var7 = null;
        class348 var8;
        if (this.field2594 == null) {
            class251 var9 = (class251) arg4;
            var8 = new class348(var9.field2672 + arg1, var9.field2682 * 64 + arg2 + var9.method4501() * 8, var9.field2674 * 64 + arg3 + var9.method4517() * 8);
        } else {
            var8 = new class348(this.field2594.field2672 + arg1, this.field2594.field2682 * 64 + arg2, this.field2594.field2674 * 64 + arg3);
        }
        class266 var10;
        if (arg0.field2194 == null) {
            class182 var11 = class182.method3196(arg0.field2181);
            var10 = new class254(var8, var6, var11.field1890, this.method4372(var11));
        } else {
            var10 = new class246(var8, var6, arg0.field2160, this);
        }
        class182 var12 = class182.method3196(var10.method4215());
        if (var12.field1897) {
            this.field2600.put(new class348(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("jc.an(B)V")
    public void method4347() {
        Iterator var1 = this.field2600.values().iterator();
        while (var1.hasNext()) {
            class266 var2 = (class266) var1.next();
            if (var2 instanceof class246) {
                ((class246) var2).method4214();
            }
        }
    }

    @ObfuscatedName("jc.aj(Ljava/util/List;I)V")
    public void method4389(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class254 var3 = (class254) var2.next();
            if (class182.method3196(var3.field2640).field1897 && var3.field2732.field3733 >> 6 == this.field2599 && var3.field2732.field3735 >> 6 == this.field2588) {
                class254 var4 = new class254(var3.field2732, var3.field2732, var3.field2640, this.method4371(var3.field2640));
                this.field2598.add(var4);
            }
        }
    }

    @ObfuscatedName("jc.av(I)V")
    public void method4349() {
        if (this.field2594 != null) {
            this.field2594.method4546();
            return;
        }
        Iterator var1 = this.field2595.iterator();
        while (var1.hasNext()) {
            class251 var2 = (class251) var1.next();
            var2.method4546();
        }
    }

    @ObfuscatedName("jc.ab(Lok;B)Z")
    public boolean method4350(class388 arg0) {
        this.field2600.clear();
        if (this.field2594 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2595.iterator();
            while (var3.hasNext()) {
                class251 var4 = (class251) var3.next();
                var4.method4540(arg0);
                var2 &= var4.method4552();
            }
            if (var2) {
                Iterator var5 = this.field2595.iterator();
                while (var5.hasNext()) {
                    class251 var6 = (class251) var5.next();
                    this.method4345(var6.method4503() * 8, var6.method4504() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2594.method4540(arg0);
            if (this.field2594.method4552()) {
                this.method4345(0, 0, 64, 64, this.field2594);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("jc.ai(ILkp;[Lvv;Lok;Lok;I)V")
    public void method4351(int arg0, class270 arg1, class560[] arg2, class388 arg3, class388 arg4) {
        this.field2597 = arg0;
        if (this.field2594 == null && this.field2595.isEmpty()) {
            return;
        }
        int var6 = this.field2599;
        int var7 = this.field2588;
        class311 var8 = field2593;
        long var9 = (long) (arg0 << 16 | var6 << 8 | var7);
        class561 var11 = (class561) var8.method5473(var9);
        if (var11 != null) {
            return;
        }
        boolean var12 = true;
        boolean var13 = var12 & this.method4350(arg3);
        int var14;
        if (this.field2594 == null) {
            var14 = ((class257) this.field2595.getFirst()).field2683;
        } else {
            var14 = this.field2594.field2683;
        }
        boolean var15 = var13 & arg4.method6543(var14);
        if (!var15) {
            return;
        }
        byte[] var16 = arg4.method6545(var14);
        class260 var17 = class260.method2963(var16);
        class561 var18 = new class561(this.field2597 * 64, this.field2597 * 64);
        var18.method9158();
        if (this.field2594 == null) {
            this.method4355(arg1, arg2, var17);
        } else {
            this.method4354(arg1, arg2, var17);
        }
        int var19 = this.field2599;
        int var20 = this.field2588;
        int var21 = this.field2597;
        class311 var22 = field2593;
        long var24 = (long) (var21 << 16 | var19 << 8 | var20);
        var22.method5484(var18, var24, var18.field5466.length * 4);
        this.method4349();
    }

    @ObfuscatedName("jc.ae(IIILjava/util/HashSet;I)V")
    public void method4352(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4362(arg0, arg1, arg3, arg2);
        this.method4368(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("jc.au(Ljava/util/HashSet;IIB)V")
    public void method4353(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2600.values().iterator();
        while (var4.hasNext()) {
            class266 var5 = (class266) var4.next();
            if (var5.method4599()) {
                int var6 = var5.method4215();
                if (arg0.contains(var6)) {
                    class182 var7 = class182.method3196(var6);
                    this.method4413(var7, var5.field2734, var5.field2735, arg1, arg2);
                }
            }
        }
        this.method4363(arg0, arg1, arg2);
    }

    @ObfuscatedName("jc.ah(Lkp;[Lvv;Ljg;I)V")
    public void method4354(class270 arg0, class560[] arg1, class260 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4439(var4, var5, this.field2594, arg0, arg2);
                this.method4358(var4, var5, this.field2594, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4356(var6, var7, this.field2594, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("jc.az(Lkp;[Lvv;Ljg;I)V")
    public void method4355(class270 arg0, class560[] arg1, class260 arg2) {
        Iterator var4 = this.field2595.iterator();
        while (var4.hasNext()) {
            class251 var5 = (class251) var4.next();
            for (int var6 = var5.method4503() * 8; var6 < var5.method4503() * 8 + 8; var6++) {
                for (int var7 = var5.method4504() * 8; var7 < var5.method4504() * 8 + 8; var7++) {
                    this.method4439(var6, var7, var5, arg0, arg2);
                    this.method4358(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2595.iterator();
        while (var8.hasNext()) {
            class251 var9 = (class251) var8.next();
            for (int var10 = var9.method4503() * 8; var10 < var9.method4503() * 8 + 8; var10++) {
                for (int var11 = var9.method4504() * 8; var11 < var9.method4504() * 8 + 8; var11++) {
                    this.method4356(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("jc.ax(IILjk;Lkp;[Lvv;I)V")
    public void method4356(int arg0, int arg1, class257 arg2, class270 arg3, class560[] arg4) {
        this.method4446(arg0, arg1, arg2);
        this.method4431(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("jc.ac(IILjk;Lkp;Ljg;B)V")
    public void method4439(int arg0, int arg1, class257 arg2, class270 arg3, class260 arg4) {
        int var6 = arg2.field2673[0][arg0][arg1] - 1;
        int var7 = arg2.field2677[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class557.method9060(this.field2597 * arg0, this.field2597 * (63 - arg1), this.field2597, this.field2597, this.field2596);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class264.method5535(var7, this.field2596);
        }
        if (var7 > -1 && arg2.field2678[0][arg0][arg1] == 0) {
            class557.method9060(this.field2597 * arg0, this.field2597 * (63 - arg1), this.field2597, this.field2597, var8);
            return;
        }
        int var9 = this.method4359(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class557.method9060(this.field2597 * arg0, this.field2597 * (63 - arg1), this.field2597, this.field2597, var9);
        } else {
            arg3.method4621(this.field2597 * arg0, this.field2597 * (63 - arg1), var9, var8, this.field2597, this.field2597, arg2.field2678[0][arg0][arg1], arg2.field2679[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("jc.al(IILjk;Lkp;B)V")
    public void method4358(int arg0, int arg1, class257 arg2, class270 arg3) {
        for (int var5 = 1; var5 < arg2.field2680; var5++) {
            int var6 = arg2.field2677[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class264.method5535(var6, this.field2596);
                if (arg2.field2678[var5][arg0][arg1] == 0) {
                    class557.method9060(this.field2597 * arg0, this.field2597 * (63 - arg1), this.field2597, this.field2597, var7);
                } else {
                    arg3.method4621(this.field2597 * arg0, this.field2597 * (63 - arg1), 0, var7, this.field2597, this.field2597, arg2.field2678[var5][arg0][arg1], arg2.field2679[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("jc.ay(IILjk;Ljg;I)I")
    public int method4359(int arg0, int arg1, class257 arg2, class260 arg3) {
        return arg2.field2673[0][arg0][arg1] == 0 ? this.field2596 : arg3.method4571(arg0, arg1);
    }

    @ObfuscatedName("jc.ao(IILjk;[Lvv;B)V")
    public void method4431(int arg0, int arg1, class257 arg2, class560[] arg3) {
        for (int var5 = 0; var5 < arg2.field2680; var5++) {
            class259[] var6 = arg2.field2668[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class259[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class259 var9 = var7[var8];
                    if (class368.method5540(var9.field2690) || class368.method2288(var9.field2690)) {
                        class207 var10 = class207.method95(var9.field2693);
                        if (var10.field2158 != -1) {
                            if (var10.field2158 == 46 || var10.field2158 == 52) {
                                arg3[var10.field2158].method9146(this.field2597 * arg0, this.field2597 * (63 - arg1), this.field2597 * 2 + 1, this.field2597 * 2 + 1);
                            } else {
                                arg3[var10.field2158].method9146(this.field2597 * arg0, this.field2597 * (63 - arg1), this.field2597 * 2, this.field2597 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jc.aa(IILjk;I)V")
    public void method4446(int arg0, int arg1, class257 arg2) {
        for (int var4 = 0; var4 < arg2.field2680; var4++) {
            class259[] var5 = arg2.field2668[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class259[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class259 var8 = var6[var7];
                    if (class368.method5775(var8.field2690)) {
                        class207 var9 = class207.method95(var8.field2693);
                        int var10 = var9.field2172 == 0 ? -3355444 : -3407872;
                        if (class368.field4012.field4011 == var8.field2690) {
                            this.method4375(arg0, arg1, var8.field2691, var10);
                        }
                        if (class368.field4028.field4011 == var8.field2690) {
                            this.method4375(arg0, arg1, var8.field2691, -3355444);
                            this.method4375(arg0, arg1, var8.field2691 + 1, var10);
                        }
                        if (class368.field4033.field4011 == var8.field2690) {
                            if (var8.field2691 == 0) {
                                class557.method9050(this.field2597 * arg0, this.field2597 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2691 == 1) {
                                class557.method9050(this.field2597 * arg0 + this.field2597 - 1, this.field2597 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2691 == 2) {
                                class557.method9050(this.field2597 * arg0 + this.field2597 - 1, this.field2597 * (63 - arg1) + this.field2597 - 1, 1, var10);
                            }
                            if (var8.field2691 == 3) {
                                class557.method9050(this.field2597 * arg0, this.field2597 * (63 - arg1) + this.field2597 - 1, 1, var10);
                            }
                        }
                        if (class368.field4014.field4011 == var8.field2690) {
                            int var11 = var8.field2691 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2597; var12++) {
                                    class557.method9050(this.field2597 * arg0 + var12, this.field2597 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2597; var13++) {
                                    class557.method9050(this.field2597 * arg0 + var13, this.field2597 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jc.as(IILjava/util/HashSet;IB)V")
    public void method4362(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2600.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class348 var9 = (class348) var8.getKey();
            int var10 = (int) ((float) var9.field3733 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3735 * var5 - var6);
            class266 var12 = (class266) var8.getValue();
            if (var12 != null && var12.method4599()) {
                var12.field2734 = var10;
                var12.field2735 = var11;
                class182 var13 = class182.method3196(var12.method4215());
                if (!arg2.contains(var13.method3289())) {
                    this.method4366(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("jc.aw(Ljava/util/HashSet;IIB)V")
    public void method4363(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2598.iterator();
        while (var4.hasNext()) {
            class266 var5 = (class266) var4.next();
            if (var5.method4599()) {
                class182 var6 = class182.method3196(var5.method4215());
                if (var6 != null && arg0.contains(var6.method3289())) {
                    this.method4413(var6, var5.field2734, var5.field2735, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("jc.at(Lgg;IIIIB)V")
    public void method4413(class182 arg0, int arg1, int arg2, int arg3, int arg4) {
        class561 var6 = arg0.method3287(false);
        if (var6 == null) {
            return;
        }
        var6.method9189(arg1 - var6.field5458 / 2, arg2 - var6.field5461 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class557.method9053(arg1, arg2, 15, 16776960, 128);
            class557.method9053(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("jc.af(Lkh;IIFI)V")
    public void method4366(class266 arg0, int arg1, int arg2, float arg3) {
        class182 var5 = class182.method3196(arg0.method4215());
        this.method4445(var5, arg1, arg2);
        this.method4367(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("jc.am(Lgg;IIB)V")
    public void method4445(class182 arg0, int arg1, int arg2) {
        class561 var4 = arg0.method3287(false);
        if (var4 != null) {
            int var5 = this.method4369(var4, arg0.field1906);
            int var6 = this.method4370(var4, arg0.field1907);
            var4.method9189(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("jc.ar(Lkh;Lgg;IIFI)V")
    public void method4367(class266 arg0, class182 arg1, int arg2, int arg3, float arg4) {
        class261 var6 = arg0.method4216();
        if (var6 != null && var6.field2704.method4206(arg4)) {
            class432 var7 = (class432) this.field2592.get(var6.field2704);
            var7.method7436(var6.field2703, arg2 - var6.field2702 / 2, arg3, var6.field2702, var6.field2701, 0xFF000000 | arg1.field1892, 0, 1, 0, var7.field4768 / 2);
        }
    }

    @ObfuscatedName("jc.bt(IILjava/util/HashSet;IB)V")
    public void method4368(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2598.iterator();
        while (var6.hasNext()) {
            class266 var7 = (class266) var6.next();
            if (var7.method4599()) {
                int var8 = var7.field2732.field3733 % 64;
                int var9 = var7.field2732.field3735 % 64;
                var7.field2734 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2735 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4215())) {
                    this.method4366(var7, var7.field2734, var7.field2735, var5);
                }
            }
        }
    }

    @ObfuscatedName("jc.bj(Lvg;Lhp;B)I")
    public int method4369(class561 arg0, class191 arg1) {
        switch(arg1.field1972) {
            case 0:
                return -arg0.field5458 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field5458;
        }
    }

    @ObfuscatedName("jc.be(Lvg;Lhx;I)I")
    public int method4370(class561 arg0, class195 arg1) {
        switch(arg1.field2042) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5461 / 2;
            default:
                return -arg0.field5461;
        }
    }

    @ObfuscatedName("jc.bm(IB)Lkm;")
    public class261 method4371(int arg0) {
        class182 var2 = class182.method3196(arg0);
        return this.method4372(var2);
    }

    @ObfuscatedName("jc.bo(Lgg;I)Lkm;")
    public class261 method4372(class182 arg0) {
        if (arg0.field1891 == null || this.field2592 == null || this.field2592.get(class245.field2550) == null) {
            return null;
        }
        int var2 = arg0.field1894;
        class245[] var3 = new class245[] { class245.field2544, class245.field2551, class245.field2550 };
        class245[] var4 = var3;
        int var5 = 0;
        class245 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class245 var6 = var4[var5];
            if (var6.field2546 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class432 var9 = (class432) this.field2592.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method7429(arg0.field1891, 1000000);
        String[] var11 = new String[var10];
        var9.method7486(arg0.field1891, (int[]) null, var11);
        int var12 = var11.length * var9.field4768 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method7427(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class261(arg0.field1891, var13, var12, var7);
    }

    @ObfuscatedName("jc.bi(IIIIIB)Ljava/util/List;")
    public List method4373(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2600.values().iterator();
            while (var7.hasNext()) {
                class266 var8 = (class266) var7.next();
                if (var8.method4599() && var8.method4594(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2598.iterator();
            while (var9.hasNext()) {
                class266 var10 = (class266) var9.next();
                if (var10.method4599() && var10.method4594(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("jc.ba(B)Ljava/util/List;")
    public List method4374() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2598);
        var1.addAll(this.field2600.values());
        return var1;
    }

    @ObfuscatedName("jc.bg(IIIIS)V")
    public void method4375(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class557.method9104(this.field2597 * arg0, this.field2597 * (63 - arg1), this.field2597, arg3);
        }
        if (var5 == 1) {
            class557.method9050(this.field2597 * arg0, this.field2597 * (63 - arg1), this.field2597, arg3);
        }
        if (var5 == 2) {
            class557.method9104(this.field2597 * arg0 + this.field2597 - 1, this.field2597 * (63 - arg1), this.field2597, arg3);
        }
        if (var5 == 3) {
            class557.method9050(this.field2597 * arg0, this.field2597 * (63 - arg1) + this.field2597 - 1, this.field2597, arg3);
        }
    }
}
