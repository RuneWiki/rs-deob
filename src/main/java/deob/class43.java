package deob;

@ObfuscatedName("ai")
public class class43 extends class195 {

    @ObfuscatedName("ai.w")
    public static class184 field989 = new class184(64);

    @ObfuscatedName("ai.i")
    public int field990 = 0;

    @ObfuscatedName("ai.e")
    public int field991 = -1;

    @ObfuscatedName("ai.h")
    public boolean field988 = true;

    @ObfuscatedName("ai.q")
    public int field993 = -1;

    @ObfuscatedName("ai.l")
    public int field994;

    @ObfuscatedName("ai.c")
    public int field995;

    @ObfuscatedName("ai.f")
    public int field998;

    @ObfuscatedName("ai.s")
    public int field997;

    @ObfuscatedName("ai.m")
    public int field1001;

    @ObfuscatedName("ai.y")
    public int field1002;

    @ObfuscatedName("ga.n(Lfd;I)V")
    public static void method3482(class158 arg0) {
        Statics.field996 = arg0;
    }

    @ObfuscatedName("ai.w(I)V")
    public void method826() {
        if (this.field993 != -1) {
            this.method837(this.field993);
            this.field997 = this.field994;
            this.field1001 = this.field995;
            this.field1002 = this.field998;
        }
        this.method837(this.field990);
    }

    @ObfuscatedName("ai.i(Ldo;IB)V")
    public void method827(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2155();
            if (var3 == 0) {
                return;
            }
            this.method828(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.e(Ldo;III)V")
    public void method828(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field990 = arg0.method2315();
        } else if (arg1 == 2) {
            this.field991 = arg0.method2155();
        } else if (arg1 == 5) {
            this.field988 = false;
        } else if (arg1 == 7) {
            this.field993 = arg0.method2315();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ai.h(IB)V")
    public void method837(int arg0) {
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
        this.field994 = (int) (var18 * 256.0D);
        this.field995 = (int) (var14 * 256.0D);
        this.field998 = (int) (var16 * 256.0D);
        if (this.field995 < 0) {
            this.field995 = 0;
        } else if (this.field995 > 255) {
            this.field995 = 255;
        }
        if (this.field998 < 0) {
            this.field998 = 0;
        } else if (this.field998 > 255) {
            this.field998 = 255;
        }
    }

    @ObfuscatedName("d.q(I)V")
    public static void method538() {
        field989.method3319();
    }
}
