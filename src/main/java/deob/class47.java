package deob;

@ObfuscatedName("at")
public class class47 extends class204 {

    @ObfuscatedName("at.m")
    public static class193 field1065 = new class193(64);

    @ObfuscatedName("at.i")
    public int field1056 = 0;

    @ObfuscatedName("at.q")
    public int field1057 = -1;

    @ObfuscatedName("at.p")
    public boolean field1060 = true;

    @ObfuscatedName("at.c")
    public int field1059 = -1;

    @ObfuscatedName("at.f")
    public int field1068;

    @ObfuscatedName("at.y")
    public int field1061;

    @ObfuscatedName("at.w")
    public int field1062;

    @ObfuscatedName("at.l")
    public int field1054;

    @ObfuscatedName("at.v")
    public int field1064;

    @ObfuscatedName("at.k")
    public int field1058;

    @ObfuscatedName("ae.h(II)Lat;")
    public static class47 method801(int arg0) {
        class47 var1 = (class47) field1065.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1055.method3051(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method913(new class119(var2), arg0);
        }
        var3.method912();
        field1065.method3474(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.m(B)V")
    public void method912() {
        if (this.field1059 != -1) {
            this.method915(this.field1059);
            this.field1054 = this.field1068;
            this.field1064 = this.field1061;
            this.field1058 = this.field1062;
        }
        this.method915(this.field1056);
    }

    @ObfuscatedName("at.i(Ldp;II)V")
    public void method913(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2320();
            if (var3 == 0) {
                return;
            }
            this.method914(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.q(Ldp;III)V")
    public void method914(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1056 = arg0.method2487();
        } else if (arg1 == 2) {
            this.field1057 = arg0.method2320();
        } else if (arg1 == 5) {
            this.field1060 = false;
        } else if (arg1 == 7) {
            this.field1059 = arg0.method2487();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("at.p(II)V")
    public void method915(int arg0) {
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
        this.field1068 = (int) (var18 * 256.0D);
        this.field1061 = (int) (var14 * 256.0D);
        this.field1062 = (int) (var16 * 256.0D);
        if (this.field1061 < 0) {
            this.field1061 = 0;
        } else if (this.field1061 > 255) {
            this.field1061 = 255;
        }
        if (this.field1062 < 0) {
            this.field1062 = 0;
        } else if (this.field1062 > 255) {
            this.field1062 = 255;
        }
    }

    @ObfuscatedName("w.c(I)V")
    public static void method96() {
        field1065.method3483();
    }
}
