package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ao")
public final class class42 {

    @ObfuscatedName("ao.i")
    public boolean field563 = false;

    @ObfuscatedName("ao.j")
    public boolean field568 = false;

    @ObfuscatedName("ao.a")
    public class45 field564;

    @ObfuscatedName("ao.r")
    public class287 field569;

    @ObfuscatedName("ao.o")
    public HashMap field566;

    @ObfuscatedName("ao.n")
    public class35[][] field577;

    @ObfuscatedName("ao.q")
    public HashMap field565 = new HashMap();

    @ObfuscatedName("ao.b")
    public class286[] field567;

    @ObfuscatedName("ao.k")
    public final HashMap field570;

    @ObfuscatedName("ao.s")
    public int field571;

    @ObfuscatedName("ao.d")
    public int field572;

    @ObfuscatedName("ao.l")
    public int field562;

    @ObfuscatedName("ao.t")
    public int field574;

    public class42(class286[] arg0, HashMap arg1) {
        this.field567 = arg0;
        this.field570 = arg1;
    }

    @ObfuscatedName("ao.i(Lii;Ljava/lang/String;ZI)V")
    public void method513(class237 arg0, String arg1, boolean arg2) {
        if (this.field568) {
            return;
        }
        this.field563 = false;
        this.field568 = true;
        System.nanoTime();
        int var4 = arg0.method3840(class41.field561.field557);
        int var5 = arg0.method3841(var4, arg1);
        class175 var6 = new class175(arg0.method3843(class41.field561.field557, arg1));
        class175 var7 = new class175(arg0.method3843(class41.field560.field557, arg1));
        class175 var8 = new class175(arg0.method3843(arg1, class41.field559.field557));
        System.nanoTime();
        System.nanoTime();
        this.field564 = new class45();
        try {
            this.field564.method567(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field564.method333();
        this.field564.method283();
        this.field564.method284();
        this.field571 = this.field564.method319() * 64;
        this.field572 = this.field564.method332() * 64;
        this.field562 = (this.field564.method279() - this.field564.method319() + 1) * 64;
        this.field574 = (this.field564.method281() - this.field564.method332() + 1) * 64;
        int var10 = this.field564.method279() - this.field564.method319() + 1;
        int var11 = this.field564.method281() - this.field564.method332() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field577 = new class35[var10][var11];
        Iterator var12 = this.field564.field590.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field416;
            int var15 = var13.field417;
            int var16 = var14 - this.field564.method319();
            int var17 = var15 - this.field564.method332();
            this.field577[var16][var17] = new class35(var14, var15, this.field564.method321(), this.field570);
            this.field577[var16][var17].method345(var13, this.field564.field591);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field577[var18][var19] == null) {
                    this.field577[var18][var19] = new class35(this.field564.method319() + var18, this.field564.method332() + var19, this.field564.method321(), this.field570);
                    this.field577[var18][var19].method371(this.field564.field595, this.field564.field591);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3887(class41.field558.field557, arg1)) {
            byte[] var20 = arg0.method3843(class41.field558.field557, arg1);
            this.field569 = class55.method173(var20);
        }
        System.nanoTime();
        this.field563 = true;
    }

    @ObfuscatedName("ao.j(B)V")
    public final void method514() {
        this.field566 = null;
    }

    @ObfuscatedName("ao.a(IIIIIIIII)V")
    public final void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3762;
        int var10 = Statics.field3761;
        int var11 = Statics.field3764;
        int[] var12 = new int[4];
        class283.method4566(var12);
        class30 var13 = this.method519(arg0, arg1, arg2, arg3);
        float var14 = this.method523(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field565.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method618();
            this.field565.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field431; var18 < var13.field432 + var13.field431; var18++) {
            for (int var19 = var13.field430; var19 < var13.field430 + var13.field428; var19++) {
                this.method516(var18, var19, var17);
                this.field577[var18][var19].method413(var15, (class47) this.field565.get(var15), var17, this.field567);
            }
        }
        class283.method4547(var9, var10, var11);
        class283.method4584(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field571 + arg0;
        int var22 = this.field572 + arg1;
        for (int var23 = var13.field431; var23 < var13.field432 + var13.field431; var23++) {
            for (int var24 = var13.field430; var24 < var13.field430 + var13.field428; var24++) {
                this.field577[var23][var24].method374((this.field577[var23][var24].field486 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field577[var23][var24].field501 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ao.r(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method519(arg0, arg1, arg2, arg3);
        float var15 = this.method523(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field571 + arg0;
        int var18 = this.field572 + arg1;
        for (int var19 = var14.field431; var19 < var14.field432 + var14.field431; var19++) {
            for (int var20 = var14.field430; var20 < var14.field430 + var14.field428; var20++) {
                if (arg12) {
                    this.field577[var19][var20].method373();
                }
                this.field577[var19][var20].method350((this.field577[var19][var20].field486 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field577[var19][var20].field501 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field431; var21 < var14.field432 + var14.field431; var21++) {
            for (int var22 = var14.field430; var22 < var14.field430 + var14.field428; var22++) {
                this.field577[var21][var22].method398(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ao.o(II[Lat;I)V")
    public void method516(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field577.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field577[0].length - 1;
        if (var7) {
            arg2[class230.field3159.method6()] = null;
        } else {
            arg2[class230.field3159.method6()] = this.field577[arg0][arg1 + 1];
        }
        arg2[class230.field3155.method6()] = var7 || var5 ? null : this.field577[arg0 + 1][arg1 + 1];
        arg2[class230.field3161.method6()] = var7 || var4 ? null : this.field577[arg0 - 1][arg1 + 1];
        arg2[class230.field3163.method6()] = var5 ? null : this.field577[arg0 + 1][arg1];
        arg2[class230.field3160.method6()] = var4 ? null : this.field577[arg0 - 1][arg1];
        arg2[class230.field3154.method6()] = var6 ? null : this.field577[arg0][arg1 - 1];
        arg2[class230.field3157.method6()] = var6 || var5 ? null : this.field577[arg0 + 1][arg1 - 1];
        arg2[class230.field3156.method6()] = var6 || var4 ? null : this.field577[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ao.n(IIIILjava/util/HashSet;III)V")
    public void method517(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field569 == null) {
            return;
        }
        this.field569.method4675(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field566 == null) {
            this.method522();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field566.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field553.field2617 - this.field571) * arg2 / this.field562;
                int var14 = arg3 - (var12.field553.field2619 - this.field572) * arg3 / this.field574;
                class283.method4555(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ao.q(IIIIIIIIIII)Ljava/util/List;")
    public List method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field563) {
            return var11;
        }
        class30 var12 = this.method519(arg0, arg1, arg2, arg3);
        float var13 = this.method523(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field571 + arg0;
        int var16 = this.field572 + arg1;
        for (int var17 = var12.field431; var17 < var12.field432 + var12.field431; var17++) {
            for (int var18 = var12.field430; var18 < var12.field430 + var12.field428; var18++) {
                List var19 = this.field577[var17][var18].method380((this.field577[var17][var18].field486 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field577[var17][var18].field501 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ao.b(IIIIB)Lag;")
    public class30 method519(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field571 + arg0;
        int var7 = this.field572 + arg1;
        int var8 = this.field571 + arg2;
        int var9 = this.field572 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field432 = var12 - var10 + 1;
        var5.field428 = var13 - var11 + 1;
        var5.field431 = var10 - this.field564.method319();
        var5.field430 = var11 - this.field564.method332();
        if (var5.field431 < 0) {
            var5.field432 += var5.field431;
            var5.field431 = 0;
        }
        if (var5.field431 > this.field577.length - var5.field432) {
            var5.field432 = this.field577.length - var5.field431;
        }
        if (var5.field430 < 0) {
            var5.field428 += var5.field430;
            var5.field430 = 0;
        }
        if (var5.field430 > this.field577[0].length - var5.field428) {
            var5.field428 = this.field577[0].length - var5.field430;
        }
        var5.field432 = Math.min(var5.field432, this.field577.length);
        var5.field428 = Math.min(var5.field428, this.field577[0].length);
        return var5;
    }

    @ObfuscatedName("ao.k(I)Z")
    public boolean method539() {
        return this.field563;
    }

    @ObfuscatedName("ao.s(I)Ljava/util/HashMap;")
    public HashMap method521() {
        this.method522();
        return this.field566;
    }

    @ObfuscatedName("ao.d(B)V")
    public void method522() {
        if (this.field566 == null) {
            this.field566 = new HashMap();
        }
        this.field566.clear();
        for (int var1 = 0; var1 < this.field577.length; var1++) {
            for (int var2 = 0; var2 < this.field577[var1].length; var2++) {
                List var3 = this.field577[var1][var2].method381();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field566.containsKey(var5.field544)) {
                        List var7 = (List) this.field566.get(var5.field544);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field566.put(var5.field544, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.l(III)F")
    public float method523(int arg0, int arg1) {
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
