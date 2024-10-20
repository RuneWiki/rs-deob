package deob;

@ObfuscatedName("eo")
public class class150 extends class348 {

    @ObfuscatedName("eo.e")
    public static class222 field1699 = new class222(64);

    @ObfuscatedName("eo.v")
    public int field1700 = 0;

    @ObfuscatedName("eo.y")
    public int field1705;

    @ObfuscatedName("eo.j")
    public int field1703;

    @ObfuscatedName("eo.o")
    public int field1702;

    @ObfuscatedName("eo.m")
    public int field1701;

    @ObfuscatedName("eo.f(I)V")
    public void method2595() {
        this.method2598(this.field1700);
    }

    @ObfuscatedName("eo.e(Lnt;II)V")
    public void method2603(class384 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5902();
            if (var3 == 0) {
                return;
            }
            this.method2597(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("eo.v(Lnt;III)V")
    public void method2597(class384 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1700 = arg0.method5901();
        }
    }

    @ObfuscatedName("eo.y(II)V")
    public void method2598(int arg0) {
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
        this.field1703 = (int) (var14 * 256.0D);
        this.field1702 = (int) (var16 * 256.0D);
        if (this.field1703 < 0) {
            this.field1703 = 0;
        } else if (this.field1703 > 255) {
            this.field1703 = 255;
        }
        if (this.field1702 < 0) {
            this.field1702 = 0;
        } else if (this.field1702 > 255) {
            this.field1702 = 255;
        }
        if (var16 > 0.5D) {
            this.field1701 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1701 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1701 < 1) {
            this.field1701 = 1;
        }
        this.field1705 = (int) ((double) this.field1701 * var18);
    }

    @ObfuscatedName("do.j(I)V")
    public static void method2261() {
        field1699.method3989();
    }
}
