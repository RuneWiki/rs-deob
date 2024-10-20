package deob;

@ObfuscatedName("at")
public class class42 extends class204 {

    @ObfuscatedName("at.q")
    public static class193 field970 = new class193(64);

    @ObfuscatedName("at.k")
    public int field966 = 0;

    @ObfuscatedName("at.f")
    public int field972;

    @ObfuscatedName("at.d")
    public int field965;

    @ObfuscatedName("at.l")
    public int field968;

    @ObfuscatedName("at.r")
    public int field964;

    @ObfuscatedName("at.z(B)V")
    public void method820() {
        this.method808(this.field966);
    }

    @ObfuscatedName("at.q(Lda;II)V")
    public void method804(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2457();
            if (var3 == 0) {
                return;
            }
            this.method805(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.k(Lda;III)V")
    public void method805(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field966 = arg0.method2305();
        }
    }

    @ObfuscatedName("at.f(IB)V")
    public void method808(int arg0) {
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
        this.field965 = (int) (var14 * 256.0D);
        this.field968 = (int) (var16 * 256.0D);
        if (this.field965 < 0) {
            this.field965 = 0;
        } else if (this.field965 > 255) {
            this.field965 = 255;
        }
        if (this.field968 < 0) {
            this.field968 = 0;
        } else if (this.field968 > 255) {
            this.field968 = 255;
        }
        if (var16 > 0.5D) {
            this.field964 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field964 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field964 < 1) {
            this.field964 = 1;
        }
        this.field972 = (int) ((double) this.field964 * var18);
    }

    @ObfuscatedName("q.d(I)V")
    public static void method9() {
        field970.method3430();
    }
}
