package deob;

@ObfuscatedName("ab")
public class class47 extends class205 {

    @ObfuscatedName("ab.i")
    public static class194 field1053 = new class194(64);

    @ObfuscatedName("ab.g")
    public int field1067 = 0;

    @ObfuscatedName("ab.h")
    public int field1068 = -1;

    @ObfuscatedName("ab.z")
    public boolean field1056 = true;

    @ObfuscatedName("ab.r")
    public int field1052 = -1;

    @ObfuscatedName("ab.f")
    public int field1058;

    @ObfuscatedName("ab.s")
    public int field1059;

    @ObfuscatedName("ab.d")
    public int field1060;

    @ObfuscatedName("ab.l")
    public int field1061;

    @ObfuscatedName("ab.y")
    public int field1066;

    @ObfuscatedName("ab.p")
    public int field1063;

    @ObfuscatedName("ao.t(Lfp;B)V")
    public static void method789(class168 arg0) {
        Statics.field1054 = arg0;
    }

    @ObfuscatedName("ab.i(I)V")
    public void method899() {
        if (this.field1052 != -1) {
            this.method908(this.field1052);
            this.field1061 = this.field1058;
            this.field1066 = this.field1059;
            this.field1063 = this.field1060;
        }
        this.method908(this.field1067);
    }

    @ObfuscatedName("ab.g(Ldr;II)V")
    public void method900(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2334();
            if (var3 == 0) {
                return;
            }
            this.method901(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ab.h(Ldr;III)V")
    public void method901(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1067 = arg0.method2312();
        } else if (arg1 == 2) {
            this.field1068 = arg0.method2334();
        } else if (arg1 == 5) {
            this.field1056 = false;
        } else if (arg1 == 7) {
            this.field1052 = arg0.method2312();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ab.z(II)V")
    public void method908(int arg0) {
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
        this.field1058 = (int) (var18 * 256.0D);
        this.field1059 = (int) (var14 * 256.0D);
        this.field1060 = (int) (var16 * 256.0D);
        if (this.field1059 < 0) {
            this.field1059 = 0;
        } else if (this.field1059 > 255) {
            this.field1059 = 255;
        }
        if (this.field1060 < 0) {
            this.field1060 = 0;
        } else if (this.field1060 > 255) {
            this.field1060 = 255;
        }
    }
}
