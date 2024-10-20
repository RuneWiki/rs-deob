package deob;

@ObfuscatedName("ac")
public class class41 extends class182 {

    @ObfuscatedName("ac.o")
    public static class171 field961 = new class171(64);

    @ObfuscatedName("ac.i")
    public int field952 = 0;

    @ObfuscatedName("ac.p")
    public int field953 = -1;

    @ObfuscatedName("ac.c")
    public boolean field954 = true;

    @ObfuscatedName("ac.y")
    public int field962 = -1;

    @ObfuscatedName("ac.g")
    public int field956;

    @ObfuscatedName("ac.l")
    public int field957;

    @ObfuscatedName("ac.h")
    public int field958;

    @ObfuscatedName("ac.n")
    public int field960;

    @ObfuscatedName("ac.w")
    public int field951;

    @ObfuscatedName("ac.m")
    public int field950;

    @ObfuscatedName("aj.t(Ley;I)V")
    public static void method637(class146 arg0) {
        Statics.field959 = arg0;
    }

    @ObfuscatedName("ac.o(S)V")
    public void method799() {
        if (this.field962 != -1) {
            this.method789(this.field962);
            this.field960 = this.field956;
            this.field951 = this.field957;
            this.field950 = this.field958;
        }
        this.method789(this.field952);
    }

    @ObfuscatedName("ac.i(Ldg;II)V")
    public void method787(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2118();
            if (var3 == 0) {
                return;
            }
            this.method788(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ac.p(Ldg;IIB)V")
    public void method788(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field952 = arg0.method2122();
        } else if (arg1 == 2) {
            this.field953 = arg0.method2118();
        } else if (arg1 == 5) {
            this.field954 = false;
        } else if (arg1 == 7) {
            this.field962 = arg0.method2122();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ac.c(II)V")
    public void method789(int arg0) {
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
        this.field956 = (int) (var18 * 256.0D);
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
