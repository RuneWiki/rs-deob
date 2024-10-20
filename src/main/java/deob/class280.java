package deob;

@ObfuscatedName("jv")
public class class280 extends class215 {

    @ObfuscatedName("jv.q")
    public static class210 field3678 = new class210(64);

    @ObfuscatedName("jv.o")
    public int field3667 = 0;

    @ObfuscatedName("jv.p")
    public int field3668 = -1;

    @ObfuscatedName("jv.a")
    public boolean field3673 = true;

    @ObfuscatedName("jv.h")
    public int field3670 = -1;

    @ObfuscatedName("jv.l")
    public int field3665;

    @ObfuscatedName("jv.y")
    public int field3672;

    @ObfuscatedName("jv.g")
    public int field3677;

    @ObfuscatedName("jv.c")
    public int field3674;

    @ObfuscatedName("jv.u")
    public int field3675;

    @ObfuscatedName("jv.r")
    public int field3676;

    @ObfuscatedName("z.b(II)Ljv;")
    public static class280 method163(int arg0) {
        class280 var1 = (class280) field3678.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3666.method4158(4, arg0);
        class280 var3 = new class280();
        if (var2 != null) {
            var3.method4711(new class194(var2), arg0);
        }
        var3.method4706();
        field3678.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.q(I)V")
    public void method4706() {
        if (this.field3670 != -1) {
            this.method4709(this.field3670);
            this.field3674 = this.field3665;
            this.field3675 = this.field3672;
            this.field3676 = this.field3677;
        }
        this.method4709(this.field3667);
    }

    @ObfuscatedName("jv.o(Lgn;II)V")
    public void method4711(class194 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3247();
            if (var3 == 0) {
                return;
            }
            this.method4708(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jv.p(Lgn;IIB)V")
    public void method4708(class194 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3667 = arg0.method3251();
        } else if (arg1 == 2) {
            this.field3668 = arg0.method3247();
        } else if (arg1 == 5) {
            this.field3673 = false;
        } else if (arg1 == 7) {
            this.field3670 = arg0.method3251();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jv.a(II)V")
    public void method4709(int arg0) {
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
        this.field3665 = (int) (var18 * 256.0D);
        this.field3672 = (int) (var14 * 256.0D);
        this.field3677 = (int) (var16 * 256.0D);
        if (this.field3672 < 0) {
            this.field3672 = 0;
        } else if (this.field3672 > 255) {
            this.field3672 = 255;
        }
        if (this.field3677 < 0) {
            this.field3677 = 0;
        } else if (this.field3677 > 255) {
            this.field3677 = 255;
        }
    }
}
