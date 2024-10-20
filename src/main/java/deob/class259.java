package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("jv")
public class class259 {

    @ObfuscatedName("jv.as")
    public static class287 field2912 = new class287(37748736, 256);

    @ObfuscatedName("jv.aj")
    public int field2901;

    @ObfuscatedName("jv.ag")
    public int field2902;

    @ObfuscatedName("jv.az")
    public class253 field2903;

    @ObfuscatedName("jv.av")
    public LinkedList field2910;

    @ObfuscatedName("jv.ap")
    public int field2909;

    @ObfuscatedName("jv.aq")
    public int field2898;

    @ObfuscatedName("jv.at")
    public List field2907;

    @ObfuscatedName("jv.ah")
    public HashMap field2908;

    @ObfuscatedName("jv.ax")
    public final HashMap field2906;

    @ObfuscatedName("af.aw(IIII)Lud;")
    public static class528 method313(int arg0, int arg1, int arg2) {
        class287 var3 = field2912;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class528) var3.method5116(var4);
    }

    public class259(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2901 = arg0;
        this.field2902 = arg1;
        this.field2910 = new LinkedList();
        this.field2907 = new LinkedList();
        this.field2908 = new HashMap();
        this.field2909 = arg2 | 0xFF000000;
        this.field2906 = arg3;
    }

    @ObfuscatedName("jv.ay(IIII)V")
    public void method4798(int arg0, int arg1, int arg2) {
        class528 var4 = method313(this.field2901, this.field2902, this.field2898);
        if (var4 == null) {
            return;
        }
        if (this.field2898 * 64 == arg2) {
            var4.method8707(arg0, arg1);
        } else {
            var4.method8729(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("jv.ar(Ljn;Ljava/util/List;I)V")
    public void method4799(class253 arg0, List arg1) {
        this.field2908.clear();
        this.field2903 = arg0;
        this.method4804(arg1);
    }

    @ObfuscatedName("jv.am(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4800(HashSet arg0, List arg1) {
        this.field2908.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class261 var4 = (class261) var3.next();
            if (var4.method4997() == this.field2901 && var4.method4998() == this.field2902) {
                this.field2910.add(var4);
            }
        }
        this.method4804(arg1);
    }

    @ObfuscatedName("jv.as(IIIILkm;I)V")
    public void method4801(int arg0, int arg1, int arg2, int arg3, class267 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2987; var8++) {
                    class269[] var9 = arg4.field2994[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class269[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class269 var12 = var10[var11];
                            class207 var13 = Statics.method2211(var12.field3003);
                            if (method2320(var13)) {
                                this.method4868(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jv.aj(Lhb;IIILkm;S)V")
    public void method4868(class207 arg0, int arg1, int arg2, int arg3, class267 arg4) {
        class324 var6 = new class324(arg1, this.field2901 * 64 + arg2, this.field2902 * 64 + arg3);
        Object var7 = null;
        class324 var8;
        if (this.field2903 == null) {
            class261 var9 = (class261) arg4;
            var8 = new class324(var9.field2992 + arg1, var9.field2986 * 64 + arg2 + var9.method4960() * 8, var9.field2983 * 64 + arg3 + var9.method4961() * 8);
        } else {
            var8 = new class324(this.field2903.field2992 + arg1, this.field2903.field2986 * 64 + arg2, this.field2903.field2983 * 64 + arg3);
        }
        class276 var10;
        if (arg0.field2176 == null) {
            class188 var11 = class188.method3780(arg0.field2163);
            var10 = new class264(var8, var6, var11.field1921, this.method4866(var11));
        } else {
            var10 = new class256(var8, var6, arg0.field2142, this);
        }
        class188 var12 = class188.method3780(var10.method4675());
        if (var12.field1920) {
            this.field2908.put(new class324(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("jv.ag(I)V")
    public void method4802() {
        Iterator var1 = this.field2908.values().iterator();
        while (var1.hasNext()) {
            class276 var2 = (class276) var1.next();
            if (var2 instanceof class256) {
                ((class256) var2).method4674();
            }
        }
    }

    @ObfuscatedName("jv.az(Ljava/util/List;B)V")
    public void method4804(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class264 var3 = (class264) var2.next();
            if (class188.method3780(var3.field2953).field1920 && var3.field3043.field3536 >> 6 == this.field2901 && var3.field3043.field3538 >> 6 == this.field2902) {
                class264 var4 = new class264(var3.field3043, var3.field3043, var3.field2953, this.method4825(var3.field2953));
                this.field2907.add(var4);
            }
        }
    }

    @ObfuscatedName("jv.av(I)V")
    public void method4842() {
        if (this.field2903 != null) {
            this.field2903.method4993();
            return;
        }
        Iterator var1 = this.field2910.iterator();
        while (var1.hasNext()) {
            class261 var2 = (class261) var1.next();
            var2.method4993();
        }
    }

    @ObfuscatedName("jv.ap(Lnd;B)Z")
    public boolean method4832(class360 arg0) {
        this.field2908.clear();
        if (this.field2903 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2910.iterator();
            while (var3.hasNext()) {
                class261 var4 = (class261) var3.next();
                var4.method4992(arg0);
                var2 &= var4.method4991();
            }
            if (var2) {
                Iterator var5 = this.field2910.iterator();
                while (var5.hasNext()) {
                    class261 var6 = (class261) var5.next();
                    this.method4801(var6.method4962() * 8, var6.method4967() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2903.method4992(arg0);
            if (this.field2903.method4991()) {
                this.method4801(0, 0, 64, 64, this.field2903);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("jv.aq(ILki;[Luu;Lnd;Lnd;B)V")
    public void method4807(int arg0, class280 arg1, class527[] arg2, class360 arg3, class360 arg4) {
        this.field2898 = arg0;
        if (this.field2903 == null && this.field2910.isEmpty() || method313(this.field2901, this.field2902, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method4832(arg3);
        int var8;
        if (this.field2903 == null) {
            var8 = ((class267) this.field2910.getFirst()).field2988;
        } else {
            var8 = this.field2903.field2988;
        }
        boolean var9 = var7 & arg4.method6159(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method6123(var8);
        class270 var11;
        if (var10 == null) {
            var11 = new class270();
        } else {
            var11 = new class270(class31.method2969(var10).field5168);
        }
        class528 var13 = new class528(this.field2898 * 64, this.field2898 * 64);
        var13.method8700();
        if (this.field2903 == null) {
            this.method4811(arg1, arg2, var11);
        } else {
            this.method4830(arg1, arg2, var11);
        }
        int var14 = this.field2901;
        int var15 = this.field2902;
        int var16 = this.field2898;
        class287 var17 = field2912;
        long var19 = (long) (var16 << 16 | var14 << 8 | var15);
        var17.method5115(var13, var19, var13.field5168.length * 4);
        this.method4842();
    }

    @ObfuscatedName("jv.at(IIILjava/util/HashSet;B)V")
    public void method4808(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4817(arg0, arg1, arg3, arg2);
        this.method4823(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("jv.ah(Ljava/util/HashSet;III)V")
    public void method4809(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2908.values().iterator();
        while (var4.hasNext()) {
            class276 var5 = (class276) var4.next();
            if (var5.method5045()) {
                int var6 = var5.method4675();
                if (arg0.contains(var6)) {
                    class188 var7 = class188.method3780(var6);
                    this.method4819(var7, var5.field3041, var5.field3039, arg1, arg2);
                }
            }
        }
        this.method4818(arg0, arg1, arg2);
    }

    @ObfuscatedName("jv.ax(Lki;[Luu;Lkw;I)V")
    public void method4830(class280 arg0, class527[] arg1, class270 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4900(var4, var5, this.field2903, arg0, arg2);
                this.method4813(var4, var5, this.field2903, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4914(var6, var7, this.field2903, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("jv.aa(Lki;[Luu;Lkw;I)V")
    public void method4811(class280 arg0, class527[] arg1, class270 arg2) {
        Iterator var4 = this.field2910.iterator();
        while (var4.hasNext()) {
            class261 var5 = (class261) var4.next();
            for (int var6 = var5.method4962() * 8; var6 < var5.method4962() * 8 + 8; var6++) {
                for (int var7 = var5.method4967() * 8; var7 < var5.method4967() * 8 + 8; var7++) {
                    this.method4900(var6, var7, var5, arg0, arg2);
                    this.method4813(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2910.iterator();
        while (var8.hasNext()) {
            class261 var9 = (class261) var8.next();
            for (int var10 = var9.method4962() * 8; var10 < var9.method4962() * 8 + 8; var10++) {
                for (int var11 = var9.method4967() * 8; var11 < var9.method4967() * 8 + 8; var11++) {
                    this.method4914(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("jv.au(IILkm;Lki;[Luu;I)V")
    public void method4914(int arg0, int arg1, class267 arg2, class280 arg3, class527[] arg4) {
        this.method4841(arg0, arg1, arg2);
        this.method4815(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("jv.ae(IILkm;Lki;Lkw;I)V")
    public void method4900(int arg0, int arg1, class267 arg2, class280 arg3, class270 arg4) {
        int var6 = arg2.field2990[0][arg0][arg1] - 1;
        int var7 = arg2.field2991[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class524.method8582(this.field2898 * arg0, this.field2898 * (63 - arg1), this.field2898, this.field2898, this.field2909);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class274.method7942(var7, this.field2909);
        }
        if (var7 > -1 && arg2.field2982[0][arg0][arg1] == 0) {
            class524.method8582(this.field2898 * arg0, this.field2898 * (63 - arg1), this.field2898, this.field2898, var8);
            return;
        }
        int var9 = this.method4805(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class524.method8582(this.field2898 * arg0, this.field2898 * (63 - arg1), this.field2898, this.field2898, var9);
        } else {
            arg3.method5076(this.field2898 * arg0, this.field2898 * (63 - arg1), var9, var8, this.field2898, this.field2898, arg2.field2982[0][arg0][arg1], arg2.field2993[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("jv.ab(IILkm;Lki;I)V")
    public void method4813(int arg0, int arg1, class267 arg2, class280 arg3) {
        for (int var5 = 1; var5 < arg2.field2987; var5++) {
            int var6 = arg2.field2991[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class274.method7942(var6, this.field2909);
                if (arg2.field2982[var5][arg0][arg1] == 0) {
                    class524.method8582(this.field2898 * arg0, this.field2898 * (63 - arg1), this.field2898, this.field2898, var7);
                } else {
                    arg3.method5076(this.field2898 * arg0, this.field2898 * (63 - arg1), 0, var7, this.field2898, this.field2898, arg2.field2982[var5][arg0][arg1], arg2.field2993[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("jv.ad(IILkm;Lkw;I)I")
    public int method4805(int arg0, int arg1, class267 arg2, class270 arg3) {
        return arg2.field2990[0][arg0][arg1] == 0 ? this.field2909 : arg3.method5029(arg0, arg1);
    }

    @ObfuscatedName("jv.ao(IILkm;[Luu;I)V")
    public void method4815(int arg0, int arg1, class267 arg2, class527[] arg3) {
        for (int var5 = 0; var5 < arg2.field2987; var5++) {
            class269[] var6 = arg2.field2994[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class269[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class269 var9 = var7[var8];
                    int var10 = var9.field3001;
                    boolean var11 = var10 >= class342.field3830.field3808 && var10 <= class342.field3824.field3808;
                    if (var11 || class342.method2572(var9.field3001)) {
                        class207 var12 = Statics.method2211(var9.field3003);
                        if (var12.field2164 != -1) {
                            if (var12.field2164 == 46 || var12.field2164 == 52) {
                                arg3[var12.field2164].method8683(this.field2898 * arg0, this.field2898 * (63 - arg1), this.field2898 * 2 + 1, this.field2898 * 2 + 1);
                            } else {
                                arg3[var12.field2164].method8683(this.field2898 * arg0, this.field2898 * (63 - arg1), this.field2898 * 2, this.field2898 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jv.ac(IILkm;B)V")
    public void method4841(int arg0, int arg1, class267 arg2) {
        for (int var4 = 0; var4 < arg2.field2987; var4++) {
            class269[] var5 = arg2.field2994[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class269[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class269 var8 = var6[var7];
                    int var9 = var8.field3001;
                    boolean var10 = var9 >= class342.field3811.field3808 && var9 <= class342.field3810.field3808 || class342.field3812.field3808 == var9;
                    if (var10) {
                        class207 var11 = Statics.method2211(var8.field3003);
                        int var12 = var11.field2154 == 0 ? -3355444 : -3407872;
                        if (class342.field3811.field3808 == var8.field3001) {
                            this.method4829(arg0, arg1, var8.field3002, var12);
                        }
                        if (class342.field3809.field3808 == var8.field3001) {
                            this.method4829(arg0, arg1, var8.field3002, -3355444);
                            this.method4829(arg0, arg1, var8.field3002 + 1, var12);
                        }
                        if (class342.field3810.field3808 == var8.field3001) {
                            if (var8.field3002 == 0) {
                                class524.method8588(this.field2898 * arg0, this.field2898 * (63 - arg1), 1, var12);
                            }
                            if (var8.field3002 == 1) {
                                class524.method8588(this.field2898 * arg0 + this.field2898 - 1, this.field2898 * (63 - arg1), 1, var12);
                            }
                            if (var8.field3002 == 2) {
                                class524.method8588(this.field2898 * arg0 + this.field2898 - 1, this.field2898 * (63 - arg1) + this.field2898 - 1, 1, var12);
                            }
                            if (var8.field3002 == 3) {
                                class524.method8588(this.field2898 * arg0, this.field2898 * (63 - arg1) + this.field2898 - 1, 1, var12);
                            }
                        }
                        if (class342.field3812.field3808 == var8.field3001) {
                            int var13 = var8.field3002 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field2898; var14++) {
                                    class524.method8588(this.field2898 * arg0 + var14, this.field2898 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field2898; var15++) {
                                    class524.method8588(this.field2898 * arg0 + var15, this.field2898 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jv.ak(IILjava/util/HashSet;II)V")
    public void method4817(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2908.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class324 var9 = (class324) var8.getKey();
            int var10 = (int) ((float) var9.field3536 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3538 * var5 - var6);
            class276 var12 = (class276) var8.getValue();
            if (var12 != null && var12.method5045()) {
                var12.field3041 = var10;
                var12.field3039 = var11;
                class188 var13 = class188.method3780(var12.method4675());
                if (!arg2.contains(var13.method3283())) {
                    this.method4820(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("jv.an(Ljava/util/HashSet;III)V")
    public void method4818(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2907.iterator();
        while (var4.hasNext()) {
            class276 var5 = (class276) var4.next();
            if (var5.method5045()) {
                class188 var6 = class188.method3780(var5.method4675());
                if (var6 != null && arg0.contains(var6.method3283())) {
                    this.method4819(var6, var5.field3041, var5.field3039, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("jv.af(Lho;IIIII)V")
    public void method4819(class188 arg0, int arg1, int arg2, int arg3, int arg4) {
        class528 var6 = arg0.method3280(false);
        if (var6 == null) {
            return;
        }
        var6.method8812(arg1 - var6.field5169 / 2, arg2 - var6.field5174 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class524.method8571(arg1, arg2, 15, 16776960, 128);
            class524.method8571(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("jv.ai(Lkv;IIFI)V")
    public void method4820(class276 arg0, int arg1, int arg2, float arg3) {
        class188 var5 = class188.method3780(arg0.method4675());
        this.method4821(var5, arg1, arg2);
        this.method4822(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("jv.al(Lho;IIB)V")
    public void method4821(class188 arg0, int arg1, int arg2) {
        class528 var4 = arg0.method3280(false);
        if (var4 != null) {
            int var5 = this.method4814(var4, arg0.field1929);
            int var6 = this.method4824(var4, arg0.field1927);
            var4.method8812(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("jv.bd(Lkv;Lho;IIFB)V")
    public void method4822(class276 arg0, class188 arg1, int arg2, int arg3, float arg4) {
        class271 var6 = arg0.method4680();
        if (var6 != null && var6.field3012.method4672(arg4)) {
            class395 var7 = (class395) this.field2906.get(var6.field3012);
            var7.method6877(var6.field3014, arg2 - var6.field3011 / 2, arg3, var6.field3011, var6.field3010, 0xFF000000 | arg1.field1923, 0, 1, 0, var7.field4493 / 2);
        }
    }

    @ObfuscatedName("jv.bb(IILjava/util/HashSet;IS)V")
    public void method4823(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2907.iterator();
        while (var6.hasNext()) {
            class276 var7 = (class276) var6.next();
            if (var7.method5045()) {
                int var8 = var7.field3043.field3536 % 64;
                int var9 = var7.field3043.field3538 % 64;
                var7.field3041 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3039 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4675())) {
                    this.method4820(var7, var7.field3041, var7.field3039, var5);
                }
            }
        }
    }

    @ObfuscatedName("jv.bn(Lud;Lhz;B)I")
    public int method4814(class528 arg0, class194 arg1) {
        switch(arg1.field1987) {
            case 0:
                return -arg0.field5169 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field5169;
        }
    }

    @ObfuscatedName("jv.ba(Lud;Lhl;I)I")
    public int method4824(class528 arg0, class197 arg1) {
        switch(arg1.field2044) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5174 / 2;
            default:
                return -arg0.field5174;
        }
    }

    @ObfuscatedName("ds.bf(Lhb;I)Z")
    public static boolean method2320(class207 arg0) {
        if (arg0.field2176 != null) {
            int[] var1 = arg0.field2176;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class207 var4 = Statics.method2211(var3);
                if (var4.field2163 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2163 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("jv.bs(II)Lka;")
    public class271 method4825(int arg0) {
        class188 var2 = class188.method3780(arg0);
        return this.method4866(var2);
    }

    @ObfuscatedName("jv.bp(Lho;B)Lka;")
    public class271 method4866(class188 arg0) {
        if (arg0.field1917 == null || this.field2906 == null || this.field2906.get(class255.field2856) == null) {
            return null;
        }
        int var2 = arg0.field1919;
        class255[] var3 = new class255[] { class255.field2856, class255.field2857, class255.field2858 };
        class255[] var4 = var3;
        int var5 = 0;
        class255 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class255 var6 = var4[var5];
            if (var6.field2862 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class395 var9 = (class395) this.field2906.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method6807(arg0.field1917, 1000000);
        String[] var11 = new String[var10];
        var9.method6853(arg0.field1917, (int[]) null, var11);
        int var12 = var11.length * var9.field4493 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method6864(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class271(arg0.field1917, var13, var12, var7);
    }

    @ObfuscatedName("jv.bv(IIIIII)Ljava/util/List;")
    public List method4917(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2908.values().iterator();
            while (var7.hasNext()) {
                class276 var8 = (class276) var7.next();
                if (var8.method5045() && var8.method5043(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2907.iterator();
            while (var9.hasNext()) {
                class276 var10 = (class276) var9.next();
                if (var10.method5045() && var10.method5043(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("jv.bq(I)Ljava/util/List;")
    public List method4828() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2907);
        var1.addAll(this.field2908.values());
        return var1;
    }

    @ObfuscatedName("jv.bo(IIIII)V")
    public void method4829(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class524.method8590(this.field2898 * arg0, this.field2898 * (63 - arg1), this.field2898, arg3);
        }
        if (var5 == 1) {
            class524.method8588(this.field2898 * arg0, this.field2898 * (63 - arg1), this.field2898, arg3);
        }
        if (var5 == 2) {
            class524.method8590(this.field2898 * arg0 + this.field2898 - 1, this.field2898 * (63 - arg1), this.field2898, arg3);
        }
        if (var5 == 3) {
            class524.method8588(this.field2898 * arg0, this.field2898 * (63 - arg1) + this.field2898 - 1, this.field2898, arg3);
        }
    }
}
