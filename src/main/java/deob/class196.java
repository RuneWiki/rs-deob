package deob;

@ObfuscatedName("gq")
public class class196 extends class425 {

    @ObfuscatedName("gq.f")
    public static class266 field2196 = new class266(64);

    @ObfuscatedName("gq.c")
    public int field2197 = 0;

    @ObfuscatedName("gq.x")
    public int field2198 = -1;

    @ObfuscatedName("gq.h")
    public boolean field2199 = true;

    @ObfuscatedName("gq.j")
    public int field2200 = -1;

    @ObfuscatedName("gq.y")
    public int field2207;

    @ObfuscatedName("gq.d")
    public int field2195;

    @ObfuscatedName("gq.n")
    public int field2203;

    @ObfuscatedName("gq.r")
    public int field2204;

    @ObfuscatedName("gq.l")
    public int field2205;

    @ObfuscatedName("gq.s")
    public int field2206;

    @ObfuscatedName("io.a(Llg;I)V")
    public static void method4663(class330 arg0) {
        Statics.field2201 = arg0;
    }

    @ObfuscatedName("gq.f(I)V")
    public void method3538() {
        if (this.field2200 != -1) {
            this.method3537(this.field2200);
            this.field2204 = this.field2207;
            this.field2205 = this.field2195;
            this.field2206 = this.field2203;
        }
        this.method3537(this.field2197);
    }

    @ObfuscatedName("gq.c(Lqr;IB)V")
    public void method3539(class464 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7735();
            if (var3 == 0) {
                return;
            }
            this.method3541(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gq.x(Lqr;III)V")
    public void method3541(class464 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2197 = arg0.method7906();
        } else if (arg1 == 2) {
            this.field2198 = arg0.method7735();
        } else if (arg1 == 5) {
            this.field2199 = false;
        } else if (arg1 == 7) {
            this.field2200 = arg0.method7906();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gq.h(IB)V")
    public void method3537(int arg0) {
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
        this.field2207 = (int) (var18 * 256.0D);
        this.field2195 = (int) (var14 * 256.0D);
        this.field2203 = (int) (var16 * 256.0D);
        if (this.field2195 < 0) {
            this.field2195 = 0;
        } else if (this.field2195 > 255) {
            this.field2195 = 255;
        }
        if (this.field2203 < 0) {
            this.field2203 = 0;
        } else if (this.field2203 > 255) {
            this.field2203 = 255;
        }
    }
}
