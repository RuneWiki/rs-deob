package deob;

@ObfuscatedName("iq")
public class class260 extends class207 {

    @ObfuscatedName("iq.w")
    public static class201 field3283 = new class201(64);

    @ObfuscatedName("iq.s")
    public int field3289 = 0;

    @ObfuscatedName("iq.l")
    public int field3285;

    @ObfuscatedName("iq.u")
    public int field3288;

    @ObfuscatedName("iq.q")
    public int field3287;

    @ObfuscatedName("iq.k")
    public int field3282;

    @ObfuscatedName("bh.z(Lir;I)V")
    public static void method990(class248 arg0) {
        Statics.field3284 = arg0;
    }

    @ObfuscatedName("am.w(II)Liq;")
    public static class260 method874(int arg0) {
        class260 var1 = (class260) field3283.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3284.method4247(1, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4489(new class183(var2), arg0);
        }
        var3.method4484();
        field3283.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.s(I)V")
    public void method4484() {
        this.method4494(this.field3289);
    }

    @ObfuscatedName("iq.l(Lgk;II)V")
    public void method4489(class183 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3247();
            if (var3 == 0) {
                return;
            }
            this.method4490(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iq.u(Lgk;IIB)V")
    public void method4490(class183 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3289 = arg0.method3255();
        }
    }

    @ObfuscatedName("iq.q(II)V")
    public void method4494(int arg0) {
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
        this.field3288 = (int) (var14 * 256.0D);
        this.field3287 = (int) (var16 * 256.0D);
        if (this.field3288 < 0) {
            this.field3288 = 0;
        } else if (this.field3288 > 255) {
            this.field3288 = 255;
        }
        if (this.field3287 < 0) {
            this.field3287 = 0;
        } else if (this.field3287 > 255) {
            this.field3287 = 255;
        }
        if (var16 > 0.5D) {
            this.field3282 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3282 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3282 < 1) {
            this.field3282 = 1;
        }
        this.field3285 = (int) ((double) this.field3282 * var18);
    }
}
