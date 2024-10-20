package deob;

@ObfuscatedName("jw")
public class class279 extends class214 {

    @ObfuscatedName("jw.s")
    public static class208 field3604 = new class208(64);

    @ObfuscatedName("jw.g")
    public int field3609 = 0;

    @ObfuscatedName("jw.x")
    public int field3605 = -1;

    @ObfuscatedName("jw.h")
    public boolean field3603 = true;

    @ObfuscatedName("jw.f")
    public int field3608 = -1;

    @ObfuscatedName("jw.p")
    public int field3614;

    @ObfuscatedName("jw.m")
    public int field3610;

    @ObfuscatedName("jw.q")
    public int field3611;

    @ObfuscatedName("jw.b")
    public int field3612;

    @ObfuscatedName("jw.n")
    public int field3613;

    @ObfuscatedName("jw.e")
    public int field3606;

    @ObfuscatedName("bt.a(Liz;B)V")
    public static void method1680(class255 arg0) {
        Statics.field3607 = arg0;
    }

    @ObfuscatedName("jw.s(I)V")
    public void method4999() {
        if (this.field3608 != -1) {
            this.method4995(this.field3608);
            this.field3612 = this.field3614;
            this.field3613 = this.field3610;
            this.field3606 = this.field3611;
        }
        this.method4995(this.field3609);
    }

    @ObfuscatedName("jw.g(Lgx;II)V")
    public void method4993(class190 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3443();
            if (var3 == 0) {
                return;
            }
            this.method4994(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jw.x(Lgx;III)V")
    public void method4994(class190 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3609 = arg0.method3459();
        } else if (arg1 == 2) {
            this.field3605 = arg0.method3443();
        } else if (arg1 == 5) {
            this.field3603 = false;
        } else if (arg1 == 7) {
            this.field3608 = arg0.method3459();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jw.h(II)V")
    public void method4995(int arg0) {
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
        this.field3614 = (int) (var18 * 256.0D);
        this.field3610 = (int) (var14 * 256.0D);
        this.field3611 = (int) (var16 * 256.0D);
        if (this.field3610 < 0) {
            this.field3610 = 0;
        } else if (this.field3610 > 255) {
            this.field3610 = 255;
        }
        if (this.field3611 < 0) {
            this.field3611 = 0;
        } else if (this.field3611 > 255) {
            this.field3611 = 255;
        }
    }
}
