package deob;

@ObfuscatedName("ai")
public class class37 extends class174 {

    @ObfuscatedName("ai.c")
    public static class170 field937 = new class170(64);

    @ObfuscatedName("ai.p")
    public int field939 = 0;

    @ObfuscatedName("ai.z")
    public int field936 = -1;

    @ObfuscatedName("ai.m")
    public boolean field944 = true;

    @ObfuscatedName("ai.k")
    public int field934 = -1;

    @ObfuscatedName("ai.v")
    public int field933;

    @ObfuscatedName("ai.y")
    public int field940;

    @ObfuscatedName("ai.d")
    public int field941;

    @ObfuscatedName("ai.l")
    public int field942;

    @ObfuscatedName("ai.h")
    public int field935;

    @ObfuscatedName("ai.b")
    public int field938;

    @ObfuscatedName("ai.q(I)V")
    public void method784() {
        if (this.field934 != -1) {
            this.method787(this.field934);
            this.field942 = this.field933;
            this.field935 = this.field940;
            this.field938 = this.field941;
        }
        this.method787(this.field939);
    }

    @ObfuscatedName("ai.c(Ldo;II)V")
    public void method785(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2534();
            if (var3 == 0) {
                return;
            }
            this.method795(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.p(Ldo;IIS)V")
    public void method795(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field939 = arg0.method2429();
        } else if (arg1 == 2) {
            this.field936 = arg0.method2534();
        } else if (arg1 == 5) {
            this.field944 = false;
        } else if (arg1 == 7) {
            this.field934 = arg0.method2429();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ai.z(II)V")
    public void method787(int arg0) {
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
        this.field933 = (int) (var18 * 256.0D);
        this.field940 = (int) (var14 * 256.0D);
        this.field941 = (int) (var16 * 256.0D);
        if (this.field940 < 0) {
            this.field940 = 0;
        } else if (this.field940 > 255) {
            this.field940 = 255;
        }
        if (this.field941 < 0) {
            this.field941 = 0;
        } else if (this.field941 > 255) {
            this.field941 = 255;
        }
    }

    @ObfuscatedName("al.m(I)V")
    public static void method686() {
        field937.method3218();
    }
}
