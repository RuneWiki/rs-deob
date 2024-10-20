package deob;

@ObfuscatedName("al")
public class class37 extends class174 {

    @ObfuscatedName("al.m")
    public static class170 field938 = new class170(64);

    @ObfuscatedName("al.d")
    public int field927 = 0;

    @ObfuscatedName("al.k")
    public int field933 = -1;

    @ObfuscatedName("al.n")
    public boolean field928 = true;

    @ObfuscatedName("al.s")
    public int field929 = -1;

    @ObfuscatedName("al.x")
    public int field926;

    @ObfuscatedName("al.b")
    public int field931;

    @ObfuscatedName("al.j")
    public int field932;

    @ObfuscatedName("al.p")
    public int field930;

    @ObfuscatedName("al.l")
    public int field934;

    @ObfuscatedName("al.i")
    public int field924;

    @ObfuscatedName("bo.y(Lel;I)V")
    public static void method1352(class152 arg0) {
        Statics.field925 = arg0;
    }

    @ObfuscatedName("al.m(I)V")
    public void method797() {
        if (this.field929 != -1) {
            this.method791(this.field929);
            this.field930 = this.field926;
            this.field934 = this.field931;
            this.field924 = this.field932;
        }
        this.method791(this.field927);
    }

    @ObfuscatedName("al.d(Ldp;II)V")
    public void method789(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2534();
            if (var3 == 0) {
                return;
            }
            this.method801(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("al.k(Ldp;IIB)V")
    public void method801(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field927 = arg0.method2462();
        } else if (arg1 == 2) {
            this.field933 = arg0.method2534();
        } else if (arg1 == 5) {
            this.field928 = false;
        } else if (arg1 == 7) {
            this.field929 = arg0.method2462();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("al.n(II)V")
    public void method791(int arg0) {
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
        this.field926 = (int) (var18 * 256.0D);
        this.field931 = (int) (var14 * 256.0D);
        this.field932 = (int) (var16 * 256.0D);
        if (this.field931 < 0) {
            this.field931 = 0;
        } else if (this.field931 > 255) {
            this.field931 = 255;
        }
        if (this.field932 < 0) {
            this.field932 = 0;
        } else if (this.field932 > 255) {
            this.field932 = 255;
        }
    }

    @ObfuscatedName("ah.s(B)V")
    public static void method907() {
        field938.method3297();
    }
}
