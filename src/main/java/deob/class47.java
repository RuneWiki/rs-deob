package deob;

@ObfuscatedName("am")
public class class47 extends class204 {

    @ObfuscatedName("am.d")
    public static class193 field1028 = new class193(64);

    @ObfuscatedName("am.s")
    public int field1035 = 0;

    @ObfuscatedName("am.q")
    public int field1030 = -1;

    @ObfuscatedName("am.j")
    public boolean field1040 = true;

    @ObfuscatedName("am.k")
    public int field1032 = -1;

    @ObfuscatedName("am.i")
    public int field1027;

    @ObfuscatedName("am.m")
    public int field1034;

    @ObfuscatedName("am.p")
    public int field1041;

    @ObfuscatedName("am.h")
    public int field1036;

    @ObfuscatedName("am.e")
    public int field1031;

    @ObfuscatedName("am.g")
    public int field1038;

    @ObfuscatedName("ci.n(Lfm;I)V")
    public static void method1736(class167 arg0) {
        Statics.field1029 = arg0;
    }

    @ObfuscatedName("am.d(I)V")
    public void method913() {
        if (this.field1032 != -1) {
            this.method918(this.field1032);
            this.field1036 = this.field1027;
            this.field1031 = this.field1034;
            this.field1038 = this.field1041;
        }
        this.method918(this.field1035);
    }

    @ObfuscatedName("am.s(Ldq;II)V")
    public void method914(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2338();
            if (var3 == 0) {
                return;
            }
            this.method915(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.q(Ldq;IIB)V")
    public void method915(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1035 = arg0.method2342();
        } else if (arg1 == 2) {
            this.field1030 = arg0.method2338();
        } else if (arg1 == 5) {
            this.field1040 = false;
        } else if (arg1 == 7) {
            this.field1032 = arg0.method2342();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("am.j(IB)V")
    public void method918(int arg0) {
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
        this.field1027 = (int) (var18 * 256.0D);
        this.field1034 = (int) (var14 * 256.0D);
        this.field1041 = (int) (var16 * 256.0D);
        if (this.field1034 < 0) {
            this.field1034 = 0;
        } else if (this.field1034 > 255) {
            this.field1034 = 255;
        }
        if (this.field1041 < 0) {
            this.field1041 = 0;
        } else if (this.field1041 > 255) {
            this.field1041 = 255;
        }
    }
}
