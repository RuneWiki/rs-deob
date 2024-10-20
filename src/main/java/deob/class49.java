package deob;

@ObfuscatedName("ak")
public class class49 extends class208 {

    @ObfuscatedName("ak.z")
    public static class197 field1036 = new class197(64);

    @ObfuscatedName("ak.t")
    public int field1035 = 0;

    @ObfuscatedName("ak.y")
    public int field1033 = -1;

    @ObfuscatedName("ak.p")
    public boolean field1032 = true;

    @ObfuscatedName("ak.g")
    public int field1038 = -1;

    @ObfuscatedName("ak.m")
    public int field1045;

    @ObfuscatedName("ak.f")
    public int field1039;

    @ObfuscatedName("ak.k")
    public int field1040;

    @ObfuscatedName("ak.h")
    public int field1041;

    @ObfuscatedName("ak.r")
    public int field1042;

    @ObfuscatedName("ak.w")
    public int field1043;

    @ObfuscatedName("ak.s(I)V")
    public void method938() {
        if (this.field1038 != -1) {
            this.method941(this.field1038);
            this.field1041 = this.field1045;
            this.field1042 = this.field1039;
            this.field1043 = this.field1040;
        }
        this.method941(this.field1035);
    }

    @ObfuscatedName("ak.z(Ldy;II)V")
    public void method939(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2363();
            if (var3 == 0) {
                return;
            }
            this.method940(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.t(Ldy;IIS)V")
    public void method940(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1035 = arg0.method2367();
        } else if (arg1 == 2) {
            this.field1033 = arg0.method2363();
        } else if (arg1 == 5) {
            this.field1032 = false;
        } else if (arg1 == 7) {
            this.field1038 = arg0.method2367();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ak.y(IB)V")
    public void method941(int arg0) {
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
        this.field1045 = (int) (var18 * 256.0D);
        this.field1039 = (int) (var14 * 256.0D);
        this.field1040 = (int) (var16 * 256.0D);
        if (this.field1039 < 0) {
            this.field1039 = 0;
        } else if (this.field1039 > 255) {
            this.field1039 = 255;
        }
        if (this.field1040 < 0) {
            this.field1040 = 0;
        } else if (this.field1040 > 255) {
            this.field1040 = 255;
        }
    }
}
