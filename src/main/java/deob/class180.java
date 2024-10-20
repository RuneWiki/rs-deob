package deob;

@ObfuscatedName("ad")
public class class180 extends class77 {

    @ObfuscatedName("ad.n")
    public int field2675;

    @ObfuscatedName("ad.o")
    public int field2671 = 0;

    @ObfuscatedName("ad.h")
    public int field2681;

    @ObfuscatedName("ad.t")
    public int field2672;

    @ObfuscatedName("ad.r")
    public int field2674;

    @ObfuscatedName("ad.p")
    public static class67 field2680 = new class67(64);

    @ObfuscatedName("ad.p(I)V")
    public void method3414() {
        this.method3417(this.field2671);
    }

    @ObfuscatedName("ad.o(Ldy;II)V")
    public void method3415(class31 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method512();
            if (var3 == 0) {
                return;
            }
            this.method3416(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ad.t(Ldy;III)V")
    public void method3416(class31 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2671 = arg0.method375();
        }
    }

    @ObfuscatedName("ad.h(II)V")
    public void method3417(int arg0) {
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
        this.field2681 = (int) (var14 * 256.0D);
        this.field2674 = (int) (var16 * 256.0D);
        if (this.field2681 < 0) {
            this.field2681 = 0;
        } else if (this.field2681 > 255) {
            this.field2681 = 255;
        }
        if (this.field2674 < 0) {
            this.field2674 = 0;
        } else if (this.field2674 > 255) {
            this.field2674 = 255;
        }
        if (var16 > 0.5D) {
            this.field2675 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2675 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2675 < 1) {
            this.field2675 = 1;
        }
        this.field2672 = (int) ((double) this.field2675 * var18);
    }

    @ObfuscatedName("b.j(II)Lad;")
    public static class180 method857(int arg0) {
        class180 var1 = (class180) field2680.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2673.method1083(1, arg0);
        class180 var3 = new class180();
        if (var2 != null) {
            var3.method3415(new class31(var2), arg0);
        }
        var3.method3414();
        field2680.method907(var3, (long) arg0);
        return var3;
    }
}
