package deob;

@ObfuscatedName("fa")
public class class174 extends class387 {

    @ObfuscatedName("fa.l")
    public static class249 field1919 = new class249(64);

    @ObfuscatedName("fa.s")
    public int field1914 = 0;

    @ObfuscatedName("fa.e")
    public int field1916;

    @ObfuscatedName("fa.r")
    public int field1917;

    @ObfuscatedName("fa.o")
    public int field1918;

    @ObfuscatedName("fa.i")
    public int field1913;

    @ObfuscatedName("fa.c(B)V")
    public void method3023() {
        this.method3026(this.field1914);
    }

    @ObfuscatedName("fa.l(Lpi;IB)V")
    public void method3027(class421 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6686();
            if (var3 == 0) {
                return;
            }
            this.method3038(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fa.s(Lpi;III)V")
    public void method3038(class421 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1914 = arg0.method6668();
        }
    }

    @ObfuscatedName("fa.e(II)V")
    public void method3026(int arg0) {
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
        this.field1917 = (int) (var14 * 256.0D);
        this.field1918 = (int) (var16 * 256.0D);
        if (this.field1917 < 0) {
            this.field1917 = 0;
        } else if (this.field1917 > 255) {
            this.field1917 = 255;
        }
        if (this.field1918 < 0) {
            this.field1918 = 0;
        } else if (this.field1918 > 255) {
            this.field1918 = 255;
        }
        if (var16 > 0.5D) {
            this.field1913 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1913 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1913 < 1) {
            this.field1913 = 1;
        }
        this.field1916 = (int) ((double) this.field1913 * var18);
    }

    @ObfuscatedName("aq.r(B)V")
    public static void method627() {
        field1919.method4475();
    }
}
