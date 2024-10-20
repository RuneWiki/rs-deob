package deob;

@ObfuscatedName("ft")
public class class159 extends class143 {

    @ObfuscatedName("ft.r")
    public static class101 field2409 = new class101(64);

    @ObfuscatedName("ft.d")
    public int field2403 = 0;

    @ObfuscatedName("ft.k")
    public int field2406 = -1;

    @ObfuscatedName("ft.u")
    public boolean field2407 = true;

    @ObfuscatedName("ft.v")
    public int field2408 = -1;

    @ObfuscatedName("ft.f")
    public int field2404;

    @ObfuscatedName("ft.s")
    public int field2410;

    @ObfuscatedName("ft.j")
    public int field2411;

    @ObfuscatedName("ft.e")
    public int field2412;

    @ObfuscatedName("ft.t")
    public int field2413;

    @ObfuscatedName("ft.y")
    public int field2414;

    @ObfuscatedName("ft.u(B)V")
    public void method2495() {
        if (this.field2408 != -1) {
            this.method2500(this.field2408);
            this.field2412 = this.field2404;
            this.field2413 = this.field2410;
            this.field2414 = this.field2411;
        }
        this.method2500(this.field2403);
    }

    @ObfuscatedName("ft.v(Let;II)V")
    public void method2497(class136 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1602();
            if (var3 == 0) {
                return;
            }
            this.method2498(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ft.f(Let;III)V")
    public void method2498(class136 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2403 = arg0.method1606();
        } else if (arg1 == 2) {
            this.field2406 = arg0.method1602();
        } else if (arg1 == 5) {
            this.field2407 = false;
        } else if (arg1 == 7) {
            this.field2408 = arg0.method1606();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ft.s(II)V")
    public void method2500(int arg0) {
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
        this.field2404 = (int) (var18 * 256.0D);
        this.field2410 = (int) (var14 * 256.0D);
        this.field2411 = (int) (var16 * 256.0D);
        if (this.field2410 < 0) {
            this.field2410 = 0;
        } else if (this.field2410 > 255) {
            this.field2410 = 255;
        }
        if (this.field2411 < 0) {
            this.field2411 = 0;
        } else if (this.field2411 > 255) {
            this.field2411 = 255;
        }
    }
}
