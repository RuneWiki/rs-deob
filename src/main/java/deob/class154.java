package deob;

@ObfuscatedName("ek")
public class class154 extends class142 {

    @ObfuscatedName("ek.l")
    public static class100 field2351 = new class100(64);

    @ObfuscatedName("ek.i")
    public int field2352 = 0;

    @ObfuscatedName("ek.e")
    public int field2353;

    @ObfuscatedName("ek.a")
    public int field2354;

    @ObfuscatedName("ek.g")
    public int field2355;

    @ObfuscatedName("ek.w")
    public int field2356;

    @ObfuscatedName("ek.i(B)V")
    public void method2372() {
        this.method2369(this.field2352);
    }

    @ObfuscatedName("ek.e(Lec;II)V")
    public void method2377(class135 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1571();
            if (var3 == 0) {
                return;
            }
            this.method2371(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ek.a(Lec;III)V")
    public void method2371(class135 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2352 = arg0.method1575();
        }
    }

    @ObfuscatedName("ek.g(IB)V")
    public void method2369(int arg0) {
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
        this.field2354 = (int) (var14 * 256.0D);
        this.field2355 = (int) (var16 * 256.0D);
        if (this.field2354 < 0) {
            this.field2354 = 0;
        } else if (this.field2354 > 255) {
            this.field2354 = 255;
        }
        if (this.field2355 < 0) {
            this.field2355 = 0;
        } else if (this.field2355 > 255) {
            this.field2355 = 255;
        }
        if (var16 > 0.5D) {
            this.field2356 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2356 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2356 < 1) {
            this.field2356 = 1;
        }
        this.field2353 = (int) ((double) this.field2356 * var18);
    }

    @ObfuscatedName("bv.w(I)V")
    public static void method876() {
        field2351.method1221();
    }
}
