package deob;

@ObfuscatedName("fx")
public class class171 extends class364 {

    @ObfuscatedName("fx.c")
    public static class236 field1940 = new class236(64);

    @ObfuscatedName("fx.m")
    public int field1943 = 0;

    @ObfuscatedName("fx.k")
    public int field1933 = -1;

    @ObfuscatedName("fx.o")
    public boolean field1934 = true;

    @ObfuscatedName("fx.g")
    public int field1935 = -1;

    @ObfuscatedName("fx.z")
    public int field1936;

    @ObfuscatedName("fx.a")
    public int field1931;

    @ObfuscatedName("fx.u")
    public int field1938;

    @ObfuscatedName("fx.e")
    public int field1932;

    @ObfuscatedName("fx.l")
    public int field1937;

    @ObfuscatedName("fx.y")
    public int field1941;

    @ObfuscatedName("fx.n(B)V")
    public void method3018() {
        if (this.field1935 != -1) {
            this.method3020(this.field1935);
            this.field1932 = this.field1936;
            this.field1937 = this.field1931;
            this.field1941 = this.field1938;
        }
        this.method3020(this.field1943);
    }

    @ObfuscatedName("fx.c(Lot;II)V")
    public void method3019(class400 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6217();
            if (var3 == 0) {
                return;
            }
            this.method3033(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fx.m(Lot;III)V")
    public void method3033(class400 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1943 = arg0.method6327();
        } else if (arg1 == 2) {
            this.field1933 = arg0.method6217();
        } else if (arg1 == 5) {
            this.field1934 = false;
        } else if (arg1 == 7) {
            this.field1935 = arg0.method6327();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("fx.k(II)V")
    public void method3020(int arg0) {
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
        this.field1936 = (int) (var18 * 256.0D);
        this.field1931 = (int) (var14 * 256.0D);
        this.field1938 = (int) (var16 * 256.0D);
        if (this.field1931 < 0) {
            this.field1931 = 0;
        } else if (this.field1931 > 255) {
            this.field1931 = 255;
        }
        if (this.field1938 < 0) {
            this.field1938 = 0;
        } else if (this.field1938 > 255) {
            this.field1938 = 255;
        }
    }

    @ObfuscatedName("il.o(I)V")
    public static void method4187() {
        field1940.method4168();
    }
}
