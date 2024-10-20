package deob;

@ObfuscatedName("ih")
public class class260 extends class195 {

    @ObfuscatedName("ih.p")
    public static class190 field3597 = new class190(64);

    @ObfuscatedName("ih.i")
    public int field3604 = 0;

    @ObfuscatedName("ih.j")
    public int field3600 = -1;

    @ObfuscatedName("ih.f")
    public boolean field3598 = true;

    @ObfuscatedName("ih.m")
    public int field3601 = -1;

    @ObfuscatedName("ih.c")
    public int field3602;

    @ObfuscatedName("ih.z")
    public int field3603;

    @ObfuscatedName("ih.h")
    public int field3596;

    @ObfuscatedName("ih.g")
    public int field3605;

    @ObfuscatedName("ih.e")
    public int field3606;

    @ObfuscatedName("ih.o")
    public int field3607;

    @ObfuscatedName("et.n(Lis;I)V")
    public static void method2705(class236 arg0) {
        Statics.field3599 = arg0;
    }

    @ObfuscatedName("m.p(IB)Lih;")
    public static class260 method18(int arg0) {
        class260 var1 = (class260) field3597.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3599.method3880(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4384(new class174(var2), arg0);
        }
        var3.method4383();
        field3597.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.i(I)V")
    public void method4383() {
        if (this.field3601 != -1) {
            this.method4386(this.field3601);
            this.field3605 = this.field3602;
            this.field3606 = this.field3603;
            this.field3607 = this.field3596;
        }
        this.method4386(this.field3604);
    }

    @ObfuscatedName("ih.j(Lfl;IB)V")
    public void method4384(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2925();
            if (var3 == 0) {
                return;
            }
            this.method4385(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ih.f(Lfl;IIB)V")
    public void method4385(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3604 = arg0.method2910();
        } else if (arg1 == 2) {
            this.field3600 = arg0.method2925();
        } else if (arg1 == 5) {
            this.field3598 = false;
        } else if (arg1 == 7) {
            this.field3601 = arg0.method2910();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ih.m(II)V")
    public void method4386(int arg0) {
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
        this.field3602 = (int) (var18 * 256.0D);
        this.field3603 = (int) (var14 * 256.0D);
        this.field3596 = (int) (var16 * 256.0D);
        if (this.field3603 < 0) {
            this.field3603 = 0;
        } else if (this.field3603 > 255) {
            this.field3603 = 255;
        }
        if (this.field3596 < 0) {
            this.field3596 = 0;
        } else if (this.field3596 > 255) {
            this.field3596 = 255;
        }
    }
}
