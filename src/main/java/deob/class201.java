package deob;

@ObfuscatedName("gu")
public class class201 extends class130 {

    @ObfuscatedName("gu.d")
    public static class125 field3039 = new class125(64);

    @ObfuscatedName("gu.m")
    public int field3031 = 0;

    @ObfuscatedName("gu.h")
    public int field3040 = -1;

    @ObfuscatedName("gu.w")
    public boolean field3034 = true;

    @ObfuscatedName("gu.r")
    public int field3035 = -1;

    @ObfuscatedName("gu.c")
    public int field3036;

    @ObfuscatedName("gu.p")
    public int field3037;

    @ObfuscatedName("gu.g")
    public int field3038;

    @ObfuscatedName("gu.z")
    public int field3032;

    @ObfuscatedName("gu.q")
    public int field3030;

    @ObfuscatedName("gu.l")
    public int field3041;

    @ObfuscatedName("gu.n(I)V")
    public void method3537() {
        if (this.field3035 != -1) {
            this.method3540(this.field3035);
            this.field3032 = this.field3036;
            this.field3030 = this.field3037;
            this.field3041 = this.field3038;
        }
        this.method3540(this.field3031);
    }

    @ObfuscatedName("gu.d(Lfa;II)V")
    public void method3538(class161 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2823();
            if (var3 == 0) {
                return;
            }
            this.method3539(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gu.m(Lfa;III)V")
    public void method3539(class161 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3031 = arg0.method2784();
        } else if (arg1 == 2) {
            this.field3040 = arg0.method2823();
        } else if (arg1 == 5) {
            this.field3034 = false;
        } else if (arg1 == 7) {
            this.field3035 = arg0.method2784();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gu.h(IB)V")
    public void method3540(int arg0) {
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
        this.field3036 = (int) (var18 * 256.0D);
        this.field3037 = (int) (var14 * 256.0D);
        this.field3038 = (int) (var16 * 256.0D);
        if (this.field3037 < 0) {
            this.field3037 = 0;
        } else if (this.field3037 > 255) {
            this.field3037 = 255;
        }
        if (this.field3038 < 0) {
            this.field3038 = 0;
        } else if (this.field3038 > 255) {
            this.field3038 = 255;
        }
    }

    @ObfuscatedName("ez.w(B)V")
    public static void method2371() {
        field3039.method2220();
    }
}
