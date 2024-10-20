package deob;

@ObfuscatedName("jf")
public class class261 extends class196 {

    @ObfuscatedName("jf.j")
    public static class191 field3586 = new class191(64);

    @ObfuscatedName("jf.a")
    public int field3587 = 0;

    @ObfuscatedName("jf.r")
    public int field3588 = -1;

    @ObfuscatedName("jf.o")
    public boolean field3589 = true;

    @ObfuscatedName("jf.n")
    public int field3590 = -1;

    @ObfuscatedName("jf.q")
    public int field3591;

    @ObfuscatedName("jf.b")
    public int field3593;

    @ObfuscatedName("jf.k")
    public int field3585;

    @ObfuscatedName("jf.s")
    public int field3594;

    @ObfuscatedName("jf.d")
    public int field3592;

    @ObfuscatedName("jf.l")
    public int field3595;

    @ObfuscatedName("bz.i(IB)Ljf;")
    public static class261 method985(int arg0) {
        class261 var1 = (class261) field3586.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3596.method3824(4, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4325(new class175(var2), arg0);
        }
        var3.method4321();
        field3586.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.j(I)V")
    public void method4321() {
        if (this.field3590 != -1) {
            this.method4324(this.field3590);
            this.field3594 = this.field3591;
            this.field3592 = this.field3593;
            this.field3595 = this.field3585;
        }
        this.method4324(this.field3587);
    }

    @ObfuscatedName("jf.a(Lfp;II)V")
    public void method4325(class175 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2999();
            if (var3 == 0) {
                return;
            }
            this.method4323(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jf.r(Lfp;III)V")
    public void method4323(class175 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3587 = arg0.method2997();
        } else if (arg1 == 2) {
            this.field3588 = arg0.method2999();
        } else if (arg1 == 5) {
            this.field3589 = false;
        } else if (arg1 == 7) {
            this.field3590 = arg0.method2997();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jf.o(IB)V")
    public void method4324(int arg0) {
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
        this.field3591 = (int) (var18 * 256.0D);
        this.field3593 = (int) (var14 * 256.0D);
        this.field3585 = (int) (var16 * 256.0D);
        if (this.field3593 < 0) {
            this.field3593 = 0;
        } else if (this.field3593 > 255) {
            this.field3593 = 255;
        }
        if (this.field3585 < 0) {
            this.field3585 = 0;
        } else if (this.field3585 > 255) {
            this.field3585 = 255;
        }
    }

    @ObfuscatedName("bm.n(B)V")
    public static void method1018() {
        field3586.method3355();
    }
}
