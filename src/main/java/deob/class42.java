package deob;

@ObfuscatedName("au")
public class class42 extends class204 {

    @ObfuscatedName("au.q")
    public static class193 field986 = new class193(64);

    @ObfuscatedName("au.v")
    public int field981 = 0;

    @ObfuscatedName("au.n")
    public int field983;

    @ObfuscatedName("au.f")
    public int field982;

    @ObfuscatedName("au.g")
    public int field984;

    @ObfuscatedName("au.o")
    public int field985;

    @ObfuscatedName("p.h(II)Lau;")
    public static class42 method162(int arg0) {
        class42 var1 = (class42) field986.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3146.method3073(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method809(new class119(var2), arg0);
        }
        var3.method820();
        field986.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.q(B)V")
    public void method820() {
        this.method811(this.field981);
    }

    @ObfuscatedName("au.v(Ldm;IS)V")
    public void method809(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2383();
            if (var3 == 0) {
                return;
            }
            this.method810(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("au.n(Ldm;III)V")
    public void method810(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field981 = arg0.method2387();
        }
    }

    @ObfuscatedName("au.f(II)V")
    public void method811(int arg0) {
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
        this.field982 = (int) (var14 * 256.0D);
        this.field984 = (int) (var16 * 256.0D);
        if (this.field982 < 0) {
            this.field982 = 0;
        } else if (this.field982 > 255) {
            this.field982 = 255;
        }
        if (this.field984 < 0) {
            this.field984 = 0;
        } else if (this.field984 > 255) {
            this.field984 = 255;
        }
        if (var16 > 0.5D) {
            this.field985 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field985 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field985 < 1) {
            this.field985 = 1;
        }
        this.field983 = (int) ((double) this.field985 * var18);
    }

    @ObfuscatedName("cs.g(I)V")
    public static void method2074() {
        field986.method3541();
    }
}
