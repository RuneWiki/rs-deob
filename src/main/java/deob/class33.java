package deob;

@ObfuscatedName("al")
public class class33 extends class174 {

    @ObfuscatedName("al.c")
    public static class170 field867 = new class170(64);

    @ObfuscatedName("al.p")
    public int field875 = 0;

    @ObfuscatedName("al.z")
    public int field873;

    @ObfuscatedName("al.m")
    public int field870;

    @ObfuscatedName("al.k")
    public int field871;

    @ObfuscatedName("al.v")
    public int field872;

    @ObfuscatedName("r.q(IB)Lal;")
    public static class33 method123(int arg0) {
        class33 var1 = (class33) field867.method3215((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field868.method2952(1, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method688(new class127(var2), arg0);
        }
        var3.method687();
        field867.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.c(I)V")
    public void method687() {
        this.method693(this.field875);
    }

    @ObfuscatedName("al.p(Ldo;II)V")
    public void method688(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2534();
            if (var3 == 0) {
                return;
            }
            this.method702(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("al.z(Ldo;IIB)V")
    public void method702(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field875 = arg0.method2429();
        }
    }

    @ObfuscatedName("al.m(IS)V")
    public void method693(int arg0) {
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
        this.field870 = (int) (var14 * 256.0D);
        this.field871 = (int) (var16 * 256.0D);
        if (this.field870 < 0) {
            this.field870 = 0;
        } else if (this.field870 > 255) {
            this.field870 = 255;
        }
        if (this.field871 < 0) {
            this.field871 = 0;
        } else if (this.field871 > 255) {
            this.field871 = 255;
        }
        if (var16 > 0.5D) {
            this.field872 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field872 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field872 < 1) {
            this.field872 = 1;
        }
        this.field873 = (int) ((double) this.field872 * var18);
    }

    @ObfuscatedName("fo.k(I)V")
    public static void method3163() {
        field867.method3218();
    }
}
