package deob;

@ObfuscatedName("gc")
public class class201 extends class130 {

    @ObfuscatedName("gc.x")
    public static class125 field3024 = new class125(64);

    @ObfuscatedName("gc.i")
    public int field3036 = 0;

    @ObfuscatedName("gc.a")
    public int field3031 = -1;

    @ObfuscatedName("gc.f")
    public boolean field3026 = true;

    @ObfuscatedName("gc.c")
    public int field3028 = -1;

    @ObfuscatedName("gc.d")
    public int field3029;

    @ObfuscatedName("gc.l")
    public int field3027;

    @ObfuscatedName("gc.g")
    public int field3023;

    @ObfuscatedName("gc.z")
    public int field3032;

    @ObfuscatedName("gc.t")
    public int field3033;

    @ObfuscatedName("gc.m")
    public int field3034;

    @ObfuscatedName("ef.u(Lgt;B)V")
    public static void method2557(class183 arg0) {
        Statics.field3030 = arg0;
    }

    @ObfuscatedName("de.x(II)Lgc;")
    public static class201 method1934(int arg0) {
        class201 var1 = (class201) field3024.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3030.method3071(4, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3522(new class154(var2), arg0);
        }
        var3.method3521();
        field3024.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.i(I)V")
    public void method3521() {
        if (this.field3028 != -1) {
            this.method3524(this.field3028);
            this.field3032 = this.field3029;
            this.field3033 = this.field3027;
            this.field3034 = this.field3023;
        }
        this.method3524(this.field3036);
    }

    @ObfuscatedName("gc.a(Len;II)V")
    public void method3522(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2708();
            if (var3 == 0) {
                return;
            }
            this.method3523(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gc.c(Len;IIS)V")
    public void method3523(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3036 = arg0.method2599();
        } else if (arg1 == 2) {
            this.field3031 = arg0.method2708();
        } else if (arg1 == 5) {
            this.field3026 = false;
        } else if (arg1 == 7) {
            this.field3028 = arg0.method2599();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gc.g(II)V")
    public void method3524(int arg0) {
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
        this.field3029 = (int) (var18 * 256.0D);
        this.field3027 = (int) (var14 * 256.0D);
        this.field3023 = (int) (var16 * 256.0D);
        if (this.field3027 < 0) {
            this.field3027 = 0;
        } else if (this.field3027 > 255) {
            this.field3027 = 255;
        }
        if (this.field3023 < 0) {
            this.field3023 = 0;
        } else if (this.field3023 > 255) {
            this.field3023 = 255;
        }
    }

    @ObfuscatedName("dl.z(B)V")
    public static void method1901() {
        field3024.method2176();
    }
}
