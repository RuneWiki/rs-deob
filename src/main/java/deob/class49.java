package deob;

@ObfuscatedName("az")
public class class49 extends class208 {

    @ObfuscatedName("az.h")
    public static class197 field1068 = new class197(64);

    @ObfuscatedName("az.e")
    public int field1073 = 0;

    @ObfuscatedName("az.g")
    public int field1070 = -1;

    @ObfuscatedName("az.n")
    public boolean field1069 = true;

    @ObfuscatedName("az.u")
    public int field1071 = -1;

    @ObfuscatedName("az.d")
    public int field1075;

    @ObfuscatedName("az.l")
    public int field1074;

    @ObfuscatedName("az.m")
    public int field1076;

    @ObfuscatedName("az.j")
    public int field1067;

    @ObfuscatedName("az.y")
    public int field1077;

    @ObfuscatedName("az.s")
    public int field1078;

    @ObfuscatedName("aq.i(Lfu;I)V")
    public static void method653(class171 arg0) {
        Statics.field1072 = arg0;
    }

    @ObfuscatedName("k.h(IB)Laz;")
    public static class49 method194(int arg0) {
        class49 var1 = (class49) field1068.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1072.method3086(4, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method950(new class123(var2), arg0);
        }
        var3.method949();
        field1068.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.e(B)V")
    public void method949() {
        if (this.field1071 != -1) {
            this.method965(this.field1071);
            this.field1067 = this.field1075;
            this.field1077 = this.field1074;
            this.field1078 = this.field1076;
        }
        this.method965(this.field1073);
    }

    @ObfuscatedName("az.g(Ldn;II)V")
    public void method950(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2404();
            if (var3 == 0) {
                return;
            }
            this.method952(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.n(Ldn;III)V")
    public void method952(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1073 = arg0.method2408();
        } else if (arg1 == 2) {
            this.field1070 = arg0.method2404();
        } else if (arg1 == 5) {
            this.field1069 = false;
        } else if (arg1 == 7) {
            this.field1071 = arg0.method2408();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("az.u(II)V")
    public void method965(int arg0) {
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
        this.field1075 = (int) (var18 * 256.0D);
        this.field1074 = (int) (var14 * 256.0D);
        this.field1076 = (int) (var16 * 256.0D);
        if (this.field1074 < 0) {
            this.field1074 = 0;
        } else if (this.field1074 > 255) {
            this.field1074 = 255;
        }
        if (this.field1076 < 0) {
            this.field1076 = 0;
        } else if (this.field1076 > 255) {
            this.field1076 = 255;
        }
    }
}
