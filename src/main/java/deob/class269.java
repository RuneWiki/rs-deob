package deob;

@ObfuscatedName("jo")
public class class269 extends class185 {

    @ObfuscatedName("jo.v")
    public static class155 field3540 = new class155(64);

    @ObfuscatedName("jo.d")
    public int field3536 = 0;

    @ObfuscatedName("jo.c")
    public int field3539 = -1;

    @ObfuscatedName("jo.y")
    public boolean field3541 = true;

    @ObfuscatedName("jo.h")
    public int field3538 = -1;

    @ObfuscatedName("jo.z")
    public int field3542;

    @ObfuscatedName("jo.e")
    public int field3543;

    @ObfuscatedName("jo.q")
    public int field3537;

    @ObfuscatedName("jo.l")
    public int field3547;

    @ObfuscatedName("jo.s")
    public int field3546;

    @ObfuscatedName("jo.b")
    public int field3544;

    @ObfuscatedName("hx.n(Lig;B)V")
    public static void method3945(class245 arg0) {
        Statics.field3545 = arg0;
    }

    @ObfuscatedName("eu.v(II)Ljo;")
    public static class269 method3187(int arg0) {
        class269 var1 = (class269) field3540.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3545.method4032(4, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4578(new class311(var2), arg0);
        }
        var3.method4567();
        field3540.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.d(B)V")
    public void method4567() {
        if (this.field3538 != -1) {
            this.method4569(this.field3538);
            this.field3547 = this.field3542;
            this.field3546 = this.field3543;
            this.field3544 = this.field3537;
        }
        this.method4569(this.field3536);
    }

    @ObfuscatedName("jo.c(Lkx;II)V")
    public void method4578(class311 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5310();
            if (var3 == 0) {
                return;
            }
            this.method4566(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jo.y(Lkx;IIB)V")
    public void method4566(class311 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3536 = arg0.method5263();
        } else if (arg1 == 2) {
            this.field3539 = arg0.method5310();
        } else if (arg1 == 5) {
            this.field3541 = false;
        } else if (arg1 == 7) {
            this.field3538 = arg0.method5263();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jo.h(IB)V")
    public void method4569(int arg0) {
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
        this.field3542 = (int) (var18 * 256.0D);
        this.field3543 = (int) (var14 * 256.0D);
        this.field3537 = (int) (var16 * 256.0D);
        if (this.field3543 < 0) {
            this.field3543 = 0;
        } else if (this.field3543 > 255) {
            this.field3543 = 255;
        }
        if (this.field3537 < 0) {
            this.field3537 = 0;
        } else if (this.field3537 > 255) {
            this.field3537 = 255;
        }
    }

    @ObfuscatedName("hx.z(I)V")
    public static void method3946() {
        field3540.method3218();
    }
}
