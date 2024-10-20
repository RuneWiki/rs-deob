package deob;

@ObfuscatedName("ap")
public class class41 extends class180 {

    @ObfuscatedName("ap.u")
    public static class170 field942 = new class170(64);

    @ObfuscatedName("ap.k")
    public int field939 = 0;

    @ObfuscatedName("ap.v")
    public int field940 = -1;

    @ObfuscatedName("ap.l")
    public boolean field938 = true;

    @ObfuscatedName("ap.g")
    public int field943 = -1;

    @ObfuscatedName("ap.a")
    public int field945;

    @ObfuscatedName("ap.x")
    public int field950;

    @ObfuscatedName("ap.r")
    public int field944;

    @ObfuscatedName("ap.w")
    public int field947;

    @ObfuscatedName("ap.c")
    public int field941;

    @ObfuscatedName("ap.f")
    public int field949;

    @ObfuscatedName("ap.y(I)V")
    public void method781() {
        if (this.field943 != -1) {
            this.method791(this.field943);
            this.field947 = this.field945;
            this.field941 = this.field950;
            this.field949 = this.field944;
        }
        this.method791(this.field939);
    }

    @ObfuscatedName("ap.u(Ldo;II)V")
    public void method780(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2109();
            if (var3 == 0) {
                return;
            }
            this.method783(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ap.k(Ldo;III)V")
    public void method783(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field939 = arg0.method2113();
        } else if (arg1 == 2) {
            this.field940 = arg0.method2109();
        } else if (arg1 == 5) {
            this.field938 = false;
        } else if (arg1 == 7) {
            this.field943 = arg0.method2113();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ap.v(IB)V")
    public void method791(int arg0) {
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
        this.field945 = (int) (var18 * 256.0D);
        this.field950 = (int) (var14 * 256.0D);
        this.field944 = (int) (var16 * 256.0D);
        if (this.field950 < 0) {
            this.field950 = 0;
        } else if (this.field950 > 255) {
            this.field950 = 255;
        }
        if (this.field944 < 0) {
            this.field944 = 0;
        } else if (this.field944 > 255) {
            this.field944 = 255;
        }
    }

    @ObfuscatedName("p.l(B)V")
    public static void method131() {
        field942.method3141();
    }
}
