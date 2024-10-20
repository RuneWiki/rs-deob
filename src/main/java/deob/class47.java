package deob;

@ObfuscatedName("ae")
public class class47 extends class205 {

    @ObfuscatedName("ae.u")
    public static class194 field1061 = new class194(64);

    @ObfuscatedName("ae.x")
    public int field1060 = 0;

    @ObfuscatedName("ae.b")
    public int field1063 = -1;

    @ObfuscatedName("ae.l")
    public boolean field1065 = true;

    @ObfuscatedName("ae.d")
    public int field1074 = -1;

    @ObfuscatedName("ae.n")
    public int field1066;

    @ObfuscatedName("ae.m")
    public int field1067;

    @ObfuscatedName("ae.g")
    public int field1068;

    @ObfuscatedName("ae.s")
    public int field1069;

    @ObfuscatedName("ae.r")
    public int field1062;

    @ObfuscatedName("ae.k")
    public int field1071;

    @ObfuscatedName("o.f(Lfl;I)V")
    public static void method159(class168 arg0) {
        Statics.field1072 = arg0;
    }

    @ObfuscatedName("ae.u(I)V")
    public void method986() {
        if (this.field1074 != -1) {
            this.method979(this.field1074);
            this.field1069 = this.field1066;
            this.field1062 = this.field1067;
            this.field1071 = this.field1068;
        }
        this.method979(this.field1060);
    }

    @ObfuscatedName("ae.x(Ldj;II)V")
    public void method977(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2385();
            if (var3 == 0) {
                return;
            }
            this.method978(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ae.b(Ldj;IIB)V")
    public void method978(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1060 = arg0.method2389();
        } else if (arg1 == 2) {
            this.field1063 = arg0.method2385();
        } else if (arg1 == 5) {
            this.field1065 = false;
        } else if (arg1 == 7) {
            this.field1074 = arg0.method2389();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ae.l(II)V")
    public void method979(int arg0) {
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
        this.field1066 = (int) (var18 * 256.0D);
        this.field1067 = (int) (var14 * 256.0D);
        this.field1068 = (int) (var16 * 256.0D);
        if (this.field1067 < 0) {
            this.field1067 = 0;
        } else if (this.field1067 > 255) {
            this.field1067 = 255;
        }
        if (this.field1068 < 0) {
            this.field1068 = 0;
        } else if (this.field1068 > 255) {
            this.field1068 = 255;
        }
    }
}
