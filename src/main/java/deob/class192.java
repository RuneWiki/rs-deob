package deob;

@ObfuscatedName("gm")
public class class192 extends class130 {

    @ObfuscatedName("gm.c")
    public static class125 field2813 = new class125(64);

    @ObfuscatedName("gm.f")
    public int field2814 = 0;

    @ObfuscatedName("gm.h")
    public int field2820;

    @ObfuscatedName("gm.a")
    public int field2816;

    @ObfuscatedName("gm.g")
    public int field2817;

    @ObfuscatedName("gm.k")
    public int field2818;

    @ObfuscatedName("client.s(II)Lgm;")
    public static class192 method475(int arg0) {
        class192 var1 = (class192) field2813.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2815.method2986(1, arg0);
        class192 var3 = new class192();
        if (var2 != null) {
            var3.method3174(new class154(var2), arg0);
        }
        var3.method3164();
        field2813.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.c(I)V")
    public void method3164() {
        this.method3167(this.field2814);
    }

    @ObfuscatedName("gm.f(Lea;II)V")
    public void method3174(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2545();
            if (var3 == 0) {
                return;
            }
            this.method3165(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gm.g(Lea;III)V")
    public void method3165(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2814 = arg0.method2549();
        }
    }

    @ObfuscatedName("gm.k(IB)V")
    public void method3167(int arg0) {
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
        this.field2816 = (int) (var14 * 256.0D);
        this.field2817 = (int) (var16 * 256.0D);
        if (this.field2816 < 0) {
            this.field2816 = 0;
        } else if (this.field2816 > 255) {
            this.field2816 = 255;
        }
        if (this.field2817 < 0) {
            this.field2817 = 0;
        } else if (this.field2817 > 255) {
            this.field2817 = 255;
        }
        if (var16 > 0.5D) {
            this.field2818 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2818 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2818 < 1) {
            this.field2818 = 1;
        }
        this.field2820 = (int) ((double) this.field2818 * var18);
    }

    @ObfuscatedName("fe.u(I)V")
    public static void method2849() {
        field2813.method2124();
    }
}
