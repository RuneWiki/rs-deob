package deob;

@ObfuscatedName("gc")
public class class190 extends class404 {

    @ObfuscatedName("gc.c")
    public static class257 field2133 = new class257(64);

    @ObfuscatedName("gc.i")
    public int field2125 = 0;

    @ObfuscatedName("gc.f")
    public int field2127 = -1;

    @ObfuscatedName("gc.b")
    public boolean field2128 = true;

    @ObfuscatedName("gc.n")
    public int field2129 = -1;

    @ObfuscatedName("gc.s")
    public int field2124;

    @ObfuscatedName("gc.l")
    public int field2130;

    @ObfuscatedName("gc.q")
    public int field2132;

    @ObfuscatedName("gc.o")
    public int field2126;

    @ObfuscatedName("gc.r")
    public int field2131;

    @ObfuscatedName("gc.p")
    public int field2135;

    @ObfuscatedName("fr.v(IB)Lgc;")
    public static class190 method3018(int arg0) {
        class190 var1 = (class190) field2133.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2134.method5296(4, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3441(new class438(var2), arg0);
        }
        var3.method3436();
        field2133.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.c(I)V")
    public void method3436() {
        if (this.field2129 != -1) {
            this.method3439(this.field2129);
            this.field2126 = this.field2124;
            this.field2131 = this.field2130;
            this.field2135 = this.field2132;
        }
        this.method3439(this.field2125);
    }

    @ObfuscatedName("gc.i(Lpi;II)V")
    public void method3441(class438 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6971();
            if (var3 == 0) {
                return;
            }
            this.method3438(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gc.f(Lpi;III)V")
    public void method3438(class438 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2125 = arg0.method6975();
        } else if (arg1 == 2) {
            this.field2127 = arg0.method6971();
        } else if (arg1 == 5) {
            this.field2128 = false;
        } else if (arg1 == 7) {
            this.field2129 = arg0.method6975();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gc.b(II)V")
    public void method3439(int arg0) {
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
        this.field2124 = (int) (var18 * 256.0D);
        this.field2130 = (int) (var14 * 256.0D);
        this.field2132 = (int) (var16 * 256.0D);
        if (this.field2130 < 0) {
            this.field2130 = 0;
        } else if (this.field2130 > 255) {
            this.field2130 = 255;
        }
        if (this.field2132 < 0) {
            this.field2132 = 0;
        } else if (this.field2132 > 255) {
            this.field2132 = 255;
        }
    }
}
