package deob;

@ObfuscatedName("ae")
public class class41 extends class182 {

    @ObfuscatedName("ae.r")
    public static class171 field959 = new class171(64);

    @ObfuscatedName("ae.y")
    public int field960 = 0;

    @ObfuscatedName("ae.w")
    public int field961 = -1;

    @ObfuscatedName("ae.m")
    public boolean field971 = true;

    @ObfuscatedName("ae.j")
    public int field976 = -1;

    @ObfuscatedName("ae.g")
    public int field964;

    @ObfuscatedName("ae.p")
    public int field965;

    @ObfuscatedName("ae.o")
    public int field975;

    @ObfuscatedName("ae.b")
    public int field962;

    @ObfuscatedName("ae.x")
    public int field968;

    @ObfuscatedName("ae.n")
    public int field969;

    @ObfuscatedName("bl.k(Lee;B)V")
    public static void method1361(class146 arg0) {
        Statics.field958 = arg0;
    }

    @ObfuscatedName("ae.r(I)V")
    public void method792() {
        if (this.field976 != -1) {
            this.method795(this.field976);
            this.field962 = this.field964;
            this.field968 = this.field965;
            this.field969 = this.field975;
        }
        this.method795(this.field960);
    }

    @ObfuscatedName("ae.y(Lde;II)V")
    public void method794(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2111();
            if (var3 == 0) {
                return;
            }
            this.method791(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ae.w(Lde;III)V")
    public void method791(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field960 = arg0.method2262();
        } else if (arg1 == 2) {
            this.field961 = arg0.method2111();
        } else if (arg1 == 5) {
            this.field971 = false;
        } else if (arg1 == 7) {
            this.field976 = arg0.method2262();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ae.m(II)V")
    public void method795(int arg0) {
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
        this.field964 = (int) (var18 * 256.0D);
        this.field965 = (int) (var14 * 256.0D);
        this.field975 = (int) (var16 * 256.0D);
        if (this.field965 < 0) {
            this.field965 = 0;
        } else if (this.field965 > 255) {
            this.field965 = 255;
        }
        if (this.field975 < 0) {
            this.field975 = 0;
        } else if (this.field975 > 255) {
            this.field975 = 255;
        }
    }

    @ObfuscatedName("aw.j(I)V")
    public static void method564() {
        field959.method3138();
    }
}
