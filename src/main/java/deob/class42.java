package deob;

@ObfuscatedName("ak")
public class class42 extends class204 {

    @ObfuscatedName("ak.m")
    public static class193 field980 = new class193(64);

    @ObfuscatedName("ak.i")
    public int field982 = 0;

    @ObfuscatedName("ak.q")
    public int field984;

    @ObfuscatedName("ak.p")
    public int field983;

    @ObfuscatedName("ak.c")
    public int field985;

    @ObfuscatedName("ak.f")
    public int field986;

    @ObfuscatedName("ak.h(I)V")
    public void method803() {
        this.method806(this.field982);
    }

    @ObfuscatedName("ak.m(Ldp;IB)V")
    public void method804(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2320();
            if (var3 == 0) {
                return;
            }
            this.method818(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.i(Ldp;IIB)V")
    public void method818(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field982 = arg0.method2487();
        }
    }

    @ObfuscatedName("ak.q(IB)V")
    public void method806(int arg0) {
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
        this.field983 = (int) (var14 * 256.0D);
        this.field985 = (int) (var16 * 256.0D);
        if (this.field983 < 0) {
            this.field983 = 0;
        } else if (this.field983 > 255) {
            this.field983 = 255;
        }
        if (this.field985 < 0) {
            this.field985 = 0;
        } else if (this.field985 > 255) {
            this.field985 = 255;
        }
        if (var16 > 0.5D) {
            this.field986 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field986 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field986 < 1) {
            this.field986 = 1;
        }
        this.field984 = (int) ((double) this.field986 * var18);
    }

    @ObfuscatedName("cp.p(I)V")
    public static void method2114() {
        field980.method3483();
    }
}
