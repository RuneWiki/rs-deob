package deob;

@ObfuscatedName("gw")
public class class190 extends class407 {

    @ObfuscatedName("gw.p")
    public static class257 field2187 = new class257(64);

    @ObfuscatedName("gw.f")
    public int field2182 = 0;

    @ObfuscatedName("gw.n")
    public int field2183 = -1;

    @ObfuscatedName("gw.k")
    public boolean field2192 = true;

    @ObfuscatedName("gw.w")
    public int field2185 = -1;

    @ObfuscatedName("gw.s")
    public int field2186;

    @ObfuscatedName("gw.q")
    public int field2181;

    @ObfuscatedName("gw.m")
    public int field2188;

    @ObfuscatedName("gw.x")
    public int field2180;

    @ObfuscatedName("gw.j")
    public int field2190;

    @ObfuscatedName("gw.v")
    public int field2193;

    @ObfuscatedName("h.c(Llv;I)V")
    public static void method172(class317 arg0) {
        Statics.field2184 = arg0;
    }

    @ObfuscatedName("gw.p(I)V")
    public void method3549() {
        if (this.field2185 != -1) {
            this.method3548(this.field2185);
            this.field2180 = this.field2186;
            this.field2190 = this.field2181;
            this.field2193 = this.field2188;
        }
        this.method3548(this.field2182);
    }

    @ObfuscatedName("gw.f(Lqq;II)V")
    public void method3562(class445 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7196();
            if (var3 == 0) {
                return;
            }
            this.method3557(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gw.n(Lqq;IIB)V")
    public void method3557(class445 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2182 = arg0.method7340();
        } else if (arg1 == 2) {
            this.field2183 = arg0.method7196();
        } else if (arg1 == 5) {
            this.field2192 = false;
        } else if (arg1 == 7) {
            this.field2185 = arg0.method7340();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gw.k(II)V")
    public void method3548(int arg0) {
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
        this.field2186 = (int) (var18 * 256.0D);
        this.field2181 = (int) (var14 * 256.0D);
        this.field2188 = (int) (var16 * 256.0D);
        if (this.field2181 < 0) {
            this.field2181 = 0;
        } else if (this.field2181 > 255) {
            this.field2181 = 255;
        }
        if (this.field2188 < 0) {
            this.field2188 = 0;
        } else if (this.field2188 > 255) {
            this.field2188 = 255;
        }
    }
}
