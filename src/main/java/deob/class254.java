package deob;

@ObfuscatedName("iw")
public class class254 extends class202 {

    @ObfuscatedName("iw.x")
    public static class197 field3417 = new class197(64);

    @ObfuscatedName("iw.k")
    public int field3411 = 0;

    @ObfuscatedName("iw.z")
    public int field3412;

    @ObfuscatedName("iw.v")
    public int field3413;

    @ObfuscatedName("iw.m")
    public int field3414;

    @ObfuscatedName("iw.b")
    public int field3415;

    @ObfuscatedName("bl.d(II)Liw;")
    public static class254 method1000(int arg0) {
        class254 var1 = (class254) field3417.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field638.method3935(1, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4171(new class181(var2), arg0);
        }
        var3.method4161();
        field3417.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.x(I)V")
    public void method4161() {
        this.method4163(this.field3411);
    }

    @ObfuscatedName("iw.k(Lfr;II)V")
    public void method4171(class181 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3204();
            if (var3 == 0) {
                return;
            }
            this.method4167(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iw.z(Lfr;IIB)V")
    public void method4167(class181 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3411 = arg0.method3235();
        }
    }

    @ObfuscatedName("iw.v(II)V")
    public void method4163(int arg0) {
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
        this.field3413 = (int) (var14 * 256.0D);
        this.field3414 = (int) (var16 * 256.0D);
        if (this.field3413 < 0) {
            this.field3413 = 0;
        } else if (this.field3413 > 255) {
            this.field3413 = 255;
        }
        if (this.field3414 < 0) {
            this.field3414 = 0;
        } else if (this.field3414 > 255) {
            this.field3414 = 255;
        }
        if (var16 > 0.5D) {
            this.field3415 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3415 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3415 < 1) {
            this.field3415 = 1;
        }
        this.field3412 = (int) ((double) this.field3415 * var18);
    }

    @ObfuscatedName("m.m(I)V")
    public static void method21() {
        field3417.method3422();
    }
}
