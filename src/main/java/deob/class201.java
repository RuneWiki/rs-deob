package deob;

@ObfuscatedName("ge")
public class class201 extends class130 {

    @ObfuscatedName("ge.e")
    public static class125 field3046 = new class125(64);

    @ObfuscatedName("ge.f")
    public int field3037 = 0;

    @ObfuscatedName("ge.k")
    public int field3039 = -1;

    @ObfuscatedName("ge.g")
    public boolean field3040 = true;

    @ObfuscatedName("ge.n")
    public int field3041 = -1;

    @ObfuscatedName("ge.a")
    public int field3042;

    @ObfuscatedName("ge.q")
    public int field3043;

    @ObfuscatedName("ge.w")
    public int field3044;

    @ObfuscatedName("ge.v")
    public int field3045;

    @ObfuscatedName("ge.h")
    public int field3036;

    @ObfuscatedName("ge.p")
    public int field3047;

    @ObfuscatedName("s.i(Lgq;I)V")
    public static void method204(class183 arg0) {
        Statics.field3038 = arg0;
    }

    @ObfuscatedName("ge.e(I)V")
    public void method3466() {
        if (this.field3041 != -1) {
            this.method3458(this.field3041);
            this.field3045 = this.field3042;
            this.field3036 = this.field3043;
            this.field3047 = this.field3044;
        }
        this.method3458(this.field3037);
    }

    @ObfuscatedName("ge.f(Let;II)V")
    public void method3456(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2573();
            if (var3 == 0) {
                return;
            }
            this.method3457(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ge.k(Let;III)V")
    public void method3457(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3037 = arg0.method2706();
        } else if (arg1 == 2) {
            this.field3039 = arg0.method2573();
        } else if (arg1 == 5) {
            this.field3040 = false;
        } else if (arg1 == 7) {
            this.field3041 = arg0.method2706();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ge.a(IS)V")
    public void method3458(int arg0) {
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
        this.field3042 = (int) (var18 * 256.0D);
        this.field3043 = (int) (var14 * 256.0D);
        this.field3044 = (int) (var16 * 256.0D);
        if (this.field3043 < 0) {
            this.field3043 = 0;
        } else if (this.field3043 > 255) {
            this.field3043 = 255;
        }
        if (this.field3044 < 0) {
            this.field3044 = 0;
        } else if (this.field3044 > 255) {
            this.field3044 = 255;
        }
    }
}
