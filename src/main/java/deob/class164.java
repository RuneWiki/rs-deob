package deob;

@ObfuscatedName("as")
public class class164 extends class77 {

    @ObfuscatedName("as.f")
    public int field2462;

    @ObfuscatedName("as.g")
    public int field2463;

    @ObfuscatedName("as.e")
    public int field2464;

    @ObfuscatedName("as.n")
    public int field2471;

    @ObfuscatedName("as.o")
    public int field2473 = 0;

    @ObfuscatedName("as.h")
    public boolean field2460 = true;

    @ObfuscatedName("as.t")
    public int field2459 = -1;

    @ObfuscatedName("as.r")
    public int field2465 = -1;

    @ObfuscatedName("as.p")
    public static class67 field2457 = new class67(64);

    @ObfuscatedName("as.z")
    public int field2461;

    @ObfuscatedName("as.x")
    public int field2466;

    @ObfuscatedName("as.o(Ldy;IS)V")
    public void method3104(class31 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method512();
            if (var3 == 0) {
                return;
            }
            this.method3105(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("as.t(Ldy;III)V")
    public void method3105(class31 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2473 = arg0.method375();
        } else if (arg1 == 2) {
            this.field2459 = arg0.method512();
        } else if (arg1 == 5) {
            this.field2460 = false;
        } else if (arg1 == 7) {
            this.field2465 = arg0.method375();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("as.p(B)V")
    public void method3107() {
        if (this.field2465 != -1) {
            this.method3109(this.field2465);
            this.field2462 = this.field2471;
            this.field2466 = this.field2463;
            this.field2461 = this.field2464;
        }
        this.method3109(this.field2473);
    }

    @ObfuscatedName("as.h(II)V")
    public void method3109(int arg0) {
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
        this.field2471 = (int) (var18 * 256.0D);
        this.field2463 = (int) (var14 * 256.0D);
        this.field2464 = (int) (var16 * 256.0D);
        if (this.field2463 < 0) {
            this.field2463 = 0;
        } else if (this.field2463 > 255) {
            this.field2463 = 255;
        }
        if (this.field2464 < 0) {
            this.field2464 = 0;
        } else if (this.field2464 > 255) {
            this.field2464 = 255;
        }
    }

    @ObfuscatedName("du.j(IB)Las;")
    public static class164 method298(int arg0) {
        class164 var1 = (class164) field2457.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2458.method1083(4, arg0);
        class164 var3 = new class164();
        if (var2 != null) {
            var3.method3104(new class31(var2), arg0);
        }
        var3.method3107();
        field2457.method907(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.r(I)V")
    public static void method3282() {
        field2457.method910();
    }
}
