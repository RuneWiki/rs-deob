package deob;

@ObfuscatedName("ai")
public class class39 extends class195 {

    @ObfuscatedName("ai.g")
    public static class184 field942 = new class184(64);

    @ObfuscatedName("ai.a")
    public int field943 = 0;

    @ObfuscatedName("ai.m")
    public int field949;

    @ObfuscatedName("ai.s")
    public int field944;

    @ObfuscatedName("ai.j")
    public int field946;

    @ObfuscatedName("ai.f")
    public int field947;

    @ObfuscatedName("ai.n(S)V")
    public void method725() {
        this.method728(this.field943);
    }

    @ObfuscatedName("ai.g(Ldp;II)V")
    public void method726(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2211();
            if (var3 == 0) {
                return;
            }
            this.method729(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.a(Ldp;III)V")
    public void method729(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field943 = arg0.method2228();
        }
    }

    @ObfuscatedName("ai.m(II)V")
    public void method728(int arg0) {
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
        this.field944 = (int) (var14 * 256.0D);
        this.field946 = (int) (var16 * 256.0D);
        if (this.field944 < 0) {
            this.field944 = 0;
        } else if (this.field944 > 255) {
            this.field944 = 255;
        }
        if (this.field946 < 0) {
            this.field946 = 0;
        } else if (this.field946 > 255) {
            this.field946 = 255;
        }
        if (var16 > 0.5D) {
            this.field947 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field947 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field947 < 1) {
            this.field947 = 1;
        }
        this.field949 = (int) ((double) this.field947 * var18);
    }

    @ObfuscatedName("e.s(B)V")
    public static void method138() {
        field942.method3398();
    }
}
