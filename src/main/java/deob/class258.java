package deob;

@ObfuscatedName("ii")
public class class258 extends class176 {

    @ObfuscatedName("ii.n")
    public static class146 field3498 = new class146(64);

    @ObfuscatedName("ii.v")
    public int field3490 = 0;

    @ObfuscatedName("ii.u")
    public int field3489 = -1;

    @ObfuscatedName("ii.r")
    public boolean field3488 = true;

    @ObfuscatedName("ii.p")
    public int field3493 = -1;

    @ObfuscatedName("ii.q")
    public int field3492;

    @ObfuscatedName("ii.m")
    public int field3495;

    @ObfuscatedName("ii.y")
    public int field3496;

    @ObfuscatedName("ii.i")
    public int field3497;

    @ObfuscatedName("ii.c")
    public int field3491;

    @ObfuscatedName("ii.b")
    public int field3499;

    @ObfuscatedName("ii.z(B)V")
    public void method4313() {
        if (this.field3493 != -1) {
            this.method4304(this.field3493);
            this.field3497 = this.field3492;
            this.field3491 = this.field3495;
            this.field3499 = this.field3496;
        }
        this.method4304(this.field3490);
    }

    @ObfuscatedName("ii.n(Lkl;IB)V")
    public void method4305(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method4990();
            if (var3 == 0) {
                return;
            }
            this.method4306(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ii.v(Lkl;III)V")
    public void method4306(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3490 = arg0.method4994();
        } else if (arg1 == 2) {
            this.field3489 = arg0.method4990();
        } else if (arg1 == 5) {
            this.field3488 = false;
        } else if (arg1 == 7) {
            this.field3493 = arg0.method4994();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ii.u(II)V")
    public void method4304(int arg0) {
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
        this.field3492 = (int) (var18 * 256.0D);
        this.field3495 = (int) (var14 * 256.0D);
        this.field3496 = (int) (var16 * 256.0D);
        if (this.field3495 < 0) {
            this.field3495 = 0;
        } else if (this.field3495 > 255) {
            this.field3495 = 255;
        }
        if (this.field3496 < 0) {
            this.field3496 = 0;
        } else if (this.field3496 > 255) {
            this.field3496 = 255;
        }
    }
}
