package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kk")
public final class class273 {

    @ObfuscatedName("kk.ac")
    public boolean field2970 = false;

    @ObfuscatedName("kk.al")
    public boolean field2971 = false;

    @ObfuscatedName("kk.ak")
    public class292 field2963;

    @ObfuscatedName("kk.ax")
    public class544 field2961;

    @ObfuscatedName("kk.ao")
    public HashMap field2962;

    @ObfuscatedName("kk.ah")
    public class272[][] field2959;

    @ObfuscatedName("kk.ar")
    public HashMap field2964 = new HashMap();

    @ObfuscatedName("kk.ab")
    public class543[] field2965;

    @ObfuscatedName("kk.am")
    public final class374 field2966;

    @ObfuscatedName("kk.av")
    public final class374 field2967;

    @ObfuscatedName("kk.ag")
    public final HashMap field2968;

    @ObfuscatedName("kk.aa")
    public int field2974;

    @ObfuscatedName("kk.ap")
    public int field2960;

    @ObfuscatedName("kk.ay")
    public int field2958;

    @ObfuscatedName("kk.as")
    public int field2972;

    @ObfuscatedName("kk.aj")
    public int field2969 = 0;

    public class273(class543[] arg0, HashMap arg1, class374 arg2, class374 arg3) {
        this.field2965 = arg0;
        this.field2968 = arg1;
        this.field2966 = arg2;
        this.field2967 = arg3;
    }

    @ObfuscatedName("kk.ac(Lom;Ljava/lang/String;ZZB)V")
    public void method5053(class374 arg0, String arg1, boolean arg2, boolean arg3) {
        if (this.field2971) {
            return;
        }
        this.field2970 = false;
        this.field2971 = true;
        System.nanoTime();
        int var5 = arg0.method6279(class290.field3096.field3093);
        int var6 = arg0.method6268(var5, arg1);
        class530 var7 = new class530(arg0.method6281(class290.field3096.field3093, arg1));
        class530 var8 = new class530(arg0.method6281(class290.field3092.field3093, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2963 = new class292();
        try {
            this.field2963.method5203(var7, var8, var6, arg2, arg3);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field2963.method4868();
        this.field2963.method4869();
        this.field2963.method4870();
        this.field2974 = this.field2963.method4864() * 64;
        this.field2960 = this.field2963.method4866() * 64;
        this.field2958 = (this.field2963.method4872() - this.field2963.method4864() + 1) * 64;
        this.field2972 = (this.field2963.method4918() - this.field2963.method4866() + 1) * 64;
        int var10 = this.field2963.method4872() - this.field2963.method4864() + 1;
        int var11 = this.field2963.method4918() - this.field2963.method4866() + 1;
        System.nanoTime();
        System.nanoTime();
        class272.method2958();
        this.field2959 = new class272[var10][var11];
        Iterator var12 = this.field2963.field3101.iterator();
        while (var12.hasNext()) {
            class266 var13 = (class266) var12.next();
            int var14 = var13.field3027;
            int var15 = var13.field3043;
            int var16 = var14 - this.field2963.method4864();
            int var17 = var15 - this.field2963.method4866();
            this.field2959[var16][var17] = new class272(var14, var15, this.field2963.method4902(), this.field2968);
            this.field2959[var16][var17].method5033(var13, this.field2963.field3098);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field2959[var18][var19] == null) {
                    this.field2959[var18][var19] = new class272(this.field2963.method4864() + var18, this.field2963.method4866() + var19, this.field2963.method4902(), this.field2968);
                    this.field2959[var18][var19].method4924(this.field2963.field3099, this.field2963.field3098);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method6285(class290.field3091.field3093, arg1)) {
            byte[] var20 = arg0.method6281(class290.field3091.field3093, arg1);
            this.field2961 = class31.method4487(var20);
        }
        System.nanoTime();
        arg0.method6286();
        arg0.method6277();
        this.field2970 = true;
    }

    @ObfuscatedName("kk.al(I)V")
    public final void method5068() {
        this.field2962 = null;
    }

    @ObfuscatedName("kk.ak(IIIIIIIII)V")
    public final void method5054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field5211;
        int var10 = Statics.field5207;
        int var11 = Statics.field5209;
        float[] var12 = Statics.field5210;
        int[] var13 = new int[4];
        class540.method8696(var13);
        class281 var14 = this.method5059(arg0, arg1, arg2, arg3);
        float var15 = this.method5064(arg6 - arg4, arg2 - arg0);
        int var16 = (int) Math.ceil((double) var15);
        this.field2969 = var16;
        if (!this.field2964.containsKey(var16)) {
            class293 var17 = new class293(var16);
            var17.method5208();
            this.field2964.put(var16, var17);
        }
        int var18 = var14.field3047 + var14.field3046 - 1;
        int var19 = var14.field3045 + var14.field3044 - 1;
        for (int var20 = var14.field3047; var20 <= var18; var20++) {
            for (int var21 = var14.field3044; var21 <= var19; var21++) {
                this.field2959[var20][var21].method5044(var16, (class293) this.field2964.get(var16), this.field2965, this.field2966, this.field2967);
            }
        }
        class241.method4165(var9, var10, var11, var12);
        class540.method8697(var13);
        int var22 = (int) (var15 * 64.0F);
        int var23 = this.field2974 + arg0;
        int var24 = this.field2960 + arg1;
        for (int var25 = var14.field3047; var25 < var14.field3047 + var14.field3046; var25++) {
            for (int var26 = var14.field3044; var26 < var14.field3045 + var14.field3044; var26++) {
                this.field2959[var25][var26].method4931((this.field2959[var25][var26].field2953 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field2959[var25][var26].field2949 * 64 - var24 + 64) * var22 / 64, var22);
            }
        }
    }

    @ObfuscatedName("kk.ax(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method5056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class281 var14 = this.method5059(arg0, arg1, arg2, arg3);
        float var15 = this.method5064(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2974 + arg0;
        int var18 = this.field2960 + arg1;
        for (int var19 = var14.field3047; var19 < var14.field3047 + var14.field3046; var19++) {
            for (int var20 = var14.field3044; var20 < var14.field3045 + var14.field3044; var20++) {
                if (arg12) {
                    this.field2959[var19][var20].method4927();
                }
                this.field2959[var19][var20].method4932((this.field2959[var19][var20].field2953 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2959[var19][var20].field2949 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field3047; var21 < var14.field3047 + var14.field3046; var21++) {
            for (int var22 = var14.field3044; var22 < var14.field3045 + var14.field3044; var22++) {
                this.field2959[var21][var22].method4933(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("kk.ao(IIIILjava/util/HashSet;IIB)V")
    public void method5072(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2961 == null) {
            return;
        }
        this.field2961.method8825(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2962 == null) {
            this.method5063();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2962.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class289 var12 = (class289) var11.next();
                int var13 = (var12.field3086.field3578 - this.field2974) * arg2 / this.field2958;
                int var14 = arg3 - (var12.field3086.field3574 - this.field2960) * arg3 / this.field2972;
                class540.method8775(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("kk.ah(IIIIIIIIIIB)Ljava/util/List;")
    public List method5058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2970) {
            return var11;
        }
        class281 var12 = this.method5059(arg0, arg1, arg2, arg3);
        float var13 = this.method5064(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2974 + arg0;
        int var16 = this.field2960 + arg1;
        for (int var17 = var12.field3047; var17 < var12.field3047 + var12.field3046; var17++) {
            for (int var18 = var12.field3044; var18 < var12.field3045 + var12.field3044; var18++) {
                List var19 = this.field2959[var17][var18].method4953((this.field2959[var17][var18].field2953 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2959[var17][var18].field2949 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("kk.ar(IIIII)Lkx;")
    public class281 method5059(int arg0, int arg1, int arg2, int arg3) {
        class281 var5 = new class281(this);
        int var6 = this.field2974 + arg0;
        int var7 = this.field2960 + arg1;
        int var8 = this.field2974 + arg2;
        int var9 = this.field2960 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field3046 = var12 - var10 + 1;
        var5.field3045 = var13 - var11 + 1;
        var5.field3047 = var10 - this.field2963.method4864();
        var5.field3044 = var11 - this.field2963.method4866();
        if (var5.field3047 < 0) {
            var5.field3046 += var5.field3047;
            var5.field3047 = 0;
        }
        if (var5.field3047 > this.field2959.length - var5.field3046) {
            var5.field3046 = this.field2959.length - var5.field3047;
        }
        if (var5.field3044 < 0) {
            var5.field3045 += var5.field3044;
            var5.field3044 = 0;
        }
        if (var5.field3044 > this.field2959[0].length - var5.field3045) {
            var5.field3045 = this.field2959[0].length - var5.field3044;
        }
        var5.field3046 = Math.min(var5.field3046, this.field2959.length);
        var5.field3045 = Math.min(var5.field3045, this.field2959[0].length);
        return var5;
    }

    @ObfuscatedName("kk.ab(I)Z")
    public boolean method5060() {
        return this.field2970;
    }

    @ObfuscatedName("kk.am(I)I")
    public int method5061() {
        return this.field2963.method4862();
    }

    @ObfuscatedName("kk.av(I)Ljava/util/HashMap;")
    public HashMap method5083() {
        this.method5063();
        return this.field2962;
    }

    @ObfuscatedName("kk.ag(B)V")
    public void method5063() {
        if (this.field2962 == null) {
            this.field2962 = new HashMap();
        }
        this.field2962.clear();
        for (int var1 = 0; var1 < this.field2959.length; var1++) {
            for (int var2 = 0; var2 < this.field2959[var1].length; var2++) {
                List var3 = this.field2959[var1][var2].method4954();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class289 var5 = (class289) var4.next();
                    if (var5.method5184()) {
                        int var6 = var5.method4809();
                        if (this.field2962.containsKey(var6)) {
                            List var8 = (List) this.field2962.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2962.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kk.aa(III)F")
    public float method5064(int arg0, int arg1) {
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
