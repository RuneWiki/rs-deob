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

@ObfuscatedName("ag")
public final class class43 {

    @ObfuscatedName("ag.t")
    public boolean field536 = false;

    @ObfuscatedName("ag.q")
    public boolean field530 = false;

    @ObfuscatedName("ag.i")
    public class46 field542;

    @ObfuscatedName("ag.a")
    public class332 field533;

    @ObfuscatedName("ag.l")
    public HashMap field537;

    @ObfuscatedName("ag.b")
    public class36[][] field534;

    @ObfuscatedName("ag.e")
    public HashMap field535 = new HashMap();

    @ObfuscatedName("ag.x")
    public class331[] field529;

    @ObfuscatedName("ag.p")
    public final HashMap field541;

    @ObfuscatedName("ag.g")
    public int field531;

    @ObfuscatedName("ag.n")
    public int field539;

    @ObfuscatedName("ag.o")
    public int field540;

    @ObfuscatedName("ag.c")
    public int field538;

    @ObfuscatedName("ag.v")
    public int field532 = 0;

    public class43(class331[] arg0, HashMap arg1) {
        this.field529 = arg0;
        this.field541 = arg1;
    }

    @ObfuscatedName("ag.t(Ljc;Ljava/lang/String;ZI)V")
    public void method533(class262 arg0, String arg1, boolean arg2) {
        if (this.field530) {
            return;
        }
        this.field536 = false;
        this.field530 = true;
        System.nanoTime();
        int var4 = arg0.method4210(class42.field526.field527);
        int var5 = arg0.method4211(var4, arg1);
        class195 var6 = new class195(arg0.method4213(class42.field526.field527, arg1));
        class195 var7 = new class195(arg0.method4213(class42.field523.field527, arg1));
        class195 var8 = new class195(arg0.method4213(arg1, class42.field525.field527));
        System.nanoTime();
        System.nanoTime();
        this.field542 = new class46();
        try {
            this.field542.method595(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field542.method268();
        this.field542.method269();
        this.field542.method270();
        this.field531 = this.field542.method264() * 64;
        this.field539 = this.field542.method266() * 64;
        this.field540 = (this.field542.method265() - this.field542.method264() + 1) * 64;
        this.field538 = (this.field542.method267() - this.field542.method266() + 1) * 64;
        int var10 = this.field542.method265() - this.field542.method264() + 1;
        int var11 = this.field542.method267() - this.field542.method266() + 1;
        System.nanoTime();
        System.nanoTime();
        class36.field458.method3645();
        class36.field463.method3645();
        this.field534 = new class36[var10][var11];
        Iterator var12 = this.field542.field557.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field380;
            int var15 = var13.field379;
            int var16 = var14 - this.field542.method264();
            int var17 = var15 - this.field542.method266();
            this.field534[var16][var17] = new class36(var14, var15, this.field542.method263(), this.field541);
            this.field534[var16][var17].method424(var13, this.field542.field555);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field534[var18][var19] == null) {
                    this.field534[var18][var19] = new class36(this.field542.method264() + var18, this.field542.method266() + var19, this.field542.method263(), this.field541);
                    this.field534[var18][var19].method412(this.field542.field556, this.field542.field555);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4212(class42.field528.field527, arg1)) {
            byte[] var20 = arg0.method4213(class42.field528.field527, arg1);
            Object var21 = null;
            class332 var27;
            label43: {
                try {
                    BufferedImage var22 = ImageIO.read(new ByteArrayInputStream(var20));
                    int var23 = var22.getWidth();
                    int var24 = var22.getHeight();
                    int[] var25 = new int[var23 * var24];
                    PixelGrabber var26 = new PixelGrabber(var22, 0, 0, var23, var24, var25, 0, var23);
                    var26.grabPixels();
                    var27 = new class332(var25, var23, var24);
                    break label43;
                } catch (IOException var31) {
                } catch (InterruptedException var32) {
                }
                var27 = new class332(0, 0);
            }
            this.field533 = var27;
        }
        System.nanoTime();
        arg0.method4264();
        arg0.method4208();
        this.field536 = true;
    }

    @ObfuscatedName("ag.q(B)V")
    public final void method567() {
        this.field537 = null;
    }

    @ObfuscatedName("ag.i(IIIIIIIII)V")
    public final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3964;
        int var10 = Statics.field3959;
        int var11 = Statics.field3958;
        int[] var12 = new int[4];
        class328.method5269(var12);
        class30 var13 = this.method540(arg0, arg1, arg2, arg3);
        float var14 = this.method544(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field532 = var15;
        if (!this.field535.containsKey(var15)) {
            class48 var16 = new class48(var15);
            var16.method635();
            this.field535.put(var15, var16);
        }
        class36[] var17 = new class36[8];
        for (int var18 = var13.field403; var18 < var13.field403 + var13.field395; var18++) {
            for (int var19 = var13.field394; var19 < var13.field394 + var13.field392; var19++) {
                this.method537(var18, var19, var17);
                this.field534[var18][var19].method349(var15, (class48) this.field535.get(var15), var17, this.field529);
            }
        }
        class328.method5265(var9, var10, var11);
        class328.method5264(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field531 + arg0;
        int var22 = this.field539 + arg1;
        for (int var23 = var13.field403; var23 < var13.field403 + var13.field395; var23++) {
            for (int var24 = var13.field394; var24 < var13.field394 + var13.field392; var24++) {
                this.field534[var23][var24].method404((this.field534[var23][var24].field460 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field534[var23][var24].field461 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ag.a(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method540(arg0, arg1, arg2, arg3);
        float var15 = this.method544(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field531 + arg0;
        int var18 = this.field539 + arg1;
        for (int var19 = var14.field403; var19 < var14.field403 + var14.field395; var19++) {
            for (int var20 = var14.field394; var20 < var14.field394 + var14.field392; var20++) {
                if (arg12) {
                    this.field534[var19][var20].method400();
                }
                this.field534[var19][var20].method354((this.field534[var19][var20].field460 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field534[var19][var20].field461 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field403; var21 < var14.field403 + var14.field395; var21++) {
            for (int var22 = var14.field394; var22 < var14.field394 + var14.field392; var22++) {
                this.field534[var21][var22].method355(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ag.l(II[Lau;B)V")
    public void method537(int arg0, int arg1, class36[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field534.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field534[0].length - 1;
        if (var7) {
            arg2[class255.field3327.method12()] = null;
        } else {
            arg2[class255.field3327.method12()] = this.field534[arg0][arg1 + 1];
        }
        arg2[class255.field3321.method12()] = var7 || var5 ? null : this.field534[arg0 + 1][arg1 + 1];
        arg2[class255.field3328.method12()] = var7 || var4 ? null : this.field534[arg0 - 1][arg1 + 1];
        arg2[class255.field3322.method12()] = var5 ? null : this.field534[arg0 + 1][arg1];
        arg2[class255.field3326.method12()] = var4 ? null : this.field534[arg0 - 1][arg1];
        arg2[class255.field3324.method12()] = var6 ? null : this.field534[arg0][arg1 - 1];
        arg2[class255.field3323.method12()] = var6 || var5 ? null : this.field534[arg0 + 1][arg1 - 1];
        arg2[class255.field3320.method12()] = var6 || var4 ? null : this.field534[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ag.b(IIIILjava/util/HashSet;III)V")
    public void method554(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field533 == null) {
            return;
        }
        this.field533.method5400(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field537 == null) {
            this.method543();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field537.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class41 var12 = (class41) var11.next();
                int var13 = (var12.field511.field2777 - this.field531) * arg2 / this.field540;
                int var14 = arg3 - (var12.field511.field2776 - this.field539) * arg3 / this.field538;
                class328.method5286(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ag.e(IIIIIIIIIII)Ljava/util/List;")
    public List method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field536) {
            return var11;
        }
        class30 var12 = this.method540(arg0, arg1, arg2, arg3);
        float var13 = this.method544(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field531 + arg0;
        int var16 = this.field539 + arg1;
        for (int var17 = var12.field403; var17 < var12.field403 + var12.field395; var17++) {
            for (int var18 = var12.field394; var18 < var12.field394 + var12.field392; var18++) {
                List var19 = this.field534[var17][var18].method383((this.field534[var17][var18].field460 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field534[var17][var18].field461 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ag.x(IIIII)Laj;")
    public class30 method540(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field531 + arg0;
        int var7 = this.field539 + arg1;
        int var8 = this.field531 + arg2;
        int var9 = this.field539 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field395 = var12 - var10 + 1;
        var5.field392 = var13 - var11 + 1;
        var5.field403 = var10 - this.field542.method264();
        var5.field394 = var11 - this.field542.method266();
        if (var5.field403 < 0) {
            var5.field395 += var5.field403;
            var5.field403 = 0;
        }
        if (var5.field403 > this.field534.length - var5.field395) {
            var5.field395 = this.field534.length - var5.field403;
        }
        if (var5.field394 < 0) {
            var5.field392 += var5.field394;
            var5.field394 = 0;
        }
        if (var5.field394 > this.field534[0].length - var5.field392) {
            var5.field392 = this.field534[0].length - var5.field394;
        }
        var5.field395 = Math.min(var5.field395, this.field534.length);
        var5.field392 = Math.min(var5.field392, this.field534[0].length);
        return var5;
    }

    @ObfuscatedName("ag.p(B)Z")
    public boolean method541() {
        return this.field536;
    }

    @ObfuscatedName("ag.o(I)Ljava/util/HashMap;")
    public HashMap method534() {
        this.method543();
        return this.field537;
    }

    @ObfuscatedName("ag.c(I)V")
    public void method543() {
        if (this.field537 == null) {
            this.field537 = new HashMap();
        }
        this.field537.clear();
        for (int var1 = 0; var1 < this.field534.length; var1++) {
            for (int var2 = 0; var2 < this.field534[var1].length; var2++) {
                List var3 = this.field534[var1][var2].method388();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class41 var5 = (class41) var4.next();
                    if (this.field537.containsKey(var5.field515)) {
                        List var7 = (List) this.field537.get(var5.field515);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field537.put(var5.field515, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.u(III)F")
    public float method544(int arg0, int arg1) {
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
