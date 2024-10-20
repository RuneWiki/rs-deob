package deob;

@ObfuscatedName("gj")
public class class189 extends class406 {

    @ObfuscatedName("gj.h")
    public static class256 field2154 = new class256(64);

    @ObfuscatedName("gj.w")
    public int field2146 = 0;

    @ObfuscatedName("gj.v")
    public int field2153 = -1;

    @ObfuscatedName("gj.c")
    public boolean field2148 = true;

    @ObfuscatedName("gj.q")
    public int field2147 = -1;

    @ObfuscatedName("gj.i")
    public int field2150;

    @ObfuscatedName("gj.k")
    public int field2144;

    @ObfuscatedName("gj.o")
    public int field2152;

    @ObfuscatedName("gj.n")
    public int field2149;

    @ObfuscatedName("gj.d")
    public int field2151;

    @ObfuscatedName("gj.a")
    public int field2145;

    @ObfuscatedName("gj.h(B)V")
    public void method3369() {
        if (this.field2147 != -1) {
            this.method3368(this.field2147);
            this.field2149 = this.field2150;
            this.field2151 = this.field2144;
            this.field2145 = this.field2152;
        }
        this.method3368(this.field2146);
    }

    @ObfuscatedName("gj.w(Lqr;II)V")
    public void method3366(class444 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6929();
            if (var3 == 0) {
                return;
            }
            this.method3367(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gj.v(Lqr;III)V")
    public void method3367(class444 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2146 = arg0.method7095();
        } else if (arg1 == 2) {
            this.field2153 = arg0.method6929();
        } else if (arg1 == 5) {
            this.field2148 = false;
        } else if (arg1 == 7) {
            this.field2147 = arg0.method7095();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gj.c(IB)V")
    public void method3368(int arg0) {
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
        this.field2150 = (int) (var18 * 256.0D);
        this.field2144 = (int) (var14 * 256.0D);
        this.field2152 = (int) (var16 * 256.0D);
        if (this.field2144 < 0) {
            this.field2144 = 0;
        } else if (this.field2144 > 255) {
            this.field2144 = 255;
        }
        if (this.field2152 < 0) {
            this.field2152 = 0;
        } else if (this.field2152 > 255) {
            this.field2152 = 255;
        }
    }
}
