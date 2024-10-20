package deob;

@ObfuscatedName("au")
public class class47 extends class204 {

    @ObfuscatedName("au.p")
    public static class193 field1056 = new class193(64);

    @ObfuscatedName("au.v")
    public int field1059 = 0;

    @ObfuscatedName("au.l")
    public int field1055 = -1;

    @ObfuscatedName("au.y")
    public boolean field1062 = true;

    @ObfuscatedName("au.w")
    public int field1060 = -1;

    @ObfuscatedName("au.u")
    public int field1064;

    @ObfuscatedName("au.a")
    public int field1057;

    @ObfuscatedName("au.e")
    public int field1063;

    @ObfuscatedName("au.b")
    public int field1058;

    @ObfuscatedName("au.o")
    public int field1065;

    @ObfuscatedName("au.m")
    public int field1061;

    @ObfuscatedName("bd.d(IB)Lau;")
    public static class47 method1188(int arg0) {
        class47 var1 = (class47) field1056.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1066.method3134(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method942(new class119(var2), arg0);
        }
        var3.method946();
        field1056.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.p(I)V")
    public void method946() {
        if (this.field1060 != -1) {
            this.method944(this.field1060);
            this.field1058 = this.field1064;
            this.field1065 = this.field1057;
            this.field1061 = this.field1063;
        }
        this.method944(this.field1059);
    }

    @ObfuscatedName("au.v(Ldf;II)V")
    public void method942(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2357();
            if (var3 == 0) {
                return;
            }
            this.method943(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("au.l(Ldf;IIB)V")
    public void method943(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1059 = arg0.method2361();
        } else if (arg1 == 2) {
            this.field1055 = arg0.method2357();
        } else if (arg1 == 5) {
            this.field1062 = false;
        } else if (arg1 == 7) {
            this.field1060 = arg0.method2361();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("au.y(II)V")
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
        this.field1064 = (int) (var18 * 256.0D);
        this.field1057 = (int) (var14 * 256.0D);
        this.field1063 = (int) (var16 * 256.0D);
        if (this.field1057 < 0) {
            this.field1057 = 0;
        } else if (this.field1057 > 255) {
            this.field1057 = 255;
        }
        if (this.field1063 < 0) {
            this.field1063 = 0;
        } else if (this.field1063 > 255) {
            this.field1063 = 255;
        }
    }
}
