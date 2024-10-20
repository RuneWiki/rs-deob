package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("az")
public final class class42 {

    @ObfuscatedName("az.s")
    public boolean field538 = false;

    @ObfuscatedName("az.g")
    public boolean field536 = false;

    @ObfuscatedName("az.m")
    public class45 field527;

    @ObfuscatedName("az.h")
    public class310 field528;

    @ObfuscatedName("az.i")
    public HashMap field531;

    @ObfuscatedName("az.w")
    public class35[][] field526;

    @ObfuscatedName("az.t")
    public HashMap field533 = new HashMap();

    @ObfuscatedName("az.d")
    public class309[] field529;

    @ObfuscatedName("az.z")
    public final HashMap field525;

    @ObfuscatedName("az.k")
    public int field534;

    @ObfuscatedName("az.c")
    public int field535;

    @ObfuscatedName("az.o")
    public int field530;

    @ObfuscatedName("az.l")
    public int field537;

    public class42(class309[] arg0, HashMap arg1) {
        this.field529 = arg0;
        this.field525 = arg1;
    }

    @ObfuscatedName("az.s(Lir;Ljava/lang/String;ZI)V")
    public void method482(class247 arg0, String arg1, boolean arg2) {
        if (this.field536) {
            return;
        }
        this.field538 = false;
        this.field536 = true;
        System.nanoTime();
        int var4 = arg0.method4201(class41.field522.field516);
        int var5 = arg0.method4217(var4, arg1);
        class185 var6 = new class185(arg0.method4191(class41.field522.field516, arg1));
        class185 var7 = new class185(arg0.method4191(class41.field517.field516, arg1));
        class185 var8 = new class185(arg0.method4191(arg1, class41.field519.field516));
        System.nanoTime();
        System.nanoTime();
        this.field527 = new class45();
        try {
            this.field527.method533(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field527.method280();
        this.field527.method248();
        this.field527.method287();
        this.field534 = this.field527.method256() * 64;
        this.field535 = this.field527.method277() * 64;
        this.field530 = (this.field527.method292() - this.field527.method256() + 1) * 64;
        this.field537 = (this.field527.method259() - this.field527.method277() + 1) * 64;
        int var10 = this.field527.method292() - this.field527.method256() + 1;
        int var11 = this.field527.method259() - this.field527.method277() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field526 = new class35[var10][var11];
        Iterator var12 = this.field527.field555.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field399;
            int var15 = var13.field390;
            int var16 = var14 - this.field527.method256();
            int var17 = var15 - this.field527.method277();
            this.field526[var16][var17] = new class35(var14, var15, this.field527.method244(), this.field525);
            this.field526[var16][var17].method316(var13, this.field527.field554);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field526[var18][var19] == null) {
                    this.field526[var18][var19] = new class35(this.field527.method256() + var18, this.field527.method277() + var19, this.field527.method244(), this.field525);
                    this.field526[var18][var19].method317(this.field527.field552, this.field527.field554);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4183(class41.field518.field516, arg1)) {
            byte[] var20 = arg0.method4191(class41.field518.field516, arg1);
            this.field528 = class55.method2170(var20);
        }
        System.nanoTime();
        this.field538 = true;
    }

    @ObfuscatedName("az.g(I)V")
    public final void method483() {
        this.field531 = null;
    }

    @ObfuscatedName("az.m(IIIIIIIIB)V")
    public final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3876;
        int var10 = Statics.field3872;
        int var11 = Statics.field3871;
        int[] var12 = new int[4];
        class306.method5180(var12);
        class30 var13 = this.method489(arg0, arg1, arg2, arg3);
        float var14 = this.method509(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field533.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method590();
            this.field533.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field403; var18 < var13.field403 + var13.field402; var18++) {
            for (int var19 = var13.field401; var19 < var13.field405 + var13.field401; var19++) {
                this.method486(var18, var19, var17);
                this.field526[var18][var19].method390(var15, (class47) this.field533.get(var15), var17, this.field529);
            }
        }
        class306.method5179(var9, var10, var11);
        class306.method5184(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field534 + arg0;
        int var22 = this.field535 + arg1;
        for (int var23 = var13.field403; var23 < var13.field403 + var13.field402; var23++) {
            for (int var24 = var13.field401; var24 < var13.field405 + var13.field401; var24++) {
                this.field526[var23][var24].method366((this.field526[var23][var24].field463 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field526[var23][var24].field469 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("az.h(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method489(arg0, arg1, arg2, arg3);
        float var15 = this.method509(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field534 + arg0;
        int var18 = this.field535 + arg1;
        for (int var19 = var14.field403; var19 < var14.field403 + var14.field402; var19++) {
            for (int var20 = var14.field401; var20 < var14.field405 + var14.field401; var20++) {
                if (arg12) {
                    this.field526[var19][var20].method337();
                }
                this.field526[var19][var20].method315((this.field526[var19][var20].field463 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field526[var19][var20].field469 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field403; var21 < var14.field403 + var14.field402; var21++) {
            for (int var22 = var14.field401; var22 < var14.field405 + var14.field401; var22++) {
                this.field526[var21][var22].method409(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("az.i(II[Lak;I)V")
    public void method486(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field526.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field526[0].length - 1;
        if (var7) {
            arg2[class240.field3252.method10()] = null;
        } else {
            arg2[class240.field3252.method10()] = this.field526[arg0][arg1 + 1];
        }
        arg2[class240.field3246.method10()] = var7 || var5 ? null : this.field526[arg0 + 1][arg1 + 1];
        arg2[class240.field3248.method10()] = var7 || var4 ? null : this.field526[arg0 - 1][arg1 + 1];
        arg2[class240.field3247.method10()] = var5 ? null : this.field526[arg0 + 1][arg1];
        arg2[class240.field3251.method10()] = var4 ? null : this.field526[arg0 - 1][arg1];
        arg2[class240.field3256.method10()] = var6 ? null : this.field526[arg0][arg1 - 1];
        arg2[class240.field3250.method10()] = var6 || var5 ? null : this.field526[arg0 + 1][arg1 - 1];
        arg2[class240.field3245.method10()] = var6 || var4 ? null : this.field526[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("az.w(IIIILjava/util/HashSet;III)V")
    public void method487(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field528 == null) {
            return;
        }
        this.field528.method5349(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field531 == null) {
            this.method504();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field531.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field510.field2718 - this.field534) * arg2 / this.field530;
                int var14 = arg3 - (var12.field510.field2716 - this.field535) * arg3 / this.field537;
                class306.method5187(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("az.t(IIIIIIIIIIB)Ljava/util/List;")
    public List method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field538) {
            return var11;
        }
        class30 var12 = this.method489(arg0, arg1, arg2, arg3);
        float var13 = this.method509(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field534 + arg0;
        int var16 = this.field535 + arg1;
        for (int var17 = var12.field403; var17 < var12.field403 + var12.field402; var17++) {
            for (int var18 = var12.field401; var18 < var12.field405 + var12.field401; var18++) {
                List var19 = this.field526[var17][var18].method350((this.field526[var17][var18].field463 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field526[var17][var18].field469 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("az.d(IIIIB)Lar;")
    public class30 method489(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field534 + arg0;
        int var7 = this.field535 + arg1;
        int var8 = this.field534 + arg2;
        int var9 = this.field535 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field402 = var12 - var10 + 1;
        var5.field405 = var13 - var11 + 1;
        var5.field403 = var10 - this.field527.method256();
        var5.field401 = var11 - this.field527.method277();
        if (var5.field403 < 0) {
            var5.field402 += var5.field403;
            var5.field403 = 0;
        }
        if (var5.field403 > this.field526.length - var5.field402) {
            var5.field402 = this.field526.length - var5.field403;
        }
        if (var5.field401 < 0) {
            var5.field405 += var5.field401;
            var5.field401 = 0;
        }
        if (var5.field401 > this.field526[0].length - var5.field405) {
            var5.field405 = this.field526[0].length - var5.field401;
        }
        var5.field402 = Math.min(var5.field402, this.field526.length);
        var5.field405 = Math.min(var5.field405, this.field526[0].length);
        return var5;
    }

    @ObfuscatedName("az.z(I)Z")
    public boolean method490() {
        return this.field538;
    }

    @ObfuscatedName("az.k(I)Ljava/util/HashMap;")
    public HashMap method491() {
        this.method504();
        return this.field531;
    }

    @ObfuscatedName("az.c(I)V")
    public void method504() {
        if (this.field531 == null) {
            this.field531 = new HashMap();
        }
        this.field531.clear();
        for (int var1 = 0; var1 < this.field526.length; var1++) {
            for (int var2 = 0; var2 < this.field526[var1].length; var2++) {
                List var3 = this.field526[var1][var2].method351();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field531.containsKey(var5.field515)) {
                        List var7 = (List) this.field531.get(var5.field515);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field531.put(var5.field515, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.o(IIB)F")
    public float method509(int arg0, int arg1) {
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
