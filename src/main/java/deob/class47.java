package deob;

@ObfuscatedName("ab")
public class class47 extends class204 {

    @ObfuscatedName("ab.h")
    public static class193 field1045 = new class193(64);

    @ObfuscatedName("ab.k")
    public int field1046 = 0;

    @ObfuscatedName("ab.t")
    public int field1044 = -1;

    @ObfuscatedName("ab.g")
    public boolean field1059 = true;

    @ObfuscatedName("ab.o")
    public int field1049 = -1;

    @ObfuscatedName("ab.i")
    public int field1050;

    @ObfuscatedName("ab.w")
    public int field1055;

    @ObfuscatedName("ab.m")
    public int field1052;

    @ObfuscatedName("ab.r")
    public int field1053;

    @ObfuscatedName("ab.y")
    public int field1054;

    @ObfuscatedName("ab.q")
    public int field1047;

    @ObfuscatedName("h.c(II)Lab;")
    public static class47 method9(int arg0) {
        class47 var1 = (class47) field1045.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1051.method2994(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method922(new class119(var2), arg0);
        }
        var3.method921();
        field1045.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.h(I)V")
    public void method921() {
        if (this.field1049 != -1) {
            this.method923(this.field1049);
            this.field1053 = this.field1050;
            this.field1054 = this.field1055;
            this.field1047 = this.field1052;
        }
        this.method923(this.field1046);
    }

    @ObfuscatedName("ab.k(Ldf;II)V")
    public void method922(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2291();
            if (var3 == 0) {
                return;
            }
            this.method924(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ab.t(Ldf;III)V")
    public void method924(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1046 = arg0.method2402();
        } else if (arg1 == 2) {
            this.field1044 = arg0.method2291();
        } else if (arg1 == 5) {
            this.field1059 = false;
        } else if (arg1 == 7) {
            this.field1049 = arg0.method2402();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ab.g(IB)V")
    public void method923(int arg0) {
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
        this.field1050 = (int) (var18 * 256.0D);
        this.field1055 = (int) (var14 * 256.0D);
        this.field1052 = (int) (var16 * 256.0D);
        if (this.field1055 < 0) {
            this.field1055 = 0;
        } else if (this.field1055 > 255) {
            this.field1055 = 255;
        }
        if (this.field1052 < 0) {
            this.field1052 = 0;
        } else if (this.field1052 > 255) {
            this.field1052 = 255;
        }
    }

    @ObfuscatedName("x.o(B)V")
    public static void method155() {
        field1045.method3488();
    }
}
