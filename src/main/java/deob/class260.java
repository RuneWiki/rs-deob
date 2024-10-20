package deob;

@ObfuscatedName("ik")
public class class260 extends class195 {

    @ObfuscatedName("ik.m")
    public static class190 field3598 = new class190(64);

    @ObfuscatedName("ik.e")
    public int field3593 = 0;

    @ObfuscatedName("ik.t")
    public int field3602 = -1;

    @ObfuscatedName("ik.w")
    public boolean field3594 = true;

    @ObfuscatedName("ik.z")
    public int field3596 = -1;

    @ObfuscatedName("ik.j")
    public int field3597;

    @ObfuscatedName("ik.i")
    public int field3591;

    @ObfuscatedName("ik.f")
    public int field3592;

    @ObfuscatedName("ik.c")
    public int field3600;

    @ObfuscatedName("ik.o")
    public int field3601;

    @ObfuscatedName("ik.q")
    public int field3599;

    @ObfuscatedName("ih.p(II)Lik;")
    public static class260 method4016(int arg0) {
        class260 var1 = (class260) field3598.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3595.method3720(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4248(new class174(var2), arg0);
        }
        var3.method4247();
        field3598.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.m(I)V")
    public void method4247() {
        if (this.field3596 != -1) {
            this.method4250(this.field3596);
            this.field3600 = this.field3597;
            this.field3601 = this.field3591;
            this.field3599 = this.field3592;
        }
        this.method4250(this.field3593);
    }

    @ObfuscatedName("ik.e(Lfr;II)V")
    public void method4248(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2810();
            if (var3 == 0) {
                return;
            }
            this.method4249(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ik.t(Lfr;IIB)V")
    public void method4249(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3593 = arg0.method2832();
        } else if (arg1 == 2) {
            this.field3602 = arg0.method2810();
        } else if (arg1 == 5) {
            this.field3594 = false;
        } else if (arg1 == 7) {
            this.field3596 = arg0.method2832();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ik.w(II)V")
    public void method4250(int arg0) {
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
        this.field3597 = (int) (var18 * 256.0D);
        this.field3591 = (int) (var14 * 256.0D);
        this.field3592 = (int) (var16 * 256.0D);
        if (this.field3591 < 0) {
            this.field3591 = 0;
        } else if (this.field3591 > 255) {
            this.field3591 = 255;
        }
        if (this.field3592 < 0) {
            this.field3592 = 0;
        } else if (this.field3592 > 255) {
            this.field3592 = 255;
        }
    }

    @ObfuscatedName("is.z(B)V")
    public static void method3976() {
        field3598.method3180();
    }
}
