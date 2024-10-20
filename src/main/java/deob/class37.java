package deob;

@ObfuscatedName("ak")
public class class37 extends class182 {

    @ObfuscatedName("ak.c")
    public static class171 field893 = new class171(64);

    @ObfuscatedName("ak.h")
    public int field894 = 0;

    @ObfuscatedName("ak.v")
    public int field895;

    @ObfuscatedName("ak.q")
    public int field897;

    @ObfuscatedName("ak.s")
    public int field892;

    @ObfuscatedName("ak.g")
    public int field898;

    @ObfuscatedName("ak.i(B)V")
    public void method697() {
        this.method700(this.field894);
    }

    @ObfuscatedName("ak.c(Ldm;II)V")
    public void method706(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2151();
            if (var3 == 0) {
                return;
            }
            this.method703(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.h(Ldm;III)V")
    public void method703(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field894 = arg0.method2336();
        }
    }

    @ObfuscatedName("ak.v(IB)V")
    public void method700(int arg0) {
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
        this.field897 = (int) (var14 * 256.0D);
        this.field892 = (int) (var16 * 256.0D);
        if (this.field897 < 0) {
            this.field897 = 0;
        } else if (this.field897 > 255) {
            this.field897 = 255;
        }
        if (this.field892 < 0) {
            this.field892 = 0;
        } else if (this.field892 > 255) {
            this.field892 = 255;
        }
        if (var16 > 0.5D) {
            this.field898 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field898 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field898 < 1) {
            this.field898 = 1;
        }
        this.field895 = (int) ((double) this.field898 * var18);
    }
}
