package deob;

@ObfuscatedName("jf")
public class class273 extends class207 {

    @ObfuscatedName("jf.m")
    public static class201 field3538 = new class201(64);

    @ObfuscatedName("jf.q")
    public int field3539 = 0;

    @ObfuscatedName("jf.b")
    public int field3543 = -1;

    @ObfuscatedName("jf.f")
    public boolean field3542 = true;

    @ObfuscatedName("jf.n")
    public int field3541 = -1;

    @ObfuscatedName("jf.h")
    public int field3547;

    @ObfuscatedName("jf.x")
    public int field3544;

    @ObfuscatedName("jf.j")
    public int field3545;

    @ObfuscatedName("jf.a")
    public int field3546;

    @ObfuscatedName("jf.l")
    public int field3537;

    @ObfuscatedName("jf.d")
    public int field3548;

    @ObfuscatedName("en.w(II)Ljf;")
    public static class273 method2969(int arg0) {
        class273 var1 = (class273) field3538.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3540.method4250(4, arg0);
        class273 var3 = new class273();
        if (var2 != null) {
            var3.method4812(new class183(var2), arg0);
        }
        var3.method4813();
        field3538.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.m(B)V")
    public void method4813() {
        if (this.field3541 != -1) {
            this.method4820(this.field3541);
            this.field3546 = this.field3547;
            this.field3537 = this.field3544;
            this.field3548 = this.field3545;
        }
        this.method4820(this.field3539);
    }

    @ObfuscatedName("jf.q(Lgy;II)V")
    public void method4812(class183 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3436();
            if (var3 == 0) {
                return;
            }
            this.method4815(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jf.x(Lgy;IIS)V")
    public void method4815(class183 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3539 = arg0.method3266();
        } else if (arg1 == 2) {
            this.field3543 = arg0.method3436();
        } else if (arg1 == 5) {
            this.field3542 = false;
        } else if (arg1 == 7) {
            this.field3541 = arg0.method3266();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jf.j(II)V")
    public void method4820(int arg0) {
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
        this.field3547 = (int) (var18 * 256.0D);
        this.field3544 = (int) (var14 * 256.0D);
        this.field3545 = (int) (var16 * 256.0D);
        if (this.field3544 < 0) {
            this.field3544 = 0;
        } else if (this.field3544 > 255) {
            this.field3544 = 255;
        }
        if (this.field3545 < 0) {
            this.field3545 = 0;
        } else if (this.field3545 > 255) {
            this.field3545 = 255;
        }
    }
}
