package deob;

@ObfuscatedName("ac")
public class class47 extends class204 {

    @ObfuscatedName("ac.d")
    public static class193 field1050 = new class193(64);

    @ObfuscatedName("ac.g")
    public int field1051 = 0;

    @ObfuscatedName("ac.w")
    public int field1049 = -1;

    @ObfuscatedName("ac.e")
    public boolean field1052 = true;

    @ObfuscatedName("ac.c")
    public int field1054 = -1;

    @ObfuscatedName("ac.a")
    public int field1055;

    @ObfuscatedName("ac.q")
    public int field1056;

    @ObfuscatedName("ac.m")
    public int field1063;

    @ObfuscatedName("ac.n")
    public int field1058;

    @ObfuscatedName("ac.k")
    public int field1059;

    @ObfuscatedName("ac.o")
    public int field1060;

    @ObfuscatedName("y.y(II)Lac;")
    public static class47 method3(int arg0) {
        class47 var1 = (class47) field1050.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1057.method3045(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method930(new class119(var2), arg0);
        }
        var3.method929();
        field1050.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.d(B)V")
    public void method929() {
        if (this.field1054 != -1) {
            this.method943(this.field1054);
            this.field1058 = this.field1055;
            this.field1059 = this.field1056;
            this.field1060 = this.field1063;
        }
        this.method943(this.field1051);
    }

    @ObfuscatedName("ac.g(Ldd;IS)V")
    public void method930(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2326();
            if (var3 == 0) {
                return;
            }
            this.method931(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ac.w(Ldd;III)V")
    public void method931(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1051 = arg0.method2476();
        } else if (arg1 == 2) {
            this.field1049 = arg0.method2326();
        } else if (arg1 == 5) {
            this.field1052 = false;
        } else if (arg1 == 7) {
            this.field1054 = arg0.method2476();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ac.e(IB)V")
    public void method943(int arg0) {
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
        this.field1055 = (int) (var18 * 256.0D);
        this.field1056 = (int) (var14 * 256.0D);
        this.field1063 = (int) (var16 * 256.0D);
        if (this.field1056 < 0) {
            this.field1056 = 0;
        } else if (this.field1056 > 255) {
            this.field1056 = 255;
        }
        if (this.field1063 < 0) {
            this.field1063 = 0;
        } else if (this.field1063 > 255) {
            this.field1063 = 255;
        }
    }

    @ObfuscatedName("eh.c(I)V")
    public static void method2896() {
        field1050.method3428();
    }
}
