package deob;

@ObfuscatedName("ak")
public class class43 extends class194 {

    @ObfuscatedName("ak.a")
    public static class183 field961 = new class183(64);

    @ObfuscatedName("ak.l")
    public int field952 = 0;

    @ObfuscatedName("ak.c")
    public int field953 = -1;

    @ObfuscatedName("ak.u")
    public boolean field951 = true;

    @ObfuscatedName("ak.w")
    public int field955 = -1;

    @ObfuscatedName("ak.i")
    public int field963;

    @ObfuscatedName("ak.r")
    public int field957;

    @ObfuscatedName("ak.f")
    public int field958;

    @ObfuscatedName("ak.g")
    public int field954;

    @ObfuscatedName("ak.o")
    public int field960;

    @ObfuscatedName("ak.h")
    public int field959;

    @ObfuscatedName("cu.e(Lfv;I)V")
    public static void method1931(class158 arg0) {
        Statics.field1892 = arg0;
    }

    @ObfuscatedName("ak.a(B)V")
    public void method827() {
        if (this.field955 != -1) {
            this.method820(this.field955);
            this.field954 = this.field963;
            this.field960 = this.field957;
            this.field959 = this.field958;
        }
        this.method820(this.field952);
    }

    @ObfuscatedName("ak.l(Ldh;II)V")
    public void method819(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2176();
            if (var3 == 0) {
                return;
            }
            this.method817(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.c(Ldh;III)V")
    public void method817(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field952 = arg0.method2179();
        } else if (arg1 == 2) {
            this.field953 = arg0.method2176();
        } else if (arg1 == 5) {
            this.field951 = false;
        } else if (arg1 == 7) {
            this.field955 = arg0.method2179();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ak.u(IB)V")
    public void method820(int arg0) {
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
        this.field963 = (int) (var18 * 256.0D);
        this.field957 = (int) (var14 * 256.0D);
        this.field958 = (int) (var16 * 256.0D);
        if (this.field957 < 0) {
            this.field957 = 0;
        } else if (this.field957 > 255) {
            this.field957 = 255;
        }
        if (this.field958 < 0) {
            this.field958 = 0;
        } else if (this.field958 > 255) {
            this.field958 = 255;
        }
    }
}
