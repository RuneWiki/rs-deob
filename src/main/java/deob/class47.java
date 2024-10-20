package deob;

@ObfuscatedName("ap")
public class class47 extends class205 {

    @ObfuscatedName("ap.w")
    public static class194 field1066 = new class194(64);

    @ObfuscatedName("ap.d")
    public int field1060 = 0;

    @ObfuscatedName("ap.c")
    public int field1061 = -1;

    @ObfuscatedName("ap.y")
    public boolean field1059 = true;

    @ObfuscatedName("ap.k")
    public int field1063 = -1;

    @ObfuscatedName("ap.r")
    public int field1064;

    @ObfuscatedName("ap.p")
    public int field1069;

    @ObfuscatedName("ap.q")
    public int field1062;

    @ObfuscatedName("ap.m")
    public int field1072;

    @ObfuscatedName("ap.e")
    public int field1068;

    @ObfuscatedName("ap.x")
    public int field1065;

    @ObfuscatedName("client.a(Lft;B)V")
    public static void method444(class168 arg0) {
        Statics.field2659 = arg0;
    }

    @ObfuscatedName("ap.w(I)V")
    public void method1031() {
        if (this.field1063 != -1) {
            this.method1034(this.field1063);
            this.field1072 = this.field1064;
            this.field1068 = this.field1069;
            this.field1065 = this.field1062;
        }
        this.method1034(this.field1060);
    }

    @ObfuscatedName("ap.d(Ldx;II)V")
    public void method1042(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2462();
            if (var3 == 0) {
                return;
            }
            this.method1033(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ap.c(Ldx;IIB)V")
    public void method1033(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1060 = arg0.method2466();
        } else if (arg1 == 2) {
            this.field1061 = arg0.method2462();
        } else if (arg1 == 5) {
            this.field1059 = false;
        } else if (arg1 == 7) {
            this.field1063 = arg0.method2466();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ap.y(II)V")
    public void method1034(int arg0) {
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
        this.field1069 = (int) (var14 * 256.0D);
        this.field1062 = (int) (var16 * 256.0D);
        if (this.field1069 < 0) {
            this.field1069 = 0;
        } else if (this.field1069 > 255) {
            this.field1069 = 255;
        }
        if (this.field1062 < 0) {
            this.field1062 = 0;
        } else if (this.field1062 > 255) {
            this.field1062 = 255;
        }
    }

    @ObfuscatedName("x.k(I)V")
    public static void method185() {
        field1066.method3582();
    }
}
