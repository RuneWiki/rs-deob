package deob;

@ObfuscatedName("au")
public class class47 extends class205 {

    @ObfuscatedName("au.w")
    public static class194 field1027 = new class194(64);

    @ObfuscatedName("au.f")
    public int field1039 = 0;

    @ObfuscatedName("au.s")
    public int field1030 = -1;

    @ObfuscatedName("au.p")
    public boolean field1031 = true;

    @ObfuscatedName("au.h")
    public int field1033 = -1;

    @ObfuscatedName("au.g")
    public int field1028;

    @ObfuscatedName("au.a")
    public int field1034;

    @ObfuscatedName("au.r")
    public int field1035;

    @ObfuscatedName("au.k")
    public int field1036;

    @ObfuscatedName("au.m")
    public int field1037;

    @ObfuscatedName("au.n")
    public int field1038;

    @ObfuscatedName("cw.e(IB)Lau;")
    public static class47 method1952(int arg0) {
        class47 var1 = (class47) field1027.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1029.method3048(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method935(new class120(var2), arg0);
        }
        var3.method934();
        field1027.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.w(I)V")
    public void method934() {
        if (this.field1033 != -1) {
            this.method937(this.field1033);
            this.field1036 = this.field1028;
            this.field1037 = this.field1034;
            this.field1038 = this.field1035;
        }
        this.method937(this.field1039);
    }

    @ObfuscatedName("au.f(Ldq;II)V")
    public void method935(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2355();
            if (var3 == 0) {
                return;
            }
            this.method936(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("au.s(Ldq;IIB)V")
    public void method936(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1039 = arg0.method2359();
        } else if (arg1 == 2) {
            this.field1030 = arg0.method2355();
        } else if (arg1 == 5) {
            this.field1031 = false;
        } else if (arg1 == 7) {
            this.field1033 = arg0.method2359();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("au.p(II)V")
    public void method937(int arg0) {
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
        this.field1028 = (int) (var18 * 256.0D);
        this.field1034 = (int) (var14 * 256.0D);
        this.field1035 = (int) (var16 * 256.0D);
        if (this.field1034 < 0) {
            this.field1034 = 0;
        } else if (this.field1034 > 255) {
            this.field1034 = 255;
        }
        if (this.field1035 < 0) {
            this.field1035 = 0;
        } else if (this.field1035 > 255) {
            this.field1035 = 255;
        }
    }
}
