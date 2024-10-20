package deob;

@ObfuscatedName("iy")
public class class245 extends class183 {

    @ObfuscatedName("iy.i")
    public static class155 field3227 = new class155(64);

    @ObfuscatedName("iy.y")
    public int field3228 = 0;

    @ObfuscatedName("iy.w")
    public int field3232;

    @ObfuscatedName("iy.p")
    public int field3226;

    @ObfuscatedName("iy.b")
    public int field3231;

    @ObfuscatedName("iy.e")
    public int field3230;

    @ObfuscatedName("hs.f(Lhz;I)V")
    public static void method3720(class234 arg0) {
        Statics.field3229 = arg0;
    }

    @ObfuscatedName("aa.i(IB)Liy;")
    public static class245 method342(int arg0) {
        class245 var1 = (class245) field3227.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3229.method3752(1, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method4028(new class300(var2), arg0);
        }
        var3.method4027();
        field3227.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.y(I)V")
    public void method4027() {
        this.method4030(this.field3228);
    }

    @ObfuscatedName("iy.w(Lkq;II)V")
    public void method4028(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5110();
            if (var3 == 0) {
                return;
            }
            this.method4029(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iy.p(Lkq;III)V")
    public void method4029(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3228 = arg0.method5226();
        }
    }

    @ObfuscatedName("iy.b(II)V")
    public void method4030(int arg0) {
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
        this.field3226 = (int) (var14 * 256.0D);
        this.field3231 = (int) (var16 * 256.0D);
        if (this.field3226 < 0) {
            this.field3226 = 0;
        } else if (this.field3226 > 255) {
            this.field3226 = 255;
        }
        if (this.field3231 < 0) {
            this.field3231 = 0;
        } else if (this.field3231 > 255) {
            this.field3231 = 255;
        }
        if (var16 > 0.5D) {
            this.field3230 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3230 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3230 < 1) {
            this.field3230 = 1;
        }
        this.field3232 = (int) ((double) this.field3230 * var18);
    }
}
