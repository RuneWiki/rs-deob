package deob;

@ObfuscatedName("aj")
public class class39 extends class194 {

    @ObfuscatedName("aj.a")
    public static class183 field882 = new class183(64);

    @ObfuscatedName("aj.l")
    public int field883 = 0;

    @ObfuscatedName("aj.c")
    public int field884;

    @ObfuscatedName("aj.u")
    public int field885;

    @ObfuscatedName("aj.w")
    public int field886;

    @ObfuscatedName("aj.i")
    public int field887;

    @ObfuscatedName("p.e(II)Laj;")
    public static class39 method549(int arg0) {
        class39 var1 = (class39) field882.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field881.method2843(1, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method722(new class111(var2), arg0);
        }
        var3.method736();
        field882.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.a(I)V")
    public void method736() {
        this.method721(this.field883);
    }

    @ObfuscatedName("aj.l(Ldh;IB)V")
    public void method722(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2176();
            if (var3 == 0) {
                return;
            }
            this.method723(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aj.c(Ldh;IIS)V")
    public void method723(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field883 = arg0.method2179();
        }
    }

    @ObfuscatedName("aj.u(IS)V")
    public void method721(int arg0) {
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
        this.field885 = (int) (var14 * 256.0D);
        this.field886 = (int) (var16 * 256.0D);
        if (this.field885 < 0) {
            this.field885 = 0;
        } else if (this.field885 > 255) {
            this.field885 = 255;
        }
        if (this.field886 < 0) {
            this.field886 = 0;
        } else if (this.field886 > 255) {
            this.field886 = 255;
        }
        if (var16 > 0.5D) {
            this.field887 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field887 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field887 < 1) {
            this.field887 = 1;
        }
        this.field884 = (int) ((double) this.field887 * var18);
    }
}
