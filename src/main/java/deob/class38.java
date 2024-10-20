package deob;

@ObfuscatedName("an")
public class class38 extends class176 {

    @ObfuscatedName("an.b")
    public static class172 field956 = new class172(64);

    @ObfuscatedName("an.r")
    public int field959 = 0;

    @ObfuscatedName("an.l")
    public int field948 = -1;

    @ObfuscatedName("an.s")
    public boolean field949 = true;

    @ObfuscatedName("an.d")
    public int field950 = -1;

    @ObfuscatedName("an.e")
    public int field951;

    @ObfuscatedName("an.u")
    public int field952;

    @ObfuscatedName("an.q")
    public int field953;

    @ObfuscatedName("an.o")
    public int field954;

    @ObfuscatedName("an.v")
    public int field957;

    @ObfuscatedName("an.m")
    public int field945;

    @ObfuscatedName("r.i(IS)Lan;")
    public static class38 method23(int arg0) {
        class38 var1 = (class38) field956.method3277((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field946.method3043(4, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method812(new class128(var2), arg0);
        }
        var3.method798();
        field956.method3281(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.b(B)V")
    public void method798() {
        if (this.field950 != -1) {
            this.method799(this.field950);
            this.field954 = this.field951;
            this.field957 = this.field952;
            this.field945 = this.field953;
        }
        this.method799(this.field959);
    }

    @ObfuscatedName("an.r(Lds;II)V")
    public void method812(class128 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2531();
            if (var3 == 0) {
                return;
            }
            this.method800(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.l(Lds;III)V")
    public void method800(class128 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field959 = arg0.method2599();
        } else if (arg1 == 2) {
            this.field948 = arg0.method2531();
        } else if (arg1 == 5) {
            this.field949 = false;
        } else if (arg1 == 7) {
            this.field950 = arg0.method2599();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("an.s(IB)V")
    public void method799(int arg0) {
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
        this.field951 = (int) (var18 * 256.0D);
        this.field952 = (int) (var14 * 256.0D);
        this.field953 = (int) (var16 * 256.0D);
        if (this.field952 < 0) {
            this.field952 = 0;
        } else if (this.field952 > 255) {
            this.field952 = 255;
        }
        if (this.field953 < 0) {
            this.field953 = 0;
        } else if (this.field953 > 255) {
            this.field953 = 255;
        }
    }
}
