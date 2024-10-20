package deob;

@ObfuscatedName("jy")
public class class275 extends class209 {

    @ObfuscatedName("jy.r")
    public static class203 field3602 = new class203(64);

    @ObfuscatedName("jy.e")
    public int field3604 = 0;

    @ObfuscatedName("jy.q")
    public int field3605 = -1;

    @ObfuscatedName("jy.c")
    public boolean field3603 = true;

    @ObfuscatedName("jy.l")
    public int field3607 = -1;

    @ObfuscatedName("jy.b")
    public int field3608;

    @ObfuscatedName("jy.w")
    public int field3609;

    @ObfuscatedName("jy.n")
    public int field3611;

    @ObfuscatedName("jy.i")
    public int field3606;

    @ObfuscatedName("jy.p")
    public int field3610;

    @ObfuscatedName("jy.m")
    public int field3613;

    @ObfuscatedName("hb.g(II)Ljy;")
    public static class275 method4040(int arg0) {
        class275 var1 = (class275) field3602.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3612.method4438(4, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method5038(new class185(var2), arg0);
        }
        var3.method5018();
        field3602.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.r(S)V")
    public void method5018() {
        if (this.field3607 != -1) {
            this.method5024(this.field3607);
            this.field3606 = this.field3608;
            this.field3610 = this.field3609;
            this.field3613 = this.field3611;
        }
        this.method5024(this.field3604);
    }

    @ObfuscatedName("jy.e(Lgl;IB)V")
    public void method5038(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3679();
            if (var3 == 0) {
                return;
            }
            this.method5020(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jy.q(Lgl;III)V")
    public void method5020(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3604 = arg0.method3469();
        } else if (arg1 == 2) {
            this.field3605 = arg0.method3679();
        } else if (arg1 == 5) {
            this.field3603 = false;
        } else if (arg1 == 7) {
            this.field3607 = arg0.method3469();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jy.c(II)V")
    public void method5024(int arg0) {
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
        this.field3608 = (int) (var18 * 256.0D);
        this.field3609 = (int) (var14 * 256.0D);
        this.field3611 = (int) (var16 * 256.0D);
        if (this.field3609 < 0) {
            this.field3609 = 0;
        } else if (this.field3609 > 255) {
            this.field3609 = 255;
        }
        if (this.field3611 < 0) {
            this.field3611 = 0;
        } else if (this.field3611 > 255) {
            this.field3611 = 255;
        }
    }

    @ObfuscatedName("ap.i(B)V")
    public static void method942() {
        field3602.method3880();
    }
}
