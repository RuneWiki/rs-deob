package deob;

@ObfuscatedName("fl")
public class class174 extends class382 {

    @ObfuscatedName("fl.b")
    public static class249 field1899 = new class249(64);

    @ObfuscatedName("fl.p")
    public int field1898 = 0;

    @ObfuscatedName("fl.m")
    public int field1900;

    @ObfuscatedName("fl.t")
    public int field1896;

    @ObfuscatedName("fl.s")
    public int field1897;

    @ObfuscatedName("fl.j")
    public int field1902;

    @ObfuscatedName("f.c(Lku;I)V")
    public static void method322(class302 arg0) {
        Statics.field1901 = arg0;
    }

    @ObfuscatedName("cl.b(IB)Lfl;")
    public static class174 method2047(int arg0) {
        class174 var1 = (class174) field1899.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1901.method5053(1, arg0);
        class174 var3 = new class174();
        if (var2 != null) {
            var3.method3057(new class419(var2), arg0);
        }
        var3.method3069();
        field1899.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fl.p(I)V")
    public void method3069() {
        this.method3059(this.field1898);
    }

    @ObfuscatedName("fl.m(Lpi;IB)V")
    public void method3057(class419 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6781();
            if (var3 == 0) {
                return;
            }
            this.method3058(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fl.t(Lpi;III)V")
    public void method3058(class419 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1898 = arg0.method6674();
        }
    }

    @ObfuscatedName("fl.s(II)V")
    public void method3059(int arg0) {
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
        this.field1896 = (int) (var14 * 256.0D);
        this.field1897 = (int) (var16 * 256.0D);
        if (this.field1896 < 0) {
            this.field1896 = 0;
        } else if (this.field1896 > 255) {
            this.field1896 = 255;
        }
        if (this.field1897 < 0) {
            this.field1897 = 0;
        } else if (this.field1897 > 255) {
            this.field1897 = 255;
        }
        if (var16 > 0.5D) {
            this.field1902 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1902 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1902 < 1) {
            this.field1902 = 1;
        }
        this.field1900 = (int) ((double) this.field1902 * var18);
    }
}
