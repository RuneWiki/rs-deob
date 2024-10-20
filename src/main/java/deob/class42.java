package deob;

@ObfuscatedName("av")
public class class42 extends class204 {

    @ObfuscatedName("av.s")
    public static class193 field983 = new class193(64);

    @ObfuscatedName("av.q")
    public int field982 = 0;

    @ObfuscatedName("av.g")
    public int field980;

    @ObfuscatedName("av.m")
    public int field985;

    @ObfuscatedName("av.t")
    public int field978;

    @ObfuscatedName("av.j")
    public int field977;

    @ObfuscatedName("cj.f(Lfx;I)V")
    public static void method2063(class167 arg0) {
        Statics.field981 = arg0;
    }

    @ObfuscatedName("al.s(II)Lav;")
    public static class42 method1010(int arg0) {
        class42 var1 = (class42) field983.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field981.method3038(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method820(new class119(var2), arg0);
        }
        var3.method819();
        field983.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.q(B)V")
    public void method819() {
        this.method839(this.field982);
    }

    @ObfuscatedName("av.g(Ldn;IB)V")
    public void method820(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2363();
            if (var3 == 0) {
                return;
            }
            this.method830(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.m(Ldn;III)V")
    public void method830(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field982 = arg0.method2414();
        }
    }

    @ObfuscatedName("av.t(II)V")
    public void method839(int arg0) {
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
        this.field985 = (int) (var14 * 256.0D);
        this.field978 = (int) (var16 * 256.0D);
        if (this.field985 < 0) {
            this.field985 = 0;
        } else if (this.field985 > 255) {
            this.field985 = 255;
        }
        if (this.field978 < 0) {
            this.field978 = 0;
        } else if (this.field978 > 255) {
            this.field978 = 255;
        }
        if (var16 > 0.5D) {
            this.field977 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field977 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field977 < 1) {
            this.field977 = 1;
        }
        this.field980 = (int) ((double) this.field977 * var18);
    }
}
