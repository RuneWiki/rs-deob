package deob;

@ObfuscatedName("go")
public class class192 extends class130 {

    @ObfuscatedName("go.e")
    public static class125 field2814 = new class125(64);

    @ObfuscatedName("go.c")
    public int field2824 = 0;

    @ObfuscatedName("go.l")
    public int field2816;

    @ObfuscatedName("go.y")
    public int field2813;

    @ObfuscatedName("go.j")
    public int field2819;

    @ObfuscatedName("go.g")
    public int field2817;

    @ObfuscatedName("go.b(B)V")
    public void method3322() {
        this.method3324(this.field2824);
    }

    @ObfuscatedName("go.e(Lec;II)V")
    public void method3321(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2669();
            if (var3 == 0) {
                return;
            }
            this.method3325(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("go.c(Lec;IIB)V")
    public void method3325(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2824 = arg0.method2689();
        }
    }

    @ObfuscatedName("go.l(II)V")
    public void method3324(int arg0) {
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
        this.field2813 = (int) (var14 * 256.0D);
        this.field2819 = (int) (var16 * 256.0D);
        if (this.field2813 < 0) {
            this.field2813 = 0;
        } else if (this.field2813 > 255) {
            this.field2813 = 255;
        }
        if (this.field2819 < 0) {
            this.field2819 = 0;
        } else if (this.field2819 > 255) {
            this.field2819 = 255;
        }
        if (var16 > 0.5D) {
            this.field2817 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2817 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2817 < 1) {
            this.field2817 = 1;
        }
        this.field2816 = (int) ((double) this.field2817 * var18);
    }
}
