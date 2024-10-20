package deob;

@ObfuscatedName("gz")
public class class202 extends class435 {

    @ObfuscatedName("gz.w")
    public static class273 field2278 = new class273(64);

    @ObfuscatedName("gz.v")
    public int field2268 = 0;

    @ObfuscatedName("gz.s")
    public int field2270 = -1;

    @ObfuscatedName("gz.z")
    public boolean field2281 = true;

    @ObfuscatedName("gz.j")
    public int field2272 = -1;

    @ObfuscatedName("gz.i")
    public int field2274;

    @ObfuscatedName("gz.n")
    public int field2269;

    @ObfuscatedName("gz.l")
    public int field2275;

    @ObfuscatedName("gz.k")
    public int field2276;

    @ObfuscatedName("gz.c")
    public int field2271;

    @ObfuscatedName("gz.r")
    public int field2277;

    @ObfuscatedName("cx.f(Lln;S)V")
    public static void method2300(class337 arg0) {
        Statics.field2273 = arg0;
    }

    @ObfuscatedName("gz.w(B)V")
    public void method3727() {
        if (this.field2272 != -1) {
            this.method3730(this.field2272);
            this.field2276 = this.field2274;
            this.field2271 = this.field2269;
            this.field2277 = this.field2275;
        }
        this.method3730(this.field2268);
    }

    @ObfuscatedName("gz.v(Lrd;II)V")
    public void method3740(class474 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7964();
            if (var3 == 0) {
                return;
            }
            this.method3729(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gz.s(Lrd;III)V")
    public void method3729(class474 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2268 = arg0.method8132();
        } else if (arg1 == 2) {
            this.field2270 = arg0.method7964();
        } else if (arg1 == 5) {
            this.field2281 = false;
        } else if (arg1 == 7) {
            this.field2272 = arg0.method8132();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gz.z(II)V")
    public void method3730(int arg0) {
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
        this.field2274 = (int) (var18 * 256.0D);
        this.field2269 = (int) (var14 * 256.0D);
        this.field2275 = (int) (var16 * 256.0D);
        if (this.field2269 < 0) {
            this.field2269 = 0;
        } else if (this.field2269 > 255) {
            this.field2269 = 255;
        }
        if (this.field2275 < 0) {
            this.field2275 = 0;
        } else if (this.field2275 > 255) {
            this.field2275 = 255;
        }
    }

    @ObfuscatedName("gk.j(I)V")
    public static void method3315() {
        field2278.method5033();
    }
}
