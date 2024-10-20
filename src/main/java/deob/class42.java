package deob;

@ObfuscatedName("aj")
public class class42 extends class205 {

    @ObfuscatedName("aj.j")
    public static class194 field977 = new class194(64);

    @ObfuscatedName("aj.p")
    public int field976 = 0;

    @ObfuscatedName("aj.x")
    public int field974;

    @ObfuscatedName("aj.d")
    public int field978;

    @ObfuscatedName("aj.u")
    public int field979;

    @ObfuscatedName("aj.o")
    public int field980;

    @ObfuscatedName("k.s(IS)Laj;")
    public static class42 method112(int arg0) {
        class42 var1 = (class42) field977.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field982.method3014(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method792(new class120(var2), arg0);
        }
        var3.method791();
        field977.method3486(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.j(I)V")
    public void method791() {
        this.method794(this.field976);
    }

    @ObfuscatedName("aj.p(Lds;IB)V")
    public void method792(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2338();
            if (var3 == 0) {
                return;
            }
            this.method793(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aj.x(Lds;III)V")
    public void method793(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field976 = arg0.method2359();
        }
    }

    @ObfuscatedName("aj.d(II)V")
    public void method794(int arg0) {
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
        this.field978 = (int) (var14 * 256.0D);
        this.field979 = (int) (var16 * 256.0D);
        if (this.field978 < 0) {
            this.field978 = 0;
        } else if (this.field978 > 255) {
            this.field978 = 255;
        }
        if (this.field979 < 0) {
            this.field979 = 0;
        } else if (this.field979 > 255) {
            this.field979 = 255;
        }
        if (var16 > 0.5D) {
            this.field980 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field980 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field980 < 1) {
            this.field980 = 1;
        }
        this.field974 = (int) ((double) this.field980 * var18);
    }

    @ObfuscatedName("aw.u(B)V")
    public static void method857() {
        field977.method3491();
    }
}
