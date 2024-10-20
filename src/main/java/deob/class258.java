package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("je")
public final class class258 {

    @ObfuscatedName("je.at")
    public boolean field2916 = false;

    @ObfuscatedName("je.an")
    public boolean field2922 = false;

    @ObfuscatedName("je.av")
    public class277 field2915;

    @ObfuscatedName("je.as")
    public class515 field2919;

    @ObfuscatedName("je.ax")
    public HashMap field2917;

    @ObfuscatedName("je.ap")
    public class257[][] field2918;

    @ObfuscatedName("je.ab")
    public HashMap field2920 = new HashMap();

    @ObfuscatedName("je.ak")
    public class514[] field2914;

    @ObfuscatedName("je.ae")
    public final class357 field2921;

    @ObfuscatedName("je.af")
    public final class357 field2925;

    @ObfuscatedName("je.ao")
    public final HashMap field2923;

    @ObfuscatedName("je.aa")
    public int field2924;

    @ObfuscatedName("je.aj")
    public int field2913;

    @ObfuscatedName("je.ad")
    public int field2926;

    @ObfuscatedName("je.ac")
    public int field2927;

    @ObfuscatedName("je.ag")
    public int field2928 = 0;

    public class258(class514[] arg0, HashMap arg1, class357 arg2, class357 arg3) {
        this.field2914 = arg0;
        this.field2923 = arg1;
        this.field2921 = arg2;
        this.field2925 = arg3;
    }

    @ObfuscatedName("je.at(Lnq;Ljava/lang/String;ZI)V")
    public void method4879(class357 arg0, String arg1, boolean arg2) {
        if (this.field2922) {
            return;
        }
        this.field2916 = false;
        this.field2922 = true;
        System.nanoTime();
        int var4 = arg0.method6097(class275.field3050.field3044);
        int var5 = arg0.method6098(var4, arg1);
        class501 var6 = new class501(arg0.method6100(class275.field3050.field3044, arg1));
        class501 var7 = new class501(arg0.method6100(class275.field3045.field3044, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2915 = new class277();
        try {
            this.field2915.method5034(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2915.method4757();
        this.field2915.method4739();
        this.field2915.method4716();
        this.field2924 = this.field2915.method4707() * 64;
        this.field2913 = this.field2915.method4706() * 64;
        this.field2926 = (this.field2915.method4708() - this.field2915.method4707() + 1) * 64;
        this.field2927 = (this.field2915.method4721() - this.field2915.method4706() + 1) * 64;
        int var9 = this.field2915.method4708() - this.field2915.method4707() + 1;
        int var10 = this.field2915.method4721() - this.field2915.method4706() + 1;
        System.nanoTime();
        System.nanoTime();
        class257.field2903.method5097();
        this.field2918 = new class257[var9][var10];
        Iterator var11 = this.field2915.field3056.iterator();
        while (var11.hasNext()) {
            class251 var12 = (class251) var11.next();
            int var13 = var12.field2993;
            int var14 = var12.field2982;
            int var15 = var13 - this.field2915.method4707();
            int var16 = var14 - this.field2915.method4706();
            this.field2918[var15][var16] = new class257(var13, var14, this.field2915.method4705(), this.field2923);
            this.field2918[var15][var16].method4762(var12, this.field2915.field3054);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2918[var17][var18] == null) {
                    this.field2918[var17][var18] = new class257(this.field2915.method4707() + var17, this.field2915.method4706() + var18, this.field2915.method4705(), this.field2923);
                    this.field2918[var17][var18].method4763(this.field2915.field3057, this.field2915.field3054);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6099(class275.field3046.field3044, arg1)) {
            byte[] var19 = arg0.method6100(class275.field3046.field3044, arg1);
            this.field2919 = Statics.method1943(var19);
        }
        System.nanoTime();
        arg0.method6151();
        arg0.method6095();
        this.field2916 = true;
    }

    @ObfuscatedName("je.an(I)V")
    public final void method4880() {
        this.field2917 = null;
    }

    @ObfuscatedName("je.av(IIIIIIIII)V")
    public final void method4881(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5091;
        int var10 = Statics.field5086;
        int var11 = Statics.field5088;
        float[] var12 = Statics.field5089;
        int[] var13 = new int[4];
        class511.method8462(var13);
        class266 var14 = this.method4901(arg0, arg1, arg2, arg3);
        float var15 = this.method4889(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field2928 = var16;
        if (!this.field2920.containsKey(var16)) {
            class278 var17 = new class278(var16);
            var17.method5048();
            this.field2920.put(var16, var17);
        }
        int var18 = var14.field2997 + var14.field2995 - 1;
        int var19 = var14.field2996 + var14.field2994 - 1;
        for (int var20 = var14.field2995; var20 <= var18; var20++) {
            for (int var21 = var14.field2996; var21 <= var19; var21++) {
                this.field2918[var20][var21].method4770(var16, (class278) this.field2920.get(var16), this.field2914, this.field2921, this.field2925);
            }
        }
        class226.method4023(var9, var10, var11, var12);
        class511.method8463(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field2924 + arg0;
        int var24 = this.field2913 + arg1;
        for (int var25 = var14.field2995; var25 < var14.field2997 + var14.field2995; var25++) {
            for (int var26 = var14.field2996; var26 < var14.field2996 + var14.field2994; var26++) {
                this.field2918[var25][var26].method4761((this.field2918[var25][var26].field2904 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field2918[var25][var26].field2905 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("je.as(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method4912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class266 var14 = this.method4901(arg0, arg1, arg2, arg3);
        float var15 = this.method4889(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2924 + arg0;
        int var18 = this.field2913 + arg1;
        for (int var19 = var14.field2995; var19 < var14.field2997 + var14.field2995; var19++) {
            for (int var20 = var14.field2996; var20 < var14.field2996 + var14.field2994; var20++) {
                if (arg12) {
                    this.field2918[var19][var20].method4766();
                }
                this.field2918[var19][var20].method4862((this.field2918[var19][var20].field2904 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2918[var19][var20].field2905 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2995; var21 < var14.field2997 + var14.field2995; var21++) {
            for (int var22 = var14.field2996; var22 < var14.field2996 + var14.field2994; var22++) {
                this.field2918[var21][var22].method4872(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("je.ax(IIIILjava/util/HashSet;IIB)V")
    public void method4883(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2919 == null) {
            return;
        }
        this.field2919.method8595(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2917 == null) {
            this.method4888();
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
                class274 var12 = (class274) var11.next();
                int var13 = (var12.field3039.field3517 - this.field2924) * arg2 / this.field2926;
                int var14 = arg3 - (var12.field3039.field3515 - this.field2913) * arg3 / this.field2927;
                class511.method8460(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("je.ap(IIIIIIIIIII)Ljava/util/List;")
    public List method4907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2916) {
            return var11;
        }
        class266 var12 = this.method4901(arg0, arg1, arg2, arg3);
        float var13 = this.method4889(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2924 + arg0;
        int var16 = this.field2913 + arg1;
        for (int var17 = var12.field2995; var17 < var12.field2997 + var12.field2995; var17++) {
            for (int var18 = var12.field2996; var18 < var12.field2996 + var12.field2994; var18++) {
                List var19 = this.field2918[var17][var18].method4792((this.field2918[var17][var18].field2904 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2918[var17][var18].field2905 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("je.ab(IIIII)Lkx;")
    public class266 method4901(int arg0, int arg1, int arg2, int arg3) {
        class266 var5 = new class266(this);
        int var6 = this.field2924 + arg0;
        int var7 = this.field2913 + arg1;
        int var8 = this.field2924 + arg2;
        int var9 = this.field2913 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2997 = var12 - var10 + 1;
        var5.field2994 = var13 - var11 + 1;
        var5.field2995 = var10 - this.field2915.method4707();
        var5.field2996 = var11 - this.field2915.method4706();
        if (var5.field2995 < 0) {
            var5.field2997 += var5.field2995;
            var5.field2995 = 0;
        }
        if (var5.field2995 > this.field2918.length - var5.field2997) {
            var5.field2997 = this.field2918.length - var5.field2995;
        }
        if (var5.field2996 < 0) {
            var5.field2994 += var5.field2996;
            var5.field2996 = 0;
        }
        if (var5.field2996 > this.field2918[0].length - var5.field2994) {
            var5.field2994 = this.field2918[0].length - var5.field2996;
        }
        var5.field2997 = Math.min(var5.field2997, this.field2918.length);
        var5.field2994 = Math.min(var5.field2994, this.field2918[0].length);
        return var5;
    }

    @ObfuscatedName("je.ak(I)Z")
    public boolean method4886() {
        return this.field2916;
    }

    @ObfuscatedName("je.ae(I)Ljava/util/HashMap;")
    public HashMap method4887() {
        this.method4888();
        return this.field2917;
    }

    @ObfuscatedName("je.af(B)V")
    public void method4888() {
        if (this.field2917 == null) {
            this.field2917 = new HashMap();
        }
        this.field2917.clear();
        for (int var1 = 0; var1 < this.field2918.length; var1++) {
            for (int var2 = 0; var2 < this.field2918[var1].length; var2++) {
                List var3 = this.field2918[var1][var2].method4793();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class274 var5 = (class274) var4.next();
                    if (var5.method5017()) {
                        int var6 = var5.method4663();
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

    @ObfuscatedName("je.ao(IIB)F")
    public float method4889(int arg0, int arg1) {
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
