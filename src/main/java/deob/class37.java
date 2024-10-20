package deob;

@ObfuscatedName("ay")
public class class37 extends class174 {

    @ObfuscatedName("ay.l")
    public static class170 field939 = new class170(64);

    @ObfuscatedName("ay.d")
    public int field927 = 0;

    @ObfuscatedName("ay.x")
    public int field929 = -1;

    @ObfuscatedName("ay.o")
    public boolean field934 = true;

    @ObfuscatedName("ay.a")
    public int field931 = -1;

    @ObfuscatedName("ay.w")
    public int field932;

    @ObfuscatedName("ay.i")
    public int field933;

    @ObfuscatedName("ay.y")
    public int field928;

    @ObfuscatedName("ay.m")
    public int field935;

    @ObfuscatedName("ay.u")
    public int field936;

    @ObfuscatedName("ay.s")
    public int field937;

    @ObfuscatedName("ck.p(Leh;S)V")
    public static void method1895(class153 arg0) {
        Statics.field930 = arg0;
    }

    @ObfuscatedName("ay.l(I)V")
    public void method793() {
        if (this.field931 != -1) {
            this.method805(this.field931);
            this.field935 = this.field932;
            this.field936 = this.field933;
            this.field937 = this.field928;
        }
        this.method805(this.field927);
    }

    @ObfuscatedName("ay.d(Lds;II)V")
    public void method795(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2498();
            if (var3 == 0) {
                return;
            }
            this.method798(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ay.x(Lds;III)V")
    public void method798(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field927 = arg0.method2502();
        } else if (arg1 == 2) {
            this.field929 = arg0.method2498();
        } else if (arg1 == 5) {
            this.field934 = false;
        } else if (arg1 == 7) {
            this.field931 = arg0.method2502();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ay.o(IS)V")
    public void method805(int arg0) {
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
        this.field932 = (int) (var18 * 256.0D);
        this.field933 = (int) (var14 * 256.0D);
        this.field928 = (int) (var16 * 256.0D);
        if (this.field933 < 0) {
            this.field933 = 0;
        } else if (this.field933 > 255) {
            this.field933 = 255;
        }
        if (this.field928 < 0) {
            this.field928 = 0;
        } else if (this.field928 > 255) {
            this.field928 = 255;
        }
    }
}
