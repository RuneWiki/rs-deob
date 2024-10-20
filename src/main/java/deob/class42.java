package deob;

@ObfuscatedName("af")
public class class42 extends class205 {

    @ObfuscatedName("af.u")
    public static class194 field988 = new class194(64);

    @ObfuscatedName("af.x")
    public int field989 = 0;

    @ObfuscatedName("af.b")
    public int field990;

    @ObfuscatedName("af.l")
    public int field992;

    @ObfuscatedName("af.d")
    public int field995;

    @ObfuscatedName("af.n")
    public int field993;

    @ObfuscatedName("af.f(I)V")
    public void method851() {
        this.method870(this.field989);
    }

    @ObfuscatedName("af.u(Ldj;II)V")
    public void method852(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2385();
            if (var3 == 0) {
                return;
            }
            this.method862(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("af.x(Ldj;IIB)V")
    public void method862(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field989 = arg0.method2389();
        }
    }

    @ObfuscatedName("af.b(IB)V")
    public void method870(int arg0) {
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
        this.field992 = (int) (var14 * 256.0D);
        this.field995 = (int) (var16 * 256.0D);
        if (this.field992 < 0) {
            this.field992 = 0;
        } else if (this.field992 > 255) {
            this.field992 = 255;
        }
        if (this.field995 < 0) {
            this.field995 = 0;
        } else if (this.field995 > 255) {
            this.field995 = 255;
        }
        if (var16 > 0.5D) {
            this.field993 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field993 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field993 < 1) {
            this.field993 = 1;
        }
        this.field990 = (int) ((double) this.field993 * var18);
    }

    @ObfuscatedName("er.l(I)V")
    public static void method2951() {
        field988.method3529();
    }
}
