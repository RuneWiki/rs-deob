package deob;

@ObfuscatedName("am")
public class class32 extends class173 {

    @ObfuscatedName("am.f")
    public static class169 field848 = new class169(64);

    @ObfuscatedName("am.n")
    public int field846 = 0;

    @ObfuscatedName("am.c")
    public int field847;

    @ObfuscatedName("am.r")
    public int field844;

    @ObfuscatedName("am.k")
    public int field851;

    @ObfuscatedName("am.e")
    public int field849;

    @ObfuscatedName("u.v(II)Lam;")
    public static class32 method56(int arg0) {
        class32 var1 = (class32) field848.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field845.method3020(1, arg0);
        class32 var3 = new class32();
        if (var2 != null) {
            var3.method701(new class126(var2), arg0);
        }
        var3.method683();
        field848.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.f(I)V")
    public void method683() {
        this.method686(this.field846);
    }

    @ObfuscatedName("am.n(Ldr;II)V")
    public void method701(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2466();
            if (var3 == 0) {
                return;
            }
            this.method694(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.c(Ldr;IIB)V")
    public void method694(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field846 = arg0.method2470();
        }
    }

    @ObfuscatedName("am.r(IB)V")
    public void method686(int arg0) {
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
        this.field844 = (int) (var14 * 256.0D);
        this.field851 = (int) (var16 * 256.0D);
        if (this.field844 < 0) {
            this.field844 = 0;
        } else if (this.field844 > 255) {
            this.field844 = 255;
        }
        if (this.field851 < 0) {
            this.field851 = 0;
        } else if (this.field851 > 255) {
            this.field851 = 255;
        }
        if (var16 > 0.5D) {
            this.field849 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field849 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field849 < 1) {
            this.field849 = 1;
        }
        this.field847 = (int) ((double) this.field849 * var18);
    }
}
