package deob;

@ObfuscatedName("ar")
public class class165 extends class6 {

    @ObfuscatedName("ar.d")
    public int field2457;

    @ObfuscatedName("ar.l")
    public int field2458;

    @ObfuscatedName("ar.k")
    public int field2463 = 0;

    @ObfuscatedName("ar.h")
    public static class2 field2452 = new class2(64);

    @ObfuscatedName("ar.w")
    public int field2455;

    @ObfuscatedName("ar.t")
    public int field2456;

    @ObfuscatedName("ar.h(I)V")
    public void method2845() {
        this.method2848(this.field2463);
    }

    @ObfuscatedName("ar.w(Ldp;IIB)V")
    public void method2847(class50 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2463 = arg0.method728();
        }
    }

    @ObfuscatedName("ar.t(II)V")
    public void method2848(int arg0) {
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
        this.field2456 = (int) (var14 * 256.0D);
        this.field2457 = (int) (var16 * 256.0D);
        if (this.field2456 < 0) {
            this.field2456 = 0;
        } else if (this.field2456 > 255) {
            this.field2456 = 255;
        }
        if (this.field2457 < 0) {
            this.field2457 = 0;
        } else if (this.field2457 > 255) {
            this.field2457 = 255;
        }
        if (var16 > 0.5D) {
            this.field2458 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2458 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2458 < 1) {
            this.field2458 = 1;
        }
        this.field2455 = (int) ((double) this.field2458 * var18);
    }

    @ObfuscatedName("ar.k(Ldp;II)V")
    public void method2855(class50 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method726();
            if (var3 == 0) {
                return;
            }
            this.method2847(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("cl.b(Lek;B)V")
    public static void method2512(class89 arg0) {
        Statics.field2454 = arg0;
    }
}
