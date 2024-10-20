package deob;

@ObfuscatedName("hs")
public class class200 extends class469 {

    @ObfuscatedName("hs.ae")
    public static class288 field2114 = new class288(64);

    @ObfuscatedName("hs.ao")
    public int field2115 = 0;

    @ObfuscatedName("hs.at")
    public int field2121;

    @ObfuscatedName("hs.ac")
    public int field2117;

    @ObfuscatedName("hs.ai")
    public int field2116;

    @ObfuscatedName("hs.az")
    public int field2118;

    @ObfuscatedName("cc.au(Lnu;I)V")
    public static void method2075(class359 arg0) {
        Statics.field2113 = arg0;
    }

    @ObfuscatedName("hs.ae(I)V")
    public void method3479() {
        this.method3483(this.field2115);
    }

    @ObfuscatedName("hs.ao(Ltm;II)V")
    public void method3481(class515 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8300();
            if (var3 == 0) {
                return;
            }
            this.method3482(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hs.at(Ltm;IIB)V")
    public void method3482(class515 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2115 = arg0.method8466();
        }
    }

    @ObfuscatedName("hs.ac(II)V")
    public void method3483(int arg0) {
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
        this.field2117 = (int) (var14 * 256.0D);
        this.field2116 = (int) (var16 * 256.0D);
        if (this.field2117 < 0) {
            this.field2117 = 0;
        } else if (this.field2117 > 255) {
            this.field2117 = 255;
        }
        if (this.field2116 < 0) {
            this.field2116 = 0;
        } else if (this.field2116 > 255) {
            this.field2116 = 255;
        }
        if (var16 > 0.5D) {
            this.field2118 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2118 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2118 < 1) {
            this.field2118 = 1;
        }
        this.field2121 = (int) ((double) this.field2118 * var18);
    }
}
