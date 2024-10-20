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

@ObfuscatedName("ac")
public final class class42 {

    @ObfuscatedName("ac.w")
    public boolean field572 = false;

    @ObfuscatedName("ac.s")
    public boolean field583 = false;

    @ObfuscatedName("ac.q")
    public class45 field573;

    @ObfuscatedName("ac.o")
    public class287 field574;

    @ObfuscatedName("ac.g")
    public HashMap field582;

    @ObfuscatedName("ac.v")
    public class35[][] field576;

    @ObfuscatedName("ac.p")
    public HashMap field585 = new HashMap();

    @ObfuscatedName("ac.e")
    public class286[] field578;

    @ObfuscatedName("ac.d")
    public final HashMap field579;

    @ObfuscatedName("ac.x")
    public int field580;

    @ObfuscatedName("ac.z")
    public int field581;

    @ObfuscatedName("ac.n")
    public int field575;

    @ObfuscatedName("ac.u")
    public int field584;

    public class42(class286[] arg0, HashMap arg1) {
        this.field578 = arg0;
        this.field579 = arg1;
    }

    @ObfuscatedName("ac.w(Lip;Ljava/lang/String;ZI)V")
    public void method490(class236 arg0, String arg1, boolean arg2) {
        if (this.field583) {
            return;
        }
        this.field572 = false;
        this.field583 = true;
        System.nanoTime();
        int var4 = arg0.method3955(class41.field568.field564);
        int var5 = arg0.method3893(var4, arg1);
        class174 var6 = new class174(arg0.method3951(class41.field568.field564, arg1));
        class174 var7 = new class174(arg0.method3951(class41.field565.field564, arg1));
        class174 var8 = new class174(arg0.method3951(arg1, class41.field567.field564));
        System.nanoTime();
        System.nanoTime();
        this.field573 = new class45();
        try {
            this.field573.method547(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field573.method262();
        this.field573.method313();
        this.field573.method246();
        this.field580 = this.field573.method258() * 64;
        this.field581 = this.field573.method260() * 64;
        this.field575 = (this.field573.method259() - this.field573.method258() + 1) * 64;
        this.field584 = (this.field573.method261() - this.field573.method260() + 1) * 64;
        int var10 = this.field573.method259() - this.field573.method258() + 1;
        int var11 = this.field573.method261() - this.field573.method260() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field576 = new class35[var10][var11];
        Iterator var12 = this.field573.field601.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field424;
            int var15 = var13.field417;
            int var16 = var14 - this.field573.method258();
            int var17 = var15 - this.field573.method260();
            this.field576[var16][var17] = new class35(var14, var15, this.field573.method256(), this.field579);
            this.field576[var16][var17].method319(var13, this.field573.field599);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field576[var18][var19] == null) {
                    this.field576[var18][var19] = new class35(this.field573.method258() + var18, this.field573.method260() + var19, this.field573.method256(), this.field579);
                    this.field576[var18][var19].method320(this.field573.field600, this.field573.field599);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3894(class41.field566.field564, arg1)) {
            byte[] var20 = arg0.method3951(class41.field566.field564, arg1);
            Object var21 = null;
            class287 var27;
            label43: {
                try {
                    BufferedImage var22 = ImageIO.read(new ByteArrayInputStream(var20));
                    int var23 = var22.getWidth();
                    int var24 = var22.getHeight();
                    int[] var25 = new int[var23 * var24];
                    PixelGrabber var26 = new PixelGrabber(var22, 0, 0, var23, var24, var25, 0, var23);
                    var26.grabPixels();
                    var27 = new class287(var25, var23, var24);
                    break label43;
                } catch (IOException var31) {
                } catch (InterruptedException var32) {
                }
                var27 = new class287(0, 0);
            }
            this.field574 = var27;
        }
        System.nanoTime();
        this.field572 = true;
    }

    @ObfuscatedName("ac.s(I)V")
    public final void method516() {
        this.field582 = null;
    }

    @ObfuscatedName("ac.q(IIIIIIIIB)V")
    public final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3773;
        int var10 = Statics.field3769;
        int var11 = Statics.field3770;
        int[] var12 = new int[4];
        class283.method4749(var12);
        class30 var13 = this.method492(arg0, arg1, arg2, arg3);
        float var14 = this.method501(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field585.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method589();
            this.field585.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field429; var18 < var13.field438 + var13.field429; var18++) {
            for (int var19 = var13.field436; var19 < var13.field437 + var13.field436; var19++) {
                this.method512(var18, var19, var17);
                this.field576[var18][var19].method436(var15, (class47) this.field585.get(var15), var17, this.field578);
            }
        }
        class283.method4694(var9, var10, var11);
        class283.method4699(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field580 + arg0;
        int var22 = this.field581 + arg1;
        for (int var23 = var13.field429; var23 < var13.field438 + var13.field429; var23++) {
            for (int var24 = var13.field436; var24 < var13.field437 + var13.field436; var24++) {
                this.field576[var23][var24].method318((this.field576[var23][var24].field488 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field576[var23][var24].field489 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ac.o(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method492(arg0, arg1, arg2, arg3);
        float var15 = this.method501(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field580 + arg0;
        int var18 = this.field581 + arg1;
        for (int var19 = var14.field429; var19 < var14.field438 + var14.field429; var19++) {
            for (int var20 = var14.field436; var20 < var14.field437 + var14.field436; var20++) {
                if (arg12) {
                    this.field576[var19][var20].method347();
                }
                this.field576[var19][var20].method324((this.field576[var19][var20].field488 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field576[var19][var20].field489 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field429; var21 < var14.field438 + var14.field429; var21++) {
            for (int var22 = var14.field436; var22 < var14.field437 + var14.field436; var22++) {
                this.field576[var21][var22].method325(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ac.g(II[Laq;S)V")
    public void method512(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field576.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field576[0].length - 1;
        if (var7) {
            arg2[class229.field3151.method13()] = null;
        } else {
            arg2[class229.field3151.method13()] = this.field576[arg0][arg1 + 1];
        }
        arg2[class229.field3154.method13()] = var7 || var5 ? null : this.field576[arg0 + 1][arg1 + 1];
        arg2[class229.field3158.method13()] = var7 || var4 ? null : this.field576[arg0 - 1][arg1 + 1];
        arg2[class229.field3156.method13()] = var5 ? null : this.field576[arg0 + 1][arg1];
        arg2[class229.field3164.method13()] = var4 ? null : this.field576[arg0 - 1][arg1];
        arg2[class229.field3153.method13()] = var6 ? null : this.field576[arg0][arg1 - 1];
        arg2[class229.field3152.method13()] = var6 || var5 ? null : this.field576[arg0 + 1][arg1 - 1];
        arg2[class229.field3155.method13()] = var6 || var4 ? null : this.field576[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ac.v(IIIILjava/util/HashSet;IIB)V")
    public void method495(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field574 == null) {
            return;
        }
        this.field574.method4879(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field582 == null) {
            this.method500();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field582.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field549.field2602 - this.field580) * arg2 / this.field575;
                int var14 = arg3 - (var12.field549.field2603 - this.field581) * arg3 / this.field584;
                class283.method4698(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ac.p(IIIIIIIIIII)Ljava/util/List;")
    public List method528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field572) {
            return var11;
        }
        class30 var12 = this.method492(arg0, arg1, arg2, arg3);
        float var13 = this.method501(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field580 + arg0;
        int var16 = this.field581 + arg1;
        for (int var17 = var12.field429; var17 < var12.field438 + var12.field429; var17++) {
            for (int var18 = var12.field436; var18 < var12.field437 + var12.field436; var18++) {
                List var19 = this.field576[var17][var18].method354((this.field576[var17][var18].field488 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field576[var17][var18].field489 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ac.e(IIIII)Lay;")
    public class30 method492(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field580 + arg0;
        int var7 = this.field581 + arg1;
        int var8 = this.field580 + arg2;
        int var9 = this.field581 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field438 = var12 - var10 + 1;
        var5.field437 = var13 - var11 + 1;
        var5.field429 = var10 - this.field573.method258();
        var5.field436 = var11 - this.field573.method260();
        if (var5.field429 < 0) {
            var5.field438 += var5.field429;
            var5.field429 = 0;
        }
        if (var5.field429 > this.field576.length - var5.field438) {
            var5.field438 = this.field576.length - var5.field429;
        }
        if (var5.field436 < 0) {
            var5.field437 += var5.field436;
            var5.field436 = 0;
        }
        if (var5.field436 > this.field576[0].length - var5.field437) {
            var5.field437 = this.field576[0].length - var5.field436;
        }
        var5.field438 = Math.min(var5.field438, this.field576.length);
        var5.field437 = Math.min(var5.field437, this.field576[0].length);
        return var5;
    }

    @ObfuscatedName("ac.d(I)Z")
    public boolean method498() {
        return this.field572;
    }

    @ObfuscatedName("ac.x(S)Ljava/util/HashMap;")
    public HashMap method499() {
        this.method500();
        return this.field582;
    }

    @ObfuscatedName("ac.u(I)V")
    public void method500() {
        if (this.field582 == null) {
            this.field582 = new HashMap();
        }
        this.field582.clear();
        for (int var1 = 0; var1 < this.field576.length; var1++) {
            for (int var2 = 0; var2 < this.field576[var1].length; var2++) {
                List var3 = this.field576[var1][var2].method382();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field582.containsKey(var5.field557)) {
                        List var7 = (List) this.field582.get(var5.field557);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field582.put(var5.field557, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.i(III)F")
    public float method501(int arg0, int arg1) {
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
