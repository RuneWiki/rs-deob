package deob;

@ObfuscatedName("gh")
public class class201 extends class130 {

    @ObfuscatedName("gh.i")
    public static class125 field3043 = new class125(64);

    @ObfuscatedName("gh.u")
    public int field3051 = 0;

    @ObfuscatedName("gh.h")
    public int field3046 = -1;

    @ObfuscatedName("gh.r")
    public boolean field3044 = true;

    @ObfuscatedName("gh.o")
    public int field3045 = -1;

    @ObfuscatedName("gh.l")
    public int field3049;

    @ObfuscatedName("gh.n")
    public int field3050;

    @ObfuscatedName("gh.m")
    public int field3055;

    @ObfuscatedName("gh.w")
    public int field3052;

    @ObfuscatedName("gh.j")
    public int field3053;

    @ObfuscatedName("gh.s")
    public int field3054;

    @ObfuscatedName("fl.f(II)Lgh;")
    public static class201 method2981(int arg0) {
        class201 var1 = (class201) field3043.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3048.method3163(4, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3537(new class154(var2), arg0);
        }
        var3.method3546();
        field3043.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.i(I)V")
    public void method3546() {
        if (this.field3045 != -1) {
            this.method3541(this.field3045);
            this.field3052 = this.field3049;
            this.field3053 = this.field3050;
            this.field3054 = this.field3055;
        }
        this.method3541(this.field3051);
    }

    @ObfuscatedName("gh.u(Leo;II)V")
    public void method3537(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2666();
            if (var3 == 0) {
                return;
            }
            this.method3540(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gh.r(Leo;III)V")
    public void method3540(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3051 = arg0.method2670();
        } else if (arg1 == 2) {
            this.field3046 = arg0.method2666();
        } else if (arg1 == 5) {
            this.field3044 = false;
        } else if (arg1 == 7) {
            this.field3045 = arg0.method2670();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gh.o(II)V")
    public void method3541(int arg0) {
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
        this.field3049 = (int) (var18 * 256.0D);
        this.field3050 = (int) (var14 * 256.0D);
        this.field3055 = (int) (var16 * 256.0D);
        if (this.field3050 < 0) {
            this.field3050 = 0;
        } else if (this.field3050 > 255) {
            this.field3050 = 255;
        }
        if (this.field3055 < 0) {
            this.field3055 = 0;
        } else if (this.field3055 > 255) {
            this.field3055 = 255;
        }
    }

    @ObfuscatedName("ci.l(I)V")
    public static void method1834() {
        field3043.method2244();
    }
}
