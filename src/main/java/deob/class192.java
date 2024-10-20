package deob;

@ObfuscatedName("gc")
public class class192 extends class130 {

    @ObfuscatedName("gc.d")
    public static class125 field2818 = new class125(64);

    @ObfuscatedName("gc.h")
    public int field2814 = 0;

    @ObfuscatedName("gc.p")
    public int field2815;

    @ObfuscatedName("gc.j")
    public int field2813;

    @ObfuscatedName("gc.n")
    public int field2817;

    @ObfuscatedName("gc.r")
    public int field2816;

    @ObfuscatedName("fk.q(Lgj;B)V")
    public static void method2886(class183 arg0) {
        Statics.field2042 = arg0;
    }

    @ObfuscatedName("gc.d(I)V")
    public void method3291() {
        this.method3294(this.field2814);
    }

    @ObfuscatedName("gc.h(Lel;II)V")
    public void method3292(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2666();
            if (var3 == 0) {
                return;
            }
            this.method3293(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gc.p(Lel;III)V")
    public void method3293(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2814 = arg0.method2718();
        }
    }

    @ObfuscatedName("gc.j(IB)V")
    public void method3294(int arg0) {
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
        this.field2817 = (int) (var16 * 256.0D);
        if (this.field2813 < 0) {
            this.field2813 = 0;
        } else if (this.field2813 > 255) {
            this.field2813 = 255;
        }
        if (this.field2817 < 0) {
            this.field2817 = 0;
        } else if (this.field2817 > 255) {
            this.field2817 = 255;
        }
        if (var16 > 0.5D) {
            this.field2816 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2816 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2816 < 1) {
            this.field2816 = 1;
        }
        this.field2815 = (int) ((double) this.field2816 * var18);
    }
}
