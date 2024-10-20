package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("jf")
public final class class260 {

    @ObfuscatedName("jf.aw")
    public boolean field2920 = false;

    @ObfuscatedName("jf.ay")
    public boolean field2915 = false;

    @ObfuscatedName("jf.ar")
    public class279 field2930;

    @ObfuscatedName("jf.am")
    public class528 field2917;

    @ObfuscatedName("jf.as")
    public HashMap field2918;

    @ObfuscatedName("jf.aj")
    public class259[][] field2919;

    @ObfuscatedName("jf.ag")
    public HashMap field2914 = new HashMap();

    @ObfuscatedName("jf.az")
    public class527[] field2921;

    @ObfuscatedName("jf.av")
    public final class360 field2922;

    @ObfuscatedName("jf.ap")
    public final class360 field2923;

    @ObfuscatedName("jf.aq")
    public final HashMap field2926;

    @ObfuscatedName("jf.at")
    public int field2925;

    @ObfuscatedName("jf.ah")
    public int field2927;

    @ObfuscatedName("jf.ax")
    public int field2929;

    @ObfuscatedName("jf.aa")
    public int field2928;

    @ObfuscatedName("jf.au")
    public int field2924 = 0;

    public class260(class527[] arg0, HashMap arg1, class360 arg2, class360 arg3) {
        this.field2921 = arg0;
        this.field2926 = arg1;
        this.field2922 = arg2;
        this.field2923 = arg3;
    }

    @ObfuscatedName("jf.aw(Lnd;Ljava/lang/String;ZB)V")
    public void method4920(class360 arg0, String arg1, boolean arg2) {
        if (this.field2915) {
            return;
        }
        this.field2920 = false;
        this.field2915 = true;
        System.nanoTime();
        int var4 = arg0.method6129(class277.field3051.field3048);
        int var5 = arg0.method6134(var4, arg1);
        class514 var6 = new class514(arg0.method6136(class277.field3051.field3048, arg1));
        class514 var7 = new class514(arg0.method6136(class277.field3047.field3048, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2930 = new class279();
        try {
            this.field2930.method5057(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2930.method4719();
        this.field2930.method4738();
        this.field2930.method4739();
        this.field2925 = this.field2930.method4766() * 64;
        this.field2927 = this.field2930.method4735() * 64;
        this.field2929 = (this.field2930.method4734() - this.field2930.method4766() + 1) * 64;
        this.field2928 = (this.field2930.method4736() - this.field2930.method4735() + 1) * 64;
        int var9 = this.field2930.method4734() - this.field2930.method4766() + 1;
        int var10 = this.field2930.method4736() - this.field2930.method4735() + 1;
        System.nanoTime();
        System.nanoTime();
        class259.field2912.method5117();
        this.field2919 = new class259[var9][var10];
        Iterator var11 = this.field2930.field3056.iterator();
        while (var11.hasNext()) {
            class253 var12 = (class253) var11.next();
            int var13 = var12.field2984;
            int var14 = var12.field2989;
            int var15 = var13 - this.field2930.method4766();
            int var16 = var14 - this.field2930.method4735();
            this.field2919[var15][var16] = new class259(var13, var14, this.field2930.method4731(), this.field2926);
            this.field2919[var15][var16].method4799(var12, this.field2930.field3055);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2919[var17][var18] == null) {
                    this.field2919[var17][var18] = new class259(this.field2930.method4766() + var17, this.field2930.method4735() + var18, this.field2930.method4731(), this.field2926);
                    this.field2919[var17][var18].method4800(this.field2930.field3054, this.field2930.field3055);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6135(class277.field3052.field3048, arg1)) {
            byte[] var19 = arg0.method6136(class277.field3052.field3048, arg1);
            this.field2917 = class31.method2969(var19);
        }
        System.nanoTime();
        arg0.method6140();
        arg0.method6131();
        this.field2920 = true;
    }

    @ObfuscatedName("jf.ay(I)V")
    public final void method4930() {
        this.field2918 = null;
    }

    @ObfuscatedName("jf.ar(IIIIIIIII)V")
    public final void method4922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5137;
        int var10 = Statics.field5138;
        int var11 = Statics.field5139;
        float[] var12 = Statics.field5140;
        int[] var13 = new int[4];
        class524.method8591(var13);
        class268 var14 = this.method4956(arg0, arg1, arg2, arg3);
        float var15 = this.method4936(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field2924 = var16;
        if (!this.field2914.containsKey(var16)) {
            class280 var17 = new class280(var16);
            var17.method5078();
            this.field2914.put(var16, var17);
        }
        int var18 = var14.field3000 + var14.field2998 - 1;
        int var19 = var14.field2999 + var14.field2997 - 1;
        for (int var20 = var14.field3000; var20 <= var18; var20++) {
            for (int var21 = var14.field2997; var21 <= var19; var21++) {
                this.field2919[var20][var21].method4807(var16, (class280) this.field2914.get(var16), this.field2921, this.field2922, this.field2923);
            }
        }
        class228.method4048(var9, var10, var11, var12);
        class524.method8577(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field2925 + arg0;
        int var24 = this.field2927 + arg1;
        for (int var25 = var14.field3000; var25 < var14.field3000 + var14.field2998; var25++) {
            for (int var26 = var14.field2997; var26 < var14.field2999 + var14.field2997; var26++) {
                this.field2919[var25][var26].method4798((this.field2919[var25][var26].field2901 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field2919[var25][var26].field2902 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("jf.am(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class268 var14 = this.method4956(arg0, arg1, arg2, arg3);
        float var15 = this.method4936(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2925 + arg0;
        int var18 = this.field2927 + arg1;
        for (int var19 = var14.field3000; var19 < var14.field3000 + var14.field2998; var19++) {
            for (int var20 = var14.field2997; var20 < var14.field2999 + var14.field2997; var20++) {
                if (arg12) {
                    this.field2919[var19][var20].method4802();
                }
                this.field2919[var19][var20].method4808((this.field2919[var19][var20].field2901 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2919[var19][var20].field2902 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field3000; var21 < var14.field3000 + var14.field2998; var21++) {
            for (int var22 = var14.field2997; var22 < var14.field2999 + var14.field2997; var22++) {
                this.field2919[var21][var22].method4809(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("jf.as(IIIILjava/util/HashSet;IIB)V")
    public void method4924(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2917 == null) {
            return;
        }
        this.field2917.method8711(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2918 == null) {
            this.method4929();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2918.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class276 var12 = (class276) var11.next();
                int var13 = (var12.field3043.field3536 - this.field2925) * arg2 / this.field2929;
                int var14 = arg3 - (var12.field3043.field3538 - this.field2927) * arg3 / this.field2928;
                class524.method8571(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("jf.aj(IIIIIIIIIII)Ljava/util/List;")
    public List method4953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2920) {
            return var11;
        }
        class268 var12 = this.method4956(arg0, arg1, arg2, arg3);
        float var13 = this.method4936(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2925 + arg0;
        int var16 = this.field2927 + arg1;
        for (int var17 = var12.field3000; var17 < var12.field3000 + var12.field2998; var17++) {
            for (int var18 = var12.field2997; var18 < var12.field2999 + var12.field2997; var18++) {
                List var19 = this.field2919[var17][var18].method4917((this.field2919[var17][var18].field2901 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2919[var17][var18].field2902 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("jf.ag(IIIIB)Lkn;")
    public class268 method4956(int arg0, int arg1, int arg2, int arg3) {
        class268 var5 = new class268(this);
        int var6 = this.field2925 + arg0;
        int var7 = this.field2927 + arg1;
        int var8 = this.field2925 + arg2;
        int var9 = this.field2927 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2998 = var12 - var10 + 1;
        var5.field2999 = var13 - var11 + 1;
        var5.field3000 = var10 - this.field2930.method4766();
        var5.field2997 = var11 - this.field2930.method4735();
        if (var5.field3000 < 0) {
            var5.field2998 += var5.field3000;
            var5.field3000 = 0;
        }
        if (var5.field3000 > this.field2919.length - var5.field2998) {
            var5.field2998 = this.field2919.length - var5.field3000;
        }
        if (var5.field2997 < 0) {
            var5.field2999 += var5.field2997;
            var5.field2997 = 0;
        }
        if (var5.field2997 > this.field2919[0].length - var5.field2999) {
            var5.field2999 = this.field2919[0].length - var5.field2997;
        }
        var5.field2998 = Math.min(var5.field2998, this.field2919.length);
        var5.field2999 = Math.min(var5.field2999, this.field2919[0].length);
        return var5;
    }

    @ObfuscatedName("jf.az(I)Z")
    public boolean method4927() {
        return this.field2920;
    }

    @ObfuscatedName("jf.av(B)Ljava/util/HashMap;")
    public HashMap method4928() {
        this.method4929();
        return this.field2918;
    }

    @ObfuscatedName("jf.ap(I)V")
    public void method4929() {
        if (this.field2918 == null) {
            this.field2918 = new HashMap();
        }
        this.field2918.clear();
        for (int var1 = 0; var1 < this.field2919.length; var1++) {
            for (int var2 = 0; var2 < this.field2919[var1].length; var2++) {
                List var3 = this.field2919[var1][var2].method4828();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class276 var5 = (class276) var4.next();
                    if (var5.method5045()) {
                        int var6 = var5.method4675();
                        if (this.field2918.containsKey(var6)) {
                            List var8 = (List) this.field2918.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2918.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jf.aq(III)F")
    public float method4936(int arg0, int arg1) {
        float var3 = (float) arg0 / (float) arg1;
        if (var3 > 8.0F) {
            return 8.0F;
        } else if (var3 < 1.0F) {
            return 1.0F;
        } else {
            int var4 = Math.round(var3);
            return Math.abs((float) var4 - var3) < 0.05F ? (float) var4 : var3;
        }
    }
}
