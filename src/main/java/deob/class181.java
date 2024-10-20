package deob;

@ObfuscatedName("fd")
public class class181 extends class405 {

    @ObfuscatedName("fd.v")
    public static class256 field1983 = new class256(64);

    @ObfuscatedName("fd.q")
    public int field1985 = 0;

    @ObfuscatedName("fd.f")
    public int field1986;

    @ObfuscatedName("fd.j")
    public int field1987;

    @ObfuscatedName("fd.e")
    public int field1988;

    @ObfuscatedName("fd.g")
    public int field1989;

    @ObfuscatedName("fd.c(I)V")
    public void method3232() {
        this.method3224(this.field1985);
    }

    @ObfuscatedName("fd.v(Lqt;IB)V")
    public void method3225(class443 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7047();
            if (var3 == 0) {
                return;
            }
            this.method3226(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fd.q(Lqt;III)V")
    public void method3226(class443 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1985 = arg0.method7051();
        }
    }

    @ObfuscatedName("fd.f(II)V")
    public void method3224(int arg0) {
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
        this.field1987 = (int) (var14 * 256.0D);
        this.field1988 = (int) (var16 * 256.0D);
        if (this.field1987 < 0) {
            this.field1987 = 0;
        } else if (this.field1987 > 255) {
            this.field1987 = 255;
        }
        if (this.field1988 < 0) {
            this.field1988 = 0;
        } else if (this.field1988 > 255) {
            this.field1988 = 255;
        }
        if (var16 > 0.5D) {
            this.field1989 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1989 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1989 < 1) {
            this.field1989 = 1;
        }
        this.field1986 = (int) ((double) this.field1989 * var18);
    }

    @ObfuscatedName("co.j(I)V")
    public static void method2264() {
        field1983.method4695();
    }
}
