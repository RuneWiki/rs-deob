package deob;

@ObfuscatedName("gv")
public class class192 extends class130 {

    @ObfuscatedName("gv.y")
    public static class125 field2795 = new class125(64);

    @ObfuscatedName("gv.o")
    public int field2791 = 0;

    @ObfuscatedName("gv.r")
    public int field2792;

    @ObfuscatedName("gv.w")
    public int field2790;

    @ObfuscatedName("gv.j")
    public int field2789;

    @ObfuscatedName("gv.q")
    public int field2797;

    @ObfuscatedName("gv.k(I)V")
    public void method3260() {
        this.method3265(this.field2791);
    }

    @ObfuscatedName("gv.y(Lfm;II)V")
    public void method3271(class161 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2733();
            if (var3 == 0) {
                return;
            }
            this.method3261(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gv.o(Lfm;IIB)V")
    public void method3261(class161 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2791 = arg0.method2876();
        }
    }

    @ObfuscatedName("gv.r(IS)V")
    public void method3265(int arg0) {
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
        this.field2790 = (int) (var14 * 256.0D);
        this.field2789 = (int) (var16 * 256.0D);
        if (this.field2790 < 0) {
            this.field2790 = 0;
        } else if (this.field2790 > 255) {
            this.field2790 = 255;
        }
        if (this.field2789 < 0) {
            this.field2789 = 0;
        } else if (this.field2789 > 255) {
            this.field2789 = 255;
        }
        if (var16 > 0.5D) {
            this.field2797 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2797 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2797 < 1) {
            this.field2797 = 1;
        }
        this.field2792 = (int) ((double) this.field2797 * var18);
    }
}
