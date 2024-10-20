package deob;

@ObfuscatedName("af")
public class class39 extends class195 {

    @ObfuscatedName("af.k")
    public static class184 field922 = new class184(64);

    @ObfuscatedName("af.g")
    public int field933 = 0;

    @ObfuscatedName("af.n")
    public int field924;

    @ObfuscatedName("af.t")
    public int field923;

    @ObfuscatedName("af.e")
    public int field926;

    @ObfuscatedName("af.q")
    public int field927;

    @ObfuscatedName("aw.y(II)Laf;")
    public static class39 method837(int arg0) {
        class39 var1 = (class39) field922.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field925.method2874(1, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method753(new class111(var2), arg0);
        }
        var3.method747();
        field922.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.k(I)V")
    public void method747() {
        this.method761(this.field933);
    }

    @ObfuscatedName("af.g(Ldw;II)V")
    public void method753(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2205();
            if (var3 == 0) {
                return;
            }
            this.method748(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("af.n(Ldw;III)V")
    public void method748(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field933 = arg0.method2164();
        }
    }

    @ObfuscatedName("af.t(II)V")
    public void method761(int arg0) {
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
        this.field923 = (int) (var14 * 256.0D);
        this.field926 = (int) (var16 * 256.0D);
        if (this.field923 < 0) {
            this.field923 = 0;
        } else if (this.field923 > 255) {
            this.field923 = 255;
        }
        if (this.field926 < 0) {
            this.field926 = 0;
        } else if (this.field926 > 255) {
            this.field926 = 255;
        }
        if (var16 > 0.5D) {
            this.field927 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field927 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field927 < 1) {
            this.field927 = 1;
        }
        this.field924 = (int) ((double) this.field927 * var18);
    }

    @ObfuscatedName("e.e(I)V")
    public static void method66() {
        field922.method3333();
    }
}
