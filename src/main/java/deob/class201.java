package deob;

@ObfuscatedName("gi")
public class class201 extends class130 {

    @ObfuscatedName("gi.d")
    public static class125 field3042 = new class125(64);

    @ObfuscatedName("gi.h")
    public int field3051 = 0;

    @ObfuscatedName("gi.p")
    public int field3040 = -1;

    @ObfuscatedName("gi.j")
    public boolean field3041 = true;

    @ObfuscatedName("gi.n")
    public int field3044 = -1;

    @ObfuscatedName("gi.r")
    public int field3045;

    @ObfuscatedName("gi.c")
    public int field3046;

    @ObfuscatedName("gi.i")
    public int field3047;

    @ObfuscatedName("gi.o")
    public int field3048;

    @ObfuscatedName("gi.m")
    public int field3049;

    @ObfuscatedName("gi.s")
    public int field3050;

    @ObfuscatedName("dm.q(Lgj;I)V")
    public static void method2009(class183 arg0) {
        Statics.field3039 = arg0;
    }

    @ObfuscatedName("gk.d(II)Lgi;")
    public static class201 method3540(int arg0) {
        class201 var1 = (class201) field3042.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3039.method3133(4, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3561(new class154(var2), arg0);
        }
        var3.method3560();
        field3042.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.h(I)V")
    public void method3560() {
        if (this.field3044 != -1) {
            this.method3566(this.field3044);
            this.field3048 = this.field3045;
            this.field3049 = this.field3046;
            this.field3050 = this.field3047;
        }
        this.method3566(this.field3051);
    }

    @ObfuscatedName("gi.p(Lel;II)V")
    public void method3561(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2666();
            if (var3 == 0) {
                return;
            }
            this.method3562(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gi.j(Lel;III)V")
    public void method3562(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3051 = arg0.method2718();
        } else if (arg1 == 2) {
            this.field3040 = arg0.method2666();
        } else if (arg1 == 5) {
            this.field3041 = false;
        } else if (arg1 == 7) {
            this.field3044 = arg0.method2718();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gi.n(II)V")
    public void method3566(int arg0) {
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
        this.field3045 = (int) (var18 * 256.0D);
        this.field3046 = (int) (var14 * 256.0D);
        this.field3047 = (int) (var16 * 256.0D);
        if (this.field3046 < 0) {
            this.field3046 = 0;
        } else if (this.field3046 > 255) {
            this.field3046 = 255;
        }
        if (this.field3047 < 0) {
            this.field3047 = 0;
        } else if (this.field3047 > 255) {
            this.field3047 = 255;
        }
    }

    @ObfuscatedName("fg.c(I)V")
    public static void method3031() {
        field3042.method2249();
    }
}
