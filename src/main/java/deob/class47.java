package deob;

@ObfuscatedName("aq")
public class class47 extends class204 {

    @ObfuscatedName("aq.r")
    public static class193 field1059 = new class193(64);

    @ObfuscatedName("aq.f")
    public int field1050 = 0;

    @ObfuscatedName("aq.s")
    public int field1048 = -1;

    @ObfuscatedName("aq.y")
    public boolean field1057 = true;

    @ObfuscatedName("aq.e")
    public int field1053 = -1;

    @ObfuscatedName("aq.g")
    public int field1054;

    @ObfuscatedName("aq.m")
    public int field1055;

    @ObfuscatedName("aq.j")
    public int field1056;

    @ObfuscatedName("aq.n")
    public int field1051;

    @ObfuscatedName("aq.l")
    public int field1049;

    @ObfuscatedName("aq.h")
    public int field1052;

    @ObfuscatedName("af.a(II)Laq;")
    public static class47 method982(int arg0) {
        class47 var1 = (class47) field1059.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1060.method3025(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method942(new class119(var2), arg0);
        }
        var3.method954();
        field1059.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.r(B)V")
    public void method954() {
        if (this.field1053 != -1) {
            this.method947(this.field1053);
            this.field1051 = this.field1054;
            this.field1049 = this.field1055;
            this.field1052 = this.field1056;
        }
        this.method947(this.field1050);
    }

    @ObfuscatedName("aq.f(Lds;II)V")
    public void method942(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2412();
            if (var3 == 0) {
                return;
            }
            this.method943(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aq.s(Lds;III)V")
    public void method943(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1050 = arg0.method2349();
        } else if (arg1 == 2) {
            this.field1048 = arg0.method2412();
        } else if (arg1 == 5) {
            this.field1057 = false;
        } else if (arg1 == 7) {
            this.field1053 = arg0.method2349();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aq.y(IB)V")
    public void method947(int arg0) {
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
        this.field1054 = (int) (var18 * 256.0D);
        this.field1055 = (int) (var14 * 256.0D);
        this.field1056 = (int) (var16 * 256.0D);
        if (this.field1055 < 0) {
            this.field1055 = 0;
        } else if (this.field1055 > 255) {
            this.field1055 = 255;
        }
        if (this.field1056 < 0) {
            this.field1056 = 0;
        } else if (this.field1056 > 255) {
            this.field1056 = 255;
        }
    }

    @ObfuscatedName("fg.e(I)V")
    public static void method2945() {
        field1059.method3515();
    }
}
