package deob;

@ObfuscatedName("ar")
public class class33 extends class174 {

    @ObfuscatedName("ar.p")
    public static class170 field877 = new class170(64);

    @ObfuscatedName("ar.a")
    public int field884 = 0;

    @ObfuscatedName("ar.l")
    public int field878;

    @ObfuscatedName("ar.q")
    public int field875;

    @ObfuscatedName("ar.b")
    public int field879;

    @ObfuscatedName("ar.u")
    public int field880;

    @ObfuscatedName("ar.i(I)V")
    public void method670() {
        this.method673(this.field884);
    }

    @ObfuscatedName("ar.p(Ldn;II)V")
    public void method671(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2411();
            if (var3 == 0) {
                return;
            }
            this.method672(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ar.a(Ldn;III)V")
    public void method672(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field884 = arg0.method2415();
        }
    }

    @ObfuscatedName("ar.l(II)V")
    public void method673(int arg0) {
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
        this.field875 = (int) (var14 * 256.0D);
        this.field879 = (int) (var16 * 256.0D);
        if (this.field875 < 0) {
            this.field875 = 0;
        } else if (this.field875 > 255) {
            this.field875 = 255;
        }
        if (this.field879 < 0) {
            this.field879 = 0;
        } else if (this.field879 > 255) {
            this.field879 = 255;
        }
        if (var16 > 0.5D) {
            this.field880 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field880 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field880 < 1) {
            this.field880 = 1;
        }
        this.field878 = (int) ((double) this.field880 * var18);
    }

    @ObfuscatedName("ew.q(I)V")
    public static void method2659() {
        field877.method3226();
    }
}
