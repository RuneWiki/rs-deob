package deob;

@ObfuscatedName("ah")
public class class37 extends class174 {

    @ObfuscatedName("ah.l")
    public static class170 field958 = new class170(64);

    @ObfuscatedName("ah.c")
    public int field973 = 0;

    @ObfuscatedName("ah.d")
    public int field960 = -1;

    @ObfuscatedName("ah.b")
    public boolean field961 = true;

    @ObfuscatedName("ah.i")
    public int field962 = -1;

    @ObfuscatedName("ah.p")
    public int field964;

    @ObfuscatedName("ah.y")
    public int field968;

    @ObfuscatedName("ah.u")
    public int field965;

    @ObfuscatedName("ah.z")
    public int field966;

    @ObfuscatedName("ah.j")
    public int field970;

    @ObfuscatedName("ah.h")
    public int field957;

    @ObfuscatedName("d.t(Lev;I)V")
    public static void method39(class152 arg0) {
        Statics.field963 = arg0;
    }

    @ObfuscatedName("ah.l(S)V")
    public void method826() {
        if (this.field962 != -1) {
            this.method814(this.field962);
            this.field966 = this.field964;
            this.field970 = this.field968;
            this.field957 = this.field965;
        }
        this.method814(this.field973);
    }

    @ObfuscatedName("ah.c(Ldo;IS)V")
    public void method818(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2438();
            if (var3 == 0) {
                return;
            }
            this.method813(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.d(Ldo;III)V")
    public void method813(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field973 = arg0.method2442();
        } else if (arg1 == 2) {
            this.field960 = arg0.method2438();
        } else if (arg1 == 5) {
            this.field961 = false;
        } else if (arg1 == 7) {
            this.field962 = arg0.method2442();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ah.b(II)V")
    public void method814(int arg0) {
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
        this.field968 = (int) (var14 * 256.0D);
        this.field965 = (int) (var16 * 256.0D);
        if (this.field968 < 0) {
            this.field968 = 0;
        } else if (this.field968 > 255) {
            this.field968 = 255;
        }
        if (this.field965 < 0) {
            this.field965 = 0;
        } else if (this.field965 > 255) {
            this.field965 = 255;
        }
    }
}
