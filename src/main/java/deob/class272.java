package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ke")
public class class272 {

    @ObfuscatedName("ke.ao")
    public static class300 field2947 = new class300(37748736, 256);

    @ObfuscatedName("ke.ah")
    public int field2953;

    @ObfuscatedName("ke.ar")
    public int field2949;

    @ObfuscatedName("ke.ab")
    public class266 field2945;

    @ObfuscatedName("ke.am")
    public LinkedList field2951;

    @ObfuscatedName("ke.av")
    public int field2952;

    @ObfuscatedName("ke.ag")
    public int field2954;

    @ObfuscatedName("ke.aa")
    public List field2957;

    @ObfuscatedName("ke.ap")
    public HashMap field2955;

    @ObfuscatedName("ke.ay")
    public final HashMap field2956;

    @ObfuscatedName("bz.ac(IIII)Lud;")
    public static class544 method470(int arg0, int arg1, int arg2) {
        class300 var3 = field2947;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class544) var3.method5255(var4);
    }

    @ObfuscatedName("ny.al(Lud;IIII)V")
    public static void method6162(class544 arg0, int arg1, int arg2, int arg3) {
        class300 var4 = field2947;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method5254(arg0, var6, arg0.field5235.length * 4);
    }

    @ObfuscatedName("fk.ak(I)V")
    public static void method2958() {
        field2947.method5270();
    }

    public class272(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2953 = arg0;
        this.field2949 = arg1;
        this.field2951 = new LinkedList();
        this.field2957 = new LinkedList();
        this.field2955 = new HashMap();
        this.field2952 = arg2 | 0xFF000000;
        this.field2956 = arg3;
    }

    @ObfuscatedName("ke.ax(IIIB)V")
    public void method4931(int arg0, int arg1, int arg2) {
        class544 var4 = method470(this.field2953, this.field2949, this.field2954);
        if (var4 == null) {
            return;
        }
        if (this.field2954 * 64 == arg2) {
            var4.method8821(arg0, arg1);
        } else {
            var4.method8844(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ke.ao(Lkj;Ljava/util/List;S)V")
    public void method5033(class266 arg0, List arg1) {
        this.field2955.clear();
        this.field2945 = arg0;
        this.method4928(arg1);
    }

    @ObfuscatedName("ke.ah(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4924(HashSet arg0, List arg1) {
        this.field2955.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class274 var4 = (class274) var3.next();
            if (var4.method5138() == this.field2953 && var4.method5143() == this.field2949) {
                this.field2951.add(var4);
            }
        }
        this.method4928(arg1);
    }

    @ObfuscatedName("ke.ar(IIIILkv;S)V")
    public void method4925(int arg0, int arg1, int arg2, int arg3, class280 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field3030; var8++) {
                    class282[] var9 = arg4.field3037[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class282[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class282 var12 = var10[var11];
                            class220 var13 = Statics.method2243(var12.field3048);
                            if (Statics.method2601(var13)) {
                                this.method4926(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ke.ab(Liz;IIILkv;I)V")
    public void method4926(class220 arg0, int arg1, int arg2, int arg3, class280 arg4) {
        class337 var6 = new class337(arg1, this.field2953 * 64 + arg2, this.field2949 * 64 + arg3);
        Object var7 = null;
        class337 var8;
        if (this.field2945 == null) {
            class274 var9 = (class274) arg4;
            var8 = new class337(var9.field3029 + arg1, var9.field3028 * 64 + arg2 + var9.method5095() * 8, var9.field3026 * 64 + arg3 + var9.method5108() * 8);
        } else {
            var8 = new class337(this.field2945.field3029 + arg1, this.field2945.field3028 * 64 + arg2, this.field2945.field3026 * 64 + arg3);
        }
        class289 var10;
        if (arg0.field2232 == null) {
            class195 var11 = class195.method2991(arg0.field2219);
            var10 = new class277(var8, var6, var11.field1956, this.method4952(var11));
        } else {
            var10 = new class269(var8, var6, arg0.field2198, this);
        }
        class195 var12 = class195.method2991(var10.method4809());
        if (var12.field1941) {
            this.field2955.put(new class337(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("ke.am(B)V")
    public void method4927() {
        Iterator var1 = this.field2955.values().iterator();
        while (var1.hasNext()) {
            class289 var2 = (class289) var1.next();
            if (var2 instanceof class269) {
                ((class269) var2).method4819();
            }
        }
    }

    @ObfuscatedName("ke.av(Ljava/util/List;I)V")
    public void method4928(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class277 var3 = (class277) var2.next();
            if (class195.method2991(var3.field2996).field1941 && var3.field3086.field3578 >> 6 == this.field2953 && var3.field3086.field3574 >> 6 == this.field2949) {
                class277 var4 = new class277(var3.field3086, var3.field3086, var3.field2996, this.method4951(var3.field2996));
                this.field2957.add(var4);
            }
        }
    }

    @ObfuscatedName("ke.ag(I)V")
    public void method4929() {
        if (this.field2945 != null) {
            this.field2945.method5155();
            return;
        }
        Iterator var1 = this.field2951.iterator();
        while (var1.hasNext()) {
            class274 var2 = (class274) var1.next();
            var2.method5155();
        }
    }

    @ObfuscatedName("ke.aa(Lom;B)Z")
    public boolean method4930(class374 arg0) {
        this.field2955.clear();
        if (this.field2945 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2951.iterator();
            while (var3.hasNext()) {
                class274 var4 = (class274) var3.next();
                var4.method5137(arg0);
                var2 &= var4.method5146();
            }
            if (var2) {
                Iterator var5 = this.field2951.iterator();
                while (var5.hasNext()) {
                    class274 var6 = (class274) var5.next();
                    this.method4925(var6.method5104() * 8, var6.method5098() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2945.method5137(arg0);
            if (this.field2945.method5146()) {
                this.method4925(0, 0, 64, 64, this.field2945);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ke.ap(ILlf;[Lun;Lom;Lom;B)V")
    public void method5044(int arg0, class293 arg1, class543[] arg2, class374 arg3, class374 arg4) {
        this.field2954 = arg0;
        if (this.field2945 == null && this.field2951.isEmpty() || method470(this.field2953, this.field2949, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4930(arg3);
        int var8;
        if (this.field2945 == null) {
            var8 = ((class280) this.field2951.getFirst()).field3031;
        } else {
            var8 = this.field2945.field3031;
        }
        boolean var9 = var7 & arg4.method6348(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method6269(var8);
        class283 var11 = class283.method7344(var10);
        class544 var12 = new class544(this.field2954 * 64, this.field2954 * 64);
        var12.method8892();
        if (this.field2945 == null) {
            this.method4935(arg1, arg2, var11);
        } else {
            this.method4934(arg1, arg2, var11);
        }
        method6162(var12, this.field2953, this.field2949, this.field2954);
        this.method4929();
    }

    @ObfuscatedName("ke.ay(IIILjava/util/HashSet;B)V")
    public void method4932(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4942(arg0, arg1, arg3, arg2);
        this.method4975(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ke.as(Ljava/util/HashSet;III)V")
    public void method4933(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2955.values().iterator();
        while (var4.hasNext()) {
            class289 var5 = (class289) var4.next();
            if (var5.method5184()) {
                int var6 = var5.method4809();
                if (arg0.contains(var6)) {
                    class195 var7 = class195.method2991(var6);
                    this.method4944(var7, var5.field3088, var5.field3087, arg1, arg2);
                }
            }
        }
        this.method4943(arg0, arg1, arg2);
    }

    @ObfuscatedName("ke.aj(Llf;[Lun;Lkc;I)V")
    public void method4934(class293 arg0, class543[] arg1, class283 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4937(var4, var5, this.field2945, arg0, arg2);
                this.method4989(var4, var5, this.field2945, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4970(var6, var7, this.field2945, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ke.an(Llf;[Lun;Lkc;I)V")
    public void method4935(class293 arg0, class543[] arg1, class283 arg2) {
        Iterator var4 = this.field2951.iterator();
        while (var4.hasNext()) {
            class274 var5 = (class274) var4.next();
            for (int var6 = var5.method5104() * 8; var6 < var5.method5104() * 8 + 8; var6++) {
                for (int var7 = var5.method5098() * 8; var7 < var5.method5098() * 8 + 8; var7++) {
                    this.method4937(var6, var7, var5, arg0, arg2);
                    this.method4989(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2951.iterator();
        while (var8.hasNext()) {
            class274 var9 = (class274) var8.next();
            for (int var10 = var9.method5104() * 8; var10 < var9.method5104() * 8 + 8; var10++) {
                for (int var11 = var9.method5098() * 8; var11 < var9.method5098() * 8 + 8; var11++) {
                    this.method4970(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ke.au(IILkv;Llf;[Lun;I)V")
    public void method4970(int arg0, int arg1, class280 arg2, class293 arg3, class543[] arg4) {
        this.method4941(arg0, arg1, arg2);
        this.method4940(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ke.ai(IILkv;Llf;Lkc;B)V")
    public void method4937(int arg0, int arg1, class280 arg2, class293 arg3, class283 arg4) {
        int var6 = arg2.field3033[0][arg0][arg1] - 1;
        int var7 = arg2.field3042[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class540.method8758(this.field2954 * arg0, this.field2954 * (63 - arg1), this.field2954, this.field2954, this.field2952);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = Statics.method2228(var7, this.field2952);
        }
        if (var7 > -1 && arg2.field3035[0][arg0][arg1] == 0) {
            class540.method8758(this.field2954 * arg0, this.field2954 * (63 - arg1), this.field2954, this.field2954, var8);
            return;
        }
        int var9 = this.method4939(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class540.method8758(this.field2954 * arg0, this.field2954 * (63 - arg1), this.field2954, this.field2954, var9);
        } else {
            arg3.method5243(this.field2954 * arg0, this.field2954 * (63 - arg1), var9, var8, this.field2954, this.field2954, arg2.field3035[0][arg0][arg1], arg2.field3036[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ke.ae(IILkv;Llf;S)V")
    public void method4989(int arg0, int arg1, class280 arg2, class293 arg3) {
        for (int var5 = 1; var5 < arg2.field3030; var5++) {
            int var6 = arg2.field3042[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = Statics.method2228(var6, this.field2952);
                if (arg2.field3035[var5][arg0][arg1] == 0) {
                    class540.method8758(this.field2954 * arg0, this.field2954 * (63 - arg1), this.field2954, this.field2954, var7);
                } else {
                    arg3.method5243(this.field2954 * arg0, this.field2954 * (63 - arg1), 0, var7, this.field2954, this.field2954, arg2.field3035[var5][arg0][arg1], arg2.field3036[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ke.aw(IILkv;Lkc;I)I")
    public int method4939(int arg0, int arg1, class280 arg2, class283 arg3) {
        return arg2.field3033[0][arg0][arg1] == 0 ? this.field2952 : arg3.method5165(arg0, arg1);
    }

    @ObfuscatedName("ke.aq(IILkv;[Lun;B)V")
    public void method4940(int arg0, int arg1, class280 arg2, class543[] arg3) {
        for (int var5 = 0; var5 < arg2.field3030; var5++) {
            class282[] var6 = arg2.field3037[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class282[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class282 var9 = var7[var8];
                    if (class356.method5340(var9.field3049) || class356.method3534(var9.field3049)) {
                        class220 var10 = Statics.method2243(var9.field3048);
                        if (var10.field2242 != -1) {
                            if (var10.field2242 == 46 || var10.field2242 == 52) {
                                arg3[var10.field2242].method8804(this.field2954 * arg0, this.field2954 * (63 - arg1), this.field2954 * 2 + 1, this.field2954 * 2 + 1);
                            } else {
                                arg3[var10.field2242].method8804(this.field2954 * arg0, this.field2954 * (63 - arg1), this.field2954 * 2, this.field2954 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ke.az(IILkv;I)V")
    public void method4941(int arg0, int arg1, class280 arg2) {
        for (int var4 = 0; var4 < arg2.field3030; var4++) {
            class282[] var5 = arg2.field3037[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class282[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class282 var8 = var6[var7];
                    if (class356.method1112(var8.field3049)) {
                        class220 var9 = Statics.method2243(var8.field3048);
                        int var10 = var9.field2210 == 0 ? -3355444 : -3407872;
                        if (class356.field3877.field3881 == var8.field3049) {
                            this.method5031(arg0, arg1, var8.field3050, var10);
                        }
                        if (class356.field3860.field3881 == var8.field3049) {
                            this.method5031(arg0, arg1, var8.field3050, -3355444);
                            this.method5031(arg0, arg1, var8.field3050 + 1, var10);
                        }
                        if (class356.field3861.field3881 == var8.field3049) {
                            if (var8.field3050 == 0) {
                                class540.method8708(this.field2954 * arg0, this.field2954 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3050 == 1) {
                                class540.method8708(this.field2954 * arg0 + this.field2954 - 1, this.field2954 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3050 == 2) {
                                class540.method8708(this.field2954 * arg0 + this.field2954 - 1, this.field2954 * (63 - arg1) + this.field2954 - 1, 1, var10);
                            }
                            if (var8.field3050 == 3) {
                                class540.method8708(this.field2954 * arg0, this.field2954 * (63 - arg1) + this.field2954 - 1, 1, var10);
                            }
                        }
                        if (class356.field3862.field3881 == var8.field3049) {
                            int var11 = var8.field3050 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2954; var12++) {
                                    class540.method8708(this.field2954 * arg0 + var12, this.field2954 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2954; var13++) {
                                    class540.method8708(this.field2954 * arg0 + var13, this.field2954 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ke.at(IILjava/util/HashSet;II)V")
    public void method4942(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2955.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class337 var9 = (class337) var8.getKey();
            int var10 = (int) ((float) var9.field3578 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3574 * var5 - var6);
            class289 var12 = (class289) var8.getValue();
            if (var12 != null && var12.method5184()) {
                var12.field3088 = var10;
                var12.field3087 = var11;
                class195 var13 = class195.method2991(var12.method4809());
                if (!arg2.contains(var13.method3346())) {
                    this.method4945(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ke.af(Ljava/util/HashSet;III)V")
    public void method4943(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2957.iterator();
        while (var4.hasNext()) {
            class289 var5 = (class289) var4.next();
            if (var5.method5184()) {
                class195 var6 = class195.method2991(var5.method4809());
                if (var6 != null && arg0.contains(var6.method3346())) {
                    this.method4944(var6, var5.field3088, var5.field3087, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ke.ad(Lhp;IIIII)V")
    public void method4944(class195 arg0, int arg1, int arg2, int arg3, int arg4) {
        class544 var6 = arg0.method3344(false);
        if (var6 == null) {
            return;
        }
        var6.method8823(arg1 - var6.field5237 / 2, arg2 - var6.field5239 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class540.method8775(arg1, arg2, 15, 16776960, 128);
            class540.method8775(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ke.bn(Lll;IIFI)V")
    public void method4945(class289 arg0, int arg1, int arg2, float arg3) {
        class195 var5 = class195.method2991(arg0.method4809());
        this.method4946(var5, arg1, arg2);
        this.method4947(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ke.bk(Lhp;IIS)V")
    public void method4946(class195 arg0, int arg1, int arg2) {
        class544 var4 = arg0.method3344(false);
        if (var4 != null) {
            int var5 = this.method4949(var4, arg0.field1950);
            int var6 = this.method4950(var4, arg0.field1932);
            var4.method8823(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ke.by(Lll;Lhp;IIFB)V")
    public void method4947(class289 arg0, class195 arg1, int arg2, int arg3, float arg4) {
        class284 var6 = arg0.method4808();
        if (var6 != null && var6.field3059.method4803(arg4)) {
            class409 var7 = (class409) this.field2956.get(var6.field3059);
            var7.method6958(var6.field3057, arg2 - var6.field3058 / 2, arg3, var6.field3058, var6.field3056, 0xFF000000 | arg1.field1954, 0, 1, 0, var7.field4536 / 2);
        }
    }

    @ObfuscatedName("ke.bd(IILjava/util/HashSet;IB)V")
    public void method4975(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2957.iterator();
        while (var6.hasNext()) {
            class289 var7 = (class289) var6.next();
            if (var7.method5184()) {
                int var8 = var7.field3086.field3578 % 64;
                int var9 = var7.field3086.field3574 % 64;
                var7.field3088 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3087 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4809())) {
                    this.method4945(var7, var7.field3088, var7.field3087, var5);
                }
            }
        }
    }

    @ObfuscatedName("ke.be(Lud;Lhb;B)I")
    public int method4949(class544 arg0, class204 arg1) {
        switch(arg1.field2031) {
            case 0:
                return -arg0.field5237 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field5237;
        }
    }

    @ObfuscatedName("ke.bv(Lud;Lhr;I)I")
    public int method4950(class544 arg0, class208 arg1) {
        switch(arg1.field2100) {
            case 0:
                return -arg0.field5239 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field5239;
        }
    }

    @ObfuscatedName("ke.bz(IB)Lkd;")
    public class284 method4951(int arg0) {
        class195 var2 = class195.method2991(arg0);
        return this.method4952(var2);
    }

    @ObfuscatedName("ke.bb(Lhp;I)Lkd;")
    public class284 method4952(class195 arg0) {
        if (arg0.field1937 == null || this.field2956 == null || this.field2956.get(class268.field2908) == null) {
            return null;
        }
        class268 var2 = class268.method4797(arg0.field1939);
        if (var2 == null) {
            return null;
        }
        class409 var3 = (class409) this.field2956.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method6986(arg0.field1937, 1000000);
        String[] var5 = new String[var4];
        var3.method6949(arg0.field1937, (int[]) null, var5);
        int var6 = var5.length * var3.field4536 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method6948(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class284(arg0.field1937, var7, var6, var2);
    }

    @ObfuscatedName("ke.bo(IIIIII)Ljava/util/List;")
    public List method4953(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2955.values().iterator();
            while (var7.hasNext()) {
                class289 var8 = (class289) var7.next();
                if (var8.method5184() && var8.method5183(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2957.iterator();
            while (var9.hasNext()) {
                class289 var10 = (class289) var9.next();
                if (var10.method5184() && var10.method5183(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ke.bp(I)Ljava/util/List;")
    public List method4954() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2957);
        var1.addAll(this.field2955.values());
        return var1;
    }

    @ObfuscatedName("ke.bt(IIIII)V")
    public void method5031(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class540.method8710(this.field2954 * arg0, this.field2954 * (63 - arg1), this.field2954, arg3);
        }
        if (var5 == 1) {
            class540.method8708(this.field2954 * arg0, this.field2954 * (63 - arg1), this.field2954, arg3);
        }
        if (var5 == 2) {
            class540.method8710(this.field2954 * arg0 + this.field2954 - 1, this.field2954 * (63 - arg1), this.field2954, arg3);
        }
        if (var5 == 3) {
            class540.method8708(this.field2954 * arg0, this.field2954 * (63 - arg1) + this.field2954 - 1, this.field2954, arg3);
        }
    }
}
