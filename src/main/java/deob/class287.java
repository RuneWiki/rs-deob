package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lu")
public final class class287 {

    @ObfuscatedName("lu.ap")
    public boolean field3154 = false;

    @ObfuscatedName("lu.aw")
    public boolean field3141 = false;

    @ObfuscatedName("lu.ak")
    public class306 field3149;

    @ObfuscatedName("lu.aj")
    public class572 field3142;

    @ObfuscatedName("lu.ai")
    public HashMap field3143;

    @ObfuscatedName("lu.ay")
    public class286[][] field3144;

    @ObfuscatedName("lu.as")
    public HashMap field3145 = new HashMap();

    @ObfuscatedName("lu.ae")
    public class571[] field3146;

    @ObfuscatedName("lu.am")
    public final class392 field3147;

    @ObfuscatedName("lu.at")
    public final class392 field3148;

    @ObfuscatedName("lu.au")
    public final HashMap field3156;

    @ObfuscatedName("lu.an")
    public int field3150;

    @ObfuscatedName("lu.ao")
    public int field3155;

    @ObfuscatedName("lu.af")
    public int field3152;

    @ObfuscatedName("lu.ar")
    public int field3153;

    @ObfuscatedName("lu.ab")
    public int field3151 = 0;

    public class287(class571[] arg0, HashMap arg1, class392 arg2, class392 arg3) {
        this.field3146 = arg0;
        this.field3156 = arg1;
        this.field3147 = arg2;
        this.field3148 = arg3;
    }

    @ObfuscatedName("lu.ap(Lpe;Ljava/lang/String;ZI)V")
    public void method5689(class392 arg0, String arg1, boolean arg2) {
        if (this.field3141) {
            return;
        }
        this.field3154 = false;
        this.field3141 = true;
        System.nanoTime();
        int var4 = arg0.method7010(class304.field3264.field3270);
        int var5 = arg0.method7069(var4, arg1);
        class558 var6 = new class558(arg0.method7013(class304.field3264.field3270, arg1));
        class558 var7 = new class558(arg0.method7013(class304.field3271.field3270, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field3149 = new class306();
        try {
            this.field3149.method5843(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field3149.method5564();
        this.field3149.method5521();
        this.field3149.method5522();
        this.field3150 = this.field3149.method5516() * 64;
        this.field3155 = this.field3149.method5512() * 64;
        this.field3152 = (this.field3149.method5517() - this.field3149.method5516() + 1) * 64;
        this.field3153 = (this.field3149.method5519() - this.field3149.method5512() + 1) * 64;
        int var9 = this.field3149.method5517() - this.field3149.method5516() + 1;
        int var10 = this.field3149.method5519() - this.field3149.method5512() + 1;
        System.nanoTime();
        System.nanoTime();
        class286.field3125.method5907();
        this.field3144 = new class286[var9][var10];
        Iterator var11 = this.field3149.field3275.iterator();
        while (var11.hasNext()) {
            class280 var12 = (class280) var11.next();
            int var13 = var12.field3205;
            int var14 = var12.field3209;
            int var15 = var13 - this.field3149.method5516();
            int var16 = var14 - this.field3149.method5512();
            this.field3144[var15][var16] = new class286(var13, var14, this.field3149.method5513(), this.field3156);
            this.field3144[var15][var16].method5643(var12, this.field3149.field3272);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field3144[var17][var18] == null) {
                    this.field3144[var17][var18] = new class286(this.field3149.method5516() + var17, this.field3149.method5512() + var18, this.field3149.method5513(), this.field3156);
                    this.field3144[var17][var18].method5604(this.field3149.field3273, this.field3149.field3272);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method7012(class304.field3265.field3270, arg1)) {
            byte[] var19 = arg0.method7013(class304.field3265.field3270, arg1);
            this.field3142 = class31.method8331(var19);
        }
        System.nanoTime();
        arg0.method6992();
        arg0.method7008();
        this.field3154 = true;
    }

    @ObfuscatedName("lu.aw(B)V")
    public final void method5691() {
        this.field3143 = null;
    }

    @ObfuscatedName("lu.ak(IIIIIIIII)V")
    public final void method5706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5533;
        int var10 = Statics.field5532;
        int var11 = Statics.field5531;
        float[] var12 = Statics.field5534;
        int[] var13 = new int[4];
        class568.method9665(var13);
        class295 var14 = this.method5695(arg0, arg1, arg2, arg3);
        float var15 = this.method5700(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field3151 = var16;
        if (!this.field3145.containsKey(var16)) {
            class307 var17 = new class307(var16);
            var17.method5851();
            this.field3145.put(var16, var17);
        }
        int var18 = var14.field3219 + var14.field3218 - 1;
        int var19 = var14.field3221 + var14.field3220 - 1;
        for (int var20 = var14.field3218; var20 <= var18; var20++) {
            for (int var21 = var14.field3221; var21 <= var19; var21++) {
                this.field3144[var20][var21].method5580(var16, (class307) this.field3145.get(var16), this.field3146, this.field3147, this.field3148, 0.725D);
            }
        }
        class240.method4506(var9, var10, var11, var12);
        class568.method9611(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field3150 + arg0;
        int var24 = this.field3155 + arg1;
        for (int var25 = var14.field3218; var25 < var14.field3219 + var14.field3218; var25++) {
            for (int var26 = var14.field3221; var26 < var14.field3221 + var14.field3220; var26++) {
                this.field3144[var25][var26].method5571((this.field3144[var25][var26].field3135 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field3144[var25][var26].field3126 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("lu.aj(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method5719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class295 var14 = this.method5695(arg0, arg1, arg2, arg3);
        float var15 = this.method5700(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field3150 + arg0;
        int var18 = this.field3155 + arg1;
        for (int var19 = var14.field3218; var19 < var14.field3219 + var14.field3218; var19++) {
            for (int var20 = var14.field3221; var20 < var14.field3221 + var14.field3220; var20++) {
                if (arg12) {
                    this.field3144[var19][var20].method5576();
                }
                this.field3144[var19][var20].method5590((this.field3144[var19][var20].field3135 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field3144[var19][var20].field3126 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field3218; var21 < var14.field3219 + var14.field3218; var21++) {
            for (int var22 = var14.field3221; var22 < var14.field3221 + var14.field3220; var22++) {
                this.field3144[var21][var22].method5582(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("lu.ai(IIIILjava/util/HashSet;III)V")
    public void method5715(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field3142 == null) {
            return;
        }
        this.field3142.method9785(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field3143 == null) {
            this.method5699();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field3143.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class303 var12 = (class303) var11.next();
                int var13 = (var12.field3260.field3777 - this.field3150) * arg2 / this.field3152;
                int var14 = arg3 - (var12.field3260.field3778 - this.field3155) * arg3 / this.field3153;
                class568.method9614(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("lu.ay(IIIIIIIIIII)Ljava/util/List;")
    public List method5694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field3154) {
            return var11;
        }
        class295 var12 = this.method5695(arg0, arg1, arg2, arg3);
        float var13 = this.method5700(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field3150 + arg0;
        int var16 = this.field3155 + arg1;
        for (int var17 = var12.field3218; var17 < var12.field3219 + var12.field3218; var17++) {
            for (int var18 = var12.field3221; var18 < var12.field3221 + var12.field3220; var18++) {
                List var19 = this.field3144[var17][var18].method5601((this.field3144[var17][var18].field3135 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field3144[var17][var18].field3126 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("lu.as(IIIII)Lls;")
    public class295 method5695(int arg0, int arg1, int arg2, int arg3) {
        class295 var5 = new class295(this);
        int var6 = this.field3150 + arg0;
        int var7 = this.field3155 + arg1;
        int var8 = this.field3150 + arg2;
        int var9 = this.field3155 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field3219 = var12 - var10 + 1;
        var5.field3220 = var13 - var11 + 1;
        var5.field3218 = var10 - this.field3149.method5516();
        var5.field3221 = var11 - this.field3149.method5512();
        if (var5.field3218 < 0) {
            var5.field3219 += var5.field3218;
            var5.field3218 = 0;
        }
        if (var5.field3218 > this.field3144.length - var5.field3219) {
            var5.field3219 = this.field3144.length - var5.field3218;
        }
        if (var5.field3221 < 0) {
            var5.field3220 += var5.field3221;
            var5.field3221 = 0;
        }
        if (var5.field3221 > this.field3144[0].length - var5.field3220) {
            var5.field3220 = this.field3144[0].length - var5.field3221;
        }
        var5.field3219 = Math.min(var5.field3219, this.field3144.length);
        var5.field3220 = Math.min(var5.field3220, this.field3144[0].length);
        return var5;
    }

    @ObfuscatedName("lu.ae(I)Z")
    public boolean method5696() {
        return this.field3154;
    }

    @ObfuscatedName("lu.am(I)I")
    public int method5697() {
        return this.field3149.method5518();
    }

    @ObfuscatedName("lu.at(I)Ljava/util/HashMap;")
    public HashMap method5698() {
        this.method5699();
        return this.field3143;
    }

    @ObfuscatedName("lu.au(B)V")
    public void method5699() {
        if (this.field3143 == null) {
            this.field3143 = new HashMap();
        }
        this.field3143.clear();
        for (int var1 = 0; var1 < this.field3144.length; var1++) {
            for (int var2 = 0; var2 < this.field3144[var1].length; var2++) {
                List var3 = this.field3144[var1][var2].method5602();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class303 var5 = (class303) var4.next();
                    if (var5.method5824()) {
                        int var6 = var5.method5469();
                        if (this.field3143.containsKey(var6)) {
                            List var8 = (List) this.field3143.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field3143.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("lu.an(III)F")
    public float method5700(int arg0, int arg1) {
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
