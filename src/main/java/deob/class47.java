package deob;

@ObfuscatedName("ad")
public class class47 extends class204 {

    @ObfuscatedName("ad.l")
    public static class193 field1055 = new class193(64);

    @ObfuscatedName("ad.a")
    public int field1052 = 0;

    @ObfuscatedName("ad.i")
    public int field1054 = -1;

    @ObfuscatedName("ad.f")
    public boolean field1053 = true;

    @ObfuscatedName("ad.m")
    public int field1056 = -1;

    @ObfuscatedName("ad.o")
    public int field1057;

    @ObfuscatedName("ad.h")
    public int field1058;

    @ObfuscatedName("ad.n")
    public int field1051;

    @ObfuscatedName("ad.k")
    public int field1060;

    @ObfuscatedName("ad.r")
    public int field1061;

    @ObfuscatedName("ad.b")
    public int field1062;

    @ObfuscatedName("ad.j(B)V")
    public void method938() {
        if (this.field1056 != -1) {
            this.method940(this.field1056);
            this.field1060 = this.field1057;
            this.field1061 = this.field1058;
            this.field1062 = this.field1051;
        }
        this.method940(this.field1052);
    }

    @ObfuscatedName("ad.l(Ldc;IB)V")
    public void method939(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2316();
            if (var3 == 0) {
                return;
            }
            this.method948(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ad.a(Ldc;III)V")
    public void method948(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1052 = arg0.method2416();
        } else if (arg1 == 2) {
            this.field1054 = arg0.method2316();
        } else if (arg1 == 5) {
            this.field1053 = false;
        } else if (arg1 == 7) {
            this.field1056 = arg0.method2416();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ad.i(IB)V")
    public void method940(int arg0) {
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
        this.field1057 = (int) (var18 * 256.0D);
        this.field1058 = (int) (var14 * 256.0D);
        this.field1051 = (int) (var16 * 256.0D);
        if (this.field1058 < 0) {
            this.field1058 = 0;
        } else if (this.field1058 > 255) {
            this.field1058 = 255;
        }
        if (this.field1051 < 0) {
            this.field1051 = 0;
        } else if (this.field1051 > 255) {
            this.field1051 = 255;
        }
    }

    @ObfuscatedName("dc.f(I)V")
    public static void method2510() {
        field1055.method3475();
    }
}
