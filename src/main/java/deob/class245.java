package deob;

@ObfuscatedName("il")
public class class245 extends class176 {

    @ObfuscatedName("il.x")
    public static class146 field3233 = new class146(64);

    @ObfuscatedName("il.t")
    public int field3231 = 0;

    @ObfuscatedName("il.g")
    public int field3232;

    @ObfuscatedName("il.l")
    public int field3234;

    @ObfuscatedName("il.u")
    public int field3235;

    @ObfuscatedName("il.j")
    public int field3236;

    @ObfuscatedName("ga.c(II)Lil;")
    public static class245 method3333(int arg0) {
        class245 var1 = (class245) field3233.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3237.method3825(1, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method4096(new class300(var2), arg0);
        }
        var3.method4093();
        field3233.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.x(I)V")
    public void method4093() {
        this.method4095(this.field3231);
    }

    @ObfuscatedName("il.t(Lkz;II)V")
    public void method4096(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5103();
            if (var3 == 0) {
                return;
            }
            this.method4092(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("il.g(Lkz;III)V")
    public void method4092(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3231 = arg0.method5107();
        }
    }

    @ObfuscatedName("il.l(II)V")
    public void method4095(int arg0) {
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
        this.field3234 = (int) (var14 * 256.0D);
        this.field3235 = (int) (var16 * 256.0D);
        if (this.field3234 < 0) {
            this.field3234 = 0;
        } else if (this.field3234 > 255) {
            this.field3234 = 255;
        }
        if (this.field3235 < 0) {
            this.field3235 = 0;
        } else if (this.field3235 > 255) {
            this.field3235 = 255;
        }
        if (var16 > 0.5D) {
            this.field3236 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3236 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3236 < 1) {
            this.field3236 = 1;
        }
        this.field3232 = (int) ((double) this.field3236 * var18);
    }
}
