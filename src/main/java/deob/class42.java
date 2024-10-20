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

    @ObfuscatedName("af.e")
    public boolean field556 = false;

    @ObfuscatedName("af.n")
    public boolean field545 = false;

    @ObfuscatedName("af.g")
    public class45 field547;

    @ObfuscatedName("af.y")
    public class287 field561;

    @ObfuscatedName("af.w")
    public HashMap field549;

    @ObfuscatedName("af.k")
    public class35[][] field548;

    @ObfuscatedName("af.v")
    public HashMap field551 = new HashMap();

    @ObfuscatedName("af.z")
    public class286[] field552;

    @ObfuscatedName("af.r")
    public final HashMap field553;

    @ObfuscatedName("af.u")
    public int field550;

    @ObfuscatedName("af.d")
    public int field555;

    @ObfuscatedName("af.o")
    public int field554;

    @ObfuscatedName("af.l")
    public int field557;

    public class42(class286[] arg0, HashMap arg1) {
        this.field552 = arg0;
        this.field553 = arg1;
    }

    @ObfuscatedName("af.e(Lit;Ljava/lang/String;ZI)V")
    public void method505(class237 arg0, String arg1, boolean arg2) {
        if (this.field545) {
            return;
        }
        this.field556 = false;
        this.field545 = true;
        System.nanoTime();
        int var4 = arg0.method3829(class41.field543.field541);
        int var5 = arg0.method3834(var4, arg1);
        class175 var6 = new class175(arg0.method3846(class41.field543.field541, arg1));
        class175 var7 = new class175(arg0.method3846(class41.field536.field541, arg1));
        class175 var8 = new class175(arg0.method3846(arg1, class41.field539.field541));
        System.nanoTime();
        System.nanoTime();
        this.field547 = new class45();
        try {
            this.field547.method544(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field547.method271();
        this.field547.method272();
        this.field547.method316();
        this.field550 = this.field547.method267() * 64;
        this.field555 = this.field547.method269() * 64;
        this.field554 = (this.field547.method268() - this.field547.method267() + 1) * 64;
        this.field557 = (this.field547.method315() - this.field547.method269() + 1) * 64;
        int var10 = this.field547.method268() - this.field547.method267() + 1;
        int var11 = this.field547.method315() - this.field547.method269() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field548 = new class35[var10][var11];
        Iterator var12 = this.field547.field581.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field412;
            int var15 = var13.field410;
            int var16 = var14 - this.field547.method267();
            int var17 = var15 - this.field547.method269();
            this.field548[var16][var17] = new class35(var14, var15, this.field547.method265(), this.field553);
            this.field548[var16][var17].method395(var13, this.field547.field579);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field548[var18][var19] == null) {
                    this.field548[var18][var19] = new class35(this.field547.method267() + var18, this.field547.method269() + var19, this.field547.method265(), this.field553);
                    this.field548[var18][var19].method344(this.field547.field578, this.field547.field579);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3835(class41.field537.field541, arg1)) {
            byte[] var20 = arg0.method3846(class41.field537.field541, arg1);
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
            this.field561 = var27;
        }
        System.nanoTime();
        this.field556 = true;
    }

    @ObfuscatedName("af.n(I)V")
    public final void method511() {
        this.field549 = null;
    }

    @ObfuscatedName("af.g(IIIIIIIII)V")
    public final void method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3743;
        int var10 = Statics.field3739;
        int var11 = Statics.field3741;
        int[] var12 = new int[4];
        class283.method4643(var12);
        class30 var13 = this.method498(arg0, arg1, arg2, arg3);
        float var14 = this.method491(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field551.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method589();
            this.field551.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field419; var18 < var13.field421 + var13.field419; var18++) {
            for (int var19 = var13.field429; var19 < var13.field429 + var13.field418; var19++) {
                this.method495(var18, var19, var17);
                this.field548[var18][var19].method329(var15, (class47) this.field551.get(var15), var17, this.field552);
            }
        }
        class283.method4639(var9, var10, var11);
        class283.method4718(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field550 + arg0;
        int var22 = this.field555 + arg1;
        for (int var23 = var13.field419; var23 < var13.field421 + var13.field419; var23++) {
            for (int var24 = var13.field429; var24 < var13.field429 + var13.field418; var24++) {
                this.field548[var23][var24].method324((this.field548[var23][var24].field485 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field548[var23][var24].field493 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("af.y(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method498(arg0, arg1, arg2, arg3);
        float var15 = this.method491(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field550 + arg0;
        int var18 = this.field555 + arg1;
        for (int var19 = var14.field419; var19 < var14.field421 + var14.field419; var19++) {
            for (int var20 = var14.field429; var20 < var14.field429 + var14.field418; var20++) {
                if (arg12) {
                    this.field548[var19][var20].method353();
                }
                this.field548[var19][var20].method330((this.field548[var19][var20].field485 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field548[var19][var20].field493 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field419; var21 < var14.field421 + var14.field419; var21++) {
            for (int var22 = var14.field429; var22 < var14.field429 + var14.field418; var22++) {
                this.field548[var21][var22].method331(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("af.w(II[Laz;B)V")
    public void method495(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field548.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field548[0].length - 1;
        if (var7) {
            arg2[class230.field3130.method6()] = null;
        } else {
            arg2[class230.field3130.method6()] = this.field548[arg0][arg1 + 1];
        }
        arg2[class230.field3132.method6()] = var7 || var5 ? null : this.field548[arg0 + 1][arg1 + 1];
        arg2[class230.field3125.method6()] = var7 || var4 ? null : this.field548[arg0 - 1][arg1 + 1];
        arg2[class230.field3131.method6()] = var5 ? null : this.field548[arg0 + 1][arg1];
        arg2[class230.field3126.method6()] = var4 ? null : this.field548[arg0 - 1][arg1];
        arg2[class230.field3128.method6()] = var6 ? null : this.field548[arg0][arg1 - 1];
        arg2[class230.field3127.method6()] = var6 || var5 ? null : this.field548[arg0 + 1][arg1 - 1];
        arg2[class230.field3133.method6()] = var6 || var4 ? null : this.field548[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("af.k(IIIILjava/util/HashSet;IIB)V")
    public void method496(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field561 == null) {
            return;
        }
        this.field561.method4768(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field549 == null) {
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
                var10 = (List) this.field549.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field531.field2588 - this.field550) * arg2 / this.field554;
                int var14 = arg3 - (var12.field531.field2591 - this.field555) * arg3 / this.field557;
                class283.method4647(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("af.v(IIIIIIIIIIB)Ljava/util/List;")
    public List method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field556) {
            return var11;
        }
        class30 var12 = this.method498(arg0, arg1, arg2, arg3);
        float var13 = this.method491(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field550 + arg0;
        int var16 = this.field555 + arg1;
        for (int var17 = var12.field419; var17 < var12.field421 + var12.field419; var17++) {
            for (int var18 = var12.field429; var18 < var12.field429 + var12.field418; var18++) {
                List var19 = this.field548[var17][var18].method360((this.field548[var17][var18].field485 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field548[var17][var18].field493 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("af.z(IIIII)Lah;")
    public class30 method498(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field550 + arg0;
        int var7 = this.field555 + arg1;
        int var8 = this.field550 + arg2;
        int var9 = this.field555 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field421 = var12 - var10 + 1;
        var5.field418 = var13 - var11 + 1;
        var5.field419 = var10 - this.field547.method267();
        var5.field429 = var11 - this.field547.method269();
        if (var5.field419 < 0) {
            var5.field421 += var5.field419;
            var5.field419 = 0;
        }
        if (var5.field419 > this.field548.length - var5.field421) {
            var5.field421 = this.field548.length - var5.field419;
        }
        if (var5.field429 < 0) {
            var5.field418 += var5.field429;
            var5.field429 = 0;
        }
        if (var5.field429 > this.field548[0].length - var5.field418) {
            var5.field418 = this.field548[0].length - var5.field429;
        }
        var5.field421 = Math.min(var5.field421, this.field548.length);
        var5.field418 = Math.min(var5.field418, this.field548[0].length);
        return var5;
    }

    @ObfuscatedName("af.r(B)Z")
    public boolean method499() {
        return this.field556;
    }

    @ObfuscatedName("af.u(I)Ljava/util/HashMap;")
    public HashMap method500() {
        this.method501();
        return this.field549;
    }

    @ObfuscatedName("af.d(B)V")
    public void method501() {
        if (this.field549 == null) {
            this.field549 = new HashMap();
        }
        this.field549.clear();
        for (int var1 = 0; var1 < this.field548.length; var1++) {
            for (int var2 = 0; var2 < this.field548[var1].length; var2++) {
                List var3 = this.field548[var1][var2].method361();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field549.containsKey(var5.field535)) {
                        List var7 = (List) this.field549.get(var5.field535);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field549.put(var5.field535, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.o(III)F")
    public float method491(int arg0, int arg1) {
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
