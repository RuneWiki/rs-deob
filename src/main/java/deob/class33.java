package deob;

@ObfuscatedName("aa")
public class class33 extends class174 {

    @ObfuscatedName("aa.e")
    public static class170 field861 = new class170(64);

    @ObfuscatedName("aa.a")
    public int field862 = 0;

    @ObfuscatedName("aa.h")
    public int field863;

    @ObfuscatedName("aa.y")
    public int field864;

    @ObfuscatedName("aa.j")
    public int field865;

    @ObfuscatedName("aa.l")
    public int field866;

    @ObfuscatedName("aa.p(I)V")
    public void method696() {
        this.method699(this.field862);
    }

    @ObfuscatedName("aa.e(Ldj;II)V")
    public void method702(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2494();
            if (var3 == 0) {
                return;
            }
            this.method698(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aa.a(Ldj;III)V")
    public void method698(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field862 = arg0.method2498();
        }
    }

    @ObfuscatedName("aa.h(II)V")
    public void method699(int arg0) {
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
        this.field864 = (int) (var14 * 256.0D);
        this.field865 = (int) (var16 * 256.0D);
        if (this.field864 < 0) {
            this.field864 = 0;
        } else if (this.field864 > 255) {
            this.field864 = 255;
        }
        if (this.field865 < 0) {
            this.field865 = 0;
        } else if (this.field865 > 255) {
            this.field865 = 255;
        }
        if (var16 > 0.5D) {
            this.field866 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field866 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field866 < 1) {
            this.field866 = 1;
        }
        this.field863 = (int) ((double) this.field866 * var18);
    }
}
