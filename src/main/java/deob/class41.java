package deob;

@ObfuscatedName("ay")
public class class41 extends class182 {

    @ObfuscatedName("ay.v")
    public static class171 field953 = new class171(64);

    @ObfuscatedName("ay.z")
    public int field954 = 0;

    @ObfuscatedName("ay.h")
    public int field955 = -1;

    @ObfuscatedName("ay.k")
    public boolean field956 = true;

    @ObfuscatedName("ay.l")
    public int field952 = -1;

    @ObfuscatedName("ay.e")
    public int field958;

    @ObfuscatedName("ay.j")
    public int field959;

    @ObfuscatedName("ay.n")
    public int field960;

    @ObfuscatedName("ay.f")
    public int field961;

    @ObfuscatedName("ay.a")
    public int field965;

    @ObfuscatedName("ay.i")
    public int field963;

    @ObfuscatedName("e.g(Lec;I)V")
    public static void method85(class146 arg0) {
        Statics.field966 = arg0;
    }

    @ObfuscatedName("ay.v(B)V")
    public void method805() {
        if (this.field952 != -1) {
            this.method811(this.field952);
            this.field961 = this.field958;
            this.field965 = this.field959;
            this.field963 = this.field960;
        }
        this.method811(this.field954);
    }

    @ObfuscatedName("ay.z(Ldm;II)V")
    public void method806(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2139();
            if (var3 == 0) {
                return;
            }
            this.method807(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ay.h(Ldm;III)V")
    public void method807(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field954 = arg0.method2230();
        } else if (arg1 == 2) {
            this.field955 = arg0.method2139();
        } else if (arg1 == 5) {
            this.field956 = false;
        } else if (arg1 == 7) {
            this.field952 = arg0.method2230();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ay.k(II)V")
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
        this.field958 = (int) (var18 * 256.0D);
        this.field959 = (int) (var14 * 256.0D);
        this.field960 = (int) (var16 * 256.0D);
        if (this.field959 < 0) {
            this.field959 = 0;
        } else if (this.field959 > 255) {
            this.field959 = 255;
        }
        if (this.field960 < 0) {
            this.field960 = 0;
        } else if (this.field960 > 255) {
            this.field960 = 255;
        }
    }

    @ObfuscatedName("an.l(B)V")
    public static void method663() {
        field953.method3176();
    }
}
