package deob;

@ObfuscatedName("az")
public class class47 extends class204 {

    @ObfuscatedName("az.f")
    public static class193 field1042 = new class193(64);

    @ObfuscatedName("az.i")
    public int field1056 = 0;

    @ObfuscatedName("az.h")
    public int field1044 = -1;

    @ObfuscatedName("az.q")
    public boolean field1045 = true;

    @ObfuscatedName("az.u")
    public int field1046 = -1;

    @ObfuscatedName("az.m")
    public int field1047;

    @ObfuscatedName("az.y")
    public int field1048;

    @ObfuscatedName("az.p")
    public int field1043;

    @ObfuscatedName("az.t")
    public int field1041;

    @ObfuscatedName("az.g")
    public int field1050;

    @ObfuscatedName("az.v")
    public int field1052;

    @ObfuscatedName("de.o(Lfd;I)V")
    public static void method2238(class167 arg0) {
        Statics.field1057 = arg0;
    }

    @ObfuscatedName("az.f(I)V")
    public void method907() {
        if (this.field1046 != -1) {
            this.method911(this.field1046);
            this.field1041 = this.field1047;
            this.field1050 = this.field1048;
            this.field1052 = this.field1043;
        }
        this.method911(this.field1056);
    }

    @ObfuscatedName("az.i(Ldc;IB)V")
    public void method909(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2290();
            if (var3 == 0) {
                return;
            }
            this.method910(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.h(Ldc;IIB)V")
    public void method910(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1056 = arg0.method2477();
        } else if (arg1 == 2) {
            this.field1044 = arg0.method2290();
        } else if (arg1 == 5) {
            this.field1045 = false;
        } else if (arg1 == 7) {
            this.field1046 = arg0.method2477();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("az.q(IB)V")
    public void method911(int arg0) {
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
        this.field1047 = (int) (var18 * 256.0D);
        this.field1048 = (int) (var14 * 256.0D);
        this.field1043 = (int) (var16 * 256.0D);
        if (this.field1048 < 0) {
            this.field1048 = 0;
        } else if (this.field1048 > 255) {
            this.field1048 = 255;
        }
        if (this.field1043 < 0) {
            this.field1043 = 0;
        } else if (this.field1043 > 255) {
            this.field1043 = 255;
        }
    }
}
