package deob;

@ObfuscatedName("js")
public class class274 extends class219 {

    @ObfuscatedName("js.q")
    public static class213 field3509 = new class213(64);

    @ObfuscatedName("js.i")
    public int field3507 = 0;

    @ObfuscatedName("js.a")
    public int field3505;

    @ObfuscatedName("js.l")
    public int field3508;

    @ObfuscatedName("js.b")
    public int field3510;

    @ObfuscatedName("js.e")
    public int field3511;

    @ObfuscatedName("iu.t(II)Ljs;")
    public static class274 method4181(int arg0) {
        class274 var1 = (class274) field3509.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3506.method4265(1, arg0);
        class274 var3 = new class274();
        if (var2 != null) {
            var3.method4428(new class195(var2), arg0);
        }
        var3.method4434();
        field3509.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("js.q(I)V")
    public void method4434() {
        this.method4441(this.field3507);
    }

    @ObfuscatedName("js.i(Lgb;IB)V")
    public void method4428(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3236();
            if (var3 == 0) {
                return;
            }
            this.method4430(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("js.a(Lgb;III)V")
    public void method4430(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3507 = arg0.method3399();
        }
    }

    @ObfuscatedName("js.l(IB)V")
    public void method4441(int arg0) {
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
        this.field3508 = (int) (var14 * 256.0D);
        this.field3510 = (int) (var16 * 256.0D);
        if (this.field3508 < 0) {
            this.field3508 = 0;
        } else if (this.field3508 > 255) {
            this.field3508 = 255;
        }
        if (this.field3510 < 0) {
            this.field3510 = 0;
        } else if (this.field3510 > 255) {
            this.field3510 = 255;
        }
        if (var16 > 0.5D) {
            this.field3511 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3511 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3511 < 1) {
            this.field3511 = 1;
        }
        this.field3505 = (int) ((double) this.field3511 * var18);
    }
}
