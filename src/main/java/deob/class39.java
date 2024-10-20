package deob;

@ObfuscatedName("ab")
public class class39 extends class195 {

    @ObfuscatedName("ab.b")
    public static class184 field912 = new class184(64);

    @ObfuscatedName("ab.p")
    public int field898 = 0;

    @ObfuscatedName("ab.e")
    public int field899;

    @ObfuscatedName("ab.i")
    public int field900;

    @ObfuscatedName("ab.o")
    public int field901;

    @ObfuscatedName("ab.f")
    public int field902;

    @ObfuscatedName("ae.t(IB)Lab;")
    public static class39 method644(int arg0) {
        class39 var1 = (class39) field912.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field910.method2881(1, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method762(new class111(var2), arg0);
        }
        var3.method767();
        field912.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.b(I)V")
    public void method767() {
        this.method764(this.field898);
    }

    @ObfuscatedName("ab.p(Ldc;II)V")
    public void method762(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2172();
            if (var3 == 0) {
                return;
            }
            this.method763(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ab.e(Ldc;III)V")
    public void method763(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field898 = arg0.method2307();
        }
    }

    @ObfuscatedName("ab.i(II)V")
    public void method764(int arg0) {
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
        this.field900 = (int) (var14 * 256.0D);
        this.field901 = (int) (var16 * 256.0D);
        if (this.field900 < 0) {
            this.field900 = 0;
        } else if (this.field900 > 255) {
            this.field900 = 255;
        }
        if (this.field901 < 0) {
            this.field901 = 0;
        } else if (this.field901 > 255) {
            this.field901 = 255;
        }
        if (var16 > 0.5D) {
            this.field902 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field902 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field902 < 1) {
            this.field902 = 1;
        }
        this.field899 = (int) ((double) this.field902 * var18);
    }

    @ObfuscatedName("dx.o(I)V")
    public static void method2510() {
        field912.method3342();
    }
}
