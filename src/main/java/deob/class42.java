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

@ObfuscatedName("ab")
public final class class42 {

    @ObfuscatedName("ab.e")
    public boolean field572 = false;

    @ObfuscatedName("ab.o")
    public boolean field555 = false;

    @ObfuscatedName("ab.m")
    public class45 field556;

    @ObfuscatedName("ab.g")
    public class286 field560;

    @ObfuscatedName("ab.d")
    public HashMap field558;

    @ObfuscatedName("ab.b")
    public class35[][] field559;

    @ObfuscatedName("ab.k")
    public HashMap field569 = new HashMap();

    @ObfuscatedName("ab.f")
    public class285[] field561;

    @ObfuscatedName("ab.j")
    public final HashMap field562;

    @ObfuscatedName("ab.q")
    public int field563;

    @ObfuscatedName("ab.h")
    public int field564;

    @ObfuscatedName("ab.i")
    public int field565;

    @ObfuscatedName("ab.s")
    public int field566;

    public class42(class285[] arg0, HashMap arg1) {
        this.field561 = arg0;
        this.field562 = arg1;
    }

    @ObfuscatedName("ab.e(Lin;Ljava/lang/String;ZB)V")
    public void method512(class236 arg0, String arg1, boolean arg2) {
        if (this.field555) {
            return;
        }
        this.field572 = false;
        this.field555 = true;
        System.nanoTime();
        int var4 = arg0.method3776(class41.field550.field548);
        int var5 = arg0.method3777(var4, arg1);
        class174 var6 = new class174(arg0.method3785(class41.field550.field548, arg1));
        class174 var7 = new class174(arg0.method3785(class41.field544.field548, arg1));
        class174 var8 = new class174(arg0.method3785(arg1, class41.field546.field548));
        System.nanoTime();
        System.nanoTime();
        this.field556 = new class45();
        try {
            this.field556.method547(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field556.method249();
        this.field556.method250();
        this.field556.method248();
        this.field563 = this.field556.method245() * 64;
        this.field564 = this.field556.method294() * 64;
        this.field565 = (this.field556.method246() - this.field556.method245() + 1) * 64;
        this.field566 = (this.field556.method244() - this.field556.method294() + 1) * 64;
        int var10 = this.field556.method246() - this.field556.method245() + 1;
        int var11 = this.field556.method244() - this.field556.method294() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field559 = new class35[var10][var11];
        Iterator var12 = this.field556.field587.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field417;
            int var15 = var13.field403;
            int var16 = var14 - this.field556.method245();
            int var17 = var15 - this.field556.method294();
            this.field559[var16][var17] = new class35(var14, var15, this.field556.method289(), this.field562);
            this.field559[var16][var17].method314(var13, this.field556.field583);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field559[var18][var19] == null) {
                    this.field559[var18][var19] = new class35(this.field556.method245() + var18, this.field556.method294() + var19, this.field556.method289(), this.field562);
                    this.field559[var18][var19].method399(this.field556.field582, this.field556.field583);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3778(class41.field545.field548, arg1)) {
            byte[] var20 = arg0.method3785(class41.field545.field548, arg1);
            Object var21 = null;
            class286 var27;
            label43: {
                try {
                    BufferedImage var22 = ImageIO.read(new ByteArrayInputStream(var20));
                    int var23 = var22.getWidth();
                    int var24 = var22.getHeight();
                    int[] var25 = new int[var23 * var24];
                    PixelGrabber var26 = new PixelGrabber(var22, 0, 0, var23, var24, var25, 0, var23);
                    var26.grabPixels();
                    var27 = new class286(var25, var23, var24);
                    break label43;
                } catch (IOException var31) {
                } catch (InterruptedException var32) {
                }
                var27 = new class286(0, 0);
            }
            this.field560 = var27;
        }
        System.nanoTime();
        this.field572 = true;
    }

    @ObfuscatedName("ab.o(I)V")
    public final void method496() {
        this.field558 = null;
    }

    @ObfuscatedName("ab.m(IIIIIIIII)V")
    public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3748;
        int var10 = Statics.field3753;
        int var11 = Statics.field3750;
        int[] var12 = new int[4];
        class282.method4651(var12);
        class30 var13 = this.method497(arg0, arg1, arg2, arg3);
        float var14 = this.method506(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field569.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method583();
            this.field569.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field427; var18 < var13.field427 + var13.field419; var18++) {
            for (int var19 = var13.field422; var19 < var13.field422 + var13.field420; var19++) {
                this.method527(var18, var19, var17);
                this.field559[var18][var19].method318(var15, (class47) this.field569.get(var15), var17, this.field561);
            }
        }
        class282.method4562(var9, var10, var11);
        class282.method4567(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field563 + arg0;
        int var22 = this.field564 + arg1;
        for (int var23 = var13.field427; var23 < var13.field427 + var13.field419; var23++) {
            for (int var24 = var13.field422; var24 < var13.field422 + var13.field420; var24++) {
                this.field559[var23][var24].method313((this.field559[var23][var24].field478 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field559[var23][var24].field495 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ab.g(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method497(arg0, arg1, arg2, arg3);
        float var15 = this.method506(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field563 + arg0;
        int var18 = this.field564 + arg1;
        for (int var19 = var14.field427; var19 < var14.field427 + var14.field419; var19++) {
            for (int var20 = var14.field422; var20 < var14.field422 + var14.field420; var20++) {
                if (arg12) {
                    this.field559[var19][var20].method449();
                }
                this.field559[var19][var20].method319((this.field559[var19][var20].field478 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field559[var19][var20].field495 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field427; var21 < var14.field427 + var14.field419; var21++) {
            for (int var22 = var14.field422; var22 < var14.field422 + var14.field420; var22++) {
                this.field559[var21][var22].method437(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ab.d(II[Lal;B)V")
    public void method527(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field559.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field559[0].length - 1;
        if (var7) {
            arg2[class229.field3131.method8()] = null;
        } else {
            arg2[class229.field3131.method8()] = this.field559[arg0][arg1 + 1];
        }
        arg2[class229.field3127.method8()] = var7 || var5 ? null : this.field559[arg0 + 1][arg1 + 1];
        arg2[class229.field3133.method8()] = var7 || var4 ? null : this.field559[arg0 - 1][arg1 + 1];
        arg2[class229.field3128.method8()] = var5 ? null : this.field559[arg0 + 1][arg1];
        arg2[class229.field3130.method8()] = var4 ? null : this.field559[arg0 - 1][arg1];
        arg2[class229.field3126.method8()] = var6 ? null : this.field559[arg0][arg1 - 1];
        arg2[class229.field3136.method8()] = var6 || var5 ? null : this.field559[arg0 + 1][arg1 - 1];
        arg2[class229.field3132.method8()] = var6 || var4 ? null : this.field559[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ab.b(IIIILjava/util/HashSet;IIB)V")
    public void method500(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field560 == null) {
            return;
        }
        this.field560.method4754(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field558 == null) {
            this.method532();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field558.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field532.field2595 - this.field563) * arg2 / this.field565;
                int var14 = arg3 - (var12.field532.field2597 - this.field564) * arg3 / this.field566;
                class282.method4596(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ab.k(IIIIIIIIIIB)Ljava/util/List;")
    public List method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field572) {
            return var11;
        }
        class30 var12 = this.method497(arg0, arg1, arg2, arg3);
        float var13 = this.method506(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field563 + arg0;
        int var16 = this.field564 + arg1;
        for (int var17 = var12.field427; var17 < var12.field427 + var12.field419; var17++) {
            for (int var18 = var12.field422; var18 < var12.field422 + var12.field420; var18++) {
                List var19 = this.field559[var17][var18].method349((this.field559[var17][var18].field478 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field559[var17][var18].field495 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ab.q(IIIII)Lae;")
    public class30 method497(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field563 + arg0;
        int var7 = this.field564 + arg1;
        int var8 = this.field563 + arg2;
        int var9 = this.field564 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field419 = var12 - var10 + 1;
        var5.field420 = var13 - var11 + 1;
        var5.field427 = var10 - this.field556.method245();
        var5.field422 = var11 - this.field556.method294();
        if (var5.field427 < 0) {
            var5.field419 += var5.field427;
            var5.field427 = 0;
        }
        if (var5.field427 > this.field559.length - var5.field419) {
            var5.field419 = this.field559.length - var5.field427;
        }
        if (var5.field422 < 0) {
            var5.field420 += var5.field422;
            var5.field422 = 0;
        }
        if (var5.field422 > this.field559[0].length - var5.field420) {
            var5.field420 = this.field559[0].length - var5.field422;
        }
        var5.field419 = Math.min(var5.field419, this.field559.length);
        var5.field420 = Math.min(var5.field420, this.field559[0].length);
        return var5;
    }

    @ObfuscatedName("ab.h(I)Z")
    public boolean method503() {
        return this.field572;
    }

    @ObfuscatedName("ab.i(I)Ljava/util/HashMap;")
    public HashMap method504() {
        this.method532();
        return this.field558;
    }

    @ObfuscatedName("ab.s(B)V")
    public void method532() {
        if (this.field558 == null) {
            this.field558 = new HashMap();
        }
        this.field558.clear();
        for (int var1 = 0; var1 < this.field559.length; var1++) {
            for (int var2 = 0; var2 < this.field559[var1].length; var2++) {
                List var3 = this.field559[var1][var2].method350();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field558.containsKey(var5.field535)) {
                        List var7 = (List) this.field558.get(var5.field535);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field558.put(var5.field535, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.n(III)F")
    public float method506(int arg0, int arg1) {
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
