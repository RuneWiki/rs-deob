package deob;

@ObfuscatedName("jh")
public class class271 extends class206 {

    @ObfuscatedName("jh.w")
    public static class201 field3658 = new class201(64);

    @ObfuscatedName("jh.e")
    public int field3664 = 0;

    @ObfuscatedName("jh.k")
    public int field3663 = -1;

    @ObfuscatedName("jh.u")
    public boolean field3661 = true;

    @ObfuscatedName("jh.z")
    public int field3659 = -1;

    @ObfuscatedName("jh.t")
    public int field3657;

    @ObfuscatedName("jh.f")
    public int field3660;

    @ObfuscatedName("jh.g")
    public int field3665;

    @ObfuscatedName("jh.j")
    public int field3666;

    @ObfuscatedName("jh.x")
    public int field3667;

    @ObfuscatedName("jh.c")
    public int field3668;

    @ObfuscatedName("cc.a(II)Ljh;")
    public static class271 method1655(int arg0) {
        class271 var1 = (class271) field3658.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3662.method3897(4, arg0);
        class271 var3 = new class271();
        if (var2 != null) {
            var3.method4435(new class185(var2), arg0);
        }
        var3.method4434();
        field3658.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.w(B)V")
    public void method4434() {
        if (this.field3659 != -1) {
            this.method4437(this.field3659);
            this.field3666 = this.field3657;
            this.field3667 = this.field3660;
            this.field3668 = this.field3665;
        }
        this.method4437(this.field3664);
    }

    @ObfuscatedName("jh.e(Lgh;IB)V")
    public void method4435(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2962();
            if (var3 == 0) {
                return;
            }
            this.method4436(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jh.k(Lgh;III)V")
    public void method4436(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3664 = arg0.method2966();
        } else if (arg1 == 2) {
            this.field3663 = arg0.method2962();
        } else if (arg1 == 5) {
            this.field3661 = false;
        } else if (arg1 == 7) {
            this.field3659 = arg0.method2966();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jh.u(II)V")
    public void method4437(int arg0) {
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
        this.field3657 = (int) (var18 * 256.0D);
        this.field3660 = (int) (var14 * 256.0D);
        this.field3665 = (int) (var16 * 256.0D);
        if (this.field3660 < 0) {
            this.field3660 = 0;
        } else if (this.field3660 > 255) {
            this.field3660 = 255;
        }
        if (this.field3665 < 0) {
            this.field3665 = 0;
        } else if (this.field3665 > 255) {
            this.field3665 = 255;
        }
    }
}
