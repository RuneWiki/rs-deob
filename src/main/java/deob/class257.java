package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("jm")
public class class257 {

    @ObfuscatedName("jm.ax")
    public static class285 field2903 = new class285(37748736, 256);

    @ObfuscatedName("jm.ap")
    public int field2904;

    @ObfuscatedName("jm.ab")
    public int field2905;

    @ObfuscatedName("jm.ak")
    public class251 field2906;

    @ObfuscatedName("jm.ae")
    public LinkedList field2902;

    @ObfuscatedName("jm.af")
    public int field2907;

    @ObfuscatedName("jm.ao")
    public int field2900;

    @ObfuscatedName("jm.aa")
    public List field2910;

    @ObfuscatedName("jm.aj")
    public HashMap field2899;

    @ObfuscatedName("jm.ad")
    public final HashMap field2912;

    @ObfuscatedName("ou.at(IIII)J")
    public static long method6567(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    public class257(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2904 = arg0;
        this.field2905 = arg1;
        this.field2902 = new LinkedList();
        this.field2910 = new LinkedList();
        this.field2899 = new HashMap();
        this.field2907 = arg2 | 0xFF000000;
        this.field2912 = arg3;
    }

    @ObfuscatedName("jm.an(IIII)V")
    public void method4761(int arg0, int arg1, int arg2) {
        int var4 = this.field2904;
        int var5 = this.field2905;
        int var6 = this.field2900;
        class515 var7 = (class515) field2903.method5091(method6567(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field2900 * 64 == arg2) {
            var7.method8591(arg0, arg1);
        } else {
            var7.method8677(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("jm.av(Lja;Ljava/util/List;I)V")
    public void method4762(class251 arg0, List arg1) {
        this.field2899.clear();
        this.field2906 = arg0;
        this.method4767(arg1);
    }

    @ObfuscatedName("jm.as(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4763(HashSet arg0, List arg1) {
        this.field2899.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class259 var4 = (class259) var3.next();
            if (var4.method4966() == this.field2904 && var4.method4967() == this.field2905) {
                this.field2902.add(var4);
            }
        }
        this.method4767(arg1);
    }

    @ObfuscatedName("jm.ax(IIIILkc;I)V")
    public void method4764(int arg0, int arg1, int arg2, int arg3, class265 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2981; var8++) {
                    class267[] var9 = arg4.field2991[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class267[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class267 var12 = var10[var11];
                            class205 var13 = class205.method3219(var12.field3004);
                            if (Statics.method4631(var13)) {
                                this.method4765(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jm.ap(Lhx;IIILkc;B)V")
    public void method4765(class205 arg0, int arg1, int arg2, int arg3, class265 arg4) {
        class321 var6 = new class321(arg1, this.field2904 * 64 + arg2, this.field2905 * 64 + arg3);
        Object var7 = null;
        class321 var8;
        if (this.field2906 == null) {
            class259 var9 = (class259) arg4;
            var8 = new class321(var9.field2983 + arg1, var9.field2984 * 64 + arg2 + var9.method4922() * 8, var9.field2980 * 64 + arg3 + var9.method4923() * 8);
        } else {
            var8 = new class321(this.field2906.field2983 + arg1, this.field2906.field2984 * 64 + arg2, this.field2906.field2980 * 64 + arg3);
        }
        class274 var10;
        if (arg0.field2152 == null) {
            class187 var11 = class187.method2956(arg0.field2171);
            var10 = new class262(var8, var6, var11.field1911, this.method4807(var11));
        } else {
            var10 = new class254(var8, var6, arg0.field2168, this);
        }
        class187 var12 = class187.method2956(var10.method4663());
        if (var12.field1913) {
            this.field2899.put(new class321(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("jm.ab(B)V")
    public void method4766() {
        Iterator var1 = this.field2899.values().iterator();
        while (var1.hasNext()) {
            class274 var2 = (class274) var1.next();
            if (var2 instanceof class254) {
                ((class254) var2).method4653();
            }
        }
    }

    @ObfuscatedName("jm.ak(Ljava/util/List;I)V")
    public void method4767(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class262 var3 = (class262) var2.next();
            if (class187.method2956(var3.field2950).field1913 && var3.field3039.field3517 >> 6 == this.field2904 && var3.field3039.field3515 >> 6 == this.field2905) {
                class262 var4 = new class262(var3.field3039, var3.field3039, var3.field2950, this.method4790(var3.field2950));
                this.field2910.add(var4);
            }
        }
    }

    @ObfuscatedName("jm.ae(I)V")
    public void method4768() {
        if (this.field2906 != null) {
            this.field2906.method4981();
            return;
        }
        Iterator var1 = this.field2902.iterator();
        while (var1.hasNext()) {
            class259 var2 = (class259) var1.next();
            var2.method4981();
        }
    }

    @ObfuscatedName("jm.af(Lnq;I)Z")
    public boolean method4769(class357 arg0) {
        this.field2899.clear();
        if (this.field2906 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2902.iterator();
            while (var3.hasNext()) {
                class259 var4 = (class259) var3.next();
                var4.method4986(arg0);
                var2 &= var4.method4960();
            }
            if (var2) {
                Iterator var5 = this.field2902.iterator();
                while (var5.hasNext()) {
                    class259 var6 = (class259) var5.next();
                    this.method4764(var6.method4924() * 8, var6.method4925() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2906.method4986(arg0);
            if (this.field2906.method4960()) {
                this.method4764(0, 0, 64, 64, this.field2906);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("jm.ao(ILko;[Ltj;Lnq;Lnq;I)V")
    public void method4770(int arg0, class278 arg1, class514[] arg2, class357 arg3, class357 arg4) {
        this.field2900 = arg0;
        if (this.field2906 == null && this.field2902.isEmpty()) {
            return;
        }
        int var6 = this.field2904;
        int var7 = this.field2905;
        class515 var8 = (class515) field2903.method5091(method6567(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method4769(arg3);
        int var11;
        if (this.field2906 == null) {
            var11 = ((class265) this.field2902.getFirst()).field2985;
        } else {
            var11 = this.field2906.field2985;
        }
        boolean var12 = var10 & arg4.method6152(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method6143(var11);
        class268 var14;
        if (var13 == null) {
            var14 = new class268();
        } else {
            var14 = new class268(Statics.method1943(var13).field5123);
        }
        class515 var16 = new class515(this.field2900 * 64, this.field2900 * 64);
        var16.method8584();
        if (this.field2906 == null) {
            this.method4774(arg1, arg2, var14);
        } else {
            this.method4777(arg1, arg2, var14);
        }
        int var17 = this.field2904;
        int var18 = this.field2905;
        int var19 = this.field2900;
        field2903.method5090(var16, method6567(var17, var18, var19), var16.field5123.length * 4);
        this.method4768();
    }

    @ObfuscatedName("jm.aa(IIILjava/util/HashSet;I)V")
    public void method4862(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4781(arg0, arg1, arg3, arg2);
        this.method4815(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("jm.aj(Ljava/util/HashSet;III)V")
    public void method4872(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2899.values().iterator();
        while (var4.hasNext()) {
            class274 var5 = (class274) var4.next();
            if (var5.method5017()) {
                int var6 = var5.method4663();
                if (arg0.contains(var6)) {
                    class187 var7 = class187.method2956(var6);
                    this.method4810(var7, var5.field3041, var5.field3042, arg1, arg2);
                }
            }
        }
        this.method4782(arg0, arg1, arg2);
    }

    @ObfuscatedName("jm.ad(Lko;[Ltj;Lkv;I)V")
    public void method4777(class278 arg0, class514[] arg1, class268 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4839(var4, var5, this.field2906, arg0, arg2);
                this.method4835(var4, var5, this.field2906, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4775(var6, var7, this.field2906, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("jm.ac(Lko;[Ltj;Lkv;B)V")
    public void method4774(class278 arg0, class514[] arg1, class268 arg2) {
        Iterator var4 = this.field2902.iterator();
        while (var4.hasNext()) {
            class259 var5 = (class259) var4.next();
            for (int var6 = var5.method4924() * 8; var6 < var5.method4924() * 8 + 8; var6++) {
                for (int var7 = var5.method4925() * 8; var7 < var5.method4925() * 8 + 8; var7++) {
                    this.method4839(var6, var7, var5, arg0, arg2);
                    this.method4835(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2902.iterator();
        while (var8.hasNext()) {
            class259 var9 = (class259) var8.next();
            for (int var10 = var9.method4924() * 8; var10 < var9.method4924() * 8 + 8; var10++) {
                for (int var11 = var9.method4925() * 8; var11 < var9.method4925() * 8 + 8; var11++) {
                    this.method4775(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("jm.ag(IILkc;Lko;[Ltj;I)V")
    public void method4775(int arg0, int arg1, class265 arg2, class278 arg3, class514[] arg4) {
        this.method4780(arg0, arg1, arg2);
        this.method4779(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("jm.ar(IILkc;Lko;Lkv;I)V")
    public void method4839(int arg0, int arg1, class265 arg2, class278 arg3, class268 arg4) {
        int var6 = arg2.field2987[0][arg0][arg1] - 1;
        int var7 = arg2.field2988[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class511.method8468(this.field2900 * arg0, this.field2900 * (63 - arg1), this.field2900, this.field2900, this.field2907);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class272.method4355(var7, this.field2907);
        }
        if (var7 > -1 && arg2.field2989[0][arg0][arg1] == 0) {
            class511.method8468(this.field2900 * arg0, this.field2900 * (63 - arg1), this.field2900, this.field2900, var8);
            return;
        }
        int var9 = this.method4778(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class511.method8468(this.field2900 * arg0, this.field2900 * (63 - arg1), this.field2900, this.field2900, var9);
        } else {
            arg3.method5044(this.field2900 * arg0, this.field2900 * (63 - arg1), var9, var8, this.field2900, this.field2900, arg2.field2989[0][arg0][arg1], arg2.field2986[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("jm.ah(IILkc;Lko;B)V")
    public void method4835(int arg0, int arg1, class265 arg2, class278 arg3) {
        for (int var5 = 1; var5 < arg2.field2981; var5++) {
            int var6 = arg2.field2988[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class272.method4355(var6, this.field2907);
                if (arg2.field2989[var5][arg0][arg1] == 0) {
                    class511.method8468(this.field2900 * arg0, this.field2900 * (63 - arg1), this.field2900, this.field2900, var7);
                } else {
                    arg3.method5044(this.field2900 * arg0, this.field2900 * (63 - arg1), 0, var7, this.field2900, this.field2900, arg2.field2989[var5][arg0][arg1], arg2.field2986[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("jm.az(IILkc;Lkv;I)I")
    public int method4778(int arg0, int arg1, class265 arg2, class268 arg3) {
        return arg2.field2987[0][arg0][arg1] == 0 ? this.field2907 : arg3.method4992(arg0, arg1);
    }

    @ObfuscatedName("jm.au(IILkc;[Ltj;B)V")
    public void method4779(int arg0, int arg1, class265 arg2, class514[] arg3) {
        for (int var5 = 0; var5 < arg2.field2981; var5++) {
            class267[] var6 = arg2.field2991[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class267[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class267 var9 = var7[var8];
                    if (class339.method1134(var9.field3001) || class339.method3708(var9.field3001)) {
                        class205 var10 = class205.method3219(var9.field3004);
                        if (var10.field2174 != -1) {
                            if (var10.field2174 == 46 || var10.field2174 == 52) {
                                arg3[var10.field2174].method8566(this.field2900 * arg0, this.field2900 * (63 - arg1), this.field2900 * 2 + 1, this.field2900 * 2 + 1);
                            } else {
                                arg3[var10.field2174].method8566(this.field2900 * arg0, this.field2900 * (63 - arg1), this.field2900 * 2, this.field2900 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jm.ai(IILkc;S)V")
    public void method4780(int arg0, int arg1, class265 arg2) {
        for (int var4 = 0; var4 < arg2.field2981; var4++) {
            class267[] var5 = arg2.field2991[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class267[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class267 var8 = var6[var7];
                    if (class339.method2877(var8.field3001)) {
                        class205 var9 = class205.method3219(var8.field3004);
                        int var10 = var9.field2164 == 0 ? -3355444 : -3407872;
                        if (class339.field3802.field3807 == var8.field3001) {
                            this.method4794(arg0, arg1, var8.field3000, var10);
                        }
                        if (class339.field3786.field3807 == var8.field3001) {
                            this.method4794(arg0, arg1, var8.field3000, -3355444);
                            this.method4794(arg0, arg1, var8.field3000 + 1, var10);
                        }
                        if (class339.field3787.field3807 == var8.field3001) {
                            if (var8.field3000 == 0) {
                                class511.method8474(this.field2900 * arg0, this.field2900 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3000 == 1) {
                                class511.method8474(this.field2900 * arg0 + this.field2900 - 1, this.field2900 * (63 - arg1), 1, var10);
                            }
                            if (var8.field3000 == 2) {
                                class511.method8474(this.field2900 * arg0 + this.field2900 - 1, this.field2900 * (63 - arg1) + this.field2900 - 1, 1, var10);
                            }
                            if (var8.field3000 == 3) {
                                class511.method8474(this.field2900 * arg0, this.field2900 * (63 - arg1) + this.field2900 - 1, 1, var10);
                            }
                        }
                        if (class339.field3800.field3807 == var8.field3001) {
                            int var11 = var8.field3000 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2900; var12++) {
                                    class511.method8474(this.field2900 * arg0 + var12, this.field2900 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2900; var13++) {
                                    class511.method8474(this.field2900 * arg0 + var13, this.field2900 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jm.aq(IILjava/util/HashSet;II)V")
    public void method4781(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2899.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class321 var9 = (class321) var8.getKey();
            int var10 = (int) ((float) var9.field3517 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3515 * var5 - var6);
            class274 var12 = (class274) var8.getValue();
            if (var12 != null && var12.method5017()) {
                var12.field3041 = var10;
                var12.field3042 = var11;
                class187 var13 = class187.method2956(var12.method4663());
                if (!arg2.contains(var13.method3279())) {
                    this.method4784(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("jm.aw(Ljava/util/HashSet;III)V")
    public void method4782(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2910.iterator();
        while (var4.hasNext()) {
            class274 var5 = (class274) var4.next();
            if (var5.method5017()) {
                class187 var6 = class187.method2956(var5.method4663());
                if (var6 != null && arg0.contains(var6.method3279())) {
                    this.method4810(var6, var5.field3041, var5.field3042, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("jm.ay(Lht;IIIII)V")
    public void method4810(class187 arg0, int arg1, int arg2, int arg3, int arg4) {
        class515 var6 = arg0.method3277(false);
        if (var6 == null) {
            return;
        }
        var6.method8661(arg1 - var6.field5115 / 2, arg2 - var6.field5120 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class511.method8460(arg1, arg2, 15, 16776960, 128);
            class511.method8460(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("jm.al(Lkb;IIFI)V")
    public void method4784(class274 arg0, int arg1, int arg2, float arg3) {
        class187 var5 = class187.method2956(arg0.method4663());
        this.method4785(var5, arg1, arg2);
        this.method4786(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("jm.am(Lht;IIB)V")
    public void method4785(class187 arg0, int arg1, int arg2) {
        class515 var4 = arg0.method3277(false);
        if (var4 != null) {
            int var5 = this.method4771(var4, arg0.field1926);
            int var6 = this.method4789(var4, arg0.field1927);
            var4.method8661(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("jm.bs(Lkb;Lht;IIFI)V")
    public void method4786(class274 arg0, class187 arg1, int arg2, int arg3, float arg4) {
        class269 var6 = arg0.method4655();
        if (var6 != null && var6.field3012.method4649(arg4)) {
            class392 var7 = (class392) this.field2912.get(var6.field3012);
            var7.method6785(var6.field3009, arg2 - var6.field3014 / 2, arg3, var6.field3014, var6.field3011, 0xFF000000 | arg1.field1910, 0, 1, 0, var7.field4447 / 2);
        }
    }

    @ObfuscatedName("jm.bc(IILjava/util/HashSet;IS)V")
    public void method4815(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2910.iterator();
        while (var6.hasNext()) {
            class274 var7 = (class274) var6.next();
            if (var7.method5017()) {
                int var8 = var7.field3039.field3517 % 64;
                int var9 = var7.field3039.field3515 % 64;
                var7.field3041 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field3042 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4663())) {
                    this.method4784(var7, var7.field3041, var7.field3042, var5);
                }
            }
        }
    }

    @ObfuscatedName("jm.bj(Ltm;Lhw;I)I")
    public int method4771(class515 arg0, class193 arg1) {
        switch(arg1.field1986) {
            case 0:
                return 0;
            case 2:
                return -arg0.field5115 / 2;
            default:
                return -arg0.field5115;
        }
    }

    @ObfuscatedName("jm.bo(Ltm;Lhq;I)I")
    public int method4789(class515 arg0, class196 arg1) {
        switch(arg1.field2048) {
            case 0:
                return -arg0.field5120 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field5120;
        }
    }

    @ObfuscatedName("jm.bg(II)Lks;")
    public class269 method4790(int arg0) {
        class187 var2 = class187.method2956(arg0);
        return this.method4807(var2);
    }

    @ObfuscatedName("jm.bf(Lht;I)Lks;")
    public class269 method4807(class187 arg0) {
        if (arg0.field1914 == null || this.field2912 == null || this.field2912.get(class253.field2864) == null) {
            return null;
        }
        int var2 = arg0.field1916;
        class253[] var3 = new class253[] { class253.field2864, class253.field2861, class253.field2863 };
        class253[] var4 = var3;
        int var5 = 0;
        class253 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class253 var6 = var4[var5];
            if (var6.field2869 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class392 var9 = (class392) this.field2912.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method6778(arg0.field1914, 1000000);
        String[] var11 = new String[var10];
        var9.method6816(arg0.field1914, (int[]) null, var11);
        int var12 = var11.length * var9.field4447 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method6775(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class269(arg0.field1914, var13, var12, var7);
    }

    @ObfuscatedName("jm.bd(IIIIII)Ljava/util/List;")
    public List method4792(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2899.values().iterator();
            while (var7.hasNext()) {
                class274 var8 = (class274) var7.next();
                if (var8.method5017() && var8.method5030(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2910.iterator();
            while (var9.hasNext()) {
                class274 var10 = (class274) var9.next();
                if (var10.method5017() && var10.method5030(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("jm.ba(B)Ljava/util/List;")
    public List method4793() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2910);
        var1.addAll(this.field2899.values());
        return var1;
    }

    @ObfuscatedName("jm.bn(IIIIS)V")
    public void method4794(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class511.method8476(this.field2900 * arg0, this.field2900 * (63 - arg1), this.field2900, arg3);
        }
        if (var5 == 1) {
            class511.method8474(this.field2900 * arg0, this.field2900 * (63 - arg1), this.field2900, arg3);
        }
        if (var5 == 2) {
            class511.method8476(this.field2900 * arg0 + this.field2900 - 1, this.field2900 * (63 - arg1), this.field2900, arg3);
        }
        if (var5 == 3) {
            class511.method8474(this.field2900 * arg0, this.field2900 * (63 - arg1) + this.field2900 - 1, this.field2900, arg3);
        }
    }
}
