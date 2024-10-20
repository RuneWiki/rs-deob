package deob;

@ObfuscatedName("iw")
public class class260 extends class195 {

    @ObfuscatedName("iw.k")
    public static class190 field3598 = new class190(64);

    @ObfuscatedName("iw.e")
    public int field3593 = 0;

    @ObfuscatedName("iw.p")
    public int field3594 = -1;

    @ObfuscatedName("iw.q")
    public boolean field3595 = true;

    @ObfuscatedName("iw.s")
    public int field3596 = -1;

    @ObfuscatedName("iw.r")
    public int field3603;

    @ObfuscatedName("iw.g")
    public int field3597;

    @ObfuscatedName("iw.v")
    public int field3599;

    @ObfuscatedName("iw.t")
    public int field3600;

    @ObfuscatedName("iw.y")
    public int field3592;

    @ObfuscatedName("iw.o")
    public int field3602;

    @ObfuscatedName("fc.d(Lit;I)V")
    public static void method2888(class236 arg0) {
        Statics.field3591 = arg0;
    }

    @ObfuscatedName("ao.k(II)Liw;")
    public static class260 method548(int arg0) {
        class260 var1 = (class260) field3598.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3591.method3875(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4398(new class174(var2), arg0);
        }
        var3.method4403();
        field3598.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.e(I)V")
    public void method4403() {
        if (this.field3596 != -1) {
            this.method4414(this.field3596);
            this.field3600 = this.field3603;
            this.field3592 = this.field3597;
            this.field3602 = this.field3599;
        }
        this.method4414(this.field3593);
    }

    @ObfuscatedName("iw.p(Lfg;II)V")
    public void method4398(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2955();
            if (var3 == 0) {
                return;
            }
            this.method4411(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iw.q(Lfg;III)V")
    public void method4411(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3593 = arg0.method3059();
        } else if (arg1 == 2) {
            this.field3594 = arg0.method2955();
        } else if (arg1 == 5) {
            this.field3595 = false;
        } else if (arg1 == 7) {
            this.field3596 = arg0.method3059();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("iw.s(II)V")
    public void method4414(int arg0) {
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
        this.field3603 = (int) (var18 * 256.0D);
        this.field3597 = (int) (var14 * 256.0D);
        this.field3599 = (int) (var16 * 256.0D);
        if (this.field3597 < 0) {
            this.field3597 = 0;
        } else if (this.field3597 > 255) {
            this.field3597 = 255;
        }
        if (this.field3599 < 0) {
            this.field3599 = 0;
        } else if (this.field3599 > 255) {
            this.field3599 = 255;
        }
    }

    @ObfuscatedName("af.r(I)V")
    public static void method305() {
        field3598.method3345();
    }
}
