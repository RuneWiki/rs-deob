package deob;

@ObfuscatedName("jx")
public class class274 extends class219 {

    @ObfuscatedName("jx.i")
    public static class213 field3503 = new class213(64);

    @ObfuscatedName("jx.o")
    public int field3501 = 0;

    @ObfuscatedName("jx.j")
    public int field3500;

    @ObfuscatedName("jx.k")
    public int field3502;

    @ObfuscatedName("jx.x")
    public int field3504;

    @ObfuscatedName("jx.z")
    public int field3505;

    @ObfuscatedName("bs.c(II)Ljx;")
    public static class274 method992(int arg0) {
        class274 var1 = (class274) field3503.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field640.method4190(1, arg0);
        class274 var3 = new class274();
        if (var2 != null) {
            var3.method4441(new class195(var2), arg0);
        }
        var3.method4440();
        field3503.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.i(I)V")
    public void method4440() {
        this.method4442(this.field3501);
    }

    @ObfuscatedName("jx.o(Lgp;II)V")
    public void method4441(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3429();
            if (var3 == 0) {
                return;
            }
            this.method4453(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jx.j(Lgp;III)V")
    public void method4453(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3501 = arg0.method3293();
        }
    }

    @ObfuscatedName("jx.k(II)V")
    public void method4442(int arg0) {
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
        this.field3502 = (int) (var14 * 256.0D);
        this.field3504 = (int) (var16 * 256.0D);
        if (this.field3502 < 0) {
            this.field3502 = 0;
        } else if (this.field3502 > 255) {
            this.field3502 = 255;
        }
        if (this.field3504 < 0) {
            this.field3504 = 0;
        } else if (this.field3504 > 255) {
            this.field3504 = 255;
        }
        if (var16 > 0.5D) {
            this.field3505 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3505 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3505 < 1) {
            this.field3505 = 1;
        }
        this.field3500 = (int) ((double) this.field3505 * var18);
    }

    @ObfuscatedName("cy.x(I)V")
    public static void method1627() {
        field3503.method3629();
    }
}
