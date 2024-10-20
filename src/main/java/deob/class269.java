package deob;

@ObfuscatedName("jv")
public class class269 extends class185 {

    @ObfuscatedName("jv.v")
    public static class155 field3534 = new class155(64);

    @ObfuscatedName("jv.x")
    public int field3535 = 0;

    @ObfuscatedName("jv.w")
    public int field3543 = -1;

    @ObfuscatedName("jv.t")
    public boolean field3539 = true;

    @ObfuscatedName("jv.j")
    public int field3538 = -1;

    @ObfuscatedName("jv.n")
    public int field3533;

    @ObfuscatedName("jv.p")
    public int field3540;

    @ObfuscatedName("jv.l")
    public int field3541;

    @ObfuscatedName("jv.z")
    public int field3542;

    @ObfuscatedName("jv.u")
    public int field3536;

    @ObfuscatedName("jv.e")
    public int field3537;

    @ObfuscatedName("bc.h(Lib;I)V")
    public static void method1036(class245 arg0) {
        Statics.field3544 = arg0;
    }

    @ObfuscatedName("gz.v(II)Ljv;")
    public static class269 method3350(int arg0) {
        class269 var1 = (class269) field3534.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3544.method3834(4, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4402(new class311(var2), arg0);
        }
        var3.method4401();
        field3534.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.x(I)V")
    public void method4401() {
        if (this.field3538 != -1) {
            this.method4404(this.field3538);
            this.field3542 = this.field3533;
            this.field3536 = this.field3540;
            this.field3537 = this.field3541;
        }
        this.method4404(this.field3535);
    }

    @ObfuscatedName("jv.w(Lkj;II)V")
    public void method4402(class311 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5274();
            if (var3 == 0) {
                return;
            }
            this.method4403(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jv.t(Lkj;IIB)V")
    public void method4403(class311 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3535 = arg0.method5119();
        } else if (arg1 == 2) {
            this.field3543 = arg0.method5274();
        } else if (arg1 == 5) {
            this.field3539 = false;
        } else if (arg1 == 7) {
            this.field3538 = arg0.method5119();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jv.j(II)V")
    public void method4404(int arg0) {
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
        this.field3533 = (int) (var18 * 256.0D);
        this.field3540 = (int) (var14 * 256.0D);
        this.field3541 = (int) (var16 * 256.0D);
        if (this.field3540 < 0) {
            this.field3540 = 0;
        } else if (this.field3540 > 255) {
            this.field3540 = 255;
        }
        if (this.field3541 < 0) {
            this.field3541 = 0;
        } else if (this.field3541 > 255) {
            this.field3541 = 255;
        }
    }
}
