package deob;

@ObfuscatedName("an")
public class class37 extends class174 {

    @ObfuscatedName("an.m")
    public static class170 field926 = new class170(64);

    @ObfuscatedName("an.v")
    public int field927 = 0;

    @ObfuscatedName("an.r")
    public int field928 = -1;

    @ObfuscatedName("an.n")
    public boolean field929 = true;

    @ObfuscatedName("an.i")
    public int field931 = -1;

    @ObfuscatedName("an.s")
    public int field940;

    @ObfuscatedName("an.w")
    public int field941;

    @ObfuscatedName("an.d")
    public int field925;

    @ObfuscatedName("an.t")
    public int field930;

    @ObfuscatedName("an.f")
    public int field935;

    @ObfuscatedName("an.b")
    public int field936;

    @ObfuscatedName("ae.g(II)Lan;")
    public static class37 method594(int arg0) {
        class37 var1 = (class37) field926.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field934.method2968(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method785(new class127(var2), arg0);
        }
        var3.method784();
        field926.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.m(B)V")
    public void method784() {
        if (this.field931 != -1) {
            this.method787(this.field931);
            this.field930 = this.field940;
            this.field935 = this.field941;
            this.field936 = this.field925;
        }
        this.method787(this.field927);
    }

    @ObfuscatedName("an.v(Ldr;IB)V")
    public void method785(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2414();
            if (var3 == 0) {
                return;
            }
            this.method786(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.r(Ldr;III)V")
    public void method786(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field927 = arg0.method2479();
        } else if (arg1 == 2) {
            this.field928 = arg0.method2414();
        } else if (arg1 == 5) {
            this.field929 = false;
        } else if (arg1 == 7) {
            this.field931 = arg0.method2479();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("an.n(II)V")
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
        this.field940 = (int) (var18 * 256.0D);
        this.field941 = (int) (var14 * 256.0D);
        this.field925 = (int) (var16 * 256.0D);
        if (this.field941 < 0) {
            this.field941 = 0;
        } else if (this.field941 > 255) {
            this.field941 = 255;
        }
        if (this.field925 < 0) {
            this.field925 = 0;
        } else if (this.field925 > 255) {
            this.field925 = 255;
        }
    }
}
