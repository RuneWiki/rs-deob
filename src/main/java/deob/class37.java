package deob;

@ObfuscatedName("am")
public class class37 extends class182 {

    @ObfuscatedName("am.s")
    public static class171 field879 = new class171(64);

    @ObfuscatedName("am.f")
    public int field880 = 0;

    @ObfuscatedName("am.e")
    public int field881;

    @ObfuscatedName("am.d")
    public int field878;

    @ObfuscatedName("am.n")
    public int field883;

    @ObfuscatedName("am.v")
    public int field885;

    @ObfuscatedName("j.t(Leg;B)V")
    public static void method108(class146 arg0) {
        Statics.field882 = arg0;
    }

    @ObfuscatedName("ee.s(II)Lam;")
    public static class37 method2690(int arg0) {
        class37 var1 = (class37) field879.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field882.method2709(1, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method672(new class107(var2), arg0);
        }
        var3.method674();
        field879.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.f(I)V")
    public void method674() {
        this.method673(this.field880);
    }

    @ObfuscatedName("am.e(Ldb;II)V")
    public void method672(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2101();
            if (var3 == 0) {
                return;
            }
            this.method671(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.d(Ldb;III)V")
    public void method671(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field880 = arg0.method2304();
        }
    }

    @ObfuscatedName("am.n(IB)V")
    public void method673(int arg0) {
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
        this.field878 = (int) (var14 * 256.0D);
        this.field883 = (int) (var16 * 256.0D);
        if (this.field878 < 0) {
            this.field878 = 0;
        } else if (this.field878 > 255) {
            this.field878 = 255;
        }
        if (this.field883 < 0) {
            this.field883 = 0;
        } else if (this.field883 > 255) {
            this.field883 = 255;
        }
        if (var16 > 0.5D) {
            this.field885 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field885 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field885 < 1) {
            this.field885 = 1;
        }
        this.field881 = (int) ((double) this.field885 * var18);
    }
}
