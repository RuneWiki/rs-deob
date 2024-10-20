package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ao")
public final class class42 {

    @ObfuscatedName("ao.i")
    public boolean field549 = false;

    @ObfuscatedName("ao.h")
    public boolean field559 = false;

    @ObfuscatedName("ao.u")
    public class45 field547;

    @ObfuscatedName("ao.q")
    public class286 field546;

    @ObfuscatedName("ao.g")
    public HashMap field550;

    @ObfuscatedName("ao.v")
    public class35[][] field545;

    @ObfuscatedName("ao.t")
    public HashMap field544 = new HashMap();

    @ObfuscatedName("ao.p")
    public class285[] field543;

    @ObfuscatedName("ao.l")
    public final HashMap field551;

    @ObfuscatedName("ao.a")
    public int field552;

    @ObfuscatedName("ao.k")
    public int field553;

    @ObfuscatedName("ao.r")
    public int field554;

    @ObfuscatedName("ao.b")
    public int field555;

    public class42(class285[] arg0, HashMap arg1) {
        this.field543 = arg0;
        this.field551 = arg1;
    }

    @ObfuscatedName("ao.i(Liy;Ljava/lang/String;ZI)V")
    public void method510(class236 arg0, String arg1, boolean arg2) {
        if (this.field559) {
            return;
        }
        this.field549 = false;
        this.field559 = true;
        System.nanoTime();
        int var4 = arg0.method3851(class41.field539.field541);
        int var5 = arg0.method3852(var4, arg1);
        class174 var6 = new class174(arg0.method3854(class41.field539.field541, arg1));
        class174 var7 = new class174(arg0.method3854(class41.field533.field541, arg1));
        class174 var8 = new class174(arg0.method3854(arg1, class41.field535.field541));
        System.nanoTime();
        System.nanoTime();
        this.field547 = new class45();
        try {
            this.field547.method569(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field547.method262();
        this.field547.method258();
        this.field547.method242();
        this.field552 = this.field547.method306() * 64;
        this.field553 = this.field547.method255() * 64;
        this.field554 = (this.field547.method254() - this.field547.method306() + 1) * 64;
        this.field555 = (this.field547.method256() - this.field547.method255() + 1) * 64;
        int var10 = this.field547.method254() - this.field547.method306() + 1;
        int var11 = this.field547.method256() - this.field547.method255() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field545 = new class35[var10][var11];
        Iterator var12 = this.field547.field572.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field410;
            int var15 = var13.field405;
            int var16 = var14 - this.field547.method306();
            int var17 = var15 - this.field547.method255();
            this.field545[var16][var17] = new class35(var14, var15, this.field547.method251(), this.field551);
            this.field545[var16][var17].method366(var13, this.field547.field573);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field545[var18][var19] == null) {
                    this.field545[var18][var19] = new class35(this.field547.method306() + var18, this.field547.method255() + var19, this.field547.method251(), this.field551);
                    this.field545[var18][var19].method327(this.field547.field579, this.field547.field573);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3853(class41.field534.field541, arg1)) {
            byte[] var20 = arg0.method3854(class41.field534.field541, arg1);
            this.field546 = class55.method2726(var20);
        }
        System.nanoTime();
        this.field549 = true;
    }

    @ObfuscatedName("ao.h(I)V")
    public final void method507() {
        this.field550 = null;
    }

    @ObfuscatedName("ao.u(IIIIIIIII)V")
    public final void method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3752;
        int var10 = Statics.field3748;
        int var11 = Statics.field3749;
        int[] var12 = new int[4];
        class282.method4634(var12);
        class30 var13 = this.method520(arg0, arg1, arg2, arg3);
        float var14 = this.method517(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field544.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method610();
            this.field544.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field423; var18 < var13.field423 + var13.field421; var18++) {
            for (int var19 = var13.field415; var19 < var13.field416 + var13.field415; var19++) {
                this.method513(var18, var19, var17);
                this.field545[var18][var19].method405(var15, (class47) this.field544.get(var15), var17, this.field543);
            }
        }
        class282.method4652(var9, var10, var11);
        class282.method4635(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field552 + arg0;
        int var22 = this.field553 + arg1;
        for (int var23 = var13.field423; var23 < var13.field423 + var13.field421; var23++) {
            for (int var24 = var13.field415; var24 < var13.field416 + var13.field415; var24++) {
                this.field545[var23][var24].method325((this.field545[var23][var24].field476 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field545[var23][var24].field477 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ao.q(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method520(arg0, arg1, arg2, arg3);
        float var15 = this.method517(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field552 + arg0;
        int var18 = this.field553 + arg1;
        for (int var19 = var14.field423; var19 < var14.field423 + var14.field421; var19++) {
            for (int var20 = var14.field415; var20 < var14.field416 + var14.field415; var20++) {
                if (arg12) {
                    this.field545[var19][var20].method353();
                }
                this.field545[var19][var20].method331((this.field545[var19][var20].field476 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field545[var19][var20].field477 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field423; var21 < var14.field423 + var14.field421; var21++) {
            for (int var22 = var14.field415; var22 < var14.field416 + var14.field415; var22++) {
                this.field545[var21][var22].method391(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ao.g(II[Lad;I)V")
    public void method513(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field545.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field545[0].length - 1;
        if (var7) {
            arg2[class229.field3146.method7()] = null;
        } else {
            arg2[class229.field3146.method7()] = this.field545[arg0][arg1 + 1];
        }
        arg2[class229.field3138.method7()] = var7 || var5 ? null : this.field545[arg0 + 1][arg1 + 1];
        arg2[class229.field3144.method7()] = var7 || var4 ? null : this.field545[arg0 - 1][arg1 + 1];
        arg2[class229.field3139.method7()] = var5 ? null : this.field545[arg0 + 1][arg1];
        arg2[class229.field3140.method7()] = var4 ? null : this.field545[arg0 - 1][arg1];
        arg2[class229.field3141.method7()] = var6 ? null : this.field545[arg0][arg1 - 1];
        arg2[class229.field3143.method7()] = var6 || var5 ? null : this.field545[arg0 + 1][arg1 - 1];
        arg2[class229.field3142.method7()] = var6 || var4 ? null : this.field545[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ao.v(IIIILjava/util/HashSet;IIB)V")
    public void method511(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field546 == null) {
            return;
        }
        this.field546.method4758(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field550 == null) {
            this.method516();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field550.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field528.field2601 - this.field552) * arg2 / this.field554;
                int var14 = arg3 - (var12.field528.field2602 - this.field553) * arg3 / this.field555;
                class282.method4638(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ao.t(IIIIIIIIIII)Ljava/util/List;")
    public List method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field549) {
            return var11;
        }
        class30 var12 = this.method520(arg0, arg1, arg2, arg3);
        float var13 = this.method517(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field552 + arg0;
        int var16 = this.field553 + arg1;
        for (int var17 = var12.field423; var17 < var12.field423 + var12.field421; var17++) {
            for (int var18 = var12.field415; var18 < var12.field416 + var12.field415; var18++) {
                List var19 = this.field545[var17][var18].method355((this.field545[var17][var18].field476 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field545[var17][var18].field477 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ao.p(IIIIB)Lac;")
    public class30 method520(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field552 + arg0;
        int var7 = this.field553 + arg1;
        int var8 = this.field552 + arg2;
        int var9 = this.field553 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field421 = var12 - var10 + 1;
        var5.field416 = var13 - var11 + 1;
        var5.field423 = var10 - this.field547.method306();
        var5.field415 = var11 - this.field547.method255();
        if (var5.field423 < 0) {
            var5.field421 += var5.field423;
            var5.field423 = 0;
        }
        if (var5.field423 > this.field545.length - var5.field421) {
            var5.field421 = this.field545.length - var5.field423;
        }
        if (var5.field415 < 0) {
            var5.field416 += var5.field415;
            var5.field415 = 0;
        }
        if (var5.field415 > this.field545[0].length - var5.field416) {
            var5.field416 = this.field545[0].length - var5.field415;
        }
        var5.field421 = Math.min(var5.field421, this.field545.length);
        var5.field416 = Math.min(var5.field416, this.field545[0].length);
        return var5;
    }

    @ObfuscatedName("ao.l(I)Z")
    public boolean method535() {
        return this.field549;
    }

    @ObfuscatedName("ao.a(I)Ljava/util/HashMap;")
    public HashMap method515() {
        this.method516();
        return this.field550;
    }

    @ObfuscatedName("ao.k(B)V")
    public void method516() {
        if (this.field550 == null) {
            this.field550 = new HashMap();
        }
        this.field550.clear();
        for (int var1 = 0; var1 < this.field545.length; var1++) {
            for (int var2 = 0; var2 < this.field545[var1].length; var2++) {
                List var3 = this.field545[var1][var2].method361();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field550.containsKey(var5.field527)) {
                        List var7 = (List) this.field550.get(var5.field527);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field550.put(var5.field527, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.b(IIB)F")
    public float method517(int arg0, int arg1) {
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
