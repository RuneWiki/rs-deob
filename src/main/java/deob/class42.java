package deob;

@ObfuscatedName("av")
public class class42 extends class204 {

    @ObfuscatedName("av.f")
    public static class193 field965 = new class193(64);

    @ObfuscatedName("av.i")
    public int field966 = 0;

    @ObfuscatedName("av.h")
    public int field964;

    @ObfuscatedName("av.q")
    public int field972;

    @ObfuscatedName("av.u")
    public int field968;

    @ObfuscatedName("av.m")
    public int field970;

    @ObfuscatedName("s.o(II)Lav;")
    public static class42 method184(int arg0) {
        class42 var1 = (class42) field965.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field969.method3030(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method790(new class119(var2), arg0);
        }
        var3.method796();
        field965.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.f(I)V")
    public void method796() {
        this.method801(this.field966);
    }

    @ObfuscatedName("av.i(Ldc;II)V")
    public void method790(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2290();
            if (var3 == 0) {
                return;
            }
            this.method794(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.h(Ldc;IIB)V")
    public void method794(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field966 = arg0.method2477();
        }
    }

    @ObfuscatedName("av.q(II)V")
    public void method801(int arg0) {
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
        this.field972 = (int) (var14 * 256.0D);
        this.field968 = (int) (var16 * 256.0D);
        if (this.field972 < 0) {
            this.field972 = 0;
        } else if (this.field972 > 255) {
            this.field972 = 255;
        }
        if (this.field968 < 0) {
            this.field968 = 0;
        } else if (this.field968 > 255) {
            this.field968 = 255;
        }
        if (var16 > 0.5D) {
            this.field970 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field970 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field970 < 1) {
            this.field970 = 1;
        }
        this.field964 = (int) ((double) this.field970 * var18);
    }
}
