package deob;

@ObfuscatedName("ip")
public class class260 extends class195 {

    @ObfuscatedName("ip.h")
    public static class190 field3591 = new class190(64);

    @ObfuscatedName("ip.u")
    public int field3595 = 0;

    @ObfuscatedName("ip.q")
    public int field3584 = -1;

    @ObfuscatedName("ip.g")
    public boolean field3585 = true;

    @ObfuscatedName("ip.v")
    public int field3581 = -1;

    @ObfuscatedName("ip.t")
    public int field3587;

    @ObfuscatedName("ip.p")
    public int field3588;

    @ObfuscatedName("ip.l")
    public int field3589;

    @ObfuscatedName("ip.a")
    public int field3586;

    @ObfuscatedName("ip.k")
    public int field3590;

    @ObfuscatedName("ip.r")
    public int field3592;

    @ObfuscatedName("gp.i(Liy;I)V")
    public static void method3584(class236 arg0) {
        Statics.field3582 = arg0;
    }

    @ObfuscatedName("cm.h(II)Lip;")
    public static class260 method1669(int arg0) {
        class260 var1 = (class260) field3591.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3582.method3836(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4382(new class174(var2), arg0);
        }
        var3.method4388();
        field3591.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.u(B)V")
    public void method4388() {
        if (this.field3581 != -1) {
            this.method4378(this.field3581);
            this.field3586 = this.field3587;
            this.field3590 = this.field3588;
            this.field3592 = this.field3589;
        }
        this.method4378(this.field3595);
    }

    @ObfuscatedName("ip.q(Lfv;IS)V")
    public void method4382(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2930();
            if (var3 == 0) {
                return;
            }
            this.method4375(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ip.g(Lfv;III)V")
    public void method4375(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3595 = arg0.method3033();
        } else if (arg1 == 2) {
            this.field3584 = arg0.method2930();
        } else if (arg1 == 5) {
            this.field3585 = false;
        } else if (arg1 == 7) {
            this.field3581 = arg0.method3033();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ip.v(IB)V")
    public void method4378(int arg0) {
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
        this.field3587 = (int) (var18 * 256.0D);
        this.field3588 = (int) (var14 * 256.0D);
        this.field3589 = (int) (var16 * 256.0D);
        if (this.field3588 < 0) {
            this.field3588 = 0;
        } else if (this.field3588 > 255) {
            this.field3588 = 255;
        }
        if (this.field3589 < 0) {
            this.field3589 = 0;
        } else if (this.field3589 > 255) {
            this.field3589 = 255;
        }
    }
}
