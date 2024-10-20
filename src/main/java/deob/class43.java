package deob;

@ObfuscatedName("ah")
public class class43 extends class195 {

    @ObfuscatedName("ah.d")
    public static class184 field992 = new class184(64);

    @ObfuscatedName("ah.z")
    public int field993 = 0;

    @ObfuscatedName("ah.y")
    public int field1005 = -1;

    @ObfuscatedName("ah.e")
    public boolean field994 = true;

    @ObfuscatedName("ah.g")
    public int field1004 = -1;

    @ObfuscatedName("ah.f")
    public int field997;

    @ObfuscatedName("ah.m")
    public int field998;

    @ObfuscatedName("ah.a")
    public int field999;

    @ObfuscatedName("ah.h")
    public int field1000;

    @ObfuscatedName("ah.l")
    public int field1001;

    @ObfuscatedName("ah.u")
    public int field995;

    @ObfuscatedName("ah.n(I)V")
    public void method839() {
        if (this.field1004 != -1) {
            this.method846(this.field1004);
            this.field1000 = this.field997;
            this.field1001 = this.field998;
            this.field995 = this.field999;
        }
        this.method846(this.field993);
    }

    @ObfuscatedName("ah.d(Ldl;II)V")
    public void method841(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2228();
            if (var3 == 0) {
                return;
            }
            this.method854(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.z(Ldl;IIB)V")
    public void method854(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field993 = arg0.method2232();
        } else if (arg1 == 2) {
            this.field1005 = arg0.method2228();
        } else if (arg1 == 5) {
            this.field994 = false;
        } else if (arg1 == 7) {
            this.field1004 = arg0.method2232();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ah.y(IS)V")
    public void method846(int arg0) {
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
        this.field997 = (int) (var18 * 256.0D);
        this.field998 = (int) (var14 * 256.0D);
        this.field999 = (int) (var16 * 256.0D);
        if (this.field998 < 0) {
            this.field998 = 0;
        } else if (this.field998 > 255) {
            this.field998 = 255;
        }
        if (this.field999 < 0) {
            this.field999 = 0;
        } else if (this.field999 > 255) {
            this.field999 = 255;
        }
    }

    @ObfuscatedName("et.e(I)V")
    public static void method2903() {
        field992.method3412();
    }
}
