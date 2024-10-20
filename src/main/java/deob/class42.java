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

@ObfuscatedName("af")
public final class class42 {

    @ObfuscatedName("af.a")
    public boolean field527 = false;

    @ObfuscatedName("af.w")
    public boolean field519 = false;

    @ObfuscatedName("af.e")
    public class45 field520;

    @ObfuscatedName("af.k")
    public class299 field532;

    @ObfuscatedName("af.u")
    public HashMap field522;

    @ObfuscatedName("af.z")
    public class35[][] field523;

    @ObfuscatedName("af.t")
    public HashMap field531 = new HashMap();

    @ObfuscatedName("af.f")
    public class298[] field525;

    @ObfuscatedName("af.g")
    public final HashMap field526;

    @ObfuscatedName("af.j")
    public int field518;

    @ObfuscatedName("af.x")
    public int field528;

    @ObfuscatedName("af.c")
    public int field529;

    @ObfuscatedName("af.s")
    public int field530;

    public class42(class298[] arg0, HashMap arg1) {
        this.field525 = arg0;
        this.field526 = arg1;
    }

    @ObfuscatedName("af.a(Lib;Ljava/lang/String;ZI)V")
    public void method494(class247 arg0, String arg1, boolean arg2) {
        if (this.field519) {
            return;
        }
        this.field527 = false;
        this.field519 = true;
        System.nanoTime();
        int var4 = arg0.method3962(class41.field511.field515);
        int var5 = arg0.method3913(var4, arg1);
        class185 var6 = new class185(arg0.method3978(class41.field511.field515, arg1));
        class185 var7 = new class185(arg0.method3978(class41.field509.field515, arg1));
        class185 var8 = new class185(arg0.method3978(arg1, class41.field512.field515));
        System.nanoTime();
        System.nanoTime();
        this.field520 = new class45();
        try {
            this.field520.method540(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field520.method252();
        this.field520.method299();
        this.field520.method258();
        this.field518 = this.field520.method304() * 64;
        this.field528 = this.field520.method250() * 64;
        this.field529 = (this.field520.method249() - this.field520.method304() + 1) * 64;
        this.field530 = (this.field520.method251() - this.field520.method250() + 1) * 64;
        int var10 = this.field520.method249() - this.field520.method304() + 1;
        int var11 = this.field520.method251() - this.field520.method250() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field523 = new class35[var10][var11];
        Iterator var12 = this.field520.field542.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field384;
            int var15 = var13.field375;
            int var16 = var14 - this.field520.method304();
            int var17 = var15 - this.field520.method250();
            this.field523[var16][var17] = new class35(var14, var15, this.field520.method234(), this.field526);
            this.field523[var16][var17].method312(var13, this.field520.field545);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field523[var18][var19] == null) {
                    this.field523[var18][var19] = new class35(this.field520.method304() + var18, this.field520.method250() + var19, this.field520.method234(), this.field526);
                    this.field523[var18][var19].method327(this.field520.field543, this.field520.field545);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3914(class41.field514.field515, arg1)) {
            byte[] var20 = arg0.method3978(class41.field514.field515, arg1);
            Object var21 = null;
            class299 var27;
            label43: {
                try {
                    BufferedImage var22 = ImageIO.read(new ByteArrayInputStream(var20));
                    int var23 = var22.getWidth();
                    int var24 = var22.getHeight();
                    int[] var25 = new int[var23 * var24];
                    PixelGrabber var26 = new PixelGrabber(var22, 0, 0, var23, var24, var25, 0, var23);
                    var26.grabPixels();
                    var27 = new class299(var25, var23, var24);
                    break label43;
                } catch (IOException var31) {
                } catch (InterruptedException var32) {
                }
                var27 = new class299(0, 0);
            }
            this.field532 = var27;
        }
        System.nanoTime();
        this.field527 = true;
    }

    @ObfuscatedName("af.w(I)V")
    public final void method495() {
        this.field522 = null;
    }

    @ObfuscatedName("af.e(IIIIIIIIB)V")
    public final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3833;
        int var10 = Statics.field3828;
        int var11 = Statics.field3829;
        int[] var12 = new int[4];
        class295.method4701(var12);
        class30 var13 = this.method501(arg0, arg1, arg2, arg3);
        float var14 = this.method508(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field531.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method585();
            this.field531.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field396; var18 < var13.field397 + var13.field396; var18++) {
            for (int var19 = var13.field389; var19 < var13.field389 + var13.field386; var19++) {
                this.method498(var18, var19, var17);
                this.field523[var18][var19].method316(var15, (class47) this.field531.get(var15), var17, this.field525);
            }
        }
        class295.method4697(var9, var10, var11);
        class295.method4702(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field518 + arg0;
        int var22 = this.field528 + arg1;
        for (int var23 = var13.field396; var23 < var13.field397 + var13.field396; var23++) {
            for (int var24 = var13.field389; var24 < var13.field389 + var13.field386; var24++) {
                this.field523[var23][var24].method341((this.field523[var23][var24].field443 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field523[var23][var24].field446 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("af.k(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method501(arg0, arg1, arg2, arg3);
        float var15 = this.method508(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field518 + arg0;
        int var18 = this.field528 + arg1;
        for (int var19 = var14.field396; var19 < var14.field397 + var14.field396; var19++) {
            for (int var20 = var14.field389; var20 < var14.field389 + var14.field386; var20++) {
                if (arg12) {
                    this.field523[var19][var20].method380();
                }
                this.field523[var19][var20].method440((this.field523[var19][var20].field443 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field523[var19][var20].field446 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field396; var21 < var14.field397 + var14.field396; var21++) {
            for (int var22 = var14.field389; var22 < var14.field389 + var14.field386; var22++) {
                this.field523[var21][var22].method318(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("af.u(II[Lap;B)V")
    public void method498(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field523.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field523[0].length - 1;
        if (var7) {
            arg2[class240.field3262.method10()] = null;
        } else {
            arg2[class240.field3262.method10()] = this.field523[arg0][arg1 + 1];
        }
        arg2[class240.field3257.method10()] = var7 || var5 ? null : this.field523[arg0 + 1][arg1 + 1];
        arg2[class240.field3259.method10()] = var7 || var4 ? null : this.field523[arg0 - 1][arg1 + 1];
        arg2[class240.field3258.method10()] = var5 ? null : this.field523[arg0 + 1][arg1];
        arg2[class240.field3263.method10()] = var4 ? null : this.field523[arg0 - 1][arg1];
        arg2[class240.field3260.method10()] = var6 ? null : this.field523[arg0][arg1 - 1];
        arg2[class240.field3264.method10()] = var6 || var5 ? null : this.field523[arg0 + 1][arg1 - 1];
        arg2[class240.field3261.method10()] = var6 || var4 ? null : this.field523[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("af.z(IIIILjava/util/HashSet;III)V")
    public void method499(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field532 == null) {
            return;
        }
        this.field532.method4814(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field522 == null) {
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
                var10 = (List) this.field522.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field499.field2725 - this.field518) * arg2 / this.field529;
                int var14 = arg3 - (var12.field499.field2726 - this.field528) * arg3 / this.field530;
                class295.method4705(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("af.t(IIIIIIIIIII)Ljava/util/List;")
    public List method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field527) {
            return var11;
        }
        class30 var12 = this.method501(arg0, arg1, arg2, arg3);
        float var13 = this.method508(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field518 + arg0;
        int var16 = this.field528 + arg1;
        for (int var17 = var12.field396; var17 < var12.field397 + var12.field396; var17++) {
            for (int var18 = var12.field389; var18 < var12.field389 + var12.field386; var18++) {
                List var19 = this.field523[var17][var18].method310((this.field523[var17][var18].field443 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field523[var17][var18].field446 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("af.f(IIIII)Lak;")
    public class30 method501(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field518 + arg0;
        int var7 = this.field528 + arg1;
        int var8 = this.field518 + arg2;
        int var9 = this.field528 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field397 = var12 - var10 + 1;
        var5.field386 = var13 - var11 + 1;
        var5.field396 = var10 - this.field520.method304();
        var5.field389 = var11 - this.field520.method250();
        if (var5.field396 < 0) {
            var5.field397 += var5.field396;
            var5.field396 = 0;
        }
        if (var5.field396 > this.field523.length - var5.field397) {
            var5.field397 = this.field523.length - var5.field396;
        }
        if (var5.field389 < 0) {
            var5.field386 += var5.field389;
            var5.field389 = 0;
        }
        if (var5.field389 > this.field523[0].length - var5.field386) {
            var5.field386 = this.field523[0].length - var5.field389;
        }
        var5.field397 = Math.min(var5.field397, this.field523.length);
        var5.field386 = Math.min(var5.field386, this.field523[0].length);
        return var5;
    }

    @ObfuscatedName("af.g(B)Z")
    public boolean method514() {
        return this.field527;
    }

    @ObfuscatedName("af.x(B)Ljava/util/HashMap;")
    public HashMap method503() {
        this.method504();
        return this.field522;
    }

    @ObfuscatedName("af.c(I)V")
    public void method504() {
        if (this.field522 == null) {
            this.field522 = new HashMap();
        }
        this.field522.clear();
        for (int var1 = 0; var1 < this.field523.length; var1++) {
            for (int var2 = 0; var2 < this.field523[var1].length; var2++) {
                List var3 = this.field523[var1][var2].method347();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field522.containsKey(var5.field500)) {
                        List var7 = (List) this.field522.get(var5.field500);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field522.put(var5.field500, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.n(III)F")
    public float method508(int arg0, int arg1) {
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
