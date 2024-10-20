package deob;

@ObfuscatedName("jm")
public class class271 extends class206 {

    @ObfuscatedName("jm.g")
    public static class201 field3666 = new class201(64);

    @ObfuscatedName("jm.m")
    public int field3673 = 0;

    @ObfuscatedName("jm.h")
    public int field3668 = -1;

    @ObfuscatedName("jm.i")
    public boolean field3669 = true;

    @ObfuscatedName("jm.w")
    public int field3670 = -1;

    @ObfuscatedName("jm.t")
    public int field3665;

    @ObfuscatedName("jm.d")
    public int field3671;

    @ObfuscatedName("jm.z")
    public int field3672;

    @ObfuscatedName("jm.k")
    public int field3674;

    @ObfuscatedName("jm.c")
    public int field3675;

    @ObfuscatedName("jm.o")
    public int field3676;

    @ObfuscatedName("et.s(IB)Ljm;")
    public static class271 method2983(int arg0) {
        class271 var1 = (class271) field3666.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3667.method4231(4, arg0);
        class271 var3 = new class271();
        if (var2 != null) {
            var3.method4727(new class185(var2), arg0);
        }
        var3.method4740();
        field3666.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.g(I)V")
    public void method4740() {
        if (this.field3670 != -1) {
            this.method4729(this.field3670);
            this.field3674 = this.field3665;
            this.field3675 = this.field3671;
            this.field3676 = this.field3672;
        }
        this.method4729(this.field3673);
    }

    @ObfuscatedName("jm.m(Lgy;II)V")
    public void method4727(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3239();
            if (var3 == 0) {
                return;
            }
            this.method4728(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jm.h(Lgy;III)V")
    public void method4728(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3673 = arg0.method3243();
        } else if (arg1 == 2) {
            this.field3668 = arg0.method3239();
        } else if (arg1 == 5) {
            this.field3669 = false;
        } else if (arg1 == 7) {
            this.field3670 = arg0.method3243();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jm.i(IS)V")
    public void method4729(int arg0) {
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
        this.field3671 = (int) (var14 * 256.0D);
        this.field3672 = (int) (var16 * 256.0D);
        if (this.field3671 < 0) {
            this.field3671 = 0;
        } else if (this.field3671 > 255) {
            this.field3671 = 255;
        }
        if (this.field3672 < 0) {
            this.field3672 = 0;
        } else if (this.field3672 > 255) {
            this.field3672 = 255;
        }
    }
}
