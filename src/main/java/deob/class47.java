package deob;

@ObfuscatedName("ac")
public class class47 extends class205 {

    @ObfuscatedName("ac.h")
    public static class194 field1032 = new class194(64);

    @ObfuscatedName("ac.m")
    public int field1041 = 0;

    @ObfuscatedName("ac.z")
    public int field1034 = -1;

    @ObfuscatedName("ac.x")
    public boolean field1035 = true;

    @ObfuscatedName("ac.e")
    public int field1036 = -1;

    @ObfuscatedName("ac.i")
    public int field1037;

    @ObfuscatedName("ac.c")
    public int field1031;

    @ObfuscatedName("ac.n")
    public int field1045;

    @ObfuscatedName("ac.l")
    public int field1039;

    @ObfuscatedName("ac.u")
    public int field1042;

    @ObfuscatedName("ac.r")
    public int field1033;

    @ObfuscatedName("cb.j(IB)Lac;")
    public static class47 method2060(int arg0) {
        class47 var1 = (class47) field1032.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1044.method3011(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method944(new class120(var2), arg0);
        }
        var3.method943();
        field1032.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.h(I)V")
    public void method943() {
        if (this.field1036 != -1) {
            this.method942(this.field1036);
            this.field1039 = this.field1037;
            this.field1042 = this.field1031;
            this.field1033 = this.field1045;
        }
        this.method942(this.field1041);
    }

    @ObfuscatedName("ac.m(Ldx;II)V")
    public void method944(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2361();
            if (var3 == 0) {
                return;
            }
            this.method939(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ac.z(Ldx;IIS)V")
    public void method939(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1041 = arg0.method2523();
        } else if (arg1 == 2) {
            this.field1034 = arg0.method2361();
        } else if (arg1 == 5) {
            this.field1035 = false;
        } else if (arg1 == 7) {
            this.field1036 = arg0.method2523();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ac.x(IB)V")
    public void method942(int arg0) {
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
        this.field1037 = (int) (var18 * 256.0D);
        this.field1031 = (int) (var14 * 256.0D);
        this.field1045 = (int) (var16 * 256.0D);
        if (this.field1031 < 0) {
            this.field1031 = 0;
        } else if (this.field1031 > 255) {
            this.field1031 = 255;
        }
        if (this.field1045 < 0) {
            this.field1045 = 0;
        } else if (this.field1045 > 255) {
            this.field1045 = 255;
        }
    }

    @ObfuscatedName("ep.e(B)V")
    public static void method2752() {
        field1032.method3463();
    }
}
