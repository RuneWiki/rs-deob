package deob;

@ObfuscatedName("aj")
public class class47 extends class204 {

    @ObfuscatedName("aj.s")
    public static class193 field1053 = new class193(64);

    @ObfuscatedName("aj.q")
    public int field1061 = 0;

    @ObfuscatedName("aj.g")
    public int field1055 = -1;

    @ObfuscatedName("aj.m")
    public boolean field1056 = true;

    @ObfuscatedName("aj.t")
    public int field1059 = -1;

    @ObfuscatedName("aj.j")
    public int field1058;

    @ObfuscatedName("aj.n")
    public int field1063;

    @ObfuscatedName("aj.l")
    public int field1060;

    @ObfuscatedName("aj.i")
    public int field1057;

    @ObfuscatedName("aj.w")
    public int field1052;

    @ObfuscatedName("aj.v")
    public int field1065;

    @ObfuscatedName("ax.s(II)Laj;")
    public static class47 method652(int arg0) {
        class47 var1 = (class47) field1053.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1054.method3038(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method955(new class119(var2), arg0);
        }
        var3.method950();
        field1053.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.q(I)V")
    public void method950() {
        if (this.field1059 != -1) {
            this.method944(this.field1059);
            this.field1057 = this.field1058;
            this.field1052 = this.field1063;
            this.field1065 = this.field1060;
        }
        this.method944(this.field1061);
    }

    @ObfuscatedName("aj.g(Ldn;II)V")
    public void method955(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2363();
            if (var3 == 0) {
                return;
            }
            this.method943(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aj.m(Ldn;IIS)V")
    public void method943(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1061 = arg0.method2414();
        } else if (arg1 == 2) {
            this.field1055 = arg0.method2363();
        } else if (arg1 == 5) {
            this.field1056 = false;
        } else if (arg1 == 7) {
            this.field1059 = arg0.method2414();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aj.t(II)V")
    public void method944(int arg0) {
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
        this.field1058 = (int) (var18 * 256.0D);
        this.field1063 = (int) (var14 * 256.0D);
        this.field1060 = (int) (var16 * 256.0D);
        if (this.field1063 < 0) {
            this.field1063 = 0;
        } else if (this.field1063 > 255) {
            this.field1063 = 255;
        }
        if (this.field1060 < 0) {
            this.field1060 = 0;
        } else if (this.field1060 > 255) {
            this.field1060 = 255;
        }
    }

    @ObfuscatedName("fo.j(B)V")
    public static void method3033() {
        field1053.method3499();
    }
}
