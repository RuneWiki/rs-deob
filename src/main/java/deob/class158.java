package deob;

@ObfuscatedName("fp")
public class class158 extends class142 {

    @ObfuscatedName("fp.l")
    public static class100 field2399 = new class100(64);

    @ObfuscatedName("fp.i")
    public int field2400 = 0;

    @ObfuscatedName("fp.e")
    public int field2401 = -1;

    @ObfuscatedName("fp.a")
    public boolean field2402 = true;

    @ObfuscatedName("fp.g")
    public int field2403 = -1;

    @ObfuscatedName("fp.w")
    public int field2408;

    @ObfuscatedName("fp.v")
    public int field2405;

    @ObfuscatedName("fp.u")
    public int field2406;

    @ObfuscatedName("fp.m")
    public int field2407;

    @ObfuscatedName("fp.b")
    public int field2404;

    @ObfuscatedName("fp.f")
    public int field2409;

    @ObfuscatedName("fp.i(I)V")
    public void method2459() {
        if (this.field2403 != -1) {
            this.method2472(this.field2403);
            this.field2407 = this.field2408;
            this.field2404 = this.field2405;
            this.field2409 = this.field2406;
        }
        this.method2472(this.field2400);
    }

    @ObfuscatedName("fp.e(Lec;IB)V")
    public void method2460(class135 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1571();
            if (var3 == 0) {
                return;
            }
            this.method2461(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fp.a(Lec;III)V")
    public void method2461(class135 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2400 = arg0.method1575();
        } else if (arg1 == 2) {
            this.field2401 = arg0.method1571();
        } else if (arg1 == 5) {
            this.field2402 = false;
        } else if (arg1 == 7) {
            this.field2403 = arg0.method1575();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("fp.g(II)V")
    public void method2472(int arg0) {
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
        this.field2408 = (int) (var18 * 256.0D);
        this.field2405 = (int) (var14 * 256.0D);
        this.field2406 = (int) (var16 * 256.0D);
        if (this.field2405 < 0) {
            this.field2405 = 0;
        } else if (this.field2405 > 255) {
            this.field2405 = 255;
        }
        if (this.field2406 < 0) {
            this.field2406 = 0;
        } else if (this.field2406 > 255) {
            this.field2406 = 255;
        }
    }

    @ObfuscatedName("t.w(I)V")
    public static void method8() {
        field2399.method1221();
    }
}
