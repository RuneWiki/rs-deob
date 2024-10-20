package deob;

@ObfuscatedName("am")
public class class42 extends class185 {

    @ObfuscatedName("am.j")
    public static class174 field963 = new class174(64);

    @ObfuscatedName("am.y")
    public int field968 = 0;

    @ObfuscatedName("am.r")
    public int field974 = -1;

    @ObfuscatedName("am.f")
    public boolean field966 = true;

    @ObfuscatedName("am.l")
    public int field972 = -1;

    @ObfuscatedName("am.b")
    public int field965;

    @ObfuscatedName("am.k")
    public int field969;

    @ObfuscatedName("am.g")
    public int field970;

    @ObfuscatedName("am.v")
    public int field971;

    @ObfuscatedName("am.i")
    public int field967;

    @ObfuscatedName("am.x")
    public int field973;

    @ObfuscatedName("am.c(I)V")
    public void method777() {
        if (this.field972 != -1) {
            this.method788(this.field972);
            this.field971 = this.field965;
            this.field967 = this.field969;
            this.field973 = this.field970;
        }
        this.method788(this.field968);
    }

    @ObfuscatedName("am.j(Ldx;II)V")
    public void method778(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2134();
            if (var3 == 0) {
                return;
            }
            this.method779(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.y(Ldx;III)V")
    public void method779(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field968 = arg0.method2138();
        } else if (arg1 == 2) {
            this.field974 = arg0.method2134();
        } else if (arg1 == 5) {
            this.field966 = false;
        } else if (arg1 == 7) {
            this.field972 = arg0.method2138();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("am.r(IB)V")
    public void method788(int arg0) {
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
        this.field965 = (int) (var18 * 256.0D);
        this.field969 = (int) (var14 * 256.0D);
        this.field970 = (int) (var16 * 256.0D);
        if (this.field969 < 0) {
            this.field969 = 0;
        } else if (this.field969 > 255) {
            this.field969 = 255;
        }
        if (this.field970 < 0) {
            this.field970 = 0;
        } else if (this.field970 > 255) {
            this.field970 = 255;
        }
    }
}
