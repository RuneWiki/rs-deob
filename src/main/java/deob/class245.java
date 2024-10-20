package deob;

@ObfuscatedName("ig")
public class class245 extends class176 {

    @ObfuscatedName("ig.f")
    public static class146 field3265 = new class146(64);

    @ObfuscatedName("ig.b")
    public int field3264 = 0;

    @ObfuscatedName("ig.g")
    public int field3268;

    @ObfuscatedName("ig.z")
    public int field3266;

    @ObfuscatedName("ig.p")
    public int field3267;

    @ObfuscatedName("ig.h")
    public int field3262;

    @ObfuscatedName("et.u(IB)Lig;")
    public static class245 method3050(int arg0) {
        class245 var1 = (class245) field3265.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3263.method3928(1, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method4120(new class300(var2), arg0);
        }
        var3.method4111();
        field3265.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.f(I)V")
    public void method4111() {
        this.method4109(this.field3264);
    }

    @ObfuscatedName("ig.b(Lkg;IB)V")
    public void method4120(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5138();
            if (var3 == 0) {
                return;
            }
            this.method4108(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ig.g(Lkg;III)V")
    public void method4108(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3264 = arg0.method5287();
        }
    }

    @ObfuscatedName("ig.z(II)V")
    public void method4109(int arg0) {
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
        this.field3266 = (int) (var14 * 256.0D);
        this.field3267 = (int) (var16 * 256.0D);
        if (this.field3266 < 0) {
            this.field3266 = 0;
        } else if (this.field3266 > 255) {
            this.field3266 = 255;
        }
        if (this.field3267 < 0) {
            this.field3267 = 0;
        } else if (this.field3267 > 255) {
            this.field3267 = 255;
        }
        if (var16 > 0.5D) {
            this.field3262 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3262 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3262 < 1) {
            this.field3262 = 1;
        }
        this.field3268 = (int) ((double) this.field3262 * var18);
    }

    @ObfuscatedName("eu.p(B)V")
    public static void method3038() {
        field3265.method3075();
    }
}
