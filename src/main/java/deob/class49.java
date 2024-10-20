package deob;

@ObfuscatedName("az")
public class class49 extends class208 {

    @ObfuscatedName("az.q")
    public static class197 field1077 = new class197(64);

    @ObfuscatedName("az.f")
    public int field1083 = 0;

    @ObfuscatedName("az.c")
    public int field1074 = -1;

    @ObfuscatedName("az.v")
    public boolean field1076 = true;

    @ObfuscatedName("az.j")
    public int field1075 = -1;

    @ObfuscatedName("az.m")
    public int field1078;

    @ObfuscatedName("az.y")
    public int field1079;

    @ObfuscatedName("az.u")
    public int field1080;

    @ObfuscatedName("az.h")
    public int field1073;

    @ObfuscatedName("az.l")
    public int field1082;

    @ObfuscatedName("az.b")
    public int field1081;

    @ObfuscatedName("ez.k(II)Laz;")
    public static class49 method2949(int arg0) {
        class49 var1 = (class49) field1077.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2713.method3097(4, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method961(new class123(var2), arg0);
        }
        var3.method966();
        field1077.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.q(I)V")
    public void method966() {
        if (this.field1075 != -1) {
            this.method954(this.field1075);
            this.field1073 = this.field1078;
            this.field1082 = this.field1079;
            this.field1081 = this.field1080;
        }
        this.method954(this.field1083);
    }

    @ObfuscatedName("az.f(Lde;II)V")
    public void method961(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2427();
            if (var3 == 0) {
                return;
            }
            this.method953(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.c(Lde;III)V")
    public void method953(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1083 = arg0.method2431();
        } else if (arg1 == 2) {
            this.field1074 = arg0.method2427();
        } else if (arg1 == 5) {
            this.field1076 = false;
        } else if (arg1 == 7) {
            this.field1075 = arg0.method2431();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("az.v(II)V")
    public void method954(int arg0) {
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
        this.field1078 = (int) (var18 * 256.0D);
        this.field1079 = (int) (var14 * 256.0D);
        this.field1080 = (int) (var16 * 256.0D);
        if (this.field1079 < 0) {
            this.field1079 = 0;
        } else if (this.field1079 > 255) {
            this.field1079 = 255;
        }
        if (this.field1080 < 0) {
            this.field1080 = 0;
        } else if (this.field1080 > 255) {
            this.field1080 = 255;
        }
    }
}
