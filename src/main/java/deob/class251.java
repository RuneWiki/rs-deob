package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("jv")
public final class class251 {

    @ObfuscatedName("jv.af")
    public boolean field2931 = false;

    @ObfuscatedName("jv.an")
    public boolean field2919 = false;

    @ObfuscatedName("jv.aw")
    public class270 field2920;

    @ObfuscatedName("jv.ac")
    public class503 field2916;

    @ObfuscatedName("jv.au")
    public HashMap field2917;

    @ObfuscatedName("jv.ab")
    public class250[][] field2921;

    @ObfuscatedName("jv.aq")
    public HashMap field2922 = new HashMap();

    @ObfuscatedName("jv.al")
    public class502[] field2923;

    @ObfuscatedName("jv.at")
    public final class344 field2924;

    @ObfuscatedName("jv.aa")
    public final class344 field2925;

    @ObfuscatedName("jv.ay")
    public final HashMap field2918;

    @ObfuscatedName("jv.ao")
    public int field2930;

    @ObfuscatedName("jv.ax")
    public int field2928;

    @ObfuscatedName("jv.ai")
    public int field2929;

    @ObfuscatedName("jv.ag")
    public int field2926;

    @ObfuscatedName("jv.ah")
    public int field2927 = 0;

    public class251(class502[] arg0, HashMap arg1, class344 arg2, class344 arg3) {
        this.field2923 = arg0;
        this.field2918 = arg1;
        this.field2924 = arg2;
        this.field2925 = arg3;
    }

    @ObfuscatedName("jv.af(Lnm;Ljava/lang/String;ZS)V")
    public void method4866(class344 arg0, String arg1, boolean arg2) {
        if (this.field2919) {
            return;
        }
        this.field2931 = false;
        this.field2919 = true;
        System.nanoTime();
        int var4 = arg0.method6086(class268.field3055.field3058);
        int var5 = arg0.method6075(var4, arg1);
        class489 var6 = new class489(arg0.method6089(class268.field3055.field3058, arg1));
        class489 var7 = new class489(arg0.method6089(class268.field3059.field3058, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2920 = new class270();
        try {
            this.field2920.method5022(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2920.method4705();
        this.field2920.method4708();
        this.field2920.method4711();
        this.field2930 = this.field2920.method4706() * 64;
        this.field2928 = this.field2920.method4747() * 64;
        this.field2929 = (this.field2920.method4707() - this.field2920.method4706() + 1) * 64;
        this.field2926 = (this.field2920.method4693() - this.field2920.method4747() + 1) * 64;
        int var9 = this.field2920.method4707() - this.field2920.method4706() + 1;
        int var10 = this.field2920.method4693() - this.field2920.method4747() + 1;
        System.nanoTime();
        System.nanoTime();
        class250.method7140();
        this.field2921 = new class250[var9][var10];
        Iterator var11 = this.field2920.field3061.iterator();
        while (var11.hasNext()) {
            class244 var12 = (class244) var11.next();
            int var13 = var12.field2988;
            int var14 = var12.field2989;
            int var15 = var13 - this.field2920.method4706();
            int var16 = var14 - this.field2920.method4747();
            this.field2921[var15][var16] = new class250(var13, var14, this.field2920.method4722(), this.field2918);
            this.field2921[var15][var16].method4760(var12, this.field2920.field3060);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2921[var17][var18] == null) {
                    this.field2921[var17][var18] = new class250(this.field2920.method4706() + var17, this.field2920.method4747() + var18, this.field2920.method4722(), this.field2918);
                    this.field2921[var17][var18].method4761(this.field2920.field3063, this.field2920.field3060);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6088(class268.field3056.field3058, arg1)) {
            byte[] var19 = arg0.method6089(class268.field3056.field3058, arg1);
            this.field2916 = class31.method5990(var19);
        }
        System.nanoTime();
        arg0.method6083();
        arg0.method6087();
        this.field2931 = true;
    }

    @ObfuscatedName("jv.an(I)V")
    public final void method4867() {
        this.field2917 = null;
    }

    @ObfuscatedName("jv.aw(IIIIIIIII)V")
    public final void method4868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5067;
        int var10 = Statics.field5061;
        int var11 = Statics.field5060;
        float[] var12 = Statics.field5063;
        int[] var13 = new int[4];
        class499.method8574(var13);
        class259 var14 = this.method4872(arg0, arg1, arg2, arg3);
        float var15 = this.method4876(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field2927 = var16;
        if (!this.field2922.containsKey(var16)) {
            class271 var17 = new class271(var16);
            var17.method5075();
            this.field2922.put(var16, var17);
        }
        int var18 = var14.field3005 + var14.field3002 - 1;
        int var19 = var14.field3004 + var14.field3003 - 1;
        for (int var20 = var14.field3002; var20 <= var18; var20++) {
            for (int var21 = var14.field3004; var21 <= var19; var21++) {
                this.field2921[var20][var21].method4798(var16, (class271) this.field2922.get(var16), this.field2923, this.field2924, this.field2925);
            }
        }
        class219.method9(var9, var10, var11, var12);
        class499.method8575(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field2930 + arg0;
        int var24 = this.field2928 + arg1;
        for (int var25 = var14.field3002; var25 < var14.field3005 + var14.field3002; var25++) {
            for (int var26 = var14.field3004; var26 < var14.field3004 + var14.field3003; var26++) {
                this.field2921[var25][var26].method4759((this.field2921[var25][var26].field2907 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field2921[var25][var26].field2908 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("jv.ac(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class259 var14 = this.method4872(arg0, arg1, arg2, arg3);
        float var15 = this.method4876(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2930 + arg0;
        int var18 = this.field2928 + arg1;
        for (int var19 = var14.field3002; var19 < var14.field3005 + var14.field3002; var19++) {
            for (int var20 = var14.field3004; var20 < var14.field3004 + var14.field3003; var20++) {
                if (arg12) {
                    this.field2921[var19][var20].method4764();
                }
                this.field2921[var19][var20].method4769((this.field2921[var19][var20].field2907 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2921[var19][var20].field2908 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field3002; var21 < var14.field3005 + var14.field3002; var21++) {
            for (int var22 = var14.field3004; var22 < var14.field3004 + var14.field3003; var22++) {
                this.field2921[var21][var22].method4770(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("jv.au(IIIILjava/util/HashSet;III)V")
    public void method4904(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2916 == null) {
            return;
        }
        this.field2916.method8692(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2917 == null) {
            this.method4875();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2917.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class267 var12 = (class267) var11.next();
                int var13 = (var12.field3050.field3486 - this.field2930) * arg2 / this.field2929;
                int var14 = arg3 - (var12.field3050.field3488 - this.field2928) * arg3 / this.field2926;
                class499.method8578(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("jv.ab(IIIIIIIIIII)Ljava/util/List;")
    public List method4901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2931) {
            return var11;
        }
        class259 var12 = this.method4872(arg0, arg1, arg2, arg3);
        float var13 = this.method4876(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2930 + arg0;
        int var16 = this.field2928 + arg1;
        for (int var17 = var12.field3002; var17 < var12.field3005 + var12.field3002; var17++) {
            for (int var18 = var12.field3004; var18 < var12.field3004 + var12.field3003; var18++) {
                List var19 = this.field2921[var17][var18].method4858((this.field2921[var17][var18].field2907 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2921[var17][var18].field2908 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("jv.aq(IIIII)Lju;")
    public class259 method4872(int arg0, int arg1, int arg2, int arg3) {
        class259 var5 = new class259(this);
        int var6 = this.field2930 + arg0;
        int var7 = this.field2928 + arg1;
        int var8 = this.field2930 + arg2;
        int var9 = this.field2928 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field3005 = var12 - var10 + 1;
        var5.field3003 = var13 - var11 + 1;
        var5.field3002 = var10 - this.field2920.method4706();
        var5.field3004 = var11 - this.field2920.method4747();
        if (var5.field3002 < 0) {
            var5.field3005 += var5.field3002;
            var5.field3002 = 0;
        }
        if (var5.field3002 > this.field2921.length - var5.field3005) {
            var5.field3005 = this.field2921.length - var5.field3002;
        }
        if (var5.field3004 < 0) {
            var5.field3003 += var5.field3004;
            var5.field3004 = 0;
        }
        if (var5.field3004 > this.field2921[0].length - var5.field3003) {
            var5.field3003 = this.field2921[0].length - var5.field3004;
        }
        var5.field3005 = Math.min(var5.field3005, this.field2921.length);
        var5.field3003 = Math.min(var5.field3003, this.field2921[0].length);
        return var5;
    }

    @ObfuscatedName("jv.al(I)Z")
    public boolean method4873() {
        return this.field2931;
    }

    @ObfuscatedName("jv.at(B)Ljava/util/HashMap;")
    public HashMap method4874() {
        this.method4875();
        return this.field2917;
    }

    @ObfuscatedName("jv.aa(B)V")
    public void method4875() {
        if (this.field2917 == null) {
            this.field2917 = new HashMap();
        }
        this.field2917.clear();
        for (int var1 = 0; var1 < this.field2921.length; var1++) {
            for (int var2 = 0; var2 < this.field2921[var1].length; var2++) {
                List var3 = this.field2921[var1][var2].method4790();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class267 var5 = (class267) var4.next();
                    if (var5.method5010()) {
                        int var6 = var5.method4662();
                        if (this.field2917.containsKey(var6)) {
                            List var8 = (List) this.field2917.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2917.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jv.ay(III)F")
    public float method4876(int arg0, int arg1) {
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
