package deob;

@ObfuscatedName("jy")
public class class274 extends class219 {

    @ObfuscatedName("jy.z")
    public static class213 field3495 = new class213(64);

    @ObfuscatedName("jy.n")
    public int field3497 = 0;

    @ObfuscatedName("jy.r")
    public int field3498;

    @ObfuscatedName("jy.e")
    public int field3499;

    @ObfuscatedName("jy.y")
    public int field3500;

    @ObfuscatedName("jy.k")
    public int field3501;

    @ObfuscatedName("di.d(Ljk;B)V")
    public static void method2389(class262 arg0) {
        Statics.field3496 = arg0;
    }

    @ObfuscatedName("jp.z(II)Ljy;")
    public static class274 method4455(int arg0) {
        class274 var1 = (class274) field3495.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3496.method4273(1, arg0);
        class274 var3 = new class274();
        if (var2 != null) {
            var3.method4538(new class195(var2), arg0);
        }
        var3.method4537();
        field3495.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.n(B)V")
    public void method4537() {
        this.method4548(this.field3497);
    }

    @ObfuscatedName("jy.r(Lgy;II)V")
    public void method4538(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3330();
            if (var3 == 0) {
                return;
            }
            this.method4557(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jy.e(Lgy;III)V")
    public void method4557(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3497 = arg0.method3263();
        }
    }

    @ObfuscatedName("jy.y(II)V")
    public void method4548(int arg0) {
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
        this.field3499 = (int) (var14 * 256.0D);
        this.field3500 = (int) (var16 * 256.0D);
        if (this.field3499 < 0) {
            this.field3499 = 0;
        } else if (this.field3499 > 255) {
            this.field3499 = 255;
        }
        if (this.field3500 < 0) {
            this.field3500 = 0;
        } else if (this.field3500 > 255) {
            this.field3500 = 255;
        }
        if (var16 > 0.5D) {
            this.field3501 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3501 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3501 < 1) {
            this.field3501 = 1;
        }
        this.field3498 = (int) ((double) this.field3501 * var18);
    }

    @ObfuscatedName("eo.k(I)V")
    public static void method2935() {
        field3495.method3700();
    }
}
