package deob;

@ObfuscatedName("hr")
public class class196 extends class488 {

    @ObfuscatedName("hr.aw")
    public static class304 field2053 = new class304(64);

    @ObfuscatedName("hr.al")
    public int field2051 = 0;

    @ObfuscatedName("hr.ai")
    public int field2054;

    @ObfuscatedName("hr.ar")
    public int field2055;

    @ObfuscatedName("hr.as")
    public int field2056;

    @ObfuscatedName("hr.aa")
    public int field2057;

    @ObfuscatedName("hr.aw(B)V")
    public void method3474() {
        this.method3471(this.field2051);
    }

    @ObfuscatedName("hr.al(Luq;IB)V")
    public void method3469(class534 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8591();
            if (var3 == 0) {
                return;
            }
            this.method3468(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("hr.ai(Luq;III)V")
    public void method3468(class534 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2051 = arg0.method8595();
        }
    }

    @ObfuscatedName("hr.ar(II)V")
    public void method3471(int arg0) {
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
        this.field2055 = (int) (var14 * 256.0D);
        this.field2056 = (int) (var16 * 256.0D);
        if (this.field2055 < 0) {
            this.field2055 = 0;
        } else if (this.field2055 > 255) {
            this.field2055 = 255;
        }
        if (this.field2056 < 0) {
            this.field2056 = 0;
        } else if (this.field2056 > 255) {
            this.field2056 = 255;
        }
        if (var16 > 0.5D) {
            this.field2057 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2057 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2057 < 1) {
            this.field2057 = 1;
        }
        this.field2054 = (int) ((double) this.field2057 * var18);
    }

    @ObfuscatedName("ax.as(S)V")
    public static void method160() {
        field2053.method5418();
    }
}
