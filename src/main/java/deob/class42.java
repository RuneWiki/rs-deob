package deob;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.ImageIO;

@ObfuscatedName("aw")
public final class class42 {

    @ObfuscatedName("aw.p")
    public boolean field514 = false;

    @ObfuscatedName("aw.i")
    public boolean field515 = false;

    @ObfuscatedName("aw.w")
    public class45 field526;

    @ObfuscatedName("aw.s")
    public class310 field527;

    @ObfuscatedName("aw.j")
    public HashMap field518;

    @ObfuscatedName("aw.a")
    public class35[][] field519;

    @ObfuscatedName("aw.t")
    public HashMap field520 = new HashMap();

    @ObfuscatedName("aw.r")
    public class309[] field521;

    @ObfuscatedName("aw.m")
    public final HashMap field522;

    @ObfuscatedName("aw.h")
    public int field523;

    @ObfuscatedName("aw.o")
    public int field524;

    @ObfuscatedName("aw.x")
    public int field525;

    @ObfuscatedName("aw.q")
    public int field528;

    public class42(class309[] arg0, HashMap arg1) {
        this.field521 = arg0;
        this.field522 = arg1;
    }

    @ObfuscatedName("aw.p(Lik;Ljava/lang/String;ZB)V")
    public void method533(class247 arg0, String arg1, boolean arg2) {
        if (this.field515) {
            return;
        }
        this.field514 = false;
        this.field515 = true;
        System.nanoTime();
        int var4 = arg0.method4117(class41.field509.field510);
        int var5 = arg0.method4050(var4, arg1);
        class185 var6 = new class185(arg0.method4052(class41.field509.field510, arg1));
        class185 var7 = new class185(arg0.method4052(class41.field506.field510, arg1));
        class185 var8 = new class185(arg0.method4052(arg1, class41.field513.field510));
        System.nanoTime();
        System.nanoTime();
        this.field526 = new class45();
        try {
            this.field526.method550(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field526.method324();
        this.field526.method318();
        this.field526.method277();
        this.field523 = this.field526.method327() * 64;
        this.field524 = this.field526.method274() * 64;
        this.field525 = (this.field526.method273() - this.field526.method327() + 1) * 64;
        this.field528 = (this.field526.method276() - this.field526.method274() + 1) * 64;
        int var10 = this.field526.method273() - this.field526.method327() + 1;
        int var11 = this.field526.method276() - this.field526.method274() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field519 = new class35[var10][var11];
        Iterator var12 = this.field526.field538.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field385;
            int var15 = var13.field377;
            int var16 = var14 - this.field526.method327();
            int var17 = var15 - this.field526.method274();
            this.field519[var16][var17] = new class35(var14, var15, this.field526.method323(), this.field522);
            this.field519[var16][var17].method336(var13, this.field526.field540);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field519[var18][var19] == null) {
                    this.field519[var18][var19] = new class35(this.field526.method327() + var18, this.field526.method274() + var19, this.field526.method323(), this.field522);
                    this.field519[var18][var19].method337(this.field526.field539, this.field526.field540);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4100(class41.field507.field510, arg1)) {
            byte[] var20 = arg0.method4052(class41.field507.field510, arg1);
            Object var21 = null;
            class310 var27;
            label43: {
                try {
                    BufferedImage var22 = ImageIO.read(new ByteArrayInputStream(var20));
                    int var23 = var22.getWidth();
                    int var24 = var22.getHeight();
                    int[] var25 = new int[var23 * var24];
                    PixelGrabber var26 = new PixelGrabber(var22, 0, 0, var23, var24, var25, 0, var23);
                    var26.grabPixels();
                    var27 = new class310(var25, var23, var24);
                    break label43;
                } catch (IOException var31) {
                } catch (InterruptedException var32) {
                }
                var27 = new class310(0, 0);
            }
            this.field527 = var27;
        }
        System.nanoTime();
        this.field514 = true;
    }

    @ObfuscatedName("aw.i(I)V")
    public final void method535() {
        this.field518 = null;
    }

    @ObfuscatedName("aw.w(IIIIIIIIB)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3854;
        int var10 = Statics.field3852;
        int var11 = Statics.field3853;
        int[] var12 = new int[4];
        class306.method5071(var12);
        class30 var13 = this.method507(arg0, arg1, arg2, arg3);
        float var14 = this.method521(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field520.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method590();
            this.field520.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field395; var18 < var13.field396 + var13.field395; var18++) {
            for (int var19 = var13.field391; var19 < var13.field392 + var13.field391; var19++) {
                this.method504(var18, var19, var17);
                this.field519[var18][var19].method340(var15, (class47) this.field520.get(var15), var17, this.field521);
            }
        }
        class306.method4992(var9, var10, var11);
        class306.method4996(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field523 + arg0;
        int var22 = this.field524 + arg1;
        for (int var23 = var13.field395; var23 < var13.field396 + var13.field395; var23++) {
            for (int var24 = var13.field391; var24 < var13.field392 + var13.field391; var24++) {
                this.field519[var23][var24].method335((this.field519[var23][var24].field446 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field519[var23][var24].field447 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("aw.s(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method507(arg0, arg1, arg2, arg3);
        float var15 = this.method521(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field523 + arg0;
        int var18 = this.field524 + arg1;
        for (int var19 = var14.field395; var19 < var14.field396 + var14.field395; var19++) {
            for (int var20 = var14.field391; var20 < var14.field392 + var14.field391; var20++) {
                if (arg12) {
                    this.field519[var19][var20].method387();
                }
                this.field519[var19][var20].method341((this.field519[var19][var20].field446 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field519[var19][var20].field447 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field395; var21 < var14.field396 + var14.field395; var21++) {
            for (int var22 = var14.field391; var22 < var14.field392 + var14.field391; var22++) {
                this.field519[var21][var22].method342(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("aw.j(II[Lai;I)V")
    public void method504(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field519.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field519[0].length - 1;
        if (var7) {
            arg2[class240.field3233.method13()] = null;
        } else {
            arg2[class240.field3233.method13()] = this.field519[arg0][arg1 + 1];
        }
        arg2[class240.field3228.method13()] = var7 || var5 ? null : this.field519[arg0 + 1][arg1 + 1];
        arg2[class240.field3234.method13()] = var7 || var4 ? null : this.field519[arg0 - 1][arg1 + 1];
        arg2[class240.field3232.method13()] = var5 ? null : this.field519[arg0 + 1][arg1];
        arg2[class240.field3235.method13()] = var4 ? null : this.field519[arg0 - 1][arg1];
        arg2[class240.field3227.method13()] = var6 ? null : this.field519[arg0][arg1 - 1];
        arg2[class240.field3230.method13()] = var6 || var5 ? null : this.field519[arg0 + 1][arg1 - 1];
        arg2[class240.field3229.method13()] = var6 || var4 ? null : this.field519[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("aw.a(IIIILjava/util/HashSet;IIB)V")
    public void method505(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field527 == null) {
            return;
        }
        this.field527.method5125(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field518 == null) {
            this.method510();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field518.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field497.field2697 - this.field523) * arg2 / this.field525;
                int var14 = arg3 - (var12.field497.field2698 - this.field524) * arg3 / this.field528;
                class306.method5000(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("aw.t(IIIIIIIIIII)Ljava/util/List;")
    public List method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field514) {
            return var11;
        }
        class30 var12 = this.method507(arg0, arg1, arg2, arg3);
        float var13 = this.method521(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field523 + arg0;
        int var16 = this.field524 + arg1;
        for (int var17 = var12.field395; var17 < var12.field396 + var12.field395; var17++) {
            for (int var18 = var12.field391; var18 < var12.field392 + var12.field391; var18++) {
                List var19 = this.field519[var17][var18].method370((this.field519[var17][var18].field446 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field519[var17][var18].field447 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("aw.r(IIIII)Lar;")
    public class30 method507(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field523 + arg0;
        int var7 = this.field524 + arg1;
        int var8 = this.field523 + arg2;
        int var9 = this.field524 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field396 = var12 - var10 + 1;
        var5.field392 = var13 - var11 + 1;
        var5.field395 = var10 - this.field526.method327();
        var5.field391 = var11 - this.field526.method274();
        if (var5.field395 < 0) {
            var5.field396 += var5.field395;
            var5.field395 = 0;
        }
        if (var5.field395 > this.field519.length - var5.field396) {
            var5.field396 = this.field519.length - var5.field395;
        }
        if (var5.field391 < 0) {
            var5.field392 += var5.field391;
            var5.field391 = 0;
        }
        if (var5.field391 > this.field519[0].length - var5.field392) {
            var5.field392 = this.field519[0].length - var5.field391;
        }
        var5.field396 = Math.min(var5.field396, this.field519.length);
        var5.field392 = Math.min(var5.field392, this.field519[0].length);
        return var5;
    }

    @ObfuscatedName("aw.m(I)Z")
    public boolean method508() {
        return this.field514;
    }

    @ObfuscatedName("aw.h(I)Ljava/util/HashMap;")
    public HashMap method509() {
        this.method510();
        return this.field518;
    }

    @ObfuscatedName("aw.o(I)V")
    public void method510() {
        if (this.field518 == null) {
            this.field518 = new HashMap();
        }
        this.field518.clear();
        for (int var1 = 0; var1 < this.field519.length; var1++) {
            for (int var2 = 0; var2 < this.field519[var1].length; var2++) {
                List var3 = this.field519[var1][var2].method453();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field518.containsKey(var5.field496)) {
                        List var7 = (List) this.field518.get(var5.field496);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field518.put(var5.field496, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.x(III)F")
    public float method521(int arg0, int arg1) {
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
