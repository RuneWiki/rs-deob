package deob;

@ObfuscatedName("ap")
public class class47 extends class204 {

    @ObfuscatedName("ap.f")
    public static class193 field1043 = new class193(64);

    @ObfuscatedName("ap.i")
    public int field1044 = 0;

    @ObfuscatedName("ap.d")
    public int field1045 = -1;

    @ObfuscatedName("ap.o")
    public boolean field1050 = true;

    @ObfuscatedName("ap.c")
    public int field1047 = -1;

    @ObfuscatedName("ap.p")
    public int field1042;

    @ObfuscatedName("ap.j")
    public int field1046;

    @ObfuscatedName("ap.a")
    public int field1054;

    @ObfuscatedName("ap.y")
    public int field1051;

    @ObfuscatedName("ap.h")
    public int field1052;

    @ObfuscatedName("ap.z")
    public int field1053;

    @ObfuscatedName("dx.v(Lfh;I)V")
    public static void method2557(class167 arg0) {
        Statics.field1048 = arg0;
    }

    @ObfuscatedName("ap.f(B)V")
    public void method934() {
        if (this.field1047 != -1) {
            this.method947(this.field1047);
            this.field1051 = this.field1042;
            this.field1052 = this.field1046;
            this.field1053 = this.field1054;
        }
        this.method947(this.field1044);
    }

    @ObfuscatedName("ap.i(Ldx;II)V")
    public void method935(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2400();
            if (var3 == 0) {
                return;
            }
            this.method936(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ap.d(Ldx;IIB)V")
    public void method936(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1044 = arg0.method2353();
        } else if (arg1 == 2) {
            this.field1045 = arg0.method2400();
        } else if (arg1 == 5) {
            this.field1050 = false;
        } else if (arg1 == 7) {
            this.field1047 = arg0.method2353();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ap.o(IB)V")
    public void method947(int arg0) {
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
        this.field1042 = (int) (var18 * 256.0D);
        this.field1046 = (int) (var14 * 256.0D);
        this.field1054 = (int) (var16 * 256.0D);
        if (this.field1046 < 0) {
            this.field1046 = 0;
        } else if (this.field1046 > 255) {
            this.field1046 = 255;
        }
        if (this.field1054 < 0) {
            this.field1054 = 0;
        } else if (this.field1054 > 255) {
            this.field1054 = 255;
        }
    }
}
