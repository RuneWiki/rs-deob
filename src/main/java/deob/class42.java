package deob;

@ObfuscatedName("at")
public class class42 extends class204 {

    @ObfuscatedName("at.l")
    public static class193 field980 = new class193(64);

    @ObfuscatedName("at.a")
    public int field974 = 0;

    @ObfuscatedName("at.i")
    public int field972;

    @ObfuscatedName("at.f")
    public int field969;

    @ObfuscatedName("at.m")
    public int field970;

    @ObfuscatedName("at.o")
    public int field973;

    @ObfuscatedName("ax.j(IB)Lat;")
    public static class42 method714(int arg0) {
        class42 var1 = (class42) field980.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field971.method3005(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method826(new class119(var2), arg0);
        }
        var3.method825();
        field980.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.l(B)V")
    public void method825() {
        this.method828(this.field974);
    }

    @ObfuscatedName("at.a(Ldc;IB)V")
    public void method826(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2316();
            if (var3 == 0) {
                return;
            }
            this.method827(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.i(Ldc;IIB)V")
    public void method827(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field974 = arg0.method2416();
        }
    }

    @ObfuscatedName("at.f(II)V")
    public void method828(int arg0) {
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
        this.field969 = (int) (var14 * 256.0D);
        this.field970 = (int) (var16 * 256.0D);
        if (this.field969 < 0) {
            this.field969 = 0;
        } else if (this.field969 > 255) {
            this.field969 = 255;
        }
        if (this.field970 < 0) {
            this.field970 = 0;
        } else if (this.field970 > 255) {
            this.field970 = 255;
        }
        if (var16 > 0.5D) {
            this.field973 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field973 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field973 < 1) {
            this.field973 = 1;
        }
        this.field972 = (int) ((double) this.field973 * var18);
    }

    @ObfuscatedName("al.m(I)V")
    public static void method880() {
        field980.method3475();
    }
}
