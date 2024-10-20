package deob;

@ObfuscatedName("ah")
public class class34 extends class176 {

    @ObfuscatedName("ah.i")
    public static class172 field884 = new class172(64);

    @ObfuscatedName("ah.k")
    public int field886 = 0;

    @ObfuscatedName("ah.q")
    public int field889;

    @ObfuscatedName("ah.j")
    public int field887;

    @ObfuscatedName("ah.z")
    public int field888;

    @ObfuscatedName("ah.m")
    public int field890;

    @ObfuscatedName("aw.e(IB)Lah;")
    public static class34 method680(int arg0) {
        class34 var1 = (class34) field884.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field885.method3069(1, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method735(new class128(var2), arg0);
        }
        var3.method734();
        field884.method3264(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.i(B)V")
    public void method734() {
        this.method748(this.field886);
    }

    @ObfuscatedName("ah.k(Ldl;II)V")
    public void method735(class128 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2548();
            if (var3 == 0) {
                return;
            }
            this.method736(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.q(Ldl;III)V")
    public void method736(class128 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field886 = arg0.method2558();
        }
    }

    @ObfuscatedName("ah.j(IB)V")
    public void method748(int arg0) {
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
        this.field887 = (int) (var14 * 256.0D);
        this.field888 = (int) (var16 * 256.0D);
        if (this.field887 < 0) {
            this.field887 = 0;
        } else if (this.field887 > 255) {
            this.field887 = 255;
        }
        if (this.field888 < 0) {
            this.field888 = 0;
        } else if (this.field888 > 255) {
            this.field888 = 255;
        }
        if (var16 > 0.5D) {
            this.field890 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field890 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field890 < 1) {
            this.field890 = 1;
        }
        this.field889 = (int) ((double) this.field890 * var18);
    }
}
