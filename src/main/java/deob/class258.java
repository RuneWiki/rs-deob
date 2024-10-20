package deob;

@ObfuscatedName("il")
public class class258 extends class206 {

    @ObfuscatedName("il.g")
    public static class201 field3429 = new class201(64);

    @ObfuscatedName("il.m")
    public int field3424 = 0;

    @ObfuscatedName("il.h")
    public int field3423;

    @ObfuscatedName("il.i")
    public int field3422;

    @ObfuscatedName("il.w")
    public int field3427;

    @ObfuscatedName("il.t")
    public int field3428;

    @ObfuscatedName("bw.s(II)Lil;")
    public static class258 method1084(int arg0) {
        class258 var1 = (class258) field3429.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3426.method4231(1, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4421(new class185(var2), arg0);
        }
        var3.method4420();
        field3429.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.g(B)V")
    public void method4420() {
        this.method4423(this.field3424);
    }

    @ObfuscatedName("il.m(Lgy;II)V")
    public void method4421(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3239();
            if (var3 == 0) {
                return;
            }
            this.method4422(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("il.h(Lgy;III)V")
    public void method4422(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3424 = arg0.method3243();
        }
    }

    @ObfuscatedName("il.i(II)V")
    public void method4423(int arg0) {
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
        this.field3422 = (int) (var14 * 256.0D);
        this.field3427 = (int) (var16 * 256.0D);
        if (this.field3422 < 0) {
            this.field3422 = 0;
        } else if (this.field3422 > 255) {
            this.field3422 = 255;
        }
        if (this.field3427 < 0) {
            this.field3427 = 0;
        } else if (this.field3427 > 255) {
            this.field3427 = 255;
        }
        if (var16 > 0.5D) {
            this.field3428 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3428 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3428 < 1) {
            this.field3428 = 1;
        }
        this.field3423 = (int) ((double) this.field3428 * var18);
    }
}
