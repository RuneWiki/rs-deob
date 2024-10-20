package deob;

@ObfuscatedName("iv")
public class class258 extends class176 {

    @ObfuscatedName("iv.j")
    public static class146 field3481 = new class146(64);

    @ObfuscatedName("iv.i")
    public int field3488 = 0;

    @ObfuscatedName("iv.k")
    public int field3482 = -1;

    @ObfuscatedName("iv.u")
    public boolean field3479 = true;

    @ObfuscatedName("iv.n")
    public int field3484 = -1;

    @ObfuscatedName("iv.t")
    public int field3485;

    @ObfuscatedName("iv.q")
    public int field3486;

    @ObfuscatedName("iv.x")
    public int field3480;

    @ObfuscatedName("iv.d")
    public int field3487;

    @ObfuscatedName("iv.f")
    public int field3483;

    @ObfuscatedName("iv.c")
    public int field3490;

    @ObfuscatedName("iv.s(B)V")
    public void method4349() {
        if (this.field3484 != -1) {
            this.method4352(this.field3484);
            this.field3487 = this.field3485;
            this.field3483 = this.field3486;
            this.field3490 = this.field3480;
        }
        this.method4352(this.field3488);
    }

    @ObfuscatedName("iv.j(Lky;II)V")
    public void method4348(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5179();
            if (var3 == 0) {
                return;
            }
            this.method4350(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iv.i(Lky;III)V")
    public void method4350(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3488 = arg0.method5169();
        } else if (arg1 == 2) {
            this.field3482 = arg0.method5179();
        } else if (arg1 == 5) {
            this.field3479 = false;
        } else if (arg1 == 7) {
            this.field3484 = arg0.method5169();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("iv.k(II)V")
    public void method4352(int arg0) {
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
        this.field3485 = (int) (var18 * 256.0D);
        this.field3486 = (int) (var14 * 256.0D);
        this.field3480 = (int) (var16 * 256.0D);
        if (this.field3486 < 0) {
            this.field3486 = 0;
        } else if (this.field3486 > 255) {
            this.field3486 = 255;
        }
        if (this.field3480 < 0) {
            this.field3480 = 0;
        } else if (this.field3480 > 255) {
            this.field3480 = 255;
        }
    }
}
