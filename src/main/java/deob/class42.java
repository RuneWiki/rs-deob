package deob;

@ObfuscatedName("av")
public class class42 extends class204 {

    @ObfuscatedName("av.h")
    public static class193 field982 = new class193(64);

    @ObfuscatedName("av.k")
    public int field979 = 0;

    @ObfuscatedName("av.t")
    public int field978;

    @ObfuscatedName("av.g")
    public int field981;

    @ObfuscatedName("av.o")
    public int field980;

    @ObfuscatedName("av.i")
    public int field983;

    @ObfuscatedName("av.c(B)V")
    public void method803() {
        this.method802(this.field979);
    }

    @ObfuscatedName("av.h(Ldf;II)V")
    public void method806(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2291();
            if (var3 == 0) {
                return;
            }
            this.method805(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.k(Ldf;IIB)V")
    public void method805(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field979 = arg0.method2402();
        }
    }

    @ObfuscatedName("av.t(II)V")
    public void method802(int arg0) {
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
        this.field981 = (int) (var14 * 256.0D);
        this.field980 = (int) (var16 * 256.0D);
        if (this.field981 < 0) {
            this.field981 = 0;
        } else if (this.field981 > 255) {
            this.field981 = 255;
        }
        if (this.field980 < 0) {
            this.field980 = 0;
        } else if (this.field980 > 255) {
            this.field980 = 255;
        }
        if (var16 > 0.5D) {
            this.field983 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field983 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field983 < 1) {
            this.field983 = 1;
        }
        this.field978 = (int) ((double) this.field983 * var18);
    }

    @ObfuscatedName("s.g(B)V")
    public static void method556() {
        field982.method3488();
    }
}
