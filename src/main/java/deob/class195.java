package deob;

@ObfuscatedName("hz")
public class class195 extends class485 {

    @ObfuscatedName("hz.ap")
    public static class302 field2040 = new class302(64);

    @ObfuscatedName("hz.af")
    public int field2037 = 0;

    @ObfuscatedName("hz.aj")
    public int field2038;

    @ObfuscatedName("hz.aq")
    public int field2039;

    @ObfuscatedName("hz.ar")
    public int field2035;

    @ObfuscatedName("hz.ag")
    public int field2041;

    @ObfuscatedName("hy.am(Low;I)V")
    public static void method3579(class375 arg0) {
        Statics.field2036 = arg0;
    }

    @ObfuscatedName("fl.ap(II)Lhz;")
    public static class195 method3069(int arg0) {
        class195 var1 = (class195) field2040.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2036.method6396(1, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3503(new class531(var2), arg0);
        }
        var3.method3494();
        field2040.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hz.af(I)V")
    public void method3494() {
        this.method3506(this.field2037);
    }

    @ObfuscatedName("hz.aj(Luk;II)V")
    public void method3503(class531 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8561();
            if (var3 == 0) {
                return;
            }
            this.method3496(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hz.aq(Luk;IIB)V")
    public void method3496(class531 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2037 = arg0.method8688();
        }
    }

    @ObfuscatedName("hz.ar(II)V")
    public void method3506(int arg0) {
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
        this.field2039 = (int) (var14 * 256.0D);
        this.field2035 = (int) (var16 * 256.0D);
        if (this.field2039 < 0) {
            this.field2039 = 0;
        } else if (this.field2039 > 255) {
            this.field2039 = 255;
        }
        if (this.field2035 < 0) {
            this.field2035 = 0;
        } else if (this.field2035 > 255) {
            this.field2035 = 255;
        }
        if (var16 > 0.5D) {
            this.field2041 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2041 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2041 < 1) {
            this.field2041 = 1;
        }
        this.field2038 = (int) ((double) this.field2041 * var18);
    }

    @ObfuscatedName("ad.ag(I)V")
    public static void method141() {
        field2040.method5403();
    }
}
