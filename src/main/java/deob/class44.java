package deob;

@ObfuscatedName("ap")
public class class44 extends class208 {

    @ObfuscatedName("ap.h")
    public static class197 field997 = new class197(64);

    @ObfuscatedName("ap.e")
    public int field998 = 0;

    @ObfuscatedName("ap.g")
    public int field1006;

    @ObfuscatedName("ap.n")
    public int field1000;

    @ObfuscatedName("ap.u")
    public int field999;

    @ObfuscatedName("ap.d")
    public int field1002;

    @ObfuscatedName("ar.i(Lfu;I)V")
    public static void method721(class171 arg0) {
        Statics.field1001 = arg0;
    }

    @ObfuscatedName("ap.h(I)V")
    public void method849() {
        this.method852(this.field998);
    }

    @ObfuscatedName("ap.e(Ldn;II)V")
    public void method860(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2404();
            if (var3 == 0) {
                return;
            }
            this.method851(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ap.g(Ldn;III)V")
    public void method851(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field998 = arg0.method2408();
        }
    }

    @ObfuscatedName("ap.n(II)V")
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
        this.field1000 = (int) (var14 * 256.0D);
        this.field999 = (int) (var16 * 256.0D);
        if (this.field1000 < 0) {
            this.field1000 = 0;
        } else if (this.field1000 > 255) {
            this.field1000 = 255;
        }
        if (this.field999 < 0) {
            this.field999 = 0;
        } else if (this.field999 > 255) {
            this.field999 = 255;
        }
        if (var16 > 0.5D) {
            this.field1002 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1002 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1002 < 1) {
            this.field1002 = 1;
        }
        this.field1006 = (int) ((double) this.field1002 * var18);
    }
}
