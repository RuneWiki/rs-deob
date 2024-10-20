package deob;

@ObfuscatedName("ay")
public class class38 extends class185 {

    @ObfuscatedName("ay.k")
    public static class174 field910 = new class174(64);

    @ObfuscatedName("ay.y")
    public int field902 = 0;

    @ObfuscatedName("ay.e")
    public int field901;

    @ObfuscatedName("ay.r")
    public int field904;

    @ObfuscatedName("ay.a")
    public int field908;

    @ObfuscatedName("ay.n")
    public int field906;

    @ObfuscatedName("h.f(IB)Lay;")
    public static class38 method529(int arg0) {
        class38 var1 = (class38) field910.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field903.method2763(1, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method732(new class108(var2), arg0);
        }
        var3.method738();
        field910.method3209(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.k(I)V")
    public void method738() {
        this.method736(this.field902);
    }

    @ObfuscatedName("ay.y(Ldu;IB)V")
    public void method732(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2158();
            if (var3 == 0) {
                return;
            }
            this.method733(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ay.e(Ldu;III)V")
    public void method733(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field902 = arg0.method2314();
        }
    }

    @ObfuscatedName("ay.r(IS)V")
    public void method736(int arg0) {
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
        this.field904 = (int) (var14 * 256.0D);
        this.field908 = (int) (var16 * 256.0D);
        if (this.field904 < 0) {
            this.field904 = 0;
        } else if (this.field904 > 255) {
            this.field904 = 255;
        }
        if (this.field908 < 0) {
            this.field908 = 0;
        } else if (this.field908 > 255) {
            this.field908 = 255;
        }
        if (var16 > 0.5D) {
            this.field906 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field906 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field906 < 1) {
            this.field906 = 1;
        }
        this.field901 = (int) ((double) this.field906 * var18);
    }
}
