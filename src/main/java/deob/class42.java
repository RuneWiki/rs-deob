package deob;

@ObfuscatedName("ah")
public class class42 extends class204 {

    @ObfuscatedName("ah.d")
    public static class193 field952 = new class193(64);

    @ObfuscatedName("ah.s")
    public int field962 = 0;

    @ObfuscatedName("ah.q")
    public int field954;

    @ObfuscatedName("ah.j")
    public int field953;

    @ObfuscatedName("ah.k")
    public int field951;

    @ObfuscatedName("ah.i")
    public int field958;

    @ObfuscatedName("di.n(Lfm;I)V")
    public static void method2594(class167 arg0) {
        Statics.field955 = arg0;
    }

    @ObfuscatedName("ah.d(S)V")
    public void method819() {
        this.method809(this.field962);
    }

    @ObfuscatedName("ah.s(Ldq;IB)V")
    public void method821(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2338();
            if (var3 == 0) {
                return;
            }
            this.method808(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.q(Ldq;IIB)V")
    public void method808(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field962 = arg0.method2342();
        }
    }

    @ObfuscatedName("ah.j(II)V")
    public void method809(int arg0) {
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
        this.field953 = (int) (var14 * 256.0D);
        this.field951 = (int) (var16 * 256.0D);
        if (this.field953 < 0) {
            this.field953 = 0;
        } else if (this.field953 > 255) {
            this.field953 = 255;
        }
        if (this.field951 < 0) {
            this.field951 = 0;
        } else if (this.field951 > 255) {
            this.field951 = 255;
        }
        if (var16 > 0.5D) {
            this.field958 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field958 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field958 < 1) {
            this.field958 = 1;
        }
        this.field954 = (int) ((double) this.field958 * var18);
    }
}
