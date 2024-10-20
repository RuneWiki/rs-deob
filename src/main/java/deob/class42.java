package deob;

@ObfuscatedName("ad")
public class class42 extends class204 {

    @ObfuscatedName("ad.q")
    public static class193 field968 = new class193(64);

    @ObfuscatedName("ad.c")
    public int field969 = 0;

    @ObfuscatedName("ad.l")
    public int field970;

    @ObfuscatedName("ad.r")
    public int field967;

    @ObfuscatedName("ad.u")
    public int field972;

    @ObfuscatedName("ad.j")
    public int field973;

    @ObfuscatedName("hc.n(Lfm;B)V")
    public static void method3670(class167 arg0) {
        Statics.field974 = arg0;
    }

    @ObfuscatedName("g.q(II)Lad;")
    public static class42 method603(int arg0) {
        class42 var1 = (class42) field968.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field974.method3094(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method840(new class119(var2), arg0);
        }
        var3.method849();
        field968.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.c(B)V")
    public void method849() {
        this.method854(this.field969);
    }

    @ObfuscatedName("ad.l(Ldc;IS)V")
    public void method840(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2360();
            if (var3 == 0) {
                return;
            }
            this.method841(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ad.r(Ldc;III)V")
    public void method841(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field969 = arg0.method2364();
        }
    }

    @ObfuscatedName("ad.u(IB)V")
    public void method854(int arg0) {
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
        this.field967 = (int) (var14 * 256.0D);
        this.field972 = (int) (var16 * 256.0D);
        if (this.field967 < 0) {
            this.field967 = 0;
        } else if (this.field967 > 255) {
            this.field967 = 255;
        }
        if (this.field972 < 0) {
            this.field972 = 0;
        } else if (this.field972 > 255) {
            this.field972 = 255;
        }
        if (var16 > 0.5D) {
            this.field973 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field973 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field973 < 1) {
            this.field973 = 1;
        }
        this.field970 = (int) ((double) this.field973 * var18);
    }

    @ObfuscatedName("az.j(B)V")
    public static void method761() {
        field968.method3479();
    }
}
