package deob;

@ObfuscatedName("gf")
public class class201 extends class130 {

    @ObfuscatedName("gf.l")
    public static class125 field3054 = new class125(64);

    @ObfuscatedName("gf.i")
    public int field3047 = 0;

    @ObfuscatedName("gf.t")
    public int field3049 = -1;

    @ObfuscatedName("gf.k")
    public boolean field3050 = true;

    @ObfuscatedName("gf.h")
    public int field3051 = -1;

    @ObfuscatedName("gf.n")
    public int field3048;

    @ObfuscatedName("gf.f")
    public int field3057;

    @ObfuscatedName("gf.a")
    public int field3046;

    @ObfuscatedName("gf.r")
    public int field3055;

    @ObfuscatedName("gf.x")
    public int field3056;

    @ObfuscatedName("gf.z")
    public int field3053;

    @ObfuscatedName("g.b(II)Lgf;")
    public static class201 method617(int arg0) {
        class201 var1 = (class201) field3054.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3052.method3226(4, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3643(new class154(var2), arg0);
        }
        var3.method3631();
        field3054.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.l(I)V")
    public void method3631() {
        if (this.field3051 != -1) {
            this.method3632(this.field3051);
            this.field3055 = this.field3048;
            this.field3056 = this.field3057;
            this.field3053 = this.field3046;
        }
        this.method3632(this.field3047);
    }

    @ObfuscatedName("gf.i(Leg;II)V")
    public void method3643(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2678();
            if (var3 == 0) {
                return;
            }
            this.method3628(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gf.t(Leg;III)V")
    public void method3628(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3047 = arg0.method2682();
        } else if (arg1 == 2) {
            this.field3049 = arg0.method2678();
        } else if (arg1 == 5) {
            this.field3050 = false;
        } else if (arg1 == 7) {
            this.field3051 = arg0.method2682();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gf.k(II)V")
    public void method3632(int arg0) {
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
        this.field3048 = (int) (var18 * 256.0D);
        this.field3057 = (int) (var14 * 256.0D);
        this.field3046 = (int) (var16 * 256.0D);
        if (this.field3057 < 0) {
            this.field3057 = 0;
        } else if (this.field3057 > 255) {
            this.field3057 = 255;
        }
        if (this.field3046 < 0) {
            this.field3046 = 0;
        } else if (this.field3046 > 255) {
            this.field3046 = 255;
        }
    }

    @ObfuscatedName("dm.x(I)V")
    public static void method1988() {
        field3054.method2257();
    }
}
