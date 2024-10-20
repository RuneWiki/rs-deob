package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ad")
public final class class43 {

    @ObfuscatedName("ad.o")
    public boolean field560 = false;

    @ObfuscatedName("ad.k")
    public boolean field548 = false;

    @ObfuscatedName("ad.t")
    public class46 field550;

    @ObfuscatedName("ad.d")
    public class332 field561;

    @ObfuscatedName("ad.h")
    public HashMap field551;

    @ObfuscatedName("ad.m")
    public class36[][] field552;

    @ObfuscatedName("ad.z")
    public HashMap field547 = new HashMap();

    @ObfuscatedName("ad.i")
    public class331[] field554;

    @ObfuscatedName("ad.u")
    public final HashMap field556;

    @ObfuscatedName("ad.x")
    public int field558;

    @ObfuscatedName("ad.y")
    public int field557;

    @ObfuscatedName("ad.a")
    public int field555;

    @ObfuscatedName("ad.w")
    public int field559;

    @ObfuscatedName("ad.n")
    public int field549 = 0;

    public class43(class331[] arg0, HashMap arg1) {
        this.field554 = arg0;
        this.field556 = arg1;
    }

    @ObfuscatedName("ad.o(Ljf;Ljava/lang/String;ZB)V")
    public void method527(class262 arg0, String arg1, boolean arg2) {
        if (this.field548) {
            return;
        }
        this.field560 = false;
        this.field548 = true;
        System.nanoTime();
        int var4 = arg0.method4175(class42.field536.field539);
        int var5 = arg0.method4176(var4, arg1);
        class195 var6 = new class195(arg0.method4178(class42.field536.field539, arg1));
        class195 var7 = new class195(arg0.method4178(class42.field538.field539, arg1));
        class195 var8 = new class195(arg0.method4178(arg1, class42.field534.field539));
        System.nanoTime();
        System.nanoTime();
        this.field550 = new class46();
        try {
            this.field550.method581(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field550.method296();
        this.field550.method348();
        this.field550.method298();
        this.field558 = this.field550.method350() * 64;
        this.field557 = this.field550.method294() * 64;
        this.field555 = (this.field550.method322() - this.field550.method350() + 1) * 64;
        this.field559 = (this.field550.method293() - this.field550.method294() + 1) * 64;
        int var10 = this.field550.method322() - this.field550.method350() + 1;
        int var11 = this.field550.method293() - this.field550.method294() + 1;
        System.nanoTime();
        System.nanoTime();
        class36.field480.method3619();
        class36.field481.method3619();
        this.field552 = new class36[var10][var11];
        Iterator var12 = this.field550.field573.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field407;
            int var15 = var13.field408;
            int var16 = var14 - this.field550.method350();
            int var17 = var15 - this.field550.method294();
            this.field552[var16][var17] = new class36(var14, var15, this.field550.method314(), this.field556);
            this.field552[var16][var17].method376(var13, this.field550.field572);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field552[var18][var19] == null) {
                    this.field552[var18][var19] = new class36(this.field550.method350() + var18, this.field550.method294() + var19, this.field550.method314(), this.field556);
                    this.field552[var18][var19].method377(this.field550.field571, this.field550.field572);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4228(class42.field542.field539, arg1)) {
            byte[] var20 = arg0.method4178(class42.field542.field539, arg1);
            this.field561 = class56.method3136(var20);
        }
        System.nanoTime();
        arg0.method4195();
        arg0.method4173();
        this.field560 = true;
    }

    @ObfuscatedName("ad.k(B)V")
    public final void method528() {
        this.field551 = null;
    }

    @ObfuscatedName("ad.t(IIIIIIIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3959;
        int var10 = Statics.field3956;
        int var11 = Statics.field3958;
        int[] var12 = new int[4];
        class328.method5289(var12);
        class30 var13 = this.method551(arg0, arg1, arg2, arg3);
        float var14 = this.method538(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field549 = var15;
        if (!this.field547.containsKey(var15)) {
            class48 var16 = new class48(var15);
            var16.method646();
            this.field547.put(var15, var16);
        }
        class36[] var17 = new class36[8];
        for (int var18 = var13.field423; var18 < var13.field425 + var13.field423; var18++) {
            for (int var19 = var13.field424; var19 < var13.field424 + var13.field422; var19++) {
                this.method531(var18, var19, var17);
                this.field552[var18][var19].method406(var15, (class48) this.field547.get(var15), var17, this.field554);
            }
        }
        class328.method5355(var9, var10, var11);
        class328.method5290(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field558 + arg0;
        int var22 = this.field557 + arg1;
        for (int var23 = var13.field423; var23 < var13.field425 + var13.field423; var23++) {
            for (int var24 = var13.field424; var24 < var13.field424 + var13.field422; var24++) {
                this.field552[var23][var24].method375((this.field552[var23][var24].field485 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field552[var23][var24].field483 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ad.d(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method551(arg0, arg1, arg2, arg3);
        float var15 = this.method538(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field558 + arg0;
        int var18 = this.field557 + arg1;
        for (int var19 = var14.field423; var19 < var14.field425 + var14.field423; var19++) {
            for (int var20 = var14.field424; var20 < var14.field424 + var14.field422; var20++) {
                if (arg12) {
                    this.field552[var19][var20].method403();
                }
                this.field552[var19][var20].method381((this.field552[var19][var20].field485 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field552[var19][var20].field483 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field423; var21 < var14.field425 + var14.field423; var21++) {
            for (int var22 = var14.field424; var22 < var14.field424 + var14.field422; var22++) {
                this.field552[var21][var22].method382(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ad.h(II[Lai;I)V")
    public void method531(int arg0, int arg1, class36[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field552.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field552[0].length - 1;
        if (var7) {
            arg2[class255.field3325.method8()] = null;
        } else {
            arg2[class255.field3325.method8()] = this.field552[arg0][arg1 + 1];
        }
        arg2[class255.field3323.method8()] = var7 || var5 ? null : this.field552[arg0 + 1][arg1 + 1];
        arg2[class255.field3329.method8()] = var7 || var4 ? null : this.field552[arg0 - 1][arg1 + 1];
        arg2[class255.field3324.method8()] = var5 ? null : this.field552[arg0 + 1][arg1];
        arg2[class255.field3322.method8()] = var4 ? null : this.field552[arg0 - 1][arg1];
        arg2[class255.field3326.method8()] = var6 ? null : this.field552[arg0][arg1 - 1];
        arg2[class255.field3328.method8()] = var6 || var5 ? null : this.field552[arg0 + 1][arg1 - 1];
        arg2[class255.field3327.method8()] = var6 || var4 ? null : this.field552[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ad.m(IIIILjava/util/HashSet;III)V")
    public void method532(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field561 == null) {
            return;
        }
        this.field561.method5421(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field551 == null) {
            this.method537();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field551.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class41 var12 = (class41) var11.next();
                int var13 = (var12.field533.field2787 - this.field558) * arg2 / this.field555;
                int var14 = arg3 - (var12.field533.field2785 - this.field557) * arg3 / this.field559;
                class328.method5293(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ad.z(IIIIIIIIIII)Ljava/util/List;")
    public List method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field560) {
            return var11;
        }
        class30 var12 = this.method551(arg0, arg1, arg2, arg3);
        float var13 = this.method538(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field558 + arg0;
        int var16 = this.field557 + arg1;
        for (int var17 = var12.field423; var17 < var12.field425 + var12.field423; var17++) {
            for (int var18 = var12.field424; var18 < var12.field424 + var12.field422; var18++) {
                List var19 = this.field552[var17][var18].method431((this.field552[var17][var18].field485 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field552[var17][var18].field483 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ad.i(IIIIB)Lat;")
    public class30 method551(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field558 + arg0;
        int var7 = this.field557 + arg1;
        int var8 = this.field558 + arg2;
        int var9 = this.field557 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field425 = var12 - var10 + 1;
        var5.field422 = var13 - var11 + 1;
        var5.field423 = var10 - this.field550.method350();
        var5.field424 = var11 - this.field550.method294();
        if (var5.field423 < 0) {
            var5.field425 += var5.field423;
            var5.field423 = 0;
        }
        if (var5.field423 > this.field552.length - var5.field425) {
            var5.field425 = this.field552.length - var5.field423;
        }
        if (var5.field424 < 0) {
            var5.field422 += var5.field424;
            var5.field424 = 0;
        }
        if (var5.field424 > this.field552[0].length - var5.field422) {
            var5.field422 = this.field552[0].length - var5.field424;
        }
        var5.field425 = Math.min(var5.field425, this.field552.length);
        var5.field422 = Math.min(var5.field422, this.field552[0].length);
        return var5;
    }

    @ObfuscatedName("ad.u(I)Z")
    public boolean method535() {
        return this.field560;
    }

    @ObfuscatedName("ad.x(B)Ljava/util/HashMap;")
    public HashMap method549() {
        this.method537();
        return this.field551;
    }

    @ObfuscatedName("ad.y(I)V")
    public void method537() {
        if (this.field551 == null) {
            this.field551 = new HashMap();
        }
        this.field551.clear();
        for (int var1 = 0; var1 < this.field552.length; var1++) {
            for (int var2 = 0; var2 < this.field552[var1].length; var2++) {
                List var3 = this.field552[var1][var2].method473();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class41 var5 = (class41) var4.next();
                    if (this.field551.containsKey(var5.field524)) {
                        List var7 = (List) this.field551.get(var5.field524);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field551.put(var5.field524, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.a(III)F")
    public float method538(int arg0, int arg1) {
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
