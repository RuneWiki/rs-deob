package deob;

@ObfuscatedName("ab")
public class class47 extends class205 {

    @ObfuscatedName("ab.g")
    public static class194 field1029 = new class194(64);

    @ObfuscatedName("ab.j")
    public int field1028 = 0;

    @ObfuscatedName("ab.d")
    public int field1031 = -1;

    @ObfuscatedName("ab.x")
    public boolean field1032 = true;

    @ObfuscatedName("ab.y")
    public int field1039 = -1;

    @ObfuscatedName("ab.r")
    public int field1038;

    @ObfuscatedName("ab.c")
    public int field1035;

    @ObfuscatedName("ab.l")
    public int field1036;

    @ObfuscatedName("ab.u")
    public int field1037;

    @ObfuscatedName("ab.p")
    public int field1030;

    @ObfuscatedName("ab.n")
    public int field1033;

    @ObfuscatedName("w.b(Lfl;B)V")
    public static void method148(class168 arg0) {
        Statics.field1034 = arg0;
    }

    @ObfuscatedName("ab.j(B)V")
    public void method938() {
        if (this.field1039 != -1) {
            this.method944(this.field1039);
            this.field1037 = this.field1038;
            this.field1030 = this.field1035;
            this.field1033 = this.field1036;
        }
        this.method944(this.field1028);
    }

    @ObfuscatedName("ab.d(Lds;II)V")
    public void method939(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2344();
            if (var3 == 0) {
                return;
            }
            this.method940(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ab.x(Lds;III)V")
    public void method940(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1028 = arg0.method2348();
        } else if (arg1 == 2) {
            this.field1031 = arg0.method2344();
        } else if (arg1 == 5) {
            this.field1032 = false;
        } else if (arg1 == 7) {
            this.field1039 = arg0.method2348();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ab.y(II)V")
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
        this.field1038 = (int) (var18 * 256.0D);
        this.field1035 = (int) (var14 * 256.0D);
        this.field1036 = (int) (var16 * 256.0D);
        if (this.field1035 < 0) {
            this.field1035 = 0;
        } else if (this.field1035 > 255) {
            this.field1035 = 255;
        }
        if (this.field1036 < 0) {
            this.field1036 = 0;
        } else if (this.field1036 > 255) {
            this.field1036 = 255;
        }
    }
}
