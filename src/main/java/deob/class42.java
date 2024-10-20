package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("as")
public final class class42 {

    @ObfuscatedName("as.a")
    public boolean field550 = false;

    @ObfuscatedName("as.j")
    public boolean field538 = false;

    @ObfuscatedName("as.n")
    public class45 field539;

    @ObfuscatedName("as.r")
    public class286 field540;

    @ObfuscatedName("as.v")
    public HashMap field545;

    @ObfuscatedName("as.e")
    public class35[][] field541;

    @ObfuscatedName("as.l")
    public HashMap field543 = new HashMap();

    @ObfuscatedName("as.s")
    public class285[] field544;

    @ObfuscatedName("as.w")
    public final HashMap field537;

    @ObfuscatedName("as.p")
    public int field546;

    @ObfuscatedName("as.m")
    public int field547;

    @ObfuscatedName("as.u")
    public int field548;

    @ObfuscatedName("as.g")
    public int field549;

    public class42(class285[] arg0, HashMap arg1) {
        this.field544 = arg0;
        this.field537 = arg1;
    }

    @ObfuscatedName("as.a(Lif;Ljava/lang/String;ZS)V")
    public void method502(class236 arg0, String arg1, boolean arg2) {
        if (this.field538) {
            return;
        }
        this.field550 = false;
        this.field538 = true;
        System.nanoTime();
        int var4 = arg0.method3777(class41.field536.field533);
        int var5 = arg0.method3827(var4, arg1);
        class174 var6 = new class174(arg0.method3796(class41.field536.field533, arg1));
        class174 var7 = new class174(arg0.method3796(class41.field529.field533, arg1));
        class174 var8 = new class174(arg0.method3796(arg1, class41.field534.field533));
        System.nanoTime();
        System.nanoTime();
        this.field539 = new class45();
        try {
            this.field539.method543(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var21) {
            return;
        }
        this.field539.method259();
        this.field539.method306();
        this.field539.method261();
        this.field546 = this.field539.method255() * 64;
        this.field547 = this.field539.method256() * 64;
        this.field548 = (this.field539.method241() - this.field539.method255() + 1) * 64;
        this.field549 = (this.field539.method243() - this.field539.method256() + 1) * 64;
        int var10 = this.field539.method241() - this.field539.method255() + 1;
        int var11 = this.field539.method243() - this.field539.method256() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field541 = new class35[var10][var11];
        Iterator var12 = this.field539.field567.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field404;
            int var15 = var13.field401;
            int var16 = var14 - this.field539.method255();
            int var17 = var15 - this.field539.method256();
            this.field541[var16][var17] = new class35(var14, var15, this.field539.method299(), this.field537);
            this.field541[var16][var17].method321(var13, this.field539.field568);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field541[var18][var19] == null) {
                    this.field541[var18][var19] = new class35(this.field539.method255() + var18, this.field539.method256() + var19, this.field539.method299(), this.field537);
                    this.field541[var18][var19].method395(this.field539.field566, this.field539.field568);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3764(class41.field530.field533, arg1)) {
            byte[] var20 = arg0.method3796(class41.field530.field533, arg1);
            this.field540 = class55.method532(var20);
        }
        System.nanoTime();
        this.field550 = true;
    }

    @ObfuscatedName("as.j(I)V")
    public final void method507() {
        this.field545 = null;
    }

    @ObfuscatedName("as.n(IIIIIIIII)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3759;
        int var10 = Statics.field3756;
        int var11 = Statics.field3757;
        int[] var12 = new int[4];
        class282.method4509(var12);
        class30 var13 = this.method498(arg0, arg1, arg2, arg3);
        float var14 = this.method529(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field543.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method588();
            this.field543.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field418; var18 < var13.field418 + var13.field413; var18++) {
            for (int var19 = var13.field415; var19 < var13.field415 + var13.field414; var19++) {
                this.method524(var18, var19, var17);
                this.field541[var18][var19].method325(var15, (class47) this.field543.get(var15), var17, this.field544);
            }
        }
        class282.method4505(var9, var10, var11);
        class282.method4510(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field546 + arg0;
        int var22 = this.field547 + arg1;
        for (int var23 = var13.field418; var23 < var13.field418 + var13.field413; var23++) {
            for (int var24 = var13.field415; var24 < var13.field415 + var13.field414; var24++) {
                this.field541[var23][var24].method422((this.field541[var23][var24].field471 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field541[var23][var24].field467 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("as.r(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method498(arg0, arg1, arg2, arg3);
        float var15 = this.method529(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field546 + arg0;
        int var18 = this.field547 + arg1;
        for (int var19 = var14.field418; var19 < var14.field418 + var14.field413; var19++) {
            for (int var20 = var14.field415; var20 < var14.field415 + var14.field414; var20++) {
                if (arg12) {
                    this.field541[var19][var20].method348();
                }
                this.field541[var19][var20].method326((this.field541[var19][var20].field471 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field541[var19][var20].field467 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field418; var21 < var14.field418 + var14.field413; var21++) {
            for (int var22 = var14.field415; var22 < var14.field415 + var14.field414; var22++) {
                this.field541[var21][var22].method327(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("as.v(II[Laq;I)V")
    public void method524(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field541.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field541[0].length - 1;
        if (var7) {
            arg2[class229.field3156.method12()] = null;
        } else {
            arg2[class229.field3156.method12()] = this.field541[arg0][arg1 + 1];
        }
        arg2[class229.field3160.method12()] = var7 || var5 ? null : this.field541[arg0 + 1][arg1 + 1];
        arg2[class229.field3159.method12()] = var7 || var4 ? null : this.field541[arg0 - 1][arg1 + 1];
        arg2[class229.field3154.method12()] = var5 ? null : this.field541[arg0 + 1][arg1];
        arg2[class229.field3158.method12()] = var4 ? null : this.field541[arg0 - 1][arg1];
        arg2[class229.field3162.method12()] = var6 ? null : this.field541[arg0][arg1 - 1];
        arg2[class229.field3155.method12()] = var6 || var5 ? null : this.field541[arg0 + 1][arg1 - 1];
        arg2[class229.field3157.method12()] = var6 || var4 ? null : this.field541[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("as.e(IIIILjava/util/HashSet;III)V")
    public void method528(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field540 == null) {
            return;
        }
        this.field540.method4681(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field545 == null) {
            this.method501();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field545.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field517.field2615 - this.field546) * arg2 / this.field548;
                int var14 = arg3 - (var12.field517.field2618 - this.field547) * arg3 / this.field549;
                class282.method4513(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("as.l(IIIIIIIIIIB)Ljava/util/List;")
    public List method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field550) {
            return var11;
        }
        class30 var12 = this.method498(arg0, arg1, arg2, arg3);
        float var13 = this.method529(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field546 + arg0;
        int var16 = this.field547 + arg1;
        for (int var17 = var12.field418; var17 < var12.field418 + var12.field413; var17++) {
            for (int var18 = var12.field415; var18 < var12.field415 + var12.field414; var18++) {
                List var19 = this.field541[var17][var18].method421((this.field541[var17][var18].field471 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field541[var17][var18].field467 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("as.s(IIIII)Lak;")
    public class30 method498(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field546 + arg0;
        int var7 = this.field547 + arg1;
        int var8 = this.field546 + arg2;
        int var9 = this.field547 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field413 = var12 - var10 + 1;
        var5.field414 = var13 - var11 + 1;
        var5.field418 = var10 - this.field539.method255();
        var5.field415 = var11 - this.field539.method256();
        if (var5.field418 < 0) {
            var5.field413 += var5.field418;
            var5.field418 = 0;
        }
        if (var5.field418 > this.field541.length - var5.field413) {
            var5.field413 = this.field541.length - var5.field418;
        }
        if (var5.field415 < 0) {
            var5.field414 += var5.field415;
            var5.field415 = 0;
        }
        if (var5.field415 > this.field541[0].length - var5.field414) {
            var5.field414 = this.field541[0].length - var5.field415;
        }
        var5.field413 = Math.min(var5.field413, this.field541.length);
        var5.field414 = Math.min(var5.field414, this.field541[0].length);
        return var5;
    }

    @ObfuscatedName("as.w(I)Z")
    public boolean method499() {
        return this.field550;
    }

    @ObfuscatedName("as.p(I)Ljava/util/HashMap;")
    public HashMap method516() {
        this.method501();
        return this.field545;
    }

    @ObfuscatedName("as.m(I)V")
    public void method501() {
        if (this.field545 == null) {
            this.field545 = new HashMap();
        }
        this.field545.clear();
        for (int var1 = 0; var1 < this.field541.length; var1++) {
            for (int var2 = 0; var2 < this.field541[var1].length; var2++) {
                List var3 = this.field541[var1][var2].method360();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field545.containsKey(var5.field524)) {
                        List var7 = (List) this.field545.get(var5.field524);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field545.put(var5.field524, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.u(III)F")
    public float method529(int arg0, int arg1) {
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
