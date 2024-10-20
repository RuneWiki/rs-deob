package deob;

@ObfuscatedName("ga")
public class class192 extends class130 {

    @ObfuscatedName("ga.x")
    public static class125 field2790 = new class125(64);

    @ObfuscatedName("ga.i")
    public int field2787 = 0;

    @ObfuscatedName("ga.a")
    public int field2788;

    @ObfuscatedName("ga.f")
    public int field2789;

    @ObfuscatedName("ga.c")
    public int field2785;

    @ObfuscatedName("ga.d")
    public int field2791;

    @ObfuscatedName("dw.u(Lgt;B)V")
    public static void method2078(class183 arg0) {
        Statics.field2796 = arg0;
    }

    @ObfuscatedName("ga.x(B)V")
    public void method3255() {
        this.method3261(this.field2787);
    }

    @ObfuscatedName("ga.i(Len;II)V")
    public void method3269(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2708();
            if (var3 == 0) {
                return;
            }
            this.method3264(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ga.a(Len;IIB)V")
    public void method3264(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2787 = arg0.method2599();
        }
    }

    @ObfuscatedName("ga.c(II)V")
    public void method3261(int arg0) {
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
        this.field2789 = (int) (var14 * 256.0D);
        this.field2785 = (int) (var16 * 256.0D);
        if (this.field2789 < 0) {
            this.field2789 = 0;
        } else if (this.field2789 > 255) {
            this.field2789 = 255;
        }
        if (this.field2785 < 0) {
            this.field2785 = 0;
        } else if (this.field2785 > 255) {
            this.field2785 = 255;
        }
        if (var16 > 0.5D) {
            this.field2791 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2791 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2791 < 1) {
            this.field2791 = 1;
        }
        this.field2788 = (int) ((double) this.field2791 * var18);
    }
}
