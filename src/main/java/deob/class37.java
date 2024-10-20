package deob;

@ObfuscatedName("ap")
public class class37 extends class180 {

    @ObfuscatedName("ap.p")
    public static class170 field881 = new class170(64);

    @ObfuscatedName("ap.a")
    public int field880 = 0;

    @ObfuscatedName("ap.g")
    public int field879;

    @ObfuscatedName("ap.u")
    public int field883;

    @ObfuscatedName("ap.k")
    public int field884;

    @ObfuscatedName("ap.m")
    public int field885;

    @ObfuscatedName("h.e(Lec;B)V")
    public static void method532(class145 arg0) {
        Statics.field882 = arg0;
    }

    @ObfuscatedName("ap.p(I)V")
    public void method712() {
        this.method698(this.field880);
    }

    @ObfuscatedName("ap.a(Ldp;IB)V")
    public void method700(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2125();
            if (var3 == 0) {
                return;
            }
            this.method701(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ap.g(Ldp;IIB)V")
    public void method701(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field880 = arg0.method2145();
        }
    }

    @ObfuscatedName("ap.u(IB)V")
    public void method698(int arg0) {
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
        this.field883 = (int) (var14 * 256.0D);
        this.field884 = (int) (var16 * 256.0D);
        if (this.field883 < 0) {
            this.field883 = 0;
        } else if (this.field883 > 255) {
            this.field883 = 255;
        }
        if (this.field884 < 0) {
            this.field884 = 0;
        } else if (this.field884 > 255) {
            this.field884 = 255;
        }
        if (var16 > 0.5D) {
            this.field885 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field885 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field885 < 1) {
            this.field885 = 1;
        }
        this.field879 = (int) ((double) this.field885 * var18);
    }

    @ObfuscatedName("ar.k(B)V")
    public static void method647() {
        field881.method3162();
    }
}
