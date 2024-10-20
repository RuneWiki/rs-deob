package deob;

@ObfuscatedName("iz")
public class class248 extends class196 {

    @ObfuscatedName("iz.j")
    public static class191 field3349 = new class191(64);

    @ObfuscatedName("iz.a")
    public int field3346 = 0;

    @ObfuscatedName("iz.r")
    public int field3347;

    @ObfuscatedName("iz.o")
    public int field3348;

    @ObfuscatedName("iz.n")
    public int field3345;

    @ObfuscatedName("iz.q")
    public int field3350;

    @ObfuscatedName("ci.i(IS)Liz;")
    public static class248 method1638(int arg0) {
        class248 var1 = (class248) field3349.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3344.method3824(1, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4033(new class175(var2), arg0);
        }
        var3.method4025();
        field3349.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.j(I)V")
    public void method4025() {
        this.method4038(this.field3346);
    }

    @ObfuscatedName("iz.a(Lfp;II)V")
    public void method4033(class175 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2999();
            if (var3 == 0) {
                return;
            }
            this.method4039(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iz.r(Lfp;III)V")
    public void method4039(class175 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3346 = arg0.method2997();
        }
    }

    @ObfuscatedName("iz.o(II)V")
    public void method4038(int arg0) {
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
        this.field3348 = (int) (var14 * 256.0D);
        this.field3345 = (int) (var16 * 256.0D);
        if (this.field3348 < 0) {
            this.field3348 = 0;
        } else if (this.field3348 > 255) {
            this.field3348 = 255;
        }
        if (this.field3345 < 0) {
            this.field3345 = 0;
        } else if (this.field3345 > 255) {
            this.field3345 = 255;
        }
        if (var16 > 0.5D) {
            this.field3350 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3350 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3350 < 1) {
            this.field3350 = 1;
        }
        this.field3347 = (int) ((double) this.field3350 * var18);
    }

    @ObfuscatedName("hh.n(I)V")
    public static void method3653() {
        field3349.method3355();
    }
}
