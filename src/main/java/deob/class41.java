package deob;

@ObfuscatedName("av")
public class class41 extends class182 {

    @ObfuscatedName("av.s")
    public static class171 field952 = new class171(64);

    @ObfuscatedName("av.f")
    public int field949 = 0;

    @ObfuscatedName("av.e")
    public int field950 = -1;

    @ObfuscatedName("av.d")
    public boolean field962 = true;

    @ObfuscatedName("av.n")
    public int field947 = -1;

    @ObfuscatedName("av.v")
    public int field948;

    @ObfuscatedName("av.z")
    public int field954;

    @ObfuscatedName("av.j")
    public int field953;

    @ObfuscatedName("av.u")
    public int field956;

    @ObfuscatedName("av.g")
    public int field957;

    @ObfuscatedName("av.a")
    public int field958;

    @ObfuscatedName("av.t(B)V")
    public void method773() {
        if (this.field947 != -1) {
            this.method776(this.field947);
            this.field956 = this.field948;
            this.field957 = this.field954;
            this.field958 = this.field953;
        }
        this.method776(this.field949);
    }

    @ObfuscatedName("av.s(Ldb;IB)V")
    public void method774(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2101();
            if (var3 == 0) {
                return;
            }
            this.method786(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.f(Ldb;IIB)V")
    public void method786(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field949 = arg0.method2304();
        } else if (arg1 == 2) {
            this.field950 = arg0.method2101();
        } else if (arg1 == 5) {
            this.field962 = false;
        } else if (arg1 == 7) {
            this.field947 = arg0.method2304();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("av.e(II)V")
    public void method776(int arg0) {
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
        this.field948 = (int) (var18 * 256.0D);
        this.field954 = (int) (var14 * 256.0D);
        this.field953 = (int) (var16 * 256.0D);
        if (this.field954 < 0) {
            this.field954 = 0;
        } else if (this.field954 > 255) {
            this.field954 = 255;
        }
        if (this.field953 < 0) {
            this.field953 = 0;
        } else if (this.field953 > 255) {
            this.field953 = 255;
        }
    }

    @ObfuscatedName("w.d(I)V")
    public static void method154() {
        field952.method3171();
    }
}
