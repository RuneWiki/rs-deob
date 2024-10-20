package deob;

@ObfuscatedName("fk")
public class class164 extends class365 {

    @ObfuscatedName("fk.q")
    public static class236 field1772 = new class236(64);

    @ObfuscatedName("fk.f")
    public int field1773 = 0;

    @ObfuscatedName("fk.j")
    public int field1771;

    @ObfuscatedName("fk.m")
    public int field1775;

    @ObfuscatedName("fk.k")
    public int field1774;

    @ObfuscatedName("fk.t")
    public int field1777;

    @ObfuscatedName("kk.l(Lkl;I)V")
    public static void method4887(class290 arg0) {
        Statics.field1779 = arg0;
    }

    @ObfuscatedName("cs.q(II)Lfk;")
    public static class164 method2118(int arg0) {
        class164 var1 = (class164) field1772.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1779.method4756(1, arg0);
        class164 var3 = new class164();
        if (var2 != null) {
            var3.method2821(new class401(var2), arg0);
        }
        var3.method2820();
        field1772.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fk.f(I)V")
    public void method2820() {
        this.method2830(this.field1773);
    }

    @ObfuscatedName("fk.j(Lot;IB)V")
    public void method2821(class401 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6272();
            if (var3 == 0) {
                return;
            }
            this.method2834(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fk.m(Lot;IIB)V")
    public void method2834(class401 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1773 = arg0.method6276();
        }
    }

    @ObfuscatedName("fk.k(II)V")
    public void method2830(int arg0) {
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
        this.field1775 = (int) (var14 * 256.0D);
        this.field1774 = (int) (var16 * 256.0D);
        if (this.field1775 < 0) {
            this.field1775 = 0;
        } else if (this.field1775 > 255) {
            this.field1775 = 255;
        }
        if (this.field1774 < 0) {
            this.field1774 = 0;
        } else if (this.field1774 > 255) {
            this.field1774 = 255;
        }
        if (var16 > 0.5D) {
            this.field1777 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1777 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1777 < 1) {
            this.field1777 = 1;
        }
        this.field1771 = (int) ((double) this.field1777 * var18);
    }
}
