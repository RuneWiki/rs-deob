package deob;

@ObfuscatedName("ih")
public class class258 extends class206 {

    @ObfuscatedName("ih.w")
    public static class201 field3424 = new class201(64);

    @ObfuscatedName("ih.e")
    public int field3425 = 0;

    @ObfuscatedName("ih.k")
    public int field3427;

    @ObfuscatedName("ih.u")
    public int field3428;

    @ObfuscatedName("ih.z")
    public int field3429;

    @ObfuscatedName("ih.t")
    public int field3426;

    @ObfuscatedName("hd.a(II)Lih;")
    public static class258 method3796(int arg0) {
        class258 var1 = (class258) field3424.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3430.method3897(1, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4126(new class185(var2), arg0);
        }
        var3.method4125();
        field3424.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.w(S)V")
    public void method4125() {
        this.method4124(this.field3425);
    }

    @ObfuscatedName("ih.e(Lgh;II)V")
    public void method4126(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2962();
            if (var3 == 0) {
                return;
            }
            this.method4127(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ih.k(Lgh;III)V")
    public void method4127(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3425 = arg0.method2966();
        }
    }

    @ObfuscatedName("ih.u(IB)V")
    public void method4124(int arg0) {
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
        this.field3428 = (int) (var14 * 256.0D);
        this.field3429 = (int) (var16 * 256.0D);
        if (this.field3428 < 0) {
            this.field3428 = 0;
        } else if (this.field3428 > 255) {
            this.field3428 = 255;
        }
        if (this.field3429 < 0) {
            this.field3429 = 0;
        } else if (this.field3429 > 255) {
            this.field3429 = 255;
        }
        if (var16 > 0.5D) {
            this.field3426 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3426 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3426 < 1) {
            this.field3426 = 1;
        }
        this.field3427 = (int) ((double) this.field3426 * var18);
    }

    @ObfuscatedName("cz.z(I)V")
    public static void method1528() {
        field3424.method3370();
    }
}
