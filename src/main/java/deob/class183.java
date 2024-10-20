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

@ObfuscatedName("gv")
public final class class183 {

    @ObfuscatedName("gv.i")
    public boolean field2086 = false;

    @ObfuscatedName("gv.w")
    public boolean field2074 = false;

    @ObfuscatedName("gv.s")
    public class202 field2073;

    @ObfuscatedName("gv.a")
    public class414 field2071;

    @ObfuscatedName("gv.o")
    public HashMap field2075;

    @ObfuscatedName("gv.g")
    public class182[][] field2076;

    @ObfuscatedName("gv.e")
    public HashMap field2077 = new HashMap();

    @ObfuscatedName("gv.p")
    public class413[] field2078;

    @ObfuscatedName("gv.j")
    public final class290 field2072;

    @ObfuscatedName("gv.b")
    public final class290 field2082;

    @ObfuscatedName("gv.x")
    public final HashMap field2081;

    @ObfuscatedName("gv.y")
    public int field2080;

    @ObfuscatedName("gv.k")
    public int field2079;

    @ObfuscatedName("gv.t")
    public int field2084;

    @ObfuscatedName("gv.l")
    public int field2085;

    @ObfuscatedName("gv.u")
    public int field2083 = 0;

    public class183(class413[] arg0, HashMap arg1, class290 arg2, class290 arg3) {
        this.field2078 = arg0;
        this.field2081 = arg1;
        this.field2072 = arg2;
        this.field2082 = arg3;
    }

    @ObfuscatedName("gv.i(Lko;Ljava/lang/String;ZI)V")
    public void method3462(class290 arg0, String arg1, boolean arg2) {
        if (this.field2074) {
            return;
        }
        this.field2086 = false;
        this.field2074 = true;
        System.nanoTime();
        int var4 = arg0.method4759(class200.field2211.field2213);
        int var5 = arg0.method4760(var4, arg1);
        class401 var6 = new class401(arg0.method4762(class200.field2211.field2213, arg1));
        class401 var7 = new class401(arg0.method4762(class200.field2212.field2213, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2073 = new class202();
        try {
            this.field2073.method3599(var6, var7, var5, arg2);
        } catch (IllegalStateException var29) {
            return;
        }
        this.field2073.method3283();
        this.field2073.method3284();
        this.field2073.method3295();
        this.field2080 = this.field2073.method3279() * 64;
        this.field2079 = this.field2073.method3281() * 64;
        this.field2084 = (this.field2073.method3280() - this.field2073.method3279() + 1) * 64;
        this.field2085 = (this.field2073.method3282() - this.field2073.method3281() + 1) * 64;
        int var9 = this.field2073.method3280() - this.field2073.method3279() + 1;
        int var10 = this.field2073.method3282() - this.field2073.method3281() + 1;
        System.nanoTime();
        System.nanoTime();
        class182.method2673();
        this.field2076 = new class182[var9][var10];
        Iterator var11 = this.field2073.field2222.iterator();
        while (var11.hasNext()) {
            class176 var12 = (class176) var11.next();
            int var13 = var12.field2147;
            int var14 = var12.field2148;
            int var15 = var13 - this.field2073.method3279();
            int var16 = var14 - this.field2073.method3281();
            this.field2076[var15][var16] = new class182(var13, var14, this.field2073.method3329(), this.field2081);
            this.field2076[var15][var16].method3384(var12, this.field2073.field2221);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field2076[var17][var18] == null) {
                    this.field2076[var17][var18] = new class182(this.field2073.method3279() + var17, this.field2073.method3281() + var18, this.field2073.method3329(), this.field2081);
                    this.field2076[var17][var18].method3338(this.field2073.field2219, this.field2073.field2221);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4761(class200.field2216.field2213, arg1)) {
            byte[] var19 = arg0.method4762(class200.field2216.field2213, arg1);
            Object var20 = null;
            class414 var26;
            label43: {
                try {
                    BufferedImage var21 = ImageIO.read(new ByteArrayInputStream(var19));
                    int var22 = var21.getWidth();
                    int var23 = var21.getHeight();
                    int[] var24 = new int[var22 * var23];
                    PixelGrabber var25 = new PixelGrabber(var21, 0, 0, var22, var23, var24, 0, var22);
                    var25.grabPixels();
                    var26 = new class414(var24, var22, var23);
                    break label43;
                } catch (IOException var30) {
                } catch (InterruptedException var31) {
                }
                var26 = new class414(0, 0);
            }
            this.field2071 = var26;
        }
        System.nanoTime();
        arg0.method4755();
        arg0.method4757();
        this.field2086 = true;
    }

    @ObfuscatedName("gv.w(B)V")
    public final void method3463() {
        this.field2075 = null;
    }

    @ObfuscatedName("gv.s(IIIIIIIII)V")
    public final void method3464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4366;
        int var10 = Statics.field4367;
        int var11 = Statics.field4369;
        int[] var12 = new int[4];
        class410.method6557(var12);
        class191 var13 = this.method3468(arg0, arg1, arg2, arg3);
        float var14 = this.method3472(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2083 = var15;
        if (!this.field2077.containsKey(var15)) {
            class203 var16 = new class203(var15);
            var16.method3647();
            this.field2077.put(var15, var16);
        }
        int var17 = var13.field2163 + var13.field2162 - 1;
        int var18 = var13.field2164 + var13.field2161 - 1;
        for (int var19 = var13.field2163; var19 <= var17; var19++) {
            for (int var20 = var13.field2164; var20 <= var18; var20++) {
                this.field2076[var19][var20].method3345(var15, (class203) this.field2077.get(var15), this.field2078, this.field2072, this.field2082);
            }
        }
        class410.method6517(var9, var10, var11);
        class410.method6522(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2080 + arg0;
        int var23 = this.field2079 + arg1;
        for (int var24 = var13.field2163; var24 < var13.field2163 + var13.field2162; var24++) {
            for (int var25 = var13.field2164; var25 < var13.field2164 + var13.field2161; var25++) {
                this.field2076[var24][var25].method3365((this.field2076[var24][var25].field2060 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field2076[var24][var25].field2063 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("gv.a(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method3490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class191 var14 = this.method3468(arg0, arg1, arg2, arg3);
        float var15 = this.method3472(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2080 + arg0;
        int var18 = this.field2079 + arg1;
        for (int var19 = var14.field2163; var19 < var14.field2163 + var14.field2162; var19++) {
            for (int var20 = var14.field2164; var20 < var14.field2164 + var14.field2161; var20++) {
                if (arg12) {
                    this.field2076[var19][var20].method3341();
                }
                this.field2076[var19][var20].method3361((this.field2076[var19][var20].field2060 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field2076[var19][var20].field2063 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2163; var21 < var14.field2163 + var14.field2162; var21++) {
            for (int var22 = var14.field2164; var22 < var14.field2164 + var14.field2161; var22++) {
                this.field2076[var21][var22].method3347(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("gv.o(IIIILjava/util/HashSet;III)V")
    public void method3466(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field2071 == null) {
            return;
        }
        this.field2071.method6647(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field2075 == null) {
            this.method3471();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field2075.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class199 var12 = (class199) var11.next();
                int var13 = (var12.field2205.field3017 - this.field2080) * arg2 / this.field2084;
                int var14 = arg3 - (var12.field2205.field3016 - this.field2079) * arg3 / this.field2085;
                class410.method6516(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("gv.g(IIIIIIIIIII)Ljava/util/List;")
    public List method3487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field2086) {
            return var11;
        }
        class191 var12 = this.method3468(arg0, arg1, arg2, arg3);
        float var13 = this.method3472(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2080 + arg0;
        int var16 = this.field2079 + arg1;
        for (int var17 = var12.field2163; var17 < var12.field2163 + var12.field2162; var17++) {
            for (int var18 = var12.field2164; var18 < var12.field2164 + var12.field2161; var18++) {
                List var19 = this.field2076[var17][var18].method3367((this.field2076[var17][var18].field2060 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field2076[var17][var18].field2063 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("gv.e(IIIIB)Lgb;")
    public class191 method3468(int arg0, int arg1, int arg2, int arg3) {
        class191 var5 = new class191(this);
        int var6 = this.field2080 + arg0;
        int var7 = this.field2079 + arg1;
        int var8 = this.field2080 + arg2;
        int var9 = this.field2079 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2162 = var12 - var10 + 1;
        var5.field2161 = var13 - var11 + 1;
        var5.field2163 = var10 - this.field2073.method3279();
        var5.field2164 = var11 - this.field2073.method3281();
        if (var5.field2163 < 0) {
            var5.field2162 += var5.field2163;
            var5.field2163 = 0;
        }
        if (var5.field2163 > this.field2076.length - var5.field2162) {
            var5.field2162 = this.field2076.length - var5.field2163;
        }
        if (var5.field2164 < 0) {
            var5.field2161 += var5.field2164;
            var5.field2164 = 0;
        }
        if (var5.field2164 > this.field2076[0].length - var5.field2161) {
            var5.field2161 = this.field2076[0].length - var5.field2164;
        }
        var5.field2162 = Math.min(var5.field2162, this.field2076.length);
        var5.field2161 = Math.min(var5.field2161, this.field2076[0].length);
        return var5;
    }

    @ObfuscatedName("gv.p(I)Z")
    public boolean method3469() {
        return this.field2086;
    }

    @ObfuscatedName("gv.j(S)Ljava/util/HashMap;")
    public HashMap method3477() {
        this.method3471();
        return this.field2075;
    }

    @ObfuscatedName("gv.b(I)V")
    public void method3471() {
        if (this.field2075 == null) {
            this.field2075 = new HashMap();
        }
        this.field2075.clear();
        for (int var1 = 0; var1 < this.field2076.length; var1++) {
            for (int var2 = 0; var2 < this.field2076[var1].length; var2++) {
                List var3 = this.field2076[var1][var2].method3368();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class199 var5 = (class199) var4.next();
                    if (var5.method3587()) {
                        int var6 = var5.method3225();
                        if (this.field2075.containsKey(var6)) {
                            List var8 = (List) this.field2075.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field2075.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gv.x(IIB)F")
    public float method3472(int arg0, int arg1) {
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
