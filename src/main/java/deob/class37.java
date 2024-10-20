package deob;

@ObfuscatedName("az")
public class class37 extends class183 {

    @ObfuscatedName("az.g")
    public static class172 field893 = new class172(64);

    @ObfuscatedName("az.x")
    public int field895 = 0;

    @ObfuscatedName("az.c")
    public int field892;

    @ObfuscatedName("az.n")
    public int field896;

    @ObfuscatedName("az.s")
    public int field899;

    @ObfuscatedName("az.r")
    public int field897;

    @ObfuscatedName("aq.p(Ler;B)V")
    public static void method854(class147 arg0) {
        Statics.field898 = arg0;
    }

    @ObfuscatedName("x.g(II)Laz;")
    public static class37 method18(int arg0) {
        class37 var1 = (class37) field893.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field898.method2855(1, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method715(new class107(var2), arg0);
        }
        var3.method714();
        field893.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.x(I)V")
    public void method714() {
        this.method724(this.field895);
    }

    @ObfuscatedName("az.c(Ldp;II)V")
    public void method715(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2173();
            if (var3 == 0) {
                return;
            }
            this.method716(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.n(Ldp;IIB)V")
    public void method716(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field895 = arg0.method2329();
        }
    }

    @ObfuscatedName("az.s(II)V")
    public void method724(int arg0) {
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
        this.field896 = (int) (var14 * 256.0D);
        this.field899 = (int) (var16 * 256.0D);
        if (this.field896 < 0) {
            this.field896 = 0;
        } else if (this.field896 > 255) {
            this.field896 = 255;
        }
        if (this.field899 < 0) {
            this.field899 = 0;
        } else if (this.field899 > 255) {
            this.field899 = 255;
        }
        if (var16 > 0.5D) {
            this.field897 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field897 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field897 < 1) {
            this.field897 = 1;
        }
        this.field892 = (int) ((double) this.field897 * var18);
    }

    @ObfuscatedName("gr.r(I)V")
    public static void method3386() {
        field893.method3227();
    }
}
