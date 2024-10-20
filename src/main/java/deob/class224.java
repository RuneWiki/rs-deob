package deob;

@ObfuscatedName("it")
public class class224 extends class489 {

    @ObfuscatedName("it.ah")
    public static class304 field2362 = new class304(64);

    @ObfuscatedName("it.af")
    public int field2369 = 0;

    @ObfuscatedName("it.at")
    public int field2364 = -1;

    @ObfuscatedName("it.an")
    public boolean field2372 = true;

    @ObfuscatedName("it.ao")
    public int field2371 = -1;

    @ObfuscatedName("it.ab")
    public int field2367;

    @ObfuscatedName("it.aw")
    public int field2368;

    @ObfuscatedName("it.ad")
    public int field2365;

    @ObfuscatedName("it.al")
    public int field2370;

    @ObfuscatedName("it.as")
    public int field2361;

    @ObfuscatedName("it.ag")
    public int field2366;

    @ObfuscatedName("eq.az(Loc;I)V")
    public static void method2788(class379 arg0) {
        Statics.field2373 = arg0;
    }

    @ObfuscatedName("it.ah(I)V")
    public void method3891() {
        if (this.field2371 != -1) {
            this.method3877(this.field2371);
            this.field2370 = this.field2367;
            this.field2361 = this.field2368;
            this.field2366 = this.field2365;
        }
        this.method3877(this.field2369);
    }

    @ObfuscatedName("it.af(Lur;II)V")
    public void method3879(class535 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method8462();
            if (var3 == 0) {
                return;
            }
            this.method3880(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("it.at(Lur;III)V")
    public void method3880(class535 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2369 = arg0.method8466();
        } else if (arg1 == 2) {
            this.field2364 = arg0.method8462();
        } else if (arg1 == 5) {
            this.field2372 = false;
        } else if (arg1 == 7) {
            this.field2371 = arg0.method8466();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("it.an(IB)V")
    public void method3877(int arg0) {
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
        this.field2367 = (int) (var18 * 256.0D);
        this.field2368 = (int) (var14 * 256.0D);
        this.field2365 = (int) (var16 * 256.0D);
        if (this.field2368 < 0) {
            this.field2368 = 0;
        } else if (this.field2368 > 255) {
            this.field2368 = 255;
        }
        if (this.field2365 < 0) {
            this.field2365 = 0;
        } else if (this.field2365 > 255) {
            this.field2365 = 255;
        }
    }

    @ObfuscatedName("by.ao(I)V")
    public static void method774() {
        field2362.method5339();
    }
}
