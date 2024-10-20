package deob;

@ObfuscatedName("aa")
public class class33 extends class174 {

    @ObfuscatedName("aa.g")
    public static class170 field858 = new class170(64);

    @ObfuscatedName("aa.a")
    public int field859 = 0;

    @ObfuscatedName("aa.t")
    public int field860;

    @ObfuscatedName("aa.f")
    public int field862;

    @ObfuscatedName("aa.c")
    public int field863;

    @ObfuscatedName("aa.p")
    public int field857;

    @ObfuscatedName("aa.d(I)V")
    public void method659() {
        this.method661(this.field859);
    }

    @ObfuscatedName("aa.g(Ldo;IB)V")
    public void method660(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2509();
            if (var3 == 0) {
                return;
            }
            this.method658(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aa.a(Ldo;IIB)V")
    public void method658(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field859 = arg0.method2404();
        }
    }

    @ObfuscatedName("aa.t(II)V")
    public void method661(int arg0) {
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
        this.field862 = (int) (var14 * 256.0D);
        this.field863 = (int) (var16 * 256.0D);
        if (this.field862 < 0) {
            this.field862 = 0;
        } else if (this.field862 > 255) {
            this.field862 = 255;
        }
        if (this.field863 < 0) {
            this.field863 = 0;
        } else if (this.field863 > 255) {
            this.field863 = 255;
        }
        if (var16 > 0.5D) {
            this.field857 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field857 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field857 < 1) {
            this.field857 = 1;
        }
        this.field860 = (int) ((double) this.field857 * var18);
    }
}
