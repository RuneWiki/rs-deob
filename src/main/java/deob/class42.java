package deob;

@ObfuscatedName("ak")
public class class42 extends class205 {

    @ObfuscatedName("ak.g")
    public static class194 field956 = new class194(64);

    @ObfuscatedName("ak.j")
    public int field953 = 0;

    @ObfuscatedName("ak.d")
    public int field954;

    @ObfuscatedName("ak.x")
    public int field959;

    @ObfuscatedName("ak.y")
    public int field961;

    @ObfuscatedName("ak.r")
    public int field957;

    @ObfuscatedName("ak.b(I)V")
    public void method836() {
        this.method830(this.field953);
    }

    @ObfuscatedName("ak.g(Lds;II)V")
    public void method828(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2344();
            if (var3 == 0) {
                return;
            }
            this.method829(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.j(Lds;IIB)V")
    public void method829(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field953 = arg0.method2348();
        }
    }

    @ObfuscatedName("ak.d(II)V")
    public void method830(int arg0) {
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
        this.field959 = (int) (var14 * 256.0D);
        this.field961 = (int) (var16 * 256.0D);
        if (this.field959 < 0) {
            this.field959 = 0;
        } else if (this.field959 > 255) {
            this.field959 = 255;
        }
        if (this.field961 < 0) {
            this.field961 = 0;
        } else if (this.field961 > 255) {
            this.field961 = 255;
        }
        if (var16 > 0.5D) {
            this.field957 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field957 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field957 < 1) {
            this.field957 = 1;
        }
        this.field954 = (int) ((double) this.field957 * var18);
    }

    @ObfuscatedName("bk.x(I)V")
    public static void method1513() {
        field956.method3486();
    }
}
