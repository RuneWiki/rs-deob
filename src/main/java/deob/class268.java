package deob;

@ObfuscatedName("jn")
public class class268 extends class185 {

    @ObfuscatedName("jn.m")
    public static class155 field3499 = new class155(64);

    @ObfuscatedName("jn.k")
    public int field3498 = 0;

    @ObfuscatedName("jn.d")
    public int field3510 = -1;

    @ObfuscatedName("jn.w")
    public boolean field3502 = true;

    @ObfuscatedName("jn.v")
    public int field3509 = -1;

    @ObfuscatedName("jn.q")
    public int field3503;

    @ObfuscatedName("jn.z")
    public int field3504;

    @ObfuscatedName("jn.t")
    public int field3506;

    @ObfuscatedName("jn.e")
    public int field3507;

    @ObfuscatedName("jn.s")
    public int field3508;

    @ObfuscatedName("jn.p")
    public int field3501;

    @ObfuscatedName("fd.x(II)Ljn;")
    public static class268 method3193(int arg0) {
        class268 var1 = (class268) field3499.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3505.method3869(4, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4427(new class310(var2), arg0);
        }
        var3.method4426();
        field3499.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.m(I)V")
    public void method4426() {
        if (this.field3509 != -1) {
            this.method4435(this.field3509);
            this.field3507 = this.field3503;
            this.field3508 = this.field3504;
            this.field3501 = this.field3506;
        }
        this.method4435(this.field3498);
    }

    @ObfuscatedName("jn.k(Lkb;II)V")
    public void method4427(class310 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5137();
            if (var3 == 0) {
                return;
            }
            this.method4433(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jn.d(Lkb;IIB)V")
    public void method4433(class310 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3498 = arg0.method5264();
        } else if (arg1 == 2) {
            this.field3510 = arg0.method5137();
        } else if (arg1 == 5) {
            this.field3502 = false;
        } else if (arg1 == 7) {
            this.field3509 = arg0.method5264();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jn.w(II)V")
    public void method4435(int arg0) {
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
        this.field3503 = (int) (var18 * 256.0D);
        this.field3504 = (int) (var14 * 256.0D);
        this.field3506 = (int) (var16 * 256.0D);
        if (this.field3504 < 0) {
            this.field3504 = 0;
        } else if (this.field3504 > 255) {
            this.field3504 = 255;
        }
        if (this.field3506 < 0) {
            this.field3506 = 0;
        } else if (this.field3506 > 255) {
            this.field3506 = 255;
        }
    }

    @ObfuscatedName("t.v(B)V")
    public static void method82() {
        field3499.method3141();
    }
}
