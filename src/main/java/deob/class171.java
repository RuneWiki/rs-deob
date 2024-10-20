package deob;

@ObfuscatedName("fq")
public class class171 extends class365 {

    @ObfuscatedName("fq.q")
    public static class236 field1933 = new class236(64);

    @ObfuscatedName("fq.f")
    public int field1934 = 0;

    @ObfuscatedName("fq.j")
    public int field1935 = -1;

    @ObfuscatedName("fq.m")
    public boolean field1941 = true;

    @ObfuscatedName("fq.k")
    public int field1942 = -1;

    @ObfuscatedName("fq.t")
    public int field1938;

    @ObfuscatedName("fq.a")
    public int field1944;

    @ObfuscatedName("fq.e")
    public int field1939;

    @ObfuscatedName("fq.i")
    public int field1937;

    @ObfuscatedName("fq.y")
    public int field1940;

    @ObfuscatedName("fq.w")
    public int field1936;

    @ObfuscatedName("fq.l(I)V")
    public void method3074() {
        if (this.field1942 != -1) {
            this.method3077(this.field1942);
            this.field1937 = this.field1938;
            this.field1940 = this.field1944;
            this.field1936 = this.field1939;
        }
        this.method3077(this.field1934);
    }

    @ObfuscatedName("fq.q(Lot;II)V")
    public void method3089(class401 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6272();
            if (var3 == 0) {
                return;
            }
            this.method3076(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fq.f(Lot;III)V")
    public void method3076(class401 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1934 = arg0.method6276();
        } else if (arg1 == 2) {
            this.field1935 = arg0.method6272();
        } else if (arg1 == 5) {
            this.field1941 = false;
        } else if (arg1 == 7) {
            this.field1942 = arg0.method6276();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("fq.j(II)V")
    public void method3077(int arg0) {
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
        this.field1938 = (int) (var18 * 256.0D);
        this.field1944 = (int) (var14 * 256.0D);
        this.field1939 = (int) (var16 * 256.0D);
        if (this.field1944 < 0) {
            this.field1944 = 0;
        } else if (this.field1944 > 255) {
            this.field1944 = 255;
        }
        if (this.field1939 < 0) {
            this.field1939 = 0;
        } else if (this.field1939 > 255) {
            this.field1939 = 255;
        }
    }
}
