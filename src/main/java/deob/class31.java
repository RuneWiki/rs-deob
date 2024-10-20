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

@ObfuscatedName("aj")
public final class class31 {

    @ObfuscatedName("aj.c")
    public boolean field297 = false;

    @ObfuscatedName("aj.q")
    public boolean field295 = false;

    @ObfuscatedName("aj.m")
    public class34 field290;

    @ObfuscatedName("aj.j")
    public class324 field284;

    @ObfuscatedName("aj.g")
    public HashMap field285;

    @ObfuscatedName("aj.i")
    public class24[][] field286;

    @ObfuscatedName("aj.h")
    public HashMap field282 = new HashMap();

    @ObfuscatedName("aj.l")
    public class323[] field288;

    @ObfuscatedName("aj.d")
    public final HashMap field289;

    @ObfuscatedName("aj.o")
    public int field287;

    @ObfuscatedName("aj.s")
    public int field291;

    @ObfuscatedName("aj.k")
    public int field292;

    @ObfuscatedName("aj.v")
    public int field293;

    @ObfuscatedName("aj.p")
    public int field283 = 0;

    public class31(class323[] arg0, HashMap arg1) {
        this.field288 = arg0;
        this.field289 = arg1;
    }

    @ObfuscatedName("aj.c(Lih;Ljava/lang/String;ZI)V")
    public void method487(class250 arg0, String arg1, boolean arg2) {
        if (this.field295) {
            return;
        }
        this.field297 = false;
        this.field295 = true;
        System.nanoTime();
        int var4 = arg0.method4228(class30.field275.field278);
        int var5 = arg0.method4255(var4, arg1);
        class185 var6 = new class185(arg0.method4294(class30.field275.field278, arg1));
        class185 var7 = new class185(arg0.method4294(class30.field271.field278, arg1));
        class185 var8 = new class185(arg0.method4294(arg1, class30.field273.field278));
        System.nanoTime();
        System.nanoTime();
        this.field290 = new class34();
        try {
            this.field290.method543(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field290.method220();
        this.field290.method258();
        this.field290.method222();
        this.field287 = this.field290.method278() * 64;
        this.field291 = this.field290.method218() * 64;
        this.field292 = (this.field290.method224() - this.field290.method278() + 1) * 64;
        this.field293 = (this.field290.method247() - this.field290.method218() + 1) * 64;
        int var10 = this.field290.method224() - this.field290.method278() + 1;
        int var11 = this.field290.method247() - this.field290.method218() + 1;
        System.nanoTime();
        System.nanoTime();
        class24.field213.method3668();
        class24.field219.method3668();
        this.field286 = new class24[var10][var11];
        Iterator var12 = this.field290.field310.iterator();
        while (var12.hasNext()) {
            class11 var13 = (class11) var12.next();
            int var14 = var13.field144;
            int var15 = var13.field143;
            int var16 = var14 - this.field290.method278();
            int var17 = var15 - this.field290.method218();
            this.field286[var16][var17] = new class24(var14, var15, this.field290.method284(), this.field289);
            this.field286[var16][var17].method302(var13, this.field290.field312);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field286[var18][var19] == null) {
                    this.field286[var18][var19] = new class24(this.field290.method278() + var18, this.field290.method218() + var19, this.field290.method284(), this.field289);
                    this.field286[var18][var19].method440(this.field290.field311, this.field290.field312);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4230(class30.field274.field278, arg1)) {
            byte[] var20 = arg0.method4294(class30.field274.field278, arg1);
            Object var21 = null;
            class324 var27;
            label43: {
                try {
                    BufferedImage var22 = ImageIO.read(new ByteArrayInputStream(var20));
                    int var23 = var22.getWidth();
                    int var24 = var22.getHeight();
                    int[] var25 = new int[var23 * var24];
                    PixelGrabber var26 = new PixelGrabber(var22, 0, 0, var23, var24, var25, 0, var23);
                    var26.grabPixels();
                    var27 = new class324(var25, var23, var24);
                    break label43;
                } catch (IOException var31) {
                } catch (InterruptedException var32) {
                }
                var27 = new class324(0, 0);
            }
            this.field284 = var27;
        }
        System.nanoTime();
        arg0.method4224();
        arg0.method4242();
        this.field297 = true;
    }

    @ObfuscatedName("aj.q(I)V")
    public final void method488() {
        this.field285 = null;
    }

    @ObfuscatedName("aj.m(IIIIIIIIB)V")
    public final void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3827;
        int var10 = Statics.field3825;
        int var11 = Statics.field3824;
        int[] var12 = new int[4];
        class320.method5373(var12);
        class18 var13 = this.method500(arg0, arg1, arg2, arg3);
        float var14 = this.method503(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field283 = var15;
        if (!this.field282.containsKey(var15)) {
            class36 var16 = new class36(var15);
            var16.method579();
            this.field282.put(var15, var16);
        }
        class24[] var17 = new class24[8];
        for (int var18 = var13.field156; var18 < var13.field158 + var13.field156; var18++) {
            for (int var19 = var13.field157; var19 < var13.field157 + var13.field154; var19++) {
                this.method491(var18, var19, var17);
                this.field286[var18][var19].method305(var15, (class36) this.field282.get(var15), var17, this.field288);
            }
        }
        class320.method5369(var9, var10, var11);
        class320.method5374(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field287 + arg0;
        int var22 = this.field291 + arg1;
        for (int var23 = var13.field156; var23 < var13.field158 + var13.field156; var23++) {
            for (int var24 = var13.field157; var24 < var13.field157 + var13.field154; var24++) {
                this.field286[var23][var24].method324((this.field286[var23][var24].field222 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field286[var23][var24].field212 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("aj.j(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class18 var14 = this.method500(arg0, arg1, arg2, arg3);
        float var15 = this.method503(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field287 + arg0;
        int var18 = this.field291 + arg1;
        for (int var19 = var14.field156; var19 < var14.field158 + var14.field156; var19++) {
            for (int var20 = var14.field157; var20 < var14.field157 + var14.field154; var20++) {
                if (arg12) {
                    this.field286[var19][var20].method313();
                }
                this.field286[var19][var20].method306((this.field286[var19][var20].field222 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field286[var19][var20].field212 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field156; var21 < var14.field158 + var14.field156; var21++) {
            for (int var22 = var14.field157; var22 < var14.field157 + var14.field154; var22++) {
                this.field286[var21][var22].method424(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("aj.g(II[Ly;I)V")
    public void method491(int arg0, int arg1, class24[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field286.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field286[0].length - 1;
        if (var7) {
            arg2[class243.field3136.method165()] = null;
        } else {
            arg2[class243.field3136.method165()] = this.field286[arg0][arg1 + 1];
        }
        arg2[class243.field3131.method165()] = var7 || var5 ? null : this.field286[arg0 + 1][arg1 + 1];
        arg2[class243.field3137.method165()] = var7 || var4 ? null : this.field286[arg0 - 1][arg1 + 1];
        arg2[class243.field3132.method165()] = var5 ? null : this.field286[arg0 + 1][arg1];
        arg2[class243.field3138.method165()] = var4 ? null : this.field286[arg0 - 1][arg1];
        arg2[class243.field3133.method165()] = var6 ? null : this.field286[arg0][arg1 - 1];
        arg2[class243.field3130.method165()] = var6 || var5 ? null : this.field286[arg0 + 1][arg1 - 1];
        arg2[class243.field3135.method165()] = var6 || var4 ? null : this.field286[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("aj.i(IIIILjava/util/HashSet;III)V")
    public void method492(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field284 == null) {
            return;
        }
        this.field284.method5493(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field285 == null) {
            this.method497();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field285.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class29 var12 = (class29) var11.next();
                int var13 = (var12.field260.field2600 - this.field287) * arg2 / this.field292;
                int var14 = arg3 - (var12.field260.field2602 - this.field291) * arg3 / this.field293;
                class320.method5377(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("aj.h(IIIIIIIIIII)Ljava/util/List;")
    public List method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field297) {
            return var11;
        }
        class18 var12 = this.method500(arg0, arg1, arg2, arg3);
        float var13 = this.method503(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field287 + arg0;
        int var16 = this.field291 + arg1;
        for (int var17 = var12.field156; var17 < var12.field158 + var12.field156; var17++) {
            for (int var18 = var12.field157; var18 < var12.field157 + var12.field154; var18++) {
                List var19 = this.field286[var17][var18].method335((this.field286[var17][var18].field222 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field286[var17][var18].field212 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("aj.l(IIIIB)Lx;")
    public class18 method500(int arg0, int arg1, int arg2, int arg3) {
        class18 var5 = new class18(this);
        int var6 = this.field287 + arg0;
        int var7 = this.field291 + arg1;
        int var8 = this.field287 + arg2;
        int var9 = this.field291 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field158 = var12 - var10 + 1;
        var5.field154 = var13 - var11 + 1;
        var5.field156 = var10 - this.field290.method278();
        var5.field157 = var11 - this.field290.method218();
        if (var5.field156 < 0) {
            var5.field158 += var5.field156;
            var5.field156 = 0;
        }
        if (var5.field156 > this.field286.length - var5.field158) {
            var5.field158 = this.field286.length - var5.field156;
        }
        if (var5.field157 < 0) {
            var5.field154 += var5.field157;
            var5.field157 = 0;
        }
        if (var5.field157 > this.field286[0].length - var5.field154) {
            var5.field154 = this.field286[0].length - var5.field157;
        }
        var5.field158 = Math.min(var5.field158, this.field286.length);
        var5.field154 = Math.min(var5.field154, this.field286[0].length);
        return var5;
    }

    @ObfuscatedName("aj.o(I)Z")
    public boolean method495() {
        return this.field297;
    }

    @ObfuscatedName("aj.k(I)Ljava/util/HashMap;")
    public HashMap method512() {
        this.method497();
        return this.field285;
    }

    @ObfuscatedName("aj.v(I)V")
    public void method497() {
        if (this.field285 == null) {
            this.field285 = new HashMap();
        }
        this.field285.clear();
        for (int var1 = 0; var1 < this.field286.length; var1++) {
            for (int var2 = 0; var2 < this.field286[var1].length; var2++) {
                List var3 = this.field286[var1][var2].method336();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class29 var5 = (class29) var4.next();
                    if (this.field285.containsKey(var5.field263)) {
                        List var7 = (List) this.field285.get(var5.field263);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field285.put(var5.field263, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.p(IIB)F")
    public float method503(int arg0, int arg1) {
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
