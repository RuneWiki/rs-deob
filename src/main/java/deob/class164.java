package deob;

@ObfuscatedName("fp")
public class class164 extends class365 {

    @ObfuscatedName("fp.w")
    public static class236 field1763 = new class236(64);

    @ObfuscatedName("fp.s")
    public int field1768 = 0;

    @ObfuscatedName("fp.a")
    public int field1766;

    @ObfuscatedName("fp.o")
    public int field1767;

    @ObfuscatedName("fp.g")
    public int field1764;

    @ObfuscatedName("fp.e")
    public int field1769;

    @ObfuscatedName("fp.i(I)V")
    public void method2861() {
        this.method2864(this.field1768);
    }

    @ObfuscatedName("fp.w(Lop;II)V")
    public void method2863(class401 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6240();
            if (var3 == 0) {
                return;
            }
            this.method2862(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fp.s(Lop;III)V")
    public void method2862(class401 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1768 = arg0.method6432();
        }
    }

    @ObfuscatedName("fp.a(IB)V")
    public void method2864(int arg0) {
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
        this.field1767 = (int) (var14 * 256.0D);
        this.field1764 = (int) (var16 * 256.0D);
        if (this.field1767 < 0) {
            this.field1767 = 0;
        } else if (this.field1767 > 255) {
            this.field1767 = 255;
        }
        if (this.field1764 < 0) {
            this.field1764 = 0;
        } else if (this.field1764 > 255) {
            this.field1764 = 255;
        }
        if (var16 > 0.5D) {
            this.field1769 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1769 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1769 < 1) {
            this.field1769 = 1;
        }
        this.field1766 = (int) ((double) this.field1769 * var18);
    }
}
