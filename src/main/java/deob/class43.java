package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ah")
public final class class43 {

    @ObfuscatedName("ah.g")
    public boolean field552 = false;

    @ObfuscatedName("ah.e")
    public boolean field556 = false;

    @ObfuscatedName("ah.b")
    public class46 field547;

    @ObfuscatedName("ah.z")
    public class332 field559;

    @ObfuscatedName("ah.n")
    public HashMap field549;

    @ObfuscatedName("ah.l")
    public class36[][] field550;

    @ObfuscatedName("ah.s")
    public HashMap field551 = new HashMap();

    @ObfuscatedName("ah.y")
    public class331[] field546;

    @ObfuscatedName("ah.c")
    public final HashMap field553;

    @ObfuscatedName("ah.h")
    public int field548;

    @ObfuscatedName("ah.i")
    public int field555;

    @ObfuscatedName("ah.o")
    public int field557;

    @ObfuscatedName("ah.d")
    public int field554;

    @ObfuscatedName("ah.r")
    public int field558 = 0;

    public class43(class331[] arg0, HashMap arg1) {
        this.field546 = arg0;
        this.field553 = arg1;
    }

    @ObfuscatedName("ah.g(Ljr;Ljava/lang/String;ZI)V")
    public void method555(class262 arg0, String arg1, boolean arg2) {
        if (this.field556) {
            return;
        }
        this.field552 = false;
        this.field556 = true;
        System.nanoTime();
        int var4 = arg0.method4306(class42.field536.field540);
        int var5 = arg0.method4295(var4, arg1);
        class195 var6 = new class195(arg0.method4271(class42.field536.field540, arg1));
        class195 var7 = new class195(arg0.method4271(class42.field537.field540, arg1));
        class195 var8 = new class195(arg0.method4271(arg1, class42.field544.field540));
        System.nanoTime();
        System.nanoTime();
        this.field547 = new class46();
        try {
            this.field547.method602(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field547.method262();
        this.field547.method263();
        this.field547.method264();
        this.field548 = this.field547.method258() * 64;
        this.field555 = this.field547.method260() * 64;
        this.field557 = (this.field547.method259() - this.field547.method258() + 1) * 64;
        this.field554 = (this.field547.method261() - this.field547.method260() + 1) * 64;
        int var10 = this.field547.method259() - this.field547.method258() + 1;
        int var11 = this.field547.method261() - this.field547.method260() + 1;
        System.nanoTime();
        System.nanoTime();
        class36.field473.method3728();
        class36.field474.method3728();
        this.field550 = new class36[var10][var11];
        Iterator var12 = this.field547.field572.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field406;
            int var15 = var13.field400;
            int var16 = var14 - this.field547.method258();
            int var17 = var15 - this.field547.method260();
            this.field550[var16][var17] = new class36(var14, var15, this.field547.method281(), this.field553);
            this.field550[var16][var17].method423(var13, this.field547.field570);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field550[var18][var19] == null) {
                    this.field550[var18][var19] = new class36(this.field547.method258() + var18, this.field547.method260() + var19, this.field547.method281(), this.field553);
                    this.field550[var18][var19].method344(this.field547.field571, this.field547.field570);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4287(class42.field538.field540, arg1)) {
            byte[] var20 = arg0.method4271(class42.field538.field540, arg1);
            this.field559 = class56.method4423(var20);
        }
        System.nanoTime();
        arg0.method4281();
        arg0.method4283();
        this.field552 = true;
    }

    @ObfuscatedName("ah.e(I)V")
    public final void method548() {
        this.field549 = null;
    }

    @ObfuscatedName("ah.b(IIIIIIIII)V")
    public final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3960;
        int var10 = Statics.field3961;
        int var11 = Statics.field3962;
        int[] var12 = new int[4];
        class328.method5356(var12);
        class30 var13 = this.method578(arg0, arg1, arg2, arg3);
        float var14 = this.method547(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field558 = var15;
        if (!this.field551.containsKey(var15)) {
            class48 var16 = new class48(var15);
            var16.method643();
            this.field551.put(var15, var16);
        }
        class36[] var17 = new class36[8];
        for (int var18 = var13.field415; var18 < var13.field416 + var13.field415; var18++) {
            for (int var19 = var13.field417; var19 < var13.field418 + var13.field417; var19++) {
                this.method570(var18, var19, var17);
                this.field550[var18][var19].method347(var15, (class48) this.field551.get(var15), var17, this.field546);
            }
        }
        class328.method5366(var9, var10, var11);
        class328.method5392(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field548 + arg0;
        int var22 = this.field555 + arg1;
        for (int var23 = var13.field415; var23 < var13.field416 + var13.field415; var23++) {
            for (int var24 = var13.field417; var24 < var13.field418 + var13.field417; var24++) {
                this.field550[var23][var24].method342((this.field550[var23][var24].field482 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field550[var23][var24].field489 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ah.z(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method578(arg0, arg1, arg2, arg3);
        float var15 = this.method547(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field548 + arg0;
        int var18 = this.field555 + arg1;
        for (int var19 = var14.field415; var19 < var14.field416 + var14.field415; var19++) {
            for (int var20 = var14.field417; var20 < var14.field418 + var14.field417; var20++) {
                if (arg12) {
                    this.field550[var19][var20].method370();
                }
                this.field550[var19][var20].method464((this.field550[var19][var20].field482 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field550[var19][var20].field489 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field415; var21 < var14.field416 + var14.field415; var21++) {
            for (int var22 = var14.field417; var22 < var14.field418 + var14.field417; var22++) {
                this.field550[var21][var22].method349(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ah.n(II[Lak;I)V")
    public void method570(int arg0, int arg1, class36[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field550.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field550[0].length - 1;
        if (var7) {
            arg2[class255.field3322.method15()] = null;
        } else {
            arg2[class255.field3322.method15()] = this.field550[arg0][arg1 + 1];
        }
        arg2[class255.field3316.method15()] = var7 || var5 ? null : this.field550[arg0 + 1][arg1 + 1];
        arg2[class255.field3319.method15()] = var7 || var4 ? null : this.field550[arg0 - 1][arg1 + 1];
        arg2[class255.field3318.method15()] = var5 ? null : this.field550[arg0 + 1][arg1];
        arg2[class255.field3317.method15()] = var4 ? null : this.field550[arg0 - 1][arg1];
        arg2[class255.field3321.method15()] = var6 ? null : this.field550[arg0][arg1 - 1];
        arg2[class255.field3323.method15()] = var6 || var5 ? null : this.field550[arg0 + 1][arg1 - 1];
        arg2[class255.field3320.method15()] = var6 || var4 ? null : this.field550[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ah.l(IIIILjava/util/HashSet;IIB)V")
    public void method552(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field559 == null) {
            return;
        }
        this.field559.method5532(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field549 == null) {
            this.method551();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field549.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class41 var12 = (class41) var11.next();
                int var13 = (var12.field523.field2791 - this.field548) * arg2 / this.field557;
                int var14 = arg3 - (var12.field523.field2790 - this.field555) * arg3 / this.field554;
                class328.method5360(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ah.s(IIIIIIIIIIB)Ljava/util/List;")
    public List method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field552) {
            return var11;
        }
        class30 var12 = this.method578(arg0, arg1, arg2, arg3);
        float var13 = this.method547(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field548 + arg0;
        int var16 = this.field555 + arg1;
        for (int var17 = var12.field415; var17 < var12.field416 + var12.field415; var17++) {
            for (int var18 = var12.field417; var18 < var12.field418 + var12.field417; var18++) {
                List var19 = this.field550[var17][var18].method414((this.field550[var17][var18].field482 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field550[var17][var18].field489 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ah.y(IIIIB)Lac;")
    public class30 method578(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field548 + arg0;
        int var7 = this.field555 + arg1;
        int var8 = this.field548 + arg2;
        int var9 = this.field555 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field416 = var12 - var10 + 1;
        var5.field418 = var13 - var11 + 1;
        var5.field415 = var10 - this.field547.method258();
        var5.field417 = var11 - this.field547.method260();
        if (var5.field415 < 0) {
            var5.field416 += var5.field415;
            var5.field415 = 0;
        }
        if (var5.field415 > this.field550.length - var5.field416) {
            var5.field416 = this.field550.length - var5.field415;
        }
        if (var5.field417 < 0) {
            var5.field418 += var5.field417;
            var5.field417 = 0;
        }
        if (var5.field417 > this.field550[0].length - var5.field418) {
            var5.field418 = this.field550[0].length - var5.field417;
        }
        var5.field416 = Math.min(var5.field416, this.field550.length);
        var5.field418 = Math.min(var5.field418, this.field550[0].length);
        return var5;
    }

    @ObfuscatedName("ah.c(I)Z")
    public boolean method572() {
        return this.field552;
    }

    @ObfuscatedName("ah.o(I)Ljava/util/HashMap;")
    public HashMap method575() {
        this.method551();
        return this.field549;
    }

    @ObfuscatedName("ah.d(I)V")
    public void method551() {
        if (this.field549 == null) {
            this.field549 = new HashMap();
        }
        this.field549.clear();
        for (int var1 = 0; var1 < this.field550.length; var1++) {
            for (int var2 = 0; var2 < this.field550[var1].length; var2++) {
                List var3 = this.field550[var1][var2].method428();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class41 var5 = (class41) var4.next();
                    if (this.field549.containsKey(var5.field530)) {
                        List var7 = (List) this.field549.get(var5.field530);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field549.put(var5.field530, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.r(III)F")
    public float method547(int arg0, int arg1) {
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
