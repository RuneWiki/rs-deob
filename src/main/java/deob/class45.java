package deob;

@ObfuscatedName("az")
public class class45 extends class198 {

    @ObfuscatedName("az.y")
    public static class187 field1028 = new class187(64);

    @ObfuscatedName("az.z")
    public int field1029 = 0;

    @ObfuscatedName("az.l")
    public int field1030 = -1;

    @ObfuscatedName("az.w")
    public boolean field1031 = true;

    @ObfuscatedName("az.d")
    public int field1032 = -1;

    @ObfuscatedName("az.f")
    public int field1033;

    @ObfuscatedName("az.i")
    public int field1034;

    @ObfuscatedName("az.a")
    public int field1038;

    @ObfuscatedName("az.o")
    public int field1027;

    @ObfuscatedName("az.u")
    public int field1037;

    @ObfuscatedName("az.m")
    public int field1035;

    @ObfuscatedName("az.j(I)V")
    public void method948() {
        if (this.field1032 != -1) {
            this.method951(this.field1032);
            this.field1027 = this.field1033;
            this.field1037 = this.field1034;
            this.field1035 = this.field1038;
        }
        this.method951(this.field1029);
    }

    @ObfuscatedName("az.y(Lde;II)V")
    public void method949(class114 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2322();
            if (var3 == 0) {
                return;
            }
            this.method950(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.z(Lde;III)V")
    public void method950(class114 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1029 = arg0.method2321();
        } else if (arg1 == 2) {
            this.field1030 = arg0.method2322();
        } else if (arg1 == 5) {
            this.field1031 = false;
        } else if (arg1 == 7) {
            this.field1032 = arg0.method2321();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("az.l(II)V")
    public void method951(int arg0) {
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
        this.field1033 = (int) (var18 * 256.0D);
        this.field1034 = (int) (var14 * 256.0D);
        this.field1038 = (int) (var16 * 256.0D);
        if (this.field1034 < 0) {
            this.field1034 = 0;
        } else if (this.field1034 > 255) {
            this.field1034 = 255;
        }
        if (this.field1038 < 0) {
            this.field1038 = 0;
        } else if (this.field1038 > 255) {
            this.field1038 = 255;
        }
    }
}
