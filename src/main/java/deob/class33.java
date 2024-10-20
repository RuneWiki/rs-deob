package deob;

@ObfuscatedName("av")
public class class33 extends class174 {

    @ObfuscatedName("av.r")
    public static class170 field863 = new class170(64);

    @ObfuscatedName("av.v")
    public int field864 = 0;

    @ObfuscatedName("av.p")
    public int field866;

    @ObfuscatedName("av.e")
    public int field867;

    @ObfuscatedName("av.d")
    public int field862;

    @ObfuscatedName("av.y")
    public int field868;

    @ObfuscatedName("m.j(Lez;I)V")
    public static void method225(class152 arg0) {
        Statics.field865 = arg0;
    }

    @ObfuscatedName("o.r(IB)Lav;")
    public static class33 method141(int arg0) {
        class33 var1 = (class33) field863.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field865.method3016(1, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method674(new class127(var2), arg0);
        }
        var3.method673();
        field863.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.v(I)V")
    public void method673() {
        this.method672(this.field864);
    }

    @ObfuscatedName("av.p(Ldn;IS)V")
    public void method674(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2441();
            if (var3 == 0) {
                return;
            }
            this.method682(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.e(Ldn;IIB)V")
    public void method682(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field864 = arg0.method2461();
        }
    }

    @ObfuscatedName("av.d(II)V")
    public void method672(int arg0) {
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
        this.field867 = (int) (var14 * 256.0D);
        this.field862 = (int) (var16 * 256.0D);
        if (this.field867 < 0) {
            this.field867 = 0;
        } else if (this.field867 > 255) {
            this.field867 = 255;
        }
        if (this.field862 < 0) {
            this.field862 = 0;
        } else if (this.field862 > 255) {
            this.field862 = 255;
        }
        if (var16 > 0.5D) {
            this.field868 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field868 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field868 < 1) {
            this.field868 = 1;
        }
        this.field866 = (int) ((double) this.field868 * var18);
    }

    @ObfuscatedName("az.y(I)V")
    public static void method1157() {
        field863.method3258();
    }
}
