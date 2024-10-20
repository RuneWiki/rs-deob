package deob;

@ObfuscatedName("au")
public class class47 extends class204 {

    @ObfuscatedName("au.e")
    public static class193 field1054 = new class193(64);

    @ObfuscatedName("au.u")
    public int field1053 = 0;

    @ObfuscatedName("au.b")
    public int field1047 = -1;

    @ObfuscatedName("au.p")
    public boolean field1046 = true;

    @ObfuscatedName("au.s")
    public int field1057 = -1;

    @ObfuscatedName("au.y")
    public int field1043;

    @ObfuscatedName("au.t")
    public int field1049;

    @ObfuscatedName("au.w")
    public int field1050;

    @ObfuscatedName("au.h")
    public int field1048;

    @ObfuscatedName("au.d")
    public int field1052;

    @ObfuscatedName("au.l")
    public int field1051;

    @ObfuscatedName("h.o(II)Lau;")
    public static class47 method122(int arg0) {
        class47 var1 = (class47) field1054.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field576.method3057(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method933(new class119(var2), arg0);
        }
        var3.method932();
        field1054.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.e(I)V")
    public void method932() {
        if (this.field1057 != -1) {
            this.method939(this.field1057);
            this.field1048 = this.field1043;
            this.field1052 = this.field1049;
            this.field1051 = this.field1050;
        }
        this.method939(this.field1053);
    }

    @ObfuscatedName("au.u(Ldi;II)V")
    public void method933(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2427();
            if (var3 == 0) {
                return;
            }
            this.method950(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("au.b(Ldi;IIB)V")
    public void method950(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1053 = arg0.method2341();
        } else if (arg1 == 2) {
            this.field1047 = arg0.method2427();
        } else if (arg1 == 5) {
            this.field1046 = false;
        } else if (arg1 == 7) {
            this.field1057 = arg0.method2341();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("au.p(IB)V")
    public void method939(int arg0) {
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
        this.field1043 = (int) (var18 * 256.0D);
        this.field1049 = (int) (var14 * 256.0D);
        this.field1050 = (int) (var16 * 256.0D);
        if (this.field1049 < 0) {
            this.field1049 = 0;
        } else if (this.field1049 > 255) {
            this.field1049 = 255;
        }
        if (this.field1050 < 0) {
            this.field1050 = 0;
        } else if (this.field1050 > 255) {
            this.field1050 = 255;
        }
    }
}
