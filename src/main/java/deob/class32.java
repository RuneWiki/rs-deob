package deob;

@ObfuscatedName("az")
public class class32 extends class173 {

    @ObfuscatedName("az.j")
    public static class169 field866 = new class169(64);

    @ObfuscatedName("az.w")
    public int field868 = 0;

    @ObfuscatedName("az.h")
    public int field871;

    @ObfuscatedName("az.v")
    public int field870;

    @ObfuscatedName("az.k")
    public int field875;

    @ObfuscatedName("az.g")
    public int field872;

    @ObfuscatedName("ak.p(II)Laz;")
    public static class32 method1130(int arg0) {
        class32 var1 = (class32) field866.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field869.method2973(1, arg0);
        class32 var3 = new class32();
        if (var2 != null) {
            var3.method662(new class126(var2), arg0);
        }
        var3.method653();
        field866.method3223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.j(I)V")
    public void method653() {
        this.method656(this.field868);
    }

    @ObfuscatedName("az.w(Ldv;IB)V")
    public void method662(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2544();
            if (var3 == 0) {
                return;
            }
            this.method655(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.h(Ldv;III)V")
    public void method655(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field868 = arg0.method2530();
        }
    }

    @ObfuscatedName("az.v(IB)V")
    public void method656(int arg0) {
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
        this.field870 = (int) (var14 * 256.0D);
        this.field875 = (int) (var16 * 256.0D);
        if (this.field870 < 0) {
            this.field870 = 0;
        } else if (this.field870 > 255) {
            this.field870 = 255;
        }
        if (this.field875 < 0) {
            this.field875 = 0;
        } else if (this.field875 > 255) {
            this.field875 = 255;
        }
        if (var16 > 0.5D) {
            this.field872 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field872 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field872 < 1) {
            this.field872 = 1;
        }
        this.field871 = (int) ((double) this.field872 * var18);
    }
}
