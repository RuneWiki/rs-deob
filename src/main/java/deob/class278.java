package deob;

@ObfuscatedName("jj")
public class class278 extends class214 {

    @ObfuscatedName("jj.h")
    public static class208 field3587 = new class208(64);

    @ObfuscatedName("jj.l")
    public int field3588 = 0;

    @ObfuscatedName("jj.g")
    public int field3589 = -1;

    @ObfuscatedName("jj.b")
    public boolean field3586 = true;

    @ObfuscatedName("jj.a")
    public int field3593 = -1;

    @ObfuscatedName("jj.c")
    public int field3592;

    @ObfuscatedName("jj.z")
    public int field3590;

    @ObfuscatedName("jj.j")
    public int field3594;

    @ObfuscatedName("jj.d")
    public int field3597;

    @ObfuscatedName("jj.t")
    public int field3596;

    @ObfuscatedName("jj.f")
    public int field3591;

    @ObfuscatedName("ey.n(IS)Ljj;")
    public static class278 method3135(int arg0) {
        class278 var1 = (class278) field3587.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3595.method4494(4, arg0);
        class278 var3 = new class278();
        if (var2 != null) {
            var3.method5023(new class190(var2), arg0);
        }
        var3.method5007();
        field3587.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.h(I)V")
    public void method5007() {
        if (this.field3593 != -1) {
            this.method5010(this.field3593);
            this.field3597 = this.field3592;
            this.field3596 = this.field3590;
            this.field3591 = this.field3594;
        }
        this.method5010(this.field3588);
    }

    @ObfuscatedName("jj.l(Lgc;II)V")
    public void method5023(class190 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3511();
            if (var3 == 0) {
                return;
            }
            this.method5006(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jj.g(Lgc;IIB)V")
    public void method5006(class190 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3588 = arg0.method3515();
        } else if (arg1 == 2) {
            this.field3589 = arg0.method3511();
        } else if (arg1 == 5) {
            this.field3586 = false;
        } else if (arg1 == 7) {
            this.field3593 = arg0.method3515();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jj.b(IB)V")
    public void method5010(int arg0) {
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
        this.field3592 = (int) (var18 * 256.0D);
        this.field3590 = (int) (var14 * 256.0D);
        this.field3594 = (int) (var16 * 256.0D);
        if (this.field3590 < 0) {
            this.field3590 = 0;
        } else if (this.field3590 > 255) {
            this.field3590 = 255;
        }
        if (this.field3594 < 0) {
            this.field3594 = 0;
        } else if (this.field3594 > 255) {
            this.field3594 = 255;
        }
    }

    @ObfuscatedName("jq.a(I)V")
    public static void method4861() {
        field3587.method3899();
    }
}
