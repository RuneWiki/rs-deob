package deob;

@ObfuscatedName("ad")
public class class41 extends class180 {

    @ObfuscatedName("ad.p")
    public static class170 field950 = new class170(64);

    @ObfuscatedName("ad.a")
    public int field960 = 0;

    @ObfuscatedName("ad.g")
    public int field958 = -1;

    @ObfuscatedName("ad.u")
    public boolean field953 = true;

    @ObfuscatedName("ad.k")
    public int field965 = -1;

    @ObfuscatedName("ad.m")
    public int field955;

    @ObfuscatedName("ad.t")
    public int field962;

    @ObfuscatedName("ad.l")
    public int field957;

    @ObfuscatedName("ad.f")
    public int field949;

    @ObfuscatedName("ad.c")
    public int field959;

    @ObfuscatedName("ad.i")
    public int field954;

    @ObfuscatedName("g.e(Lec;I)V")
    public static void method27(class145 arg0) {
        Statics.field956 = arg0;
    }

    @ObfuscatedName("ad.p(I)V")
    public void method811() {
        if (this.field965 != -1) {
            this.method814(this.field965);
            this.field949 = this.field955;
            this.field959 = this.field962;
            this.field954 = this.field957;
        }
        this.method814(this.field960);
    }

    @ObfuscatedName("ad.a(Ldp;II)V")
    public void method821(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2125();
            if (var3 == 0) {
                return;
            }
            this.method810(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ad.g(Ldp;III)V")
    public void method810(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field960 = arg0.method2145();
        } else if (arg1 == 2) {
            this.field958 = arg0.method2125();
        } else if (arg1 == 5) {
            this.field953 = false;
        } else if (arg1 == 7) {
            this.field965 = arg0.method2145();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ad.u(II)V")
    public void method814(int arg0) {
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
        this.field962 = (int) (var14 * 256.0D);
        this.field957 = (int) (var16 * 256.0D);
        if (this.field962 < 0) {
            this.field962 = 0;
        } else if (this.field962 > 255) {
            this.field962 = 255;
        }
        if (this.field957 < 0) {
            this.field957 = 0;
        } else if (this.field957 > 255) {
            this.field957 = 255;
        }
    }
}
