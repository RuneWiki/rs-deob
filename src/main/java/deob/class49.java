package deob;

@ObfuscatedName("ag")
public class class49 extends class208 {

    @ObfuscatedName("ag.w")
    public static class197 field1073 = new class197(64);

    @ObfuscatedName("ag.e")
    public int field1074 = 0;

    @ObfuscatedName("ag.o")
    public int field1075 = -1;

    @ObfuscatedName("ag.g")
    public boolean field1076 = true;

    @ObfuscatedName("ag.l")
    public int field1077 = -1;

    @ObfuscatedName("ag.j")
    public int field1078;

    @ObfuscatedName("ag.r")
    public int field1079;

    @ObfuscatedName("ag.x")
    public int field1081;

    @ObfuscatedName("ag.k")
    public int field1072;

    @ObfuscatedName("ag.v")
    public int field1082;

    @ObfuscatedName("ag.h")
    public int field1083;

    @ObfuscatedName("aw.m(Lfa;B)V")
    public static void method753(class171 arg0) {
        Statics.field1084 = arg0;
    }

    @ObfuscatedName("z.w(II)Lag;")
    public static class49 method554(int arg0) {
        class49 var1 = (class49) field1073.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1084.method3086(4, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method961(new class123(var2), arg0);
        }
        var3.method960();
        field1073.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.e(I)V")
    public void method960() {
        if (this.field1077 != -1) {
            this.method977(this.field1077);
            this.field1072 = this.field1078;
            this.field1082 = this.field1079;
            this.field1083 = this.field1081;
        }
        this.method977(this.field1074);
    }

    @ObfuscatedName("ag.o(Ldj;II)V")
    public void method961(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2398();
            if (var3 == 0) {
                return;
            }
            this.method962(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ag.g(Ldj;III)V")
    public void method962(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1074 = arg0.method2418();
        } else if (arg1 == 2) {
            this.field1075 = arg0.method2398();
        } else if (arg1 == 5) {
            this.field1076 = false;
        } else if (arg1 == 7) {
            this.field1077 = arg0.method2418();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ag.l(IB)V")
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
        this.field1078 = (int) (var18 * 256.0D);
        this.field1079 = (int) (var14 * 256.0D);
        this.field1081 = (int) (var16 * 256.0D);
        if (this.field1079 < 0) {
            this.field1079 = 0;
        } else if (this.field1079 > 255) {
            this.field1079 = 255;
        }
        if (this.field1081 < 0) {
            this.field1081 = 0;
        } else if (this.field1081 > 255) {
            this.field1081 = 255;
        }
    }

    @ObfuscatedName("aw.j(B)V")
    public static void method741() {
        field1073.method3553();
    }
}
