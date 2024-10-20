package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ks")
public class class282 {

    @ObfuscatedName("ks.af")
    public static class310 field3097 = new class310(37748736, 256);

    @ObfuscatedName("ks.aa")
    public int field3088;

    @ObfuscatedName("ks.at")
    public int field3089;

    @ObfuscatedName("ks.ab")
    public class276 field3090;

    @ObfuscatedName("ks.ac")
    public LinkedList field3091;

    @ObfuscatedName("ks.ao")
    public int field3100;

    @ObfuscatedName("ks.ah")
    public int field3095;

    @ObfuscatedName("ks.av")
    public List field3093;

    @ObfuscatedName("ks.aq")
    public HashMap field3084;

    @ObfuscatedName("ks.ap")
    public final HashMap field3096;

    @ObfuscatedName("ck.ak(IIII)Lvc;")
    public static class560 method1022(int arg0, int arg1, int arg2) {
        class310 var3 = field3097;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class560) var3.method5526(var4);
    }

    @ObfuscatedName("gi.al(Lvc;IIIB)V")
    public static void method3360(class560 arg0, int arg1, int arg2, int arg3) {
        class310 var4 = field3097;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method5532(arg0, var6, arg0.field5445.length * 4);
    }

    @ObfuscatedName("lo.aj(I)V")
    public static void method5446() {
        field3097.method5531(5);
    }

    public class282(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field3088 = arg0;
        this.field3089 = arg1;
        this.field3091 = new LinkedList();
        this.field3093 = new LinkedList();
        this.field3084 = new HashMap();
        this.field3100 = arg2 | 0xFF000000;
        this.field3096 = arg3;
    }

    @ObfuscatedName("ks.az(IIII)V")
    public void method5193(int arg0, int arg1, int arg2) {
        class560 var4 = method1022(this.field3088, this.field3089, this.field3095);
        if (var4 == null) {
            return;
        }
        if (this.field3095 * 64 == arg2) {
            var4.method9225(arg0, arg1);
        } else {
            var4.method9214(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ks.af(Lkv;Ljava/util/List;I)V")
    public void method5194(class276 arg0, List arg1) {
        this.field3084.clear();
        this.field3090 = arg0;
        this.method5289(arg1);
    }

    @ObfuscatedName("ks.aa(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method5195(HashSet arg0, List arg1) {
        this.field3084.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class284 var4 = (class284) var3.next();
            if (var4.method5392() == this.field3088 && var4.method5396() == this.field3089) {
                this.field3091.add(var4);
            }
        }
        this.method5289(arg1);
    }

    @ObfuscatedName("ks.at(IIIILlq;I)V")
    public void method5301(int arg0, int arg1, int arg2, int arg3, class290 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field3176; var8++) {
                    class292[] var9 = arg4.field3183[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class292[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class224 var13;
                            boolean var18;
                            label58: {
                                class292 var12 = var10[var11];
                                var13 = class224.method3868(var12.field3195);
                                if (var13.field2317 != null) {
                                    int[] var14 = var13.field2317;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class224 var17 = class224.method3868(var16);
                                        if (var17.field2311 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field2311 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method5226(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ks.ab(Lin;IIILlq;I)V")
    public void method5226(class224 arg0, int arg1, int arg2, int arg3, class290 arg4) {
        class347 var6 = new class347(arg1, this.field3088 * 64 + arg2, this.field3089 * 64 + arg3);
        Object var7 = null;
        class347 var8;
        if (this.field3090 == null) {
            class284 var9 = (class284) arg4;
            var8 = new class347(var9.field3175 + arg1, var9.field3173 * 64 + arg2 + var9.method5357() * 8, var9.field3172 * 64 + arg3 + var9.method5367() * 8);
        } else {
            var8 = new class347(this.field3090.field3175 + arg1, this.field3090.field3173 * 64 + arg2, this.field3090.field3172 * 64 + arg3);
        }
        class299 var10;
        if (arg0.field2317 == null) {
            class199 var11 = class199.method3551(arg0.field2311);
            var10 = new class287(var8, var6, var11.field2018, this.method5223(var11));
        } else {
            var10 = new class279(var8, var6, arg0.field2283, this);
        }
        class199 var12 = class199.method3551(var10.method5061());
        if (var12.field2025) {
            this.field3084.put(new class347(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("ks.ac(I)V")
    public void method5239() {
        Iterator var1 = this.field3084.values().iterator();
        while (var1.hasNext()) {
            class299 var2 = (class299) var1.next();
            if (var2 instanceof class279) {
                ((class279) var2).method5071();
            }
        }
    }

    @ObfuscatedName("ks.ao(Ljava/util/List;B)V")
    public void method5289(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class287 var3 = (class287) var2.next();
            if (class199.method3551(var3.field3148).field2025 && var3.field3231.field3714 >> 6 == this.field3088 && var3.field3231.field3713 >> 6 == this.field3089) {
                class287 var4 = new class287(var3.field3231, var3.field3231, var3.field3148, this.method5222(var3.field3148));
                this.field3093.add(var4);
            }
        }
    }

    @ObfuscatedName("ks.ah(B)V")
    public void method5200() {
        if (this.field3090 != null) {
            this.field3090.method5410();
            return;
        }
        Iterator var1 = this.field3091.iterator();
        while (var1.hasNext()) {
            class284 var2 = (class284) var1.next();
            var2.method5410();
        }
    }

    @ObfuscatedName("ks.av(Lor;I)Z")
    public boolean method5201(class387 arg0) {
        this.field3084.clear();
        if (this.field3090 == null) {
            boolean var2 = true;
            Iterator var3 = this.field3091.iterator();
            while (var3.hasNext()) {
                class284 var4 = (class284) var3.next();
                var4.method5394(arg0);
                var2 &= var4.method5393();
            }
            if (var2) {
                Iterator var5 = this.field3091.iterator();
                while (var5.hasNext()) {
                    class284 var6 = (class284) var5.next();
                    this.method5301(var6.method5358() * 8, var6.method5359() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field3090.method5394(arg0);
            if (this.field3090.method5393()) {
                this.method5301(0, 0, 64, 64, this.field3090);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ks.aq(ILlr;[Lvl;Lor;Lor;I)V")
    public void method5293(int arg0, class303 arg1, class559[] arg2, class387 arg3, class387 arg4) {
        this.field3095 = arg0;
        if (this.field3090 == null && this.field3091.isEmpty() || method1022(this.field3088, this.field3089, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method5201(arg3);
        int var8;
        if (this.field3090 == null) {
            var8 = ((class290) this.field3091.getFirst()).field3178;
        } else {
            var8 = this.field3090.field3178;
        }
        boolean var9 = var7 & arg4.method6576(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method6577(var8);
        class293 var11;
        if (var10 == null) {
            var11 = new class293();
        } else {
            var11 = new class293(class31.method7694(var10).field5445);
        }
        class560 var13 = new class560(this.field3095 * 64, this.field3095 * 64);
        var13.method9218();
        if (this.field3090 == null) {
            this.method5206(arg1, arg2, var11);
        } else {
            this.method5196(arg1, arg2, var11);
        }
        method3360(var13, this.field3088, this.field3089, this.field3095);
        this.method5200();
    }

    @ObfuscatedName("ks.ap(IIILjava/util/HashSet;I)V")
    public void method5243(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method5213(arg0, arg1, arg3, arg2);
        this.method5219(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ks.ae(Ljava/util/HashSet;III)V")
    public void method5204(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3084.values().iterator();
        while (var4.hasNext()) {
            class299 var5 = (class299) var4.next();
            if (var5.method5447()) {
                int var6 = var5.method5061();
                if (arg0.contains(var6)) {
                    class199 var7 = class199.method3551(var6);
                    this.method5215(var7, var5.field3225, var5.field3227, arg1, arg2);
                }
            }
        }
        this.method5267(arg0, arg1, arg2);
    }

    @ObfuscatedName("ks.ax(Llr;[Lvl;Llu;I)V")
    public void method5196(class303 arg0, class559[] arg1, class293 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method5208(var4, var5, this.field3090, arg0, arg2);
                this.method5209(var4, var5, this.field3090, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method5249(var6, var7, this.field3090, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ks.ay(Llr;[Lvl;Llu;B)V")
    public void method5206(class303 arg0, class559[] arg1, class293 arg2) {
        Iterator var4 = this.field3091.iterator();
        while (var4.hasNext()) {
            class284 var5 = (class284) var4.next();
            for (int var6 = var5.method5358() * 8; var6 < var5.method5358() * 8 + 8; var6++) {
                for (int var7 = var5.method5359() * 8; var7 < var5.method5359() * 8 + 8; var7++) {
                    this.method5208(var6, var7, var5, arg0, arg2);
                    this.method5209(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field3091.iterator();
        while (var8.hasNext()) {
            class284 var9 = (class284) var8.next();
            for (int var10 = var9.method5358() * 8; var10 < var9.method5358() * 8 + 8; var10++) {
                for (int var11 = var9.method5359() * 8; var11 < var9.method5359() * 8 + 8; var11++) {
                    this.method5249(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ks.au(IILlq;Llr;[Lvl;I)V")
    public void method5249(int arg0, int arg1, class290 arg2, class303 arg3, class559[] arg4) {
        this.method5212(arg0, arg1, arg2);
        this.method5205(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ks.as(IILlq;Llr;Llu;I)V")
    public void method5208(int arg0, int arg1, class290 arg2, class303 arg3, class293 arg4) {
        int var6 = arg2.field3179[0][arg0][arg1] - 1;
        int var7 = arg2.field3180[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class556.method9112(this.field3095 * arg0, this.field3095 * (63 - arg1), this.field3095, this.field3095, this.field3100);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class297.method4746(var7, this.field3100);
        }
        if (var7 > -1 && arg2.field3171[0][arg0][arg1] == 0) {
            class556.method9112(this.field3095 * arg0, this.field3095 * (63 - arg1), this.field3095, this.field3095, var8);
            return;
        }
        int var9 = this.method5210(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class556.method9112(this.field3095 * arg0, this.field3095 * (63 - arg1), this.field3095, this.field3095, var9);
        } else {
            arg3.method5500(this.field3095 * arg0, this.field3095 * (63 - arg1), var9, var8, this.field3095, this.field3095, arg2.field3171[0][arg0][arg1], arg2.field3182[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ks.aw(IILlq;Llr;I)V")
    public void method5209(int arg0, int arg1, class290 arg2, class303 arg3) {
        for (int var5 = 1; var5 < arg2.field3176; var5++) {
            int var6 = arg2.field3180[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class297.method4746(var6, this.field3100);
                if (arg2.field3171[var5][arg0][arg1] == 0) {
                    class556.method9112(this.field3095 * arg0, this.field3095 * (63 - arg1), this.field3095, this.field3095, var7);
                } else {
                    arg3.method5500(this.field3095 * arg0, this.field3095 * (63 - arg1), 0, var7, this.field3095, this.field3095, arg2.field3171[var5][arg0][arg1], arg2.field3182[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ks.ad(IILlq;Llu;I)I")
    public int method5210(int arg0, int arg1, class290 arg2, class293 arg3) {
        return arg2.field3179[0][arg0][arg1] == 0 ? this.field3100 : arg3.method5425(arg0, arg1);
    }

    @ObfuscatedName("ks.ai(IILlq;[Lvl;I)V")
    public void method5205(int arg0, int arg1, class290 arg2, class559[] arg3) {
        for (int var5 = 0; var5 < arg2.field3176; var5++) {
            class292[] var6 = arg2.field3183[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class292[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class292 var9 = var7[var8];
                    if (!Statics.method4964(var9.field3194)) {
                        int var10 = var9.field3194;
                        boolean var11 = class367.field4016.field4017 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class224 var12 = class224.method3868(var9.field3195);
                    if (var12.field2305 != -1) {
                        if (var12.field2305 == 46 || var12.field2305 == 52) {
                            arg3[var12.field2305].method9198(this.field3095 * arg0, this.field3095 * (63 - arg1), this.field3095 * 2 + 1, this.field3095 * 2 + 1);
                        } else {
                            arg3[var12.field2305].method9198(this.field3095 * arg0, this.field3095 * (63 - arg1), this.field3095 * 2, this.field3095 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ks.an(IILlq;B)V")
    public void method5212(int arg0, int arg1, class290 arg2) {
        for (int var4 = 0; var4 < arg2.field3176; var4++) {
            class292[] var5 = arg2.field3183[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class292[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class292 var8 = var6[var7];
                    if (class367.method4201(var8.field3194)) {
                        class224 var9 = class224.method3868(var8.field3195);
                        int var10 = var9.field2293 == 0 ? -3355444 : -3407872;
                        if (class367.field4011.field4017 == var8.field3194) {
                            this.method5298(arg0, arg1, var8.field3193, var10);
                        }
                        if (class367.field3996.field4017 == var8.field3194) {
                            this.method5298(arg0, arg1, var8.field3193, -3355444);
                            this.method5298(arg0, arg1, var8.field3193 + 1, var10);
                        }
                        if (class367.field4009.field4017 == var8.field3194) {
                            if (var8.field3193 == 0) {
                                class556.method9160(this.field3095 * arg0, this.field3095 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3193 == 1) {
                                class556.method9160(this.field3095 * arg0 + this.field3095 - 1, this.field3095 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3193 == 2) {
                                class556.method9160(this.field3095 * arg0 + this.field3095 - 1, this.field3095 * (63 - arg1) + this.field3095 - 1, 1, var10);
                            }
                            if (var8.field3193 == 3) {
                                class556.method9160(this.field3095 * arg0, this.field3095 * (63 - arg1) + this.field3095 - 1, 1, var10);
                            }
                        }
                        if (class367.field3998.field4017 == var8.field3194) {
                            int var11 = var8.field3193 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field3095; var12++) {
                                    class556.method9160(this.field3095 * arg0 + var12, this.field3095 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field3095; var13++) {
                                    class556.method9160(this.field3095 * arg0 + var13, this.field3095 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ks.am(IILjava/util/HashSet;IB)V")
    public void method5213(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field3084.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class347 var9 = (class347) var8.getKey();
            int var10 = (int) ((float) var9.field3714 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3713 * var5 - var6);
            class299 var12 = (class299) var8.getValue();
            if (var12 != null && var12.method5447()) {
                var12.field3225 = var10;
                var12.field3227 = var11;
                class199 var13 = class199.method3551(var12.method5061());
                if (!arg2.contains(var13.method3529())) {
                    this.method5216(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ks.ar(Ljava/util/HashSet;III)V")
    public void method5267(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field3093.iterator();
        while (var4.hasNext()) {
            class299 var5 = (class299) var4.next();
            if (var5.method5447()) {
                class199 var6 = class199.method3551(var5.method5061());
                if (var6 != null && arg0.contains(var6.method3529())) {
                    this.method5215(var6, var5.field3225, var5.field3227, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ks.ag(Lhr;IIIII)V")
    public void method5215(class199 arg0, int arg1, int arg2, int arg3, int arg4) {
        class560 var6 = arg0.method3527(false);
        if (var6 == null) {
            return;
        }
        var6.method9319(arg1 - var6.field5441 / 2, arg2 - var6.field5442 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class556.method9110(arg1, arg2, 15, 16776960, 128);
            class556.method9110(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ks.bs(Lls;IIFI)V")
    public void method5216(class299 arg0, int arg1, int arg2, float arg3) {
        class199 var5 = class199.method3551(arg0.method5061());
        this.method5217(var5, arg1, arg2);
        this.method5292(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ks.bf(Lhr;III)V")
    public void method5217(class199 arg0, int arg1, int arg2) {
        class560 var4 = arg0.method3527(false);
        if (var4 != null) {
            int var5 = this.method5220(var4, arg0.field2022);
            int var6 = this.method5221(var4, arg0.field2032);
            var4.method9319(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ks.bo(Lls;Lhr;IIFI)V")
    public void method5292(class299 arg0, class199 arg1, int arg2, int arg3, float arg4) {
        class294 var6 = arg0.method5077();
        if (var6 != null && var6.field3203.method5048(arg4)) {
            class431 var7 = (class431) this.field3096.get(var6.field3203);
            var7.method7483(var6.field3201, arg2 - var6.field3200 / 2, arg3, var6.field3200, var6.field3202, 0xFF000000 | arg1.field2026, 0, 1, 0, var7.field4760 / 2);
        }
    }

    @ObfuscatedName("ks.bi(IILjava/util/HashSet;II)V")
    public void method5219(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field3093.iterator();
        while (var6.hasNext()) {
            class299 var7 = (class299) var6.next();
            if (var7.method5447()) {
                int var8 = var7.field3231.field3714 % 64;
                int var9 = var7.field3231.field3713 % 64;
                var7.field3225 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3227 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method5061())) {
                    this.method5216(var7, var7.field3225, var7.field3227, var5);
                }
            }
        }
    }

    @ObfuscatedName("ks.bt(Lvc;Lhc;B)I")
    public int method5220(class560 arg0, class208 arg1) {
        switch(arg1.field2107) {
            case 0:
                return -arg0.field5441 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field5441;
        }
    }

    @ObfuscatedName("ks.bn(Lvc;Lie;S)I")
    public int method5221(class560 arg0, class212 arg1) {
        switch(arg1.field2171) {
            case 0:
                return -arg0.field5442 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field5442;
        }
    }

    @ObfuscatedName("ks.bw(II)Llh;")
    public class294 method5222(int arg0) {
        class199 var2 = class199.method3551(arg0);
        return this.method5223(var2);
    }

    @ObfuscatedName("ks.bl(Lhr;I)Llh;")
    public class294 method5223(class199 arg0) {
        if (arg0.field2021 == null || this.field3096 == null || this.field3096.get(class278.field3042) == null) {
            return null;
        }
        int var2 = arg0.field2023;
        class278[] var3 = class278.method5053();
        int var4 = 0;
        class278 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class278 var5 = var3[var4];
            if (var5.field3046 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class431 var8 = (class431) this.field3096.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method7463(arg0.field2021, 1000000);
        String[] var10 = new String[var9];
        var8.method7554(arg0.field2021, (int[]) null, var10);
        int var11 = var10.length * var8.field4760 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method7547(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class294(arg0.field2021, var12, var11, var6);
    }

    @ObfuscatedName("ks.be(IIIIIS)Ljava/util/List;")
    public List method5224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field3084.values().iterator();
            while (var7.hasNext()) {
                class299 var8 = (class299) var7.next();
                if (var8.method5447() && var8.method5458(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field3093.iterator();
            while (var9.hasNext()) {
                class299 var10 = (class299) var9.next();
                if (var10.method5447() && var10.method5458(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ks.bg(B)Ljava/util/List;")
    public List method5225() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field3093);
        var1.addAll(this.field3084.values());
        return var1;
    }

    @ObfuscatedName("ks.bu(IIIII)V")
    public void method5298(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class556.method9145(this.field3095 * arg0, this.field3095 * (63 - arg1), this.field3095, arg3);
        }
        if (var5 == 1) {
            class556.method9160(this.field3095 * arg0, this.field3095 * (63 - arg1), this.field3095, arg3);
        }
        if (var5 == 2) {
            class556.method9145(this.field3095 * arg0 + this.field3095 - 1, this.field3095 * (63 - arg1), this.field3095, arg3);
        }
        if (var5 == 3) {
            class556.method9160(this.field3095 * arg0, this.field3095 * (63 - arg1) + this.field3095 - 1, this.field3095, arg3);
        }
    }
}
