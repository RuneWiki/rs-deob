package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ki")
public final class class283 {

    @ObfuscatedName("ki.ak")
    public boolean field3107 = false;

    @ObfuscatedName("ki.al")
    public boolean field3103 = false;

    @ObfuscatedName("ki.aj")
    public class302 field3102;

    @ObfuscatedName("ki.az")
    public class560 field3105;

    @ObfuscatedName("ki.af")
    public HashMap field3106;

    @ObfuscatedName("ki.aa")
    public class282[][] field3111;

    @ObfuscatedName("ki.at")
    public HashMap field3118 = new HashMap();

    @ObfuscatedName("ki.ab")
    public class559[] field3109;

    @ObfuscatedName("ki.ac")
    public final class387 field3110;

    @ObfuscatedName("ki.ao")
    public final class387 field3108;

    @ObfuscatedName("ki.ah")
    public final HashMap field3104;

    @ObfuscatedName("ki.av")
    public int field3114;

    @ObfuscatedName("ki.aq")
    public int field3112;

    @ObfuscatedName("ki.ap")
    public int field3115;

    @ObfuscatedName("ki.ae")
    public int field3116;

    @ObfuscatedName("ki.ax")
    public int field3117 = 0;

    public class283(class559[] arg0, HashMap arg1, class387 arg2, class387 arg3) {
        this.field3109 = arg0;
        this.field3104 = arg1;
        this.field3110 = arg2;
        this.field3108 = arg3;
    }

    @ObfuscatedName("ki.ak(Lor;Ljava/lang/String;ZI)V")
    public void method5320(class387 arg0, String arg1, boolean arg2) {
        if (this.field3103) {
            return;
        }
        this.field3107 = false;
        this.field3103 = true;
        System.nanoTime();
        int var4 = arg0.method6587(class300.field3237.field3239);
        int var5 = arg0.method6647(var4, arg1);
        class546 var6 = new class546(arg0.method6620(class300.field3237.field3239, arg1));
        class546 var7 = new class546(arg0.method6620(class300.field3234.field3239, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field3102 = new class302();
        try {
            this.field3102.method5461(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field3102.method5145();
        this.field3102.method5134();
        this.field3102.method5135();
        this.field3114 = this.field3102.method5129() * 64;
        this.field3112 = this.field3102.method5131() * 64;
        this.field3115 = (this.field3102.method5130() - this.field3102.method5129() + 1) * 64;
        this.field3116 = (this.field3102.method5154() - this.field3102.method5131() + 1) * 64;
        int var9 = this.field3102.method5130() - this.field3102.method5129() + 1;
        int var10 = this.field3102.method5154() - this.field3102.method5131() + 1;
        System.nanoTime();
        System.nanoTime();
        class282.field3097.method5535();
        this.field3111 = new class282[var9][var10];
        Iterator var11 = this.field3102.field3244.iterator();
        while (var11.hasNext()) {
            class276 var12 = (class276) var11.next();
            int var13 = var12.field3184;
            int var14 = var12.field3174;
            int var15 = var13 - this.field3102.method5129();
            int var16 = var14 - this.field3102.method5131();
            this.field3111[var15][var16] = new class282(var13, var14, this.field3102.method5126(), this.field3104);
            this.field3111[var15][var16].method5194(var12, this.field3102.field3243);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field3111[var17][var18] == null) {
                    this.field3111[var17][var18] = new class282(this.field3102.method5129() + var17, this.field3102.method5131() + var18, this.field3102.method5126(), this.field3104);
                    this.field3111[var17][var18].method5195(this.field3102.field3242, this.field3102.field3243);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6589(class300.field3235.field3239, arg1)) {
            byte[] var19 = arg0.method6620(class300.field3235.field3239, arg1);
            this.field3105 = class31.method7694(var19);
        }
        System.nanoTime();
        arg0.method6583();
        arg0.method6585();
        this.field3107 = true;
    }

    @ObfuscatedName("ki.al(I)V")
    public final void method5317() {
        this.field3106 = null;
    }

    @ObfuscatedName("ki.aj(IIIIIIIIB)V")
    public final void method5318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5413;
        int var10 = Statics.field5418;
        int var11 = Statics.field5415;
        float[] var12 = Statics.field5416;
        int[] var13 = new int[4];
        class556.method9155(var13);
        class291 var14 = this.method5322(arg0, arg1, arg2, arg3);
        float var15 = this.method5327(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field3117 = var16;
        if (!this.field3118.containsKey(var16)) {
            class303 var17 = new class303(var16);
            var17.method5488();
            this.field3118.put(var16, var17);
        }
        int var18 = var14.field3189 + var14.field3188 - 1;
        int var19 = var14.field3192 + var14.field3190 - 1;
        for (int var20 = var14.field3189; var20 <= var18; var20++) {
            for (int var21 = var14.field3190; var21 <= var19; var21++) {
                this.field3111[var20][var21].method5293(var16, (class303) this.field3118.get(var16), this.field3109, this.field3110, this.field3108);
            }
        }
        class248.method4341(var9, var10, var11, var12);
        class556.method9107(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field3114 + arg0;
        int var24 = this.field3112 + arg1;
        for (int var25 = var14.field3189; var25 < var14.field3189 + var14.field3188; var25++) {
            for (int var26 = var14.field3190; var26 < var14.field3192 + var14.field3190; var26++) {
                this.field3111[var25][var26].method5193((this.field3111[var25][var26].field3088 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field3111[var25][var26].field3089 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("ki.az(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method5351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class291 var14 = this.method5322(arg0, arg1, arg2, arg3);
        float var15 = this.method5327(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field3114 + arg0;
        int var18 = this.field3112 + arg1;
        for (int var19 = var14.field3189; var19 < var14.field3189 + var14.field3188; var19++) {
            for (int var20 = var14.field3190; var20 < var14.field3192 + var14.field3190; var20++) {
                if (arg12) {
                    this.field3111[var19][var20].method5239();
                }
                this.field3111[var19][var20].method5243((this.field3111[var19][var20].field3088 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field3111[var19][var20].field3089 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field3189; var21 < var14.field3189 + var14.field3188; var21++) {
            for (int var22 = var14.field3190; var22 < var14.field3192 + var14.field3190; var22++) {
                this.field3111[var21][var22].method5204(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ki.af(IIIILjava/util/HashSet;III)V")
    public void method5319(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field3105 == null) {
            return;
        }
        this.field3105.method9243(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field3106 == null) {
            this.method5326();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field3106.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class299 var12 = (class299) var11.next();
                int var13 = (var12.field3231.field3714 - this.field3114) * arg2 / this.field3115;
                int var14 = arg3 - (var12.field3231.field3713 - this.field3112) * arg3 / this.field3116;
                class556.method9110(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ki.aa(IIIIIIIIIII)Ljava/util/List;")
    public List method5316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field3107) {
            return var11;
        }
        class291 var12 = this.method5322(arg0, arg1, arg2, arg3);
        float var13 = this.method5327(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field3114 + arg0;
        int var16 = this.field3112 + arg1;
        for (int var17 = var12.field3189; var17 < var12.field3189 + var12.field3188; var17++) {
            for (int var18 = var12.field3190; var18 < var12.field3192 + var12.field3190; var18++) {
                List var19 = this.field3111[var17][var18].method5224((this.field3111[var17][var18].field3088 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field3111[var17][var18].field3089 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ki.at(IIIII)Lly;")
    public class291 method5322(int arg0, int arg1, int arg2, int arg3) {
        class291 var5 = new class291(this);
        int var6 = this.field3114 + arg0;
        int var7 = this.field3112 + arg1;
        int var8 = this.field3114 + arg2;
        int var9 = this.field3112 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field3188 = var12 - var10 + 1;
        var5.field3192 = var13 - var11 + 1;
        var5.field3189 = var10 - this.field3102.method5129();
        var5.field3190 = var11 - this.field3102.method5131();
        if (var5.field3189 < 0) {
            var5.field3188 += var5.field3189;
            var5.field3189 = 0;
        }
        if (var5.field3189 > this.field3111.length - var5.field3188) {
            var5.field3188 = this.field3111.length - var5.field3189;
        }
        if (var5.field3190 < 0) {
            var5.field3192 += var5.field3190;
            var5.field3190 = 0;
        }
        if (var5.field3190 > this.field3111[0].length - var5.field3192) {
            var5.field3192 = this.field3111[0].length - var5.field3190;
        }
        var5.field3188 = Math.min(var5.field3188, this.field3111.length);
        var5.field3192 = Math.min(var5.field3192, this.field3111[0].length);
        return var5;
    }

    @ObfuscatedName("ki.ab(B)Z")
    public boolean method5323() {
        return this.field3107;
    }

    @ObfuscatedName("ki.ac(I)I")
    public int method5324() {
        return this.field3102.method5117();
    }

    @ObfuscatedName("ki.ao(B)Ljava/util/HashMap;")
    public HashMap method5321() {
        this.method5326();
        return this.field3106;
    }

    @ObfuscatedName("ki.ah(B)V")
    public void method5326() {
        if (this.field3106 == null) {
            this.field3106 = new HashMap();
        }
        this.field3106.clear();
        for (int var1 = 0; var1 < this.field3111.length; var1++) {
            for (int var2 = 0; var2 < this.field3111[var1].length; var2++) {
                List var3 = this.field3111[var1][var2].method5225();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class299 var5 = (class299) var4.next();
                    if (var5.method5447()) {
                        int var6 = var5.method5061();
                        if (this.field3106.containsKey(var6)) {
                            List var8 = (List) this.field3106.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field3106.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ki.av(IIB)F")
    public float method5327(int arg0, int arg1) {
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
