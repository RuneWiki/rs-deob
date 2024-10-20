package deob;

@ObfuscatedName("hj")
public class class200 extends class470 {

    @ObfuscatedName("hj.ay")
    public static class289 field2078 = new class289(64);

    @ObfuscatedName("hj.ar")
    public int field2079 = 0;

    @ObfuscatedName("hj.am")
    public int field2081;

    @ObfuscatedName("hj.as")
    public int field2082;

    @ObfuscatedName("hj.aj")
    public int field2083;

    @ObfuscatedName("hj.ag")
    public int field2084;

    @ObfuscatedName("hj.aw(I)V")
    public void method3458() {
        this.method3461(this.field2079);
    }

    @ObfuscatedName("hj.ay(Lty;IB)V")
    public void method3473(class514 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8244();
            if (var3 == 0) {
                return;
            }
            this.method3457(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hj.ar(Lty;IIS)V")
    public void method3457(class514 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2079 = arg0.method8248();
        }
    }

    @ObfuscatedName("hj.am(IS)V")
    public void method3461(int arg0) {
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
        this.field2082 = (int) (var14 * 256.0D);
        this.field2083 = (int) (var16 * 256.0D);
        if (this.field2082 < 0) {
            this.field2082 = 0;
        } else if (this.field2082 > 255) {
            this.field2082 = 255;
        }
        if (this.field2083 < 0) {
            this.field2083 = 0;
        } else if (this.field2083 > 255) {
            this.field2083 = 255;
        }
        if (var16 > 0.5D) {
            this.field2084 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2084 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2084 < 1) {
            this.field2084 = 1;
        }
        this.field2081 = (int) ((double) this.field2084 * var18);
    }

    @ObfuscatedName("nl.as(I)V")
    public static void method6049() {
        field2078.method5146();
    }
}
