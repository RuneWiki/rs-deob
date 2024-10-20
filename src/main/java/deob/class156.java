package deob;

@ObfuscatedName("eo")
public class class156 extends class347 {

    @ObfuscatedName("eo.n")
    public static class221 field1861 = new class221(64);

    @ObfuscatedName("eo.f")
    public int field1866 = 0;

    @ObfuscatedName("eo.y")
    public int field1863 = -1;

    @ObfuscatedName("eo.p")
    public boolean field1864 = true;

    @ObfuscatedName("eo.j")
    public int field1865 = -1;

    @ObfuscatedName("eo.r")
    public int field1862;

    @ObfuscatedName("eo.b")
    public int field1868;

    @ObfuscatedName("eo.d")
    public int field1873;

    @ObfuscatedName("eo.s")
    public int field1869;

    @ObfuscatedName("eo.u")
    public int field1870;

    @ObfuscatedName("eo.l")
    public int field1871;

    @ObfuscatedName("bq.v(II)Leo;")
    public static class156 method685(int arg0) {
        class156 var1 = (class156) field1861.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1611.method4468(4, arg0);
        class156 var3 = new class156();
        if (var2 != null) {
            var3.method2857(new class383(var2), arg0);
        }
        var3.method2848();
        field1861.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eo.n(I)V")
    public void method2848() {
        if (this.field1865 != -1) {
            this.method2851(this.field1865);
            this.field1869 = this.field1862;
            this.field1870 = this.field1868;
            this.field1871 = this.field1873;
        }
        this.method2851(this.field1866);
    }

    @ObfuscatedName("eo.f(Lnd;II)V")
    public void method2857(class383 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5965();
            if (var3 == 0) {
                return;
            }
            this.method2850(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("eo.y(Lnd;III)V")
    public void method2850(class383 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1866 = arg0.method5969();
        } else if (arg1 == 2) {
            this.field1863 = arg0.method5965();
        } else if (arg1 == 5) {
            this.field1864 = false;
        } else if (arg1 == 7) {
            this.field1865 = arg0.method5969();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("eo.p(II)V")
    public void method2851(int arg0) {
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
        this.field1862 = (int) (var18 * 256.0D);
        this.field1868 = (int) (var14 * 256.0D);
        this.field1873 = (int) (var16 * 256.0D);
        if (this.field1868 < 0) {
            this.field1868 = 0;
        } else if (this.field1868 > 255) {
            this.field1868 = 255;
        }
        if (this.field1873 < 0) {
            this.field1873 = 0;
        } else if (this.field1873 > 255) {
            this.field1873 = 255;
        }
    }
}
