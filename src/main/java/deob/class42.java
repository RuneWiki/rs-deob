package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aj")
public final class class42 {

    @ObfuscatedName("aj.d")
    public boolean field589 = false;

    @ObfuscatedName("aj.k")
    public boolean field572 = false;

    @ObfuscatedName("aj.e")
    public class45 field573;

    @ObfuscatedName("aj.p")
    public class287 field582;

    @ObfuscatedName("aj.q")
    public HashMap field575;

    @ObfuscatedName("aj.s")
    public class35[][] field576;

    @ObfuscatedName("aj.r")
    public HashMap field574 = new HashMap();

    @ObfuscatedName("aj.g")
    public class286[] field588;

    @ObfuscatedName("aj.v")
    public final HashMap field579;

    @ObfuscatedName("aj.t")
    public int field580;

    @ObfuscatedName("aj.y")
    public int field581;

    @ObfuscatedName("aj.o")
    public int field587;

    @ObfuscatedName("aj.i")
    public int field583;

    public class42(class286[] arg0, HashMap arg1) {
        this.field588 = arg0;
        this.field579 = arg1;
    }

    @ObfuscatedName("aj.d(Lit;Ljava/lang/String;ZI)V")
    public void method486(class236 arg0, String arg1, boolean arg2) {
        if (this.field572) {
            return;
        }
        this.field589 = false;
        this.field572 = true;
        System.nanoTime();
        int var4 = arg0.method3896(class41.field562.field560);
        int var5 = arg0.method3892(var4, arg1);
        class174 var6 = new class174(arg0.method3962(class41.field562.field560, arg1));
        class174 var7 = new class174(arg0.method3962(class41.field561.field560, arg1));
        class174 var8 = new class174(arg0.method3962(arg1, class41.field563.field560));
        System.nanoTime();
        System.nanoTime();
        this.field573 = new class45();
        try {
            this.field573.method558(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field573.method255();
        this.field573.method256();
        this.field573.method257();
        this.field580 = this.field573.method284() * 64;
        this.field581 = this.field573.method301() * 64;
        this.field587 = (this.field573.method258() - this.field573.method284() + 1) * 64;
        this.field583 = (this.field573.method291() - this.field573.method301() + 1) * 64;
        int var10 = this.field573.method258() - this.field573.method284() + 1;
        int var11 = this.field573.method291() - this.field573.method301() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field576 = new class35[var10][var11];
        Iterator var12 = this.field573.field602.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field419;
            int var15 = var13.field427;
            int var16 = var14 - this.field573.method284();
            int var17 = var15 - this.field573.method301();
            this.field576[var16][var17] = new class35(var14, var15, this.field573.method242(), this.field579);
            this.field576[var16][var17].method309(var13, this.field573.field603);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field576[var18][var19] == null) {
                    this.field576[var18][var19] = new class35(this.field573.method284() + var18, this.field573.method301() + var19, this.field573.method242(), this.field579);
                    this.field576[var18][var19].method310(this.field573.field601, this.field573.field603);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3933(class41.field569.field560, arg1)) {
            byte[] var20 = arg0.method3962(class41.field569.field560, arg1);
            this.field582 = class55.method3824(var20);
        }
        System.nanoTime();
        this.field589 = true;
    }

    @ObfuscatedName("aj.k(I)V")
    public final void method492() {
        this.field575 = null;
    }

    @ObfuscatedName("aj.e(IIIIIIIIS)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3774;
        int var10 = Statics.field3769;
        int var11 = Statics.field3770;
        int[] var12 = new int[4];
        class283.method4681(var12);
        class30 var13 = this.method487(arg0, arg1, arg2, arg3);
        float var14 = this.method512(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field574.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method628();
            this.field574.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field437; var18 < var13.field437 + var13.field435; var18++) {
            for (int var19 = var13.field430; var19 < var13.field431 + var13.field430; var19++) {
                this.method490(var18, var19, var17);
                this.field576[var18][var19].method313(var15, (class47) this.field574.get(var15), var17, this.field588);
            }
        }
        class283.method4677(var9, var10, var11);
        class283.method4682(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field580 + arg0;
        int var22 = this.field581 + arg1;
        for (int var23 = var13.field437; var23 < var13.field437 + var13.field435; var23++) {
            for (int var24 = var13.field430; var24 < var13.field431 + var13.field430; var24++) {
                this.field576[var23][var24].method308((this.field576[var23][var24].field498 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field576[var23][var24].field499 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("aj.p(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method487(arg0, arg1, arg2, arg3);
        float var15 = this.method512(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field580 + arg0;
        int var18 = this.field581 + arg1;
        for (int var19 = var14.field437; var19 < var14.field437 + var14.field435; var19++) {
            for (int var20 = var14.field430; var20 < var14.field431 + var14.field430; var20++) {
                if (arg12) {
                    this.field576[var19][var20].method334();
                }
                this.field576[var19][var20].method314((this.field576[var19][var20].field498 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field576[var19][var20].field499 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field437; var21 < var14.field437 + var14.field435; var21++) {
            for (int var22 = var14.field430; var22 < var14.field431 + var14.field430; var22++) {
                this.field576[var21][var22].method378(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("aj.q(II[Laq;I)V")
    public void method490(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field576.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field576[0].length - 1;
        if (var7) {
            arg2[class229.field3161.method12()] = null;
        } else {
            arg2[class229.field3161.method12()] = this.field576[arg0][arg1 + 1];
        }
        arg2[class229.field3155.method12()] = var7 || var5 ? null : this.field576[arg0 + 1][arg1 + 1];
        arg2[class229.field3159.method12()] = var7 || var4 ? null : this.field576[arg0 - 1][arg1 + 1];
        arg2[class229.field3156.method12()] = var5 ? null : this.field576[arg0 + 1][arg1];
        arg2[class229.field3160.method12()] = var4 ? null : this.field576[arg0 - 1][arg1];
        arg2[class229.field3163.method12()] = var6 ? null : this.field576[arg0][arg1 - 1];
        arg2[class229.field3157.method12()] = var6 || var5 ? null : this.field576[arg0 + 1][arg1 - 1];
        arg2[class229.field3158.method12()] = var6 || var4 ? null : this.field576[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("aj.s(IIIILjava/util/HashSet;III)V")
    public void method525(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field582 == null) {
            return;
        }
        this.field582.method4816(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field575 == null) {
            this.method495();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field575.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field548.field2628 - this.field580) * arg2 / this.field587;
                int var14 = arg3 - (var12.field548.field2625 - this.field581) * arg3 / this.field583;
                class283.method4687(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("aj.r(IIIIIIIIIII)Ljava/util/List;")
    public List method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field589) {
            return var11;
        }
        class30 var12 = this.method487(arg0, arg1, arg2, arg3);
        float var13 = this.method512(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field580 + arg0;
        int var16 = this.field581 + arg1;
        for (int var17 = var12.field437; var17 < var12.field437 + var12.field435; var17++) {
            for (int var18 = var12.field430; var18 < var12.field431 + var12.field430; var18++) {
                List var19 = this.field576[var17][var18].method344((this.field576[var17][var18].field498 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field576[var17][var18].field499 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("aj.g(IIIII)Lab;")
    public class30 method487(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field580 + arg0;
        int var7 = this.field581 + arg1;
        int var8 = this.field580 + arg2;
        int var9 = this.field581 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field435 = var12 - var10 + 1;
        var5.field431 = var13 - var11 + 1;
        var5.field437 = var10 - this.field573.method284();
        var5.field430 = var11 - this.field573.method301();
        if (var5.field437 < 0) {
            var5.field435 += var5.field437;
            var5.field437 = 0;
        }
        if (var5.field437 > this.field576.length - var5.field435) {
            var5.field435 = this.field576.length - var5.field437;
        }
        if (var5.field430 < 0) {
            var5.field431 += var5.field430;
            var5.field430 = 0;
        }
        if (var5.field430 > this.field576[0].length - var5.field431) {
            var5.field431 = this.field576[0].length - var5.field430;
        }
        var5.field435 = Math.min(var5.field435, this.field576.length);
        var5.field431 = Math.min(var5.field431, this.field576[0].length);
        return var5;
    }

    @ObfuscatedName("aj.v(I)Z")
    public boolean method530() {
        return this.field589;
    }

    @ObfuscatedName("aj.t(I)Ljava/util/HashMap;")
    public HashMap method494() {
        this.method495();
        return this.field575;
    }

    @ObfuscatedName("aj.y(B)V")
    public void method495() {
        if (this.field575 == null) {
            this.field575 = new HashMap();
        }
        this.field575.clear();
        for (int var1 = 0; var1 < this.field576.length; var1++) {
            for (int var2 = 0; var2 < this.field576[var1].length; var2++) {
                List var3 = this.field576[var1][var2].method345();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field575.containsKey(var5.field553)) {
                        List var7 = (List) this.field575.get(var5.field553);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field575.put(var5.field553, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.o(IIB)F")
    public float method512(int arg0, int arg1) {
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
