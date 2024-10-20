package deob;

@ObfuscatedName("jv")
public class class273 extends class207 {

    @ObfuscatedName("jv.w")
    public static class201 field3525 = new class201(64);

    @ObfuscatedName("jv.s")
    public int field3534 = 0;

    @ObfuscatedName("jv.l")
    public int field3527 = -1;

    @ObfuscatedName("jv.u")
    public boolean field3524 = true;

    @ObfuscatedName("jv.q")
    public int field3529 = -1;

    @ObfuscatedName("jv.k")
    public int field3526;

    @ObfuscatedName("jv.i")
    public int field3531;

    @ObfuscatedName("jv.x")
    public int field3532;

    @ObfuscatedName("jv.e")
    public int field3528;

    @ObfuscatedName("jv.p")
    public int field3533;

    @ObfuscatedName("jv.b")
    public int field3535;

    @ObfuscatedName("j.z(Lir;I)V")
    public static void method258(class248 arg0) {
        Statics.field3530 = arg0;
    }

    @ObfuscatedName("w.w(IB)Ljv;")
    public static class273 method16(int arg0) {
        class273 var1 = (class273) field3525.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3530.method4247(4, arg0);
        class273 var3 = new class273();
        if (var2 != null) {
            var3.method4800(new class183(var2), arg0);
        }
        var3.method4801();
        field3525.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.s(I)V")
    public void method4801() {
        if (this.field3529 != -1) {
            this.method4798(this.field3529);
            this.field3528 = this.field3526;
            this.field3533 = this.field3531;
            this.field3535 = this.field3532;
        }
        this.method4798(this.field3534);
    }

    @ObfuscatedName("jv.l(Lgk;II)V")
    public void method4800(class183 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3247();
            if (var3 == 0) {
                return;
            }
            this.method4797(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jv.u(Lgk;III)V")
    public void method4797(class183 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3534 = arg0.method3255();
        } else if (arg1 == 2) {
            this.field3527 = arg0.method3247();
        } else if (arg1 == 5) {
            this.field3524 = false;
        } else if (arg1 == 7) {
            this.field3529 = arg0.method3255();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jv.q(II)V")
    public void method4798(int arg0) {
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
        this.field3526 = (int) (var18 * 256.0D);
        this.field3531 = (int) (var14 * 256.0D);
        this.field3532 = (int) (var16 * 256.0D);
        if (this.field3531 < 0) {
            this.field3531 = 0;
        } else if (this.field3531 > 255) {
            this.field3531 = 255;
        }
        if (this.field3532 < 0) {
            this.field3532 = 0;
        } else if (this.field3532 > 255) {
            this.field3532 = 255;
        }
    }

    @ObfuscatedName("ae.i(I)V")
    public static void method636() {
        field3525.method3676();
    }
}
