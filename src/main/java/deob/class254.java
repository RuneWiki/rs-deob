package deob;

@ObfuscatedName("iw")
public class class254 extends class202 {

    @ObfuscatedName("iw.p")
    public static class197 field3394 = new class197(64);

    @ObfuscatedName("iw.i")
    public int field3396 = 0;

    @ObfuscatedName("iw.j")
    public int field3397;

    @ObfuscatedName("iw.v")
    public int field3398;

    @ObfuscatedName("iw.x")
    public int field3395;

    @ObfuscatedName("iw.e")
    public int field3399;

    @ObfuscatedName("i.m(II)Liw;")
    public static class254 method5(int arg0) {
        class254 var1 = (class254) field3394.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3401.method3930(1, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4164(new class181(var2), arg0);
        }
        var3.method4163();
        field3394.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.p(I)V")
    public void method4163() {
        this.method4173(this.field3396);
    }

    @ObfuscatedName("iw.i(Lfv;II)V")
    public void method4164(class181 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3012();
            if (var3 == 0) {
                return;
            }
            this.method4165(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iw.j(Lfv;III)V")
    public void method4165(class181 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3396 = arg0.method3075();
        }
    }

    @ObfuscatedName("iw.v(II)V")
    public void method4173(int arg0) {
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
        this.field3398 = (int) (var14 * 256.0D);
        this.field3395 = (int) (var16 * 256.0D);
        if (this.field3398 < 0) {
            this.field3398 = 0;
        } else if (this.field3398 > 255) {
            this.field3398 = 255;
        }
        if (this.field3395 < 0) {
            this.field3395 = 0;
        } else if (this.field3395 > 255) {
            this.field3395 = 255;
        }
        if (var16 > 0.5D) {
            this.field3399 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3399 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3399 < 1) {
            this.field3399 = 1;
        }
        this.field3397 = (int) ((double) this.field3399 * var18);
    }

    @ObfuscatedName("ip.x(I)V")
    public static void method3909() {
        field3394.method3423();
    }
}
