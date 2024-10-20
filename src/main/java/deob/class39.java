package deob;

@ObfuscatedName("af")
public class class39 extends class194 {

    @ObfuscatedName("af.s")
    public static class183 field901 = new class183(64);

    @ObfuscatedName("af.h")
    public int field902 = 0;

    @ObfuscatedName("af.e")
    public int field903;

    @ObfuscatedName("af.n")
    public int field905;

    @ObfuscatedName("af.t")
    public int field904;

    @ObfuscatedName("af.l")
    public int field900;

    @ObfuscatedName("cn.q(II)Laf;")
    public static class39 method1887(int arg0) {
        class39 var1 = (class39) field901.method3243((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field906.method2811(1, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method703(new class111(var2), arg0);
        }
        var3.method706();
        field901.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.s(B)V")
    public void method706() {
        this.method705(this.field902);
    }

    @ObfuscatedName("af.h(Ldx;II)V")
    public void method703(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2231();
            if (var3 == 0) {
                return;
            }
            this.method704(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("af.e(Ldx;IIS)V")
    public void method704(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field902 = arg0.method2150();
        }
    }

    @ObfuscatedName("af.n(II)V")
    public void method705(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field905 = (int) (var14 * 256.0D);
        this.field904 = (int) (var16 * 256.0D);
        if (this.field905 < 0) {
            this.field905 = 0;
        } else if (this.field905 > 255) {
            this.field905 = 255;
        }
        if (this.field904 < 0) {
            this.field904 = 0;
        } else if (this.field904 > 255) {
            this.field904 = 255;
        }
        if (var16 > 0.5D) {
            this.field900 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field900 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field900 < 1) {
            this.field900 = 1;
        }
        this.field903 = (int) ((double) this.field900 * var18);
    }

    @ObfuscatedName("t.t(I)V")
    public static void method48() {
        field901.method3246();
    }
}
