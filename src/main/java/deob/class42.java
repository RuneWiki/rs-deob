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

@ObfuscatedName("ao")
public final class class42 {

    @ObfuscatedName("ao.n")
    public boolean field528 = false;

    @ObfuscatedName("ao.v")
    public boolean field540 = false;

    @ObfuscatedName("ao.y")
    public class45 field529;

    @ObfuscatedName("ao.r")
    public class299 field531;

    @ObfuscatedName("ao.h")
    public HashMap field532;

    @ObfuscatedName("ao.d")
    public class35[][] field533;

    @ObfuscatedName("ao.s")
    public HashMap field534 = new HashMap();

    @ObfuscatedName("ao.b")
    public class298[] field537;

    @ObfuscatedName("ao.e")
    public final HashMap field536;

    @ObfuscatedName("ao.f")
    public int field530;

    @ObfuscatedName("ao.z")
    public int field538;

    @ObfuscatedName("ao.u")
    public int field535;

    @ObfuscatedName("ao.p")
    public int field539;

    public class42(class298[] arg0, HashMap arg1) {
        this.field537 = arg0;
        this.field536 = arg1;
    }

    @ObfuscatedName("ao.n(Lil;Ljava/lang/String;ZB)V")
    public void method516(class247 arg0, String arg1, boolean arg2) {
        if (this.field540) {
            return;
        }
        this.field528 = false;
        this.field540 = true;
        System.nanoTime();
        int var4 = arg0.method4007(class41.field523.field518);
        int var5 = arg0.method4009(var4, arg1);
        class185 var6 = new class185(arg0.method3977(class41.field523.field518, arg1));
        class185 var7 = new class185(arg0.method3977(class41.field519.field518, arg1));
        class185 var8 = new class185(arg0.method3977(arg1, class41.field522.field518));
        System.nanoTime();
        System.nanoTime();
        this.field529 = new class45();
        try {
            this.field529.method541(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field529.method243();
        this.field529.method261();
        this.field529.method262();
        this.field530 = this.field529.method266() * 64;
        this.field538 = this.field529.method258() * 64;
        this.field535 = (this.field529.method295() - this.field529.method266() + 1) * 64;
        this.field539 = (this.field529.method259() - this.field529.method258() + 1) * 64;
        int var10 = this.field529.method295() - this.field529.method266() + 1;
        int var11 = this.field529.method259() - this.field529.method258() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field533 = new class35[var10][var11];
        Iterator var12 = this.field529.field559.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field391;
            int var15 = var13.field389;
            int var16 = var14 - this.field529.method266();
            int var17 = var15 - this.field529.method258();
            this.field533[var16][var17] = new class35(var14, var15, this.field529.method289(), this.field536);
            this.field533[var16][var17].method318(var13, this.field529.field555);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field533[var18][var19] == null) {
                    this.field533[var18][var19] = new class35(this.field529.method266() + var18, this.field529.method258() + var19, this.field529.method289(), this.field536);
                    this.field533[var18][var19].method319(this.field529.field554, this.field529.field555);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3932(class41.field520.field518, arg1)) {
            byte[] var20 = arg0.method3977(class41.field520.field518, arg1);
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
            this.field531 = var27;
        }
        System.nanoTime();
        this.field528 = true;
    }

    @ObfuscatedName("ao.v(B)V")
    public final void method525() {
        this.field532 = null;
    }

    @ObfuscatedName("ao.y(IIIIIIIII)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3837;
        int var10 = Statics.field3835;
        int var11 = Statics.field3833;
        int[] var12 = new int[4];
        class295.method4740(var12);
        class30 var13 = this.method496(arg0, arg1, arg2, arg3);
        float var14 = this.method500(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field534.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method587();
            this.field534.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field400; var18 < var13.field405 + var13.field400; var18++) {
            for (int var19 = var13.field403; var19 < var13.field403 + var13.field401; var19++) {
                this.method493(var18, var19, var17);
                this.field533[var18][var19].method322(var15, (class47) this.field534.get(var15), var17, this.field537);
            }
        }
        class295.method4736(var9, var10, var11);
        class295.method4741(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field530 + arg0;
        int var22 = this.field538 + arg1;
        for (int var23 = var13.field400; var23 < var13.field405 + var13.field400; var23++) {
            for (int var24 = var13.field403; var24 < var13.field403 + var13.field401; var24++) {
                this.field533[var23][var24].method422((this.field533[var23][var24].field456 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field533[var23][var24].field454 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ao.r(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method496(arg0, arg1, arg2, arg3);
        float var15 = this.method500(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field530 + arg0;
        int var18 = this.field538 + arg1;
        for (int var19 = var14.field400; var19 < var14.field405 + var14.field400; var19++) {
            for (int var20 = var14.field403; var20 < var14.field403 + var14.field401; var20++) {
                if (arg12) {
                    this.field533[var19][var20].method378();
                }
                this.field533[var19][var20].method338((this.field533[var19][var20].field456 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field533[var19][var20].field454 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field400; var21 < var14.field405 + var14.field400; var21++) {
            for (int var22 = var14.field403; var22 < var14.field403 + var14.field401; var22++) {
                this.field533[var21][var22].method324(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ao.h(II[Lav;I)V")
    public void method493(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field533.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field533[0].length - 1;
        if (var7) {
            arg2[class240.field3259.method6()] = null;
        } else {
            arg2[class240.field3259.method6()] = this.field533[arg0][arg1 + 1];
        }
        arg2[class240.field3256.method6()] = var7 || var5 ? null : this.field533[arg0 + 1][arg1 + 1];
        arg2[class240.field3257.method6()] = var7 || var4 ? null : this.field533[arg0 - 1][arg1 + 1];
        arg2[class240.field3263.method6()] = var5 ? null : this.field533[arg0 + 1][arg1];
        arg2[class240.field3261.method6()] = var4 ? null : this.field533[arg0 - 1][arg1];
        arg2[class240.field3258.method6()] = var6 ? null : this.field533[arg0][arg1 - 1];
        arg2[class240.field3262.method6()] = var6 || var5 ? null : this.field533[arg0 + 1][arg1 - 1];
        arg2[class240.field3260.method6()] = var6 || var4 ? null : this.field533[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ao.d(IIIILjava/util/HashSet;III)V")
    public void method494(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field531 == null) {
            return;
        }
        this.field531.method4861(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field532 == null) {
            this.method499();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field532.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field515.field2730 - this.field530) * arg2 / this.field535;
                int var14 = arg3 - (var12.field515.field2731 - this.field538) * arg3 / this.field539;
                class295.method4747(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ao.s(IIIIIIIIIII)Ljava/util/List;")
    public List method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field528) {
            return var11;
        }
        class30 var12 = this.method496(arg0, arg1, arg2, arg3);
        float var13 = this.method500(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field530 + arg0;
        int var16 = this.field538 + arg1;
        for (int var17 = var12.field400; var17 < var12.field405 + var12.field400; var17++) {
            for (int var18 = var12.field403; var18 < var12.field403 + var12.field401; var18++) {
                List var19 = this.field533[var17][var18].method353((this.field533[var17][var18].field456 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field533[var17][var18].field454 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ao.b(IIIIB)Lag;")
    public class30 method496(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field530 + arg0;
        int var7 = this.field538 + arg1;
        int var8 = this.field530 + arg2;
        int var9 = this.field538 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field405 = var12 - var10 + 1;
        var5.field401 = var13 - var11 + 1;
        var5.field400 = var10 - this.field529.method266();
        var5.field403 = var11 - this.field529.method258();
        if (var5.field400 < 0) {
            var5.field405 += var5.field400;
            var5.field400 = 0;
        }
        if (var5.field400 > this.field533.length - var5.field405) {
            var5.field405 = this.field533.length - var5.field400;
        }
        if (var5.field403 < 0) {
            var5.field401 += var5.field403;
            var5.field403 = 0;
        }
        if (var5.field403 > this.field533[0].length - var5.field401) {
            var5.field401 = this.field533[0].length - var5.field403;
        }
        var5.field405 = Math.min(var5.field405, this.field533.length);
        var5.field401 = Math.min(var5.field401, this.field533[0].length);
        return var5;
    }

    @ObfuscatedName("ao.e(S)Z")
    public boolean method497() {
        return this.field528;
    }

    @ObfuscatedName("ao.f(I)Ljava/util/HashMap;")
    public HashMap method498() {
        this.method499();
        return this.field532;
    }

    @ObfuscatedName("ao.u(I)V")
    public void method499() {
        if (this.field532 == null) {
            this.field532 = new HashMap();
        }
        this.field532.clear();
        for (int var1 = 0; var1 < this.field533.length; var1++) {
            for (int var2 = 0; var2 < this.field533[var1].length; var2++) {
                List var3 = this.field533[var1][var2].method343();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field532.containsKey(var5.field513)) {
                        List var7 = (List) this.field532.get(var5.field513);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field532.put(var5.field513, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.t(III)F")
    public float method500(int arg0, int arg1) {
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
