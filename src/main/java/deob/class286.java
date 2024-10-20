package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kz")
public final class class286 {

    @ObfuscatedName("kz.ab")
    public boolean field3090 = false;

    @ObfuscatedName("kz.ay")
    public boolean field3085 = false;

    @ObfuscatedName("kz.an")
    public class305 field3095;

    @ObfuscatedName("kz.au")
    public class563 field3087;

    @ObfuscatedName("kz.ax")
    public HashMap field3084;

    @ObfuscatedName("kz.ao")
    public class285[][] field3089;

    @ObfuscatedName("kz.am")
    public HashMap field3099 = new HashMap();

    @ObfuscatedName("kz.ac")
    public class562[] field3091;

    @ObfuscatedName("kz.ae")
    public final class389 field3086;

    @ObfuscatedName("kz.ad")
    public final class389 field3093;

    @ObfuscatedName("kz.aq")
    public final HashMap field3094;

    @ObfuscatedName("kz.al")
    public int field3088;

    @ObfuscatedName("kz.aj")
    public int field3096;

    @ObfuscatedName("kz.as")
    public int field3097;

    @ObfuscatedName("kz.aw")
    public int field3098;

    @ObfuscatedName("kz.af")
    public int field3092 = 0;

    public class286(class562[] arg0, HashMap arg1, class389 arg2, class389 arg3) {
        this.field3091 = arg0;
        this.field3094 = arg1;
        this.field3086 = arg2;
        this.field3093 = arg3;
    }

    @ObfuscatedName("kz.ab(Lob;Ljava/lang/String;ZI)V")
    public void method5340(class389 arg0, String arg1, boolean arg2) {
        if (this.field3085) {
            return;
        }
        this.field3090 = false;
        this.field3085 = true;
        System.nanoTime();
        int var4 = arg0.method6654(class303.field3215.field3217);
        int var5 = arg0.method6655(var4, arg1);
        class549 var6 = new class549(arg0.method6657(class303.field3215.field3217, arg1));
        class549 var7 = new class549(arg0.method6657(class303.field3212.field3217, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field3095 = new class305();
        try {
            this.field3095.method5501(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field3095.method5154();
        this.field3095.method5178();
        this.field3095.method5156();
        this.field3088 = this.field3095.method5150() * 64;
        this.field3096 = this.field3095.method5184() * 64;
        this.field3097 = (this.field3095.method5151() - this.field3095.method5150() + 1) * 64;
        this.field3098 = (this.field3095.method5204() - this.field3095.method5184() + 1) * 64;
        int var9 = this.field3095.method5151() - this.field3095.method5150() + 1;
        int var10 = this.field3095.method5204() - this.field3095.method5184() + 1;
        System.nanoTime();
        System.nanoTime();
        class285.method4613();
        this.field3089 = new class285[var9][var10];
        Iterator var11 = this.field3095.field3221.iterator();
        while (var11.hasNext()) {
            class279 var12 = (class279) var11.next();
            int var13 = var12.field3163;
            int var14 = var12.field3164;
            int var15 = var13 - this.field3095.method5150();
            int var16 = var14 - this.field3095.method5184();
            this.field3089[var15][var16] = new class285(var13, var14, this.field3095.method5187(), this.field3094);
            this.field3089[var15][var16].method5207(var12, this.field3095.field3223);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field3089[var17][var18] == null) {
                    this.field3089[var17][var18] = new class285(this.field3095.method5150() + var17, this.field3095.method5184() + var18, this.field3095.method5187(), this.field3094);
                    this.field3089[var17][var18].method5210(this.field3095.field3222, this.field3095.field3223);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6728(class303.field3214.field3217, arg1)) {
            byte[] var19 = arg0.method6657(class303.field3214.field3217, arg1);
            this.field3087 = class31.method4354(var19);
        }
        System.nanoTime();
        arg0.method6721();
        arg0.method6725();
        this.field3090 = true;
    }

    @ObfuscatedName("kz.ay(B)V")
    public final void method5341() {
        this.field3084 = null;
    }

    @ObfuscatedName("kz.an(IIIIIIIIB)V")
    public final void method5342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5453;
        int var10 = Statics.field5448;
        int var11 = Statics.field5452;
        float[] var12 = Statics.field5450;
        int[] var13 = new int[4];
        class559.method9143(var13);
        class294 var14 = this.method5346(arg0, arg1, arg2, arg3);
        float var15 = this.method5351(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field3092 = var16;
        if (!this.field3099.containsKey(var16)) {
            class306 var17 = new class306(var16);
            var17.method5511();
            this.field3099.put(var16, var17);
        }
        int var18 = var14.field3171 + var14.field3165 - 1;
        int var19 = var14.field3168 + var14.field3166 - 1;
        for (int var20 = var14.field3165; var20 <= var18; var20++) {
            for (int var21 = var14.field3168; var21 <= var19; var21++) {
                this.field3089[var20][var21].method5216(var16, (class306) this.field3099.get(var16), this.field3091, this.field3086, this.field3093);
            }
        }
        class181.method3449(var9, var10, var11, var12);
        class559.method9178(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field3088 + arg0;
        int var24 = this.field3096 + arg1;
        for (int var25 = var14.field3165; var25 < var14.field3171 + var14.field3165; var25++) {
            for (int var26 = var14.field3168; var26 < var14.field3168 + var14.field3166; var26++) {
                this.field3089[var25][var26].method5208((this.field3089[var25][var26].field3081 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field3089[var25][var26].field3075 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("kz.au(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method5352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class294 var14 = this.method5346(arg0, arg1, arg2, arg3);
        float var15 = this.method5351(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field3088 + arg0;
        int var18 = this.field3096 + arg1;
        for (int var19 = var14.field3165; var19 < var14.field3171 + var14.field3165; var19++) {
            for (int var20 = var14.field3168; var20 < var14.field3168 + var14.field3166; var20++) {
                if (arg12) {
                    this.field3089[var19][var20].method5307();
                }
                this.field3089[var19][var20].method5217((this.field3089[var19][var20].field3081 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field3089[var19][var20].field3075 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field3165; var21 < var14.field3171 + var14.field3165; var21++) {
            for (int var22 = var14.field3168; var22 < var14.field3168 + var14.field3166; var22++) {
                this.field3089[var21][var22].method5218(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("kz.ax(IIIILjava/util/HashSet;IIB)V")
    public void method5344(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field3087 == null) {
            return;
        }
        this.field3087.method9257(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field3084 == null) {
            this.method5350();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field3084.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class302 var12 = (class302) var11.next();
                int var13 = (var12.field3211.field3705 - this.field3088) * arg2 / this.field3097;
                int var14 = arg3 - (var12.field3211.field3704 - this.field3096) * arg3 / this.field3098;
                class559.method9146(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("kz.ao(IIIIIIIIIII)Ljava/util/List;")
    public List method5345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field3090) {
            return var11;
        }
        class294 var12 = this.method5346(arg0, arg1, arg2, arg3);
        float var13 = this.method5351(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field3088 + arg0;
        int var16 = this.field3096 + arg1;
        for (int var17 = var12.field3165; var17 < var12.field3171 + var12.field3165; var17++) {
            for (int var18 = var12.field3168; var18 < var12.field3168 + var12.field3166; var18++) {
                List var19 = this.field3089[var17][var18].method5238((this.field3089[var17][var18].field3081 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field3089[var17][var18].field3075 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("kz.am(IIIII)Lld;")
    public class294 method5346(int arg0, int arg1, int arg2, int arg3) {
        class294 var5 = new class294(this);
        int var6 = this.field3088 + arg0;
        int var7 = this.field3096 + arg1;
        int var8 = this.field3088 + arg2;
        int var9 = this.field3096 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field3171 = var12 - var10 + 1;
        var5.field3166 = var13 - var11 + 1;
        var5.field3165 = var10 - this.field3095.method5150();
        var5.field3168 = var11 - this.field3095.method5184();
        if (var5.field3165 < 0) {
            var5.field3171 += var5.field3165;
            var5.field3165 = 0;
        }
        if (var5.field3165 > this.field3089.length - var5.field3171) {
            var5.field3171 = this.field3089.length - var5.field3165;
        }
        if (var5.field3168 < 0) {
            var5.field3166 += var5.field3168;
            var5.field3168 = 0;
        }
        if (var5.field3168 > this.field3089[0].length - var5.field3166) {
            var5.field3166 = this.field3089[0].length - var5.field3168;
        }
        var5.field3171 = Math.min(var5.field3171, this.field3089.length);
        var5.field3166 = Math.min(var5.field3166, this.field3089[0].length);
        return var5;
    }

    @ObfuscatedName("kz.ac(I)Z")
    public boolean method5347() {
        return this.field3090;
    }

    @ObfuscatedName("kz.ae(B)I")
    public int method5348() {
        return this.field3095.method5148();
    }

    @ObfuscatedName("kz.ad(I)Ljava/util/HashMap;")
    public HashMap method5349() {
        this.method5350();
        return this.field3084;
    }

    @ObfuscatedName("kz.aq(I)V")
    public void method5350() {
        if (this.field3084 == null) {
            this.field3084 = new HashMap();
        }
        this.field3084.clear();
        for (int var1 = 0; var1 < this.field3089.length; var1++) {
            for (int var2 = 0; var2 < this.field3089[var1].length; var2++) {
                List var3 = this.field3089[var1][var2].method5301();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class302 var5 = (class302) var4.next();
                    if (var5.method5484()) {
                        int var6 = var5.method5108();
                        if (this.field3084.containsKey(var6)) {
                            List var8 = (List) this.field3084.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field3084.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kz.al(III)F")
    public float method5351(int arg0, int arg1) {
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
