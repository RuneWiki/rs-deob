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

@ObfuscatedName("ax")
public final class class42 {

    @ObfuscatedName("ax.n")
    public boolean field565 = false;

    @ObfuscatedName("ax.p")
    public boolean field551 = false;

    @ObfuscatedName("ax.i")
    public class45 field550;

    @ObfuscatedName("ax.j")
    public class286 field553;

    @ObfuscatedName("ax.f")
    public HashMap field554;

    @ObfuscatedName("ax.m")
    public class35[][] field555;

    @ObfuscatedName("ax.c")
    public HashMap field562 = new HashMap();

    @ObfuscatedName("ax.z")
    public class285[] field556;

    @ObfuscatedName("ax.h")
    public final HashMap field558;

    @ObfuscatedName("ax.g")
    public int field559;

    @ObfuscatedName("ax.e")
    public int field552;

    @ObfuscatedName("ax.o")
    public int field561;

    @ObfuscatedName("ax.x")
    public int field557;

    public class42(class285[] arg0, HashMap arg1) {
        this.field556 = arg0;
        this.field558 = arg1;
    }

    @ObfuscatedName("ax.n(Lis;Ljava/lang/String;ZI)V")
    public void method497(class236 arg0, String arg1, boolean arg2) {
        if (this.field551) {
            return;
        }
        this.field565 = false;
        this.field551 = true;
        System.nanoTime();
        int var4 = arg0.method3846(class41.field541.field544);
        int var5 = arg0.method3914(var4, arg1);
        class174 var6 = new class174(arg0.method3849(class41.field541.field544, arg1));
        class174 var7 = new class174(arg0.method3849(class41.field545.field544, arg1));
        class174 var8 = new class174(arg0.method3849(arg1, class41.field543.field544));
        System.nanoTime();
        System.nanoTime();
        this.field550 = new class45();
        try {
            this.field550.method540(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field550.method288();
        this.field550.method274();
        this.field550.method275();
        this.field559 = this.field550.method269() * 64;
        this.field552 = this.field550.method297() * 64;
        this.field561 = (this.field550.method289() - this.field550.method269() + 1) * 64;
        this.field557 = (this.field550.method272() - this.field550.method297() + 1) * 64;
        int var10 = this.field550.method289() - this.field550.method269() + 1;
        int var11 = this.field550.method272() - this.field550.method297() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field555 = new class35[var10][var11];
        Iterator var12 = this.field550.field577.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field412;
            int var15 = var13.field411;
            int var16 = var14 - this.field550.method269();
            int var17 = var15 - this.field550.method297();
            this.field555[var16][var17] = new class35(var14, var15, this.field550.method267(), this.field558);
            this.field555[var16][var17].method370(var13, this.field550.field576);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field555[var18][var19] == null) {
                    this.field555[var18][var19] = new class35(this.field550.method269() + var18, this.field550.method297() + var19, this.field550.method267(), this.field558);
                    this.field555[var18][var19].method327(this.field550.field575, this.field550.field576);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3898(class41.field542.field544, arg1)) {
            byte[] var20 = arg0.method3849(class41.field542.field544, arg1);
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
            this.field553 = var27;
        }
        System.nanoTime();
        this.field565 = true;
    }

    @ObfuscatedName("ax.p(B)V")
    public final void method514() {
        this.field554 = null;
    }

    @ObfuscatedName("ax.i(IIIIIIIIB)V")
    public final void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3753;
        int var10 = Statics.field3754;
        int var11 = Statics.field3758;
        int[] var12 = new int[4];
        class282.method4645(var12);
        class30 var13 = this.method503(arg0, arg1, arg2, arg3);
        float var14 = this.method507(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field562.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method582();
            this.field562.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field424; var18 < var13.field426 + var13.field424; var18++) {
            for (int var19 = var13.field425; var19 < var13.field429 + var13.field425; var19++) {
                this.method501(var18, var19, var17);
                this.field555[var18][var19].method330(var15, (class47) this.field562.get(var15), var17, this.field556);
            }
        }
        class282.method4673(var9, var10, var11);
        class282.method4730(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field559 + arg0;
        int var22 = this.field552 + arg1;
        for (int var23 = var13.field424; var23 < var13.field426 + var13.field424; var23++) {
            for (int var24 = var13.field425; var24 < var13.field429 + var13.field425; var24++) {
                this.field555[var23][var24].method325((this.field555[var23][var24].field483 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field555[var23][var24].field496 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ax.j(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method503(arg0, arg1, arg2, arg3);
        float var15 = this.method507(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field559 + arg0;
        int var18 = this.field552 + arg1;
        for (int var19 = var14.field424; var19 < var14.field426 + var14.field424; var19++) {
            for (int var20 = var14.field425; var20 < var14.field429 + var14.field425; var20++) {
                if (arg12) {
                    this.field555[var19][var20].method354();
                }
                this.field555[var19][var20].method417((this.field555[var19][var20].field483 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field555[var19][var20].field496 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field424; var21 < var14.field426 + var14.field424; var21++) {
            for (int var22 = var14.field425; var22 < var14.field429 + var14.field425; var22++) {
                this.field555[var21][var22].method332(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ax.f(II[Lau;I)V")
    public void method501(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field555.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field555[0].length - 1;
        if (var7) {
            arg2[class229.field3153.method14()] = null;
        } else {
            arg2[class229.field3153.method14()] = this.field555[arg0][arg1 + 1];
        }
        arg2[class229.field3161.method14()] = var7 || var5 ? null : this.field555[arg0 + 1][arg1 + 1];
        arg2[class229.field3157.method14()] = var7 || var4 ? null : this.field555[arg0 - 1][arg1 + 1];
        arg2[class229.field3158.method14()] = var5 ? null : this.field555[arg0 + 1][arg1];
        arg2[class229.field3156.method14()] = var4 ? null : this.field555[arg0 - 1][arg1];
        arg2[class229.field3154.method14()] = var6 ? null : this.field555[arg0][arg1 - 1];
        arg2[class229.field3152.method14()] = var6 || var5 ? null : this.field555[arg0 + 1][arg1 - 1];
        arg2[class229.field3155.method14()] = var6 || var4 ? null : this.field555[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ax.m(IIIILjava/util/HashSet;III)V")
    public void method512(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field553 == null) {
            return;
        }
        this.field553.method4772(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field554 == null) {
            this.method506();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field554.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field528.field2621 - this.field559) * arg2 / this.field561;
                int var14 = arg3 - (var12.field528.field2618 - this.field552) * arg3 / this.field557;
                class282.method4649(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ax.c(IIIIIIIIIIB)Ljava/util/List;")
    public List method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field565) {
            return var11;
        }
        class30 var12 = this.method503(arg0, arg1, arg2, arg3);
        float var13 = this.method507(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field559 + arg0;
        int var16 = this.field552 + arg1;
        for (int var17 = var12.field424; var17 < var12.field426 + var12.field424; var17++) {
            for (int var18 = var12.field425; var18 < var12.field429 + var12.field425; var18++) {
                List var19 = this.field555[var17][var18].method361((this.field555[var17][var18].field483 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field555[var17][var18].field496 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ax.z(IIIII)Laa;")
    public class30 method503(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field559 + arg0;
        int var7 = this.field552 + arg1;
        int var8 = this.field559 + arg2;
        int var9 = this.field552 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field426 = var12 - var10 + 1;
        var5.field429 = var13 - var11 + 1;
        var5.field424 = var10 - this.field550.method269();
        var5.field425 = var11 - this.field550.method297();
        if (var5.field424 < 0) {
            var5.field426 += var5.field424;
            var5.field424 = 0;
        }
        if (var5.field424 > this.field555.length - var5.field426) {
            var5.field426 = this.field555.length - var5.field424;
        }
        if (var5.field425 < 0) {
            var5.field429 += var5.field425;
            var5.field425 = 0;
        }
        if (var5.field425 > this.field555[0].length - var5.field429) {
            var5.field429 = this.field555[0].length - var5.field425;
        }
        var5.field426 = Math.min(var5.field426, this.field555.length);
        var5.field429 = Math.min(var5.field429, this.field555[0].length);
        return var5;
    }

    @ObfuscatedName("ax.h(B)Z")
    public boolean method496() {
        return this.field565;
    }

    @ObfuscatedName("ax.g(I)Ljava/util/HashMap;")
    public HashMap method504() {
        this.method506();
        return this.field554;
    }

    @ObfuscatedName("ax.e(I)V")
    public void method506() {
        if (this.field554 == null) {
            this.field554 = new HashMap();
        }
        this.field554.clear();
        for (int var1 = 0; var1 < this.field555.length; var1++) {
            for (int var2 = 0; var2 < this.field555[var1].length; var2++) {
                List var3 = this.field555[var1][var2].method362();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field554.containsKey(var5.field539)) {
                        List var7 = (List) this.field554.get(var5.field539);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field554.put(var5.field539, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.o(III)F")
    public float method507(int arg0, int arg1) {
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
