package deob;

@ObfuscatedName("ie")
public class class212 extends class484 {

    @ObfuscatedName("ie.al")
    public static class302 field2130 = new class302(64);

    @ObfuscatedName("ie.ak")
    public int field2132 = 0;

    @ObfuscatedName("ie.ax")
    public int field2136;

    @ObfuscatedName("ie.ao")
    public int field2134;

    @ObfuscatedName("ie.ah")
    public int field2135;

    @ObfuscatedName("ie.ar")
    public int field2133;

    @ObfuscatedName("hz.ac(II)Lie;")
    public static class212 method3401(int arg0) {
        class212 var1 = (class212) field2130.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2131.method6342(1, arg0);
        class212 var3 = new class212();
        if (var2 != null) {
            var3.method3558(new class530(var2), arg0);
        }
        var3.method3561();
        field2130.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.al(I)V")
    public void method3561() {
        this.method3560(this.field2132);
    }

    @ObfuscatedName("ie.ak(Lul;II)V")
    public void method3558(class530 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8365();
            if (var3 == 0) {
                return;
            }
            this.method3559(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ie.ax(Lul;III)V")
    public void method3559(class530 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2132 = arg0.method8445();
        }
    }

    @ObfuscatedName("ie.ao(II)V")
    public void method3560(int arg0) {
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
        this.field2134 = (int) (var14 * 256.0D);
        this.field2135 = (int) (var16 * 256.0D);
        if (this.field2134 < 0) {
            this.field2134 = 0;
        } else if (this.field2134 > 255) {
            this.field2134 = 255;
        }
        if (this.field2135 < 0) {
            this.field2135 = 0;
        } else if (this.field2135 > 255) {
            this.field2135 = 255;
        }
        if (var16 > 0.5D) {
            this.field2133 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2133 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2133 < 1) {
            this.field2133 = 1;
        }
        this.field2136 = (int) ((double) this.field2133 * var18);
    }
}
