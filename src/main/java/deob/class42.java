package deob;

@ObfuscatedName("az")
public class class42 extends class204 {

    @ObfuscatedName("az.e")
    public static class193 field971 = new class193(64);

    @ObfuscatedName("az.q")
    public int field970 = 0;

    @ObfuscatedName("az.o")
    public int field976;

    @ObfuscatedName("az.g")
    public int field974;

    @ObfuscatedName("az.m")
    public int field975;

    @ObfuscatedName("az.b")
    public int field972;

    @ObfuscatedName("ay.l(II)Laz;")
    public static class42 method750(int arg0) {
        class42 var1 = (class42) field971.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field979.method3050(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method842(new class119(var2), arg0);
        }
        var3.method856();
        field971.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.e(B)V")
    public void method856() {
        this.method845(this.field970);
    }

    @ObfuscatedName("az.q(Ldl;II)V")
    public void method842(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2388();
            if (var3 == 0) {
                return;
            }
            this.method844(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.o(Ldl;III)V")
    public void method844(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field970 = arg0.method2460();
        }
    }

    @ObfuscatedName("az.g(II)V")
    public void method845(int arg0) {
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
        this.field974 = (int) (var14 * 256.0D);
        this.field975 = (int) (var16 * 256.0D);
        if (this.field974 < 0) {
            this.field974 = 0;
        } else if (this.field974 > 255) {
            this.field974 = 255;
        }
        if (this.field975 < 0) {
            this.field975 = 0;
        } else if (this.field975 > 255) {
            this.field975 = 255;
        }
        if (var16 > 0.5D) {
            this.field972 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field972 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field972 < 1) {
            this.field972 = 1;
        }
        this.field976 = (int) ((double) this.field972 * var18);
    }

    @ObfuscatedName("aq.m(S)V")
    public static void method650() {
        field971.method3481();
    }
}
