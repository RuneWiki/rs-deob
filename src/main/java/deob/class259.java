package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("jd")
public final class class259 {

    @ObfuscatedName("jd.au")
    public boolean field2938 = false;

    @ObfuscatedName("jd.ae")
    public boolean field2947 = false;

    @ObfuscatedName("jd.ao")
    public class278 field2935;

    @ObfuscatedName("jd.at")
    public class529 field2937;

    @ObfuscatedName("jd.ac")
    public HashMap field2936;

    @ObfuscatedName("jd.ai")
    public class258[][] field2939;

    @ObfuscatedName("jd.az")
    public HashMap field2946 = new HashMap();

    @ObfuscatedName("jd.ap")
    public class528[] field2941;

    @ObfuscatedName("jd.aa")
    public final class359 field2942;

    @ObfuscatedName("jd.af")
    public final class359 field2943;

    @ObfuscatedName("jd.ad")
    public final HashMap field2940;

    @ObfuscatedName("jd.aq")
    public int field2945;

    @ObfuscatedName("jd.al")
    public int field2934;

    @ObfuscatedName("jd.an")
    public int field2944;

    @ObfuscatedName("jd.ar")
    public int field2948;

    @ObfuscatedName("jd.ab")
    public int field2949 = 0;

    public class259(class528[] arg0, HashMap arg1, class359 arg2, class359 arg3) {
        this.field2941 = arg0;
        this.field2940 = arg1;
        this.field2942 = arg2;
        this.field2943 = arg3;
    }

    @ObfuscatedName("jd.au(Lnu;Ljava/lang/String;ZI)V")
    public void method4926(class359 arg0, String arg1, boolean arg2) {
        if (this.field2947) {
            return;
        }
        this.field2938 = false;
        this.field2947 = true;
        System.nanoTime();
        int var4 = arg0.method6167(class276.field3069.field3068);
        int var5 = arg0.method6145(var4, arg1);
        class515 var6 = new class515(arg0.method6146(class276.field3069.field3068, arg1));
        class515 var7 = new class515(arg0.method6146(class276.field3064.field3068, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2935 = new class278();
        try {
            this.field2935.method5093(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2935.method4784();
        this.field2935.method4748();
        this.field2935.method4749();
        this.field2945 = this.field2935.method4743() * 64;
        this.field2934 = this.field2935.method4776() * 64;
        this.field2944 = (this.field2935.method4790() - this.field2935.method4743() + 1) * 64;
        this.field2948 = (this.field2935.method4763() - this.field2935.method4776() + 1) * 64;
        int var9 = this.field2935.method4790() - this.field2935.method4743() + 1;
        int var10 = this.field2935.method4763() - this.field2935.method4776() + 1;
        System.nanoTime();
        System.nanoTime();
        class258.field2925.method5152();
        this.field2939 = new class258[var9][var10];
        Iterator var11 = this.field2935.field3071.iterator();
        while (var11.hasNext()) {
            class252 var12 = (class252) var11.next();
            int var13 = var12.field3002;
            int var14 = var12.field3010;
            int var15 = var13 - this.field2935.method4743();
            int var16 = var14 - this.field2935.method4776();
            this.field2939[var15][var16] = new class258(var13, var14, this.field2935.method4741(), this.field2940);
            this.field2939[var15][var16].method4894(var12, this.field2935.field3073);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2939[var17][var18] == null) {
                    this.field2939[var17][var18] = new class258(this.field2935.method4743() + var17, this.field2935.method4776() + var18, this.field2935.method4741(), this.field2940);
                    this.field2939[var17][var18].method4802(this.field2935.field3072, this.field2935.field3073);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6150(class276.field3063.field3068, arg1)) {
            byte[] var19 = arg0.method6146(class276.field3063.field3068, arg1);
            this.field2937 = class31.method4968(var19);
        }
        System.nanoTime();
        arg0.method6140();
        arg0.method6142();
        this.field2938 = true;
    }

    @ObfuscatedName("jd.ae(I)V")
    public final void method4939() {
        this.field2936 = null;
    }

    @ObfuscatedName("jd.ao(IIIIIIIIB)V")
    public final void method4928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5183;
        int var10 = Statics.field5181;
        int var11 = Statics.field5182;
        float[] var12 = Statics.field5185;
        int[] var13 = new int[4];
        class525.method8606(var13);
        class267 var14 = this.method4932(arg0, arg1, arg2, arg3);
        float var15 = this.method4941(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field2949 = var16;
        if (!this.field2946.containsKey(var16)) {
            class279 var17 = new class279(var16);
            var17.method5119();
            this.field2946.put(var16, var17);
        }
        int var18 = var14.field3018 + var14.field3017 - 1;
        int var19 = var14.field3019 + var14.field3016 - 1;
        for (int var20 = var14.field3017; var20 <= var18; var20++) {
            for (int var21 = var14.field3019; var21 <= var19; var21++) {
                this.field2939[var20][var21].method4903(var16, (class279) this.field2946.get(var16), this.field2941, this.field2942, this.field2943);
            }
        }
        class227.method4064(var9, var10, var11, var12);
        class525.method8673(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field2945 + arg0;
        int var24 = this.field2934 + arg1;
        for (int var25 = var14.field3017; var25 < var14.field3018 + var14.field3017; var25++) {
            for (int var26 = var14.field3019; var26 < var14.field3019 + var14.field3016; var26++) {
                this.field2939[var25][var26].method4875((this.field2939[var25][var26].field2931 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field2939[var25][var26].field2918 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("jd.at(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method4929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class267 var14 = this.method4932(arg0, arg1, arg2, arg3);
        float var15 = this.method4941(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2945 + arg0;
        int var18 = this.field2934 + arg1;
        for (int var19 = var14.field3017; var19 < var14.field3018 + var14.field3017; var19++) {
            for (int var20 = var14.field3019; var20 < var14.field3019 + var14.field3016; var20++) {
                if (arg12) {
                    this.field2939[var19][var20].method4805();
                }
                this.field2939[var19][var20].method4810((this.field2939[var19][var20].field2931 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2939[var19][var20].field2918 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field3017; var21 < var14.field3018 + var14.field3017; var21++) {
            for (int var22 = var14.field3019; var22 < var14.field3019 + var14.field3016; var22++) {
                this.field2939[var21][var22].method4811(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("jd.ac(IIIILjava/util/HashSet;IIB)V")
    public void method4930(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2937 == null) {
            return;
        }
        this.field2937.method8794(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2936 == null) {
            this.method4953();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2936.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class275 var12 = (class275) var11.next();
                int var13 = (var12.field3058.field3543 - this.field2945) * arg2 / this.field2944;
                int var14 = arg3 - (var12.field3058.field3545 - this.field2934) * arg3 / this.field2948;
                class525.method8610(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("jd.ai(IIIIIIIIIII)Ljava/util/List;")
    public List method4931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2938) {
            return var11;
        }
        class267 var12 = this.method4932(arg0, arg1, arg2, arg3);
        float var13 = this.method4941(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2945 + arg0;
        int var16 = this.field2934 + arg1;
        for (int var17 = var12.field3017; var17 < var12.field3018 + var12.field3017; var17++) {
            for (int var18 = var12.field3019; var18 < var12.field3019 + var12.field3016; var18++) {
                List var19 = this.field2939[var17][var18].method4831((this.field2939[var17][var18].field2931 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2939[var17][var18].field2918 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("jd.az(IIIIB)Lks;")
    public class267 method4932(int arg0, int arg1, int arg2, int arg3) {
        class267 var5 = new class267(this);
        int var6 = this.field2945 + arg0;
        int var7 = this.field2934 + arg1;
        int var8 = this.field2945 + arg2;
        int var9 = this.field2934 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field3018 = var12 - var10 + 1;
        var5.field3016 = var13 - var11 + 1;
        var5.field3017 = var10 - this.field2935.method4743();
        var5.field3019 = var11 - this.field2935.method4776();
        if (var5.field3017 < 0) {
            var5.field3018 += var5.field3017;
            var5.field3017 = 0;
        }
        if (var5.field3017 > this.field2939.length - var5.field3018) {
            var5.field3018 = this.field2939.length - var5.field3017;
        }
        if (var5.field3019 < 0) {
            var5.field3016 += var5.field3019;
            var5.field3019 = 0;
        }
        if (var5.field3019 > this.field2939[0].length - var5.field3016) {
            var5.field3016 = this.field2939[0].length - var5.field3019;
        }
        var5.field3018 = Math.min(var5.field3018, this.field2939.length);
        var5.field3016 = Math.min(var5.field3016, this.field2939[0].length);
        return var5;
    }

    @ObfuscatedName("jd.ap(B)Z")
    public boolean method4933() {
        return this.field2938;
    }

    @ObfuscatedName("jd.aa(I)Ljava/util/HashMap;")
    public HashMap method4934() {
        this.method4953();
        return this.field2936;
    }

    @ObfuscatedName("jd.af(I)V")
    public void method4953() {
        if (this.field2936 == null) {
            this.field2936 = new HashMap();
        }
        this.field2936.clear();
        for (int var1 = 0; var1 < this.field2939.length; var1++) {
            for (int var2 = 0; var2 < this.field2939[var1].length; var2++) {
                List var3 = this.field2939[var1][var2].method4832();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class275 var5 = (class275) var4.next();
                    if (var5.method5074()) {
                        int var6 = var5.method4685();
                        if (this.field2936.containsKey(var6)) {
                            List var8 = (List) this.field2936.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2936.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jd.ad(IIB)F")
    public float method4941(int arg0, int arg1) {
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
