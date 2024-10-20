package deob;

@ObfuscatedName("aq")
public class class42 extends class204 {

    @ObfuscatedName("aq.p")
    public static class193 field982 = new class193(64);

    @ObfuscatedName("aq.v")
    public int field983 = 0;

    @ObfuscatedName("aq.l")
    public int field985;

    @ObfuscatedName("aq.y")
    public int field989;

    @ObfuscatedName("aq.w")
    public int field986;

    @ObfuscatedName("aq.u")
    public int field990;

    @ObfuscatedName("h.d(Lfn;B)V")
    public static void method202(class167 arg0) {
        Statics.field984 = arg0;
    }

    @ObfuscatedName("l.p(II)Laq;")
    public static class42 method39(int arg0) {
        class42 var1 = (class42) field982.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field984.method3134(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method815(new class119(var2), arg0);
        }
        var3.method814();
        field982.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.v(I)V")
    public void method814() {
        this.method817(this.field983);
    }

    @ObfuscatedName("aq.l(Ldf;II)V")
    public void method815(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2357();
            if (var3 == 0) {
                return;
            }
            this.method837(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aq.y(Ldf;III)V")
    public void method837(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field983 = arg0.method2361();
        }
    }

    @ObfuscatedName("aq.w(IS)V")
    public void method817(int arg0) {
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
        this.field989 = (int) (var14 * 256.0D);
        this.field986 = (int) (var16 * 256.0D);
        if (this.field989 < 0) {
            this.field989 = 0;
        } else if (this.field989 > 255) {
            this.field989 = 255;
        }
        if (this.field986 < 0) {
            this.field986 = 0;
        } else if (this.field986 > 255) {
            this.field986 = 255;
        }
        if (var16 > 0.5D) {
            this.field990 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field990 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field990 < 1) {
            this.field990 = 1;
        }
        this.field985 = (int) ((double) this.field990 * var18);
    }

    @ObfuscatedName("g.u(I)V")
    public static void method571() {
        field982.method3556();
    }
}
