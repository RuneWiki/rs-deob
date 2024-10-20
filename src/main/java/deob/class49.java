package deob;

@ObfuscatedName("ax")
public class class49 extends class208 {

    @ObfuscatedName("ax.g")
    public static class197 field1079 = new class197(64);

    @ObfuscatedName("ax.r")
    public int field1080 = 0;

    @ObfuscatedName("ax.e")
    public int field1088 = -1;

    @ObfuscatedName("ax.h")
    public boolean field1078 = true;

    @ObfuscatedName("ax.s")
    public int field1083 = -1;

    @ObfuscatedName("ax.k")
    public int field1084;

    @ObfuscatedName("ax.u")
    public int field1085;

    @ObfuscatedName("ax.n")
    public int field1086;

    @ObfuscatedName("ax.b")
    public int field1091;

    @ObfuscatedName("ax.m")
    public int field1081;

    @ObfuscatedName("ax.q")
    public int field1089;

    @ObfuscatedName("ax.g(I)V")
    public void method988() {
        if (this.field1083 != -1) {
            this.method1002(this.field1083);
            this.field1091 = this.field1084;
            this.field1081 = this.field1085;
            this.field1089 = this.field1086;
        }
        this.method1002(this.field1080);
    }

    @ObfuscatedName("ax.r(Ldc;II)V")
    public void method989(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2490();
            if (var3 == 0) {
                return;
            }
            this.method990(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ax.e(Ldc;III)V")
    public void method990(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1080 = arg0.method2494();
        } else if (arg1 == 2) {
            this.field1088 = arg0.method2490();
        } else if (arg1 == 5) {
            this.field1078 = false;
        } else if (arg1 == 7) {
            this.field1083 = arg0.method2494();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ax.h(II)V")
    public void method1002(int arg0) {
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
        this.field1084 = (int) (var18 * 256.0D);
        this.field1085 = (int) (var14 * 256.0D);
        this.field1086 = (int) (var16 * 256.0D);
        if (this.field1085 < 0) {
            this.field1085 = 0;
        } else if (this.field1085 > 255) {
            this.field1085 = 255;
        }
        if (this.field1086 < 0) {
            this.field1086 = 0;
        } else if (this.field1086 > 255) {
            this.field1086 = 255;
        }
    }
}
