package deob;

@ObfuscatedName("gp")
public class class189 extends class405 {

    @ObfuscatedName("gp.v")
    public static class256 field2156 = new class256(64);

    @ObfuscatedName("gp.q")
    public int field2152 = 0;

    @ObfuscatedName("gp.f")
    public int field2153 = -1;

    @ObfuscatedName("gp.j")
    public boolean field2150 = true;

    @ObfuscatedName("gp.e")
    public int field2155 = -1;

    @ObfuscatedName("gp.g")
    public int field2154;

    @ObfuscatedName("gp.w")
    public int field2157;

    @ObfuscatedName("gp.y")
    public int field2160;

    @ObfuscatedName("gp.i")
    public int field2159;

    @ObfuscatedName("gp.s")
    public int field2151;

    @ObfuscatedName("gp.t")
    public int field2161;

    @ObfuscatedName("ep.c(Llh;I)V")
    public static void method2833(class315 arg0) {
        Statics.field2158 = arg0;
    }

    @ObfuscatedName("dj.v(IB)Lgp;")
    public static class189 method2677(int arg0) {
        class189 var1 = (class189) field2156.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2158.method5305(4, arg0);
        class189 var3 = new class189();
        if (var2 != null) {
            var3.method3479(new class443(var2), arg0);
        }
        var3.method3494();
        field2156.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gp.q(B)V")
    public void method3494() {
        if (this.field2155 != -1) {
            this.method3489(this.field2155);
            this.field2159 = this.field2154;
            this.field2151 = this.field2157;
            this.field2161 = this.field2160;
        }
        this.method3489(this.field2152);
    }

    @ObfuscatedName("gp.f(Lqt;II)V")
    public void method3479(class443 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7047();
            if (var3 == 0) {
                return;
            }
            this.method3478(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gp.j(Lqt;IIB)V")
    public void method3478(class443 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2152 = arg0.method7051();
        } else if (arg1 == 2) {
            this.field2153 = arg0.method7047();
        } else if (arg1 == 5) {
            this.field2150 = false;
        } else if (arg1 == 7) {
            this.field2155 = arg0.method7051();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gp.e(II)V")
    public void method3489(int arg0) {
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
        this.field2154 = (int) (var18 * 256.0D);
        this.field2157 = (int) (var14 * 256.0D);
        this.field2160 = (int) (var16 * 256.0D);
        if (this.field2157 < 0) {
            this.field2157 = 0;
        } else if (this.field2157 > 255) {
            this.field2157 = 255;
        }
        if (this.field2160 < 0) {
            this.field2160 = 0;
        } else if (this.field2160 > 255) {
            this.field2160 = 255;
        }
    }
}
