package deob;

@ObfuscatedName("fv")
public class class164 extends class364 {

    @ObfuscatedName("fv.c")
    public static class236 field1769 = new class236(64);

    @ObfuscatedName("fv.m")
    public int field1771 = 0;

    @ObfuscatedName("fv.k")
    public int field1772;

    @ObfuscatedName("fv.o")
    public int field1773;

    @ObfuscatedName("fv.g")
    public int field1774;

    @ObfuscatedName("fv.z")
    public int field1775;

    @ObfuscatedName("er.n(Lkk;I)V")
    public static void method2593(class290 arg0) {
        Statics.field1776 = arg0;
    }

    @ObfuscatedName("ei.c(II)Lfv;")
    public static class164 method2526(int arg0) {
        class164 var1 = (class164) field1769.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1776.method4710(1, arg0);
        class164 var3 = new class164();
        if (var2 != null) {
            var3.method2765(new class400(var2), arg0);
        }
        var3.method2776();
        field1769.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fv.m(I)V")
    public void method2776() {
        this.method2767(this.field1771);
    }

    @ObfuscatedName("fv.k(Lot;II)V")
    public void method2765(class400 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6217();
            if (var3 == 0) {
                return;
            }
            this.method2766(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fv.o(Lot;III)V")
    public void method2766(class400 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1771 = arg0.method6327();
        }
    }

    @ObfuscatedName("fv.g(IB)V")
    public void method2767(int arg0) {
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
        this.field1773 = (int) (var14 * 256.0D);
        this.field1774 = (int) (var16 * 256.0D);
        if (this.field1773 < 0) {
            this.field1773 = 0;
        } else if (this.field1773 > 255) {
            this.field1773 = 255;
        }
        if (this.field1774 < 0) {
            this.field1774 = 0;
        } else if (this.field1774 > 255) {
            this.field1774 = 255;
        }
        if (var16 > 0.5D) {
            this.field1775 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1775 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1775 < 1) {
            this.field1775 = 1;
        }
        this.field1772 = (int) ((double) this.field1775 * var18);
    }

    @ObfuscatedName("bw.z(I)V")
    public static void method1060() {
        field1769.method4168();
    }
}
