package deob;

@ObfuscatedName("ip")
public class class258 extends class206 {

    @ObfuscatedName("ip.v")
    public static class201 field3431 = new class201(64);

    @ObfuscatedName("ip.y")
    public int field3439 = 0;

    @ObfuscatedName("ip.r")
    public int field3434;

    @ObfuscatedName("ip.h")
    public int field3433;

    @ObfuscatedName("ip.d")
    public int field3436;

    @ObfuscatedName("ip.s")
    public int field3432;

    @ObfuscatedName("bh.n(II)Lip;")
    public static class258 method1036(int arg0) {
        class258 var1 = (class258) field3431.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3435.method3931(1, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4137(new class185(var2), arg0);
        }
        var3.method4136();
        field3431.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.v(I)V")
    public void method4136() {
        this.method4144(this.field3439);
    }

    @ObfuscatedName("ip.y(Lgv;II)V")
    public void method4137(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3021();
            if (var3 == 0) {
                return;
            }
            this.method4138(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ip.r(Lgv;III)V")
    public void method4138(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3439 = arg0.method3025();
        }
    }

    @ObfuscatedName("ip.h(II)V")
    public void method4144(int arg0) {
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
        this.field3433 = (int) (var14 * 256.0D);
        this.field3436 = (int) (var16 * 256.0D);
        if (this.field3433 < 0) {
            this.field3433 = 0;
        } else if (this.field3433 > 255) {
            this.field3433 = 255;
        }
        if (this.field3436 < 0) {
            this.field3436 = 0;
        } else if (this.field3436 > 255) {
            this.field3436 = 255;
        }
        if (var16 > 0.5D) {
            this.field3432 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3432 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3432 < 1) {
            this.field3432 = 1;
        }
        this.field3434 = (int) ((double) this.field3432 * var18);
    }

    @ObfuscatedName("ew.d(B)V")
    public static void method2712() {
        field3431.method3409();
    }
}
