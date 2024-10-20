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

@ObfuscatedName("ae")
public final class class42 {

    @ObfuscatedName("ae.c")
    public boolean field569 = false;

    @ObfuscatedName("ae.o")
    public boolean field554 = false;

    @ObfuscatedName("ae.i")
    public class45 field555;

    @ObfuscatedName("ae.u")
    public class286 field568;

    @ObfuscatedName("ae.g")
    public HashMap field556;

    @ObfuscatedName("ae.m")
    public class35[][] field558;

    @ObfuscatedName("ae.s")
    public HashMap field559 = new HashMap();

    @ObfuscatedName("ae.x")
    public class285[] field563;

    @ObfuscatedName("ae.p")
    public final HashMap field561;

    @ObfuscatedName("ae.k")
    public int field562;

    @ObfuscatedName("ae.r")
    public int field557;

    @ObfuscatedName("ae.w")
    public int field564;

    @ObfuscatedName("ae.v")
    public int field560;

    public class42(class285[] arg0, HashMap arg1) {
        this.field563 = arg0;
        this.field561 = arg1;
    }

    @ObfuscatedName("ae.c(Lip;Ljava/lang/String;ZI)V")
    public void method480(class236 arg0, String arg1, boolean arg2) {
        if (this.field554) {
            return;
        }
        this.field569 = false;
        this.field554 = true;
        System.nanoTime();
        int var4 = arg0.method3730(class41.field541.field550);
        int var5 = arg0.method3731(var4, arg1);
        class174 var6 = new class174(arg0.method3733(class41.field541.field550, arg1));
        class174 var7 = new class174(arg0.method3733(class41.field542.field550, arg1));
        class174 var8 = new class174(arg0.method3733(arg1, class41.field546.field550));
        System.nanoTime();
        System.nanoTime();
        this.field555 = new class45();
        try {
            this.field555.method525(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field555.method259();
        this.field555.method260();
        this.field555.method242();
        this.field562 = this.field555.method255() * 64;
        this.field557 = this.field555.method258() * 64;
        this.field564 = (this.field555.method241() - this.field555.method255() + 1) * 64;
        this.field560 = (this.field555.method274() - this.field555.method258() + 1) * 64;
        int var10 = this.field555.method241() - this.field555.method255() + 1;
        int var11 = this.field555.method274() - this.field555.method258() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field558 = new class35[var10][var11];
        Iterator var12 = this.field555.field578.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field404;
            int var15 = var13.field394;
            int var16 = var14 - this.field555.method255();
            int var17 = var15 - this.field555.method258();
            this.field558[var16][var17] = new class35(var14, var15, this.field555.method306(), this.field561);
            this.field558[var16][var17].method319(var13, this.field555.field579);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field558[var18][var19] == null) {
                    this.field558[var18][var19] = new class35(this.field555.method255() + var18, this.field555.method258() + var19, this.field555.method306(), this.field561);
                    this.field558[var18][var19].method345(this.field555.field581, this.field555.field579);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3732(class41.field543.field550, arg1)) {
            byte[] var20 = arg0.method3733(class41.field543.field550, arg1);
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
            this.field568 = var27;
        }
        System.nanoTime();
        this.field569 = true;
    }

    @ObfuscatedName("ae.o(I)V")
    public final void method481() {
        this.field556 = null;
    }

    @ObfuscatedName("ae.i(IIIIIIIII)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3746;
        int var10 = Statics.field3741;
        int var11 = Statics.field3743;
        int[] var12 = new int[4];
        class282.method4517(var12);
        class30 var13 = this.method494(arg0, arg1, arg2, arg3);
        float var14 = this.method487(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field559.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method577();
            this.field559.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field409; var18 < var13.field409 + var13.field408; var18++) {
            for (int var19 = var13.field407; var19 < var13.field410 + var13.field407; var19++) {
                this.method484(var18, var19, var17);
                this.field558[var18][var19].method323(var15, (class47) this.field559.get(var15), var17, this.field563);
            }
        }
        class282.method4520(var9, var10, var11);
        class282.method4549(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field562 + arg0;
        int var22 = this.field557 + arg1;
        for (int var23 = var13.field409; var23 < var13.field409 + var13.field408; var23++) {
            for (int var24 = var13.field407; var24 < var13.field410 + var13.field407; var24++) {
                this.field558[var23][var24].method386((this.field558[var23][var24].field465 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field558[var23][var24].field466 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ae.u(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method494(arg0, arg1, arg2, arg3);
        float var15 = this.method487(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field562 + arg0;
        int var18 = this.field557 + arg1;
        for (int var19 = var14.field409; var19 < var14.field409 + var14.field408; var19++) {
            for (int var20 = var14.field407; var20 < var14.field410 + var14.field407; var20++) {
                if (arg12) {
                    this.field558[var19][var20].method347();
                }
                this.field558[var19][var20].method324((this.field558[var19][var20].field465 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field558[var19][var20].field466 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field409; var21 < var14.field409 + var14.field408; var21++) {
            for (int var22 = var14.field407; var22 < var14.field410 + var14.field407; var22++) {
                this.field558[var21][var22].method372(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ae.g(II[Lak;S)V")
    public void method484(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field558.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field558[0].length - 1;
        if (var7) {
            arg2[class229.field3132.method13()] = null;
        } else {
            arg2[class229.field3132.method13()] = this.field558[arg0][arg1 + 1];
        }
        arg2[class229.field3122.method13()] = var7 || var5 ? null : this.field558[arg0 + 1][arg1 + 1];
        arg2[class229.field3127.method13()] = var7 || var4 ? null : this.field558[arg0 - 1][arg1 + 1];
        arg2[class229.field3123.method13()] = var5 ? null : this.field558[arg0 + 1][arg1];
        arg2[class229.field3129.method13()] = var4 ? null : this.field558[arg0 - 1][arg1];
        arg2[class229.field3121.method13()] = var6 ? null : this.field558[arg0][arg1 - 1];
        arg2[class229.field3125.method13()] = var6 || var5 ? null : this.field558[arg0 + 1][arg1 - 1];
        arg2[class229.field3126.method13()] = var6 || var4 ? null : this.field558[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ae.m(IIIILjava/util/HashSet;III)V")
    public void method506(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field568 == null) {
            return;
        }
        this.field568.method4633(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field556 == null) {
            this.method509();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field556.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field538.field2579 - this.field562) * arg2 / this.field564;
                int var14 = arg3 - (var12.field538.field2578 - this.field557) * arg3 / this.field560;
                class282.method4508(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ae.s(IIIIIIIIIII)Ljava/util/List;")
    public List method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field569) {
            return var11;
        }
        class30 var12 = this.method494(arg0, arg1, arg2, arg3);
        float var13 = this.method487(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field562 + arg0;
        int var16 = this.field557 + arg1;
        for (int var17 = var12.field409; var17 < var12.field409 + var12.field408; var17++) {
            for (int var18 = var12.field407; var18 < var12.field410 + var12.field407; var18++) {
                List var19 = this.field558[var17][var18].method406((this.field558[var17][var18].field465 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field558[var17][var18].field466 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ae.x(IIIIB)Lag;")
    public class30 method494(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field562 + arg0;
        int var7 = this.field557 + arg1;
        int var8 = this.field562 + arg2;
        int var9 = this.field557 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field408 = var12 - var10 + 1;
        var5.field410 = var13 - var11 + 1;
        var5.field409 = var10 - this.field555.method255();
        var5.field407 = var11 - this.field555.method258();
        if (var5.field409 < 0) {
            var5.field408 += var5.field409;
            var5.field409 = 0;
        }
        if (var5.field409 > this.field558.length - var5.field408) {
            var5.field408 = this.field558.length - var5.field409;
        }
        if (var5.field407 < 0) {
            var5.field410 += var5.field407;
            var5.field407 = 0;
        }
        if (var5.field407 > this.field558[0].length - var5.field410) {
            var5.field410 = this.field558[0].length - var5.field407;
        }
        var5.field408 = Math.min(var5.field408, this.field558.length);
        var5.field410 = Math.min(var5.field410, this.field558[0].length);
        return var5;
    }

    @ObfuscatedName("ae.p(I)Z")
    public boolean method488() {
        return this.field569;
    }

    @ObfuscatedName("ae.k(S)Ljava/util/HashMap;")
    public HashMap method489() {
        this.method509();
        return this.field556;
    }

    @ObfuscatedName("ae.r(I)V")
    public void method509() {
        if (this.field556 == null) {
            this.field556 = new HashMap();
        }
        this.field556.clear();
        for (int var1 = 0; var1 < this.field558.length; var1++) {
            for (int var2 = 0; var2 < this.field558[var1].length; var2++) {
                List var3 = this.field558[var1][var2].method355();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field556.containsKey(var5.field532)) {
                        List var7 = (List) this.field556.get(var5.field532);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field556.put(var5.field532, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.w(III)F")
    public float method487(int arg0, int arg1) {
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
