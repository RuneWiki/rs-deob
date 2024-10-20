package deob;

@ObfuscatedName("ai")
public class class38 extends class187 {

    @ObfuscatedName("ai.v")
    public static class176 field894 = new class176(64);

    @ObfuscatedName("ai.i")
    public int field903 = 0;

    @ObfuscatedName("ai.b")
    public int field895;

    @ObfuscatedName("ai.l")
    public int field896;

    @ObfuscatedName("ai.m")
    public int field899;

    @ObfuscatedName("ai.w")
    public int field900;

    @ObfuscatedName("eq.a(Lek;B)V")
    public static void method2673(class151 arg0) {
        Statics.field897 = arg0;
    }

    @ObfuscatedName("ai.v(I)V")
    public void method711() {
        this.method714(this.field903);
    }

    @ObfuscatedName("ai.i(Ldi;IB)V")
    public void method712(class110 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2199();
            if (var3 == 0) {
                return;
            }
            this.method728(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.b(Ldi;III)V")
    public void method728(class110 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field903 = arg0.method2208();
        }
    }

    @ObfuscatedName("ai.l(II)V")
    public void method714(int arg0) {
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
            this.field900 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field900 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field900 < 1) {
            this.field900 = 1;
        }
        this.field895 = (int) ((double) this.field900 * var18);
    }
}
