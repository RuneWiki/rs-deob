package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("kb")
public class class286 {

    @ObfuscatedName("kb.ai")
    public static class314 field3125 = new class314(37748736, 256);

    @ObfuscatedName("kb.ay")
    public int field3135;

    @ObfuscatedName("kb.as")
    public int field3126;

    @ObfuscatedName("kb.ae")
    public class280 field3124;

    @ObfuscatedName("kb.am")
    public LinkedList field3134;

    @ObfuscatedName("kb.at")
    public int field3129;

    @ObfuscatedName("kb.au")
    public int field3130;

    @ObfuscatedName("kb.an")
    public List field3136;

    @ObfuscatedName("kb.ao")
    public HashMap field3132;

    @ObfuscatedName("kb.af")
    public final HashMap field3133;

    @ObfuscatedName("ie.ap(IIII)J")
    public static long method4369(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("oh.aw(Lvv;IIII)V")
    public static void method6879(class572 arg0, int arg1, int arg2, int arg3) {
        field3125.method5905(arg0, method4369(arg1, arg2, arg3), arg0.field5567.length * 4);
    }

    @ObfuscatedName("eq.ak(B)V")
    public static void method3154() {
        field3125.method5906(5);
    }

    public class286(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field3135 = arg0;
        this.field3126 = arg1;
        this.field3134 = new LinkedList();
        this.field3136 = new LinkedList();
        this.field3132 = new HashMap();
        this.field3129 = arg2 | 0xFF000000;
        this.field3133 = arg3;
    }

    @ObfuscatedName("kb.aj(IIII)V")
    public void method5571(int arg0, int arg1, int arg2) {
        int var4 = this.field3135;
        int var5 = this.field3126;
        int var6 = this.field3130;
        class572 var7 = (class572) field3125.method5901(method4369(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field3130 * 64 == arg2) {
            var7.method9740(arg0, arg1);
        } else {
            var7.method9763(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("kb.ai(Lkw;Ljava/util/List;I)V")
    public void method5643(class280 arg0, List arg1) {
        this.field3132.clear();
        this.field3124 = arg0;
        this.method5577(arg1);
    }

    @ObfuscatedName("kb.ay(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method5604(HashSet arg0, List arg1) {
        this.field3132.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class288 var4 = (class288) var3.next();
            if (var4.method5776() == this.field3135 && var4.method5782() == this.field3126) {
                this.field3134.add(var4);
            }
        }
        this.method5577(arg1);
    }

    @ObfuscatedName("kb.as(IIIILlk;I)V")
    public void method5574(int arg0, int arg1, int arg2, int arg3, class294 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field3203; var8++) {
                    class296[] var9 = arg4.field3213[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class296[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class296 var12 = var10[var11];
                            class210 var13 = class210.method3109(var12.field3224);
                            if (method4935(var13)) {
                                this.method5575(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kb.ae(Lir;IIILlk;I)V")
    public void method5575(class210 arg0, int arg1, int arg2, int arg3, class294 arg4) {
        class351 var6 = new class351(arg1, this.field3135 * 64 + arg2, this.field3126 * 64 + arg3);
        Object var7 = null;
        class351 var8;
        if (this.field3124 == null) {
            class288 var9 = (class288) arg4;
            var8 = new class351(var9.field3210 + arg1, var9.field3216 * 64 + arg2 + var9.method5730() * 8, var9.field3202 * 64 + arg3 + var9.method5746() * 8);
        } else {
            var8 = new class351(this.field3124.field3210 + arg1, this.field3124.field3216 * 64 + arg2, this.field3124.field3202 * 64 + arg3);
        }
        class303 var10;
        if (arg0.field2178 == null) {
            class184 var11 = class184.method174(arg0.field2200);
            var10 = new class291(var8, var6, var11.field1911, this.method5592(var11));
        } else {
            var10 = new class283(var8, var6, arg0.field2179, this);
        }
        class184 var12 = class184.method174(var10.method5469());
        if (var12.field1908) {
            this.field3132.put(new class351(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("kb.am(I)V")
    public void method5576() {
        Iterator var1 = this.field3132.values().iterator();
        while (var1.hasNext()) {
            class303 var2 = (class303) var1.next();
            if (var2 instanceof class283) {
                ((class283) var2).method5460();
            }
        }
    }

    @ObfuscatedName("kb.at(Ljava/util/List;I)V")
    public void method5577(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class291 var3 = (class291) var2.next();
            if (class184.method174(var3.field3177).field1908 && var3.field3260.field3777 >> 6 == this.field3135 && var3.field3260.field3778 >> 6 == this.field3126) {
                class291 var4 = new class291(var3.field3260, var3.field3260, var3.field3177, this.method5599(var3.field3177));
                this.field3136.add(var4);
            }
        }
    }

    @ObfuscatedName("kb.au(I)V")
    public void method5578() {
        if (this.field3124 != null) {
            this.field3124.method5793();
            return;
        }
        Iterator var1 = this.field3134.iterator();
        while (var1.hasNext()) {
            class288 var2 = (class288) var1.next();
            var2.method5793();
        }
    }

    @ObfuscatedName("kb.an(Lpe;B)Z")
    public boolean method5579(class392 arg0) {
        this.field3132.clear();
        if (this.field3124 == null) {
            boolean var2 = true;
            Iterator var3 = this.field3134.iterator();
            while (var3.hasNext()) {
                class288 var4 = (class288) var3.next();
                var4.method5774(arg0);
                var2 &= var4.method5786();
            }
            if (var2) {
                Iterator var5 = this.field3134.iterator();
                while (var5.hasNext()) {
                    class288 var6 = (class288) var5.next();
                    this.method5574(var6.method5732() * 8, var6.method5731() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field3124.method5774(arg0);
            if (this.field3124.method5786()) {
                this.method5574(0, 0, 64, 64, this.field3124);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("kb.ao(ILll;[Lvc;Lpe;Lpe;D)V")
    public void method5580(int arg0, class307 arg1, class571[] arg2, class392 arg3, class392 arg4, double arg5) {
        this.field3130 = arg0;
        if (this.field3124 == null && this.field3134.isEmpty()) {
            return;
        }
        int var8 = this.field3135;
        int var9 = this.field3126;
        class572 var10 = (class572) field3125.method5901(method4369(var8, var9, arg0));
        if (var10 != null) {
            return;
        }
        if (class240.method4497() != arg5) {
            class240.method4494(arg5);
        }
        boolean var11 = true;
        boolean var12 = var11 & this.method5579(arg3);
        int var13;
        if (this.field3124 == null) {
            var13 = ((class294) this.field3134.getFirst()).field3207;
        } else {
            var13 = this.field3124.field3207;
        }
        boolean var14 = var12 & arg4.method6991(var13);
        if (!var14) {
            return;
        }
        byte[] var15 = arg4.method7052(var13);
        class297 var16;
        if (var15 == null) {
            var16 = new class297();
        } else {
            var16 = new class297(class31.method8331(var15).field5567);
        }
        class572 var18 = new class572(this.field3130 * 64, this.field3130 * 64);
        var18.method9733();
        if (this.field3124 == null) {
            this.method5591(arg1, arg2, var16);
        } else {
            this.method5583(arg1, arg2, var16);
        }
        method6879(var18, this.field3135, this.field3126, this.field3130);
        this.method5578();
    }

    @ObfuscatedName("kb.af(IIILjava/util/HashSet;B)V")
    public void method5590(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method5584(arg0, arg1, arg3, arg2);
        this.method5596(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("kb.ar(Ljava/util/HashSet;III)V")
    public void method5582(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3132.values().iterator();
        while (var4.hasNext()) {
            class303 var5 = (class303) var4.next();
            if (var5.method5824()) {
                int var6 = var5.method5469();
                if (arg0.contains(var6)) {
                    class184 var7 = class184.method174(var6);
                    this.method5593(var7, var5.field3261, var5.field3262, arg1, arg2);
                }
            }
        }
        this.method5570(arg0, arg1, arg2);
    }

    @ObfuscatedName("kb.ab(Lll;[Lvc;Lld;I)V")
    public void method5583(class307 arg0, class571[] arg1, class297 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method5586(var4, var5, this.field3124, arg0, arg2);
                this.method5587(var4, var5, this.field3124, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method5585(var6, var7, this.field3124, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("kb.az(Lll;[Lvc;Lld;I)V")
    public void method5591(class307 arg0, class571[] arg1, class297 arg2) {
        Iterator var4 = this.field3134.iterator();
        while (var4.hasNext()) {
            class288 var5 = (class288) var4.next();
            for (int var6 = var5.method5732() * 8; var6 < var5.method5732() * 8 + 8; var6++) {
                for (int var7 = var5.method5731() * 8; var7 < var5.method5731() * 8 + 8; var7++) {
                    this.method5586(var6, var7, var5, arg0, arg2);
                    this.method5587(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field3134.iterator();
        while (var8.hasNext()) {
            class288 var9 = (class288) var8.next();
            for (int var10 = var9.method5732() * 8; var10 < var9.method5732() * 8 + 8; var10++) {
                for (int var11 = var9.method5731() * 8; var11 < var9.method5731() * 8 + 8; var11++) {
                    this.method5585(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("kb.ag(IILlk;Lll;[Lvc;B)V")
    public void method5585(int arg0, int arg1, class294 arg2, class307 arg3, class571[] arg4) {
        this.method5676(arg0, arg1, arg2);
        this.method5589(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("kb.ad(IILlk;Lll;Lld;I)V")
    public void method5586(int arg0, int arg1, class294 arg2, class307 arg3, class297 arg4) {
        int var6 = arg2.field3206[0][arg0][arg1] - 1;
        int var7 = arg2.field3201[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class568.method9616(this.field3130 * arg0, this.field3130 * (63 - arg1), this.field3130, this.field3130, this.field3129);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class301.method3227(var7, this.field3129);
        }
        if (var7 > -1 && arg2.field3211[0][arg0][arg1] == 0) {
            class568.method9616(this.field3130 * arg0, this.field3130 * (63 - arg1), this.field3130, this.field3130, var8);
            return;
        }
        int var9 = this.method5619(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class568.method9616(this.field3130 * arg0, this.field3130 * (63 - arg1), this.field3130, this.field3130, var9);
        } else {
            arg3.method5848(this.field3130 * arg0, this.field3130 * (63 - arg1), var9, var8, this.field3130, this.field3130, arg2.field3211[0][arg0][arg1], arg2.field3212[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("kb.ac(IILlk;Lll;I)V")
    public void method5587(int arg0, int arg1, class294 arg2, class307 arg3) {
        for (int var5 = 1; var5 < arg2.field3203; var5++) {
            int var6 = arg2.field3201[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class301.method3227(var6, this.field3129);
                if (arg2.field3211[var5][arg0][arg1] == 0) {
                    class568.method9616(this.field3130 * arg0, this.field3130 * (63 - arg1), this.field3130, this.field3130, var7);
                } else {
                    arg3.method5848(this.field3130 * arg0, this.field3130 * (63 - arg1), 0, var7, this.field3130, this.field3130, arg2.field3211[var5][arg0][arg1], arg2.field3212[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("kb.av(IILlk;Lld;I)I")
    public int method5619(int arg0, int arg1, class294 arg2, class297 arg3) {
        return arg2.field3206[0][arg0][arg1] == 0 ? this.field3129 : arg3.method5800(arg0, arg1);
    }

    @ObfuscatedName("kb.ax(IILlk;[Lvc;I)V")
    public void method5589(int arg0, int arg1, class294 arg2, class571[] arg3) {
        for (int var5 = 0; var5 < arg2.field3203; var5++) {
            class296[] var6 = arg2.field3213[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class296[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class296 var9 = var7[var8];
                    int var10 = var9.field3225;
                    boolean var11 = var10 >= class371.field4063.field4086 && var10 <= class371.field4084.field4086;
                    if (var11 || class371.method6911(var9.field3225)) {
                        class210 var12 = class210.method3109(var9.field3224);
                        if (var12.field2201 != -1) {
                            int var13 = var9.field3226 == 1 || var9.field3226 == 3 ? var12.field2187 : var12.field2216;
                            arg3[var12.field2201].method9715(this.field3130 * arg0, this.field3130 * (64 - var13 - arg1), this.field3130 * 2, this.field3130 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kb.aq(IILlk;I)V")
    public void method5676(int arg0, int arg1, class294 arg2) {
        for (int var4 = 0; var4 < arg2.field3203; var4++) {
            class296[] var5 = arg2.field3213[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class296[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class296 var8 = var6[var7];
                    int var9 = var8.field3225;
                    boolean var10 = var9 >= class371.field4067.field4086 && var9 <= class371.field4066.field4086 || class371.field4081.field4086 == var9;
                    if (var10) {
                        class210 var11 = class210.method3109(var8.field3224);
                        int var12 = var11.field2194 == 0 ? -3355444 : -3407872;
                        if (class371.field4067.field4086 == var8.field3225) {
                            this.method5603(arg0, arg1, var8.field3226, var12);
                        }
                        if (class371.field4065.field4086 == var8.field3225) {
                            this.method5603(arg0, arg1, var8.field3226, -3355444);
                            this.method5603(arg0, arg1, var8.field3226 + 1, var12);
                        }
                        if (class371.field4066.field4086 == var8.field3225) {
                            if (var8.field3226 == 0) {
                                class568.method9622(this.field3130 * arg0, this.field3130 * (63 - arg1), 1, var12);
                            }
                            if (var8.field3226 == 1) {
                                class568.method9622(this.field3130 * arg0 + this.field3130 - 1, this.field3130 * (63 - arg1), 1, var12);
                            }
                            if (var8.field3226 == 2) {
                                class568.method9622(this.field3130 * arg0 + this.field3130 - 1, this.field3130 * (63 - arg1) + this.field3130 - 1, 1, var12);
                            }
                            if (var8.field3226 == 3) {
                                class568.method9622(this.field3130 * arg0, this.field3130 * (63 - arg1) + this.field3130 - 1, 1, var12);
                            }
                        }
                        if (class371.field4081.field4086 == var8.field3225) {
                            int var13 = var8.field3226 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field3130; var14++) {
                                    class568.method9622(this.field3130 * arg0 + var14, this.field3130 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field3130; var15++) {
                                    class568.method9622(this.field3130 * arg0 + var15, this.field3130 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kb.al(IILjava/util/HashSet;IB)V")
    public void method5584(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field3132.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class351 var9 = (class351) var8.getKey();
            int var10 = (int) ((float) var9.field3777 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3778 * var5 - var6);
            class303 var12 = (class303) var8.getValue();
            if (var12 != null && var12.method5824()) {
                var12.field3261 = var10;
                var12.field3262 = var11;
                class184 var13 = class184.method174(var12.method5469());
                if (!arg2.contains(var13.method3625())) {
                    this.method5594(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("kb.aa(Ljava/util/HashSet;IIB)V")
    public void method5570(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3136.iterator();
        while (var4.hasNext()) {
            class303 var5 = (class303) var4.next();
            if (var5.method5824()) {
                class184 var6 = class184.method174(var5.method5469());
                if (var6 != null && arg0.contains(var6.method3625())) {
                    this.method5593(var6, var5.field3261, var5.field3262, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("kb.ah(Lhc;IIIII)V")
    public void method5593(class184 arg0, int arg1, int arg2, int arg3, int arg4) {
        class572 var6 = arg0.method3615(false);
        if (var6 == null) {
            return;
        }
        var6.method9825(arg1 - var6.field5558 / 2, arg2 - var6.field5559 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class568.method9614(arg1, arg2, 15, 16776960, 128);
            class568.method9614(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("kb.bh(Llx;IIFI)V")
    public void method5594(class303 arg0, int arg1, int arg2, float arg3) {
        class184 var5 = class184.method174(arg0.method5469());
        this.method5588(var5, arg1, arg2);
        this.method5679(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("kb.bj(Lhc;IIB)V")
    public void method5588(class184 arg0, int arg1, int arg2) {
        class572 var4 = arg0.method3615(false);
        if (var4 != null) {
            int var5 = this.method5597(var4, arg0.field1932);
            int var6 = this.method5598(var4, arg0.field1927);
            var4.method9825(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("kb.bv(Llx;Lhc;IIFB)V")
    public void method5679(class303 arg0, class184 arg1, int arg2, int arg3, float arg4) {
        class298 var6 = arg0.method5473();
        if (var6 != null && var6.field3236.method5449(arg4)) {
            class436 var7 = (class436) this.field3133.get(var6.field3236);
            var7.method8009(var6.field3234, arg2 - var6.field3235 / 2, arg3, var6.field3235, var6.field3237, 0xFF000000 | arg1.field1915, 0, 1, 0, var7.field4851 / 2);
        }
    }

    @ObfuscatedName("kb.bx(IILjava/util/HashSet;II)V")
    public void method5596(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field3136.iterator();
        while (var6.hasNext()) {
            class303 var7 = (class303) var6.next();
            if (var7.method5824()) {
                int var8 = var7.field3260.field3777 % 64;
                int var9 = var7.field3260.field3778 % 64;
                var7.field3261 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3262 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method5469())) {
                    this.method5594(var7, var7.field3261, var7.field3262, var5);
                }
            }
        }
    }

    @ObfuscatedName("kb.bk(Lvv;Lhi;I)I")
    public int method5597(class572 arg0, class193 arg1) {
        switch(arg1.field1988) {
            case 1:
                return 0;
            case 2:
                return -arg0.field5558 / 2;
            default:
                return -arg0.field5558;
        }
    }

    @ObfuscatedName("kb.bb(Lvv;Lhm;I)I")
    public int method5598(class572 arg0, class197 arg1) {
        switch(arg1.field2058) {
            case 0:
                return 0;
            case 1:
                return -arg0.field5559 / 2;
            default:
                return -arg0.field5559;
        }
    }

    @ObfuscatedName("jv.bq(Lir;B)Z")
    public static boolean method4935(class210 arg0) {
        if (arg0.field2178 != null) {
            int[] var1 = arg0.field2178;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class210 var4 = class210.method3109(var3);
                if (var4.field2200 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2200 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("kb.bp(IB)Llp;")
    public class298 method5599(int arg0) {
        class184 var2 = class184.method174(arg0);
        return this.method5592(var2);
    }

    @ObfuscatedName("kb.bz(Lhc;I)Llp;")
    public class298 method5592(class184 arg0) {
        if (arg0.field1914 == null || this.field3133 == null || this.field3133.get(class282.field3087) == null) {
            return null;
        }
        class282 var2 = class282.method5450(arg0.field1922);
        if (var2 == null) {
            return null;
        }
        class436 var3 = (class436) this.field3133.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method7931(arg0.field1914, 1000000);
        String[] var5 = new String[var4];
        var3.method7927(arg0.field1914, (int[]) null, var5);
        int var6 = var5.length * var3.field4851 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method7933(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class298(arg0.field1914, var7, var6, var2);
    }

    @ObfuscatedName("kb.bc(IIIIII)Ljava/util/List;")
    public List method5601(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field3132.values().iterator();
            while (var7.hasNext()) {
                class303 var8 = (class303) var7.next();
                if (var8.method5824() && var8.method5825(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field3136.iterator();
            while (var9.hasNext()) {
                class303 var10 = (class303) var9.next();
                if (var10.method5824() && var10.method5825(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("kb.by(I)Ljava/util/List;")
    public List method5602() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field3136);
        var1.addAll(this.field3132.values());
        return var1;
    }

    @ObfuscatedName("kb.br(IIIIB)V")
    public void method5603(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class568.method9624(this.field3130 * arg0, this.field3130 * (63 - arg1), this.field3130, arg3);
        }
        if (var5 == 1) {
            class568.method9622(this.field3130 * arg0, this.field3130 * (63 - arg1), this.field3130, arg3);
        }
        if (var5 == 2) {
            class568.method9624(this.field3130 * arg0 + this.field3130 - 1, this.field3130 * (63 - arg1), this.field3130, arg3);
        }
        if (var5 == 3) {
            class568.method9622(this.field3130 * arg0, this.field3130 * (63 - arg1) + this.field3130 - 1, this.field3130, arg3);
        }
    }
}
