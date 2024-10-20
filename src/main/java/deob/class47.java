package deob;

@ObfuscatedName("as")
public class class47 extends class205 {

    @ObfuscatedName("as.x")
    public static class194 field1061 = new class194(64);

    @ObfuscatedName("as.t")
    public int field1076 = 0;

    @ObfuscatedName("as.p")
    public int field1063 = -1;

    @ObfuscatedName("as.e")
    public boolean field1068 = true;

    @ObfuscatedName("as.y")
    public int field1065 = -1;

    @ObfuscatedName("as.m")
    public int field1067;

    @ObfuscatedName("as.c")
    public int field1073;

    @ObfuscatedName("as.v")
    public int field1078;

    @ObfuscatedName("as.l")
    public int field1069;

    @ObfuscatedName("as.z")
    public int field1070;

    @ObfuscatedName("as.s")
    public int field1071;

    @ObfuscatedName("ch.w(Lfx;I)V")
    public static void method2147(class168 arg0) {
        Statics.field1062 = arg0;
    }

    @ObfuscatedName("as.x(B)V")
    public void method982() {
        if (this.field1065 != -1) {
            this.method977(this.field1065);
            this.field1069 = this.field1067;
            this.field1070 = this.field1073;
            this.field1071 = this.field1078;
        }
        this.method977(this.field1076);
    }

    @ObfuscatedName("as.t(Lde;II)V")
    public void method976(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2363();
            if (var3 == 0) {
                return;
            }
            this.method980(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("as.p(Lde;III)V")
    public void method980(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1076 = arg0.method2367();
        } else if (arg1 == 2) {
            this.field1063 = arg0.method2363();
        } else if (arg1 == 5) {
            this.field1068 = false;
        } else if (arg1 == 7) {
            this.field1065 = arg0.method2367();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("as.e(II)V")
    public void method977(int arg0) {
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
        this.field1067 = (int) (var18 * 256.0D);
        this.field1073 = (int) (var14 * 256.0D);
        this.field1078 = (int) (var16 * 256.0D);
        if (this.field1073 < 0) {
            this.field1073 = 0;
        } else if (this.field1073 > 255) {
            this.field1073 = 255;
        }
        if (this.field1078 < 0) {
            this.field1078 = 0;
        } else if (this.field1078 > 255) {
            this.field1078 = 255;
        }
    }
}
