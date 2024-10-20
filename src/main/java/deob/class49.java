package deob;

@ObfuscatedName("am")
public class class49 extends class208 {

    @ObfuscatedName("am.l")
    public static class197 field1094 = new class197(64);

    @ObfuscatedName("am.c")
    public int field1083 = 0;

    @ObfuscatedName("am.h")
    public int field1081 = -1;

    @ObfuscatedName("am.r")
    public boolean field1082 = true;

    @ObfuscatedName("am.a")
    public int field1085 = -1;

    @ObfuscatedName("am.b")
    public int field1093;

    @ObfuscatedName("am.u")
    public int field1087;

    @ObfuscatedName("am.o")
    public int field1088;

    @ObfuscatedName("am.p")
    public int field1089;

    @ObfuscatedName("am.i")
    public int field1090;

    @ObfuscatedName("am.q")
    public int field1091;

    @ObfuscatedName("a.e(IB)Lam;")
    public static class49 method76(int arg0) {
        class49 var1 = (class49) field1094.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3165.method3130(4, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method1006(new class123(var2), arg0);
        }
        var3.method997();
        field1094.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.l(I)V")
    public void method997() {
        if (this.field1085 != -1) {
            this.method993(this.field1085);
            this.field1089 = this.field1093;
            this.field1090 = this.field1087;
            this.field1091 = this.field1088;
        }
        this.method993(this.field1083);
    }

    @ObfuscatedName("am.c(Ldd;IB)V")
    public void method1006(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2464();
            if (var3 == 0) {
                return;
            }
            this.method996(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.h(Ldd;III)V")
    public void method996(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1083 = arg0.method2557();
        } else if (arg1 == 2) {
            this.field1081 = arg0.method2464();
        } else if (arg1 == 5) {
            this.field1082 = false;
        } else if (arg1 == 7) {
            this.field1085 = arg0.method2557();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("am.r(II)V")
    public void method993(int arg0) {
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
        this.field1093 = (int) (var18 * 256.0D);
        this.field1087 = (int) (var14 * 256.0D);
        this.field1088 = (int) (var16 * 256.0D);
        if (this.field1087 < 0) {
            this.field1087 = 0;
        } else if (this.field1087 > 255) {
            this.field1087 = 255;
        }
        if (this.field1088 < 0) {
            this.field1088 = 0;
        } else if (this.field1088 > 255) {
            this.field1088 = 255;
        }
    }

    @ObfuscatedName("g.a(I)V")
    public static void method138() {
        field1094.method3590();
    }
}
