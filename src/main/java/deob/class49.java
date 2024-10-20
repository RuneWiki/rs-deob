package deob;

@ObfuscatedName("ag")
public class class49 extends class208 {

    @ObfuscatedName("ag.d")
    public static class197 field1073 = new class197(64);

    @ObfuscatedName("ag.v")
    public int field1075 = 0;

    @ObfuscatedName("ag.r")
    public int field1076 = -1;

    @ObfuscatedName("ag.z")
    public boolean field1077 = true;

    @ObfuscatedName("ag.t")
    public int field1078 = -1;

    @ObfuscatedName("ag.n")
    public int field1087;

    @ObfuscatedName("ag.i")
    public int field1080;

    @ObfuscatedName("ag.g")
    public int field1081;

    @ObfuscatedName("ag.m")
    public int field1082;

    @ObfuscatedName("ag.k")
    public int field1083;

    @ObfuscatedName("ag.x")
    public int field1088;

    @ObfuscatedName("g.a(Lfu;B)V")
    public static void method121(class171 arg0) {
        Statics.field1085 = arg0;
    }

    @ObfuscatedName("dd.d(II)Lag;")
    public static class49 method2191(int arg0) {
        class49 var1 = (class49) field1073.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1085.method3117(4, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method984(new class123(var2), arg0);
        }
        var3.method975();
        field1073.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.v(I)V")
    public void method975() {
        if (this.field1078 != -1) {
            this.method974(this.field1078);
            this.field1082 = this.field1087;
            this.field1083 = this.field1080;
            this.field1088 = this.field1081;
        }
        this.method974(this.field1075);
    }

    @ObfuscatedName("ag.r(Ldb;II)V")
    public void method984(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2395();
            if (var3 == 0) {
                return;
            }
            this.method982(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ag.z(Ldb;III)V")
    public void method982(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1075 = arg0.method2399();
        } else if (arg1 == 2) {
            this.field1076 = arg0.method2395();
        } else if (arg1 == 5) {
            this.field1077 = false;
        } else if (arg1 == 7) {
            this.field1078 = arg0.method2399();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ag.t(II)V")
    public void method974(int arg0) {
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
        this.field1087 = (int) (var18 * 256.0D);
        this.field1080 = (int) (var14 * 256.0D);
        this.field1081 = (int) (var16 * 256.0D);
        if (this.field1080 < 0) {
            this.field1080 = 0;
        } else if (this.field1080 > 255) {
            this.field1080 = 255;
        }
        if (this.field1081 < 0) {
            this.field1081 = 0;
        } else if (this.field1081 > 255) {
            this.field1081 = 255;
        }
    }
}
