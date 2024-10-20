package deob;

@ObfuscatedName("ac")
public class class33 extends class174 {

    @ObfuscatedName("ac.c")
    public static class170 field864 = new class170(64);

    @ObfuscatedName("ac.j")
    public int field863 = 0;

    @ObfuscatedName("ac.i")
    public int field861;

    @ObfuscatedName("ac.k")
    public int field862;

    @ObfuscatedName("ac.q")
    public int field866;

    @ObfuscatedName("ac.t")
    public int field867;

    @ObfuscatedName("ac.b(B)V")
    public void method690() {
        this.method682(this.field863);
    }

    @ObfuscatedName("ac.c(Ldv;II)V")
    public void method680(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2416();
            if (var3 == 0) {
                return;
            }
            this.method675(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ac.j(Ldv;IIB)V")
    public void method675(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field863 = arg0.method2400();
        }
    }

    @ObfuscatedName("ac.i(II)V")
    public void method682(int arg0) {
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
        this.field862 = (int) (var14 * 256.0D);
        this.field866 = (int) (var16 * 256.0D);
        if (this.field862 < 0) {
            this.field862 = 0;
        } else if (this.field862 > 255) {
            this.field862 = 255;
        }
        if (this.field866 < 0) {
            this.field866 = 0;
        } else if (this.field866 > 255) {
            this.field866 = 255;
        }
        if (var16 > 0.5D) {
            this.field867 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field867 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field867 < 1) {
            this.field867 = 1;
        }
        this.field861 = (int) ((double) this.field867 * var18);
    }
}
