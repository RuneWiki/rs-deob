package deob;

@ObfuscatedName("am")
public class class37 extends class182 {

    @ObfuscatedName("am.o")
    public static class171 field881 = new class171(64);

    @ObfuscatedName("am.i")
    public int field886 = 0;

    @ObfuscatedName("am.p")
    public int field883;

    @ObfuscatedName("am.c")
    public int field884;

    @ObfuscatedName("am.y")
    public int field885;

    @ObfuscatedName("am.g")
    public int field888;

    @ObfuscatedName("aa.t(IB)Lam;")
    public static class37 method568(int arg0) {
        class37 var1 = (class37) field881.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field882.method2668(1, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method686(new class107(var2), arg0);
        }
        var3.method696();
        field881.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.o(I)V")
    public void method696() {
        this.method688(this.field886);
    }

    @ObfuscatedName("am.i(Ldg;II)V")
    public void method686(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2118();
            if (var3 == 0) {
                return;
            }
            this.method687(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.p(Ldg;IIB)V")
    public void method687(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field886 = arg0.method2122();
        }
    }

    @ObfuscatedName("am.c(II)V")
    public void method688(int arg0) {
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
        this.field884 = (int) (var14 * 256.0D);
        this.field885 = (int) (var16 * 256.0D);
        if (this.field884 < 0) {
            this.field884 = 0;
        } else if (this.field884 > 255) {
            this.field884 = 255;
        }
        if (this.field885 < 0) {
            this.field885 = 0;
        } else if (this.field885 > 255) {
            this.field885 = 255;
        }
        if (var16 > 0.5D) {
            this.field888 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field888 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field888 < 1) {
            this.field888 = 1;
        }
        this.field883 = (int) ((double) this.field888 * var18);
    }

    @ObfuscatedName("r.y(I)V")
    public static void method151() {
        field881.method3104();
    }
}
