package deob;

@ObfuscatedName("av")
public class class32 extends class172 {

    @ObfuscatedName("av.y")
    public static class168 field846 = new class168(64);

    @ObfuscatedName("av.x")
    public int field845 = 0;

    @ObfuscatedName("av.z")
    public int field847;

    @ObfuscatedName("av.c")
    public int field855;

    @ObfuscatedName("av.e")
    public int field848;

    @ObfuscatedName("av.s")
    public int field850;

    @ObfuscatedName("av.j(I)V")
    public void method663() {
        this.method666(this.field845);
    }

    @ObfuscatedName("av.y(Ldr;II)V")
    public void method662(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2399();
            if (var3 == 0) {
                return;
            }
            this.method665(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.x(Ldr;III)V")
    public void method665(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field845 = arg0.method2386();
        }
    }

    @ObfuscatedName("av.z(II)V")
    public void method666(int arg0) {
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
        this.field855 = (int) (var14 * 256.0D);
        this.field848 = (int) (var16 * 256.0D);
        if (this.field855 < 0) {
            this.field855 = 0;
        } else if (this.field855 > 255) {
            this.field855 = 255;
        }
        if (this.field848 < 0) {
            this.field848 = 0;
        } else if (this.field848 > 255) {
            this.field848 = 255;
        }
        if (var16 > 0.5D) {
            this.field850 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field850 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field850 < 1) {
            this.field850 = 1;
        }
        this.field847 = (int) ((double) this.field850 * var18);
    }

    @ObfuscatedName("bp.c(I)V")
    public static void method1348() {
        field846.method3185();
    }
}
