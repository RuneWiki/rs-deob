package deob;

@ObfuscatedName("an")
public class class33 extends class174 {

    @ObfuscatedName("an.x")
    public static class170 field874 = new class170(64);

    @ObfuscatedName("an.e")
    public int field875 = 0;

    @ObfuscatedName("an.r")
    public int field876;

    @ObfuscatedName("an.p")
    public int field877;

    @ObfuscatedName("an.n")
    public int field878;

    @ObfuscatedName("an.o")
    public int field880;

    @ObfuscatedName("z.a(Leb;I)V")
    public static void method159(class152 arg0) {
        Statics.field2717 = arg0;
    }

    @ObfuscatedName("an.x(S)V")
    public void method692() {
        this.method705(this.field875);
    }

    @ObfuscatedName("an.e(Ldy;II)V")
    public void method690(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2411();
            if (var3 == 0) {
                return;
            }
            this.method691(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.r(Ldy;III)V")
    public void method691(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field875 = arg0.method2415();
        }
    }

    @ObfuscatedName("an.p(II)V")
    public void method705(int arg0) {
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
        this.field877 = (int) (var14 * 256.0D);
        this.field878 = (int) (var16 * 256.0D);
        if (this.field877 < 0) {
            this.field877 = 0;
        } else if (this.field877 > 255) {
            this.field877 = 255;
        }
        if (this.field878 < 0) {
            this.field878 = 0;
        } else if (this.field878 > 255) {
            this.field878 = 255;
        }
        if (var16 > 0.5D) {
            this.field880 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field880 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field880 < 1) {
            this.field880 = 1;
        }
        this.field876 = (int) ((double) this.field880 * var18);
    }
}
