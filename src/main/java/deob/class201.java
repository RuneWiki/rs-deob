package deob;

@ObfuscatedName("gv")
public class class201 extends class130 {

    @ObfuscatedName("gv.j")
    public static class125 field3051 = new class125(64);

    @ObfuscatedName("gv.c")
    public int field3043 = 0;

    @ObfuscatedName("gv.d")
    public int field3044 = -1;

    @ObfuscatedName("gv.w")
    public boolean field3045 = true;

    @ObfuscatedName("gv.h")
    public int field3046 = -1;

    @ObfuscatedName("gv.u")
    public int field3047;

    @ObfuscatedName("gv.k")
    public int field3048;

    @ObfuscatedName("gv.g")
    public int field3049;

    @ObfuscatedName("gv.y")
    public int field3050;

    @ObfuscatedName("gv.e")
    public int field3052;

    @ObfuscatedName("gv.q")
    public int field3042;

    @ObfuscatedName("ex.x(Lgk;I)V")
    public static void method2571(class183 arg0) {
        Statics.field3299 = arg0;
    }

    @ObfuscatedName("eo.j(II)Lgv;")
    public static class201 method2536(int arg0) {
        class201 var1 = (class201) field3051.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3299.method3121(4, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3536(new class154(var2), arg0);
        }
        var3.method3530();
        field3051.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.c(I)V")
    public void method3530() {
        if (this.field3046 != -1) {
            this.method3532(this.field3046);
            this.field3050 = this.field3047;
            this.field3052 = this.field3048;
            this.field3042 = this.field3049;
        }
        this.method3532(this.field3043);
    }

    @ObfuscatedName("gv.d(Lek;II)V")
    public void method3536(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2701();
            if (var3 == 0) {
                return;
            }
            this.method3533(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gv.w(Lek;III)V")
    public void method3533(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3043 = arg0.method2643();
        } else if (arg1 == 2) {
            this.field3044 = arg0.method2701();
        } else if (arg1 == 5) {
            this.field3045 = false;
        } else if (arg1 == 7) {
            this.field3046 = arg0.method2643();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gv.u(II)V")
    public void method3532(int arg0) {
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
        this.field3047 = (int) (var18 * 256.0D);
        this.field3048 = (int) (var14 * 256.0D);
        this.field3049 = (int) (var16 * 256.0D);
        if (this.field3048 < 0) {
            this.field3048 = 0;
        } else if (this.field3048 > 255) {
            this.field3048 = 255;
        }
        if (this.field3049 < 0) {
            this.field3049 = 0;
        } else if (this.field3049 > 255) {
            this.field3049 = 255;
        }
    }
}
