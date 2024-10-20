package deob;

@ObfuscatedName("ah")
public class class47 extends class204 {

    @ObfuscatedName("ah.b")
    public static class193 field1065 = new class193(64);

    @ObfuscatedName("ah.w")
    public int field1056 = 0;

    @ObfuscatedName("ah.d")
    public int field1055 = -1;

    @ObfuscatedName("ah.z")
    public boolean field1063 = true;

    @ObfuscatedName("ah.l")
    public int field1057 = -1;

    @ObfuscatedName("ah.m")
    public int field1053;

    @ObfuscatedName("ah.p")
    public int field1059;

    @ObfuscatedName("ah.u")
    public int field1061;

    @ObfuscatedName("ah.c")
    public int field1054;

    @ObfuscatedName("ah.v")
    public int field1062;

    @ObfuscatedName("ah.o")
    public int field1058;

    @ObfuscatedName("ah.g(I)V")
    public void method962() {
        if (this.field1057 != -1) {
            this.method964(this.field1057);
            this.field1054 = this.field1053;
            this.field1062 = this.field1059;
            this.field1058 = this.field1061;
        }
        this.method964(this.field1056);
    }

    @ObfuscatedName("ah.b(Ldm;II)V")
    public void method975(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2362();
            if (var3 == 0) {
                return;
            }
            this.method963(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.w(Ldm;III)V")
    public void method963(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1056 = arg0.method2366();
        } else if (arg1 == 2) {
            this.field1055 = arg0.method2362();
        } else if (arg1 == 5) {
            this.field1063 = false;
        } else if (arg1 == 7) {
            this.field1057 = arg0.method2366();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ah.d(II)V")
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
        this.field1053 = (int) (var18 * 256.0D);
        this.field1059 = (int) (var14 * 256.0D);
        this.field1061 = (int) (var16 * 256.0D);
        if (this.field1059 < 0) {
            this.field1059 = 0;
        } else if (this.field1059 > 255) {
            this.field1059 = 255;
        }
        if (this.field1061 < 0) {
            this.field1061 = 0;
        } else if (this.field1061 > 255) {
            this.field1061 = 255;
        }
    }
}
