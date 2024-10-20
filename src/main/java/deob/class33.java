package deob;

@ObfuscatedName("an")
public class class33 extends class174 {

    @ObfuscatedName("an.t")
    public static class170 field856 = new class170(64);

    @ObfuscatedName("an.n")
    public int field857 = 0;

    @ObfuscatedName("an.e")
    public int field858;

    @ObfuscatedName("an.l")
    public int field868;

    @ObfuscatedName("an.d")
    public int field859;

    @ObfuscatedName("an.r")
    public int field861;

    @ObfuscatedName("ax.f(Leo;I)V")
    public static void method550(class153 arg0) {
        Statics.field864 = arg0;
    }

    @ObfuscatedName("an.t(I)V")
    public void method674() {
        this.method679(this.field857);
    }

    @ObfuscatedName("an.n(Ldq;IB)V")
    public void method691(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2458();
            if (var3 == 0) {
                return;
            }
            this.method675(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.e(Ldq;IIB)V")
    public void method675(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field857 = arg0.method2554();
        }
    }

    @ObfuscatedName("an.l(II)V")
    public void method679(int arg0) {
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
        this.field868 = (int) (var14 * 256.0D);
        this.field859 = (int) (var16 * 256.0D);
        if (this.field868 < 0) {
            this.field868 = 0;
        } else if (this.field868 > 255) {
            this.field868 = 255;
        }
        if (this.field859 < 0) {
            this.field859 = 0;
        } else if (this.field859 > 255) {
            this.field859 = 255;
        }
        if (var16 > 0.5D) {
            this.field861 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field861 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field861 < 1) {
            this.field861 = 1;
        }
        this.field858 = (int) ((double) this.field861 * var18);
    }

    @ObfuscatedName("bh.d(I)V")
    public static void method1378() {
        field856.method3271();
    }
}
