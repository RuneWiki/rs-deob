package deob;

@ObfuscatedName("al")
public class class33 extends class174 {

    @ObfuscatedName("al.f")
    public static class170 field857 = new class170(64);

    @ObfuscatedName("al.o")
    public int field858 = 0;

    @ObfuscatedName("al.h")
    public int field870;

    @ObfuscatedName("al.u")
    public int field860;

    @ObfuscatedName("al.a")
    public int field863;

    @ObfuscatedName("al.q")
    public int field862;

    @ObfuscatedName("v.j(Lew;I)V")
    public static void method209(class153 arg0) {
        Statics.field869 = arg0;
    }

    @ObfuscatedName("dx.f(II)Lal;")
    public static class33 method2318(int arg0) {
        class33 var1 = (class33) field857.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field869.method3027(1, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method704(new class127(var2), arg0);
        }
        var3.method710();
        field857.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.o(I)V")
    public void method710() {
        this.method701(this.field858);
    }

    @ObfuscatedName("al.h(Ldq;II)V")
    public void method704(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2464();
            if (var3 == 0) {
                return;
            }
            this.method698(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("al.u(Ldq;III)V")
    public void method698(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field858 = arg0.method2643();
        }
    }

    @ObfuscatedName("al.a(IB)V")
    public void method701(int arg0) {
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
        this.field860 = (int) (var14 * 256.0D);
        this.field863 = (int) (var16 * 256.0D);
        if (this.field860 < 0) {
            this.field860 = 0;
        } else if (this.field860 > 255) {
            this.field860 = 255;
        }
        if (this.field863 < 0) {
            this.field863 = 0;
        } else if (this.field863 > 255) {
            this.field863 = 255;
        }
        if (var16 > 0.5D) {
            this.field862 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field862 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field862 < 1) {
            this.field862 = 1;
        }
        this.field870 = (int) ((double) this.field862 * var18);
    }
}
