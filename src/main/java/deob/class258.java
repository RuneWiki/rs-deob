package deob;

@ObfuscatedName("is")
public class class258 extends class176 {

    @ObfuscatedName("is.t")
    public static class146 field3499 = new class146(64);

    @ObfuscatedName("is.n")
    public int field3494 = 0;

    @ObfuscatedName("is.q")
    public int field3498 = -1;

    @ObfuscatedName("is.v")
    public boolean field3496 = true;

    @ObfuscatedName("is.l")
    public int field3497 = -1;

    @ObfuscatedName("is.c")
    public int field3495;

    @ObfuscatedName("is.o")
    public int field3492;

    @ObfuscatedName("is.i")
    public int field3500;

    @ObfuscatedName("is.d")
    public int field3501;

    @ObfuscatedName("is.m")
    public int field3502;

    @ObfuscatedName("is.p")
    public int field3503;

    @ObfuscatedName("bh.a(Lhq;I)V")
    public static void method1061(class234 arg0) {
        Statics.field3493 = arg0;
    }

    @ObfuscatedName("y.t(II)Lis;")
    public static class258 method308(int arg0) {
        class258 var1 = (class258) field3499.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3493.method3873(4, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4435(new class300(var2), arg0);
        }
        var3.method4434();
        field3499.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.n(S)V")
    public void method4434() {
        if (this.field3497 != -1) {
            this.method4437(this.field3497);
            this.field3501 = this.field3495;
            this.field3502 = this.field3492;
            this.field3503 = this.field3500;
        }
        this.method4437(this.field3494);
    }

    @ObfuscatedName("is.q(Lkc;IB)V")
    public void method4435(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5123();
            if (var3 == 0) {
                return;
            }
            this.method4436(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("is.v(Lkc;III)V")
    public void method4436(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3494 = arg0.method5127();
        } else if (arg1 == 2) {
            this.field3498 = arg0.method5123();
        } else if (arg1 == 5) {
            this.field3496 = false;
        } else if (arg1 == 7) {
            this.field3497 = arg0.method5127();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("is.l(IB)V")
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
        this.field3495 = (int) (var18 * 256.0D);
        this.field3492 = (int) (var14 * 256.0D);
        this.field3500 = (int) (var16 * 256.0D);
        if (this.field3492 < 0) {
            this.field3492 = 0;
        } else if (this.field3492 > 255) {
            this.field3492 = 255;
        }
        if (this.field3500 < 0) {
            this.field3500 = 0;
        } else if (this.field3500 > 255) {
            this.field3500 = 255;
        }
    }
}
