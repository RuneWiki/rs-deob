package deob;

@ObfuscatedName("ad")
public class class42 extends class205 {

    @ObfuscatedName("ad.w")
    public static class194 field951 = new class194(64);

    @ObfuscatedName("ad.f")
    public int field950 = 0;

    @ObfuscatedName("ad.s")
    public int field956;

    @ObfuscatedName("ad.p")
    public int field954;

    @ObfuscatedName("ad.h")
    public int field955;

    @ObfuscatedName("ad.g")
    public int field952;

    @ObfuscatedName("ad.e(B)V")
    public void method814() {
        this.method828(this.field950);
    }

    @ObfuscatedName("ad.w(Ldq;IB)V")
    public void method816(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2355();
            if (var3 == 0) {
                return;
            }
            this.method817(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ad.f(Ldq;IIB)V")
    public void method817(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field950 = arg0.method2359();
        }
    }

    @ObfuscatedName("ad.s(II)V")
    public void method828(int arg0) {
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
        this.field954 = (int) (var14 * 256.0D);
        this.field955 = (int) (var16 * 256.0D);
        if (this.field954 < 0) {
            this.field954 = 0;
        } else if (this.field954 > 255) {
            this.field954 = 255;
        }
        if (this.field955 < 0) {
            this.field955 = 0;
        } else if (this.field955 > 255) {
            this.field955 = 255;
        }
        if (var16 > 0.5D) {
            this.field952 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field952 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field952 < 1) {
            this.field952 = 1;
        }
        this.field956 = (int) ((double) this.field952 * var18);
    }
}
