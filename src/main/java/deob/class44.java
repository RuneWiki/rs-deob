package deob;

@ObfuscatedName("ar")
public class class44 extends class208 {

    @ObfuscatedName("ar.g")
    public static class197 field1001 = new class197(64);

    @ObfuscatedName("ar.r")
    public int field1002 = 0;

    @ObfuscatedName("ar.e")
    public int field1000;

    @ObfuscatedName("ar.h")
    public int field1004;

    @ObfuscatedName("ar.s")
    public int field1005;

    @ObfuscatedName("ar.k")
    public int field1006;

    @ObfuscatedName("y.l(II)Lar;")
    public static class44 method594(int arg0) {
        class44 var1 = (class44) field1001.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1008.method3210(1, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method880(new class123(var2), arg0);
        }
        var3.method864();
        field1001.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.g(B)V")
    public void method864() {
        this.method867(this.field1002);
    }

    @ObfuscatedName("ar.r(Ldc;II)V")
    public void method880(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2490();
            if (var3 == 0) {
                return;
            }
            this.method872(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ar.e(Ldc;IIS)V")
    public void method872(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1002 = arg0.method2494();
        }
    }

    @ObfuscatedName("ar.h(IB)V")
    public void method867(int arg0) {
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
        this.field1004 = (int) (var14 * 256.0D);
        this.field1005 = (int) (var16 * 256.0D);
        if (this.field1004 < 0) {
            this.field1004 = 0;
        } else if (this.field1004 > 255) {
            this.field1004 = 255;
        }
        if (this.field1005 < 0) {
            this.field1005 = 0;
        } else if (this.field1005 > 255) {
            this.field1005 = 255;
        }
        if (var16 > 0.5D) {
            this.field1006 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1006 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1006 < 1) {
            this.field1006 = 1;
        }
        this.field1000 = (int) ((double) this.field1006 * var18);
    }

    @ObfuscatedName("fi.s(I)V")
    public static void method3129() {
        field1001.method3658();
    }
}
