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

    @ObfuscatedName("ag.c")
    public boolean field540 = false;

    @ObfuscatedName("ag.i")
    public boolean field524 = false;

    @ObfuscatedName("ag.o")
    public class46 field525;

    @ObfuscatedName("ag.j")
    public class332 field535;

    @ObfuscatedName("ag.k")
    public HashMap field527;

    @ObfuscatedName("ag.x")
    public class36[][] field528;

    @ObfuscatedName("ag.z")
    public HashMap field529 = new HashMap();

    @ObfuscatedName("ag.p")
    public class331[] field530;

    @ObfuscatedName("ag.w")
    public final HashMap field523;

    @ObfuscatedName("ag.r")
    public int field532;

    @ObfuscatedName("ag.d")
    public int field526;

    @ObfuscatedName("ag.a")
    public int field537;

    @ObfuscatedName("ag.e")
    public int field539;

    @ObfuscatedName("ag.f")
    public int field536 = 0;

    public class43(class331[] arg0, HashMap arg1) {
        this.field530 = arg0;
        this.field523 = arg1;
    }

    @ObfuscatedName("ag.c(Ljm;Ljava/lang/String;ZI)V")
    public void method521(class262 arg0, String arg1, boolean arg2) {
        if (this.field524) {
            return;
        }
        this.field540 = false;
        this.field524 = true;
        System.nanoTime();
        int var4 = arg0.method4245(class42.field516.field514);
        int var5 = arg0.method4207(var4, arg1);
        class195 var6 = new class195(arg0.method4211(class42.field516.field514, arg1));
        class195 var7 = new class195(arg0.method4211(class42.field515.field514, arg1));
        class195 var8 = new class195(arg0.method4211(arg1, class42.field517.field514));
        System.nanoTime();
        System.nanoTime();
        this.field525 = new class46();
        try {
            this.field525.method581(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field525.method286();
        this.field525.method287();
        this.field525.method288();
        this.field532 = this.field525.method282() * 64;
        this.field526 = this.field525.method337() * 64;
        this.field537 = (this.field525.method283() - this.field525.method282() + 1) * 64;
        this.field539 = (this.field525.method277() - this.field525.method337() + 1) * 64;
        int var10 = this.field525.method283() - this.field525.method282() + 1;
        int var11 = this.field525.method277() - this.field525.method337() + 1;
        System.nanoTime();
        System.nanoTime();
        class36.method51();
        this.field528 = new class36[var10][var11];
        Iterator var12 = this.field525.field558.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field391;
            int var15 = var13.field388;
            int var16 = var14 - this.field525.method282();
            int var17 = var15 - this.field525.method337();
            this.field528[var16][var17] = new class36(var14, var15, this.field525.method280(), this.field523);
            this.field528[var16][var17].method472(var13, this.field525.field556);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field528[var18][var19] == null) {
                    this.field528[var18][var19] = new class36(this.field525.method282() + var18, this.field525.method337() + var19, this.field525.method280(), this.field523);
                    this.field528[var18][var19].method356(this.field525.field555, this.field525.field556);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4210(class42.field518.field514, arg1)) {
            byte[] var20 = arg0.method4211(class42.field518.field514, arg1);
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
            this.field535 = var27;
        }
        System.nanoTime();
        arg0.method4195();
        arg0.method4206();
        this.field540 = true;
    }

    @ObfuscatedName("ag.i(I)V")
    public final void method560() {
        this.field527 = null;
    }

    @ObfuscatedName("ag.o(IIIIIIIIB)V")
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3959;
        int var10 = Statics.field3955;
        int var11 = Statics.field3958;
        int[] var12 = new int[4];
        class328.method5353(var12);
        class30 var13 = this.method528(arg0, arg1, arg2, arg3);
        float var14 = this.method532(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field536 = var15;
        if (!this.field529.containsKey(var15)) {
            class48 var16 = new class48(var15);
            var16.method658();
            this.field529.put(var15, var16);
        }
        class36[] var17 = new class36[8];
        for (int var18 = var13.field404; var18 < var13.field404 + var13.field401; var18++) {
            for (int var19 = var13.field403; var19 < var13.field403 + var13.field402; var19++) {
                this.method525(var18, var19, var17);
                this.field528[var18][var19].method359(var15, (class48) this.field529.get(var15), var17, this.field530);
            }
        }
        class328.method5313(var9, var10, var11);
        class328.method5318(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field532 + arg0;
        int var22 = this.field526 + arg1;
        for (int var23 = var13.field404; var23 < var13.field404 + var13.field401; var23++) {
            for (int var24 = var13.field403; var24 < var13.field403 + var13.field402; var24++) {
                this.field528[var23][var24].method354((this.field528[var23][var24].field460 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field528[var23][var24].field457 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("ag.j(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method528(arg0, arg1, arg2, arg3);
        float var15 = this.method532(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field532 + arg0;
        int var18 = this.field526 + arg1;
        for (int var19 = var14.field404; var19 < var14.field404 + var14.field401; var19++) {
            for (int var20 = var14.field403; var20 < var14.field403 + var14.field402; var20++) {
                if (arg12) {
                    this.field528[var19][var20].method406();
                }
                this.field528[var19][var20].method378((this.field528[var19][var20].field460 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field528[var19][var20].field457 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field404; var21 < var14.field404 + var14.field401; var21++) {
            for (int var22 = var14.field403; var22 < var14.field403 + var14.field402; var22++) {
                this.field528[var21][var22].method361(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ag.k(II[Lao;I)V")
    public void method525(int arg0, int arg1, class36[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field528.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field528[0].length - 1;
        if (var7) {
            arg2[class255.field3317.method8()] = null;
        } else {
            arg2[class255.field3317.method8()] = this.field528[arg0][arg1 + 1];
        }
        arg2[class255.field3313.method8()] = var7 || var5 ? null : this.field528[arg0 + 1][arg1 + 1];
        arg2[class255.field3319.method8()] = var7 || var4 ? null : this.field528[arg0 - 1][arg1 + 1];
        arg2[class255.field3314.method8()] = var5 ? null : this.field528[arg0 + 1][arg1];
        arg2[class255.field3321.method8()] = var4 ? null : this.field528[arg0 - 1][arg1];
        arg2[class255.field3316.method8()] = var6 ? null : this.field528[arg0][arg1 - 1];
        arg2[class255.field3315.method8()] = var6 || var5 ? null : this.field528[arg0 + 1][arg1 - 1];
        arg2[class255.field3312.method8()] = var6 || var4 ? null : this.field528[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("ag.x(IIIILjava/util/HashSet;III)V")
    public void method561(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field535 == null) {
            return;
        }
        this.field535.method5444(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field527 == null) {
            this.method531();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field527.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class41 var12 = (class41) var11.next();
                int var13 = (var12.field513.field2775 - this.field532) * arg2 / this.field537;
                int var14 = arg3 - (var12.field513.field2777 - this.field526) * arg3 / this.field539;
                class328.method5321(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ag.z(IIIIIIIIIIB)Ljava/util/List;")
    public List method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field540) {
            return var11;
        }
        class30 var12 = this.method528(arg0, arg1, arg2, arg3);
        float var13 = this.method532(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field532 + arg0;
        int var16 = this.field526 + arg1;
        for (int var17 = var12.field404; var17 < var12.field404 + var12.field401; var17++) {
            for (int var18 = var12.field403; var18 < var12.field403 + var12.field402; var18++) {
                List var19 = this.field528[var17][var18].method389((this.field528[var17][var18].field460 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field528[var17][var18].field457 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ag.p(IIIIB)Lai;")
    public class30 method528(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field532 + arg0;
        int var7 = this.field526 + arg1;
        int var8 = this.field532 + arg2;
        int var9 = this.field526 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field401 = var12 - var10 + 1;
        var5.field402 = var13 - var11 + 1;
        var5.field404 = var10 - this.field525.method282();
        var5.field403 = var11 - this.field525.method337();
        if (var5.field404 < 0) {
            var5.field401 += var5.field404;
            var5.field404 = 0;
        }
        if (var5.field404 > this.field528.length - var5.field401) {
            var5.field401 = this.field528.length - var5.field404;
        }
        if (var5.field403 < 0) {
            var5.field402 += var5.field403;
            var5.field403 = 0;
        }
        if (var5.field403 > this.field528[0].length - var5.field402) {
            var5.field402 = this.field528[0].length - var5.field403;
        }
        var5.field401 = Math.min(var5.field401, this.field528.length);
        var5.field402 = Math.min(var5.field402, this.field528[0].length);
        return var5;
    }

    @ObfuscatedName("ag.w(I)Z")
    public boolean method529() {
        return this.field540;
    }

    @ObfuscatedName("ag.r(I)Ljava/util/HashMap;")
    public HashMap method530() {
        this.method531();
        return this.field527;
    }

    @ObfuscatedName("ag.d(I)V")
    public void method531() {
        if (this.field527 == null) {
            this.field527 = new HashMap();
        }
        this.field527.clear();
        for (int var1 = 0; var1 < this.field528.length; var1++) {
            for (int var2 = 0; var2 < this.field528[var1].length; var2++) {
                List var3 = this.field528[var1][var2].method390();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class41 var5 = (class41) var4.next();
                    if (this.field527.containsKey(var5.field511)) {
                        List var7 = (List) this.field527.get(var5.field511);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field527.put(var5.field511, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.a(III)F")
    public float method532(int arg0, int arg1) {
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
