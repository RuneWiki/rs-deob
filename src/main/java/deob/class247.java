package deob;

@ObfuscatedName("iy")
public class class247 extends class195 {

    @ObfuscatedName("iy.c")
    public static class190 field3339 = new class190(64);

    @ObfuscatedName("iy.e")
    public int field3340 = 0;

    @ObfuscatedName("iy.v")
    public int field3338;

    @ObfuscatedName("iy.b")
    public int field3342;

    @ObfuscatedName("iy.y")
    public int field3344;

    @ObfuscatedName("iy.h")
    public int field3343;

    @ObfuscatedName("ap.i(II)Liy;")
    public static class247 method454(int arg0) {
        class247 var1 = (class247) field3339.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3346.method3769(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4002(new class174(var2), arg0);
        }
        var3.method4001();
        field3339.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.c(B)V")
    public void method4001() {
        this.method4015(this.field3340);
    }

    @ObfuscatedName("iy.e(Lfx;II)V")
    public void method4002(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2870();
            if (var3 == 0) {
                return;
            }
            this.method4003(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iy.v(Lfx;IIB)V")
    public void method4003(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3340 = arg0.method2874();
        }
    }

    @ObfuscatedName("iy.b(IB)V")
    public void method4015(int arg0) {
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
        this.field3342 = (int) (var14 * 256.0D);
        this.field3344 = (int) (var16 * 256.0D);
        if (this.field3342 < 0) {
            this.field3342 = 0;
        } else if (this.field3342 > 255) {
            this.field3342 = 255;
        }
        if (this.field3344 < 0) {
            this.field3344 = 0;
        } else if (this.field3344 > 255) {
            this.field3344 = 255;
        }
        if (var16 > 0.5D) {
            this.field3343 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3343 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3343 < 1) {
            this.field3343 = 1;
        }
        this.field3338 = (int) ((double) this.field3343 * var18);
    }
}
