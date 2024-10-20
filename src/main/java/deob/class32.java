package deob;

@ObfuscatedName("an")
public class class32 extends class172 {

    @ObfuscatedName("an.e")
    public static class168 field848 = new class168(64);

    @ObfuscatedName("an.n")
    public int field849 = 0;

    @ObfuscatedName("an.j")
    public int field850;

    @ObfuscatedName("an.i")
    public int field854;

    @ObfuscatedName("an.o")
    public int field852;

    @ObfuscatedName("an.l")
    public int field853;

    @ObfuscatedName("z.g(Lez;I)V")
    public static void method118(class150 arg0) {
        Statics.field851 = arg0;
    }

    @ObfuscatedName("an.e(I)V")
    public void method686() {
        this.method687(this.field849);
    }

    @ObfuscatedName("an.n(Ldu;II)V")
    public void method689(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2485();
            if (var3 == 0) {
                return;
            }
            this.method702(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.j(Ldu;III)V")
    public void method702(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field849 = arg0.method2489();
        }
    }

    @ObfuscatedName("an.i(II)V")
    public void method687(int arg0) {
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
        this.field854 = (int) (var14 * 256.0D);
        this.field852 = (int) (var16 * 256.0D);
        if (this.field854 < 0) {
            this.field854 = 0;
        } else if (this.field854 > 255) {
            this.field854 = 255;
        }
        if (this.field852 < 0) {
            this.field852 = 0;
        } else if (this.field852 > 255) {
            this.field852 = 255;
        }
        if (var16 > 0.5D) {
            this.field853 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field853 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field853 < 1) {
            this.field853 = 1;
        }
        this.field850 = (int) ((double) this.field853 * var18);
    }

    @ObfuscatedName("m.o(I)V")
    public static void method151() {
        field848.method3315();
    }
}
