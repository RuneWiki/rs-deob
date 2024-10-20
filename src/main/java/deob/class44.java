package deob;

@ObfuscatedName("as")
public class class44 extends class208 {

    @ObfuscatedName("as.w")
    public static class197 field996 = new class197(64);

    @ObfuscatedName("as.e")
    public int field1003 = 0;

    @ObfuscatedName("as.o")
    public int field998;

    @ObfuscatedName("as.g")
    public int field997;

    @ObfuscatedName("as.l")
    public int field1000;

    @ObfuscatedName("as.j")
    public int field1001;

    @ObfuscatedName("ag.m(Lfa;I)V")
    public static void method983(class171 arg0) {
        Statics.field995 = arg0;
    }

    @ObfuscatedName("as.w(I)V")
    public void method856() {
        this.method852(this.field1003);
    }

    @ObfuscatedName("as.e(Ldj;IB)V")
    public void method849(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2398();
            if (var3 == 0) {
                return;
            }
            this.method851(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("as.o(Ldj;III)V")
    public void method851(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1003 = arg0.method2418();
        }
    }

    @ObfuscatedName("as.g(II)V")
    public void method852(int arg0) {
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
        this.field997 = (int) (var14 * 256.0D);
        this.field1000 = (int) (var16 * 256.0D);
        if (this.field997 < 0) {
            this.field997 = 0;
        } else if (this.field997 > 255) {
            this.field997 = 255;
        }
        if (this.field1000 < 0) {
            this.field1000 = 0;
        } else if (this.field1000 > 255) {
            this.field1000 = 255;
        }
        if (var16 > 0.5D) {
            this.field1001 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1001 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1001 < 1) {
            this.field1001 = 1;
        }
        this.field998 = (int) ((double) this.field1001 * var18);
    }
}
