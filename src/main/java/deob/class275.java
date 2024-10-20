package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kh")
public final class class275 {

    @ObfuscatedName("kh.az")
    public boolean field3034 = false;

    @ObfuscatedName("kh.ah")
    public boolean field3019 = false;

    @ObfuscatedName("kh.af")
    public class294 field3020;

    @ObfuscatedName("kh.at")
    public class549 field3021;

    @ObfuscatedName("kh.an")
    public HashMap field3022;

    @ObfuscatedName("kh.ao")
    public class274[][] field3033;

    @ObfuscatedName("kh.ab")
    public HashMap field3030 = new HashMap();

    @ObfuscatedName("kh.aw")
    public class548[] field3025;

    @ObfuscatedName("kh.ad")
    public final class379 field3026;

    @ObfuscatedName("kh.al")
    public final class379 field3024;

    @ObfuscatedName("kh.as")
    public final HashMap field3027;

    @ObfuscatedName("kh.ag")
    public int field3018;

    @ObfuscatedName("kh.ai")
    public int field3028;

    @ObfuscatedName("kh.ax")
    public int field3031;

    @ObfuscatedName("kh.ar")
    public int field3032;

    @ObfuscatedName("kh.aj")
    public int field3029 = 0;

    public class275(class548[] arg0, HashMap arg1, class379 arg2, class379 arg3) {
        this.field3025 = arg0;
        this.field3027 = arg1;
        this.field3026 = arg2;
        this.field3024 = arg3;
    }

    @ObfuscatedName("kh.az(Loc;Ljava/lang/String;ZI)V")
    public void method5076(class379 arg0, String arg1, boolean arg2) {
        if (this.field3019) {
            return;
        }
        this.field3034 = false;
        this.field3019 = true;
        System.nanoTime();
        int var4 = arg0.method6386(class292.field3155.field3160);
        int var5 = arg0.method6345(var4, arg1);
        class535 var6 = new class535(arg0.method6347(class292.field3155.field3160, arg1));
        class535 var7 = new class535(arg0.method6347(class292.field3156.field3160, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field3020 = new class294();
        try {
            this.field3020.method5236(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field3020.method4889();
        this.field3020.method4952();
        this.field3020.method4900();
        this.field3018 = this.field3020.method4897() * 64;
        this.field3028 = this.field3020.method4899() * 64;
        this.field3031 = (this.field3020.method4898() - this.field3020.method4897() + 1) * 64;
        this.field3032 = (this.field3020.method4956() - this.field3020.method4899() + 1) * 64;
        int var9 = this.field3020.method4898() - this.field3020.method4897() + 1;
        int var10 = this.field3020.method4956() - this.field3020.method4899() + 1;
        System.nanoTime();
        System.nanoTime();
        class274.field3006.method5322();
        this.field3033 = new class274[var9][var10];
        Iterator var11 = this.field3020.field3163.iterator();
        while (var11.hasNext()) {
            class268 var12 = (class268) var11.next();
            int var13 = var12.field3093;
            int var14 = var12.field3094;
            int var15 = var13 - this.field3020.method4897();
            int var16 = var14 - this.field3020.method4899();
            this.field3033[var15][var16] = new class274(var13, var14, this.field3020.method4894(), this.field3027);
            this.field3033[var15][var16].method4965(var12, this.field3020.field3165);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field3033[var17][var18] == null) {
                    this.field3033[var17][var18] = new class274(this.field3020.method4897() + var17, this.field3020.method4899() + var18, this.field3020.method4894(), this.field3027);
                    this.field3033[var17][var18].method4966(this.field3020.field3164, this.field3020.field3165);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6411(class292.field3157.field3160, arg1)) {
            byte[] var19 = arg0.method6347(class292.field3157.field3160, arg1);
            this.field3021 = class31.method6516(var19);
        }
        System.nanoTime();
        arg0.method6340();
        arg0.method6342();
        this.field3034 = true;
    }

    @ObfuscatedName("kh.ah(I)V")
    public final void method5077() {
        this.field3022 = null;
    }

    @ObfuscatedName("kh.af(IIIIIIIII)V")
    public final void method5075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5302;
        int var10 = Statics.field5303;
        int var11 = Statics.field5310;
        float[] var12 = Statics.field5305;
        int[] var13 = new int[4];
        class545.method8790(var13);
        class283 var14 = this.method5082(arg0, arg1, arg2, arg3);
        float var15 = this.method5106(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field3029 = var16;
        if (!this.field3030.containsKey(var16)) {
            class295 var17 = new class295(var16);
            var17.method5277();
            this.field3030.put(var16, var17);
        }
        int var18 = var14.field3112 + var14.field3110 - 1;
        int var19 = var14.field3114 + var14.field3106 - 1;
        for (int var20 = var14.field3112; var20 <= var18; var20++) {
            for (int var21 = var14.field3114; var21 <= var19; var21++) {
                this.field3033[var20][var21].method4973(var16, (class295) this.field3030.get(var16), this.field3025, this.field3026, this.field3024);
            }
        }
        class243.method4210(var9, var10, var11, var12);
        class545.method8842(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field3018 + arg0;
        int var24 = this.field3028 + arg1;
        for (int var25 = var14.field3112; var25 < var14.field3112 + var14.field3110; var25++) {
            for (int var26 = var14.field3114; var26 < var14.field3114 + var14.field3106; var26++) {
                this.field3033[var25][var26].method4964((this.field3033[var25][var26].field3003 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field3033[var25][var26].field3008 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("kh.at(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method5079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class283 var14 = this.method5082(arg0, arg1, arg2, arg3);
        float var15 = this.method5106(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field3018 + arg0;
        int var18 = this.field3028 + arg1;
        for (int var19 = var14.field3112; var19 < var14.field3112 + var14.field3110; var19++) {
            for (int var20 = var14.field3114; var20 < var14.field3114 + var14.field3106; var20++) {
                if (arg12) {
                    this.field3033[var19][var20].method4969();
                }
                this.field3033[var19][var20].method5011((this.field3033[var19][var20].field3003 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field3033[var19][var20].field3008 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field3112; var21 < var14.field3112 + var14.field3110; var21++) {
            for (int var22 = var14.field3114; var22 < var14.field3114 + var14.field3106; var22++) {
                this.field3033[var21][var22].method5073(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("kh.an(IIIILjava/util/HashSet;III)V")
    public void method5080(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field3021 == null) {
            return;
        }
        this.field3021.method8902(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field3022 == null) {
            this.method5086();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field3022.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class291 var12 = (class291) var11.next();
                int var13 = (var12.field3149.field3638 - this.field3018) * arg2 / this.field3031;
                int var14 = arg3 - (var12.field3149.field3640 - this.field3028) * arg3 / this.field3032;
                class545.method8781(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("kh.ao(IIIIIIIIIII)Ljava/util/List;")
    public List method5081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field3034) {
            return var11;
        }
        class283 var12 = this.method5082(arg0, arg1, arg2, arg3);
        float var13 = this.method5106(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field3018 + arg0;
        int var16 = this.field3028 + arg1;
        for (int var17 = var12.field3112; var17 < var12.field3112 + var12.field3110; var17++) {
            for (int var18 = var12.field3114; var18 < var12.field3114 + var12.field3106; var18++) {
                List var19 = this.field3033[var17][var18].method4995((this.field3033[var17][var18].field3003 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field3033[var17][var18].field3008 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("kh.ab(IIIII)Lkc;")
    public class283 method5082(int arg0, int arg1, int arg2, int arg3) {
        class283 var5 = new class283(this);
        int var6 = this.field3018 + arg0;
        int var7 = this.field3028 + arg1;
        int var8 = this.field3018 + arg2;
        int var9 = this.field3028 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field3110 = var12 - var10 + 1;
        var5.field3106 = var13 - var11 + 1;
        var5.field3112 = var10 - this.field3020.method4897();
        var5.field3114 = var11 - this.field3020.method4899();
        if (var5.field3112 < 0) {
            var5.field3110 += var5.field3112;
            var5.field3112 = 0;
        }
        if (var5.field3112 > this.field3033.length - var5.field3110) {
            var5.field3110 = this.field3033.length - var5.field3112;
        }
        if (var5.field3114 < 0) {
            var5.field3106 += var5.field3114;
            var5.field3114 = 0;
        }
        if (var5.field3114 > this.field3033[0].length - var5.field3106) {
            var5.field3106 = this.field3033[0].length - var5.field3114;
        }
        var5.field3110 = Math.min(var5.field3110, this.field3033.length);
        var5.field3106 = Math.min(var5.field3106, this.field3033[0].length);
        return var5;
    }

    @ObfuscatedName("kh.aw(B)Z")
    public boolean method5114() {
        return this.field3034;
    }

    @ObfuscatedName("kh.ad(I)I")
    public int method5084() {
        return this.field3020.method4924();
    }

    @ObfuscatedName("kh.al(I)Ljava/util/HashMap;")
    public HashMap method5085() {
        this.method5086();
        return this.field3022;
    }

    @ObfuscatedName("kh.as(I)V")
    public void method5086() {
        if (this.field3022 == null) {
            this.field3022 = new HashMap();
        }
        this.field3022.clear();
        for (int var1 = 0; var1 < this.field3033.length; var1++) {
            for (int var2 = 0; var2 < this.field3033[var1].length; var2++) {
                List var3 = this.field3033[var1][var2].method4996();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class291 var5 = (class291) var4.next();
                    if (var5.method5220()) {
                        int var6 = var5.method4842();
                        if (this.field3022.containsKey(var6)) {
                            List var8 = (List) this.field3022.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field3022.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kh.ag(IIB)F")
    public float method5106(int arg0, int arg1) {
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
