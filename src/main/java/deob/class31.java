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

@ObfuscatedName("ay")
public final class class31 {

    @ObfuscatedName("ay.f")
    public boolean field273 = false;

    @ObfuscatedName("ay.h")
    public boolean field264 = false;

    @ObfuscatedName("ay.e")
    public class34 field268;

    @ObfuscatedName("ay.b")
    public class324 field270;

    @ObfuscatedName("ay.l")
    public HashMap field274;

    @ObfuscatedName("ay.w")
    public class24[][] field277;

    @ObfuscatedName("ay.d")
    public HashMap field269 = new HashMap();

    @ObfuscatedName("ay.n")
    public class323[] field267;

    @ObfuscatedName("ay.s")
    public final HashMap field266;

    @ObfuscatedName("ay.g")
    public int field272;

    @ObfuscatedName("ay.a")
    public int field271;

    @ObfuscatedName("ay.r")
    public int field263;

    @ObfuscatedName("ay.k")
    public int field275;

    @ObfuscatedName("ay.m")
    public int field276 = 0;

    public class31(class323[] arg0, HashMap arg1) {
        this.field267 = arg0;
        this.field266 = arg1;
    }

    @ObfuscatedName("ay.f(Lie;Ljava/lang/String;ZI)V")
    public void method475(class250 arg0, String arg1, boolean arg2) {
        if (this.field264) {
            return;
        }
        this.field273 = false;
        this.field264 = true;
        System.nanoTime();
        int var4 = arg0.method4285(class30.field254.field257);
        int var5 = arg0.method4286(var4, arg1);
        class185 var6 = new class185(arg0.method4317(class30.field254.field257, arg1));
        class185 var7 = new class185(arg0.method4317(class30.field253.field257, arg1));
        class185 var8 = new class185(arg0.method4317(arg1, class30.field255.field257));
        System.nanoTime();
        System.nanoTime();
        this.field268 = new class34();
        try {
            this.field268.method528(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field268.method246();
        this.field268.method243();
        this.field268.method242();
        this.field272 = this.field268.method236() * 64;
        this.field271 = this.field268.method241() * 64;
        this.field263 = (this.field268.method237() - this.field268.method236() + 1) * 64;
        this.field275 = (this.field268.method239() - this.field268.method241() + 1) * 64;
        int var10 = this.field268.method237() - this.field268.method236() + 1;
        int var11 = this.field268.method239() - this.field268.method241() + 1;
        System.nanoTime();
        System.nanoTime();
        class24.field196.method3745();
        class24.field197.method3745();
        this.field277 = new class24[var10][var11];
        Iterator var12 = this.field268.field293.iterator();
        while (var12.hasNext()) {
            class11 var13 = (class11) var12.next();
            int var14 = var13.field134;
            int var15 = var13.field136;
            int var16 = var14 - this.field268.method236();
            int var17 = var15 - this.field268.method241();
            this.field277[var16][var17] = new class24(var14, var15, this.field268.method234(), this.field266);
            this.field277[var16][var17].method305(var13, this.field268.field294);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field277[var18][var19] == null) {
                    this.field277[var18][var19] = new class24(this.field268.method236() + var18, this.field268.method241() + var19, this.field268.method234(), this.field266);
                    this.field277[var18][var19].method409(this.field268.field292, this.field268.field294);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4282(class30.field256.field257, arg1)) {
            byte[] var20 = arg0.method4317(class30.field256.field257, arg1);
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
            this.field270 = var27;
        }
        System.nanoTime();
        arg0.method4281();
        arg0.method4283();
        this.field273 = true;
    }

    @ObfuscatedName("ay.h(B)V")
    public final void method516() {
        this.field274 = null;
    }

    @ObfuscatedName("ay.e(IIIIIIIIS)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3848;
        int var10 = Statics.field3846;
        int var11 = Statics.field3847;
        int[] var12 = new int[4];
        class320.method5342(var12);
        class18 var13 = this.method474(arg0, arg1, arg2, arg3);
        float var14 = this.method486(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field276 = var15;
        if (!this.field269.containsKey(var15)) {
            class36 var16 = new class36(var15);
            var16.method574();
            this.field269.put(var15, var16);
        }
        class24[] var17 = new class24[8];
        for (int var18 = var13.field142; var18 < var13.field144 + var13.field142; var18++) {
            for (int var19 = var13.field143; var19 < var13.field145 + var13.field143; var19++) {
                this.method479(var18, var19, var17);
                this.field277[var18][var19].method392(var15, (class36) this.field269.get(var15), var17, this.field267);
            }
        }
        class320.method5338(var9, var10, var11);
        class320.method5343(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field272 + arg0;
        int var22 = this.field271 + arg1;
        for (int var23 = var13.field142; var23 < var13.field144 + var13.field142; var23++) {
            for (int var24 = var13.field143; var24 < var13.field145 + var13.field143; var24++) {
                this.field277[var23][var24].method425((this.field277[var23][var24].field194 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field277[var23][var24].field199 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ay.b(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class18 var14 = this.method474(arg0, arg1, arg2, arg3);
        float var15 = this.method486(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field272 + arg0;
        int var18 = this.field271 + arg1;
        for (int var19 = var14.field142; var19 < var14.field144 + var14.field142; var19++) {
            for (int var20 = var14.field143; var20 < var14.field145 + var14.field143; var20++) {
                if (arg12) {
                    this.field277[var19][var20].method332();
                }
                this.field277[var19][var20].method310((this.field277[var19][var20].field194 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field277[var19][var20].field199 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field142; var21 < var14.field144 + var14.field142; var21++) {
            for (int var22 = var14.field143; var22 < var14.field145 + var14.field143; var22++) {
                this.field277[var21][var22].method311(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ay.l(II[Li;I)V")
    public void method479(int arg0, int arg1, class24[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field277.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field277[0].length - 1;
        if (var7) {
            arg2[class243.field3155.method179()] = null;
        } else {
            arg2[class243.field3155.method179()] = this.field277[arg0][arg1 + 1];
        }
        arg2[class243.field3153.method179()] = var7 || var5 ? null : this.field277[arg0 + 1][arg1 + 1];
        arg2[class243.field3161.method179()] = var7 || var4 ? null : this.field277[arg0 - 1][arg1 + 1];
        arg2[class243.field3159.method179()] = var5 ? null : this.field277[arg0 + 1][arg1];
        arg2[class243.field3158.method179()] = var4 ? null : this.field277[arg0 - 1][arg1];
        arg2[class243.field3156.method179()] = var6 ? null : this.field277[arg0][arg1 - 1];
        arg2[class243.field3157.method179()] = var6 || var5 ? null : this.field277[arg0 + 1][arg1 - 1];
        arg2[class243.field3154.method179()] = var6 || var4 ? null : this.field277[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ay.w(IIIILjava/util/HashSet;IIS)V")
    public void method480(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field270 == null) {
            return;
        }
        this.field270.method5462(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field274 == null) {
            this.method478();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field274.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class29 var12 = (class29) var11.next();
                int var13 = (var12.field250.field2620 - this.field272) * arg2 / this.field263;
                int var14 = arg3 - (var12.field250.field2621 - this.field271) * arg3 / this.field275;
                class320.method5346(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ay.d(IIIIIIIIIIB)Ljava/util/List;")
    public List method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field273) {
            return var11;
        }
        class18 var12 = this.method474(arg0, arg1, arg2, arg3);
        float var13 = this.method486(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field272 + arg0;
        int var16 = this.field271 + arg1;
        for (int var17 = var12.field142; var17 < var12.field144 + var12.field142; var17++) {
            for (int var18 = var12.field143; var18 < var12.field145 + var12.field143; var18++) {
                List var19 = this.field277[var17][var18].method339((this.field277[var17][var18].field194 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field277[var17][var18].field199 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ay.n(IIIIB)Lo;")
    public class18 method474(int arg0, int arg1, int arg2, int arg3) {
        class18 var5 = new class18(this);
        int var6 = this.field272 + arg0;
        int var7 = this.field271 + arg1;
        int var8 = this.field272 + arg2;
        int var9 = this.field271 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field144 = var12 - var10 + 1;
        var5.field145 = var13 - var11 + 1;
        var5.field142 = var10 - this.field268.method236();
        var5.field143 = var11 - this.field268.method241();
        if (var5.field142 < 0) {
            var5.field144 += var5.field142;
            var5.field142 = 0;
        }
        if (var5.field142 > this.field277.length - var5.field144) {
            var5.field144 = this.field277.length - var5.field142;
        }
        if (var5.field143 < 0) {
            var5.field145 += var5.field143;
            var5.field143 = 0;
        }
        if (var5.field143 > this.field277[0].length - var5.field145) {
            var5.field145 = this.field277[0].length - var5.field143;
        }
        var5.field144 = Math.min(var5.field144, this.field277.length);
        var5.field145 = Math.min(var5.field145, this.field277[0].length);
        return var5;
    }

    @ObfuscatedName("ay.s(I)Z")
    public boolean method515() {
        return this.field273;
    }

    @ObfuscatedName("ay.g(B)Ljava/util/HashMap;")
    public HashMap method484() {
        this.method478();
        return this.field274;
    }

    @ObfuscatedName("ay.k(I)V")
    public void method478() {
        if (this.field274 == null) {
            this.field274 = new HashMap();
        }
        this.field274.clear();
        for (int var1 = 0; var1 < this.field277.length; var1++) {
            for (int var2 = 0; var2 < this.field277[var1].length; var2++) {
                List var3 = this.field277[var1][var2].method320();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class29 var5 = (class29) var4.next();
                    if (this.field274.containsKey(var5.field241)) {
                        List var7 = (List) this.field274.get(var5.field241);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field274.put(var5.field241, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.m(IIB)F")
    public float method486(int arg0, int arg1) {
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
