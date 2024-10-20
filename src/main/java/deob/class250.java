package deob;

@ObfuscatedName("ix")
public class class250 extends class198 {

    @ObfuscatedName("ix.o")
    public static class193 field3352 = new class193(64);

    @ObfuscatedName("ix.x")
    public int field3349 = 0;

    @ObfuscatedName("ix.k")
    public int field3350;

    @ObfuscatedName("ix.f")
    public int field3348;

    @ObfuscatedName("ix.i")
    public int field3353;

    @ObfuscatedName("ix.j")
    public int field3354;

    @ObfuscatedName("fv.w(Liq;I)V")
    public static void method2762(class239 arg0) {
        Statics.field3351 = arg0;
    }

    @ObfuscatedName("ch.o(II)Lix;")
    public static class250 method1621(int arg0) {
        class250 var1 = (class250) field3352.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3351.method3754(1, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method3958(new class177(var2), arg0);
        }
        var3.method3957();
        field3352.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.x(I)V")
    public void method3957() {
        this.method3965(this.field3349);
    }

    @ObfuscatedName("ix.k(Lfi;II)V")
    public void method3958(class177 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2931();
            if (var3 == 0) {
                return;
            }
            this.method3963(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ix.f(Lfi;III)V")
    public void method3963(class177 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3349 = arg0.method2888();
        }
    }

    @ObfuscatedName("ix.i(IB)V")
    public void method3965(int arg0) {
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
        this.field3353 = (int) (var16 * 256.0D);
        if (this.field3348 < 0) {
            this.field3348 = 0;
        } else if (this.field3348 > 255) {
            this.field3348 = 255;
        }
        if (this.field3353 < 0) {
            this.field3353 = 0;
        } else if (this.field3353 > 255) {
            this.field3353 = 255;
        }
        if (var16 > 0.5D) {
            this.field3354 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3354 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3354 < 1) {
            this.field3354 = 1;
        }
        this.field3350 = (int) ((double) this.field3354 * var18);
    }
}
