package deob;

@ObfuscatedName("ga")
public class class206 extends class151 {

    @ObfuscatedName("ga.c")
    public static class146 field3072 = new class146(64);

    @ObfuscatedName("ga.n")
    public int field3074 = 0;

    @ObfuscatedName("ga.q")
    public int field3076 = -1;

    @ObfuscatedName("ga.t")
    public boolean field3075 = true;

    @ObfuscatedName("ga.p")
    public int field3080 = -1;

    @ObfuscatedName("ga.u")
    public int field3077;

    @ObfuscatedName("ga.z")
    public int field3078;

    @ObfuscatedName("ga.l")
    public int field3079;

    @ObfuscatedName("ga.v")
    public int field3073;

    @ObfuscatedName("ga.g")
    public int field3081;

    @ObfuscatedName("ga.w")
    public int field3071;

    @ObfuscatedName("gy.d(Lgd;I)V")
    public static void method3520(class185 arg0) {
        Statics.field3082 = arg0;
    }

    @ObfuscatedName("ga.c(B)V")
    public void method3624() {
        if (this.field3080 != -1) {
            this.method3627(this.field3080);
            this.field3073 = this.field3077;
            this.field3081 = this.field3078;
            this.field3071 = this.field3079;
        }
        this.method3627(this.field3074);
    }

    @ObfuscatedName("ga.n(Ldu;II)V")
    public void method3626(class130 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2379();
            if (var3 == 0) {
                return;
            }
            this.method3643(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ga.q(Ldu;III)V")
    public void method3643(class130 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3074 = arg0.method2233();
        } else if (arg1 == 2) {
            this.field3076 = arg0.method2379();
        } else if (arg1 == 5) {
            this.field3075 = false;
        } else if (arg1 == 7) {
            this.field3080 = arg0.method2233();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ga.t(II)V")
    public void method3627(int arg0) {
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
        this.field3077 = (int) (var18 * 256.0D);
        this.field3078 = (int) (var14 * 256.0D);
        this.field3079 = (int) (var16 * 256.0D);
        if (this.field3078 < 0) {
            this.field3078 = 0;
        } else if (this.field3078 > 255) {
            this.field3078 = 255;
        }
        if (this.field3079 < 0) {
            this.field3079 = 0;
        } else if (this.field3079 > 255) {
            this.field3079 = 255;
        }
    }
}
