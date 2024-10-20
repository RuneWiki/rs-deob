package deob;

@ObfuscatedName("al")
public class class33 extends class174 {

    @ObfuscatedName("al.e")
    public static class170 field860 = new class170(64);

    @ObfuscatedName("al.g")
    public int field854 = 0;

    @ObfuscatedName("al.o")
    public int field855;

    @ObfuscatedName("al.a")
    public int field856;

    @ObfuscatedName("al.h")
    public int field857;

    @ObfuscatedName("al.j")
    public int field858;

    @ObfuscatedName("al.b(B)V")
    public void method678() {
        this.method677(this.field854);
    }

    @ObfuscatedName("al.e(Ldv;IB)V")
    public void method675(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2436();
            if (var3 == 0) {
                return;
            }
            this.method676(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("al.g(Ldv;III)V")
    public void method676(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field854 = arg0.method2440();
        }
    }

    @ObfuscatedName("al.o(II)V")
    public void method677(int arg0) {
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
        this.field856 = (int) (var14 * 256.0D);
        this.field857 = (int) (var16 * 256.0D);
        if (this.field856 < 0) {
            this.field856 = 0;
        } else if (this.field856 > 255) {
            this.field856 = 255;
        }
        if (this.field857 < 0) {
            this.field857 = 0;
        } else if (this.field857 > 255) {
            this.field857 = 255;
        }
        if (var16 > 0.5D) {
            this.field858 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field858 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field858 < 1) {
            this.field858 = 1;
        }
        this.field855 = (int) ((double) this.field858 * var18);
    }
}
