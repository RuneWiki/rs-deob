package deob;

@ObfuscatedName("gd")
public class class201 extends class130 {

    @ObfuscatedName("gd.m")
    public static class125 field3045 = new class125(64);

    @ObfuscatedName("gd.b")
    public int field3036 = 0;

    @ObfuscatedName("gd.g")
    public int field3037 = -1;

    @ObfuscatedName("gd.h")
    public boolean field3043 = true;

    @ObfuscatedName("gd.v")
    public int field3035 = -1;

    @ObfuscatedName("gd.l")
    public int field3038;

    @ObfuscatedName("gd.c")
    public int field3041;

    @ObfuscatedName("gd.u")
    public int field3042;

    @ObfuscatedName("gd.k")
    public int field3034;

    @ObfuscatedName("gd.z")
    public int field3044;

    @ObfuscatedName("gd.y")
    public int field3039;

    @ObfuscatedName("cq.o(II)Lgd;")
    public static class201 method1770(int arg0) {
        class201 var1 = (class201) field3045.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3040.method3012(4, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3449(new class154(var2), arg0);
        }
        var3.method3448();
        field3045.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gd.m(I)V")
    public void method3448() {
        if (this.field3035 != -1) {
            this.method3456(this.field3035);
            this.field3034 = this.field3038;
            this.field3044 = this.field3041;
            this.field3039 = this.field3042;
        }
        this.method3456(this.field3036);
    }

    @ObfuscatedName("gd.b(Lez;II)V")
    public void method3449(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2552();
            if (var3 == 0) {
                return;
            }
            this.method3450(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gd.g(Lez;III)V")
    public void method3450(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3036 = arg0.method2556();
        } else if (arg1 == 2) {
            this.field3037 = arg0.method2552();
        } else if (arg1 == 5) {
            this.field3043 = false;
        } else if (arg1 == 7) {
            this.field3035 = arg0.method2556();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gd.l(II)V")
    public void method3456(int arg0) {
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
        this.field3038 = (int) (var18 * 256.0D);
        this.field3041 = (int) (var14 * 256.0D);
        this.field3042 = (int) (var16 * 256.0D);
        if (this.field3041 < 0) {
            this.field3041 = 0;
        } else if (this.field3041 > 255) {
            this.field3041 = 255;
        }
        if (this.field3042 < 0) {
            this.field3042 = 0;
        } else if (this.field3042 > 255) {
            this.field3042 = 255;
        }
    }
}
