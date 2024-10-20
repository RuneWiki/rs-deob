package deob;

@ObfuscatedName("ag")
public class class47 extends class204 {

    @ObfuscatedName("ag.l")
    public static class193 field1013 = new class193(64);

    @ObfuscatedName("ag.y")
    public int field1014 = 0;

    @ObfuscatedName("ag.u")
    public int field1015 = -1;

    @ObfuscatedName("ag.k")
    public boolean field1016 = true;

    @ObfuscatedName("ag.j")
    public int field1025 = -1;

    @ObfuscatedName("ag.i")
    public int field1023;

    @ObfuscatedName("ag.x")
    public int field1020;

    @ObfuscatedName("ag.g")
    public int field1019;

    @ObfuscatedName("ag.e")
    public int field1021;

    @ObfuscatedName("ag.p")
    public int field1022;

    @ObfuscatedName("ag.a")
    public int field1012;

    @ObfuscatedName("a.m(Lfx;B)V")
    public static void method153(class167 arg0) {
        Statics.field1018 = arg0;
    }

    @ObfuscatedName("ag.l(I)V")
    public void method969() {
        if (this.field1025 != -1) {
            this.method972(this.field1025);
            this.field1021 = this.field1023;
            this.field1022 = this.field1020;
            this.field1012 = this.field1019;
        }
        this.method972(this.field1014);
    }

    @ObfuscatedName("ag.y(Ldx;II)V")
    public void method971(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2562();
            if (var3 == 0) {
                return;
            }
            this.method977(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ag.u(Ldx;III)V")
    public void method977(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1014 = arg0.method2385();
        } else if (arg1 == 2) {
            this.field1015 = arg0.method2562();
        } else if (arg1 == 5) {
            this.field1016 = false;
        } else if (arg1 == 7) {
            this.field1025 = arg0.method2385();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ag.k(IB)V")
    public void method972(int arg0) {
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
        this.field1023 = (int) (var18 * 256.0D);
        this.field1020 = (int) (var14 * 256.0D);
        this.field1019 = (int) (var16 * 256.0D);
        if (this.field1020 < 0) {
            this.field1020 = 0;
        } else if (this.field1020 > 255) {
            this.field1020 = 255;
        }
        if (this.field1019 < 0) {
            this.field1019 = 0;
        } else if (this.field1019 > 255) {
            this.field1019 = 255;
        }
    }

    @ObfuscatedName("go.j(I)V")
    public static void method3533() {
        field1013.method3540();
    }
}
