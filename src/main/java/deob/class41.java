package deob;

@ObfuscatedName("aw")
public class class41 extends class182 {

    @ObfuscatedName("aw.v")
    public static class171 field948 = new class171(64);

    @ObfuscatedName("aw.i")
    public int field949 = 0;

    @ObfuscatedName("aw.g")
    public int field950 = -1;

    @ObfuscatedName("aw.x")
    public boolean field951 = true;

    @ObfuscatedName("aw.b")
    public int field952 = -1;

    @ObfuscatedName("aw.q")
    public int field955;

    @ObfuscatedName("aw.l")
    public int field958;

    @ObfuscatedName("aw.m")
    public int field960;

    @ObfuscatedName("aw.u")
    public int field956;

    @ObfuscatedName("aw.s")
    public int field957;

    @ObfuscatedName("aw.f")
    public int field954;

    @ObfuscatedName("aw.e(S)V")
    public void method782() {
        if (this.field952 != -1) {
            this.method778(this.field952);
            this.field956 = this.field955;
            this.field957 = this.field958;
            this.field954 = this.field960;
        }
        this.method778(this.field949);
    }

    @ObfuscatedName("aw.v(Ldk;II)V")
    public void method781(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2226();
            if (var3 == 0) {
                return;
            }
            this.method777(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aw.i(Ldk;III)V")
    public void method777(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field949 = arg0.method2112();
        } else if (arg1 == 2) {
            this.field950 = arg0.method2226();
        } else if (arg1 == 5) {
            this.field951 = false;
        } else if (arg1 == 7) {
            this.field952 = arg0.method2112();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aw.g(II)V")
    public void method778(int arg0) {
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
        this.field955 = (int) (var18 * 256.0D);
        this.field958 = (int) (var14 * 256.0D);
        this.field960 = (int) (var16 * 256.0D);
        if (this.field958 < 0) {
            this.field958 = 0;
        } else if (this.field958 > 255) {
            this.field958 = 255;
        }
        if (this.field960 < 0) {
            this.field960 = 0;
        } else if (this.field960 > 255) {
            this.field960 = 255;
        }
    }
}
