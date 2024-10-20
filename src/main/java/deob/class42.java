package deob;

@ObfuscatedName("ao")
public class class42 extends class187 {

    @ObfuscatedName("ao.v")
    public static class176 field972 = new class176(64);

    @ObfuscatedName("ao.i")
    public int field964 = 0;

    @ObfuscatedName("ao.b")
    public int field965 = -1;

    @ObfuscatedName("ao.l")
    public boolean field966 = true;

    @ObfuscatedName("ao.m")
    public int field962 = -1;

    @ObfuscatedName("ao.w")
    public int field963;

    @ObfuscatedName("ao.e")
    public int field969;

    @ObfuscatedName("ao.n")
    public int field970;

    @ObfuscatedName("ao.s")
    public int field974;

    @ObfuscatedName("ao.k")
    public int field967;

    @ObfuscatedName("ao.f")
    public int field973;

    @ObfuscatedName("ao.a(I)V")
    public void method812() {
        if (this.field962 != -1) {
            this.method824(this.field962);
            this.field974 = this.field963;
            this.field967 = this.field969;
            this.field973 = this.field970;
        }
        this.method824(this.field964);
    }

    @ObfuscatedName("ao.v(Ldi;II)V")
    public void method815(class110 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2199();
            if (var3 == 0) {
                return;
            }
            this.method814(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ao.i(Ldi;III)V")
    public void method814(class110 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field964 = arg0.method2208();
        } else if (arg1 == 2) {
            this.field965 = arg0.method2199();
        } else if (arg1 == 5) {
            this.field966 = false;
        } else if (arg1 == 7) {
            this.field962 = arg0.method2208();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ao.b(IB)V")
    public void method824(int arg0) {
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
        this.field963 = (int) (var18 * 256.0D);
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

    @ObfuscatedName("al.l(I)V")
    public static void method608() {
        field972.method3184();
    }
}
