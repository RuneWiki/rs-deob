package deob;

@ObfuscatedName("aq")
public class class33 extends class174 {

    @ObfuscatedName("aq.m")
    public static class170 field856 = new class170(64);

    @ObfuscatedName("aq.v")
    public int field857 = 0;

    @ObfuscatedName("aq.r")
    public int field859;

    @ObfuscatedName("aq.n")
    public int field860;

    @ObfuscatedName("aq.i")
    public int field861;

    @ObfuscatedName("aq.s")
    public int field862;

    @ObfuscatedName("v.g(II)Laq;")
    public static class33 method25(int arg0) {
        class33 var1 = (class33) field856.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field858.method2968(1, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method682(new class127(var2), arg0);
        }
        var3.method681();
        field856.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.m(I)V")
    public void method681() {
        this.method684(this.field857);
    }

    @ObfuscatedName("aq.v(Ldr;II)V")
    public void method682(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2414();
            if (var3 == 0) {
                return;
            }
            this.method683(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aq.r(Ldr;III)V")
    public void method683(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field857 = arg0.method2479();
        }
    }

    @ObfuscatedName("aq.n(II)V")
    public void method684(int arg0) {
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
        this.field860 = (int) (var14 * 256.0D);
        this.field861 = (int) (var16 * 256.0D);
        if (this.field860 < 0) {
            this.field860 = 0;
        } else if (this.field860 > 255) {
            this.field860 = 255;
        }
        if (this.field861 < 0) {
            this.field861 = 0;
        } else if (this.field861 > 255) {
            this.field861 = 255;
        }
        if (var16 > 0.5D) {
            this.field862 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field862 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field862 < 1) {
            this.field862 = 1;
        }
        this.field859 = (int) ((double) this.field862 * var18);
    }
}
