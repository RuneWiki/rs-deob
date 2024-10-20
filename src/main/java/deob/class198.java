package deob;

@ObfuscatedName("gk")
public class class198 extends class428 {

    @ObfuscatedName("gk.e")
    public static class269 field2265 = new class269(64);

    @ObfuscatedName("gk.v")
    public int field2266 = 0;

    @ObfuscatedName("gk.x")
    public int field2267 = -1;

    @ObfuscatedName("gk.m")
    public boolean field2268 = true;

    @ObfuscatedName("gk.q")
    public int field2269 = -1;

    @ObfuscatedName("gk.f")
    public int field2272;

    @ObfuscatedName("gk.r")
    public int field2270;

    @ObfuscatedName("gk.u")
    public int field2271;

    @ObfuscatedName("gk.b")
    public int field2273;

    @ObfuscatedName("gk.j")
    public int field2274;

    @ObfuscatedName("gk.g")
    public int field2275;

    @ObfuscatedName("gk.h(I)V")
    public void method3647() {
        if (this.field2269 != -1) {
            this.method3659(this.field2269);
            this.field2273 = this.field2272;
            this.field2274 = this.field2270;
            this.field2275 = this.field2271;
        }
        this.method3659(this.field2266);
    }

    @ObfuscatedName("gk.e(Lqy;II)V")
    public void method3648(class467 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7792();
            if (var3 == 0) {
                return;
            }
            this.method3649(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gk.v(Lqy;III)V")
    public void method3649(class467 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2266 = arg0.method7796();
        } else if (arg1 == 2) {
            this.field2267 = arg0.method7792();
        } else if (arg1 == 5) {
            this.field2268 = false;
        } else if (arg1 == 7) {
            this.field2269 = arg0.method7796();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gk.x(II)V")
    public void method3659(int arg0) {
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
        this.field2272 = (int) (var18 * 256.0D);
        this.field2270 = (int) (var14 * 256.0D);
        this.field2271 = (int) (var16 * 256.0D);
        if (this.field2270 < 0) {
            this.field2270 = 0;
        } else if (this.field2270 > 255) {
            this.field2270 = 255;
        }
        if (this.field2271 < 0) {
            this.field2271 = 0;
        } else if (this.field2271 > 255) {
            this.field2271 = 255;
        }
    }

    @ObfuscatedName("eu.m(B)V")
    public static void method3016() {
        field2265.method4918();
    }
}
