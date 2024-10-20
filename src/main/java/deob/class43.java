package deob;

@ObfuscatedName("at")
public class class43 extends class195 {

    @ObfuscatedName("at.o")
    public static class184 field1008 = new class184(64);

    @ObfuscatedName("at.a")
    public int field1009 = 0;

    @ObfuscatedName("at.w")
    public int field1010 = -1;

    @ObfuscatedName("at.m")
    public boolean field1011 = true;

    @ObfuscatedName("at.h")
    public int field1012 = -1;

    @ObfuscatedName("at.i")
    public int field1014;

    @ObfuscatedName("at.r")
    public int field1007;

    @ObfuscatedName("at.l")
    public int field1019;

    @ObfuscatedName("at.f")
    public int field1016;

    @ObfuscatedName("at.e")
    public int field1013;

    @ObfuscatedName("at.z")
    public int field1021;

    @ObfuscatedName("at.n(I)V")
    public void method855() {
        if (this.field1012 != -1) {
            this.method842(this.field1012);
            this.field1016 = this.field1014;
            this.field1013 = this.field1007;
            this.field1021 = this.field1019;
        }
        this.method842(this.field1009);
    }

    @ObfuscatedName("at.o(Ldl;II)V")
    public void method841(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2234();
            if (var3 == 0) {
                return;
            }
            this.method859(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.a(Ldl;IIS)V")
    public void method859(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1009 = arg0.method2238();
        } else if (arg1 == 2) {
            this.field1010 = arg0.method2234();
        } else if (arg1 == 5) {
            this.field1011 = false;
        } else if (arg1 == 7) {
            this.field1012 = arg0.method2238();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("at.w(IB)V")
    public void method842(int arg0) {
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
        this.field1014 = (int) (var18 * 256.0D);
        this.field1007 = (int) (var14 * 256.0D);
        this.field1019 = (int) (var16 * 256.0D);
        if (this.field1007 < 0) {
            this.field1007 = 0;
        } else if (this.field1007 > 255) {
            this.field1007 = 255;
        }
        if (this.field1019 < 0) {
            this.field1019 = 0;
        } else if (this.field1019 > 255) {
            this.field1019 = 255;
        }
    }

    @ObfuscatedName("o.m(I)V")
    public static void method11() {
        field1008.method3376();
    }
}
