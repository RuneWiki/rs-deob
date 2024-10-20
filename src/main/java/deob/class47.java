package deob;

@ObfuscatedName("aw")
public class class47 extends class204 {

    @ObfuscatedName("aw.m")
    public static class193 field1034 = new class193(64);

    @ObfuscatedName("aw.f")
    public int field1042 = 0;

    @ObfuscatedName("aw.l")
    public int field1039 = -1;

    @ObfuscatedName("aw.u")
    public boolean field1033 = true;

    @ObfuscatedName("aw.a")
    public int field1037 = -1;

    @ObfuscatedName("aw.h")
    public int field1035;

    @ObfuscatedName("aw.i")
    public int field1040;

    @ObfuscatedName("aw.t")
    public int field1041;

    @ObfuscatedName("aw.k")
    public int field1038;

    @ObfuscatedName("aw.s")
    public int field1043;

    @ObfuscatedName("aw.w")
    public int field1044;

    @ObfuscatedName("dz.j(Lfa;B)V")
    public static void method2291(class167 arg0) {
        Statics.field1036 = arg0;
    }

    @ObfuscatedName("bo.m(II)Law;")
    public static class47 method1584(int arg0) {
        class47 var1 = (class47) field1034.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1036.method3124(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method974(new class119(var2), arg0);
        }
        var3.method961();
        field1034.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.f(B)V")
    public void method961() {
        if (this.field1037 != -1) {
            this.method964(this.field1037);
            this.field1038 = this.field1035;
            this.field1043 = this.field1040;
            this.field1044 = this.field1041;
        }
        this.method964(this.field1042);
    }

    @ObfuscatedName("aw.l(Ldc;II)V")
    public void method974(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2372();
            if (var3 == 0) {
                return;
            }
            this.method965(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aw.u(Ldc;III)V")
    public void method965(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1042 = arg0.method2376();
        } else if (arg1 == 2) {
            this.field1039 = arg0.method2372();
        } else if (arg1 == 5) {
            this.field1033 = false;
        } else if (arg1 == 7) {
            this.field1037 = arg0.method2376();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aw.a(IB)V")
    public void method964(int arg0) {
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
        this.field1035 = (int) (var18 * 256.0D);
        this.field1040 = (int) (var14 * 256.0D);
        this.field1041 = (int) (var16 * 256.0D);
        if (this.field1040 < 0) {
            this.field1040 = 0;
        } else if (this.field1040 > 255) {
            this.field1040 = 255;
        }
        if (this.field1041 < 0) {
            this.field1041 = 0;
        } else if (this.field1041 > 255) {
            this.field1041 = 255;
        }
    }
}
