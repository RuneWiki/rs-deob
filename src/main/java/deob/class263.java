package deob;

@ObfuscatedName("jr")
public class class263 extends class198 {

    @ObfuscatedName("jr.o")
    public static class193 field3604 = new class193(64);

    @ObfuscatedName("jr.x")
    public int field3605 = 0;

    @ObfuscatedName("jr.k")
    public int field3611 = -1;

    @ObfuscatedName("jr.f")
    public boolean field3607 = true;

    @ObfuscatedName("jr.i")
    public int field3608 = -1;

    @ObfuscatedName("jr.j")
    public int field3609;

    @ObfuscatedName("jr.m")
    public int field3610;

    @ObfuscatedName("jr.u")
    public int field3615;

    @ObfuscatedName("jr.r")
    public int field3612;

    @ObfuscatedName("jr.v")
    public int field3613;

    @ObfuscatedName("jr.h")
    public int field3614;

    @ObfuscatedName("ce.w(Liq;I)V")
    public static void method1534(class239 arg0) {
        Statics.field3606 = arg0;
    }

    @ObfuscatedName("iv.o(II)Ljr;")
    public static class263 method3829(int arg0) {
        class263 var1 = (class263) field3604.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3606.method3754(4, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4315(new class177(var2), arg0);
        }
        var3.method4318();
        field3604.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jr.x(I)V")
    public void method4318() {
        if (this.field3608 != -1) {
            this.method4327(this.field3608);
            this.field3612 = this.field3609;
            this.field3613 = this.field3610;
            this.field3614 = this.field3615;
        }
        this.method4327(this.field3605);
    }

    @ObfuscatedName("jr.k(Lfi;II)V")
    public void method4315(class177 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2931();
            if (var3 == 0) {
                return;
            }
            this.method4336(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jr.f(Lfi;III)V")
    public void method4336(class177 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3605 = arg0.method2888();
        } else if (arg1 == 2) {
            this.field3611 = arg0.method2931();
        } else if (arg1 == 5) {
            this.field3607 = false;
        } else if (arg1 == 7) {
            this.field3608 = arg0.method2888();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jr.i(II)V")
    public void method4327(int arg0) {
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
        this.field3609 = (int) (var18 * 256.0D);
        this.field3610 = (int) (var14 * 256.0D);
        this.field3615 = (int) (var16 * 256.0D);
        if (this.field3610 < 0) {
            this.field3610 = 0;
        } else if (this.field3610 > 255) {
            this.field3610 = 255;
        }
        if (this.field3615 < 0) {
            this.field3615 = 0;
        } else if (this.field3615 > 255) {
            this.field3615 = 255;
        }
    }

    @ObfuscatedName("fu.j(I)V")
    public static void method2824() {
        field3604.method3242();
    }
}
