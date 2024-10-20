package deob;

@ObfuscatedName("am")
public class class38 extends class187 {

    @ObfuscatedName("am.e")
    public static class176 field892 = new class176(64);

    @ObfuscatedName("am.i")
    public int field893 = 0;

    @ObfuscatedName("am.k")
    public int field894;

    @ObfuscatedName("am.h")
    public int field895;

    @ObfuscatedName("am.p")
    public int field891;

    @ObfuscatedName("am.n")
    public int field899;

    @ObfuscatedName("y.b(Lex;B)V")
    public static void method124(class151 arg0) {
        Statics.field897 = arg0;
    }

    @ObfuscatedName("am.e(B)V")
    public void method708() {
        this.method714(this.field893);
    }

    @ObfuscatedName("am.i(Ldc;IB)V")
    public void method696(class110 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2142();
            if (var3 == 0) {
                return;
            }
            this.method705(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.k(Ldc;III)V")
    public void method705(class110 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field893 = arg0.method2146();
        }
    }

    @ObfuscatedName("am.h(IB)V")
    public void method714(int arg0) {
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
        this.field895 = (int) (var14 * 256.0D);
        this.field891 = (int) (var16 * 256.0D);
        if (this.field895 < 0) {
            this.field895 = 0;
        } else if (this.field895 > 255) {
            this.field895 = 255;
        }
        if (this.field891 < 0) {
            this.field891 = 0;
        } else if (this.field891 > 255) {
            this.field891 = 255;
        }
        if (var16 > 0.5D) {
            this.field899 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field899 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field899 < 1) {
            this.field899 = 1;
        }
        this.field894 = (int) ((double) this.field899 * var18);
    }

    @ObfuscatedName("o.p(B)V")
    public static void method82() {
        field892.method3231();
    }
}
