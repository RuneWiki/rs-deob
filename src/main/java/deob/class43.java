package deob;

@ObfuscatedName("an")
public class class43 extends class195 {

    @ObfuscatedName("an.e")
    public static class184 field972 = new class184(64);

    @ObfuscatedName("an.a")
    public int field980 = 0;

    @ObfuscatedName("an.k")
    public int field971 = -1;

    @ObfuscatedName("an.p")
    public boolean field982 = true;

    @ObfuscatedName("an.l")
    public int field973 = -1;

    @ObfuscatedName("an.u")
    public int field974;

    @ObfuscatedName("an.o")
    public int field975;

    @ObfuscatedName("an.m")
    public int field969;

    @ObfuscatedName("an.q")
    public int field977;

    @ObfuscatedName("an.v")
    public int field968;

    @ObfuscatedName("an.n")
    public int field979;

    @ObfuscatedName("at.b(Lfj;I)V")
    public static void method634(class158 arg0) {
        Statics.field970 = arg0;
    }

    @ObfuscatedName("an.e(B)V")
    public void method809() {
        if (this.field973 != -1) {
            this.method810(this.field973);
            this.field977 = this.field974;
            this.field968 = this.field975;
            this.field979 = this.field969;
        }
        this.method810(this.field980);
    }

    @ObfuscatedName("an.a(Ldj;II)V")
    public void method808(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2127();
            if (var3 == 0) {
                return;
            }
            this.method814(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.k(Ldj;III)V")
    public void method814(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field980 = arg0.method2131();
        } else if (arg1 == 2) {
            this.field971 = arg0.method2127();
        } else if (arg1 == 5) {
            this.field982 = false;
        } else if (arg1 == 7) {
            this.field973 = arg0.method2131();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("an.p(II)V")
    public void method810(int arg0) {
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
        this.field974 = (int) (var18 * 256.0D);
        this.field975 = (int) (var14 * 256.0D);
        this.field969 = (int) (var16 * 256.0D);
        if (this.field975 < 0) {
            this.field975 = 0;
        } else if (this.field975 > 255) {
            this.field975 = 255;
        }
        if (this.field969 < 0) {
            this.field969 = 0;
        } else if (this.field969 > 255) {
            this.field969 = 255;
        }
    }
}
