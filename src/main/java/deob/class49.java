package deob;

@ObfuscatedName("aj")
public class class49 extends class208 {

    @ObfuscatedName("aj.r")
    public static class197 field1054 = new class197(64);

    @ObfuscatedName("aj.j")
    public int field1055 = 0;

    @ObfuscatedName("aj.z")
    public int field1056 = -1;

    @ObfuscatedName("aj.i")
    public boolean field1065 = true;

    @ObfuscatedName("aj.b")
    public int field1058 = -1;

    @ObfuscatedName("aj.l")
    public int field1059;

    @ObfuscatedName("aj.m")
    public int field1066;

    @ObfuscatedName("aj.p")
    public int field1069;

    @ObfuscatedName("aj.f")
    public int field1062;

    @ObfuscatedName("aj.d")
    public int field1063;

    @ObfuscatedName("aj.v")
    public int field1064;

    @ObfuscatedName("aw.x(Lfp;S)V")
    public static void method828(class171 arg0) {
        Statics.field1070 = arg0;
    }

    @ObfuscatedName("j.r(II)Laj;")
    public static class49 method42(int arg0) {
        class49 var1 = (class49) field1054.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1070.method3079(4, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method942(new class123(var2), arg0);
        }
        var3.method959();
        field1054.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.j(I)V")
    public void method959() {
        if (this.field1058 != -1) {
            this.method945(this.field1058);
            this.field1062 = this.field1059;
            this.field1063 = this.field1066;
            this.field1064 = this.field1069;
        }
        this.method945(this.field1055);
    }

    @ObfuscatedName("aj.z(Ldp;II)V")
    public void method942(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2408();
            if (var3 == 0) {
                return;
            }
            this.method944(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aj.i(Ldp;III)V")
    public void method944(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1055 = arg0.method2412();
        } else if (arg1 == 2) {
            this.field1056 = arg0.method2408();
        } else if (arg1 == 5) {
            this.field1065 = false;
        } else if (arg1 == 7) {
            this.field1058 = arg0.method2412();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aj.b(IB)V")
    public void method945(int arg0) {
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
        this.field1059 = (int) (var18 * 256.0D);
        this.field1066 = (int) (var14 * 256.0D);
        this.field1069 = (int) (var16 * 256.0D);
        if (this.field1066 < 0) {
            this.field1066 = 0;
        } else if (this.field1066 > 255) {
            this.field1066 = 255;
        }
        if (this.field1069 < 0) {
            this.field1069 = 0;
        } else if (this.field1069 > 255) {
            this.field1069 = 255;
        }
    }
}
