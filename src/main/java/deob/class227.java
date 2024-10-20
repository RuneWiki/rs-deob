package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("hm")
public final class class227 {

    @ObfuscatedName("hm.c")
    public boolean field2740 = false;

    @ObfuscatedName("hm.v")
    public boolean field2729 = false;

    @ObfuscatedName("hm.q")
    public class246 field2736;

    @ObfuscatedName("hm.f")
    public class456 field2730;

    @ObfuscatedName("hm.j")
    public HashMap field2738;

    @ObfuscatedName("hm.e")
    public class226[][] field2739;

    @ObfuscatedName("hm.g")
    public HashMap field2734 = new HashMap();

    @ObfuscatedName("hm.w")
    public class455[] field2735;

    @ObfuscatedName("hm.y")
    public final class315 field2731;

    @ObfuscatedName("hm.i")
    public final class315 field2737;

    @ObfuscatedName("hm.s")
    public final HashMap field2728;

    @ObfuscatedName("hm.t")
    public int field2732;

    @ObfuscatedName("hm.z")
    public int field2733;

    @ObfuscatedName("hm.r")
    public int field2741;

    @ObfuscatedName("hm.u")
    public int field2742;

    @ObfuscatedName("hm.k")
    public int field2743 = 0;

    public class227(class455[] arg0, HashMap arg1, class315 arg2, class315 arg3) {
        this.field2735 = arg0;
        this.field2728 = arg1;
        this.field2731 = arg2;
        this.field2737 = arg3;
    }

    @ObfuscatedName("hm.c(Llh;Ljava/lang/String;ZI)V")
    public void method4481(class315 arg0, String arg1, boolean arg2) {
        if (this.field2729) {
            return;
        }
        this.field2740 = false;
        this.field2729 = true;
        System.nanoTime();
        int var4 = arg0.method5349(class244.field2868.field2865);
        int var5 = arg0.method5315(var4, arg1);
        class443 var6 = new class443(arg0.method5319(class244.field2868.field2865, arg1));
        class443 var7 = new class443(arg0.method5319(class244.field2866.field2865, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2736 = new class246();
        try {
            this.field2736.method4610(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2736.method4289();
        this.field2736.method4290();
        this.field2736.method4299();
        this.field2732 = this.field2736.method4283() * 64;
        this.field2733 = this.field2736.method4287() * 64;
        this.field2741 = (this.field2736.method4292() - this.field2736.method4283() + 1) * 64;
        this.field2742 = (this.field2736.method4288() - this.field2736.method4287() + 1) * 64;
        int var9 = this.field2736.method4292() - this.field2736.method4283() + 1;
        int var10 = this.field2736.method4288() - this.field2736.method4287() + 1;
        System.nanoTime();
        System.nanoTime();
        class226.field2716.method4666();
        this.field2739 = new class226[var9][var10];
        Iterator var11 = this.field2736.field2872.iterator();
        while (var11.hasNext()) {
            class220 var12 = (class220) var11.next();
            int var13 = var12.field2798;
            int var14 = var12.field2799;
            int var15 = var13 - this.field2736.method4283();
            int var16 = var14 - this.field2736.method4287();
            this.field2739[var15][var16] = new class226(var13, var14, this.field2736.method4342(), this.field2728);
            this.field2739[var15][var16].method4390(var12, this.field2736.field2874);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2739[var17][var18] == null) {
                    this.field2739[var17][var18] = new class226(this.field2736.method4283() + var17, this.field2736.method4287() + var18, this.field2736.method4342(), this.field2728);
                    this.field2739[var17][var18].method4346(this.field2736.field2873, this.field2736.field2874);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method5318(class244.field2867.field2865, arg1)) {
            byte[] var19 = arg0.method5319(class244.field2867.field2865, arg1);
            this.field2730 = class29.method3589(var19);
        }
        System.nanoTime();
        arg0.method5358();
        arg0.method5360();
        this.field2740 = true;
    }

    @ObfuscatedName("hm.v(I)V")
    public final void method4465() {
        this.field2738 = null;
    }

    @ObfuscatedName("hm.q(IIIIIIIII)V")
    public final void method4486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4770;
        int var10 = Statics.field4773;
        int var11 = Statics.field4769;
        int[] var12 = new int[4];
        class452.method7407(var12);
        class235 var13 = this.method4470(arg0, arg1, arg2, arg3);
        float var14 = this.method4474(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2743 = var15;
        if (!this.field2734.containsKey(var15)) {
            class247 var16 = new class247(var15);
            var16.method4646();
            this.field2734.put(var15, var16);
        }
        int var17 = var13.field2817 + var13.field2815 - 1;
        int var18 = var13.field2814 + var13.field2813 - 1;
        for (int var19 = var13.field2815; var19 <= var17; var19++) {
            for (int var20 = var13.field2813; var20 <= var18; var20++) {
                this.field2739[var19][var20].method4353(var15, (class247) this.field2734.get(var15), this.field2735, this.field2731, this.field2737);
            }
        }
        class452.method7393(var9, var10, var11);
        class452.method7340(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2732 + arg0;
        int var23 = this.field2733 + arg1;
        for (int var24 = var13.field2815; var24 < var13.field2817 + var13.field2815; var24++) {
            for (int var25 = var13.field2813; var25 < var13.field2814 + var13.field2813; var25++) {
                this.field2739[var24][var25].method4344((this.field2739[var24][var25].field2717 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2739[var24][var25].field2726 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("hm.f(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method4492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class235 var14 = this.method4470(arg0, arg1, arg2, arg3);
        float var15 = this.method4474(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2732 + arg0;
        int var18 = this.field2733 + arg1;
        for (int var19 = var14.field2815; var19 < var14.field2817 + var14.field2815; var19++) {
            for (int var20 = var14.field2813; var20 < var14.field2814 + var14.field2813; var20++) {
                if (arg12) {
                    this.field2739[var19][var20].method4349();
                }
                this.field2739[var19][var20].method4388((this.field2739[var19][var20].field2717 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2739[var19][var20].field2726 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2815; var21 < var14.field2817 + var14.field2815; var21++) {
            for (int var22 = var14.field2813; var22 < var14.field2814 + var14.field2813; var22++) {
                this.field2739[var21][var22].method4355(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("hm.j(IIIILjava/util/HashSet;III)V")
    public void method4482(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2730 == null) {
            return;
        }
        this.field2730.method7562(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2738 == null) {
            this.method4473();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2738.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class243 var12 = (class243) var11.next();
                int var13 = (var12.field2861.field3328 - this.field2732) * arg2 / this.field2741;
                int var14 = arg3 - (var12.field2861.field3330 - this.field2733) * arg3 / this.field2742;
                class452.method7349(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("hm.e(IIIIIIIIIII)Ljava/util/List;")
    public List method4469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2740) {
            return var11;
        }
        class235 var12 = this.method4470(arg0, arg1, arg2, arg3);
        float var13 = this.method4474(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2732 + arg0;
        int var16 = this.field2733 + arg1;
        for (int var17 = var12.field2815; var17 < var12.field2817 + var12.field2815; var17++) {
            for (int var18 = var12.field2813; var18 < var12.field2814 + var12.field2813; var18++) {
                List var19 = this.field2739[var17][var18].method4452((this.field2739[var17][var18].field2717 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2739[var17][var18].field2726 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("hm.g(IIIII)Lij;")
    public class235 method4470(int arg0, int arg1, int arg2, int arg3) {
        class235 var5 = new class235(this);
        int var6 = this.field2732 + arg0;
        int var7 = this.field2733 + arg1;
        int var8 = this.field2732 + arg2;
        int var9 = this.field2733 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2817 = var12 - var10 + 1;
        var5.field2814 = var13 - var11 + 1;
        var5.field2815 = var10 - this.field2736.method4283();
        var5.field2813 = var11 - this.field2736.method4287();
        if (var5.field2815 < 0) {
            var5.field2817 += var5.field2815;
            var5.field2815 = 0;
        }
        if (var5.field2815 > this.field2739.length - var5.field2817) {
            var5.field2817 = this.field2739.length - var5.field2815;
        }
        if (var5.field2813 < 0) {
            var5.field2814 += var5.field2813;
            var5.field2813 = 0;
        }
        if (var5.field2813 > this.field2739[0].length - var5.field2814) {
            var5.field2814 = this.field2739[0].length - var5.field2813;
        }
        var5.field2817 = Math.min(var5.field2817, this.field2739.length);
        var5.field2814 = Math.min(var5.field2814, this.field2739[0].length);
        return var5;
    }

    @ObfuscatedName("hm.w(I)Z")
    public boolean method4485() {
        return this.field2740;
    }

    @ObfuscatedName("hm.y(I)Ljava/util/HashMap;")
    public HashMap method4472() {
        this.method4473();
        return this.field2738;
    }

    @ObfuscatedName("hm.i(I)V")
    public void method4473() {
        if (this.field2738 == null) {
            this.field2738 = new HashMap();
        }
        this.field2738.clear();
        for (int var1 = 0; var1 < this.field2739.length; var1++) {
            for (int var2 = 0; var2 < this.field2739[var1].length; var2++) {
                List var3 = this.field2739[var1][var2].method4435();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class243 var5 = (class243) var4.next();
                    if (var5.method4602()) {
                        int var6 = var5.method4228();
                        if (this.field2738.containsKey(var6)) {
                            List var8 = (List) this.field2738.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2738.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hm.s(III)F")
    public float method4474(int arg0, int arg1) {
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
