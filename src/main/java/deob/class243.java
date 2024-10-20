package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("jt")
public class class243 {

    @ObfuscatedName("jt.ar")
    public static class302 field2534 = new class302(37748736, 256);

    @ObfuscatedName("jt.as")
    public int field2539;

    @ObfuscatedName("jt.aa")
    public int field2532;

    @ObfuscatedName("jt.az")
    public class237 field2540;

    @ObfuscatedName("jt.ao")
    public LinkedList field2538;

    @ObfuscatedName("jt.au")
    public int field2542;

    @ObfuscatedName("jt.ak")
    public int field2541;

    @ObfuscatedName("jt.ah")
    public List field2536;

    @ObfuscatedName("jt.aj")
    public HashMap field2537;

    @ObfuscatedName("jt.af")
    public final HashMap field2543;

    @ObfuscatedName("gw.aq(IIII)Lvd;")
    public static class548 method3149(int arg0, int arg1, int arg2) {
        class302 var3 = field2534;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class548) var3.method5384(var4);
    }

    @ObfuscatedName("iz.aw(Lvd;IIII)V")
    public static void method4067(class548 arg0, int arg1, int arg2, int arg3) {
        class302 var4 = field2534;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method5402(arg0, var6, arg0.field5296.length * 4);
    }

    @ObfuscatedName("jy.ai(I)V")
    public static void method4206() {
        field2534.method5393(5);
    }

    public class243(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2539 = arg0;
        this.field2532 = arg1;
        this.field2538 = new LinkedList();
        this.field2536 = new LinkedList();
        this.field2537 = new HashMap();
        this.field2542 = arg2 | 0xFF000000;
        this.field2543 = arg3;
    }

    @ObfuscatedName("jt.ar(IIII)V")
    public void method4330(int arg0, int arg1, int arg2) {
        class548 var4 = method3149(this.field2539, this.field2532, this.field2541);
        if (var4 == null) {
            return;
        }
        if (this.field2541 * 64 == arg2) {
            var4.method9051(arg0, arg1);
        } else {
            var4.method9000(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("jt.as(Lji;Ljava/util/List;S)V")
    public void method4331(class237 arg0, List arg1) {
        this.field2537.clear();
        this.field2540 = arg0;
        this.method4341(arg1);
    }

    @ObfuscatedName("jt.aa(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method4345(HashSet arg0, List arg1) {
        this.field2537.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class245 var4 = (class245) var3.next();
            if (var4.method4535() == this.field2539 && var4.method4536() == this.field2532) {
                this.field2538.add(var4);
            }
        }
        this.method4341(arg1);
    }

    @ObfuscatedName("jt.az(IIIILjo;I)V")
    public void method4332(int arg0, int arg1, int arg2, int arg3, class251 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2621; var8++) {
                    class253[] var9 = arg4.field2628[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class253[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class253 var12 = var10[var11];
                            class204 var13 = class204.method2849(var12.field2640);
                            if (method4157(var13)) {
                                this.method4334(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jt.ao(Lhe;IIILjo;I)V")
    public void method4334(class204 arg0, int arg1, int arg2, int arg3, class251 arg4) {
        class339 var6 = new class339(arg1, this.field2539 * 64 + arg2, this.field2532 * 64 + arg3);
        Object var7 = null;
        class339 var8;
        if (this.field2540 == null) {
            class245 var9 = (class245) arg4;
            var8 = new class339(var9.field2620 + arg1, var9.field2623 * 64 + arg2 + var9.method4492() * 8, var9.field2617 * 64 + arg3 + var9.method4493() * 8);
        } else {
            var8 = new class339(this.field2540.field2620 + arg1, this.field2540.field2623 * 64 + arg2, this.field2540.field2617 * 64 + arg3);
        }
        class260 var10;
        if (arg0.field2159 == null) {
            class179 var11 = class179.method2995(arg0.field2146);
            var10 = new class248(var8, var6, var11.field1870, this.method4427(var11));
        } else {
            var10 = new class240(var8, var6, arg0.field2128, this);
        }
        class179 var12 = class179.method2995(var10.method4218());
        if (var12.field1868) {
            this.field2537.put(new class339(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("jt.au(B)V")
    public void method4392() {
        Iterator var1 = this.field2537.values().iterator();
        while (var1.hasNext()) {
            class260 var2 = (class260) var1.next();
            if (var2 instanceof class240) {
                ((class240) var2).method4233();
            }
        }
    }

    @ObfuscatedName("jt.ak(Ljava/util/List;B)V")
    public void method4341(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class248 var3 = (class248) var2.next();
            if (class179.method2995(var3.field2584).field1868 && var3.field2677.field3622 >> 6 == this.field2539 && var3.field2677.field3624 >> 6 == this.field2532) {
                class248 var4 = new class248(var3.field2677, var3.field2677, var3.field2584, this.method4358(var3.field2584));
                this.field2536.add(var4);
            }
        }
    }

    @ObfuscatedName("jt.ah(I)V")
    public void method4337() {
        if (this.field2540 != null) {
            this.field2540.method4540();
            return;
        }
        Iterator var1 = this.field2538.iterator();
        while (var1.hasNext()) {
            class245 var2 = (class245) var1.next();
            var2.method4540();
        }
    }

    @ObfuscatedName("jt.aj(Lof;I)Z")
    public boolean method4356(class378 arg0) {
        this.field2537.clear();
        if (this.field2540 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2538.iterator();
            while (var3.hasNext()) {
                class245 var4 = (class245) var3.next();
                var4.method4546(arg0);
                var2 &= var4.method4529();
            }
            if (var2) {
                Iterator var5 = this.field2538.iterator();
                while (var5.hasNext()) {
                    class245 var6 = (class245) var5.next();
                    this.method4332(var6.method4494() * 8, var6.method4498() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2540.method4546(arg0);
            if (this.field2540.method4529()) {
                this.method4332(0, 0, 64, 64, this.field2540);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("jt.af(ILkc;[Lvg;Lof;Lof;I)V")
    public void method4408(int arg0, class264 arg1, class547[] arg2, class378 arg3, class378 arg4) {
        this.field2541 = arg0;
        if (this.field2540 == null && this.field2538.isEmpty() || method3149(this.field2539, this.field2532, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4356(arg3);
        int var8;
        if (this.field2540 == null) {
            var8 = ((class251) this.field2538.getFirst()).field2622;
        } else {
            var8 = this.field2540.field2622;
        }
        boolean var9 = var7 & arg4.method6422(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method6425(var8);
        class254 var11;
        if (var10 == null) {
            var11 = new class254();
        } else {
            var11 = new class254(class31.method3587(var10).field5296);
        }
        class548 var13 = new class548(this.field2541 * 64, this.field2541 * 64);
        var13.method9101();
        if (this.field2540 == null) {
            this.method4441(arg1, arg2, var11);
        } else {
            this.method4374(arg1, arg2, var11);
        }
        method4067(var13, this.field2539, this.field2532, this.field2541);
        this.method4337();
    }

    @ObfuscatedName("jt.ax(IIILjava/util/HashSet;B)V")
    public void method4442(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4349(arg0, arg1, arg3, arg2);
        this.method4355(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("jt.an(Ljava/util/HashSet;III)V")
    public void method4440(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2537.values().iterator();
        while (var4.hasNext()) {
            class260 var5 = (class260) var4.next();
            if (var5.method4591()) {
                int var6 = var5.method4218();
                if (arg0.contains(var6)) {
                    class179 var7 = class179.method2995(var6);
                    this.method4351(var7, var5.field2675, var5.field2673, arg1, arg2);
                }
            }
        }
        this.method4350(arg0, arg1, arg2);
    }

    @ObfuscatedName("jt.ag(Lkc;[Lvg;Lje;I)V")
    public void method4374(class264 arg0, class547[] arg1, class254 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4426(var4, var5, this.field2540, arg0, arg2);
                this.method4422(var4, var5, this.field2540, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4335(var6, var7, this.field2540, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("jt.am(Lkc;[Lvg;Lje;I)V")
    public void method4441(class264 arg0, class547[] arg1, class254 arg2) {
        Iterator var4 = this.field2538.iterator();
        while (var4.hasNext()) {
            class245 var5 = (class245) var4.next();
            for (int var6 = var5.method4494() * 8; var6 < var5.method4494() * 8 + 8; var6++) {
                for (int var7 = var5.method4498() * 8; var7 < var5.method4498() * 8 + 8; var7++) {
                    this.method4426(var6, var7, var5, arg0, arg2);
                    this.method4422(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2538.iterator();
        while (var8.hasNext()) {
            class245 var9 = (class245) var8.next();
            for (int var10 = var9.method4494() * 8; var10 < var9.method4494() * 8 + 8; var10++) {
                for (int var11 = var9.method4498() * 8; var11 < var9.method4498() * 8 + 8; var11++) {
                    this.method4335(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("jt.ad(IILjo;Lkc;[Lvg;I)V")
    public void method4335(int arg0, int arg1, class251 arg2, class264 arg3, class547[] arg4) {
        this.method4348(arg0, arg1, arg2);
        this.method4347(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("jt.at(IILjo;Lkc;Lje;I)V")
    public void method4426(int arg0, int arg1, class251 arg2, class264 arg3, class254 arg4) {
        int var6 = arg2.field2630[0][arg0][arg1] - 1;
        int var7 = arg2.field2619[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class544.method8900(this.field2541 * arg0, this.field2541 * (63 - arg1), this.field2541, this.field2541, this.field2542);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class258.method2246(var7, this.field2542);
        }
        if (var7 > -1 && arg2.field2624[0][arg0][arg1] == 0) {
            class544.method8900(this.field2541 * arg0, this.field2541 * (63 - arg1), this.field2541, this.field2541, var8);
            return;
        }
        int var9 = this.method4346(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class544.method8900(this.field2541 * arg0, this.field2541 * (63 - arg1), this.field2541, this.field2541, var9);
        } else {
            arg3.method4612(this.field2541 * arg0, this.field2541 * (63 - arg1), var9, var8, this.field2541, this.field2541, arg2.field2624[0][arg0][arg1], arg2.field2627[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("jt.ay(IILjo;Lkc;I)V")
    public void method4422(int arg0, int arg1, class251 arg2, class264 arg3) {
        for (int var5 = 1; var5 < arg2.field2621; var5++) {
            int var6 = arg2.field2619[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class258.method2246(var6, this.field2542);
                if (arg2.field2624[var5][arg0][arg1] == 0) {
                    class544.method8900(this.field2541 * arg0, this.field2541 * (63 - arg1), this.field2541, this.field2541, var7);
                } else {
                    arg3.method4612(this.field2541 * arg0, this.field2541 * (63 - arg1), 0, var7, this.field2541, this.field2541, arg2.field2624[var5][arg0][arg1], arg2.field2627[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("jt.ae(IILjo;Lje;B)I")
    public int method4346(int arg0, int arg1, class251 arg2, class254 arg3) {
        return arg2.field2630[0][arg0][arg1] == 0 ? this.field2542 : arg3.method4558(arg0, arg1);
    }

    @ObfuscatedName("jt.ac(IILjo;[Lvg;I)V")
    public void method4347(int arg0, int arg1, class251 arg2, class547[] arg3) {
        for (int var5 = 0; var5 < arg2.field2621; var5++) {
            class253[] var6 = arg2.field2628[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class253[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class253 var9 = var7[var8];
                    if (!class359.method4471(var9.field2642)) {
                        int var10 = var9.field2642;
                        boolean var11 = class359.field3917.field3926 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class204 var12 = class204.method2849(var9.field2640);
                    if (var12.field2147 != -1) {
                        if (var12.field2147 == 46 || var12.field2147 == 52) {
                            arg3[var12.field2147].method8986(this.field2541 * arg0, this.field2541 * (63 - arg1), this.field2541 * 2 + 1, this.field2541 * 2 + 1);
                        } else {
                            arg3[var12.field2147].method8986(this.field2541 * arg0, this.field2541 * (63 - arg1), this.field2541 * 2, this.field2541 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jt.ab(IILjo;I)V")
    public void method4348(int arg0, int arg1, class251 arg2) {
        for (int var4 = 0; var4 < arg2.field2621; var4++) {
            class253[] var5 = arg2.field2628[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class253[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class253 var8 = var6[var7];
                    int var9 = var8.field2642;
                    boolean var10 = var9 >= class359.field3918.field3926 && var9 <= class359.field3912.field3926 || class359.field3914.field3926 == var9;
                    if (var10) {
                        class204 var11 = class204.method2849(var8.field2640);
                        int var12 = var11.field2145 == 0 ? -3355444 : -3407872;
                        if (class359.field3918.field3926 == var8.field2642) {
                            this.method4340(arg0, arg1, var8.field2641, var12);
                        }
                        if (class359.field3932.field3926 == var8.field2642) {
                            this.method4340(arg0, arg1, var8.field2641, -3355444);
                            this.method4340(arg0, arg1, var8.field2641 + 1, var12);
                        }
                        if (class359.field3912.field3926 == var8.field2642) {
                            if (var8.field2641 == 0) {
                                class544.method8906(this.field2541 * arg0, this.field2541 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2641 == 1) {
                                class544.method8906(this.field2541 * arg0 + this.field2541 - 1, this.field2541 * (63 - arg1), 1, var12);
                            }
                            if (var8.field2641 == 2) {
                                class544.method8906(this.field2541 * arg0 + this.field2541 - 1, this.field2541 * (63 - arg1) + this.field2541 - 1, 1, var12);
                            }
                            if (var8.field2641 == 3) {
                                class544.method8906(this.field2541 * arg0, this.field2541 * (63 - arg1) + this.field2541 - 1, 1, var12);
                            }
                        }
                        if (class359.field3914.field3926 == var8.field2642) {
                            int var13 = var8.field2641 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2541; var14++) {
                                    class544.method8906(this.field2541 * arg0 + var14, this.field2541 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2541; var15++) {
                                    class544.method8906(this.field2541 * arg0 + var15, this.field2541 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jt.av(IILjava/util/HashSet;II)V")
    public void method4349(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2537.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class339 var9 = (class339) var8.getKey();
            int var10 = (int) ((float) var9.field3622 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3624 * var5 - var6);
            class260 var12 = (class260) var8.getValue();
            if (var12 != null && var12.method4591()) {
                var12.field2675 = var10;
                var12.field2673 = var11;
                class179 var13 = class179.method2995(var12.method4218());
                if (!arg2.contains(var13.method3244())) {
                    this.method4352(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("jt.ap(Ljava/util/HashSet;IIB)V")
    public void method4350(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2536.iterator();
        while (var4.hasNext()) {
            class260 var5 = (class260) var4.next();
            if (var5.method4591()) {
                class179 var6 = class179.method2995(var5.method4218());
                if (var6 != null && arg0.contains(var6.method3244())) {
                    this.method4351(var6, var5.field2675, var5.field2673, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("jt.bu(Lgv;IIIIB)V")
    public void method4351(class179 arg0, int arg1, int arg2, int arg3, int arg4) {
        class548 var6 = arg0.method3242(false);
        if (var6 == null) {
            return;
        }
        var6.method9027(arg1 - var6.field5304 / 2, arg2 - var6.field5298 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class544.method8898(arg1, arg2, 15, 16776960, 128);
            class544.method8898(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("jt.bo(Ljd;IIFI)V")
    public void method4352(class260 arg0, int arg1, int arg2, float arg3) {
        class179 var5 = class179.method2995(arg0.method4218());
        this.method4353(var5, arg1, arg2);
        this.method4354(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("jt.bd(Lgv;IIB)V")
    public void method4353(class179 arg0, int arg1, int arg2) {
        class548 var4 = arg0.method3242(false);
        if (var4 != null) {
            int var5 = this.method4424(var4, arg0.field1885);
            int var6 = this.method4362(var4, arg0.field1875);
            var4.method9027(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("jt.bi(Ljd;Lgv;IIFS)V")
    public void method4354(class260 arg0, class179 arg1, int arg2, int arg3, float arg4) {
        class255 var6 = arg0.method4221();
        if (var6 != null && var6.field2650.method4209(arg4)) {
            class413 var7 = (class413) this.field2543.get(var6.field2650);
            var7.method7208(var6.field2652, arg2 - var6.field2648 / 2, arg3, var6.field2648, var6.field2647, 0xFF000000 | arg1.field1874, 0, 1, 0, var7.field4594 / 2);
        }
    }

    @ObfuscatedName("jt.bq(IILjava/util/HashSet;II)V")
    public void method4355(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2536.iterator();
        while (var6.hasNext()) {
            class260 var7 = (class260) var6.next();
            if (var7.method4591()) {
                int var8 = var7.field2677.field3622 % 64;
                int var9 = var7.field2677.field3624 % 64;
                var7.field2675 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2673 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4218())) {
                    this.method4352(var7, var7.field2675, var7.field2673, var5);
                }
            }
        }
    }

    @ObfuscatedName("jt.ba(Lvd;Lhj;I)I")
    public int method4424(class548 arg0, class188 arg1) {
        switch(arg1.field1954) {
            case 1:
                return -arg0.field5304 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field5304;
        }
    }

    @ObfuscatedName("jt.bt(Lvd;Lhk;I)I")
    public int method4362(class548 arg0, class192 arg1) {
        switch(arg1.field2017) {
            case 1:
                return -arg0.field5298 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field5298;
        }
    }

    @ObfuscatedName("ip.bk(Lhe;I)Z")
    public static boolean method4157(class204 arg0) {
        if (arg0.field2159 != null) {
            int[] var1 = arg0.field2159;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class204 var4 = class204.method2849(var3);
                if (var4.field2146 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2146 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("jt.bm(IB)Lja;")
    public class255 method4358(int arg0) {
        class179 var2 = class179.method2995(arg0);
        return this.method4427(var2);
    }

    @ObfuscatedName("jt.bw(Lgv;B)Lja;")
    public class255 method4427(class179 arg0) {
        if (arg0.field1873 == null || this.field2543 == null || this.field2543.get(class239.field2489) == null) {
            return null;
        }
        class239 var2 = class239.method4210(arg0.field1886);
        if (var2 == null) {
            return null;
        }
        class413 var3 = (class413) this.field2543.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method7182(arg0.field1873, 1000000);
        String[] var5 = new String[var4];
        var3.method7129(arg0.field1873, (int[]) null, var5);
        int var6 = var5.length * var3.field4594 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method7128(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class255(arg0.field1873, var7, var6, var2);
    }

    @ObfuscatedName("jt.bv(IIIIIB)Ljava/util/List;")
    public List method4359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2537.values().iterator();
            while (var7.hasNext()) {
                class260 var8 = (class260) var7.next();
                if (var8.method4591() && var8.method4585(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2536.iterator();
            while (var9.hasNext()) {
                class260 var10 = (class260) var9.next();
                if (var10.method4591() && var10.method4585(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("jt.by(I)Ljava/util/List;")
    public List method4360() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2536);
        var1.addAll(this.field2537.values());
        return var1;
    }

    @ObfuscatedName("jt.bb(IIIII)V")
    public void method4340(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class544.method8908(this.field2541 * arg0, this.field2541 * (63 - arg1), this.field2541, arg3);
        }
        if (var5 == 1) {
            class544.method8906(this.field2541 * arg0, this.field2541 * (63 - arg1), this.field2541, arg3);
        }
        if (var5 == 2) {
            class544.method8908(this.field2541 * arg0 + this.field2541 - 1, this.field2541 * (63 - arg1), this.field2541, arg3);
        }
        if (var5 == 3) {
            class544.method8906(this.field2541 * arg0, this.field2541 * (63 - arg1) + this.field2541 - 1, this.field2541, arg3);
        }
    }
}
