package deob;

@ObfuscatedName("ix")
public class class246 extends class176 {

    @ObfuscatedName("ix.t")
    public static class146 field3255 = new class146(64);

    @ObfuscatedName("ix.o")
    public int field3259 = 0;

    @ObfuscatedName("ix.e")
    public int field3257;

    @ObfuscatedName("ix.i")
    public int field3258;

    @ObfuscatedName("ix.g")
    public int field3256;

    @ObfuscatedName("ix.d")
    public int field3260;

    @ObfuscatedName("cn.c(Lii;I)V")
    public static void method1928(class235 arg0) {
        Statics.field3254 = arg0;
    }

    @ObfuscatedName("br.t(IB)Lix;")
    public static class246 method1883(int arg0) {
        class246 var1 = (class246) field3255.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3254.method3845(1, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method4124(new class301(var2), arg0);
        }
        var3.method4108();
        field3255.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.o(I)V")
    public void method4108() {
        this.method4118(this.field3259);
    }

    @ObfuscatedName("ix.e(Lkp;IB)V")
    public void method4124(class301 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5129();
            if (var3 == 0) {
                return;
            }
            this.method4112(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ix.i(Lkp;IIB)V")
    public void method4112(class301 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3259 = arg0.method5133();
        }
    }

    @ObfuscatedName("ix.g(IB)V")
    public void method4118(int arg0) {
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
        this.field3258 = (int) (var14 * 256.0D);
        this.field3256 = (int) (var16 * 256.0D);
        if (this.field3258 < 0) {
            this.field3258 = 0;
        } else if (this.field3258 > 255) {
            this.field3258 = 255;
        }
        if (this.field3256 < 0) {
            this.field3256 = 0;
        } else if (this.field3256 > 255) {
            this.field3256 = 255;
        }
        if (var16 > 0.5D) {
            this.field3260 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3260 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3260 < 1) {
            this.field3260 = 1;
        }
        this.field3257 = (int) ((double) this.field3260 * var18);
    }
}
