package deob;

@ObfuscatedName("go")
public class class201 extends class130 {

    @ObfuscatedName("go.y")
    public static class125 field3021 = new class125(64);

    @ObfuscatedName("go.o")
    public int field3022 = 0;

    @ObfuscatedName("go.r")
    public int field3023 = -1;

    @ObfuscatedName("go.w")
    public boolean field3028 = true;

    @ObfuscatedName("go.j")
    public int field3025 = -1;

    @ObfuscatedName("go.q")
    public int field3026;

    @ObfuscatedName("go.d")
    public int field3024;

    @ObfuscatedName("go.n")
    public int field3027;

    @ObfuscatedName("go.c")
    public int field3020;

    @ObfuscatedName("go.s")
    public int field3029;

    @ObfuscatedName("go.g")
    public int field3030;

    @ObfuscatedName("cl.k(Lgh;I)V")
    public static void method1798(class183 arg0) {
        Statics.field3031 = arg0;
    }

    @ObfuscatedName("go.y(I)V")
    public void method3519() {
        if (this.field3025 != -1) {
            this.method3520(this.field3025);
            this.field3020 = this.field3026;
            this.field3029 = this.field3024;
            this.field3030 = this.field3027;
        }
        this.method3520(this.field3022);
    }

    @ObfuscatedName("go.o(Lfm;II)V")
    public void method3523(class161 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2733();
            if (var3 == 0) {
                return;
            }
            this.method3521(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("go.r(Lfm;IIB)V")
    public void method3521(class161 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3022 = arg0.method2876();
        } else if (arg1 == 2) {
            this.field3023 = arg0.method2733();
        } else if (arg1 == 5) {
            this.field3028 = false;
        } else if (arg1 == 7) {
            this.field3025 = arg0.method2876();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("go.w(IB)V")
    public void method3520(int arg0) {
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
        this.field3026 = (int) (var18 * 256.0D);
        this.field3024 = (int) (var14 * 256.0D);
        this.field3027 = (int) (var16 * 256.0D);
        if (this.field3024 < 0) {
            this.field3024 = 0;
        } else if (this.field3024 > 255) {
            this.field3024 = 255;
        }
        if (this.field3027 < 0) {
            this.field3027 = 0;
        } else if (this.field3027 > 255) {
            this.field3027 = 255;
        }
    }

    @ObfuscatedName("ee.j(B)V")
    public static void method2638() {
        field3021.method2161();
    }
}
