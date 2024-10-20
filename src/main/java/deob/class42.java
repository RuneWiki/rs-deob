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
public final class class42 {

    @ObfuscatedName("aj.b")
    public boolean field523 = false;

    @ObfuscatedName("aj.s")
    public boolean field510 = false;

    @ObfuscatedName("aj.r")
    public class45 field511;

    @ObfuscatedName("aj.g")
    public class295 field512;

    @ObfuscatedName("aj.x")
    public HashMap field513;

    @ObfuscatedName("aj.f")
    public class35[][] field522;

    @ObfuscatedName("aj.u")
    public HashMap field515 = new HashMap();

    @ObfuscatedName("aj.t")
    public class294[] field516;

    @ObfuscatedName("aj.k")
    public final HashMap field517;

    @ObfuscatedName("aj.n")
    public int field514;

    @ObfuscatedName("aj.d")
    public int field519;

    @ObfuscatedName("aj.o")
    public int field509;

    @ObfuscatedName("aj.a")
    public int field521;

    public class42(class294[] arg0, HashMap arg1) {
        this.field516 = arg0;
        this.field517 = arg1;
    }

    @ObfuscatedName("aj.b(Lij;Ljava/lang/String;ZI)V")
    public void method473(class243 arg0, String arg1, boolean arg2) {
        if (this.field510) {
            return;
        }
        this.field523 = false;
        this.field510 = true;
        System.nanoTime();
        int var4 = arg0.method3832(class41.field508.field505);
        int var5 = arg0.method3833(var4, arg1);
        class181 var6 = new class181(arg0.method3850(class41.field508.field505, arg1));
        class181 var7 = new class181(arg0.method3850(class41.field501.field505, arg1));
        class181 var8 = new class181(arg0.method3850(arg1, class41.field503.field505));
        System.nanoTime();
        System.nanoTime();
        this.field511 = new class45();
        try {
            this.field511.method526(var6, var8, var7, var5, arg2);
        } catch (IllegalStateException var30) {
            return;
        }
        this.field511.method248();
        this.field511.method238();
        this.field511.method239();
        this.field514 = this.field511.method226() * 64;
        this.field519 = this.field511.method235() * 64;
        this.field509 = (this.field511.method283() - this.field511.method226() + 1) * 64;
        this.field521 = (this.field511.method281() - this.field511.method235() + 1) * 64;
        int var10 = this.field511.method283() - this.field511.method226() + 1;
        int var11 = this.field511.method281() - this.field511.method235() + 1;
        System.nanoTime();
        System.nanoTime();
        this.field522 = new class35[var10][var11];
        Iterator var12 = this.field511.field540.iterator();
        while (var12.hasNext()) {
            class23 var13 = (class23) var12.next();
            int var14 = var13.field387;
            int var15 = var13.field377;
            int var16 = var14 - this.field511.method226();
            int var17 = var15 - this.field511.method235();
            this.field522[var16][var17] = new class35(var14, var15, this.field511.method222(), this.field517);
            this.field522[var16][var17].method298(var13, this.field511.field535);
        }
        for (int var18 = 0; var18 < var10; var18++) {
            for (int var19 = 0; var19 < var11; var19++) {
                if (this.field522[var18][var19] == null) {
                    this.field522[var18][var19] = new class35(this.field511.method226() + var18, this.field511.method235() + var19, this.field511.method222(), this.field517);
                    this.field522[var18][var19].method307(this.field511.field536, this.field511.field535);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method3834(class41.field502.field505, arg1)) {
            byte[] var20 = arg0.method3850(class41.field502.field505, arg1);
            Object var21 = null;
            class295 var27;
            label43: {
                try {
                    BufferedImage var22 = ImageIO.read(new ByteArrayInputStream(var20));
                    int var23 = var22.getWidth();
                    int var24 = var22.getHeight();
                    int[] var25 = new int[var23 * var24];
                    PixelGrabber var26 = new PixelGrabber(var22, 0, 0, var23, var24, var25, 0, var23);
                    var26.grabPixels();
                    var27 = new class295(var25, var23, var24);
                    break label43;
                } catch (IOException var31) {
                } catch (InterruptedException var32) {
                }
                var27 = new class295(0, 0);
            }
            this.field512 = var27;
        }
        System.nanoTime();
        this.field523 = true;
    }

    @ObfuscatedName("aj.s(B)V")
    public final void method487() {
        this.field513 = null;
    }

    @ObfuscatedName("aj.r(IIIIIIIIB)V")
    public final void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field3812;
        int var10 = Statics.field3807;
        int var11 = Statics.field3811;
        int[] var12 = new int[4];
        class291.method4665(var12);
        class30 var13 = this.method480(arg0, arg1, arg2, arg3);
        float var14 = this.method484(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        if (!this.field515.containsKey(var15)) {
            class47 var16 = new class47(var15);
            var16.method576();
            this.field515.put(var15, var16);
        }
        class35[] var17 = new class35[8];
        for (int var18 = var13.field392; var18 < var13.field396 + var13.field392; var18++) {
            for (int var19 = var13.field391; var19 < var13.field391 + var13.field390; var19++) {
                this.method475(var18, var19, var17);
                this.field522[var18][var19].method302(var15, (class47) this.field515.get(var15), var17, this.field516);
            }
        }
        class291.method4661(var9, var10, var11);
        class291.method4679(var12);
        int var20 = (int) (var14 * 64.0F);
        int var21 = this.field514 + arg0;
        int var22 = this.field519 + arg1;
        for (int var23 = var13.field392; var23 < var13.field396 + var13.field392; var23++) {
            for (int var24 = var13.field391; var24 < var13.field391 + var13.field390; var24++) {
                this.field522[var23][var24].method412((this.field522[var23][var24].field443 * 64 - var21) * var20 / 64 + arg4, arg7 - (this.field522[var23][var24].field444 * 64 - var22 + 64) * var20 / 64, var20);
            }
        }
    }

    @ObfuscatedName("aj.g(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class30 var14 = this.method480(arg0, arg1, arg2, arg3);
        float var15 = this.method484(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field514 + arg0;
        int var18 = this.field519 + arg1;
        for (int var19 = var14.field392; var19 < var14.field396 + var14.field392; var19++) {
            for (int var20 = var14.field391; var20 < var14.field391 + var14.field390; var20++) {
                if (arg12) {
                    this.field522[var19][var20].method326();
                }
                this.field522[var19][var20].method303((this.field522[var19][var20].field443 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field522[var19][var20].field444 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field392; var21 < var14.field396 + var14.field392; var21++) {
            for (int var22 = var14.field391; var22 < var14.field391 + var14.field390; var22++) {
                this.field522[var21][var22].method304(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("aj.x(II[Lao;I)V")
    public void method475(int arg0, int arg1, class35[] arg2) {
        boolean var4 = arg0 <= 0;
        boolean var5 = arg0 >= this.field522.length - 1;
        boolean var6 = arg1 <= 0;
        boolean var7 = arg1 >= this.field522[0].length - 1;
        if (var7) {
            arg2[class236.field3218.method8()] = null;
        } else {
            arg2[class236.field3218.method8()] = this.field522[arg0][arg1 + 1];
        }
        arg2[class236.field3215.method8()] = var7 || var5 ? null : this.field522[arg0 + 1][arg1 + 1];
        arg2[class236.field3220.method8()] = var7 || var4 ? null : this.field522[arg0 - 1][arg1 + 1];
        arg2[class236.field3217.method8()] = var5 ? null : this.field522[arg0 + 1][arg1];
        arg2[class236.field3219.method8()] = var4 ? null : this.field522[arg0 - 1][arg1];
        arg2[class236.field3216.method8()] = var6 ? null : this.field522[arg0][arg1 - 1];
        arg2[class236.field3214.method8()] = var6 || var5 ? null : this.field522[arg0 + 1][arg1 - 1];
        arg2[class236.field3213.method8()] = var6 || var4 ? null : this.field522[arg0 - 1][arg1 - 1];
    }

    @ObfuscatedName("aj.f(IIIILjava/util/HashSet;IIB)V")
    public void method478(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field512 == null) {
            return;
        }
        this.field512.method4797(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field513 == null) {
            this.method483();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field513.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class40 var12 = (class40) var11.next();
                int var13 = (var12.field493.field2683 - this.field514) * arg2 / this.field509;
                int var14 = arg3 - (var12.field493.field2684 - this.field519) * arg3 / this.field521;
                class291.method4669(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("aj.u(IIIIIIIIIII)Ljava/util/List;")
    public List method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field523) {
            return var11;
        }
        class30 var12 = this.method480(arg0, arg1, arg2, arg3);
        float var13 = this.method484(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field514 + arg0;
        int var16 = this.field519 + arg1;
        for (int var17 = var12.field392; var17 < var12.field396 + var12.field392; var17++) {
            for (int var18 = var12.field391; var18 < var12.field391 + var12.field390; var18++) {
                List var19 = this.field522[var17][var18].method315((this.field522[var17][var18].field443 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field522[var17][var18].field444 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("aj.t(IIIII)Lak;")
    public class30 method480(int arg0, int arg1, int arg2, int arg3) {
        class30 var5 = new class30(this);
        int var6 = this.field514 + arg0;
        int var7 = this.field519 + arg1;
        int var8 = this.field514 + arg2;
        int var9 = this.field519 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field396 = var12 - var10 + 1;
        var5.field390 = var13 - var11 + 1;
        var5.field392 = var10 - this.field511.method226();
        var5.field391 = var11 - this.field511.method235();
        if (var5.field392 < 0) {
            var5.field396 += var5.field392;
            var5.field392 = 0;
        }
        if (var5.field392 > this.field522.length - var5.field396) {
            var5.field396 = this.field522.length - var5.field392;
        }
        if (var5.field391 < 0) {
            var5.field390 += var5.field391;
            var5.field391 = 0;
        }
        if (var5.field391 > this.field522[0].length - var5.field390) {
            var5.field390 = this.field522[0].length - var5.field391;
        }
        var5.field396 = Math.min(var5.field396, this.field522.length);
        var5.field390 = Math.min(var5.field390, this.field522[0].length);
        return var5;
    }

    @ObfuscatedName("aj.k(I)Z")
    public boolean method481() {
        return this.field523;
    }

    @ObfuscatedName("aj.n(I)Ljava/util/HashMap;")
    public HashMap method482() {
        this.method483();
        return this.field513;
    }

    @ObfuscatedName("aj.d(I)V")
    public void method483() {
        if (this.field513 == null) {
            this.field513 = new HashMap();
        }
        this.field513.clear();
        for (int var1 = 0; var1 < this.field522.length; var1++) {
            for (int var2 = 0; var2 < this.field522[var1].length; var2++) {
                List var3 = this.field522[var1][var2].method441();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class40 var5 = (class40) var4.next();
                    if (this.field513.containsKey(var5.field499)) {
                        List var7 = (List) this.field513.get(var5.field499);
                        var7.add(var5);
                    } else {
                        LinkedList var6 = new LinkedList();
                        var6.add(var5);
                        this.field513.put(var5.field499, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.o(III)F")
    public float method484(int arg0, int arg1) {
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
